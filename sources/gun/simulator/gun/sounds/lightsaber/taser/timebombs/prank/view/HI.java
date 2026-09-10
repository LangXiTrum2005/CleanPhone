package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pools.Pool f3166a;
    public final List b;
    public final String c;

    public HI(Class cls, Class cls2, Class cls3, List list, C2296At c2296At) {
        this.f3166a = c2296At;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final InterfaceC3616hZ a(int i, int i2, C3692iN c3692iN, YS ys, InterfaceC3989ll interfaceC3989ll) {
        Pools.Pool pool = this.f3166a;
        Object objAcquire = pool.acquire();
        AbstractC2871Wx.V(objAcquire, "Argument must not be null");
        List list = (List) objAcquire;
        try {
            List list2 = this.b;
            int size = list2.size();
            InterfaceC3616hZ interfaceC3616hZA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC3616hZA = ((C2522Jl) list2.get(i3)).a(i, i2, c3692iN, ys, interfaceC3989ll);
                } catch (C3039ay e) {
                    list.add(e);
                }
                if (interfaceC3616hZA != null) {
                    break;
                }
            }
            if (interfaceC3616hZA != null) {
                pool.release(list);
                return interfaceC3616hZA;
            }
            throw new C3039ay(this.c, new ArrayList(list));
        } catch (Throwable th) {
            pool.release(list);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
