package sg.bigo.ads.core.player.a;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f48771b;
    volatile boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f48773e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48770a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f48772c = new Object();

    public final int a(byte[] bArr, long j) throws j {
        if (j < 0) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "buffer or offset or length is wrong");
            return 0;
        }
        int i2 = 0;
        while (!this.f48771b.c() && this.f48771b.a() < PlaybackStateCompat.ACTION_PLAY_FROM_URI + j && !this.d) {
            i2++;
            synchronized (this.f48770a) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "wait for downloading. thread=" + Thread.currentThread().getName() + ",url=" + this.f48773e.f47252b + ",count=" + i2);
                    this.f48770a.wait(1000L);
                } catch (InterruptedException e2) {
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Waiting source data is interrupted!" + e2.toString());
                }
            }
            if (i2 >= 15) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "wait for downloading more than 15s.");
                throw new j(androidx.datastore.preferences.protobuf.a.k("Error reading source ", i2, " times"));
            }
        }
        int iA = this.f48771b.a(bArr, j);
        if (iA <= 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "read end, size = ".concat(String.valueOf(iA)));
        }
        return iA;
    }
}
