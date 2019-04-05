DESCRIPTION = "Recipe for nfc module PN532 - Yocto build."
SECTION = "library"
DEPENDS = ""
LICENSE = "CLOSED"

DEPENDS += "libusb"
do_configure[depends] += "libusb:do_populate_sysroot"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = " \
		   http://dl.bintray.com/nfc-tools/sources/libnfc-1.7.1.tar.bz2 \
		   file://libnfc.conf \
		  "
SRC_URI[md5sum] = "a3bea901778ac324e802b8ffb86820ff"

S = "${WORKDIR}/libnfc-1.7.1"

inherit autotools pkgconfig

do_install_append() {
	install -d ${D}${sysconfdir}/nfc/
	install ${WORKDIR}/libnfc.conf ${D}${sysconfdir}/nfc/
}

PARALLEL_MAKE = ""

