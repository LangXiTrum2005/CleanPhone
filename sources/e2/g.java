package e2;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import go.k;
import i1.e0;
import i1.l;
import i1.m;
import i1.o;
import i1.p;
import java.math.RoundingMode;
import java.util.LinkedList;
import l1.y;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.unity3d.scar.adapter.common.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedList f39050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f39054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39056k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f39057m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f39056k = -1;
        this.f39057m = null;
        this.f39050e = new LinkedList();
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void d(Object obj) {
        if (obj instanceof b) {
            this.f39050e.add((b) obj);
        } else if (obj instanceof a) {
            k.t(this.f39057m == null);
            this.f39057m = (a) obj;
        }
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final Object e() {
        long jU;
        LinkedList linkedList = this.f39050e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar = this.f39057m;
        if (aVar != null) {
            m mVar = new m(new l(aVar.f39020a, null, MimeTypes.VIDEO_MP4, aVar.f39021b));
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int i11 = bVar.f39023a;
                if (i11 == 2 || i11 == 1) {
                    p[] pVarArr = bVar.f39032j;
                    for (int i12 = 0; i12 < pVarArr.length; i12++) {
                        o oVarA = pVarArr[i12].a();
                        oVarA.f42604q = mVar;
                        pVarArr[i12] = new p(oVarA);
                    }
                }
            }
        }
        int i13 = this.f39051f;
        int i14 = this.f39052g;
        long j10 = this.f39053h;
        long j11 = this.f39054i;
        long j12 = this.f39055j;
        int i15 = this.f39056k;
        boolean z10 = this.l;
        a aVar2 = this.f39057m;
        long jU2 = C.TIME_UNSET;
        if (j11 == 0) {
            jU = -9223372036854775807L;
        } else {
            String str = y.f44830a;
            jU = y.U(j11, 1000000L, j10, RoundingMode.DOWN);
        }
        if (j12 != 0) {
            String str2 = y.f44830a;
            jU2 = y.U(j12, 1000000L, j10, RoundingMode.DOWN);
        }
        return new c(i13, i14, jU, jU2, i15, z10, aVar2, bVarArr);
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void m(XmlPullParser xmlPullParser) throws e0 {
        this.f39051f = com.unity3d.scar.adapter.common.h.l(xmlPullParser, "MajorVersion");
        this.f39052g = com.unity3d.scar.adapter.common.h.l(xmlPullParser, "MinorVersion");
        this.f39053h = com.unity3d.scar.adapter.common.h.k(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new d("Duration", 0);
        }
        try {
            this.f39054i = Long.parseLong(attributeValue);
            this.f39055j = com.unity3d.scar.adapter.common.h.k(xmlPullParser, "DVRWindowLength", 0L);
            this.f39056k = com.unity3d.scar.adapter.common.h.j(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            o(Long.valueOf(this.f39053h), "TimeScale");
        } catch (NumberFormatException e10) {
            throw e0.b(null, e10);
        }
    }
}
