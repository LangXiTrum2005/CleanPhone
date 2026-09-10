package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ObjectSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3493g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4402a;
    public final Array b;
    public final ObjectSet c;
    public final float d;

    public C3493g5(String str, Array array, float f) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f4402a = str;
        this.d = f;
        ObjectSet objectSet = new ObjectSet(array.size);
        this.c = objectSet;
        this.b = array;
        int i = array.size;
        objectSet.clear(i);
        Object[] objArr = array.items;
        for (int i2 = 0; i2 < i; i2++) {
            objectSet.addAll(((AbstractC3405f5) objArr[i2]).f4350a);
        }
    }

    public final String toString() {
        return this.f4402a;
    }
}
