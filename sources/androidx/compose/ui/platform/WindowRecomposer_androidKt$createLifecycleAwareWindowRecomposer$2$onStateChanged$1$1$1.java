package androidx.compose.ui.platform;

import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {391}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.dovishness<Float> $durationScaleStateFlow;
    final /* synthetic */ premeiotic $it;
    int label;

    /* JADX INFO: compiled from: WindowRecomposer.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "scaleFactor", "", "saneness", "(FLwretchedly/dern;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    public static final class attabal<T> implements kotlinx.coroutines.flow.wireman {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ premeiotic f7392kowloon;

        public attabal(premeiotic premeioticVar) {
            this.f7392kowloon = premeioticVar;
        }

        @Override // kotlinx.coroutines.flow.wireman
        public /* bridge */ /* synthetic */ Object emit(Object obj, wretchedly.dern dernVar) {
            return saneness(((Number) obj).floatValue(), dernVar);
        }

        public final Object saneness(float f, wretchedly.dern<? super Unit> dernVar) {
            this.f7392kowloon.wireman(f);
            return Unit.f29295attabal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(kotlinx.coroutines.flow.dovishness<Float> dovishnessVar, premeiotic premeioticVar, wretchedly.dern<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1> dernVar) {
        super(2, dernVar);
        this.$durationScaleStateFlow = dovishnessVar;
        this.$it = premeioticVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.$durationScaleStateFlow, this.$it, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            kotlinx.coroutines.flow.dovishness<Float> dovishnessVar = this.$durationScaleStateFlow;
            attabal attabalVar = new attabal(this.$it);
            this.label = 1;
            if (dovishnessVar.collect(attabalVar, this) == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
