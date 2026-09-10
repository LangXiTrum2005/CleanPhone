package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.ShortArray;

/* JADX INFO: loaded from: classes2.dex */
public final class C70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3274de0 f2911a = new C3274de0(0);
    public final FloatArray b = new FloatArray();
    public final FloatArray c = new FloatArray(128);
    public final FloatArray d = new FloatArray(128);
    public final FloatArray e = new FloatArray(128);
    public final ShortArray f = new ShortArray(128);
    public final FloatArray g = new FloatArray();
    public C5208zf h;
    public Array i;

    public static void b(FloatArray floatArray) {
        float[] fArr = floatArray.items;
        int i = floatArray.size;
        int i2 = i - 2;
        float f = (fArr[i2] * fArr[1]) - (fArr[0] * fArr[i - 1]);
        int i3 = i - 3;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 2;
            f += (fArr[i4] * fArr[i4 + 3]) - (fArr[i5] * fArr[i4 + 1]);
            i4 = i5;
        }
        if (f < 0.0f) {
            return;
        }
        int i6 = i >> 1;
        for (int i7 = 0; i7 < i6; i7 += 2) {
            float f2 = fArr[i7];
            int i8 = i7 + 1;
            float f3 = fArr[i8];
            int i9 = i2 - i7;
            fArr[i7] = fArr[i9];
            int i10 = i9 + 1;
            fArr[i8] = fArr[i10];
            fArr[i9] = f2;
            fArr[i10] = f3;
        }
    }

    public final void a() {
        if (this.h == null) {
            return;
        }
        this.h = null;
        this.i = null;
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.b.clear();
    }
}
