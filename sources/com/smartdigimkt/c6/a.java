package com.smartdigimkt.c6;

import com.inmobi.commons.core.configs.AdConfig;
import com.smartdigimkt.sdk.api.AdError;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    protected static final String g = "User-Agent";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f34298h = "Accept-Language";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected static final String f34299i = "Accept";
    protected static final String j = "application/x-www-form-urlencoded,application/json,text/plain,text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    protected static final String k = "Content-Type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected static final String f34300l = "application/json";
    public static final int m = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.v6.a f34302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f34303c;
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected com.smartdigimkt.w7.c f34304e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f34301a = "a";
    int f = 0;

    /* JADX INFO: renamed from: com.smartdigimkt.c6.a$a, reason: collision with other inner class name */
    public class C0453a extends com.smartdigimkt.l7.d {
        final /* synthetic */ int j0;
        final /* synthetic */ String k0;

        public C0453a(int i2, String str) {
            this.j0 = i2;
            this.k0 = str;
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 11331. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        private void b(java.lang.String r13) {
            /*
                Method dump skipped, instruction units count: 1133
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.c6.a.C0453a.b(java.lang.String):void");
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0053  */
        /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // com.smartdigimkt.l7.d
        public void d() {
            String str;
            com.smartdigimkt.w7.c cVar;
            try {
                com.smartdigimkt.w7.c cVar2 = a.this.f34304e;
                if (cVar2 != null) {
                    cVar2.b(this.j0);
                }
                b(this.k0);
            } catch (Exception e2) {
                String str2 = e2 + "";
                com.smartdigimkt.w7.c cVar3 = a.this.f34304e;
                if (cVar3 != null) {
                    cVar3.a(this.j0, str2, com.smartdigimkt.v7.b.a("30001", str2));
                }
            } catch (OutOfMemoryError e3) {
                e = e3;
                System.gc();
                str = e + "";
                cVar = a.this.f34304e;
                if (cVar != null) {
                    cVar.a(this.j0, str, com.smartdigimkt.v7.b.a("30001", str));
                }
            } catch (StackOverflowError e4) {
                e = e4;
                System.gc();
                str = e + "";
                cVar = a.this.f34304e;
                if (cVar != null) {
                    cVar.a(this.j0, str, com.smartdigimkt.v7.b.a("30001", str));
                }
            }
        }
    }

    public a(com.smartdigimkt.v6.a aVar) {
        this.f34302b = aVar;
    }

    public void a(String str, com.smartdigimkt.w7.c cVar) {
        this.f34304e = cVar;
        com.smartdigimkt.l7.b.a().a((com.smartdigimkt.l7.d) new C0453a(9999, str), 10);
    }

    public void b() {
        this.f34303c = true;
    }

    public Map<String, String> a() {
        HashMap mapS = androidx.media3.extractor.text.ttml.a.s("Content-Encoding", com.smartdigimkt.o0.b.d);
        mapS.put("User-Agent", com.smartdigimkt.n8.c.w());
        mapS.put(f34298h, Locale.getDefault().toString());
        mapS.put(f34299i, j);
        mapS.put("Content-Type", "application/json");
        return mapS;
    }

    public InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!com.smartdigimkt.o0.b.d.equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int i2 = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (i2 == -1 || (((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }

    public void a(int i2, Object obj) {
        com.smartdigimkt.w7.c cVar = this.f34304e;
        if (cVar != null) {
            cVar.a(i2, obj);
        }
    }

    public void a(int i2) {
        com.smartdigimkt.w7.c cVar = this.f34304e;
        if (cVar != null) {
            cVar.a(i2);
        }
    }

    public void a(int i2, int i3, String str, AdError adError) {
        com.smartdigimkt.w7.c cVar = this.f34304e;
        if (cVar != null) {
            cVar.a(i2, str, adError);
        }
    }

    public void a(int i2, int i3, ConnectTimeoutException connectTimeoutException) {
        com.smartdigimkt.v7.a aVarA = com.smartdigimkt.v7.b.a("30001", connectTimeoutException + "");
        com.smartdigimkt.w7.c cVar = this.f34304e;
        if (cVar != null) {
            cVar.a(i2, "Connect timeout.", aVarA);
        }
    }
}
