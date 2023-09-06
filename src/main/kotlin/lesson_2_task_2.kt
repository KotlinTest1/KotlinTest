fun main () {

    var companyEmployees = 50

    var salary: Int = 30000

    var interns = 30

    var salaryInterns = 20000

    var totalNumberOfEmployees = companyEmployees + interns

    //println(totalNumberOfEmployees)

    var salaryPermanentEmployee = companyEmployees * salary

        //println(salaryPermanentEmployee)

    var salaryInterns = interns * salaryInterns

    //println(salaryInterns)

    var generalExpenses = salaryPermanentEmployee + salaryInterns

    //println(generalExpenses)

    var averageSalary = generalExpenses / totalNumberOfEmployees

            println(averageSalary)

}