## Essential commands for the exam:

1. **`javac`** - Java Compiler
   - **Usage**: `javac FileName.java`
   - **Purpose**: Compiles a Java source file into bytecode (.class files). This is the first step in running a Java application from the command line.

2. **`java`** - Java Application Launcher
   - **Usage**: `java ClassName`
   - **Purpose**: Runs the Java program by specifying the class name (without the .class extension) that contains the `main` method.

3. **`jar`** - Java Archive Tool
   - **Usage**: `jar cf JarName.jar ClassName.class`
   - **Purpose**: Used to package multiple Java classes and resources into a single archive file, typically used for distribution.

4. **`javadoc`** - Java Documentation Generator
   - **Usage**: `javadoc FileName.java`
   - **Purpose**: Generates HTML documentation from Java source code. It’s useful for creating API documentation or for understanding code libraries.

5. **`jshell`** - Java Shell
   - **Usage**: Just type `jshell` in the terminal.
   - **Purpose**: An interactive tool for learning and prototyping in Java. It allows for executing Java statements, including declarations, statements, expressions, and running simple programs.

6. **`jdeps`** - Java Dependency Analysis Tool
   - **Usage**: `jdeps FileName.class`
   - **Purpose**: Analyzes and prints the package-level or class-level dependencies of Java class files or JAR files. Useful for understanding the dependencies of your code.

7. **`jlink`** - Java Linker
   - **Usage**: `jlink --module-path /path/to/modules --add-modules moduleName --output /path/to/output`
   - **Purpose**: Creates a custom reduced Java runtime image containing only the modules specified and their dependencies. Useful for creating lightweight distributions of an application.


## Options and flags for the exam per command:
 
### 1. **javac** (Java Compiler)
- **`-d`**: Specifies the destination directory for class files. Usage: `javac -d folder ClassName.java`
- **`-cp`** or **`-classpath`**: Specifies the path to directories or JAR files containing classes and packages needed to compile your program. Usage: `javac -cp ".:/path/to/library" ClassName.java`
- **`-sourcepath`**: Specifies the path to source code files. Usage: `javac -sourcepath src src/ClassName.java`
- **`-g`**: Generates all debugging information, including local variables. By default, only line number and source file information is compiled.

### 2. **java** (Java Application Launcher)
- **`-cp`** or **`-classpath`**: Sets the classpath for searching for class files and resources. Usage: `java -cp ".:/path/to/library" ClassName`
- **`-jar`**: Executes a program encapsulated in a JAR file. Usage: `java -jar application.jar`
- **`-Xms`** and **`-Xmx`**: Specify the initial and maximum heap size. Useful for controlling the memory usage of applications. Usage: `java -Xms512m -Xmx1024m ClassName`
- **`-Dproperty=value`**: Sets a system property value. Usage: `java -DmyKey=myValue ClassName`

### 3. **jar** (Java Archive Tool)
- **`c`**: Creates a new archive.
- **`f`**: Specifies the archive file name.
- **`v`**: Generates verbose output to standard output.
- **`m`**: Includes manifest information from a specified manifest file. Usage: `jar cmf MANIFEST.MF my-archive.jar -C bin/ .`
- **`x`**: Extracts files from an archive.

### 4. **javadoc** (Java Documentation Generator)
- **`-d`**: Specifies the destination directory for the generated HTML files. Usage: `javadoc -d docs ClassName.java`
- **`-sourcepath`**: Specifies where to find input source files. Usage: `javadoc -sourcepath src -d docs ClassName.java`
- **`-classpath`**: Specifies the path to referenced classes. Usage: `javadoc -classpath /path/to/libs -d docs ClassName.java`
- **`-author`**: Includes author information.
- **`-version`**: Includes version information.

### 5. **jshell** (Java Shell)
- **`-v`**: Verbose output, which provides feedback about what is being interpreted and executed.
- **`-classpath`**: Specifies where to find user class files. Usage: `jshell --class-path /path/to/libs`

### 6. **jdeps** (Java Dependency Analysis Tool)
- **`-verbose`**: Shows all dependencies.
- **`-summary`**: Shows a summary of the dependencies.
- **`-cp`** or **`-classpath`**: Specifies where to find class files. Usage: `jdeps -classpath /path/to/libs ClassName.class`

### 7. **jlink** (Java Linker)
- **`--module-path`**: Sets the module path.
- **`--add-modules`**: Specifies the modules to include in the image.
- **`--output`**: Specifies the output directory for the image.
- **`--compress`**: Controls the compression level; `2` for ZIP compression.


## `module-source-path` with `javac`

The `module-source-path` option for `javac` is particularly important when you are compiling Java modules. Modules were introduced in Java 9 as part of the Java Platform Module System (JPMS) and allow for better encapsulation and modularization of code.

- **Purpose**: Specifies where to find the source files for multiple modules during compilation.
- **Usage**: `javac --module-source-path "src/*" -d mods $(find src -name "*.java")`

#### Description and Example:

Suppose you have a project structure where each module's source code is stored in separate directories under a common source directory. For example, your directory structure might look like this:

```
project/
│
├── src/
│   ├── module1/
│   │   └── com/example/module1/
│   │       └── Module1.java
│   ├── module2/
│   │   └── com/example/module2/
│   │       └── Module2.java
│   └── module3/
│       └── com/example/module3/
│           └── Module3.java
└── mods/
```

Here's how you can compile these modules using `module-source-path`:

- **Command**: `javac --module-source-path "src/*" -d mods $(find src -name "*.java")`
- **Explanation**:
  - `--module-source-path "src/*"`: This tells `javac` that each subdirectory inside `src/` corresponds to a different module. The `*` is a wildcard that matches any module name.
  - `-d mods`: This option specifies that the compiled `.class` files should be placed in the `mods` directory, organized by module.
  - `$(find src -name "*.java")`: This part of the command uses the `find` command to list all `.java` files under the `src` directory. This list of files is then passed to `javac` for compilation.


## Examples

### 1. **javac** (Java Compiler)
- **Example**: `javac -d bin -cp lib/commons-lang3.jar src/MyApp.java`
- **Description**: This command compiles the Java source file `MyApp.java` found in the `src` directory, with a classpath that includes the `commons-lang3.jar` library located in the `lib` directory. The compiled `.class` files are placed in the `bin` directory.

### 2. **java** (Java Application Launcher)
- **Example**: `java -cp bin:lib/commons-lang3.jar MyApp`
- **Description**: Runs the `MyApp` class, where the classpath is set to include the `bin` directory (where the compiled classes reside) and the `commons-lang3.jar` library. This allows Java to find all the necessary classes and resources to execute `MyApp`.

### 3. **jar** (Java Archive Tool)
- **Example**: `jar cvf app.jar -C bin/ .`
- **Description**: Creates a JAR file named `app.jar` from all the files in the `bin` directory. The `-C` option changes the directory to `bin` before processing to include all its contents in the jar. The `v` flag generates verbose output showing the files being added.

### 4. **javadoc** (Java Documentation Generator)
- **Example**: `javadoc -d doc -sourcepath src -classpath lib/commons-lang3.jar MyApp.java`
- **Description**: Generates HTML format documentation for the `MyApp.java` source file. The documentation is generated from source files located in the `src` directory, uses `commons-lang3.jar` for any dependencies, and outputs the resulting documentation into the `doc` directory.

### 5. **jshell** (Java Shell)
- **Example**: `jshell --class-path lib/commons-lang3.jar`
- **Description**: Starts the interactive Java Shell (jshell) with the classpath including the `commons-lang3.jar` library. This setup allows testing and experimenting with code snippets that depend on classes in the specified jar.

### 6. **jdeps** (Java Dependency Analysis Tool)
- **Example**: `jdeps -verbose:class -cp bin MyApp.class`
- **Description**: Analyzes and shows class-level dependencies for `MyApp.class`. It also considers any additional classes in the `bin` directory that might be dependencies due to the specified classpath.

### 7. **jlink** (Java Linker)
- **Example**: `jlink --module-path $JAVA_HOME/jmods:mlib --add-modules java.base,my.module --output myimage --compress=2`
- **Description**: Creates a custom Java runtime image named `myimage` that includes only the `java.base` module and a custom module named `my.module`. The modules are searched in the `$JAVA_HOME/jmods` directory and a custom module path `mlib`. The output is compressed using ZIP compression level 2.

