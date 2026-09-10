package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import androidx.core.util.Pools;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2522Jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3280a;
    public final List b;
    public final InterfaceC4669tZ c;
    public final Pools.Pool d;
    public final String e;

    public C2522Jl(Class cls, Class cls2, Class cls3, List list, InterfaceC4669tZ interfaceC4669tZ, C2296At c2296At) {
        this.f3280a = cls;
        this.b = list;
        this.c = interfaceC4669tZ;
        this.d = c2296At;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    public final InterfaceC3616hZ a(int i, int i2, C3692iN c3692iN, YS ys, InterfaceC3989ll interfaceC3989ll) {
        InterfaceC3616hZ interfaceC3616hZA;
        Gd0 gd0;
        int iN;
        boolean z;
        int iD;
        boolean z2;
        boolean z3;
        Object c3198cl;
        Pools.Pool pool = this.d;
        Object objAcquire = pool.acquire();
        AbstractC2871Wx.V(objAcquire, "Argument must not be null");
        List list = (List) objAcquire;
        try {
            InterfaceC3616hZ interfaceC3616hZB = b(interfaceC3989ll, i, i2, ys, list);
            pool.release(list);
            RunnableC2496Il runnableC2496Il = (RunnableC2496Il) c3692iN.c;
            EnumC4516rl enumC4516rl = (EnumC4516rl) c3692iN.b;
            runnableC2496Il.getClass();
            Class<?> cls = interfaceC3616hZB.get().getClass();
            EnumC4516rl enumC4516rl2 = EnumC4516rl.d;
            C2392El c2392El = runnableC2496Il.f3236a;
            InterfaceC4230oZ interfaceC4230oZF = null;
            if (enumC4516rl != enumC4516rl2) {
                Gd0 gd0F = c2392El.f(cls);
                gd0 = gd0F;
                interfaceC3616hZA = gd0F.a(runnableC2496Il.h, interfaceC3616hZB, runnableC2496Il.l, runnableC2496Il.m);
            } else {
                interfaceC3616hZA = interfaceC3616hZB;
                gd0 = null;
            }
            if (!interfaceC3616hZB.equals(interfaceC3616hZA)) {
                interfaceC3616hZB.recycle();
            }
            if (c2392El.c.b().d.f(interfaceC3616hZA.b()) != null) {
                C3789jY c3789jYB = c2392El.c.b();
                c3789jYB.getClass();
                interfaceC4230oZF = c3789jYB.d.f(interfaceC3616hZA.b());
                if (interfaceC4230oZF == null) {
                    throw new C3703iY(interfaceC3616hZA.b(), 2);
                }
                iN = interfaceC4230oZF.n(runnableC2496Il.o);
            } else {
                iN = 3;
            }
            InterfaceC4650tG interfaceC4650tG = runnableC2496Il.u;
            ArrayList arrayListB = c2392El.b();
            int size = arrayListB.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((EP) arrayListB.get(i3)).f3021a.equals(interfaceC4650tG)) {
                    z = true;
                    break;
                }
                i3++;
            }
            boolean z4 = !z;
            switch (((C2914Yo) runnableC2496Il.n).e) {
                case 1:
                case 2:
                    return this.c.o(interfaceC3616hZA, ys);
                case 3:
                    if (enumC4516rl != enumC4516rl2 && enumC4516rl != EnumC4516rl.e) {
                        if (interfaceC4230oZF != null) {
                            throw new C3703iY(interfaceC3616hZA.get().getClass(), 2);
                        }
                        iD = DM.D(iN);
                        if (iD != 0) {
                            z2 = true;
                            z3 = false;
                            c3198cl = new C3198cl(runnableC2496Il.u, runnableC2496Il.i);
                        } else {
                            if (iD == 1) {
                                throw new IllegalArgumentException("Unknown strategy: ".concat(AbstractC5044xl.A(iN)));
                            }
                            z2 = true;
                            z3 = false;
                            c3198cl = new C3790jZ(c2392El.c.f4048a, runnableC2496Il.u, runnableC2496Il.i, runnableC2496Il.l, runnableC2496Il.m, gd0, cls, runnableC2496Il.o);
                        }
                        C3688iJ c3688iJ = (C3688iJ) C3688iJ.e.acquire();
                        c3688iJ.d = z3;
                        c3688iJ.c = z2;
                        c3688iJ.b = interfaceC3616hZA;
                        C2444Gl c2444Gl = runnableC2496Il.f;
                        c2444Gl.f3136a = c3198cl;
                        c2444Gl.b = interfaceC4230oZF;
                        c2444Gl.c = c3688iJ;
                        interfaceC3616hZA = c3688iJ;
                    }
                    return this.c.o(interfaceC3616hZA, ys);
                default:
                    if (((z4 && enumC4516rl == EnumC4516rl.c) || enumC4516rl == EnumC4516rl.f4942a) && iN == 2) {
                        if (interfaceC4230oZF != null) {
                            throw new C3703iY(interfaceC3616hZA.get().getClass(), 2);
                        }
                        iD = DM.D(iN);
                        if (iD != 0) {
                            z2 = true;
                            z3 = false;
                            c3198cl = new C3198cl(runnableC2496Il.u, runnableC2496Il.i);
                        } else {
                            if (iD == 1) {
                                throw new IllegalArgumentException("Unknown strategy: ".concat(AbstractC5044xl.A(iN)));
                            }
                            z2 = true;
                            z3 = false;
                            c3198cl = new C3790jZ(c2392El.c.f4048a, runnableC2496Il.u, runnableC2496Il.i, runnableC2496Il.l, runnableC2496Il.m, gd0, cls, runnableC2496Il.o);
                        }
                        C3688iJ c3688iJ2 = (C3688iJ) C3688iJ.e.acquire();
                        c3688iJ2.d = z3;
                        c3688iJ2.c = z2;
                        c3688iJ2.b = interfaceC3616hZA;
                        C2444Gl c2444Gl2 = runnableC2496Il.f;
                        c2444Gl2.f3136a = c3198cl;
                        c2444Gl2.b = interfaceC4230oZF;
                        c2444Gl2.c = c3688iJ2;
                        interfaceC3616hZA = c3688iJ2;
                    }
                    return this.c.o(interfaceC3616hZA, ys);
            }
        } catch (Throwable th) {
            pool.release(list);
            throw th;
        }
    }

    public final InterfaceC3616hZ b(InterfaceC3989ll interfaceC3989ll, int i, int i2, YS ys, List list) throws C3039ay {
        List list2 = this.b;
        int size = list2.size();
        InterfaceC3616hZ interfaceC3616hZA = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC3966lZ interfaceC3966lZ = (InterfaceC3966lZ) list2.get(i3);
            try {
                if (interfaceC3966lZ.b(interfaceC3989ll.a(), ys)) {
                    interfaceC3616hZA = interfaceC3966lZ.a(interfaceC3989ll.a(), i, i2, ys);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC3966lZ);
                }
                list.add(e);
            }
            if (interfaceC3616hZA != null) {
                break;
            }
        }
        if (interfaceC3616hZA != null) {
            return interfaceC3616hZA;
        }
        throw new C3039ay(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f3280a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
