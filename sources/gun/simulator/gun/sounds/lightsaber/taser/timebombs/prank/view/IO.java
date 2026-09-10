package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class IO implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3215a;
    public final /* synthetic */ C3692iN b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ C3779jO d;

    public /* synthetic */ IO(C3692iN c3692iN, Pair pair, C3779jO c3779jO, int i) {
        this.f3215a = i;
        this.b = c3692iN;
        this.c = pair;
        this.d = c3779jO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3215a;
        C3779jO c3779jO = this.d;
        Pair pair = this.c;
        C3692iN c3692iN = this.b;
        switch (i) {
            case 0:
                ((C4167nm) ((OO) c3692iN.c).h).s(((Integer) pair.first).intValue(), (C5186zO) pair.second, c3779jO);
                break;
            default:
                InterfaceC3050b4 interfaceC3050b4 = ((OO) c3692iN.c).h;
                int iIntValue = ((Integer) pair.first).intValue();
                C5186zO c5186zO = (C5186zO) pair.second;
                c5186zO.getClass();
                ((C4167nm) interfaceC3050b4).c(iIntValue, c5186zO, c3779jO);
                break;
        }
    }
}
