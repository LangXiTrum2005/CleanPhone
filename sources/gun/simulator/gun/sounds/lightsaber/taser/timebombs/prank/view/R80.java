package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class R80 implements InterfaceC3564gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3647a;
    public final int b;
    public final int c;
    public final boolean d;
    public final P80 e;
    public final Q80[] f;
    public final long g;
    public final long h;

    public R80(int i, int i2, long j, long j2, int i3, boolean z, P80 p80, Q80[] q80Arr) {
        this.f3647a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = p80;
        this.f = q80Arr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3564gu
    public final Object copy(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Q80 q80 = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            Q80 q81 = this.f[streamKey.groupIndex];
            if (q81 != q80 && q80 != null) {
                arrayList2.add(q80.a((C4619sw[]) arrayList3.toArray(new C4619sw[0])));
                arrayList3.clear();
            }
            arrayList3.add(q81.j[streamKey.streamIndex]);
            i++;
            q80 = q81;
        }
        if (q80 != null) {
            arrayList2.add(q80.a((C4619sw[]) arrayList3.toArray(new C4619sw[0])));
        }
        Q80[] q80Arr = (Q80[]) arrayList2.toArray(new Q80[0]);
        return new R80(this.f3647a, this.b, this.g, this.h, this.c, this.d, this.e, q80Arr);
    }
}
