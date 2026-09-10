package androidx.fragment.app;

import android.os.Bundle;
import androidx.activity.ComponentActivity;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements j4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4356b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.f4355a = i10;
        this.f4356b = obj;
    }

    @Override // j4.d
    public final Bundle a() {
        int i10 = this.f4355a;
        Object obj = this.f4356b;
        switch (i10) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                int i11 = FragmentActivity.f4220g;
                while (FragmentActivity.G(fragmentActivity.F())) {
                }
                fragmentActivity.f4222c.e(androidx.lifecycle.m.ON_STOP);
                return new Bundle();
            case 1:
                return ((g1) obj).W();
            case 2:
                return androidx.lifecycle.o0.a((androidx.lifecycle.o0) obj);
            default:
                return ComponentActivity.g((ComponentActivity) obj);
        }
    }
}
