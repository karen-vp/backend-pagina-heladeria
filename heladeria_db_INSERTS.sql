-- ANOTACIONES IMPORTANTES 
--    CAMBIAR VARCHAR DE DESCRIPCION A 1000 CARACTERES
--    CAMBIAR TELEFONO DE INT A VAR CHAR MARCA ERROR "OUT OF RANGE VALUE " SI SE DEJA EN INT 
--    CAMBIAR VARCHAR (45) EN ubicacion TABLA usuarios a VARCHAR (200)
USE heladeria;
SHOW TABLES;

SELECT * FROM categoria;
-- INSERTS CATEGORIAS
-- INSERT INTO categoria (nombre_categoria) VALUES("Helados");
-- INSERT INTO categoria (nombre_categoria) VALUES("Helados Premium");
-- INSERT INTO categoria (nombre_categoria) VALUES("Paletas");
-- INSERT INTO categoria (nombre_categoria) VALUES("Aguas");

SELECT * FROM categoria;

SELECT * FROM productos;
-- INSERTS PRODUCTOS
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Chocolate", "35", "Sumérgete en un mundo de tentación y placer con el helado de chocolate. Este exquisito manjar combina la riqueza y suavidad del chocolate más fino con la cremosidad de un helado artesanal. Cada cucharada te envuelve en un deleite sedoso y indulgente que hace derretir tu paladar. Disfruta de la intensidad y el sabor profundo del chocolate, mientras se desliza suavemente en tu boca, despertando todos tus sentidos. El helado de chocolate es el regalo perfecto para los amantes del dulce, una delicia irresistible que te transportará a un mundo de satisfacción absoluta. Así que, déjate llevar  por esta indulgencia suprema y presume de tu elección con cada bocado lleno de placer.", 1, "../image/imgs-helado/helado_choco.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Oreo", "35", "Sumérgete en un placer celestial con el helado de galleta Oreo. Combina la suavidad del helado más delicado con el crujiente sabor de las icónicas galletas Oreo. Cada cucharada te ofrece una experiencia de texturas y sabores irresistibles. ¡Disfruta de este capricho delicioso y presume de tu elección única!", 1, "../image/imgs-helado/helado_oreo.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Vainilla", "35", "El clásico sabor de la vainilla se eleva a nuevas alturas en nuestro helado. Su textura suave y cremosa, junto con su exquisito sabor a vainilla, lo convierten en una elección atemporal y satisfactoria para los amantes de los helados tradicionales.", 1, "../image/imgs-helado/helado_vainilla.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Baileys", "45", "Sumérgete en una experiencia indulgente con nuestro helado Baileys. Con su suave y sedosa base de helado con sabor a licor de crema irlandesa, este postre te consentirá con su inigualable dulzura y sofisticación.", 2, "../image/imgs-helado/helado_baileys.png" );
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Ferrero", "45", "Experimenta la perfección del chocolate y las avellanas en nuestro helado Ferrero. Con su combinación irresistible de helado de avellana y trozos de chocolate Ferrero Rocher, este helado es un verdadero placer para los amantes del chocolate y los frutos secos.", 2, "../image/imgs-helado/heladoP_ferrero.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("M&M", "45", "Disfruta de la deliciosa combinación de helado cremoso y crujientes trozos de chocolate M&M. Este exquisito helado te brindará una explosión de sabores y texturas que deleitará tus sentidos.", 2,"../image/imgs-helado/heladoP_M&M.png" );

-- PALETAS

INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Maracuya", "35", "El clásico sabor de la vainilla se eleva a nuevas alturas en nuestro helado. Su textura suave y cremosa, junto con su exquisito sabor a vainilla, lo convierten en una elección atemporal y satisfactoria para los amantes de los helados tradicionales.", 3, "../image/imgs-paletas/maracuya.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Oreo", "35", "Sumérgete en la delicia crujiente de nuestra paleta de Oreo. Con trozos de galletas Oreo mezclados en una base de helado cremoso, esta paleta es un sueño hecho realidad para los amantes de las galletas y el helado, brindando una experiencia dulce y satisfactoria.", 3,"../image/imgs-paletas/paleta-oreo.png" );
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Fresa", "35", "Disfruta de la frescura y la dulzura natural de nuestra paleta de fresa. El intenso sabor a fresas maduras se combina con la textura suave y cremosa del helado, creando una paleta irresistible que te hará querer saborearla una y otra vez", 3 , "../image/imgs-paletas/paleta-fresa.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Nuez", "35", "Descubre el sabor crujiente y lleno de carácter de nuestra paleta de nuez. Con trozos generosos de nueces tostadas en cada bocado, esta paleta te brinda una experiencia llena de texturas y un sabor auténtico que satisfará tus antojos de nuez de manera deliciosa.", 3 , "../image/imgs-paletas/paleta-nuez.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Chocolate", "35", "Sumérgete en la indulgencia absoluta con nuestra paleta de chocolate. Cada mordisco es una explosión de sabor a chocolate intenso y cremoso que te hará disfrutar de un verdadero placer chocolatoso. Una opción clásica que nunca pasa de moda y que deleitará a los amantes del chocolate en todas sus formas.", 3 , "../image/imgs-paletas/chocolate.png");

-- AGUAS
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Jamaica", "35", "Refréscate con nuestra agua de Jamaica, una deliciosa bebida elaborada a partir de las flores de hibisco. Con su distintivo color rojo y sabor ligeramente ácido, esta agua te brinda una experiencia refrescante y tropical que te transportará a las cálidas tierras de México.", 4 , "../image/imgs-aguas/agua_jamaica.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Mango", "35", "Sumérgete en la dulzura tropical de nuestra agua de mango. El jugo natural de mangos maduros se combina con agua para crear una bebida refrescante y llena de sabor. Cada sorbo te transportará a playas paradisíacas y te brindará un momento de puro disfrute", 4 , "../image/imgs-aguas/agua_mango.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Kiwi", "35", "Descubre la frescura y el sabor jugoso de nuestra agua de kiwi. Con su vibrante color verde y su sabor dulce y ligeramente ácido, esta bebida te brinda una experiencia refrescante y llena de vitalidad. Cada sorbo te conectará con la energía revitalizante de esta exótica fruta", 4 , "../image/imgs-aguas/agua_kiwi.png");
INSERT INTO productos (nombre_producto, precio, descripcion, categoria_id, imagen) VALUES("Limón con chía", "35", "Disfruta de la combinación revitalizante de limón con chía en nuestra refrescante agua. El jugo de limón recién exprimido se mezcla con las semillas de chía para crear una bebida refrescante y llena de beneficios para la salud. Cada sorbo te hidratará y te brindará una sensación revitalizante.", 4 , "../image/imgs-aguas/agua_limonC.png");


-- INSERTS USUARIOS
SELECT * FROM usuarios;
INSERT INTO usuarios (nombre_de_usuario, email, contraseña, telefono, ubicacion) VALUES ("Zelda Hyrule", "zeldaH@outlook.com", "PerritoBonito40","5551234567", "123 Avenida de la Imaginación, Ciudad Ficticia, País de las Maravillas");
INSERT INTO usuarios (nombre_de_usuario, email, contraseña, telefono, ubicacion) VALUES ("Claude Riegan", "claudcinhermosin@hotmail.com", "Lalalacontraseñawii","55-3789-0123", "Calle de los Sueños, Villa Esperanza, Fantasilandia.");
INSERT INTO usuarios (nombre_de_usuario, email, contraseña, telefono, ubicacion) VALUES ("Lucina Everdeen", "LuceverH@gmail.com", "890Pass77word","55-6456-7890", "Carrera del Arco Iris, Colina Encantada, Reino de Fantasía.");
INSERT INTO usuarios (nombre_de_usuario, email, contraseña, telefono, ubicacion) VALUES ("Chris Cavil", "cavilC@gmail.com", "Cuchurrumin","55-9234-5678", "Paseo de las Estrellas, Ciudad Celestial, Universo Infinito.");

