package com.thinkup.core.common.no.o;

import android.support.v4.media.a;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
final class oo extends com.thinkup.core.common.no.o.o {
    private int mm;
    private String mn;
    private long mo;
    private com.thinkup.core.common.no.o.m n0;
    private int nm;
    private int nn;
    private byte[] no;
    private List<n0> o00;
    private List<n0> o0m;
    private List<n0> o0o;

    public static class m {
        private final int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f42105n;
        private final String o;
        private int o0;
        private final List<n0> oo;

        public /* synthetic */ m(String str, int i2, int i3, byte b2) {
            this(str, i2, i3);
        }

        private m(String str, int i2, int i3) {
            this.o = str;
            this.m = i2;
            this.f42105n = i3;
            this.o0 = 0;
            this.oo = new ArrayList();
        }

        private void o(n0 n0Var) {
            if (n0Var != null) {
                this.oo.add(n0Var);
            }
        }

        public static /* synthetic */ void o(m mVar, n0 n0Var) {
            mVar.oo.add(n0Var);
        }
    }

    public static class o {
        private String m;
        private int o;

        private o() {
        }

        public /* synthetic */ o(byte b2) {
            this();
        }
    }

    public oo(String str, com.thinkup.core.common.no.o.m mVar, byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            throw new IOException("response data is empty");
        }
        this.mn = str;
        this.mm = 4;
        this.n0 = mVar;
        this.no = bArr;
        this.mo = new Date().getTime() / 1000;
        if (this.no.length < 12) {
            throw new IOException("response data too small");
        }
        byte b2 = 0;
        short sN = n(0);
        this.oo = sN;
        if (sN != this.n0.oo) {
            throw new IOException("question id error");
        }
        int iM = m(2);
        if ((m(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.om = (iM >> 3) & 7;
        this.nm = (iM >> 2) & 1;
        this.on = iM & 1;
        int iM2 = m(3);
        this.m0 = (iM2 >> 7) & 1;
        this.nn = iM2 & 15;
        int iO0 = o0();
        m mVar2 = new m("answer", n(6), iO0, b2);
        o(mVar2);
        this.o00 = mVar2.oo;
        int i2 = iO0 + mVar2.o0;
        m mVar3 = new m("authority", n(8), i2, b2);
        o(mVar3);
        this.o0o = mVar3.oo;
        String str2 = "additional";
        m mVar4 = new m(str2, n(10), i2 + mVar3.o0, b2);
        o(mVar4);
        this.o0m = mVar4.oo;
    }

    private void m() throws IOException {
        if (this.no.length < 12) {
            throw new IOException("response data too small");
        }
        byte b2 = 0;
        short sN = n(0);
        this.oo = sN;
        if (sN != this.n0.oo) {
            throw new IOException("question id error");
        }
        int iM = m(2);
        if ((m(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.om = (iM >> 3) & 7;
        this.nm = (iM >> 2) & 1;
        this.on = iM & 1;
        int iM2 = m(3);
        this.m0 = (iM2 >> 7) & 1;
        this.nn = iM2 & 15;
        int iO0 = o0();
        m mVar = new m("answer", n(6), iO0, b2);
        o(mVar);
        this.o00 = mVar.oo;
        int i2 = iO0 + mVar.o0;
        m mVar2 = new m("authority", n(8), i2, b2);
        o(mVar2);
        this.o0o = mVar2.oo;
        String str = "additional";
        m mVar3 = new m(str, n(10), i2 + mVar2.o0, b2);
        o(mVar3);
        this.o0m = mVar3.oo;
    }

    private List<n0> m0() {
        return this.o0o;
    }

    private void n() throws IOException {
        short sN = n(0);
        this.oo = sN;
        if (sN != this.n0.oo) {
            throw new IOException("question id error");
        }
        int iM = m(2);
        if ((m(2) & 128) == 0) {
            throw new IOException("not a response data");
        }
        this.om = (iM >> 3) & 7;
        this.nm = (iM >> 2) & 1;
        this.on = iM & 1;
        int iM2 = m(3);
        this.m0 = (iM2 >> 7) & 1;
        this.nn = iM2 & 15;
    }

    private void o(m mVar) throws IOException {
        int i2 = mVar.f42105n;
        for (int i3 = mVar.m; i3 > 0; i3--) {
            o oVarO = o(i2);
            if (oVarO == null) {
                throw new IOException(a.r(new StringBuilder("read "), mVar.o, " error"));
            }
            int i4 = i2 + oVarO.o;
            short sN = n(i4);
            short sN2 = n(i4 + 2);
            int i5 = i4 + 4;
            int i6 = i4 + 7;
            byte[] bArr = this.no;
            if (i6 >= bArr.length) {
                throw new IOException("read response data out of range");
            }
            int iB = a.b((bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24, (bArr[i4 + 5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16, (bArr[i4 + 6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8, bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            short sN3 = n(i4 + 8);
            int i7 = i4 + 10;
            String strO = o(sN, i7, sN3);
            if (sN2 == 1 && (sN == 5 || sN == this.n0.o())) {
                m.o(mVar, new n0(strO, sN, iB, this.mo, this.mm, this.mn));
            }
            i2 = i7 + sN3;
        }
        mVar.o0 = i2 - mVar.f42105n;
    }

    private int o0() throws IOException {
        int i2 = 12;
        for (int iN = n(4); iN > 0; iN--) {
            o oVarO = o(i2);
            if (oVarO == null) {
                throw new IOException("read Question error");
            }
            i2 += oVarO.o + 4;
        }
        return i2;
    }

    private int om() {
        return this.nn;
    }

    private List<n0> on() {
        return this.o0m;
    }

    private int oo() {
        return this.nm;
    }

    public final String toString() {
        return String.format(Locale.getDefault(), "{messageId:%d, rd:%d, ra:%d, aa:%d, rCode:%d, server:%s, request:%s, answerArray:%s, authorityArray:%s, additionalArray:%s}", Short.valueOf(this.oo), Integer.valueOf(this.on), Integer.valueOf(this.m0), Integer.valueOf(this.nm), Integer.valueOf(this.nn), this.mn, this.n0, this.o00, this.o0o, this.o0m);
    }

    private int o0(int i2) throws IOException {
        int i3 = i2 + 3;
        byte[] bArr = this.no;
        if (i3 < bArr.length) {
            return a.b((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24, (bArr[i2 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16, (bArr[i2 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8, bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        }
        throw new IOException("read response data out of range");
    }

    private short n(int i2) throws IOException {
        int i3 = i2 + 1;
        byte[] bArr = this.no;
        if (i3 < bArr.length) {
            return (short) (((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        throw new IOException("read response data out of range");
    }

    private o o(int i2) throws IOException {
        StringBuilder sb = new StringBuilder();
        o oVar = new o((byte) 0);
        int i3 = 128;
        int iM = i2;
        do {
            int iM2 = m(iM);
            int i4 = iM2 & PsExtractor.AUDIO_STREAM;
            if (i4 == 192) {
                if (oVar.o <= 0) {
                    oVar.o = (iM + 2) - i2;
                }
                iM = m(iM + 1) | ((iM2 & 63) << 8);
            } else {
                if (i4 > 0) {
                    return null;
                }
                iM++;
                if (iM2 > 0) {
                    if (sb.length() > 0) {
                        sb.append(com.thinkup.core.common.n.mo.ono);
                    }
                    int i5 = iM + iM2;
                    sb.append(IDN.toUnicode(new String(Arrays.copyOfRange(this.no, iM, i5))));
                    iM = i5;
                }
            }
            if (iM2 <= 0) {
                break;
            }
            i3--;
        } while (i3 > 0);
        oVar.m = sb.toString();
        if (oVar.o <= 0) {
            oVar.o = iM - i2;
        }
        return oVar;
    }

    private int m(int i2) throws IOException {
        byte[] bArr = this.no;
        if (i2 < bArr.length) {
            return bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        throw new IOException("read response data out of range");
    }

    private String o(int i2, int i3, int i4) {
        if (i2 == 1) {
            if (i4 != 4) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m(i3));
            for (int i5 = 1; i5 < 4; i5++) {
                sb.append(com.thinkup.core.common.n.mo.ono);
                sb.append(m(i3 + i5));
            }
            return sb.toString();
        }
        if (i2 == 5) {
            if (i4 > 1) {
                return o(i3).m;
            }
            return null;
        }
        if (i2 == 16) {
            if (i4 <= 0) {
                return null;
            }
            int i6 = i4 + i3;
            byte[] bArr = this.no;
            if (i6 < bArr.length) {
                return IDN.toUnicode(new String(Arrays.copyOfRange(bArr, i3, i6)));
            }
            return null;
        }
        if (i2 != 28 || i4 != 16) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (i7 < 16) {
            sb2.append(i7 > 0 ? ":" : "");
            int i8 = i3 + i7;
            sb2.append(m(i8));
            sb2.append(m(i8 + 1));
            i7 += 2;
        }
        return sb2.toString();
    }

    public final List<n0> o() {
        return this.o00;
    }
}
