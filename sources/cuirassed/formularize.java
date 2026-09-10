package cuirassed;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Metadata;
import p002kotlin.Unit;

/* JADX INFO: compiled from: SnapshotThreadLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0018\u0010\u0012\u001a\u00060\u0002j\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcuirassed/formularize;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "<init>", "()V", "attabal", "()Ljava/lang/Object;", "value", "", "saneness", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcuirassed/kowloon;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "map", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "writeMutex", "dern", "mainThreadValue", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class formularize<T> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public T mainThreadValue;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final AtomicReference<kowloon> map = new AtomicReference<>(impassible.f24268attabal);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Object writeMutex = new Object();

    public final T attabal() {
        long jAttabal = monoploid.attabal();
        return jAttabal == arytenoidectomy.attabal() ? this.mainThreadValue : (T) this.map.get().saneness(jAttabal);
    }

    public final void saneness(T value) {
        long jAttabal = monoploid.attabal();
        if (jAttabal == arytenoidectomy.attabal()) {
            this.mainThreadValue = value;
            return;
        }
        synchronized (this.writeMutex) {
            kowloon kowloonVar = this.map.get();
            if (kowloonVar.wireman(jAttabal, value)) {
                return;
            }
            this.map.set(kowloonVar.dern(jAttabal, value));
            Unit unit = Unit.f29295attabal;
        }
    }
}
