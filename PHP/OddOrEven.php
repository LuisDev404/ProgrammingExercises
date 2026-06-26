<?php

echo "Digite um número" . "\n";

$n1 = fgets(STDIN); 

$resul = $n1 % 2;

if($resul == 0){
    echo "Par" . "\n";
} else {
    echo "Impar" . "\n";
}