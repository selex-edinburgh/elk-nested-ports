## Specific Instructions for the Nested Ports version

### Maven Dependencies
Some of the the unit test projects require **Hamcrest library** (1.3.0.v20180524-2246	org.hamcrest.library). So, it needs to be installed, and the following **Eclipse Orbit** update site can be used 
https://download.eclipse.org/tools/orbit/downloads/drops/R20230531010532/repository.

### Build

Download the `elk-nested-ports` project from https://github.com/selex-edinburgh/elk-nested-ports or clone it using the command below:

```
git clone https://github.com/selex-edinburgh/elk-nested-ports.git
```
Change directory into the `build` directory inside the `elk-nested-ports` project directory.
```
cd elk-nested-ports/build
```
Execute the following command to build.
```
mvn build package
```

### Unit Tests
Download the `elk-models` project from https://github.com/eclipse/elk-models or clone it using the command below:
```
git clone https://github.com/eclipse/elk-models.git
```
We need the models inside the projects to run the unit test tests successfully. So, put the project directory at **the same directory level** as the `elk-nested-ports` directory.

Change directory to the `build` directory contained inside the main `elk-nested-ports` directory.
```
cd elk-nested-ports/build
```
Run the following command to run the unit tests.
```l
mvn --define elk.metadata.documentation.outputPath=../docs --define tests.paths.elk-repo=../tests --define tests.paths.models-repo=../../../elk-models clean integration-test
```
If everything is okay, all unit tests should be successful.

## Elk
<p align="center">
  <img src="https://raw.githubusercontent.com/eclipse/elk/master/docs/static/img/elk_with_text.svg?sanitize=true" height="150"> 
</p>

Diagrams and visual languages are a great thing,
but getting the layout just right for them to be easily understandable
can be tedious and time-consuming.
The Eclipse Layout Kernel provides a number of layout algorithms
as well as an Eclipse-based infrastructure to connect them
to editors and viewers.
The layout algorithms are plain Java
and can thus also be used outside of Eclipse.

## More Info

* [The ELK homepage](http://www.eclipse.org/elk)
* [... and ELK's documentation](http://www.eclipse.org/elk/documentation.html)
* [ELK Live](https://rtsys.informatik.uni-kiel.de/elklive/) (web-based playground to play around with ELK)
* [elkjs](https://github.com/kieler/elkjs) (JavaScript library transpiled from ELK's Java sources)

## Example Layout

![](https://raw.githubusercontent.com/eclipse/elk/master/docs/static/img/example_layout_complexRouter.svg?sanitize=true)

## Repository Structure

The repository's structure is pretty straightforward. We only have a few folders:

* `build`:
  Contains all the files necessary to build ELK in all its different forms.
* `config`:
  Contains configuration files, such as our Checkstyle configuration.
* `docs`:
  Contains documentation in the form of a [Hugo](https://gohugo.io/) site.
* `features`:
  Contains all the Eclipse features ELK consists of.
* `plugins`:
  Contains all the plugins ELK consists of.
* `setups`:
  Contains our Oomph setup files.
* `tests`:
  Contains unit tests. Note that we have [a whole repository](https://github.com/eclipse/elk-models/) dedicated to test models.


## Building ELK

Information on how to build ELK and the documentation can be found [on our website](https://www.eclipse.org/elk/documentation/contributors/buildingelk.html).
