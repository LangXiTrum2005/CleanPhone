package tj;

import android.net.http.SslError;
import android.util.Log;
import android.webkit.WebStorage;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements xi.c, xi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50919b;

    public /* synthetic */ v(Object obj, int i10) {
        this.f50918a = i10;
        this.f50919b = obj;
    }

    @Override // xi.c
    public void e(Object obj) {
        int i10 = this.f50918a;
        Object obj2 = ((f) this.f50919b).f50823b;
        switch (i10) {
            case 0:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", "", "Certificate", obj2);
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj3 = list.get(0);
                        kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj3, (String) obj4, (String) list.get(2)), "Certificate", obj2);
                    }
                }
                break;
            case 1:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", "", "ClientCertRequest", obj2);
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj5 = list2.get(0);
                        kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                        Object obj6 = list2.get(1);
                        kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj5, (String) obj6, (String) list2.get(2)), "ClientCertRequest", obj2);
                    }
                }
                break;
            case 2:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", "", "ConsoleMessage", obj2);
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj7 = list3.get(0);
                        kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type kotlin.String");
                        Object obj8 = list3.get(1);
                        kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj7, (String) obj8, (String) list3.get(2)), "ConsoleMessage", obj2);
                    }
                }
                break;
            case 3:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", "", "CookieManager", obj2);
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj9 = list4.get(0);
                        kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.String");
                        Object obj10 = list4.get(1);
                        kotlin.jvm.internal.n.d(obj10, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj9, (String) obj10, (String) list4.get(2)), "CookieManager", obj2);
                    }
                }
                break;
            case 4:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", "", "CustomViewCallback", obj2);
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj11 = list5.get(0);
                        kotlin.jvm.internal.n.d(obj11, "null cannot be cast to non-null type kotlin.String");
                        Object obj12 = list5.get(1);
                        kotlin.jvm.internal.n.d(obj12, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj11, (String) obj12, (String) list5.get(2)), "CustomViewCallback", obj2);
                    }
                }
                break;
            case 5:
            case 10:
            case 16:
            case 25:
            default:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance'.", "", "WebViewPoint", obj2);
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj13 = list6.get(0);
                        kotlin.jvm.internal.n.d(obj13, "null cannot be cast to non-null type kotlin.String");
                        Object obj14 = list6.get(1);
                        kotlin.jvm.internal.n.d(obj14, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj13, (String) obj14, (String) list6.get(2)), "WebViewPoint", obj2);
                    }
                }
                break;
            case 6:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", "", "FileChooserParams", obj2);
                } else {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj15 = list7.get(0);
                        kotlin.jvm.internal.n.d(obj15, "null cannot be cast to non-null type kotlin.String");
                        Object obj16 = list7.get(1);
                        kotlin.jvm.internal.n.d(obj16, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj15, (String) obj16, (String) list7.get(2)), "FileChooserParams", obj2);
                    }
                }
                break;
            case 7:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", "", "FlutterAssetManager", obj2);
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj17 = list8.get(0);
                        kotlin.jvm.internal.n.d(obj17, "null cannot be cast to non-null type kotlin.String");
                        Object obj18 = list8.get(1);
                        kotlin.jvm.internal.n.d(obj18, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj17, (String) obj18, (String) list8.get(2)), "FlutterAssetManager", obj2);
                    }
                }
                break;
            case 8:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", "", "GeolocationPermissionsCallback", obj2);
                } else {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj19 = list9.get(0);
                        kotlin.jvm.internal.n.d(obj19, "null cannot be cast to non-null type kotlin.String");
                        Object obj20 = list9.get(1);
                        kotlin.jvm.internal.n.d(obj20, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj19, (String) obj20, (String) list9.get(2)), "GeolocationPermissionsCallback", obj2);
                    }
                }
                break;
            case 9:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", "", "HttpAuthHandler", obj2);
                } else {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj21 = list10.get(0);
                        kotlin.jvm.internal.n.d(obj21, "null cannot be cast to non-null type kotlin.String");
                        Object obj22 = list10.get(1);
                        kotlin.jvm.internal.n.d(obj22, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj21, (String) obj22, (String) list10.get(2)), "HttpAuthHandler", obj2);
                    }
                }
                break;
            case 11:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", "", "PermissionRequest", obj2);
                } else {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj23 = list11.get(0);
                        kotlin.jvm.internal.n.d(obj23, "null cannot be cast to non-null type kotlin.String");
                        Object obj24 = list11.get(1);
                        kotlin.jvm.internal.n.d(obj24, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj23, (String) obj24, (String) list11.get(2)), "PermissionRequest", obj2);
                    }
                }
                break;
            case 12:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", "", "PrivateKey", obj2);
                } else {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj25 = list12.get(0);
                        kotlin.jvm.internal.n.d(obj25, "null cannot be cast to non-null type kotlin.String");
                        Object obj26 = list12.get(1);
                        kotlin.jvm.internal.n.d(obj26, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj25, (String) obj26, (String) list12.get(2)), "PrivateKey", obj2);
                    }
                }
                break;
            case 13:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", "", "SslCertificate", obj2);
                } else {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj27 = list13.get(0);
                        kotlin.jvm.internal.n.d(obj27, "null cannot be cast to non-null type kotlin.String");
                        Object obj28 = list13.get(1);
                        kotlin.jvm.internal.n.d(obj28, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj27, (String) obj28, (String) list13.get(2)), "SslCertificate", obj2);
                    }
                }
                break;
            case 14:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", "", "SslCertificateDName", obj2);
                } else {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj29 = list14.get(0);
                        kotlin.jvm.internal.n.d(obj29, "null cannot be cast to non-null type kotlin.String");
                        Object obj30 = list14.get(1);
                        kotlin.jvm.internal.n.d(obj30, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj29, (String) obj30, (String) list14.get(2)), "SslCertificateDName", obj2);
                    }
                }
                break;
            case 15:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", "", "SslError", obj2);
                } else {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj31 = list15.get(0);
                        kotlin.jvm.internal.n.d(obj31, "null cannot be cast to non-null type kotlin.String");
                        Object obj32 = list15.get(1);
                        kotlin.jvm.internal.n.d(obj32, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj31, (String) obj32, (String) list15.get(2)), "SslError", obj2);
                    }
                }
                break;
            case 17:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", "", "SslErrorHandler", obj2);
                } else {
                    List list16 = (List) obj;
                    if (list16.size() > 1) {
                        Object obj33 = list16.get(0);
                        kotlin.jvm.internal.n.d(obj33, "null cannot be cast to non-null type kotlin.String");
                        Object obj34 = list16.get(1);
                        kotlin.jvm.internal.n.d(obj34, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj33, (String) obj34, (String) list16.get(2)), "SslErrorHandler", obj2);
                    }
                }
                break;
            case 18:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", "", "View", obj2);
                } else {
                    List list17 = (List) obj;
                    if (list17.size() > 1) {
                        Object obj35 = list17.get(0);
                        kotlin.jvm.internal.n.d(obj35, "null cannot be cast to non-null type kotlin.String");
                        Object obj36 = list17.get(1);
                        kotlin.jvm.internal.n.d(obj36, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj35, (String) obj36, (String) list17.get(2)), "View", obj2);
                    }
                }
                break;
            case 19:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", "", "WebResourceError", obj2);
                } else {
                    List list18 = (List) obj;
                    if (list18.size() > 1) {
                        Object obj37 = list18.get(0);
                        kotlin.jvm.internal.n.d(obj37, "null cannot be cast to non-null type kotlin.String");
                        Object obj38 = list18.get(1);
                        kotlin.jvm.internal.n.d(obj38, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj37, (String) obj38, (String) list18.get(2)), "WebResourceError", obj2);
                    }
                }
                break;
            case 20:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance'.", "", "WebResourceErrorCompat", obj2);
                } else {
                    List list19 = (List) obj;
                    if (list19.size() > 1) {
                        Object obj39 = list19.get(0);
                        kotlin.jvm.internal.n.d(obj39, "null cannot be cast to non-null type kotlin.String");
                        Object obj40 = list19.get(1);
                        kotlin.jvm.internal.n.d(obj40, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj39, (String) obj40, (String) list19.get(2)), "WebResourceErrorCompat", obj2);
                    }
                }
                break;
            case 21:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", "", "WebResourceRequest", obj2);
                } else {
                    List list20 = (List) obj;
                    if (list20.size() > 1) {
                        Object obj41 = list20.get(0);
                        kotlin.jvm.internal.n.d(obj41, "null cannot be cast to non-null type kotlin.String");
                        Object obj42 = list20.get(1);
                        kotlin.jvm.internal.n.d(obj42, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj41, (String) obj42, (String) list20.get(2)), "WebResourceRequest", obj2);
                    }
                }
                break;
            case 22:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", "", "WebResourceResponse", obj2);
                } else {
                    List list21 = (List) obj;
                    if (list21.size() > 1) {
                        Object obj43 = list21.get(0);
                        kotlin.jvm.internal.n.d(obj43, "null cannot be cast to non-null type kotlin.String");
                        Object obj44 = list21.get(1);
                        kotlin.jvm.internal.n.d(obj44, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj43, (String) obj44, (String) list21.get(2)), "WebResourceResponse", obj2);
                    }
                }
                break;
            case 23:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance'.", "", "WebSettings", obj2);
                } else {
                    List list22 = (List) obj;
                    if (list22.size() > 1) {
                        Object obj45 = list22.get(0);
                        kotlin.jvm.internal.n.d(obj45, "null cannot be cast to non-null type kotlin.String");
                        Object obj46 = list22.get(1);
                        kotlin.jvm.internal.n.d(obj46, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj45, (String) obj46, (String) list22.get(2)), "WebSettings", obj2);
                    }
                }
                break;
            case 24:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance'.", "", "WebStorage", obj2);
                } else {
                    List list23 = (List) obj;
                    if (list23.size() > 1) {
                        Object obj47 = list23.get(0);
                        kotlin.jvm.internal.n.d(obj47, "null cannot be cast to non-null type kotlin.String");
                        Object obj48 = list23.get(1);
                        kotlin.jvm.internal.n.d(obj48, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj47, (String) obj48, (String) list23.get(2)), "WebStorage", obj2);
                    }
                }
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance'.", "", "WebView", obj2);
                } else {
                    List list24 = (List) obj;
                    if (list24.size() > 1) {
                        Object obj49 = list24.get(0);
                        kotlin.jvm.internal.n.d(obj49, "null cannot be cast to non-null type kotlin.String");
                        Object obj50 = list24.get(1);
                        kotlin.jvm.internal.n.d(obj50, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj49, (String) obj50, (String) list24.get(2)), "WebView", obj2);
                    }
                }
                break;
            case 27:
                if (!(obj instanceof List)) {
                    q4.a.q("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance'.", "", "WebViewClient", obj2);
                } else {
                    List list25 = (List) obj;
                    if (list25.size() > 1) {
                        Object obj51 = list25.get(0);
                        kotlin.jvm.internal.n.d(obj51, "null cannot be cast to non-null type kotlin.String");
                        Object obj52 = list25.get(1);
                        kotlin.jvm.internal.n.d(obj52, "null cannot be cast to non-null type kotlin.String");
                        q4.a.s(new a((String) obj51, (String) obj52, (String) list25.get(2)), "WebViewClient", obj2);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xi.b
    public void t(Object obj, wi.b bVar) {
        List listQ;
        List listQ2;
        List listQ3;
        List listQ4;
        List listQ5;
        int i10 = this.f50918a;
        Object obj2 = this.f50919b;
        switch (i10) {
            case 5:
                o oVar = (o) obj2;
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((c) oVar.f50873a.f23783c).a(((Long) obj3).longValue(), new n(oVar));
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
            case 10:
                l lVar = (l) obj2;
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj4 = list.get(0);
                kotlin.jvm.internal.n.d(obj4, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj4).longValue();
                Object obj5 = list.get(1);
                kotlin.jvm.internal.n.d(obj5, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((c) lVar.f50859a.f23783c).a(jLongValue, new s((String) obj5, lVar));
                    listQ2 = j1.f.C(null);
                    break;
                } catch (Throwable th3) {
                    if (th3 instanceof a) {
                        a aVar2 = th3;
                        listQ2 = xj.o.Q(aVar2.f50793a, aVar2.f50794b, aVar2.f50795c);
                    } else {
                        listQ2 = xj.o.Q(th3.getClass().getSimpleName(), th3.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                    }
                }
                bVar.e(listQ2);
                return;
            case 16:
                h hVar = (h) obj2;
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i11 = 0;
                Object obj6 = list2.get(0);
                kotlin.jvm.internal.n.d(obj6, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj6;
                Object obj7 = list2.get(1);
                kotlin.jvm.internal.n.d(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                k0 k0Var = (k0) obj7;
                try {
                    switch (k0Var) {
                        case DATE_INVALID:
                            i11 = 4;
                            listQ3 = j1.f.C(Boolean.valueOf(sslError.hasError(i11)));
                            bVar.e(listQ3);
                            return;
                        case EXPIRED:
                            i11 = 1;
                            listQ3 = j1.f.C(Boolean.valueOf(sslError.hasError(i11)));
                            bVar.e(listQ3);
                            return;
                        case ID_MISMATCH:
                            i11 = 2;
                            listQ3 = j1.f.C(Boolean.valueOf(sslError.hasError(i11)));
                            bVar.e(listQ3);
                            return;
                        case INVALID:
                            i11 = 5;
                            listQ3 = j1.f.C(Boolean.valueOf(sslError.hasError(i11)));
                            bVar.e(listQ3);
                            return;
                        case NOT_YET_VALID:
                            listQ3 = j1.f.C(Boolean.valueOf(sslError.hasError(i11)));
                            bVar.e(listQ3);
                            return;
                        case UNTRUSTED:
                            i11 = 3;
                            listQ3 = j1.f.C(Boolean.valueOf(sslError.hasError(i11)));
                            bVar.e(listQ3);
                            return;
                        case UNKNOWN:
                            hVar.f50828a.getClass();
                            throw new IllegalArgumentException(k0Var + " doesn't represent a native value.");
                        default:
                            i11 = -1;
                            listQ3 = j1.f.C(Boolean.valueOf(sslError.hasError(i11)));
                            bVar.e(listQ3);
                            return;
                    }
                } catch (Throwable th4) {
                    if (th4 instanceof a) {
                        a aVar3 = th4;
                        listQ3 = xj.o.Q(aVar3.f50793a, aVar3.f50794b, aVar3.f50795c);
                    } else {
                        listQ3 = xj.o.Q(th4.getClass().getSimpleName(), th4.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                    }
                }
                break;
            case 25:
                h hVar2 = (h) obj2;
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj8 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj8, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((c) hVar2.f50828a.f23783c).a(((Long) obj8).longValue(), WebStorage.getInstance());
                    listQ4 = j1.f.C(null);
                    break;
                } catch (Throwable th5) {
                    if (th5 instanceof a) {
                        a aVar4 = th5;
                        listQ4 = xj.o.Q(aVar4.f50793a, aVar4.f50794b, aVar4.f50795c);
                    } else {
                        listQ4 = xj.o.Q(th5.getClass().getSimpleName(), th5.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                    }
                }
                bVar.e(listQ4);
                return;
            default:
                l lVar2 = (l) obj2;
                kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj9 = ((List) obj).get(0);
                kotlin.jvm.internal.n.d(obj9, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((c) lVar2.f50859a.f23783c).a(((Long) obj9).longValue(), new s0(lVar2));
                    listQ5 = j1.f.C(null);
                    break;
                } catch (Throwable th6) {
                    if (th6 instanceof a) {
                        a aVar5 = th6;
                        listQ5 = xj.o.Q(aVar5.f50793a, aVar5.f50794b, aVar5.f50795c);
                    } else {
                        listQ5 = xj.o.Q(th6.getClass().getSimpleName(), th6.toString(), defpackage.e.p("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                    }
                }
                bVar.e(listQ5);
                return;
        }
    }
}
