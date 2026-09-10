package energid;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: WebkitToCompatConverter.java */
/* JADX INFO: loaded from: classes.dex */
public class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f25862attabal;

    public trm(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f25862attabal = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse attabal(InvocationHandler invocationHandler) {
        return stratoscope.attabal(this.f25862attabal.convertSafeBrowsingResponse(invocationHandler));
    }

    public WebResourceError dern(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f25862attabal.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler saneness(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f25862attabal.convertSafeBrowsingResponse(safeBrowsingResponse);
    }
}
