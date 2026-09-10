package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class V80 extends S80 {
    public final LinkedList e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public P80 m;

    public V80(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.k = -1;
        this.m = null;
        this.e = new LinkedList();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final void a(Object obj) {
        if (obj instanceof Q80) {
            this.e.add((Q80) obj);
        } else if (obj instanceof P80) {
            FW.s(this.m == null);
            this.m = (P80) obj;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final Object b() {
        LinkedList linkedList = this.e;
        int size = linkedList.size();
        Q80[] q80Arr = new Q80[size];
        linkedList.toArray(q80Arr);
        P80 p80 = this.m;
        if (p80 != null) {
            DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(p80.f3541a, MimeTypes.VIDEO_MP4, p80.b));
            for (int i = 0; i < size; i++) {
                Q80 q80 = q80Arr[i];
                int i2 = q80.f3592a;
                if (i2 == 2 || i2 == 1) {
                    int i3 = 0;
                    while (true) {
                        C4619sw[] c4619swArr = q80.j;
                        if (i3 < c4619swArr.length) {
                            C4531rw c4531rwA = c4619swArr[i3].a();
                            c4531rwA.n = drmInitData;
                            c4619swArr[i3] = new C4619sw(c4531rwA);
                            i3++;
                        }
                    }
                }
            }
        }
        int i4 = this.f;
        int i5 = this.g;
        long j = this.h;
        long j2 = this.i;
        long j3 = this.j;
        return new R80(i4, i5, j2 == 0 ? -9223372036854775807L : Ug0.R(j2, 1000000L, j), j3 == 0 ? -9223372036854775807L : Ug0.R(j3, 1000000L, j), this.k, this.l, this.m, q80Arr);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final void j(XmlPullParser xmlPullParser) throws KT {
        this.f = S80.i(xmlPullParser, "MajorVersion");
        this.g = S80.i(xmlPullParser, "MinorVersion");
        this.h = S80.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new Ua0("Duration", 1);
        }
        try {
            this.i = Long.parseLong(attributeValue);
            this.j = S80.h(xmlPullParser, "DVRWindowLength", 0L);
            this.k = S80.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.h), "TimeScale");
        } catch (NumberFormatException e) {
            throw KT.b(null, e);
        }
    }
}
