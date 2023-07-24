package com.example.movieapp

class Datasource {
    fun DSPhim(): List<Phim> {
        return listOf(
            Phim(
                "FAST X",
                "Over many missions and against impossible odds, Dom Toretto and his family have outsmarted, out-nerved and outdriven every foe in their path. Now, they confront the most lethal opponent they've ever faced: A terrifying threat emerging from the shadows of the past who's fueled by blood revenge, and who is determined to shatter this family and destroy everything—and everyone—that Dom loves, forever.",
                "https://th.bing.com/th?id=OIF.JxAQ3K3ketWjStylIE%2b2Uw&pid=ImgDet&rs=1",
                "Director: Louis Leterrier", // đạo diễn
                "Time: 141 minutes",
                "Category: Fantasy , Action", //thể loại
                "Performer: Vin Diesel,Michelle Rodriguez,Jason Statham,Tyrese Gibson, Jason Momoa, John Cena ... "
            ),
            Phim(
                "THE SUPER MARIO BROS MOVIE",
                "While working underground to fix a water main, Brooklyn plumbers—and brothers—Mario and Luigi are transported down a mysterious pipe and wander into a magical new world. But when the brothers are separated, Mario embarks on an epic quest to find Luigi",
                "https://upload.wikimedia.org/wikipedia/en/4/44/The_Super_Mario_Bros._Movie_poster.jpg",
                "Director: Aaron Horvath, Michael Jelenic",
                "Time: 93 minutes",
                "Category: Animation , Comedy , Adventure ",
                "Performer: Chris Pratt, Jack Black, Anya Taylor Joy, Charlie Day, Keegan Michael Key, ... "
            ),
            Phim(
                "SPIDER- MAN: ACROSS THE SPIDER-VERSE",
                "After reuniting with Gwen Stacy, Brooklyn’s full-time, friendly neighborhood Spider-Man is catapulted across the Multiverse, where he encounters the Spider Society, a team of Spider-People charged with protecting the Multiverse’s very existence. But when the heroes clash on how to handle a new threat, Miles finds himself pitted against the other Spiders and must set out on his own to save those he loves most.",
                "https://th.bing.com/th/id/OIF.M959gdw47M4GqrQGrfolcQ?pid=ImgDet&rs=1",
                "Director: Joaquim Dos Santos, Kemp Powers, Justin K Thompson",
                "Time: 140 minutes",
                "Category: Fantasy , Animation , Action , Adventure , Superhero ",
                "Performer: Shameik Moore, Hailee Steinfeld, Oscar Isaac,Jake Johnson, Brian Tiree Henry, ... "
            ),
            Phim(
                "TRANSFORMERS: RISE OF THE BEASTS",
                "When a new threat capable of destroying the entire planet emerges, Optimus Prime and the Autobots must team up with a powerful faction known as the Maximals. With the fate of humanity hanging in the balance, humans Noah and Elena will do whatever it takes to help the Transformers as they engage in the ultimate battle to save Earth.",
                "https://image.tmdb.org/t/p/w400/gPbM0MK8CP8A174rmUwGsADNYKD.jpg",
                "Director: Steven Caple Jr",
                "Time: 127 minutes",
                "Category: Fantasy , Action , Adventure ",
                "Performer: Peter Cullen, Pete Davidson, Duong Tu Quynh, Peter Dinklage, Ron Perlman, Cristo Fernandez,... "
            ),
            Phim(
                "HYPONTIC",
                "A detective becomes entangled in a mystery involving his missing daughter and a secret government program while investigating a string of reality-bending crimes.",
                "https://musicart.xboxlive.com/7/1e166600-0000-0000-0000-000000000002/504/image.jpg?w=1920&h=1080",
                "Director: Robert Rodriguez",
                "Time:93 minutes ",
                "Category: Mystery, Action, Suspense ",
                "Performer:Ben Affleck, Alice Braga, William Fichtner, JD Pardo , ..."
            ),
            Phim(
                "THE FLASH ",
                "When his attempt to save his family inadvertently alters the future, Barry Allen becomes trapped in a reality in which General Zod has returned and there are no Super Heroes to turn to. In order to save the world that he is in and return to the future that he knows, Barry's only hope is to race for his life. But will making the ultimate sacrifice be enough to reset the universe?",
                "data:image/jpeg;base64,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",
                "Director: James Gunn",
                "Time: 144minutes ",
                "Category: Fiction, Mythology, Adventure, Action ",
                "Performer: Ben Affleck, Ezra Miller, ..."
            ),
            Phim(
                "GUARDIANS OF THE GALAXY VOL.3",
                " Peter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own. A mission that, if not completed successfully, could quite possibly lead to the end of the Guardians as we know them.",
                "https://m.media-amazon.com/images/M/MV5BMDgxOTdjMzYtZGQxMS00ZTAzLWI4Y2UtMTQzN2VlYjYyZWRiXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_FMjpg_UX1000_.jpg",
                "Director: James Gunn",
                "Time: 149 minutes",
                "Category: Fantasy , Comedy , Action , Live action , Adventure , Superhero ",
                "Performer: Chris Pratt, Bradley Cooper, Pom Klementieff, Dave Bautista, Karen Gillan, ...   "
            ),
            Phim(
                "THE LITTLE MERMAID",
                "The youngest of King Triton’s daughters, and the most defiant, Ariel longs to find out more about the world beyond the sea, and while visiting the surface, falls for the dashing Prince Eric. With mermaids forbidden to interact with humans, Ariel makes a deal with the evil sea witch, Ursula, which gives her a chance to experience life on land, but ultimately places her life – and her father’s crown – in jeopardy.",
                "https://m.media-amazon.com/images/M/MV5BYTUxYjczMWUtYzlkZC00NTcwLWE3ODQtN2I2YTIxOTU0ZTljXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
                "Director: Rob Marshall",
                "Time: 135 minutes",
                "Category: Fantasy , Live action , Adventure , Music ",
                "Performer: Halle Bailey, Jonah Hauer King, Melissa McCarthy, Javier Bardem, Jude Akuwudike, ..."
            ),
            Phim(
                "THE BLACK DEMON",
                "Oilman Paul Sturges' idyllic family vacation turns into a nightmare when they encounter a ferocious megalodon shark that will stop at nothing to protect its territory. Stranded and under constant attack, Paul and his family must somehow find a way to get his family back to shore alive before it strikes again in this epic battle between humans and nature.",
                "https://m.media-amazon.com/images/M/MV5BODBhZTFiOGItNjk4ZS00Y2VkLWJkNGQtNTk5NzZlNThlM2I4XkEyXkFqcGdeQXVyMzQwMTY2Nzk@._V1_FMjpg_UX1000_.jpg",
                "Director: Adrian Grunberg",
                "Time: _ ",
                "Category: Act",
                "Performer: Josh Lucas, Fernanda Urrejola, Raul Mendez, Hector Jimenez, Julio Cesar Cedillo, Venus Ariel, ...   "
            ),
            Phim(
                "EVIL DEAD RISE",
                "A reunion between two estranged sisters gets cut short by the rise of flesh-possessing demons, thrusting them into a primal battle for survival as they face the most nightmarish version of family imaginable.",
                "https://cinematone.info/public/pic/230410195928_posters-evil_dead_rise_ver2_9j5jF.jpg",
                "Director: Lee Cronin ",
                "Time: 120 minutes",
                "Category: Thriller , Horror ",
                "Performer: Alyssa Sutherland, Lily Sullivan, Morgan Davies, Nell Fisher, Jayden Daniels,Gabrielle Echols, ... "
            ),
            Phim(
                "INSIDIOUS: THE RED DOOR",
                "To put their demons to rest once and for all, Josh Lambert and a college-aged Dalton Lambert must go deeper into The Further than ever before, facing their family's dark past and a host of new and more horrifying terrors that lurk behind the red door.",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZTzSVH9Bd-anwC5o6cfoJEUbLTmy49yLusl9e6MFJS8KTzRXMMnMGcv9857wl5e7g8Y8&usqp=CAU",
                "Director: Patrick Wilson",
                "Time: 107 minutes",
                "Category: Thriller , Horror ",
                "Performer: Patrick Wilson, Ty Simpkins, Rose Byrne, Andrew Astor, Hiam Abbass, ..."
            ),
            Phim(
                "MISSION: IMPOSSIBLE - DEAD RECKONING PART ONE",
                "Ethan Hunt and his IMF team embark on their most dangerous mission yet: To track down a terrifying new weapon that threatens all of humanity before it falls into the wrong hands. With control of the future and the world's fate at stake and dark forces from Ethan's past closing in, a deadly race around the globe begins. Confronted by a mysterious, all-powerful enemy, Ethan must consider that nothing can matter more than his mission – not even the lives of those he cares about most.",
                "https://www.movienewsletters.net/photos/347963R1.jpg",
                "Director: Christopher McQuarrie",
                "Time: 164 minutes",
                "Category: Thriller , Action ",
                "Performer: Tom Cruise, Vanessa Kirby, Rebecca Ferguson, Pom Klementieff, Hayley Atwell, Cary Elwes, Simon Pegg, ...  "
            ),
            Phim(
                "SKINAMARINK",
                "Two children wake up in the middle of the night to find their father is missing, and all the windows and doors in their home have vanished.",
                "https://cdn.shopify.com/s/files/1/0359/2201/8348/files/81xEb2XMB_L._SL1500_661e0d9b-1485-443b-8517-d22fd68dc93a.jpg?v=1686836881",
                "Director: Kyle Edward Ball",
                "Time: 100 minutes ",
                "Category: Movie Ghost - Horror",
                "Performer:Jaime Hill , Lucas Paul , Ross Paul , ..."
            ),
            Phim(
                "BED REST",
                "A pregnant woman on bed rest begins to wonder if her house is haunted or if it's all in her head.",
                "https://www.themoviedb.org/t/p/w500/tiZF8b9T9fMcwvsEEkJ5ik1wCnV.jpg",
                "Director: Lori Evans Taylor",
                "Time: 90minutes ",
                "Category: drama, Horror, Mystery",
                "Performer: Melissa Barrera, Guy Burnet, Edie Inksetter, Sebastian Billingsley-Rodriguez, Erik Athavale, Kristen Sawatzky,... "
            ),
            Phim(
                "SISU",
                "Deep in the wilderness of Lapland, Aatami Korpi is searching for gold but after he stumbles upon Nazi patrol, a breathtaking and gold-hungry chase through the destroyed and mined Lapland wilderness begins.",
                "https://pbs.twimg.com/media/Fv6jr4NWYAo05Yi.jpg",
                "Director: Jalmari Helander",
                "Time: 91 minutes ",
                "Category: War , Action",
                "Performer:Jorma Tommila, Axel Hennie, Jack Doolan, Mimosa Willamo, Good luck Tommi, Arttu Kapulainen, ..."
            ),
            Phim(
                "GUY RITCHIE'S THE CONVENANT",
                "During the war in Afghanistan, a local interpreter risks his own life to carry an injured sergeant across miles of grueling terrain.",
                "https://m.media-amazon.com/images/M/MV5BNmQzOWZhOTMtZTcxNC00MTdkLWEwYmUtOWVmOTFhNTdkNjRkXkEyXkFqcGdeQXVyODk2NDQ3MTA@._V1_FMjpg_UX1000_.jpg",
                "Director: Guy Ritchie",
                "Time: 123 minutes",
                "Category: Action , Drama , Crime ",
                "Performer: Jake Gyllenhaal, Alexander Ludwig, Antony Starr, Emily Beecham, Dar Salim, Jason Wong, Bobby Schofield, ..."
            ),
            Phim(
                "THE POPE'S EXORCIST",
                "Father Gabriele Amorth, Chief Exorcist of the Vatican, investigates a young boy's terrifying possession and ends up uncovering a centuries-old conspiracy the Vatican has desperately tried to keep hidden.",
                "https://m.media-amazon.com/images/M/MV5BYjA0MGU4MzYtYTYxMy00MjRhLTlmMDYtZTVhZDc1Y2QwNWY2XkEyXkFqcGdeQXVyMjY5ODI4NDk@._V1_FMjpg_UX1000_.jpg",
                "Director: Julius Avery",
                "Time: 103 minutes",
                "Category: Horror, Thriller ",
                "Performer: Russell Crowe, Daniel Zovatto, Alex Essoe, Franco Nero, Peter DeSouza-Feighoney, Laurel Marsden, Cornell John, ... "
            ),
            Phim(
                "DETECTIVE CONAN: BLACK IRON SUBMARINE ",
                "Set in Pacific Buoy - an Interpol maritime headquarters tasked with connecting security cameras around the world. At Sonoko's invitation, Conan's group went to Hachijojima to see whales. There, Conan receives information about a Europol employee being assassinated. Along with that, Haibara's life was threatened, was her identity revealed to Gin - the leading dangerous character of the black organization...  ",
                "https://anime.atsit.in/l/wp-content/uploads/2022/12/tham-tu-lung-danh-conan-tiet-lo-qua-khu-cua-haibara-ai-phat-hanh-phim-truyen-hinh-tong-hop-truoc-phim-the-black-iron-submarine.jpg",
                " Director: Yuzuru Tachikawa",
                "Time: 110  ",
                "Category: Cartoon ",
                "Performer: Yamazaki Wakana,  Hayashibara Megumi,  Takayama Minami"
            ),
            Phim(
                "TO CATCH A KILLER ",
                "Baltimore. New Year's Eve. A talented but troubled police officer is recruited by the FBI's chief investigator to help profile and track down a mass murderer. ",
                "https://yts.torrentbay.net/assets/images/movies/to_catch_a_killer_2023/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Damiasn Szifron ",
                "Time: 119 minutes ",
                "Category:  Action, Crime, Drama, Mystery, Thriller",
                "Performer: Ben Mendelsohn,Shailene Woodley, Ralph Ineson, Jovan Adepo , ...  "
            ),
            Phim(
                "RUBY GILLMAN, TEENAGE KRAKEN ",
                "Ruby Gillman, a sweet and awkward high school student, discovers she's a direct descendant of the warrior kraken queens. The kraken are sworn to protect the oceans of the world against the vain, power-hungry mermaids. Destined to inherit the throne from her commanding grandmother, Ruby must use her newfound powers to protect those she loves most. ",
                "https://yts.torrentbay.net/assets/images/movies/ruby_gillman_teenage_kraken_2023/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Kirk De Micco ",
                "Time: 91 minutes ",
                "Category:  Action, Adventure, Animation, Comedy, Family,Fantasy ",
                "Performer: Annie Murphy, Toni Collette, Jane Fonda, Sam Richardson, ...   "
            ),
            Phim(
                "MONKEY BUSINESS ",
                "Research chemist Barnaby Fulton works on a fountain of youth pill for a chemical company. One of the labs chimps gets loose in the laboratory and mixes chemicals, but then pours the mix into the water cooler. When trying one of his own samples, washed down with water from the cooler, Fulton begins to act just like a twenty-year-old and believes his potion is working. Soon his wife and boss are also behaving like children. ",
                "https://yts.torrentbay.net/assets/images/movies/monkey_business_1952/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Howard Hawks ",
                "Time: 96 minutes",
                "Category: Comedy, Sci-Fi ",
                "Performer: Marilyn Monroe, Cary Grant , Ginger Rogers, Dabbs Greer , ... "
            ),
            Phim(
                "TOTAL RECALL ",
                "A factory worker, Douglas Quaid, begins to suspect that he is a spy after visiting Rekall - a company that provides its clients with implanted fake memories of a life they would like to have led - goes wrong and he finds himself on the run. ",
                "https://m.media-amazon.com/images/M/MV5BN2ZiMDMzYWItNDllZC00ZmRmLWI1YzktM2M5M2ZmZDg1OGNlXkEyXkFqcGdeQXVyNDQ2MTMzODA@._V1_.jpg",
                "Director: Len Wiseman",
                "Time: 118 minutes",
                "Category: Action, adventure, sci-fi  ",
                "Performer: Colin Farrell, Kate Beckinsale, Jessica Biel, Bryan Cranston, Bokeem Woodbine, Bill Nighy, ...   "
            ),
            Phim(
                "LEGO DC COMICS SUPER HEROES: THE FLASH ",
                "Reverse-Flash manipulates the Speed Force to put the Flash into a time loop that forces him to relive the same day over and over again—with progressively disastrous results, including losing his powers and being fired by the Justice League. The Flash must find a way to restore time to its original path and finally apprehend his worst enemy before all is lost for the Flash…and the world! ",
                "https://yts.torrentbay.net/assets/images/movies/lego_dc_comics_super_heroes_the_flash_2018/medium-cover.jpg?v=91?v=0.1 ",
                "Director: Ethan Spaulding  ",
                "Time: 78 minutes",
                "Category: Action, Animation, Sci-Fi ",
                "Performer: Kate Micucci, Grey Griffin, Kevin Michael Richardson , Troy Baker, ...   "
            ),
            Phim(
                "COPACUL DORINTELOR: AMINTIRI DIN COPILARIE ",
                "Mara, a 12 year old who is ill, embarks on a fantastic adventure filled with hope. She discovers a magical tree located near a palliative care center that is a portal to her favorite story: the book of Ion Creanga, \"Childhood Memories\". ",
                "data:image/jpeg;base64,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",
                "Director: Andrei Hutuleac  ",
                "Time: 89 minutes",
                "Category: Family,Fantasy ",
                "Performer:   Matei Dima, ..."
            ),
            Phim(
                "BATMAN NINJA ",
                "Batman Ninja takes a journey across the ages as Gorilla Grodd's time displacement machine transports many of Batman's worst enemies to feudal Japan - along with the Dark Knight and a few of his allies. The villains take over the forms of the feudal lords that rule the divided land, with the Joker taking the lead among the warring factions. As his traditional high-tech weaponry is exhausted almost immediately, Batman must rely on his intellect and his allies - including Catwoman and the extended Bat-family - to restore order to the land, and return to present-day Gotham City. ",
                "https://upload.wikimedia.org/wikipedia/en/9/91/Batman-ninja---blu-ray-cover-1518549457339_1280w.jpg",
                "Director: Junpei Mizusaki ",
                "Time: 85 minutes",
                "Category: Action, Animation, Sci-Fi  ",
                "Performer: Kôichi Yamadera, Wataru Takagi, Ai Kakuma, Rie Kugimiya ,  Atsuko Tanaka, ...  "
            ),
            Phim(
                "MOON ",
                "Astronaut Sam Bell has a quintessentially personal encounter toward the end of his three-year stint on the Moon, where he, working alongside his computer, GERTY, sends back to Earth parcels of a resource that has helped diminish our planet's power problems. ",
                "https://m.media-amazon.com/images/M/MV5BMTgzODgyNTQwOV5BMl5BanBnXkFtZTcwNzc0NTc0Mg@@._V1_.jpg ",
                "Director: Duncan Jones ",
                "Time: 97 minutes",
                "Category:  drama, Mystery, sci-fi",
                "Performer: Sam Rockwell, Kevin Spacey,Dominique McElligott, Rosie Shaw,  Adrienne Shaw, ... "
            ),
            Phim(
                "ELEMENTAL ",
                "Follows Ember and Wade, in a city where fire-, water-, land- and air-residents live together. ",
                "https://baodongnai.com.vn/dataimages/202306/original/images2532325_18_1.jpg",
                "Director: Peter Sohn ",
                "Time: 1001 minutes",
                "Category: Animation, adventrue, comedy  ",
                "Performer: Leah Lewis, Mamoudou Athie, Ronnie Del Carmen,  Shila Ommi, ...   "
            ),
            Phim(
                "COCO ",
                "Aspiring musician Miguel, confronted with his family's ancestral ban on music, enters the Land of the Dead to find his great-great-grandfather, a legendary singer. ",
                "https://culturela.org/wp-content/uploads/2018/08/Coco.jpg",
                "Director: Lee Unkrich, Adrian Molina ",
                "Time: 105 minutes",
                "Category:  Animation, adventrue, drama ",
                "Performer: Anthony Gonzalez, Gael García Bernal, Benjamin Bratt, Alanna Ubach, Renee Victor, ...  "
            ),
        )
    }
}

