package attendance;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\t¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r\"(\u0010\u0016\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\"\u0015\u0010\u0018\u001a\u00020\u0010*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", "Lattendance/saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "attabal", "(Landroid/view/View;Lattendance/saneness;)V", "competently", "saneness", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "dern", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "marial", "(Landroid/view/View;)Z", "impromptu", "(Landroid/view/View;Z)V", "isPoolingContainer", "beachfront", "isWithinPoolingContainer", "Lattendance/dern;", "wireman", "(Landroid/view/View;)Lattendance/dern;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int f14740attabal = wireman.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int f14741saneness = wireman.is_pooling_container_tag;

    public static final void attabal(View view, saneness listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        wireman(view).attabal(listener);
    }

    public static final boolean beachfront(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (Object obj : ViewKt.saneness(view)) {
            if ((obj instanceof View) && marial((View) obj)) {
                return true;
            }
        }
        return false;
    }

    public static final void competently(View view, saneness listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        wireman(view).dern(listener);
    }

    public static final void dern(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator<View> it = ViewGroupKt.attabal(viewGroup).iterator();
        while (it.hasNext()) {
            wireman(it.next()).saneness();
        }
    }

    public static final void impromptu(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f14741saneness, Boolean.valueOf(z));
    }

    public static final boolean marial(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f14741saneness);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void saneness(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator<View> it = ViewKt.attabal(view).iterator();
        while (it.hasNext()) {
            wireman(it.next()).saneness();
        }
    }

    public static final dern wireman(View view) {
        int i = f14740attabal;
        dern dernVar = (dern) view.getTag(i);
        if (dernVar != null) {
            return dernVar;
        }
        dern dernVar2 = new dern();
        view.setTag(i, dernVar2);
        return dernVar2;
    }
}
