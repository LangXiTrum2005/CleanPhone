package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class TA implements FP {
    public static final VS b = VS.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NN f3760a;

    public TA(NN nn) {
        this.f3760a = nn;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FP
    public final EP b(Object obj, int i, int i2, YS ys) {
        C3742iy c3742iy = (C3742iy) obj;
        NN nn = this.f3760a;
        if (nn != null) {
            DP dpA = DP.a(c3742iy);
            Object objA = ((C4654tK) nn.b).a(dpA);
            ArrayDeque arrayDeque = DP.d;
            synchronized (arrayDeque) {
                arrayDeque.offer(dpA);
            }
            C3742iy c3742iy2 = (C3742iy) objA;
            if (c3742iy2 == null) {
                ((C4654tK) nn.b).d(DP.a(c3742iy), c3742iy);
            } else {
                c3742iy = c3742iy2;
            }
        }
        return new EP(c3742iy, new C2974aB(c3742iy, ((Integer) ys.c(b)).intValue()));
    }
}
