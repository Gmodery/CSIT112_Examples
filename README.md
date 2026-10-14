# CSIT112 Examples

This repository contains example code pertaining to the topics discussed in class. To get started with this code, you may either download specific files as needed or clone the whole repository.

The repository will be updated throughout the semester, so it is likely best to clone it now then pull periodically to get new examples. Additionally, having this code on your machine will allow you to modify and learn from the code as you see fit.

## Steps to clone this repository
1. [Download and install Git](https://git-scm.com/install/)
2. Open the terminal in either your OS or through your IDE
3. Type the following: 
    ```
    git clone https://github.com/Gmodery/CSIT112_Examples.git
    ```
    And press enter
4. The repository will be cloned to your computer
5. Periodically new examples will be added as the semester continues. When this happens, run 
    ```
    git pull
    ```
    to pull in any changes.

![](./static/cloning.gif)

## JavaFX Setup

In order to launch the JavaFX examples (and any JavaFX code, for that matter), it is necessary to have the JavaFX library in the classpath. It is highly recommended to use VSCode when using JavaFX as it handles these dependencies more simply and is easier to get started with than other IDEs.

The simplest way to get started with JavaFX is by switching your runtime over to a JDK that comes bundled with JavaFX. For this example, we will use Liberica JDK (Full Version)

1. Go to the [Liberica JDK download page](https://bell-sw.com/pages/downloads/?version=java-25&vtabs=true) and ensure that JDK 25 LTS is selected.

2. Scroll down past the first download buttons to where each OS is listed. Find your operating system and click on the dropdown that says "Package." Select "Full JDK."
    - Make sure that you download the Full JDK as this is what comes with JavaFX bundled.

![](./static/JDK_Download.gif)

3. Download the installer (MSI on Windows) and run it with the default settings. Once it is finished, open VSCode.

4. All we need to do now is tell VSCode to use this version of Java instead of what we previously had installed. Open VSCode settings with Ctrl + , (or Cmd + , on Mac) and search for 
```java.jdt.ls.java.home```
Edit this in settings.json to point to the Liberica Full JDK installation directory. For example:
```bash
"java.jdt.ls.java.home": "C:\Program Files\BellSoft\LibericaJDK-25-Full"
```
- Note: On Windows, backslashes need to be escaped, so on a Windows machine the above path should be written as:
    ```bash
    "java.jdt.ls.java.home": "C:\\Program Files\\BellSoft\\LibericaJDK-25-Full"
    ```

5. Restart VSCode, then try to run one of the JavaFX examples and/or the launcher files paired with each one. 

![](./static/JDK_Setup.gif)