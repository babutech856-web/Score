package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object ToxicologyQuestions {
    val all: List<ForensicQuestion> = listOf(
        ForensicQuestion(
            id = "tox_01",
            category = ForensicCategory.TOXICOLOGY,
            question = "Which specific antidote is indicated for acute Organophosphate and Carbamate insecticide poisoning to reactivate phosphorylated acetylcholinesterase enzyme?",
            options = listOf(
                "Pralidoxime (2-PAM) / Oximes",
                "Atropine sulfate alone",
                "N-acetylcysteine",
                "Dimercaprol (BAL)"
            ),
            correctOptionIndex = 0,
            explanation = "While Atropine blocks muscarinic receptor overstimulation, Oximes (such as Pralidoxime / 2-PAM and Obidoxime) are specific enzyme reactivators that hydrolyze the phosphate ester bond, regenerating active acetylcholinesterase before irreversible 'aging' occurs.",
            clinicalPearl = "Atropine = Antagonizes muscarinic excess; Pralidoxime (2-PAM) = Reactivates phosphorylated AChE (give before enzyme aging).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Toxicology"
        ),
        ForensicQuestion(
            id = "tox_02",
            category = ForensicCategory.TOXICOLOGY,
            question = "Aldrich-Mees lines (transverse white bands across fingernails and toenails) are a classical diagnostic sign of chronic toxicity from:",
            options = listOf(
                "Arsenic (or Thallium)",
                "Lead (Plumbism)",
                "Mercury (Hydrargyria)",
                "Cadmium (Itai-itai disease)"
            ),
            correctOptionIndex = 0,
            explanation = "Aldrich-Mees lines are 1–2 mm wide transverse white bands traversing the nail plates due to arsenic disruption of disulfide bond synthesis in the nail matrix during periods of acute/chronic poisoning.",
            clinicalPearl = "Mees lines = Arsenic / Thallium toxicity. Burtonian blue line = Lead poisoning at gum margin.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_03",
            category = ForensicCategory.TOXICOLOGY,
            question = "The characteristic postmortem odor of 'bitter almonds' detected in stomach contents and viscera is pathognomonic of poisoning with:",
            options = listOf(
                "Potassium cyanide / Hydrocyanic acid",
                "Phosphorus (garlic / matchstick odor)",
                "Parathion (kerosene / garlic odor)",
                "Nitrobenzene (shoe-polish odor)"
            ),
            correctOptionIndex = 0,
            explanation = "Cyanide poisoning characteristically produces a bitter almond odor (detectable by ~60% of the population due to genetic olfactory variation). Cyanide inhibits cytochrome c oxidase in the mitochondrial electron transport chain, blocking cellular ATP production.",
            clinicalPearl = "Odor Guide: Bitter almonds = Cyanide; Garlic = Arsenic/Phosphorus/Organophosphates; Rotten eggs = H2S; Shoe polish = Nitrobenzene.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "tox_04",
            category = ForensicCategory.TOXICOLOGY,
            question = "A patient presents with dry hot skin, hyperthermia, mydriasis, delirium, urinary retention, and visual hallucinations ('blind as a bat, mad as a hatter, red as a beet, hot as a hare, dry as a bone'). This toxidrome is typical of:",
            options = listOf(
                "Anticholinergic poisoning (Datura stramonium / Atropa belladonna)",
                "Cholinergic crisis (Organophosphates)",
                "Opioid overdose",
                "Sympathomimetic toxicity (Cocaine)"
            ),
            correctOptionIndex = 0,
            explanation = "Datura, Belladonna, and Hyoscyamus contain belladonna alkaloids (hyoscine, hyoscyamine, atropine), producing the classic Anticholinergic Toxidrome: mydriasis, flushing, hyperthermia, anhydrosis, delirium, tachycardia, and urinary retention.",
            clinicalPearl = "Anticholinergic mnemonic: 'Blind as a bat, Mad as a hatter, Red as a beet, Hot as a hare, Dry as a bone, Bladder full as a stone.'",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_05",
            category = ForensicCategory.TOXICOLOGY,
            question = "Which preservative is routinely used for viscera preservation in suspected poisoning cases during medicolegal autopsy, EXCEPT in cases of suspected carbolic acid (phenol) poisoning?",
            options = listOf(
                "Saturated solution of common salt (Sodium Chloride)",
                "10% Neutral Buffered Formalin",
                "Rectified spirit (Ethyl alcohol)",
                "Sodium fluoride with potassium oxalate"
            ),
            correctOptionIndex = 0,
            explanation = "Saturated Sodium Chloride solution (common salt) is the standard viscera preservative because it does not interfere with toxicological chemical extraction. In Carbolic acid (phenol) poisoning, saturated salt or rectified spirit is used depending on protocol.",
            clinicalPearl = "Viscera preservation: Saturated NaCl is routine. NEVER use formalin for toxicological viscera analysis (formalin destroys/alters toxins).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Toxicology"
        ),
        ForensicQuestion(
            id = "tox_06",
            category = ForensicCategory.TOXICOLOGY,
            question = "The specific antidote for acute paracetamol (acetaminophen) overdose that replenishes intracellular hepatic glutathione is:",
            options = listOf(
                "N-acetylcysteine (NAC)",
                "Flumazenil",
                "Deferoxamine",
                "Methylene blue"
            ),
            correctOptionIndex = 0,
            explanation = "Paracetamol toxicity is mediated by accumulation of the reactive metabolite NAPQI when glutathione stores are depleted. N-acetylcysteine (NAC) supplies cysteine for hepatic glutathione synthesis and directly conjugates NAPQI.",
            clinicalPearl = "NAC is most effective when given within 8 hours of paracetamol ingestion; guided by the Rumack-Matthew nomogram.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "tox_07",
            category = ForensicCategory.TOXICOLOGY,
            question = "In acute Aluminium Phosphide (Celphos) poisoning, fatal cellular toxicity is caused by the release of which highly lethal gas in the moist acidic stomach?",
            options = listOf(
                "Phosphine gas (PH3)",
                "Phosgene gas (COCl2)",
                "Hydrogen sulfide (H2S)",
                "Sulfur dioxide (SO2)"
            ),
            correctOptionIndex = 0,
            explanation = "Aluminium phosphide reacts with gastric hydrochloric acid and water to release Phosphine (PH3) gas. Phosphine causes non-competitive inhibition of cytochrome c oxidase, catastrophic oxidative damage, refractory cardiogenic shock, and metabolic acidosis.",
            clinicalPearl = "Aluminium phosphide (Celphos): Releases PH3 gas (garlic odor); Silver nitrate paper test on gastric aspirate turns black.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Toxicology"
        ),
        ForensicQuestion(
            id = "tox_08",
            category = ForensicCategory.TOXICOLOGY,
            question = "Which heavy metal toxin causes chronic toxicity known as 'Minamata Disease', characterized by cerebellar ataxia, sensory paresthesia, and visual field constriction?",
            options = listOf(
                "Methylmercury (Organic Mercury)",
                "Inorganic Lead",
                "Cadmium",
                "Arsenic trioxide"
            ),
            correctOptionIndex = 0,
            explanation = "Minamata disease is caused by industrial discharge of organic methylmercury into waterways, bioaccumulating in fish. It produces permanent cortical brain damage (calcarine cortex and granule layer of cerebellum), causing Hunter-Russell syndrome.",
            clinicalPearl = "Mercury: Minamata disease = Organic methylmercury (ataxia, concentric visual constriction, dysarthria, tremors).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_09",
            category = ForensicCategory.TOXICOLOGY,
            question = "A classic sign of chronic lead poisoning (Plumbism) visible along the gingival margin of the gums is known as:",
            options = listOf(
                "Burtonian line (Burton's blue line)",
                "Mees line",
                "Muehrcke's lines",
                "Kayser-Fleischer ring"
            ),
            correctOptionIndex = 0,
            explanation = "Burton's line is a bluish-black stippled line on the gingival margins caused by reaction of circulating lead with hydrogen sulfide produced by oral anaerobic bacteria, forming insoluble lead sulfide precipitate.",
            clinicalPearl = "Lead features: Burtonian line on gums, wrist drop / foot drop (motor neuropathy), basophilic stippling on blood smear, lead lines on X-ray metaphyses.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "tox_10",
            category = ForensicCategory.TOXICOLOGY,
            question = "Widmark's formula is applied in forensic toxicology to calculate:",
            options = listOf(
                "Total quantity of alcohol consumed based on blood alcohol concentration (BAC)",
                "The postmortem interval from vitreous potassium",
                "The time of death from gastric emptying of rice",
                "The lethal dose of strychnine"
            ),
            correctOptionIndex = 0,
            explanation = "Widmark's formula (a = c x p x r) relates the total absorbed alcohol (a), blood alcohol concentration (c), body weight in kg (p), and volume distribution factor (r = 0.68 for males, 0.55 for females) with beta-elimination rate (15-20 mg%/hr).",
            clinicalPearl = "Widmark's formula: a = c * p * r. Alcohol elimination rate is zero-order kinetics: ~15 mg% (0.015 g/dL) per hour.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "tox_11",
            category = ForensicCategory.TOXICOLOGY,
            question = "The specific antidote for acute Methanol (wood alcohol) poisoning that acts by competitively inhibiting the enzyme Alcohol Dehydrogenase (ADH) is:",
            options = listOf(
                "Fomepizole (4-methylpyrazole) or Ethanol",
                "Naloxone",
                "Deferoxamine",
                "Flumazenil"
            ),
            correctOptionIndex = 0,
            explanation = "Methanol toxicity is caused by its metabolites: formaldehyde and formic acid (causing severe anion gap metabolic acidosis and retinal blindness). Fomepizole and Ethanol competitively bind Alcohol Dehydrogenase (ADH) with high affinity, preventing conversion into toxic formic acid.",
            clinicalPearl = "Methanol poisoning: Formic acid causes snowstorm vision/blindness and putaminal necrosis; Antidote = Fomepizole or Ethanol.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "tox_12",
            category = ForensicCategory.TOXICOLOGY,
            question = "Kerosine-like / Rotten-garlic odor emanating from gastric aspirate and dark blackish lung/stomach congestion is characteristic of:",
            options = listOf(
                "Organophosphate / Endosulfan insecticide ingestion",
                "Lead acetate overdose",
                "Atropine poisoning",
                "Carbon monoxide inhalation"
            ),
            correctOptionIndex = 0,
            explanation = "Commercial organophosphate and organochlorine formulations use hydrocarbon solvents (aromatic petroleum/kerosene distillates), producing a strong pungent kerosene or garlic odor.",
            clinicalPearl = "Pungent kerosene smell in stomach contents + pinpoint pupils + fasciculations = Organophosphate / Agrochemical poisoning.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_13",
            category = ForensicCategory.TOXICOLOGY,
            question = "Which snake venom component is primarily responsible for the rapid, flaccid descending neuroparalysis, ptosis, and respiratory failure in Cobra (Naja naja) and Krait (Bungarus caeruleus) envenomation?",
            options = listOf(
                "Postsynaptic alpha-neurotoxins and presynaptic beta-neurotoxins blocking acetylcholine transmission",
                "Phospholipase A2 causing severe coagulopathy and hemoptysis",
                "Hyaluronidase causing skin necrosis alone",
                "Thrombin-like enzymes causing consumptive afibrinogenemia"
            ),
            correctOptionIndex = 0,
            explanation = "Elapid venoms (Cobras, Kraits) are rich in curare-like postsynaptic and presynaptic neurotoxins that bind nicotinic acetylcholine receptors at the neuromuscular junction, causing progressive descending flaccid paralysis (ptosis, diplopia, bulbar palsy, diaphragmatic arrest).",
            clinicalPearl = "Elapidae (Cobra, Krait) = Neurotoxic (ptosis, respiratory arrest). Viperidae (Russell's, Saw-scaled) = Vasculotoxic/Hemotoxic (bleeding, DIC, renal failure).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "tox_14",
            category = ForensicCategory.TOXICOLOGY,
            question = "The '20-Minute Whole Blood Clotting Test' (20WBCT) at the bedside is the most practical screening tool in rural emergencies for diagnosing:",
            options = listOf(
                "Viperine snake envenomation-induced consumptive coagulopathy (VICC)",
                "Acute organophosphate toxicity",
                "Opioid respiratory depression",
                "Ethanol intoxication"
            ),
            correctOptionIndex = 0,
            explanation = "In 20WBCT, 2 mL of fresh venous blood is placed in a clean, dry glass tube and left undisturbed for 20 minutes. If the blood remains completely liquid after tilting, it confirms venom-induced consumptive coagulopathy from a viper bite, mandating immediate Antisnake Venom (ASV).",
            clinicalPearl = "20WBCT: Positive (blood does not clot in 20 min) = Viper bite with systemic coagulopathy -> Start polyvalent ASV.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_15",
            category = ForensicCategory.TOXICOLOGY,
            question = "The plant toxin Ricin, derived from the seeds of Ricinus communis (Castor plant), acts biologically as a potent:",
            options = listOf(
                "Ribosome-inactivating protein (RIP Type II) that irreversibly halts cellular protein synthesis",
                "Direct GABA-A receptor channel blocker",
                "Sodium-potassium ATPase pump activator",
                "Dopamine reuptake enhancer"
            ),
            correctOptionIndex = 0,
            explanation = "Ricin is a ribosome-inactivating protein (consisting of chain A and B) that cleaves an adenine residue from 28S ribosomal RNA, permanently shutting down eukaryotic protein synthesis and triggering apoptosis in viscera.",
            clinicalPearl = "Ricin (Castor bean) = Potent ribosome-inactivating toxin (lethal dose ~0.2 mg parenterally; used in the infamous Georgi Markov umbrella murder).",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "tox_16",
            category = ForensicCategory.TOXICOLOGY,
            question = "Strychnine poisoning characteristically produces violent, painful convulsions with opisthotonos and risus sardonicus by:",
            options = listOf(
                "Competitively antagonizing the inhibitory neurotransmitter Glycine at postsynaptic receptors in the spinal cord and brainstem",
                "Directly stimulating voltage-gated sodium channels in cardiac tissue",
                "Inactivating acetylcholinesterase at striated neuromuscular junctions",
                "Blocking dopamine release in the basal ganglia"
            ),
            correctOptionIndex = 0,
            explanation = "Strychnine (from Strychnos nux-vomica seeds) blocks glycine receptors on Renshaw interneurons in the spinal cord anterior horns. Loss of glycine-mediated postsynaptic inhibition causes uncontrolled hyper-reflexic muscular spasms triggered by minimal sensory stimuli.",
            clinicalPearl = "Strychnine features: Mind remains fully clear during convulsions; Opisthotonos posture; Risus sardonicus grimace; Glycine receptor antagonism.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Toxicology"
        ),
        ForensicQuestion(
            id = "tox_17",
            category = ForensicCategory.TOXICOLOGY,
            question = "Aconite (Aconitum napellus / Monkshood / 'Sweet poison') exerts cardiotoxic effects primarily by:",
            options = listOf(
                "Prolonged activation and opening of voltage-dependent sodium channels in excitable membranes",
                "Direct beta-1 adrenergic blockade",
                "Inhibition of cellular topoisomerase II",
                "Potassium channel activation in the SA node"
            ),
            correctOptionIndex = 0,
            explanation = "Aconitine alkaloid binds with high affinity to site 2 of voltage-sensitive sodium channels, keeping them persistently open and depolarized. This leads to refractory ventricular arrhythmias (torsades de pointes, bidirectional VT) and intense tingling/numbness.",
            clinicalPearl = "Aconite = 'Sweet poison' / Monkshood: Tingling/numbness of lips + bidirectional ventricular tachycardia; persistent Na+ channel opening.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "tox_18",
            category = ForensicCategory.TOXICOLOGY,
            question = "In acute Cyanide poisoning, which modern intravenous antidote combination forms non-toxic Cyanocobalamin that is rapidly excreted in the urine?",
            options = listOf(
                "Hydroxocobalamin (Cyanokit)",
                "Sodium nitrite + Sodium thiosulfate",
                "Dimercaprol + EDTA",
                "Methylene blue"
            ),
            correctOptionIndex = 0,
            explanation = "Hydroxocobalamin (Vitamin B12a precursor) binds cyanide directly with higher affinity than cytochrome oxidase, forming non-toxic Cyanocobalamin (Vitamin B12), which is safely cleared in the urine without causing methemoglobinemia.",
            clinicalPearl = "Hydroxocobalamin is the first-line antidote for cyanide (turns urine and skin dark reddish-purple temporarily).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "tox_19",
            category = ForensicCategory.TOXICOLOGY,
            question = "Chronic arsenic ingestion produces which characteristic cutaneous dermatological lesion?",
            options = listOf(
                "'Raindrop' hyperpigmentation of trunk and hyperkeratosis of palms and soles",
                "Erythema multiforme bullae",
                "Targetoid skin plaques",
                "Diffuse alopecia totalis within 24 hours"
            ),
            correctOptionIndex = 0,
            explanation = "Chronic arsenic exposure (arsenical dermatosis) leads to a classic 'raindrop' mottled brown-black pigmentation on the trunk and neck, accompanied by punctate palmar and plantar hyperkeratosis and Mee's nail lines.",
            clinicalPearl = "Chronic Arsenic Triad: Raindrop skin pigmentation + Palmar-plantar hyperkeratosis + Mees nail lines.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_20",
            category = ForensicCategory.TOXICOLOGY,
            question = "Ergotism ('St. Anthony's Fire') is caused by ingestion of Claviceps purpurea fungus contaminating rye/grains, resulting in:",
            options = listOf(
                "Severe peripheral vasoconstriction leading to dry gangrene of fingers and toes, and hallucinatory convulsions",
                "Massive watery diarrhea with rice-water stools",
                "Acute fulminant hepatic failure within 6 hours",
                "Pemphigus vulgaris-like oral ulceration"
            ),
            correctOptionIndex = 0,
            explanation = "Ergot alkaloids (ergotamine, ergometrine) cause intense prolonged alpha-adrenergic and serotonergic vasoconstriction of peripheral arteries, leading to ischemic pain, burning sensations ('St. Anthony's Fire'), and mummified dry gangrene of digits.",
            clinicalPearl = "Ergotism = St. Anthony's Fire: Gangrenous ischemia of extremities + Convulsive hallucinations from Claviceps rye fungus.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "tox_21",
            category = ForensicCategory.TOXICOLOGY,
            question = "A patient with pin-point pupils (miosis), respiratory depression (RR < 8/min), and profound coma presents the classic triad of:",
            options = listOf(
                "Opioid overdose (Morphine / Heroin / Fentanyl)",
                "Cocaine intoxication",
                "Amphetamine psychosis",
                "Carbon monoxide toxicity"
            ),
            correctOptionIndex = 0,
            explanation = "The classic Opioid Triad consists of: 1) Pin-point pupils (except meperidine), 2) Marked respiratory depression, and 3) Coma/unconsciousness. Immediate treatment is intravenous Naloxone titration.",
            clinicalPearl = "Opioid Triad: Coma + Pinpoint pupils + Respiratory depression. Antidote: Naloxone (short half-life, repeat dosing needed).",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "tox_22",
            category = ForensicCategory.TOXICOLOGY,
            question = "Ethylene glycol (automobile antifreeze) toxicity leads to acute renal tubular necrosis and renal failure due to the precipitation of which microscopic crystals in urine and renal tubules?",
            options = listOf(
                "Envelope-shaped or needle-shaped Calcium Oxalate crystals",
                "Triple phosphate crystals",
                "Uric acid diamond plates",
                "Cystine hexagonal prisms"
            ),
            correctOptionIndex = 0,
            explanation = "Ethylene glycol is metabolized by alcohol dehydrogenase and aldehyde dehydrogenase into glyoxylic and oxalic acid. Oxalic acid binds calcium to form insoluble calcium oxalate crystals that lodge in renal tubules, causing acute tubular necrosis and hypocalcemia.",
            clinicalPearl = "Ethylene glycol: High anion gap + Osmolar gap + Calcium oxalate crystals (envelope-shaped) in urine -> Antidote: Fomepizole.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_23",
            category = ForensicCategory.TOXICOLOGY,
            question = "Reinsch test in forensic toxicology is a rapid screening test for detecting:",
            options = listOf(
                "Heavy metals (Arsenic, Antimony, Mercury, and Bismuth) on a copper strip in boiling HCl",
                "Volatile alcohols in blood",
                "Barbiturates in urine",
                "Cyanide in gastric fluid"
            ),
            correctOptionIndex = 0,
            explanation = "The Reinsch test involves placing a clean copper strip into acidified (HCl) biological tissue or fluid and boiling. Heavy metals deposit onto the copper surface as characteristic dark coatings (Arsenic = steel grey; Mercury = silvery mirror; Antimony = purplish-black).",
            clinicalPearl = "Reinsch test: Screen for Arsenic, Antimony, Mercury, Bismuth by plating onto a copper spiral in boiling acid.",
            difficulty = Difficulty.ADVANCED,
            reference = "Parikh's Toxicology"
        ),
        ForensicQuestion(
            id = "tox_24",
            category = ForensicCategory.TOXICOLOGY,
            question = "Dimercaprol (British Anti-Lewisite / BAL) is an effective chelating agent for which heavy metals?",
            options = listOf(
                "Arsenic, Mercury, Gold, and Lead (combined with EDTA)",
                "Iron and Copper exclusively",
                "Thallium and Cadmium",
                "Silver and Aluminium"
            ),
            correctOptionIndex = 0,
            explanation = "Dimercaprol (BAL) contains two vicinal sulfhydryl (-SH) groups that compete with tissue enzymes to bind heavy metals (Arsenic, inorganic Mercury, Gold, and severe Lead when paired with Ca-EDTA), forming stable, water-soluble mercaptides excreted in urine.",
            clinicalPearl = "BAL (Dimercaprol) = Chelator for Arsenic and Mercury. D-Penicillamine / Trientine = Copper (Wilson's). Deferoxamine = Iron.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "tox_25",
            category = ForensicCategory.TOXICOLOGY,
            question = "The ingestion of Yellow Oleander (Thevetia peruviana / Kaner) seeds causes severe poisoning due to which cardiac glycoside?",
            options = listOf(
                "Thevetin, Thevetoxin, and Nerifolin (Digitalis-like Na+/K+ ATPase inhibitors)",
                "Atropine and Scopolamine",
                "Morphine and Codeine",
                "Sanguinarine"
            ),
            correctOptionIndex = 0,
            explanation = "Yellow Oleander seeds contain the cardiac glycosides Thevetin A, B, and Nerifolin. They inhibit cardiac Na+/K+ ATPase pumps, causing refractory bradyarrhythmias, heart blocks, hyperkalemia, and vomiting.",
            clinicalPearl = "Yellow Oleander (Kaner): Cardiac glycosides causing AV blocks, hyperkalemia, and digitalis-like toxicity; Digoxin-specific Fab antibodies are effective.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "tox_26",
            category = ForensicCategory.TOXICOLOGY,
            question = "Epidemic Dropsy is caused by accidental or adulterated consumption of mustard oil contaminated with:",
            options = listOf(
                "Argemone mexicana (Mexican prickly poppy) seed oil containing Sanguinarine",
                "Gossypol from cottonseed oil",
                "Lathyrus sativus seeds",
                "Aflatoxin B1 from Aspergillus flavus"
            ),
            correctOptionIndex = 0,
            explanation = "Argemone mexicana seeds resemble mustard seeds. Adulteration of cooking mustard oil introduces Sanguinarine and dihydrosanguinarine, which inhibit Na+/K+ ATPase and cause widespread capillary hyperpermeability, bilateral pitting pedal edema, glaucoma, and cardiac failure (Epidemic Dropsy).",
            clinicalPearl = "Epidemic Dropsy: Argemone mexicana oil containing Sanguinarine -> Capillary leakage, bilateral pedal edema, erythema, and glaucoma; Nitric acid test turns orange-red.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        )
    )
}
