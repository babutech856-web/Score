package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object AsphyxiaQuestions {
    val all: List<ForensicQuestion> = listOf(
        ForensicQuestion(
            id = "asph_01",
            category = ForensicCategory.ASPHYXIA,
            question = "The classic ligature mark in a case of typical complete hanging is characteristically described as:",
            options = listOf(
                "Circular, continuous, horizontal, and placed low down on the neck below the thyroid cartilage",
                "Oblique, non-continuous (interrupted at the knot), and situated high up on the neck above the thyroid cartilage",
                "Deeply parchmentized and uniformly horizontal across the cricoid ring",
                "Accompanied by extensive subcutaneous neck muscle lacerations in all cases"
            ),
            correctOptionIndex = 1,
            explanation = "In hanging, suspension traction pulls the ligature upwards, resulting in an inverted 'V'-shaped ligature mark that is oblique, situated high in the neck (above the thyroid cartilage), and interrupted at the site of the suspension knot. In strangulation, the mark is horizontal, circular, continuous, and located lower in the neck.",
            clinicalPearl = "Hanging mark: Oblique, high up, non-continuous (gap at knot). Strangulation mark: Horizontal, low down, continuous completely around neck.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_02",
            category = ForensicCategory.ASPHYXIA,
            question = "Tardieu spots are subpleural, subepicardial, and subconjunctival petechial hemorrhages caused primarily by:",
            options = listOf(
                "Acute rise in intra-capillary hydrostatic pressure and hypoxia-induced endothelial disruption",
                "Direct systemic toxicity from lactic acid build-up",
                "Postmortem gravity-dependent vascular pooling",
                "Bacterial invasion of capillary walls"
            ),
            correctOptionIndex = 0,
            explanation = "Tardieu spots are pin-head sized petechial hemorrhages resulting from acute veno-capillary engorgement and severe intraluminal pressure spikes combined with hypoxic damage to capillary endothelial tight junctions during violent expiratory efforts.",
            clinicalPearl = "Tardieu spots are a classic sign of mechanical asphyxia (subpleural, subpericardial, conjunctival, and facial petechiae).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_03",
            category = ForensicCategory.ASPHYXIA,
            question = "Fracture of the greater horn of the hyoid bone is most frequently observed in which form of violent asphyxial death?",
            options = listOf(
                "Manual strangulation (Throttling)",
                "Smothering with a soft pillow",
                "Positional asphyxia in postural entrapment",
                "Choking on a solid food bolus"
            ),
            correctOptionIndex = 0,
            explanation = "Manual strangulation (throttling) exerts intense localized, inward compressive finger-force directly onto the greater cornua of the hyoid bone and thyroid thyroid cartilage laminas, causing inward displacement fractures (especially in adults > 40 yrs where hyoid is ossified).",
            clinicalPearl = "Inward hyoid horn fracture is classic for Throttling (manual strangulation). In hanging, if fracture occurs, it is an outward avulsion fracture.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_04",
            category = ForensicCategory.ASPHYXIA,
            question = "The presence of fine, white, tenacious, odorless froth ('mushroom of froth') at the mouth and nostrils at autopsy is a hallmark sign of:",
            options = listOf(
                "Antemortem drowning",
                "Cyanide ingestion",
                "Carbon tetrachloride toxicity",
                "Postmortem putrefactive purging"
            ),
            correctOptionIndex = 0,
            explanation = "In drowning, violent respiratory efforts churn inhaled water, airway mucus, and pulmonary surfactant into a fine, tenacious, white or pinkish-white froth ('mushroom of froth' or mousse écumeuse) that emerges from the respiratory orifices and increases on wiping.",
            clinicalPearl = "Mushroom of froth at mouth/nostrils = Inhaled water + Airway mucus + Surfactant churning during violent antemortem drowning gasps.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_05",
            category = ForensicCategory.ASPHYXIA,
            question = "Which laboratory investigation is the gold standard for confirming antemortem drowning in a decomposed body recovered from water?",
            options = listOf(
                "Diatom test in closed bone marrow (femur or sternum)",
                "Gettler's chloride test in cardiac chambers",
                "Blood alcohol estimation",
                "Alkaline phosphatase activity in liver tissue"
            ),
            correctOptionIndex = 0,
            explanation = "Diatoms (microscopic unicellular algae with silica shells) present in inhaled water cross alveolar-capillary membranes during active antemortem circulation and embolize to closed distant organs like the bone marrow (femur/tibia). Finding diatoms in closed bone marrow proves antemortem drowning.",
            clinicalPearl = "Diatom test: Diatoms in closed organs (femur marrow/kidney) = definitive proof of antemortem drowning; diatoms in lung tissue alone can occur postmortem.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_06",
            category = ForensicCategory.ASPHYXIA,
            question = "Paltauf's hemorrhages observed at postmortem examination are found in:",
            options = listOf(
                "Subpleural spaces of the lungs in drowning victims due to alveolar rupture",
                "The temporal lobe cortex in manual throttling",
                "The posterior wall of the urinary bladder in hanging",
                "The mucosal lining of the stomach in hypothermia"
            ),
            correctOptionIndex = 0,
            explanation = "Paltauf's hemorrhages are large, ill-defined, pale reddish-brown subpleural hemorrhages seen on the lung surfaces in drowning (emphysema aquosum) caused by violent overdistension and rupture of alveolar walls and subpleural capillaries.",
            clinicalPearl = "Paltauf's spots = Subpleural ecchymoses on overdistended 'emphysema aquosum' lungs in drowning.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_07",
            category = ForensicCategory.ASPHYXIA,
            question = "Simon's sign (Simon's hemorrhages) in hanging refers to:",
            options = listOf(
                "Petechial hemorrhages along the anterior longitudinal ligament and intervertebral discs of the lumbar/cervical spine",
                "Subconjunctival flame hemorrhages in ligature strangulation",
                "Fracture of the cricoid cartilage ring with posterior displacement",
                "Tear of the carotid intima (Amussat's sign)"
            ),
            correctOptionIndex = 0,
            explanation = "Simon's sign consists of hemorrhages beneath the anterior longitudinal ligament of the lumbar spine (L2-L5) and intervertebral discs. It is produced by violent stretching and convulsions of the suspended body against gravitational traction.",
            clinicalPearl = "Simon's sign = Lumbar intervertebral anterior disc hemorrhages in hanging. Amussat's sign = Carotid intimal transverse tears.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_08",
            category = ForensicCategory.ASPHYXIA,
            question = "Transverse intimal tears of the common carotid arteries observed on neck dissection in judicial or suspension hanging are named:",
            options = listOf(
                "Amussat's sign",
                "Simon's sign",
                "Paltauf's sign",
                "Kevorkian's sign"
            ),
            correctOptionIndex = 0,
            explanation = "Amussat's sign consists of horizontal, transverse tears in the intima of the common carotid arteries beneath the ligature site in hanging, caused by sudden severe stretching and compression of the artery.",
            clinicalPearl = "Amussat's sign = Carotid intimal tears. Martin's sign = Adventitial hemorrhages. Otto's sign = Intimal tears in internal jugular veins.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_09",
            category = ForensicCategory.ASPHYXIA,
            question = "Burking is a method of homicidal asphyxia that combines which two mechanisms?",
            options = listOf(
                "Smothering (covering nose and mouth) combined with Traumatic (Crush) asphyxia (kneeling on the victim's chest)",
                "Ligature strangulation combined with drowning in a tub",
                "Hanging combined with cyanide poisoning",
                "Choking with cloth bolus and decapitation"
            ),
            correctOptionIndex = 0,
            explanation = "Burking (originated by Burke and Hare in 1828) combines closure of external respiratory orifices (smothering with hands) with thoracic fixation/compression (sitting or kneeling on the victim's chest), leaving minimal external signs of violence.",
            clinicalPearl = "Burking = Smothering (external orifice occlusion) + Traumatic chest compression (fixation).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_10",
            category = ForensicCategory.ASPHYXIA,
            question = "Traumatic (Crush) asphyxia (Perthes' syndrome / Masque ecchymotique) is characterized by:",
            options = listOf(
                "Intense purpuric cyanosis, edema, and countless petechiae over the face, neck, and upper chest with clear line of demarcation",
                "Complete pallor of the entire head and neck",
                "Deep knife lacerations along the intercostal nerves",
                "Immediate hypothermia and frostbite changes"
            ),
            correctOptionIndex = 0,
            explanation = "Traumatic asphyxia occurs when severe mechanical compression of the chest/abdomen (crowd crush, vehicular pinning, collapsed trench) forces blood backwards from the right atrium through the valveless superior vena cava and head/neck veins, producing intense dark purple discoloration and petechiae (masque ecchymotique).",
            clinicalPearl = "Perthes syndrome / Masque ecchymotique: Striking purple-blue head/neck congestion and subconjunctival hemorrhages with sharp demarcation at clavicular line.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_11",
            category = ForensicCategory.ASPHYXIA,
            question = "A dry drowning occurs in approximately 10–15% of submersion fatalities and is physiologically caused by:",
            options = listOf(
                "Severe intense laryngeal spasm (laryngospasm) triggered by cold water touching the glottis, preventing water from entering lungs",
                "Rapid evaporation of water in pulmonary alveoli",
                "Immediate coronary air embolism",
                "Direct ingestion of water into the stomach without inhalation"
            ),
            correctOptionIndex = 0,
            explanation = "In 'dry drowning', cold water contacting the sensitive laryngeal mucosa triggers intense reflex vagal laryngospasm. The vocal cords clamp shut, causing asphyxial hypoxia and cardiac arrest with virtually no water entering the lower bronchial tree or alveoli.",
            clinicalPearl = "Dry drowning = Asphyxia secondary to severe persistent reflex laryngospasm with dry lungs at autopsy.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_12",
            category = ForensicCategory.ASPHYXIA,
            question = "Bansdola is an Indian method of homicidal mechanical asphyxia characterized by:",
            options = listOf(
                "Compression of the neck between two strong wooden or bamboo poles tied together",
                "Immersion of the head in boiling oil",
                "Hanging using wire rope from tree branches",
                "Forcible feeding of dry cotton seeds"
            ),
            correctOptionIndex = 0,
            explanation = "Bansdola (or bamboo throttling) is a homicidal practice where the victim's neck or chest is placed between two strong bamboo poles, and the ends are tied tightly together or stood upon, crushing cervical structures and suffocating the victim.",
            clinicalPearl = "Bansdola = Compressive asphyxia using two strong wooden/bamboo sticks tied together.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_13",
            category = ForensicCategory.ASPHYXIA,
            question = "The minimum tension/traction required in a ligature to compress the jugular veins, carotid arteries, and vertebral arteries respectively in an adult is approximately:",
            options = listOf(
                "2 kg for Jugular veins, 5 kg for Carotid arteries, and 15–30 kg for Vertebral arteries",
                "20 kg for Jugular veins, 50 kg for Carotids, and 100 kg for Vertebrals",
                "Equal 10 kg for all vessels",
                "1 kg for all neck vessels"
            ),
            correctOptionIndex = 0,
            explanation = "Vascular occlusion pressures in the neck: Jugular veins = ~2 kg (complete venous blockage -> intense facial congestion); Carotid arteries = ~5 kg (brain ischemia); Trachea = ~15 kg; Vertebral arteries = ~15–30 kg (complete cessation of cerebral flow).",
            clinicalPearl = "Only 2 kg of pressure is needed to occlude jugular veins, 5 kg for carotids, explaining why partial suspension (feet on floor) easily causes death.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_14",
            category = ForensicCategory.ASPHYXIA,
            question = "Autoerotic asphyxia (sexual asphyxia / hypoxyphilia) is characterized at the death scene by all of the following EXCEPT:",
            options = listOf(
                "Evidence of solo sexual activity and pornography or cross-dressing props",
                "A release mechanism or escape failsafe that failed to operate",
                "A detailed suicidal note left openly explaining motive",
                "Padding or towels placed under the neck ligature to prevent bruising or pain"
            ),
            correctOptionIndex = 2,
            explanation = "Autoerotic asphyxia is an accidental death resulting from induced cerebral hypoxia during masturbation. Characteristic scene findings: solitary male, complex rigging/escape mechanism that malfunctioned, erotic props, padding under neck rope, and ABSENCE of suicide notes.",
            clinicalPearl = "Autoerotic deaths are classified as ACCIDENTS; finding a suicide note rules out pure autoerotic misadventure.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_15",
            category = ForensicCategory.ASPHYXIA,
            question = "Garrowing (Garrotting) historically refers to homicidal strangulation produced by:",
            options = listOf(
                "Tightening a ligature or iron collar around the neck using a twisted stick or Spanish tourniquet lever from behind",
                "Stamping on the larynx with combat boots",
                "Suffocation by throwing dry sand into airway",
                "Immersing face in petroleum"
            ),
            correctOptionIndex = 0,
            explanation = "Garrotting is a form of ligature strangulation where a rope, cloth, or metal band around the neck is tightened by twisting a short stick inserted into the loop (Spanish windlass mechanism) or by an iron collar screw.",
            clinicalPearl = "Garrotting = Mechanical ligature strangulation tightened with a lever/stick (tourniquet method).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_16",
            category = ForensicCategory.ASPHYXIA,
            question = "In mechanical asphyxia, the classical physiological triad (Asphyxial Triad) seen at external autopsy consists of:",
            options = listOf(
                "Cyanosis, Petechial hemorrhages, and Visceral vascular congestion with fluidity of blood",
                "Pallor, Rigor mortis, and Jaundice",
                "Adipocere, Mummification, and Cutis anserina",
                "Massive subcutaneous emphysema, Alopecia, and Epistaxis"
            ),
            correctOptionIndex = 0,
            explanation = "The classic signs of mechanical asphyxia are: 1) Cyanosis (dark blue-purple discoloration), 2) Petechial hemorrhages (Tardieu spots on conjunctive/pleura/pericardium), and 3) Generalized venous congestion with postmortem fluidity of blood (due to high fibrinolysin).",
            clinicalPearl = "Asphyxial Triad: Cyanosis + Petechiae + Dark fluid blood with visceral engorgement.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_17",
            category = ForensicCategory.ASPHYXIA,
            question = "Cafe Coronary refers to sudden fatal asphyxia caused by:",
            options = listOf(
                "Impaction of a large unchewed bolus of meat or food at the laryngeal inlet, causing acute choking and reflex vagal arrest",
                "Caffeine toxicity from multiple espresso drinks",
                "Acute coronary thrombosis while dining at a restaurant",
                "Carbon monoxide leak in a coffeehouse"
            ),
            correctOptionIndex = 0,
            explanation = "A 'Café Coronary' occurs when an intoxicated, edentulous, or rushed individual accidentally aspirates a large piece of solid meat/food, occluding the larynx. The victim suddenly clutches their throat, becomes aphonic, collapses, and is often mistakenly assumed to have suffered a myocardial infarction.",
            clinicalPearl = "Cafe Coronary = Food bolus obstruction of the laryngeal inlet; victim displays Universal Choking Sign (clutching throat).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_18",
            category = ForensicCategory.ASPHYXIA,
            question = "Cutis anserina (goose-skin appearance) observed in bodies recovered from water is produced by:",
            options = listOf(
                "Rigor mortis or cold contracture of the arrector pili muscles of hair follicles",
                "Direct microscopic diatom penetration into sweat ducts",
                "Decomposition gas expanding intradermal blisters",
                "Subcutaneous adipose saponification"
            ),
            correctOptionIndex = 0,
            explanation = "Cutis anserina (goose flesh) is the contraction of the microscopic arrector pili muscles, elevating the hair follicles and puckering the skin. It occurs when cold water induces muscle contraction or when rigor mortis sets in while submerged.",
            clinicalPearl = "Cutis anserina = Arrector pili spasm due to cold exposure or rigor mortis in aquatic environments.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_19",
            category = ForensicCategory.ASPHYXIA,
            question = "Washerwoman's skin (bleaching, wrinkling, and maceration of the epidermis of palms and soles) in water immersion indicates:",
            options = listOf(
                "Prolonged physical immersion in water (antemortem or postmortem)",
                "Conclusive proof that death occurred by antemortem drowning",
                "High electrical voltage current in water",
                "Contact with toxic corrosive acids"
            ),
            correctOptionIndex = 0,
            explanation = "Washerwoman's hands/feet (aquatic maceration) is purely a physical phenomenon caused by water imbibition into thick stratum corneum of palms and soles. It occurs whether the body was dead or alive when entering water and helps estimate duration of immersion.",
            clinicalPearl = "Washerwoman's changes = Prolonged water contact (takes 1-3 hrs for fingers, 12-24 hrs for whole palm/sole); does NOT prove drowning.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_20",
            category = ForensicCategory.ASPHYXIA,
            question = "Hydrocution (Submersion inhibition) is a type of drowning death mediated by:",
            options = listOf(
                "Sudden fatal vagal reflex cardiac arrest when cold water unexpectedly enters the nasopharynx or strikes the epigastrium / tympanic membrane",
                "Massive pulmonary alveolar rupture from high water salinity",
                "Hypocalcemic tetany in deep ocean trenches",
                "Cerebral edema secondary to freshwater hemodilution"
            ),
            correctOptionIndex = 0,
            explanation = "Hydrocution (submersion inhibition) is instantaneous vagal cardiac arrest triggered when cold water touches the hyper-sensitive trigeminal/glossopharyngeal receptors in the nasopharynx, eardrum, or larynx, with death occurring before any water is aspirated into lungs.",
            clinicalPearl = "Hydrocution = Instant reflex vagal cardiac arrest on diving into cold water (true dry lung submersion).",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_21",
            category = ForensicCategory.ASPHYXIA,
            question = "In freshwater drowning versus saltwater drowning, freshwater aspiration causes:",
            options = listOf(
                "Massive hemodilution, severe intravascular hemolysis, and fatal hyperkalemia-induced ventricular fibrillation",
                "Hypertonic pulmonary edema and hemoconcentration",
                "Extreme hypernatremia without hemolysis",
                "Immediate pleural space fluid accumulation"
            ),
            correctOptionIndex = 0,
            explanation = "Freshwater is hypotonic compared to blood. When aspirated into alveoli, water rapidly enters the pulmonary circulation via osmosis, causing massive hemodilution (50% increase in blood volume), RBC lysis, release of intracellular potassium (hyperkalemia), and ventricular fibrillation within 2-4 minutes.",
            clinicalPearl = "Freshwater = Hypotonic -> Hemodilution -> Hemolysis -> Hyperkalemia -> VFib. Saltwater = Hypertonic -> Pulmonary Edema -> Hypovolemia -> Asphyxia.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_22",
            category = ForensicCategory.ASPHYXIA,
            question = "Wydler's sign in drowning refers to:",
            options = listOf(
                "The presence of aspirated water, froth, and foreign sand particles in the stomach and duodenum",
                "Stratification of stomach contents into three distinct layers (foam, clear fluid, and solid debris) on standing",
                "Fracture of the hyoid bone during underwater struggle",
                "Bilateral subpleural petechiae"
            ),
            correctOptionIndex = 1,
            explanation = "Wydler's sign is the postmortem finding where stomach contents retrieved from a drowning victim separate into three distinct layers on standing in a glass jar: upper frothy mucus layer, middle clear watery fluid layer, and bottom sediment/food debris layer.",
            clinicalPearl = "Wydler's Sign: 3-layer stratification of stomach contents (foam, fluid, solids) confirming swallowed drowning fluid.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_23",
            category = ForensicCategory.ASPHYXIA,
            question = "Positional asphyxia occurs when:",
            options = listOf(
                "A person's body position compromises airway patency or restricts respiratory chest movements, and they are unable to extricate themselves (e.g., severe intoxication or entrapment)",
                "A ligature is tied around the throat while sitting down",
                "The subject is hanged by the feet in an upside-down posture",
                "Water is aspirated while in the supine position"
            ),
            correctOptionIndex = 0,
            explanation = "Positional (postural) asphyxia occurs when an individual (frequently intoxicated with alcohol, sedated, or restrained) is trapped in a head-down or jackknifed posture that obstructs upper airways or impedes diaphragmatic/thoracic excursion, leading to slow hypoxia without external violence.",
            clinicalPearl = "Positional asphyxia: Impaired respiration solely due to body posture + inability to escape (alcohol/drugs/physical entrapment).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "asph_24",
            category = ForensicCategory.ASPHYXIA,
            question = "Emphysema aquosum in drowning lungs is characterized by:",
            options = listOf(
                "Lungs that are voluminous, heavy, waterlogged, ballooning out of the thoracic cavity, with rib indentations on their pleural surfaces",
                "Lungs that are shrunken, collapsed, and completely dry",
                "Extensive bilateral calcification of lung apexes",
                "Multiple cavernous fungal balls in upper lobes"
            ),
            correctOptionIndex = 0,
            explanation = "Emphysema aquosum is the overinflated, sponge-like, edematous appearance of lungs in typical wet drowning. The lungs fill the pleural cavities, overlap the pericardium, imprint the ribs, and pit on pressure.",
            clinicalPearl = "Emphysema aquosum = Voluminous, waterlogged, heavy lungs with rib markings and crepitus.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "asph_25",
            category = ForensicCategory.ASPHYXIA,
            question = "In homicidal smothering (closure of mouth and nostrils), what external injuries are most characteristically looked for on facial examination?",
            options = listOf(
                "Contusions and lacerations of the inner mucosal surface of the lips pressed against teeth, with crescentic fingernail scratches on nose/cheeks",
                "Deep linear transverse knife slashes across the zygoma",
                "Stellate burns from propellant discharge",
                "Amussat's tears in the carotid sheath"
            ),
            correctOptionIndex = 0,
            explanation = "When a hand is forcibly pressed over the mouth and nose to smother, the lips are crushed against the incisor teeth, producing inner mucosal bruising/tearing. Fingernails of the assailant often leave curved, crescentic abrasions around the nostrils, cheeks, and chin.",
            clinicalPearl = "Smothering hallmarks: Inner labial bruises/lacerations from tooth impact + Crescentic fingernail marks around nose/mouth.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "asph_26",
            category = ForensicCategory.ASPHYXIA,
            question = "Judicial hanging (long-drop hanging) causes instantaneous death primarily through:",
            options = listOf(
                "Fracture-dislocation of the cervical spine (Hangman's fracture of C2 axis pedicles) and transection of the cervicomedullary junction",
                "Slow hypoxemia over 10 minutes",
                "Complete tracheal rupture with air embolism",
                "Subdural hematoma over the occipital lobe"
            ),
            correctOptionIndex = 0,
            explanation = "Judicial hanging uses a calculated drop height based on body weight to generate sufficient kinetic force to hyperextend and distract the head, causing bilateral fracture of the C2 axis pedicles (Hangman's fracture) and snapping the upper cervical spinal cord and brainstem.",
            clinicalPearl = "Long-drop hanging = Hangman's fracture (bilateral C2 pars fracture) + Cervicomedullary cord transection -> instant death.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        )
    )
}
