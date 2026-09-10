package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.ironsource.C0265ba;
import com.ironsource.C0375hc;
import com.ironsource.Hb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c[] f36413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f36414b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f36415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f36416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f36418d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c[] f36419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f36420f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f36421g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f36422h;

        public a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f36418d;
            int i11 = this.f36422h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f36419e, (Object) null);
            this.f36420f = this.f36419e.length - 1;
            this.f36421g = 0;
            this.f36422h = 0;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f36413a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f36415a.add(d.f36413a[i10]);
                return;
            }
            int iA = a(i10 - d.f36413a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f36419e;
                if (iA < cVarArr.length) {
                    this.f36415a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10) throws IOException {
            this.f36415a.add(new c(c(i10), e()));
        }

        private void h() throws IOException {
            this.f36415a.add(new c(d.a(e()), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f36415a);
            this.f36415a.clear();
            return arrayList;
        }

        public void f() throws IOException {
            while (!this.f36416b.f()) {
                byte b10 = this.f36416b.readByte();
                int i10 = b10 & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & 128) == 128) {
                    e(a(i10, 127) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((b10 & 64) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f36418d = iA;
                    if (iA < 0 || iA > this.f36417c) {
                        throw new IOException("Invalid dynamic table size update " + this.f36418d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }

        public a(int i10, int i11, s sVar) {
            this.f36415a = new ArrayList();
            this.f36419e = new c[8];
            this.f36420f = 7;
            this.f36421g = 0;
            this.f36422h = 0;
            this.f36417c = i10;
            this.f36418d = i11;
            this.f36416b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() throws IOException {
            return this.f36416b.readByte() & 255;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f36413a[i10].f36410a;
            }
            int iA = a(i10 - d.f36413a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f36419e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f36410a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private int a(int i10) {
            return this.f36420f + 1 + i10;
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i10, c cVar) {
            this.f36415a.add(cVar);
            int i11 = cVar.f36412c;
            if (i10 != -1) {
                i11 -= this.f36419e[a(i10)].f36412c;
            }
            int i12 = this.f36418d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f36422h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f36421g + 1;
                c[] cVarArr = this.f36419e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f36420f = this.f36419e.length - 1;
                    this.f36419e = cVarArr2;
                }
                int i14 = this.f36420f;
                this.f36420f = i14 - 1;
                this.f36419e[i14] = cVar;
                this.f36421g++;
            } else {
                this.f36419e[a(i10) + iB + i10] = cVar;
            }
            this.f36422h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f36419e.length;
                while (true) {
                    length--;
                    i11 = this.f36420f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f36419e[length].f36412c;
                    i10 -= i13;
                    this.f36422h -= i13;
                    this.f36421g--;
                    i12++;
                }
                c[] cVarArr = this.f36419e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f36421g);
                this.f36420f += i12;
            }
            return i12;
        }

        public com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, 127);
            if (z10) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f36416b.c(iA)));
            }
            return this.f36416b.b(iA);
        }

        private void f(int i10) throws IOException {
            a(-1, new c(c(i10), e()));
        }

        public int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f36423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f36424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f36426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f36427e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f36428f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        c[] f36429g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f36430h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f36431i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f36432j;

        public b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f36429g.length;
                while (true) {
                    length--;
                    i11 = this.f36430h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f36429g[length].f36412c;
                    i10 -= i13;
                    this.f36432j -= i13;
                    this.f36431i--;
                    i12++;
                }
                c[] cVarArr = this.f36429g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f36431i);
                c[] cVarArr2 = this.f36429g;
                int i15 = this.f36430h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f36430h += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f36429g, (Object) null);
            this.f36430h = this.f36429g.length - 1;
            this.f36431i = 0;
            this.f36432j = 0;
        }

        public b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f36425c = Integer.MAX_VALUE;
            this.f36429g = new c[8];
            this.f36430h = 7;
            this.f36431i = 0;
            this.f36432j = 0;
            this.f36427e = i10;
            this.f36428f = i10;
            this.f36424b = z10;
            this.f36423a = cVar;
        }

        public void b(int i10) {
            this.f36427e = i10;
            int iMin = Math.min(i10, Http2.INITIAL_MAX_FRAME_SIZE);
            int i11 = this.f36428f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f36425c = Math.min(this.f36425c, iMin);
            }
            this.f36426d = true;
            this.f36428f = iMin;
            a();
        }

        private void a(c cVar) {
            int i10 = cVar.f36412c;
            int i11 = this.f36428f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f36432j + i10) - i11);
            int i12 = this.f36431i + 1;
            c[] cVarArr = this.f36429g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f36430h = this.f36429g.length - 1;
                this.f36429g = cVarArr2;
            }
            int i13 = this.f36430h;
            this.f36430h = i13 - 1;
            this.f36429g[i13] = cVar;
            this.f36431i++;
            this.f36432j += i10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        public void a(List<c> list) throws IOException {
            int length;
            int length2;
            if (this.f36426d) {
                int i10 = this.f36425c;
                if (i10 < this.f36428f) {
                    a(i10, 31, 32);
                }
                this.f36426d = false;
                this.f36425c = Integer.MAX_VALUE;
                a(this.f36428f, 31, 32);
            }
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = list.get(i11);
                com.mbridge.msdk.thrid.okio.f fVarK = cVar.f36410a.k();
                com.mbridge.msdk.thrid.okio.f fVar = cVar.f36411b;
                Integer num = d.f36414b.get(fVarK);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        c[] cVarArr = d.f36413a;
                        if (com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[iIntValue].f36411b, fVar)) {
                            length = length2;
                        } else if (com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[length2].f36411b, fVar)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.f36429g.length;
                    for (int i12 = this.f36430h + 1; i12 < length3; i12++) {
                        if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36429g[i12].f36410a, fVarK)) {
                            if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f36429g[i12].f36411b, fVar)) {
                                length2 = (i12 - this.f36430h) + d.f36413a.length;
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f36430h) + d.f36413a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    a(length2, 127, 128);
                } else if (length == -1) {
                    this.f36423a.writeByte(64);
                    a(fVarK);
                    a(fVar);
                    a(cVar);
                } else if (fVarK.b(c.f36404d) && !c.f36409i.equals(fVarK)) {
                    a(length, 15, 0);
                    a(fVar);
                } else {
                    a(length, 63, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        public void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f36423a.writeByte(i10 | i12);
                return;
            }
            this.f36423a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f36423a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f36423a.writeByte(i13);
        }

        public void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (this.f36424b && k.b().a(fVar) < fVar.j()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
                a(fVarO.j(), 127, 128);
                this.f36423a.a(fVarO);
                return;
            }
            a(fVar.j(), 127, 0);
            this.f36423a.a(fVar);
        }

        private void a() {
            int i10 = this.f36428f;
            int i11 = this.f36432j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f36409i, "");
        com.mbridge.msdk.thrid.okio.f fVar = c.f36406f;
        c cVar2 = new c(fVar, C0375hc.f28788a);
        c cVar3 = new c(fVar, C0375hc.f28789b);
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f36407g;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f36408h;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, "https");
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f36405e;
        f36413a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c(C0265ba.f28278m, ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c(Hb.f26242a, ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f36414b = a();
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f36413a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f36413a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f36410a)) {
                linkedHashMap.put(cVarArr[i10].f36410a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    public static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }
}
