package ui.models

data class ModuleBlueprint(val index: Int, val name: String, val root: String, val dependencies: List<Int>)