package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.mikhaellopez.circleview.CircleView;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2930Ze extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CircleView f4083a;

    public C2930Ze(CircleView circleView) {
        this.f4083a = circleView;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (outline != null) {
            int i = this.f4083a.e;
            outline.setOval(0, 0, i, i);
        }
    }
}
