package de.miraculixx.mcord.utils.entities

import net.dv8tion.jda.api.events.interaction.component.SelectMenuInteractionEvent

interface DropDowns {
    suspend fun trigger(it: SelectMenuInteractionEvent) {}
}