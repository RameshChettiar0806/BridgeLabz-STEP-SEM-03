# BridgeLabz-STEP-SEM-03 — Java STEP (Semester 3)

This repository contains Java exercises, lab problems, assignments and notes for Semester 3 (Java Step). The files are organized by week under the `Weeks/` directory.

## Contents
- `Weeks/` — main folder containing weekly labs, assignments, practice problems and notes.
  - e.g. `Weeks/Week 1/`, `Weeks/Week 2/`, `Weeks/Week 3/`, etc.
- `Word Documents/` — supporting documents.

## Quickstart (Windows PowerShell)
Prerequisites: JDK 8 or later installed and `java`/`javac` available on PATH.

To compile and run the example program `Program2` (Week 4 Lab Problems) do the following.

1) From PowerShell change to the repository root:

```powershell
Set-Location -Path 'c:\Users\Ramesh\Personal Folders\MISCELLANEOUS\ENTRANCE EXAMS\SRM\SEMESTERS\SEMESTER-3\JAVA-STEP'
```

2) Compile all source files that belong to the example (this ensures dependent classes in the same folder are compiled):

```powershell
javac "Weeks\Week 4\Lab Problems\Program2\*.java"
```

3) Run the program (no package declared in the example sources). Use the folder containing the compiled classes on the classpath and the top-level class name:

```powershell
java -cp "Weeks\Week 4\Lab Problems\Program2" Program2
```

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
See `LICENCE` for license details (if present). If you need a different license, add it at the repository root and update this section.

## Contact
For questions about the exercises or structure, send an email to rc1066@srmist.edu.in
