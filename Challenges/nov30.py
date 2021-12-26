from typing import Sequence

def get_data():
    user_input = input('Ingrese su nombre y dos números separados por una coma: ')
    temp_input = user_input.split(',')
    temp_input = [i.strip() for i in temp_input]

    name = temp_input[0]
    x = float(temp_input[1])
    y = float(temp_input[2])

    return name, x, y

def print_name(name : str) -> None:
    print(f'Hola {name}')

def calculate_hypotenuse(x : float, y : float) -> float:
    hypotenuse = (x ** 2 + y ** 2) ** 1/2
    return hypotenuse

if __name__ == '__main__':
    
    name, x, y = get_data()

    print_name(name)

    hyp = calculate_hypotenuse(x, y)
    print(hyp)