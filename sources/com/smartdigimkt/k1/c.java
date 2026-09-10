package com.smartdigimkt.k1;

import android.net.Uri;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.h0.l;
import com.smartdigimkt.o0.e;
import com.smartdigimkt.v0.z;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f36143n = "AppletsModel";
    private static final int o = 44993;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f36144p = "UTF-8";
    private static final String q = "install_callback";
    private static final String r = "event_callback";
    private static final String s = "wx_miniprogram";
    private static final String t = "0";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f36145u = "1";
    public static final int v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f36146w = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.smartdigimkt.x.d f36147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f36149c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile d f36150e;
    private boolean f = false;
    private volatile boolean g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f36151h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f36152i = -1;
    private boolean j = false;
    private boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f36153l = "";
    private Map<String, String> m;

    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    public c(com.smartdigimkt.x.d dVar, String str, String str2) {
        this.f36147a = dVar;
        this.f36148b = str;
        this.f36149c = str2;
    }

    private void b(String str) {
        if (this.f36150e == null) {
            return;
        }
        boolean z2 = com.smartdigimkt.b.b.f33800a;
        try {
            this.f36153l = str;
            this.f36150e.a(str);
        } catch (Exception unused) {
            boolean z3 = com.smartdigimkt.b.b.f33800a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f36150e == null) {
            return;
        }
        boolean z2 = com.smartdigimkt.b.b.f33800a;
        try {
            this.f36150e.b(1, "response or result is null", this.d);
        } catch (Exception unused) {
            boolean z3 = com.smartdigimkt.b.b.f33800a;
        }
    }

    private void f() {
        if (this.f36150e == null) {
            return;
        }
        try {
            this.f36150e.a();
        } catch (Exception unused) {
            boolean z2 = com.smartdigimkt.b.b.f33800a;
        }
    }

    private boolean g() {
        com.smartdigimkt.x.d dVar = this.f36147a;
        if (dVar == null) {
            return false;
        }
        int iE1 = dVar.e1();
        return iE1 == 8 || iE1 == 9;
    }

    public String c() {
        return this.f36153l;
    }

    public String d() {
        return this.d;
    }

    public boolean h() {
        return this.f36151h;
    }

    public boolean i() {
        return this.f;
    }

    public boolean j() {
        return this.g;
    }

    public boolean k() {
        if (!this.j) {
            this.j = c("1") && g();
        }
        return this.j;
    }

    public void l() {
        this.g = false;
    }

    private boolean c(String str) {
        try {
            com.smartdigimkt.x.d dVar = this.f36147a;
            if (dVar == null) {
                return false;
            }
            String strP0 = dVar.p0();
            if (TextUtils.isEmpty(strP0)) {
                return false;
            }
            return TextUtils.equals(z.a(strP0, "wx_miniprogram"), str);
        } catch (Exception unused) {
            boolean z2 = com.smartdigimkt.b.b.f33800a;
            return false;
        }
    }

    private boolean d(String str) {
        com.smartdigimkt.x.d.c cVarU1;
        try {
            com.smartdigimkt.x.d dVar = this.f36147a;
            if (dVar != null && (cVarU1 = dVar.U1()) != null && !TextUtils.isEmpty(cVarU1.f())) {
                return TextUtils.equals(z.a(cVarU1.f(), "reqwxurl"), str);
            }
            return false;
        } catch (Exception unused) {
            boolean z2 = com.smartdigimkt.b.b.f33800a;
            return false;
        }
    }

    private String e(String str) {
        return android.support.v4.media.a.s(new StringBuilder(), e.a().f37298a, "?", str);
    }

    public void a(int i2, d dVar) {
        if (this.f36147a == null || TextUtils.isEmpty(this.f36148b)) {
            return;
        }
        boolean z2 = com.smartdigimkt.b.b.f33800a;
        this.g = true;
        if (dVar != null) {
            this.f36150e = dVar;
        }
        f();
        com.smartdigimkt.l1.a aVar = new com.smartdigimkt.l1.a(com.smartdigimkt.m6.b.p().k());
        if (this.m == null) {
            this.m = a(this.f36147a);
        }
        if (this.m == null) {
            return;
        }
        if (i()) {
            a(o, "get wxscheme failed : request times is max");
            return;
        }
        this.f36152i = i2;
        aVar.a(1, e.a().f37298a, new com.smartdigimkt.p0.b(this.m), new com.smartdigimkt.h0.b(5000, 5000, 5000, 6000, 0), new a(this));
    }

    public boolean b(int i2) {
        if (!k()) {
            return false;
        }
        if (i2 != 0) {
            return i2 == 1;
        }
        return d("2");
    }

    public static final class a extends com.smartdigimkt.m1.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f36154e;

        public a(c cVar) {
            this.f36154e = cVar;
        }

        @Override // com.smartdigimkt.m1.a, com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
        public void a(l<JSONObject> lVar) {
            super.a(lVar);
            c cVar = this.f36154e;
            if (cVar == null) {
                return;
            }
            cVar.a(false);
            if (lVar == null || lVar.f35606a == null) {
                this.f36154e.e();
                return;
            }
            try {
                this.f36154e.a(lVar);
            } catch (b e2) {
                this.f36154e.a(-2, e2.getMessage());
            }
        }

        @Override // com.smartdigimkt.m1.a, com.smartdigimkt.h0.f, com.smartdigimkt.h0.e
        public void a(com.smartdigimkt.i0.a aVar) {
            super.a(aVar);
            c cVar = this.f36154e;
            if (cVar == null) {
                return;
            }
            cVar.a(false);
            this.f36154e.a(aVar);
        }
    }

    public void b(boolean z2) {
        this.k = z2;
    }

    public void b() {
        this.f36151h = false;
        this.g = false;
        this.f36150e = null;
    }

    public void a(d dVar) {
        this.f36150e = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.i0.a aVar) {
        int i2;
        String message;
        if (this.f36150e == null) {
            return;
        }
        if (aVar != null) {
            i2 = aVar.f35790a;
            message = aVar.getMessage();
            if (i2 == 10) {
                message = "request timeout";
            }
        } else {
            i2 = -1;
            message = "unKnown";
        }
        if (com.smartdigimkt.b.b.f33800a) {
            String.valueOf(i2);
        }
        try {
            this.f36150e.b(i2, "network error: " + message, this.d);
        } catch (Exception unused) {
            boolean z2 = com.smartdigimkt.b.b.f33800a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(l<JSONObject> lVar) throws b {
        JSONObject jSONObject = lVar.f35606a;
        if (com.smartdigimkt.b.b.f33800a) {
            jSONObject.toString();
        }
        if (jSONObject.has("wx_scheme")) {
            String strOptString = jSONObject.optString("wx_scheme", "");
            if (!TextUtils.isEmpty(strOptString)) {
                this.f36151h = true;
                b(strOptString);
                return;
            }
            throw new b("wx_scheme value is null");
        }
        int iOptInt = jSONObject.optInt("error_code", -1);
        String strOptString2 = jSONObject.optString("error_msg", "");
        if (iOptInt == o) {
            this.f = true;
        }
        a(iOptInt, strOptString2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str) {
        if (this.f36150e == null) {
            return;
        }
        if (com.smartdigimkt.b.b.f33800a) {
            String.valueOf(i2);
        }
        try {
            this.f36150e.a(i2, str, this.d);
        } catch (Exception unused) {
            boolean z2 = com.smartdigimkt.b.b.f33800a;
        }
    }

    private Map<String, String> a(com.smartdigimkt.x.d dVar) {
        String strEncode;
        String queryParameter;
        String queryParameter2;
        Iterator<String> it;
        HashMap map = new HashMap();
        if (dVar != null) {
            try {
                Uri uri = Uri.parse(dVar.p0());
                if (uri != null && uri.getQueryParameterNames() != null) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it2 = uri.getQueryParameterNames().iterator();
                    int i2 = 0;
                    while (true) {
                        strEncode = "";
                        if (it2.hasNext()) {
                            String next = it2.next();
                            if (TextUtils.isEmpty(next)) {
                                it = it2;
                            } else {
                                it = it2;
                                if (!TextUtils.equals(next, "wx_miniprogram")) {
                                    try {
                                        strEncode = uri.getQueryParameter(next);
                                    } catch (Exception unused) {
                                    }
                                    if (TextUtils.equals(next, r) || TextUtils.equals(next, q)) {
                                        try {
                                            strEncode = URLEncoder.encode(strEncode, "UTF-8");
                                        } catch (Exception unused2) {
                                            boolean z2 = com.smartdigimkt.b.b.f33800a;
                                        }
                                    }
                                    sb.append(next);
                                    sb.append(d9.i.f24747b);
                                    sb.append(strEncode);
                                    if (i2 < uri.getQueryParameterNames().size()) {
                                        sb.append(d9.i.f24749c);
                                    }
                                    i2++;
                                }
                            }
                            it2 = it;
                        } else {
                            try {
                                break;
                            } catch (Exception unused3) {
                                boolean z3 = com.smartdigimkt.b.b.f33800a;
                            }
                        }
                        boolean z4 = com.smartdigimkt.b.b.f33800a;
                    }
                    String queryParameter3 = uri.getQueryParameter("app");
                    if (queryParameter3 == null) {
                        queryParameter3 = "";
                    }
                    map.put("app", queryParameter3);
                    try {
                        queryParameter = uri.getQueryParameter("path");
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                    } catch (Exception unused4) {
                        boolean z5 = com.smartdigimkt.b.b.f33800a;
                    }
                    map.put("path", queryParameter);
                    try {
                        queryParameter2 = uri.getQueryParameter("clickid");
                        if (queryParameter2 == null) {
                            queryParameter2 = "";
                        }
                    } catch (Exception unused5) {
                        boolean z6 = com.smartdigimkt.b.b.f33800a;
                    }
                    map.put("clickid", queryParameter2);
                    try {
                        String strEncode2 = URLEncoder.encode(sb.toString(), "UTF-8");
                        if (strEncode2 != null) {
                            strEncode = strEncode2;
                        }
                    } catch (UnsupportedEncodingException unused6) {
                        boolean z7 = com.smartdigimkt.b.b.f33800a;
                    }
                    map.put("query", strEncode);
                    map.put("is_redirect", "0");
                    boolean z8 = com.smartdigimkt.b.b.f33800a;
                    this.d = e("app" + d9.i.f24747b + queryParameter3 + d9.i.f24749c + "path" + d9.i.f24747b + queryParameter + d9.i.f24749c + "query" + d9.i.f24747b + strEncode + d9.i.f24749c + "clickid" + d9.i.f24747b + queryParameter2 + d9.i.f24749c + "is_redirect" + d9.i.f24747b + "1");
                }
            } catch (Exception unused7) {
                boolean z9 = com.smartdigimkt.b.b.f33800a;
            }
        }
        return map;
    }

    public boolean a(int i2) {
        if (j() || !b(i2)) {
            return false;
        }
        if (this.f36152i == -1) {
            return true;
        }
        if (h()) {
            return false;
        }
        int i3 = this.f36152i;
        return (i3 == 0 && i2 == 1) || (i3 == 1 && i2 == 1 && this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        this.g = z2;
    }
}
