package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object AutopsyVignetteQuestions {
    val all: List<ForensicQuestion> = listOf(
        ForensicQuestion(
            id = "vig_01",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A 28-year-old male is recovered from a house fire. Autopsy reveals heavy soot lining the trachea and main bronchi down to terminal bronchioles, with a carboxyhemoglobin saturation of 55%. What is the medicolegal interpretation?",
            options = listOf(
                "The victim was alive, breathing, and inhaled smoke during the active fire (Antemortem fire death)",
                "The body was placed in the fire postmortem to conceal a homicide",
                "Death was instantaneously caused by cyanide before smoke inhalation",
                "The soot is a postmortem thermal artifact of heat rigor"
            ),
            correctOptionIndex = 0,
            explanation = "Inhalation of soot deep into the tracheal-bronchial tree and elevated blood carboxyhemoglobin (HbCO > 50%) prove that active respiratory and circulatory functions were present during the fire, confirming antemortem exposure.",
            clinicalPearl = "Antemortem Fire Hallmarks: Soot in trachea/bronchi + HbCO > 50% in blood + vital reaction (hyperemia) at burn margins.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_02",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "Autopsy on a 42-year-old male who died during a physical altercation reveals an intact external skull table with no calvarial fracture, but a massive 120 mL crescentic extra-axial blood clot compressing the cerebral hemisphere. The source of bleeding is most likely:",
            options = listOf(
                "Rupture of bridging cortical veins entering the superior sagittal sinus (Acute Subdural Hematoma)",
                "Laceration of the anterior ethmoidal artery",
                "Transection of the internal carotid siphon",
                "Spontaneous rupture of a Berry aneurysm in the circle of Willis"
            ),
            correctOptionIndex = 0,
            explanation = "Acute subdural hematomas commonly occur without skull fractures, especially from rotational/acceleration trauma that tears delicate bridging veins spanning the subdural space between the cerebral cortex and dural venous sinuses.",
            clinicalPearl = "Subdural hematoma frequently occurs WITHOUT skull fracture (rotational shearing of bridging veins). Epidural hematoma is usually associated with a linear skull fracture.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_03",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "An adult male recovered from a river displays voluminous waterlogged lungs that overlap the pericardial sac, subpleural Paltauf's hemorrhages, and fine tenacious white froth at the nose and mouth. The presence of fine white froth indicates:",
            options = listOf(
                "Active antemortem respiratory movements churning inhaled fluid, surfactant, and air during drowning",
                "Postmortem gas formation by Clostridium species",
                "Acute cardiac rupture",
                "Aspiration of gastric acid postmortem"
            ),
            correctOptionIndex = 0,
            explanation = "The fine, white, tenacious 'mushroom of froth' at the external orifices requires active respiratory excursions during antemortem agonal gasping, which whips up surfactant, mucus, and inhaled water into a stable emulsion.",
            clinicalPearl = "Persistent frothy cone at mouth/nostrils is an antemortem sign of drowning, pulmonary edema, or opioid overdose.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "vig_04",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "During postmortem examination of an elderly victim found dead in an unheated room during freezing winter conditions, multiple small superficial coffee-ground mucosal erosions and ulcers are noted along the gastric rugae. These are known as:",
            options = listOf(
                "Wischnewsky spots (hallmark of fatal hypothermia)",
                "Curling's ulcers of burns",
                "Cushing's ulcers of intracranial hypertension",
                "Dieulafoy's vascular lesions"
            ),
            correctOptionIndex = 0,
            explanation = "Wischnewsky spots are multiple brownish-black, coffee-ground gastric mucosal petechiae/hemorrhagic erosions seen in up to 90% of hypothermia fatalities, caused by cold-induced autonomic gastric microvascular ischemia and mucosal autolysis.",
            clinicalPearl = "Fatal Hypothermia Triad: Wischnewsky spots in stomach + Pink hypostasis + Paradoxical undressing / Hide-and-die syndrome.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_05",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A body discovered in a locked bedroom shows fixed hypostasis on the anterior chest, abdomen, and face, but the body was found in a supine position (lying on its back). What is the primary forensic deduction?",
            options = listOf(
                "The body was moved and flipped from a prone to a supine position at least 6 to 12 hours after death",
                "The victim died instantaneously of cyanide toxicity",
                "The death was due to electrical shock",
                "The postmortem interval is less than 30 minutes"
            ),
            correctOptionIndex = 0,
            explanation = "Hypostasis becomes fixed after 6 to 12 hours postmortem. Finding fixed hypostasis on the anterior body surfaces in a corpse discovered supine conclusively proves that the body remained prone for >= 6-12 hours before being intentionally moved or turned.",
            clinicalPearl = "Discrepancy between hypostasis distribution and discovery posture proves body movement after fixity (6–12 hrs postmortem).",
            difficulty = Difficulty.VIGNETTE,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "vig_06",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "At autopsy of an industrial electrician, a 5 mm circular, crater-like, indurated lesion with an elevated pale whitish ridge and a charred central depression is found on the index finger. This represents:",
            options = listOf(
                "Electric mark (Joule burn / Current mark of Gellinek)",
                "Friction graze abrasion",
                "Chemical acid burn",
                "Thermal flame blister"
            ),
            correctOptionIndex = 0,
            explanation = "The electric entry mark (Joule burn / current mark) is pathognomonic of electrical contact. Ohmic resistance generates intense focal heat, vaporizing cellular water, collapsing epidermis, and creating a crater with raised pale margins (microscopically showing nuclear streaming / palisading).",
            clinicalPearl = "Electric current mark: Crater with raised margins + metallization + nuclear elongation ('streaming') on histology.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "vig_07",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A severely charred corpse recovered from a building fire shows flexed elbows, clenched fists, flexed hips and knees, resembling a boxer's stance ('pugilistic attitude'). This posture is caused by:",
            options = listOf(
                "Thermal coagulation and denaturation of muscle proteins, with stronger flexor muscle mass overcoming weaker extensors",
                "Violent antemortem physical combat before the fire",
                "Instantaneous cadaveric spasm from agony",
                "Carbon monoxide-induced muscle contractures"
            ),
            correctOptionIndex = 0,
            explanation = "The pugilistic (boxer's) attitude is a purely postmortem thermal artifact. High environmental heat denatures and coagulates muscle proteins, causing muscle shrinkage. Because flexor muscle groups have greater bulk and mechanical advantage than extensors, all major joints flex.",
            clinicalPearl = "Pugilistic stance is a purely postmortem thermal artifact caused by heat-induced protein coagulation, NOT evidence of a fight.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_08",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "Autopsy on a victim recovered from an industrial explosion shows bilateral tympanic membrane rupture, pulmonary blast lung with 'butterfly' alveolar hemorrhage pattern, and superficial shrapnel lacerations. The primary blast injury is represented by:",
            options = listOf(
                "Tympanic membrane rupture and blast lung",
                "Secondary flying projectile shrapnel wounds",
                "Tertiary bodily impact against wall",
                "Quaternary toxic fume inhalation"
            ),
            correctOptionIndex = 0,
            explanation = "Primary blast injuries are caused by the direct high-pressure shockwave passing through air-filled organs, predominantly rupturing the tympanic membranes (most sensitive) and causing pulmonary alveolar blast contusions ('blast lung'). Secondary injuries are shrapnel; tertiary are body displacement; quaternary are burns/toxic gases.",
            clinicalPearl = "Tympanic membrane rupture is the most sensitive anatomical marker of blast overpressure exposure.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_09",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A 19-year-old college student collapses at a marathon finish line in hot weather. Autopsy reveals a core body temperature recorded as 41.5 °C at collapse, cerebral edema, widespread petechiae, and dark liquid blood. This clinicopathological picture is classic for:",
            options = listOf(
                "Heat Stroke (Exertional hyperthermia)",
                "Acute cyanide ingestion",
                "Carbon monoxide toxicity",
                "Hypothermia"
            ),
            correctOptionIndex = 0,
            explanation = "Exertional heat stroke causes severe systemic inflammatory response syndrome (SIRS), multi-organ microthrombosis, disseminated intravascular coagulation (DIC), cerebral edema, and marked postmortem fluidity of blood.",
            clinicalPearl = "Heat stroke autopsy: Brain edema, visceral petechiae, fluid blood, absence of significant coronary pathology.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_10",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "Autopsy on a young infant found unresponsive in a crib shows bilateral retinal hemorrhages extending to the periphery, subdural hematoma over the cerebral convexities, and no external cranial impact bruises. This triad is characteristic of:",
            options = listOf(
                "Abusive Head Trauma (Shaken Baby Syndrome / Whiplash-Shaking Injury)",
                "Sudden Infant Death Syndrome (SIDS)",
                "Congenital bleeding diathesis",
                "Accidental roll off a 1-foot bed"
            ),
            correctOptionIndex = 0,
            explanation = "The classic Shaken Baby Syndrome triad comprises: 1) Subdural hematoma, 2) Multi-layered diffuse retinal hemorrhages, and 3) Encephalopathy / diffuse axonal injury from violent non-accidental rotational whiplash acceleration without direct impact marks.",
            clinicalPearl = "Abusive Head Trauma Triad: Subdural hemorrhage + Extensive bilateral retinal hemorrhages + Severe hypoxic-ischemic encephalopathy.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "vig_11",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "In a fatal lightning strike autopsy, a transient arborizing, fern-like, erythematous pattern seen on the victim's skin is known as:",
            options = listOf(
                "Lichtenberg figures (Arborescent lightning marks / Keraunopathia)",
                "Marbling of putrefaction",
                "Tardieu spots",
                "Paltauf's patches"
            ),
            correctOptionIndex = 0,
            explanation = "Lichtenberg figures (feathering / ferning / keraunographic markings) are branching dendritic erythematous skin patterns produced by electrical transmission over skin moist with sweat, causing microvascular extravasation. They disappear within 24–48 hours if the patient survives.",
            clinicalPearl = "Lichtenberg figure is pathognomonic of a lightning strike; accompanied by magnetized metal objects, melted zippers, and eardrum rupture.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "vig_12",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "Autopsy on an unrestrained driver in a high-speed head-on motor vehicle collision shows horizontal laceration of the pericardium and transverse transection of the thoracic aorta immediately distal to the left subclavian artery. This is caused by:",
            options = listOf(
                "Sudden rapid horizontal deceleration and shearing of the mobile aortic arch against the fixed ligamentum arteriosum / thoracic spine",
                "Direct penetrating rib puncture",
                "Airbag chemical burn",
                "Secondary blast wave"
            ),
            correctOptionIndex = 0,
            explanation = "Traumatic aortic rupture in vehicular crashes characteristically occurs at the aortic isthmus (just distal to the left subclavian artery at the ligamentum arteriosum), where the mobile ascending arch shears against the tethered descending thoracic aorta during violent deceleration.",
            clinicalPearl = "Aortic rupture site in deceleration collisions: Aortic isthmus (distal to left subclavian origin) due to differential inertia.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_13",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A driver wearing a 3-point lap-and-shoulder seatbelt in a severe frontal collision presents at autopsy with a horizontal transverse fracture through the lumbar vertebral body (Chance fracture) and mesenteric tear. This 'Seatbelt Syndrome' injury is caused by:",
            options = listOf(
                "Violent hyperflexion of the torso over the fixed lap belt anchor point",
                "Direct backward whiplash extension",
                "Steering wheel chest impalement",
                "Side door intrusion"
            ),
            correctOptionIndex = 0,
            explanation = "Chance fractures (seatbelt fractures) are horizontal distraction split fractures through the lumbar spinous process, pedicles, and vertebral body (typically L1-L3) caused by rapid acute flexion-distraction of the spine over a locked lap belt.",
            clinicalPearl = "Chance fracture = Flexion-distraction injury of lumbar vertebra + bowel/mesenteric contusions ('Seatbelt syndrome').",
            difficulty = Difficulty.VIGNETTE,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "vig_14",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A neonate's body found abandoned in a bag is brought for autopsy. The hydrostatic (flotation) lung test is performed to determine whether the infant was born alive. If the child was born alive and took a breath, the lungs will:",
            options = listOf(
                "Float completely in water and expand, with crepitant margins and pink mottled appearance (Breslau's second life test)",
                "Sink instantly like a stone to the bottom of the vessel",
                "Disintegrate into gelatinous brown fluid",
                "Turn immediately jet black"
            ),
            correctOptionIndex = 0,
            explanation = "The Hydrostatic Lung Test (Raygat's / Breslau's test) evaluates live birth. Lungs of an infant who breathed contain air, have a low specific gravity (< 1.0), and float buoyantly in water, even after cutting into small fragments and pressing between fingers.",
            clinicalPearl = "Hydrostatic lung test: Liveborn lungs float (Sp. gr. 0.94); Stillborn lungs sink (Sp. gr. 1.04). False positive from decomposition gas must be excluded.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "vig_15",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "At autopsy of a young athlete with sudden cardiac death, histopathology reveals marked asymmetric septal hypertrophy, myocyte disarray, and interstitial fibrosis. The diagnosis is:",
            options = listOf(
                "Hypertrophic Cardiomyopathy (HCM)",
                "Arrhythmogenic Right Ventricular Dysplasia (ARVD)",
                "Dilated Cardiomyopathy",
                "Rheumatic pancarditis"
            ),
            correctOptionIndex = 0,
            explanation = "Hypertrophic Cardiomyopathy (HCM) is the leading cause of sudden cardiac death in young competitive athletes. Autopsy demonstrates disproportionate ventricular septal hypertrophy (septum:free wall > 1.3) with disorganized chaotic myofiber architecture ('myocyte disarray').",
            clinicalPearl = "Leading cause of sudden death in young athletes: Hypertrophic Cardiomyopathy (asymmetric septal hypertrophy + myocyte disarray).",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_16",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A factory worker is found deceased next to an open vat of carbon tetrachloride (CCl4). Autopsy demonstrates massive acute hepatic centrilobular necrosis with severe fatty change and renal tubular swelling. This pathology is caused by:",
            options = listOf(
                "Cytochrome P450-mediated metabolism of CCl4 to trichloromethyl free radicals (CCl3*) initiating lipid peroxidation",
                "Direct chemical binding of chlorine gas to albumin",
                "Inhibition of acetylcholinesterase",
                "Hypercalcemic nephrocalcinosis"
            ),
            correctOptionIndex = 0,
            explanation = "Carbon tetrachloride is activated by hepatic CYP2E1 into the highly toxic trichloromethyl radical (CCl3*), triggering extensive lipid peroxidation of hepatocyte endoplasmic membranes and resulting in acute centrilobular necrosis.",
            clinicalPearl = "Carbon tetrachloride toxicity: CYP2E1 generates CCl3* free radicals -> massive centrilobular hepatic necrosis + acute renal failure.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Parikh's Toxicology"
        ),
        ForensicQuestion(
            id = "vig_17",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "During autopsy of a victim with a fatal high-voltage electrocution (> 1000 Volts), bone histopathology reveals rounded cavities resembling melted Swiss cheese in cranial/long bones known as:",
            options = listOf(
                "'Bone pearls' or bone wax cavities (osteonecrotic melting of calcium phosphate)",
                "Pagetoid remodeling cysts",
                "Brown tumors of hyperparathyroidism",
                "Schmorl's nodes"
            ),
            correctOptionIndex = 0,
            explanation = "In high-voltage electrical injuries, extreme local resistive heating (> 1000 °C) melts the bone mineral matrix, causing calcium phosphate to fuse into microscopic, glistening round structures known as 'bone pearls' or wax-droplet lesions.",
            clinicalPearl = "High-voltage electrocution: 'Bone pearls' formed by thermal melting of calcium phosphate bone matrix.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_18",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A body discovered frozen in the snow exhibits paradoxical undressing (clothing removed and scattered nearby) and the corpse is wedged tightly under a bed in a closet. This behavior is known as:",
            options = listOf(
                "'Hide-and-die' syndrome (Terminal burrowing behavior) associated with fatal hypothermia",
                "Active homicidal staging",
                "Delirium tremens from alcohol withdrawal",
                "Epileptic fugue state"
            ),
            correctOptionIndex = 0,
            explanation = "In severe hypothermia, terminal paralysis of the vasoconstrictor center causes a sudden surge of blood into cutaneous vessels, triggering a false sensation of intense burning heat ('paradoxical undressing'). Primitive brainstem reflexes then drive the victim to burrow into small enclosed spaces ('terminal burrowing' or hide-and-die syndrome).",
            clinicalPearl = "Hypothermia scene findings: Paradoxical undressing + Terminal burrowing (hide-and-die syndrome).",
            difficulty = Difficulty.VIGNETTE,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "vig_19",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A scuba diver makes an emergency rapid ascent from 100 feet depth and collapses on the boat with immediate hemoptysis, subcutaneous emphysema in the neck, and sudden left hemiplegia. The cause of death is:",
            options = listOf(
                "Pulmonary barotrauma (burst lung) with Arterial Gas Embolism (AGE)",
                "Nitrogen narcosis alone",
                "Acute oxygen toxicity",
                "Coronary artery thrombosis"
            ),
            correctOptionIndex = 0,
            explanation = "During rapid ascent without exhaling, expanding gas (Boyle's law) overdistends alveoli, causing alveolar rupture. Air enters the pulmonary veins, travels to the left heart, and embolizes to cerebral and coronary arteries, causing stroke, cardiac arrest, and mediastinal emphysema.",
            clinicalPearl = "Rapid scuba ascent: Pulmonary barotrauma -> Arterial Gas Embolism (air in cerebral/coronary arteries); distinct from decompression sickness.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_20",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "In an autopsy suspected of venous air embolism (e.g., following criminal abortion or neck vein laceration), the recommended dissection technique to confirm air in the heart is:",
            options = listOf(
                "Opening the pericardial sac in situ, filling the pericardial cavity with water, and puncturing the right ventricle underwater to observe escaping air bubbles",
                "Removing the heart and weighing it dry",
                "Performing routine coronal brain sectioning first",
                "Injecting formalin into the aorta"
            ),
            correctOptionIndex = 0,
            explanation = "Air embolism confirmation requires underwater right ventricular puncture: The pericardium is incised, flooded with water, and the anterior wall of the right ventricle is punctured beneath the water level to observe escaping gas bubbles (and collected via aspirometer).",
            clinicalPearl = "Air embolism autopsy test: Puncture right ventricle underwater inside the flooded pericardial well.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "vig_21",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "Autopsy on an elderly bedridden patient with sudden respiratory collapse following femur fracture shows diffuse petechial hemorrhages on the chest, subconjunctival petechiae, and Sudan black-positive lipid globules plugging pulmonary and cerebral capillaries. This is:",
            options = listOf(
                "Fat Embolism Syndrome (FES)",
                "Amniotic fluid embolism",
                "Septic thromboembolism",
                "Air embolism"
            ),
            correctOptionIndex = 0,
            explanation = "Fat embolism syndrome occurs after long-bone fractures (femur/tibia). Marrow fat enters ruptured sinusoids and embolizes to the lungs and systemic circulation, causing acute respiratory distress, petechial rash, and encephalopathy (confirmed by oil red O or Sudan black staining on frozen sections).",
            clinicalPearl = "Fat Embolism Triad: Hypoxemia + Petechial rash (axilla/neck) + Neurological symptoms after long bone fracture.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_22",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A young female dies suddenly during labor. Autopsy reveals intense pulmonary vascular congestion, and histopathology of the lungs with Alcian blue staining demonstrates squamous squames, lanugo hair, and mucin in maternal pulmonary arterioles. The diagnosis is:",
            options = listOf(
                "Amniotic Fluid Embolism (AFE)",
                "Acute pulmonary thromboembolism",
                "Miliary tuberculosis",
                "Fat embolism"
            ),
            correctOptionIndex = 0,
            explanation = "Amniotic fluid embolism occurs when amniotic fluid containing fetal squamous cells, lanugo hairs, and vernix enters the maternal uterine venous sinusoids during labor, triggering catastrophic anaphylactoid shock, DIC, and pulmonary vasospasm.",
            clinicalPearl = "Amniotic fluid embolism: Fetal squames, mucin, and lanugo hairs found in maternal pulmonary microvasculature.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_23",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "At autopsy of an individual who fell from a height of 50 feet landing on their feet, which constellation of skeletal injuries is expected?",
            options = listOf(
                "Bilateral calcaneal (os calcis) fractures, pilon tibial fractures, compression fractures of T12-L2, and ring fracture of skull base",
                "Isolated mandibular fracture with no spinal lesions",
                "Isolated hyoid bone fracture",
                "Sternum fracture alone"
            ),
            correctOptionIndex = 0,
            explanation = "Vertical deceleration falls on feet transmit axial impact force sequentially upwards: Calcaneal crushing (Don Juan fracture) -> Tibial pilon fractures -> Femoral neck shearing -> Lumbar vertebral wedge compression (T12-L2) -> Ring fracture around the foramen magnum.",
            clinicalPearl = "Fall landing on feet: Calcaneus fracture -> Lumbar burst fracture -> Ring fracture of foramen magnum.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "vig_24",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "In an autopsy of a suspected case of Infanticide, the umbilical cord is examined. If mummification and separation of the umbilical stump with a healing circular ring of granulation tissue is present, the child survived for at least:",
            options = listOf(
                "5 to 7 days after birth",
                "Less than 5 minutes",
                "1 to 2 hours",
                "24 hours"
            ),
            correctOptionIndex = 0,
            explanation = "The umbilical cord withers and dries by day 2-3, and completely detaches with a granulating ring between day 5 to 7 post-delivery, proving prolonged survival beyond the immediate perinatal window.",
            clinicalPearl = "Umbilical cord timeline: Dries by 24–48 hrs; separates at 5–7 days with granulation ring; completely healed by 14 days.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "vig_25",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "A driver wearing an intact seatbelt in a side-impact vehicular collision presents with extensive lacerations of the liver and right hemidiaphragmatic tear, with fractured right 8th to 11th ribs. This pattern is primarily caused by:",
            options = listOf(
                "Intrusion of the vehicle door frame and lateral blunt crush against the right thoracic cage",
                "Airbag chemical detonation",
                "Pedal entrapment",
                "Sudden vertical acceleration"
            ),
            correctOptionIndex = 0,
            explanation = "In lateral (T-bone) collisions, direct cabin door encroachment crashes into the lateral chest wall, driving fractured lower ribs directly into the liver parenchyma (right side) or spleen (left side), with concomitant diaphragmatic rupture.",
            clinicalPearl = "Lateral collision side-impact: Door intrusion -> Lower rib fractures -> Liver laceration (right) or Spleen rupture (left).",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "vig_26",
            category = ForensicCategory.AUTOPSY_CASES,
            question = "Autopsy on a 35-year-old male with sudden collapse in a hot sauna reveals severe coronary atherosclerosis with 90% LAD stenosis, no acute thrombus, but marked contraction band necrosis on cardiac histology. Contraction band necrosis indicates:",
            options = listOf(
                "Early acute myocardial ischemia with subsequent reperfusion or intense catecholamine surge occurring 1 to 2 hours prior to death",
                "Chronic myocardial infarction older than 6 months",
                "Postmortem thermal artifact",
                "Normal non-ischemic myocardium"
            ),
            correctOptionIndex = 0,
            explanation = "Contraction band necrosis (wavy hypercontracted myofibrils with hyperdense eosinophilic bands) represents early ischemic injury followed by calcium influx during reperfusion or massive catecholamine stimulation, appearing within 1-2 hours of insult.",
            clinicalPearl = "Contraction band necrosis: Histological hallmark of early acute myocardial ischemia (1–2 hrs) or catecholamine cardiotoxicity.",
            difficulty = Difficulty.VIGNETTE,
            reference = "Knight's Forensic Pathology"
        )
    )
}
