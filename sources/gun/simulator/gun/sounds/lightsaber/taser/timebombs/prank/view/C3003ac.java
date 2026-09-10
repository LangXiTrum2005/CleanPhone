package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3003ac implements Q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4129a;
    public final int b;
    public final Object c;

    public C3003ac(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.f4129a = i;
        this.b = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q6
    public int a() {
        return this.f4129a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q6
    public int getSampleCount() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q6
    public int readNextSampleSize() {
        int i = this.f4129a;
        return i == -1 ? ((JT) this.c).w() : i;
    }

    public C3003ac() {
        this.c = new C3003ac[256];
        this.f4129a = 0;
        this.b = 0;
    }

    public C3003ac(int i, int i2) {
        this.c = null;
        this.f4129a = i;
        int i3 = i2 & 7;
        this.b = i3 == 0 ? 8 : i3;
    }

    public C3003ac(int i, int i2, SparseArray sparseArray) {
        this.f4129a = i;
        this.b = i2;
        this.c = sparseArray;
    }

    public C3003ac(N6 n6, C4619sw c4619sw) {
        JT jt = n6.c;
        this.c = jt;
        jt.E(12);
        int iW = jt.w();
        if (MimeTypes.AUDIO_RAW.equals(c4619sw.l)) {
            int iZ = Ug0.z(c4619sw.A, c4619sw.y);
            if (iW == 0 || iW % iZ != 0) {
                AbstractC4038mJ.f();
                iW = iZ;
            }
        }
        this.f4129a = iW == 0 ? -1 : iW;
        this.b = jt.w();
    }
}
