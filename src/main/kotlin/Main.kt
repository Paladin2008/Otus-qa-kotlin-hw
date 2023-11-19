fun main() {
    val testStep = Steps()
    val testRunner: TestRunner<Steps> = CaseOne()

    testRunner.runTest(testStep) {
        println("Test")
    }
}
