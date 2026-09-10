package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h1 implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Choreographer f15045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DisplayManager f15046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f15047d = C.TIME_UNSET;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile long f15048e = C.TIME_UNSET;

    public /* synthetic */ h1(Choreographer choreographer, DisplayManager displayManager, int i10) {
        this.f15044a = i10;
        this.f15045b = choreographer;
        this.f15046c = displayManager;
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
        int i11 = this.f15044a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
        int i11 = this.f15044a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(int i10) {
    }

    private final void d(int i10) {
    }
}
