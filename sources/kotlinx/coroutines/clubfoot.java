package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/clubfoot;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lpigboat/rotuma;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lwretchedly/dern;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lwretchedly/dern;)V", "", "microchemistry", "()Z", "licking", "", "state", "", "trm", "(Ljava/lang/Object;)V", "molet", "prefect", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class clubfoot<T> extends pigboat.rotuma<T> {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32180molybdenite = AtomicIntegerFieldUpdater.newUpdater(clubfoot.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public clubfoot(CoroutineContext coroutineContext, wretchedly.dern<? super T> dernVar) {
        super(coroutineContext, dernVar);
    }

    private final boolean licking() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32180molybdenite;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f32180molybdenite.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean microchemistry() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32180molybdenite;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f32180molybdenite.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // pigboat.rotuma, kotlinx.coroutines.attabal
    public void molet(Object state) {
        if (licking()) {
            return;
        }
        pigboat.impromptu.saneness(IntrinsicsKt__IntrinsicsJvmKt.dern(this.uCont), trm.attabal(state, this.uCont));
    }

    public final Object prefect() {
        if (microchemistry()) {
            return p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        Object objImpromptu = claque.impromptu(lerp());
        if (objImpromptu instanceof stratoscope) {
            throw ((stratoscope) objImpromptu).cause;
        }
        return objImpromptu;
    }

    @Override // pigboat.rotuma, kotlinx.coroutines.JobSupport
    public void trm(Object state) {
        molet(state);
    }
}
