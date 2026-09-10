package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.FloatArray;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3755j5 implements Pool.Poolable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3493g5 f4535a;
    public C3755j5 b;
    public C3755j5 c;
    public C3755j5 d;
    public int e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public int x = 3;
    public final IntArray u = new IntArray();
    public final Array v = new Array();
    public final FloatArray w = new FloatArray();

    public final float a() {
        if (!this.f) {
            float f = this.k + 0.0f;
            float f2 = this.g;
            return f2 >= this.f4535a.d ? f : Math.min(f, f2);
        }
        float f3 = this.g - 0.0f;
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return (this.k % f3) + 0.0f;
    }

    public final boolean b() {
        return this.k >= this.g - 0.0f;
    }

    @Override // com.badlogic.gdx.utils.Pool.Poolable
    public final void reset() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.f4535a = null;
        this.u.clear();
        this.v.clear();
        this.w.clear();
    }

    public final String toString() {
        C3493g5 c3493g5 = this.f4535a;
        return c3493g5 == null ? "<none>" : c3493g5.f4402a;
    }
}
