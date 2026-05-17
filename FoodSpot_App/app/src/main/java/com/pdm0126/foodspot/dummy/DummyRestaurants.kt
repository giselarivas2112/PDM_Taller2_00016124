package com.pdm0126.foodspot.dummy

import com.pdm0126.foodspot.model.Dish
import com.pdm0126.foodspot.model.Restaurant
const val Pupusa = "https://images.unsplash.com/photo-1644753787071-8933b5daed2d?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"

val dummyRestaurants = listOf(
    Restaurant(
        id = 1,
        name = "La Pupusería de Doña Rosa",
        description = "El sabor tradicional de El Salvador en cada pupusa. Más de 30 años sirviendo las mejores pupusas de revueltas, chicharrón y loroco en San Salvador.",
        imageUrl = "https://images.unsplash.com/photo-1617902271850-21d560795d60?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
    ,
        categories = listOf("Comida típica", "Pupusas", "Económico"),
        menu = listOf(
            Dish(1, "Pupusa de Revueltas", "Rellena de chicharrón, queso y frijoles refritos", Pupusa),
            Dish(2, "Pupusa de Loroco con Queso", "Flor de loroco fresca mezclada con queso blanco derretido", Pupusa),
            Dish(3, "Curtido", "Repollo encurtido tradicional acompañante de pupusas", "https://images.pexels.com/photos/8601413/pexels-photo-8601413.jpeg"),
            Dish(4, "Atol de Elote", "Bebida tradicional caliente de maíz dulce", "https://images.pexels.com/photos/28525198/pexels-photo-28525198.jpeg")
        )
    ),

    Restaurant(
        id = 2,
        name = "Pupusas El Comal Feliz",
        description = "Pupusas hechas a mano con masa fresca cada mañana. El favorito del barrio desde 1995, con más de 12 tipos de relleno.",
        imageUrl = "https://images.unsplash.com/photo-1747671730852-357e42bb9372?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        categories = listOf("Comida típica", "Pupusas"),
        menu = listOf(
            Dish(101, "Pupusa de Ayote", "Calabaza tierna y queso fundido en masa de maíz", Pupusa),
            Dish(102, "Pupusa de Frijoles con Queso", "Frijoles negros refritos y queso blanco cremoso", Pupusa),
            Dish(103, "Fresco de Tamarindo", "Bebida refrescante de tamarindo natural", "https://images.pexels.com/photos/33490795/pexels-photo-33490795.jpeg")
        )
    ),

    Restaurant(
        id = 3,
        name = "Don Nacho Pupusería",
        description = "Tradición familiar con receta secreta de masa transmitida por tres generaciones. Abierto desde las 6 AM todos los días.",
        imageUrl = "https://images.pexels.com/photos/12276358/pexels-photo-12276358.jpeg",
        categories = listOf("Pupusas", "Económico"),
        menu = listOf(
            Dish(104, "Pupusa de Chicharrón", "Chicharrón molido con tomate y chile verde", Pupusa),
            Dish(105, "Pupusa Especial de la Casa", "Revueltas, loroco y jalapeño en una sola pupusa", Pupusa),
            Dish(106, "Atol Shuco", "Bebida fermentada de maíz negro con pepitoria", "https://images.pexels.com/photos/34523783/pexels-photo-34523783.jpeg")
        )
    ),

    Restaurant(
        id = 4,
        name = "La Casa de las Pupusas",
        description = "El rincón más acogedor de Soyapango para disfrutar pupusas gourmet con ingredientes locales y salsas artesanales.",
        imageUrl = "https://images.pexels.com/photos/9216207/pexels-photo-9216207.jpeg",
        categories = listOf("Comida típica", "Pupusas", "Familiar"),
        menu = listOf(
            Dish(107, "Pupusa Gourmet de Camarón", "Camarón al ajillo con queso crema y loroco", Pupusa),
            Dish(108, "Pupusa de Espinaca y Queso", "Espinaca fresca salteada con queso blanco suave", Pupusa),
            Dish(109, "Fresco de Ensalada", "Horchata con ensalada de frutas tropicales", "https://images.pexels.com/photos/12999396/pexels-photo-12999396.jpeg")
        )
    ),

    Restaurant(
        id = 5,
        name = "Mariscos Don Chepe",
        description = "Los mejores mariscos frescos del Pacífico salvadoreño. Especialistas en ceviche, cócteles de camarón y pescados a la plancha directamente del Puerto de La Libertad.",
        imageUrl = "https://images.unsplash.com/photo-1615141982883-c7ad0e69fd62?w=800",
        categories = listOf("Mariscos", "Ceviche", "Familiar"),
        menu = listOf(
            Dish(5, "Ceviche de Camarón", "Camarones frescos marinados en limón con tomate, cebolla y cilantro", "https://images.pexels.com/photos/34831902/pexels-photo-34831902.jpeg"),
            Dish(6, "Cóctel de Conchas", "Conchas negras en salsa especial de la casa con aguacate", "https://images.pexels.com/photos/16741144/pexels-photo-16741144.jpeg"),
            Dish(7, "Pescado Frito Entero", "Tilapia o pargo frito acompañado de yuca y ensalada", "https://images.pexels.com/photos/29721168/pexels-photo-29721168.jpeg"),
            Dish(8, "Sopa de Marisco", "Caldo espeso con camarones, almejas, cangrejo y verduras", "https://images.pexels.com/photos/34831946/pexels-photo-34831946.jpeg")
        )
    ),

    Restaurant(
        id = 6,
        name = "El Puerto del Sabor",
        description = "Mariscos traídos frescos cada mañana de La Libertad. Especialistas en caldo de mariscos y camarones a la plancha desde 2005.",
        imageUrl = "https://images.unsplash.com/photo-1519708227418-c8fd9a32b7a2?w=800",
        categories = listOf("Mariscos", "Ceviche"),
        menu = listOf(
            Dish(110, "Camarones al Ajillo", "Camarones salteados en mantequilla, ajo y limón", "https://images.unsplash.com/photo-1535399831218-d5bd36d1a6b3?w=400"),
            Dish(111, "Ceviche Mixto", "Camarón, pulpo y pescado marinados en limón con chile", "https://images.unsplash.com/photo-1565557623262-b51c2513a641?w=400"),
            Dish(112, "Caldo de Mariscos", "Sopa tradicional costera con mariscos mixtos y vegetales", "https://images.unsplash.com/photo-1547592180-85f173990554?w=400")
        )
    ),

    Restaurant(
        id = 7,
        name = "La Marea Azul",
        description = "Vista al lago de Ilopango con los mejores platillos de mariscos del oriente de San Salvador. Ambiente familiar y porciones generosas.",
        imageUrl = "https://images.unsplash.com/photo-1547592180-85f173990554?w=800",
        categories = listOf("Mariscos", "Familiar"),
        menu = listOf(
            Dish(113, "Pulpo a la Parrilla", "Pulpo tierno a las brasas con aceite de oliva y hierbas", "https://images.pexels.com/photos/29208507/pexels-photo-29208507.jpeg"),
            Dish(114, "Filete de Tilapia al Limón", "Tilapia fresca al horno con mantequilla y limón", "https://images.unsplash.com/photo-1519708227418-c8fd9a32b7a2?w=400"),
            Dish(115, "Ensalada de Pulpo", "Pulpo cocido con vegetales frescos y aderezo cítrico", "https://images.pexels.com/photos/8971797/pexels-photo-8971797.jpeg")
        )
    ),

    Restaurant(
        id = 8,
        name = "Costa Brava Mariscos",
        description = "El restaurante de mariscos más antiguo de Santa Ana. Recetas transmitidas de generación en generación desde los pescadores del Bálsamo.",
        imageUrl = "https://images.unsplash.com/photo-1565557623262-b51c2513a641?w=800",
        categories = listOf("Mariscos", "Ceviche", "Económico"),
        menu = listOf(
            Dish(116, "Ceviche de Pescado", "Corvina fresca marinada con limón, chile y cebolla morada", "https://images.unsplash.com/photo-1535399831218-d5bd36d1a6b3?w=400"),
            Dish(117, "Conchas a la Diabla", "Conchas negras en salsa picante de chile habanero", "https://images.unsplash.com/photo-1565557623262-b51c2513a641?w=400"),
            Dish(118, "Arroz con Camarones", "Arroz blanco salteado con camarones, pimiento y cilantro", "https://images.unsplash.com/photo-1547592180-85f173990554?w=400")
        )
    ),

    Restaurant(
        id = 9,
        name = "El Fogón Colonial",
        description = "Cocina salvadoreña de autor en el corazón del Casco Histórico. Fusionamos recetas ancestrales con técnicas modernas para una experiencia gastronómica única.",
        imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?w=800",
        categories = listOf("Gourmet", "Cocina de autor", "Cenas románticas"),
        menu = listOf(
            Dish(9, "Sopa de Pata", "Caldo tradicional de res con verduras y especias salvadoreñas", "https://images.pexels.com/photos/28902900/pexels-photo-28902900.jpeg"),
            Dish(10, "Tamales de Elote", "Tamales dulces de maíz tierno envueltos en hoja de elote", "https://images.pexels.com/photos/33490796/pexels-photo-33490796.jpeg"),
            Dish(11, "Lomo de Res al Chimichurri", "Corte premium de res con chimichurri criollo y yuca asada", "https://images.unsplash.com/photo-1544025162-d76694265947?w=400"),
            Dish(12, "Quesadilla Salvadoreña de Postre", "Bizcocho tradicional de queso con ajonjolí", "https://images.pexels.com/photos/34637995/pexels-photo-34637995.jpeg")
        )
    ),

    Restaurant(
        id = 10,
        name = "Terraza 1811",
        description = "Alta cocina centroamericana con vista panorámica al volcán de San Salvador. Menú de temporada con ingredientes de productores locales.",
        imageUrl = "https://images.unsplash.com/photo-1414235077428-338989a2e8c0?w=800",
        categories = listOf("Gourmet", "Cenas románticas"),
        menu = listOf(
            Dish(119, "Carpaccio de Res", "Láminas finas de res con rúcula, parmesano y alcaparras", "https://images.pexels.com/photos/26161203/pexels-photo-26161203.jpeg"),
            Dish(120, "Risotto de Hongos", "Arroz arbóreo cremoso con hongos silvestres y trufa negra", "https://images.pexels.com/photos/6406460/pexels-photo-6406460.jpeg"),
            Dish(121, "Pato Laqueado", "Pecho de pato con salsa de maracuyá y puré de camote", "https://images.pexels.com/photos/15590364/pexels-photo-15590364.jpeg")
        )
    ),

    Restaurant(
        id = 11,
        name = "Restaurante Ágave",
        description = "Fusión latinoamericana en el corazón de Antiguo Cuscatlán. Chef formado en Ciudad de México trae técnicas de vanguardia a la cocina salvadoreña.",
        imageUrl = "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?w=800",
        categories = listOf("Gourmet", "Cocina de autor"),
        menu = listOf(
            Dish(122, "Tostada de Atún", "Atún sellado sobre tostada crujiente con aguacate y chipotle", "https://images.pexels.com/photos/27827767/pexels-photo-27827767.jpeg"),
            Dish(123, "Costilla BBQ de 12 horas", "Costilla de cerdo cocida lentamente con salsa de chilhuacle", "https://images.unsplash.com/photo-1544025162-d76694265947?w=400"),
            Dish(124, "Tres Leches Moderno", "Bizcocho empapado en tres leches con espuma de vainilla", "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400")
        )
    ),

    Restaurant(
        id = 12,
        name = "Pizza & Más Santa Tecla",
        description = "La pizza favorita de Santa Tecla con más de 15 años en el mercado. Masa artesanal, ingredientes frescos y el toque salvadoreño que nos hace únicos.",
        imageUrl = "https://images.unsplash.com/photo-1513104890138-7c749659a591?w=800",
        categories = listOf("Pizza", "Italiana", "Para llevar"),
        menu = listOf(
            Dish(13, "Pizza Salvadoreña", "Salsa de tomate, queso, frijoles, chorizo y crema", "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=400"),
            Dish(14, "Pizza Margherita", "Salsa de tomate natural, mozzarella fresca y albahaca", "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=400"),
            Dish(15, "Calzone de Jamón y Queso", "Masa rellena al horno con jamón, queso y champiñones", "https://images.unsplash.com/photo-1528736235302-52922df5c122?w=400"),
            Dish(16, "Pasta Carbonara", "Espagueti con tocino, huevo, parmesano y pimienta negra", "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400")
        )
    ),

    Restaurant(
        id = 13,
        name = "Forno di Napoli",
        description = "Auténtica pizza napolitana horneada en horno de leña importado de Italia. Masa fermentada 48 horas con harina tipo 00.",
        imageUrl = "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=800",
        categories = listOf("Pizza", "Italiana"),
        menu = listOf(
            Dish(125, "Pizza Napoletana", "Tomate San Marzano, mozzarella di bufala y anchoas", "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=400"),
            Dish(126, "Pizza Quattro Stagioni", "Jamón, alcachofas, champiñones y aceitunas por cuadrantes", "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=400"),
            Dish(127, "Tiramisú Casero", "Postre italiano con mascarpone, espresso y cacao", "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400")
        )
    ),

    Restaurant(
        id = 14,
        name = "Bella Italia Zona Rosa",
        description = "El restaurante italiano más elegante de la Zona Rosa. Pastas frescas hechas a diario y la mejor selección de vinos italianos en El Salvador.",
        imageUrl = "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=800",
        categories = listOf("Italiana", "Gourmet", "Cenas románticas"),
        menu = listOf(
            Dish(128, "Pasta Fresca al Ragú", "Tagliatelle con ragú de res lentamente cocido por 6 horas", "https://images.unsplash.com/photo-1612874742237-6526221588e3?w=400"),
            Dish(129, "Risotto ai Frutti di Mare", "Arroz cremoso con camarones, vieiras y almejas", "https://images.pexels.com/photos/31779537/pexels-photo-31779537.jpeg"),
            Dish(130, "Panna Cotta de Frutas", "Postre cremoso con coulis de frutos rojos frescos", "https://images.pexels.com/photos/15359109/pexels-photo-15359109.jpeg")
        )
    ),

    Restaurant(
        id = 15,
        name = "Pizzería El Volcán",
        description = "Pizza artesanal con toque salvadoreño en San Miguel. Conocidos por nuestras pizzas con ingredientes típicos como loroco, chorizo de cerdo y crema.",
        imageUrl = "https://images.pexels.com/photos/5056857/pexels-photo-5056857.jpeg",
        categories = listOf("Pizza", "Para llevar", "Económico"),
        menu = listOf(
            Dish(131, "Pizza de Loroco", "Loroco, queso blanco y salsa de tomate casera", "https://images.unsplash.com/photo-1574071318508-1cdbab80d002?w=400"),
            Dish(132, "Pizza BBQ Criolla", "Pollo, chorizo salvadoreño, jalapeño y salsa BBQ", "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=400"),
            Dish(133, "Pan de Ajo Artesanal", "Pan baguette con mantequilla de ajo y hierbas finas", "https://images.pexels.com/photos/6170675/pexels-photo-6170675.jpeg")
        )
    ),

    Restaurant(
        id = 16,
        name = "Café Ataco",
        description = "Inspirados en la magia del pueblo mágico de Ataco, ofrecemos el mejor café de altura salvadoreño junto a desayunos típicos y repostería artesanal.",
        imageUrl = "https://images.unsplash.com/photo-1445116572660-236099ec97a0?w=800",
        categories = listOf("Café", "Desayunos", "Repostería"),
        menu = listOf(
            Dish(17, "Café Salvadoreño de Altura", "Taza de café 100% arábica de los cafetales de Santa Ana", "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?w=400"),
            Dish(18, "Desayuno Típico", "Frijoles, crema, queso duro, plátano frito, huevos y tortillas", "https://images.unsplash.com/photo-1533089860892-a7c6f0a88666?w=400"),
            Dish(19, "Pan con Pollo", "Pan francés relleno de pollo guisado con verduras salvadoreñas", "https://images.pexels.com/photos/5122952/pexels-photo-5122952.jpeg"),
            Dish(20, "Semita de Piña", "Pan dulce salvadoreño relleno de jalea de piña", "https://images.unsplash.com/photo-1568254183919-78a4f43a2877?w=400")
        )
    ),

    Restaurant(
        id = 17,
        name = "The Golden Roast",
        description = "Specialty coffee con granos de origen único salvadoreño. Métodos de preparación alternativos: V60, AeroPress y cold brew de 24 horas.",
        imageUrl = "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?w=800",
        categories = listOf("Café", "Desayunos"),
        menu = listOf(
            Dish(134, "Cold Brew 24h", "Café de inmersión en frío con notas achocolatadas", "https://images.unsplash.com/photo-1495474472287-4d71bcdd2085?w=400"),
            Dish(135, "Flat White", "Doble espresso con leche vaporizada sedosa", "https://images.pexels.com/photos/29488014/pexels-photo-29488014.jpeg"),
            Dish(136, "Avocado Toast", "Pan de masa madre con aguacate, huevo pochado y semillas", "https://images.pexels.com/photos/21631444/pexels-photo-21631444.jpeg")
        )
    ),

    Restaurant(
        id = 18,
        name = "Dulcería La Abuela",
        description = "Repostería artesanal salvadoreña hecha con amor. Panes dulces, semitas y pasteles de sabores únicos usando recetas de más de 50 años.",
        imageUrl = "https://images.unsplash.com/photo-1568254183919-78a4f43a2877?w=800",
        categories = listOf("Repostería", "Café", "Económico"),
        menu = listOf(
            Dish(137, "Novias", "Pan dulce hojaldrado relleno de jalea de mora negra", "https://images.pexels.com/photos/17399993/pexels-photo-17399993.jpeg"),
            Dish(138, "Pastel Tres Leches", "Esponjoso bizcocho bañado en tres tipos de leche", "https://images.unsplash.com/photo-1578985545062-69928b1d9587?w=400"),
            Dish(139, "Quesadilla de Arroz", "Versión ligera de la quesadilla tradicional con arroz", "https://media.istockphoto.com/id/2210855424/photo/top-view-of-a-homemade-cheese-pound-cake.jpg?s=2048x2048&w=is&k=20&c=dIHqMr58vWNum55L3LEuudJnFs4itpjEi4QC7wENeLE="),
            Dish(140, "Té de Manzanilla con Miel", "Infusión relajante de manzanilla con miel de abeja local", "https://images.pexels.com/photos/8257749/pexels-photo-8257749.jpeg")
        )
    ),

    Restaurant(
        id = 19,
        name = "Brunch & Bloom",
        description = "El mejor brunch de Antiguo Cuscatlán. Ambiente moderno y acogedor con opciones saludables, pancakes artesanales y jugos naturales.",
        imageUrl = "https://images.unsplash.com/photo-1533089860892-a7c6f0a88666?w=800",
        categories = listOf("Desayunos", "Café"),
        menu = listOf(
            Dish(141, "Pancakes de Plátano", "Pancakes esponjosos con plátano maduro y miel de maple", "https://images.pexels.com/photos/19083549/pexels-photo-19083549.jpeg"),
            Dish(142, "Bowl de Açaí", "Base de açaí con granola, frutos rojos y coco rallado", "https://images.unsplash.com/photo-1512621776951-a57141f2eefd?w=400"),
            Dish(143, "Jugo Verde Detox", "Espinaca, pepino, manzana verde, jengibre y limón", "https://images.pexels.com/photos/30635728/pexels-photo-30635728.jpeg")
        )
    ),

    Restaurant(
        id = 20,
        name = "Burger El Volcán",
        description = "Las hamburguesas más jugosas de San Salvador. Carne de res 100% nacional, pan artesanal y salsas secretas elaboradas en casa.",
        imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=800",
        categories = listOf("Comida rápida", "Para llevar", "Económico"),
        menu = listOf(
            Dish(144, "Burger Clásica", "Carne de res, lechuga, tomate, cebolla y salsa especial", "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400"),
            Dish(145, "Burger BBQ Bacon", "Doble carne, tocino crujiente y salsa BBQ ahumada", "https://images.unsplash.com/photo-1549611016-3a70d82b5040?q=80&w=1130&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Dish(146, "Papas Fritas con Queso", "Papas crujientes bañadas en salsa de queso cheddar", "https://images.unsplash.com/photo-1666304752980-678d5c35c911?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
        )
    ),

    Restaurant(
        id = 21,
        name = "Tacos El Buen Vecino",
        description = "Auténticos tacos mexicanos preparados por chef poblano asentado en San Salvador. Tortillas hechas a mano y carnitas cocinadas en comal de barro.",
        imageUrl = "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=800",
        categories = listOf("Comida rápida", "Mexicana", "Para llevar"),
        menu = listOf(
            Dish(147, "Taco de Carnitas", "Cerdo confitado con cebolla, cilantro y salsa verde", "https://images.unsplash.com/photo-1565299585323-38d6b0865b47?w=400"),
            Dish(148, "Taco de Barbacoa", "Res cocida lentamente con chile guajillo y hierbas", "https://images.pexels.com/photos/24182335/pexels-photo-24182335.jpeg"),
            Dish(149, "Agua de Jamaica", "Flor de jamaica natural con azúcar de caña", "https://images.pexels.com/photos/34567207/pexels-photo-34567207.jpeg")
        )
    ),

    Restaurant(
        id = 22,
        name = "Pollo Campero Express",
        description = "El sabor guatemalteco que conquistó Centroamérica ahora en formato express. Pollo crujiente y jugoso listo en minutos.",
        imageUrl = "https://images.unsplash.com/photo-1562967914-608f82629710?w=800",
        categories = listOf("Comida rápida", "Para llevar", "Familiar"),
        menu = listOf(
            Dish(150, "Piezas de Pollo", "Pechuga o pierna de pollo frito estilo campero", "https://images.unsplash.com/photo-1562967914-608f82629710?w=400"),
            Dish(151, "Combo Familiar", "8 piezas de pollo con papas fritas y ensalada de col", "https://images.pexels.com/photos/12178045/pexels-photo-12178045.jpeg"),
            Dish(152, "Limonada Natural", "Limón exprimido al momento con agua mineral", "https://images.pexels.com/photos/33107433/pexels-photo-33107433.jpeg")
        )
    ),

    Restaurant(
        id = 23,
        name = "Hot Dogs El Ferrocarril",
        description = "Los hot dogs más famosos del mercado central. Desde 1978 sirviendo salchichas con todos los agregados en el corazón de San Salvador.",
        imageUrl = "https://images.pexels.com/photos/4113456/pexels-photo-4113456.jpeg",
        categories = listOf("Comida rápida", "Económico"),
        menu = listOf(
            Dish(153, "Hot Dog Completo", "Salchicha con cebolla, mostaza, mayonesa y salsa de tomate", "https://images.pexels.com/photos/7974806/pexels-photo-7974806.jpeg"),
            Dish(154, "Hot Dog Especial", "Doble salchicha, tocino, queso derretido y jalapeños", "https://images.pexels.com/photos/36501088/pexels-photo-36501088.jpeg"),
            Dish(155, "Fresco de Horchata", "Bebida tradicional de arroz con canela y semillas", "https://images.pexels.com/photos/34566510/pexels-photo-34566510.jpeg")
        )
    )
)