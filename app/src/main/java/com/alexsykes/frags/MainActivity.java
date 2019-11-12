package com.alexsykes.frags;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {
    Fragment articleListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, FragActivity.class);
        startActivity(intent);


/*        View view = findViewById(R.id.container);

        articleListFragment = new ArticleListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container,articleListFragment);
        fragmentTransaction.commit();*/
    }

    public static class ArticleListFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState ) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.article_list_fragment, container, false);
        }
    }

/*    public static class ArticleReaderFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState ) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.article_reader_fragment, container, false);
        }
    }*/
}