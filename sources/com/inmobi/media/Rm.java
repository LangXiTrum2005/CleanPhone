package com.inmobi.media;

import adsuki.livable;
import android.app.KeyguardManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.PowerManager;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Rm {
    public static final boolean a(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("power");
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager == null) {
            return false;
        }
        Object systemService2 = context.getSystemService("keyguard");
        KeyguardManager keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        if (keyguardManager == null) {
            return false;
        }
        return powerManager.isInteractive() && (z || !keyguardManager.isKeyguardLocked());
    }

    public static final MediaPlayer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 34) {
            return livable.attabal(context);
        }
        return new MediaPlayer();
    }

    public static final void a(MediaPlayer mediaPlayer, Q1 audioFocusManager) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "<this>");
        Intrinsics.checkNotNullParameter(audioFocusManager, "audioFocusManager");
        if (Build.VERSION.SDK_INT >= 26) {
            mediaPlayer.setAudioAttributes(audioFocusManager.d);
        } else {
            mediaPlayer.setAudioStreamType(3);
        }
    }
}
