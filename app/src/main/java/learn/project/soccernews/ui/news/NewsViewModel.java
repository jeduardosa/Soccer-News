package learn.project.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;

import learn.project.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalque importante", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        news.add(new News("Ferrinha joga no sábado", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        news.add(new News("Copa do mundo feminina está terminando", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit..."));
        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
=======
public class NewsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NewsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
>>>>>>> 06e290e1dd7ada5051a1805e5d6e4f635dfe7790
    }
}