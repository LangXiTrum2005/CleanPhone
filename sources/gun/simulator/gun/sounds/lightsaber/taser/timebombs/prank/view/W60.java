package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class W60 implements LI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4868vl f3909a;
    public final B90 b;
    public byte[] c;

    public W60(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl) {
        FI.f3063a.getAndIncrement();
        this.f3909a = c4868vl;
        this.b = new B90(interfaceC4429ql);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() {
        int i;
        byte[] bArr;
        B90 b90 = this.b;
        b90.b = 0L;
        try {
            b90.d(this.f3909a);
            do {
                i = (int) b90.b;
                byte[] bArr2 = this.c;
                if (bArr2 == null) {
                    this.c = new byte[1024];
                } else if (i == bArr2.length) {
                    this.c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                bArr = this.c;
            } while (b90.read(bArr, i, bArr.length - i) != -1);
        } finally {
            FW.v(b90);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
    }
}
