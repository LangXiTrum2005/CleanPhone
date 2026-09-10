package androidx.compose.runtime;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@igo.wireman(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend")
public final class Recomposer$join$2 extends SuspendLambda implements Function2<Recomposer.State, wretchedly.dern<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$join$2(wretchedly.dern<? super Recomposer$join$2> dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(dernVar);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Recomposer.State state, wretchedly.dern<? super Boolean> dernVar) {
        return ((Recomposer$join$2) create(state, dernVar)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        return igo.attabal.attabal(((Recomposer.State) this.L$0) == Recomposer.State.ShutDown);
    }
}
