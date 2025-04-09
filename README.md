# 🍽️ Waves of Food - Android Food Ordering App

<p align="center">
  <img src="https://img.shields.io/badge/Built%20With-Kotlin-blue?style=for-the-badge&logo=kotlin"/>
  <img src="https://img.shields.io/badge/ViewBinding-Enabled-green?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/RecyclerView-Custom%20Adapter-brightgreen?style=for-the-badge"/>
</p>

---

## 📱 Overview

**Waves of Food** is a fully functional Android app developed using **Kotlin**. It allows users to browse food items, manage their cart, and proceed to checkout—all within a clean and modern UI. This project demonstrates mastery of:

- ViewBinding
- RecyclerView with custom adapter
- CardView UI
- Multiple activity-based navigation
- XML UI components
- Modern Material Design

---

## ✨ Features

✅ Splash screen with animated entry  
✅ Login and Sign-in activity  
✅ Choose location screen  
✅ Dynamic cart with quantity control  
✅ Delete items from cart  
✅ Checkout functionality  
✅ Beautiful UI with `CardView` and `ConstraintLayout`  
✅ Efficient use of `RecyclerView` + `CartAdapter` + ViewBinding  

---

## 🛠 Tech Stack

| Feature       | Used                                    |
|---------------|-----------------------------------------|
| Language      | Kotlin                                  |
| Architecture  | MVVM (Model-View-ViewModel)             |
| UI            | XML + Material Design                   |
| Navigation    | Multiple Activities (Login, Main, etc.) |
| Tools         | ViewBinding, RecyclerView, CardView     |
| IDE           | Android Studio                          |

---
## Splash_Screen
![](https://github.com/Surjeet-Singh1/AndroidProjects/blob/main/screenshot/splashScreen.jpg)
## Entry_Screen
![](https://github.com/Surjeet-Singh1/AndroidProjects/blob/main/screenshot/entryView.jpg)
## Login_Screen
![](https://github.com/Surjeet-Singh1/AndroidProjects/blob/main/screenshot/loginScreen.jpg)
## Sign_Up
![](https://github.com/Surjeet-Singh1/AndroidProjects/blob/main/screenshot/authontication.jpg)

## home_Section
![](https://github.com/Surjeet-Singh1/AndroidProjects/blob/main/screenshot/homeScreen.jpg)

## cart_Section
![](https://github.com/Surjeet-Singh1/AndroidProjects/blob/main/screenshot/CartSection.jpg)
## 🧾 Manifest Highlights

```xml
<application
    android:theme="@style/Theme.WavesOfFood"
    android:icon="@mipmap/ic_launcher"
    android:label="@string/app_name">
    
    <activity android:name=".ChooseLocationActivity" android:exported="true" />
    <activity android:name=".SigninActivity" android:exported="false" />
    <activity android:name=".LoginActivity" android:exported="false" />
    <activity android:name=".StartActivity" android:exported="false" />
    <activity android:name=".SplashScreen" android:exported="true" />
    
    <activity android:name=".MainActivity" android:exported="true">
        <intent-filter>
            <action android:name="android.intent.action.MAIN" />
            <category android:name="android.intent.category.LAUNCHER" />
        </intent-filter>
    </activity>
</application>


---
