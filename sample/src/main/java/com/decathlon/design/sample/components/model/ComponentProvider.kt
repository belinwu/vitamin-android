package com.decathlon.design.sample.components.model

import com.decathlon.design.sample.R

object ComponentProvider {

    fun getAll(): List<Component> {
        return listOf(
            Component(
                R.string.colors_screen_title,
                R.drawable.ic_placeholder,
                R.id.action_main_to_colors
            ),
            Component(
                R.string.typography_screen_title,
                R.drawable.ic_fonts,
                R.id.action_main_to_typography
            ),
            Component(
                R.string.button_screen_title,
                R.drawable.ic_button,
                R.id.action_main_to_button
            ),
            Component(
                R.string.checkboxes_screen_title,
                R.drawable.ic_checkbox,
                R.id.action_main_to_checkboxes
            ),
            Component(
                R.string.radio_buttons_screen_title,
                R.drawable.ic_radiobutton,
                R.id.action_main_to_radio_button
            ),
            Component(
                R.string.switches_screen_title,
                R.drawable.ic_switch,
                R.id.action_main_to_switches
            ),
            Component(
                R.string.text_input_screen_title,
                R.drawable.ic_textinput,
                R.id.action_main_to_text_input
            ),
            Component(
                R.string.fabs_screen_title,
                R.drawable.ic_fab,
                R.id.action_main_to_fabs
            ),
            Component(
                R.string.modals_screen_title,
                R.drawable.ic_modal,
                R.id.action_main_to_modals
            ),
            Component(
                R.string.progressbar_screen_title,
                R.drawable.ic_progress,
                R.id.action_main_to_progressbar
            ),
            Component(
                R.string.ratings_screen_title,
                R.drawable.ic_placeholder,
                R.id.action_main_to_ratings
            ),
            Component(
                R.string.menus_screen_title,
                R.drawable.ic_menu,
                R.id.action_main_to_menus
            )
        )
    }

}