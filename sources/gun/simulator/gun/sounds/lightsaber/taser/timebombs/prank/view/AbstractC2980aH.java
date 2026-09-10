package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Color;
import android.view.animation.Interpolator;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2980aH {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3692iN f4115a = C3692iN.I("nm", "ind", "refId", "ty", "parent", "sw", com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", com.umeng.analytics.pro.bc.aO, "ef", "sr", "st", "w", com.umeng.analytics.pro.bc.aM, "ip", "op", "tm", "cl", "hd", "ao", "bm");
    public static final C3692iN b = C3692iN.I(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "a");
    public static final C3692iN c = C3692iN.I("ty", "nm");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:231:0x0466  */
    /* JADX WARN: Code duplicated, block: B:258:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f2  */
    public static ZG a(WF wf, MJ mj) {
        M4 m4;
        byte b2;
        long j;
        G4 g4;
        G4 g5;
        G4 g6;
        G4 g7;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        wf.k();
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        boolean z = false;
        int i = 1;
        long jR = -1;
        String strS = null;
        float fQ = 0.0f;
        int i2 = 0;
        String strS2 = null;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        float fQ2 = 1.0f;
        float fQ3 = 0.0f;
        float fQ4 = 0.0f;
        float fQ5 = 0.0f;
        F4 f4 = null;
        C3692iN c3692iN = null;
        int i3 = 1;
        G4 g4M0 = null;
        boolean zP = false;
        NN nn = null;
        L4 l4 = null;
        int i4 = 1;
        float fQ6 = 0.0f;
        M4 m5 = null;
        long jR2 = 0;
        String strS3 = "UNSET";
        boolean z2 = false;
        while (wf.o()) {
            int i5 = 3;
            switch (wf.v(f4115a)) {
                case 0:
                    strS3 = wf.s();
                    z = false;
                    break;
                case 1:
                    jR2 = wf.r();
                    z = false;
                    break;
                case 2:
                    strS2 = wf.s();
                    z = false;
                    break;
                case 3:
                    z2 = z2;
                    strS = strS;
                    jR2 = jR2;
                    int iR = wf.r();
                    i2 = 7;
                    if (iR < 6) {
                        i2 = DM.F(7)[iR];
                    }
                    z2 = z2;
                    strS = strS;
                    jR2 = jR2;
                    z = false;
                    break;
                case 4:
                    jR = wf.r();
                    z2 = z2;
                    z = false;
                    break;
                case 5:
                    iC = (int) (AbstractC3014ah0.c() * wf.r());
                    z2 = z2;
                    z = false;
                    break;
                case 6:
                    iC2 = (int) (AbstractC3014ah0.c() * wf.r());
                    z2 = z2;
                    z = false;
                    break;
                case 7:
                    color = Color.parseColor(wf.s());
                    z = false;
                    break;
                case 8:
                    m5 = N4.a(wf, mj);
                    z = false;
                    break;
                case 9:
                    z2 = z2;
                    strS = strS;
                    jR2 = jR2;
                    int iR2 = wf.r();
                    if (iR2 < DM.F(6).length) {
                        i3 = DM.F(6)[iR2];
                        int iD = DM.D(i3);
                        if (iD == 3) {
                            mj.a("Unsupported matte type: Luma");
                        } else if (iD == 4) {
                            mj.a("Unsupported matte type: Luma Inverted");
                        }
                        i = 1;
                        mj.p++;
                        z2 = z2;
                        strS = strS;
                        jR2 = jR2;
                        z = false;
                    } else {
                        mj.a("Unsupported matte type: " + iR2);
                        z2 = z2;
                        strS = strS;
                        jR2 = jR2;
                        z = false;
                        i = 1;
                    }
                    break;
                case 10:
                    z2 = z2;
                    strS = strS;
                    jR2 = jR2;
                    wf.h();
                    while (wf.o()) {
                        wf.k();
                        int i6 = 0;
                        boolean zP2 = false;
                        F4 f5 = null;
                        F4 f4N0 = null;
                        while (wf.o()) {
                            String strV = wf.V();
                            strV.getClass();
                            switch (strV) {
                                case "o":
                                    f4N0 = AbstractC2871Wx.n0(wf, mj);
                                    break;
                                case "pt":
                                    f5 = new F4(BG.a(wf, mj, AbstractC3014ah0.c(), C3143c60.f4204a, false), 5);
                                    break;
                                case "inv":
                                    zP2 = wf.p();
                                    break;
                                case "mode":
                                    String strS4 = wf.s();
                                    strS4.getClass();
                                    int iHashCode = strS4.hashCode();
                                    if (iHashCode != 97) {
                                        if (iHashCode != 105) {
                                            if (iHashCode != 110) {
                                                if (iHashCode == 115 && strS4.equals(com.umeng.analytics.pro.bc.aH)) {
                                                    b2 = 3;
                                                } else {
                                                    b2 = -1;
                                                }
                                            } else if (strS4.equals("n")) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (strS4.equals(com.umeng.analytics.pro.bc.aI)) {
                                            b2 = 1;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (strS4.equals("a")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    if (b2 != 0) {
                                        if (b2 == 1) {
                                            mj.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            i6 = 3;
                                        } else if (b2 == 2) {
                                            i6 = 4;
                                        } else if (b2 != 3) {
                                            AbstractC5005xJ.b("Unknown mask mode " + strV + ". Defaulting to Add.");
                                        } else {
                                            i6 = 2;
                                        }
                                        break;
                                    }
                                    i6 = 1;
                                    break;
                                default:
                                    wf.x();
                                    break;
                            }
                        }
                        wf.n();
                        arrayList.add(new C4480rM(i6, f5, f4N0, zP2));
                    }
                    mj.p += arrayList.size();
                    wf.m();
                    z2 = z2;
                    strS = strS;
                    jR2 = jR2;
                    z = false;
                    i = 1;
                    break;
                case 11:
                    wf.h();
                    while (wf.o()) {
                        InterfaceC2727Rj interfaceC2727RjA = AbstractC2753Sj.a(wf, mj);
                        if (interfaceC2727RjA != null) {
                            arrayList2.add(interfaceC2727RjA);
                        }
                    }
                    wf.m();
                    z2 = z2;
                    strS = strS;
                    jR2 = jR2;
                    z = false;
                    i = 1;
                    break;
                case 12:
                    boolean z3 = z2;
                    String str = strS;
                    wf.k();
                    while (wf.o()) {
                        int iV = wf.v(b);
                        if (iV == 0) {
                            j = jR2;
                            f4 = new F4(BG.a(wf, mj, AbstractC3014ah0.c(), C2292Ap.f2838a, false), 6);
                        } else if (iV != 1) {
                            wf.w();
                            wf.x();
                        } else {
                            wf.h();
                            if (wf.o()) {
                                C3692iN c3692iN2 = K4.f3298a;
                                wf.k();
                                L4 l5 = null;
                                C3844k50 c3844k50 = null;
                                while (wf.o()) {
                                    int iV2 = wf.v(K4.f3298a);
                                    if (iV2 == 0) {
                                        wf.k();
                                        F4 f6 = null;
                                        F4 f4N1 = null;
                                        F4 f4N2 = null;
                                        Xb0 xb0 = null;
                                        while (wf.o()) {
                                            int iV3 = wf.v(K4.b);
                                            if (iV3 == 0) {
                                                f6 = AbstractC2871Wx.n0(wf, mj);
                                            } else if (iV3 == 1) {
                                                f4N1 = AbstractC2871Wx.n0(wf, mj);
                                            } else if (iV3 == 2) {
                                                f4N2 = AbstractC2871Wx.n0(wf, mj);
                                            } else if (iV3 != 3) {
                                                wf.w();
                                                wf.x();
                                            } else {
                                                int iR3 = wf.r();
                                                Xb0 xb1 = Xb0.b;
                                                if (iR3 != 1 && iR3 != 2) {
                                                    mj.a("Unsupported text range units: " + iR3);
                                                } else if (iR3 == 1) {
                                                    xb0 = Xb0.f3978a;
                                                }
                                                xb0 = xb1;
                                            }
                                        }
                                        wf.n();
                                        if (f6 == null && f4N1 != null) {
                                            f6 = new F4(Collections.singletonList(new C5090yG(0)), 2);
                                        }
                                        c3844k50 = new C3844k50(f6, f4N1, f4N2, xb0);
                                        jR2 = jR2;
                                    } else if (iV2 != 1) {
                                        wf.w();
                                        wf.x();
                                    } else {
                                        wf.k();
                                        F4 f4L0 = null;
                                        F4 f4L1 = null;
                                        G4 g4M1 = null;
                                        G4 g4M2 = null;
                                        F4 f4N3 = null;
                                        while (wf.o()) {
                                            int iV4 = wf.v(K4.c);
                                            if (iV4 == 0) {
                                                f4L0 = AbstractC2871Wx.l0(wf, mj);
                                            } else if (iV4 == 1) {
                                                f4L1 = AbstractC2871Wx.l0(wf, mj);
                                            } else if (iV4 == 2) {
                                                g4M1 = AbstractC2871Wx.m0(wf, mj, true);
                                            } else if (iV4 == 3) {
                                                g4M2 = AbstractC2871Wx.m0(wf, mj, true);
                                            } else if (iV4 != 4) {
                                                wf.w();
                                                wf.x();
                                            } else {
                                                f4N3 = AbstractC2871Wx.n0(wf, mj);
                                            }
                                        }
                                        wf.n();
                                        l5 = new L4(f4L0, f4L1, g4M1, g4M2, f4N3);
                                    }
                                }
                                j = jR2;
                                wf.n();
                                c3692iN = new C3692iN(1, l5, c3844k50);
                            } else {
                                j = jR2;
                            }
                            while (wf.o()) {
                                wf.x();
                            }
                            wf.m();
                        }
                        jR2 = j;
                    }
                    wf.n();
                    z2 = z3;
                    strS = str;
                    z = false;
                    i = 1;
                    break;
                case 13:
                    wf.h();
                    ArrayList arrayList3 = new ArrayList();
                    while (wf.o()) {
                        wf.k();
                        while (wf.o()) {
                            int iV5 = wf.v(c);
                            if (iV5 == 0) {
                                int iR4 = wf.r();
                                if (iR4 == 29) {
                                    C3692iN c3692iN3 = AbstractC2666Pa.f3556a;
                                    nn = null;
                                    while (wf.o()) {
                                        if (wf.v(AbstractC2666Pa.f3556a) != 0) {
                                            wf.w();
                                            wf.x();
                                        } else {
                                            wf.h();
                                            while (wf.o()) {
                                                wf.k();
                                                boolean z4 = false;
                                                NN nn2 = null;
                                                while (wf.o()) {
                                                    int iV6 = wf.v(AbstractC2666Pa.b);
                                                    if (iV6 == 0) {
                                                        z4 = wf.r() == 0;
                                                    } else if (iV6 != 1) {
                                                        wf.w();
                                                        wf.x();
                                                    } else if (z4) {
                                                        nn2 = new NN(AbstractC2871Wx.m0(wf, mj, true), i5);
                                                    } else {
                                                        wf.x();
                                                    }
                                                }
                                                wf.n();
                                                if (nn2 != null) {
                                                    nn = nn2;
                                                }
                                            }
                                            wf.m();
                                        }
                                    }
                                } else {
                                    if (iR4 == 25) {
                                        C3735iq c3735iq = new C3735iq();
                                        while (wf.o()) {
                                            if (wf.v(C3735iq.f) != 0) {
                                                wf.w();
                                                wf.x();
                                            } else {
                                                wf.h();
                                                while (wf.o()) {
                                                    wf.k();
                                                    String strS5 = "";
                                                    while (wf.o()) {
                                                        int iV7 = wf.v(C3735iq.g);
                                                        if (iV7 == 0) {
                                                            strS5 = wf.s();
                                                        } else if (iV7 == 1) {
                                                            strS5.getClass();
                                                            switch (strS5) {
                                                                case "Distance":
                                                                    c3735iq.d = AbstractC2871Wx.m0(wf, mj, true);
                                                                    break;
                                                                case "Opacity":
                                                                    c3735iq.b = AbstractC2871Wx.m0(wf, mj, false);
                                                                    break;
                                                                case "Direction":
                                                                    c3735iq.c = AbstractC2871Wx.m0(wf, mj, false);
                                                                    break;
                                                                case "Shadow Color":
                                                                    c3735iq.f4523a = AbstractC2871Wx.l0(wf, mj);
                                                                    break;
                                                                case "Softness":
                                                                    c3735iq.e = AbstractC2871Wx.m0(wf, mj, true);
                                                                    break;
                                                                default:
                                                                    wf.x();
                                                                    break;
                                                            }
                                                        } else {
                                                            wf.w();
                                                            wf.x();
                                                        }
                                                    }
                                                    wf.n();
                                                }
                                                wf.m();
                                            }
                                        }
                                        F4 f7 = c3735iq.f4523a;
                                        if (f7 == null || (g4 = c3735iq.b) == null || (g5 = c3735iq.c) == null || (g6 = c3735iq.d) == null || (g7 = c3735iq.e) == null) {
                                            l4 = null;
                                        } else {
                                            L4 l6 = new L4();
                                            l6.f3336a = f7;
                                            l6.b = g4;
                                            l6.c = g5;
                                            l6.d = g6;
                                            l6.e = g7;
                                            l4 = l6;
                                        }
                                    }
                                    strS = strS;
                                    i5 = 3;
                                }
                            } else if (iV5 != 1) {
                                wf.w();
                                wf.x();
                            } else {
                                arrayList3.add(wf.s());
                            }
                            strS = strS;
                            i5 = 3;
                        }
                        wf.n();
                        i5 = 3;
                    }
                    wf.m();
                    mj.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    z2 = z2;
                    z = false;
                    i = 1;
                    break;
                case 14:
                    fQ2 = (float) wf.q();
                    z = false;
                    i = 1;
                    break;
                case 15:
                    fQ3 = (float) wf.q();
                    z = false;
                    i = 1;
                    break;
                case 16:
                    fQ4 = (float) (wf.q() * ((double) AbstractC3014ah0.c()));
                    z2 = z2;
                    z = false;
                    i = 1;
                    break;
                case 17:
                    fQ5 = (float) (wf.q() * ((double) AbstractC3014ah0.c()));
                    z2 = z2;
                    z = false;
                    i = 1;
                    break;
                case 18:
                    fQ = (float) wf.q();
                    z = false;
                    i = 1;
                    break;
                case 19:
                    fQ6 = (float) wf.q();
                    z = false;
                    i = 1;
                    break;
                case 20:
                    g4M0 = AbstractC2871Wx.m0(wf, mj, z);
                    break;
                case 21:
                    strS = wf.s();
                    break;
                case 22:
                    zP = wf.p();
                    break;
                case 23:
                    z2 = wf.r() == i;
                    break;
                case 24:
                    int iR5 = wf.r();
                    if (iR5 < DM.F(18).length) {
                        i4 = DM.F(18)[iR5];
                    } else {
                        mj.a("Unsupported Blend Mode: " + iR5);
                        i4 = 1;
                    }
                    break;
                default:
                    wf.w();
                    wf.x();
                    z2 = z2;
                    strS = strS;
                    jR2 = jR2;
                    z = false;
                    i = 1;
                    break;
            }
        }
        boolean z5 = z2;
        String str2 = strS;
        long j2 = jR2;
        wf.n();
        ArrayList arrayList4 = new ArrayList();
        if (fQ > 0.0f) {
            arrayList4.add(new C5090yG(mj, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(fQ)));
        }
        if (fQ6 <= 0.0f) {
            fQ6 = mj.m;
        }
        arrayList4.add(new C5090yG(mj, fValueOf2, fValueOf2, (Interpolator) null, fQ, Float.valueOf(fQ6)));
        arrayList4.add(new C5090yG(mj, fValueOf, fValueOf, (Interpolator) null, fQ6, Float.valueOf(Float.MAX_VALUE)));
        if (strS3.endsWith(".ai") || "ai".equals(str2)) {
            mj.a("Convert your Illustrator layers to shape layers.");
        }
        if (z5 != 0) {
            if (m5 == null) {
                m5 = new M4();
            }
            M4 m6 = m5;
            m6.j = z5;
            m4 = m6;
        } else {
            m4 = m5;
        }
        return new ZG(arrayList2, mj, strS3, j2, i2, jR, strS2, arrayList, m4, iC, iC2, color, fQ2, fQ3, fQ4, fQ5, f4, c3692iN, arrayList4, i3, g4M0, zP, nn, l4, i4);
    }
}
