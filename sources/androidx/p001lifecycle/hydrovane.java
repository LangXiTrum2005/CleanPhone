package androidx.p001lifecycle;

import demilitarize.beachfront;
import demilitarize.dern;
import demilitarize.saneness;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"Ldemilitarize/beachfront;", "attabal", "Ldemilitarize/beachfront;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/starveling;", "Lkotlinx/coroutines/saran;", "(Landroidx/lifecycle/starveling;)Lkotlinx/coroutines/saran;", "viewModelScope", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class hydrovane {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f10499attabal = new beachfront();

    public static final saran attabal(starveling starvelingVar) {
        saneness sanenessVarAttabal;
        Intrinsics.checkNotNullParameter(starvelingVar, "<this>");
        synchronized (f10499attabal) {
            sanenessVarAttabal = (saneness) starvelingVar.dern("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (sanenessVarAttabal == null) {
                sanenessVarAttabal = dern.attabal();
                starvelingVar.attabal("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", sanenessVarAttabal);
            }
        }
        return sanenessVarAttabal;
    }
}
