package androidx.p001lifecycle;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/kattegat;", "Landroidx/lifecycle/impassible;", "Landroidx/lifecycle/polder;", IronSourceConstants.EVENTS_PROVIDER, "<init>", "(Landroidx/lifecycle/polder;)V", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "kowloon", "Landroidx/lifecycle/polder;", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kattegat implements impassible {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final polder provider;

    public kattegat(polder provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.provider = provider;
    }

    @Override // androidx.p001lifecycle.impassible
    public void onStateChanged(arytenoidectomy source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().wireman(this);
            this.provider.marial();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
