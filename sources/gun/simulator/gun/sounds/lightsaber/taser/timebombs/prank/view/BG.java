package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class BG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3692iN f2863a = C3692iN.I(CampaignEx.JSON_KEY_AD_K);

    public static ArrayList a(MF mf, MJ mj, float f, InterfaceC3368eh0 interfaceC3368eh0, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (mf.t() == 6) {
            mj.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        mf.k();
        while (mf.o()) {
            if (mf.v(f2863a) != 0) {
                mf.x();
            } else if (mf.t() == 1) {
                mf.h();
                if (mf.t() == 7) {
                    arrayList.add(AG.b(mf, mj, f, interfaceC3368eh0, false, z));
                } else {
                    while (mf.o()) {
                        arrayList.add(AG.b(mf, mj, f, interfaceC3368eh0, true, z));
                    }
                }
                mf.m();
            } else {
                arrayList.add(AG.b(mf, mj, f, interfaceC3368eh0, false, z));
            }
        }
        mf.n();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C5090yG c5090yG = (C5090yG) arrayList.get(i2);
            i2++;
            C5090yG c5090yG2 = (C5090yG) arrayList.get(i2);
            c5090yG.h = Float.valueOf(c5090yG2.g);
            if (c5090yG.c == null && (obj = c5090yG2.b) != null) {
                c5090yG.c = obj;
                if (c5090yG instanceof VT) {
                    ((VT) c5090yG).d();
                }
            }
        }
        C5090yG c5090yG3 = (C5090yG) arrayList.get(i);
        if ((c5090yG3.b == null || c5090yG3.c == null) && arrayList.size() > 1) {
            arrayList.remove(c5090yG3);
        }
    }
}
