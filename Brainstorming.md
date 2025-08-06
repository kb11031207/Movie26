---
title: Untitled

---

Requirements:
- Uses the internet and one or more APIs
- Uses a Recycler View
- Uses Consistent Custom Styling
- Contains multiple user action points (E.g, clicks, long clicks, text entry, navigation)

Leon:
    1. Knock off spotify??
    2. Weather Report App??
    3. Cooking recipie Generator??
Diego:
    1. Music library that syncs with diffrent platforms
    2. Suggestions on what to do when bored
    3. News
Himank:
    1. Recipe finder 
    2. Movie suggestion app/ app which suggests healthy snacks or meal ideas based on your mood or cravings
    3. App tracks and celebrates small personal win
Gyabaah:
    1. Travel tour suggestions for diff cities
    2. Soccer/Sports transfer news
    3. Budget app (help users track their income)
Kes :
    1.CryptoTracker Lite – Simple Coin Price App
    2.EventExplorer – Local Event Discovery App
    3.MoodMeme – Mood-based Meme Generator
    
Jonatan:
    1.MEME generator
    2.Nearby places finder
    3.Trivia quiz 
    4.Random facts
    5.Guess the flag 
    6.Animal Sound Guessing Game
    
    
Michael Campos:
    1. Daily Weather App with Tomorrow API
    2. Random Joke App
    3. Bored App with Bored API that suggests random activities to do
    

Top 3 Ideas:
1. Movie Suggestion App
2. Weather
3. Travel Tour

| **Criteria**           | **1. Movie Suggestion App** | **2. Weather App**                          | **3. Travel Tour App**                                                 |
| ---------------------- | --------------------------- | ------------------------------------------- | ---------------------------------------------------------------------- |
| **API Availability**   | ✅ TMDB, OMDb – easy & free  | ✅ OpenWeatherMap – easy                     | ⚠️ Harder – may require combining multiple APIs (places, photos, maps) |
| **RecyclerView Usage** | ✅ Yes – list of movies      | ✅ Yes – forecast list                       | ✅ Yes – list of destinations                                           |
| **Custom Styling**     | 🎬 Stylish poster cards     | ☁️ Simple cards with icons                  | ✈️ Travel photo cards – moderate effort                                |
| **User Interactions**  | Click = detail, search bar  | Search city, click card                     | Map tap, search, explore                                               |
| **Learning Curve**     | ⭐ Beginner-friendly         | ⭐⭐ Slightly trickier (parsing weather data) | ⭐⭐⭐ Advanced (multi-API + map integration)                             |
| **Offline Capability** | ❌ Mostly online             | ❌ Mostly online                             | ⚠️ Needs caching if offline use                                        |
| **Habit-Forming**      | Medium (binge users)        | High (check daily)                          | Low (occasional use)                                                   |
| **Scope for MVP**      | 🎯 Clear & simple           | 🎯 Clear & small                            | ⚠️ Broader and harder to scope                                         |


Verdict: Weather App is the Easiest to Build
Why?
One clear, free, well-documented API (OpenWeatherMap)

Simple RecyclerView usage (forecast cards or hourly data)

Basic UI: city search, weather icon, temp, description

Can add features incrementally (UV index, humidity, forecast)

🥈 Second Place: Movie Suggestion App
Also beginner-friendly

Slightly more complex because of poster images, genres, ratings

TMDB API requires account + key, but very usable

🥉 Third Place: Travel Tour App
Hardest due to:

Needing multiple APIs (e.g., Google Places, Maps, Unsplash)

Managing geo-coordinates, navigation, maybe maps

Better for advanced projects


| **Criteria** | **Evaluation**                                                                                                          |
| ------------ | ----------------------------------------------------------------------------------------------------------------------- |
| **Mobile**   | ⭐⭐ Medium. Feels like a mobile-optimized Netflix browser. UI is clean and swipeable but could exist on web too.         |
| **Story**    | ⭐⭐⭐ Clear: “Get fresh movie ideas when you don’t know what to watch.” Great for social sharing.                         |
| **Market**   | ⭐⭐⭐ Huge! Anyone who watches movies is a potential user. Highly relatable problem (decision fatigue).                   |
| **Habit**    | ⭐⭐ Medium. Use spikes during weekends or boredom. Less daily usage unless personalized.                                 |
| **Scope**    | ⭐⭐⭐ Clear MVP: fetch popular/trending movies, display in cards, click to see details. Easy to extend (genres, ratings). |


| **Criteria** | **Evaluation**                                                                |
| ------------ | ----------------------------------------------------------------------------- |
| **Mobile**   | ⭐⭐⭐ Highly mobile-specific — quick, on-the-go checks make it ideal for phones |
| **Story**    | ⭐⭐ Mild. Everyone checks weather, but there’s no unique emotional hook        |
| **Market**   | ⭐⭐ Broad but saturated. Hard to stand out unless hyperlocal or design-focused |
| **Habit**    | ⭐⭐⭐ High. People check it daily or multiple times a day                       |
| **Scope**    | ⭐⭐⭐ Simple MVP: search → get current + forecast. Easy to build in 1-2 weeks   |


| Idea                 | Score (out of 15)                                          |
| -------------------- | ---------------------------------------------------------- |
| **Movie Suggestion** | ✅ **13/15** — Best overall balance of feasibility + impact |
| **Weather App**      | 12/15 — Most practical and easy to ship                    |




