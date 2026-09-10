package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PausableMonotonicFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@igo.wireman(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos")
public final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PausableMonotonicFrameClock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausableMonotonicFrameClock$withFrameNanos$1(PausableMonotonicFrameClock pausableMonotonicFrameClock, wretchedly.dern<? super PausableMonotonicFrameClock$withFrameNanos$1> dernVar) {
        super(dernVar);
        this.this$0 = pausableMonotonicFrameClock;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.formularize(null, this);
    }
}
