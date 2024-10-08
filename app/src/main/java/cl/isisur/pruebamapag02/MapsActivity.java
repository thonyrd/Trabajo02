package cl.isisur.pruebamapag02;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.pruebamapag02.databinding.ActivityMapsBinding;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Lugares1 = new LatLng(-36.61184506511201, -72.1020642778137);
        LatLng Lugares2 = new LatLng(-36.592050205538165, -72.11252554199265);
        LatLng Lugares3 = new LatLng(-36.62004553561639, -72.07501470127191);
        LatLng Lugares4 = new LatLng(-36.62228975261783, -72.1307105327844);

        LatLng Chilensis =new LatLng(-36.59001522569667, -72.08211302388496);


        mMap.addMarker(new MarkerOptions().position(Lugares1).title("Sucursal 1"));
        mMap.addMarker(new MarkerOptions().position(Lugares2).title("Sucursal 2"));
        mMap.addMarker(new MarkerOptions().position(Lugares3).title("Sucursal 3"));
        mMap.addMarker(new MarkerOptions().position(Lugares4).title("Sucursal 4"));

        mMap.addMarker(new MarkerOptions().position(Chilensis).title("Ubicacion Actual"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Chilensis,15));
        mMap.setMinZoomPreference(4.0F);
        mMap.setMaxZoomPreference(18.0f);


    }
}