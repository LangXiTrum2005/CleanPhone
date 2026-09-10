package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public class WebMessageListenerAdapter implements WebMessageListenerBoundaryInterface {
    public final WebViewCompat.WebMessageListener X;

    public WebMessageListenerAdapter(WebViewCompat.WebMessageListener webMessageListener) {
        this.X = webMessageListener;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z2, InvocationHandler invocationHandler2) {
        WebMessageCompat webMessageCompatA = WebMessageAdapter.a((WebMessageBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (webMessageCompatA != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            this.X.onPostMessage(webView, webMessageCompatA, uri, z2, (JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new b(jsReplyProxyBoundaryInterface, 0)));
        }
    }
}
