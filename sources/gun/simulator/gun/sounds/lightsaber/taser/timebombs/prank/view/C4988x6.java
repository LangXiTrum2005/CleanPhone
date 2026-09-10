package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4988x6 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        A6 a6A;
        while (true) {
            try {
                synchronized (A6.class) {
                    A6 a6 = A6.j;
                    a6A = FW.a();
                    if (a6A == A6.j) {
                        A6.j = null;
                        return;
                    }
                }
                if (a6A != null) {
                    a6A.k();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
