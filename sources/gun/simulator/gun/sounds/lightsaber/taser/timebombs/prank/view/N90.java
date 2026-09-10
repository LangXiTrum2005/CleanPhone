package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class N90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3444a;
    public final Handler b;
    public final M90 c;
    public final AudioManager d;
    public C4024m70 e;
    public int f;
    public int g;
    public boolean h;

    public N90(Context context, Handler handler, SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os) {
        Context applicationContext = context.getApplicationContext();
        this.f3444a = applicationContext;
        this.b = handler;
        this.c = surfaceHolderCallbackC2658Os;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        FW.t(audioManager);
        this.d = audioManager;
        this.f = 3;
        this.g = a(audioManager, 3);
        int i = this.f;
        this.h = Ug0.f3833a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        C4024m70 c4024m70 = new C4024m70(this);
        try {
            applicationContext.registerReceiver(c4024m70, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.e = c4024m70;
        } catch (RuntimeException e) {
            AbstractC4038mJ.g("Error registering stream volume receiver", e);
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            AbstractC4038mJ.g("Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void b(int i) {
        if (this.f == i) {
            return;
        }
        this.f = i;
        c();
        C2736Rs c2736Rs = ((SurfaceHolderCallbackC2658Os) this.c).f3526a;
        C2421Fo c2421FoK = C2736Rs.k(c2736Rs.A);
        if (c2421FoK.equals(c2736Rs.e0)) {
            return;
        }
        c2736Rs.e0 = c2421FoK;
        c2736Rs.l.e(29, new Md0(c2421FoK, 17));
    }

    public final void c() {
        final boolean zIsStreamMute;
        int i = this.f;
        AudioManager audioManager = this.d;
        final int iA = a(audioManager, i);
        int i2 = this.f;
        if (Ug0.f3833a >= 23) {
            zIsStreamMute = audioManager.isStreamMute(i2);
        } else {
            zIsStreamMute = a(audioManager, i2) == 0;
        }
        if (this.g == iA && this.h == zIsStreamMute) {
            return;
        }
        this.g = iA;
        this.h = zIsStreamMute;
        ((SurfaceHolderCallbackC2658Os) this.c).f3526a.l.e(30, new BI() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ns
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BI
            public final void invoke(Object obj) {
                ((JU) obj).k(iA, zIsStreamMute);
            }
        });
    }
}
