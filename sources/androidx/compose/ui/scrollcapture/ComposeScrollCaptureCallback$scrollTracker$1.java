package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsProperties;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "delta"}, k = 3, mv = {1, 8, 0}, xi = 48)
@igo.wireman(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", l = {85}, m = "invokeSuspend")
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements Function2<Float, wretchedly.dern<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, wretchedly.dern<? super ComposeScrollCaptureCallback$scrollTracker$1> dernVar) {
        super(2, dernVar);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern<Unit> create(Object obj, wretchedly.dern<?> dernVar) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, dernVar);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f, wretchedly.dern<? super Float> dernVar) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f), dernVar)).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.label;
        if (i == 0) {
            p002kotlin.dern.saneness(obj);
            float f = this.F$0;
            Function2<supplicat.competently, wretchedly.dern<? super supplicat.competently>, Object> function2Dern = cutely.dern(this.this$0.node);
            if (function2Dern == null) {
                peridotite.attabal.dern("Required value was null.");
                throw new KotlinNothingValueException();
            }
            boolean reverseScrolling = ((ScrollAxisRange) this.this$0.node.getUnmergedConfig().impromptu(SemanticsProperties.f7561attabal.sealless())).getReverseScrolling();
            if (reverseScrolling) {
                f = -f;
            }
            supplicat.competently competentlyVarWireman = supplicat.competently.wireman(supplicat.impromptu.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f));
            this.Z$0 = reverseScrolling;
            this.label = 1;
            obj = function2Dern.invoke(competentlyVarWireman, this);
            if (obj == objBeachfront) {
                return objBeachfront;
            }
            z = reverseScrolling;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            p002kotlin.dern.saneness(obj);
        }
        float fFormularize = supplicat.competently.formularize(((supplicat.competently) obj).getPackedValue());
        if (z) {
            fFormularize = -fFormularize;
        }
        return igo.attabal.dern(fFormularize);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Float f, wretchedly.dern<? super Float> dernVar) {
        return invoke(f.floatValue(), dernVar);
    }
}
