package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import androidx.profileinstaller.ProfileInstaller;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class XV implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3971a;
    public final /* synthetic */ Context b;

    public /* synthetic */ XV(Context context, int i) {
        this.f3971a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3971a;
        Context context = this.b;
        switch (i) {
            case 0:
                ProfileInstallerInitializer.writeInBackground(context);
                break;
            default:
                ProfileInstaller.writeProfile(context);
                break;
        }
    }
}
