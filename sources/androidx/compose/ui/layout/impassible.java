package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.yemenite;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LookaheadLayoutCoordinates.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0003\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/yemenite;", "attabal", "(Landroidx/compose/ui/node/yemenite;)Landroidx/compose/ui/node/yemenite;", "rootLookaheadDelegate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class impassible {
    public static final yemenite attabal(yemenite yemeniteVar) {
        LayoutNode layoutNode = yemeniteVar.getLayoutNode();
        while (true) {
            LayoutNode layoutNodePermissivist = layoutNode.permissivist();
            if ((layoutNodePermissivist != null ? layoutNodePermissivist.getLookaheadRoot() : null) == null) {
                yemenite lookaheadDelegate = layoutNode.clubfoot().getLookaheadDelegate();
                Intrinsics.beachfront(lookaheadDelegate);
                return lookaheadDelegate;
            }
            LayoutNode layoutNodePermissivist2 = layoutNode.permissivist();
            LayoutNode lookaheadRoot = layoutNodePermissivist2 != null ? layoutNodePermissivist2.getLookaheadRoot() : null;
            Intrinsics.beachfront(lookaheadRoot);
            if (lookaheadRoot.getIsVirtualLookaheadRoot()) {
                layoutNode = layoutNode.permissivist();
                Intrinsics.beachfront(layoutNode);
            } else {
                LayoutNode layoutNodePermissivist3 = layoutNode.permissivist();
                Intrinsics.beachfront(layoutNodePermissivist3);
                layoutNode = layoutNodePermissivist3.getLookaheadRoot();
                Intrinsics.beachfront(layoutNode);
            }
        }
    }
}
