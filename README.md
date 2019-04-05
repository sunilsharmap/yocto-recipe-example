# yocto-recipe-example
This is an example illustrating the new layer creation in yocto
and writing recipe to build the files and making the build part
of the final image.

I use Helloworld as an example. After adding layer, building the
helloworld, the executalble will be part if the image. You can
run helloworld to get console print `Hello World!!`.

NOTE: Using this example, you can add your recipe of interesst
can be built and add it to the rootfs of the image.

* Creare directories and files as shown below.
Directory structure from poky/
meta-new-layer/
├── conf
│   └── layer.conf
├── README
├── recipes-images
│   └── core-image-sato.bbappend
└── recipes-new-layer
    └── new-layer
        └── new-layer.bb

* Here new-layer.bb I am downloading a git which has files required for
helloworld.
