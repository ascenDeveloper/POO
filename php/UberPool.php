<?php
require_once('Car.php');
class UberPool extends Car
{
    public $brand;
    public $model;

    public function __construct($license, $driver, $model, $brand)
    {
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}