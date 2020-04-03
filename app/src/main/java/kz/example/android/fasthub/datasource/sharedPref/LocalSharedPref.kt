package kz.example.android.fasthub.datasource.sharedPref

interface LocalSharedPref {

    fun getUsername(): String?
    fun setUsername(username: String)
    fun clearUsername()

    fun getPassword(): String?
    fun setPassword(password: String)
    fun clearPassword()

}