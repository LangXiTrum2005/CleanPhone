package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.helper;

import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes4.dex */
public final class RussianRouletteFireHelper$verticesPool$1 extends Pools.SimplePool<float[]> {
    public RussianRouletteFireHelper$verticesPool$1() {
        super(10);
    }

    @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final float[] acquire() {
        float[] fArr = (float[]) super.acquire();
        return fArr == null ? new float[8] : fArr;
    }
}
