package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Sh0 {
    public static Integer d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3728a;
    public final ArrayList b = new ArrayList();
    public Rh0 c;

    public Sh0(View view) {
        this.f3728a = view;
    }

    public final int a(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        View view = this.f3728a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = view.getContext();
        if (d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            AbstractC2871Wx.V(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return d.intValue();
    }
}
