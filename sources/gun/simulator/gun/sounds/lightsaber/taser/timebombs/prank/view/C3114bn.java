package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3114bn implements InterfaceC4441qt {
    public static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final C4568sM c = new C4568sM(new C2953a0(19));
    public static final C4568sM d = new C4568sM(new C2953a0(20));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3965lY f4189a;

    public C3114bn() {
        C5086yC c5086yC = AC.b;
        this.f4189a = C3965lY.e;
    }

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new C3042b0());
                break;
            case 1:
                arrayList.add(new C3307e0());
                break;
            case 2:
                arrayList.add(new J3());
                break;
            case 3:
                arrayList.add(new R3());
                break;
            case 4:
                InterfaceC4177nt interfaceC4177ntM = c.m(0);
                if (interfaceC4177ntM == null) {
                    arrayList.add(new C2842Vu());
                } else {
                    arrayList.add(interfaceC4177ntM);
                }
                break;
            case 5:
                arrayList.add(new C3828jw());
                break;
            case 6:
                arrayList.add(new PM(0));
                break;
            case 7:
                arrayList.add(new NP());
                break;
            case 8:
                arrayList.add(new C2455Gw());
                arrayList.add(new PP());
                break;
            case 9:
                arrayList.add(new C3783jS());
                break;
            case 10:
                arrayList.add(new EW());
                break;
            case 11:
                arrayList.add(new C4240oe0(1, new Mc0(0L), new C4237od(0, this.f4189a)));
                break;
            case 12:
                arrayList.add(new Gj0());
                break;
            case 14:
                arrayList.add(new TE());
                break;
            case 15:
                InterfaceC4177nt interfaceC4177ntM2 = d.m(new Object[0]);
                if (interfaceC4177ntM2 != null) {
                    arrayList.add(interfaceC4177ntM2);
                }
                break;
            case 16:
                arrayList.add(new C4728u8());
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4441qt
    public final synchronized InterfaceC4177nt[] d(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = b;
            arrayList = new ArrayList(16);
            List list = (List) map.get("Content-Type");
            int iJ = FW.J((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iJ != -1) {
                a(iJ, arrayList);
            }
            int iK = FW.K(uri);
            if (iK != -1 && iK != iJ) {
                a(iK, arrayList);
            }
            for (int i = 0; i < 16; i++) {
                int i2 = iArr[i];
                if (i2 != iJ && i2 != iK) {
                    a(i2, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4177nt[]) arrayList.toArray(new InterfaceC4177nt[arrayList.size()]);
    }
}
