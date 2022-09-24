<?php
// require_once('Car.php');
// require_once('Account.php');

// $car = new Car("FDS354", new Account("Andres Herrera", "FDS483"));
// $car->printDataCar();
require_once('Car.php');
require_once('UberX.php');
require_once('UberPool.php');
require_once('Account.php');

$uberX = new UberX("CVF214", new Account("Andres Herrera", "ASF654"), "Chevrolet", "Spart");

$uberX->printDataCar();

$uberPool = new UberPool("DFJ756", new Account("Andrea Herrera", "ASD834"), "Dodge", "Spark");

$uberX->printDataCar();