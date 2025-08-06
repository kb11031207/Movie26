---
title: Project_spec

---

# 🎬 MoodFlix – Mood-Based Movie Recommender App

---

## 📱 App Overview

**MoodFlix** is a mobile application that recommends movies to users based on their current mood. By selecting one of six moods (Sad, Happy, Excited, Romantic, Scared, Thoughtful), users are presented with curated movie suggestions pulled from **The Movie Database (TMDb) API**, tailored to genre mappings associated with each emotion.

---

# ⚙️ App Specification

## 📝 Evaluation

**MoodFlix** offers a personalized and emotionally intelligent experience for movie lovers. The intuitive UX simplifies discovery and decision-making, while integration with TMDb ensures high-quality, updated content. The use of moods aligns well with behavioral UX patterns, making the app both fun and functional.

---



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

