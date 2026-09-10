package com.facebook.ads.redexgen.core;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0648Cw implements InterfaceC1170Xx {
    public static String[] A09 = {"7A2DuxexkNzrP7QjhGhrFYYu", "soCGQjvsRcIeT6oOZGXwOMHckv7o7per", "Y6uu4OXCAFS9biuB4W1Qiand94h2DeLJ", "", "HZdE1worCkoUMuRG1QGA3M81OGDro9K1", "TMt2EFIO6gjy0ISbcDhRXYxO1rG8", "1kCmjgzrPTW72y1zBKqQSTNYVdjN", "WOoZRWv9xLTzL9AmYqiIWKlutEy7PHyv"};
    public QQ A00;
    public InterfaceC1552fS A01;
    public C1558fY<R4> A02;
    public boolean A03;
    public final InterfaceC1524ez A08;
    public final C1179Yh A05 = new C1179Yh();
    public final C1177Yf A06 = new C1177Yf();
    public final R6 A07 = new R6(this.A05);
    public final SparseArray<R2> A04 = new SparseArray<>();

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @RequiresNonNull({"player"})
    private final R2 A03(Timeline timeline, int i, R5 r5) {
        boolean z;
        long jA04;
        boolean zA0N;
        String[] strArr;
        boolean zA00;
        String[] strArr2;
        R5 r6 = r5;
        if (timeline.A0N()) {
            r6 = null;
        }
        long jA69 = this.A08.A69();
        if (!timeline.equals(this.A00.A7W())) {
            z = false;
            jA04 = 0;
            if (r6 != null) {
                zA00 = r6.A00();
                strArr2 = A09;
                if (strArr2[5].length() != strArr2[6].length()) {
                    A09[4] = "g59l2XjBnH51xsorBXRgA5INpEkF6Fa1";
                    if (zA00) {
                        if (!z && this.A00.A7O() == r6.A00 && this.A00.A7P() == r6.A01) {
                            jA04 = this.A00.A7U();
                        }
                    } else if (z) {
                        jA04 = this.A00.A7J();
                    } else {
                        zA0N = timeline.A0N();
                        strArr = A09;
                        if (strArr[1].charAt(9) != strArr[2].charAt(9)) {
                            A09[0] = "5uHjZoN";
                            if (!zA0N) {
                                jA04 = timeline.A0K(i, this.A06).A04();
                            }
                        }
                    }
                } else if (zA00) {
                    if (!z && this.A00.A7O() == r6.A00 && this.A00.A7P() == r6.A01) {
                        jA04 = this.A00.A7U();
                    }
                } else if (z) {
                    jA04 = this.A00.A7J();
                } else {
                    zA0N = timeline.A0N();
                    strArr = A09;
                    if (strArr[1].charAt(9) != strArr[2].charAt(9)) {
                        A09[0] = "5uHjZoN";
                        if (!zA0N) {
                            jA04 = timeline.A0K(i, this.A06).A04();
                        }
                    }
                }
            } else if (z) {
                jA04 = this.A00.A7J();
            } else {
                zA0N = timeline.A0N();
                strArr = A09;
                if (strArr[1].charAt(9) != strArr[2].charAt(9)) {
                    A09[0] = "5uHjZoN";
                    if (!zA0N) {
                        jA04 = timeline.A0K(i, this.A06).A04();
                    }
                }
            }
            return new R2(jA69, timeline, i, r6, jA04, this.A00.A7W(), this.A00.A7R(), this.A07.A06(), this.A00.A7U(), this.A00.A99());
        }
        QQ qq = this.A00;
        if (A09[3].length() != 3) {
            A09[7] = "2n6cNAbfzShVhzLLKv8gN9q8hgmw2Z4V";
            if (i == qq.A7R()) {
                z = true;
            } else {
                z = false;
            }
            jA04 = 0;
            if (r6 != null) {
                zA00 = r6.A00();
                strArr2 = A09;
                if (strArr2[5].length() != strArr2[6].length()) {
                    A09[4] = "g59l2XjBnH51xsorBXRgA5INpEkF6Fa1";
                    if (zA00) {
                        if (!z && this.A00.A7O() == r6.A00 && this.A00.A7P() == r6.A01) {
                            jA04 = this.A00.A7U();
                        }
                    } else if (z) {
                        jA04 = this.A00.A7J();
                    } else {
                        zA0N = timeline.A0N();
                        strArr = A09;
                        if (strArr[1].charAt(9) != strArr[2].charAt(9)) {
                            A09[0] = "5uHjZoN";
                            if (!zA0N) {
                                jA04 = timeline.A0K(i, this.A06).A04();
                            }
                        }
                    }
                } else if (zA00) {
                    if (!z && this.A00.A7O() == r6.A00 && this.A00.A7P() == r6.A01) {
                        jA04 = this.A00.A7U();
                    }
                } else if (z) {
                    jA04 = this.A00.A7J();
                } else {
                    zA0N = timeline.A0N();
                    strArr = A09;
                    if (strArr[1].charAt(9) != strArr[2].charAt(9)) {
                        A09[0] = "5uHjZoN";
                        if (!zA0N) {
                            jA04 = timeline.A0K(i, this.A06).A04();
                        }
                    }
                }
            } else if (z) {
                jA04 = this.A00.A7J();
            } else {
                zA0N = timeline.A0N();
                strArr = A09;
                if (strArr[1].charAt(9) != strArr[2].charAt(9)) {
                    A09[0] = "5uHjZoN";
                    if (!zA0N) {
                        jA04 = timeline.A0K(i, this.A06).A04();
                    }
                }
            }
            return new R2(jA69, timeline, i, r6, jA04, this.A00.A7W(), this.A00.A7R(), this.A07.A06(), this.A00.A7U(), this.A00.A99());
        }
        throw new RuntimeException();
    }

    public C0648Cw(InterfaceC1524ez interfaceC1524ez) {
        this.A08 = (InterfaceC1524ez) AbstractC1517es.A01(interfaceC1524ez);
        this.A02 = new C1558fY<>(AbstractC1600gE.A0d(), interfaceC1524ez, new InterfaceC1556fW() { // from class: com.facebook.ads.redexgen.X.Xd
        });
    }

    private final R2 A00() {
        return A04(this.A07.A06());
    }

    private R2 A01(int i, R5 r5) {
        AbstractC1517es.A01(this.A00);
        boolean z = true;
        if (r5 != null) {
            if (this.A07.A05(r5) == null) {
                z = false;
            }
            if (z) {
                return A04(r5);
            }
            return A03(Timeline.A02, i, r5);
        }
        Timeline timelineA7W = this.A00.A7W();
        if (i >= timelineA7W.A07()) {
            z = false;
        }
        if (!z) {
            timelineA7W = Timeline.A02;
        }
        return A03(timelineA7W, i, null);
    }

    private R2 A02(Z1 z1) {
        if (z1 instanceof EK) {
            EK ek = (EK) z1;
            if (ek.A05 != null) {
                return A04(new R5(ek.A05));
            }
        }
        return A00();
    }

    private R2 A04(R5 r5) {
        Timeline timelineA05;
        AbstractC1517es.A01(this.A00);
        if (r5 == null) {
            timelineA05 = null;
        } else {
            timelineA05 = this.A07.A05(r5);
        }
        if (r5 == null || timelineA05 == null) {
            int windowIndex = this.A00.A7R();
            Timeline knownTimeline = this.A00.A7W();
            if (!(windowIndex < knownTimeline.A07())) {
                knownTimeline = Timeline.A02;
            }
            return A03(knownTimeline, windowIndex, null);
        }
        return A03(timelineA05, timelineA05.A0J(r5.A04, this.A05).A00, r5);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.fV != com.google.android.exoplayer2.util.ListenerSet$Event<com.google.android.exoplayer2.analytics.AnalyticsListener> */
    private final void A05(R2 r2, int i, InterfaceC1555fV<R4> interfaceC1555fV) {
        this.A04.put(i, r2);
        this.A02.A0A(i, interfaceC1555fV);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1170Xx
    public final void ABz() {
        if (!this.A03) {
            final R2 r2A00 = A00();
            this.A03 = true;
            A05(r2A00, -1, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xm
            });
        }
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void ACo(final C0980Qf c0980Qf) {
        final R2 r2A00 = A00();
        A05(r2A00, 27, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xe
        });
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void ACp(final List<C0982Qh> list) {
        final R2 r2A00 = A00();
        A05(r2A00, 27, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xb
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1289bB
    public final void ACz(int i, R5 r5, final C1275au c1275au) {
        final R2 r2A01 = A01(i, r5);
        A05(r2A01, 1004, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xi
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1289bB
    public final void ADp(int i, R5 r5, final C1272ar c1272ar, final C1275au c1275au) {
        final R2 r2A01 = A01(i, r5);
        A05(r2A01, 1002, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.XQ
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1289bB
    public final void ADr(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) int i, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) R5 r5, final C1272ar c1272ar, final C1275au c1275au, Object obj, Object obj2) {
        final R2 r2A01 = A01(i, r5);
        A05(r2A01, 1001, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xc
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1289bB
    public final void ADu(int i, R5 r5, final C1272ar c1272ar, final C1275au c1275au, final IOException iOException, final boolean z) {
        final R2 r2A01 = A01(i, r5);
        A05(r2A01, PointerIconCompat.TYPE_HELP, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xh
        });
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void AEV(final C1193Yv c1193Yv) {
        final R2 r2A00 = A00();
        A05(r2A00, 12, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xp
        });
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void AEX(final Z1 z1) {
        final R2 r2A02 = A02(z1);
        A05(r2A02, 10, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xg
        });
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void AEZ(final boolean z, final int i) {
        final R2 r2A00 = A00();
        A05(r2A00, -1, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xo
        });
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void AF3() {
        final R2 r2A00 = A00();
        A05(r2A00, -1, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.Xk
        });
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void AFI(Timeline timeline, final int i) {
        this.A07.A07((QQ) AbstractC1517es.A01(this.A00));
        final R2 r2A00 = A00();
        A05(r2A00, 0, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.XS
        });
    }

    @Override // com.facebook.ads.redexgen.core.QJ
    public final void AFM(final Y4 y4) {
        final R2 r2A00 = A00();
        A05(r2A00, 2, new InterfaceC1555fV() { // from class: com.facebook.ads.redexgen.X.XT
        });
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1170Xx
    public final void AIl(final QQ qq, Looper looper) {
        AbstractC1517es.A08(this.A00 == null || this.A07.A03.isEmpty());
        this.A00 = (QQ) AbstractC1517es.A01(qq);
        this.A01 = this.A08.A5F(looper, null);
        this.A02 = this.A02.A07(looper, new InterfaceC1556fW() { // from class: com.facebook.ads.redexgen.X.Xl
        });
    }
}
