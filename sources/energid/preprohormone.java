package energid;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: WebViewProviderFactoryAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class preprohormone implements rotuma {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f25858attabal;

    public preprohormone(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f25858attabal = webViewProviderFactoryBoundaryInterface;
    }

    @Override // energid.rotuma
    public void attabal(http.monoploid monoploidVar, http.kowloon.dern dernVar) {
        this.f25858attabal.startUpWebView(BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new cuirassed(monoploidVar)), BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new cord(dernVar)));
    }

    @Override // energid.rotuma
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebViewProviderBoundaryInterface.class, this.f25858attabal.createWebView(webView));
    }

    @Override // energid.rotuma
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(DropDataContentProviderBoundaryInterface.class, this.f25858attabal.getDropDataProvider());
    }

    @Override // energid.rotuma
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(ProfileStoreBoundaryInterface.class, this.f25858attabal.getProfileStore());
    }

    @Override // energid.rotuma
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(StaticsBoundaryInterface.class, this.f25858attabal.getStatics());
    }

    @Override // energid.rotuma
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebkitToCompatConverterBoundaryInterface.class, this.f25858attabal.getWebkitToCompatConverter());
    }

    @Override // energid.rotuma
    public String[] saneness() {
        return this.f25858attabal.getSupportedFeatures();
    }
}
