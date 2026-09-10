package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class I4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3692iN f3201a = C3692iN.I(CampaignEx.JSON_KEY_AD_K, "x", "y");

    public static H4 a(WF wf, MJ mj) {
        ArrayList arrayList = new ArrayList();
        if (wf.t() == 1) {
            wf.h();
            while (wf.o()) {
                arrayList.add(new VT(mj, AG.b(wf, mj, AbstractC3014ah0.c(), XT.f3970a, wf.t() == 3, false)));
            }
            wf.m();
            BG.b(arrayList);
        } else {
            arrayList.add(new C5090yG(YF.b(wf, AbstractC3014ah0.c())));
        }
        return new H4(arrayList);
    }

    public static O4 b(WF wf, MJ mj) {
        wf.k();
        H4 h4A = null;
        G4 g4M0 = null;
        G4 g4M1 = null;
        boolean z = false;
        while (wf.t() != 4) {
            int iV = wf.v(f3201a);
            if (iV == 0) {
                h4A = a(wf, mj);
            } else if (iV != 1) {
                if (iV != 2) {
                    wf.w();
                    wf.x();
                } else if (wf.t() == 6) {
                    wf.x();
                    z = true;
                } else {
                    g4M1 = AbstractC2871Wx.m0(wf, mj, true);
                }
            } else if (wf.t() == 6) {
                wf.x();
                z = true;
            } else {
                g4M0 = AbstractC2871Wx.m0(wf, mj, true);
            }
        }
        wf.n();
        if (z) {
            mj.a("Lottie doesn't support expressions.");
        }
        return h4A != null ? h4A : new J4(g4M0, g4M1);
    }
}
