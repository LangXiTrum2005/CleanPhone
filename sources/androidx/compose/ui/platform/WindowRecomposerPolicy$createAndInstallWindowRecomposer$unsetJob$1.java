package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {235}, m = "invokeSuspend")
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, wretchedly.dern<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1> dernVar) {
        super(2, dernVar);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        try {
            if (i == 0) {
                p002kotlin.dern.saneness(obj);
                Recomposer recomposer = this.$newRecomposer;
                this.label = 1;
                if (recomposer.igbo(this) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
            if (WindowRecomposer_androidKt.beachfront(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.taiyuan(this.$rootView, null);
            }
            return Unit.f29295attabal;
        } catch (Throwable th) {
            if (WindowRecomposer_androidKt.beachfront(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.taiyuan(this.$rootView, null);
            }
            throw th;
        }
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
