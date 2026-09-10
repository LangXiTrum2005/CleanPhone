package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class SJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3692iN f3712a = C3692iN.I("w", com.umeng.analytics.pro.bc.aM, "ip", "op", "fr", com.umeng.analytics.pro.bc.aK, "layers", "assets", "fonts", "chars", "markers");
    public static final C3692iN b = C3692iN.I("id", "layers", "w", com.umeng.analytics.pro.bc.aM, "p", com.umeng.analytics.pro.bc.aN);
    public static final C3692iN c = C3692iN.I("list");
    public static final C3692iN d = C3692iN.I("cm", "tm", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE);

    public static MJ a(WF wf) {
        ArrayList arrayList;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float fC = AbstractC3014ah0.c();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        MJ mj = new MJ();
        wf.k();
        float fQ = 0.0f;
        int iR = 0;
        int iR2 = 0;
        float fQ2 = 0.0f;
        float fQ3 = 0.0f;
        while (wf.o()) {
            float f3 = fQ;
            switch (wf.v(f3712a)) {
                case 0:
                    iR = wf.r();
                    fQ = f3;
                    break;
                case 1:
                    iR2 = wf.r();
                    fQ = f3;
                    break;
                case 2:
                    fQ2 = (float) wf.q();
                    fQ = f3;
                    break;
                case 3:
                    fQ3 = ((float) wf.q()) - 0.01f;
                    fQ = f3;
                    arrayList3 = arrayList3;
                    break;
                case 4:
                    fQ = (float) wf.q();
                    break;
                case 5:
                    arrayList = arrayList3;
                    i = iR;
                    i2 = iR2;
                    f = fQ2;
                    f2 = fQ3;
                    String[] strArrSplit = wf.s().split("\\.");
                    int i5 = Integer.parseInt(strArrSplit[0]);
                    int i6 = Integer.parseInt(strArrSplit[1]);
                    int i7 = Integer.parseInt(strArrSplit[2]);
                    if (i5 < 4 || (i5 <= 4 && (i6 < 4 || (i6 <= 4 && i7 < 0)))) {
                        mj.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fQ = f3;
                    iR = i;
                    fQ2 = f;
                    arrayList3 = arrayList;
                    fQ3 = f2;
                    iR2 = i2;
                    break;
                case 6:
                    arrayList = arrayList3;
                    i = iR;
                    i2 = iR2;
                    f = fQ2;
                    f2 = fQ3;
                    wf.h();
                    int i8 = 0;
                    while (wf.o()) {
                        ZG zgA = AbstractC2980aH.a(wf, mj);
                        if (zgA.e == 3) {
                            i8++;
                        }
                        arrayList2.add(zgA);
                        longSparseArray.put(zgA.d, zgA);
                        if (i8 > 4) {
                            AbstractC5005xJ.b("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    wf.m();
                    fQ = f3;
                    iR = i;
                    fQ2 = f;
                    arrayList3 = arrayList;
                    fQ3 = f2;
                    iR2 = i2;
                    break;
                case 7:
                    arrayList = arrayList3;
                    f = fQ2;
                    f2 = fQ3;
                    wf.h();
                    while (wf.o()) {
                        ArrayList arrayList4 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        wf.k();
                        String strS = null;
                        String strS2 = null;
                        String strS3 = null;
                        int iR3 = 0;
                        int iR4 = 0;
                        while (wf.o()) {
                            int iV = wf.v(b);
                            if (iV != 0) {
                                if (iV == 1) {
                                    wf.h();
                                    while (wf.o()) {
                                        ZG zgA2 = AbstractC2980aH.a(wf, mj);
                                        longSparseArray2.put(zgA2.d, zgA2);
                                        arrayList4.add(zgA2);
                                        iR = iR;
                                        iR2 = iR2;
                                    }
                                    i3 = iR;
                                    i4 = iR2;
                                    wf.m();
                                } else if (iV == 2) {
                                    iR3 = wf.r();
                                } else if (iV == 3) {
                                    iR4 = wf.r();
                                } else if (iV == 4) {
                                    strS2 = wf.s();
                                } else if (iV != 5) {
                                    wf.w();
                                    wf.x();
                                    i3 = iR;
                                    i4 = iR2;
                                } else {
                                    strS3 = wf.s();
                                }
                                iR = i3;
                                iR2 = i4;
                            } else {
                                strS = wf.s();
                            }
                        }
                        int i9 = iR;
                        int i10 = iR2;
                        wf.n();
                        if (strS2 != null) {
                            map2.put(strS, new C3425fK(iR3, iR4, strS, strS2, strS3));
                        } else {
                            map.put(strS, arrayList4);
                        }
                        iR = i9;
                        iR2 = i10;
                    }
                    i = iR;
                    i2 = iR2;
                    wf.m();
                    fQ = f3;
                    iR = i;
                    fQ2 = f;
                    arrayList3 = arrayList;
                    fQ3 = f2;
                    iR2 = i2;
                    break;
                case 8:
                    f = fQ2;
                    f2 = fQ3;
                    wf.k();
                    while (wf.o()) {
                        if (wf.v(c) != 0) {
                            wf.w();
                            wf.x();
                        } else {
                            wf.h();
                            while (wf.o()) {
                                C3692iN c3692iN = AbstractC4356pw.f4858a;
                                wf.k();
                                String strS4 = null;
                                String strS5 = null;
                                String strS6 = null;
                                while (wf.o()) {
                                    int iV2 = wf.v(AbstractC4356pw.f4858a);
                                    if (iV2 != 0) {
                                        ArrayList arrayList5 = arrayList3;
                                        if (iV2 == 1) {
                                            strS5 = wf.s();
                                        } else if (iV2 == 2) {
                                            strS6 = wf.s();
                                        } else if (iV2 != 3) {
                                            wf.w();
                                            wf.x();
                                        } else {
                                            wf.q();
                                        }
                                        arrayList3 = arrayList5;
                                    } else {
                                        strS4 = wf.s();
                                    }
                                }
                                wf.n();
                                map3.put(strS5, new C3916kw(strS4, strS5, strS6));
                                arrayList3 = arrayList3;
                            }
                            wf.m();
                        }
                    }
                    arrayList = arrayList3;
                    wf.n();
                    i = iR;
                    i2 = iR2;
                    fQ = f3;
                    iR = i;
                    fQ2 = f;
                    arrayList3 = arrayList;
                    fQ3 = f2;
                    iR2 = i2;
                    break;
                case 9:
                    f = fQ2;
                    f2 = fQ3;
                    wf.h();
                    while (wf.o()) {
                        C3692iN c3692iN2 = AbstractC4268ow.f4814a;
                        ArrayList arrayList6 = new ArrayList();
                        wf.k();
                        double dQ = 0.0d;
                        String strS7 = null;
                        String strS8 = null;
                        char cCharAt = 0;
                        while (wf.o()) {
                            int iV3 = wf.v(AbstractC4268ow.f4814a);
                            if (iV3 == 0) {
                                cCharAt = wf.s().charAt(0);
                            } else if (iV3 == 1) {
                                wf.q();
                            } else if (iV3 == 2) {
                                dQ = wf.q();
                            } else if (iV3 == 3) {
                                strS7 = wf.s();
                            } else if (iV3 == 4) {
                                strS8 = wf.s();
                            } else if (iV3 != 5) {
                                wf.w();
                                wf.x();
                            } else {
                                wf.k();
                                while (wf.o()) {
                                    if (wf.v(AbstractC4268ow.b) != 0) {
                                        wf.w();
                                        wf.x();
                                    } else {
                                        wf.h();
                                        while (wf.o()) {
                                            arrayList6.add((C3408f60) AbstractC2753Sj.a(wf, mj));
                                        }
                                        wf.m();
                                    }
                                }
                                wf.n();
                            }
                        }
                        wf.n();
                        C4180nw c4180nw = new C4180nw(arrayList6, cCharAt, dQ, strS7, strS8);
                        sparseArrayCompat.put(c4180nw.hashCode(), c4180nw);
                    }
                    wf.m();
                    arrayList = arrayList3;
                    i = iR;
                    i2 = iR2;
                    fQ = f3;
                    iR = i;
                    fQ2 = f;
                    arrayList3 = arrayList;
                    fQ3 = f2;
                    iR2 = i2;
                    break;
                case 10:
                    wf.h();
                    while (wf.o()) {
                        wf.k();
                        String strS9 = null;
                        float fQ4 = 0.0f;
                        float fQ5 = 0.0f;
                        while (wf.o()) {
                            int iV4 = wf.v(d);
                            if (iV4 != 0) {
                                float f4 = fQ3;
                                if (iV4 == 1) {
                                    fQ4 = (float) wf.q();
                                } else if (iV4 != 2) {
                                    wf.w();
                                    wf.x();
                                    fQ3 = f4;
                                } else {
                                    fQ5 = (float) wf.q();
                                }
                                fQ3 = f4;
                                fQ2 = fQ2;
                            } else {
                                strS9 = wf.s();
                            }
                        }
                        wf.n();
                        arrayList3.add(new C4393qM(strS9, fQ4, fQ5));
                        fQ2 = fQ2;
                        fQ3 = fQ3;
                    }
                    f = fQ2;
                    f2 = fQ3;
                    wf.m();
                    arrayList = arrayList3;
                    i = iR;
                    i2 = iR2;
                    fQ = f3;
                    iR = i;
                    fQ2 = f;
                    arrayList3 = arrayList;
                    fQ3 = f2;
                    iR2 = i2;
                    break;
                default:
                    wf.w();
                    wf.x();
                    arrayList = arrayList3;
                    i = iR;
                    i2 = iR2;
                    f = fQ2;
                    f2 = fQ3;
                    fQ = f3;
                    iR = i;
                    fQ2 = f;
                    arrayList3 = arrayList;
                    fQ3 = f2;
                    iR2 = i2;
                    break;
            }
        }
        ArrayList arrayList7 = arrayList3;
        Rect rect = new Rect(0, 0, (int) (iR * fC), (int) (iR2 * fC));
        float fC2 = AbstractC3014ah0.c();
        mj.k = rect;
        mj.l = fQ2;
        mj.m = fQ3;
        mj.n = fQ;
        mj.j = arrayList2;
        mj.i = longSparseArray;
        mj.c = map;
        mj.d = map2;
        mj.e = fC2;
        mj.h = sparseArrayCompat;
        mj.f = map3;
        mj.g = arrayList7;
        return mj;
    }
}
