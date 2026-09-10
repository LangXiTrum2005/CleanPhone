package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4633t40 implements Q6 {
    public static int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5014a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public C4633t40() {
        this.f5014a = 0;
        this.b = -1;
        this.c = 0;
        int[] iArr = new int[16];
        this.e = iArr;
        this.d = iArr.length - 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q6
    public final int a() {
        return -1;
    }

    public final void b(int i) {
        int i2 = this.c;
        Object obj = this.e;
        if (i2 == ((int[]) obj).length) {
            int[] iArr = (int[]) obj;
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.f5014a;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy((int[]) this.e, 0, iArr2, i4, i3);
            this.f5014a = 0;
            this.b = this.c - 1;
            this.e = iArr2;
            this.d = length - 1;
        }
        int i5 = (this.b + 1) & this.d;
        this.b = i5;
        ((int[]) this.e)[i5] = i;
        this.c++;
    }

    public final void c(N70 n70, InterfaceC3919kz interfaceC3919kz) {
        int length = n70.f;
        if (length == -1) {
            length = this.d;
        }
        TextureRegion[] textureRegionArr = (TextureRegion[]) this.e;
        if (length >= textureRegionArr.length) {
            length = textureRegionArr.length - 1;
        }
        TextureRegion textureRegion = textureRegionArr[length];
        if (interfaceC3919kz.e() != textureRegion) {
            interfaceC3919kz.c(textureRegion);
            interfaceC3919kz.b();
        }
    }

    public final int d() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.e;
        int i2 = this.f5014a;
        int i3 = iArr[i2];
        this.f5014a = (i2 + 1) & this.d;
        this.c = i - 1;
        return i3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q6
    public final int getSampleCount() {
        return this.f5014a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q6
    public final int readNextSampleSize() {
        int i = this.b;
        if (i == 8) {
            return ((JT) this.e).t();
        }
        if (i == 16) {
            return ((JT) this.e).y();
        }
        int i2 = this.c;
        this.c = i2 + 1;
        if (i2 % 2 != 0) {
            return this.d & 15;
        }
        int iT = ((JT) this.e).t();
        this.d = iT;
        return (iT & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }

    public C4633t40(int i) {
        int i2;
        synchronized (C4633t40.class) {
            i2 = f;
            f = i2 + 1;
        }
        this.f5014a = i2;
        this.e = new TextureRegion[i];
    }
}
