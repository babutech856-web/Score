package com.example.data.datasource.categories

import com.example.data.model.Difficulty
import com.example.data.model.ForensicCategory
import com.example.data.model.ForensicQuestion

object JurisprudenceQuestions {
    val all: List<ForensicQuestion> = listOf(
        ForensicQuestion(
            id = "jur_01",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Under Section 32 of the Indian Evidence Act (and international common law), a 'Dying Declaration' is admissible in court on the legal presumption that:",
            options = listOf(
                "Nemo moriturus praesumitur mentiri ('A dying person is not presumed to lie under the imminent shadow of death')",
                "Res ipsa loquitur ('The thing speaks for itself')",
                "Volenti non fit injuria ('No wrong is done to one who consents')",
                "Novus actus interveniens ('A new intervening act breaks causation')"
            ),
            correctOptionIndex = 0,
            explanation = "A Dying Declaration is an exception to the Hearsay Rule. It is based on the legal maxim 'Nemo moriturus praesumitur mentiri'—a person with a settled, hopeless expectation of imminent death will speak the truth without motive for falsehood.",
            clinicalPearl = "Dying Declaration: Admissible even without doctor's presence if mental fitness (compos mentis) is established; no oath is administered.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_02",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The legal doctrine of 'Res Ipsa Loquitur' in civil medical negligence claims implies that:",
            options = listOf(
                "The harm itself is of a nature that does not ordinarily occur in the absence of negligence, shifting the initial burden of proof to the defendant doctor",
                "The patient gave informed voluntary consent to all risks",
                "The medical record was forged post-incident",
                "The statute of limitations has expired"
            ),
            correctOptionIndex = 0,
            explanation = "'Res ipsa loquitur' ('The thing speaks for itself') applies when an injury is such that it would not occur without negligence (e.g., leaving surgical sponges inside a patient, operating on the wrong limb), shifting the evidentiary burden to the defense.",
            clinicalPearl = "Res ipsa loquitur: Gross obvious error where negligence is self-evident; shifts burden of proof onto the physician.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_03",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The Bolam Test (Bolam v Friern Hospital Management Committee) established the benchmark for medical negligence by stating that a doctor is NOT negligent if:",
            options = listOf(
                "They acted in accordance with a practice accepted as proper by a responsible body of medical opinion skilled in that particular art",
                "The patient survived without permanent organ failure",
                "The doctor possesses a postgraduate degree",
                "Consent was obtained in the presence of two witnesses"
            ),
            correctOptionIndex = 0,
            explanation = "The Bolam standard dictates that a doctor is not guilty of negligence if they acted in accordance with a practice accepted as proper by a responsible body of medical men skilled in that particular art, even if other doctors hold a contrary view (subsequently refined by the Bolitho test).",
            clinicalPearl = "Bolam test: Standard of care is judged against a responsible peer body of medical opinion, not perfection.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_04",
            category = ForensicCategory.JURISPRUDENCE,
            question = "In court testimony, an 'Expert Witness' (Section 45 Indian Evidence Act / Federal Rule of Evidence 702) differs from a 'Common (Fact) Witness' because an expert witness:",
            options = listOf(
                "Is legally permitted to state opinions and draw inferences based on specialized technical training and scientific facts",
                "Can refuse to answer cross-examination questions",
                "Can take the place of the judge",
                "Is exempt from taking the oath"
            ),
            correctOptionIndex = 0,
            explanation = "A common witness can only testify to facts perceived through their own senses (what they saw or heard). An expert witness possesses specialized knowledge/skill and is legally entitled to provide opinions, deductions, and interpretations of facts.",
            clinicalPearl = "Fact witness = Testifies only to facts perceived. Expert witness = Testifies to specialized opinion based on scientific expertise.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "jur_05",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Which legal test for criminal insanity requires proving that at the time of committing the act, the accused was laboring under such a defect of reason from disease of the mind as not to know the nature and quality of the act or that it was wrong?",
            options = listOf(
                "M'Naghten's Rule (IPC Section 84)",
                "Durham Rule",
                "Currens Rule",
                "Brodie's Rule"
            ),
            correctOptionIndex = 0,
            explanation = "M'Naghten's Rule (1843) forms the foundation of the legal defense of insanity. It requires proof that due to unsoundness of mind, the accused was incapable of knowing the nature of the act, or that what they were doing was either wrong or contrary to law.",
            clinicalPearl = "M'Naghten Rule = Legal insanity (Cognitive defect: inability to know nature of act or know right from wrong).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_06",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Professional Misconduct ('Infamous Conduct in a Professional Respect') that can lead to penal erasure from the Medical Register includes which classic '4 As' of medical ethics?",
            options = listOf(
                "Alcohol (intoxication on duty), Adultery (with a patient), Advertising (unethical self-promotion), and Association (with unqualified quacks)",
                "Apathy, Anger, Aggression, and Absenteeism",
                "Appendectomy, Autopsy, Antibiotics, and Anesthesia",
                "Aspiration, Abrasion, Asphyxia, and Alkalosis"
            ),
            correctOptionIndex = 0,
            explanation = "The classic '4 As' of Professional Misconduct (Infamous conduct) in Medical Council disciplinary regulations are: 1) Alcohol/Drugs on duty, 2) Adultery (abusing doctor-patient trust for sexual intimacy), 3) Advertising (commercial soliciting), 4) Association with unqualified practitioners.",
            clinicalPearl = "4 As of Professional Misconduct: Alcohol, Adultery, Advertising, and Association with quacks.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_07",
            category = ForensicCategory.JURISPRUDENCE,
            question = "A Subpoena / Summons issued to a medical practitioner to appear in court is:",
            options = listOf(
                "A mandatory legal order compelling attendance under penalty for non-compliance",
                "An optional invitation to attend if schedule permits",
                "A certificate of professional excellence",
                "A payment receipt for medical fees"
            ),
            correctOptionIndex = 0,
            explanation = "A Subpoena (Summons) is a writ commanding an individual under a penalty (sub poena = 'under penalty') to appear at a specified court on a given date to give evidence (Subpoena ad testificandum) or bring documents (Subpoena duces tecum). Failure to obey constitutes Contempt of Court.",
            clinicalPearl = "Subpoena ad testificandum = Witness attendance. Subpoena duces tecum = Produce documents/evidence in court.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_08",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The legal principle of 'Informed Consent' mandates that before undertaking a non-emergency surgical procedure, the doctor must disclose:",
            options = listOf(
                "The diagnosis, proposed procedure, common and serious risks, alternative treatments, and consequences of refusal",
                "Only the financial cost and hospital billing schedule",
                "The manufacturer of the surgical instruments",
                "Guaranteed 100% cure rate"
            ),
            correctOptionIndex = 0,
            explanation = "Informed consent requires providing adequate information in simple, understandable terms regarding diagnosis, nature of procedure, foreseeable substantial risks, benefits, viable alternatives, and the prognosis if treatment is declined.",
            clinicalPearl = "Informed Consent: Disclosure of diagnosis, risks, alternatives, and right to refuse; must be voluntary and by a legally competent individual.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_09",
            category = ForensicCategory.JURISPRUDENCE,
            question = "In court trial examination sequence of a medical witness, the correct chronological order is:",
            options = listOf(
                "Examination-in-chief -> Cross-examination -> Re-examination",
                "Cross-examination -> Examination-in-chief -> Re-examination",
                "Re-examination -> Cross-examination -> Examination-in-chief",
                "Cross-examination -> Re-examination -> Final verdict"
            ),
            correctOptionIndex = 0,
            explanation = "Witness examination follows: 1) Examination-in-chief (conducted by the party calling the witness; no leading questions allowed), 2) Cross-examination (by the opposing counsel; leading questions allowed to test veracity), 3) Re-examination (by calling party to clarify ambiguities arising from cross-exam).",
            clinicalPearl = "Court Sequence: Chief (no leading questions) -> Cross (leading questions allowed) -> Re-exam (only to clarify points from cross).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_10",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Leading questions (questions that suggest the desired answer, e.g., 'Was the victim wearing a red shirt?') are legally permitted during:",
            options = listOf(
                "Cross-examination (and when granted permission by judge in hostile witnesses)",
                "Examination-in-chief strictly at all times",
                "Re-examination without judicial permission",
                "None of the trial stages"
            ),
            correctOptionIndex = 0,
            explanation = "Leading questions are forbidden in Examination-in-chief and Re-examination (unless introductory or undisputed), but are freely allowed during Cross-examination under Section 143 Indian Evidence Act to challenge the witness's accuracy and credibility.",
            clinicalPearl = "Leading questions: Forbidden in Chief, freely allowed in Cross-examination.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_11",
            category = ForensicCategory.JURISPRUDENCE,
            question = "When a doctor's own witness becomes antagonistic or gives testimony contrary to their previous sworn statement, the prosecutor can request the judge to declare the witness as:",
            options = listOf(
                "A Hostile Witness (permitting the calling party to cross-examine and ask leading questions)",
                "A Defaulting Witness",
                "An Incompetent Juror",
                "A Fugitive Subject"
            ),
            correctOptionIndex = 0,
            explanation = "Under Section 154 Indian Evidence Act, when a witness displays a hostile animus or refuses to speak the truth, the court may allow the calling party to cross-examine their own witness as a 'Hostile Witness'.",
            clinicalPearl = "Hostile Witness: Calling party gains permission from the court to cross-examine and ask leading questions to their own witness.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_12",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Perjury in legal proceedings is defined as:",
            options = listOf(
                "Willfully giving false evidence or fabricating false evidence under a legally binding oath in a judicial proceeding",
                "Arriving 10 minutes late to court",
                "Refusing to accept payment for testimony",
                "Publishing medical research papers"
            ),
            correctOptionIndex = 0,
            explanation = "Perjury (giving false evidence under oath) is a serious criminal offense punishable with imprisonment under IPC Section 193. It requires an intentional, knowingly false statement on a material issue under solemn affirmation.",
            clinicalPearl = "Perjury = Willful false statement under oath in judicial proceedings.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_13",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The legal age of majority (consent for general medical contracts and full civil rights) under the Indian Majority Act is:",
            options = listOf(
                "18 years",
                "12 years",
                "16 years",
                "21 years"
            ),
            correctOptionIndex = 0,
            explanation = "The age of majority is 18 years under the Indian Majority Act. For simple medical physical examinations, valid consent can be given at 12 years (IPC Sec 89), while for surgical operations and complex procedures, 18 years is required.",
            clinicalPearl = "Age of Consent: 12 yrs for simple clinical examination (Sec 89); 18 yrs for surgery, anesthesia, and sexual consent.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_14",
            category = ForensicCategory.JURISPRUDENCE,
            question = "A 'Hostile Witness' in a criminal trial is one who:",
            options = listOf(
                "Is not desirous of telling the truth at the instance of the party calling them",
                "Physically assaults the court clerk",
                "Speaks a language that requires translation",
                "Is an expert testifying for the defense"
            ),
            correctOptionIndex = 0,
            explanation = "A hostile witness is one who unexpectedly turns against the party that summoned them, showing an adverse disposition or suppressing the truth.",
            clinicalPearl = "Hostile witness = Reluctant or antagonistic witness who deviates from previous police statements.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_15",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The Hippocratic Oath historically emphasizes which fundamental ethical axiom of medicine?",
            options = listOf(
                "Primum non nocere ('Above all, do no harm') and strict patient confidentiality",
                "Guaranteed financial remuneration for physicians",
                "Compulsory state loyalty over patient care",
                "Universal surgical intervention"
            ),
            correctOptionIndex = 0,
            explanation = "The core ethical pillars of the Hippocratic Oath and the Geneva Declaration are Non-maleficence (Primum non nocere), Beneficence, Autonomy, and professional Secrecy / Confidentiality.",
            clinicalPearl = "Medical Ethics Cardinal Principles: Autonomy, Beneficence, Non-maleficence (Do no harm), and Justice.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_16",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Privileged Communication in medical law allows a doctor to legally breach patient confidentiality without liability in cases of:",
            options = listOf(
                "Notification of notifiable infectious diseases (e.g., Cholera, Plague), suspected crime reports to police, and protecting an innocent third party from serious harm",
                "Sharing medical records with the patient's neighbors for gossip",
                "Publishing identifying photos on social media without consent",
                "Disclosing records to unauthorized insurance agents"
            ),
            correctOptionIndex = 0,
            explanation = "Privileged communication is a bona fide statement made by a doctor to protecting a public interest or private interest of another person (e.g., reporting a bus driver with epilepsy, reporting gunshot wounds, or notifying infectious diseases to health authorities).",
            clinicalPearl = "Privileged Communication justifies breaching confidentiality when public safety or statutory legal mandates override individual privacy.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_17",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Therapeutic Privilege permits a physician to withhold diagnostic or prognostic information from a patient ONLY when:",
            options = listOf(
                "Direct disclosure would pose a serious, medically substantiated psychological danger to the patient's health or trigger acute self-harm",
                "The patient's family asks the doctor to hide information for convenience",
                "The physician is too busy to explain",
                "The patient is elderly"
            ),
            correctOptionIndex = 0,
            explanation = "Therapeutic privilege is an exception to full disclosure where the doctor withholds distressing information if, in sound clinical judgment, direct disclosure would cause catastrophic psychological collapse or suicide. It must be exercised with extreme caution and documented.",
            clinicalPearl = "Therapeutic Privilege: Exception to informed consent disclosure when truth would cause severe psychiatric decompensation.",
            difficulty = Difficulty.ADVANCED,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "jur_18",
            category = ForensicCategory.JURISPRUDENCE,
            question = "In India, an Inquest under Section 174 CrPC is routinely conducted by:",
            options = listOf(
                "A Police Officer (Police Sub-Inspector / Station House Officer)",
                "The Chief Justice of the High Court",
                "The Medical Superintendent",
                "The Forensic Pathologist"
            ),
            correctOptionIndex = 0,
            explanation = "In India, Police Inquest (Section 174 CrPC) is the standard investigation into unnatural or suspicious deaths conducted by a police officer. Magistrate Inquest (Section 176 CrPC) is mandatory in deaths in police custody, dowry deaths within 7 years of marriage, and exhumations.",
            clinicalPearl = "Police Inquest = Section 174 CrPC (routine). Magistrate Inquest = Section 176 CrPC (custodial deaths, dowry deaths, exhumations).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_19",
            category = ForensicCategory.JURISPRUDENCE,
            question = "A Magistrate's Inquest (Section 176 CrPC) is legally MANDATORY in which of the following scenarios?",
            options = listOf(
                "Death of a person in police custody or lockup, and death of a woman within 7 years of marriage under suspicious circumstances (dowry death)",
                "Accidental fall from a tree",
                "Natural death from senility at home",
                "Death from chronic diabetes mellitus"
            ),
            correctOptionIndex = 0,
            explanation = "Under Section 176 CrPC, a Magistrate Inquest is legally obligatory in: 1) Custodial deaths (police/jail custody), 2) Police firing deaths, 3) Dowry death / suicide of a married woman within 7 years of marriage, 4) Exhumation of a buried body.",
            clinicalPearl = "Magistrate Inquest (Sec 176 CrPC) is compulsory for custodial deaths, encounter deaths, and dowry deaths (< 7 yrs of marriage).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_20",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Exhumation (lawful disinterment of a buried corpse for postmortem examination) requires authorization from:",
            options = listOf(
                "An Executive Magistrate (District Magistrate or Sub-Divisional Magistrate)",
                "The Hospital Chief Medical Officer",
                "The local Municipal Health Inspector",
                "The treating physician"
            ),
            correctOptionIndex = 0,
            explanation = "Exhumation can only be carried out under written order of an Executive Magistrate (DM, SDM). In India, there is no statute of limitations (time limit) for conducting an exhumation in criminal investigations.",
            clinicalPearl = "Exhumation requires an Executive Magistrate's order; there is NO time limit/limitation period for exhumation in India.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_21",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Under Section 84 of the Indian Penal Code, an act is NOT an offense if done by a person who, at the time of doing it, by reason of unsoundness of mind, was:",
            options = listOf(
                "Incapable of knowing the nature of the act, or that they were doing what was either wrong or contrary to law",
                "Mildly depressed following financial loss",
                "Experiencing transient anxiety",
                "Under voluntary alcohol intoxication"
            ),
            correctOptionIndex = 0,
            explanation = "Section 84 IPC enshrines the legal insanity defense based on M'Naghten rules. It requires proving that mental unsoundness completely destroyed the cognitive capacity to know right from wrong at the exact moment of the offense.",
            clinicalPearl = "Legal Insanity vs Medical Insanity: Law recognizes only impairment of cognitive understanding (inability to distinguish right from wrong).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_22",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Voluntary intoxication as a defense in criminal law:",
            options = listOf(
                "Is generally NOT a defense against criminal charges, as voluntary drunkenness does not excuse a crime (Sec 85/86 IPC)",
                "Completely exonerates the perpetrator from all criminal liability",
                "Shifts criminal liability to the bartender",
                "Reduces all murders to accidental injuries automatically"
            ),
            correctOptionIndex = 0,
            explanation = "Under Section 85 & 86 IPC, Involuntary intoxication (administered without knowledge or against will) is a complete defense. In contrast, Voluntary intoxication is NOT an excuse, and the accused is presumed to have the same knowledge as a sober person.",
            clinicalPearl = "Involuntary intoxication = Defense (Sec 85). Voluntary intoxication = NO defense (Sec 86 IPC).",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        ),
        ForensicQuestion(
            id = "jur_23",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The Medical Termination of Pregnancy (MTP) Amendment Act allows termination of pregnancy up to 24 weeks for vulnerable categories of women with the opinion of:",
            options = listOf(
                "Two Registered Medical Practitioners (RMPs)",
                "One Registered Medical Practitioner alone",
                "The District Police Superintendent",
                "A judicial magistrate jury"
            ),
            correctOptionIndex = 0,
            explanation = "Under the MTP Amendment Act (India), pregnancy may be terminated up to 20 weeks with the opinion of ONE RMP, and between 20 to 24 weeks (for special categories: rape survivors, incest, minors, fetal anomalies) with the opinion of TWO RMPs.",
            clinicalPearl = "MTP limits: Up to 20 weeks = 1 RMP; 20–24 weeks = 2 RMPs (special categories); Beyond 24 weeks for major fetal anomalies = Medical Board.",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_24",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Vicarious Liability in medical law (Respondent Superior) implies that:",
            options = listOf(
                "An employer/hospital is legally and financially liable for negligent acts committed by its employee doctors/nurses within the scope of employment",
                "The patient is responsible for all surgical errors",
                "Only the junior intern is held accountable",
                "The manufacturer of the drug is sued in every malpractice case"
            ),
            correctOptionIndex = 0,
            explanation = "Vicarious liability (Respondeat Superior = 'Let the master answer') holds hospitals and employers legally responsible for negligent acts or omissions committed by their employees during the course of their employment duties.",
            clinicalPearl = "Respondeat Superior: Hospital is vicariously liable for malpractice of its employed medical and nursing staff.",
            difficulty = Difficulty.STANDARD,
            reference = "Knight's Forensic Pathology"
        ),
        ForensicQuestion(
            id = "jur_25",
            category = ForensicCategory.JURISPRUDENCE,
            question = "Euthanasia in medical jurisprudence is classified into active and passive euthanasia. 'Passive Euthanasia' refers to:",
            options = listOf(
                "Withholding or withdrawing life-sustaining medical treatment/support, allowing a terminally ill patient to die naturally",
                "Administering a lethal injection of potassium chloride",
                "Prescribing a lethal dose of barbiturates for self-administration",
                "Suffocating the patient with carbon dioxide"
            ),
            correctOptionIndex = 0,
            explanation = "Passive euthanasia involves the withdrawal or withholding of artificial life support measures (ventilator, inotropes) allowing natural death to take its course in brain-dead or terminally ill patients (legalized in India with Advance Directives).",
            clinicalPearl = "Passive Euthanasia = Withholding/withdrawing life support in terminally ill patients (Permitted by Supreme Court of India with living will).",
            difficulty = Difficulty.STANDARD,
            reference = "Reddy's Essentials of Forensic Medicine"
        ),
        ForensicQuestion(
            id = "jur_26",
            category = ForensicCategory.JURISPRUDENCE,
            question = "The POCSO Act (Protection of Children from Sexual Offences) mandates that any medical professional who receives knowledge of a sexual offence against a child (under 18 years) MUST:",
            options = listOf(
                "Mandatorily report the matter to the Special Juvenile Police Unit or local police, failure of which is a punishable criminal offense",
                "Keep the information strictly secret under doctor-patient confidentiality",
                "Inform the media before medical examination",
                "Wait for parent's financial clearance before reporting"
            ),
            correctOptionIndex = 0,
            explanation = "Under Section 19 and 21 of POCSO Act, failure of a doctor/hospital to report suspected sexual abuse of a minor (< 18 yrs) to the Special Juvenile Police Unit or local police is a cognizable offense punishable with fine and imprisonment.",
            clinicalPearl = "POCSO Act: Mandatory reporting of child abuse overrides doctor-patient confidentiality; failure to report is a criminal offense.",
            difficulty = Difficulty.STANDARD,
            reference = "Parikh's Medical Jurisprudence"
        )
    )
}
