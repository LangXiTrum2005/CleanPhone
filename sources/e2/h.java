package e2;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.e0;
import i1.p;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import l1.y;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.unity3d.scar.adapter.common.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f39058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedList f39059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f39061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f39062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f39063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f39064k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f39068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f39069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f39070r;

    public h(com.unity3d.scar.adapter.common.h hVar, String str) {
        super(hVar, str, "StreamIndex");
        this.f39058e = str;
        this.f39059f = new LinkedList();
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void d(Object obj) {
        if (obj instanceof p) {
            this.f39059f.add((p) obj);
        }
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final Object e() {
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        long[] jArr;
        long j12;
        String str;
        long j13;
        int i13;
        int i14;
        ArrayList arrayList;
        LinkedList linkedList = this.f39059f;
        p[] pVarArr = new p[linkedList.size()];
        linkedList.toArray(pVarArr);
        String str2 = this.f39064k;
        int i15 = this.f39060g;
        String str3 = this.f39061h;
        long j14 = this.f39062i;
        String str4 = this.f39063j;
        int i16 = this.l;
        int i17 = this.f39065m;
        int i18 = this.f39066n;
        int i19 = this.f39067o;
        String str5 = this.f39068p;
        ArrayList arrayList2 = this.f39069q;
        long j15 = this.f39070r;
        String str6 = y.f44830a;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int size = arrayList2.size();
        long[] jArr2 = new long[size];
        if (j14 < 1000000 || j14 % 1000000 != 0) {
            i10 = i15;
            long j16 = j14;
            String str7 = str2;
            if (j14 >= 1000000 || 1000000 % j16 != 0) {
                int i20 = 0;
                while (i20 < size) {
                    long jLongValue = ((Long) arrayList2.get(i20)).longValue();
                    if (jLongValue == 0) {
                        j11 = j16;
                        i12 = i20;
                        str = str7;
                        jArr = jArr2;
                        j12 = 1000000;
                    } else {
                        if (j16 < jLongValue || j16 % jLongValue != 0) {
                            i11 = i20;
                            j10 = 1000000;
                            if (j16 >= jLongValue || jLongValue % j16 != 0) {
                                j11 = j16;
                                i12 = i11;
                                String str8 = str7;
                                jArr = jArr2;
                                j12 = 1000000;
                                str = str8;
                                jArr[i12] = y.V(jLongValue, 1000000L, j11, roundingMode);
                            } else {
                                jArr2[i11] = com.bumptech.glide.c.E(1000000L, com.bumptech.glide.c.j(jLongValue, j16, RoundingMode.UNNECESSARY));
                            }
                        } else {
                            i11 = i20;
                            j10 = 1000000;
                            jArr2[i11] = com.bumptech.glide.c.j(1000000L, com.bumptech.glide.c.j(j16, jLongValue, RoundingMode.UNNECESSARY), roundingMode);
                        }
                        j11 = j16;
                        i12 = i11;
                        String str9 = str7;
                        jArr = jArr2;
                        j12 = j10;
                        str = str9;
                    }
                    i18 = i18;
                    i19 = i19;
                    arrayList2 = arrayList2;
                    jArr2 = jArr;
                    str7 = str;
                    i20 = i12 + 1;
                    size = size;
                    j16 = j11;
                }
            } else {
                long j17 = com.bumptech.glide.c.j(1000000L, j16, RoundingMode.UNNECESSARY);
                int i21 = 0;
                while (i21 < size) {
                    int i22 = i21;
                    jArr2[i22] = com.bumptech.glide.c.E(((Long) arrayList2.get(i21)).longValue(), j17);
                    i21 = i22 + 1;
                }
            }
            j13 = j16;
            i13 = i18;
            i14 = i19;
            arrayList = arrayList2;
            str2 = str7;
        } else {
            long j18 = com.bumptech.glide.c.j(j14, 1000000L, RoundingMode.UNNECESSARY);
            int i23 = 0;
            while (i23 < size) {
                jArr2[i23] = com.bumptech.glide.c.j(((Long) arrayList2.get(i23)).longValue(), j18, roundingMode);
                i23++;
                str2 = str2;
                i15 = i15;
            }
            i10 = i15;
            j13 = j14;
            i13 = i18;
            i14 = i19;
            arrayList = arrayList2;
        }
        return new b(this.f39058e, str2, i10, str3, j13, str4, i16, i17, i13, i14, str5, pVarArr, arrayList, jArr2, y.U(j15, 1000000L, j13, RoundingMode.DOWN));
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final boolean g(String str) {
        return "c".equals(str);
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final void m(XmlPullParser xmlPullParser) throws e0 {
        int i10 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new d("Type", 0);
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i10 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw e0.b("Invalid key value[" + attributeValue + X3.j.f27836e, null);
                    }
                    i10 = 3;
                }
            }
            this.f39060g = i10;
            o(Integer.valueOf(i10), "Type");
            if (this.f39060g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new d("Subtype", 0);
                }
                this.f39061h = attributeValue2;
            } else {
                this.f39061h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            o(this.f39061h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f39063j = attributeValue3;
            o(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new d("Url", 0);
            }
            this.f39064k = attributeValue4;
            this.l = com.unity3d.scar.adapter.common.h.j(xmlPullParser, "MaxWidth");
            this.f39065m = com.unity3d.scar.adapter.common.h.j(xmlPullParser, "MaxHeight");
            this.f39066n = com.unity3d.scar.adapter.common.h.j(xmlPullParser, "DisplayWidth");
            this.f39067o = com.unity3d.scar.adapter.common.h.j(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f39068p = attributeValue5;
            o(attributeValue5, "Language");
            long j10 = com.unity3d.scar.adapter.common.h.j(xmlPullParser, "TimeScale");
            this.f39062i = j10;
            if (j10 == -1) {
                this.f39062i = ((Long) f("TimeScale")).longValue();
            }
            this.f39069q = new ArrayList();
            return;
        }
        int size = this.f39069q.size();
        long jK = com.unity3d.scar.adapter.common.h.k(xmlPullParser, "t", C.TIME_UNSET);
        if (jK == C.TIME_UNSET) {
            if (size == 0) {
                jK = 0;
            } else {
                if (this.f39070r == -1) {
                    throw e0.b("Unable to infer start time", null);
                }
                jK = this.f39070r + ((Long) this.f39069q.get(size - 1)).longValue();
            }
        }
        this.f39069q.add(Long.valueOf(jK));
        this.f39070r = com.unity3d.scar.adapter.common.h.k(xmlPullParser, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, C.TIME_UNSET);
        long jK2 = com.unity3d.scar.adapter.common.h.k(xmlPullParser, "r", 1L);
        if (jK2 > 1 && this.f39070r == C.TIME_UNSET) {
            throw e0.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j11 = i10;
            if (j11 >= jK2) {
                return;
            }
            this.f39069q.add(Long.valueOf((this.f39070r * j11) + jK));
            i10++;
        }
    }
}
