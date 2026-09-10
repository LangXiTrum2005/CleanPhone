package energid;

import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: compiled from: PrefetchOperationCallbackAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class formularize {

    /* JADX INFO: compiled from: PrefetchOperationCallbackAdapter.java */
    public class attabal implements PrefetchOperationCallbackBoundaryInterface {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ http.saneness f25848attabal;

        public attabal(http.saneness sanenessVar) {
            this.f25848attabal = sanenessVar;
        }

        @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
        public void onFailure(int i, String str, int i2) {
            if (i == 1) {
                this.f25848attabal.onError(new PrefetchNetworkException(str, i2));
            } else {
                this.f25848attabal.onError(new PrefetchException(str));
            }
        }

        @Override // org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface
        public void onSuccess() {
            this.f25848attabal.onResult(null);
        }
    }

    public static InvocationHandler attabal(http.saneness<Void, PrefetchException> sanenessVar) {
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new attabal(sanenessVar));
    }
}
