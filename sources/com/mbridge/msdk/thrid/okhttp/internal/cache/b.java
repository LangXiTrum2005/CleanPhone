package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.internal.http.d;
import com.mbridge.msdk.thrid.okhttp.internal.http.e;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.y;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f36278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f36279b;

    public b(y yVar, a0 a0Var) {
        this.f36278a = yVar;
        this.f36279b = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.h().b() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(com.mbridge.msdk.thrid.okhttp.a0 r3, com.mbridge.msdk.thrid.okhttp.y r4) {
        /*
            int r0 = r3.k()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.b(r0)
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            boolean r0 = r0.c()
            if (r0 != 0) goto L5a
            com.mbridge.msdk.thrid.okhttp.c r0 = r3.h()
            boolean r0 = r0.b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            com.mbridge.msdk.thrid.okhttp.c r3 = r3.h()
            boolean r3 = r3.i()
            if (r3 != 0) goto L70
            com.mbridge.msdk.thrid.okhttp.c r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L70
            r3 = 1
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.cache.b.a(com.mbridge.msdk.thrid.okhttp.a0, com.mbridge.msdk.thrid.okhttp.y):boolean");
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final long f36280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final y f36281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final a0 f36282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Date f36283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f36284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Date f36285f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f36286g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Date f36287h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f36288i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f36289j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String f36290k;
        private int l;

        public a(long j10, y yVar, a0 a0Var) {
            this.l = -1;
            this.f36280a = j10;
            this.f36281b = yVar;
            this.f36282c = a0Var;
            if (a0Var != null) {
                this.f36288i = a0Var.t();
                this.f36289j = a0Var.r();
                r rVarM = a0Var.m();
                int iB = rVarM.b();
                for (int i10 = 0; i10 < iB; i10++) {
                    String strA = rVarM.a(i10);
                    String strB = rVarM.b(i10);
                    if ("Date".equalsIgnoreCase(strA)) {
                        this.f36283d = d.a(strB);
                        this.f36284e = strB;
                    } else if ("Expires".equalsIgnoreCase(strA)) {
                        this.f36287h = d.a(strB);
                    } else if ("Last-Modified".equalsIgnoreCase(strA)) {
                        this.f36285f = d.a(strB);
                        this.f36286g = strB;
                    } else if (Command.HTTP_HEADER_ETAG.equalsIgnoreCase(strA)) {
                        this.f36290k = strB;
                    } else if ("Age".equalsIgnoreCase(strA)) {
                        this.l = e.a(strB, -1);
                    }
                }
            }
        }

        private long a() {
            Date date = this.f36283d;
            long jMax = date != null ? Math.max(0L, this.f36289j - date.getTime()) : 0L;
            int i10 = this.l;
            if (i10 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f36289j;
            return jMax + (j10 - this.f36288i) + (this.f36280a - j10);
        }

        private long b() {
            com.mbridge.msdk.thrid.okhttp.c cVarH = this.f36282c.h();
            if (cVarH.d() != -1) {
                return TimeUnit.SECONDS.toMillis(cVarH.d());
            }
            if (this.f36287h != null) {
                Date date = this.f36283d;
                long time = this.f36287h.getTime() - (date != null ? date.getTime() : this.f36289j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f36285f != null && this.f36282c.s().g().k() == null) {
                Date date2 = this.f36283d;
                long time2 = (date2 != null ? date2.getTime() : this.f36288i) - this.f36285f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private b d() {
            String str;
            if (this.f36282c == null) {
                return new b(this.f36281b, null);
            }
            if (this.f36281b.d() && this.f36282c.l() == null) {
                return new b(this.f36281b, null);
            }
            if (!b.a(this.f36282c, this.f36281b)) {
                return new b(this.f36281b, null);
            }
            com.mbridge.msdk.thrid.okhttp.c cVarB = this.f36281b.b();
            if (cVarB.h() || a(this.f36281b)) {
                return new b(this.f36281b, null);
            }
            com.mbridge.msdk.thrid.okhttp.c cVarH = this.f36282c.h();
            long jA = a();
            long jB = b();
            if (cVarB.d() != -1) {
                jB = Math.min(jB, TimeUnit.SECONDS.toMillis(cVarB.d()));
            }
            long millis = 0;
            long millis2 = cVarB.f() != -1 ? TimeUnit.SECONDS.toMillis(cVarB.f()) : 0L;
            if (!cVarH.g() && cVarB.e() != -1) {
                millis = TimeUnit.SECONDS.toMillis(cVarB.e());
            }
            if (!cVarH.h()) {
                long j10 = millis2 + jA;
                if (j10 < millis + jB) {
                    a0.a aVarP = this.f36282c.p();
                    if (j10 >= jB) {
                        aVarP.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (jA > 86400000 && e()) {
                        aVarP.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new b(null, aVarP.a());
                }
            }
            String str2 = this.f36290k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f36285f != null) {
                    str2 = this.f36286g;
                } else {
                    if (this.f36283d == null) {
                        return new b(this.f36281b, null);
                    }
                    str2 = this.f36284e;
                }
                str = "If-Modified-Since";
            }
            r.a aVarA = this.f36281b.c().a();
            com.mbridge.msdk.thrid.okhttp.internal.a.f36256a.a(aVarA, str, str2);
            return new b(this.f36281b.f().a(aVarA.a()).a(), this.f36282c);
        }

        private boolean e() {
            return this.f36282c.h().d() == -1 && this.f36287h == null;
        }

        public b c() {
            b bVarD = d();
            return (bVarD.f36278a == null || !this.f36281b.b().j()) ? bVarD : new b(null, null);
        }

        private static boolean a(y yVar) {
            return (yVar.a("If-Modified-Since") == null && yVar.a("If-None-Match") == null) ? false : true;
        }
    }
}
