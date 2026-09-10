package androidx.compose.ui.node;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\fJ\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/node/impromptu;", "", "", "extraAssertions", "<init>", "(Z)V", "Landroidx/compose/ui/node/LayoutNode;", "node", "affectsLookahead", "marial", "(Landroidx/compose/ui/node/LayoutNode;Z)Z", "wireman", "(Landroidx/compose/ui/node/LayoutNode;)Z", "", "dern", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "taiyuan", "beachfront", "()Z", "competently", "(Z)Z", "impromptu", "Landroidx/compose/ui/node/DepthSortedSet;", "attabal", "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadSet", "saneness", "set", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final DepthSortedSet lookaheadSet;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final DepthSortedSet set;

    public impromptu(boolean z) {
        this.lookaheadSet = new DepthSortedSet(z);
        this.set = new DepthSortedSet(z);
    }

    public final boolean beachfront() {
        return this.set.wireman() && this.lookaheadSet.wireman();
    }

    public final boolean competently(boolean affectsLookahead) {
        return (affectsLookahead ? this.lookaheadSet : this.set).wireman();
    }

    public final void dern(LayoutNode node, boolean affectsLookahead) {
        if (affectsLookahead) {
            this.lookaheadSet.attabal(node);
            this.set.attabal(node);
        } else {
            if (this.lookaheadSet.saneness(node)) {
                return;
            }
            this.set.attabal(node);
        }
    }

    public final boolean impromptu() {
        return !beachfront();
    }

    public final boolean marial(LayoutNode node, boolean affectsLookahead) {
        boolean zSaneness = this.lookaheadSet.saneness(node);
        if (affectsLookahead) {
            return zSaneness;
        }
        return zSaneness || this.set.saneness(node);
    }

    public final boolean taiyuan(LayoutNode node) {
        return this.set.beachfront(node) || this.lookaheadSet.beachfront(node);
    }

    public final boolean wireman(LayoutNode node) {
        return this.lookaheadSet.saneness(node) || this.set.saneness(node);
    }
}
