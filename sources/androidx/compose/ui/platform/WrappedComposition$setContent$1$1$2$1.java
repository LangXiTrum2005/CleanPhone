package androidx.compose.ui.platform;

import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Wrapper.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2$1", f = "Wrapper.android.kt", l = {Opcodes.DCMPL}, m = "invokeSuspend")
public final class WrappedComposition$setContent$1$1$2$1 extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
    int label;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1$1$2$1(WrappedComposition wrappedComposition, wretchedly.dern<? super WrappedComposition$setContent$1$1$2$1> dernVar) {
        super(2, dernVar);
        this.this$0 = wrappedComposition;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new WrappedComposition$setContent$1$1$2$1(this.this$0, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            AndroidComposeView owner = this.this$0.getOwner();
            this.label = 1;
            if (owner.clubfoot(this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        return Unit.f29295attabal;
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((WrappedComposition$setContent$1$1$2$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
