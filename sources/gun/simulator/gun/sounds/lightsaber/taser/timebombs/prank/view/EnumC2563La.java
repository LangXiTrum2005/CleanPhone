package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.GL20;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.La, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC2563La {
    normal(GL20.GL_SRC_ALPHA, 1, GL20.GL_ONE_MINUS_SRC_ALPHA, 1),
    additive(GL20.GL_SRC_ALPHA, 1, 1, 1),
    /* JADX INFO: Fake field, exist only in values array */
    multiply(GL20.GL_DST_COLOR, GL20.GL_DST_COLOR, GL20.GL_ONE_MINUS_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA),
    /* JADX INFO: Fake field, exist only in values array */
    screen(1, 1, GL20.GL_ONE_MINUS_SRC_COLOR, GL20.GL_ONE_MINUS_SRC_COLOR);

    public static final EnumC2563La[] g = values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3358a;
    public final int b;
    public final int c;
    public final int d;

    EnumC2563La(int i, int i2, int i3, int i4) {
        this.f3358a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }
}
