package com.example.data.datasource

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object ForensicQuestionBank {

    val questions: List<ForensicQuestion> = listOf(
        // ==================== THANATOLOGY & PMI ====================
        ForensicQuestion(
            id = "than_01",
            category = ForensicCategory.THANATOLOGY,
            question = "According to Nysten's law, in which group of muscles does rigor mortis first typically become noticeable?",
            options = listOf(
                "Lower limbs (quadriceps and gastrocnemius)",
                "Small muscles of the face, eyelids, and lower jaw",
                "Abdominal wall muscles",
                "Upper limbs and fingers"
            ),
            correctOptionIndex = 1,
            explanation = "Nysten's law describes the cranial-to-caudal progression of rigor mortis. Rigor appears first in the involuntary muscles of the heart, followed by the eyelids, lower jaw, neck, trunk, upper limbs, and finally lower limbs. Disappearance follows the same order.",
            clinicalPearl = "Mnemonic: 'Cranial to Caudal' — Rigor first shows in the eyelids (3-4 hrs), spreads downwards, and resolves in the same sequence.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence & Toxicology"
        ),
        ForensicQuestion(
            id = "than_02",
            category = ForensicCategory.THANATOLOGY,
            question = "A body retrieved from an abandoned house displays cherry-red postmortem hypostasis (livor mortis). What is the most probable cause of death?",
            options = listOf(
                "Potassium chlorate poisoning",
                "Carbon monoxide (CO) inhalation",
                "Sodium nitroprusside overdose",
                "Nitrite poisoning"
            ),
            correctOptionIndex = 1,
            explanation = "Carbon monoxide binds to hemoglobin forming carboxyhemoglobin (HbCO), imparting a classic bright cherry-red color to the blood, skin, viscera, and postmortem lividity. Cyanide produces a brick-red or pinkish hue, while nitrites/nitrates cause chocolate-brown discoloration (methemoglobinemia).",
            clinicalPearl = "Hypostasis Color Keys: Cherry red = Carbon monoxide; Brick red = Cyanide; Chocolate brown = Methemoglobin / Nitrites; Bright pink = Hypothermia / Cold.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_03",
            category = ForensicCategory.THANATOLOGY,
            question = "Which of the following conditions is characterized by the conversion of body fat into a yellowish-white, greasy, waxy substance with a rancid cheese-like odor?",
            options = listOf(
                "Mummification",
                "Adipocere (Saponification)",
                "Putrefaction",
                "Maceration"
            ),
            correctOptionIndex = 1,
            explanation = "Adipocere (saponification) is the postmortem biochemical transformation of body fat into fatty acids and soaps (principally palmitic and stearic acids). It requires a warm, moist, anaerobic environment (e.g., submerged in water or damp graves) and Clostridium perfringens lecithinase activity.",
            clinicalPearl = "Adipocere requires moisture + warmth + bacterial lecithinase; it preserves facial features and wound contours for identification and medicolegal reconstruction.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "than_04",
            category = ForensicCategory.THANATOLOGY,
            question = "The earliest external sign of putrefaction in a body lying in normal ambient conditions is:",
            options = listOf(
                "Postmortem bleb formation on hands",
                "Greenish discoloration of the right iliac fossa",
                "Marbling of superficial veins",
                "Liquefaction of brain tissue"
            ),
            correctOptionIndex = 1,
            explanation = "The first external sign of putrefaction is greenish discoloration of the right iliac fossa (over the caecum). It typically appears around 12 to 18 hours in summer and 24 to 48 hours in winter, due to hydrogen sulfide gas reacting with hemoglobin to form sulfhemoglobin.",
            clinicalPearl = "Right iliac fossa greening occurs first because the caecum is superficial, fluid-rich, and heavily colonized by gut microflora.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_05",
            category = ForensicCategory.THANATOLOGY,
            question = "Cadaveric spasm differs from rigor mortis in that cadaveric spasm:",
            options = listOf(
                "Affects all voluntary muscles simultaneously and gradually",
                "Develops immediately at the moment of death without a preceding stage of primary flaccidity",
                "Can easily be broken by moderate manual force without returning",
                "Is mediated by bacterial enzymatic degradation of actin-myosin crossbridges"
            ),
            correctOptionIndex = 1,
            explanation = "Cadaveric spasm (instantaneous rigor) is a rare state of immediate contracture that preserves the exact physical attitude at the moment of death, with no intervening period of primary muscular flaccidity. It usually occurs in deaths involving extreme physical exertion, emotional excitement, or severe nervous exhaustion.",
            clinicalPearl = "Cadaveric spasm cannot be simulated postmortem; clutching a weapon or grass/weeds in water provides strong antemortem evidence (e.g., suicide or antemortem drowning).",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_06",
            category = ForensicCategory.THANATOLOGY,
            question = "Which biochemical marker in the vitreous humor is considered the most reliable for estimating the postmortem interval (PMI)?",
            options = listOf(
                "Sodium concentration",
                "Potassium [K+] concentration",
                "Glucose concentration",
                "Calcium concentration"
            ),
            correctOptionIndex = 1,
            explanation = "Vitreous potassium [K+] concentration rises in a steady, linear fashion after death due to autolysis of retinal cells releasing intracellular potassium into the vitreous body. Sturner's and Madea's formulas utilize vitreous [K+] for PMI estimation up to 100+ hours.",
            clinicalPearl = "Vitreous humor is protected from postmortem contamination and temperature swings; Potassium increases ~0.14–0.19 mEq/L per hour after death.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),

        // ==================== TRAUMATOLOGY & WOUNDS ====================
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

        // ==================== FORENSIC BALLISTICS ====================
        ForensicQuestion(
            id = "ball_01",
            category = ForensicCategory.BALLISTICS,
            question = "In a firearm injury, 'tattooing' (stippling) around the entry wound is produced by:",
            options = listOf(
                "Thermal burns from superheated barrel metal",
                "Unburnt and partially burnt gunpowder grains embedded in the dermis",
                "Deposition of superficial soot that washes off completely",
                "Mechanical friction between the lead bullet core and epidermis"
            ),
            correctOptionIndex = 1,
            explanation = "Tattooing (stippling) consists of punctate reddish-brown abrasions caused by unburnt and partially burnt gunpowder particles that penetrate the epidermis and lodge in the upper dermis. It cannot be washed off with water (unlike superficial soot / smudging).",
            clinicalPearl = "Soot / Smudging = superficial & wipes away. Gunpowder Tattooing = embedded in dermis & permanent (indicates close-range fire, ~1 to 3 feet).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence & Ballistics"
        ),
        ForensicQuestion(
            id = "ball_02",
            category = ForensicCategory.BALLISTICS,
            question = "A contact gunshot wound over the skull characteristically produces a stellate or star-shaped laceration due to:",
            options = listOf(
                "Bullet tumbling and fragmentation in the subarachnoid space",
                "Expansion and reflection of blast gases trapped between the scalp and cranial bone",
                "Muzzle flash scorching the epidermal collagen fibers",
                "Cavitation caused by supersonic shockwaves in the brain tissue"
            ),
            correctOptionIndex = 1,
            explanation = "In hard-contact firearm wounds over bony regions (like the cranium), discharge gases enter the potential space between the tightly adherent scalp and skull. As gas volume expands against rigid bone, it reflects back upwards and tears the scalp in a stellate (cruciform/star-shaped) pattern.",
            clinicalPearl = "Stellate scalp tear + soot/cherry-red carboxyhemoglobin inside bone margins = definitive sign of hard contact firearm entry over bone.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_03",
            category = ForensicCategory.BALLISTICS,
            question = "The 'beveling' (cone-shaped expansion) of a bullet defect in the flat bones of the skull is oriented:",
            options = listOf(
                "Towards the point of origin of the firearm (facing the shooter)",
                "In the direction of bullet trajectory (internal beveling at entrance, external beveling at exit)",
                "Equally in both directions regardless of entrance or exit",
                "Exclusively on the outer table for both entrance and exit defects"
            ),
            correctOptionIndex = 1,
            explanation = "When a bullet punches through flat cranial bone, it creates a cone-shaped crater expanding in the direction of bullet flight. Therefore, the entrance wound shows internal beveling (larger defect on the inner table), and the exit wound shows external beveling (larger crater on the outer table).",
            clinicalPearl = "Bone Beveling Rule: The wider base of the cone points towards the direction the bullet is travelling (Entrance = Inward bevel; Exit = Outward bevel).",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ball_04",
            category = ForensicCategory.BALLISTICS,
            question = "What is the term for the circular dark ring immediately surrounding the bullet entry perforation caused by grease, lubricant, and metal wiping off the projectile?",
            options = listOf(
                "Abrasion collar (contusion ring)",
                "Dirt collar (grease collar / wipe ring)",
                "Stippling zone",
                "Flame scorch halo"
            ),
            correctOptionIndex = 1,
            explanation = "The dirt collar (wipe ring / bullet wipe) is a narrow zone of grease, lead dust, and soot deposited onto the skin edges as the bullet pushes through. The abrasion collar is the concentric rim of denuded epidermis directly beneath it caused by indentation and stretching of skin.",
            clinicalPearl = "Wipe ring + Abrasion ring = conclusive confirmation of entrance wound (even at distant range where tattooing and soot are absent).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),

        // ==================== ASPHYXIAL DEATHS ====================
        ForensicQuestion(
            id = "asph_01",
            category = ForensicCategory.ASPHYXIA,
            question = "Which feature is most characteristic of antemortem hanging as opposed to postmortem suspension?",
            options = listOf(
                "Horizontal, completely circular, low-placed ligature mark below thyroid cartilage",
                "Oblique, non-continuous ligature groove highest at the knot and above the thyroid cartilage",
                "Absence of salivation or congestion above ligature level",
                "Fracture of both clavicles and cricoid ring"
            ),
            correctOptionIndex = 1,
            explanation = "In typical hanging, the ligature mark is oblique, non-continuous (interrupted at the suspension knot point), and located high in the neck above the thyroid cartilage. In ligature strangulation, the mark is usually horizontal, completely circular, continuous, and placed low down at or below the thyroid cartilage.",
            clinicalPearl = "Hanging vs Strangulation: Hanging = Oblique, high-placed, interrupted at knot. Ligature strangulation = Horizontal, low-placed, continuous.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_02",
            category = ForensicCategory.ASPHYXIA,
            question = "In drowning deaths, 'Paltauf spots' found during internal postmortem examination refer to:",
            options = listOf(
                "Petechial hemorrhages in the epicardium and thymus",
                "Subpleural hemorrhages caused by rupture of over-distended alveolar walls",
                "Necrotic zones in the temporal bone petrous ridge",
                "Erosions along the greater curvature of the stomach"
            ),
            correctOptionIndex = 1,
            explanation = "Paltauf spots are light-red or bluish-red subpleural hemorrhages (1–2 cm in diameter) located beneath the visceral pleura, especially around lung margins. They arise due to extreme intra-alveolar pressure and tearing of inter-alveolar septa in emphysema aquosum.",
            clinicalPearl = "Paltauf spots = subpleural hemorrhages in drowning (emphysema aquosum), seen in 50–60% of wet drowning cases.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_03",
            category = ForensicCategory.ASPHYXIA,
            question = "The detection of diatoms in which internal organ is considered positive confirmation of antemortem drowning in natural open water?",
            options = listOf(
                "Stomach contents and esophagus",
                "Femoral bone marrow or closed parenchymal organs (kidney, brain)",
                "Larynx and trachea lumen",
                "Superficial nasal mucosa"
            ),
            correctOptionIndex = 1,
            explanation = "Diatoms are microscopic, unicellular algae with silica cell walls. In antemortem drowning, diatoms penetrate damaged alveolar-capillary membranes and enter the pulmonary veins, circulating via intact systemic circulation to distant closed organs (femoral bone marrow, kidney, brain, liver). Postmortem immersion cannot cause systemic penetration into deep bone marrow.",
            clinicalPearl = "Diatom Test: Diatoms in femoral bone marrow / brain / kidney prove circulation was functional at time of immersion (antemortem drowning).",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_04",
            category = ForensicCategory.ASPHYXIA,
            question = "The classic triad of Tardieu spots (petechial hemorrhages) in rapid asphyxial deaths is most prominently found in:",
            options = listOf(
                "Subconjunctivae, epicardium, and visceral pleura",
                "Renal cortex and adrenal medulla",
                "Splenic capsule and gastric submucosa",
                "Myometrium and skeletal muscle fascia"
            ),
            correctOptionIndex = 0,
            explanation = "Tardieu spots are pinpoint subserosal and subconjunctival petechial hemorrhages resulting from acute venous hypertension and hypoxemic endothelial disruption. They are classic in conjunctiva, visceral pleura, and epicardium.",
            clinicalPearl = "Petechiae reflect acute mechanical venous stasis and pressure spike, not strictly hypoxia per se.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),

        // ==================== FORENSIC TOXICOLOGY ====================
        ForensicQuestion(
            id = "tox_01",
            category = ForensicCategory.TOXICOLOGY,
            question = "A farmer presents to the emergency room with pinpoint pupils, excessive salivation, bronchospasm, muscle fasciculations, and diarrhea. The specific antidote regimen is:",
            options = listOf(
                "Naloxone and Flumazenil",
                "Atropine sulfate and Pralidoxime (2-PAM)",
                "Dimercaprol (BAL) and Penicillamine",
                "Desferrioxamine and Deferasirox"
            ),
            correctOptionIndex = 1,
            explanation = "The presentation represents acute Organophosphate (OP) poisoning (SLUDGEM syndrome: Salivation, Lacrimation, Urination, Defecation, GI cramps, Emesis, Miosis) due to acetylcholinesterase inhibition. Treatment is Atropine (competitive muscarinic antagonist) and Oximes like Pralidoxime (cholinesterase reactivator).",
            clinicalPearl = "Atropine reverses muscarinic symptoms; Pralidoxime (PAM) reactivates cholinesterase before irreversible 'aging' of enzyme occurs.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence & Toxicology"
        ),
        ForensicQuestion(
            id = "tox_02",
            category = ForensicCategory.TOXICOLOGY,
            question = "Raindrop pigmentation of the skin, palmoplantar hyperkeratosis, and Mees' lines in nails are classic pathognomonic signs of chronic poisoning with:",
            options = listOf(
                "Lead (Plumbism)",
                "Arsenic (Arsenicosis)",
                "Mercury (Hydrargyrism)",
                "Phosphorus"
            ),
            correctOptionIndex = 1,
            explanation = "Chronic arsenic poisoning causes 'raindrop' mottled hyperpigmentation on the trunk, hyperkeratosis of palms and soles, Mee's lines (transverse white bands in fingernails), garlic breath, and peripheral polyneuropathy.",
            clinicalPearl = "Arsenic Triad: Raindrop skin pigmentation + Palmoplantar hyperkeratosis + Mees' lines in fingernails.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_03",
            category = ForensicCategory.TOXICOLOGY,
            question = "Which poisonous plant contains hyoscine, hyoscyamine, and atropine, producing delirium, dry mouth, hot dry red skin, and dilated non-reactive pupils ('Dry as a bone, Red as a beet, Mad as a hatter')?",
            options = listOf(
                "Strychnos nux-vomica",
                "Datura fastuosa (Dhatura)",
                "Calotropis gigantea",
                "Nerium oleander"
            ),
            correctOptionIndex = 1,
            explanation = "Datura (Dhatura) contains anticholinergic belladonna alkaloids (hyoscine, hyoscyamine, atropine). It causes classic anticholinergic toxidrome: Dry hot skin, dilated fixed pupils, dry mouth (dysphagia/dysphonia), delirium, and hyperpyrexia. Commonly used as a 'stupefying poison' in robbery.",
            clinicalPearl = "Dhatura = Anticholinergic toxidrome (Blind as a bat, Mad as a hatter, Red as a beet, Hot as a hare, Dry as a bone).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Toxicology"
        ),
        ForensicQuestion(
            id = "tox_04",
            category = ForensicCategory.TOXICOLOGY,
            question = "A blue-purplish line along the gingival margin (Burtonian line) is a recognized clinical sign of chronic intoxication by:",
            options = listOf(
                "Lead (Pb)",
                "Thallium (Tl)",
                "Copper (Cu)",
                "Barium (Ba)"
            ),
            correctOptionIndex = 0,
            explanation = "Burton's line (Burtonian line) is a thin blue-black line along the tooth-gum junction caused by the reaction of circulating lead with hydrogen sulfide produced by oral bacteria, forming insoluble lead sulfide (PbS) precipitate.",
            clinicalPearl = "Burton's line = Lead (PbS); Also look for wrist drop/foot drop (radial nerve palsy) and basophilic stippling of RBCs in Plumbism.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_05",
            category = ForensicCategory.TOXICOLOGY,
            question = "A body presents with a distinctive 'bitter almond' odor on autopsy opening, bright pinkish-red lividity, and histotoxic cellular anoxia. The lethal toxin is:",
            options = listOf(
                "Hydrocyanic acid / Cyanide",
                "Phosphine (Aluminum phosphide)",
                "Carbon monoxide",
                "Strychnine"
            ),
            correctOptionIndex = 0,
            explanation = "Cyanide inhibits cytochrome c oxidase (Complex IV) of the electron transport chain, blocking cellular oxygen utilization and producing histotoxic anoxia. Venous blood remains saturated with oxygen (yielding brick/pinkish-red hypostasis), and ~60% of people can detect a bitter almond odor.",
            clinicalPearl = "Cyanide blocks cytochrome c oxidase. Antidotes: Hydroxocobalamin (forms cyanocobalamin) or Sodium nitrite + Sodium thiosulfate.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),

        // ==================== PERSONAL IDENTIFICATION & ANTHROPOLOGY ====================
        ForensicQuestion(
            id = "ident_01",
            category = ForensicCategory.IDENTIFICATION,
            question = "In dactylography (fingerprinting), Galton's ridge characteristics (minutiae) used for legal comparison include all EXCEPT:",
            options = listOf(
                "Bifurcations and ridge endings",
                "Islands / short ridges and dots",
                "Enclosures (lakes) and spurs",
                "Superficial epidermal skin creases and wrinkle depths"
            ),
            correctOptionIndex = 3,
            explanation = "Galton points are the minute friction ridge details of friction skin (ridge endings, bifurcations, dots, islands, cross-overs, bridges). Transient skin creases, wrinkles, and folds are not Galton ridge characteristics.",
            clinicalPearl = "Fingerprints are immutable from the 4th month of intrauterine life till postmortem decomposition; in most jurisdictions, 12–16 matching Galton minutiae prove absolute identity.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_02",
            category = ForensicCategory.IDENTIFICATION,
            question = "Gustafson's method of age estimation in adults is based on evaluating histological and morphological changes in:",
            options = listOf(
                "Single rooted permanent teeth",
                "Epiphyseal fusion of long bones",
                "Cranial suture obliteration",
                "Sternum and xiphoid ossification"
            ),
            correctOptionIndex = 0,
            explanation = "Gustafson's dental aging method evaluates 6 age-associated changes in single-rooted permanent teeth: Attrition (A), Secondary dentine (S), Periodontosis (P), Cementum apposition (C), Root resorption (R), and Root transparency (T). Total score correlates linearly with age.",
            clinicalPearl = "Mnemonic: 'A-S-P-C-R-T' — Root transparency (T) is the single most reliable parameter among the six.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_03",
            category = ForensicCategory.IDENTIFICATION,
            question = "Which skeletal element provides the highest statistical accuracy (>95%) for biological sex determination in adult human remains?",
            options = listOf(
                "Pelvis (innominate bones & sacrum)",
                "Clavicle and first rib",
                "Sternum and ribs",
                "Tibia and fibula length"
            ),
            correctOptionIndex = 0,
            explanation = "The adult human pelvis (greater sciatic notch, subpubic angle, pelvic inlet, obturator foramen) is the most sexually dimorphic bone in the human skeleton, achieving over 95% accuracy alone, and ~98% when combined with the cranium.",
            clinicalPearl = "Subpubic angle: >90–100° in females (U-shaped), <70° in males (V-shaped); Greater sciatic notch is broad and wide in females.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_04",
            category = ForensicCategory.IDENTIFICATION,
            question = "Cheiloscopy is the forensic study of:",
            options = listOf(
                "Lip prints and labial mucosal patterns",
                "Palatal rugae contours (rugoscopy)",
                "Sweat pore morphology on friction ridges",
                "Ear lobe cartilage morphology"
            ),
            correctOptionIndex = 0,
            explanation = "Cheiloscopy (Suzuki and Tsuchihashi classification) is the forensic examination of lip prints created by mucosal furrows and sulci on the vermilion border of the lips. Like fingerprints, lip prints are unique and individual.",
            clinicalPearl = "Cheiloscopy = Lip prints; Rugoscopy = Palatal rugae; Poroscopy = Sweat gland pores on friction ridges (Locard).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),

        // ==================== MEDICAL JURISPRUDENCE & LAW ====================
        ForensicQuestion(
            id = "jur_01",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The legal doctrine of 'Res Ipsa Loquitur' in medical negligence implies that:",
            options = listOf(
                "The patient must prove gross malice and criminal intent of the doctor",
                "The thing or accident speaks for itself; negligence is inferred from obvious circumstances",
                "The physician cannot be held liable if a peer group supports the clinical decision",
                "Expert witness testimony is mandatory in every case without exception"
            ),
            correctOptionIndex = 1,
            explanation = "'Res Ipsa Loquitur' ('The thing speaks for itself') applies when the injury is of a kind that does not normally occur in the absence of negligence, the instrumentality was under the exclusive control of the medical team, and there was no contributory negligence (e.g., leaving a surgical swab inside abdomen).",
            clinicalPearl = "When Res Ipsa Loquitur applies, the burden of proof shifts from the plaintiff to the defendant doctor to show that reasonable care was taken.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_02",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Which is true regarding a Dying Declaration?",
            options = listOf(
                "It is mandatory that the oath must be administered to the declarant before recording",
                "Cross-examination by the accused's counsel is legally compulsory during recording",
                "A medical certificate of mental fitness (compos mentis) is essential to confirm testamentary capacity",
                "It is inadmissible in criminal homicide trials"
            ),
            correctOptionIndex = 2,
            explanation = "A dying declaration is a statement made by a person relating to the cause or circumstances leading to their death (admissible under Section 32 of the Evidence Act). No oath is administered, and the defense does not cross-examine; however, a doctor must certify the declarant was in a sound state of mind (compos mentis).",
            clinicalPearl = "Mnemonic: 'Dying Declaration = No Oath, No Cross-examination; Dying Deposition = Oath taken, Cross-examination allowed, recorded by Magistrate.'",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_03",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The 'Bolam Test' establishes the benchmark standard for determining:",
            options = listOf(
                "Criminal insanity in an unprovoked murder trial",
                "Medical negligence by evaluating whether a doctor acted in accordance with accepted practice by a responsible body of medical opinion",
                "The minimum age of consent for psychiatric treatment",
                "Validity of dying declarations in burn victims"
            ),
            correctOptionIndex = 1,
            explanation = "The Bolam test (Bolam v Friern Hospital Management Committee) states that a doctor is not negligent if they acted in accordance with a practice accepted as proper by a responsible body of medical opinion, even if other medical professionals would have adopted a different course.",
            clinicalPearl = "Bolam Principle: Professional standard is judged against the consensus of responsible peers, not hindsight perfection.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),

        // ==================== CLINICAL & AUTOPSY VIGNETTES ====================
        ForensicQuestion(
            id = "vig_01",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A 28-year-old female is found deceased in a locked bedroom. Autopsy reveals fine white persistent froth at the nostrils and mouth, hyper-inflated voluminous lungs overlapping the mediastinum that pit on pressure, and subpleural petechial spots. The chemical laboratory finds diatoms in femoral bone marrow. What is the diagnosis?",
            options = listOf(
                "Dry drowning",
                "Antemortem wet (typical) drowning",
                "Postmortem immersion following acute opiate overdose",
                "Secondary drowning with chemical pneumonitis"
            ),
            correctOptionIndex = 1,
            explanation = "The constellation of classic findings (fine tenacious lather at mouth/nostrils [froth of Paltauf], emphysema aquosum with rib indentations on lungs, subpleural Paltauf hemorrhages, and systemic penetration of diatoms into femoral bone marrow) conclusively confirms antemortem wet drowning.",
            clinicalPearl = "Froth at mouth + Emphysema aquosum (ballooned waterlogged lungs) + Diatoms in bone marrow = Definitive antemortem wet drowning.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_02",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "Autopsy on a 40-year-old man retrieved from a burned vehicle shows cherry-red carboxyhemoglobin levels of 65% in blood and dense black soot particles lining the trachea, main bronchi, and secondary bronchioles. These findings indicate:",
            options = listOf(
                "Postmortem incineration; the individual was dead before the fire started",
                "The individual was alive and breathing during the active fire (antemortem burning)",
                "Carbon dioxide suffocation without flame exposure",
                "Cyanide poisoning from burning vehicle upholstery"
            ),
            correctOptionIndex = 1,
            explanation = "Presence of soot particles deep in the lower respiratory tract (tracheobronchial tree) and elevated blood carboxyhemoglobin (>50-60%) prove active respiration and inhalation during the fire, confirming antemortem exposure and death due to smoke inhalation/burns.",
            clinicalPearl = "Soot in airways + high HbCO (>10-20%) = absolute proof that the deceased was alive and breathing in the burning environment.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "vig_03",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A body discovered in winter shows bright red postmortem hypostasis, goose-skin appearance (cutis anserina), collapse of peripheral blood vessels, and multiple superficial brown-black erosions in the gastric mucosa (Wischnewsky spots). The cause of death is:",
            options = listOf(
                "Hypothermia (Death from exposure to extreme cold)",
                "Acute cyanide ingestion",
                "Arsenic gastrointestinal toxicity",
                "Carbon monoxide asphyxiation in a closed room"
            ),
            correctOptionIndex = 0,
            explanation = "Wischnewsky spots (multiple small, dark brown/black superficial gastric mucosal erosions along rugal folds) are pathognomonic of hypothermia death (seen in 80–90% of hypothermia autopsies). Bright pinkish-red lividity occurs because cold inhibits oxyhemoglobin dissociation.",
            clinicalPearl = "Wischnewsky spots in stomach + Pink lividity + Cutis anserina + Paradoxical undressing = Cardinal signs of fatal hypothermia.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_04",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "An autopsy is performed on an alleged suicide victim. The skull demonstrates a circular outer table hole with clean margins and extensive internal beveling on the inner table of the right temple, with soot deposit along the bony edges. On the left parietal bone, there is an irregular jagged opening with extensive external beveling on the outer table. What is the trajectory and firearm range?",
            options = listOf(
                "Left-to-right trajectory, distant range",
                "Right-to-left trajectory, close/contact shot at the right temple",
                "Tangential ricochet shot across both parietal bones",
                "Simultaneous bilateral entry wounds"
            ),
            correctOptionIndex = 1,
            explanation = "Right temple has internal beveling (larger crater inside) + soot on bone = entrance wound at close/contact range. Left parietal has external beveling (larger crater outside) = exit wound. Trajectory is right-to-left.",
            clinicalPearl = "Entrance has internal bevel + soot/burning; Exit has external bevel + no soot/burning + larger irregular tissue eversion.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_05",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A newly born infant is suspected of infanticide. During autopsy, the lungs are excised with the heart and placed in a container of water. The lungs float buoyantly, are spongy, pale pink with marbled borders, and crepitate on palpation. What does this test (Hydrostatic / Breslau test) indicate?",
            options = listOf(
                "Stillborn fetus (atelectatic lungs)",
                "Live birth with respiration established",
                "Intrauterine maceration",
                "Putrefactive gas inflation without live birth"
            ),
            correctOptionIndex = 1,
            explanation = "The Hydrostatic (Breslau) lung test demonstrates that air has expanded the pulmonary alveoli during independent respiration, lowering lung specific gravity below 1.000 so the lungs float. When confirmed with microscopic aeration and absence of decomposition gas, it establishes live birth.",
            clinicalPearl = "Hydrostatic test (Breslau) + Ploucquet index (Lung weight / Body weight ratio: 1/35 in liveborn vs 1/70 in stillborn) = Medical tests for live birth in infanticide.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_07",
            category = ForensicCategory.THANATOLOGY,
            question = "Postmortem hypostasis (lividity) becomes fixed and does not blanch upon thumb pressure or shift when the body position is altered after approximately:",
            options = listOf(
                "30 minutes to 1 hour",
                "6 to 12 hours",
                "24 to 36 hours",
                "48 to 72 hours"
            ),
            correctOptionIndex = 1,
            explanation = "Hypostasis begins immediately after circulation stops, becoming visible at 1-2 hours, fully developed at 4-6 hours, and fixed between 6-12 hours due to hemoconcentration and extravasation of hemolyzed RBCs into surrounding interstitial tissues.",
            clinicalPearl = "Fixed lividity at an unexpected site indicates the body was moved 6–12+ hours after death.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_06",
            category = ForensicCategory.TOXICOLOGY,
            question = "Which poison is known as 'Inheritance Powder' and historically favored for homicidal poisoning because it is white, tasteless, odorless, and resembles natural gastroenteritis?",
            options = listOf(
                "Arsenic trioxide (Sankhya)",
                "Potassium cyanide",
                "Thallium acetate",
                "Mercury perchloride"
            ),
            correctOptionIndex = 0,
            explanation = "Arsenic trioxide (As2O3, 'white arsenic', 'Poudre de succession') was historically termed inheritance powder because it is tasteless, odorless, dissolves in warm beverages, and its acute symptoms (vomiting, rice-water stools, cramping) closely mimic cholera or acute gastroenteritis.",
            clinicalPearl = "Arsenic preserves bodies postmortem (retards putrefaction) and concentrates in keratinized tissues (hair and nails).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Toxicology"
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
        )
    )

    // Select daily 5 questions deterministically based on date string (YYYY-MM-DD)
    fun getDailyQuizQuestions(dateString: String): List<ForensicQuestion> {
        val hash = dateString.hashCode().let { if (it < 0) -it else it }
        val shuffled = questions.sortedBy { (it.id + dateString).hashCode() }
        
        // Ensure diverse representation of categories in daily quiz
        val selected = mutableListOf<ForensicQuestion>()
        val categoriesSeen = mutableSetOf<ForensicCategory>()

        for (q in shuffled) {
            if (q.category !in categoriesSeen) {
                selected.add(q)
                categoriesSeen.add(q.category)
                if (selected.size == 5) break
            }
        }

        // Fill up to 5 if needed
        if (selected.size < 5) {
            for (q in shuffled) {
                if (q !in selected) {
                    selected.add(q)
                    if (selected.size == 5) break
                }
            }
        }
        return selected
    }

    fun getQuestionsByCategory(category: ForensicCategory): List<ForensicQuestion> {
        return questions.filter { it.category == category }
    }

    fun getQuestionsByDifficulty(difficulty: Difficulty): List<ForensicQuestion> {
        return questions.filter { it.difficulty == difficulty }
    }
}
