-- INSERT CATEGORIA
INSERT INTO categoria (nombre_categoria) VALUES("Helados");
INSERT INTO categoria (nombre_categoria) VALUES("Helados Premium");
INSERT INTO categoria (nombre_categoria) VALUES("Paletas");
INSERT INTO categoria (nombre_categoria) VALUES("Aguas");



-- INSERTS PRODUCTOS
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Chocolate", 35, "Sumérgete en un mundo de tentación y placer con el helado de chocolate. Este exquisito manjar combina la riqueza y suavidad del chocolate más fino con la cremosidad de un helado artesanal. Cada cucharada te envuelve en un deleite sedoso y indulgente que hace derretir tu paladar. Disfruta de la intensidad y el sabor profundo del chocolate, mientras se desliza suavemente en tu boca, despertando todos tus sentidos.", 1, "https://i.postimg.cc/nh1x6F9K/helado-choco.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Oreo", 35, "Sumérgete en un placer celestial con el helado de galleta Oreo. Combina la suavidad del helado más delicado con el crujiente sabor de las icónicas galletas Oreo. Cada cucharada te ofrece una experiencia de texturas y sabores irresistibles. ¡Disfruta de este capricho delicioso y presume de tu elección única!", 1, "https://i.postimg.cc/85YfMB1C/helado-oreo.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Vainilla", 35, "El clásico sabor de la vainilla se eleva a nuevas alturas en nuestro helado. Su textura suave y cremosa, junto con su exquisito sabor a vainilla, lo convierten en una elección atemporal y satisfactoria para los amantes de los helados tradicionales.", 1, "https://i.postimg.cc/hv7zrzj1/helado-vainilla.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Baileys", 45, "Sumérgete en una experiencia indulgente con nuestro helado Baileys. Con su suave y sedosa base de helado con sabor a licor de crema irlandesa, este postre te consentirá con su inigualable dulzura y sofisticación.", 2, "https://i.postimg.cc/1tXN8Y1T/helado-baileys.png" );
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Ferrero", 45, "Experimenta la perfección del chocolate y las avellanas en nuestro helado Ferrero. Con su combinación irresistible de helado de avellana y trozos de chocolate Ferrero Rocher, este helado es un verdadero placer para los amantes del chocolate y los frutos secos.", 2, "https://i.postimg.cc/7b8CQHJ8/helado-P-ferrero.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("M&M", 45, "Disfruta de la deliciosa combinación de helado cremoso y crujientes trozos de chocolate M&M. Este exquisito helado te brindará una explosión de sabores y texturas que deleitará tus sentidos.", 2,"https://i.postimg.cc/dV9BdXgt/helado-P-M-M.png" );



-- PALETAS
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Maracuya", 35, "El clásico sabor de la vainilla se eleva a nuevas alturas en nuestro helado. Su textura suave y cremosa, junto con su exquisito sabor a vainilla, lo convierten en una elección atemporal y satisfactoria para los amantes de los helados tradicionales.", 3, "https://i.postimg.cc/nr0FqnKG/maracuya.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Oreo", 35, "Sumérgete en la delicia crujiente de nuestra paleta de Oreo. Con trozos de galletas Oreo mezclados en una base de helado cremoso, esta paleta es un sueño hecho realidad para los amantes de las galletas y el helado, brindando una experiencia dulce y satisfactoria.", 3,"https://i.postimg.cc/Kz7vvPRV/paleta-oreo.png" );
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Fresa", 35, "Disfruta de la frescura y la dulzura natural de nuestra paleta de fresa. El intenso sabor a fresas maduras se combina con la textura suave y cremosa del helado, creando una paleta irresistible que te hará querer saborearla una y otra vez", 3 , "https://i.postimg.cc/Ls18GKRm/paleta-fresa.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Nuez", 35, "Descubre el sabor crujiente y lleno de carácter de nuestra paleta de nuez. Con trozos generosos de nueces tostadas en cada bocado, esta paleta te brinda una experiencia llena de texturas y un sabor auténtico que satisfará tus antojos de nuez de manera deliciosa.", 3 , "https://i.postimg.cc/Y9BCHnqY/paleta-nuez.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Chocolate", 35, "Sumérgete en la indulgencia absoluta con nuestra paleta de chocolate. Cada mordisco es una explosión de sabor a chocolate intenso y cremoso que te hará disfrutar de un verdadero placer chocolatoso. Una opción clásica que nunca pasa de moda y que deleitará a los amantes del chocolate en todas sus formas.", 3 , "https://i.postimg.cc/RhMC3Wt0/chocolate.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES ("Paleta de uva con chocolate Turin", 45, "Disfruta de la irresistible combinación de sabores con nuestra paleta de uva con chocolate Turin. Sumérgete en un mundo de dulzura y frescura con cada mordisco. Nuestra paleta está cuidadosamente elaborada con uvas frescas y jugosas, seleccionadas especialmente para ofrecerte la máxima calidad.", 3, "https://i.postimg.cc/6pP7DX83/uva-removebg-preview.png");

-- AGUAS
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Frutos rojos", 35, " Una bebida vibrante y llena de sabor, elaborada con una mezcla de frutos rojos como fresas, frambuesas y arándanos, combinados con agua. El resultado es una bebida refrescante con un sabor dulce y ligeramente ácido, repleta de antioxidantes naturales.", 4 , "https://postimg.cc/7GYP0DVr");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Mango", 35, " Sumérgete en un paraíso tropical con el exquisito sabor del agua de mango con un toque de lima. Esta bebida refrescante combina la dulzura jugosa y tropical del mango maduro con la acidez refrescante de la lima, creando una explosión de sabores en cada sorbo. El dulce y suave sabor del mango se complementa perfectamente con la vibrante y cítrica nota de la lima, creando un equilibrio perfecto de sabores. Cada sorbo te transportará a playas de arena blanca y aguas turquesas, donde los mangos maduran bajo el sol tropical.  ", 4 , "https://postimg.cc/gLmVvx7k");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Kiwi con menta", 35, " Déjate seducir por la frescura y el sabor único del agua de kiwi con menta. Los jugosos kiwis aportan una nota refrescante y ligeramente ácida, mientras que la menta fresca añade un toque de vigorizante aroma. Cada sorbo de esta refrescante bebida te envolverá en una sensación revitalizante y te transportará a un jardín frondoso en plena naturaleza. ", 4 , "https://postimg.cc/1nxc3CcF");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Horchata con coco", 40, " Sumérgete en la riqueza y la cremosidad del agua de horchata con coco. La clásica horchata se combina con el dulce y exótico sabor del coco, creando una mezcla de sabores suaves y reconfortantes. Cada sorbo de esta bebida te brindará una sensación de frescura y nutrición, recordándote a una suave brisa caribeña que acaricia tu paladar. Una experiencia verdaderamente deliciosa que te cautivará desde el primer sorbo.", 4 , " https://postimg.cc/LYNpw1TW ");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Naranja con vainilla", 35, "Disfruta de una refrescante y aromática experiencia con el agua de naranja con un toque de vainilla. El jugo de naranja natural, con su sabor cítrico y vibrante, se mezcla delicadamente con la suavidad y dulzura de la vainilla. Cada sorbo te envolverá en un delicioso abrazo de cítricos refrescantes y notas cálidas de vainilla, creando una combinación única y reconfortante. Esta bebida es perfecta para satisfacer tu sed y deleitar tus sentidos con su sabor equilibrado y sutilmente dulce. Un verdadero placer para los amantes de los sabores frescos y aromáticos.", 4 , "https://postimg.cc/k6xN6Qfp");

-- INSERTS ROL
INSERT INTO roles(rol_nombre) VALUES("admin");
INSERT INTO roles(rol_nombre) VALUES("cliente");

-- INSERTS USUARIOS
INSERT INTO usuarios (nombre_usuario, email, contraseña, telefono, ubicacion, rol_id) VALUES ("Zelda Hyrule", "zeldaH@outlook.com", "PerritoBonito40","5551234567", "123 Avenida de la Imaginación, Ciudad Ficticia, País de las Maravillas", 1);
INSERT INTO usuarios (nombre_usuario, email, contraseña, telefono, ubicacion, rol_id) VALUES ("Claude Riegan", "claudcinhermosin@hotmail.com", "Lalalacontraseñawii","55-3789-0123", "Calle de los Sueños, Villa Esperanza, Fantasilandia.", 2);
INSERT INTO usuarios (nombre_usuario, email, contraseña, telefono, ubicacion, rol_id) VALUES ("Lucina Everdeen", "LuceverH@gmail.com", "890Pass77word","55-6456-7890", "Carrera del Arco Iris, Colina Encantada, Reino de Fantasía.", 2);
INSERT INTO usuarios (nombre_usuario, email, contraseña, telefono, ubicacion, rol_id) VALUES ("Chris Cavil", "cavilC@gmail.com", "Cuchurrumin","55-9234-5678", "Paseo de las Estrellas, Ciudad Celestial, Universo Infinito.",2 );

-- INSERT ORDENES
INSERT INTO ordenes(fk_usuarios_id) VALUES (1);
INSERT INTO ordenes(fk_usuarios_id) VALUES (3);

-- INSERT PRODUCTOS_HAS_ORDENES
INSERT INTO productos_has_ordenes(product_id, orden_id, cantidad_productos) VALUES (1, 1, 2);
INSERT INTO productos_has_ordenes(product_id, orden_id, cantidad_productos) VALUES (5, 1, 2);
INSERT INTO productos_has_ordenes(product_id, orden_id, cantidad_productos) VALUES (2, 2 , 4);