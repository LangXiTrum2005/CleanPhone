package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2676Pk implements InterfaceC3564gu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3569a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final Ig0 i;
    public final C3076bO j;
    public final Uri k;
    public final ZV l;
    public final List m;

    public C2676Pk(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ZV zv, Ig0 ig0, C3076bO c3076bO, Uri uri, ArrayList arrayList) {
        this.f3569a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = zv;
        this.i = ig0;
        this.k = uri;
        this.j = c3076bO;
        this.m = arrayList;
    }

    public final C3259dU a(int i) {
        return (C3259dU) this.m.get(i);
    }

    public final long b(int i) {
        List list = this.m;
        if (i != list.size() - 1) {
            return ((C3259dU) list.get(i + 1)).b - ((C3259dU) list.get(i)).b;
        }
        long j = this.b;
        return j == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET : j - ((C3259dU) list.get(i)).b;
    }

    public final long c(int i) {
        return Ug0.L(b(i));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3564gu
    public final Object copy(List list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            int size = this.m.size();
            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            if (i >= size) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i) {
                long jB = b(i);
                if (jB != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    j2 += jB;
                }
            } else {
                C3259dU c3259dUA = a(i);
                List list2 = c3259dUA.c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.periodIndex;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.groupIndex;
                    X2 x2 = (X2) list2.get(i3);
                    List list3 = x2.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((FY) list3.get(streamKey.streamIndex));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.periodIndex != i2) {
                            break;
                        }
                    } while (streamKey.groupIndex == i3);
                    List list4 = list2;
                    arrayList2.add(new X2(x2.f3953a, x2.b, arrayList3, x2.d, x2.e, x2.f));
                    if (streamKey.periodIndex != i2) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new C3259dU(c3259dUA.f4271a, c3259dUA.b - j2, arrayList2, c3259dUA.d));
            }
            i++;
        }
        long j3 = this.b;
        if (j3 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            j = j3 - j2;
        }
        return new C2676Pk(this.f3569a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }
}
