package androidx.compose.ui.platform;

import android.view.Choreographer;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/saran;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/saran;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Choreographer>, Object> {
    int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(wretchedly.dern<? super AndroidUiDispatcher$Companion$Main$2$dispatcher$1> dernVar) {
        super(2, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        p002kotlin.coroutines.intrinsics.attabal.beachfront();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p002kotlin.dern.saneness(obj);
        return Choreographer.getInstance();
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Choreographer> dernVar) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
