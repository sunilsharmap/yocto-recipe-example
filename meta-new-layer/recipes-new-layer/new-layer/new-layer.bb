DESCRIPTION = "Example Hello, World application for Yocto build."
SECTION = "examples"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96af5705d6f64a88e035781ef00e98a8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV	= "06fce62a7037632f2ceea8bcc49b4b2a2ae7a0a7"
SRC_URI = "git://github.com/sunilsharmap/yocto-example.git"

S = "${WORKDIR}/git"

inherit autotools
PARALLEL_MAKE = ""

