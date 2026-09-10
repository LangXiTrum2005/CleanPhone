package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import com.ironsource.C3474d8;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import milliradian.arytenoidectomy;
import milliradian.kowloon;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ScrollCapture.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0013\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0019\u001a\u00020\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u001b\u001a\u00020\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "fromNode", "", "depth", "Lkotlin/Function1;", "Landroidx/compose/ui/scrollcapture/taiyuan;", "", "onCandidate", "marial", "(Landroidx/compose/ui/semantics/SemanticsNode;ILkotlin/jvm/functions/Function1;)V", "", "saneness", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/util/List;", "Lkotlin/Function2;", "Lsupplicat/competently;", "Lwretchedly/dern;", "", "dern", "(Landroidx/compose/ui/semantics/SemanticsNode;)Lkotlin/jvm/functions/Function2;", "scrollCaptureScrollByAction", "", "wireman", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", C3474d8.k, "attabal", "canScrollVertically", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class cutely {
    public static final boolean attabal(SemanticsNode semanticsNode) {
        Function2<supplicat.competently, wretchedly.dern<? super supplicat.competently>, Object> function2Dern = dern(semanticsNode);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), SemanticsProperties.f7561attabal.sealless());
        return (function2Dern == null || scrollAxisRange == null || scrollAxisRange.attabal().invoke().floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
    }

    public static /* synthetic */ void beachfront(SemanticsNode semanticsNode, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        marial(semanticsNode, i, function1);
    }

    public static final Function2<supplicat.competently, wretchedly.dern<? super supplicat.competently>, Object> dern(SemanticsNode semanticsNode) {
        return (Function2) SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), androidx.compose.ui.semantics.cutely.f7617attabal.graveside());
    }

    public static final void marial(SemanticsNode semanticsNode, int i, Function1<? super ScrollCaptureCandidate, Unit> function1) {
        androidx.compose.runtime.collection.dern dernVar = new androidx.compose.runtime.collection.dern(new SemanticsNode[16], 0);
        List<SemanticsNode> listSaneness = saneness(semanticsNode);
        while (true) {
            dernVar.marial(dernVar.getSize(), listSaneness);
            while (dernVar.kowloon()) {
                SemanticsNode semanticsNode2 = (SemanticsNode) dernVar.molybdenite(dernVar.getSize() - 1);
                if (wireman(semanticsNode2) && !semanticsNode2.getUnmergedConfig().marial(SemanticsProperties.f7561attabal.beachfront())) {
                    NodeCoordinator nodeCoordinatorMarial = semanticsNode2.marial();
                    if (nodeCoordinatorMarial == null) {
                        peridotite.attabal.dern("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    androidx.compose.ui.layout.competently competentlyVarSensatory = nodeCoordinatorMarial.sensatory();
                    kowloon kowloonVarAttabal = arytenoidectomy.attabal(androidx.compose.ui.layout.impromptu.dern(competentlyVarSensatory));
                    if (kowloonVarAttabal.cutely()) {
                        continue;
                    } else if (attabal(semanticsNode2)) {
                        int i2 = i + 1;
                        function1.invoke(new ScrollCaptureCandidate(semanticsNode2, i2, kowloonVarAttabal, competentlyVarSensatory));
                        marial(semanticsNode2, i2, function1);
                    } else {
                        listSaneness = saneness(semanticsNode2);
                    }
                }
            }
            return;
        }
    }

    public static final List<SemanticsNode> saneness(SemanticsNode semanticsNode) {
        return semanticsNode.formularize(false, false, false);
    }

    public static final boolean wireman(SemanticsNode semanticsNode) {
        return (semanticsNode.cord() || semanticsNode.getUnmergedConfig().marial(SemanticsProperties.f7561attabal.impassible())) ? false : true;
    }
}
