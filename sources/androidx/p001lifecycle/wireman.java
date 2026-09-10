package androidx.p001lifecycle;

import androidx.core.app.NotificationCompat;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CompositeGeneratedAdaptersObserver.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/wireman;", "Landroidx/lifecycle/impassible;", "", "Landroidx/lifecycle/impromptu;", "generatedAdapters", "<init>", "([Landroidx/lifecycle/impromptu;)V", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "", "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "kowloon", "[Landroidx/lifecycle/impromptu;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wireman implements impassible {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final impromptu[] generatedAdapters;

    public wireman(impromptu[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.generatedAdapters = generatedAdapters;
    }

    @Override // androidx.p001lifecycle.impassible
    public void onStateChanged(arytenoidectomy source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        rotuma rotumaVar = new rotuma();
        for (impromptu impromptuVar : this.generatedAdapters) {
            impromptuVar.attabal(source, event, false, rotumaVar);
        }
        for (impromptu impromptuVar2 : this.generatedAdapters) {
            impromptuVar2.attabal(source, event, true, rotumaVar);
        }
    }
}
