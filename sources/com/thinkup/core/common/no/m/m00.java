package com.thinkup.core.common.no.m;

import android.support.v4.media.a;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import java.io.Closeable;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m00 implements Closeable {
    final on0 m;
    final m00 m0;
    final m00 mm;
    final long mn;
    final m00 mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f41988n;
    final long n0;
    private volatile o0 nm;
    final com.thinkup.core.common.no.m.o.m.n no;
    final onm o;
    final String o0;
    final ooo om;
    final m0o on;
    final oo0 oo;

    public static class o {
        on0 m;
        m00 m0;
        m00 mm;
        long mn;
        m00 mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41989n;
        long n0;
        com.thinkup.core.common.no.m.o.m.n no;
        onm o;
        String o0;
        ooo.o om;
        m0o on;
        oo0 oo;

        public o() {
            this.f41989n = -1;
            this.om = new ooo.o();
        }

        private static void o0(m00 m00Var) {
            if (m00Var.on != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final o m(String str, String str2) {
            this.om.o(str, str2);
            return this;
        }

        public final o n(m00 m00Var) {
            if (m00Var != null && m00Var.on != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
            this.mm = m00Var;
            return this;
        }

        public final o o(onm onmVar) {
            this.o = onmVar;
            return this;
        }

        private o m(String str) {
            this.om.m(str);
            return this;
        }

        public final o o(on0 on0Var) {
            this.m = on0Var;
            return this;
        }

        public final o m(m00 m00Var) {
            if (m00Var != null) {
                o("cacheResponse", m00Var);
            }
            this.mo = m00Var;
            return this;
        }

        public final o o(int i2) {
            this.f41989n = i2;
            return this;
        }

        public o(m00 m00Var) {
            this.f41989n = -1;
            this.o = m00Var.o;
            this.m = m00Var.m;
            this.f41989n = m00Var.f41988n;
            this.o0 = m00Var.o0;
            this.oo = m00Var.oo;
            this.om = m00Var.om.m();
            this.on = m00Var.on;
            this.m0 = m00Var.m0;
            this.mo = m00Var.mo;
            this.mm = m00Var.mm;
            this.mn = m00Var.mn;
            this.n0 = m00Var.n0;
            this.no = m00Var.no;
        }

        public final o o(String str) {
            this.o0 = str;
            return this;
        }

        public final o m(long j) {
            this.n0 = j;
            return this;
        }

        public final o o(oo0 oo0Var) {
            this.oo = oo0Var;
            return this;
        }

        public final o o(String str, String str2) {
            this.om.o0(str, str2);
            return this;
        }

        public final o o(ooo oooVar) {
            this.om = oooVar.m();
            return this;
        }

        public final o o(m0o m0oVar) {
            this.on = m0oVar;
            return this;
        }

        public final o o(m00 m00Var) {
            if (m00Var != null) {
                o("networkResponse", m00Var);
            }
            this.m0 = m00Var;
            return this;
        }

        private static void o(String str, m00 m00Var) {
            if (m00Var.on == null) {
                if (m00Var.m0 == null) {
                    if (m00Var.mo == null) {
                        if (m00Var.mm != null) {
                            throw new IllegalArgumentException(a.m(str, ".priorResponse != null"));
                        }
                        return;
                    }
                    throw new IllegalArgumentException(a.m(str, ".cacheResponse != null"));
                }
                throw new IllegalArgumentException(a.m(str, ".networkResponse != null"));
            }
            throw new IllegalArgumentException(a.m(str, ".body != null"));
        }

        public final o o(long j) {
            this.mn = j;
            return this;
        }

        private void o(com.thinkup.core.common.no.m.o.m.n nVar) {
            this.no = nVar;
        }

        public final m00 o() {
            if (this.o != null) {
                if (this.m != null) {
                    if (this.f41989n >= 0) {
                        if (this.o0 != null) {
                            return new m00(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f41989n);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public m00(o oVar) {
        this.o = oVar.o;
        this.m = oVar.m;
        this.f41988n = oVar.f41989n;
        this.o0 = oVar.o0;
        this.oo = oVar.oo;
        this.om = oVar.om.o();
        this.on = oVar.on;
        this.m0 = oVar.m0;
        this.mo = oVar.mo;
        this.mm = oVar.mm;
        this.mn = oVar.mn;
        this.n0 = oVar.n0;
        this.no = oVar.no;
    }

    private boolean nm() {
        int i2 = this.f41988n;
        return i2 >= 200 && i2 < 300;
    }

    private ooo nn() {
        com.thinkup.core.common.no.m.o.m.n nVar = this.no;
        if (nVar != null) {
            return nVar.oo();
        }
        throw new IllegalStateException("trailers not available");
    }

    private boolean o00() {
        int i2 = this.f41988n;
        if (i2 == 307 || i2 == 308) {
            return true;
        }
        switch (i2) {
            case 300:
            case 301:
            case 302:
            case BaseATView.g.f38290N /* 303 */:
                return true;
            default:
                return false;
        }
    }

    private List<m0> o0m() {
        String str;
        int i2 = this.f41988n;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i2 != 407) {
                return Collections.EMPTY_LIST;
            }
            str = "Proxy-Authenticate";
        }
        return com.thinkup.core.common.no.m.o.n.oo.o(this.om, str);
    }

    private m00 o0o() {
        return this.mo;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m0o m0oVar = this.on;
        if (m0oVar == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        m0oVar.close();
    }

    public final on0 m() {
        return this.m;
    }

    public final o m0() {
        return new o(this);
    }

    public final m00 mm() {
        return this.mm;
    }

    public final o0 mn() {
        o0 o0Var = this.nm;
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0VarO = o0.o(this.om);
        this.nm = o0VarO;
        return o0VarO;
    }

    public final m00 mo() {
        return this.m0;
    }

    public final int n() {
        return this.f41988n;
    }

    public final long n0() {
        return this.mn;
    }

    public final long no() {
        return this.n0;
    }

    public final onm o() {
        return this.o;
    }

    public final String o0() {
        return this.o0;
    }

    public final ooo om() {
        return this.om;
    }

    public final m0o on() {
        return this.on;
    }

    public final oo0 oo() {
        return this.oo;
    }

    public final String toString() {
        return "Response{protocol=" + this.m + ", code=" + this.f41988n + ", message=" + this.o0 + ", url=" + this.o.o + AbstractJsonLexerKt.END_OBJ;
    }

    private List<String> m(String str) {
        return this.om.m(str);
    }

    private String o(String str, String str2) {
        String strO = this.om.o(str);
        return strO != null ? strO : str2;
    }

    private m0o o(long j) throws EOFException {
        com.thinkup.core.common.no.n.oo ooVarM0 = this.on.n().m0();
        com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
        ooVarM0.m(j);
        nVar.o(ooVarM0, Math.min(j, ooVarM0.o0().m()));
        return m0o.o(this.on.o(), nVar.m(), nVar);
    }

    public final String o(String str) {
        String strO = this.om.o(str);
        if (strO != null) {
            return strO;
        }
        return null;
    }
}
