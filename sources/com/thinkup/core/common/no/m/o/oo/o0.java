package com.thinkup.core.common.no.m.o.oo;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.p004ironsource.jn;
import com.p004ironsource.ko;
import com.thinkup.core.common.no.n.oon;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
final class o0 {
    static final Map<com.thinkup.core.common.no.n.om, Integer> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42056n = 15;
    static final n[] o;
    private static final int o0 = 31;
    private static final int om = 127;
    private static final int oo = 63;

    public static final class m {
        private static final int m0 = 16384;
        private static final int on = 4096;
        int m;
        private final boolean mm;
        private int mn;
        private final com.thinkup.core.common.no.n.n mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        n[] f42057n;
        private boolean n0;
        int o;
        int o0;
        int om;
        int oo;

        public m(com.thinkup.core.common.no.n.n nVar) {
            this(nVar, (byte) 0);
        }

        private int m(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.f42057n.length;
                while (true) {
                    length--;
                    i3 = this.o0;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    int i5 = this.f42057n[length].nm;
                    i2 -= i5;
                    this.om -= i5;
                    this.oo--;
                    i4++;
                }
                n[] nVarArr = this.f42057n;
                System.arraycopy(nVarArr, i3 + 1, nVarArr, i3 + 1 + i4, this.oo);
                n[] nVarArr2 = this.f42057n;
                int i6 = this.o0;
                Arrays.fill(nVarArr2, i6 + 1, i6 + 1 + i4, (Object) null);
                this.o0 += i4;
            }
            return i4;
        }

        private void o() {
            Arrays.fill(this.f42057n, (Object) null);
            this.o0 = this.f42057n.length - 1;
            this.oo = 0;
            this.om = 0;
        }

        private m(com.thinkup.core.common.no.n.n nVar, byte b2) {
            this.mn = Integer.MAX_VALUE;
            n[] nVarArr = new n[8];
            this.f42057n = nVarArr;
            this.o0 = nVarArr.length - 1;
            this.oo = 0;
            this.om = 0;
            this.o = 4096;
            this.m = 4096;
            this.mm = true;
            this.mo = nVar;
        }

        private void o(n nVar) {
            int i2 = nVar.nm;
            int i3 = this.m;
            if (i2 > i3) {
                o();
                return;
            }
            m((this.om + i2) - i3);
            int i4 = this.oo + 1;
            n[] nVarArr = this.f42057n;
            if (i4 > nVarArr.length) {
                n[] nVarArr2 = new n[nVarArr.length * 2];
                System.arraycopy(nVarArr, 0, nVarArr2, nVarArr.length, nVarArr.length);
                this.o0 = this.f42057n.length - 1;
                this.f42057n = nVarArr2;
            }
            int i5 = this.o0;
            this.o0 = i5 - 1;
            this.f42057n[i5] = nVar;
            this.oo++;
            this.om += i2;
        }

        private void m() {
            int i2 = this.m;
            int i3 = this.om;
            if (i2 < i3) {
                if (i2 == 0) {
                    o();
                } else {
                    m(i3 - i2);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        public final void o(List<n> list) {
            int length;
            int length2;
            if (this.n0) {
                int i2 = this.mn;
                if (i2 < this.m) {
                    o(i2, 31, 32);
                }
                this.n0 = false;
                this.mn = Integer.MAX_VALUE;
                o(this.m, 31, 32);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                n nVar = list.get(i3);
                com.thinkup.core.common.no.n.om omVarM0 = nVar.n0.m0();
                com.thinkup.core.common.no.n.om omVar = nVar.no;
                Integer num = o0.m.get(omVarM0);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        n[] nVarArr = o0.o;
                        if (Objects.equals(nVarArr[iIntValue].no, omVar)) {
                            length = length2;
                        } else if (Objects.equals(nVarArr[length2].no, omVar)) {
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
                    int length3 = this.f42057n.length;
                    for (int i4 = this.o0 + 1; i4 < length3; i4++) {
                        if (Objects.equals(this.f42057n[i4].n0, omVarM0)) {
                            if (Objects.equals(this.f42057n[i4].no, omVar)) {
                                length2 = (i4 - this.o0) + o0.o.length;
                                break;
                            } else if (length == -1) {
                                length = (i4 - this.o0) + o0.o.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    o(length2, 127, 128);
                } else if (length == -1) {
                    this.mo.n0(64);
                    o(omVarM0);
                    o(omVar);
                    o(nVar);
                } else if (omVarM0.n(n.o) && !n.mn.equals(omVarM0)) {
                    o(length, 15, 0);
                    o(omVar);
                } else {
                    o(length, 63, 64);
                    o(omVar);
                    o(nVar);
                }
            }
        }

        private void o(int i2, int i3, int i4) {
            if (i2 < i3) {
                this.mo.n0(i2 | i4);
                return;
            }
            this.mo.n0(i4 | i3);
            int i5 = i2 - i3;
            while (i5 >= 128) {
                this.mo.n0(128 | (i5 & 127));
                i5 >>>= 7;
            }
            this.mo.n0(i5);
        }

        private void o(com.thinkup.core.common.no.n.om omVar) {
            if (this.mm) {
                mn.o();
                if (mn.o(omVar) < omVar.mm()) {
                    com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
                    mn.o();
                    mn.o(omVar, nVar);
                    com.thinkup.core.common.no.n.om omVarOo0 = nVar.oo0();
                    o(omVarOo0.mm(), 127, 128);
                    this.mo.o0(omVarOo0);
                    return;
                }
            }
            o(omVar.mm(), 127, 0);
            this.mo.o0(omVar);
        }

        public final void o(int i2) {
            this.o = i2;
            int iMin = Math.min(i2, 16384);
            int i3 = this.m;
            if (i3 == iMin) {
                return;
            }
            if (iMin < i3) {
                this.mn = Math.min(this.mn, iMin);
            }
            this.n0 = true;
            this.m = iMin;
            int i4 = this.om;
            if (iMin < i4) {
                if (iMin == 0) {
                    o();
                } else {
                    m(i4 - iMin);
                }
            }
        }
    }

    public static final class o {
        int m;
        private int m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f42058n;
        n[] o;
        int o0;
        private final com.thinkup.core.common.no.n.oo om;
        private final int on;
        private final List<n> oo;

        public o(oon oonVar, byte b2) {
            this(oonVar);
        }

        private int m0() {
            return this.om.mn() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }

        private com.thinkup.core.common.no.n.om mo() {
            int iM0 = m0();
            boolean z2 = (iM0 & 128) == 128;
            int iO = o(iM0, 127);
            return z2 ? com.thinkup.core.common.no.n.om.o(mn.o().o(this.om.m0(iO))) : this.om.o0(iO);
        }

        private int n() {
            return this.m0;
        }

        private int o(int i2) {
            int i3;
            int i4 = 0;
            if (i2 > 0) {
                int length = this.o.length;
                while (true) {
                    length--;
                    i3 = this.m;
                    if (length < i3 || i2 <= 0) {
                        break;
                    }
                    int i5 = this.o[length].nm;
                    i2 -= i5;
                    this.o0 -= i5;
                    this.f42058n--;
                    i4++;
                }
                n[] nVarArr = this.o;
                System.arraycopy(nVarArr, i3 + 1, nVarArr, i3 + 1 + i4, this.f42058n);
                this.m += i4;
            }
            return i4;
        }

        private void o0() {
            int i2 = this.m0;
            int i3 = this.o0;
            if (i2 < i3) {
                if (i2 == 0) {
                    oo();
                } else {
                    o(i3 - i2);
                }
            }
        }

        private void om() throws IOException {
            this.oo.add(new n(o0.o(mo()), mo()));
        }

        private void on() {
            o(new n(o0.o(mo()), mo()));
        }

        private void oo() {
            Arrays.fill(this.o, (Object) null);
            this.m = this.o.length - 1;
            this.f42058n = 0;
            this.o0 = 0;
        }

        public final List<n> m() {
            ArrayList arrayList = new ArrayList(this.oo);
            this.oo.clear();
            return arrayList;
        }

        private o(oon oonVar) {
            this.oo = new ArrayList();
            n[] nVarArr = new n[8];
            this.o = nVarArr;
            this.m = nVarArr.length - 1;
            this.f42058n = 0;
            this.o0 = 0;
            this.on = 4096;
            this.m0 = 4096;
            this.om = com.thinkup.core.common.no.n.nm.o(oonVar);
        }

        private int n(int i2) {
            return this.m + 1 + i2;
        }

        private void m(int i2) throws IOException {
            if (on(i2)) {
                this.oo.add(o0.o[i2]);
                return;
            }
            int iN = n(i2 - o0.o.length);
            if (iN >= 0) {
                n[] nVarArr = this.o;
                if (iN < nVarArr.length) {
                    this.oo.add(nVarArr[iN]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private void o0(int i2) throws IOException {
            this.oo.add(new n(om(i2), mo()));
        }

        private com.thinkup.core.common.no.n.om om(int i2) throws IOException {
            if (on(i2)) {
                return o0.o[i2].n0;
            }
            int iN = n(i2 - o0.o.length);
            if (iN >= 0) {
                n[] nVarArr = this.o;
                if (iN < nVarArr.length) {
                    return nVarArr[iN].n0;
                }
            }
            throw new IOException("Header index too large " + (i2 + 1));
        }

        private static boolean on(int i2) {
            return i2 >= 0 && i2 <= o0.o.length - 1;
        }

        private void oo(int i2) {
            o(new n(om(i2), mo()));
        }

        public final void o() throws IOException {
            while (!this.om.on()) {
                byte bMn = this.om.mn();
                int i2 = bMn & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                if (i2 == 128) {
                    throw new IOException("index == 0");
                }
                if ((bMn & 128) == 128) {
                    int iO = o(i2, 127);
                    int i3 = iO - 1;
                    if (on(i3)) {
                        this.oo.add(o0.o[i3]);
                    } else {
                        int iN = n(i3 - o0.o.length);
                        if (iN >= 0) {
                            n[] nVarArr = this.o;
                            if (iN < nVarArr.length) {
                                this.oo.add(nVarArr[iN]);
                            }
                        }
                        throw new IOException(a.h(iO, "Header index too large "));
                    }
                } else if (i2 == 64) {
                    o(new n(o0.o(mo()), mo()));
                } else if ((bMn & 64) == 64) {
                    o(new n(om(o(i2, 63) - 1), mo()));
                } else if ((bMn & 32) == 32) {
                    int iO2 = o(i2, 31);
                    this.m0 = iO2;
                    if (iO2 >= 0 && iO2 <= this.on) {
                        o0();
                    } else {
                        throw new IOException("Invalid dynamic table size update " + this.m0);
                    }
                } else if (i2 != 16 && i2 != 0) {
                    this.oo.add(new n(om(o(i2, 15) - 1), mo()));
                } else {
                    this.oo.add(new n(o0.o(mo()), mo()));
                }
            }
        }

        private void o(n nVar) {
            this.oo.add(nVar);
            int i2 = nVar.nm;
            int i3 = this.m0;
            if (i2 > i3) {
                oo();
                return;
            }
            o((this.o0 + i2) - i3);
            int i4 = this.f42058n + 1;
            n[] nVarArr = this.o;
            if (i4 > nVarArr.length) {
                n[] nVarArr2 = new n[nVarArr.length * 2];
                System.arraycopy(nVarArr, 0, nVarArr2, nVarArr.length, nVarArr.length);
                this.m = this.o.length - 1;
                this.o = nVarArr2;
            }
            int i5 = this.m;
            this.m = i5 - 1;
            this.o[i5] = nVar;
            this.f42058n++;
            this.o0 += i2;
        }

        private int o(int i2, int i3) {
            int i4 = i2 & i3;
            if (i4 < i3) {
                return i4;
            }
            int i5 = 0;
            while (true) {
                int iM0 = m0();
                if ((iM0 & 128) == 0) {
                    return i3 + (iM0 << i5);
                }
                i3 += (iM0 & 127) << i5;
                i5 += 7;
            }
        }
    }

    static {
        n nVar = new n(n.mn, "");
        com.thinkup.core.common.no.n.om omVar = n.m0;
        n nVar2 = new n(omVar, ko.f25534a);
        n nVar3 = new n(omVar, ko.f25535b);
        com.thinkup.core.common.no.n.om omVar2 = n.mo;
        n nVar4 = new n(omVar2, "/");
        n nVar5 = new n(omVar2, "/index.html");
        com.thinkup.core.common.no.n.om omVar3 = n.mm;
        n nVar6 = new n(omVar3, "http");
        n nVar7 = new n(omVar3, HttpRequest.DEFAULT_SCHEME);
        com.thinkup.core.common.no.n.om omVar4 = n.on;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, new n(omVar4, "200"), new n(omVar4, "204"), new n(omVar4, "206"), new n(omVar4, "304"), new n(omVar4, "400"), new n(omVar4, "404"), new n(omVar4, "500"), new n("accept-charset", ""), new n("accept-encoding", "gzip, deflate"), new n("accept-language", ""), new n("accept-ranges", ""), new n("accept", ""), new n("access-control-allow-origin", ""), new n("age", ""), new n("allow", ""), new n("authorization", ""), new n("cache-control", ""), new n("content-disposition", ""), new n("content-encoding", ""), new n("content-language", ""), new n("content-length", ""), new n("content-location", ""), new n("content-range", ""), new n("content-type", ""), new n("cookie", ""), new n("date", ""), new n(DownloadModel.ETAG, ""), new n("expect", ""), new n("expires", ""), new n("from", ""), new n("host", ""), new n("if-match", ""), new n("if-modified-since", ""), new n("if-none-match", ""), new n("if-range", ""), new n("if-unmodified-since", ""), new n("last-modified", ""), new n("link", ""), new n("location", ""), new n("max-forwards", ""), new n("proxy-authenticate", ""), new n("proxy-authorization", ""), new n("range", ""), new n("referer", ""), new n("refresh", ""), new n("retry-after", ""), new n(jn.f25433a, ""), new n("set-cookie", ""), new n("strict-transport-security", ""), new n("transfer-encoding", ""), new n("user-agent", ""), new n("vary", ""), new n("via", ""), new n("www-authenticate", "")};
        o = nVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(nVarArr.length);
        int i2 = 0;
        while (true) {
            n[] nVarArr2 = o;
            if (i2 >= nVarArr2.length) {
                m = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(nVarArr2[i2].n0)) {
                    linkedHashMap.put(nVarArr2[i2].n0, Integer.valueOf(i2));
                }
                i2++;
            }
        }
    }

    private o0() {
    }

    private static Map<com.thinkup.core.common.no.n.om, Integer> o() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.length);
        int i2 = 0;
        while (true) {
            n[] nVarArr = o;
            if (i2 >= nVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(nVarArr[i2].n0)) {
                linkedHashMap.put(nVarArr[i2].n0, Integer.valueOf(i2));
            }
            i2++;
        }
    }

    public static com.thinkup.core.common.no.n.om o(com.thinkup.core.common.no.n.om omVar) throws IOException {
        int iMm = omVar.mm();
        for (int i2 = 0; i2 < iMm; i2++) {
            byte bM = omVar.m(i2);
            if (bM >= 65 && bM <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + omVar.o());
            }
        }
        return omVar;
    }
}
