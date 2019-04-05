# yocto-recipe-example
This is an example illustrating the new layer creation in yocto<br />
and writing recipe to build the files and making the build part<br />
of the final image.<br />

I use Helloworld as an example. After adding layer, building the<br />
helloworld, the executalble will be part if the image. You can<br />
run helloworld to get console print `Hello World!!`.<br />

NOTE: Using this example, you can add your recipe of interesst<br />
can be built and add it to the rootfs of the image.<br />

* Create directories and files as shown below.<br />
Directory structure from poky/<br />
meta-new-layer/<br />
├── conf<br />
│   └── layer.conf<br />
├── README<br />
├── recipes-images<br />
│   └── core-image-sato.bbappend<br />
└── recipes-new-layer<br />
    └── new-layer<br />
        └── new-layer.bb<br />

* Here new-layer.bb I am downloading a git which has files required for
helloworld.

* meta-new-layer is a simple `helloworld` recipe which downloads the files from<br />
`another github<https://github.com/sunilsharmap/yocto-example.git>` and using autotools builds the helloword example.<br />

* meta-local-libnfc is another exapmle of building someone else repo, here libnfc is building.
