import requests

import pytest



# Endpoint URLs

        now_playing_url = "https://api.themoviedb.org/3/movie/now_playing"

        popular_url = "https://api.themoviedb.org/3/movie/popular"

        rating_url = "https://api.themoviedb.org/3/movie/{movie_id}/rating"



        # API Key (ganti dengan API key yang valid)

        api_key = "0ccc5bd02df92a7a78ea75a0b32c3e7a"



        # Test Get Movie Now Playing

        def test_get_movie_now_playing():

        params = {"0ccc5bd02df92a7a78ea75a0b32c3e7a": api_key}

        response = requests.get(now_playing_url, params=params)

        assert response.status_code == 200

        assert response.json() is not None



        # Test Get Movie Popular

        def test_get_movie_popular():

        params = {"a0ccc5bd02df92a7a78ea75a0b32c3e7a": api_key}

        response = requests.get(popular_url, params=params)

        assert response.status_code == 200

        assert response.json() is not None



        # Test Post Movie Rating

        def test_post_movie_rating():

        # Ganti dengan movie_id yang valid