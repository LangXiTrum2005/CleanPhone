package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3405f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f4350a;
    public final float[] b;

    public AbstractC3405f5(int i, String... strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("propertyIds cannot be null.");
        }
        this.f4350a = strArr;
        this.b = new float[c() * i];
    }

    public static int d(float f, float[] fArr, int i) {
        int length = fArr.length;
        int i2 = i;
        while (i2 < length) {
            if (fArr[i2] > f) {
                return i2 - i;
            }
            i2 += i;
        }
        return length - i;
    }

    public static int e(float[] fArr, float f) {
        int length = fArr.length;
        for (int i = 1; i < length; i++) {
            if (fArr[i] > f) {
                return i - 1;
            }
        }
        return length - 1;
    }

    public abstract void a(C4991x70 c4991x70, float f, float f2, Array array, float f3, int i, int i2);

    public int b() {
        return this.b.length / c();
    }

    public int c() {
        return 1;
    }
}
