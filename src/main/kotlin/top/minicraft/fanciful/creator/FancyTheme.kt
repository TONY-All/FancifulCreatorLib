package top.minicraft.fanciful.creator

interface IFancyTheme {
    fun sendWelcome(name: String)

    fun sendStep(step: FancifulStep, obj: Any)

    
}