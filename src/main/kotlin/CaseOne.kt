class CaseOne<T : Steps> : TestRunner<T> {
    override fun runTest(steps: T, test: () -> Unit) {
        steps.javaClass.methods.filter { it.name.startsWith("before") }
            .forEach {
                it.invoke(steps)
            }
        test.invoke()
        steps.javaClass.methods.filter { it.name.startsWith("after") }
            .forEach {
                it.invoke(steps)
            }
    }
}