package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class B90 implements InterfaceC4429ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4429ql f2861a;
    public long b;
    public Uri c;

    public B90(InterfaceC4429ql interfaceC4429ql) {
        interfaceC4429ql.getClass();
        this.f2861a = interfaceC4429ql;
        this.c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void c(Bd0 bd0) {
        bd0.getClass();
        this.f2861a.c(bd0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        this.f2861a.close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) {
        this.c = c4868vl.f5150a;
        Collections.emptyMap();
        InterfaceC4429ql interfaceC4429ql = this.f2861a;
        long jD = interfaceC4429ql.d(c4868vl);
        Uri uri = interfaceC4429ql.getUri();
        uri.getClass();
        this.c = uri;
        interfaceC4429ql.getResponseHeaders();
        return jD;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Map getResponseHeaders() {
        return this.f2861a.getResponseHeaders();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.f2861a.getUri();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f2861a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
