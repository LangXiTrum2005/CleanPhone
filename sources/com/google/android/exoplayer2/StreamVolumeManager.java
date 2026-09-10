package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
final class StreamVolumeManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f17202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Listener f17203c;
    public final AudioManager d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VolumeChangeReceiver f17204e;
    public int f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17205h;

    public interface Listener {
    }

    public final class VolumeChangeReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f17206b = 0;

        public VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            final StreamVolumeManager streamVolumeManager = StreamVolumeManager.this;
            streamVolumeManager.f17202b.post(new Runnable() { // from class: com.google.android.exoplayer2.v
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = StreamVolumeManager.VolumeChangeReceiver.f17206b;
                    streamVolumeManager.b();
                }
            });
        }
    }

    public StreamVolumeManager(Context context, Handler handler, Listener listener) {
        Context applicationContext = context.getApplicationContext();
        this.f17201a = applicationContext;
        this.f17202b = handler;
        this.f17203c = listener;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        Assertions.e(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = a(audioManager, 3);
        int i2 = this.f;
        this.f17205h = Util.f18979a >= 23 ? audioManager.isStreamMute(i2) : a(audioManager, i2) == 0;
        VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f17204e = volumeChangeReceiver;
        } catch (RuntimeException e2) {
            Log.h("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    public static int a(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            Log.h("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i2, e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public final void b() {
        final boolean zIsStreamMute;
        int i2 = this.f;
        AudioManager audioManager = this.d;
        final int iA = a(audioManager, i2);
        int i3 = this.f;
        if (Util.f18979a >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i3);
        } else {
            zIsStreamMute = a(audioManager, i3) == 0;
        }
        if (this.g == iA && this.f17205h == zIsStreamMute) {
            return;
        }
        this.g = iA;
        this.f17205h = zIsStreamMute;
        ExoPlayerImpl.this.k.e(30, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.m
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onDeviceVolumeChanged(iA, zIsStreamMute);
            }
        });
    }
}
