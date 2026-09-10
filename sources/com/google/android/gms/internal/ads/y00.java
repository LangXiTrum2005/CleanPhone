package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ww f22059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f22060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z80 f22061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioFocusRequest f22062d;

    public y00(ww wwVar, Handler handler, z80 z80Var) {
        this.f22060b = handler;
        this.f22061c = z80Var;
        this.f22059a = wwVar;
        this.f22062d = new AudioFocusRequest.Builder(1).setAudioAttributes(z80Var.a()).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(wwVar, handler).setAcceptsDelayedFocusGain(true).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y00)) {
            return false;
        }
        y00 y00Var = (y00) obj;
        return equals(y00Var.f22059a) && Objects.equals(this.f22060b, y00Var.f22060b) && Objects.equals(this.f22061c, y00Var.f22061c);
    }

    public final int hashCode() {
        return Objects.hash(1, this.f22059a, this.f22060b, this.f22061c, Boolean.FALSE);
    }
}
