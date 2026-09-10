package tk;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f51055f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(w wVar, int i10) {
        super(0);
        this.f51054e = i10;
        this.f51055f = wVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f51054e) {
            case 0:
                w wVar = this.f51055f;
                o1 o1Var = wVar.f51083j;
                qk.w[] wVarArr = w.l;
                qk.w wVar2 = wVarArr[14];
                Object objInvoke = o1Var.invoke();
                kotlin.jvm.internal.n.e(objInvoke, "<get-allNonStaticMembers>(...)");
                o1 o1Var2 = wVar.f51084k;
                qk.w wVar3 = wVarArr[15];
                Object objInvoke2 = o1Var2.invoke();
                kotlin.jvm.internal.n.e(objInvoke2, "<get-allStaticMembers>(...)");
                return xj.n.B0((Collection) objInvoke2, (Collection) objInvoke);
            case 1:
                w wVar4 = this.f51055f;
                o1 o1Var3 = wVar4.f51079f;
                qk.w[] wVarArr2 = w.l;
                qk.w wVar5 = wVarArr2[10];
                Object objInvoke3 = o1Var3.invoke();
                kotlin.jvm.internal.n.e(objInvoke3, "<get-declaredNonStaticMembers>(...)");
                o1 o1Var4 = wVar4.f51081h;
                qk.w wVar6 = wVarArr2[12];
                Object objInvoke4 = o1Var4.invoke();
                kotlin.jvm.internal.n.e(objInvoke4, "<get-inheritedNonStaticMembers>(...)");
                return xj.n.B0((Collection) objInvoke4, (Collection) objInvoke3);
            case 2:
                w wVar7 = this.f51055f;
                o1 o1Var5 = wVar7.f51080g;
                qk.w[] wVarArr3 = w.l;
                qk.w wVar8 = wVarArr3[11];
                Object objInvoke5 = o1Var5.invoke();
                kotlin.jvm.internal.n.e(objInvoke5, "<get-declaredStaticMembers>(...)");
                o1 o1Var6 = wVar7.f51082i;
                qk.w wVar9 = wVarArr3[13];
                Object objInvoke6 = o1Var6.invoke();
                kotlin.jvm.internal.n.e(objInvoke6, "<get-inheritedStaticMembers>(...)");
                return xj.n.B0((Collection) objInvoke6, (Collection) objInvoke5);
            case 3:
                return v1.d(this.f51055f.a());
            case 4:
                w wVar10 = this.f51055f;
                o1 o1Var7 = wVar10.f51079f;
                qk.w[] wVarArr4 = w.l;
                qk.w wVar11 = wVarArr4[10];
                Object objInvoke7 = o1Var7.invoke();
                kotlin.jvm.internal.n.e(objInvoke7, "<get-declaredNonStaticMembers>(...)");
                o1 o1Var8 = wVar10.f51080g;
                qk.w wVar12 = wVarArr4[11];
                Object objInvoke8 = o1Var8.invoke();
                kotlin.jvm.internal.n.e(objInvoke8, "<get-declaredStaticMembers>(...)");
                return xj.n.B0((Collection) objInvoke8, (Collection) objInvoke7);
            case 5:
                im.n nVarN = this.f51055f.a().N();
                kotlin.jvm.internal.n.e(nVarN, "descriptor.unsubstitutedInnerClassesScope");
                Collection collectionR = a.a.r(nVarN, null, 3);
                ArrayList<zk.j> arrayList = new ArrayList();
                for (Object obj : collectionR) {
                    if (!bm.e.m((zk.j) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (zk.j jVar : arrayList) {
                    zk.e eVar = jVar instanceof zk.e ? (zk.e) jVar : null;
                    Class clsJ = eVar != null ? v1.j(eVar) : null;
                    z zVar = clsJ != null ? new z(clsJ) : null;
                    if (zVar != null) {
                        arrayList2.add(zVar);
                    }
                }
                return arrayList2;
            default:
                Collection<zk.e> collectionR2 = this.f51055f.a().r();
                kotlin.jvm.internal.n.e(collectionR2, "descriptor.sealedSubclasses");
                ArrayList arrayList3 = new ArrayList();
                for (zk.e eVar2 : collectionR2) {
                    kotlin.jvm.internal.n.d(eVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsJ2 = v1.j(eVar2);
                    z zVar2 = clsJ2 != null ? new z(clsJ2) : null;
                    if (zVar2 != null) {
                        arrayList3.add(zVar2);
                    }
                }
                return arrayList3;
        }
    }
}
