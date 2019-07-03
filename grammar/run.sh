#!/bin/bash

echo "Clean grammar..."
antlr4-clean

echo "Run antlr4 compile..."
antlr4 -visitor -no-listener Figure.g4

echo "Compile java files..."
javac *.java
