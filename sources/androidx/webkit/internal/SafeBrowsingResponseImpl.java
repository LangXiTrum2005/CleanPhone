package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.SafeBrowsingResponseCompat;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f8575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f8576b;

    @Override // androidx.webkit.SafeBrowsingResponseCompat
    public final void a() {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.d;
        if (o_mr1.b()) {
            if (this.f8575a == null) {
                WebkitToCompatConverter webkitToCompatConverter = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f8590a;
                this.f8575a = a.b(webkitToCompatConverter.f8596a.convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f8576b)));
            }
            this.f8575a.showInterstitial(true);
            return;
        }
        if (!o_mr1.c()) {
            throw WebViewFeatureInternal.a();
        }
        if (this.f8576b == null) {
            WebkitToCompatConverter webkitToCompatConverter2 = WebViewGlueCommunicator.LAZY_COMPAT_CONVERTER_HOLDER.f8590a;
            this.f8576b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.a(SafeBrowsingResponseBoundaryInterface.class, webkitToCompatConverter2.f8596a.convertSafeBrowsingResponse(this.f8575a));
        }
        this.f8576b.showInterstitial(true);
    }
}
