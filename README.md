# BridgeLabz-STEP-SEM-03 — Java Step (Semester 3)

This repository contains Java exercises, lab problems, assignments and notes for Semester 3 (Java Step). The files are organized by week under the `Weeks/` directory.

## Contents
- `Weeks/` — main folder containing weekly labs, assignments, practice problems and notes.
  - e.g. `Weeks/Week 1/`, `Weeks/Week 2/`, `Weeks/Week 3/`, etc.
- `Word Documents/` — supporting documents.

## Quickstart (Windows PowerShell)
Prerequisites: JDK 8 or later installed and `java`/`javac` available on PATH.

To compile a Java file (example: Program2 in Week 4 Lab Problems):

```powershell
# change to repo root first
Set-Location -Path 'c:\Users\Ramesh\Personal Folders\MISCELLANEOUS\ENTRANCE EXAMS\SRM\SEMESTERS\SEMESTER-3\JAVA-STEP'

# compile (adjust path to the .java file)
javac "Weeks\Week 4\Lab Problems\Program2\Program2.java"

# run (use the fully-qualified class name or path; run from the directory containing the compiled .class file)
java -cp "Weeks\Week 4\Lab Problems\Program2" Program2
```

Notes:
- If classes are part of packages, compile from the repository root and use the package-qualified class name with `java`.
- For multi-file projects, compile using `javac` with wildcards or list all source files, e.g. `javac Weeks\Week1\Homework\*.java`.

## Project structure (high level)
- `Weeks/Week 1/` — Homework, Lab, Notes, Problems
- `Weeks/Week 2/` — Assignment-HW, Lab, Notes, Practise Problems
- ...

## Contributing
If you want to add or update problems, please:
1. Add files under the appropriate `Weeks/Week X/` folder.
2. Follow existing naming and packaging conventions.
3. Include a short comment at the top of new files describing the program purpose.

## License
See `Weeks/LICENCE` or `Weeks/LICENSE` for license details (if present). If you need a different license, add it at the repository root and update this section.

## Contact
For questions about the exercises or structure, Send an email to rc1066@srmist.edu.in
