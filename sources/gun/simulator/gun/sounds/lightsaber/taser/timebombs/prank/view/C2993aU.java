package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2993aU implements InterfaceC3588h80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2460Hb f4122a;
    public final C4848vb b;
    public V30 c;
    public int d;
    public boolean e;
    public long f;

    public C2993aU(InterfaceC2460Hb interfaceC2460Hb) {
        AbstractC2995aW.q(interfaceC2460Hb, "upstream");
        this.f4122a = interfaceC2460Hb;
        C4848vb buffer = interfaceC2460Hb.getBuffer();
        this.b = buffer;
        V30 v30 = buffer.f5139a;
        this.c = v30;
        this.d = v30 == null ? -1 : v30.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4848vb r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.q(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L76
            boolean r3 = r8.e
            r3 = r3 ^ 1
            if (r3 == 0) goto L6a
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V30 r3 = r8.c
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vb r4 = r8.b
            if (r3 == 0) goto L31
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V30 r5 = r4.f5139a
            if (r3 != r5) goto L25
            int r3 = r8.d
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.n(r5)
            int r5 = r5.b
            if (r3 != r5) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hb r2 = r8.f4122a
            boolean r0 = r2.l(r0)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V30 r0 = r8.c
            if (r0 != 0) goto L52
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V30 r0 = r4.f5139a
            if (r0 == 0) goto L52
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L52:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vb r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r6 = r10
            r2.m(r3, r4, r6)
            long r0 = r8.f
            long r0 = r0 + r10
            r8.f = r0
            return r10
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L76:
            java.lang.Long r9 = java.lang.Long.valueOf(r10)
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r9 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.v0(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2993aU.read(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vb, long):long");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3588h80
    public final Ic0 timeout() {
        return this.f4122a.timeout();
    }
}
