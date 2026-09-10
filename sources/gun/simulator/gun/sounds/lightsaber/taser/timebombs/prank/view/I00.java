package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class I00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TreeSet f3196a = new TreeSet(new P70(2));
    public int b;
    public int c;
    public boolean d;

    public I00() {
        e();
    }

    public static int b(int i, int i2) {
        int iMin;
        int i3 = i - i2;
        if (Math.abs(i3) <= 1000 || (iMin = (Math.min(i, i2) - Math.max(i, i2)) + 65535) >= 1000) {
            return i3;
        }
        return i < i2 ? iMin : -iMin;
    }

    public final synchronized void a(H00 h00) {
        this.b = h00.f3148a.c;
        this.f3196a.add(h00);
    }

    public final synchronized void c(G00 g00, long j) {
        if (this.f3196a.size() >= 5000) {
            throw new IllegalStateException("Queue size limit of 5000 reached.");
        }
        int i = g00.c;
        if (!this.d) {
            e();
            this.c = FW.O(i - 1);
            this.d = true;
            a(new H00(g00, j));
            return;
        }
        if (Math.abs(b(i, G00.a(this.b))) < 1000) {
            if (b(i, this.c) > 0) {
                a(new H00(g00, j));
            }
        } else {
            this.c = FW.O(i - 1);
            this.f3196a.clear();
            a(new H00(g00, j));
        }
    }

    public final synchronized G00 d(long j) {
        if (this.f3196a.isEmpty()) {
            return null;
        }
        H00 h00 = (H00) this.f3196a.first();
        int i = h00.f3148a.c;
        if (i != G00.a(this.c) && j < h00.b) {
            return null;
        }
        this.f3196a.pollFirst();
        this.c = i;
        return h00.f3148a;
    }

    public final synchronized void e() {
        this.f3196a.clear();
        this.d = false;
        this.c = -1;
        this.b = -1;
    }
}
