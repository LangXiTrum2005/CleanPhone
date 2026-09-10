package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.view.PointerIconCompat;
import com.badlogic.gdx.graphics.GL20;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3935l7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4632a;
    public final /* synthetic */ C3491g4 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ RunnableC3935l7(C3491g4 c3491g4, Exception exc, int i) {
        this.f4632a = i;
        this.b = c3491g4;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4632a;
        Exception exc = this.c;
        C3491g4 c3491g4 = this.b;
        switch (i) {
            case 0:
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os = (SurfaceHolderCallbackC2658Os) c3491g4.c;
                int i2 = Ug0.f3833a;
                C4167nm c4167nm = (C4167nm) surfaceHolderCallbackC2658Os.f3526a.q;
                C3403f4 c3403f4M = c4167nm.M();
                c4167nm.N(c3403f4M, GL20.GL_BACK, new C3641hm(c3403f4M, exc, 1));
                break;
            default:
                SurfaceHolderCallbackC2658Os surfaceHolderCallbackC2658Os2 = (SurfaceHolderCallbackC2658Os) c3491g4.c;
                int i3 = Ug0.f3833a;
                C4167nm c4167nm2 = (C4167nm) surfaceHolderCallbackC2658Os2.f3526a.q;
                C3403f4 c3403f4M2 = c4167nm2.M();
                c4167nm2.N(c3403f4M2, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new C3641hm(c3403f4M2, exc, 2));
                break;
        }
    }
}
