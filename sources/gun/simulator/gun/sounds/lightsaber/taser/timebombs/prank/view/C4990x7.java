package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4990x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4902w7 f5207a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public C4990x7(AudioTrack audioTrack) {
        if (Ug0.f3833a >= 19) {
            this.f5207a = new C4902w7(audioTrack);
            a();
        } else {
            this.f5207a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f5207a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 1) {
            this.d = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 2 || i == 3) {
            this.d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
