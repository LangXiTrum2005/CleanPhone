package androidx.compose.ui.layout;

import androidx.compose.ui.node.peridotite;
import androidx.compose.ui.unit.LayoutDirection;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/adultoid;", "Landroidx/compose/ui/layout/gintrap$attabal;", "Landroidx/compose/ui/node/peridotite;", "owner", "<init>", "(Landroidx/compose/ui/node/peridotite;)V", "saneness", "Landroidx/compose/ui/node/peridotite;", "getOwner", "()Landroidx/compose/ui/node/peridotite;", "", "marial", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "wireman", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class adultoid extends gintrap.attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final peridotite owner;

    public adultoid(peridotite peridotiteVar) {
        this.owner = peridotiteVar;
    }

    @Override // androidx.compose.ui.layout.gintrap.attabal
    /* JADX INFO: renamed from: marial */
    public int getParentWidth() {
        return this.owner.getRoot().milliradian();
    }

    @Override // androidx.compose.ui.layout.gintrap.attabal
    /* JADX INFO: renamed from: wireman */
    public LayoutDirection getParentLayoutDirection() {
        return this.owner.getLayoutDirection();
    }
}
