package energid;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: JavaScriptReplyProxyImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class apical extends http.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final JsReplyProxyBoundaryInterface f25828attabal;

    public apical(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f25828attabal = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object attabal(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new apical(jsReplyProxyBoundaryInterface);
    }

    public static apical saneness(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (apical) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: energid.cutely
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return apical.attabal(jsReplyProxyBoundaryInterface);
            }
        });
    }
}
