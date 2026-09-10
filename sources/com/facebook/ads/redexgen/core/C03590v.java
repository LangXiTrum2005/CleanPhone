package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03590v extends AbstractC0697Et implements Handler.Callback {
    public static byte[] A0H;
    public static String[] A0I = {"3WvyQm6eZ8fyu3DVkbaCyrAZnX3I6ufJ", "FZX0zBKkzAfc6z", "6l4vC0Lm5zxy6aFWmqrnB087ialuzwGI", "qqeCXiNIH0hdSmbKUzZAHpTsBt10hP0P", "cj", "sQzUbCBUfwO044aI", "9TFEzWk8WBCpCxrEkzjotM773HUVNOJT", "kKOvl6Wchw21fZ40J"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public ZM A05;
    public TQ A06;
    public C05598s A07;
    public AbstractC05578q A08;
    public AbstractC05578q A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final P6 A0E;
    public final InterfaceC1381cf A0F;
    public final InterfaceC1388cm A0G;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A0H = new byte[]{73, 111, 120, 110, 115, 110, 118, 127, 58, 126, 127, 121, 117, 126, 115, 116, 125, 58, 124, 123, 115, 118, 127, 126, 52, 58, 105, 110, 104, 127, 123, 119, 92, 117, 104, 119, 123, 110, 39, 119, 70, 91, 87, 113, 70, 77, 71, 70, 81, 70, 81};
    }

    static {
        A09();
    }

    public C03590v(InterfaceC1388cm interfaceC1388cm, Looper looper, InterfaceC1381cf interfaceC1381cf) {
        super(3);
        this.A0G = (InterfaceC1388cm) AbstractC1517es.A01(interfaceC1388cm);
        this.A0D = looper == null ? null : AbstractC1600gE.A0c(looper, this);
        this.A0F = interfaceC1381cf;
        this.A0E = new P6();
        this.A02 = C.TIME_UNSET;
        this.A04 = C.TIME_UNSET;
        this.A03 = C.TIME_UNSET;
    }

    private long A00() {
        if (this.A01 == -1) {
            return Long.MAX_VALUE;
        }
        AbstractC1517es.A01(this.A09);
        if (this.A01 >= this.A09.A7u()) {
            return Long.MAX_VALUE;
        }
        return this.A09.A7t(this.A01);
    }

    @RequiresNonNull({"subtitle"})
    @SideEffectFree
    private long A01(long j) {
        int iA8Q = this.A09.A8Q(j);
        if (iA8Q != 0) {
            int nextEventTimeIndex = this.A09.A7u();
            if (nextEventTimeIndex != 0) {
                if (iA8Q == -1) {
                    AbstractC05578q abstractC05578q = this.A09;
                    int nextEventTimeIndex2 = this.A09.A7u();
                    return abstractC05578q.A7t(nextEventTimeIndex2 - 1);
                }
                int nextEventTimeIndex3 = iA8Q - 1;
                return this.A09.A7t(nextEventTimeIndex3);
            }
        }
        return ((AbstractC1141Wu) this.A09).A01;
    }

    @SideEffectFree
    private long A02(long j) {
        boolean z = true;
        AbstractC1517es.A08(j != C.TIME_UNSET);
        if (this.A04 == C.TIME_UNSET) {
            z = false;
        }
        AbstractC1517es.A08(z);
        return j - this.A04;
    }

    private void A04() {
        A0C(new C0980Qf(MetaExoPlayerCustomizedCollections.A01(), A02(this.A03)));
    }

    private void A05() {
        this.A0C = true;
        this.A06 = this.A0F.A5A((ZM) AbstractC1517es.A01(this.A05));
    }

    private void A06() {
        this.A07 = null;
        this.A01 = -1;
        if (this.A09 != null) {
            this.A09.A0B();
            this.A09 = null;
        }
        if (this.A08 != null) {
            this.A08.A0B();
            this.A08 = null;
        }
    }

    private void A07() {
        A06();
        ((TQ) AbstractC1517es.A01(this.A06)).AGj();
        this.A06 = null;
        this.A00 = 0;
    }

    private void A08() {
        A07();
        A05();
    }

    private void A0A(TP tp) {
        AbstractC1561fb.A08(A03(39, 12, 36), A03(0, 39, 29) + this.A05, tp);
        A0D(new C1387cl(this.A05, tp));
        A04();
        A08();
    }

    private void A0B(C0980Qf c0980Qf) {
        this.A0G.ACp(c0980Qf.A01);
        this.A0G.ACo(c0980Qf);
    }

    private void A0C(C0980Qf c0980Qf) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(0, c0980Qf).sendToTarget();
        } else {
            A0B(c0980Qf);
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Method to propagate any SubtitleDecoder Error upwards")
    private void A0D(C1387cl c1387cl) {
        if (this.A0D != null) {
            this.A0D.obtainMessage(1, c1387cl).sendToTarget();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1Z() {
        this.A05 = null;
        this.A02 = C.TIME_UNSET;
        A04();
        this.A04 = C.TIME_UNSET;
        this.A03 = C.TIME_UNSET;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1a(long j, boolean z) {
        this.A03 = j;
        A04();
        this.A0A = false;
        this.A0B = false;
        this.A02 = C.TIME_UNSET;
        if (this.A00 != 0) {
            A08();
        } else {
            A06();
            ((TQ) AbstractC1517es.A01(this.A06)).flush();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0697Et
    public final void A1c(ZM[] zmArr, long j, long j2) {
        this.A04 = j2;
        this.A05 = zmArr[0];
        if (this.A06 != null) {
            this.A00 = 1;
        } else {
            A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1188Yq
    public final boolean AAE() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1188Yq
    public final boolean AAT() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1188Yq
    public final void AHd(long j, long j2) throws C1038Sm {
        int i;
        this.A03 = j;
        if (AAC() && this.A02 != C.TIME_UNSET && j >= this.A02) {
            A06();
            String[] strArr = A0I;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A0I[0] = "FpNfrWwHerswMK3uzdCwXYpLOohu6ZxI";
            this.A0B = true;
        }
        if (this.A0B) {
            return;
        }
        if (this.A08 == null) {
            TQ tq = this.A06;
            String[] strArr2 = A0I;
            if (strArr2[7].length() != strArr2[1].length()) {
                A0I[6] = "pizgxuJ8qzJ0XY3Qb4fPPou13xZZyBde";
                ((TQ) AbstractC1517es.A01(tq)).AIn(j);
            } else {
                ((TQ) AbstractC1517es.A01(tq)).AIn(j);
            }
            try {
                this.A08 = ((TQ) AbstractC1517es.A01(this.A06)).A5j();
            } catch (TP e) {
                A0A(e);
                return;
            }
        }
        int iA90 = A90();
        if (A0I[6].charAt(24) != '3') {
            String[] strArr3 = A0I;
            strArr3[4] = "FJ";
            strArr3[5] = "1OlycrCvfKlLNEvf";
            i = 0;
            if (iA90 != 0) {
                return;
            }
        } else {
            String[] strArr4 = A0I;
            strArr4[3] = "rAwrherVLoB9hDbboAipBd54PP9tdkSf";
            strArr4[2] = "hVn1tpbZ7QSUOGOxJndIxosuMZKMmY4d";
            i = 2;
            if (iA90 != 2) {
                return;
            }
        }
        boolean z = false;
        if (this.A09 != null) {
            long jA00 = A00();
            while (jA00 <= j) {
                this.A01++;
                jA00 = A00();
                z = true;
            }
        }
        if (this.A08 != null) {
            AbstractC05578q abstractC05578q = this.A08;
            boolean textRendererNeedsUpdate = abstractC05578q.A05();
            if (textRendererNeedsUpdate) {
                if (!z && A00() == Long.MAX_VALUE) {
                    if (this.A00 == i) {
                        A08();
                    } else {
                        A06();
                        this.A0B = true;
                    }
                }
            } else if (((AbstractC1141Wu) abstractC05578q).A01 <= j) {
                if (this.A09 != null) {
                    this.A09.A0B();
                }
                this.A01 = abstractC05578q.A8Q(j);
                this.A09 = abstractC05578q;
                String[] strArr5 = A0I;
                if (strArr5[4].length() != strArr5[5].length()) {
                    String[] strArr6 = A0I;
                    strArr6[7] = "bBSmd5PctXg1QmIcB";
                    strArr6[1] = "qvmvf5RKavjwzG";
                    this.A08 = null;
                    z = true;
                } else {
                    this.A08 = null;
                    z = true;
                }
            }
        }
        if (z) {
            AbstractC1517es.A01(this.A09);
            A0C(new C0980Qf(this.A09.A7N(j), A02(A01(j))));
        }
        if (this.A00 == i) {
            return;
        }
        while (true) {
            try {
                boolean textRendererNeedsUpdate2 = this.A0A;
                if (!textRendererNeedsUpdate2) {
                    C05598s c05598sA5h = this.A07;
                    if (c05598sA5h == null) {
                        c05598sA5h = ((TQ) AbstractC1517es.A01(this.A06)).A5h();
                        if (c05598sA5h != null) {
                            this.A07 = c05598sA5h;
                        } else {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        c05598sA5h.A02(4);
                        ((TQ) AbstractC1517es.A01(this.A06)).AGR(c05598sA5h);
                        this.A07 = null;
                        this.A00 = i;
                        return;
                    }
                    int iA1R = A1R(this.A0E, c05598sA5h, 0);
                    if (iA1R == -4) {
                        boolean textRendererNeedsUpdate3 = c05598sA5h.A05();
                        if (textRendererNeedsUpdate3) {
                            this.A0A = true;
                            this.A0C = false;
                        } else {
                            ZM zm = this.A0E.A00;
                            if (zm != null) {
                                c05598sA5h.A00 = zm.A0M;
                                c05598sA5h.A0B();
                                boolean z2 = this.A0C;
                                boolean textRendererNeedsUpdate4 = c05598sA5h.A07();
                                this.A0C = (textRendererNeedsUpdate4 ? false : true) & z2;
                            } else {
                                return;
                            }
                        }
                        boolean textRendererNeedsUpdate5 = this.A0C;
                        if (!textRendererNeedsUpdate5) {
                            ((TQ) AbstractC1517es.A01(this.A06)).AGR(c05598sA5h);
                            this.A07 = null;
                        }
                    } else if (iA1R == -3) {
                        return;
                    }
                } else {
                    return;
                }
            } catch (TP e2) {
                A0A(e2);
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0983Qi
    public final int AJR(ZM zm) {
        if (this.A0F.AJS(zm)) {
            int iA00 = AbstractC0976Qb.A00(4);
            if (A0I[6].charAt(24) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[4] = "EN";
            strArr[5] = "jgxOlwVisoQfrYD7";
            return iA00;
        }
        if (Q2.A0E(zm.A0W)) {
            return AbstractC0976Qb.A00(1);
        }
        return AbstractC0976Qb.A00(0);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1188Yq, com.facebook.ads.redexgen.core.InterfaceC0983Qi
    public final String getName() {
        return A03(39, 12, 36);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A0B((C0980Qf) message.obj);
                return true;
            case 1:
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
