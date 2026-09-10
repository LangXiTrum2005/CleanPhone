package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2799a;
    public final /* synthetic */ Context b;

    public /* synthetic */ A5(Context context, int i) {
        this.f2799a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2799a;
        Context context = this.b;
        switch (i) {
            case 0:
                AppCompatDelegate.lambda$syncRequestedAndStoredLocales$1(context);
                break;
            default:
                AppCompatDelegate.syncRequestedAndStoredLocales(context);
                break;
        }
    }
}
