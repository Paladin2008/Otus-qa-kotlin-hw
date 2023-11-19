interface TestRunner<T : Steps> {
    fun runTest(steps: T, test: () -> Unit)
}