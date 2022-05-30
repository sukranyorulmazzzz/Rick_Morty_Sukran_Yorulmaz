package com.example.rickandmortybysukranyorulmaz.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.rickandmortybysukranyorulmaz.Adapter.CharacterAdapter;
import com.example.rickandmortybysukranyorulmaz.Model.Character;
import com.example.rickandmortybysukranyorulmaz.Model.Location;
import com.example.rickandmortybysukranyorulmaz.R;
import com.example.rickandmortybysukranyorulmaz.Retrofit.RetrofitClient;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {

    RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4,recyclerView5;
    LinearLayoutManager linearLayoutManager,linearLayoutManager2,linearLayoutManager3,linearLayoutManager4,linearLayoutManager5;
    CharacterAdapter characterAdapter,characterAdapter2,characterAdapter3,characterAdapter4,characterAdapter5;
    List<Character> characterList =new ArrayList<>();
    List<Character> characterList2 =new ArrayList<>();
    List<Character> characterList3 =new ArrayList<>();
    List<Character> characterList4 =new ArrayList<>();
    List<Character> characterList5 =new ArrayList<>();
    List<Location> locationList =new ArrayList<>();
    List<Location> locationList2 =new ArrayList<>();
    List<Location> locationList3 =new ArrayList<>();
    List<Location> locationList4 =new ArrayList<>();
    List<Location> locationList5 =new ArrayList<>();
  ImageView gif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView2=findViewById(R.id.recyclerview2);
        recyclerView3=findViewById(R.id.recyclerview3);
        recyclerView4=findViewById(R.id.recyclerview4);
        recyclerView5=findViewById(R.id.recyclerview5);
        linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager2=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager3=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager4=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        linearLayoutManager5=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
       recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView4.setLayoutManager(linearLayoutManager4);
        recyclerView5.setLayoutManager(linearLayoutManager5);
        characterAdapter=new CharacterAdapter(characterList,locationList, new CharacterAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Character character, Location location) {
                Intent intent=new Intent(HomeActivity.this, CharacterDetailActivity.class);
                intent.putExtra("name",character.getName());
                intent.putExtra("status",character.getStatus());
                intent.putExtra("species",character.getSpecies());
                intent.putExtra("image",character.getImage());
                intent.putExtra("locationname",location.getLocationname());
                intent.putExtra("locationtype",location.getType());
                intent.putExtra("locationdimension",location.getDimension());
                startActivity(intent);
            }
        });
        characterAdapter2=new CharacterAdapter(characterList2,locationList2, new CharacterAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Character character, Location location) {
                Intent intent=new Intent(HomeActivity.this, CharacterDetailActivity.class);
                intent.putExtra("name",character.getName());
                intent.putExtra("status",character.getStatus());
                intent.putExtra("species",character.getSpecies());
                intent.putExtra("image",character.getImage());
                intent.putExtra("locationname",location.getLocationname());
                intent.putExtra("locationtype",location.getType());
                intent.putExtra("locationdimension",location.getDimension());
                startActivity(intent);

            }


        });
        characterAdapter3=new CharacterAdapter(characterList3,locationList3, new CharacterAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Character character, Location location) {
                Intent intent=new Intent(HomeActivity.this, CharacterDetailActivity.class);
                intent.putExtra("name",character.getName());
                intent.putExtra("status",character.getStatus());
                intent.putExtra("species",character.getSpecies());
                intent.putExtra("image",character.getImage());
                intent.putExtra("locationname",location.getLocationname());
                intent.putExtra("locationtype",location.getType());
                intent.putExtra("locationdimension",location.getDimension());
                startActivity(intent);

            }


        });
        characterAdapter4=new CharacterAdapter(characterList4,locationList4, new CharacterAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Character character, Location location) {
                Intent intent=new Intent(HomeActivity.this, CharacterDetailActivity.class);
                intent.putExtra("name",character.getName());
                intent.putExtra("status",character.getStatus());
                intent.putExtra("species",character.getSpecies());
                intent.putExtra("image",character.getImage());
                intent.putExtra("locationname",location.getLocationname());
                intent.putExtra("locationtype",location.getType());
                intent.putExtra("locationdimension",location.getDimension());
                startActivity(intent);
            }


        });
        characterAdapter5=new CharacterAdapter(characterList5, locationList5,new CharacterAdapter.ItemClickListener() {
            @Override
            public void onItemClick(Character character, Location location) {
                Intent intent=new Intent(HomeActivity.this, CharacterDetailActivity.class);
                intent.putExtra("name",character.getName());
                intent.putExtra("status",character.getStatus());
                intent.putExtra("species",character.getSpecies());
                intent.putExtra("image",character.getImage());
                intent.putExtra("locationname",location.getLocationname());
                intent.putExtra("locationtype",location.getType());
                intent.putExtra("locationdimension",location.getDimension());
                startActivity(intent);
            }


        });
        recyclerView.setAdapter(characterAdapter);
        recyclerView2.setAdapter(characterAdapter2);
        recyclerView3.setAdapter(characterAdapter3);
        recyclerView4.setAdapter(characterAdapter4);
        recyclerView5.setAdapter(characterAdapter5);

        gif=findViewById(R.id.gif);
        Glide.with(this)
                .load(R.raw.gifson)
                .into(gif);

        fetchCharacter();
        fetchCharacter2();
        fetchCharacter3();
        fetchCharacter4();
        fetchCharacter5();
        fetchLocation();
        fetchLocation2();
        fetchLocation3();
        fetchLocation4();
        fetchLocation5();
    }

     private void fetchCharacter() {
        RetrofitClient.getRetrofitClient().getCharacterList1().enqueue(new Callback<List<Character>>() {
            @Override
            public void onResponse(Call<List<Character>> call, Response<List<Character>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    characterList.addAll(response.body());
                    characterAdapter.notifyDataSetChanged();

                }
            }

            @Override
            public void onFailure(Call<List<Character>> call, Throwable t) {

                System.out.println("error");
            }
        });
    }
    private void fetchLocation() {
        RetrofitClient.getRetrofitClient().getCharacterLocation1().enqueue(new Callback<List<Location>>() {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    locationList.addAll(response.body());
                    characterAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {

            }

        });
    }
    private void fetchLocation2() {
        RetrofitClient.getRetrofitClient().getCharacterLocation2().enqueue(new Callback<List<Location>>() {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    locationList2.addAll(response.body());
                    characterAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {

            }

        });
    }
    private void fetchLocation3() {
        RetrofitClient.getRetrofitClient().getCharacterLocation3().enqueue(new Callback<List<Location>>() {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    locationList3.addAll(response.body());
                    characterAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {

            }

        });
    }
    private void fetchLocation4() {
        RetrofitClient.getRetrofitClient().getCharacterLocation4().enqueue(new Callback<List<Location>>() {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    locationList4.addAll(response.body());
                    characterAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {

            }

        });
    }
    private void fetchLocation5() {
        RetrofitClient.getRetrofitClient().getCharacterLocation5().enqueue(new Callback<List<Location>>() {
            @Override
            public void onResponse(Call<List<Location>> call, Response<List<Location>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    locationList5.addAll(response.body());
                    characterAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Location>> call, Throwable t) {

            }

        });
    }

    private void fetchCharacter2() {
        RetrofitClient.getRetrofitClient().getCharacterList2().enqueue(new Callback<List<Character>>() {
            @Override
            public void onResponse(Call<List<Character>> call, Response<List<Character>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    characterList2.addAll(response.body());
                    characterAdapter2.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Character>> call, Throwable t) {

                System.out.println("error");
            }
        });
    }
    private void fetchCharacter3() {
        RetrofitClient.getRetrofitClient().getCharacterList3().enqueue(new Callback<List<Character>>() {
            @Override
            public void onResponse(Call<List<Character>> call, Response<List<Character>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    characterList3.addAll(response.body());
                    characterAdapter3.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Character>> call, Throwable t) {

                System.out.println("error");
            }
        });
    }
    private void fetchCharacter4() {
        RetrofitClient.getRetrofitClient().getCharacterList4().enqueue(new Callback<List<Character>>() {
            @Override
            public void onResponse(Call<List<Character>> call, Response<List<Character>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    characterList4.addAll(response.body());
                    characterAdapter4.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Character>> call, Throwable t) {

                System.out.println("error");
            }
        });
    }
    private void fetchCharacter5() {
        RetrofitClient.getRetrofitClient().getCharacterList5().enqueue(new Callback<List<Character>>() {
            @Override
            public void onResponse(Call<List<Character>> call, Response<List<Character>> response) {
                if (response.isSuccessful()&&response.body()!=null){
                    characterList5.addAll(response.body());
                    characterAdapter5.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<List<Character>> call, Throwable t) {

                System.out.println("error");
            }
        });
    }
}