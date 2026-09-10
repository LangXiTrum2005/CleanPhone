package com.smartdigimkt.b8;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.p004ironsource.ko;
import com.smartdigimkt.sdk.api.AdError;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    private static final String k = "AbsHttpLoader";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f33973l = 1;
    public static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f33974n = 3;
    public static final int o = 699;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f33975p = 700;
    public static final int q = 200;
    public static final String r = "Content-Type";
    public static final String s = "application/json";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f33976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f33977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.smartdigimkt.w7.c f33978c;
    private final com.smartdigimkt.y7.h d = com.smartdigimkt.m6.b.p().n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final com.smartdigimkt.c8.d f33979e;
    private com.smartdigimkt.x7.c f;
    private com.smartdigimkt.z7.b g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f33981i;
    protected long j;

    /* JADX INFO: renamed from: com.smartdigimkt.b8.a$a, reason: collision with other inner class name */
    public class C0446a extends com.smartdigimkt.l7.d {
        final /* synthetic */ int j0;

        public C0446a(int i2) {
            this.j0 = i2;
        }

        @Override // com.smartdigimkt.l7.d
        public void d() {
            com.smartdigimkt.x7.e eVarA;
            String str;
            try {
                byte[] bArrJ = a.this.f33979e.j();
                a aVar = a.this;
                aVar.a(aVar.f33979e, bArrJ);
                a aVar2 = a.this;
                if (aVar2.f33976a) {
                    aVar2.c(this.j0);
                    return;
                }
                aVar2.f33981i = false;
                a aVar3 = a.this;
                aVar3.f33977b = aVar3.f33979e.m();
                String strF = a.this.f();
                a.this.getClass();
                a aVar4 = a.this;
                String str2 = aVar4.f33977b;
                if (aVar4.f33978c != null) {
                    a.this.f33978c.b(this.j0);
                }
                if (a.this.f == null) {
                    a aVar5 = a.this;
                    aVar5.f = aVar5.e();
                }
                if (a.this.f != null && a.this.d != null && (eVarA = a.this.d.a(a.this.f)) != null && eVarA.g()) {
                    int iD = eVarA.d();
                    String strValueOf = String.valueOf(iD);
                    if (iD == 200) {
                        a.this.a(this.j0, eVarA.c(), false);
                        return;
                    }
                    if (iD == 699) {
                        str = "Your App or Placement has been suspended or deleted and no longer obtains strategy.";
                    } else {
                        str = iD == 700 ? "API access restricted due to too many requests. Please reduce requests or try again later." : "";
                    }
                    a.this.a(this.j0, iD, "", com.smartdigimkt.v7.b.a(strValueOf, str), false);
                    return;
                }
                com.smartdigimkt.z7.b bVarA = a.this.g;
                if (bVarA == null) {
                    com.smartdigimkt.z7.f.b bVar = new com.smartdigimkt.z7.f.b();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    bVarA = com.smartdigimkt.z7.g.a(bVar.b(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, timeUnit).a(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, timeUnit).c(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS, timeUnit).a(1).a());
                    a.this.g = bVarA;
                }
                com.smartdigimkt.z7.j jVarA = bVarA.a(new com.smartdigimkt.z7.i.b().c(a.this.f33977b).b(strF).a(a.this.c()).a(bArrJ).a(a.this.d()).a());
                if (!jVarA.a() && !a.this.d(jVarA.f40410b)) {
                    a.this.a(jVarA, this.j0);
                    return;
                }
                a.this.b(jVarA, this.j0);
            } catch (Throwable th) {
                a.this.a(0, 0, th.getMessage(), com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.o, "" + th));
            }
        }
    }

    public a(com.smartdigimkt.c8.d dVar) {
        this.f33979e = dVar;
    }

    private Map<String, String> j() {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        return dVar != null ? dVar.g() : new HashMap();
    }

    public Object a(Map<String, List<String>> map, Object obj) {
        return obj;
    }

    public boolean d(int i2) {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c() {
        Map<String, String> mapJ = j();
        return (mapJ == null || !mapJ.containsKey("Content-Type")) ? "application/json" : mapJ.get("Content-Type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String f() {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        int iL = dVar != null ? dVar.l() : 2;
        return ((iL == 1 || iL == 2) && iL != 2) ? ko.f25535b : ko.f25534a;
    }

    public void a(int i2) {
    }

    public void e(int i2) {
        this.f33976a = true;
        com.smartdigimkt.z7.b bVar = this.g;
        if (bVar != null) {
            bVar.cancel();
        }
    }

    private void b(int i2) {
        C0446a c0446a = new C0446a(i2);
        if (g()) {
            com.smartdigimkt.l7.b.a().a((com.smartdigimkt.l7.d) c0446a, 1);
        } else {
            com.smartdigimkt.l7.b.a().a((com.smartdigimkt.l7.d) c0446a, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> d() {
        Map<String, String> mapJ = j();
        if (mapJ == null) {
            mapJ = new HashMap<>();
        }
        if (!mapJ.containsKey(Command.HTTP_HEADER_USER_AGENT) && com.smartdigimkt.m6.b.p().a("ua")) {
            mapJ.put(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.f.a());
        }
        return mapJ;
    }

    public void a(AdError adError) {
    }

    public void a(String str, AdError adError) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.smartdigimkt.x7.c e() {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        if (dVar != null) {
            return dVar.h();
        }
        return null;
    }

    public void c(int i2) {
        com.smartdigimkt.w7.c cVar = this.f33978c;
        if (cVar != null) {
            cVar.a(i2);
        }
    }

    public void b(int i2, Object obj) {
        a(i2, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.smartdigimkt.z7.j jVar, int i2) {
        String strB;
        JSONObject jSONObject;
        String strTrim;
        int i3 = jVar.f40410b;
        try {
            com.smartdigimkt.z7.k kVar = jVar.f40412e;
            if (kVar == null) {
                strB = "";
            } else if (i()) {
                strB = kVar.c();
            } else {
                strB = kVar.b();
            }
            if (!d(i3) && (i3 == 201 || i3 == 204)) {
                b(i2, a(jVar.f, (Object) null));
                return;
            }
            if (h()) {
                if (!TextUtils.isEmpty(strB)) {
                    strTrim = strB.trim();
                    try {
                        jSONObject = new JSONObject(strTrim);
                    } catch (Throwable unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = new JSONObject();
                    strTrim = "";
                }
                int iOptInt = jSONObject.optInt("code", 0);
                if (iOptInt == 0) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.smartdigimkt.m6.a.e.f36736e);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    b(i2, a(jVar.f, jSONObjectOptJSONObject));
                    return;
                }
                a(i2, -10000, strTrim, com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39192n, a(String.valueOf(iOptInt), jSONObject.optString(com.smartdigimkt.m6.a.e.f))));
                return;
            }
            b(i2, a(jVar.f, strB != null ? strB.trim() : null));
        } catch (Throwable th) {
            a(i2, i3, th.getMessage(), com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.o, th + ""));
        }
    }

    public void a(int i2, com.smartdigimkt.w7.c cVar) {
        this.j = System.currentTimeMillis();
        this.f33976a = false;
        this.f33978c = cVar;
        b(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.c8.d dVar, byte[] bArr) throws IllegalArgumentException {
        if (dVar != null) {
            if (!TextUtils.isEmpty(dVar.m())) {
                if (f().equals(ko.f25535b) && bArr == null) {
                    throw new IllegalArgumentException("req content is null when request method is POST.");
                }
                return;
            }
            throw new IllegalArgumentException("req url is null or empty.");
        }
        throw new IllegalArgumentException("reqEntity is null.");
    }

    public void a(int i2, int i3, String str, AdError adError) {
        a(i2, i3, str, adError, true);
    }

    public void a(int i2, int i3, String str, AdError adError, boolean z2) {
        a(i2, i3, str, adError, z2, false, false);
    }

    private void a(int i2, int i3, String str, AdError adError, boolean z2, boolean z3, boolean z4) {
        if (this.f33981i) {
            return;
        }
        this.f33981i = true;
        if (adError == null) {
            adError = com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.o, str);
        }
        com.smartdigimkt.w7.c cVar = this.f33978c;
        if (cVar != null) {
            cVar.a(i2, str, adError);
        }
        a(i3);
        if (z2) {
            a(i3, (Object) null);
        }
        if (z3) {
            a(adError);
        }
        a(str, adError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, Object obj, boolean z2) {
        if (this.f33981i) {
            return;
        }
        this.f33981i = true;
        com.smartdigimkt.w7.c cVar = this.f33978c;
        if (cVar != null) {
            cVar.a(i2, obj);
        }
        if (z2) {
            a(200, obj);
        }
    }

    public String b() {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        return dVar != null ? dVar.c() : "";
    }

    private void a(int i2, Object obj) {
        com.smartdigimkt.x7.c cVar;
        if (this.d == null || (cVar = this.f) == null) {
            return;
        }
        String strB = cVar.b();
        String strC = this.f.c();
        com.smartdigimkt.x7.e eVarA = com.smartdigimkt.x7.e.a();
        if (obj != null && ("eu_traffic".equals(strC) || "get_area".equals(strC))) {
            eVarA.a(obj);
        }
        long j = this.f33980h;
        if (j > 0) {
            eVarA.a(j);
        }
        eVarA.a(i2);
        eVarA.a(strB);
        this.d.a(eVarA, this.f);
    }

    private void a(com.smartdigimkt.z7.j jVar) {
        Map<String, List<String>> map = jVar.f;
        if (map == null || map.isEmpty() || jVar.f40410b != 699) {
            return;
        }
        try {
            List<String> list = map.get("Req-Next-Time");
            String str = (list == null || list.isEmpty()) ? "" : list.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f33980h = Long.parseLong(str) * 1000;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.z7.j jVar, int i2) {
        String strA;
        boolean z2;
        boolean z3;
        Throwable th = jVar.d;
        int i3 = jVar.f40410b;
        if (i3 != 0) {
            strA = a(String.valueOf(i3), th + "");
        } else {
            strA = th + "";
        }
        String str = strA;
        if (th instanceof UnknownHostException) {
            z3 = false;
            z2 = true;
        } else {
            if (th instanceof ConnectException) {
                z2 = true;
            } else if ((th instanceof SSLException) || (th instanceof SocketException) || (th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
            z3 = z2;
        }
        com.smartdigimkt.v7.a aVarA = com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.o, str);
        a(jVar);
        a(i2, i3, str, aVarA, true, z2, z3);
    }

    public String a() {
        com.smartdigimkt.c8.d dVar = this.f33979e;
        return dVar != null ? dVar.b() : "";
    }

    private String a(String str, String str2) {
        return androidx.datastore.preferences.protobuf.a.n("code='", str, "', msg='", str2, "'");
    }
}
