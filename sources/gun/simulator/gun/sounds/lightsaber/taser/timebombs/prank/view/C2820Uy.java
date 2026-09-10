package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Uy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2820Uy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4326pd0 f3850a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public C2820Uy(InterfaceC4326pd0 interfaceC4326pd0) {
        this.f3850a = interfaceC4326pd0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = this.f;
            int i4 = (i + 1) - i3;
            if (i4 >= i2) {
                this.f = (i2 - i) + i3;
            } else {
                this.d = ((bArr[i4] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }
}
