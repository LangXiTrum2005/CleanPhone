package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/saran;", "", "<anonymous>", "(Lkotlinx/coroutines/saran;)V"}, k = 3, mv = {1, 8, 0})
@igo.wireman(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {396}, m = "invokeSuspend")
public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends SuspendLambda implements Function2<kotlinx.coroutines.saran, wretchedly.dern<? super Unit>, Object> {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    final /* synthetic */ androidx.p001lifecycle.arytenoidectomy $source;
    final /* synthetic */ Ref$ObjectRef<premeiotic> $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(Ref$ObjectRef<premeiotic> ref$ObjectRef, Recomposer recomposer, androidx.p001lifecycle.arytenoidectomy arytenoidectomyVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, wretchedly.dern<? super WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> dernVar) {
        super(2, dernVar);
        this.$systemDurationScaleSettingConsumer = ref$ObjectRef;
        this.$recomposer = recomposer;
        this.$source = arytenoidectomyVar;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, dernVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.monroe] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.monroe] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ?? r1;
        kotlinx.coroutines.monroe monroeVarWireman;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        ?? r2 = this.label;
        try {
            if (r2 == 0) {
                p002kotlin.dern.saneness(obj);
                kotlinx.coroutines.saran saranVar = (kotlinx.coroutines.saran) this.L$0;
                try {
                    premeiotic premeioticVar = this.$systemDurationScaleSettingConsumer.element;
                    if (premeioticVar != null) {
                        kotlinx.coroutines.flow.dovishness dovishnessVarMarial = WindowRecomposer_androidKt.marial(this.$this_createLifecycleAwareWindowRecomposer.getContext().getApplicationContext());
                        premeioticVar.wireman(((Number) dovishnessVarMarial.getValue()).floatValue());
                        monroeVarWireman = kotlinx.coroutines.cutely.wireman(saranVar, null, null, new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(dovishnessVarMarial, premeioticVar, null), 3, null);
                    } else {
                        monroeVarWireman = null;
                    }
                    Recomposer recomposer = this.$recomposer;
                    this.L$0 = monroeVarWireman;
                    this.label = 1;
                    r2 = monroeVarWireman;
                    if (recomposer.lampshade(this) == objBeachfront) {
                        return objBeachfront;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r1 = 0;
                    if (r1 != 0) {
                        kotlinx.coroutines.monroe.attabal.attabal(r1, null, 1, null);
                    }
                    this.$source.getLifecycle().wireman(this.$self);
                    throw th;
                }
            } else {
                if (r2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.monroe monroeVar = (kotlinx.coroutines.monroe) this.L$0;
                p002kotlin.dern.saneness(obj);
                r2 = monroeVar;
            }
            if (r2 != 0) {
                kotlinx.coroutines.monroe.attabal.attabal(r2, null, 1, null);
            }
            this.$source.getLifecycle().wireman(this.$self);
            return Unit.f29295attabal;
        } catch (Throwable th3) {
            th = th3;
            r1 = r2;
        }
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.saran saranVar, wretchedly.dern<? super Unit> dernVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(saranVar, dernVar)).invokeSuspend(Unit.f29295attabal);
    }
}
