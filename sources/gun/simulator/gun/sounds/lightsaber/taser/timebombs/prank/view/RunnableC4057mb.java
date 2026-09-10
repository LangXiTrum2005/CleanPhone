package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import android.view.View;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC4057mb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4701a;
    public final /* synthetic */ View b;

    public /* synthetic */ RunnableC4057mb(View view, int i) {
        this.f4701a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4701a;
        View view = this.b;
        switch (i) {
            case 0:
                view.requestLayout();
                break;
            case 1:
                ViewUtils.requestFocusAndShowKeyboard(view, false);
                break;
            default:
                SparseArray sparseArray = Oh0.f3515a;
                AbstractC2995aW.q(view, "$this_click");
                Oh0.f3515a.remove(view.getId());
                break;
        }
    }
}
