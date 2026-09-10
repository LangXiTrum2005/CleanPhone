package r1;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import cc.a2;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import l7.m0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tj.k0;
import tj.p0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements l1.k, o8.g, n2.n, q7.m, tc.a, xi.b, xi.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49335a;

    public /* synthetic */ q(int i10) {
        this.f49335a = i10;
    }

    @Override // q7.m
    public void c(boolean z10) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2;
        switch (this.f49335a) {
            case 6:
                if (z10) {
                    synchronized (u7.a.f51909b) {
                        try {
                            l7.s sVar = l7.s.f45212a;
                            if (m0.c()) {
                                ne.c.r();
                            }
                            if (u7.a.f51910c != null) {
                                Log.w("u7.a", "Already enabled!");
                            } else {
                                u7.a aVar = new u7.a(Thread.getDefaultUncaughtExceptionHandler());
                                u7.a.f51910c = aVar;
                                Thread.setDefaultUncaughtExceptionHandler(aVar);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (q7.p.b(q7.n.CrashShield)) {
                        a.a.f3312b = true;
                        if (m0.c() && !q7.e0.u()) {
                            File fileT = a2.t();
                            if (fileT == null) {
                                fileArrListFiles = new File[0];
                            } else {
                                fileArrListFiles = fileT.listFiles(new fc.a(5));
                                if (fileArrListFiles == null) {
                                    fileArrListFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                s7.c cVarC = android.support.v4.media.session.a.C(file);
                                if (cVarC.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", cVarC.toString());
                                        String str = l7.b0.f45085j;
                                        arrayList.add(j2.n.A(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{l7.s.c()}, 1)), jSONObject, new l7.b(cVarC, 2)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                l7.d0 d0Var = new l7.d0(arrayList);
                                String str2 = l7.b0.f45085j;
                                q7.f.m(d0Var);
                                new l7.c0(d0Var).executeOnExecutor(l7.s.d(), new Void[0]);
                            }
                        }
                        v7.a.f52495b = true;
                    }
                    q7.p.b(q7.n.ThreadCheck);
                    return;
                }
                return;
            case 7:
                if (z10) {
                    l7.s sVar2 = l7.s.f45212a;
                    if (!m0.c() || q7.e0.u()) {
                        return;
                    }
                    File fileT2 = a2.t();
                    if (fileT2 == null) {
                        fileArrListFiles2 = new File[0];
                    } else {
                        fileArrListFiles2 = fileT2.listFiles(new fc.a(6));
                        kotlin.jvm.internal.n.e(fileArrListFiles2, "reportDir.listFiles { _,…OR_REPORT_PREFIX)))\n    }");
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (File file2 : fileArrListFiles2) {
                        kotlin.jvm.internal.n.f(file2, "file");
                        w7.a aVar2 = new w7.a();
                        String name = file2.getName();
                        kotlin.jvm.internal.n.e(name, "file.name");
                        aVar2.f52991a = name;
                        JSONObject jSONObjectG = a2.G(name);
                        if (jSONObjectG != null) {
                            aVar2.f52993c = Long.valueOf(jSONObjectG.optLong("timestamp", 0L));
                            aVar2.f52992b = jSONObjectG.optString("error_message", null);
                        }
                        if (aVar2.f52992b != null && aVar2.f52993c != null) {
                            arrayList2.add(aVar2);
                        }
                    }
                    xj.s.Z(new b2.j(22), arrayList2);
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < arrayList2.size() && i10 < 1000; i10++) {
                        jSONArray.put(arrayList2.get(i10));
                    }
                    a2.J("error_reports", jSONArray, new l7.b(arrayList2, 3));
                    return;
                }
                return;
            default:
                if (z10) {
                    AtomicBoolean atomicBoolean = t7.c.f50559a;
                    synchronized (t7.c.class) {
                        try {
                            if (v7.a.b(t7.c.class)) {
                                return;
                            }
                            try {
                                if (t7.c.f50559a.getAndSet(true)) {
                                    return;
                                }
                                l7.s sVar3 = l7.s.f45212a;
                                if (m0.c()) {
                                    t7.c.a();
                                }
                                int i11 = t7.a.f50553a;
                                if (!v7.a.b(t7.a.class)) {
                                    try {
                                        t7.a.f50554b.scheduleWithFixedDelay(t7.a.f50556d, 0L, 500L, TimeUnit.MILLISECONDS);
                                    } catch (Throwable th3) {
                                        v7.a.a(t7.a.class, th3);
                                    }
                                }
                                break;
                            } catch (Throwable th4) {
                                v7.a.a(t7.c.class, th4);
                            }
                            return;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                }
                return;
        }
    }

    @Override // n2.n
    public n2.k[] createExtractors() {
        switch (this.f49335a) {
            case 5:
                return new n2.k[]{new s2.c()};
            default:
                return new n2.k[]{new t2.b()};
        }
    }

    @Override // xi.c
    public void e(Object obj) {
        switch (this.f49335a) {
            case 14:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", "");
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj2, (String) obj3, (String) list.get(2)));
                    }
                }
                break;
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", "");
                    int i10 = p0.f50884h;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i11 = p0.f50884h;
                    } else {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i12 = p0.f50884h;
                    }
                }
                break;
            case 16:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", "");
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj6, (String) obj7, (String) list3.get(2)));
                    }
                }
                break;
            case 22:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", "");
                    int i13 = p0.f50884h;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i14 = p0.f50884h;
                    } else {
                        Object obj8 = list4.get(0);
                        kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i15 = p0.f50884h;
                    }
                }
                break;
            case 23:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", "");
                    int i16 = p0.f50884h;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i17 = p0.f50884h;
                    } else {
                        Object obj10 = list5.get(0);
                        kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i18 = p0.f50884h;
                    }
                }
                break;
            case 24:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", "");
                    int i19 = p0.f50884h;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i20 = p0.f50884h;
                    } else {
                        Object obj12 = list6.get(0);
                        kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i21 = p0.f50884h;
                    }
                }
                break;
            case 25:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", "");
                    int i22 = p0.f50884h;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i23 = p0.f50884h;
                    } else {
                        Object obj14 = list7.get(0);
                        kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i24 = p0.f50884h;
                    }
                }
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", "");
                    int i25 = p0.f50884h;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i26 = p0.f50884h;
                    } else {
                        Object obj16 = list8.get(0);
                        kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i27 = p0.f50884h;
                    }
                }
                break;
            case 27:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", "");
                    int i28 = p0.f50884h;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i29 = p0.f50884h;
                    } else {
                        Object obj18 = list9.get(0);
                        kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new tj.a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i30 = p0.f50884h;
                    }
                }
                break;
        }
    }

    @Override // l1.k
    public void invoke(Object obj) {
        qj.x xVar;
        p1.d0 d0Var;
        i2.p pVar;
        switch (this.f49335a) {
            case 0:
                y yVar = (y) obj;
                yVar.getClass();
                a0.f49222c0.getAndDecrement();
                qj.x xVar2 = yVar.f49397b.f49237n;
                if (xVar2 != null) {
                    int i10 = yVar.f49396a.f49310a;
                    b0 b0Var = new b0();
                    l2.v vVar = ((c0) xVar2.f49096b).F0;
                    Handler handler = vVar.f44941a;
                    if (handler != null) {
                        handler.post(new l(vVar, b0Var, 0));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                y yVar2 = (y) obj;
                a0 a0Var = yVar2.f49397b;
                if (yVar2.equals(a0Var.f49234j) && (xVar = a0Var.f49237n) != null && a0Var.O && (d0Var = ((c0) xVar.f49096b).I) != null) {
                    d0Var.a();
                    return;
                }
                return;
            case 2:
                y yVar3 = (y) obj;
                a0 a0Var2 = yVar3.f49397b;
                if (yVar3.equals(a0Var2.f49234j)) {
                    a0Var2.N = true;
                    return;
                }
                return;
            default:
                qj.x xVar3 = ((x) obj).f49395a.f49237n;
                if (xVar3 != null) {
                    c0 c0Var = (c0) xVar3.f49096b;
                    synchronized (c0Var.f47905a) {
                        pVar = c0Var.f47921r;
                        break;
                    }
                    if (pVar != null) {
                        synchronized (pVar.f42819c) {
                            pVar.f42822f.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // xi.b
    public void t(Object obj, wi.b bVar) {
        List listQ;
        List listQ2;
        List listQ3;
        List listQ4;
        List listQ5;
        List listQ6;
        List listQ7;
        k0 k0Var;
        List listQ8;
        List listQ9;
        List listQ10;
        switch (this.f49335a) {
            case 11:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
                    listQ = j1.f.C(null);
                    break;
                } catch (Throwable th2) {
                    if (th2 instanceof tj.a) {
                        tj.a aVar = th2;
                        listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                    } else {
                        listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                    }
                }
                bVar.e(listQ);
                return;
            case 12:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        listQ2 = j1.f.C(((Certificate) obj3).getEncoded());
                    } catch (Throwable th3) {
                        if (th3 instanceof tj.a) {
                            tj.a aVar2 = th3;
                            listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                        } else {
                            listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                        }
                    }
                    bVar.e(listQ2);
                    return;
                } catch (CertificateEncodingException e10) {
                    throw new RuntimeException(e10);
                }
            case 13:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
                    listQ3 = j1.f.C(null);
                    break;
                } catch (Throwable th4) {
                    if (th4 instanceof tj.a) {
                        tj.a aVar3 = th4;
                        listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                    } else {
                        listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                bVar.e(listQ3);
                return;
            case 14:
            case 16:
            default:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj5 = list.get(0);
                kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj5;
                Object obj6 = list.get(1);
                kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    ne.a.w(webSettings, ((Boolean) obj6).booleanValue());
                    listQ10 = j1.f.C(null);
                    break;
                } catch (Throwable th5) {
                    if (th5 instanceof tj.a) {
                        tj.a aVar4 = th5;
                        listQ10 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                    } else {
                        listQ10 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                    }
                }
                bVar.e(listQ10);
                return;
            case 15:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj7 = list2.get(0);
                kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj7;
                Object obj8 = list2.get(1);
                kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj8;
                Object obj9 = list2.get(2);
                kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                Object obj10 = list2.get(3);
                kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, zBooleanValue, ((Boolean) obj10).booleanValue());
                    listQ4 = j1.f.C(null);
                    break;
                } catch (Throwable th6) {
                    if (th6 instanceof tj.a) {
                        tj.a aVar5 = th6;
                        listQ4 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                    } else {
                        listQ4 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                    }
                }
                bVar.e(listQ4);
                return;
            case 17:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj11 = list3.get(0);
                kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj11;
                Object obj12 = list3.get(1);
                kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj12).toArray(new String[0]));
                    listQ5 = j1.f.C(null);
                    break;
                } catch (Throwable th7) {
                    if (th7 instanceof tj.a) {
                        tj.a aVar6 = th7;
                        listQ5 = xj.o.Q(aVar6.f50793a, aVar6.f50794b, aVar6.f50795c);
                    } else {
                        listQ5 = xj.o.Q(th7.getClass().getSimpleName(), th7.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                    }
                }
                bVar.e(listQ5);
                return;
            case 18:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj13).deny();
                    listQ6 = j1.f.C(null);
                    break;
                } catch (Throwable th8) {
                    if (th8 instanceof tj.a) {
                        tj.a aVar7 = th8;
                        listQ6 = xj.o.Q(aVar7.f50793a, aVar7.f50794b, aVar7.f50795c);
                    } else {
                        listQ6 = xj.o.Q(th8.getClass().getSimpleName(), th8.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                    }
                }
                bVar.e(listQ6);
                return;
            case 19:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj14).getPrimaryError();
                    if (primaryError == 0) {
                        k0Var = k0.NOT_YET_VALID;
                    } else if (primaryError == 1) {
                        k0Var = k0.EXPIRED;
                    } else if (primaryError == 2) {
                        k0Var = k0.ID_MISMATCH;
                    } else if (primaryError == 3) {
                        k0Var = k0.UNTRUSTED;
                    } else if (primaryError != 4) {
                        k0Var = primaryError != 5 ? k0.UNKNOWN : k0.INVALID;
                    } else {
                        k0Var = k0.DATE_INVALID;
                    }
                    listQ7 = j1.f.C(k0Var);
                    break;
                } catch (Throwable th9) {
                    if (th9 instanceof tj.a) {
                        tj.a aVar8 = th9;
                        listQ7 = xj.o.Q(aVar8.f50793a, aVar8.f50794b, aVar8.f50795c);
                    } else {
                        listQ7 = xj.o.Q(th9.getClass().getSimpleName(), th9.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                    }
                }
                bVar.e(listQ7);
                return;
            case 20:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj15 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj15).cancel();
                    listQ8 = j1.f.C(null);
                    break;
                } catch (Throwable th10) {
                    if (th10 instanceof tj.a) {
                        tj.a aVar9 = th10;
                        listQ8 = xj.o.Q(aVar9.f50793a, aVar9.f50794b, aVar9.f50795c);
                    } else {
                        listQ8 = xj.o.Q(th10.getClass().getSimpleName(), th10.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                    }
                }
                bVar.e(listQ8);
                return;
            case 21:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj16 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj16).proceed();
                    listQ9 = j1.f.C(null);
                    break;
                } catch (Throwable th11) {
                    if (th11 instanceof tj.a) {
                        tj.a aVar10 = th11;
                        listQ9 = xj.o.Q(aVar10.f50793a, aVar10.f50794b, aVar10.f50795c);
                    } else {
                        listQ9 = xj.o.Q(th11.getClass().getSimpleName(), th11.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                    }
                }
                bVar.e(listQ9);
                return;
        }
    }

    public /* synthetic */ q(Object obj, int i10) {
        this.f49335a = i10;
    }

    @Override // o8.g
    public void a(Exception exc) {
    }

    @Override // tc.a
    public void b(tc.b bVar) {
    }
}
