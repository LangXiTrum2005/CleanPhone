package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L6 f3054a;

    public F70(TextureAtlas textureAtlas) {
        L6 l6 = new L6();
        if (textureAtlas == null) {
            throw new IllegalArgumentException("atlas cannot be null.");
        }
        l6.f3338a = textureAtlas;
        this.f3054a = l6;
    }

    public abstract D70 a(FileHandle fileHandle);
}
