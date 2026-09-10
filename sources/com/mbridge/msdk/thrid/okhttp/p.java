package com.mbridge.msdk.thrid.okhttp;

import com.applovin.shadow.okhttp3.HttpUrl;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f36645c = u.a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f36646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f36647b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f36648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f36649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Charset f36650c;

        public a() {
            this(null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f36648a.add(s.a(str, HttpUrl.FORM_ENCODE_SET, false, false, true, true, this.f36650c));
            this.f36649b.add(s.a(str2, HttpUrl.FORM_ENCODE_SET, false, false, true, true, this.f36650c));
            return this;
        }

        public a(Charset charset) {
            this.f36648a = new ArrayList();
            this.f36649b = new ArrayList();
            this.f36650c = charset;
        }

        public p a() {
            return new p(this.f36648a, this.f36649b);
        }
    }

    public p(List<String> list, List<String> list2) {
        this.f36646a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.f36647b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return f36645c;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
        a(dVar, false);
    }

    private long a(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        com.mbridge.msdk.thrid.okio.c cVarA;
        if (z10) {
            cVarA = new com.mbridge.msdk.thrid.okio.c();
        } else {
            cVarA = dVar.a();
        }
        int size = this.f36646a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVarA.writeByte(38);
            }
            cVarA.a(this.f36646a.get(i10));
            cVarA.writeByte(61);
            cVarA.a(this.f36647b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVarA.size();
        cVarA.k();
        return size2;
    }
}
