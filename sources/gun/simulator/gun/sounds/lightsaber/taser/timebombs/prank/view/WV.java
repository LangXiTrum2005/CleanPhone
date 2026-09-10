package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.profileinstaller.ProfileInstaller;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WV implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3922a;
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ WV(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i2) {
        this.f3922a = i2;
        this.b = diagnosticsCallback;
        this.c = i;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3922a;
        ProfileInstaller.DiagnosticsCallback diagnosticsCallback = this.b;
        Object obj = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                diagnosticsCallback.onResultReceived(i2, obj);
                break;
            default:
                diagnosticsCallback.onDiagnosticReceived(i2, obj);
                break;
        }
    }
}
