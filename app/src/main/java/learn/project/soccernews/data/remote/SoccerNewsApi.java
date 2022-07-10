package learn.project.soccernews.data.remote;

import java.util.List;

import learn.project.soccernews.domain.News;
import retrofit2.Call;
import retrofit2.http.GET;

public interface SoccerNewsApi {

    @GET("news.json")
    Call<List<News>> getNews();
}
