class ParkedVehicle:
    def __init__(self,vs,fw,pf,vp):
        
        self.vehicleSeq=vs
        self.fourWheeler=fw
        self.parkedFor=pf
        self.valetParking=vp
        self.parkedStatus="Parked"
class ParkingLot:
    def __init__(self,parkd_vehicles):
        self.parkd_vehicles=parkd_vehicles
    def updateParkedStatus(self,lot_number):
        if lot_number in self.parkd_vehicles.keys():
            self.parkd_vehicles[lot_number].parkedStatus="Cleared"
            status=(lot_number,"Cleared")
            return status
        else:
            return None
    def getParkingCharges(self,lot_number):
        if lot_number in self.parkd_vehicles.keys():
            charge=0
            if self.parkd_vehicles[lot_number].fourWheeler=="Yes":
                charge=charge+(50*self.parkd_vehicles[lot_number].parkedFor)
            else:
                charge=charge+(30*self.parkd_vehicles[lot_number].parkedFor)
            if self.parkd_vehicles[lot_number].valetParking=="Yes":
                charge=charge+10
            return charge
        else:
            return None   
if __name__ == '__main__':    
    n=int(input())
    vehicleDict={}
    for i in range(n):
        vs=int(input())
        fw=input()
        pf=float(input())
        vp=input()
        lotnum=int(input())
        p=ParkedVehicle(vs,fw,pf,vp)
        vehicleDict[lotnum]=p
    parkingLot=ParkingLot(vehicleDict)
    lotnum=int(input())
    status=parkingLot.updateParkedStatus(lotnum)
    charge=parkingLot.getParkingCharges(lotnum)
    if status==None:
        print("Lot Number Invalid")
        print("Lot Number Invalid")
    else:
        print(status[0],status[1])
        print(charge)