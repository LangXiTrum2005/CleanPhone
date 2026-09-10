package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3503gA extends V20 {
    public final Map H;
    public DrmInitData I;

    public C3503gA(C2833Vl c2833Vl, InterfaceC3296dq interfaceC3296dq, C3031aq c3031aq, Map map) {
        super(c2833Vl, interfaceC3296dq, c3031aq);
        this.H = map;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V20, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4326pd0
    public final void a(long j, int i, int i2, int i3, C4238od0 c4238od0) {
        super.a(j, i, i2, i3, c4238od0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V20
    public final C4619sw m(C4619sw c4619sw) {
        DrmInitData drmInitData;
        DrmInitData drmInitData2 = this.I;
        if (drmInitData2 == null) {
            drmInitData2 = c4619sw.o;
        }
        if (drmInitData2 != null && (drmInitData = (DrmInitData) this.H.get(drmInitData2.schemeType)) != null) {
            drmInitData2 = drmInitData;
        }
        Metadata metadata = c4619sw.j;
        if (metadata == null) {
            metadata = null;
        } else {
            int iF = metadata.f();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= iF) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entryE = metadata.e(i2);
                if ((entryE instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entryE).owner)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (iF == 1) {
                    metadata = null;
                } else {
                    Metadata.Entry[] entryArr = new Metadata.Entry[iF - 1];
                    while (i < iF) {
                        if (i != i2) {
                            entryArr[i < i2 ? i : i - 1] = metadata.e(i);
                        }
                        i++;
                    }
                    metadata = new Metadata(entryArr);
                }
            }
        }
        if (drmInitData2 != c4619sw.o || metadata != c4619sw.j) {
            C4531rw c4531rwA = c4619sw.a();
            c4531rwA.n = drmInitData2;
            c4531rwA.i = metadata;
            c4619sw = c4531rwA.a();
        }
        return super.m(c4619sw);
    }
}
