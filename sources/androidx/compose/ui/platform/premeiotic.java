package androidx.compose.ui.platform;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/premeiotic;", "Lyemenite/dern;", "<init>", "()V", "", "<set-?>", "kowloon", "Landroidx/compose/runtime/sayid;", "getScaleFactor", "()F", "wireman", "(F)V", "scaleFactor", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class premeiotic implements yemenite.dern {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.sayid scaleFactor = androidx.compose.runtime.monroe.attabal(1.0f);

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

    public void wireman(float f) {
        this.scaleFactor.formularize(f);
    }
}
