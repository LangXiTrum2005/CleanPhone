package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3527gY extends AbstractC3413f9 implements InterfaceC3919kz {
    public TextureRegion c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final float[] k;
    public final float[] l;
    public final Color m;
    public C4633t40 n;

    public C3527gY(String str) {
        super(str);
        this.f = 1.0f;
        this.g = 1.0f;
        this.k = new float[8];
        this.l = new float[8];
        this.m = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final C4633t40 a() {
        return this.n;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final void b() {
        boolean z;
        TextureRegion textureRegion = this.c;
        float[] fArr = this.k;
        if (textureRegion == null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.0f;
            fArr[6] = 1.0f;
            fArr[7] = 0.0f;
            return;
        }
        float f = this.i;
        float f2 = this.j;
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        float f5 = -f3;
        float f6 = -f4;
        if (textureRegion instanceof TextureAtlas.AtlasRegion) {
            TextureAtlas.AtlasRegion atlasRegion = (TextureAtlas.AtlasRegion) textureRegion;
            float f7 = atlasRegion.offsetX;
            int i = atlasRegion.originalWidth;
            f5 += (f7 / i) * f;
            float f8 = atlasRegion.offsetY;
            int i2 = atlasRegion.originalHeight;
            f6 += (f8 / i2) * f2;
            if (atlasRegion.degrees == 90) {
                f3 -= (((i - f7) - atlasRegion.packedHeight) / i) * f;
                f4 -= (((i2 - f8) - atlasRegion.packedWidth) / i2) * f2;
                z = true;
            } else {
                f3 -= (((i - f7) - atlasRegion.packedWidth) / i) * f;
                f4 -= (((i2 - f8) - atlasRegion.packedHeight) / i2) * f2;
                z = false;
            }
        } else {
            z = false;
        }
        float f9 = this.f;
        float f10 = this.g;
        float f11 = f5 * f9;
        float f12 = f6 * f10;
        float f13 = f3 * f9;
        float f14 = f4 * f10;
        double d = this.h * 0.017453292f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f15 = this.d;
        float f16 = this.e;
        float f17 = (f11 * fCos) + f15;
        float f18 = f11 * fSin;
        float f19 = (f12 * fCos) + f16;
        float f20 = f12 * fSin;
        float f21 = (f13 * fCos) + f15;
        float f22 = f13 * fSin;
        float f23 = (fCos * f14) + f16;
        float f24 = f14 * fSin;
        float[] fArr2 = this.l;
        fArr2[0] = f17 - f20;
        fArr2[1] = f19 + f18;
        fArr2[2] = f17 - f24;
        fArr2[3] = f18 + f23;
        fArr2[4] = f21 - f24;
        fArr2[5] = f23 + f22;
        fArr2[6] = f21 - f20;
        fArr2[7] = f19 + f22;
        if (z) {
            fArr[0] = this.c.getU2();
            fArr[1] = this.c.getV();
            fArr[2] = this.c.getU2();
            fArr[3] = this.c.getV2();
            fArr[4] = this.c.getU();
            fArr[5] = this.c.getV2();
            fArr[6] = this.c.getU();
            fArr[7] = this.c.getV();
            return;
        }
        fArr[0] = this.c.getU2();
        fArr[1] = this.c.getV2();
        fArr[2] = this.c.getU();
        fArr[3] = this.c.getV2();
        fArr[4] = this.c.getU();
        fArr[5] = this.c.getV();
        fArr[6] = this.c.getU2();
        fArr[7] = this.c.getV();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final void c(TextureRegion textureRegion) {
        if (textureRegion == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        this.c = textureRegion;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final TextureRegion e() {
        return this.c;
    }

    public final void i(N70 n70, float[] fArr, int i) {
        C4633t40 c4633t40 = this.n;
        if (c4633t40 != null) {
            c4633t40.c(n70, this);
        }
        C3443fb c3443fb = n70.b;
        float f = c3443fb.u;
        float f2 = c3443fb.x;
        float f3 = c3443fb.s;
        float f4 = c3443fb.t;
        float f5 = c3443fb.v;
        float f6 = c3443fb.w;
        float[] fArr2 = this.l;
        float f7 = fArr2[6];
        float f8 = fArr2[7];
        fArr[0] = AbstractC5044xl.d(f8, f4, f7 * f3, f);
        fArr[1] = AbstractC5044xl.d(f8, f6, f7 * f5, f2);
        float f9 = fArr2[0];
        float f10 = fArr2[1];
        fArr[i] = AbstractC5044xl.d(f10, f4, f9 * f3, f);
        fArr[i + 1] = AbstractC5044xl.d(f10, f6, f9 * f5, f2);
        int i2 = i + i;
        float f11 = fArr2[2];
        float f12 = fArr2[3];
        fArr[i2] = AbstractC5044xl.d(f12, f4, f11 * f3, f);
        fArr[i2 + 1] = AbstractC5044xl.d(f12, f6, f11 * f5, f2);
        int i3 = i2 + i;
        float f13 = fArr2[4];
        float f14 = fArr2[5];
        fArr[i3] = AbstractC5044xl.d(f14, f4, f3 * f13, f);
        fArr[i3 + 1] = AbstractC5044xl.d(f14, f6, f13 * f5, f2);
    }
}
