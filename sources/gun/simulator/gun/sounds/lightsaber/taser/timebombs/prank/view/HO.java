package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HO implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3170a;
    public final /* synthetic */ C3692iN b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ FI d;
    public final /* synthetic */ C3779jO e;

    public /* synthetic */ HO(C3692iN c3692iN, Pair pair, FI fi, C3779jO c3779jO, int i) {
        this.f3170a = i;
        this.b = c3692iN;
        this.c = pair;
        this.d = fi;
        this.e = c3779jO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3170a;
        C3779jO c3779jO = this.e;
        FI fi = this.d;
        Pair pair = this.c;
        C3692iN c3692iN = this.b;
        switch (i) {
            case 0:
                ((C4167nm) ((OO) c3692iN.c).h).z(((Integer) pair.first).intValue(), (C5186zO) pair.second, fi, c3779jO);
                break;
            case 1:
                ((C4167nm) ((OO) c3692iN.c).h).u(((Integer) pair.first).intValue(), (C5186zO) pair.second, fi, c3779jO);
                break;
            default:
                ((C4167nm) ((OO) c3692iN.c).h).r(((Integer) pair.first).intValue(), (C5186zO) pair.second, fi, c3779jO);
                break;
        }
    }
}
