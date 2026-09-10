package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class StatusBarFitView extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarFitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC2995aW.q(context, f.X);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC2995aW.q(canvas, "canvas");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(0, i), View.resolveSize(getResources().getDimensionPixelOffset(getResources().getIdentifier("status_bar_height", "dimen", "android")), i2));
    }
}
