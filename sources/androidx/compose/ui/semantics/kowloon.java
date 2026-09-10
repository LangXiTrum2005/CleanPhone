package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/semantics/kowloon;", "", "Landroidx/compose/ui/node/LayoutNode;", "rootNode", "Landroidx/compose/ui/semantics/marial;", "outerSemanticsNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/marial;)V", "attabal", "Landroidx/compose/ui/node/LayoutNode;", "saneness", "Landroidx/compose/ui/semantics/marial;", "Landroidx/compose/ui/semantics/SemanticsNode;", "()Landroidx/compose/ui/semantics/SemanticsNode;", "unmergedRootSemanticsNode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode rootNode;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final marial outerSemanticsNode;

    public kowloon(LayoutNode layoutNode, marial marialVar) {
        this.rootNode = layoutNode;
        this.outerSemanticsNode = marialVar;
    }

    public final SemanticsNode attabal() {
        return new SemanticsNode(this.outerSemanticsNode, false, this.rootNode, new apical());
    }
}
