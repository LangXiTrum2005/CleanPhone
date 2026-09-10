package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f15885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f15887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f15888d;

    public j0(Context context, Runnable runnable, Boolean bool) {
        AudioManager audioManagerB = context == null ? null : x10.b(context);
        if (audioManagerB == null || (bool != null && bool.booleanValue())) {
            this.f15885a = null;
            this.f15886b = false;
            this.f15887c = null;
            this.f15888d = null;
            return;
        }
        Spatializer spatializer = audioManagerB.getSpatializer();
        this.f15885a = spatializer;
        this.f15886b = spatializer.getImmersiveAudioLevel() != 0;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.f15887c = handler;
        h0 h0Var = new h0(this, runnable);
        this.f15888d = h0Var;
        spatializer.addOnSpatializerStateChangedListener(new i0(handler, 0), h0Var);
    }

    public final boolean a() {
        Spatializer spatializer = this.f15885a;
        return spatializer != null && spatializer.isAvailable();
    }

    public final boolean b() {
        Spatializer spatializer = this.f15885a;
        return spatializer != null && spatializer.isEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    public final boolean c(z80 z80Var, g22 g22Var) {
        int i10;
        if (this.f15885a == null || !this.f15886b || !a() || !b()) {
            return false;
        }
        String str = g22Var.f14678o;
        int i11 = g22Var.G;
        if (Objects.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            if (i11 == 16) {
                i10 = 12;
            } else {
                i10 = i11;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i11 == -1) {
                i10 = 6;
            } else {
                i10 = i11;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i11 == 18 || i11 == 21)) {
            i10 = 24;
        } else {
            i10 = i11;
        }
        int iE = g22Var.H;
        if (iE == -1 || i11 != i10) {
            iE = uu0.e(i10);
        }
        if (iE == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iE);
        int i12 = g22Var.I;
        if (i12 != -1) {
            channelMask.setSampleRate(i12);
        }
        Spatializer spatializer = this.f15885a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(z80Var.a(), channelMask.build());
    }

    public final List d() {
        if (this.f15885a == null || !this.f15886b || !a() || !b()) {
            aa1 aa1Var = ca1.f13122b;
            return ya1.f22208e;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return ca1.u(252);
        }
        Spatializer spatializer = this.f15885a;
        spatializer.getClass();
        return spatializer.getSpatializedChannelMasks();
    }

    public final void e() {
        h0 h0Var;
        Handler handler;
        Spatializer spatializer = this.f15885a;
        if (spatializer == null || (h0Var = this.f15888d) == null || (handler = this.f15887c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(h0Var);
        handler.removeCallbacksAndMessages(null);
    }
}
