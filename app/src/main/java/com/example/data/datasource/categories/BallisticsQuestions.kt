package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object BallisticsQuestions {
    val all: List<ForensicQuestion> = listOf(
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
        ForensicQuestion(
            id = "ball_05",
            category = ForensicCategory.BALLISTICS,
            question = "When two bullets are fired sequentially through the same gun barrel and exit together, producing a single combined or adjacent atypical entrance wound, this is called:",
            options = listOf(
                "Ricochet bullet",
                "Tandem (piggyback) bullets",
                "Dumdum bullet phenomenon",
                "Frangible round effect"
            ),
            correctOptionIndex = 1,
            explanation = "A tandem (or piggyback) bullet occurs when a primary cartridge fails to clear the barrel due to low powder charge (squib load), and a subsequent round is fired behind it, driving both projectiles out of the muzzle simultaneously.",
            clinicalPearl = "Tandem bullets: Two bullets fired simultaneously through one discharge, yielding single or overlapping complex entrance wounds.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_06",
            category = ForensicCategory.BALLISTICS,
            question = "In shotgun ballistics, the narrowing of the muzzle bore to control the spread and dispersion of lead pellets over distance is called:",
            options = listOf(
                "Rifling groove twist",
                "Choke",
                "Caliber gauge",
                "Chambering angle"
            ),
            correctOptionIndex = 1,
            explanation = "Choke refers to the constriction of the shotgun barrel at the muzzle end (Full choke, Modified, Cylinder bore) to control the dispersion pattern of the shot charge, increasing effective range and pellet density.",
            clinicalPearl = "Full choke keeps the pellet pattern tight up to 30–40 yards; Cylinder bore disperses rapidly.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Ballistics"
        ),
        ForensicQuestion(
            id = "ball_07",
            category = ForensicCategory.BALLISTICS,
            question = "Which chemical test is used in forensic ballistics to detect copper and lead residue on clothing or target surfaces around bullet holes?",
            options = listOf(
                "Modified Griess test and Sodium Rhodizonate test",
                "Takayama crystal test",
                "Kastle-Meyer phenolphthalein test",
                "Luminol chemiluminescence"
            ),
            correctOptionIndex = 0,
            explanation = "The Modified Griess test detects nitrites (burnt gunpowder residue), while the Sodium Rhodizonate test identifies lead and barium primer residues on fabrics, confirming range of fire and entrance hole margins.",
            clinicalPearl = "Griess test = Nitrites (orange spots); Sodium Rhodizonate test = Lead/Barium (pink-violet reaction).",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ball_08",
            category = ForensicCategory.BALLISTICS,
            question = "In rifled firearms, the helical grooves cut into the interior of the barrel impart which dynamic physical property to the traveling bullet?",
            options = listOf(
                "Gyroscopic rotational stability around its longitudinal axis",
                "Complete elimination of projectile air resistance",
                "Centrifugal fragmentation upon tissue impact",
                "Thermal cooling of the casing"
            ),
            correctOptionIndex = 0,
            explanation = "Rifling (lands and grooves) imparts a rapid spin to the bullet as it travels down the barrel. This gyroscopic spin stabilizes the projectile in flight, preventing tumbling and yawing in air and ensuring accuracy.",
            clinicalPearl = "Lands & Grooves impart spin; they leave unique striated micro-markings on the bullet for ballistic toolmark comparison.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_09",
            category = ForensicCategory.BALLISTICS,
            question = "A firearm discharge where the muzzle is pressed firmly against skin over a fleshy region (like the abdomen or thigh) results in which characteristic entrance pattern?",
            options = listOf(
                "A circular defect with a muzzle imprint (abraded stamp) and internal soot deposition",
                "A large stellate laceration with external soot spread over a 20 cm radius",
                "Multiple satellite pellet punctures",
                "A slit-like incision with no abrasion collar"
            ),
            correctOptionIndex = 0,
            explanation = "In firm hard-contact wounds over thick soft tissues (abdominal wall, thigh), the muzzle prevents gas escape, forcing all soot, hot gases, and flame directly into the wound tract. The hot metal muzzle frequently burns/abrades a circular or rectangular stamp pattern around the entry hole.",
            clinicalPearl = "Muzzle imprint (Krupp mark) confirms hard contact discharge; soot and carbon monoxide are found entirely within the subcutaneous tract.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_10",
            category = ForensicCategory.BALLISTICS,
            question = "In forensic ballistics, the 'caliber' of a rifled firearm corresponds to:",
            options = listOf(
                "The overall length of the cartridge brass casing",
                "The internal diameter of the barrel measured from land to land",
                "The total mass of the propellant powder charge in grains",
                "The chamber pressure in pounds per square inch (PSI)"
            ),
            correctOptionIndex = 1,
            explanation = "Caliber is the internal diameter of the rifled bore, traditionally measured between opposite raised lands (or groove to groove), expressed in hundredths/thousandths of an inch (.38, .45) or in millimeters (9mm, 7.62mm).",
            clinicalPearl = "Caliber = Internal bore diameter (land-to-land). Shotguns use 'Gauge' based on the number of lead balls of bore diameter per pound.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ball_11",
            category = ForensicCategory.BALLISTICS,
            question = "A bullet that strikes a hard intermediary surface, ricochets, and subsequently enters the body will typically produce:",
            options = listOf(
                "An atypical, irregularly shaped, lacerated entrance wound with asymmetric abrasion collar",
                "A classic circular entry defect with concentric tattooing",
                "Internal bone beveling identical to a high-velocity rifle round",
                "A stellate burn identical to hard contact"
            ),
            correctOptionIndex = 0,
            explanation = "A ricocheted bullet deforms, loses aerodynamic stability, and begins tumbling/yawing sideways. When striking skin, it creates an atypical, irregular, keyhole or lacerated entrance wound with an irregular, asymmetric abrasion rim and absence of primary muzzle residue.",
            clinicalPearl = "Ricochet wounds: Asymmetric, irregular entry holes; bullet shows flattenings, striations from intermediary surfaces (walls/stone).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ball_12",
            category = ForensicCategory.BALLISTICS,
            question = "In shotgun range estimation, the rule of thumb states that the diameter of the pellet spread (in inches) roughly equals:",
            options = listOf(
                "The distance from muzzle to target in yards",
                "The distance from muzzle to target in feet",
                "The caliber of the shotgun in millimeters",
                "Twice the length of the shotgun barrel"
            ),
            correctOptionIndex = 0,
            explanation = "In open cylinder bore shotguns, the spread of lead pellets expands roughly by 1 inch for every 1 yard of distance (e.g., at 10 yards, pellet spread is approximately 10 inches wide).",
            clinicalPearl = "Shotgun rule of thumb: Pellet pattern diameter in inches roughly equals distance in yards (for unchoked barrels).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_13",
            category = ForensicCategory.BALLISTICS,
            question = "A 'keyhole' cranial gunshot defect is produced when a bullet strikes the skull bone at:",
            options = listOf(
                "A shallow tangential angle, producing external and internal beveling in the same defect",
                "A perfect 90-degree perpendicular angle",
                "A point-blank range through thick hair",
                "The vertex in an upright seated position"
            ),
            correctOptionIndex = 0,
            explanation = "When a projectile strikes flat bone at a low, tangential angle, one portion of the bone is driven inward (entrance with internal beveling) while the departing bullet simultaneously shears bone outward at the trailing edge (external beveling), resembling an antique keyhole.",
            clinicalPearl = "Keyhole defect = Tangential bullet strike showing entrance and exit beveling characteristics simultaneously in a single cranial hole.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_14",
            category = ForensicCategory.BALLISTICS,
            question = "Which component of modern primer mixtures is primarily detected by Scanning Electron Microscopy with Energy Dispersive X-ray (SEM-EDX) for Gunshot Residue (GSR) confirmation?",
            options = listOf(
                "Lead, Barium, and Antimony (Pb-Ba-Sb particles)",
                "Potassium nitrate and sulfur",
                "Nitrocellulose and nitroglycerin",
                "Copper, zinc, and nickel alloys"
            ),
            correctOptionIndex = 0,
            explanation = "Forensic GSR identification relies on SEM-EDX detection of characteristic spherical, fused particles containing Lead (Pb), Barium (Ba), and Antimony (Sb), produced exclusively by the condensation of primer blast vapors.",
            clinicalPearl = "GSR Triad on SEM-EDX: Lead + Barium + Antimony in discrete spherical micro-particulates.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ball_15",
            category = ForensicCategory.BALLISTICS,
            question = "Temporary cavitation along a high-velocity rifle bullet wound track is caused by:",
            options = listOf(
                "Transfer of kinetic energy generating sonic and radial shockwaves that stretch and displace surrounding elastic tissue",
                "Melting of the lead core within parenchymal capillaries",
                "Direct combustion of residual gunpowder in tissues",
                "Subcutaneous air suction through the entrance hole"
            ),
            correctOptionIndex = 0,
            explanation = "High-velocity projectiles (> 750 m/s or 2500 fps) transfer massive kinetic energy (E = 1/2 mv^2). Radial displacement creates a temporary cavity up to 10–30 times the bullet's diameter, severely rupturing inelastic solid organs (liver, spleen, brain).",
            clinicalPearl = "Temporary cavity = Radial kinetic energy transfer causing massive internal organ rupture distant from the permanent bullet track.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Ballistics"
        ),
        ForensicQuestion(
            id = "ball_16",
            category = ForensicCategory.BALLISTICS,
            question = "A bullet that strikes a body, traverses internal organs, loses all kinetic energy, and comes to rest just beneath the intact skin on the opposite side without perforating is called an:",
            options = listOf(
                "Extravasated bullet",
                "Embolized projectile",
                "Intra-cutaneous (tenting) projectile",
                "Intermediary ricochet"
            ),
            correctOptionIndex = 2,
            explanation = "Human skin is extremely tough and elastic due to dense dermal collagen. Low-energy or spent bullets easily traverse muscle and viscera but lack the final velocity required to pierce the skin, lodging subcutaneously and 'tenting' the skin on the opposite side.",
            clinicalPearl = "Skin elasticity requires ~160-200 fps to pierce; bullets frequently stop directly beneath the skin on the exit side.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_17",
            category = ForensicCategory.BALLISTICS,
            question = "In forensic firearms identification, which microscopic markings on a spent cartridge case provide the most reliable individual toolmark characteristics for firearm matching?",
            options = listOf(
                "Breech face marks, firing pin impressions, and extractor/ejector scratches",
                "Cartridge headstamp lettering and caliber engraving",
                "External brass casing oxidation color",
                "Primer cup diameter and thickness"
            ),
            correctOptionIndex = 0,
            explanation = "When a cartridge is detonated, extreme backward gas pressure slams the primer against the breech face, engraving microscopic unique toolmarks. Firing pin strikes, extractor hooks, and ejector blocks also leave unique individual striations matched under a comparison microscope.",
            clinicalPearl = "Individual ballistic matching: Breech face marks + Firing pin indentations + Extractor/ejector marks on cartridge cases.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ball_18",
            category = ForensicCategory.BALLISTICS,
            question = "A 'shored exit wound' in forensic pathology occurs when:",
            options = listOf(
                "The skin at the exit site is firmly supported/reinforced by a rigid external object (e.g., tight belt, chair back, or ground)",
                "The bullet exits through water or damp clothing",
                "The firearm is fired into a body under water",
                "The exit hole is cleanly incised by bone shards"
            ),
            correctOptionIndex = 0,
            explanation = "A shored exit wound occurs when skin at the exit point is compressed against a firm surface (tight waistband, wall, brassiere, floor). As the bullet emerges, skin is slapped against the supporting surface, creating an atypical abrasion ring around the exit wound that closely mimics an entrance wound.",
            clinicalPearl = "Shored exit wound: Abrasion ring around exit defect caused by skin slapping against a firm support (belt/wall); do not misclassify as entrance.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_19",
            category = ForensicCategory.BALLISTICS,
            question = "A bullet embolus refers to a rare phenomenon where a bullet enters the vascular system and:",
            options = listOf(
                "Is carried by the bloodstream to lodge at a distant arterial or venous location",
                "Dissolves completely into serum lead ions within 1 hour",
                "Causes instant coronary artery spasm",
                "Spontaneously migrates out through the thoracic duct"
            ),
            correctOptionIndex = 0,
            explanation = "A bullet or shotgun pellet entering a major vessel (aorta, vena cava, heart chamber) with low residual energy can be transported via blood flow to lodge distally (e.g., popliteal artery, femoral vein, or cerebral circulation), creating an embolus.",
            clinicalPearl = "Bullet embolus: Entry wound present with no exit wound and bullet not found in the anticipated anatomical trajectory.",
            difficulty = Difficulty.ADVANCED,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ball_20",
            category = ForensicCategory.BALLISTICS,
            question = "The difference between black gunpowder and smokeless gunpowder in forensic ballistics is that smokeless powder consists primarily of:",
            options = listOf(
                "Nitrocellulose (single-base) or Nitrocellulose + Nitroglycerin (double-base)",
                "Potassium nitrate, charcoal, and sulfur in 75:15:10 ratio",
                "Pure mercury fulminate and barium peroxide",
                "TNT and cyclotrimethylene trinitramine (RDX)"
            ),
            correctOptionIndex = 0,
            explanation = "Black powder is a mechanical mixture of 75% potassium nitrate, 15% charcoal, and 10% sulfur (produces copious smoke and heavy soot). Modern smokeless powder consists of gelatinized nitrocellulose (single-base) or nitrocellulose + nitroglycerin (double-base), leaving translucent flake or cylinder grains.",
            clinicalPearl = "Black powder = KNO3 + Charcoal + Sulfur (heavy black fouling). Smokeless powder = Nitrocellulose +/- Nitroglycerin (cleaner burn).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Ballistics"
        ),
        ForensicQuestion(
            id = "ball_21",
            category = ForensicCategory.BALLISTICS,
            question = "A 'wad' retrieved from a shotgun injury provides valuable forensic evidence regarding:",
            options = listOf(
                "Gauge of the shotgun, manufacturer, and distance of firing if found inside the wound",
                "The serial number of the gun frame",
                "The exact time the weapon was discharged",
                "The victim's blood type"
            ),
            correctOptionIndex = 0,
            explanation = "Plastic wads/cushions travel with the shot charge. At close ranges (under 5–6 feet), the wad enters the body cavity along with pellets; its presence, shape, and petal expansion establish gauge, make, and firing range.",
            clinicalPearl = "Shotgun wad inside the wound tract confirms firing range within 2 meters (5-6 feet).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ball_22",
            category = ForensicCategory.BALLISTICS,
            question = "The 'rat-hole' appearance (single large ragged entry defect with scalloped / crenated borders and satellite pellet holes) in a shotgun wound corresponds to a firing range of approximately:",
            options = listOf(
                "1 to 3 meters (3 to 10 feet)",
                "Contact (0 cm)",
                "25 to 50 meters",
                "100 meters"
            ),
            correctOptionIndex = 0,
            explanation = "At very close range (1-3 ft), pellets enter as a single mass. As distance increases to 1–3 meters, the outer pellets begin to separate from the main shot column, creating a central ragged 'rat hole' surrounded by satellite entry punctures (scalloped edges).",
            clinicalPearl = "Rat-hole shotgun entrance with satellite holes = Close range dispersion (~1 to 3 meters).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_23",
            category = ForensicCategory.BALLISTICS,
            question = "In internal ballistics, 'yaw' describes:",
            options = listOf(
                "The deviation of the longitudinal axis of the projectile from its true line of flight",
                "The total barrel recoil distance in centimeters",
                "The rate of hammer release upon trigger pull",
                "The evaporation rate of lubricating gun grease"
            ),
            correctOptionIndex = 0,
            explanation = "Yaw is the angle between the bullet's longitudinal axis and its line of flight trajectory. When yaw reaches 90 degrees, the bullet is traveling completely sideways ('tumbling' or keyholing), causing massive tissue disruption.",
            clinicalPearl = "Bullet Yaw: Tilting of bullet axis during flight; extreme yaw causes tumbling and larger entry defects.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "ball_24",
            category = ForensicCategory.BALLISTICS,
            question = "A 'souvenir bullet' in forensic pathology refers to:",
            options = listOf(
                "An old, encapsulated bullet from a remote prior shooting discovered incidentally during autopsy",
                "A bullet presented in court by the investigating officer",
                "A hollow-point bullet designed for maximum expansion",
                "A lead pellet recovered from an animal hunt"
            ),
            correctOptionIndex = 0,
            explanation = "A souvenir bullet is a projectile from an old healed shooting incident years prior, which became fibrously encapsulated in bone or soft tissue and is discovered incidentally during postmortem examination of a different fatal event.",
            clinicalPearl = "Always examine for fibrous encapsulation and old scar tissue to differentiate an incidental souvenir bullet from the fatal projectile.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "ball_25",
            category = ForensicCategory.BALLISTICS,
            question = "Gunpowder smudging (soot deposition) around a gunshot entrance wound is typically seen up to a maximum distance of:",
            options = listOf(
                "30 to 45 cm (approx. 12 to 18 inches)",
                "5 meters",
                "20 meters",
                "50 meters"
            ),
            correctOptionIndex = 0,
            explanation = "Soot (smudging) consists of fine carbonaceous smoke particles that travel a short distance through air before dissipating. It is deposited on targets up to approximately 30–45 cm (12-18 inches) for handguns.",
            clinicalPearl = "Soot / Smudging = up to 30 cm. Tattooing / Stippling = up to 100-120 cm (3-4 feet).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "ball_26",
            category = ForensicCategory.BALLISTICS,
            question = "Dum-dum bullets are designed to:",
            options = listOf(
                "Expand, mushroom, or fragment upon tissue impact to maximize kinetic energy transfer and tissue destruction",
                "Pierce through heavy reinforced steel armor plates",
                "Produce silent subsonic flight without muzzle blast",
                "Dissolve in blood to prevent forensic ballistic tracing"
            ),
            correctOptionIndex = 0,
            explanation = "Dum-dum bullets (hollow-point or soft-point unjacketed lead nose bullets) expand/mushroom upon striking tissue resistance. This rapid radial expansion creates massive permanent cavity damage and limits over-penetration.",
            clinicalPearl = "Expanding (dumdum/hollow-point) bullets mushroom on impact, maximizing internal cavitation.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Ballistics"
        )
    )
}
