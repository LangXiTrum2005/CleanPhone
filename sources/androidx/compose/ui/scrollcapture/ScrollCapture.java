package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import android.view.View;
import androidx.compose.runtime.czestochowa;
import androidx.compose.runtime.miliaria;
import androidx.compose.ui.semantics.kowloon;
import com.mbridge.msdk.MBridgeConstans;
import java.util.function.Consumer;
import kotlinx.coroutines.privatdozent;
import milliradian.arytenoidectomy;
import milliradian.impassible;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R+\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/scrollcapture/ScrollCapture;", "Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$attabal;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroidx/compose/ui/semantics/kowloon;", "semanticsOwner", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Ljava/util/function/Consumer;", "Landroid/view/ScrollCaptureTarget;", "targets", "", "wireman", "(Landroid/view/View;Landroidx/compose/ui/semantics/kowloon;Lkotlin/coroutines/CoroutineContext;Ljava/util/function/Consumer;)V", "attabal", "saneness", "", "<set-?>", "Landroidx/compose/runtime/czestochowa;", "dern", "()Z", "marial", "(Z)V", "scrollCaptureInProgress", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ScrollCapture implements ComposeScrollCaptureCallback.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final czestochowa scrollCaptureInProgress = miliaria.saneness(Boolean.FALSE, null, 2, null);

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.attabal
    public void attabal() {
        marial(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dern() {
        return ((Boolean) this.scrollCaptureInProgress.getValue()).booleanValue();
    }

    public final void marial(boolean z) {
        this.scrollCaptureInProgress.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback.attabal
    public void saneness() {
        marial(false);
    }

    public final void wireman(View view, kowloon semanticsOwner, CoroutineContext coroutineContext, Consumer<ScrollCaptureTarget> targets) {
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new ScrollCaptureCandidate[16], 0);
        cutely.beachfront(semanticsOwner.attabal(), 0, new ScrollCapture$onScrollCaptureSearch$1(dernVar), 2, null);
        dernVar.preprohormone(frenchy.saneness.saneness(new Function1<ScrollCaptureCandidate, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$2
            @Override // p002kotlin.jvm.functions.Function1
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getDepth());
            }
        }, new Function1<ScrollCaptureCandidate, Comparable<?>>() { // from class: androidx.compose.ui.scrollcapture.ScrollCapture$onScrollCaptureSearch$3
            @Override // p002kotlin.jvm.functions.Function1
            public final Comparable<?> invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
                return Integer.valueOf(scrollCaptureCandidate.getViewportBoundsInWindow().marial());
            }
        }));
        ScrollCaptureCandidate scrollCaptureCandidate = (ScrollCaptureCandidate) (dernVar.triweekly() ? null : dernVar.apical()[dernVar.getSize() - 1]);
        if (scrollCaptureCandidate == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(scrollCaptureCandidate.getNode(), scrollCaptureCandidate.getViewportBoundsInWindow(), privatdozent.attabal(coroutineContext), this);
        supplicat.taiyuan taiyuanVarSaneness = androidx.compose.ui.layout.impromptu.saneness(scrollCaptureCandidate.getCoordinates());
        long jTaiyuan = scrollCaptureCandidate.getViewportBoundsInWindow().taiyuan();
        ScrollCaptureTarget scrollCaptureTargetAttabal = impromptu.attabal(view, restrictive.czestochowa.attabal(arytenoidectomy.attabal(taiyuanVarSaneness)), new Point(impassible.wireman(jTaiyuan), impassible.marial(jTaiyuan)), beachfront.attabal(composeScrollCaptureCallback));
        scrollCaptureTargetAttabal.setScrollBounds(restrictive.czestochowa.attabal(scrollCaptureCandidate.getViewportBoundsInWindow()));
        targets.accept(scrollCaptureTargetAttabal);
    }
}
