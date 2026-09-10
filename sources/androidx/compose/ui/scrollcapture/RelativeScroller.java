package androidx.compose.ui.scrollcapture;

import com.applovin.sdk.AppLovinMediationProvider;
import com.unity3d.services.UnityAdsConstants;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R0\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/compose/ui/scrollcapture/RelativeScroller;", "", "", "viewportSize", "Lkotlin/Function2;", "", "Lwretchedly/dern;", "scrollBy", "<init>", "(ILkotlin/jvm/functions/Function2;)V", "", "wireman", "()V", "min", AppLovinMediationProvider.MAX, "beachfront", "(IILwretchedly/dern;)Ljava/lang/Object;", "offset", "dern", "(I)I", "competently", "(FLwretchedly/dern;)Ljava/lang/Object;", "delta", "marial", "attabal", "I", "saneness", "Lkotlin/jvm/functions/Function2;", "<set-?>", "F", "()F", "scrollAmount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RelativeScroller {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int viewportSize;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public float scrollAmount;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Function2<Float, wretchedly.dern<? super Float>, Object> scrollBy;

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i, Function2<? super Float, ? super wretchedly.dern<? super Float>, ? extends Object> function2) {
        this.viewportSize = i;
        this.scrollBy = function2;
    }

    public final Object beachfront(int i, int i2, wretchedly.dern<? super Unit> dernVar) {
        if (i > i2) {
            throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
        }
        int i3 = i2 - i;
        int i4 = this.viewportSize;
        if (i3 > i4) {
            throw new IllegalArgumentException(("Expected range (" + i3 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f = i;
        float f2 = this.scrollAmount;
        if (f >= f2 && i2 <= i4 + f2) {
            return Unit.f29295attabal;
        }
        if (f >= f2) {
            i = i2 - i4;
        }
        Object objCompetently = competently(i, dernVar);
        return objCompetently == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently : Unit.f29295attabal;
    }

    public final Object competently(float f, wretchedly.dern<? super Unit> dernVar) {
        Object objMarial = marial(f - this.scrollAmount, dernVar);
        return objMarial == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objMarial : Unit.f29295attabal;
    }

    public final int dern(int offset) {
        return p002kotlin.ranges.wireman.apical(offset - pastie.dern.wireman(this.scrollAmount), 0, this.viewportSize);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object marial(float f, wretchedly.dern<? super Unit> dernVar) {
        RelativeScroller$scrollBy$1 relativeScroller$scrollBy$1;
        RelativeScroller relativeScroller;
        if (dernVar instanceof RelativeScroller$scrollBy$1) {
            relativeScroller$scrollBy$1 = (RelativeScroller$scrollBy$1) dernVar;
            int i = relativeScroller$scrollBy$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                relativeScroller$scrollBy$1.label = i - Integer.MIN_VALUE;
            } else {
                relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, dernVar);
            }
        } else {
            relativeScroller$scrollBy$1 = new RelativeScroller$scrollBy$1(this, dernVar);
        }
        Object objInvoke = relativeScroller$scrollBy$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = relativeScroller$scrollBy$1.label;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objInvoke);
            Function2<Float, wretchedly.dern<? super Float>, Object> function2 = this.scrollBy;
            Float fDern = igo.attabal.dern(f);
            relativeScroller$scrollBy$1.L$0 = this;
            relativeScroller$scrollBy$1.label = 1;
            objInvoke = function2.invoke(fDern, relativeScroller$scrollBy$1);
            if (objInvoke == objBeachfront) {
                return objBeachfront;
            }
            relativeScroller = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            relativeScroller = (RelativeScroller) relativeScroller$scrollBy$1.L$0;
            p002kotlin.dern.saneness(objInvoke);
        }
        relativeScroller.scrollAmount += ((Number) objInvoke).floatValue();
        return Unit.f29295attabal;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final void wireman() {
        this.scrollAmount = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
