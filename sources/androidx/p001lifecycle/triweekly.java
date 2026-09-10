package androidx.p001lifecycle;

import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.sakeen;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/apical;", "attabal", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/apical;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class triweekly {
    public static final apical attabal(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.dern().saneness();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, sakeen.saneness(null, 1, null).plus(premeiotic.dern().czestochowa()));
        } while (!lifecycle.dern().attabal(null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.saneness();
        return lifecycleCoroutineScopeImpl;
    }
}
