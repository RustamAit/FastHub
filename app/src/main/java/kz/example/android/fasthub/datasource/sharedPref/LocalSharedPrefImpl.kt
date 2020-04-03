package kz.example.android.fasthub.datasource.sharedPref

import android.content.SharedPreferences

class LocalSharedPrefImpl(val pref: SharedPreferences): LocalSharedPref {
    override fun getUsername(): String? = pref.getString("username",null)

    override fun setUsername(username: String) {
        pref.edit().putString("username",username).apply()
    }

    override fun clearUsername() {
        pref.edit().remove("username").apply()
    }

    override fun getPassword(): String? = pref.getString("password",null)

    override fun setPassword(password: String) {
        pref.edit().putString("password",password).apply()
    }

    override fun clearPassword() {
        pref.edit().remove("username").apply()
    }
}