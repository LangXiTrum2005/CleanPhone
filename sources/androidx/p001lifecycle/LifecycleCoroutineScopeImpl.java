package androidx.p001lifecycle;

import androidx.core.app.NotificationCompat;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.premeiotic;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/apical;", "Landroidx/lifecycle/impassible;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlin/coroutines/CoroutineContext;)V", "", "saneness", "()V", "Landroidx/lifecycle/arytenoidectomy;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "onStateChanged", "(Landroidx/lifecycle/arytenoidectomy;Landroidx/lifecycle/Lifecycle$Event;)V", "kowloon", "Landroidx/lifecycle/Lifecycle;", "attabal", "()Landroidx/lifecycle/Lifecycle;", "arytenoidectomy", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LifecycleCoroutineScopeImpl extends apical implements impassible {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            JobKt__JobKt.marial(getCoroutineContext(), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Override // kotlinx.coroutines.saran
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.p001lifecycle.impassible
    public void onStateChanged(arytenoidectomy source, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (getLifecycle().getState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle().wireman(this);
            JobKt__JobKt.marial(getCoroutineContext(), null, 1, null);
        }
    }

    public final void saneness() {
        cutely.wireman(this, premeiotic.dern().preterite(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2, null);
    }
}
