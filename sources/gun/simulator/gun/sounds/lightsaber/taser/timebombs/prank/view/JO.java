package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class JO implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3265a;
    public final /* synthetic */ C3692iN b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ JO(C3692iN c3692iN, Pair pair, int i) {
        this.f3265a = i;
        this.b = c3692iN;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3265a;
        Pair pair = this.c;
        C3692iN c3692iN = this.b;
        switch (i) {
            case 0:
                ((C4167nm) ((OO) c3692iN.c).h).f(((Integer) pair.first).intValue(), (C5186zO) pair.second);
                break;
            case 1:
                ((C4167nm) ((OO) c3692iN.c).h).G(((Integer) pair.first).intValue(), (C5186zO) pair.second);
                break;
            case 2:
                ((C4167nm) ((OO) c3692iN.c).h).x(((Integer) pair.first).intValue(), (C5186zO) pair.second);
                break;
            default:
                ((C4167nm) ((OO) c3692iN.c).h).e(((Integer) pair.first).intValue(), (C5186zO) pair.second);
                break;
        }
    }
}
