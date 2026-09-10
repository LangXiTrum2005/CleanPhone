package com.startapp.sdk.ads.list3d;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.startapp.sdk.internal.u6;
import com.startapp.sdk.internal.ug;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DView f40502a;

    public c(List3DView list3DView) {
        this.f40502a = list3DView;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r8
  0x0049: PHI (r8v1 float) = (r8v0 float), (r8v7 float) binds: [B:13:0x0040, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    public final void run() {
        float f;
        List3DView list3DView = this.f40502a;
        if (list3DView.f40495l == null) {
            return;
        }
        boolean z2 = false;
        View childAt = list3DView.getChildAt(0);
        if (childAt != null) {
            List3DView list3DView2 = this.f40502a;
            list3DView2.getClass();
            int iA = List3DView.a(childAt);
            List3DView list3DView3 = this.f40502a;
            list3DView2.f40492e = iA - list3DView3.g;
            u6 u6Var = list3DView3.f40495l;
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = u6Var.f41536e;
            if (j != 0) {
                int i2 = (int) (jCurrentAnimationTimeMillis - j);
                if (i2 > 50) {
                    i2 = 50;
                }
                ug ugVar = (ug) u6Var;
                float f2 = ugVar.f41534b;
                float f3 = ugVar.f41533a;
                float f4 = ugVar.f41535c;
                if (f3 > f4) {
                    f = f4 - f3;
                } else {
                    f4 = ugVar.d;
                    if (f3 < f4) {
                        f = f4 - f3;
                    } else {
                        f = 0.0f;
                    }
                }
                float f5 = (f * ugVar.g) + f2;
                ugVar.f41533a = ((i2 * f5) / 1000.0f) + f3;
                ugVar.f41534b = f5 * ugVar.f;
            }
            u6Var.f41536e = jCurrentAnimationTimeMillis;
            List3DView list3DView4 = this.f40502a;
            list3DView4.b(((int) list3DView4.f40495l.f41533a) - list3DView4.f40492e);
        }
        u6 u6Var2 = this.f40502a.f40495l;
        boolean z3 = Math.abs(u6Var2.f41534b) < 0.5f;
        float f6 = u6Var2.f41533a;
        if (f6 - 0.4f < u6Var2.f41535c && f6 + 0.4f > u6Var2.d) {
            z2 = true;
        }
        if (z3 && z2) {
            return;
        }
        this.f40502a.postDelayed(this, 16L);
    }
}
