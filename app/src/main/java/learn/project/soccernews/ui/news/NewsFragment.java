package learn.project.soccernews.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
<<<<<<< HEAD
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import learn.project.soccernews.databinding.FragmentNewsBinding;
import learn.project.soccernews.ui.adapter.NewsAdapter;

=======

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import learn.project.soccernews.databinding.FragmentNewsBinding;
>>>>>>> 06e290e1dd7ada5051a1805e5d6e4f635dfe7790

public class NewsFragment extends Fragment {

    private FragmentNewsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NewsViewModel newsViewModel =
                new ViewModelProvider(this).get(NewsViewModel.class);

        binding = FragmentNewsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

<<<<<<< HEAD
        binding.rvNews.setLayoutManager(new LinearLayoutManager(getContext()));
        newsViewModel.getNews().observe(getViewLifecycleOwner(), news -> {
            binding.rvNews.setAdapter(new NewsAdapter(news));
        });
=======
        final TextView textView = binding.textNews;
        newsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
>>>>>>> 06e290e1dd7ada5051a1805e5d6e4f635dfe7790
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}