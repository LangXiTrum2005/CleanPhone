package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4780ul {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f5098a;
    public long b;
    public byte[] d;
    public long f;
    public String h;
    public int i;
    public Object j;
    public int c = 1;
    public Map e = Collections.emptyMap();
    public long g = -1;

    public final C4868vl a() {
        FW.u(this.f5098a, "The uri must be set.");
        return new C4868vl(this.f5098a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void c(String str) {
        this.h = str;
    }
}
