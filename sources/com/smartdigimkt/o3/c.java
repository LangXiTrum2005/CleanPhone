package com.smartdigimkt.o3;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import com.smartdigimkt.sdk.basead.ui.web.WebLandPageActivity;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.smartdigimkt.o3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f37340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f37341i;
    boolean j;
    private final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    a f37342l;
    com.smartdigimkt.v3.l m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    d f37343n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f37344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f37345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f37346c;

        public boolean a() {
            return System.currentTimeMillis() - this.f37344a <= this.f37345b;
        }
    }

    public c(com.smartdigimkt.o3.a.C0557a c0557a) {
        super(c0557a);
        this.f37340h = "c";
        this.k = 10;
        this.m = null;
        com.smartdigimkt.w6.f fVar = this.f37330c;
        if (fVar != null) {
            this.f37341i = fVar.j();
            com.smartdigimkt.v6.a aVar = this.d;
            if (aVar != null) {
                this.j = com.smartdigimkt.m3.f.a(this.f37330c, aVar.t);
            }
        }
    }

    private String b(String str, com.smartdigimkt.v3.g gVar) throws Throwable {
        String strE;
        if (!com.smartdigimkt.m3.i.b(this.f37330c) || TextUtils.isEmpty(this.f37330c.q())) {
            strE = "";
        } else {
            strE = e(str);
            String strA = com.smartdigimkt.d5.a.a(strE);
            gVar.f39092b = strE;
            gVar.f39093c = strA;
            a(gVar);
        }
        return TextUtils.isEmpty(strE) ? gVar.f39091a : strE;
    }

    private String e(String str) throws Throwable {
        String str2;
        boolean z2 = false;
        String headerField = str;
        for (int i2 = 0; i2 < 10; i2++) {
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                    try {
                        try {
                            httpURLConnection2.setRequestMethod(ko.f25534a);
                            httpURLConnection2.setInstanceFollowRedirects(false);
                            com.smartdigimkt.w6.g gVar = this.d.t;
                            if (gVar != null && com.smartdigimkt.m3.f.a(9, gVar)) {
                                String strW = com.smartdigimkt.n8.c.w();
                                if (!TextUtils.isEmpty(strW)) {
                                    httpURLConnection2.addRequestProperty(Command.HTTP_HEADER_USER_AGENT, strW);
                                }
                            }
                            httpURLConnection2.setConnectTimeout(30000);
                            httpURLConnection2.connect();
                            int responseCode = httpURLConnection2.getResponseCode();
                            if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                                headerField = httpURLConnection2.getHeaderField("Location");
                                if (!com.smartdigimkt.q3.d.d(headerField) && !headerField.contains(".apk") && headerField.startsWith("http")) {
                                    httpURLConnection2.disconnect();
                                    httpURLConnection2.disconnect();
                                }
                                z2 = true;
                            }
                            String str3 = headerField;
                            if (z2 || responseCode == 200) {
                                httpURLConnection2.disconnect();
                                return str3;
                            }
                            try {
                                com.smartdigimkt.i7.d.a(this.d, this.f37330c, str, str3, responseCode + "", "");
                                httpURLConnection2.disconnect();
                                return "";
                            } catch (Exception e2) {
                                e = e2;
                                httpURLConnection = httpURLConnection2;
                                str2 = str3;
                                com.smartdigimkt.i7.d.a(this.d, this.f37330c, str, str2, "", e.getMessage());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                return "";
                            }
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection = httpURLConnection2;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = headerField;
                        httpURLConnection = httpURLConnection2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
                str2 = headerField;
            }
        }
        return "";
    }

    private n f(String str) {
        return c(str);
    }

    public void a(d dVar) {
        this.f37343n = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public String c() throws Throwable {
        String str;
        b bVar = this.f;
        if (bVar != null) {
            bVar.clickStartUI();
            this.f.clickCallback();
        }
        k kVar = this.f37331e;
        if (kVar != null) {
            this.m = kVar.a();
        }
        String strY = "";
        String strK = this.f37330c.k() != null ? this.f37330c.k() : "";
        String str2 = this.d.f;
        if (str2 == null) {
            str2 = "";
        }
        String strA = com.smartdigimkt.q3.e.a(strK.replaceAll("\\{req_id\\}", str2), this.m, System.currentTimeMillis(), this.f37330c, true);
        com.smartdigimkt.v3.g gVar = (com.smartdigimkt.m3.i.b(this.f37330c) && this.f37330c.j() == 4) ? new com.smartdigimkt.v3.g("", "", "") : new com.smartdigimkt.v3.g(strA, "", "");
        a(gVar);
        int iJ = this.f37330c.j();
        if (iJ != 1) {
            if (iJ == 2 || iJ == 3) {
                return b(strA, gVar);
            }
            return iJ != 4 ? gVar.f39091a : a(strA, gVar);
        }
        if (!strA.startsWith("http")) {
            return strA;
        }
        a aVar = this.f37342l;
        boolean z2 = aVar != null && aVar.a();
        if (this.j) {
            strY = this.f37330c.Y();
            if (z2) {
                strY = this.f37342l.f37346c;
            }
        }
        if (z2) {
            if (TextUtils.isEmpty(strY)) {
                str = this.f37342l.f37346c;
            }
            if (TextUtils.isEmpty(str)) {
                return gVar.f39091a;
            }
            return str;
        }
        String strE = e(strA);
        if (TextUtils.isEmpty(strY)) {
            strY = strE;
        }
        if (!TextUtils.isEmpty(strE)) {
            this.f37342l = a(strE);
        }
        str = strY;
        if (TextUtils.isEmpty(str)) {
            return gVar.f39091a;
        }
        return str;
    }

    public n d(String str) {
        n nVarA = n.a(true, "ClickUrlClickAction execute success with MARKET_TYPE");
        boolean z2 = (str == null || str.startsWith("http")) ? false : true;
        if (!com.smartdigimkt.q3.d.b(this.f37329b, str, this.f37330c, this.d) && !z2) {
            if (this.d.t.u0() == 2) {
                com.smartdigimkt.w6.c cVar = new com.smartdigimkt.w6.c();
                cVar.f39469c = this.f37330c;
                cVar.f39471h = this.d;
                cVar.f = str;
                cVar.g = this.g;
                WebLandPageActivity.a(this.f37329b, cVar);
                return nVarA;
            }
            com.smartdigimkt.q3.d.f(str);
        }
        return nVarA;
    }

    @Override // com.smartdigimkt.o3.a, com.smartdigimkt.o3.m
    public n a(String str, e eVar) {
        b bVar;
        n nVarA;
        d dVar;
        Objects.toString(eVar);
        if (eVar == e.HANDLE_SUCCESS) {
            return n.a(true, "ClickUrlClickAction execute success with DeeplinkHandleType.HANDLE_SUCCESS before");
        }
        if (eVar == e.NO_HANDLE && (dVar = this.f37343n) != null) {
            n nVarA2 = dVar.a();
            if (nVarA2.a()) {
                return nVarA2;
            }
            eVar = e.HANDLE_FAIL;
        }
        if ((!TextUtils.isEmpty(this.f37330c.A()) || !TextUtils.isEmpty(this.f37330c.q())) && (bVar = this.f) != null && eVar == e.HANDLE_FAIL) {
            bVar.deeplinkCallback(false);
        }
        if (!TextUtils.isEmpty(this.f37330c.X()) && this.f37330c.j() == 4 && (nVarA = a(this.m)) != null) {
            return nVarA;
        }
        com.smartdigimkt.v3.l lVar = this.m;
        if (lVar != null && lVar.f39137i != null && this.f37330c.j() == 4) {
            com.smartdigimkt.v3.l lVar2 = this.m;
            if (lVar2.f39138l) {
                com.smartdigimkt.s6.c cVarB = com.smartdigimkt.m6.b.p().b();
                boolean z2 = cVarB != null && cVarB.a();
                com.smartdigimkt.v3.a aVar = this.m.f39137i;
                aVar.j = z2 ? cVarB.checkDataFetchType(this.f37330c, this.d) : aVar.j;
            } else {
                lVar2.f39137i.j = 3;
            }
        }
        k kVar = this.f37331e;
        if (kVar != null) {
            kVar.b();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f37330c.Y();
        }
        if (TextUtils.isEmpty(str)) {
            b bVar2 = this.f;
            if (bVar2 != null) {
                bVar2.clickEndUI();
            }
            return n.a(false, "ClickUrlClickAction execute fail with empty url");
        }
        com.smartdigimkt.v6.a aVar2 = this.d;
        if (aVar2 == null || !com.smartdigimkt.q3.d.a(str, aVar2.t)) {
            n nVarB = b(str, eVar);
            b bVar3 = this.f;
            if (bVar3 != null) {
                bVar3.clickEndUI();
            }
            return nVarB;
        }
        Log.d("sdm", "Offer click result FilterDeeplinkByScheme.");
        com.smartdigimkt.i7.d.b(this.f37330c, this.d, 3);
        b bVar4 = this.f;
        if (bVar4 != null) {
            bVar4.clickEndUI();
        }
        return n.a(false, "ClickUrlClickAction execute fail by FilterDeeplinkByScheme");
    }

    private n b(String str, e eVar) {
        int iJ = this.f37330c.j();
        if (iJ != 1) {
            if (iJ != 2) {
                if (iJ != 3) {
                    if (iJ == 4) {
                        return b(str);
                    }
                    if (iJ != 6) {
                        return c(str);
                    }
                    return f(str);
                }
            } else if (eVar != e.HANDLE_SUCCESS_WITH_WEB_CLICK) {
                com.smartdigimkt.q3.d.f(str);
                return n.a(true, "ClickUrlClickAction execute success with BROWSER_TYPE");
            }
            return c(str, eVar);
        }
        return d(str);
    }

    private n b(String str) {
        com.smartdigimkt.v3.l lVar = this.m;
        if (lVar == null || !lVar.f39138l || TextUtils.isEmpty(str) || !com.smartdigimkt.m3.f.a(this.f37329b, this.d, this.f37330c, b(), str, new com.smartdigimkt.m3.m())) {
            com.smartdigimkt.q3.d.f(str);
        }
        return n.a(true, "ClickUrlClickAction execute success with APK_TYPE");
    }

    private n c(String str, e eVar) {
        b bVar = this.f;
        if (bVar != null && !bVar.openInternalWebView(str, this.g)) {
            com.smartdigimkt.w6.c cVar = new com.smartdigimkt.w6.c();
            cVar.f39469c = this.f37330c;
            cVar.f39471h = this.d;
            cVar.f = str;
            cVar.g = this.g;
            cVar.k = (eVar == e.HANDLE_SUCCESS_WITH_WEB_CLICK || eVar == e.HANDLE_DEEPLINK_REFUSE) ? false : true;
            WebLandPageActivity.a(this.f37329b, cVar);
        }
        return n.a(true, "ClickUrlClickAction execute success with INNER_BROWSER_TYPE");
    }

    private String a(String str, com.smartdigimkt.v3.g gVar) throws Throwable {
        String strE;
        com.smartdigimkt.v3.g gVarA;
        if (com.smartdigimkt.m3.i.b(this.f37330c) && TextUtils.isEmpty(gVar.f39091a) && (gVarA = com.smartdigimkt.d5.a.a(this.d, this.f37330c, str)) != null) {
            gVar.f39091a = gVarA.f39091a;
            gVar.f39093c = gVarA.f39093c;
        }
        a aVar = this.f37342l;
        if (aVar != null && aVar.a()) {
            strE = this.f37342l.f37346c;
        } else {
            strE = e(gVar.f39091a);
            if (!TextUtils.isEmpty(strE)) {
                this.f37342l = a(strE);
            }
        }
        gVar.f39092b = strE;
        a(gVar);
        if (TextUtils.isEmpty(strE)) {
            return gVar.f39091a;
        }
        this.m.f39138l = true;
        return strE;
    }

    private n c(String str) {
        if (this.d.t.u0() == 2) {
            com.smartdigimkt.w6.c cVar = new com.smartdigimkt.w6.c();
            cVar.f39469c = this.f37330c;
            cVar.f39471h = this.d;
            cVar.f = str;
            cVar.g = this.g;
            WebLandPageActivity.a(this.f37329b, cVar);
        } else {
            com.smartdigimkt.q3.d.f(str);
        }
        return n.a(true, "ClickUrlClickAction execute success with DEFAULT");
    }

    private void a(com.smartdigimkt.v3.g gVar) {
        com.smartdigimkt.m3.h.a().a(this.f37330c.O(), this.f37330c.L(), gVar);
    }

    private synchronized a a(String str) {
        a aVar;
        aVar = new a();
        aVar.f37346c = str;
        aVar.f37345b = this.d.t.z();
        aVar.f37344a = System.currentTimeMillis();
        return aVar;
    }
}
