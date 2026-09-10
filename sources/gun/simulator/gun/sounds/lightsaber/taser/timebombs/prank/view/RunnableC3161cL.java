package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Dialog;
import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC3161cL implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4217a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC3161cL(C3225d3 c3225d3, J5 j5, BS bs, boolean z) {
        this.c = c3225d3;
        this.d = j5;
        this.e = bs;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4217a;
        boolean z = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                C4304pL.m264processCommand$lambda12((C4304pL) obj3, (Ei0) obj2, z, (String) obj);
                break;
            default:
                C3225d3 c3225d3 = (C3225d3) obj3;
                J5 j5 = (J5) obj2;
                BS bs = (BS) obj;
                c3225d3.getClass();
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
                c3225d3.d.n = false;
                if (bs != null) {
                    bs.h(z);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC3161cL(C4304pL c4304pL, Ei0 ei0, boolean z, String str) {
        this.c = c4304pL;
        this.d = ei0;
        this.b = z;
        this.e = str;
    }
}
