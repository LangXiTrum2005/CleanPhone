package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2800pJ implements C4X {
    public static final List<C2801pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C2800pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C2801pK A00() {
        C2801pK c2801pK;
        synchronized (A01) {
            c2801pK = A01.isEmpty() ? new C2801pK() : A01.remove(A01.size() - 1);
        }
        return c2801pK;
    }

    public static void A01(C2801pK c2801pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c2801pK);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean A9n(int i2) {
        return this.A00.hasMessages(i2);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C2801pK ACg(int i2) {
        return A00().A01(this.A00.obtainMessage(i2), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C2801pK ACh(int i2, int i3, int i4) {
        return A00().A01(this.A00.obtainMessage(i2, i3, i4), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C2801pK ACi(int i2, int i3, int i4, Object obj) {
        return A00().A01(this.A00.obtainMessage(i2, i3, i4, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final C2801pK ACj(int i2, Object obj) {
        return A00().A01(this.A00.obtainMessage(i2, obj), this);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final void AIT(int i2) {
        this.A00.removeMessages(i2);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJA(int i2) {
        return this.A00.sendEmptyMessage(i2);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJB(int i2, long j) {
        return this.A00.sendEmptyMessageAtTime(i2, j);
    }

    @Override // com.facebook.ads.redexgen.core.C4X
    public final boolean AJD(C4W c4w) {
        return ((C2801pK) c4w).A03(this.A00);
    }
}
