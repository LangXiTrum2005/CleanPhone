package androidx.compose.ui.layout;

import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.LayoutDirection;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/apical;", "Landroidx/compose/ui/layout/gintrap$attabal;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "within", "<init>", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;)V", "saneness", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "", "marial", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "wireman", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class apical extends gintrap.attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final LookaheadCapablePlaceable within;

    public apical(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.within = lookaheadCapablePlaceable;
    }

    @Override // androidx.compose.ui.layout.gintrap.attabal
    /* JADX INFO: renamed from: marial */
    public int getParentWidth() {
        return this.within.permissivist();
    }

    @Override // androidx.compose.ui.layout.gintrap.attabal
    /* JADX INFO: renamed from: wireman */
    public LayoutDirection getParentLayoutDirection() {
        return this.within.getLayoutDirection();
    }
}
