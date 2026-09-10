package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pools;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3166cQ {
    public static final C3078bQ e = new C3078bQ();
    public static final C2875Xb f = new C2875Xb(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4222a;
    public final C3078bQ b;
    public final HashSet c;
    public final Pools.Pool d;

    public C3166cQ(C2296At c2296At) {
        C3078bQ c3078bQ = e;
        this.f4222a = new ArrayList();
        this.c = new HashSet();
        this.d = c2296At;
        this.b = c3078bQ;
    }

    public final synchronized void a(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        C2989aQ c2989aQ = new C2989aQ(cls, cls2, modelLoaderFactory);
        ArrayList arrayList = this.f4222a;
        arrayList.add(arrayList.size(), c2989aQ);
    }

    public final FP b(C2989aQ c2989aQ) {
        return c2989aQ.c.z(this);
    }

    public final synchronized FP c(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C2989aQ c2989aQ : this.f4222a) {
                if (this.c.contains(c2989aQ)) {
                    z = true;
                } else if (c2989aQ.f4121a.isAssignableFrom(cls) && c2989aQ.b.isAssignableFrom(cls2)) {
                    this.c.add(c2989aQ);
                    arrayList.add(b(c2989aQ));
                    this.c.remove(c2989aQ);
                }
            }
            if (arrayList.size() > 1) {
                C3078bQ c3078bQ = this.b;
                Pools.Pool pool = this.d;
                c3078bQ.getClass();
                return new ZP(arrayList, pool);
            }
            if (arrayList.size() == 1) {
                return (FP) arrayList.get(0);
            }
            if (z) {
                return f;
            }
            throw new C3703iY("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C2989aQ c2989aQ : this.f4222a) {
                if (!this.c.contains(c2989aQ) && c2989aQ.f4121a.isAssignableFrom(cls)) {
                    this.c.add(c2989aQ);
                    arrayList.add(c2989aQ.c.z(this));
                    this.c.remove(c2989aQ);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C2989aQ c2989aQ : this.f4222a) {
            if (!arrayList.contains(c2989aQ.b) && c2989aQ.f4121a.isAssignableFrom(cls)) {
                arrayList.add(c2989aQ.b);
            }
        }
        return arrayList;
    }
}
