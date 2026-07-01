START
	BEGIN
	BEGIN 
	CLASS:HOSPITAL
	Id :Number
	name :Text
	address :Text
	patients: List[Patient]

	METHOD:
	admit a patient () 
	Add Patient to list patients
	END METHOD
	
	discharge a patient 
	Sets patient's is Admitted to false and records the
	discharge date
	END METHOD
	
	count admitted patients
	looks through its patients and tells how many are still
	admitted
	END METHOD

	CLASS:PROCEDURE
	ATTRIBUTE:
	 patientId: Int
	 procedureId: Int
	procedureNo: Int

	BEHAVIOR:
	recorded details
	
	END CLASS

	CLASS:ROOM
	ATTRIBUTE:
	 patientId: Int
 	RoomNo: Int
	 DoctorName: String
	treatmentType: String

	BEHAVIOR:
	ASSIGNROOM

	END CLASS
-------------------------------------------

START 
	BEGIN 
	CLASS:HOSPITAL
	Id :Number
	name :String
	address :String
	patients: List[Patient]

	METHOD:
	admit a patient () 
	Add Patient to list patients
	END METHOD
	
	discharge a patient 
	Sets patient's is Admitted to false and records the
	discharge date
	END METHOD
	
	count admitted patients
	looks through its patients and tells how many are still
	admitted
	END METHOD
	
	
 	class:Patient
	id: 
	fullName:text
	dateOfBirth: text
	admissionDate: text
	dischargeDate: text
	isAdmitted: Boolean
	room:Number
	procedures:List[Procedure]

	method

	Add a procedure
	 puts  new Procedure into  0.list of procedures
	END METHOD

	Move to a room
	 changes  Room
	 it is assigned to total cost of care adds up the cost of all its procedures
	END METHOD

	CLASS:Procedure
	id:Number
	name :text
	performedDate: text
	doctorName: text
	notes: text
	cost: Number

	method
	describe itself
	 returns a short summary like the name, doctor and date
	END METHOD

	CLASS:ROOM
	id:Number
	roomNumber:String
	wardType:String
	floor:Number
	bedCount:Number