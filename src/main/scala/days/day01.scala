package days01

class Elf(val calories: List[Int]):
    val sumCalories = calories.sum

private def getInput(filePath: String): String = {
    val source = scala.io.Source.fromFile(filePath)
    val lines = try source.mkString finally source.close()
    return lines
}

private def transformInput(input: String) : List[Elf] = {
    val blocs = input.split("\n\n").map(_.split("\n").map(_.toInt).toList);
    val elves = blocs.map(Elf(_)).toList
    return elves
}

def main() = {
    val elves = transformInput(getInput("input/01.txt"))
    val caloriesByElf = elves.map(_.sumCalories)
    val caloriesByElfSorted = caloriesByElf.sortBy(- _)
    println(s"Highest calories : ${caloriesByElfSorted(0)}")
    println(s"Sum 3 highest calories : ${caloriesByElfSorted.slice(0,3).sum}")
}