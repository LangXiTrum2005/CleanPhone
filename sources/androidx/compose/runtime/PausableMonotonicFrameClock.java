package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: PausableMonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/milliradian;", "frameClock", "<init>", "(Landroidx/compose/runtime/milliradian;)V", "", "wireman", "()V", "marial", "R", "Lkotlin/Function1;", "", "onFrame", "formularize", "(Lkotlin/jvm/functions/Function1;Lwretchedly/dern;)Ljava/lang/Object;", "kowloon", "Landroidx/compose/runtime/milliradian;", "Landroidx/compose/runtime/cultivated;", "arytenoidectomy", "Landroidx/compose/runtime/cultivated;", "latch", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PausableMonotonicFrameClock implements milliradian {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final cultivated latch = new cultivated();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final milliradian frameClock;

    public PausableMonotonicFrameClock(milliradian milliradianVar) {
        this.frameClock = milliradianVar;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) milliradian.attabal.attabal(this, r, function2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.runtime.milliradian
    public <R> Object formularize(Function1<? super Long, ? extends R> function1, wretchedly.dern<? super R> dernVar) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        if (dernVar instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) dernVar;
            int i = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, dernVar);
            }
        } else {
            pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, dernVar);
        }
        Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            cultivated cultivatedVar = this.latch;
            pausableMonotonicFrameClock$withFrameNanos$1.L$0 = function1;
            pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
            if (cultivatedVar.dern(pausableMonotonicFrameClock$withFrameNanos$1) != objBeachfront) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        function1 = (Function1) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
        p002kotlin.dern.saneness(obj);
        milliradian milliradianVar = this.frameClock;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        Object objFormularize = milliradianVar.formularize(function1, pausableMonotonicFrameClock$withFrameNanos$1);
        return objFormularize == objBeachfront ? objBeachfront : objFormularize;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) milliradian.attabal.saneness(this, sanenessVar);
    }

    public final void marial() {
        this.latch.beachfront();
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return milliradian.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return milliradian.attabal.wireman(this, coroutineContext);
    }

    public final void wireman() {
        this.latch.wireman();
    }
}
