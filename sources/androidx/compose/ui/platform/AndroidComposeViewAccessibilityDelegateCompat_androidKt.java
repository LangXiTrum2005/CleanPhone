package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C3414a2;
import com.ironsource.C3474d8;
import java.util.Iterator;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\b\u001a!\u0010\u0011\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u0016\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\b\"\u0018\u0010\u0018\u001a\u00020\u0002*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "", "selector", "apical", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsNode;", "taiyuan", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/semantics/apical;", "oldConfig", "triweekly", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/apical;)Z", "cutely", "Landroidx/compose/ui/semantics/attabal;", "", C3414a2.d, "impromptu", "(Landroidx/compose/ui/semantics/attabal;Ljava/lang/Object;)Z", "impassible", "isVisible$annotations", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", C3474d8.k, "formularize", "isRtl", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    public static final LayoutNode apical(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode layoutNodePermissivist = layoutNode.permissivist(); layoutNodePermissivist != null; layoutNodePermissivist = layoutNodePermissivist.permissivist()) {
            if (function1.invoke(layoutNodePermissivist).booleanValue()) {
                return layoutNodePermissivist;
            }
        }
        return null;
    }

    public static final boolean cutely(SemanticsNode semanticsNode) {
        androidx.compose.ui.semantics.apical unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.f7561attabal;
        if (unmergedConfig.marial(semanticsProperties.competently()) && !Intrinsics.wireman(SemanticsConfigurationKt.attabal(semanticsNode.getUnmergedConfig(), semanticsProperties.taiyuan()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode layoutNodeApical = apical(semanticsNode.getLayoutNode(), new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1
            /* JADX WARN: Code duplicated, block: B:9:0x001a  */
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(LayoutNode layoutNode) {
                boolean z;
                androidx.compose.ui.semantics.apical apicalVarPreprohormone = layoutNode.preprohormone();
                if (apicalVarPreprohormone != null) {
                    z = apicalVarPreprohormone.getIsMergingSemanticsOfDescendants() && apicalVarPreprohormone.marial(SemanticsProperties.f7561attabal.competently());
                }
                return Boolean.valueOf(z);
            }
        });
        if (layoutNodeApical != null) {
            androidx.compose.ui.semantics.apical apicalVarPreprohormone = layoutNodeApical.preprohormone();
            if (!(apicalVarPreprohormone != null ? Intrinsics.wireman(SemanticsConfigurationKt.attabal(apicalVarPreprohormone, semanticsProperties.taiyuan()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean formularize(SemanticsNode semanticsNode) {
        return semanticsNode.arytenoidectomy().getLayoutDirection() == LayoutDirection.Rtl;
    }

    public static final boolean impassible(SemanticsNode semanticsNode) {
        return (semanticsNode.cord() || semanticsNode.getUnmergedConfig().marial(SemanticsProperties.f7561attabal.impassible())) ? false : true;
    }

    public static final boolean impromptu(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!Intrinsics.wireman(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.attabal() != null || accessibilityAction2.attabal() == null) {
            return accessibilityAction.attabal() == null || accessibilityAction2.attabal() != null;
        }
        return false;
    }

    public static final boolean taiyuan(SemanticsNode semanticsNode) {
        return !semanticsNode.triweekly().marial(SemanticsProperties.f7561attabal.beachfront());
    }

    public static final boolean triweekly(SemanticsNode semanticsNode, androidx.compose.ui.semantics.apical apicalVar) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = apicalVar.iterator();
        while (it.hasNext()) {
            if (!semanticsNode.triweekly().marial(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }
}
