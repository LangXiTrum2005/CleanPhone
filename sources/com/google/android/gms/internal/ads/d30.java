package com.google.android.gms.internal.ads;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d30 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13374a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13376c;

    public /* synthetic */ d30(g30 g30Var, long j10) {
        this.f13376c = g30Var;
        this.f13375b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13374a) {
            case 0:
                ((g30) this.f13376c).f14694a.B(this.f13375b, true);
                break;
            case 1:
                ((ea.y) this.f13376c).M0(this.f13375b);
                break;
            case 2:
                ea.z2 z2Var = (ea.z2) this.f13376c;
                ea.y yVar = ((ea.m1) z2Var.f3623a).f39594n;
                ea.m1.e(yVar);
                yVar.J0(this.f13375b);
                z2Var.f39951e = null;
                break;
            default:
                FlutterJNI flutterJNI = (FlutterJNI) this.f13376c;
                if (flutterJNI.isAttached()) {
                    flutterJNI.unregisterTexture(this.f13375b);
                    break;
                }
                break;
        }
    }

    public d30(ea.y yVar, long j10) {
        this.f13375b = j10;
        Objects.requireNonNull(yVar);
        this.f13376c = yVar;
    }

    public d30(ea.z2 z2Var, long j10) {
        this.f13375b = j10;
        Objects.requireNonNull(z2Var);
        this.f13376c = z2Var;
    }

    public d30(long j10, FlutterJNI flutterJNI) {
        this.f13375b = j10;
        this.f13376c = flutterJNI;
    }
}
