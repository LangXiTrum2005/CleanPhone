package com.inmobi.media;

import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class N9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3262ue f23007c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3333z5 f23008e;
    public final String f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f23009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f23010i;
    public final HashMap j;
    public final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public JSONObject f23011l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public P9 f23012n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23013p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f23014u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C3244tc f23015w;
    public boolean x;

    public N9(String requestType, String str, C3262ue c3262ue, boolean z2, InterfaceC3333z5 interfaceC3333z5, String requestContentType, boolean z3) {
        Intrinsics.f(requestType, "requestType");
        Intrinsics.f(requestContentType, "requestContentType");
        this.f23005a = requestType;
        this.f23006b = str;
        this.f23007c = c3262ue;
        this.d = z2;
        this.f23008e = interfaceC3333z5;
        this.f = requestContentType;
        this.g = z3;
        this.f23009h = "N9";
        this.f23010i = new HashMap();
        this.m = Uc.b();
        this.f23013p = 60000;
        this.q = 60000;
        this.r = true;
        this.t = true;
        this.f23014u = true;
        this.v = true;
        this.x = true;
        if (ko.f25534a.equals(requestType)) {
            this.j = new HashMap();
        } else if (ko.f25535b.equals(requestType)) {
            this.k = new HashMap();
            this.f23011l = new JSONObject();
        }
    }

    public final void a(Function1 onResponse) {
        Intrinsics.f(onResponse, "onResponse");
        InterfaceC3333z5 interfaceC3333z5 = this.f23008e;
        if (interfaceC3333z5 != null) {
            String str = this.f23009h;
            StringBuilder sbA = H6.a(str, "TAG", "executeAsync: ");
            sbA.append(this.f23006b);
            ((A5) interfaceC3333z5).a(str, sbA.toString());
        }
        e();
        if (this.d) {
            C3260uc c3260ucA = a();
            c3260ucA.f24037l = new M9(this, onResponse);
            AbstractC3292wc.f24075a.add(c3260ucA);
            AbstractC3292wc.a(c3260ucA, 0L);
            return;
        }
        InterfaceC3333z5 interfaceC3333z6 = this.f23008e;
        if (interfaceC3333z6 != null) {
            String TAG = this.f23009h;
            Intrinsics.e(TAG, "TAG");
            ((A5) interfaceC3333z6).c(TAG, "Dropping REQUEST FOR GDPR");
        }
        P9 p9 = new P9();
        p9.d = new I9(EnumC3157o4.j, "Network Request dropped as current request is not GDPR compliant.");
        onResponse.invoke(p9);
    }

    public final P9 b() {
        C3324yc c3324ycA;
        I9 i9;
        InterfaceC3333z5 interfaceC3333z5 = this.f23008e;
        if (interfaceC3333z5 != null) {
            String str = this.f23009h;
            StringBuilder sbA = H6.a(str, "TAG", "Executing network request to URL: ");
            sbA.append(this.f23006b);
            ((A5) interfaceC3333z5).c(str, sbA.toString());
        }
        e();
        if (!this.d) {
            InterfaceC3333z5 interfaceC3333z6 = this.f23008e;
            if (interfaceC3333z6 != null) {
                String TAG = this.f23009h;
                Intrinsics.e(TAG, "TAG");
                ((A5) interfaceC3333z6).c(TAG, "Dropping REQUEST FOR GDPR");
            }
            P9 p9 = new P9();
            p9.d = new I9(EnumC3157o4.j, "Network Request dropped as current request is not GDPR compliant.");
            return p9;
        }
        if (this.f23012n != null) {
            InterfaceC3333z5 interfaceC3333z7 = this.f23008e;
            if (interfaceC3333z7 != null) {
                String str2 = this.f23009h;
                StringBuilder sbA2 = H6.a(str2, "TAG", "response has been failed before execute - ");
                P9 p10 = this.f23012n;
                sbA2.append(p10 != null ? p10.d : null);
                ((A5) interfaceC3333z7).c(str2, sbA2.toString());
            }
            P9 p11 = this.f23012n;
            Intrinsics.c(p11);
            return p11;
        }
        C3260uc request = a();
        InterfaceC3333z5 interfaceC3333z8 = this.f23008e;
        if (interfaceC3333z8 != null) {
            String str3 = this.f23009h;
            StringBuilder sbA3 = H6.a(str3, "TAG", "Making network request to: ");
            sbA3.append(request.f24031a);
            ((A5) interfaceC3333z8).c(str3, sbA3.toString());
        }
        Intrinsics.f(request, "request");
        do {
            c3324ycA = H9.a(request, (Function2) null);
            i9 = c3324ycA.f24133a;
        } while ((i9 != null ? i9.f22886a : null) == EnumC3157o4.m);
        P9 response = D4.a(c3324ycA);
        Intrinsics.f(response, "response");
        return response;
    }

    public final String c() {
        String str = this.f;
        if (Intrinsics.a(str, "application/json")) {
            return String.valueOf(this.f23011l);
        }
        if (!Intrinsics.a(str, com.smartdigimkt.o0.b.f37293e)) {
            return "";
        }
        boolean z2 = T9.f23231a;
        T9.a(this.k);
        return T9.a(com.ironsource.d9.i.f24749c, (Map) this.k);
    }

    public final String d() {
        String strM = this.f23006b;
        HashMap map = this.j;
        if (map != null) {
            T9.a(map);
            String strA = T9.a(com.ironsource.d9.i.f24749c, (Map) this.j);
            InterfaceC3333z5 interfaceC3333z5 = this.f23008e;
            if (interfaceC3333z5 != null) {
                String str = this.f23009h;
                ((A5) interfaceC3333z5).c(str, I6.a(str, "TAG", "Get params: ", strA));
            }
            int length = strA.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.h(strA.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            if (strA.subSequence(i2, length + 1).toString().length() > 0) {
                if (strM != null && !StringsKt.l(strM, "?", false)) {
                    strM = strM.concat("?");
                }
                if (strM != null && !StringsKt.p(strM, com.ironsource.d9.i.f24749c, false) && !StringsKt.p(strM, "?", false)) {
                    strM = strM.concat(com.ironsource.d9.i.f24749c);
                }
                strM = android.support.v4.media.a.m(strM, strA);
            }
        }
        Intrinsics.c(strM);
        return strM;
    }

    public final void e() {
        f();
        this.f23010i.put(Command.HTTP_HEADER_USER_AGENT, Uc.k());
        if (ko.f25535b.equals(this.f23005a)) {
            this.f23010i.put("Content-Type", this.f);
            if (this.g) {
                this.f23010i.put("Content-Encoding", com.smartdigimkt.o0.b.d);
            } else {
                this.f23010i.put("Content-Length", String.valueOf(c().length()));
            }
        }
    }

    public void f() {
        HashMap map;
        JSONObject jSONObjectC;
        HashMap map2;
        G4 g4 = G4.f22837a;
        g4.j();
        this.d = g4.a(this.d);
        if (ko.f25534a.equals(this.f23005a)) {
            HashMap map3 = this.j;
            if (this.t) {
                if (map3 != null) {
                    map3.putAll(C2994e1.f23540e);
                }
                if (map3 != null) {
                    map3.putAll(L3.f22938a.a(this.o));
                }
                if (map3 != null) {
                    map3.putAll(Y4.a());
                }
            }
            HashMap map4 = this.j;
            if (this.f23014u) {
                a(map4);
            }
        } else if (ko.f25535b.equals(this.f23005a)) {
            HashMap map5 = this.k;
            if (this.t) {
                if (map5 != null) {
                    map5.putAll(C2994e1.f23540e);
                }
                if (map5 != null) {
                    map5.putAll(L3.f22938a.a(this.o));
                }
                if (map5 != null) {
                    map5.putAll(Y4.a());
                }
            }
            HashMap map6 = this.k;
            if (this.f23014u) {
                a(map6);
            }
        }
        if (this.v && (jSONObjectC = G4.c()) != null) {
            if (ko.f25534a.equals(this.f23005a)) {
                HashMap map7 = this.j;
                if (map7 != null) {
                    String string = jSONObjectC.toString();
                    Intrinsics.e(string, "toString(...)");
                }
            } else if (ko.f25535b.equals(this.f23005a) && (map2 = this.k) != null) {
                String string2 = jSONObjectC.toString();
                Intrinsics.e(string2, "toString(...)");
            }
        }
        if (this.x) {
            if (ko.f25534a.equals(this.f23005a)) {
                HashMap map8 = this.j;
                if (map8 != null) {
                    return;
                }
                return;
            }
            if (!ko.f25535b.equals(this.f23005a) || (map = this.k) == null) {
                return;
            }
        }
    }

    public final C3260uc a() {
        EnumC3212rc method;
        String type = this.f23005a;
        Intrinsics.f(type, "type");
        if (!type.equals(ko.f25534a) && type.equals(ko.f25535b)) {
            method = EnumC3212rc.POST;
        } else {
            method = EnumC3212rc.GET;
        }
        String str = this.f23006b;
        Intrinsics.c(str);
        Intrinsics.f(method, "method");
        C3197qc c3197qc = new C3197qc(str, method);
        boolean z2 = T9.f23231a;
        T9.a(this.f23010i);
        HashMap header = this.f23010i;
        Intrinsics.f(header, "header");
        c3197qc.f23935c = header;
        c3197qc.f23937h = Integer.valueOf(this.f23013p);
        c3197qc.f23938i = Integer.valueOf(this.q);
        c3197qc.f = Boolean.valueOf(this.r);
        c3197qc.j = Boolean.valueOf(this.s);
        C3244tc c3244tc = this.f23015w;
        if (c3244tc != null) {
            c3197qc.g = c3244tc;
        }
        int iOrdinal = method.ordinal();
        if (iOrdinal == 0) {
            HashMap map = this.j;
            if (map != null) {
                InterfaceC3333z5 interfaceC3333z5 = this.f23008e;
                if (interfaceC3333z5 != null) {
                    String TAG = this.f23009h;
                    Intrinsics.e(TAG, "TAG");
                    ((A5) interfaceC3333z5).c(TAG, "getParams " + map);
                }
                c3197qc.d = map;
            }
        } else if (iOrdinal == 1) {
            String postBody = c();
            InterfaceC3333z5 interfaceC3333z6 = this.f23008e;
            if (interfaceC3333z6 != null) {
                String str2 = this.f23009h;
                ((A5) interfaceC3333z6).c(str2, I6.a(str2, "TAG", "httpPostBody ", postBody));
            }
            Intrinsics.f(postBody, "postBody");
            c3197qc.f23936e = postBody;
        }
        return new C3260uc(c3197qc);
    }

    public /* synthetic */ N9(String str, String str2, C3262ue c3262ue, boolean z2, InterfaceC3333z5 interfaceC3333z5, String str3, int i2) {
        this(str, str2, c3262ue, (i2 & 8) != 0 ? false : z2, interfaceC3333z5, (i2 & 32) != 0 ? com.smartdigimkt.o0.b.f37293e : str3, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public N9(String url, InterfaceC3333z5 interfaceC3333z5) {
        this(ko.f25534a, url, (C3262ue) null, false, interfaceC3333z5, com.smartdigimkt.o0.b.f37293e, 64);
        Intrinsics.f(url, "url");
        this.v = false;
    }

    public final void a(HashMap map) {
        V0 v0B;
        String strA;
        C3262ue c3262ue = this.f23007c;
        if (c3262ue == null || map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        try {
            if (c3262ue.f24039a.a() && (v0B = C3246te.f24014a.b()) != null && (strA = v0B.a()) != null) {
                map3.put("GPID", strA);
            }
        } catch (Exception unused) {
        }
        String string = new JSONObject(map3).toString();
        Intrinsics.e(string, "toString(...)");
        map2.put("u-id-map", string);
        map.putAll(map2);
    }
}
