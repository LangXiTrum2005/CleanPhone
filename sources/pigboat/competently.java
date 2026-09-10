package pigboat;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.basify;
import kotlinx.coroutines.creditor;
import kotlinx.coroutines.dent;
import kotlinx.coroutines.lerp;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00028\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00101\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\f\u0010/\u0012\u0004\b0\u0010\u0010R\u0014\u00102\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u001c\u00105\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010$\u001a\u00020#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0014R\u0013\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0=8\u0002X\u0082\u0004¨\u0006?"}, d2 = {"Lpigboat/competently;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/dent;", "Ligo/dern;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lwretchedly/dern;", "Lkotlinx/coroutines/merc;", "dispatcher", "continuation", "<init>", "(Lkotlinx/coroutines/merc;Lwretchedly/dern;)V", "", "graveside", "()Z", "", "triweekly", "()V", "dovishness", "Lkotlinx/coroutines/kowloon;", "kowloon", "()Lkotlinx/coroutines/kowloon;", "Lkotlinx/coroutines/impassible;", "", "rotuma", "(Lkotlinx/coroutines/impassible;)Ljava/lang/Throwable;", "cause", "adultoid", "(Ljava/lang/Throwable;)Z", "", "formularize", "()Ljava/lang/Object;", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "arytenoidectomy", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "polloi", "Lkotlinx/coroutines/merc;", "molybdenite", "Lwretchedly/dern;", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "countOrElement", "getCallerFrame", "()Ligo/dern;", "callerFrame", "dern", "()Lwretchedly/dern;", "delegate", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "monoploid", "reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class competently<T> extends dent<T> implements igo.dern, wretchedly.dern<T> {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35329dovishness = AtomicReferenceFieldUpdater.newUpdater(competently.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final Object countOrElement;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public Object _state;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final wretchedly.dern<T> continuation;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.merc dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public competently(kotlinx.coroutines.merc mercVar, wretchedly.dern<? super T> dernVar) {
        super(-1);
        this.dispatcher = mercVar;
        this.continuation = dernVar;
        this._state = impromptu.f35352attabal;
        this.countOrElement = restrictive.competently(getContext());
    }

    public final boolean adultoid(Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35329dovishness;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            stratoscope stratoscopeVar = impromptu.f35353saneness;
            if (Intrinsics.wireman(obj, stratoscopeVar)) {
                if (androidx.concurrent.futures.attabal.attabal(f35329dovishness, this, stratoscopeVar, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.attabal.attabal(f35329dovishness, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void arytenoidectomy(CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.lerp(context, this);
    }

    public final void dovishness() {
        triweekly();
        kotlinx.coroutines.kowloon<?> kowloonVarMonoploid = monoploid();
        if (kowloonVarMonoploid != null) {
            kowloonVarMonoploid.adultoid();
        }
    }

    @Override // kotlinx.coroutines.dent
    public Object formularize() {
        Object obj = this._state;
        this._state = impromptu.f35352attabal;
        return obj;
    }

    @Override // igo.dern
    public igo.dern getCallerFrame() {
        wretchedly.dern<T> dernVar = this.continuation;
        if (dernVar instanceof igo.dern) {
            return (igo.dern) dernVar;
        }
        return null;
    }

    @Override // wretchedly.dern
    public CoroutineContext getContext() {
        return this.continuation.getContext();
    }

    public final boolean graveside() {
        return f35329dovishness.get(this) != null;
    }

    public final kotlinx.coroutines.kowloon<T> kowloon() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35329dovishness;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f35329dovishness.set(this, impromptu.f35353saneness);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.kowloon) {
                if (androidx.concurrent.futures.attabal.attabal(f35329dovishness, this, obj, impromptu.f35353saneness)) {
                    return (kotlinx.coroutines.kowloon) obj;
                }
            } else if (obj != impromptu.f35353saneness && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final kotlinx.coroutines.kowloon<?> monoploid() {
        Object obj = f35329dovishness.get(this);
        if (obj instanceof kotlinx.coroutines.kowloon) {
            return (kotlinx.coroutines.kowloon) obj;
        }
        return null;
    }

    @Override // wretchedly.dern
    public void resumeWith(Object result) {
        Object objSaneness = kotlinx.coroutines.trm.saneness(result);
        if (impromptu.wireman(this.dispatcher, getContext())) {
            this._state = objSaneness;
            this.resumeMode = 0;
            impromptu.dern(this.dispatcher, getContext(), this);
            return;
        }
        lerp lerpVarSaneness = basify.f32112attabal.saneness();
        if (lerpVarSaneness.palmyra()) {
            this._state = objSaneness;
            this.resumeMode = 0;
            lerpVarSaneness.wostteth(this);
            return;
        }
        lerpVarSaneness.gusty(true);
        try {
            CoroutineContext context = getContext();
            Object objTaiyuan = restrictive.taiyuan(context, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                Unit unit = Unit.f29295attabal;
                restrictive.beachfront(context, objTaiyuan);
                while (lerpVarSaneness.julian()) {
                }
            } catch (Throwable th) {
                restrictive.beachfront(context, objTaiyuan);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                apical(th2);
            } finally {
                lerpVarSaneness.czestochowa(true);
            }
        }
    }

    public final Throwable rotuma(kotlinx.coroutines.impassible<?> continuation) {
        stratoscope stratoscopeVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35329dovishness;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            stratoscopeVar = impromptu.f35353saneness;
            if (obj != stratoscopeVar) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.attabal.attabal(f35329dovishness, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.attabal.attabal(f35329dovishness, this, stratoscopeVar, continuation));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + creditor.dern(this.continuation) + ']';
    }

    public final void triweekly() {
        while (f35329dovishness.get(this) == impromptu.f35353saneness) {
        }
    }

    @Override // kotlinx.coroutines.dent
    public wretchedly.dern<T> dern() {
        return this;
    }
}
