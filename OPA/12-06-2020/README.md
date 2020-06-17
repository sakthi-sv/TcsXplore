# QUESTIONS
## Python

Create a class ParkedVehicle with below attributes:

vehicleSeq –Integer type

fourWheeler – String type

parkedFor – float type

valetParking – String type

parkedStatus – String type

             

vehicleSeq represents a unique identification number for each of the parked vehicle

fourWheeler represents if the vehicle is a four wheeler or Not  (“Yes“ / “No“ are the possible values)

parkedFor represents the number of hours for which the vehicle was parked

valetParking - if the vehicle is parked using valet parking (“Yes“ / “No“ are the possible values)

parkedStatus represents if the vehicle is “Parked“ or “Cleared“

 

Define the __init__ method to initialize all the attributes (mentioned above, in the sequence ) except parkedStatus. The parkedStatus will be set as default argument with a value "Parked"  in the constructor during the respective object creation.

 

The constructor will be called from main function. The input data read in the main function and supplied to constructor as mentioned in the above line and in the sequence mentioned.

 

Create a class ParkingLot with below attributes:

parkd_vehicles - is of type dictionary with ParkedVehicle objects [parking lot_number ( an integer ) and the respective ParkedVehicle object as a key : value pair ]

 

Define the __init__ method to initialize the dictionary attribute in the class

It initializes the dictionary (parkd_vehicles) of ParkedVehicle objects in the ParkingLot class with the dictionary supplied from main program, while creating the ParkingLot object.

 

Note: The dictionary is created and filled in main program by adding each ParkedVehicle object(which is created with the input data related to the respective ParkedVehicle )and

passed as an argument to the constructor of ParkingLot class and this will be initialized to parkd_vehicles dictionary attribute of the ParkingLot class

 

Define two methods – updateParkedStatus and getParkingCharges in ParkingLot class.

 

Method 1: updateParkedStatus:

This method takes one parameter “lot_number“ , which represents the lot number in which the respective vehicle is parked(ParkedVehicle object) and update the “parkedStatus“ attribute of the respective ParkedVehicle object ( in the parkd_vehicles dictionary in ParkedLot class ) to 'Cleared'.

 

This method makes use of the parkd_vehicles (dictionary of ParkedVehicle objects)  in the ParkingLot class to find the ParkedVehicle in the given lot number and updates the parkedStatus to "Cleared".

 

The method should return a tuple where key is the given lot_number (supplied as parameter ) and the value is the updated parkedStatus of the respective ParkedVehicle object, which is "Cleared" .

Ex:- (56, ParkedVehicle_obj.parkedStatus)

 

Display the Lot number and status (returned by this function) in the main function. Refer the sample output for display format

 

If the given lot number is not found in the “parkd_vehicles“ dictionary attribute, return None to the main function and accordingly display "Lot Number Invalid" in main function.


 

Method2: getParkingCharges:

This method will take lot_number as parameter and return the parking charges of the ParkedVehicle object associated with the lot number given. (use the “parkd_vehicles“ attribute in the ParkingLot class). Refer Parking charges calculation below.

 

If the given lot number is found then calcute the parking charges and return to main function. Display the parking charges returned by this function in the main function. Refer the sample output for display format .

If the given lot number is not found in the “parkd_vehicles“ dictionary attribute, return None to the main function and accordingly display "Lot Number Invalid" in main function.

 

Important instruction:

Use the same lot number (which is supplied as a parameter to updateParkedStatus function) as a parameter to this function as well.

 

Parking Charges rules and calculation:

a.Parking is charged on an hourly basis.

b.For a four wheeler, then charge Rs 50 per hour and if the vehicle is not a four wheeler then charge Rs 30 per hour.

c. If valetParking service is used then Rs10 is added to the total parking charges.

d. parkedFor attribute of the respective ParkedVehicle object represents the number of parking hours of the respective parked vehicle.

 

Case1: if fourWheeler attribute value of the respective ParkedVehicle object is “Yes“ then the parking charges calculated as below;

Parking charges = Charge per hour for four wheeler * ParkedVehicle_obj.parkedFor  

 

Ex: If four wheeler is parked for 5 hours ,  the parking charge = 50.0 * 5=250.0

 If valetParking attribute for the respective ParkedVehicle object is “Yes“ then add Rs10 to the parking charges ie 250.0+10=260.0

 

Case2: if fourWheeler attribute value of the respective ParkedVehicle object is “No“ then the parking charges are calculated as below:

Parking charges =Charge per hour for Non four wheeler * ParkedVehicle_obj.parkedFor

 

Ex: If Non four wheeler is parked for 3 hours ;  the charges are = 30.0 * 3= 90.0 

   If valetParking attribute for the respective ParkedVehicle object is “Yes“ then add Rs10 to the parking charges  ie  90.0+10=100.0

 

The two methods should be called from the main function / program in the same sequence as above

Use the dictionary parkd_vehicles in ParkingLot object to find out the parked vehicle object for a given lot number[ by comparing the lot number given with the lot number in the parkd_vehicles].

 

Instructions to write main and to call the methods of the classes defined above:

a. You would required to write the main program completely, Please follow the below instructions for the same.

b. You would required to write the main program which is inlign to the sample input data section mentioned below and to read the same

c. Create the respective objects(ParkedVehicle and ParkingLot) with the given sequence of arguments to fulfill the constructor requirement defined in the respective classes.

    i.Create a ParkedVehicle object after reading the data related to ParkedVehicle and add the ParkedVehicle object to ParkedVehicle dictionary,

    where lot_number and Parked vehicle object as a key:value pair. This point repeats for the number of ParkedVechicle objects you want to create and add to parked vehicles     dictionary.

   ii. Create parkingLot object with the dictionary of ParkedVehicle objects ( created as mentioned in above point# c.i ), as an argument.

d. Call the methods ( updateParkedStatus and getParkingCharges ) mentioned above from the main function in the same order , they appear in the question text.

e. Display the data returned by the functions , in the main program as per the format mentioned in the sample output.

f. If None is returned by any or both of the above functions, indicating that the given lot number does not exists , then display the message "Lot Number Invalid"(excluding the double quotes) in the main function.

 

Sample Input (below) description:

i. The 1st input taken in the main section is the number of ParkedVehicle objects to be added to the dictionary of ParkedVehicle Objects

ii. The next set of inputs are the vehicleSeq, fourWheeler, parkedFor , valetParking and the lot_number of the ParkedVehicle taken one after other for each ParkedVehicle object and is repeated for number of ParkedVehicle objects given in the first line of input

iii. Last line of input represents the lot_number supplied as a argument to updateParkedStatus function and getParkingCharges function, to find the respective vechcle object ,parked in the given lot number and to return the data as mentioend in the functions specifications above.

 

Sample Input :

4

1

Yes

2.5

Yes

87

2

No

3.5

No

123

3

Yes

1.5

No

56

4

Yes

2

Yes

104

87

 

Sample Output :

87 Cleared

135.0

 

Please note that the first line in the output represents the lot number and the parkedStatus

Second line in the output represents the total parking charge for the parked vehicle, parked in the above lot number before clearing.