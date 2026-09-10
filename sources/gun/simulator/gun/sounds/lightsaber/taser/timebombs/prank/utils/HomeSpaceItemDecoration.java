package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class HomeSpaceItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2793a;
    public final int b;

    public HomeSpaceItemDecoration(int i, int i2) {
        this.f2793a = i;
        this.b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        AbstractC2995aW.q(rect, "outRect");
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        AbstractC2995aW.q(recyclerView, "parent");
        AbstractC2995aW.q(state, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        int i = this.b;
        rect.bottom = i;
        rect.top = i;
        int i2 = this.f2793a;
        rect.left = i2;
        rect.right = i2;
    }
}
