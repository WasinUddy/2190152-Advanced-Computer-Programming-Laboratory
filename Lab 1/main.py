class Doll:
    def __init__(self, name: str, material: str, dimensions: tuple, price: float):
        self.name = name
        self.material = material
        self.dimensions = dimensions
        self.price = price
        self.volume = dimensions[0] * dimensions[1] * dimensions[2]

    def display_info(self):
        """Prints the information of the doll"""
        print(self.name, self.material, self.dimensions, self.price)

    def is_fragile(self):
        """Returns True if the doll is fragile"""
        return self.material in ("Porcelain", "Glass")

    def __str__(self):
        """Returns a string representation of the doll (doll's name)"""
        return self.name
    
    def __lt__(self, rhs):
        """Returns True if the volume of the doll is less than the volume of the rhs volume"""
        return self.volume < rhs.volume



class Barbie(Doll):
    def __init__(self, name: str, material: str, dimension: tuple, price: float):
        super().__init__(name, material, dimension, price)

    def play(self):
        """Prints playing message of Barbie"""
        print("Barbie sings: I'm a Barbie girl in a Barbie world")
    

class TeddyDoll(Doll):
    def __init__(self, name: str, material: str, dimension: tuple, price: float):
        super().__init__(name, material, dimension, price)

    def play(self):
        """Prints playing message of TeddyDoll"""
        print("Teddy Doll says: Hug me!")
        


class PorcelainDoll(Doll):
    def __init__(self, name: str, material: str, dimension: tuple, price: float):
        super().__init__(name, material, dimension, price)

    def play(self):
        """Prints playing message of PorcelainDoll"""
        print("Porcelain Doll is delicate, be gentle!")
    
# Put your code in this cell

dolls = [
    Barbie("Barbie1", "Plastic", (30, 20, 10), 29.99),
    Barbie("Barbie2", "Plastic", (30, 20, 10), 34.99),
    TeddyDoll("Teddy", "Plush", (25, 15, 12), 19.99),
    PorcelainDoll("Porcelain1", "Porcelain", (18, 10, 8), 49.99),
    PorcelainDoll("Porcelain2", "Porcelain", (18, 10, 8), 59.99)
]

def main(doll_list: list):

    "Prints the names of all dolls in the list sorted by their order in the list in one line"
    print(*[doll.name for doll in doll_list])

    "Print the total price of all dolls"
    print("\nTotal price of all dolls:", sum([doll.price for doll in doll_list]))

    "Print the doll sorted by price"
    print("\nDolls sorted by price:", *tuple((map(lambda x: "{}: ${}".format(x.name, x.price) ,sorted(doll_list, key=lambda doll: doll.price)))), sep='\n')

    "Play with all dolls"
    print("\nPlaying with all dolls:")
    for doll in doll_list:
        doll.play()

    "Play with non-fragile dolls"
    print("\nPlaying with non-fragile dolls:")
    for doll in doll_list:
        if not doll.is_fragile():
            doll.play()

main(doll_list=dolls)