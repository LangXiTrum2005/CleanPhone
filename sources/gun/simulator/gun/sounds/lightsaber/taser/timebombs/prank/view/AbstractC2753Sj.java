package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Path;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2753Sj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3692iN f3730a = C3692iN.I("ty", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D);

    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:458:0x07b3 A[LOOP:1: B:456:0x07ad->B:458:0x07b3, LOOP_END] */
    public static InterfaceC2727Rj a(WF wf, MJ mj) throws C3124bu, EOFException {
        String strS;
        byte b;
        InterfaceC2727Rj c2826Ve;
        InterfaceC2727Rj c3408f60;
        wf.k();
        int iR = 2;
        while (true) {
            if (!wf.o()) {
                strS = null;
                break;
            }
            int iV = wf.v(f3730a);
            if (iV == 0) {
                strS = wf.s();
                break;
            }
            if (iV != 1) {
                wf.w();
                wf.x();
            } else {
                iR = wf.r();
            }
        }
        if (strS == null) {
            return null;
        }
        int iHashCode = strS.hashCode();
        boolean zP = false;
        boolean zP2 = false;
        int i = 0;
        if (iHashCode != 3239) {
            if (iHashCode != 3270) {
                if (iHashCode != 3295) {
                    if (iHashCode != 3488) {
                        if (iHashCode != 3646) {
                            if (iHashCode != 3669) {
                                if (iHashCode != 3679) {
                                    if (iHashCode != 3681) {
                                        if (iHashCode != 3705) {
                                            if (iHashCode != 3710) {
                                                if (iHashCode != 3307) {
                                                    if (iHashCode != 3308) {
                                                        if (iHashCode != 3633) {
                                                            if (iHashCode == 3634 && strS.equals("rd")) {
                                                                b = 7;
                                                            } else {
                                                                b = -1;
                                                            }
                                                        } else if (strS.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT)) {
                                                            b = 6;
                                                        } else {
                                                            b = -1;
                                                        }
                                                    } else if (strS.equals("gs")) {
                                                        b = 4;
                                                    } else {
                                                        b = -1;
                                                    }
                                                } else if (strS.equals("gr")) {
                                                    b = 3;
                                                } else {
                                                    b = -1;
                                                }
                                            } else if (strS.equals("tr")) {
                                                b = com.umeng.analytics.pro.cw.k;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (strS.equals("tm")) {
                                            b = 12;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (strS.equals("st")) {
                                        b = 11;
                                    } else {
                                        b = -1;
                                    }
                                } else if (strS.equals("sr")) {
                                    b = 10;
                                } else {
                                    b = -1;
                                }
                            } else if (strS.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH)) {
                                b = 9;
                            } else {
                                b = -1;
                            }
                        } else if (strS.equals("rp")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                    } else if (strS.equals("mm")) {
                        b = 5;
                    } else {
                        b = -1;
                    }
                } else if (strS.equals("gf")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (strS.equals("fl")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (strS.equals("el")) {
            b = 0;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
                C3692iN c3692iN = AbstractC2852We.f3930a;
                boolean z = iR == 3;
                String strS2 = null;
                O4 o4B = null;
                F4 f4O0 = null;
                boolean zP3 = false;
                while (wf.o()) {
                    int iV2 = wf.v(AbstractC2852We.f3930a);
                    if (iV2 == 0) {
                        strS2 = wf.s();
                    } else if (iV2 == 1) {
                        o4B = I4.b(wf, mj);
                    } else if (iV2 == 2) {
                        f4O0 = AbstractC2871Wx.o0(wf, mj);
                    } else if (iV2 == 3) {
                        zP3 = wf.p();
                    } else if (iV2 != 4) {
                        wf.w();
                        wf.x();
                    } else {
                        z = wf.r() == 3;
                    }
                }
                c2826Ve = new C2826Ve(strS2, o4B, f4O0, z, zP3);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 1:
                C3692iN c3692iN2 = AbstractC3320e60.f4307a;
                int iR2 = 1;
                F4 f4 = null;
                String strS3 = null;
                boolean zP4 = false;
                F4 f4L0 = null;
                boolean zP5 = false;
                while (wf.o()) {
                    int iV3 = wf.v(AbstractC3320e60.f4307a);
                    if (iV3 == 0) {
                        strS3 = wf.s();
                    } else if (iV3 == 1) {
                        f4L0 = AbstractC2871Wx.l0(wf, mj);
                    } else if (iV3 == 2) {
                        f4 = AbstractC2871Wx.n0(wf, mj);
                    } else if (iV3 == 3) {
                        zP4 = wf.p();
                    } else if (iV3 == 4) {
                        iR2 = wf.r();
                    } else if (iV3 != 5) {
                        wf.w();
                        wf.x();
                    } else {
                        zP5 = wf.p();
                    }
                }
                if (f4 == null) {
                    f4 = new F4(Collections.singletonList(new C5090yG(100)), 2);
                }
                c2826Ve = new C3232d60(strS3, zP4, iR2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, f4L0, f4, zP5);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 2:
                C3692iN c3692iN3 = AbstractC4533ry.f4955a;
                Path.FillType fillType = Path.FillType.WINDING;
                F4 f4N0 = null;
                String strS4 = null;
                int i2 = 0;
                F4 f5 = null;
                F4 f4O1 = null;
                F4 f4O2 = null;
                boolean zP6 = false;
                while (wf.o()) {
                    switch (wf.v(AbstractC4533ry.f4955a)) {
                        case 0:
                            strS4 = wf.s();
                            break;
                        case 1:
                            wf.k();
                            int iR3 = -1;
                            while (wf.o()) {
                                int iV4 = wf.v(AbstractC4533ry.b);
                                if (iV4 == 0) {
                                    iR3 = wf.r();
                                } else if (iV4 != 1) {
                                    wf.w();
                                    wf.x();
                                } else {
                                    Qm0 qm0 = new Qm0();
                                    qm0.f3624a = iR3;
                                    f5 = new F4(BG.a(wf, mj, 1.0f, qm0, false));
                                }
                            }
                            wf.n();
                            break;
                        case 2:
                            f4N0 = AbstractC2871Wx.n0(wf, mj);
                            break;
                        case 3:
                            i2 = wf.r() != 1 ? 2 : 1;
                            break;
                        case 4:
                            f4O1 = AbstractC2871Wx.o0(wf, mj);
                            break;
                        case 5:
                            f4O2 = AbstractC2871Wx.o0(wf, mj);
                            break;
                        case 6:
                            fillType = wf.r() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zP6 = wf.p();
                            break;
                        default:
                            wf.w();
                            wf.x();
                            break;
                    }
                }
                c2826Ve = new C4358py(strS4, i2, fillType, f5, f4N0 == null ? new F4(Collections.singletonList(new C5090yG(100)), 2) : f4N0, f4O1, f4O2, zP6);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 3:
                C3692iN c3692iN4 = AbstractC3496g60.f4403a;
                ArrayList arrayList = new ArrayList();
                String strS5 = null;
                while (wf.o()) {
                    int iV5 = wf.v(AbstractC3496g60.f4403a);
                    if (iV5 == 0) {
                        strS5 = wf.s();
                    } else if (iV5 == 1) {
                        zP = wf.p();
                    } else if (iV5 != 2) {
                        wf.x();
                    } else {
                        wf.h();
                        while (wf.o()) {
                            InterfaceC2727Rj interfaceC2727RjA = a(wf, mj);
                            if (interfaceC2727RjA != null) {
                                arrayList.add(interfaceC2727RjA);
                            }
                        }
                        wf.m();
                    }
                }
                c3408f60 = new C3408f60(strS5, arrayList, zP);
                c2826Ve = c3408f60;
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 4:
                C3692iN c3692iN5 = AbstractC4797uy.f5111a;
                ArrayList arrayList2 = new ArrayList();
                F4 f4N1 = null;
                String strS6 = null;
                int i3 = 0;
                F4 f6 = null;
                F4 f4O3 = null;
                F4 f4O4 = null;
                G4 g4M0 = null;
                int i4 = 0;
                int i5 = 0;
                float fQ = 0.0f;
                G4 g4 = null;
                boolean zP7 = false;
                while (wf.o()) {
                    switch (wf.v(AbstractC4797uy.f5111a)) {
                        case 0:
                            strS6 = wf.s();
                            break;
                        case 1:
                            wf.k();
                            int iR4 = -1;
                            while (wf.o()) {
                                int iV6 = wf.v(AbstractC4797uy.b);
                                if (iV6 == 0) {
                                    iR4 = wf.r();
                                } else if (iV6 != 1) {
                                    wf.w();
                                    wf.x();
                                } else {
                                    Qm0 qm1 = new Qm0();
                                    qm1.f3624a = iR4;
                                    f6 = new F4(BG.a(wf, mj, 1.0f, qm1, false));
                                }
                            }
                            wf.n();
                            break;
                        case 2:
                            f4N1 = AbstractC2871Wx.n0(wf, mj);
                            break;
                        case 3:
                            i3 = wf.r() != 1 ? 2 : 1;
                            break;
                        case 4:
                            f4O3 = AbstractC2871Wx.o0(wf, mj);
                            break;
                        case 5:
                            f4O4 = AbstractC2871Wx.o0(wf, mj);
                            break;
                        case 6:
                            g4M0 = AbstractC2871Wx.m0(wf, mj, true);
                            break;
                        case 7:
                            i4 = DM.F(3)[wf.r() - 1];
                            break;
                        case 8:
                            i5 = DM.F(3)[wf.r() - 1];
                            break;
                        case 9:
                            fQ = (float) wf.q();
                            break;
                        case 10:
                            zP7 = wf.p();
                            break;
                        case 11:
                            wf.h();
                            while (wf.o()) {
                                wf.k();
                                String strS7 = null;
                                G4 g4M1 = null;
                                while (wf.o()) {
                                    int iV7 = wf.v(AbstractC4797uy.c);
                                    if (iV7 == 0) {
                                        strS7 = wf.s();
                                    } else if (iV7 != 1) {
                                        wf.w();
                                        wf.x();
                                    } else {
                                        g4M1 = AbstractC2871Wx.m0(wf, mj, true);
                                    }
                                }
                                wf.n();
                                if (strS7.equals("o")) {
                                    g4 = g4M1;
                                } else if (strS7.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) || strS7.equals("g")) {
                                    mj.o = true;
                                    arrayList2.add(g4M1);
                                }
                            }
                            wf.m();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((G4) arrayList2.get(0));
                            }
                            break;
                        default:
                            wf.w();
                            wf.x();
                            break;
                    }
                }
                c2826Ve = new C4621sy(strS6, i3, f6, f4N1 == null ? new F4(Collections.singletonList(new C5090yG(100)), 2) : f4N1, f4O3, f4O4, g4M0, i4, i5, fQ, arrayList2, g4, zP7);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 5:
                C3692iN c3692iN6 = AbstractC3254dP.f4270a;
                boolean zP8 = false;
                String strS8 = null;
                while (wf.o()) {
                    int iV8 = wf.v(AbstractC3254dP.f4270a);
                    if (iV8 == 0) {
                        strS8 = wf.s();
                    } else if (iV8 == 1) {
                        int iR5 = wf.r();
                        if (iR5 != 1) {
                            if (iR5 == 2) {
                                i = 2;
                            } else if (iR5 == 3) {
                                i = 3;
                            } else if (iR5 == 4) {
                                i = 4;
                            } else if (iR5 == 5) {
                                i = 5;
                            }
                        }
                        i = 1;
                    } else if (iV8 != 2) {
                        wf.w();
                        wf.x();
                    } else {
                        zP8 = wf.p();
                    }
                }
                C3077bP c3077bP = new C3077bP(strS8, i, zP8);
                mj.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                c2826Ve = c3077bP;
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 6:
                C3692iN c3692iN7 = UX.f3823a;
                String strS9 = null;
                O4 o4B2 = null;
                F4 f4O5 = null;
                G4 g4M2 = null;
                boolean zP9 = false;
                while (wf.o()) {
                    int iV9 = wf.v(UX.f3823a);
                    if (iV9 == 0) {
                        strS9 = wf.s();
                    } else if (iV9 == 1) {
                        o4B2 = I4.b(wf, mj);
                    } else if (iV9 == 2) {
                        f4O5 = AbstractC2871Wx.o0(wf, mj);
                    } else if (iV9 == 3) {
                        g4M2 = AbstractC2871Wx.m0(wf, mj, true);
                    } else if (iV9 != 4) {
                        wf.x();
                    } else {
                        zP9 = wf.p();
                    }
                }
                c2826Ve = new TX(strS9, o4B2, f4O5, g4M2, zP9);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 7:
                C3692iN c3692iN8 = AbstractC3746j00.f4529a;
                String strS10 = null;
                G4 g4M3 = null;
                while (wf.o()) {
                    int iV10 = wf.v(AbstractC3746j00.f4529a);
                    if (iV10 == 0) {
                        strS10 = wf.s();
                    } else if (iV10 == 1) {
                        g4M3 = AbstractC2871Wx.m0(wf, mj, true);
                    } else if (iV10 != 2) {
                        wf.x();
                    } else {
                        zP2 = wf.p();
                    }
                }
                c2826Ve = zP2 ? null : new C3572h00(strS10, g4M3);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 8:
                C3692iN c3692iN9 = BY.f2876a;
                String strS11 = null;
                G4 g4M4 = null;
                G4 g4M5 = null;
                M4 m4A = null;
                boolean zP10 = false;
                while (wf.o()) {
                    int iV11 = wf.v(BY.f2876a);
                    if (iV11 == 0) {
                        strS11 = wf.s();
                    } else if (iV11 == 1) {
                        g4M4 = AbstractC2871Wx.m0(wf, mj, false);
                    } else if (iV11 == 2) {
                        g4M5 = AbstractC2871Wx.m0(wf, mj, false);
                    } else if (iV11 == 3) {
                        m4A = N4.a(wf, mj);
                    } else if (iV11 != 4) {
                        wf.x();
                    } else {
                        zP10 = wf.p();
                    }
                }
                c2826Ve = new TX(strS11, g4M4, g4M5, m4A, zP10);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 9:
                C3692iN c3692iN10 = AbstractC3846k60.f4585a;
                F4 f7 = null;
                int iR6 = 0;
                String strS12 = null;
                boolean zP11 = false;
                while (wf.o()) {
                    int iV12 = wf.v(AbstractC3846k60.f4585a);
                    if (iV12 == 0) {
                        strS12 = wf.s();
                    } else if (iV12 == 1) {
                        iR6 = wf.r();
                    } else if (iV12 == 2) {
                        f7 = new F4(BG.a(wf, mj, AbstractC3014ah0.c(), C3143c60.f4204a, false), 5);
                    } else if (iV12 != 3) {
                        wf.x();
                    } else {
                        zP11 = wf.p();
                    }
                }
                c3408f60 = new C3758j60(strS12, iR6, f7, zP11);
                c2826Ve = c3408f60;
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 10:
                C3692iN c3692iN11 = AbstractC4138nV.f4746a;
                boolean z2 = iR == 3;
                String strS13 = null;
                int i6 = 0;
                G4 g4M6 = null;
                O4 o4B3 = null;
                G4 g4M7 = null;
                G4 g4M8 = null;
                G4 g4M9 = null;
                G4 g4M10 = null;
                G4 g4M11 = null;
                boolean zP12 = false;
                while (wf.o()) {
                    switch (wf.v(AbstractC4138nV.f4746a)) {
                        case 0:
                            strS13 = wf.s();
                            break;
                        case 1:
                            int iR7 = wf.r();
                            int[] iArrF = DM.F(2);
                            int length = iArrF.length;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    i6 = 0;
                                }
                                int i8 = iArrF[i7];
                                if (AbstractC3950lJ.f(i8) == iR7) {
                                    i6 = i8;
                                }
                                i7++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            g4M6 = AbstractC2871Wx.m0(wf, mj, false);
                            break;
                        case 3:
                            o4B3 = I4.b(wf, mj);
                            break;
                        case 4:
                            g4M7 = AbstractC2871Wx.m0(wf, mj, false);
                            break;
                        case 5:
                            g4M9 = AbstractC2871Wx.m0(wf, mj, true);
                            break;
                        case 6:
                            g4M11 = AbstractC2871Wx.m0(wf, mj, false);
                            break;
                        case 7:
                            g4M8 = AbstractC2871Wx.m0(wf, mj, true);
                            break;
                        case 8:
                            g4M10 = AbstractC2871Wx.m0(wf, mj, false);
                            break;
                        case 9:
                            zP12 = wf.p();
                            break;
                        case 10:
                            z2 = wf.r() == 3;
                            break;
                        default:
                            wf.w();
                            wf.x();
                            break;
                    }
                }
                c2826Ve = new C4050mV(strS13, i6, g4M6, o4B3, g4M7, g4M8, g4M9, g4M10, g4M11, zP12, z2);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 11:
                C3692iN c3692iN12 = AbstractC4022m60.f4680a;
                ArrayList arrayList3 = new ArrayList();
                F4 f4N2 = null;
                int i9 = 0;
                int i10 = 0;
                String strS14 = null;
                G4 g5 = null;
                F4 f4L1 = null;
                G4 g4M12 = null;
                float fQ2 = 0.0f;
                boolean zP13 = false;
                while (wf.o()) {
                    switch (wf.v(AbstractC4022m60.f4680a)) {
                        case 0:
                            strS14 = wf.s();
                            break;
                        case 1:
                            f4L1 = AbstractC2871Wx.l0(wf, mj);
                            break;
                        case 2:
                            g4M12 = AbstractC2871Wx.m0(wf, mj, true);
                            break;
                        case 3:
                            f4N2 = AbstractC2871Wx.n0(wf, mj);
                            break;
                        case 4:
                            i9 = DM.F(3)[wf.r() - 1];
                            break;
                        case 5:
                            i10 = DM.F(3)[wf.r() - 1];
                            break;
                        case 6:
                            fQ2 = (float) wf.q();
                            break;
                        case 7:
                            zP13 = wf.p();
                            break;
                        case 8:
                            wf.h();
                            while (wf.o()) {
                                wf.k();
                                String strS15 = null;
                                G4 g4M13 = null;
                                while (wf.o()) {
                                    int iV13 = wf.v(AbstractC4022m60.b);
                                    if (iV13 == 0) {
                                        strS15 = wf.s();
                                    } else if (iV13 != 1) {
                                        wf.w();
                                        wf.x();
                                    } else {
                                        g4M13 = AbstractC2871Wx.m0(wf, mj, true);
                                    }
                                }
                                wf.n();
                                strS15.getClass();
                                strS15.hashCode();
                                switch (strS15) {
                                    case "d":
                                    case "g":
                                        mj.o = true;
                                        arrayList3.add(g4M13);
                                        break;
                                    case "o":
                                        g5 = g4M13;
                                        break;
                                }
                            }
                            wf.m();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((G4) arrayList3.get(0));
                            }
                            break;
                        default:
                            wf.x();
                            break;
                    }
                }
                c2826Ve = new C3934l60(strS14, g5, arrayList3, f4L1, f4N2 == null ? new F4(Collections.singletonList(new C5090yG(100)), 2) : f4N2, g4M12, i9 == 0 ? 1 : i9, i10 == 0 ? 1 : i10, fQ2, zP13);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 12:
                C3692iN c3692iN13 = AbstractC4198o60.f4777a;
                String strS16 = null;
                int i11 = 0;
                G4 g4M14 = null;
                G4 g4M15 = null;
                G4 g4M16 = null;
                boolean zP14 = false;
                while (wf.o()) {
                    int iV14 = wf.v(AbstractC4198o60.f4777a);
                    if (iV14 == 0) {
                        g4M14 = AbstractC2871Wx.m0(wf, mj, false);
                    } else if (iV14 == 1) {
                        g4M15 = AbstractC2871Wx.m0(wf, mj, false);
                    } else if (iV14 == 2) {
                        g4M16 = AbstractC2871Wx.m0(wf, mj, false);
                    } else if (iV14 == 3) {
                        strS16 = wf.s();
                    } else if (iV14 == 4) {
                        int iR8 = wf.r();
                        if (iR8 == 1) {
                            i11 = 1;
                        } else {
                            if (iR8 != 2) {
                                throw new IllegalArgumentException(AbstractC3950lJ.p("Unknown trim path type ", iR8));
                            }
                            i11 = 2;
                        }
                    } else if (iV14 != 5) {
                        wf.x();
                    } else {
                        zP14 = wf.p();
                    }
                }
                c2826Ve = new C4110n60(strS16, i11, g4M14, g4M15, g4M16, zP14);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            case 13:
                c2826Ve = N4.a(wf, mj);
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
            default:
                AbstractC5005xJ.b("Unknown shape type ".concat(strS));
                while (wf.o()) {
                    wf.x();
                }
                wf.n();
                return c2826Ve;
        }
    }
}
