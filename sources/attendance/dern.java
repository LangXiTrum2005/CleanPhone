package attendance;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import p002kotlin.Metadata;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PoolingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003R$\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\b\u0012\u0004\u0012\u00020\u0004`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lattendance/dern;", "", "<init>", "()V", "Lattendance/saneness;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "attabal", "(Lattendance/saneness;)V", "dern", "saneness", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "listeners", "customview-poolingcontainer_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final ArrayList<saneness> listeners = new ArrayList<>();

    public final void attabal(saneness listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    public final void dern(saneness listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void saneness() {
        for (int iTriweekly = adultoid.triweekly(this.listeners); -1 < iTriweekly; iTriweekly--) {
            this.listeners.get(iTriweekly).saneness();
        }
    }
}
