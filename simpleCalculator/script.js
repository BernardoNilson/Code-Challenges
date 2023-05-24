/*
 * Understanding: This program is my first one in JavaScript. so it is very basic. I am happy to learn this programming language.
 * The goal here is to make a simple calculator using all the basic JS properties.
 * 
 * @author: Bernardo Nilson
 * @version: 23.5.2023
 */

// Starting point
// Declaring some funcitons

// Function to add two numbers
function add(numberOne, numberTwo) {
    return numberOne + numberTwo;
}

// Function to subtract two numbers
function subtract(numberOne, numberTwo) {
    return numberOne - numberTwo;
}

// Function to multiply two numbers
function multiply(numberOne, numberTwo) {
    return numberOne * numberTwo;
}

// Function to divide two numbers
function divide(numberOne, numberTwo) {
    return numberOne / numberTwo;
}

// Function that use all functions above to display the results (with user enter)
function calculate(){

    // Asking the number and putting them in variables
    let firstNumber = parseFloat(document.getElementById("firstNumber").value);
    let secondNumber = parseFloat(document.getElementById("secondNumber").value);

    let addResult = add(firstNumber, secondNumber);
    let subResult = subtract(firstNumber, secondNumber);
    let multResult = multiply(firstNumber, secondNumber);
    let divResult = divide(firstNumber, secondNumber);

    document.getElementById("addNumber").innerHTML = "Adding results: " + addResult;
    document.getElementById("subNumber").innerHTML = "Subtracting results: " + subResult;
    document.getElementById("multNumber").innerHTML = "Multiplying results: " + multResult;
    document.getElementById("divNumber").innerHTML = "Dividing results: " + divResult;
}