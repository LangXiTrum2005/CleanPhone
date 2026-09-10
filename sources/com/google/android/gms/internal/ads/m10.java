package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m10 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioManager f17203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z00 f17204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f17208f = 1.0f;

    public m10(Context context, z00 z00Var) {
        this.f17203a = (AudioManager) context.getSystemService("audio");
        this.f17204b = z00Var;
    }

    public final void a() {
        boolean z10 = this.f17206d;
        z00 z00Var = this.f17204b;
        AudioManager audioManager = this.f17203a;
        if (!z10 || this.f17207e || this.f17208f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.f17205c) {
                if (audioManager != null) {
                    this.f17205c = audioManager.abandonAudioFocus(this) == 0;
                }
                z00Var.zzq();
                return;
            }
            return;
        }
        if (this.f17205c) {
            return;
        }
        if (audioManager != null) {
            this.f17205c = audioManager.requestAudioFocus(this, 3, 2) == 1;
        }
        z00Var.zzq();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f17205c = i10 > 0;
        this.f17204b.zzq();
    }
}
