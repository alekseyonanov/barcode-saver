package ru.bruh.barcodesaver

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import ru.bruh.barcodesaver.ui.MainFragment

/**
 * Класс для работы с навигацией
 *
 * @author Onanov Aleksey (@onanov)
 */
class AppNavigator(private val activity: AppCompatActivity) {

    /**
     *  Установка главного экрана
     */
    fun navigateToMainScreen() {
        setRootFragment(MainFragment.newInstance())
    }

    /**
     *  Навигация назад
     */
    fun navigateBack() {
        activity.supportFragmentManager.popBackStack()
    }

    /**
     *  Навигация к фрагменту без сохранения текущего фрагмента
     */
    private fun setFragment(fragment: Fragment) {
        activity
            .supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit()
    }

    /**
     *  Навигация к фрагменту с сохранением текущего фрагмента
     */
    private fun setFragmentWithBackStack(fragment: Fragment) {
        activity
            .supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.frameLayout, fragment)
            .commit()
    }

    /**
     *  Установка главного фрагмента
     */
    private fun setRootFragment(fragment: Fragment) {
        activity
            .supportFragmentManager
            .beginTransaction()
            .add(R.id.frameLayout, fragment)
            .commitAllowingStateLoss()
    }
}