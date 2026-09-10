package com.thinkup.core.common.no.m;

import com.p004ironsource.ko;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements Closeable, Flushable {
    private static final int m0 = 2;
    private static final int om = 0;
    private static final int on = 1;
    private static final int oo = 201105;
    final com.thinkup.core.common.no.m.o.o.o0 m;
    private int mm;
    private int mn;
    private int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41995n;
    final com.thinkup.core.common.no.m.o.o.om o;
    int o0;

    public static class m extends m0o {
        private final com.thinkup.core.common.no.n.oo m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f41997n;
        final com.thinkup.core.common.no.m.o.o.o0.n o;
        private final String o0;

        public m(final com.thinkup.core.common.no.m.o.o.o0.n nVar, String str, String str2) {
            this.o = nVar;
            this.f41997n = str;
            this.o0 = str2;
            this.m = com.thinkup.core.common.no.n.nm.o(new com.thinkup.core.common.no.n.mo(nVar.o(1)) { // from class: com.thinkup.core.common.no.m.n.m.1
                @Override // com.thinkup.core.common.no.n.mo, com.thinkup.core.common.no.n.oon, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    nVar.close();
                    super.close();
                }
            });
        }

        @Override // com.thinkup.core.common.no.m.m0o
        public final long m() {
            try {
                String str = this.o0;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1L;
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }

        @Override // com.thinkup.core.common.no.m.m0o
        public final com.thinkup.core.common.no.n.oo n() {
            return this.m;
        }

        @Override // com.thinkup.core.common.no.m.m0o
        public final om0 o() {
            String str = this.f41997n;
            if (str != null) {
                return om0.m(str);
            }
            return null;
        }
    }

    public final class o implements com.thinkup.core.common.no.m.o.o.m {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final com.thinkup.core.common.no.m.o.o.o0.o f41999n;
        boolean o;
        private com.thinkup.core.common.no.n.oom o0;
        private com.thinkup.core.common.no.n.oom oo;

        public o(final com.thinkup.core.common.no.m.o.o.o0.o oVar) {
            this.f41999n = oVar;
            com.thinkup.core.common.no.n.oom oomVarO = oVar.o(1);
            this.o0 = oomVarO;
            this.oo = new com.thinkup.core.common.no.n.m0(oomVarO) { // from class: com.thinkup.core.common.no.m.n.o.1
                @Override // com.thinkup.core.common.no.n.m0, com.thinkup.core.common.no.n.oom, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    synchronized (n.this) {
                        try {
                            o oVar2 = o.this;
                            if (oVar2.o) {
                                return;
                            }
                            oVar2.o = true;
                            n.this.f41995n++;
                            super.close();
                            oVar.m();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
        }

        @Override // com.thinkup.core.common.no.m.o.o.m
        public final com.thinkup.core.common.no.n.oom m() {
            return this.oo;
        }

        @Override // com.thinkup.core.common.no.m.o.o.m
        public final void o() {
            synchronized (n.this) {
                try {
                    if (this.o) {
                        return;
                    }
                    this.o = true;
                    n.this.o0++;
                    com.thinkup.core.common.no.m.o.n.o(this.o0);
                    try {
                        this.f41999n.n();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private n(File file, long j) {
        this(file, j, com.thinkup.core.common.no.m.o.om.o.o);
    }

    private long m0() {
        return this.m.oo();
    }

    private File mm() {
        return this.m.n();
    }

    private boolean mn() {
        return this.m.on();
    }

    private long mo() {
        return this.m.o0();
    }

    private void n() {
        this.m.mo();
    }

    private synchronized int n0() {
        return this.mo;
    }

    private synchronized int nm() {
        return this.mn;
    }

    private synchronized int no() {
        return this.mm;
    }

    private static String o(oom oomVar) {
        return com.thinkup.core.common.no.n.om.o(oomVar.toString()).n().on();
    }

    private void o0() {
        this.m.mm();
    }

    private synchronized int om() {
        return this.o0;
    }

    private synchronized int on() {
        return this.f41995n;
    }

    private Iterator<String> oo() {
        return new Iterator<String>() { // from class: com.thinkup.core.common.no.m.n.2
            String m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            boolean f41996n;
            final Iterator<com.thinkup.core.common.no.m.o.o.o0.n> o;

            {
                this.o = n.this.m.mn();
            }

            private String o() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.m;
                this.m = null;
                this.f41996n = true;
                return str;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                if (this.m != null) {
                    return true;
                }
                this.f41996n = false;
                while (this.o.hasNext()) {
                    try {
                        com.thinkup.core.common.no.m.o.o.o0.n next = this.o.next();
                        try {
                            continue;
                            this.m = com.thinkup.core.common.no.n.nm.o(next.o(0)).oon();
                            next.close();
                            return true;
                        } catch (Throwable th) {
                            if (next != null) {
                                try {
                                    next.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public final /* synthetic */ String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                String str = this.m;
                this.m = null;
                this.f41996n = true;
                return str;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (!this.f41996n) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.o.remove();
            }
        };
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.m.flush();
    }

    public final void m(onm onmVar) {
        this.m.n(o(onmVar.o));
    }

    private n(File file, long j, com.thinkup.core.common.no.m.o.om.o oVar) {
        this.o = new com.thinkup.core.common.no.m.o.o.om() { // from class: com.thinkup.core.common.no.m.n.1
            @Override // com.thinkup.core.common.no.m.o.o.om
            public final void m(onm onmVar) {
                n.this.m(onmVar);
            }

            @Override // com.thinkup.core.common.no.m.o.o.om
            public final m00 o(onm onmVar) {
                return n.this.o(onmVar);
            }

            @Override // com.thinkup.core.common.no.m.o.o.om
            public final com.thinkup.core.common.no.m.o.o.m o(m00 m00Var) {
                return n.this.o(m00Var);
            }

            @Override // com.thinkup.core.common.no.m.o.o.om
            public final void o(m00 m00Var, m00 m00Var2) {
                n.o(m00Var, m00Var2);
            }

            @Override // com.thinkup.core.common.no.m.o.o.om
            public final void o() {
                n.this.o();
            }

            @Override // com.thinkup.core.common.no.m.o.o.om
            public final void o(com.thinkup.core.common.no.m.o.o.n nVar) {
                n.this.o(nVar);
            }
        };
        this.m = com.thinkup.core.common.no.m.o.o.o0.o(oVar, file, j);
    }

    public static void o(m00 m00Var, m00 m00Var2) {
        com.thinkup.core.common.no.m.o.o.o0.o oVarO;
        C0672n c0672n = new C0672n(m00Var2);
        try {
            oVarO = ((m) m00Var.on).o.o();
            if (oVarO != null) {
                try {
                    c0672n.o(oVarO);
                    oVarO.m();
                } catch (IOException unused) {
                    o(oVarO);
                }
            }
        } catch (IOException unused2) {
            oVarO = null;
        }
    }

    private void m() {
        this.m.o();
    }

    private static void o(com.thinkup.core.common.no.m.o.o.o0.o oVar) {
        if (oVar != null) {
            try {
                oVar.n();
            } catch (IOException unused) {
            }
        }
    }

    public final synchronized void o(com.thinkup.core.common.no.m.o.o.n nVar) {
        this.mn++;
        if (nVar.o != null) {
            this.mo++;
        } else {
            if (nVar.m != null) {
                this.mm++;
            }
        }
    }

    public final synchronized void o() {
        this.mm++;
    }

    public static int o(com.thinkup.core.common.no.n.oo ooVar) throws IOException {
        try {
            long jO0m = ooVar.o0m();
            String strOon = ooVar.oon();
            if (jO0m >= 0 && jO0m <= 2147483647L && strOon.isEmpty()) {
                return (int) jO0m;
            }
            throw new IOException("expected an int but was \"" + jO0m + strOon + "\"");
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public final m00 o(onm onmVar) {
        try {
            com.thinkup.core.common.no.m.o.o.o0.n nVarO = this.m.o(o(onmVar.o));
            if (nVarO == null) {
                return null;
            }
            try {
                C0672n c0672n = new C0672n(nVarO.o(0));
                m00 m00VarO = c0672n.o(nVarO);
                if (c0672n.o(onmVar, m00VarO)) {
                    return m00VarO;
                }
                com.thinkup.core.common.no.m.o.n.o(m00VarO.on);
                return null;
            } catch (IOException unused) {
                com.thinkup.core.common.no.m.o.n.o(nVarO);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final com.thinkup.core.common.no.m.o.o.m o(m00 m00Var) {
        com.thinkup.core.common.no.m.o.o.o0.o oVarM;
        String str = m00Var.o.m;
        if (com.thinkup.core.common.no.m.o.n.om.o(str)) {
            try {
                m(m00Var.o);
            } catch (IOException unused) {
            }
            return null;
        }
        if (!str.equals(ko.f25534a) || com.thinkup.core.common.no.m.o.n.oo.m(m00Var)) {
            return null;
        }
        C0672n c0672n = new C0672n(m00Var);
        try {
            oVarM = this.m.m(o(m00Var.o.o));
            if (oVarM == null) {
                return null;
            }
            try {
                c0672n.o(oVarM);
                return new o(oVarM);
            } catch (IOException unused2) {
                o(oVarM);
                return null;
            }
        } catch (IOException unused3) {
            oVarM = null;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.no.m.n$n, reason: collision with other inner class name */
    public static final class C0672n {
        private static final String m;
        private static final String o;
        private final String m0;
        private final oo0 mm;
        private final long mn;
        private final ooo mo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f41998n;
        private final long n0;
        private final ooo o0;
        private final on0 om;
        private final int on;
        private final String oo;

        static {
            StringBuilder sb = new StringBuilder();
            com.thinkup.core.common.no.m.o.on.n.oo();
            sb.append(com.thinkup.core.common.no.m.o.on.n.om());
            sb.append("-Sent-Millis");
            o = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            com.thinkup.core.common.no.m.o.on.n.oo();
            sb2.append(com.thinkup.core.common.no.m.o.on.n.om());
            sb2.append("-Received-Millis");
            m = sb2.toString();
        }

        public C0672n(com.thinkup.core.common.no.n.oon oonVar) {
            try {
                com.thinkup.core.common.no.n.oo ooVarO = com.thinkup.core.common.no.n.nm.o(oonVar);
                this.f41998n = ooVarO.oon();
                this.oo = ooVarO.oon();
                ooo.o oVar = new ooo.o();
                int iO = n.o(ooVarO);
                for (int i2 = 0; i2 < iO; i2++) {
                    oVar.o(ooVarO.oon());
                }
                this.o0 = oVar.o();
                com.thinkup.core.common.no.m.o.n.mn mnVarO = com.thinkup.core.common.no.m.o.n.mn.o(ooVarO.oon());
                this.om = mnVarO.o0;
                this.on = mnVarO.oo;
                this.m0 = mnVarO.om;
                ooo.o oVar2 = new ooo.o();
                int iO2 = n.o(ooVarO);
                for (int i3 = 0; i3 < iO2; i3++) {
                    oVar2.o(ooVarO.oon());
                }
                String str = o;
                String strN = oVar2.n(str);
                String str2 = m;
                String strN2 = oVar2.n(str2);
                oVar2.m(str);
                oVar2.m(str2);
                this.mn = strN != null ? Long.parseLong(strN) : 0L;
                this.n0 = strN2 != null ? Long.parseLong(strN2) : 0L;
                this.mo = oVar2.o();
                if (o()) {
                    String strOon = ooVarO.oon();
                    if (strOon.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strOon + "\"");
                    }
                    this.mm = oo0.o(!ooVarO.on() ? m0n.o(ooVarO.oon()) : m0n.SSL_3_0, mo.o(ooVarO.oon()), o(ooVarO), o(ooVarO));
                } else {
                    this.mm = null;
                }
                oonVar.close();
            } catch (Throwable th) {
                oonVar.close();
                throw th;
            }
        }

        public final void o(com.thinkup.core.common.no.m.o.o.o0.o oVar) throws IOException {
            com.thinkup.core.common.no.n.o0 o0VarO = com.thinkup.core.common.no.n.nm.o(oVar.o(0));
            o0VarO.m(this.f41998n).n0(10);
            o0VarO.m(this.oo).n0(10);
            o0VarO.nn(this.o0.o()).n0(10);
            int iO = this.o0.o();
            for (int i2 = 0; i2 < iO; i2++) {
                o0VarO.m(this.o0.o(i2)).m(": ").m(this.o0.m(i2)).n0(10);
            }
            o0VarO.m(new com.thinkup.core.common.no.m.o.n.mn(this.om, this.on, this.m0).toString()).n0(10);
            o0VarO.nn(this.mo.o() + 2).n0(10);
            int iO2 = this.mo.o();
            for (int i3 = 0; i3 < iO2; i3++) {
                o0VarO.m(this.mo.o(i3)).m(": ").m(this.mo.m(i3)).n0(10);
            }
            o0VarO.m(o).m(": ").nn(this.mn).n0(10);
            o0VarO.m(m).m(": ").nn(this.n0).n0(10);
            if (o()) {
                o0VarO.n0(10);
                o0VarO.m(this.mm.m().onmo).n0(10);
                o(o0VarO, this.mm.n());
                o(o0VarO, this.mm.o0());
                o0VarO.m(this.mm.o().om).n0(10);
            }
            o0VarO.close();
        }

        public C0672n(m00 m00Var) {
            this.f41998n = m00Var.o.o.toString();
            this.o0 = com.thinkup.core.common.no.m.o.n.oo.n(m00Var);
            this.oo = m00Var.o.m;
            this.om = m00Var.m;
            this.on = m00Var.f41988n;
            this.m0 = m00Var.o0;
            this.mo = m00Var.om;
            this.mm = m00Var.oo;
            this.mn = m00Var.mn;
            this.n0 = m00Var.n0;
        }

        private boolean o() {
            return this.f41998n.startsWith("https://");
        }

        private static List<Certificate> o(com.thinkup.core.common.no.n.oo ooVar) throws IOException {
            int iO = n.o(ooVar);
            if (iO == -1) {
                return Collections.EMPTY_LIST;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
                ArrayList arrayList = new ArrayList(iO);
                for (int i2 = 0; i2 < iO; i2++) {
                    String strOon = ooVar.oon();
                    com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
                    nVar.o0(com.thinkup.core.common.no.n.om.m(strOon));
                    arrayList.add(certificateFactory.generateCertificate(nVar.mo()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private static void o(com.thinkup.core.common.no.n.o0 o0Var, List<Certificate> list) throws IOException {
            try {
                o0Var.nn(list.size()).n0(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o0Var.m(com.thinkup.core.common.no.n.om.o(list.get(i2).getEncoded()).m()).n0(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public final boolean o(onm onmVar, m00 m00Var) {
            return this.f41998n.equals(onmVar.o.toString()) && this.oo.equals(onmVar.m) && com.thinkup.core.common.no.m.o.n.oo.o(m00Var, this.o0, onmVar);
        }

        public final m00 o(com.thinkup.core.common.no.m.o.o.o0.n nVar) {
            String strO = this.mo.o("Content-Type");
            String strO2 = this.mo.o("Content-Length");
            onm onmVarM = new onm.o().o(this.f41998n).o(this.oo, (onn) null).o(this.o0).m();
            m00.o oVar = new m00.o();
            oVar.o = onmVarM;
            oVar.m = this.om;
            oVar.f41989n = this.on;
            oVar.o0 = this.m0;
            m00.o oVarO = oVar.o(this.mo);
            oVarO.on = new m(nVar, strO, strO2);
            oVarO.oo = this.mm;
            oVarO.mn = this.mn;
            oVarO.n0 = this.n0;
            return oVarO.o();
        }
    }
}
