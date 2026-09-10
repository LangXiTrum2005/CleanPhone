package tj;

import android.util.Log;
import android.view.View;
import android.webkit.WebStorage;
import android.webkit.WebViewClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import m0.r1;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g0 implements xi.b, xi.c, m0.v, n2.n, tb.d, o8.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50827a;

    public /* synthetic */ g0(int i10) {
        this.f50827a = i10;
    }

    @Override // o8.e
    public Object apply(Object obj) {
        String strY = ud.o0.f52133b.y((ud.n0) obj);
        kotlin.jvm.internal.n.e(strY, "encode(...)");
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = strY.getBytes(an.a.f3768a);
        kotlin.jvm.internal.n.e(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // n2.n
    public n2.k[] createExtractors() {
        switch (this.f50827a) {
            case 19:
                return new n2.k[]{new u3.a()};
            case 20:
                return new n2.k[]{new u3.c()};
            case 21:
                return new n2.k[]{new u3.d(0)};
            case 22:
                return new n2.k[]{new u3.q()};
            default:
                l1.x xVar = new l1.x(0L);
                oa.f0 f0Var = oa.j0.f47265b;
                return new n2.k[]{new u3.t(1, 1, k3.k.f44294p9, xVar, new j0.h(0, n1.f47281e))};
        }
    }

    @Override // xi.c
    public void e(Object obj) {
        switch (this.f50827a) {
            case 1:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", "");
                    int i10 = w0.f50927d;
                } else {
                    List list = (List) obj;
                    if (list.size() <= 1) {
                        int i11 = w0.f50927d;
                    } else {
                        Object obj2 = list.get(0);
                        kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj2, (String) obj3, (String) list.get(2)));
                        int i12 = w0.f50927d;
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", "");
                    int i13 = s0.f50904c;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i14 = s0.f50904c;
                    } else {
                        Object obj4 = list2.get(0);
                        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i15 = s0.f50904c;
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", "");
                    int i16 = s0.f50904c;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() <= 1) {
                        int i17 = s0.f50904c;
                    } else {
                        Object obj6 = list3.get(0);
                        kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj6, (String) obj7, (String) list3.get(2)));
                        int i18 = s0.f50904c;
                    }
                }
                break;
            case 4:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", "");
                    int i19 = s0.f50904c;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i20 = s0.f50904c;
                    } else {
                        Object obj8 = list4.get(0);
                        kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i21 = s0.f50904c;
                    }
                }
                break;
            case 5:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", "");
                    int i22 = s0.f50904c;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i23 = s0.f50904c;
                    } else {
                        Object obj10 = list5.get(0);
                        kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i24 = s0.f50904c;
                    }
                }
                break;
            case 6:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest'.", "");
                    int i25 = s0.f50904c;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i26 = s0.f50904c;
                    } else {
                        Object obj12 = list6.get(0);
                        kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i27 = s0.f50904c;
                    }
                }
                break;
            case 7:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading'.", "");
                    int i28 = s0.f50904c;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i29 = s0.f50904c;
                    } else {
                        Object obj14 = list7.get(0);
                        kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i30 = s0.f50904c;
                    }
                }
                break;
            case 8:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible'.", "");
                    int i31 = s0.f50904c;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i32 = s0.f50904c;
                    } else {
                        Object obj16 = list8.get(0);
                        kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i33 = s0.f50904c;
                    }
                }
                break;
            case 9:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError'.", "");
                    int i34 = s0.f50904c;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i35 = s0.f50904c;
                    } else {
                        Object obj18 = list9.get(0);
                        kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i36 = s0.f50904c;
                    }
                }
                break;
            case 10:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished'.", "");
                    int i37 = s0.f50904c;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i38 = s0.f50904c;
                    } else {
                        Object obj20 = list10.get(0);
                        kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i39 = s0.f50904c;
                    }
                }
                break;
            case 11:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest'.", "");
                    int i40 = s0.f50904c;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        int i41 = s0.f50904c;
                    } else {
                        Object obj22 = list11.get(0);
                        kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i42 = s0.f50904c;
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission'.", "");
                    int i43 = s0.f50904c;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        int i44 = s0.f50904c;
                    } else {
                        Object obj24 = list12.get(0);
                        kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i45 = s0.f50904c;
                    }
                }
                break;
            case 13:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError'.", "");
                    int i46 = s0.f50904c;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        int i47 = s0.f50904c;
                    } else {
                        Object obj26 = list13.get(0);
                        kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i48 = s0.f50904c;
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged'.", "");
                    int i49 = s0.f50904c;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i50 = s0.f50904c;
                    } else {
                        Object obj28 = list14.get(0);
                        kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i51 = s0.f50904c;
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    q4.a.p("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory'.", "");
                    int i52 = s0.f50904c;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() <= 1) {
                        int i53 = s0.f50904c;
                    } else {
                        Object obj30 = list15.get(0);
                        kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                        Object obj31 = list15.get(1);
                        kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type kotlin.String");
                        t9.e.c(new a((String) obj30, (String) obj31, (String) list15.get(2)));
                        int i54 = s0.f50904c;
                    }
                }
                break;
        }
    }

    @Override // tb.d
    public Object g(tb.s sVar) {
        switch (this.f50827a) {
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.f24661a.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f24663c.get();
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                return (ScheduledExecutorService) ExecutorsRegistrar.f24662b.get();
            case 27:
                tb.l lVar = ExecutorsRegistrar.f24661a;
                return ub.l.f51976a;
            default:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(sVar);
        }
    }

    @Override // xi.b
    public void t(Object obj, wi.b bVar) {
        List listQ;
        List listQ2;
        List listQ3;
        switch (this.f50827a) {
            case 0:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj2, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj2).deleteAllData();
                    listQ = j1.f.C(null);
                    break;
                } catch (Throwable th2) {
                    if (th2 instanceof a) {
                        a aVar = th2;
                        listQ = xj.o.Q(aVar.f50793a, aVar.f50794b, aVar.f50795c);
                    } else {
                        listQ = xj.o.Q(th2.getClass().getSimpleName(), th2.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                    }
                }
                bVar.e(listQ);
                return;
            case 16:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type android.webkit.WebViewClient");
                WebViewClient webViewClient = (WebViewClient) obj3;
                Object obj4 = list.get(1);
                kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                try {
                    if (!(webViewClient instanceof s0)) {
                        throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
                    }
                    ((s0) webViewClient).f50906b = zBooleanValue;
                    listQ2 = j1.f.C(null);
                    bVar.e(listQ2);
                    return;
                } catch (Throwable th3) {
                    if (th3 instanceof a) {
                        a aVar2 = th3;
                        listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                    } else {
                        listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                    }
                }
                break;
            default:
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                try {
                    listQ3 = j1.f.C(Boolean.valueOf(a.a.x((String) obj5)));
                    break;
                } catch (Throwable th4) {
                    if (th4 instanceof a) {
                        a aVar3 = th4;
                        listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                    } else {
                        listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                bVar.e(listQ3);
                return;
        }
    }

    public /* synthetic */ g0(Object obj, int i10) {
        this.f50827a = i10;
    }

    @Override // m0.v
    public r1 f(View view, r1 r1Var) {
        return r1Var;
    }
}
