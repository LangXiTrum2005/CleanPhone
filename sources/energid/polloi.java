package energid;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: compiled from: WebMessageListenerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class polloi implements WebMessageListenerBoundaryInterface {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final http.kowloon.saneness f25857kowloon;

    public polloi(http.kowloon.saneness sanenessVar) {
        this.f25857kowloon = sanenessVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{Features.WEB_MESSAGE_LISTENER, Features.WEB_MESSAGE_ARRAY_BUFFER};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        http.competently competentlyVarSaneness = monoploid.saneness((WebMessageBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler));
        if (competentlyVarSaneness != null) {
            this.f25857kowloon.onPostMessage(webView, competentlyVarSaneness, uri, z, apical.saneness(invocationHandler2));
        }
    }
}
