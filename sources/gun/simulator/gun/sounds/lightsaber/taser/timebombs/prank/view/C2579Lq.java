package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Application;
import android.database.ContentObserver;
import android.provider.Settings;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.GravityCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2579Lq extends ContentObserver {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f3376a;
    public Application b;
    public Boolean c;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ArrayList arrayList;
        super.onChange(z);
        Application application = this.b;
        if (application == null || application.getContentResolver() == null || (arrayList = this.f3376a) == null || arrayList.isEmpty()) {
            return;
        }
        int i = Settings.System.getInt(this.b.getContentResolver(), "navigationbar_is_min", 0);
        for (com.gyf.immersionbar.a aVar : this.f3376a) {
            boolean z2 = i == 0;
            View viewFindViewById = aVar.e.findViewById(R.id.immersion_navigation_bar_view);
            if (viewFindViewById != null) {
                aVar.l = new S8(aVar.f850a);
                int paddingBottom = aVar.f.getPaddingBottom();
                int paddingRight = aVar.f.getPaddingRight();
                if (z2) {
                    viewFindViewById.setVisibility(0);
                    if (!com.gyf.immersionbar.a.a(aVar.e.findViewById(android.R.id.content))) {
                        if (aVar.m == 0) {
                            aVar.m = aVar.l.c;
                        }
                        if (aVar.n == 0) {
                            aVar.n = aVar.l.d;
                        }
                        if (!aVar.k.f) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
                            if (aVar.l.c()) {
                                layoutParams.gravity = 80;
                                paddingBottom = aVar.m;
                                layoutParams.height = paddingBottom;
                                if (aVar.k.e) {
                                    paddingBottom = 0;
                                }
                                paddingRight = 0;
                            } else {
                                layoutParams.gravity = GravityCompat.END;
                                int i2 = aVar.n;
                                layoutParams.width = i2;
                                if (aVar.k.e) {
                                    i2 = 0;
                                }
                                paddingRight = i2;
                                paddingBottom = 0;
                            }
                            viewFindViewById.setLayoutParams(layoutParams);
                        }
                    }
                    aVar.i(aVar.f.getPaddingTop(), paddingRight, paddingBottom);
                } else {
                    viewFindViewById.setVisibility(8);
                }
                paddingBottom = 0;
                paddingRight = 0;
                aVar.i(aVar.f.getPaddingTop(), paddingRight, paddingBottom);
            }
        }
    }
}
