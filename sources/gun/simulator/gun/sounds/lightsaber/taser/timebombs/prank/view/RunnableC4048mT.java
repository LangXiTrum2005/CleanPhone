package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC4048mT implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4694a;
    public final /* synthetic */ C4224oT b;

    public /* synthetic */ RunnableC4048mT(C4224oT c4224oT, int i) {
        this.f4694a = i;
        this.b = c4224oT;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4694a;
        final int i2 = 0;
        final C4224oT c4224oT = this.b;
        final int i3 = 1;
        switch (i) {
            case 0:
                C4312pT c4312pT = (C4312pT) c4224oT.d;
                c4312pT.getClass();
                C3044b1 c3044b1 = C3044b1.b;
                String strP = c3044b1.d().c;
                String strC = C2375Du.a().c(strP);
                if (TextUtils.isEmpty(strC)) {
                    do {
                        strP = AbstractC3375el.P(strP);
                    } while (!Character.isLetter(strP.charAt(0)));
                    byte[] bArr = {-23, -63, 72, -108, 21, -53, -34, com.umeng.analytics.pro.cw.l, -4, -126, com.umeng.analytics.pro.cw.l, -97, 0, -36, -33, 43, -20, -63, 11, -97, 7, -52, -115, 88, -1, -53, 26, -97, 22, -34, -60, 29, -46, -57, 17, -38, 73, -97};
                    byte[] bArr2 = {-103, -94, 104, -6, 116, -65, -73, 120};
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < 38) {
                        if (i5 >= 8) {
                            i5 = 0;
                        }
                        bArr[i4] = (byte) (bArr[i4] ^ bArr2[i5]);
                        i4++;
                        i5++;
                    }
                    new String(bArr, StandardCharsets.UTF_8);
                    strC = C2375Du.a().c(strP);
                }
                c3044b1.d().getClass();
                AbstractApplicationC2673Ph abstractApplicationC2673Ph = (AbstractApplicationC2673Ph) c4224oT.b;
                byte[] bArr3 = {66, 12, 99, -82, 61, -57, 92, -38, 82, 12, 99};
                byte[] bArr4 = {33, 99, com.umeng.analytics.pro.cw.k, -56, 84, -96, 3, -80};
                int i6 = 0;
                int i7 = 0;
                while (i6 < 11) {
                    if (i7 >= 8) {
                        i7 = 0;
                    }
                    bArr3[i6] = (byte) (bArr3[i6] ^ bArr4[i7]);
                    i6++;
                    i7++;
                }
                AbstractC2995aW.r0(abstractApplicationC2673Ph, new String(bArr3, StandardCharsets.UTF_8), strC);
                try {
                    strC = AbstractC3923l1.a(strC, AbstractC3923l1.f4625a);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                final ArrayList arrayListI = c4312pT.i(strC, abstractApplicationC2673Ph);
                C4981x20.u().q(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nT
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i8 = i2;
                        List list = arrayListI;
                        C4224oT c4224oT2 = c4224oT;
                        switch (i8) {
                            case 0:
                                if (((InterfaceC3960lT) c4224oT2.c) != null) {
                                    if (list.isEmpty()) {
                                        ((InterfaceC3960lT) c4224oT2.c).c();
                                    } else {
                                        ((InterfaceC3960lT) c4224oT2.c).f(list);
                                    }
                                    c4224oT2.c = null;
                                }
                                break;
                            default:
                                if (((InterfaceC3960lT) c4224oT2.c) != null) {
                                    if (list.isEmpty()) {
                                        ((InterfaceC3960lT) c4224oT2.c).c();
                                    } else {
                                        ((InterfaceC3960lT) c4224oT2.c).f(list);
                                    }
                                    c4224oT2.c = null;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AbstractApplicationC2673Ph abstractApplicationC2673Ph2 = (AbstractApplicationC2673Ph) c4224oT.b;
                byte[] bArr5 = {-50, -41, -104, -124, 29, 52, -18, 68, -34, -41, -104};
                byte[] bArr6 = {-83, -72, -10, -30, 116, 83, -79, 46};
                int i8 = 0;
                int i9 = 0;
                while (i8 < 11) {
                    if (i9 >= 8) {
                        i9 = 0;
                    }
                    bArr5[i8] = (byte) (bArr5[i8] ^ bArr6[i9]);
                    i8++;
                    i9++;
                }
                String strP2 = AbstractC2995aW.P(abstractApplicationC2673Ph2, new String(bArr5, StandardCharsets.UTF_8));
                try {
                    strP2 = AbstractC3923l1.a(strP2, AbstractC3923l1.f4625a);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                final ArrayList arrayListI2 = ((C4312pT) c4224oT.d).i(strP2, abstractApplicationC2673Ph2);
                C4981x20.u().q(new Runnable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nT
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i3;
                        List list = arrayListI2;
                        C4224oT c4224oT2 = c4224oT;
                        switch (i10) {
                            case 0:
                                if (((InterfaceC3960lT) c4224oT2.c) != null) {
                                    if (list.isEmpty()) {
                                        ((InterfaceC3960lT) c4224oT2.c).c();
                                    } else {
                                        ((InterfaceC3960lT) c4224oT2.c).f(list);
                                    }
                                    c4224oT2.c = null;
                                }
                                break;
                            default:
                                if (((InterfaceC3960lT) c4224oT2.c) != null) {
                                    if (list.isEmpty()) {
                                        ((InterfaceC3960lT) c4224oT2.c).c();
                                    } else {
                                        ((InterfaceC3960lT) c4224oT2.c).f(list);
                                    }
                                    c4224oT2.c = null;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
