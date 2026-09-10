package androidx.fragment.app;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f4442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f4443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f4444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f4445d;

    public q0(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f4442a = fragmentActivity;
        this.f4443b = fragmentActivity;
        this.f4444c = handler;
        this.f4445d = new h1();
    }
}
