package androidx.compose.ui.node;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnPositionedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R \u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/hydrovane;", "", "<init>", "()V", "", "dern", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "wireman", "(Landroidx/compose/ui/node/LayoutNode;)V", "beachfront", "rootNode", "marial", "attabal", "layoutNode", "saneness", "Landroidx/compose/runtime/collection/dern;", "Landroidx/compose/runtime/collection/dern;", "layoutNodes", "", "[Landroidx/compose/ui/node/LayoutNode;", "cachedNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class hydrovane {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int f7007wireman = 8;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<LayoutNode> layoutNodes = new androidx.compose.runtime.collection.dern<>(new LayoutNode[16], 0);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public LayoutNode[] cachedNodes;

    public final void attabal() {
        this.layoutNodes.preprohormone(Companion.C0049attabal.f7010kowloon);
        int size = this.layoutNodes.getSize();
        LayoutNode[] layoutNodeArr = this.cachedNodes;
        if (layoutNodeArr == null || layoutNodeArr.length < size) {
            layoutNodeArr = new LayoutNode[Math.max(16, this.layoutNodes.getSize())];
        }
        this.cachedNodes = null;
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i] = this.layoutNodes.apical()[i];
        }
        this.layoutNodes.impromptu();
        while (true) {
            size--;
            if (-1 >= size) {
                this.cachedNodes = layoutNodeArr;
                return;
            }
            LayoutNode layoutNode = layoutNodeArr[size];
            Intrinsics.beachfront(layoutNode);
            if (layoutNode.getNeedsOnPositionedDispatch()) {
                saneness(layoutNode);
            }
        }
    }

    public final void beachfront(LayoutNode node) {
        this.layoutNodes.monoploid(node);
    }

    public final boolean dern() {
        return this.layoutNodes.kowloon();
    }

    public final void marial(LayoutNode rootNode) {
        this.layoutNodes.impromptu();
        this.layoutNodes.saneness(rootNode);
        rootNode.decarock(true);
    }

    public final void saneness(LayoutNode layoutNode) {
        layoutNode.monoploid();
        int i = 0;
        layoutNode.decarock(false);
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = layoutNode.coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            do {
                saneness(layoutNodeArrApical[i]);
                i++;
            } while (i < size);
        }
    }

    public final void wireman(LayoutNode node) {
        this.layoutNodes.saneness(node);
        node.decarock(true);
    }
}
