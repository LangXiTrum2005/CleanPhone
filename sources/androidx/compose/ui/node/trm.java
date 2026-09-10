package androidx.compose.ui.node;

import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LayoutTreeConsistencyChecker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/node/trm;", "", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/impromptu;", "relayoutNodes", "", "Landroidx/compose/ui/node/sealless$attabal;", "postponedMeasureRequests", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/impromptu;Ljava/util/List;)V", "", "attabal", "()V", "node", "", "dern", "(Landroidx/compose/ui/node/LayoutNode;)Z", "saneness", "", "beachfront", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "wireman", "()Ljava/lang/String;", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/impromptu;", "Ljava/util/List;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode root;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final List<sealless.attabal> postponedMeasureRequests;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final impromptu relayoutNodes;

    public trm(LayoutNode layoutNode, impromptu impromptuVar, List<sealless.attabal> list) {
        this.root = layoutNode;
        this.relayoutNodes = impromptuVar;
        this.postponedMeasureRequests = list;
    }

    public static final void marial(trm trmVar, StringBuilder sb, LayoutNode layoutNode, int i) {
        String strBeachfront = trmVar.beachfront(layoutNode);
        if (strBeachfront.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(strBeachfront);
            Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
            i++;
        }
        List<LayoutNode> listRotuma = layoutNode.rotuma();
        int size = listRotuma.size();
        for (int i3 = 0; i3 < size; i3++) {
            marial(trmVar, sb, listRotuma.get(i3), i);
        }
    }

    public final void attabal() {
        if (dern(this.root)) {
            return;
        }
        wireman();
        System.out.getClass();
        throw new IllegalStateException("Inconsistency found!");
    }

    public final String beachfront(LayoutNode node) {
        StringBuilder sb = new StringBuilder();
        sb.append(node);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(node.merc());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!node.attabal()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + node.walach() + ']');
        if (!saneness(node)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final boolean dern(LayoutNode node) {
        if (!saneness(node)) {
            return false;
        }
        List<LayoutNode> listRotuma = node.rotuma();
        int size = listRotuma.size();
        for (int i = 0; i < size; i++) {
            if (!dern(listRotuma.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean saneness(LayoutNode layoutNode) {
        sealless.attabal attabalVar;
        LayoutNode layoutNodePermissivist = layoutNode.permissivist();
        sealless.attabal attabalVar2 = null;
        LayoutNode.LayoutState layoutStateMerc = layoutNodePermissivist != null ? layoutNodePermissivist.merc() : null;
        if (layoutNode.attabal() || (layoutNode.cultivated() != Integer.MAX_VALUE && layoutNodePermissivist != null && layoutNodePermissivist.attabal())) {
            if (layoutNode.starveling()) {
                List<sealless.attabal> list = this.postponedMeasureRequests;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        attabalVar = null;
                        break;
                    }
                    attabalVar = list.get(i);
                    sealless.attabal attabalVar3 = attabalVar;
                    if (Intrinsics.wireman(attabalVar3.getNode(), layoutNode) && !attabalVar3.getIsLookahead()) {
                        break;
                    }
                    i++;
                }
                if (attabalVar != null) {
                    return true;
                }
            }
            if (layoutNode.starveling()) {
                return this.relayoutNodes.wireman(layoutNode) || layoutNode.merc() == LayoutNode.LayoutState.LookaheadMeasuring || (layoutNodePermissivist != null && layoutNodePermissivist.starveling()) || ((layoutNodePermissivist != null && layoutNodePermissivist.seminary()) || layoutStateMerc == LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.restrictive()) {
                return this.relayoutNodes.wireman(layoutNode) || layoutNodePermissivist == null || layoutNodePermissivist.starveling() || layoutNodePermissivist.restrictive() || layoutStateMerc == LayoutNode.LayoutState.Measuring || layoutStateMerc == LayoutNode.LayoutState.LayingOut;
            }
        }
        if (Intrinsics.wireman(layoutNode.monroe(), Boolean.TRUE)) {
            if (layoutNode.seminary()) {
                List<sealless.attabal> list2 = this.postponedMeasureRequests;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sealless.attabal attabalVar4 = list2.get(i2);
                    sealless.attabal attabalVar5 = attabalVar4;
                    if (Intrinsics.wireman(attabalVar5.getNode(), layoutNode) && attabalVar5.getIsLookahead()) {
                        attabalVar2 = attabalVar4;
                        break;
                    }
                }
                if (attabalVar2 != null) {
                    return true;
                }
            }
            if (layoutNode.seminary()) {
                return this.relayoutNodes.marial(layoutNode, true) || (layoutNodePermissivist != null && layoutNodePermissivist.seminary()) || layoutStateMerc == LayoutNode.LayoutState.LookaheadMeasuring || (layoutNodePermissivist != null && layoutNodePermissivist.starveling() && Intrinsics.wireman(layoutNode.getLookaheadRoot(), layoutNode));
            }
            if (layoutNode.polder() && !this.relayoutNodes.marial(layoutNode, true) && layoutNodePermissivist != null && !layoutNodePermissivist.seminary() && !layoutNodePermissivist.polder() && layoutStateMerc != LayoutNode.LayoutState.LookaheadMeasuring && layoutStateMerc != LayoutNode.LayoutState.LookaheadLayingOut && (!layoutNodePermissivist.restrictive() || !Intrinsics.wireman(layoutNode.getLookaheadRoot(), layoutNode))) {
                return false;
            }
        }
        return true;
    }

    public final String wireman() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        marial(this, sb, this.root, 0);
        return sb.toString();
    }
}
