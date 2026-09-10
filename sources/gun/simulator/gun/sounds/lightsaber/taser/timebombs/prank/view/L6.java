package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/* JADX INFO: loaded from: classes2.dex */
public final class L6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextureAtlas f3338a;

    public final void a(String str, String str2, C4633t40 c4633t40) {
        TextureRegion[] textureRegionArr = (TextureRegion[]) c4633t40.e;
        int length = textureRegionArr.length;
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder(str2.length() + c4633t40.c);
            sb.append(str2);
            String string = Integer.toString(c4633t40.b + i);
            for (int length2 = c4633t40.c - string.length(); length2 > 0; length2--) {
                sb.append('0');
            }
            sb.append(string);
            String string2 = sb.toString();
            TextureAtlas.AtlasRegion atlasRegionFindRegion = this.f3338a.findRegion(string2);
            textureRegionArr[i] = atlasRegionFindRegion;
            if (atlasRegionFindRegion == null) {
                throw new RuntimeException(AbstractC5044xl.n("Region not found in atlas: ", string2, " (sequence: ", str, ")"));
            }
        }
    }

    public final C3780jP b(String str, String str2, C4633t40 c4633t40) {
        C3780jP c3780jP = new C3780jP(str);
        if (c4633t40 != null) {
            a(str, str2, c4633t40);
        } else {
            TextureAtlas.AtlasRegion atlasRegionFindRegion = this.f3338a.findRegion(str2);
            if (atlasRegionFindRegion == null) {
                throw new RuntimeException(AbstractC5044xl.n("Region not found in atlas: ", str2, " (mesh attachment: ", str, ")"));
            }
            c3780jP.c(atlasRegionFindRegion);
        }
        return c3780jP;
    }

    public final C3527gY c(String str, String str2, C4633t40 c4633t40) {
        C3527gY c3527gY = new C3527gY(str);
        if (c4633t40 != null) {
            a(str, str2, c4633t40);
        } else {
            TextureAtlas.AtlasRegion atlasRegionFindRegion = this.f3338a.findRegion(str2);
            if (atlasRegionFindRegion == null) {
                throw new RuntimeException(AbstractC5044xl.n("Region not found in atlas: ", str2, " (region attachment: ", str, ")"));
            }
            c3527gY.c(atlasRegionFindRegion);
        }
        return c3527gY;
    }
}
