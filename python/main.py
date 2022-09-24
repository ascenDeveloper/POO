from car import Car
from account import Account
from uberX import UberX

if __name__ == '__main__':
    print("Hola Mundo")
    car = Car("AMS234", Account("Andres Herrera", "SFI892"))
    print(vars(car))

    uberX = UberX("AS678", Account("Andrea Ferran", "ANDA765"), "Chevrolet",
                  "Spark")
    print(vars(uberX))