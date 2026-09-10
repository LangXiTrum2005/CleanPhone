package com.facebook.ads.redexgen.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class D8 {
    public final int A00;
    public final C2708no A01;
    public final long A02;
    public final CopyOnWriteArrayList<D7> A03;

    public D8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public D8(CopyOnWriteArrayList<D7> copyOnWriteArrayList, int i2, C2708no c2708no, long j) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i2;
        this.A01 = c2708no;
        this.A02 = j;
    }

    private long A00(long j) {
        long jA0P = C5C.A0P(j);
        if (jA0P == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA0P;
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    private final void A01(final Cq cq, final C1293Cs c1293Cs, final int i2) {
        for (D7 d7 : this.A03) {
            final D9 d9 = d7.A01;
            C5C.A1B(d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D4
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final D8 A02(int i2, C2708no c2708no, long j) {
        return new D8(this.A03, i2, c2708no, j);
    }

    public final void A03(int i2, C2860qI c2860qI, int i3, Object obj, long j) {
        A0C(new C1293Cs(1, i2, c2860qI, i3, obj, A00(j), -9223372036854775807L));
    }

    public final void A04(Handler handler, D9 d9) {
        AbstractC10843y.A01(handler);
        AbstractC10843y.A01(d9);
        this.A03.add(new D7(handler, d9));
    }

    public final void A05(Cq cq, int i2, int i3, C2860qI c2860qI, int i4, Object obj, long j, long j2) {
        A09(cq, new C1293Cs(i2, i3, c2860qI, i4, obj, A00(j), A00(j2)));
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1768")
    public final void A06(Cq cq, int i2, int i3, C2860qI c2860qI, int i4, Object obj, long j, long j2, int i5) {
        A01(cq, new C1293Cs(i2, i3, c2860qI, i4, obj, A00(j), A00(j2)), i5);
    }

    public final void A07(Cq cq, int i2, int i3, C2860qI c2860qI, int i4, Object obj, long j, long j2, IOException iOException, boolean z2) {
        A0A(cq, new C1293Cs(i2, i3, c2860qI, i4, obj, A00(j), A00(j2)), iOException, z2);
    }

    public final void A08(@MetaExoPlayerCustomization Cq cq, @MetaExoPlayerCustomization int i2, int i3, C2860qI c2860qI, int i4, Object obj, long j, long j2, Object obj2, Object obj3) {
        A0B(cq, new C1293Cs(i2, i3, c2860qI, i4, obj, A00(j), A00(j2)), obj2, obj3);
    }

    public final void A09(final Cq cq, final C1293Cs c1293Cs) {
        for (D7 d7 : this.A03) {
            final D9 listener = d7.A01;
            C5C.A1B(d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D5
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0E(listener, cq, c1293Cs);
                }
            });
        }
    }

    public final void A0A(final Cq cq, final C1293Cs c1293Cs, final IOException iOException, final boolean z2) {
        for (D7 d7 : this.A03) {
            final D9 d9 = d7.A01;
            C5C.A1B(d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D0
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0F(d9, cq, c1293Cs, iOException, z2);
                }
            });
        }
    }

    public final void A0B(@MetaExoPlayerCustomization final Cq cq, @MetaExoPlayerCustomization final C1293Cs c1293Cs, final Object obj, final Object obj2) {
        for (D7 d7 : this.A03) {
            final D9 d9 = d7.A01;
            C5C.A1B(d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D1
                @Override // java.lang.Runnable
                public final void run() {
                    this.A02.A0G(d9, cq, c1293Cs, obj, obj2);
                }
            });
        }
    }

    public final void A0C(final C1293Cs c1293Cs) {
        for (D7 d7 : this.A03) {
            final D9 listener = d7.A01;
            C5C.A1B(d7.A00, new Runnable() { // from class: com.facebook.ads.redexgen.X.D2
                @Override // java.lang.Runnable
                public final void run() {
                    this.A01.A0H(listener, c1293Cs);
                }
            });
        }
    }

    public final void A0D(D9 d9) {
        for (D7 listenerAndHandler : this.A03) {
            if (listenerAndHandler.A01 == d9) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final /* synthetic */ void A0E(D9 d9, Cq cq, C1293Cs c1293Cs) {
        d9.AEb(this.A00, this.A01, cq, c1293Cs);
    }

    public final /* synthetic */ void A0F(D9 d9, Cq cq, C1293Cs c1293Cs, IOException iOException, boolean z2) {
        d9.AEg(this.A00, this.A01, cq, c1293Cs, iOException, z2);
    }

    public final /* synthetic */ void A0G(D9 d9, Cq cq, C1293Cs c1293Cs, Object obj, Object obj2) {
        d9.AEd(this.A00, this.A01, cq, c1293Cs, obj, obj2);
    }

    public final /* synthetic */ void A0H(D9 d9, C1293Cs c1293Cs) {
        d9.ADk(this.A00, this.A01, c1293Cs);
    }
}
