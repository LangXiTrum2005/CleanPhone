package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class W80 extends S80 {
    public final String e;
    public final LinkedList f;
    public int g;
    public String h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public ArrayList q;
    public long r;

    public W80(S80 s80, String str) {
        super(s80, str, "StreamIndex");
        this.e = str;
        this.f = new LinkedList();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final void a(Object obj) {
        if (obj instanceof C4619sw) {
            this.f.add((C4619sw) obj);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final Object b() {
        int i;
        LinkedList linkedList = this.f;
        C4619sw[] c4619swArr = new C4619sw[linkedList.size()];
        linkedList.toArray(c4619swArr);
        String str = this.k;
        int i2 = this.g;
        String str2 = this.h;
        long j = this.i;
        String str3 = this.j;
        int i3 = this.l;
        int i4 = this.m;
        int i5 = this.n;
        int i6 = this.o;
        String str4 = this.p;
        ArrayList arrayList = this.q;
        long j2 = this.r;
        int i7 = Ug0.f3833a;
        int size = arrayList.size();
        long[] jArr = new long[size];
        if (j < 1000000 || j % 1000000 != 0) {
            i = i5;
            if (j >= 1000000 || 1000000 % j != 0) {
                double d = 1000000 / j;
                int i8 = 0;
                while (i8 < size) {
                    jArr[i8] = (long) (((Long) arrayList.get(i8)).longValue() * d);
                    i8++;
                    arrayList = arrayList;
                }
            } else {
                long j3 = 1000000 / j;
                for (int i9 = 0; i9 < size; i9++) {
                    jArr[i9] = ((Long) arrayList.get(i9)).longValue() * j3;
                }
            }
            return new Q80(this.e, str, i2, str2, j, str3, i3, i4, i, i6, str4, c4619swArr, arrayList, jArr, Ug0.R(j2, 1000000L, j));
        }
        long j4 = j / 1000000;
        i = i5;
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue() / j4;
        }
        return new Q80(this.e, str, i2, str2, j, str3, i3, i4, i, i6, str4, c4619swArr, arrayList, jArr, Ug0.R(j2, 1000000L, j));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final boolean d(String str) {
        return com.umeng.analytics.pro.bc.aL.equals(str);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S80
    public final void j(XmlPullParser xmlPullParser) throws KT {
        int i;
        int i2 = 1;
        if (!com.umeng.analytics.pro.bc.aL.equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new Ua0("Type", 1);
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                i = 1;
            } else if ("video".equalsIgnoreCase(attributeValue)) {
                i = 2;
            } else {
                if (!MimeTypes.BASE_TYPE_TEXT.equalsIgnoreCase(attributeValue)) {
                    throw KT.b("Invalid key value[" + attributeValue + "]", null);
                }
                i = 3;
            }
            this.g = i;
            l(Integer.valueOf(i), "Type");
            if (this.g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new Ua0("Subtype", 1);
                }
                this.h = attributeValue2;
            } else {
                this.h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new Ua0("Url", 1);
            }
            this.k = attributeValue4;
            this.l = S80.g(xmlPullParser, "MaxWidth");
            this.m = S80.g(xmlPullParser, "MaxHeight");
            this.n = S80.g(xmlPullParser, "DisplayWidth");
            this.o = S80.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue5;
            l(attributeValue5, "Language");
            long jG = S80.g(xmlPullParser, "TimeScale");
            this.i = jG;
            if (jG == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList();
            return;
        }
        int size = this.q.size();
        long jH = S80.h(xmlPullParser, com.umeng.analytics.pro.bc.aO, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        if (jH == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            if (size == 0) {
                jH = 0;
            } else {
                if (this.r == -1) {
                    throw KT.b("Unable to infer start time", null);
                }
                jH = this.r + ((Long) this.q.get(size - 1)).longValue();
            }
        }
        this.q.add(Long.valueOf(jH));
        this.r = S80.h(xmlPullParser, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        long jH2 = S80.h(xmlPullParser, "r", 1L);
        if (jH2 > 1 && this.r == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            throw KT.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j = i2;
            if (j >= jH2) {
                return;
            }
            this.q.add(Long.valueOf((this.r * j) + jH));
            i2++;
        }
    }
}
