package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2031f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C09083r A00;

    public C2031f6(C09083r c09083r) {
        this.A00 = c09083r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new C1143Dl(this, i));
    }
}
