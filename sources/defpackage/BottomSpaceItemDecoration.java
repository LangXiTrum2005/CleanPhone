package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class BottomSpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1a;

    public BottomSpaceItemDecoration(int i) {
        this.f1a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        AbstractC2995aW.q(rect, "outRect");
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(recyclerView, "parent");
        AbstractC2995aW.q(state, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.bottom = this.f1a;
    }
}
