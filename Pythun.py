def main():
    arr = [5, 5, 5, 5, 5, 8, 8, 8, 8, 8, 3, 3, 3, 3, 2, 2, 2, 2]
    elements_count = {}

    # Initialize the dictionary
    for element in arr:
        if element not in elements_count:
            elements_count[element] = 1
        else:
            elements_count[element] += 1

    # Display the elements and frequencies
    print("Element frequencies:")
    for element, count in elements_count.items():
        print(f"{element}: {count}")

    # Search element = 5
    search_element = 5
    if search_element in elements_count:
        print(f"{search_element} found array.")
    else:
        print(f"{search_element} not found array.")


if __name__ == "__main__":
    main()
         