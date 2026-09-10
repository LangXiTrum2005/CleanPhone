package com.applovin.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final List f9124f = Arrays.asList("5.0/i", "4.0/ad", "1.0/mediate");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f9125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f9126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d4 f9127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f9128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f9129e = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f9130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f9131b;

        public long a() {
            return this.f9130a;
        }

        public long b() {
            return this.f9131b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(long j10) {
            this.f9130a = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(long j10) {
            this.f9131b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements l0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.network.a f9133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f9135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f9136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f9137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f9138g;

        /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:80), block:B:29:0x004e */
        @Override // l0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(d4.d dVar) {
            MalformedURLException malformedURLException;
            int iC;
            int i10;
            long jE = dVar.e();
            Object objA = null;
            try {
                try {
                    iC = dVar.c();
                    try {
                        if (iC > 0) {
                            try {
                                if (iC < 200 || iC >= 400) {
                                    this.f9138g.a(this.f9132a, iC, null, null);
                                    return;
                                }
                                try {
                                    b bVar = this.f9137f;
                                    if (bVar != null) {
                                        bVar.a(jE);
                                    }
                                    r0.this.a(this.f9134c, this.f9132a, iC, jE);
                                    byte[] bArrD = dVar.d();
                                    if (q7.h(com.applovin.impl.sdk.l.p()) && (!this.f9136e || w4.b(bArrD) != w4.a.V2)) {
                                        r0.this.f9125a.u().a(bArrD != null ? new String(dVar.d(), Charset.forName("UTF-8")) : "", this.f9132a, this.f9133b.b() != null ? this.f9133b.b().toString() : "");
                                    }
                                    if (bArrD == null) {
                                        this.f9138g.a(this.f9132a, this.f9135d, iC);
                                        return;
                                    }
                                    String str = new String(dVar.d(), Charset.forName("UTF-8"));
                                    b bVar2 = this.f9137f;
                                    if (bVar2 != null) {
                                        bVar2.b(bArrD.length);
                                        if (this.f9133b.r()) {
                                            r0.this.f9128d = new d(this.f9133b.f(), bArrD.length, jE);
                                        }
                                    }
                                    if (this.f9136e) {
                                        String strB = w4.b(bArrD, r0.this.f9125a);
                                        if (strB == null) {
                                            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f9132a));
                                            if (((Boolean) r0.this.f9125a.a(z4.O5)).booleanValue()) {
                                                CollectionUtils.putStringIfValid("details", str, mapHashMap);
                                            }
                                            r0.this.f9125a.E().d(f2.f7868m1, mapHashMap);
                                        }
                                        str = strB;
                                    }
                                    try {
                                        this.f9138g.a(this.f9132a, r0.this.a(str, this.f9135d), iC);
                                        return;
                                    } catch (Throwable th2) {
                                        String str2 = "Unable to parse response from " + StringUtils.getHostAndPath(this.f9132a) + " because of " + th2.getClass().getName() + " : " + th2.getMessage();
                                        com.applovin.impl.sdk.p unused = r0.this.f9126b;
                                        if (com.applovin.impl.sdk.p.a()) {
                                            r0.this.f9126b.a("ConnectionManager", str2, th2);
                                        }
                                        r0.this.f9125a.E().a("ConnectionManager", "failedToParseResponse", th2, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(this.f9132a)));
                                        this.f9138g.a(this.f9132a, AppLovinErrorCodes.INVALID_RESPONSE, str2, null);
                                        return;
                                    }
                                } catch (MalformedURLException e10) {
                                    e = e10;
                                }
                            } catch (MalformedURLException e11) {
                                malformedURLException = e11;
                                iC = i10;
                            }
                        } else {
                            try {
                                r0.this.a(this.f9134c, this.f9132a, iC, jE, (Throwable) null);
                                this.f9138g.a(this.f9132a, iC, null, null);
                                return;
                            } catch (MalformedURLException e12) {
                                e = e12;
                                iC = iC;
                            }
                        }
                    } catch (MalformedURLException e13) {
                        e = e13;
                    }
                    malformedURLException = e;
                } catch (MalformedURLException e14) {
                    malformedURLException = e14;
                    iC = 0;
                }
            } catch (Throwable th3) {
                int iB = dVar.b();
                try {
                    byte[] bArrF = dVar.f();
                    String str3 = new String(bArrF);
                    if (bArrF != null) {
                        if (this.f9136e) {
                            str3 = w4.b(bArrF, r0.this.f9125a);
                        }
                        objA = r0.this.a(str3, this.f9135d);
                    }
                } catch (Throwable unused2) {
                }
                r0.this.a(this.f9134c, this.f9132a, iB, jE, th3);
                this.f9138g.a(this.f9132a, iB, th3.getMessage(), objA);
                return;
            }
            MalformedURLException malformedURLException2 = malformedURLException;
            if (this.f9135d != null) {
                r0.this.a(this.f9134c, this.f9132a, iC, jE, malformedURLException2);
                this.f9138g.a(this.f9132a, -901, malformedURLException2.getMessage(), null);
            } else {
                r0.this.a(this.f9134c, this.f9132a, iC, jE);
                this.f9138g.a(this.f9132a, this.f9135d, -901);
            }
        }

        private c(String str, com.applovin.impl.sdk.network.a aVar, String str2, Object obj, boolean z10, b bVar, e eVar) {
            this.f9132a = str;
            this.f9133b = aVar;
            this.f9134c = str2;
            this.f9135d = obj;
            this.f9136e = z10;
            this.f9137f = bVar;
            this.f9138g = eVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f9140a = System.currentTimeMillis();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f9141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f9142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f9143d;

        public d(String str, long j10, long j11) {
            this.f9141b = str;
            this.f9142c = j10;
            this.f9143d = j11;
        }

        public boolean a(Object obj) {
            return obj instanceof d;
        }

        public long b() {
            return this.f9142c;
        }

        public long c() {
            return this.f9140a;
        }

        public String d() {
            return this.f9141b;
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
            int i10 = ((((int) (jC ^ (jC >>> 32))) + 59) * 59) + ((int) (jB ^ (jB >>> 32)));
            long jA = a();
            String strD = d();
            return (((i10 * 59) + ((int) ((jA >>> 32) ^ jA))) * 59) + (strD == null ? 43 : strD.hashCode());
        }

        public String toString() {
            return "ConnectionManager.RequestMeasurement(timestampMillis=" + c() + ", urlHostAndPathString=" + d() + ", responseSizeBytes=" + b() + ", connectionTimeMillis=" + a() + ")";
        }

        public long a() {
            return this.f9143d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e {
        void a(String str, int i10, String str2, Object obj);

        void a(String str, Object obj, int i10);
    }

    public r0(com.applovin.impl.sdk.l lVar) {
        this.f9125a = lVar;
        this.f9126b = lVar.Q();
        d4 d4Var = new d4(lVar);
        this.f9127c = d4Var;
        d4Var.a();
    }

    private String c(String str) {
        return "#" + str.hashCode() + " \"" + StringUtils.getHostAndPath(str) + "\"";
    }

    public void b(String str) {
        if (((Boolean) this.f9125a.a(z4.f10298z3)).booleanValue()) {
            String hostAndPath = StringUtils.getHostAndPath(str);
            if (TextUtils.isEmpty(hostAndPath)) {
                return;
            }
            this.f9129e.add(hostAndPath);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01fe A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #2 {all -> 0x0134, blocks: (B:38:0x00fb, B:42:0x0124, B:51:0x0162, B:53:0x0172, B:59:0x0194, B:74:0x01e4, B:77:0x01f3, B:79:0x01fe, B:61:0x0198, B:64:0x01a0, B:69:0x01b7, B:71:0x01bd, B:72:0x01d2, B:55:0x0181, B:82:0x0207, B:84:0x021f, B:85:0x022d, B:41:0x0120, B:66:0x01b1), top: B:113:0x00fb, inners: #3 }] */
    public void a(com.applovin.impl.sdk.network.a aVar, b bVar, e eVar) {
        Throwable th2;
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
                    com.applovin.impl.sdk.p.h("ConnectionManager", str);
                    eVar.a(strF, AppLovinErrorCodes.INVALID_URL, str, null);
                    return;
                }
                String httpsString = StringUtils.toHttpsString(strF);
                HashMap map = new HashMap(2);
                boolean zM = aVar.m();
                w4.a aVarA = ((Boolean) this.f9125a.a(z4.f10256t5)).booleanValue() ? w4.a.a(((Integer) this.f9125a.a(z4.f10236q5)).intValue()) : aVar.e();
                long jA = q7.a(this.f9125a);
                if ((aVar.i() != null && !aVar.i().isEmpty()) || aVar.c() > 0) {
                    Map mapI = aVar.i();
                    Boolean bool = (Boolean) this.f9125a.a(z4.n3);
                    if (mapI != null && aVar.c() > 0) {
                        mapI.put("current_retry_attempt", String.valueOf(aVar.c()));
                    }
                    if (zM) {
                        String strA = q7.a(mapI, bool.booleanValue());
                        String strB = w4.b(strA, jA, aVarA, this.f9125a);
                        if (StringUtils.isValidString(strA) && TextUtils.isEmpty(strB)) {
                            CollectionUtils.putStringIfValid("query", strA, map);
                        }
                        httpsString = StringUtils.appendQueryParameter(httpsString, TtmlNode.TAG_P, strB);
                    } else {
                        httpsString = StringUtils.appendQueryParameters(httpsString, mapI, bool.booleanValue());
                    }
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    Boolean boolEndsWith = StringUtils.endsWith(StringUtils.getHostAndPath(httpsString), f9124f);
                    if (com.applovin.impl.sdk.p.a()) {
                        try {
                            com.applovin.impl.sdk.p pVar = this.f9126b;
                            StringBuilder sb2 = new StringBuilder("Sending ");
                            sb2.append(strH);
                            sb2.append(" request to id=#");
                            sb2.append(httpsString.hashCode());
                            sb2.append(" \"");
                            sb2.append(boolEndsWith.booleanValue() ? httpsString : StringUtils.getHostAndPath(httpsString));
                            sb2.append("\"...");
                            pVar.d("ConnectionManager", sb2.toString());
                        } catch (Throwable th3) {
                            th2 = th3;
                            strH = strH;
                        }
                    }
                    d4.c.a aVarA2 = new d4.c.a().a(httpsString).b(strH).a(aVar.g()).a(aVar.l());
                    if (aVar.b() != null) {
                        if (zM != 0) {
                            bytes = w4.a(aVar.b().toString(), jA, aVarA, this.f9125a);
                            if (bytes == null) {
                                CollectionUtils.putStringIfValid("body", aVar.b().toString(), map);
                            }
                        } else {
                            bytes = aVar.b().toString().getBytes("UTF-8");
                        }
                        byte[] bArr = bytes;
                        if ((zM == 0 || aVarA != w4.a.V2) && aVar.o() && bArr != null && bArr.length > ((Integer) this.f9125a.a(z4.P5)).intValue()) {
                            try {
                                bArrA = q7.a(bArr);
                            } catch (Throwable th4) {
                                if (com.applovin.impl.sdk.p.a()) {
                                    this.f9126b.a("ConnectionManager", "Failed to gzip POST body for request " + c(httpsString), th4);
                                }
                                this.f9125a.E().a("ConnectionManager", "gzip", th4, CollectionUtils.hashMap("url", StringUtils.getHostAndPath(httpsString)));
                                bArrA = null;
                            }
                            aVarA2.a("Content-Type", "application/json; charset=utf-8");
                            if (!aVar.o() && bArrA != null) {
                                aVarA2.a("Content-Encoding", "gzip");
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
                        a(strH, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th2);
                        eVar.a(httpsString, 0, th2.getMessage(), null);
                    }
                    if (!map.isEmpty()) {
                        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", StringUtils.getHostAndPath(httpsString));
                        if (((Boolean) this.f9125a.a(z4.O5)).booleanValue()) {
                            CollectionUtils.putStringIfValid("details", new JSONObject(map).toString(), mapHashMap);
                        }
                        this.f9125a.E().a(f2.f7865l1, String.join(",", map.keySet()), mapHashMap);
                    }
                    String str2 = httpsString;
                    try {
                        httpsString = str2;
                        try {
                            this.f9127c.a(aVarA2.a(new c(str2, aVar, strH, aVar.d(), zM, bVar, eVar)).a(this.f9125a.s0().c()).a());
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            a(strH, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th2);
                            eVar.a(httpsString, 0, th2.getMessage(), null);
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        httpsString = str2;
                        th2 = th;
                        a(strH, httpsString, 0, SystemClock.elapsedRealtime() - jElapsedRealtime, th2);
                        eVar.a(httpsString, 0, th2.getMessage(), null);
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            } else {
                throw new IllegalArgumentException("No callback specified");
            }
        } else {
            throw new IllegalArgumentException("No request specified");
        }
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f9129e.contains(str);
    }

    public d a() {
        return this.f9128d;
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
            if (obj instanceof q8) {
                return r8.a(str, this.f9125a);
            }
            if (obj instanceof String) {
                return str;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f9126b.b("ConnectionManager", "Failed to process response of type '" + obj.getClass().getName() + "'");
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9126b.d("ConnectionManager", "Successful " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + s0.g(this.f9125a) + " to " + c(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i10, long j10, Throwable th2) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f9126b.a("ConnectionManager", "Failed " + str + " returned " + i10 + " in " + (j10 / 1000.0f) + " s over " + s0.g(this.f9125a) + " to " + c(str2), th2);
        }
    }
}
