---
title: Project_spec

---

# 🎬 MoodFlix – Mood-Based Movie Recommender App

---
## Table of Contents

1. [App Overview](#App-Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
1. [Build Notes](#Build-Notes)

---

## 📱 App-Overview

### Description 

**MoodFlix** is a mobile application that recommends movies to users based on their current mood. By selecting one of six moods (Sad, Happy, Excited, Romantic, Scared, Thoughtful), users are presented with curated movie suggestions pulled from **The Movie Database (TMDb) API**, tailored to genre mappings associated with each emotion.


### ⚙️ App Evaluation

- **Category:Entertainment / Lifestyle**

- **Mobile: MoodFlix is optimized for a mobile-first experience, built using native Android components such as:
            RecyclerView for smooth, scrollable movie lists
            CardViews and Custom Layouts for attractive, interactive UI elements
            AsyncHttpClient for lightweight network requests (or local JSON for MVP)
            Glide for efficient image loading
            This makes the app feel fast, fluid, and intuitive—tailored to mobile users who want quick suggestions on the go. It’s more than a "mini              website"—it's a native app that leverages mobile performance and UX best practices.**
  
- **Story: We all watch movies to feel something—and MoodFlix helps you choose what to feel next."
            Whether you're happy, sad, scared, or in love, the app connects to your current emotional state and gives you recommendations that match.             This personalization creates a stronger emotional connection between the user and the app, turning it into more than just a utility—it's             a mood companion.**
  
- **Market: There’s a huge market of users constantly searching for "what to watch next," especially: Gen Z and Millennials, who value emotional intelligence, aesthetics, and speed Users overwhelmed by too many options on streaming platforms. People looking for specific moods (e.g., comedy for stress relief, thrillers for excitement). The app provides high value to a niche group (mood-driven viewers), but also has broad appeal across age         groups.**

- **Habit:The app is designed to be habit-forming in a low-friction, high-frequency way: You can open it anytime you want to watch something that                  fits your mood. Mood selection makes it feel like a fresh experience every time. There’s no login or setup barrier in MVP—just tap and go
            This design encourages users to make Movie26 part of their content discovery ritual.**
- **Scope: Mood-based movie filtering
Clean UI for mood selection and recommendations. Static/dummy data for initial launch. The scope is reasonable for a student or hobby project, and the app is easily scalable in future versions to include: Real-time API integration (e.g., TMDB, IMDb) and Genre filters**

**MoodFlix** offers a personalized and emotionally intelligent experience for movie lovers. The intuitive UX simplifies discovery and decision-making, while integration with TMDb ensures high-quality, updated content. The use of moods aligns well with behavioral UX patterns, making the app both fun and functional.

---

## Product Spec

### ✅ User Features

- Mood selection interface (Sad, Happy, Excited, Romantic, Scared, Thoughtful)
- Dynamic movie recommendations pulled from TMDb API
- Movie cards with poster, title, description, rating
- Search option (optional enhancement)
- Ability to refresh recommendations for a selected mood

### 🌐 APIs

- **TMDb API**
  - `GET /discover/movie` with filters for genre
  - API key authentication
  - Genre-based filtering based on mood-to-genre mapping

### 📊 Mood-to-Genre Mapping Table

| Mood       | Mapped Genre(s)         | TMDb Genre ID(s) |
|------------|--------------------------|------------------|
| Happy        | Comedy, Family                    | 35, 10751               |
| Sad      | Drama           | 18      |
| Excited    | Action, Adventure        | 28, 12           |
| Romantic   | Romance (Love Stories)          | 10749      |
| Scared     | Horror, Thriller         | 27, 53           |
| Thoughtful | Sci-Fi, Mystery     | 878, 9648         |

---

### 🤝 User Interaction Flow

1. User opens the app
2. User selects a mood via a clean and intuitive UI
3. The app queries the TMDb API with pre-defined genres mapped to that mood
4. A list of movies (with posters, titles, and ratings) is displayed

---

## 🖼️ Wireframes
![moodflix1](https://hackmd.io/_uploads/SysCSHldlx.png)
![moodflix2](https://hackmd.io/_uploads/HyNyIHldlg.png)

