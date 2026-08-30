package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object TraumatologyQuestions {
    val all: List<ForensicQuestion> = listOf(
        ForensicQuestion(
            id = "trauma_01",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A linear abrasion caused by sliding contact with a rough object where epidermis is piled up at the distal end is known as:",
            options = listOf(
                "Imprint / Pressure abrasion",
                "Graze / Brush abrasion",
                "Lacerated fissure",
                "Punctate contusion"
            ),
            correctOptionIndex = 1,
            explanation = "Graze (brush or sliding) abrasions occur when an object moves tangentially across the skin surface. The direction of movement can be determined by the epithelial tags (shavings of epidermis) which are heaped up at the terminus/distal end of the stroke.",
            clinicalPearl = "Direction of force: Epithelial tags are piled up at the end point of the abrasion, indicating the direction of movement.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_02",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Which feature distinguishes a laceration (caused by blunt trauma) from an incised wound (caused by a sharp weapon)?",
            options = listOf(
                "Tissue bridging across the floor and irregular margins in lacerations",
                "Everted, smooth, non-abraded edges in lacerations",
                "Length of wound always exceeds its depth in lacerations",
                "Absence of hair bulb crushing in lacerations"
            ),
            correctOptionIndex = 0,
            explanation = "Lacerations are produced by blunt force causing tearing/splitting. Key features include tissue bridges (nerves, elastic fibers, intact blood vessels crossing the base), abraded/contused margins, and crushed hair bulbs. Incised wounds cleanly sever all structures with no tissue bridging.",
            clinicalPearl = "Tissue bridging is the definitive cardinal sign distinguishing blunt lacerations from sharp incised wounds.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "trauma_03",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Multiple superficial, parallel, tentative incised cuts located adjacent to a fatal deep incised or stab wound are termed:",
            options = listOf(
                "Fabricated injuries",
                "Hesitation / Tentative cuts",
                "Defense wounds of Palmer",
                "Chop wounds"
            ),
            correctOptionIndex = 1,
            explanation = "Hesitation (tentative) marks are shallow, preliminary test cuts made by a victim before inflicting the final fatal deep wound in suicidal slashing or stabbing. They are strongly suggestive of suicide.",
            clinicalPearl = "Hesitation cuts + accessible site + absence of struggle marks = hallmarks of suicidal cut-throat / wrist incisions.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_04",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A patterned contusion displaying two parallel erythematous lines with a central pale uninvolved strip (tramline bruise) is characteristically caused by:",
            options = listOf(
                "A circular hammer blow",
                "A cylindrical rod or cane (lathi)",
                "A shoe heel stamp",
                "A serrated knife blade"
            ),
            correctOptionIndex = 1,
            explanation = "A cylindrical impact weapon like a cane, rod, or lathi causes compression of blood vessels directly beneath the strike, squeezing blood laterally into the adjacent uncompressed skin vessels, which rupture and create two parallel lines of bruising ('tramline' or 'railway track' contusion).",
            clinicalPearl = "Tramline bruising: The weapon strikes the central pale zone; lateral shearing forces burst vessels flanking the weapon's width.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_05",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Defense wounds on a homicide victim are most commonly located on:",
            options = listOf(
                "The anterior abdominal wall and sternum",
                "The ulnar border of the forearm and palmar surface of the hands",
                "The medial aspect of the thigh and popliteal fossa",
                "The back of the neck and scapular region"
            ),
            correctOptionIndex = 1,
            explanation = "Active defense wounds occur when the victim attempts to grasp the weapon (cuts on palmar aspects and flexor creases of fingers), while passive defense wounds occur when the victim raises forearms to shield their head/face (contusions, lacerations, or cuts on the ulnar border of the forearm).",
            clinicalPearl = "Defense wounds definitively establish that the victim was conscious, alive, and actively resisting assault (homicidal manner of death).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_06",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "The color changes in a contusion (bruise) over time reflect enzymatic degradation of hemoglobin. What is the correct chronological sequence?",
            options = listOf(
                "Red -> Blue/Black -> Brown -> Green -> Yellow -> Normal",
                "Yellow -> Green -> Red -> Blue -> Normal",
                "Blue -> Yellow -> Green -> Red -> Normal",
                "Green -> Brown -> Blue -> Red -> Normal"
            ),
            correctOptionIndex = 0,
            explanation = "Bruise color chronology: Fresh (Red/Dark Red - oxyhemoglobin), 1-3 days (Blue/Black/Purple - deoxygenated Hb), 4-5 days (Brown - hemosiderin), 5-7 days (Green - biliverdin), 7-10 days (Yellow - bilirubin), 2 weeks (Normal skin restored).",
            clinicalPearl = "Mnemonic: 'Red Boy Buys Green Bananas' — Red (fresh) -> Blue/Black -> Brown -> Green -> Yellow -> Normal.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_07",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A heavy sharp cutting weapon with significant mass (such as an axe, machete, or meat cleaver) typically produces which class of mechanical injury?",
            options = listOf(
                "Punctate puncture wound",
                "Chop wound (incised-laceration with bony notching)",
                "Pure friction graze abrasion",
                "Decollement avulsion"
            ),
            correctOptionIndex = 1,
            explanation = "Chop wounds are inflicted by heavy weapons with a cutting edge (axes, meat cleavers, swords, boat propellers). They combine sharp incised features (clean-cut skin edges) with massive blunt trauma, frequently shattering or grooving underlying bones.",
            clinicalPearl = "Chop wounds feature linear incisions with underlying bone cleaving, crushing, and marginal contusions.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_08",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "In stab wounds, the shape and dimensions of the skin opening in relation to the weapon's blade geometry are heavily influenced by:",
            options = listOf(
                "Langer's cleavage lines of collagen in the dermis",
                "The patient's blood pressure at time of injury",
                "Subcutaneous capillary density",
                "Epidermal melanin content"
            ),
            correctOptionIndex = 0,
            explanation = "Langer's lines represent the natural orientation of collagen fibers in the dermis. A stab wound parallel to Langer's lines appears narrow and slit-like; a stab perpendicular to Langer's lines is pulled widely agape and elliptical, appearing broader than the weapon.",
            clinicalPearl = "Langer's lines: Parallel stab = slit-like; Transverse stab = gaping elliptical defect.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "trauma_09",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A pedestrian struck by a vehicle primary bumper typically exhibits a wedge-shaped fracture of the tibia/fibula pointing in the direction of vehicle travel. This is known as:",
            options = listOf(
                "Messerer's fracture",
                "Colles' fracture",
                "Pott's fracture",
                "Jefferson's fracture"
            ),
            correctOptionIndex = 0,
            explanation = "Messerer's fracture is a triangular wedge-shaped fracture of long bones (typically tibia) caused by direct bumper impact. The base of the wedge corresponds to the side of impact, and the apex points in the direction the vehicle was traveling.",
            clinicalPearl = "Messerer's fracture: Apex points in direction of vehicular movement; Base indicates the point of bumper impact.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_10",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Which type of subdural hematoma is typically caused by tearing of bridging cortical veins during rotational or acceleration-deceleration head trauma?",
            options = listOf(
                "Epidural (extradural) hematoma from middle meningeal artery rupture",
                "Acute subdural hematoma (crescentic shape on CT)",
                "Subarachnoid hemorrhage from Berry aneurysm",
                "Intraventricular choroid plexus hematoma"
            ),
            correctOptionIndex = 1,
            explanation = "Subdural hematomas result from tearing of parasagittal bridging cortical veins crossing the subdural space to the superior sagittal sinus due to angular/rotational acceleration. They form a crescent-shaped hematoma that can cross cranial suture lines.",
            clinicalPearl = "Epidural = Middle meningeal artery, biconvex (lens), lucid interval. Subdural = Bridging veins, crescent-shaped, crosses suture lines.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_11",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Coup and contrecoup brain contusions occur when the moving head strikes a stationary surface. Contrecoup contusions are most pronounced at which anatomical site?",
            options = listOf(
                "Occipital poles when forehead is struck",
                "Frontal poles and anterior temporal lobes when occiput strikes the ground",
                "Parietal vertex when jaw is struck",
                "Cerebellar hemispheres during vertical vertex falls"
            ),
            correctOptionIndex = 1,
            explanation = "When an unrestrained moving head strikes a flat surface rear-first (occipital impact), the contrecoup contusions are maximal at the opposite frontal and anterior temporal poles due to brain sliding and cavitation over the irregular, sharp anterior cranial fossa floor.",
            clinicalPearl = "Occipital impact creates severe contrecoup contusions at frontal/temporal lobes. Frontal impact rarely causes contrecoup occipital lesions.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_12",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "In vehicular pedestrian trauma, 'run-over injuries' with extensive separation of the subcutaneous fat and skin from underlying muscular fascia is called:",
            options = listOf(
                "Décollement (Flaying / Avulsion injury)",
                "Parchmentization",
                "Tache noire",
                "Extravasation of Spilsbury"
            ),
            correctOptionIndex = 0,
            explanation = "Décollement is a shearing avulsion injury produced when a revolving vehicle tire rolls over a limb or body surface, violently separating skin and subcutaneous tissue from the underlying deep fascia and creating large blood/lymph-filled cavities.",
            clinicalPearl = "Décollement injury = Rotational shearing of skin from deep muscular fascia, typical of heavy tire roll-over.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_13",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A classic skull fracture radiating outwards in straight lines from a central point of impact with a blunt weapon is termed a:",
            options = listOf(
                "Depressed pond fracture",
                "Linear / Fissured stellate fracture",
                "Gutter fracture",
                "Ring fracture of the foramen magnum"
            ),
            correctOptionIndex = 1,
            explanation = "Linear (fissured) fractures follow the lines of least resistance in cranial architecture. When striking force is substantial, radial fractures propagate outward from the impact zone, sometimes intersected by concentric spider-web fractures.",
            clinicalPearl = "Puppe's rule: A subsequent fracture line terminates at an earlier pre-existing fracture line, establishing sequence of blows.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_14",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Puppe's rule in forensic traumatology is used to determine:",
            options = listOf(
                "The chronological sequence of multiple intersecting skull fractures or skin lacerations",
                "The exact weight and material composition of an unknown blunt weapon",
                "The time elapsed since infliction of a contusion based on bilirubin crystals",
                "The velocity of an impacting vehicle"
            ),
            correctOptionIndex = 0,
            explanation = "Puppe's rule states that when two or more fracture lines intersect, the fracture line produced by the subsequent blow will stop at the fracture line created by the preceding blow (as energy cannot cross an already discontinuous crack).",
            clinicalPearl = "Puppe's Rule: Later fractures stop at earlier fractures — essential for determining the order of multiple head strikes.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "trauma_15",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "An incised defense wound on the palmar surface of the fingers with cuts in the flexor creases indicates that the victim:",
            options = listOf(
                "Was grasping or trying to wrest the sharp blade away from the assailant (Active defense)",
                "Was shielding their face passively with forearms (Passive defense)",
                "Inflicted self-harm hesitation cuts",
                "Suffered accidental glass splinter lacerations"
            ),
            correctOptionIndex = 0,
            explanation = "Active defense wounds occur on the palmar aspect and flexor surfaces of fingers as the victim instinctively grasps the sharp cutting edge of the assailant's weapon.",
            clinicalPearl = "Palmar grasp cuts = Active defense. Ulnar forearm bruises/cuts = Passive defense.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_16",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A 'gutter fracture' of the skull is characteristically caused by:",
            options = listOf(
                "A tangential or glancing gunshot or sharp instrument grazing the skull table",
                "A heavy vehicular tire rolling directly over the vertex",
                "Secondary fall from a significant height landing on feet",
                "Blast overpressure shockwaves in closed spaces"
            ),
            correctOptionIndex = 0,
            explanation = "A gutter fracture occurs when a bullet or heavy blade strikes the skull tangentially, grooving a trough or trench through the outer and inner cranial tables without full perpendicular penetration.",
            clinicalPearl = "Gutter fracture = Tangential glancing impact grooving a furrow into the calvarium.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_17",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Which type of mechanical injury is defined as a deep penetrating wound where the depth of the track within the body exceeds the length of the external skin wound?",
            options = listOf(
                "Incised wound (slash)",
                "Stab / Puncture wound",
                "Chop wound",
                "Brush graze abrasion"
            ),
            correctOptionIndex = 1,
            explanation = "A stab (punctured) wound is produced by a pointed instrument where the depth of penetration into tissues/organs is greater than the surface skin wound length.",
            clinicalPearl = "Stab wound = Depth > Length. Incised wound = Length > Depth.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "trauma_18",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A ring fracture of the base of the skull encircling the foramen magnum is most characteristically caused by:",
            options = listOf(
                "A direct blow to the lateral zygoma",
                "Axial loading from landing on the feet/buttocks during a vertical fall, driving the spine upward into the skull base",
                "Tangential bullet grazing the frontal bone",
                "Low-voltage electrical electrocution"
            ),
            correctOptionIndex = 1,
            explanation = "Ring fractures of the skull base encircle the foramen magnum. They are caused by transmission of vertical axial force: either falling from height onto the feet/buttocks (vertebral column driven up into the cranium) or vertex impacts driving skull down onto spine.",
            clinicalPearl = "Ring fracture = Foramen magnum ring shearing caused by axial spinal loading in vertical falls.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_19",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A victim presents with multiple superficial, parallel, criss-cross incised cuts of uniform depth over accessible areas (such as the non-dominant forearm or front of thigh), with no tearing of clothes. These are likely:",
            options = listOf(
                "Homicidal mutilation cuts",
                "Fabricated / Factitious (self-inflicted) wounds",
                "Active defense injuries",
                "Chop wounds from a sickle"
            ),
            correctOptionIndex = 1,
            explanation = "Fabricated (factitious) injuries are self-inflicted wounds created to bring a false charge against an enemy or simulate an assault. Key features: accessible sites, uniform shallow depth, sparing of vital structures, absence of clothing damage, and often arranged in neat parallel arrays.",
            clinicalPearl = "Fabricated wounds: Accessible areas, uniform superficial depth, clothes spared, non-fatal, parallel orientation.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "trauma_20",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "In mechanical trauma, 'Lucid Interval' is most famously associated with which traumatic intracranial entity?",
            options = listOf(
                "Acute subdural hygroma",
                "Extradural (Epidural) hematoma from middle meningeal artery rupture",
                "Chronic diffuse axonal shear injury",
                "Intra-cerebellar arteriovenous malformation"
            ),
            correctOptionIndex = 1,
            explanation = "A Lucid Interval is a period of apparent neurological normality/consciousness between the initial concussive loss of consciousness and the subsequent secondary coma resulting from expanding arterial hemorrhage (classic in Middle Meningeal Artery epidural hematoma).",
            clinicalPearl = "Lucid Interval = Head trauma -> brief blackout -> normal mental status for hours -> rapid deterioration into coma/herniation.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_21",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Which type of fracture is typically seen in the skull of infants and young children, where bone indents without a clear break line, resembling an indented ping-pong ball?",
            options = listOf(
                "Pond / Indented (ping-pong) fracture",
                "Gutter fracture",
                "Suture diastasis",
                "Comminuted spider fracture"
            ),
            correctOptionIndex = 0,
            explanation = "In infants and young children, the cranial bones are soft, flexible, and have little mineralized diploë. Blunt impacts cause an elastic in-bending indentation without complete cortical discontinuity, known as a Pond or 'Ping-Pong ball' fracture.",
            clinicalPearl = "Ping-pong / Pond fracture = Flexible infant skull indentation without complete fracture lines.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_22",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Wandering (ectopic) bruise is a phenomenon where a contusion appears at a site distant from the original impact due to:",
            options = listOf(
                "Blood tracking along tissue planes and muscular fascial sheaths under the influence of gravity",
                "Microvascular embolization of red blood cells to systemic organs",
                "Secondary bacterial infection spreading subcutaneously",
                "Allergic histamine release triggered by blunt trauma"
            ),
            correctOptionIndex = 0,
            explanation = "Ectopic (wandering) contusions develop when extravasated blood tracks along deep tissue planes or neurovascular fascial bundles under gravity (e.g., black eye / raccoon eye appearing from a forehead fracture; or ankle bruising following calf trauma).",
            clinicalPearl = "Ectopic bruise = Gravity-dependent tracking of extravasated blood away from the impact site.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_23",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Battle's sign (mastoid ecchymosis behind the ear) is a clinical/forensic indicator of a fracture involving which bony structure?",
            options = listOf(
                "Anterior cranial fossa cribriform plate",
                "Petrous portion of the temporal bone (Middle cranial fossa base)",
                "Cervical vertebra odontoid process",
                "Mandibular condyle neck"
            ),
            correctOptionIndex = 1,
            explanation = "Battle's sign (ecchymosis over the mastoid process behind the ear) is caused by tracking of blood along the posterior auricular artery from a basilar skull fracture involving the petrous temporal bone (middle cranial fossa).",
            clinicalPearl = "Battle's sign = Mastoid ecchymosis = Middle cranial fossa (petrous temporal) fracture.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "trauma_24",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "The legal definition of 'Grievous Hurt' under Section 320 of the Indian Penal Code (IPC) / equivalent legal codes includes all of the following EXCEPT:",
            options = listOf(
                "Emasculation and permanent privation of sight of either eye",
                "Permanent privation of hearing of either ear and destruction/permanent impairing of any member or joint",
                "A simple superficial skin abrasion healing completely in 3 days",
                "Any hurt which causes the sufferer to be in severe bodily pain or unable to follow ordinary pursuits for 20 days"
            ),
            correctOptionIndex = 2,
            explanation = "Under IPC Section 320, Grievous Hurt comprises 8 specific clauses: 1) Emasculation, 2) Permanent privation of sight, 3) Permanent privation of hearing, 4) Privation of any member/joint, 5) Destruction/impairing of powers of member/joint, 6) Permanent disfiguration of head/face, 7) Fracture/dislocation of bone/tooth, 8) Hurt endangering life or causing inability to pursue ordinary pursuits for 20 days. A superficial graze is simple hurt.",
            clinicalPearl = "Grievous hurt criteria: 8 designated categories including fracture/dislocation and 20-day incapacitation rule.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "trauma_25",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "A laceration produced in skin overlying a subcutaneous bony ridge (such as the eyebrow, shin, or vertex of scalp) that mimics an incised wound due to sharp splitting is called an:",
            options = listOf(
                "Incised-like (split) laceration",
                "Avulsion tear",
                "Hesitation slash",
                "Chop laceration"
            ),
            correctOptionIndex = 0,
            explanation = "When blunt force compresses skin against an underlying sharp bony prominence (supraorbital ridge, tibia crest, calvarium), the skin splits linearly, mimicking an incised wound ('incised-like' or 'split' laceration). Microscopic exam confirms crushed edges and tissue bridging in the depth.",
            clinicalPearl = "Split lacerations over bony ridges mimic incised wounds; examine wound depth under magnification for tissue bridges and crushed hair roots.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "trauma_26",
            category = ForensicCategory.TRAUMATOLOGY,
            question = "Diffuse Axonal Injury (DAI) is histopathologically confirmed in autopsy brain specimens by the presence of:",
            options = listOf(
                "Amyloid plaques and neurofibrillary tangles",
                "Beta-amyloid precursor protein (beta-APP) positivity and axonal retraction bulbs",
                "Glial scar calcification in the optic chiasm",
                "Perivascular lymphocytic cuffing in Virchow-Robin spaces"
            ),
            correctOptionIndex = 1,
            explanation = "Diffuse Axonal Injury results from rotational angular acceleration-deceleration shearing white matter tracts. Histologically, interrupted axoplasmic flow causes focal axonal swelling and 'retraction bulbs' (torpedoes) highlighted by immunohistochemistry for beta-APP within 2 to 3 hours.",
            clinicalPearl = "DAI histology hallmark: Axonal retraction bulbs & beta-APP immunostaining in corpus callosum and dorsolateral brainstem.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        )
    )
}
