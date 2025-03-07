package com.example.freecallapp;

import org.webrtc.*;

public class CustomPeerConnectionObserver implements PeerConnection.Observer {
    @Override
    public void onIceCandidate(IceCandidate iceCandidate) {}

    @Override
    public void onAddStream(MediaStream mediaStream) {}

    @Override
    public void onSignalingChange(PeerConnection.SignalingState signalingState) {}
}
