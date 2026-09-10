package androidx.webkit.internal;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f8593a;

    public WebViewProviderFactoryAdapter(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f8593a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final String[] a() {
        return this.f8593a.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewProviderBoundaryInterface.class, this.f8593a.createWebView(webView));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) BoundaryInterfaceReflectionUtil.a(DropDataContentProviderBoundaryInterface.class, this.f8593a.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) BoundaryInterfaceReflectionUtil.a(ProfileStoreBoundaryInterface.class, this.f8593a.getProfileStore());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) BoundaryInterfaceReflectionUtil.a(StaticsBoundaryInterface.class, this.f8593a.getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) BoundaryInterfaceReflectionUtil.a(TracingControllerBoundaryInterface.class, this.f8593a.getTracingController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebkitToCompatConverterBoundaryInterface.class, this.f8593a.getWebkitToCompatConverter());
    }
}
