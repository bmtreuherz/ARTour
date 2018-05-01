package bmtreuherz.artour.Utilities

import bmtreuherz.artour.DTOs.Feature

/**
 * Created by Bradley on 3/19/18.
 */
object HttpClient {

    fun getFeatures(): List<Feature>{
        var features = ArrayList<Feature>()

        features.add(Feature("Marston Science Library", 0, -82.344002, 29.647999, "One of nine libraries on campus, the Marston Science Library serves more than 1.5 million visitors a year, and specializes in physical, life and earth sciences, engineering, agriculture and mathematics. The library is set up on an “elevated volume control system” meaning the higher the floor, the quieter it is. The Starbucks is open all hours the library is open. The first floor was recently completely renovated in 2014 and includes a new Collaboration Commons created in response to the students’ desire for more space to meet and study.  The 26,000 square foot Commons has seating for more than  700 and includes 21 group study rooms with large high-definition monitors, a data visualization room and MADE@UF, the first lab in an academic library fully devoted to mobile application development.  The library has computers on every floor as well as printers, scanners, and even a room full of 3-D printers.", "marston", "marston_audio"))
        features.add(Feature("French Fries", 1,  -82.344326, 29.647958, "Installed in 1988, the sculpture is officially entitled “Alachua,” but is colloquially referred to by students as “the French Fries.”  It was designed to symbolize the crown of the Alachua Indian (Native American?). The Administration at the time disliked it so much they attempted – unsuccessful – to have it moved to the basement.", "french_fries", "french_fries_audio"))
        features.add(Feature("Computer Science & Engineering Building", 2,  -82.344295, 29.648381, "Home to the Computer & Information Science & Engineering department, the Computer Science and Engineering building has 10 research labs; multiple classrooms, computer labs, and video studios; and a lecture hall.  The brand new Testing & Active Learning Center has 126 computers in a dynamically designed classroom with a focus on a collaborative learning-based pedagogy. The computers in CSE (and also in Marston Science Library, Library West, and the 24-hour computer lab in the Architecture building) have most of the software programs students need for any major on campus.", "computer", "computer_audio"))
        features.add(Feature("The Hub", 3, -82.345280, 29.648257, "The Hub is home to additional dining options, as well as the UF Computing Help Desk.  They offer tech support and subsidized prices for most services needed. The Computing Help Desk does not fix hardware issues, but will handle any technical problem to the best of their abilities.", "hub", "hub_audio"))
        features.add(Feature("International Student Center", 4,  -82.345487, 29.648121, "The HUB is also home to the UF International Center where students can find information about studying abroad programs, exchange programs, and services for international students.", "international", "international_audio"))
        features.add(Feature("Century Tower", 5,  -82.343288, 29.648812, "Started in 1953 and completed in 1956, the tower was built to commemorate the University’s centennial and to serve as a memorial for UF students and faculty who fought in World Wars I and II. In the 1970s the 61-bell carillon was installed, and it now chimes every fifteen minutes and tolls every hour from 8am to 8pm. During fall and spring, at 12:35 and 4:55 each weekday, a carillonneur climbs the 11.5 flights of stairs and plays a concert of the bells with music ranging from classical to contemporary.", "century", "century_audio"))
        features.add(Feature("University Auditorium", 6, -82.342893, 29.649037, "The University Auditorium was finished in the mid 1920’s, then renovated and expanded as a bicentennial project in 1976, which led to its unique dual architecture. The University Auditorium is one of the only buildings on campus that is included in the National Register of Historic Places. It seats 867 people and is used for Fine Arts events, concerts and as a venue for invited speakers. It is also home to the Anderson Memorial Pipe Organ, one of the largest pipe organs in the United States (6,500 pipes!).", "auditorium", "auditorium_audio"))
        features.add(Feature("Turlington Plaza", 7,  -82.343736, 29.649111, "This area is one of three primary free speech zones on campus (along with the Reitz Union North Lawn and Plaza of the Americas), and has more people walk through it per square foot that any other place in the state, including Downtown Disney and the gates of Walt Disney World! Campus organizations use this space to table and inform students about their groups and events. The newspaper boxes contain free copies of numerous publications, including the Independent Florida Alligator – the largest student-run newspaper in the Nation!", "turlingtonPlaza", "turlingtonPlaza_audio"))
        features.add(Feature("Turlington Hall", 8,  -82.343963, 29.649295, "The Turlington building was completed in 1977 and won an architectural award for the most efficient use of space.  It also was designed so that the protests and riots that were common in the period would not affect students in their classes, hence the lack of windows in classrooms. It now serves as the headquarters for the College of Liberal Arts and Sciences, the largest college on campus, offering 37 different majors and 47 minors, and employing over 600 faculty members.", "turlingtonHall", "turlingtonHall_audio"))
        features.add(Feature("The Potato", 9, -82.343617, 29.649223, "This sculpture, called “The Potato,” is an approximately 30-million-year-old chert rock donated to the UF Geology Department by the Crushed Rock Company.  It was placed in Turlington as part of a beautification project. Students often dress it up at Halloween.", "potato", "potato_audio"))
        features.add(Feature("Newell Hall Learning Commons", 10,  -82.345061, 29.649125, "Opened in 2017, Newell Hall is a 24/7 learning commons, made by UF students for UF students.  Located in UF's third oldest building, the inside is high tech, comfortable, and designed for collaborative learning and study.  An Au Bon Pain provides refreshments for hungry students while they learn and engage.  Newell is run by the Dean of Students Office, in partnership with Student Government.", "newell", "newell_audio"))
        features.add(Feature("Criser Hall", 11,  -82.341549, 29.650302, "Criser Hall houses the Office of Admissions, the Office of Financial Affairs, and the Registrar’s Office. Additionally, the Student Employment Office is located on the ground floor of Criser Hall. Students interested in a work-study job on campus must acquire a job permit from this office. Finally, the University Bursar is also located in Criser. This is where administrators collect students' tuition and fee charges, and disburse financial awards (loans, grants, and scholarships).", "criser", "criser_audio"))
        features.add(Feature("Peabody Hall", 12, -82.342051, 29.650151, "Peabody Hall is also home to the Dean of Students Office, which includes “all things students,” ranging from student conduct and conflict resolution, to new student and family programs, and U Matter We Care. U Matter, We Care is a big part of the culture of care on UF’s campus: the care team reaches out people in distress and helps them prioritize issues and come up with a success plan and then follow up until no longer needed. Through the Dean of Students Office, information is available on a wide variety of programs, including: Preview, the UF orientation for new students and their families; First Year Florida, a one credit hour transition course; Common Reading Program; Gator Career Closet; Collegiate Veterans Success Center and the Disability Resource Center.", "peabody", "peabody_audio"))
        features.add(Feature("Plaza of the Americas", 13,  -82.342851, 29.650547, "The Plaza of the Americas is one of the two “green areas” on campus (along with the Reitz Union North Lawn), which means that no buildings may ever be constructed over the portion that remains.  It got its name in 1931, when students planted 21 trees in the plaza to honor the 21 countries that attended the first meeting of the International Latin American Association.  The plaza has played host to a “Karma-Free” lunch served by the Hare Krishna since 1977.", "plaza", "plaza_audio"))
        features.add(Feature("Library West", 14,  -82.342897, 29.651459, "The UF Libraries are the largest information resource system in the state of Florida, with seven locations containing close to 5 million print volumes. The libraries have over 3 million visitors a year – that’s more visitors than the O’Connell Center and Ben Hill Griffin Stadium combined! – plus many more online visitors. The UF Digital Collection houses more than 13 million digitized pages for use by students and researchers worldwide. Library West provides hundreds of places for individual study, 200+ computers, numerous group study rooms, a Starbucks coffee shop, and iPads for checkout. The library is open 24/7 during the fall and spring semesters.", "libwest", "libwest_audio"))
        features.add(Feature("Infirmary", 15, -82.346503, 29.649571, "The UF Student Health Care Center (SHCC) offers a wide variety of services to help keep students at their best, including general medical care, a women's health clinic, sports medicine services, nutrition counseling, a full-service pharmacy, X-ray and lab services. Students are assigned to a specific team of doctors and nurses when they arrive that they will stay with during their time at UF. This builds rapport and helps protect personal information. UF Health at Shands Hospital is located on the south side of the UF campus, and is the state’s leading health care referral system and one of the southeast’s most respected health care providers.", "infirmary", "infirmary_audio"))
        features.add(Feature("Student Rec", 16,  -82.346760, 29.650128, "The Student Recreation and Fitness Center features a gymnasium for basketball, volleyball and martial arts, a 6,300 square foot strength and conditioning room, three group exercise rooms and a cycle (spinning) studio, five racquetball courts, and two squash courts.", "studentRec", "studentRec_audio"))
        features.add(Feature("Honors Program", 17,  -82.346394, 29.649277, "The Honors Program is home to 3,400 of UF’s top-achieving students. Any incoming freshman may apply. Benefits of UF Honors include: exclusive course offerings (often taken as a supplement to their traditional courses), specialized advising and coaching, early registration for classes, housing in Hume Residence Hall, a variety of involvement and leadership opportunities, and a close-knit community of scholars.", "honors", "honors_audio"))
        features.add(Feature("Innovation Academy", 18, -82.346529, 29.649397, "Innovation Academy (IA) is a four-year undergraduate college experience that serves as a training ground for students to better prepare themselves for their career goals. In addition to their major, all Innovation Academy students also pursue a minor in Innovation, offered exclusively through IA at the University of Florida. IA's unique Spring / Summer academic calendar allows for a free fall semester and the ability to live in a living-learning community with their cohort.", "innovation", "innovation_audio"))
        features.add(Feature("Field and Fork", 19,  -82.344737, 29.647123, "Field and Fork Pantry was opened to assist members of our campus community who are experiencing food insecurity. Any individual with a Gator1 ID can attend, and will be given a basket to fill up with food to last a week completely FREE. Items that are available are non-perishable food items, toiletries, and occasional fresh produce from the UF Community Garden and UF farms.", "fieldFork", "fieldFork_audio"))
        features.add(Feature("Broward Hall", 20,  -82.342058, 29.646526, "There is a free tutoring center in Broward Hall. It offers free help in humanities, language, math, science, etc. There are also specialized tutoring centers for subjects such as Chemistry, Statistics, etc.", "broward", "broward_audio"))
        features.add(Feature("Tigert Hall", 21, -82.339836, 29.649461, "Completed in 1950, Tigert Hall is home to the President’s Office as well as the Office of Student Affairs. Also located in Tigert Hall is the University Ombudsman, whose purpose is to assist students, staff, and faculty in resolving problems and conflicts that arise in the course of interacting with the University of Florida. Tigert Hall was the first building on campus to include a computer room and one of the first to feature air conditioning.", "tigert", "tigert_audio"))
        features.add(Feature("Murphree Hall", 22,  -82.346558, 29.651233, "The Murphree Commons Courtyard is located in the historic district of campus and offers a wide array of housing styles including single, double, and triple rooms. Freshmen are not required to live on campus, but 82% of students living in residence halls are first year students. UF estimates that approximately 23% of all students live on campus. For more information about on- and off-campus housing options, see https://housing.ufl.edu.", "murphree", "murphree_audio"))
        features.add(Feature("Safety", 23,  -82.342917, 29.644342, "This mission of the University of Florida Police Department is to preserve a safe, secure campus environment where diverse social, cultural and academic values are allowed to develop and prosper through a combination of reactive, proactive and educational law enforcement services. The University campus and nearby neighborhoods are patrolled by three different law enforcement agencies – the Alachua County Sheriff’s Office, the Gainesville Police Department, and the University of Florida’s 90 sworn officers. The campus is also very well lit, and yearly lighting audits are done to decide where additional lights can be added for safety. The University provides a service called SNAP (the Student Nighttime Auxiliary Patrol) which is a free night time door to door escort service co-sponsored by the UF Student Government and the UFPD. Students are encouraged to download and use the UFPD's mobile safety app called GATORSAFE.", "safety", "safety_audio"))
        features.add(Feature("Broward Dining Hall", 24, -82.341239, 29.646940, "Broward Dining is one of two dining facilities on campus. Both are located near residence halls and set up like food courts, with different stations serving different types of food; students may stay as long as desired per visit. Free Wi-Fi internet is available in both dining halls. There are over 45 additional campus eateries including national brands like Moe’s, Wendy’s, Subway, Chick-Fil-A, Starbucks and more. UF also offers several kosher and vegetarian meal options. In fact, UF has been ranked the #1 most Vegan friendly University, according to PETA! Meal plans are not required, but can be purchased by meal OR as a declining balance option. Prices vary by semester but current information can be found at gatordining.com.", "browardDining", "browardDining_audio"))
        features.add(Feature("Gator Dining", 25,  -82.350112, 29.648010, "Gator Corner is one of two dining facilities on campus. Both are located near residence halls and set up like food courts, with different stations serving different types of food; students may stay as long as desired per visit. Free Wi-Fi internet is available in both dining halls. There are over 45 additional campus eateries including national brands like Moe’s, Wendy’s, Subway, Chick-Fil-A, Starbucks and more. UF also offers several kosher and vegetarian meal options. In fact, UF has been ranked the #1 most Vegan friendly University, according to PETA! Meal plans are not required, but can be purchased by meal OR as a declining balance option. Prices vary by semester but current information can be found at gatordining.com.", "gatorDining", "gatorDining_audio"))
        features.add(Feature("Broward Recreational Complex", 26,  -82.342167, 29.645783, "The Broward Recreational Complex is an outdoor facility for students to participate in basketball, tennis, volleyball, roller hockey, and recreational skating. All facilities, including a skate park, are open year-round to students wearing proper safety gear. Daily equipment check-out is available to UF students free of charge with a UF ID.", "browardrRec", "browardRec_audio"))
        features.add(Feature("Lake Wauberg", 27, -82.303161, 29.530469, "Lake Wauburg is a ten-minute drive from campus and offers free water skiing, wakeboarding and sailing to all UF students. There is also a 55-foot climbing wall and six-sided bouldering grotto, and students can rent out catamarans, paddle boats, canoes, and kayaks. All of these events are free with a Gator ID – which also allows you to bring 4 guests. There is also a bus route from the Reitz Union directly to Lake Wauburg, which runs on the weekends.", "wauberg", "wauberg_audio"))
        features.add(Feature("Counseling and Wellness Center", 28,  -82.369324, 29.642483, "The Counseling and Wellness Center is an on-campus mental health agency for students. The CWC’s primary focus is on providing brief, confidential counseling and consultation services aimed at helping students succeed academically and interpersonally.", "cwc", "cwc_audio"))
        features.add(Feature("Ben Hill Griffin Stadium", 29,  -82.348590, 29.649973, "Also known as “The Swamp,” Ben Hill Griffin Stadium seats 88,548 people.  This makes it the 13th largest stadium in the nation and the largest in the state.  In 2014, USA Today ranked Ben Hill Griffin Stadium as the 6th best college venue in the United States. It has also been considered one of the most difficult places to play due to the design of the stadium; the field is about 30 feet below ground level and fans are sometimes only 10 feet away from players.", "stadium", "stadium_audio"))
        features.add(Feature("Stephen C. O'Connell Center", 30, -82.351118, 29.649488, "The Stephen C. O’Connell Center, also called the O’Dome, is named after UF’s sixth President. The recently renovated arena seats 10,133 fans and is home to the men’s and women’s basketball, volleyball, indoor track, gymnastics, swimming and diving teams. The Center includes the new Exactech Arena, a private court, two weight rooms, an indoor swimming pool, an indoor track, a private gymnastics area, a dance studio, and a martial arts area.", "oconnel", "oconnel_audio"))
        features.add(Feature("Florida Museum of Natural History", 31,  -82.369814, 29.635939, "The Florida Museum of Natural History is the state's official natural history museum. With millions of specimens of amphibians, birds, butterflies, fish, mammals, mollusks, reptiles, vertebrate and invertebrate fossils, recent and fossil plants and associated databases and libraries, the Florida Museum is the largest natural history museum in the Southeast. The ever-growing collections of specimens rank among the top 10 nationally and internationally.", "FMNH", "FMNH_audio"))
        features.add(Feature("Butterfly Rainforest", 32,  -82.370337, 29.636307, "Located inside the Museum of Natural History, the Butterfly Rainforest is a living exhibit that supports hundreds of butterflies from around the world for visitors to experience first-hand. UF’s Butterfly Rainforest has the largest living collection of butterflies, moths, and skippers in the world. The McGuire Center for Lepidoptera and Biodiversity serves both research and public education functions. The center includes 39,000 square feet of research laboratories and collection space making it the world's largest facility dedicated to butterfly and moth research with one of the largest Lepidoptera collections, second only to The Natural History Museum in London.", "butterfly", "butterfly_audio"))
        features.add(Feature("Harn Museum of Art", 33, -82.370145, 29.637063, "The Harn Museum opened to the public in 1990, and expanded by opening the Cofrin Asian Art Wing in 2012. The Harn has a permanent collection of more than 9,000 objects of fine art from all over the world, and is constantly hosting traveling exhibitions.  The Cofrin Pavilion houses exhibition space for sculpture, painting, video and other media and features art classrooms and a bistro-style café.  As the physical facilities are growing, so are the collections.  The museum now houses a net collection worth more than $10 million dollars.", "harn", "harn_audio"))
        features.add(Feature("Phillips Center for Performing Arts", 34,  -82.369307, 29.635264, "The Curtis M. Phillips Center for the Performing Arts Showcases the very best artists and performers from around the globe.  Many American artists and companies have also graced the stage of the Phillips Center with some of Broadway’s most notable musicals and plays.  The Center seats over 1700 people in its main auditorium and is located in the Cultural Plaza in the south west corner of campus.  If an event is not free, student tickets are typically available for purchase.", "phillips", "phillips_audio"))
        features.add(Feature("Southwest Recreation Center", 35,  -82.368327, 29.638413, "The South West Recreation Center features a 14,000 sq. ft. weight room, digital lockers, a split level 15,000 sq. ft. cardio room, 3 group fitness rooms, 6 indoor basketball courts, a social lounge, and an indoor track.  It is also one of the busiest places on campus – between 1,500 and 2,000 students use SW Rec every day.", "southwest", "southwest_audio"))

        features.add(Feature("Marston Science Library", 50, -82.344002, 29.647999, "Una de las 9 bibliotecas en el campus, la biblioteca de ciencias Marston, recibe a más de 1 millón y medio de visitantes cada año y se especializa en ingeniería, agricultura, matemáticas, las ciencias biológicas y la geociencia. ¡Todos los recursos bibliotecarios están disponibles en www.uflib.ufl.edu!\n" +
                "La biblioteca está configurada de tal manera que a medida que se sube de piso el ambiente se vuelve más silencioso.  En la planta baja hay un Starbucks que permanece abierto durante las horas en que está abierta la biblioteca. \n" +
                "En el 2014 se renovó completamente el primer piso y ahora incluye un espacio libre para actividades en colaboración que en inglés se llama “Collaboration Commons” y que se creó como respuesta al deseo de los estudiantes de tener más espacio para reunirse y estudiar.  Esta área de 2.416 metros cuadrados tiene capacidad para 700 personas e incluye 21 salas para grupos de estudio, con grandes monitores de alta definición, un cuarto para las visualizaciones de datos y MADE@UF, el primer laboratorio dentro de una biblioteca académica dedicado completamente al desarrollo de aplicaciones móviles.  La biblioteca tiene computadoras en cada piso, también impresoras, escáneres y un cuarto con impresoras 3D. \n" +
                "Las impresoras 3D están disponibles para uso de todos en UF e incluso al público. Cuesta \$0.15/gramo y se pueden pedir modelos para imprimir en línea, visitando: 3dprint.uflib.ufl.edu.   Si los estudiantes quieren usar estas impresoras por su cuenta, también están disponibles para tomar prestadas, junto con filamento plástico gratis.\n", "marston", "marston_spanish"))
        features.add(Feature("French Fries", 51,  -82.344326, 29.647958, "Construida en 1988, esta escultura se tituló oficialmente “Alachua”. Fue diseñada para simbolizar la corona del indio Alachua y a la administración de ese momento le disgustaba tanto que solicitó que se la llevara al sótano. La mayoría de los estudiantes simplemente la llaman las “Papas Fritas” y es un centro de reunión común en el campus", "french_fries", "fries_spanish"))
        return features

    }
}

