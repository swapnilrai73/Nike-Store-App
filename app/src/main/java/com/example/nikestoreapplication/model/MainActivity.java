package com.example.nikestoreapplication.model;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.nikestoreapplication.R;
import com.example.nikestoreapplication.adapter.MainRecyclerAdapter;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuIcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        menuIcon = findViewById(R.id.menu_icon);

        navigationDrawer();


//first category items
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem("Legend React 2", "$ 110", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FLEGEND-REACT-2-SHIELD.png?alt=media&token=f9f1dcea-c1c3-49e2-937f-9a3b4bcdc2e8"));
        categoryItemList.add(new CategoryItem("Air Max Infinity", "$ 130", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FAIR-MAX-INFINITY.png?alt=media&token=f80a444b-23dd-4cfb-846d-01fbff2333b0"));
        categoryItemList.add(new CategoryItem("Zoom Gravity", "$ 90", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FZoom-Gravity.png?alt=media&token=18dd7bcf-10f5-45fa-b552-2a831b23b010"));
        categoryItemList.add(new CategoryItem("Phantom Vision", "$ 275", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fphantom-vision-elite.png?alt=media&token=a7623279-beec-4f80-a4d3-67fe498287d8"));
        categoryItemList.add(new CategoryItem("Air Max Alpha", "$ 130", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fair-max-alpha.png?alt=media&token=2aaff64e-8f74-43d5-9281-cbe9af05abb4"));
        categoryItemList.add(new CategoryItem("", " ", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fview%20all.png?alt=media&token=ea51b113-90f7-44b7-ae18-f07323da467f"));
//second category items
        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem("Air Zoom Super", "$ 150", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fair-zoom-superrep.png?alt=media&token=44be4805-f3e3-423c-a5e3-b0f939fe3cda"));
        categoryItemList2.add(new CategoryItem("Air Jordan 1", "$ 200", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fair-jordan-1.png?alt=media&token=1e9abb2c-2463-46fe-bf20-e18885e0c1dc"));
        categoryItemList2.add(new CategoryItem("KD Trey 5 VII", "$ 110", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fkd-trey-5.png?alt=media&token=921be8c9-9d10-4b33-a79a-2b2f8b1e3858"));
        categoryItemList2.add(new CategoryItem("Air Max Impact", "$ 150", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FAIR-MAX-IMPACT.png?alt=media&token=e8f7addb-20e3-4f4a-b5d1-17fef9a9a762"));
        categoryItemList2.add(new CategoryItem("Renew Lucent", "$ 134", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FRenew-Lucent.png?alt=media&token=6da42149-6fa8-4d21-ad0f-3b2282bee891"));
        categoryItemList2.add(new CategoryItem("", "", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fview%20all.png?alt=media&token=ea51b113-90f7-44b7-ae18-f07323da467f"));
//third category items
        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem("Jordan Havoc", "$ 150", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fjordan-react-havoc.png?alt=media&token=dfbcd6e0-cfaa-430d-b679-b81058f0551e"));
        categoryItemList3.add(new CategoryItem("Joyride Flyknit", "$ 130", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fjoyride-run-flyknit.png?alt=media&token=3f27c48a-887d-4255-ba6d-9f6b839d4701"));
        categoryItemList3.add(new CategoryItem("Free Run 5.0", "$ 110", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Ffree-run-5.0.png?alt=media&token=ce008724-32d6-4d1e-ac76-f50126d793af"));
        categoryItemList3.add(new CategoryItem("Air Max Impact", "$ 150", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FAIR-MAX-IMPACT.png?alt=media&token=e8f7addb-20e3-4f4a-b5d1-17fef9a9a762"));
        categoryItemList3.add(new CategoryItem("Renew Lucent", "$ 134", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FRenew-Lucent.png?alt=media&token=6da42149-6fa8-4d21-ad0f-3b2282bee891"));
        categoryItemList3.add(new CategoryItem("", " ", "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fview%20all.png?alt=media&token=ea51b113-90f7-44b7-ae18-f07323da467f"));


        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("New Releases", categoryItemList));
        allCategoryList.add(new AllCategory("Best Sellers", categoryItemList2));
        allCategoryList.add(new AllCategory("Featured", categoryItemList3));
        setMainCategoryRecycler(allCategoryList);
    }

    private void navigationDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);
        drawerLayout.setScrimColor(getResources().getColor(R.color.colorAccent));
        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_login:
                Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_register:
                Intent intent2 = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(intent2);
                break;
        }
        return true;
    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList) {
        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }
}
