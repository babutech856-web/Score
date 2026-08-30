package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object ThanatologyQuestions {
    val all: List<ForensicQuestion> = listOf(
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
            id = "than_08",
            category = ForensicCategory.THANATOLOGY,
            question = "According to Casper's Dictum regarding the rate of putrefaction, the ratio of decomposition rate in Air : Water : Earth (burial) is:",
            options = listOf(
                "1 : 2 : 8 (1 week in air = 2 weeks in water = 8 weeks in earth)",
                "8 : 2 : 1 (8 weeks in air = 2 weeks in water = 1 week in earth)",
                "1 : 1 : 1 (equal decomposition rate)",
                "1 : 4 : 16"
            ),
            correctOptionIndex = 0,
            explanation = "Casper's Dictum states that a body decomposes twice as fast in air as in water, and eight times as fast in air as buried underground in earth (Ratio of Air : Water : Earth is 1 : 2 : 8).",
            clinicalPearl = "Casper's Law: 1 week in air = 2 weeks in water = 8 weeks buried in soil.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_09",
            category = ForensicCategory.THANATOLOGY,
            question = "Tache noire de la sclérotique is an ocular postmortem finding described as:",
            options = listOf(
                "Subconjunctival flame hemorrhage secondary to asphyxia",
                "Brownish-black triangular or oval patches on the sclera where the unclosed eyelids leave the eyeball exposed to air",
                "Complete opacity of the anterior lens capsule",
                "Clouding of the cornea occurring within 5 minutes"
            ),
            correctOptionIndex = 1,
            explanation = "Tache noire refers to two brownish or black triangular spots appearing on the exposed sclera (lateral and medial to the cornea) when eyelids remain open after death. It is caused by desiccation and atmospheric deposition of cellular debris and dust on the dried sclera.",
            clinicalPearl = "Tache noire indicates the eyes were left open postmortem, appearing within 2 to 3 hours in dry conditions.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_10",
            category = ForensicCategory.THANATOLOGY,
            question = "Postmortem caloricity (a rise in body temperature for the first 1–2 hours after somatic death) is characteristically seen in which of the following conditions?",
            options = listOf(
                "Congestive cardiac failure",
                "Tetanus, Strychnine poisoning, or Pontine hemorrhage",
                "Severe hemorrhagic shock",
                "Barbiturate overdose"
            ),
            correctOptionIndex = 1,
            explanation = "Postmortem caloricity occurs when heat production continues or thermoregulatory failure produces extreme hyperpyrexia immediately before death without circulatory dissipation. Classic causes include Tetanus, Strychnine convulsions, Pontine hemorrhage, Heat stroke, and Septicemia.",
            clinicalPearl = "Postmortem caloricity: Body temperature rises instead of falling initially in convulsive states, pontine stroke, and heat stroke.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "than_11",
            category = ForensicCategory.THANATOLOGY,
            question = "Kevorkian sign (fragmentation or cattle-trucking of retinal blood columns) appears ophthalmoscopically within what time frame following somatic death?",
            options = listOf(
                "Within 5 to 15 minutes",
                "After 6 to 8 hours",
                "Between 18 and 24 hours",
                "Only after 48 hours"
            ),
            correctOptionIndex = 0,
            explanation = "Kevorkian's sign (cattle trucking) is the segmentation and breaking up of retinal blood columns into moving, interrupted beads seen upon ophthalmoscopy. It begins within 5 to 15 minutes of circulatory cessation as arterial blood pressure drops to zero.",
            clinicalPearl = "Kevorkian sign is one of the earliest funduscopic confirmations of irreversible circulatory standstill (somatic death).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_12",
            category = ForensicCategory.THANATOLOGY,
            question = "Mummification is a natural preservative modification of decomposition that requires which combination of environmental factors?",
            options = listOf(
                "Cold, stagnant water with anaerobic bacteria",
                "High ambient heat, low relative humidity, and continuous dry air currents",
                "Enclosed damp soil with high moisture content",
                "Deep sub-zero freezing temperatures with snow immersion"
            ),
            correctOptionIndex = 1,
            explanation = "Mummification is the desiccation and shriveling of tissues into a leathery, dark brown, brittle state. It requires warm/hot ambient temperatures, arid conditions (low humidity), and free circulation of dry air, which evaporates moisture faster than putrefactive bacteria can liquefy tissues.",
            clinicalPearl = "Mummification preserves external body architecture, scars, tattoos, and facial features for decades.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "than_13",
            category = ForensicCategory.THANATOLOGY,
            question = "In the process of decomposition, 'marbling' of the skin is caused by:",
            options = listOf(
                "Rupture of superficial dermal capillaries from hypothermia",
                "Reaction of hydrogen sulfide (H2S) with hemoglobin within superficial venous networks forming sulfhemoglobin",
                "Subcutaneous extravasation of lipid drops during saponification",
                "Direct fungal hyphal invasion along epidermal nerve sheaths"
            ),
            correctOptionIndex = 1,
            explanation = "Marbling produces an arborizing, tree-like or mosaic vascular pattern across the chest, shoulders, and thighs. It develops around 36 to 48 hours postmortem as putrefactive bacteria hemolyze intravascular blood and generate hydrogen sulfide, forming dark greenish-purple sulfhemoglobin within superficial veins.",
            clinicalPearl = "Marbling = 'Arborescent vascular pattern' resulting from intravascular sulfhemoglobin formation at 36-48 hours.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_14",
            category = ForensicCategory.THANATOLOGY,
            question = "Which internal organ is typically the LAST to putrefy in an adult female body?",
            options = listOf(
                "Stomach and intestines",
                "Brain and spinal cord",
                "Non-gravid uterus",
                "Liver and spleen"
            ),
            correctOptionIndex = 2,
            explanation = "The non-gravid uterus (in females) and the prostate gland (in males) consist of dense, firm, fibrous smooth muscle tissue devoid of lumenal gut microflora, making them the most resistant internal organs to putrefaction. They are frequently preserved even in advanced skeletalization.",
            clinicalPearl = "Last organs to decompose: Non-gravid Uterus in females, Prostate in males. Earliest organs: Larynx, trachea, and infant brain.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_15",
            category = ForensicCategory.THANATOLOGY,
            question = "Which internal organ is among the FIRST to liquefy and putrefy postmortem?",
            options = listOf(
                "Larynx and trachea",
                "Heart ventricles",
                "Prostate",
                "Kidneys"
            ),
            correctOptionIndex = 0,
            explanation = "The larynx, trachea, infant brain, and gastrointestinal mucosa are the earliest internal organs to undergo autolytic liquefaction and putrefaction due to high moisture, enzymatic content, and direct exposure to respiratory/oral microbes.",
            clinicalPearl = "Earliest internal organs to putrefy: Larynx, trachea, stomach mucosa, and brain of infants.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "than_16",
            category = ForensicCategory.THANATOLOGY,
            question = "Magendie's sign / Sommer-Larcher spot on the eyes corresponds to:",
            options = listOf(
                "Postmortem opacification of the anterior chamber with debris",
                "Tache noire (black spot of desiccation on the exposed sclera)",
                "Subretinal hematoma from elevated intracranial pressure",
                "Pupillary constriction in organophosphate overdose"
            ),
            correctOptionIndex = 1,
            explanation = "Sommer-Larcher spot (also called Tache noire de la sclérotique) is the oval or triangular brownish-black discoloration of the sclera caused by drying of the exposed eye when eyelids remain open after death.",
            clinicalPearl = "Sommer-Larcher spot = Tache noire = Scleral drying artifact.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_17",
            category = ForensicCategory.THANATOLOGY,
            question = "The cooling rate of a dead body (algor mortis) in temperate climates averages approximately how many degrees Celsius per hour during the first 6 hours?",
            options = listOf(
                "0.1 to 0.2 °C/hr",
                "0.5 to 0.7 °C/hr (or ~1.5 °F/hr)",
                "2.5 to 3.0 °C/hr",
                "5.0 °C/hr"
            ),
            correctOptionIndex = 1,
            explanation = "In temperate climates, the rectal temperature drop follows a sigmoid cooling curve (Newton's law of cooling modified): about 0.5 to 0.7 °C per hour during the first 6 hours, followed by 1 °C/hr, and then slowing down as ambient temperature is approached.",
            clinicalPearl = "Rule of thumb for PMI: Body cools ~1.5 °F (0.8 °C) per hour in temperate environments during early postmortem hours.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_18",
            category = ForensicCategory.THANATOLOGY,
            question = "Maceration of a dead fetus in utero is characterized by all of the following EXCEPT:",
            options = listOf(
                "Aseptic autolysis without bacterial putrefaction",
                "Peeling of skin with reddish-brown serosanguinous fluid blebs",
                "Gas formation causing abdomen distension from Clostridial infection",
                "Overlapping of skull bones (Spalding's sign on radiography)"
            ),
            correctOptionIndex = 2,
            explanation = "Maceration is an aseptic autolytic process occurring when a dead fetus is retained within the sterile amniotic cavity for at least 24 hours. Putrefactive gas formation does NOT occur unless intra-amniotic bacterial infection (chorioamnionitis) was present.",
            clinicalPearl = "Maceration is purely aseptic autolysis in amniotic fluid; gas formation indicates true putrefaction.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_19",
            category = ForensicCategory.THANATOLOGY,
            question = "Postmortem hypostasis (lividity) may be confused with an antemortem contusion (bruise). Which test reliably differentiates them on dissection?",
            options = listOf(
                "Washing with a stream of water: hypostasis washes out of cut vessels, whereas a bruise does not wash away",
                "Measuring tissue pH with litmus paper",
                "Testing with hydrogen peroxide for bubble formation",
                "Transillumination with ultraviolet light"
            ),
            correctOptionIndex = 0,
            explanation = "On incising the area, hypostasis represents intravascular pooling; blood washes away easily with water and vessels remain intact. In a contusion, blood has extravasated into the subcutaneous tissue spaces and clotted, resisting washing.",
            clinicalPearl = "Incision test: Hypostasis washes away cleanly (intravascular); Contusion extravasates and does NOT wash away.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_20",
            category = ForensicCategory.THANATOLOGY,
            question = "Primary muscular flaccidity occurs:",
            options = listOf(
                "Immediately after somatic death before rigor mortis sets in",
                "After rigor mortis has completely passed off",
                "Only in electric shock deaths",
                "Only when cadaveric spasm is present"
            ),
            correctOptionIndex = 0,
            explanation = "Primary flaccidity starts immediately at the point of somatic death. All voluntary and involuntary muscles relax, joints are mobile, sphincters relax, and muscles still respond to direct electrical/mechanical stimuli (molecular life persists).",
            clinicalPearl = "Three muscle stages: Primary flaccidity (0-3 hrs) -> Rigor mortis (3-36 hrs) -> Secondary flaccidity (decomposition).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "than_21",
            category = ForensicCategory.THANATOLOGY,
            question = "Which form of somatic death certification criterion requires complete, irreversible cessation of all brain stem reflexes including apnea testing?",
            options = listOf(
                "Harvard Brain Death Criteria",
                "Sommer-Larcher Standard",
                "Brodie's Triad",
                "Casper's Index"
            ),
            correctOptionIndex = 0,
            explanation = "Brainstem death (Harvard / AAN criteria) requires irreversible coma of known etiology, absence of all brainstem reflexes (pupillary, corneal, oculocephalic, vestibulo-ocular, gag, cough), and a positive Apnea Test (PaCO2 >= 60 mmHg without spontaneous respiratory effort).",
            clinicalPearl = "Brainstem death: Absent cranial nerve reflexes + Apnea test positive (PaCO2 >= 60 mmHg) with normothermia and no sedative drugs.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_22",
            category = ForensicCategory.THANATOLOGY,
            question = "In forensic entomology, which insect is usually the FIRST to colonize a decomposing human body exposed in open air?",
            options = listOf(
                "Blowflies (Calliphoridae)",
                "Hide beetles (Dermestidae)",
                "Cheese skippers (Piophilidae)",
                "Rove beetles (Staphylinidae)"
            ),
            correctOptionIndex = 0,
            explanation = "Blowflies (Calliphoridae like Lucilia sericata and Calliphora vicina) can detect volatile putrefactive gases (dimethyl disulfide, putrescine) and arrive within minutes of death to deposit eggs in open orifices and wound margins.",
            clinicalPearl = "Blowflies (Calliphoridae) arrive first (minutes to hours). Dermestid beetles arrive during late dry decay stage.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "than_23",
            category = ForensicCategory.THANATOLOGY,
            question = "Which muscle protein interaction accounts for the mechanical rigidity in Rigor Mortis?",
            options = listOf(
                "ATP depletion preventing dissociation of actin-myosin cross-bridges",
                "Excess intracellular glycogen causing hyperosmolar stiffness",
                "Calcium pump hyperactivation pumping calcium out of myocytes",
                "Proteolytic cleavage of titin filaments by calpains"
            ),
            correctOptionIndex = 0,
            explanation = "Rigor mortis occurs because cellular ATP production ceases. ATP is required to detach myosin heads from actin filaments and sequester Ca2+ into the sarcoplasmic reticulum. Without ATP, actin-myosin complexes remain locked in permanent contracture.",
            clinicalPearl = "Rigor mortis mechanism = ATP depletion; actin and myosin stay locked until autolytic proteolysis begins secondary flaccidity.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "than_24",
            category = ForensicCategory.THANATOLOGY,
            question = "A body submerged in deep, icy lake water for 3 weeks is retrieved with minimal putrefaction, intact pale skin, and 'goose skin' (cutis anserina). This preservation is primarily due to:",
            options = listOf(
                "Bacterial inhibition by low water temperature and slowed enzymatic autolysis",
                "Rapid conversion to dry mummification",
                "Immediate secondary flaccidity",
                "High salinity of lake water"
            ),
            correctOptionIndex = 0,
            explanation = "Cold and freezing temperatures drastically retard bacterial growth and inactivate cellular autolytic enzymes, prolonging the postmortem interval before signs of putrefaction emerge.",
            clinicalPearl = "Cold environment delays both rigor mortis onset/disappearance and putrefactive decomposition.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "than_25",
            category = ForensicCategory.THANATOLOGY,
            question = "The phenomenon of 'postmortem purging' in advanced putrefaction is characterized by:",
            options = listOf(
                "Forced discharge of dark, foul-smelling reddish froth and fluid from the mouth and nostrils due to intra-abdominal gas pressure",
                "Immediate emptying of the urinary bladder within 10 minutes of death",
                "Spontaneous expulsion of bile into the stomach",
                "Liquefaction of renal pyramids"
            ),
            correctOptionIndex = 0,
            explanation = "As putrefactive bacteria generate large volumes of gas in the intestines, intra-abdominal and thoracic pressure rises dramatically, forcing decomposed hemolyzed fluid and mucus out through the mouth and nose as 'postmortem purge'.",
            clinicalPearl = "Postmortem purge froth can simulate antemortem hemoptysis or pulmonary edema; always check for underlying decomposition signs.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "than_26",
            category = ForensicCategory.THANATOLOGY,
            question = "Kuhne's sign of death refers to:",
            options = listOf(
                "Absence of muscular contraction following intramuscular injection of neostigmine",
                "Absence of light reflex and intraocular pressure drop below 10 mmHg",
                "Lack of tissue discoloration when subcutaneous injection of fluorescein (Icard's test) is performed",
                "Loss of arterial pulsation in radial artery"
            ),
            correctOptionIndex = 2,
            explanation = "Icard's test (and related dyes like Kuhne's/Magnus sign) involves injecting fluorescein or looking for circulation; absence of yellowish-green discoloration of sclera/skin confirms complete circulatory arrest.",
            clinicalPearl = "Icard's fluorescein test is a classical somatic death test: In life, skin/eyes turn bright yellow-green; in death, dye does not circulate.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        )
    )
}
