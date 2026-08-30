package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object IdentificationQuestions {
    val all: List<ForensicQuestion> = listOf(
        ForensicQuestion(
            id = "ident_01",
            category = ForensicCategory.IDENTIFICATION,
            question = "The Galton system of fingerprint classification categorizes primary friction ridge patterns into which basic groups?",
            options = listOf(
                "Loops, Whorls, and Arches (with Composites)",
                "Porous, Non-porous, and Plastic ridges",
                "Linear, Bifurcated, and Island lines",
                "Radial, Sagittal, and Coronal grooves"
            ),
            correctOptionIndex = 0,
            explanation = "Sir Francis Galton identified the three major fingerprint pattern categories: Loops (60–65%), Whorls (30–35%), and Arches (5%). Edward Henry later refined the system into the Henry Classification System.",
            clinicalPearl = "Friction ridge frequency: Loops (60-65%) > Whorls (30-35%) > Arches (5%). Friction ridges never change from intrauterine life until decomposition (permanence & uniqueness).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_02",
            category = ForensicCategory.IDENTIFICATION,
            question = "Which single bone in the adult human skeleton provides the highest statistical accuracy (> 95%) for biological sex determination?",
            options = listOf(
                "The pelvis (os coxae / hip bone)",
                "The cranium (skull)",
                "The femur",
                "The clavicle"
            ),
            correctOptionIndex = 0,
            explanation = "The human pelvis is the most sexually dimorphic bone due to evolutionary adaptations for childbirth in females. Pelvis alone yields > 95% accuracy in sex determination; Skull alone yields ~85-90%; Pelvis + Skull combined achieves > 98% accuracy.",
            clinicalPearl = "Sex determination hierarchy: Pelvis alone (~95%) > Skull alone (~90%) > Long bones (~80%). Combined pelvis + skull > 98%.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_03",
            category = ForensicCategory.IDENTIFICATION,
            question = "Gustafson's method is widely utilized in forensic odontology for estimating the age of an adult individual using which six dental criteria?",
            options = listOf(
                "Attrition, Periodontitis, Secondary dentin, Cementum apposition, Root resorption, and Root translucency",
                "Cusp number, Enamel thickness, Dental caries, Gingival recession, Plaque, and Tartar",
                "Eruption sequence, Root canal width, Fluorosis index, Bite marks, Malocclusion, and Crown diameter",
                "Deciduous shedding, Third molar impaction, Decalcification, Odontoma, Palatal rugae, and Diastema"
            ),
            correctOptionIndex = 0,
            explanation = "Gustafson's formula evaluates 6 regressive histological changes in teeth scored from 0 to 3: Attrition (A), Periodontosis (P), Secondary dentin (S), Cementum apposition (C), Root resorption (R), and Root transparency/translucency (T).",
            clinicalPearl = "Gustafson's Dental Ageing formula: A + P + S + C + R + T. Root translucency (T) is the single most reliable parameter among the six.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_04",
            category = ForensicCategory.IDENTIFICATION,
            question = "The subpubic angle in an adult female pelvis is characteristically:",
            options = listOf(
                "Wide, obtuse, rounded (> 90 to 100 degrees, U-shaped)",
                "Narrow, acute (< 70 degrees, V-shaped)",
                "Exactly 45 degrees",
                "Inverted and linear"
            ),
            correctOptionIndex = 0,
            explanation = "Female subpubic angle is wide, obtuse (> 90-100 degrees, U-shaped or rounded) to facilitate fetal head descent. In males, the subpubic angle is narrow, acute (< 70 degrees, inverted V-shaped).",
            clinicalPearl = "Pelvic Subpubic Angle: Female = Wide (> 90°, U-shaped). Male = Acute (< 70°, V-shaped). Greater sciatic notch is also wider and shallower in females.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_05",
            category = ForensicCategory.IDENTIFICATION,
            question = "Cheiloscopy is the forensic study of:",
            options = listOf(
                "Lip prints (wrinkles and grooves on the labial mucosa)",
                "Palatal rugae patterns on the hard palate",
                "Friction ridge skin on the soles of feet",
                "Retinal vascular branch bifurcations"
            ),
            correctOptionIndex = 0,
            explanation = "Cheiloscopy (Suzuki and Tsuchihashi classification) is the forensic analysis of unique individual patterns of elevations and depressions forming lines on the red portion of human lip mucosa (lip prints).",
            clinicalPearl = "Cheiloscopy = Lip prints. Rugoscopy = Palatal rugae. Dactyloscopy = Fingerprints. Poroscopy = Sweat pore distribution along ridges (Locard).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_06",
            category = ForensicCategory.IDENTIFICATION,
            question = "Locard's method of identification using the microscopic size, shape, and spatial distribution of sweat gland pores along papillary ridges is known as:",
            options = listOf(
                "Poroscopy",
                "Edgeoscopy",
                "Rugoscopy",
                "Dactyloscopy"
            ),
            correctOptionIndex = 0,
            explanation = "Poroscopy, established by Edmond Locard in 1912, is the forensic study of sweat pores along friction ridges. Even fragmentary friction impressions lacking core/delta patterns can be individualized by pore count, diameter, and arrangement (20-40 pores per mm).",
            clinicalPearl = "Poroscopy = Sweat gland pore patterns along ridges; Poroscopy + Edgeoscopy enable identification from tiny friction fragments.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_07",
            category = ForensicCategory.IDENTIFICATION,
            question = "The first permanent tooth to erupt in the oral cavity in a child is usually the:",
            options = listOf(
                "First permanent molar (at approximately 6 years of age)",
                "Central permanent incisor",
                "First premolar",
                "Canine"
            ),
            correctOptionIndex = 0,
            explanation = "The first permanent molar ('6-year molar') erupts around 6 years of age behind the second deciduous molar without replacing any baby tooth. Central incisors erupt around 7 years.",
            clinicalPearl = "Dental Eruption Mnemonic: 6 yrs = 1st permanent molar; 7 yrs = Central incisor; 8 yrs = Lateral incisor; 12 yrs = 2nd molar; 18-25 yrs = 3rd molar (wisdom tooth).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_08",
            category = ForensicCategory.IDENTIFICATION,
            question = "In forensic anthropology, Trotter and Gleser regression equations are used to estimate:",
            options = listOf(
                "Stature (living height) of an unknown individual from the length of long dry bones",
                "Age from cranial suture closure",
                "Time since death from soil pH",
                "Body weight from pelvic diameter"
            ),
            correctOptionIndex = 0,
            explanation = "Trotter and Gleser developed standardized mathematical regression formulae that calculate living stature with high precision based on the maximum anatomical length of long bones (Femur, Tibia, Fibula, Humerus, Radius, Ulna).",
            clinicalPearl = "Stature estimation: Femur and Tibia provide the most accurate correlation with living height using Trotter-Gleser tables.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_09",
            category = ForensicCategory.IDENTIFICATION,
            question = "Which ossification center present at birth in a full-term infant is the most critical medicolegal landmark of fetal maturity on autopsy radiography?",
            options = listOf(
                "Distal femoral epiphysis (appears at 36 weeks / 9th month of gestation)",
                "Proximal tibial epiphysis (appears at 38–40 weeks)",
                "Calcaneus (appears at 5–6 months gestation)",
                "Capitate bone of wrist"
            ),
            correctOptionIndex = 0,
            explanation = "The ossification center of the lower end of the femur (distal femoral epiphysis) appears at 36 weeks of intrauterine life (9th intrauterine month). Its presence confirms a viable, full-term fetus (> 2.5 kg).",
            clinicalPearl = "Fetal maturity milestones: Calcaneus (5-6 mos), Talus (7-8 mos), Distal femur (36 wks / 9 mos), Proximal tibia (40 wks / at birth).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_10",
            category = ForensicCategory.IDENTIFICATION,
            question = "Haas's rule for fetal age estimation calculates the crown-heel length (in centimeters) during the first 5 months of intrauterine pregnancy as:",
            options = listOf(
                "Square of the month in gestation (Month^2 = Length in cm)",
                "Month multiplied by 5 (Month x 5 = Length in cm)",
                "Month divided by 2",
                "Month plus 10"
            ),
            correctOptionIndex = 0,
            explanation = "Haas's (Hesse's) Rule: In the first 5 lunar months, Crown-Heel Length in cm = (Month)^2 (e.g., 3 months = 9 cm; 5 months = 25 cm). From month 6 to 10, Length in cm = Month x 5 (e.g., 7 months = 35 cm; 10 months = 50 cm).",
            clinicalPearl = "Hesse's Rule for Fetal Length: Months 1–5 = (Month)^2; Months 6–10 = Month * 5 cm.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_11",
            category = ForensicCategory.IDENTIFICATION,
            question = "The closure of the sagittal cranial suture typically begins on the endocranial surface around what age in adults?",
            options = listOf(
                "20 to 30 years (starting at the Obelion point)",
                "10 to 12 years",
                "45 to 55 years",
                "70 to 80 years"
            ),
            correctOptionIndex = 0,
            explanation = "Endocranial vault suture closure starts with the sagittal suture at the pars obelica around 20-30 years of age, followed by coronal (24-38 yrs) and lambdoid (26-42 yrs). Complete ectocranial obliteration occurs later (30-60 yrs).",
            clinicalPearl = "Cranial Suture Closure Sequence: Sagittal (starts ~22 yrs) -> Coronal (starts ~24 yrs) -> Lambdoid (starts ~26 yrs).",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_12",
            category = ForensicCategory.IDENTIFICATION,
            question = "The Krogman and Iscan pubic symphysis method for adult age determination evaluates:",
            options = listOf(
                "Metamorphosis of the pubic symphyseal face from youthful billowing ridges to an oval depression with rim deterioration (Todd / Suchey-Brooks phases)",
                "Length of the ischial tuberosity in centimeters",
                "Mineral density of the iliac crest",
                "Number of nutrient foramina in the acetabulum"
            ),
            correctOptionIndex = 0,
            explanation = "The Suchey-Brooks and Todd methods evaluate progressive remodeling of the pubic symphyseal face across 6 phases (from transverse ridges/billows in young adults age 18-24, progressing to flat oval rim and osteophytic depression in elderly > 50).",
            clinicalPearl = "Suchey-Brooks Pubic Symphysis method is one of the most reliable skeletal age indicators in adults aged 20 to 50 years.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_13",
            category = ForensicCategory.IDENTIFICATION,
            question = "Bertillonage (Anthropometry), established by Alphonse Bertillon in 1882, relied on:",
            options = listOf(
                "Eleven standardized anatomical measurements of the adult skeleton combined with morphological portrait parlé",
                "Friction ridge pattern fingerprinting",
                "ABO blood typing and secretor status",
                "Dental bite mark impressions in wax"
            ),
            correctOptionIndex = 0,
            explanation = "Bertillonage recorded 11 precise bodily measurements (head length/width, left middle finger length, cubit, foot length, standing/sitting height) based on the premise that adult skeletal dimensions remain fixed after age 20. It was replaced by fingerprinting after the famous Will West / William West case.",
            clinicalPearl = "Bertillonage: 11 body measurements + Portrait parlé. Replaced worldwide by the Henry fingerprint system.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_14",
            category = ForensicCategory.IDENTIFICATION,
            question = "The 'Will West and William West' incident in Leavenworth Penitentiary (1903) was a landmark event that historically demonstrated:",
            options = listOf(
                "The fatal inaccuracy and limitation of Bertillon anthropometry when two unrelated individuals had identical measurements, leading to the universal adoption of fingerprints",
                "The first use of DNA profiling in court",
                "The invalidity of dental bite marks",
                "The invention of automated fingerprint AFIS"
            ),
            correctOptionIndex = 0,
            explanation = "Will West and William West were two completely unrelated prison inmates with nearly identical facial features and identical Bertillon measurements. Only their fingerprints were clearly distinct, demonstrating the superiority of fingerprinting.",
            clinicalPearl = "The West Brothers case proved that Bertillon anthropometry was unreliable, prompting worldwide transition to fingerprint identification.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_15",
            category = ForensicCategory.IDENTIFICATION,
            question = "In forensic serology and bloodstain analysis, the Kastle-Meyer test uses phenolphthalein to detect the presence of:",
            options = listOf(
                "Peroxidase-like catalytic activity of hemoglobin in suspected blood",
                "Alpha-fetoprotein in fetal serum",
                "Amylase enzyme in saliva stains",
                "Choline crystals in seminal fluid"
            ),
            correctOptionIndex = 0,
            explanation = "The Kastle-Meyer test is a presumptive chemical test for blood. Hemoglobin's heme group exhibits peroxidase activity, catalyzing the oxidation of reduced colorless phenolphthalin to bright pink phenolphthalein in the presence of hydrogen peroxide.",
            clinicalPearl = "Kastle-Meyer Test: Colorless phenolphthalin + H2O2 + Heme -> Immediate Pink Color (Presumptive blood test).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_16",
            category = ForensicCategory.IDENTIFICATION,
            question = "The Takayama and Teichmann crystal tests are classified as:",
            options = listOf(
                "Confirmatory microcrystalline tests for blood (Hemochromogen and Hemin crystals)",
                "Presumptive saliva tests",
                "Gunpowder residue tests",
                "Urine screening tests"
            ),
            correctOptionIndex = 0,
            explanation = "Teichmann's test forms rhombic brown Hemin (hematin chloride) crystals with NaCl and glacial acetic acid. Takayama's test forms salmon-pink feathery pyridine Hemochromogen crystals with pyridine and glucose under the microscope, providing confirmatory visual proof of blood.",
            clinicalPearl = "Confirmatory Blood Tests: Teichmann test = Brown rhombic Hemin crystals; Takayama test = Pink needle/feathery Hemochromogen crystals.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_17",
            category = ForensicCategory.IDENTIFICATION,
            question = "Which enzyme assay is most widely used in forensic laboratories to confirm the presence of human seminal fluid in sexual assault evidence?",
            options = listOf(
                "Prostatic Acid Phosphatase (AP / Walker Test) and Prostate-Specific Antigen (p30 / PSA)",
                "Salivary amylase",
                "Lactate dehydrogenase isoform 1",
                "Creatine kinase BB"
            ),
            correctOptionIndex = 0,
            explanation = "Human semen contains high concentrations of Prostatic Acid Phosphatase (tested via Brentamine fast blue reaction) and Prostate-Specific Antigen (p30 / PSA), which can be detected even in aspermic/vasectomized individuals.",
            clinicalPearl = "Seminal fluid identification: Acid Phosphatase (AP test) = Presumptive; p30 (PSA) & Spermatozoa on Christmas tree stain = Confirmatory.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_18",
            category = ForensicCategory.IDENTIFICATION,
            question = "In Short Tandem Repeat (STR) multiplex DNA profiling, the amelogenin gene locus is analyzed specifically to determine:",
            options = listOf(
                "The biological sex (X chromosome allele = 106 bp; Y chromosome allele = 112 bp)",
                "The geographic continental ancestry",
                "The approximate age of the biological donor",
                "Eye color and hair pigmentation"
            ),
            correctOptionIndex = 0,
            explanation = "The amelogenin gene resides on both X and Y chromosomes but contains a 6-base pair deletion on the X chromosome. PCR amplification yields a single peak in females (X,X) and two distinct peaks in males (X,Y).",
            clinicalPearl = "Amelogenin gene locus on STR DNA: One peak (X) = Female. Two peaks (X and Y) = Male.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_19",
            category = ForensicCategory.IDENTIFICATION,
            question = "Mitochondrial DNA (mtDNA) is uniquely valuable in forensic identification of severely degraded or ancient skeletal remains because:",
            options = listOf(
                "It is present in thousands of copies per cell and is inherited strictly along the maternal lineage without recombination",
                "It has a higher mutation rate that changes every generation",
                "It encodes nuclear ribosomal RNA",
                "It can only be extracted from living leukocytes"
            ),
            correctOptionIndex = 0,
            explanation = "Unlike nuclear DNA (2 copies/cell), mitochondria contain hundreds to thousands of circular mtDNA copies per cell. MtDNA is inherited maternally intact, allowing comparison with any maternal relative across multiple generations.",
            clinicalPearl = "mtDNA: Maternal inheritance + High copy number per cell (ideal for charred/ancient bones and telogen hair shafts lacking roots).",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_20",
            category = ForensicCategory.IDENTIFICATION,
            question = "In forensic anthropology, which cranial feature is most indicative of a male skull compared to a female skull?",
            options = listOf(
                "Prominent supraorbital ridges, large mastoid processes, square chin (mental protuberance), and rugged nuchal crest",
                "Smooth vertical forehead with prominent frontal bossing and sharp supraorbital margins",
                "Small, pointed mental protuberance and obtuse gonial angle (> 125°)",
                "Thin, gracile zygomatic arches"
            ),
            correctOptionIndex = 0,
            explanation = "Male skulls exhibit heavy muscular robusticity: prominent brow ridges (glabella), large mastoid processes, square/broad mandible with robust gonial eversion, and rugged nuchal occipital crest. Female skulls have smooth frontal bossing, sharp orbital rims, and pointed chins.",
            clinicalPearl = "Skull Sex: Male = Robust, prominent brow ridge, massive mastoid, square chin. Female = Gracile, smooth forehead, sharp orbital rims.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_21",
            category = ForensicCategory.IDENTIFICATION,
            question = "The fusion of the medial epiphysis of the clavicle (sternal end) is a critical forensic age indicator in young adults because it fuses between:",
            options = listOf(
                "21 to 25 years of age",
                "12 to 14 years of age",
                "16 to 18 years of age",
                "35 to 40 years of age"
            ),
            correctOptionIndex = 0,
            explanation = "The medial epiphysis of the clavicle is the last long-bone epiphysis in the human body to complete bony fusion (starts uniting at 18-20 yrs, complete solid fusion by 21-25 yrs), making it essential for determining whether an individual is over the age of majority (18 or 21).",
            clinicalPearl = "Medial clavicular epiphysis: Complete fusion at 21-25 years; vital for confirming 21-year legal milestone in skeletal analysis.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_22",
            category = ForensicCategory.IDENTIFICATION,
            question = "Superimposition technique in forensic facial identification involves:",
            options = listOf(
                "Matching a photograph of the missing person's face with the recovered skull by aligning anatomical facial landmarks (nasion, gnathion, orbits)",
                "Matching handwriting signatures",
                "Overlapping tire tread marks",
                "Comparing bullet striations"
            ),
            correctOptionIndex = 0,
            explanation = "Cranial superimposition aligns a life photograph of a known missing individual over video/radiographic images of an unidentified skull using cephalometric landmarks to prove identity or definitive anatomical exclusion.",
            clinicalPearl = "Superimposition: Anatomical skull-photo matching using anatomical landmarks (Frankfort horizontal plane, nasion, gnathion).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_23",
            category = ForensicCategory.IDENTIFICATION,
            question = "The medullary index of a hair shaft in forensic examination is calculated as:",
            options = listOf(
                "Diameter of the medulla divided by the total diameter of the hair shaft",
                "Length of hair divided by root bulb diameter",
                "Number of cortical pigment granules per square micron",
                "Curvature radius of the cuticle"
            ),
            correctOptionIndex = 0,
            explanation = "Medullary index = Diameter of Medulla / Total Hair Shaft Diameter. In humans, the medullary index is LESS than 0.3 (narrow/amorphous or fragmented medulla). In non-human animals, the medullary index is GREATER than 0.5 (broad, continuous, geometric medulla).",
            clinicalPearl = "Hair Medullary Index: Human hair < 0.3; Animal hair > 0.5 (Animal medulla is wide and regular).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ident_24",
            category = ForensicCategory.IDENTIFICATION,
            question = "Barr bodies (sex chromatin) in buccal mucosal smears are used for sex determination and represent:",
            options = listOf(
                "An inactivated, condensed X chromosome present in normal somatic cells of phenotypic females (46,XX)",
                "A fluorescent Y-body stained with quinacrine",
                "Intranuclear viral inclusions",
                "Chromosomal translocation in Down syndrome"
            ),
            correctOptionIndex = 0,
            explanation = "Barr bodies (Lyon hypothesis) are condensed, facultatively heterochromatic, inactivated X chromosomes found at the nuclear periphery of somatic cells in normal genetic females (Number of Barr bodies = Number of X chromosomes - 1).",
            clinicalPearl = "Sex Chromatin: Barr body = Inactive X chromosome (Female = positive in > 20% cells). F-body (quinacrine) = Y chromosome fluorescence.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ident_25",
            category = ForensicCategory.IDENTIFICATION,
            question = "Palatal rugoscopy (the study of mucosal ridges on the anterior hard palate) is particularly valuable in burn disaster victim identification because:",
            options = listOf(
                "The palatal rugae are protected inside the oral cavity by the buccal cheeks, lips, tongue, and maxillary teeth from thermal incineration",
                "Palatal rugae change shape completely every 6 months",
                "They contain microscopic fluorescent zinc crystals",
                "They are identical in all monozygotic twins"
            ),
            correctOptionIndex = 0,
            explanation = "Palatal rugae remain unique to each individual throughout life and are anatomically insulated from thermal trauma, carbonization, and decomposition by the surrounding facial musculature, tongue, and dental arches.",
            clinicalPearl = "Palatal Rugoscopy: Unique individual patterns shielded from high heat inside the oral vault; key tool in mass disaster victim identification.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ident_26",
            category = ForensicCategory.IDENTIFICATION,
            question = "In forensic dentistry, a bite mark inflicted by human teeth characteristically presents as:",
            options = listOf(
                "Two opposing U-shaped or semi-circular arches of circular/rectangular contusions and abrasions with central ecchymosis",
                "A single linear incised cut",
                "V-shaped parallel lacerations from carnassial teeth",
                "Circular punched-out defect with lead wipe"
            ),
            correctOptionIndex = 0,
            explanation = "Human bite marks create two paired, opposing curved (U-shaped or elliptical) arches of individual bruises or punctures corresponding to the incisors (rectangles) and canines (triangles), often with suction purpura in the center.",
            clinicalPearl = "Human bite mark: Paired semicircular arches (incisors = rectangular bruises; canines = triangular marks); central suction ecchymosis.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        )
    )
}
