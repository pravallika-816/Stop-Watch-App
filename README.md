# ⏱️ Stop Watch App (Android)

A clean and responsive stopwatch app built using **Java** in **Android Studio**, featuring a splash screen and core stopwatch functionality (start, stop, reset). Ideal for learning and demonstration purposes.

---

## 📱 Features

- 🌟 **Splash Screen** with 1-second delay
- 🟢 **Start** the stopwatch
- 🔴 **Stop** the stopwatch
- 🔄 **Reset** to `00:00:00`
- ⏱️ Time displayed in `MM:SS:MS` format
- 🧠 Simple and efficient logic using `Handler` and `Runnable`
- 🎨 Minimal and clean UI

---

## 🧑‍💻 Tech Stack

- **Language**: Java
- **IDE**: Android Studio
- **UI**: XML Layouts
- **Components**:
  - `Handler` for timing logic
  - `Intent` and `Activity` transition for splash navigation

---

## 📂 Project Structure

Stop-Watch-App/
├── app/
│ ├── java/com/example/stopwatchapp/
│ │ ├── MainActivity.java # Stopwatch functionality
│ │ └── SplashActivity.java # Splash screen on launch
│ ├── res/
│ │ ├── layout/
│ │ │ ├── activity_main.xml # Stopwatch UI layout
│ │ │ └── activity_splash.xml # Splash screen UI layout
│ │ └── values/ # strings.xml, colors.xml, styles.xml
│ └── AndroidManifest.xml # App declarations
├── build.gradle
└── ...

yaml
Copy
Edit

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest version)
- Android SDK configured
- Emulator or Android device

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/pravallika-816/Stop-Watch-App.git
Open the project in Android Studio

File > Open > Select the cloned folder

Run the App

Use Run ▶ on a connected device or emulator.

🖼️ UI Screens
Add screenshots here if available for:

Splash Screen

Stopwatch Running

Stopwatch Stopped

🧑‍🎓 Author
Pravallika

GitHub: @pravallika-816

📃 License
This project is licensed under the MIT License.

vbnet
Copy
Edit

Let me know if you want a `.gif` of the working app, badges (build, license, etc.), or if you
