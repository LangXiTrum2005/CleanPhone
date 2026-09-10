package energid;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: WebResourceErrorImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class graveside extends http.taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public WebResourceError f25850attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f25851saneness;

    public graveside(InvocationHandler invocationHandler) {
        this.f25851saneness = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    @Override // http.taiyuan
    public CharSequence attabal() {
        return dern().getDescription();
    }

    public final WebResourceError dern() {
        if (this.f25850attabal == null) {
            this.f25850attabal = dovishness.dern().dern(Proxy.getInvocationHandler(this.f25851saneness));
        }
        return this.f25850attabal;
    }

    @Override // http.taiyuan
    public int saneness() {
        return dern().getErrorCode();
    }

    public graveside(WebResourceError webResourceError) {
        this.f25850attabal = webResourceError;
    }
}
