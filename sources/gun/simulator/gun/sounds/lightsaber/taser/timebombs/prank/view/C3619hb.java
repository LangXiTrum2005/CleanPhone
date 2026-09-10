package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3619hb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4458a;
    public final String b;
    public final C3619hb c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float j;
    public float k;
    public boolean m;
    public float h = 1.0f;
    public float i = 1.0f;
    public EnumC3531gb l = EnumC3531gb.f4419a;
    public final Color n = new Color(0.61f, 0.61f, 0.61f, 1.0f);

    public C3619hb(int i, String str, C3619hb c3619hb) {
        if (i < 0) {
            throw new IllegalArgumentException("index must be >= 0.");
        }
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f4458a = i;
        this.b = str;
        this.c = c3619hb;
    }

    public final String toString() {
        return this.b;
    }
}
