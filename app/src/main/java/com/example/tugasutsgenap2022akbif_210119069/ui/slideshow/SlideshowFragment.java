package com.example.tugasutsgenap2022akbif_210119069.ui.slideshow;
//Nama : Tri Novarel Rahmadhani
//Kelas : IF-2
//NIM : 10119069
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.tugasutsgenap2022akbif_210119069.R;
import com.example.tugasutsgenap2022akbif_210119069.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    ViewPager viewPager;
    Adapter adapter;

    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentSlideshowBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        final TextView textView = binding.textSlideshow;
//        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setViewPager();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void setViewPager() {
        adapter = new Adapter(requireActivity());
        viewPager = getView().findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);
    }

    private class Adapter extends PagerAdapter {
        Context context;
        LayoutInflater inflater;

        public Adapter(Context context) { this.context = context; }

        int[] list_img = {
                R.drawable.bg,
                R.drawable.fotoaku
        };
        int[] list_judul = {
                R.drawable.desktugas,
                R.drawable.minibook
        };
        int[] list_desk = {
                R.drawable.unikom,
                R.drawable.nim
        };

        @Override
        public int getCount() {
            return list_img.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return (view == object);
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.item_layout,container, false);
            LinearLayout LinearLayout = view.findViewById(R.id.itemlayout);
            ImageView imageView = view.findViewById(R.id.image);
            ImageView judul = view.findViewById(R.id.judul);
            ImageView desk = view.findViewById(R.id.deskripsi);

            imageView.setImageResource(list_img[position]);
            judul.setImageResource(list_judul[position]);
            desk.setImageResource(list_desk[position]);
            container.addView(view);
            return view ;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            super.destroyItem(container, position, object);
        }
    }
}