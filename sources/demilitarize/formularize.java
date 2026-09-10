package demilitarize;

import androidx.p001lifecycle.peridotite;
import androidx.p001lifecycle.starveling;
import cig.CreationExtras;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewModelProviderImpl.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/starveling;", "VM", "Landroidx/lifecycle/peridotite$dern;", "factory", "Lkurbash/wireman;", "modelClass", "Lcig/attabal;", HandleInvocationsFromAdViewer.KEY_EXTRAS, "attabal", "(Landroidx/lifecycle/peridotite$dern;Lkurbash/wireman;Lcig/attabal;)Landroidx/lifecycle/starveling;", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class formularize {
    public static final <VM extends starveling> VM attabal(peridotite.dern factory, kurbash.wireman<VM> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                return (VM) factory.attabal(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.dern(gibeonite.attabal.saneness(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.saneness(gibeonite.attabal.saneness(modelClass));
        }
    }
}
