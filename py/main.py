from sortSelection import SortSelection

def main():
    numeros=[5,2,9,1,6]
    print("Estudiante: Antonio Carvelli")
    print("Original: ", numeros)

    ## Intanciar la clase
    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print("Ordenado Asc: ", numeros)
    
    selection = SortSelection()
    selection.sort_descendente(numeros)
    print("Ordenado Des: ", numeros)
    
    
    
if __name__ == "__main__":
    main()