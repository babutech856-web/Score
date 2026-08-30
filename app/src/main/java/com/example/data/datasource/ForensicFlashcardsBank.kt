package com.example.data.datasource

import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicFlashcard

object ForensicFlashcardsBank {

    val flashcards: List<ForensicFlashcard> = listOf(
        ForensicFlashcard(
            id = "flash_01",
            category = ForensicCategory.THANATOLOGY,
            title = "Postmortem Hypostasis Colors & Causes",
            summary = "Colors of livor mortis indicating specific lethal poisons and environmental conditions.",
            keyPoints = listOf(
                "Cherry Red: Carbon Monoxide (HbCO > 30%)",
                "Brick Red / Pinkish: Cyanide toxicity (Histotoxic anoxia)",
                "Chocolate Brown: Methemoglobin formers (Nitrites, Aniline, Nitrobenzene)",
                "Dark Brown / Ash: Potassium Chlorate (KClO3)",
                "Bright Pink / Scarlet: Hypothermia & cold storage exposure",
                "Dark Blackish Blue: Common Asphyxial deaths (reduced hemoglobin)"
            ),
            mnemonicsOrPearl = "High-Yield: Carbon Monoxide = Cherry; Cyanide = Brick Red; Nitrites = Chocolate Brown; Cold = Bright Pink."
        ),
        ForensicFlashcard(
            id = "flash_02",
            category = ForensicCategory.THANATOLOGY,
            title = "Rule of 12 for Rigor Mortis (Tropical / Temperate)",
            summary = "Classic timeline for appearance, full development, and resolution of rigor mortis.",
            keyPoints = listOf(
                "First 12 Hours: Develops from eyelids down to toes (cranial to caudal).",
                "Next 12 Hours: Persists fully across all joints and muscle groups.",
                "Subsequent 12 Hours: Passes off in the exact same cranial-to-caudal sequence.",
                "Disappearance mechanism: Autolysis & protein liquefaction breaking actin-myosin bonds."
            ),
            mnemonicsOrPearl = "Nysten's Law: Eyelids (3-4h) -> Jaw -> Neck -> Trunk -> Arms -> Legs. Warm conditions speed up timeline; cold delays it."
        ),
        ForensicFlashcard(
            id = "flash_03",
            category = ForensicCategory.ASPHYXIA,
            title = "Hanging vs Ligature Strangulation",
            summary = "The classic medicolegal comparison table distinguishing hanging from strangulation.",
            keyPoints = listOf(
                "Ligature Mark in Hanging: Oblique, non-continuous, highest at knot apex, situated above thyroid cartilage.",
                "Ligature Mark in Strangulation: Completely circular, horizontal, continuous, situated at or below thyroid cartilage.",
                "Base of Groove: Hard, parchment-like, pale/yellowish in hanging; soft, reddish with ecchymoses in strangulation.",
                "Hyoid Fracture: Greater horns fractured in older hanging victims; Thyroid cartilage & cricoid fractured more in strangulation.",
                "Bleeding from mouth/nose: Rarely seen in hanging; frequently seen in strangulation."
            ),
            mnemonicsOrPearl = "Hanging = Oblique & Above thyroid; Strangulation = Horizontal & At/Below thyroid."
        ),
        ForensicFlashcard(
            id = "flash_04",
            category = ForensicCategory.BALLISTICS,
            title = "Gunshot Wound Range Stigmata",
            summary = "Physical markers identifying range of fire from contact to distant shots.",
            keyPoints = listOf(
                "Hard Contact: Muzzle imprint abrasion on skin, cherry-red tissue underneath, stellate tear over skull bone.",
                "Close Range (<6 inches): Flame scorching / singeing of hair, dense soot deposition (blackening), gunpowder tattooing.",
                "Intermediate Range (6 inches to 2-3 feet): Gunpowder tattooing (stippling) in skin dermis, minimal or no soot.",
                "Distant Range (>3 feet): Only central circular bullet hole with wipe ring and abrasion collar; NO soot or tattooing."
            ),
            mnemonicsOrPearl = "Soot washes off; Tattooing is embedded in dermis and permanent. Wipe ring is present at all ranges of entrance."
        ),
        ForensicFlashcard(
            id = "flash_05",
            category = ForensicCategory.TOXICOLOGY,
            title = "Specific Antidotes Master List",
            summary = "Essential antidotes tested in forensic medicine board examinations.",
            keyPoints = listOf(
                "Organophosphates: Atropine (muscarinic) + Pralidoxime 2-PAM (nicotinic & enzyme reactivation)",
                "Arsenic / Heavy Metals: Dimercaprol (BAL), Succimer (DMSA), D-Penicillamine",
                "Cyanide: Hydroxocobalamin OR Sodium Nitrite + Sodium Thiosulfate",
                "Lead (Plumbism): Calcium Disodium EDTA, BAL, Penicillamine",
                "Methanol / Ethylene Glycol: Fomepizole OR Ethanol (inhibits alcohol dehydrogenase)",
                "Iron Toxicity: Desferrioxamine (turns urine 'vin rose' color)",
                "Opioid Toxicity: Naloxone (Narcan)"
            ),
            mnemonicsOrPearl = "Mnemonic: Cyanide = Hydroxocobalamin; OP = Atropine + Oximes; Iron = Desferrioxamine."
        ),
        ForensicFlashcard(
            id = "flash_06",
            category = ForensicCategory.IDENTIFICATION,
            title = "Gustafson's Dental Aging Criteria",
            summary = "Six histological changes scored 0 to 3 in single-rooted permanent teeth.",
            keyPoints = listOf(
                "A - Attrition (wear of incisal / occlusal enamel)",
                "S - Secondary Dentine formation within pulp chamber",
                "P - Periodontosis (gingival regression)",
                "C - Cementum apposition at apex",
                "R - Root Resorption of apical dentine",
                "T - Root Transparency (sclerosis of dentinal tubules - most accurate single predictor!)"
            ),
            mnemonicsOrPearl = "Mnemonic: 'A-S-P-C-R-T'. Total score (X) correlates with Age = 11.43 + 4.56(X)."
        ),
        ForensicFlashcard(
            id = "flash_07",
            category = ForensicCategory.AUTOPSY_CASES,
            title = "Tests for Live Birth in Infanticide",
            summary = "Pathological tests used during fetal and neonatal autopsy to establish extrauterine respiration.",
            keyPoints = listOf(
                "Hydrostatic Test (Breslau): Lungs + heart placed in water; aerated lungs float buoyantly.",
                "Ploucquet's Test: Ratio of lung weight to body weight (1:35 in live-born respired infant vs 1:70 in stillborn).",
                "Fagan's Test: Submerging individual lung lobes to detect partial respiration.",
                "Wredden's Test: Presence of air in middle ear cavity replacing embryonic gelatinous tissue."
            ),
            mnemonicsOrPearl = "Liveborn = Lungs float, Ploucquet ratio ~ 1:35, spongy pale pink with rounded borders."
        )
    )
}
