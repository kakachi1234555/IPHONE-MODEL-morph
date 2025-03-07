package com.example.freecallapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import org.webrtc.*;

import java.util.ArrayList;

public class CallActivity extends AppCompatActivity {
    private PeerConnectionFactory factory;
    private PeerConnection peerConnection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        // Initialiser WebRTC
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(this).createInitializationOptions());
        factory = PeerConnectionFactory.builder().createPeerConnectionFactory();

        // Créer la connexion WebRTC
        PeerConnection.RTCConfiguration config = new PeerConnection.RTCConfiguration(new ArrayList<>());
        peerConnection = factory.createPeerConnection(config, new CustomPeerConnectionObserver());
    }
}
