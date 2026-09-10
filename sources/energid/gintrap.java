package energid;

import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: WebViewProviderAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final WebViewProviderBoundaryInterface f25849attabal;

    public gintrap(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f25849attabal = webViewProviderBoundaryInterface;
    }

    public void attabal(String str, String[] strArr, http.kowloon.saneness sanenessVar) {
        this.f25849attabal.addWebMessageListener(str, strArr, BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new polloi(sanenessVar)));
    }

    public void dern(boolean z) {
        this.f25849attabal.setAudioMuted(z);
    }

    public void saneness(String str) {
        this.f25849attabal.removeWebMessageListener(str);
    }

    public void wireman(String str) {
        this.f25849attabal.setProfile(str);
    }
}
