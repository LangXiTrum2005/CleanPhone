package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class WebResourceErrorImpl extends WebResourceErrorCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebResourceError f8581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f8582b;

    @Override // androidx.webkit.WebResourceErrorCompat
    public final CharSequence a() {
        WebViewFeatureInternal.f8584b.getClass();
        if (this.f8581a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f8590a;
            this.f8581a = (WebResourceError) webkitToCompatConverter.f8596a.convertWebResourceError(Proxy.getInvocationHandler(this.f8582b));
        }
        return this.f8581a.getDescription();
    }

    @Override // androidx.webkit.WebResourceErrorCompat
    public final int b() {
        WebViewFeatureInternal.f8585c.getClass();
        if (this.f8581a == null) {
            WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f8590a;
            this.f8581a = (WebResourceError) webkitToCompatConverter.f8596a.convertWebResourceError(Proxy.getInvocationHandler(this.f8582b));
        }
        return this.f8581a.getErrorCode();
    }
}
