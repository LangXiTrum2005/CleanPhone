package tj;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.measurement.nf;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends defpackage.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nf f50826e;

    public g(nf nfVar) {
        super(10);
        this.f50826e = nfVar;
    }

    public static final void m(String str, Object obj, Throwable th2) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th2);
    }

    @Override // defpackage.h, xi.u
    public final Object f(byte b10, ByteBuffer byteBuffer) {
        if (b10 != -128) {
            return super.f(b10, byteBuffer);
        }
        Object objE = e(byteBuffer);
        kotlin.jvm.internal.n.d(objE, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objE).longValue();
        Object objE2 = ((c) this.f50826e.f23783c).e(jLongValue);
        if (objE2 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objE2;
    }

    @Override // defpackage.h, xi.u
    public final void k(ByteArrayOutputStream stream, Object obj) {
        p pVar;
        i iVar;
        nf nfVar = this.f50826e;
        xi.f fVar = (xi.f) nfVar.f23782b;
        c cVar = (c) nfVar.f23783c;
        kotlin.jvm.internal.n.f(stream, "stream");
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof p) || (obj instanceof i) || (obj instanceof u) || (obj instanceof k0) || (obj instanceof t) || (obj instanceof x0) || obj == null) {
            super.k(stream, obj);
            return;
        }
        Object obj2 = null;
        if (obj instanceof WebResourceRequest) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            f fVar2 = new f(obj, 0);
            if (!cVar.d(webResourceRequest)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", nfVar.e(), obj2).y(xj.o.Q(Long.valueOf(cVar.b(webResourceRequest)), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Boolean.valueOf(webResourceRequest.isRedirect()), Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders()), new v(fVar2, 21));
            }
        } else if (obj instanceof WebResourceResponse) {
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            f fVar3 = new f(obj, 26);
            if (!cVar.d(webResourceResponse)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", nfVar.e(), obj2).y(xj.o.Q(Long.valueOf(cVar.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new v(fVar3, 22));
            }
        } else if (obj instanceof WebResourceError) {
            WebResourceError webResourceError = (WebResourceError) obj;
            f fVar4 = new f(obj, 12);
            if (!cVar.d(webResourceError)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", nfVar.e(), obj2).y(xj.o.Q(Long.valueOf(cVar.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new v(fVar4, 19));
            }
        } else if (obj instanceof r4.e) {
            r4.e eVar = (r4.e) obj;
            f fVar5 = new f(obj, 13);
            if (!cVar.d(eVar)) {
                long jB = cVar.b(eVar);
                s4.j jVar = (s4.j) eVar;
                WebResourceErrorBoundaryInterface webResourceErrorBoundaryInterface = jVar.f50113b;
                if (jVar.f50112a == null) {
                    jVar.f50112a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) s4.n.f50125a.f49529b).convertWebResourceError(Proxy.getInvocationHandler(webResourceErrorBoundaryInterface));
                }
                long errorCode = jVar.f50112a.getErrorCode();
                if (jVar.f50112a == null) {
                    jVar.f50112a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) s4.n.f50125a.f49529b).convertWebResourceError(Proxy.getInvocationHandler(webResourceErrorBoundaryInterface));
                }
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance", nfVar.e(), obj2).y(xj.o.Q(Long.valueOf(jB), Long.valueOf(errorCode), jVar.f50112a.getDescription().toString()), new v(fVar5, 20));
            }
        } else if (obj instanceof u0) {
            u0 u0Var = (u0) obj;
            f fVar6 = new f(obj, 14);
            if (!cVar.d(u0Var)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", nfVar.e(), obj2).y(xj.o.Q(Long.valueOf(cVar.b(u0Var)), Long.valueOf(u0Var.f50916a), Long.valueOf(u0Var.f50917b)), new v(fVar6, 29));
            }
        } else if (obj instanceof ConsoleMessage) {
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            f fVar7 = new f(obj, 15);
            if (!cVar.d(consoleMessage)) {
                long jB2 = cVar.b(consoleMessage);
                long jLineNumber = consoleMessage.lineNumber();
                String strMessage = consoleMessage.message();
                int i10 = j.f50842a[consoleMessage.messageLevel().ordinal()];
                if (i10 == 1) {
                    iVar = i.TIP;
                } else if (i10 == 2) {
                    iVar = i.LOG;
                } else if (i10 == 3) {
                    iVar = i.WARNING;
                } else if (i10 != 4) {
                    iVar = i10 != 5 ? i.UNKNOWN : i.DEBUG;
                } else {
                    iVar = i.ERROR;
                }
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", nfVar.e(), (Object) null).y(xj.o.Q(Long.valueOf(jB2), Long.valueOf(jLineNumber), strMessage, iVar, consoleMessage.sourceId()), new v(fVar7, 2));
            }
        } else if (obj instanceof CookieManager) {
            CookieManager cookieManager = (CookieManager) obj;
            f fVar8 = new f(obj, 16);
            if (!cVar.d(cookieManager)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(cookieManager))), new v(fVar8, 3));
            }
        } else if (obj instanceof WebView) {
            WebView webView = (WebView) obj;
            f fVar9 = new f(obj, 17);
            if (!cVar.d(webView)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(webView))), new v(fVar9, 26));
            }
        } else if (obj instanceof WebSettings) {
            WebSettings webSettings = (WebSettings) obj;
            f fVar10 = new f(obj, 18);
            if (!cVar.d(webSettings)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(webSettings))), new v(fVar10, 23));
            }
        } else if (obj instanceof s) {
            if (!cVar.d((s) obj)) {
                m("JavaScriptChannel", obj, wj.h.a(t9.e.c(new a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof WebViewClient) {
            WebViewClient webViewClient = (WebViewClient) obj;
            f fVar11 = new f(obj, 11);
            if (!cVar.d(webViewClient)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(webViewClient))), new v(fVar11, 27));
            }
        } else if (obj instanceof DownloadListener) {
            if (!cVar.d((DownloadListener) obj)) {
                m("DownloadListener", obj, wj.h.a(t9.e.c(new a("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof p0) {
            if (!cVar.d((p0) obj)) {
                m("WebChromeClient", obj, wj.h.a(t9.e.c(new a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof q) {
            q qVar = (q) obj;
            f fVar12 = new f(obj, 19);
            if (!cVar.d(qVar)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(qVar))), new v(fVar12, 7));
            }
        } else if (obj instanceof WebStorage) {
            WebStorage webStorage = (WebStorage) obj;
            f fVar13 = new f(obj, 20);
            if (!cVar.d(webStorage)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(webStorage))), new v(fVar13, 24));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            f fVar14 = new f(obj, 21);
            if (!cVar.d(fileChooserParams)) {
                long jB3 = cVar.b(fileChooserParams);
                boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List listAsList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                if (mode == 0) {
                    pVar = p.OPEN;
                } else if (mode != 1) {
                    pVar = mode != 3 ? p.UNKNOWN : p.SAVE;
                } else {
                    pVar = p.OPEN_MULTIPLE;
                }
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", nfVar.e(), (Object) null).y(xj.o.Q(Long.valueOf(jB3), Boolean.valueOf(zIsCaptureEnabled), listAsList, pVar, fileChooserParams.getFilenameHint()), new v(fVar14, 6));
            }
        } else if (obj instanceof PermissionRequest) {
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            f fVar15 = new f(obj, 22);
            if (!cVar.d(permissionRequest)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", nfVar.e(), (Object) null).y(xj.o.Q(Long.valueOf(cVar.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new v(fVar15, 11));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            f fVar16 = new f(obj, 23);
            if (!cVar.d(customViewCallback)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(customViewCallback))), new v(fVar16, 4));
            }
        } else if (obj instanceof View) {
            View view = (View) obj;
            f fVar17 = new f(obj, 24);
            if (!cVar.d(view)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(view))), new v(fVar17, 18));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            f fVar18 = new f(obj, 25);
            if (!cVar.d(callback)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(callback))), new v(fVar18, 8));
            }
        } else if (obj instanceof HttpAuthHandler) {
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            f fVar19 = new f(obj, 1);
            if (!cVar.d(httpAuthHandler)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(httpAuthHandler))), new v(fVar19, 9));
            }
        } else if (obj instanceof Message) {
            Message message = (Message) obj;
            f fVar20 = new f(obj, 2);
            if (!cVar.d(message)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(message))), new k3.j(fVar20, 29));
            }
        } else if (obj instanceof ClientCertRequest) {
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            f fVar21 = new f(obj, 3);
            if (!cVar.d(clientCertRequest)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(clientCertRequest))), new v(fVar21, 1));
            }
        } else if (obj instanceof PrivateKey) {
            PrivateKey privateKey = (PrivateKey) obj;
            f fVar22 = new f(obj, 4);
            if (!cVar.d(privateKey)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(privateKey))), new v(fVar22, 12));
            }
        } else if (obj instanceof X509Certificate) {
            X509Certificate x509Certificate = (X509Certificate) obj;
            f fVar23 = new f(obj, 5);
            if (!cVar.d(x509Certificate)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(x509Certificate))), new i0(fVar23, 0));
            }
        } else if (obj instanceof SslErrorHandler) {
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            f fVar24 = new f(obj, 6);
            if (!cVar.d(sslErrorHandler)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(sslErrorHandler))), new v(fVar24, 17));
            }
        } else if (obj instanceof SslError) {
            SslError sslError = (SslError) obj;
            f fVar25 = new f(obj, 7);
            if (!cVar.d(sslError)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", nfVar.e(), (Object) null).y(xj.o.Q(Long.valueOf(cVar.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new v(fVar25, 15));
            }
        } else if (obj instanceof SslCertificate.DName) {
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            f fVar26 = new f(obj, 8);
            if (!cVar.d(dName)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(dName))), new v(fVar26, 14));
            }
        } else if (obj instanceof SslCertificate) {
            SslCertificate sslCertificate = (SslCertificate) obj;
            f fVar27 = new f(obj, 9);
            if (!cVar.d(sslCertificate)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(sslCertificate))), new v(fVar27, 13));
            }
        } else if (obj instanceof Certificate) {
            Certificate certificate = (Certificate) obj;
            f fVar28 = new f(obj, 10);
            if (!cVar.d(certificate)) {
                new k5.g(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", nfVar.e(), (Object) null).y(j1.f.C(Long.valueOf(cVar.b(certificate))), new v(fVar28, 0));
            }
        }
        if (cVar.d(obj)) {
            stream.write(128);
            cVar.f();
            Long l = (Long) cVar.f50802b.get(new b(obj));
            if (l != null) {
                cVar.f50804d.put(l, obj);
            }
            k(stream, l);
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
    }
}
