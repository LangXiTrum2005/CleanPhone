package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3780jP extends AbstractC3806jh0 implements InterfaceC3919kz {
    public TextureRegion i;
    public float[] j;
    public float[] k;
    public short[] l;
    public final Color m;
    public C4633t40 n;

    public C3780jP(String str) {
        super(str);
        this.m = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final C4633t40 a() {
        return this.n;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final void b() {
        float u;
        float v;
        float v2;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        if (fArr2 == null || fArr2.length != fArr.length) {
            this.k = new float[fArr.length];
        }
        float[] fArr3 = this.k;
        int length = fArr3.length;
        TextureRegion textureRegion = this.i;
        int i = 0;
        float u2 = 1.0f;
        if (textureRegion instanceof TextureAtlas.AtlasRegion) {
            float u3 = textureRegion.getU();
            float v3 = this.i.getV();
            TextureAtlas.AtlasRegion atlasRegion = (TextureAtlas.AtlasRegion) this.i;
            float width = atlasRegion.getTexture().getWidth();
            float height = atlasRegion.getTexture().getHeight();
            int i2 = atlasRegion.degrees;
            if (i2 == 90) {
                int i3 = atlasRegion.originalHeight;
                float f = u3 - (((i3 - atlasRegion.offsetY) - atlasRegion.packedWidth) / width);
                int i4 = atlasRegion.originalWidth;
                float f2 = v3 - (((i4 - atlasRegion.offsetX) - atlasRegion.packedHeight) / height);
                float f3 = i3 / width;
                float f4 = i4 / height;
                while (i < length) {
                    int i5 = i + 1;
                    fArr3[i] = (fArr[i5] * f3) + f;
                    fArr3[i5] = AbstractC5044xl.w(1.0f, fArr[i], f4, f2);
                    i += 2;
                }
                return;
            }
            if (i2 == 180) {
                int i6 = atlasRegion.originalWidth;
                float f5 = u3 - (((i6 - atlasRegion.offsetX) - atlasRegion.packedWidth) / width);
                float f6 = v3 - (atlasRegion.offsetY / height);
                float f7 = i6 / width;
                float f8 = atlasRegion.originalHeight / height;
                while (i < length) {
                    fArr3[i] = AbstractC5044xl.w(1.0f, fArr[i], f7, f5);
                    int i7 = i + 1;
                    fArr3[i7] = AbstractC5044xl.w(1.0f, fArr[i7], f8, f6);
                    i += 2;
                }
                return;
            }
            if (i2 == 270) {
                float f9 = u3 - (atlasRegion.offsetY / width);
                float f10 = v3 - (atlasRegion.offsetX / height);
                float f11 = atlasRegion.originalHeight / width;
                float f12 = atlasRegion.originalWidth / height;
                while (i < length) {
                    int i8 = i + 1;
                    fArr3[i] = AbstractC5044xl.w(1.0f, fArr[i8], f11, f9);
                    fArr3[i8] = (fArr[i] * f12) + f10;
                    i += 2;
                }
                return;
            }
            u = u3 - (atlasRegion.offsetX / width);
            int i9 = atlasRegion.originalHeight;
            v = v3 - (((i9 - atlasRegion.offsetY) - atlasRegion.packedHeight) / height);
            float f13 = atlasRegion.originalWidth / width;
            v2 = i9 / height;
            u2 = f13;
        } else if (textureRegion == null) {
            u = 0.0f;
            v = 0.0f;
            v2 = 1.0f;
        } else {
            u = textureRegion.getU();
            v = this.i.getV();
            u2 = this.i.getU2() - u;
            v2 = this.i.getV2() - v;
        }
        while (i < length) {
            fArr3[i] = (fArr[i] * u2) + u;
            int i10 = i + 1;
            fArr3[i10] = (fArr[i10] * v2) + v;
            i += 2;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final void c(TextureRegion textureRegion) {
        if (textureRegion == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        this.i = textureRegion;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3919kz
    public final TextureRegion e() {
        return this.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3806jh0
    public final void i(N70 n70, int i, int i2, float[] fArr, int i3, int i4) {
        C4633t40 c4633t40 = this.n;
        if (c4633t40 != null) {
            c4633t40.c(n70, this);
        }
        super.i(n70, 0, i2, fArr, 0, i4);
    }

    public final void j(C3780jP c3780jP) {
        this.e = c3780jP.e;
        this.f = c3780jP.f;
        this.j = c3780jP.j;
        this.l = c3780jP.l;
        this.g = c3780jP.g;
    }
}
