package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.uZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4757uZ implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5083a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ RunnableC4757uZ(int i, int i2, Object obj) {
        this.f5083a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5083a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ResourcesCompat.FontCallback) obj).lambda$callbackFailAsync$1(i2);
                break;
            case 1:
                C3409f7 c3409f7 = ((C3233d7) obj).b;
                c3409f7.getClass();
                if (i2 == -3 || i2 == -2) {
                    if (i2 != -2) {
                        Z6 z6 = c3409f7.d;
                        if (!(z6 != null && z6.f4055a == 1)) {
                            c3409f7.d(3);
                        }
                    }
                    c3409f7.b(0);
                    c3409f7.d(2);
                } else if (i2 == -1) {
                    c3409f7.b(-1);
                    c3409f7.a();
                } else if (i2 == 1) {
                    c3409f7.d(1);
                    c3409f7.b(1);
                } else {
                    AbstractC4038mJ.f();
                }
                break;
            default:
                ((SideSheetBehavior) obj).lambda$setState$0(i2);
                break;
        }
    }
}
