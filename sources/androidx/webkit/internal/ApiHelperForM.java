package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForM {

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$1, reason: invalid class name */
    class AnonymousClass1 extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WebMessagePortImpl.a(webMessage);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$2, reason: invalid class name */
    class AnonymousClass2 extends WebMessagePort.WebMessageCallback {
        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            WebMessagePortImpl.a(webMessage);
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.webkit.internal.ApiHelperForM$3, reason: invalid class name */
    class AnonymousClass3 extends WebView.VisualStateCallback {
        @Override // android.webkit.WebView.VisualStateCallback
        public final void onComplete(long j) {
            throw null;
        }
    }
}
