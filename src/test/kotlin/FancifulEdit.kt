import org.bukkit.Location
import top.minicraft.fanciful.creator.*

@Fanciful
class FancifulEdit {
    @FancyField
    lateinit var name: String
    @FancyField
    lateinit var loc: Location
    @FancyTheme
    val theme = object : IFancyTheme { }

    @FancyStep
    val steps = listOf(
        FancifulStep("name"),
        FancifulStep("loc"),
    )
}