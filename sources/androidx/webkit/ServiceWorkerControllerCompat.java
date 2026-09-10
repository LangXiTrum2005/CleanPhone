package androidx.webkit;

import android.webkit.ServiceWorkerController;
import androidx.webkit.internal.ServiceWorkerControllerImpl;
import androidx.webkit.internal.WebViewFeatureInternal;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceWorkerControllerCompat {

    public static class LAZY_HOLDER {
        static {
            ServiceWorkerControllerImpl serviceWorkerControllerImpl = new ServiceWorkerControllerImpl();
            WebViewFeatureInternal.f8583a.getClass();
            ServiceWorkerController serviceWorkerController = ServiceWorkerController.getInstance();
            serviceWorkerControllerImpl.f8577a = serviceWorkerController;
            if (serviceWorkerController == null) {
                serviceWorkerControllerImpl.f8577a = ServiceWorkerController.getInstance();
            }
            serviceWorkerControllerImpl.f8577a.getServiceWorkerWebSettings();
        }
    }
}
