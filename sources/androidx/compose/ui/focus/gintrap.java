package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OneDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/focus/gintrap;", "Ljava/util/Comparator;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lkotlin/Comparator;", "<init>", "()V", "focusTarget1", "focusTarget2", "", "attabal", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)I", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/runtime/collection/dern;", "saneness", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/runtime/collection/dern;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class gintrap implements Comparator<FocusTargetNode> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final gintrap f6449kowloon = new gintrap();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTarget1, FocusTargetNode focusTarget2) {
        if (focusTarget1 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        if (focusTarget2 == null) {
            throw new IllegalArgumentException("compare requires non-null focus targets");
        }
        int i = 0;
        if (!dovishness.competently(focusTarget1) || !dovishness.competently(focusTarget2)) {
            if (dovishness.competently(focusTarget1)) {
                return -1;
            }
            return dovishness.competently(focusTarget2) ? 1 : 0;
        }
        LayoutNode layoutNodeImpromptu = androidx.compose.ui.node.beachfront.impromptu(focusTarget1);
        LayoutNode layoutNodeImpromptu2 = androidx.compose.ui.node.beachfront.impromptu(focusTarget2);
        if (Intrinsics.wireman(layoutNodeImpromptu, layoutNodeImpromptu2)) {
            return 0;
        }
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarSaneness = saneness(layoutNodeImpromptu);
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarSaneness2 = saneness(layoutNodeImpromptu2);
        int iMin = Math.min(dernVarSaneness.getSize() - 1, dernVarSaneness2.getSize() - 1);
        if (iMin >= 0) {
            while (Intrinsics.wireman(dernVarSaneness.apical()[i], dernVarSaneness2.apical()[i])) {
                if (i != iMin) {
                    i++;
                }
            }
            return Intrinsics.taiyuan(dernVarSaneness.apical()[i].cultivated(), dernVarSaneness2.apical()[i].cultivated());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }

    public final androidx.compose.runtime.collection.dern<LayoutNode> saneness(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.dern<LayoutNode> dernVar = new androidx.compose.runtime.collection.dern<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            dernVar.attabal(0, layoutNode);
            layoutNode = layoutNode.permissivist();
        }
        return dernVar;
    }
}
