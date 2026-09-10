package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.p004ironsource.qt;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0957q0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f11508e = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f11510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b4 f11511c;
    private d d;

    /* JADX INFO: renamed from: com.applovin.impl.q0$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f11512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f11513b;

        public long a() {
            return this.f11512a;
        }

        public long b() {
            return this.f11513b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j) {
            this.f11512a = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j) {
            this.f11513b = j;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.q0$c */
    public class c implements Consumer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f11514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f11515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f11516c;
        private final Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f11517e;
        private final b f;
        private final e g;

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:80), block:B:29:0x004e */
        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(b4.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i2;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.g.a(this.f11514a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    C0957q0.this.a(this.f11516c, this.f11514a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (n7.h(com.applovin.impl.sdk.k.o()) && (!this.f11517e || u4.b(bArrD) != u4.a.V2)) {
                                        C0957q0.this.f11509a.t().a(bArrD != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f11514a, this.f11515b.b() != null ? this.f11515b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.g.a(this.f11514a, this.d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName("UTF-8"));
                                    b bVar2 = this.f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f11515b.r()) {
                                            C0957q0.this.d = new d(this.f11515b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f11517e) {
                                        String strB = u4.b(bArrD, C0957q0.this.f11509a.i0(), C0957q0.this.f11509a);
                                        if (strB == null) {
                                            HashMap map = new HashMap(2);
                                            map.put("request", StringUtils.getHostAndPath(this.f11514a));
                                            map.put(qt.f26623n, str);
                                            C0957q0.this.f11509a.F().trackEvent("rdf", map);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.g.a(this.f11514a, C0957q0.this.a(str, this.d), iC);
                                        return;
                                    } catch (Throwable th) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f11514a) + " because of " + th.getClass().getName() + " : " + th.getMessage();
                                        com.applovin.impl.sdk.o unused = C0957q0.this.f11510b;
                                        if (com.applovin.impl.sdk.o.a()) {
                                            C0957q0.this.f11510b.a("ConnectionManager", str2, th);
                                        }
                                        C0957q0.this.f11509a.D().a("ConnectionManager", "failedToParseResponse", th, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f11514a)));
                                        this.g.a(this.f11514a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e2) {
                                    e = e2;
                                }
                            } catch (MalformedURLException e3) {
                                malformedURLException = e3;
                                iC = i2;
                            }
                        } else {
                            try {
                                C0957q0.this.a(this.f11516c, this.f11514a, iC, jE, (Throwable) null);
                                this.g.a(this.f11514a, iC, null, null);
                                return;
                            } catch (MalformedURLException e4) {
                                e = e4;
                                iC = iC;
                            }
                        }
                    } catch (MalformedURLException e5) {
                        e = e5;
                    }
                    malformedURLException = e;
                } catch (Throwable th2) {
                    int iB = dVar.b();
                    try {
                        byte[] bArrF = dVar.f();
                        String str3 = new String(bArrF);
                        if (bArrF != null) {
                            if (this.f11517e) {
                                str3 = u4.b(bArrF, C0957q0.this.f11509a.i0(), C0957q0.this.f11509a);
                            }
                            objA = C0957q0.this.a(str3, this.d);
                        }
                    } catch (Throwable unused2) {
                    }
                    C0957q0.this.a(this.f11516c, this.f11514a, iB, jE, th2);
                    this.g.a(this.f11514a, iB, th2.getMessage(), objA);
                    return;
                }
            } catch (MalformedURLException e6) {
                malformedURLException = e6;
                iC = 0;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.d != null) {
                C0957q0.this.a(this.f11516c, this.f11514a, iC, jE, malformedURLException2);
                this.g.a(this.f11514a, -901, malformedURLException2.getMessage(), null);
            } else {
                C0957q0.this.a(this.f11516c, this.f11514a, iC, jE);
                this.g.a(this.f11514a, this.d, -901);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z2, b bVar, e eVar) {
            this.f11514a = str;
            this.f11515b = aVar;
            this.f11516c = str2;
            this.d = obj;
            this.f11517e = z2;
            this.f = bVar;
            this.g = eVar;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.q0$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f11519a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f11520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f11521c;
        private final long d;

        public d(String str, long j, long j2) {
            this.f11520b = str;
            this.f11521c = j;
            this.d = j2;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f11521c;
        }

        public long c() {
            return this.f11519a;
        }

        public String d() {
            return this.f11520b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!dVar.a(this) || c() != dVar.c() || b() != dVar.b() || a() != dVar.a()) {
                return false;
            }
            String strD = d();
            String strD2 = dVar.d();
            return strD != null ? strD.equals(strD2) : strD2 == null;
        }

        public int hashCode() {
            long jC = c();
            long jB = b();
            int i2 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i2 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.d;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.q0$e */
    public interface e {
        void a(String str, int i2, String str2, Object obj);

        void a(String str, Object obj, int i2);
    }

    public C0957q0(com.applovin.impl.sdk.k kVar) {
        this.f11509a = kVar;
        this.f11510b = kVar.O();
        b4 b4Var = new b4(kVar);
        this.f11511c = b4Var;
        b4Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:77:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x020c A[Catch: all -> 0x013c, TRY_LEAVE, TryCatch #3 {all -> 0x013c, blocks: (B:39:0x0105, B:43:0x012c, B:42:0x0128, B:50:0x0166, B:52:0x017e, B:58:0x01a0, B:73:0x01f2, B:76:0x0201, B:78:0x020c, B:60:0x01a4, B:63:0x01ac, B:68:0x01c3, B:70:0x01c9, B:71:0x01de, B:54:0x018d, B:81:0x0215, B:65:0x01bd), top: B:111:0x0105, inners: #0 }] */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        Throwable th;
        byte[] bytes;
        byte[] bArrA;
        if (aVar != null) {
            String strF = aVar.f();
            String strH = aVar.h();
            if (strF == null) {
                throw new IllegalArgumentException("No endpoint specified");
            }
            if (strH == null) {
                throw new IllegalArgumentException("No method specified");
            }
            if (eVar != null) {
                if (!strF.toLowerCase().startsWith("http")) {
                    String str = "Requested postback submission to non HTTP endpoint " + strF + "; skipping...";
                    com.applovin.impl.sdk.o.h("ConnectionManager", str);
                    eVar.a(strF, AppLovinErrorCodes.INVALID_URL, str, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(strF);
                HashMap map = new HashMap(2);
                boolean zM = aVar.m();
                u4.a aVarA = ((Boolean) this.f11509a.a(x4.o5)).booleanValue() ? u4.a.a(((Integer) this.f11509a.a(x4.l5)).intValue()) : aVar.e();
                long jA = n7.a(this.f11509a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map mapI = aVar.i();
                    Boolean bool = (Boolean) this.f11509a.a(x4.i3);
                    if (mapI != null && aVar.c() > 0) {
                        mapI.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (zM) {
                        String strA = n7.a(mapI, bool.booleanValue());
                        String strB = u4.b(strA, jA, aVarA, this.f11509a.i0(), this.f11509a);
                        if (StringUtils.isValidString(strA) && TextUtils.isEmpty(strB)) {
                            map.put("query", strA);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, "p", strB);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, mapI, bool.booleanValue());
                    }
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean boolEndsWith = StringUtils.endsWith(StringUtils.getHostAndPath(httpsString), f11508e);
                    if (com.applovin.impl.sdk.o.a()) {
                        try {
                            com.applovin.impl.sdk.o oVar = this.f11510b;
                            StringBuilder sb = new StringBuilder("Sending ");
                            sb.append(strH);
                            sb.append(" request to id=#");
                            sb.append(httpsString.hashCode());
                            sb.append(" \"");
                            sb.append(boolEndsWith.booleanValue() ? httpsString : StringUtils.getHostAndPath(httpsString));
                            sb.append("\"...");
                            oVar.d("ConnectionManager", sb.toString());
                        } catch (Throwable th2) {
                            th = th2;
                            strH = strH;
                        }
                    }
                    b4.c.a aVarA2 = new b4.c.a().a(httpsString).b(strH).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (zM) {
                            bytes = u4.a(aVar.b().toString(), jA, aVarA, this.f11509a.i0(), this.f11509a);
                            if (bytes == null) {
                                map.put("body", aVar.b().toString());
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes("UTF-8");
                        }
                        byte[] bArr = bytes;
                        if ((!zM || aVarA != u4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.f11509a.a(x4.J5)).intValue()) {
                            try {
                                bArrA = n7.a(bArr);
                            } catch (Throwable th3) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f11510b.a("ConnectionManager", "Failed to gzip POST body for request " + a(httpsString), th3);
                                }
                                this.f11509a.D().a("ConnectionManager", com.smartdigimkt.o0.b.d, th3, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(httpsString)));
                                bArrA = null;
                            }
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && bArrA != null) {
                                aVarA2.a("Content-Encoding", com.smartdigimkt.o0.b.d);
                                aVarA2.a(bArrA);
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        } else {
                            bArrA = null;
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o()) {
                                if (bArr != null) {
                                    aVarA2.a(bArr);
                                }
                            } else if (bArr != null) {
                                aVarA2.a(bArr);
                            }
                        }
                        a(strH, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                        eVar.a(httpsString, 0, th.getMessage(), null);
                    }
                    if (!map.isEmpty()) {
                        map.put("request", StringUtils.getHostAndPath(httpsString));
                        this.f11509a.F().trackEvent("ref", map);
                    }
                    String str2 = httpsString;
                    try {
                        httpsString = str2;
                        try {
                            this.f11511c.a(aVarA2.a(new c(str2, aVar, strH, aVar.d(), zM, bVar, eVar)).a(this.f11509a.q0().c()).a());
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            a(strH, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                            eVar.a(httpsString, 0, th.getMessage(), null);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        httpsString = str2;
                        th = th;
                        a(strH, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th);
                        eVar.a(httpsString, 0, th.getMessage(), null);
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } else {
                throw new IllegalArgumentException("No callback specified");
            }
        } else {
            throw new IllegalArgumentException("No request specified");
        }
    }

    public d a() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(String str, Object obj) {
        if (obj == null) {
            return str;
        }
        if (str != null && str.length() >= 3) {
            if (obj instanceof JSONObject) {
                return new JSONObject(str);
            }
            if (obj instanceof p8) {
                return q8.a(str, this.f11509a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f11510b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i2, long j) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f11510b;
            StringBuilder sbZ = android.support.v4.media.a.z("Successful ", str, " returned ", i2, " in ");
            sbZ.append(j / 1000.0f);
            sbZ.append(" s over ");
            sbZ.append(AbstractC0958r0.g(this.f11509a));
            sbZ.append(" to ");
            sbZ.append(a(str2));
            oVar.d("ConnectionManager", sbZ.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i2, long j, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f11510b;
            StringBuilder sbZ = android.support.v4.media.a.z("Failed ", str, " returned ", i2, " in ");
            sbZ.append(j / 1000.0f);
            sbZ.append(" s over ");
            sbZ.append(AbstractC0958r0.g(this.f11509a));
            sbZ.append(" to ");
            sbZ.append(a(str2));
            oVar.a("ConnectionManager", sbZ.toString(), th);
        }
    }

    private String a(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }
}
