package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.Timeline;
import com.umeng.analytics.pro.cw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0676Dy extends AbstractC1208Zl implements ZQ {
    public static byte[] A0N;
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public SurfaceHolder A04;
    public TextureView A05;
    public C1209Zm A06;
    public OA A07;
    public OA A08;
    public ZM A09;
    public ZM A0A;
    public InterfaceC1280az A0B;
    public boolean A0C;
    public final Handler A0D;
    public final E9 A0E;
    public final SurfaceHolderCallbackC1186Yo A0F;
    public final InterfaceC1170Xx A0G;
    public final CopyOnWriteArraySet<InterfaceC1015Rp> A0H;
    public final CopyOnWriteArraySet<QJ> A0I;
    public final CopyOnWriteArraySet<InterfaceC1202Ze> A0J;
    public final CopyOnWriteArraySet<InterfaceC1655h8> A0K;
    public final CopyOnWriteArraySet<InterfaceC1185Yn> A0L;
    public final InterfaceC1188Yq[] A0M;

    static {
        A0E();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C0676Dy(Context context, InterfaceC0987Qm interfaceC0987Qm, AbstractC1418dG abstractC1418dG, PC pc, InterfaceC1430dS interfaceC1430dS, TO to, InterfaceC1699hs<InterfaceC1524ez, InterfaceC1170Xx> interfaceC1699hs, InterfaceC1524ez interfaceC1524ez) {
        this.A0F = new SurfaceHolderCallbackC1186Yo(this);
        this.A0L = new CopyOnWriteArraySet<>();
        this.A0J = new CopyOnWriteArraySet<>();
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0H = new CopyOnWriteArraySet<>();
        Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        this.A0D = new Handler(looperMyLooper);
        this.A0M = interfaceC0987Qm.A5O(this.A0D, this.A0F, this.A0F, this.A0F, this.A0F, to);
        this.A00 = 1.0f;
        this.A01 = 0;
        this.A06 = C1209Zm.A07;
        this.A02 = 1;
        this.A0E = A04(this.A0M, abstractC1418dG, pc, interfaceC1430dS, interfaceC1524ez);
        this.A0G = interfaceC1699hs.A41(interfaceC1524ez);
        this.A0G.AIl(this.A0E, looperMyLooper);
        this.A0I = new CopyOnWriteArraySet<>();
    }

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        A0N = new byte[]{25, 47, 51, 54, 50, 43, 11, 62, 53, 22, 50, 39, 63, 43, 56, -3, 31, 28, cw.n, 11, cw.k, cw.m, -2, cw.m, 34, 30, 31, 28, cw.m, -10, 19, 29, 30, cw.m, 24, cw.m, 28, -54, 11, 22, 28, cw.m, 11, cw.l, 35, -54, 31, 24, 29, cw.m, 30, -54, 25, 28, -54, 28, cw.m, 26, 22, 11, cw.k, cw.m, cw.l, -40};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.hs != com.google.common.base.Function<com.google.android.exoplayer2.util.Clock, com.google.android.exoplayer2.analytics.AnalyticsCollector> */
    public C0676Dy(Context context, InterfaceC0987Qm interfaceC0987Qm, AbstractC1418dG abstractC1418dG, PC pc, InterfaceC1430dS interfaceC1430dS, TO to, InterfaceC1699hs<InterfaceC1524ez, InterfaceC1170Xx> interfaceC1699hs) {
        this(context, interfaceC0987Qm, abstractC1418dG, pc, interfaceC1430dS, to, interfaceC1699hs, InterfaceC1524ez.A00);
    }

    @Deprecated
    public C0676Dy(InterfaceC0987Qm interfaceC0987Qm, AbstractC1418dG abstractC1418dG, PC pc, InterfaceC1430dS interfaceC1430dS, TO to) {
        this(null, interfaceC0987Qm, abstractC1418dG, pc, interfaceC1430dS, to, new InterfaceC1699hs() { // from class: com.facebook.ads.redexgen.X.ZP
            @Override // com.facebook.ads.redexgen.core.InterfaceC1699hs
            public final Object A41(Object obj) {
                return new C0648Cw((InterfaceC1524ez) obj);
            }
        });
    }

    private final E9 A04(InterfaceC1188Yq[] interfaceC1188YqArr, AbstractC1418dG abstractC1418dG, PC pc, InterfaceC1430dS interfaceC1430dS, InterfaceC1524ez interfaceC1524ez) {
        return new E9(interfaceC1188YqArr, abstractC1418dG, pc, interfaceC1430dS, interfaceC1524ez);
    }

    private void A0D() {
        if (this.A05 != null) {
            if (this.A05.getSurfaceTextureListener() != this.A0F) {
                Log.w(A07(0, 15, 83), A07(15, 49, 55));
            } else {
                this.A05.setSurfaceTextureListener(null);
            }
            this.A05 = null;
        }
        if (this.A04 != null) {
            this.A04.removeCallback(this.A0F);
            this.A04 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1188Yq interfaceC1188Yq : this.A0M) {
            if (interfaceC1188Yq.A9D() == 2) {
                arrayList.add(this.A0E.A0L(interfaceC1188Yq).A06(1).A07(surface).A05());
            }
        }
        if (this.A03 != null && this.A03 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((QT) it.next()).A0C();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.A0C) {
                this.A03.release();
            }
        }
        this.A03 = surface;
        this.A0C = z;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1208Zl
    public final void A0H(int i, long j) {
        this.A0G.ABz();
        this.A0E.A0H(i, j);
    }

    public final int A0I() {
        return this.A01;
    }

    public final ZM A0J() {
        return this.A09;
    }

    public final ZM A0K() {
        return this.A0A;
    }

    public final void A0L() {
        this.A0E.A0M();
        A0D();
        if (this.A03 != null) {
            if (this.A0C) {
                this.A03.release();
            }
            this.A03 = null;
        }
        if (this.A0B != null) {
            this.A0B.AHY(this.A0G);
            this.A0B = null;
        }
    }

    public final void A0M(float f) {
        float fA00 = AbstractC1600gE.A00(f, 0.0f, 1.0f);
        if (this.A00 == fA00) {
            return;
        }
        this.A00 = fA00;
        for (InterfaceC1188Yq interfaceC1188Yq : this.A0M) {
            if (interfaceC1188Yq.A9D() == 1) {
                this.A0E.A0L(interfaceC1188Yq).A06(2).A07(Float.valueOf(fA00)).A05();
            }
        }
    }

    public final void A0N(Surface surface) {
        A0D();
        A0F(surface, false);
    }

    public final void A0O(QJ qj) {
        this.A0E.A0O(qj);
        this.A0I.add(qj);
    }

    public final void A0P(InterfaceC1185Yn interfaceC1185Yn) {
        this.A0L.add(interfaceC1185Yn);
    }

    public final void A0Q(InterfaceC1280az interfaceC1280az) {
        A0R(interfaceC1280az, true, true);
    }

    public final void A0R(InterfaceC1280az interfaceC1280az, boolean z, boolean z2) {
        if (this.A0B != null) {
            this.A0B.AHY(this.A0G);
        }
        this.A0B = interfaceC1280az;
        interfaceC1280az.A3p(this.A0D, this.A0G);
        this.A0E.A0P(interfaceC1280az, z, z2);
    }

    public final void A0S(boolean z) {
        this.A0E.A0Q(z);
    }

    public final boolean A0T() {
        return this.A0E.A0R();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final long A6x() {
        return this.A0E.A6x();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final long A7J() {
        return this.A0E.A7J();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final int A7O() {
        return this.A0E.A7O();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final int A7P() {
        return this.A0E.A7P();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final int A7R() {
        return this.A0E.A7R();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final int A7S() {
        return this.A0E.A7S();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final long A7U() {
        return this.A0E.A7U();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final Timeline A7W() {
        return this.A0E.A7W();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final int A7X() {
        return this.A0E.A7X();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final long A7i() {
        return this.A0E.A7i();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final long A99() {
        return this.A0E.A99();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final boolean AAS() {
        return this.A0E.AAS();
    }

    @Override // com.facebook.ads.redexgen.core.QQ
    public final void AJL(boolean z) {
        this.A0E.AJL(z);
        if (this.A0B != null) {
            this.A0B.AHY(this.A0G);
            this.A0B = null;
            if (z) {
                this.A0B = null;
            }
        }
    }
}
