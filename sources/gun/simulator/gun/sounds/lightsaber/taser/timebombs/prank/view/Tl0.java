package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Tl0 implements InterfaceC4495ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3790a;
    public final long[] b;
    public final long[] c;

    public Tl0(ArrayList arrayList) {
        this.f3790a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.b = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            Kl0 kl0 = (Kl0) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = kl0.b;
            jArr[i2 + 1] = kl0.c;
        }
        long[] jArr2 = this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final List getCues(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f3790a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                Kl0 kl0 = (Kl0) list.get(i);
                C2417Fk c2417Fk = kl0.f3325a;
                if (c2417Fk.e == -3.4028235E38f) {
                    arrayList2.add(kl0);
                } else {
                    arrayList.add(c2417Fk);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new P70(5));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            C2391Ek c2391EkA = ((Kl0) arrayList2.get(i3)).f3325a.a();
            c2391EkA.e = (-1) - i3;
            c2391EkA.f = 1;
            arrayList.add(c2391EkA.a());
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final long getEventTime(int i) {
        FW.h(i >= 0);
        long[] jArr = this.c;
        FW.h(i < jArr.length);
        return jArr[i];
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getEventTimeCount() {
        return this.c.length;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4495ra0
    public final int getNextEventTimeIndex(long j) {
        long[] jArr = this.c;
        int iB = Ug0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }
}
