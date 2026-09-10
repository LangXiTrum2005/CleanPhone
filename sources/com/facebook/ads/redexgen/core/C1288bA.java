package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1288bA {
    public final int A00;
    public final R5 A01;
    public final long A02;
    public final CopyOnWriteArrayList<C1287b9> A03;

    public C1288bA() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public C1288bA(CopyOnWriteArrayList<C1287b9> copyOnWriteArrayList, int i, R5 r5, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i;
        this.A01 = r5;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA0P = AbstractC1600gE.A0P(j);
        if (jA0P == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final C1272ar c1272ar, final C1275au c1275au, final int i) {
        for (C1287b9 c1287b9 : this.A03) {
            final InterfaceC1289bB interfaceC1289bB = c1287b9.A01;
            AbstractC1600gE.A1B(c1287b9.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final C1288bA A02(int i, R5 r5, long j) {
        return new C1288bA(this.A03, i, r5, j);
    }

    public final void A03(int i, ZM zm, int i2, Object obj, long j) {
        A0C(new C1275au(1, i, zm, i2, obj, A00(j), C.TIME_UNSET));
    }

    public final void A04(Handler handler, InterfaceC1289bB interfaceC1289bB) {
        AbstractC1517es.A01(handler);
        AbstractC1517es.A01(interfaceC1289bB);
        this.A03.add(new C1287b9(handler, interfaceC1289bB));
    }

    public final void A05(C1272ar c1272ar, int i, int i2, ZM zm, int i3, Object obj, long j, long j2) {
        A09(c1272ar, new C1275au(i, i2, zm, i3, obj, A00(j), A00(j2)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(C1272ar c1272ar, int i, int i2, ZM zm, int i3, Object obj, long j, long j2, int i4) {
        A01(c1272ar, new C1275au(i, i2, zm, i3, obj, A00(j), A00(j2)), i4);
    }

    public final void A07(C1272ar c1272ar, int i, int i2, ZM zm, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        A0A(c1272ar, new C1275au(i, i2, zm, i3, obj, A00(j), A00(j2)), iOException, z);
    }

    public final void A08(@MetaExoPlayerCustomization C1272ar c1272ar, @MetaExoPlayerCustomization int i, int i2, ZM zm, int i3, Object obj, long j, long j2, Object obj2, Object obj3) {
        A0B(c1272ar, new C1275au(i, i2, zm, i3, obj, A00(j), A00(j2)), obj2, obj3);
    }

    public final void A09(final C1272ar c1272ar, final C1275au c1275au) {
        for (C1287b9 c1287b9 : this.A03) {
            final InterfaceC1289bB listener = c1287b9.A01;
            AbstractC1600gE.A1B(c1287b9.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b3
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, c1272ar, c1275au);
                }
            });
        }
    }

    public final void A0A(final C1272ar c1272ar, final C1275au c1275au, final IOException iOException, final boolean z) {
        for (C1287b9 c1287b9 : this.A03) {
            final InterfaceC1289bB interfaceC1289bB = c1287b9.A01;
            AbstractC1600gE.A1B(c1287b9.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b2
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(interfaceC1289bB, c1272ar, c1275au, iOException, z);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final C1272ar c1272ar, @MetaExoPlayerCustomization final C1275au c1275au, final Object obj, final Object obj2) {
        for (C1287b9 c1287b9 : this.A03) {
            final InterfaceC1289bB interfaceC1289bB = c1287b9.A01;
            AbstractC1600gE.A1B(c1287b9.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b7
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(interfaceC1289bB, c1272ar, c1275au, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C1275au c1275au) {
        for (C1287b9 c1287b9 : this.A03) {
            final InterfaceC1289bB listener = c1287b9.A01;
            AbstractC1600gE.A1B(c1287b9.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.b8
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, c1275au);
                }
            });
        }
    }

    public final void A0D(InterfaceC1289bB interfaceC1289bB) {
        for (C1287b9 listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == interfaceC1289bB) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(InterfaceC1289bB interfaceC1289bB, C1272ar c1272ar, C1275au c1275au) {
        interfaceC1289bB.ADp(this.A00, this.A01, c1272ar, c1275au);
    }

    public final /* synthetic */ void A0F(InterfaceC1289bB interfaceC1289bB, C1272ar c1272ar, C1275au c1275au, IOException iOException, boolean z) {
        interfaceC1289bB.ADu(this.A00, this.A01, c1272ar, c1275au, iOException, z);
    }

    public final /* synthetic */ void A0G(InterfaceC1289bB interfaceC1289bB, C1272ar c1272ar, C1275au c1275au, Object obj, Object obj2) {
        interfaceC1289bB.ADr(this.A00, this.A01, c1272ar, c1275au, obj, obj2);
    }

    public final /* synthetic */ void A0H(InterfaceC1289bB interfaceC1289bB, C1275au c1275au) {
        interfaceC1289bB.ACz(this.A00, this.A01, c1275au);
    }
}
