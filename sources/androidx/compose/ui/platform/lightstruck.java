package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import java.util.List;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/lightstruck;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "Landroidx/collection/kowloon;", "Landroidx/compose/ui/platform/monroe;", "currentSemanticsNodes", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/collection/kowloon;)V", "Landroidx/compose/ui/semantics/apical;", "attabal", "Landroidx/compose/ui/semantics/apical;", "saneness", "()Landroidx/compose/ui/semantics/apical;", "unmergedConfig", "Landroidx/collection/sealless;", "Landroidx/collection/sealless;", "()Landroidx/collection/sealless;", "children", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class lightstruck {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.ui.semantics.apical unmergedConfig;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.sealless children = androidx.collection.polloi.saneness();

    public lightstruck(SemanticsNode semanticsNode, androidx.collection.kowloon<monroe> kowloonVar) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig();
        List<SemanticsNode> listGraveside = semanticsNode.graveside();
        int size = listGraveside.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = listGraveside.get(i);
            if (kowloonVar.attabal(semanticsNode2.getId())) {
                this.children.beachfront(semanticsNode2.getId());
            }
        }
    }

    /* JADX INFO: renamed from: attabal, reason: from getter */
    public final androidx.collection.sealless getChildren() {
        return this.children;
    }

    /* JADX INFO: renamed from: saneness, reason: from getter */
    public final androidx.compose.ui.semantics.apical getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
