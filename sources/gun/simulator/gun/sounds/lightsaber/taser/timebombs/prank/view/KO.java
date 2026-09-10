package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class KO implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3314a;
    public final /* synthetic */ FI b;
    public final /* synthetic */ C3779jO c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ KO(Object obj, Object obj2, FI fi, C3779jO c3779jO, IOException iOException, boolean z, int i) {
        this.f3314a = i;
        this.f = obj;
        this.g = obj2;
        this.b = fi;
        this.c = c3779jO;
        this.d = iOException;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3314a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                ((C4167nm) ((OO) ((C3692iN) obj2).c).h).j(((Integer) pair.first).intValue(), (C5186zO) pair.second, this.b, this.c, this.d, this.e);
                break;
            default:
                DO r2 = (DO) obj2;
                ((EO) obj).j(r2.f2968a, r2.b, this.b, this.c, this.d, this.e);
                break;
        }
    }
}
