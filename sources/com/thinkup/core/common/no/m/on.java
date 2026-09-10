package com.thinkup.core.common.no.m;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes6.dex */
public final class on {
    public static final on o = new o().o();
    private final Set<m> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.thinkup.core.common.no.m.o.mm.n f42073n;

    public static final class m {
        private static final String oo = "*.";
        final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final String f42074n;
        final String o;
        final com.thinkup.core.common.no.n.om o0;

        public m(String str, String str2) {
            String str3;
            this.o = str;
            if (str.startsWith(oo)) {
                str3 = oom.o0("http://" + str.substring(2)).no;
            } else {
                str3 = oom.o0("http://".concat(str)).no;
            }
            this.m = str3;
            if (str2.startsWith("sha1/")) {
                this.f42074n = "sha1/";
                this.o0 = com.thinkup.core.common.no.n.om.m(str2.substring(5));
            } else {
                if (!str2.startsWith("sha256/")) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(str2));
                }
                this.f42074n = "sha256/";
                this.o0 = com.thinkup.core.common.no.n.om.m(str2.substring(7));
            }
            if (this.o0 == null) {
                throw new IllegalArgumentException("pins must be base64: ".concat(str2));
            }
        }

        private boolean o(String str) {
            if (!this.o.startsWith(oo)) {
                return str.equals(this.m);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.m.length()) {
                return false;
            }
            String str2 = this.m;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return this.o.equals(mVar.o) && this.f42074n.equals(mVar.f42074n) && this.o0.equals(mVar.o0);
        }

        public final int hashCode() {
            return this.o0.hashCode() + a.b(this.f42074n, a.b(this.o, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31), 31);
        }

        public final String toString() {
            return this.f42074n + this.o0.m();
        }
    }

    public on(Set<m> set, com.thinkup.core.common.no.m.o.mm.n nVar) {
        this.m = set;
        this.f42073n = nVar;
    }

    private static com.thinkup.core.common.no.n.om m(X509Certificate x509Certificate) {
        return com.thinkup.core.common.no.n.om.o(x509Certificate.getPublicKey().getEncoded()).oo();
    }

    private void o(String str, Certificate... certificateArr) {
        o(str, Arrays.asList(certificateArr));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof on)) {
            return false;
        }
        on onVar = (on) obj;
        return Objects.equals(this.f42073n, onVar.f42073n) && this.m.equals(onVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + (Objects.hashCode(this.f42073n) * 31);
    }

    private List<m> o(String str) {
        String str2;
        boolean zEquals;
        List<m> arrayList = Collections.EMPTY_LIST;
        for (m mVar : this.m) {
            if (mVar.o.startsWith("*.")) {
                int iIndexOf = str.indexOf(46);
                zEquals = true;
                if ((str.length() - iIndexOf) - 1 == mVar.m.length()) {
                    String str3 = mVar.m;
                    str2 = str;
                    if (!str2.regionMatches(false, iIndexOf + 1, str3, 0, str3.length())) {
                    }
                } else {
                    str2 = str;
                }
                zEquals = false;
            } else {
                str2 = str;
                zEquals = str2.equals(mVar.m);
            }
            if (zEquals) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(mVar);
            }
            str = str2;
        }
        return arrayList;
    }

    public static final class o {
        private final List<m> o = new ArrayList();

        private o o(String str, String... strArr) {
            if (str == null) {
                throw new NullPointerException("pattern == null");
            }
            for (String str2 : strArr) {
                this.o.add(new m(str, str2));
            }
            return this;
        }

        public final on o() {
            return new on(new LinkedHashSet(this.o), null);
        }
    }

    public final on o(com.thinkup.core.common.no.m.o.mm.n nVar) {
        return Objects.equals(this.f42073n, nVar) ? this : new on(this.m, nVar);
    }

    public static String o(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + m((X509Certificate) certificate).m();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static com.thinkup.core.common.no.n.om o(X509Certificate x509Certificate) {
        return com.thinkup.core.common.no.n.om.o(x509Certificate.getPublicKey().getEncoded()).o0();
    }

    public final void o(String str, List<Certificate> list) {
        int i2;
        List arrayList = Collections.EMPTY_LIST;
        Iterator<m> it = this.m.iterator();
        while (true) {
            zEquals = false;
            boolean zEquals = false;
            if (!it.hasNext()) {
                break;
            }
            m next = it.next();
            if (next.o.startsWith("*.")) {
                int iIndexOf = str.indexOf(46);
                if ((str.length() - iIndexOf) - 1 == next.m.length()) {
                    String str2 = next.m;
                    if (str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length())) {
                        zEquals = true;
                    }
                }
            } else {
                zEquals = str.equals(next.m);
            }
            if (zEquals) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.thinkup.core.common.no.m.o.mm.n nVar = this.f42073n;
        List<Certificate> listO = nVar != null ? nVar.o(list, str) : list;
        int size = listO.size();
        for (int i3 = 0; i3 < size; i3++) {
            X509Certificate x509Certificate = (X509Certificate) listO.get(i3);
            int size2 = arrayList.size();
            com.thinkup.core.common.no.n.om omVarM = null;
            com.thinkup.core.common.no.n.om omVarO0 = null;
            for (int i4 = 0; i4 < size2; i4++) {
                m mVar = (m) arrayList.get(i4);
                if (mVar.f42074n.equals("sha256/")) {
                    if (omVarM == null) {
                        omVarM = m(x509Certificate);
                    }
                    if (mVar.o0.equals(omVarM)) {
                        return;
                    }
                } else if (mVar.f42074n.equals("sha1/")) {
                    if (omVarO0 == null) {
                        omVarO0 = com.thinkup.core.common.no.n.om.o(x509Certificate.getPublicKey().getEncoded()).o0();
                    }
                    if (mVar.o0.equals(omVarO0)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + mVar.f42074n);
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = listO.size();
        for (int i5 = 0; i5 < size3; i5++) {
            X509Certificate x509Certificate2 = (X509Certificate) listO.get(i5);
            sb.append("\n    ");
            sb.append(o((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        int size4 = arrayList.size();
        for (i2 = 0; i2 < size4; i2++) {
            m mVar2 = (m) arrayList.get(i2);
            sb.append("\n    ");
            sb.append(mVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
