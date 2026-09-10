package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3136c3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4200a = 0;
    public final /* synthetic */ C3927l3 b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ J5 d;
    public final /* synthetic */ BS e;
    public final /* synthetic */ BS f;

    public /* synthetic */ RunnableC3136c3(C3927l3 c3927l3, J5 j5, WeakReference weakReference, C3225d3 c3225d3, BS bs) {
        this.b = c3927l3;
        this.d = j5;
        this.c = weakReference;
        this.e = c3225d3;
        this.f = bs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4200a;
        C3927l3 c3927l3 = this.b;
        switch (i) {
            case 0:
                J5 j5 = this.d;
                c3927l3.getClass();
                try {
                    Dialog dialog = j5.g;
                    Context context = dialog.getContext();
                    if (dialog.isShowing()) {
                        if (context == null || context.isRestricted()) {
                            dialog.setCancelable(true);
                            dialog.setCanceledOnTouchOutside(true);
                        } else {
                            dialog.dismiss();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                RunnableC3136c3 runnableC3136c3 = new RunnableC3136c3(c3927l3, this.c, j5, this.e, this.f);
                if (!c3927l3.l.get()) {
                    runnableC3136c3.run();
                } else {
                    C4981x20.u().v(800L, runnableC3136c3);
                }
                break;
            default:
                c3927l3.getClass();
                WeakReference weakReference = this.c;
                if (weakReference.get() == null || AbstractApplicationC2673Ph.c()) {
                    BS bs = this.f;
                    if (bs != null) {
                        bs.d(null);
                        bs.h(false);
                    }
                } else {
                    c3927l3.W((Activity) weakReference.get(), this.d, this.e);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC3136c3(C3927l3 c3927l3, WeakReference weakReference, J5 j5, BS bs, BS bs2) {
        this.b = c3927l3;
        this.c = weakReference;
        this.d = j5;
        this.e = bs;
        this.f = bs2;
    }
}
