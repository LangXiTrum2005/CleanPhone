package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.peridotite;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: FocusTargetNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/adultoid;", "wireman", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/adultoid;", "", "dern", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "saneness", "focusTransactionManager", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class graveside {
    public static final void dern(FocusTargetNode focusTargetNode) {
        androidx.compose.ui.node.beachfront.taiyuan(focusTargetNode).getFocusOwner().marial(focusTargetNode);
    }

    public static final adultoid saneness(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        peridotite owner;
        FocusOwner focusOwner;
        NodeCoordinator coordinator = focusTargetNode.getNode().getCoordinator();
        if (coordinator == null || (layoutNode = coordinator.getLayoutNode()) == null || (owner = layoutNode.getOwner()) == null || (focusOwner = owner.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.getFocusTransactionManager();
    }

    public static final adultoid wireman(FocusTargetNode focusTargetNode) {
        return androidx.compose.ui.node.beachfront.taiyuan(focusTargetNode).getFocusOwner().getFocusTransactionManager();
    }
}
