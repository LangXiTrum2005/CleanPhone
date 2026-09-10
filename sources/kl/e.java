package kl;

import bm.m;
import cl.q0;
import cl.x;
import cl.y;
import cl.z;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import d5.u;
import il.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import pm.w0;
import vm.i;
import vm.q;
import zk.j;
import zk.j0;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends q0 implements a {
    public static final em.a F = new em.a();
    public static final em.a G = new em.a();
    public int D;
    public final boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, q0 q0Var, al.j jVar2, yl.f fVar, int i10, j0 j0Var, boolean z10) {
        super(jVar, q0Var, jVar2, fVar, i10, j0Var);
        if (jVar == null) {
            z0(0);
            throw null;
        }
        if (jVar2 == null) {
            z0(1);
            throw null;
        }
        if (fVar == null) {
            z0(2);
            throw null;
        }
        if (i10 == 0) {
            z0(3);
            throw null;
        }
        this.D = 0;
        this.E = z10;
    }

    public static e Y0(j jVar, ll.c cVar, yl.f fVar, el.g gVar, boolean z10) {
        if (jVar == null) {
            z0(5);
            throw null;
        }
        if (fVar != null) {
            return new e(jVar, null, cVar, fVar, 1, gVar, z10);
        }
        z0(7);
        throw null;
    }

    public static /* synthetic */ void z0(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 21) ? 2 : 3];
        switch (i10) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY;
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 13) {
            objArr[1] = MobileAdsBridgeBase.initializeMethodName;
        } else if (i10 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = MobileAdsBridgeBase.initializeMethodName;
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // cl.q0, cl.y
    public final y L0(int i10, al.j jVar, yl.f fVar, j jVar2, s sVar, j0 j0Var) {
        if (jVar2 == null) {
            z0(14);
            throw null;
        }
        if (i10 == 0) {
            z0(15);
            throw null;
        }
        if (jVar == null) {
            z0(16);
            throw null;
        }
        q0 q0Var = (q0) sVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(jVar2, q0Var, jVar, fVar, i10, j0Var, this.E);
        int i11 = this.D;
        boolean z10 = false;
        if (i11 != 1) {
            if (i11 == 2) {
                z10 = true;
            } else if (i11 != 3) {
                if (i11 != 4) {
                    throw null;
                }
                z10 = true;
            }
        }
        eVar.Z0(z10, u.b(i11));
        return eVar;
    }

    @Override // cl.q0
    public final q0 X0(z zVar, z zVar2, List list, List list2, List list3, pm.y yVar, int i10, o oVar, Map map) {
        vm.f fVar;
        if (list == null) {
            z0(9);
            throw null;
        }
        if (list2 == null) {
            z0(10);
            throw null;
        }
        if (list3 == null) {
            z0(11);
            throw null;
        }
        if (oVar == null) {
            z0(12);
            throw null;
        }
        super.X0(zVar, zVar2, list, list2, list3, yVar, i10, oVar, map);
        for (i iVar : q.f52691c) {
            an.g gVar = iVar.f52675b;
            yl.f fVar2 = iVar.f52674a;
            if (fVar2 == null || n.a(getName(), fVar2)) {
                if (gVar != null) {
                    String strB = getName().b();
                    n.e(strB, "functionDescriptor.name.asString()");
                    if (!gVar.a(strB)) {
                        continue;
                    }
                }
                Collection collection = iVar.f52676c;
                if (collection == null || collection.contains(getName())) {
                    for (vm.e eVar : iVar.f52678e) {
                        if (eVar.a(this) != null) {
                            fVar = new vm.f(false);
                            this.f6644m = fVar.f52664a;
                            return this;
                        }
                    }
                    fVar = ((String) iVar.f52677d.invoke(this)) != null ? new vm.f(false) : vm.f.f52663c;
                    this.f6644m = fVar.f52664a;
                    return this;
                }
            }
        }
        fVar = vm.f.f52662b;
        this.f6644m = fVar.f52664a;
        return this;
    }

    public final void Z0(boolean z10, boolean z11) {
        int i10;
        if (z10) {
            i10 = z11 ? 4 : 2;
        } else {
            i10 = z11 ? 3 : 1;
        }
        this.D = i10;
    }

    @Override // cl.y, zk.b
    public final boolean a0() {
        return u.b(this.D);
    }

    @Override // kl.a
    public final a m(pm.y yVar, ArrayList arrayList, pm.y yVar2, wj.f fVar) {
        ArrayList arrayListR = com.bumptech.glide.d.r(arrayList, B(), this);
        z zVarK = yVar == null ? null : m.k(this, yVar, al.i.f3645a);
        x xVarP0 = P0(w0.f48482b);
        xVarP0.f6614g = arrayListR;
        xVarP0.f6618k = yVar2;
        xVarP0.f6616i = zVarK;
        xVarP0.f6622p = true;
        xVarP0.f6621o = true;
        e eVar = (e) xVarP0.f6630x.M0(xVarP0);
        if (fVar != null) {
            eVar.Q0((zk.a) fVar.f53283a, fVar.f53284b);
        }
        if (eVar != null) {
            return eVar;
        }
        z0(21);
        throw null;
    }
}
