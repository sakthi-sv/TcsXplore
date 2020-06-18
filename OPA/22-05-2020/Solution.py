class Doctor:
    def __init__(self,doctorId,doctorName,specialization,consultationFee):
        self.doctorId =doctorId
        self.doctorName=doctorName
        self.specialization=specialization
        self.consultationFee=consultationFee
class Hospital:
    def __init__(self,doctorDB={}):
        self.doctorDB=doctorDB
    def searchByDoctorName(self,docName):
        l=[]
        for i in self.doctorDB.keys():
            if self.doctorDB[i].doctorName==docName:
                l+=[doctorDB[i]]
        return l
    def calculateConsultationFeeBySpecialization(self,specialization):
        sum=0
        for i in self.doctorDB.keys():
            if self.doctorDB[i].specialization==specialization:
                sum+=self.doctorDB[i].consultationFee
        return sum
if __name__ == "__main__":
    n=int(input())
    doctorDB={}
    for i in range(n):
        doctorId=int(input())
        doctorName=input()
        specialization=input()
        consultationFee=int(input())
        d=Doctor(doctorId,doctorName,specialization,consultationFee)
        doctorDB[i]=d
    hospital=Hospital(doctorDB)
    searchName=input()
    searchSpec=input()
    l=hospital.searchByDoctorName(searchName)
    fee=hospital.calculateConsultationFeeBySpecialization(searchSpec)
    if l==None:
        print("No Doctor Exists with the given DoctorName")
    else:
        for i in l:
            print(i.doctorId)
            print(i.doctorName)
            print(i.specialization)
            print(i.consultationFee)
    if fee==None:
        print("No Doctor with the given specialization")
    else:
        print(fee)