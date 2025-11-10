# conj-2025-workshop-playground

Hello. Welcome to the SciCloj "Functional Data Analysis in Clojure" workshop. 

This repository provides an easy way to get going with Clojure's
Data Toolkit using Noj. Below you fill find requirements and setup
instructions.

# Requirements

- Clojure ([install guide](https://clojure.org/guides/install_clojure))
- VSCode ([download](https://code.visualstudio.com/download))
  - Within VSCode install the extensions:
  - Calva 
  - Calva Power Tools

# Setup Steps

1. **Clone this playground repository**
```bash
   git clone https://github.com/ezmiller/conj-2025-workshop-playground
```

2. **Ensure Calva & Calva Power Tools Extension Installed**

3. **Open in VSCode**
   - Open the `conj-2025-workshop-playground` folder in VSCode

4. **Start the REPL**
   - Once you opened the folder Calva probably jacked in
   - If not run the "Calva: Start a Project Repl.." command from the command palette

5. **Test thing are working**
   - Open the `notebooks/test.clj` file
   - Using Calva evaluate each expression
     - Do this with either
       - `Ctrl+c Ctcl-Enter`
       - From the cmd palette: "Calva: Evaluate Top Level Form (defun) to Comment
   - You should see something like:

   ![desired output](test-output.png)