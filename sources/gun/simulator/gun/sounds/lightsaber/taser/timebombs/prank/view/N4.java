package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class N4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3692iN f3438a = C3692iN.I("a", "p", com.umeng.analytics.pro.bc.aH, "rz", "r", "o", "so", "eo", "sk", "sa");
    public static final C3692iN b = C3692iN.I(CampaignEx.JSON_KEY_AD_K);

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197  */
    public static M4 a(WF wf, MJ mj) {
        F4 f4;
        G4 g4;
        G4 g4M0;
        List list;
        G4 g5;
        boolean z = false;
        boolean z2 = wf.t() == 3;
        if (z2) {
            wf.k();
        }
        G4 g6 = null;
        G4 g4M1 = null;
        H4 h4A = null;
        O4 o4B = null;
        F4 f5 = null;
        G4 g4M2 = null;
        F4 f4N0 = null;
        G4 g4M3 = null;
        G4 g4M4 = null;
        while (wf.o()) {
            switch (wf.v(f3438a)) {
                case 0:
                    g4 = g4M1;
                    wf.k();
                    while (wf.o()) {
                        if (wf.v(b) != 0) {
                            wf.w();
                            wf.x();
                        } else {
                            h4A = I4.a(wf, mj);
                        }
                    }
                    wf.n();
                    g4M1 = g4;
                    z = false;
                    break;
                case 1:
                    o4B = I4.b(wf, mj);
                    z = false;
                    break;
                case 2:
                    g4 = g4M1;
                    f5 = new F4(BG.a(wf, mj, 1.0f, C2960a30.f4106a, false), 4);
                    g4M1 = g4;
                    z = false;
                    break;
                case 3:
                    mj.a("Lottie doesn't support 3D layers.");
                    g4M0 = AbstractC2871Wx.m0(wf, mj, z);
                    list = (List) g4M0.b;
                    if (list.isEmpty()) {
                        g5 = g4M0;
                        g4 = g4M1;
                        if (((C5090yG) list.get(0)).b == null) {
                            list.set(0, new C5090yG(mj, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(mj.m)));
                        }
                        g6 = g5;
                        g4M1 = g4;
                        z = false;
                    } else {
                        g5 = g4M0;
                        g4 = g4M1;
                        list.add(new C5090yG(mj, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(mj.m)));
                    }
                    g6 = g5;
                    g4M1 = g4;
                    z = false;
                    break;
                case 4:
                    g4M0 = AbstractC2871Wx.m0(wf, mj, z);
                    list = (List) g4M0.b;
                    if (list.isEmpty()) {
                        g5 = g4M0;
                        g4 = g4M1;
                        if (((C5090yG) list.get(0)).b == null) {
                            list.set(0, new C5090yG(mj, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(mj.m)));
                        }
                        g6 = g5;
                        g4M1 = g4;
                        z = false;
                    } else {
                        g5 = g4M0;
                        g4 = g4M1;
                        list.add(new C5090yG(mj, Float.valueOf(0.0f), Float.valueOf(0.0f), (Interpolator) null, 0.0f, Float.valueOf(mj.m)));
                    }
                    g6 = g5;
                    g4M1 = g4;
                    z = false;
                    break;
                case 5:
                    f4N0 = AbstractC2871Wx.n0(wf, mj);
                    break;
                case 6:
                    g4M3 = AbstractC2871Wx.m0(wf, mj, z);
                    break;
                case 7:
                    g4M4 = AbstractC2871Wx.m0(wf, mj, z);
                    break;
                case 8:
                    g4M2 = AbstractC2871Wx.m0(wf, mj, z);
                    break;
                case 9:
                    g4M1 = AbstractC2871Wx.m0(wf, mj, z);
                    break;
                default:
                    wf.w();
                    wf.x();
                    break;
            }
        }
        G4 g7 = g4M1;
        if (z2) {
            wf.n();
        }
        H4 h4 = (h4A == null || (h4A.g() && ((PointF) ((C5090yG) h4A.f3152a.get(0)).b).equals(0.0f, 0.0f))) ? null : h4A;
        O4 o4 = (o4B == null || (!(o4B instanceof J4) && o4B.g() && ((PointF) ((C5090yG) o4B.f().get(0)).b).equals(0.0f, 0.0f))) ? null : o4B;
        if (g6 == null || (g6.g() && ((Float) ((C5090yG) ((List) g6.b).get(0)).b).floatValue() == 0.0f)) {
            g6 = null;
        }
        if (f5 == null) {
            f4 = null;
        } else {
            if (f5.g()) {
                Z20 z20 = (Z20) ((C5090yG) ((List) f5.b).get(0)).b;
                if (z20.f4054a == 1.0f && z20.b == 1.0f) {
                    f4 = null;
                }
            }
            f4 = f5;
        }
        return new M4(h4, o4, f4, g6, f4N0, g4M3, g4M4, (g4M2 == null || (g4M2.g() && ((Float) ((C5090yG) ((List) g4M2.b).get(0)).b).floatValue() == 0.0f)) ? null : g4M2, (g7 == 0 || (g7.g() && ((Float) ((C5090yG) ((List) g7.b).get(0)).b).floatValue() == 0.0f)) ? null : g7);
    }
}
