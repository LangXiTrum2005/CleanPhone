package androidx.compose.ui.node;

import com.ironsource.C3700q2;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: UiApplier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/lerp;", "Landroidx/compose/runtime/attabal;", "Landroidx/compose/ui/node/LayoutNode;", "root", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "index", C3700q2.p, "", "triweekly", "(ILandroidx/compose/ui/node/LayoutNode;)V", "impassible", "count", "attabal", "(II)V", "from", "to", "saneness", "(III)V", "apical", "()V", "wireman", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class lerp extends androidx.compose.runtime.attabal<LayoutNode> {
    public lerp(LayoutNode layoutNode) {
        super(layoutNode);
    }

    @Override // androidx.compose.runtime.attabal
    public void apical() {
        cutely().deadwork();
    }

    @Override // androidx.compose.runtime.wireman
    public void attabal(int index, int count) {
        taiyuan().molet(index, count);
    }

    @Override // androidx.compose.runtime.wireman
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public void marial(int index, LayoutNode instance) {
        taiyuan().empress(index, instance);
    }

    @Override // androidx.compose.runtime.wireman
    public void saneness(int from, int to, int count) {
        taiyuan().dhss(from, to, count);
    }

    @Override // androidx.compose.runtime.wireman
    public void wireman() {
        super.wireman();
        peridotite owner = cutely().getOwner();
        if (owner != null) {
            owner.gintrap();
        }
    }

    @Override // androidx.compose.runtime.wireman
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public void dern(int index, LayoutNode instance) {
    }
}
