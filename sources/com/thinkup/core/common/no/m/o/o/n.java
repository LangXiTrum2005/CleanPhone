package com.thinkup.core.common.no.m.o.o;

import com.mbridge.msdk.foundation.download.Command;
import com.thinkup.core.common.no.m.m00;
import com.thinkup.core.common.no.m.onm;
import com.thinkup.core.common.no.m.ooo;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public final m00 m;
    public final onm o;

    public static class o {
        final onm m;
        private Date m0;
        private long mm;
        private String mn;
        private long mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final m00 f42031n;
        private int n0;
        final long o;
        private Date o0;
        private Date om;
        private String on;
        private String oo;

        public o(long j, onm onmVar, m00 m00Var) {
            this.n0 = -1;
            this.o = j;
            this.m = onmVar;
            this.f42031n = m00Var;
            if (m00Var != null) {
                this.mo = m00Var.n0();
                this.mm = m00Var.no();
                ooo oooVarOm = m00Var.om();
                int iO = oooVarOm.o();
                for (int i2 = 0; i2 < iO; i2++) {
                    String strO = oooVarOm.o(i2);
                    String strM = oooVarOm.m(i2);
                    if ("Date".equalsIgnoreCase(strO)) {
                        this.o0 = com.thinkup.core.common.no.m.o.n.o0.o(strM);
                        this.oo = strM;
                    } else if ("Expires".equalsIgnoreCase(strO)) {
                        this.m0 = com.thinkup.core.common.no.m.o.n.o0.o(strM);
                    } else if ("Last-Modified".equalsIgnoreCase(strO)) {
                        this.om = com.thinkup.core.common.no.m.o.n.o0.o(strM);
                        this.on = strM;
                    } else if (Command.HTTP_HEADER_ETAG.equalsIgnoreCase(strO)) {
                        this.mn = strM;
                    } else if ("Age".equalsIgnoreCase(strO)) {
                        this.n0 = com.thinkup.core.common.no.m.o.n.oo.m(strM, -1);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
        private n m() {
            long time;
            if (this.f42031n == null) {
                return new n(this.m, null);
            }
            if (this.m.on() && this.f42031n.oo() == null) {
                return new n(this.m, null);
            }
            if (!n.o(this.f42031n, this.m)) {
                return new n(this.m, null);
            }
            com.thinkup.core.common.no.m.o0 o0VarOm = this.m.om();
            if (!o0VarOm.o()) {
                onm onmVar = this.m;
                String str = "If-Modified-Since";
                if (onmVar.o("If-Modified-Since") == null && onmVar.o("If-None-Match") == null) {
                    com.thinkup.core.common.no.m.o0 o0VarMn = this.f42031n.mn();
                    Date date = this.o0;
                    long jMax = date != null ? Math.max(0L, this.mm - date.getTime()) : 0L;
                    int i2 = this.n0;
                    if (i2 != -1) {
                        jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
                    }
                    long j = this.mm;
                    long millis = 0;
                    long j2 = jMax + (j - this.mo) + (this.o - j);
                    com.thinkup.core.common.no.m.o0 o0VarMn2 = this.f42031n.mn();
                    if (o0VarMn2.n() != -1) {
                        time = TimeUnit.SECONDS.toMillis(o0VarMn2.n());
                    } else if (this.m0 != null) {
                        Date date2 = this.o0;
                        time = this.m0.getTime() - (date2 != null ? date2.getTime() : this.mm);
                        if (time <= 0) {
                            time = 0;
                        }
                    } else if (this.om == null || this.f42031n.o().o().mn() != null) {
                        time = 0;
                    } else {
                        Date date3 = this.o0;
                        long time2 = (date3 != null ? date3.getTime() : this.mo) - this.om.getTime();
                        if (time2 > 0) {
                            time = time2 / 10;
                        } else {
                            time = 0;
                        }
                    }
                    if (o0VarOm.n() != -1) {
                        time = Math.min(time, TimeUnit.SECONDS.toMillis(o0VarOm.n()));
                    }
                    long millis2 = o0VarOm.m0() != -1 ? TimeUnit.SECONDS.toMillis(o0VarOm.m0()) : 0L;
                    if (!o0VarMn.om() && o0VarOm.on() != -1) {
                        millis = TimeUnit.SECONDS.toMillis(o0VarOm.on());
                    }
                    if (!o0VarMn.o()) {
                        long j3 = millis2 + j2;
                        if (j3 < time + millis) {
                            m00.o oVarM0 = this.f42031n.m0();
                            if (j3 >= time) {
                                oVarM0.m("Warning", "110 HttpURLConnection \"Response is stale\"");
                            }
                            if (j2 > 86400000 && this.f42031n.mn().n() == -1 && this.m0 == null) {
                                oVarM0.m("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                            }
                            return new n(null, oVarM0.o());
                        }
                    }
                    String str2 = this.mn;
                    if (str2 != null) {
                        str = "If-None-Match";
                    } else if (this.om != null) {
                        str2 = this.on;
                    } else {
                        if (this.o0 == null) {
                            return new n(this.m, null);
                        }
                        str2 = this.oo;
                    }
                    ooo.o oVarM = this.m.n().m();
                    com.thinkup.core.common.no.m.o.o.o.o(oVarM, str, str2);
                    return new n(this.m.oo().o(oVarM.o()).m(), this.f42031n);
                }
            }
            return new n(this.m, null);
        }

        private long n() {
            com.thinkup.core.common.no.m.o0 o0VarMn = this.f42031n.mn();
            if (o0VarMn.n() != -1) {
                return TimeUnit.SECONDS.toMillis(o0VarMn.n());
            }
            if (this.m0 != null) {
                Date date = this.o0;
                long time = this.m0.getTime() - (date != null ? date.getTime() : this.mm);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.om != null && this.f42031n.o().o().mn() == null) {
                Date date2 = this.o0;
                long time2 = (date2 != null ? date2.getTime() : this.mo) - this.om.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
            }
            return 0L;
        }

        private static boolean o(onm onmVar) {
            return (onmVar.o("If-Modified-Since") == null && onmVar.o("If-None-Match") == null) ? false : true;
        }

        private long o0() {
            Date date = this.o0;
            long jMax = date != null ? Math.max(0L, this.mm - date.getTime()) : 0L;
            int i2 = this.n0;
            if (i2 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
            }
            long j = this.mm;
            return jMax + (j - this.mo) + (this.o - j);
        }

        private boolean oo() {
            return this.f42031n.mn().n() == -1 && this.m0 == null;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:79:0x017d  */
        /* JADX WARN: Code duplicated, block: B:81:0x0181  */
        /* JADX WARN: Code duplicated, block: B:82:0x0183  */
        /* JADX WARN: Code duplicated, block: B:84:0x0187  */
        /* JADX WARN: Code duplicated, block: B:85:0x018a  */
        /* JADX WARN: Code duplicated, block: B:87:0x018e  */
        /* JADX WARN: Code duplicated, block: B:89:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:90:0x01c1  */
        public final n o() {
            n nVar;
            long time;
            String str;
            n nVar2;
            if (this.f42031n == null) {
                nVar = new n(this.m, null);
            } else if (!(this.m.on() && this.f42031n.oo() == null) && n.o(this.f42031n, this.m)) {
                com.thinkup.core.common.no.m.o0 o0VarOm = this.m.om();
                if (o0VarOm.o()) {
                    nVar = new n(this.m, null);
                } else {
                    onm onmVar = this.m;
                    String str2 = "If-Modified-Since";
                    if (onmVar.o("If-Modified-Since") == null && onmVar.o("If-None-Match") == null) {
                        com.thinkup.core.common.no.m.o0 o0VarMn = this.f42031n.mn();
                        Date date = this.o0;
                        long jMax = date != null ? Math.max(0L, this.mm - date.getTime()) : 0L;
                        int i2 = this.n0;
                        if (i2 != -1) {
                            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
                        }
                        long j = this.mm;
                        long millis = 0;
                        long j2 = jMax + (j - this.mo) + (this.o - j);
                        com.thinkup.core.common.no.m.o0 o0VarMn2 = this.f42031n.mn();
                        if (o0VarMn2.n() != -1) {
                            time = TimeUnit.SECONDS.toMillis(o0VarMn2.n());
                        } else if (this.m0 != null) {
                            Date date2 = this.o0;
                            time = this.m0.getTime() - (date2 != null ? date2.getTime() : this.mm);
                            if (time <= 0) {
                                time = 0;
                            }
                        } else if (this.om == null || this.f42031n.o().o().mn() != null) {
                            time = 0;
                        } else {
                            Date date3 = this.o0;
                            long time2 = (date3 != null ? date3.getTime() : this.mo) - this.om.getTime();
                            if (time2 > 0) {
                                time = time2 / 10;
                            } else {
                                time = 0;
                            }
                        }
                        if (o0VarOm.n() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(o0VarOm.n()));
                        }
                        long millis2 = o0VarOm.m0() != -1 ? TimeUnit.SECONDS.toMillis(o0VarOm.m0()) : 0L;
                        if (!o0VarMn.om() && o0VarOm.on() != -1) {
                            millis = TimeUnit.SECONDS.toMillis(o0VarOm.on());
                        }
                        if (o0VarMn.o()) {
                            str = this.mn;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else if (this.om != null) {
                                str = this.on;
                            } else if (this.o0 != null) {
                                str = this.oo;
                            } else {
                                nVar = new n(this.m, null);
                            }
                            ooo.o oVarM = this.m.n().m();
                            com.thinkup.core.common.no.m.o.o.o.o(oVarM, str2, str);
                            nVar2 = new n(this.m.oo().o(oVarM.o()).m(), this.f42031n);
                            nVar = nVar2;
                        } else {
                            long j3 = millis2 + j2;
                            if (j3 < time + millis) {
                                m00.o oVarM0 = this.f42031n.m0();
                                if (j3 >= time) {
                                    oVarM0.m("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j2 > 86400000 && this.f42031n.mn().n() == -1 && this.m0 == null) {
                                    oVarM0.m("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                nVar2 = new n(null, oVarM0.o());
                            } else {
                                str = this.mn;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else if (this.om != null) {
                                    str = this.on;
                                } else if (this.o0 != null) {
                                    str = this.oo;
                                } else {
                                    nVar = new n(this.m, null);
                                }
                                ooo.o oVarM2 = this.m.n().m();
                                com.thinkup.core.common.no.m.o.o.o.o(oVarM2, str2, str);
                                nVar2 = new n(this.m.oo().o(oVarM2.o()).m(), this.f42031n);
                            }
                            nVar = nVar2;
                        }
                    } else {
                        nVar = new n(this.m, null);
                    }
                }
            } else {
                nVar = new n(this.m, null);
            }
            return (nVar.o == null || !this.m.om().mo()) ? nVar : new n(null, null);
        }
    }

    public n(onm onmVar, m00 m00Var) {
        this.o = onmVar;
        this.m = m00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.mn().o0() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean o(com.thinkup.core.common.no.m.m00 r3, com.thinkup.core.common.no.m.onm r4) {
        /*
            int r0 = r3.n()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L59
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L59
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L59
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L59
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L59
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L59
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L59
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L59
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L59
            switch(r0) {
                case 300: goto L59;
                case 301: goto L59;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L58
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.o(r0)
            if (r0 != 0) goto L59
            com.thinkup.core.common.no.m.o0 r0 = r3.mn()
            int r0 = r0.n()
            r1 = -1
            if (r0 != r1) goto L59
            com.thinkup.core.common.no.m.o0 r0 = r3.mn()
            boolean r0 = r0.oo()
            if (r0 != 0) goto L59
            com.thinkup.core.common.no.m.o0 r0 = r3.mn()
            boolean r0 = r0.o0()
            if (r0 != 0) goto L59
        L58:
            return r2
        L59:
            com.thinkup.core.common.no.m.o0 r3 = r3.mn()
            boolean r3 = r3.m()
            if (r3 != 0) goto L6f
            com.thinkup.core.common.no.m.o0 r3 = r4.om()
            boolean r3 = r3.m()
            if (r3 != 0) goto L6f
            r3 = 1
            return r3
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.no.m.o.o.n.o(com.thinkup.core.common.no.m.m00, com.thinkup.core.common.no.m.onm):boolean");
    }
}
