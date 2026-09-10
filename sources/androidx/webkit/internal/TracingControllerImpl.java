package androidx.webkit.internal;

import androidx.webkit.TracingController;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class TracingControllerImpl extends TracingController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TracingControllerBoundaryInterface f8579a;

    public TracingControllerImpl() {
        ApiFeature.P p2 = WebViewFeatureInternal.g;
        if (p2.b()) {
            android.webkit.TracingController.getInstance();
        } else {
            if (!p2.c()) {
                throw WebViewFeatureInternal.a();
            }
            this.f8579a = WebViewGlueCommunicator.LAZY_FACTORY_HOLDER.f8591a.getTracingController();
        }
    }
}
