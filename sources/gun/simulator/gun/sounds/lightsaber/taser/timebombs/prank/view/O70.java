package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
public final class O70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3494a;
    public final String b;
    public final C3619hb c;
    public final Color d = new Color(1.0f, 1.0f, 1.0f, 1.0f);
    public Color e;
    public String f;
    public EnumC2563La g;

    public O70(int i, String str, C3619hb c3619hb) {
        if (i < 0) {
            throw new IllegalArgumentException("index must be >= 0.");
        }
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (c3619hb == null) {
            throw new IllegalArgumentException("boneData cannot be null.");
        }
        this.f3494a = i;
        this.b = str;
        this.c = c3619hb;
    }

    public final String toString() {
        return this.b;
    }
}
