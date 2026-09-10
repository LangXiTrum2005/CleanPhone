package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3326e90 implements InterfaceC4495ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4310a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C3326e90(int i, Object obj, Object obj2) {
        this.f4310a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final List getCues(long j) {
        C2417Fk c2417Fk;
        int i = this.f4310a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int iD = Ug0.d((List) obj2, Long.valueOf(j), false);
                return iD == -1 ? Collections.emptyList() : (List) ((List) obj).get(iD);
            default:
                int iF = Ug0.f((long[]) obj2, j, false);
                return (iF == -1 || (c2417Fk = ((C2417Fk[]) obj)[iF]) == C2417Fk.r) ? Collections.emptyList() : Collections.singletonList(c2417Fk);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final long getEventTime(int i) {
        int i2 = this.f4310a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                FW.h(i >= 0);
                List list = (List) obj;
                FW.h(i < list.size());
                return ((Long) list.get(i)).longValue();
            default:
                FW.h(i >= 0);
                long[] jArr = (long[]) obj;
                FW.h(i < jArr.length);
                return jArr[i];
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getEventTimeCount() {
        int i = this.f4310a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((List) obj).size();
            default:
                return ((long[]) obj).length;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getNextEventTimeIndex(long j) {
        int i;
        int i2 = this.f4310a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                List list = (List) obj;
                Long lValueOf = Long.valueOf(j);
                int i3 = Ug0.f3833a;
                int iBinarySearch = Collections.binarySearch(list, lValueOf);
                if (iBinarySearch < 0) {
                    i = ~iBinarySearch;
                } else {
                    int size = list.size();
                    do {
                        iBinarySearch++;
                        if (iBinarySearch < size) {
                        }
                        i = iBinarySearch;
                    } while (((Comparable) list.get(iBinarySearch)).compareTo(lValueOf) == 0);
                    i = iBinarySearch;
                }
                if (i < list.size()) {
                    return i;
                }
                return -1;
            default:
                long[] jArr = (long[]) obj;
                int iB = Ug0.b(jArr, j, false);
                if (iB < jArr.length) {
                    return iB;
                }
                return -1;
        }
    }
}
