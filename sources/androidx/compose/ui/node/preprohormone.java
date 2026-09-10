package androidx.compose.ui.node;

import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: LayoutNodeAlignmentLines.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0010*\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/preprohormone;", "Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/ui/node/attabal;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/attabal;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/layout/attabal;", "alignmentLine", "", "taiyuan", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/attabal;)I", "Lsupplicat/competently;", X3.i.L, "wireman", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "", "marial", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class preprohormone extends AlignmentLines {
    public preprohormone(attabal attabalVar) {
        super(attabalVar, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public Map<androidx.compose.ui.layout.attabal, Integer> marial(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.wostteth().saneness();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public int taiyuan(NodeCoordinator nodeCoordinator, androidx.compose.ui.layout.attabal attabalVar) {
        return nodeCoordinator.coi(attabalVar);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public long wireman(NodeCoordinator nodeCoordinator, long j) {
        return NodeCoordinator.rsp(nodeCoordinator, j, false, 2, null);
    }
}
