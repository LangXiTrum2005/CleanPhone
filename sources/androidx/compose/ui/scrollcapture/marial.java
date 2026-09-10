package androidx.compose.ui.scrollcapture;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/scrollcapture/marial;", "Lyemenite/dern;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class marial implements yemenite.dern {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final marial f7543kowloon = new marial();

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) yemenite.dern.attabal.attabal(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) yemenite.dern.attabal.saneness(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return yemenite.dern.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return yemenite.dern.attabal.wireman(this, coroutineContext);
    }
}
