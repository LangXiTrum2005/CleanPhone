package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class V30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3857a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public V30 f;
    public V30 g;

    public V30(byte[] bArr, int i, int i2, boolean z) {
        AbstractC2995aW.q(bArr, "data");
        this.f3857a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final V30 a() {
        V30 v30 = this.f;
        if (v30 == this) {
            v30 = null;
        }
        V30 v31 = this.g;
        AbstractC2995aW.n(v31);
        v31.f = this.f;
        V30 v32 = this.f;
        AbstractC2995aW.n(v32);
        v32.g = this.g;
        this.f = null;
        this.g = null;
        return v30;
    }

    public final void b(V30 v30) {
        v30.g = this;
        v30.f = this.f;
        V30 v31 = this.f;
        AbstractC2995aW.n(v31);
        v31.g = v30;
        this.f = v30;
    }

    public final V30 c() {
        this.d = true;
        return new V30(this.f3857a, this.b, this.c, true);
    }

    public final void d(V30 v30, int i) {
        if (!v30.e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i2 = v30.c;
        int i3 = i2 + i;
        byte[] bArr = v30.f3857a;
        if (i3 > 8192) {
            if (v30.d) {
                throw new IllegalArgumentException();
            }
            int i4 = v30.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            U5.j0(0, bArr, i4, bArr, i2);
            v30.c -= v30.b;
            v30.b = 0;
        }
        int i5 = v30.c;
        int i6 = this.b;
        U5.j0(i5, this.f3857a, i6, bArr, i6 + i);
        v30.c += i;
        this.b += i;
    }

    public V30() {
        this.f3857a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
