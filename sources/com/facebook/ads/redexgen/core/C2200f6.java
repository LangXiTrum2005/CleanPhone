package com.facebook.ads.redexgen.core;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2200f6 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C10773r A00;

    public C2200f6(C10773r c10773r) {
        this.A00 = c10773r;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        new Handler(Looper.getMainLooper()).post(new C1312Dl(this, i2));
    }
}
