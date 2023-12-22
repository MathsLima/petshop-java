# petshop-java
The system consists of an application for registering pets and services from a pet shop, where the user interface allows the creation, deletion and modification of pet registrations.
This system was developed as a final project for the programming subject I.

### 
    PET CLASS:
    
    This class implements the management that defines the pets, with variables and methods 
     to manage information about the pets and the services they receive.

    Class variables:

    name: Name of the pet.
    type: Pet type.
    breed: Breed of the pet.
    age: Age of the pet.
    ownername: Name of the pet owner.
    phoneOwner: Telephone number of the pet owner.
    schedulingServices: Vector with information about scheduling services.
    servicesUsed: Vector about the services used.
    servicesPerformed: Counter that keeps track of the quantity of each type of service performed.
    
     Constructor method: initializes the mandatory variables of the class and initializes the service vectors.
    
     registerService: method for registering a specific service in the schedule and marking it as a service used for each pet.
    
     addServices: method for adding a service to the schedule based on user input.
    
     ChangePhone method: modifies the phone number associated with the Pet class object.
    
     ChangeSchedule method: modifies scheduling information at a specific position in the vector.
    
     calculateTotalValue: method for calculating the total value of services used based on the cost vector with pre-defined values.
    
     toString: returns class information using string format.
    
     getters: methods to obtain the values of instance variables.
    
     setters: Methods for setting the values of instance variables.

<a> <a/>

     REGISTRATION CLASS
     
     private Pet[] pets : creates the vector with an instance of the Pet class.
     
     quantsPets: counter for the number of pets registered in the vector.
    
     Constructor method: class constructor, initializes the 'pets' vector with size 10 and sets 'quantpets' to 0.
    
     addPet: method to add a new pet to the 'pets' vector.
    
     removePet: method for removing a pet from the vector based on the user-supplied index.
    
     writeAllPets: method to display the details of pets added in the 'pets' vector.
    
     alphabetical order: method for displaying pet names in ascending alphabetical order.
    
     positionVector: method to display the position of each pet in the 'pets' vector.
    
     calculateMediaServices: method that calculates the average of services and values.
     
<a> <a/>

     APPLICATION CLASS
     
     Class containing Main to manage pet registration. Creates the registration object by instantiating the CadastroPet class
     to execute its methods. Uses a do-while for cyclical use by the user, presenting
     a menu and requesting input data from the user. Do-while uses a switch case validation of
     input data and calls the necessary methods of the CadastroPet class.
    
     The addPet method prompts the user for the information necessary to create a new pet and
     choose which services the pet will use. Invokes the methods of the CadastroPet class.
    
     The removePet method asks the user to enter the index of the pet they want to remove from the registry.
     Invokes the methods of the CadastroPet class.
