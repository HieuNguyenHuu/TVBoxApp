package com.crewkingstudio.tvboxapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.HorizontalGridView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    HorizontalGridView gridViewHome;
    static ImageView imagebackgroundlist;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        gridViewHome = view.findViewById(R.id.gridViewList);

        imagebackgroundlist = view.findViewById(R.id.imagebackgroundlisthome);

        List<MediaModel> alist = new ArrayList<>();

        //MediaModel amedia = new MediaModel("1", "BIỆT ĐỘI SIÊU ANH HÙNG 4: HỒI KẾT", "Avengers 4: Endgame (2019)", "http://image.phimmoi.net/film/7166/poster.medium.jpg");

        MediaModel amedia = new MediaModel();
        amedia.setMediaInfo("Avengers 4: Endgame (2019)");
        amedia.setMediaTitle("BIỆT ĐỘI SIÊU ANH HÙNG 4: HỒI KẾT");
        amedia.setMediaThumbnail("https://galaxycine.vn/media/2019/4/10/406wx600h_1554864308063.jpg");
        alist.add(amedia);

        amedia = new MediaModel();
        amedia.setMediaInfo("Mr.Long (2019)");
        amedia.setMediaTitle("LONG SÁT THỦ");
        amedia.setMediaThumbnail("https://m.media-amazon.com/images/M/MV5BM2M1NDBiNmEtZmEyNS00MzlhLTk0ZjEtYTYxZTk3YjY4MmQxXkEyXkFqcGdeQXVyMjQ3NzUxOTM@._V1_UY1200_CR109,0,630,1200_AL_.jpg");
        alist.add(amedia);

        amedia = new MediaModel();
        amedia.setMediaInfo("Escape from Pretoria (2019)");
        amedia.setMediaTitle("PHI VỤ ĐÀO TẨU");
        amedia.setMediaThumbnail("https://m.media-amazon.com/images/M/MV5BOWRhYWFkMDEtNTFjZC00OWJkLWJmMWQtNzI2OWRjZjVjOGYyXkEyXkFqcGdeQXVyMzQwMTY2Nzk@._V1_.jpg");
        alist.add(amedia);

        amedia = new MediaModel();
        amedia.setMediaInfo("Ace Ventura (2019)");
        amedia.setMediaTitle("THÁM TỬ THÚ CƯNG");
        amedia.setMediaThumbnail("https://i.pinimg.com/originals/a2/4c/d9/a24cd968918dab3837cfc45622f391a8.jpg");
        alist.add(amedia);

        amedia = new MediaModel();
        amedia.setMediaInfo("Time to Hunt (2019)");
        amedia.setMediaTitle("GIỜ SĂN ĐÃ ĐẾN");
        amedia.setMediaThumbnail("https://m.media-amazon.com/images/M/MV5BMmIzYzUyZTktODVlYy00ZTdjLWFkYzEtNTMyZTY3MWVhNzQ0XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UY1200_CR113,0,630,1200_AL_.jpg");
        alist.add(amedia);

        amedia = new MediaModel();
        amedia.setMediaInfo("Farewell Song(2019)");
        amedia.setMediaTitle("KHÚC HÁT BIỆT LY");
        amedia.setMediaThumbnail("https://m.media-amazon.com/images/M/MV5BNzAyNzkzYTEtZWVlOS00NTI0LWI0NWEtOGY1MmVlOWZmM2Y2XkEyXkFqcGdeQXVyMzEzMzY3Ng@@._V1_.jpg");
        alist.add(amedia);

        amedia = new MediaModel();
        amedia.setMediaInfo("Mulan (2019)");
        amedia.setMediaTitle("MỘC LAN");
        amedia.setMediaThumbnail("https://m.media-amazon.com/images/M/MV5BNDliY2E1MjUtNzZkOS00MzJlLTgyOGEtZDg4MTI1NzZkMTBhXkEyXkFqcGdeQXVyNjMwMzc3MjE@._V1_.jpg");
        alist.add(amedia);

        amedia = new MediaModel();
        amedia.setMediaInfo("Fighting immortal statue (2019)");
        amedia.setMediaTitle("ĐẤU CHIẾN THƯƠNG KHUNG");
        amedia.setMediaThumbnail("https://i.pinimg.com/originals/d3/7f/eb/d37feb2cc38455c8d1387386ca651d3b.png");
        alist.add(amedia);


        ListAdapter adapter = new ListAdapter(getActivity(), alist);

        gridViewHome.setAdapter(adapter);

        return view;
    }
}