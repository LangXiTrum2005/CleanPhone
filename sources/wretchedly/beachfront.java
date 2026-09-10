package wretchedly;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.CoroutineSingletons;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SafeContinuationJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000fB!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lwretchedly/beachfront;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lwretchedly/dern;", "Ligo/dern;", "delegate", "", "initialResult", "<init>", "(Lwretchedly/dern;Ljava/lang/Object;)V", "(Lwretchedly/dern;)V", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "attabal", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "kowloon", "Lwretchedly/dern;", "Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Ligo/dern;", "callerFrame", "arytenoidectomy", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class beachfront<T> implements dern<T>, igo.dern {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    private static final attabal f39725arytenoidectomy = new attabal(null);

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<beachfront<?>, Object> f39726monoploid = AtomicReferenceFieldUpdater.newUpdater(beachfront.class, Object.class, "result");

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final dern<T> delegate;
    private volatile Object result;

    /* JADX INFO: compiled from: SafeContinuationJvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwretchedly/beachfront$attabal;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public beachfront(dern<? super T> delegate, Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.result = obj;
    }

    public final Object attabal() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (androidx.concurrent.futures.attabal.attabal(f39726monoploid, this, coroutineSingletons, p002kotlin.coroutines.intrinsics.attabal.beachfront())) {
                return p002kotlin.coroutines.intrinsics.attabal.beachfront();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return p002kotlin.coroutines.intrinsics.attabal.beachfront();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // igo.dern
    public igo.dern getCallerFrame() {
        dern<T> dernVar = this.delegate;
        if (dernVar instanceof igo.dern) {
            return (igo.dern) dernVar;
        }
        return null;
    }

    @Override // wretchedly.dern
    public CoroutineContext getContext() {
        return this.delegate.getContext();
    }

    @Override // wretchedly.dern
    public void resumeWith(Object result) {
        while (true) {
            Object obj = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj == coroutineSingletons) {
                if (androidx.concurrent.futures.attabal.attabal(f39726monoploid, this, coroutineSingletons, result)) {
                    return;
                }
            } else {
                if (obj != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.attabal.attabal(f39726monoploid, this, p002kotlin.coroutines.intrinsics.attabal.beachfront(), CoroutineSingletons.RESUMED)) {
                    this.delegate.resumeWith(result);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public beachfront(dern<? super T> delegate) {
        this(delegate, CoroutineSingletons.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
