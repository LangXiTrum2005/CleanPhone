package ml;

import cc.a2;
import cl.x0;
import com.google.android.gms.internal.measurement.nf;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46216e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nf f46217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p f46218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(nf nfVar, p pVar) {
        super(0);
        this.f46217f = nfVar;
        this.f46218g = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, wj.d] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [ml.p] */
    /* JADX WARN: Type inference failed for: r1v27, types: [ml.p] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13, types: [cl.l, cl.y, kl.b] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // jk.a
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        p pVar;
        ?? arrayList;
        ?? r14;
        ?? r2;
        wj.f fVar;
        List listD;
        switch (this.f46216e) {
            case 0:
                p pVar2 = this.f46218g;
                fl.n nVar = pVar2.f46222o;
                nf nfVar = pVar2.f46151b;
                zk.e eVar = pVar2.f46221n;
                Constructor<?>[] declaredConstructors = nVar.f41001a.getDeclaredConstructors();
                kotlin.jvm.internal.n.e(declaredConstructors, "klass.declaredConstructors");
                boolean z10 = false;
                List<fl.q> listW = zm.l.W(zm.l.U(new zm.f(xj.k.b0(declaredConstructors), false, fl.i.f40996b), fl.j.f40997b));
                ArrayList arrayList2 = new ArrayList(listW.size());
                for (fl.q qVar : listW) {
                    ll.c cVarI = a2.I(nfVar, qVar);
                    ll.a aVar = (ll.a) nfVar.f23782b;
                    kl.b bVarA1 = kl.b.a1(eVar, cVarI, z10, aVar.f45494j.c(qVar));
                    nf nfVar2 = new nf(aVar, new i3.f(nfVar, bVarA1, qVar, eVar.i().size()), (wj.d) nfVar.f23784d);
                    Constructor constructor = qVar.f41005a;
                    Type[] types = constructor.getGenericParameterTypes();
                    kotlin.jvm.internal.n.e(types, "types");
                    if (types.length == 0) {
                        listD = xj.v.f53866a;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            types = (Type[]) xj.k.j0(1, types.length, types);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < types.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > types.length) {
                            parameterAnnotations = (Annotation[][]) xj.k.j0(parameterAnnotations.length - types.length, parameterAnnotations.length, parameterAnnotations);
                        }
                        listD = qVar.d(types, parameterAnnotations, constructor.isVarArgs());
                    }
                    bc.i iVarU = a0.u(nfVar2, bVarA1, listD);
                    List listI = eVar.i();
                    kotlin.jvm.internal.n.e(listI, "classDescriptor.declaredTypeParameters");
                    List list = listI;
                    ArrayList typeParameters = qVar.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(xj.p.W(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        m0 m0VarC = ((ll.e) nfVar2.f23783c).c((fl.b0) it.next());
                        kotlin.jvm.internal.n.c(m0VarC);
                        arrayList3.add(m0VarC);
                    }
                    bVarA1.Y0((List) iVarU.f5553c, r9.b.A(qVar.e()), xj.n.B0(arrayList3, list));
                    bVarA1.R0(false);
                    bVarA1.S0(iVarU.f5552b);
                    bVarA1.T0(eVar.g());
                    ((ll.a) nfVar2.f23782b).f45491g.getClass();
                    arrayList2.add(bVarA1);
                    z10 = false;
                }
                boolean zF = nVar.f();
                Class cls = nVar.f41001a;
                al.h hVar = al.i.f3645a;
                nf nfVar3 = this.f46217f;
                if (zF) {
                    kl.b bVarA2 = kl.b.a1(eVar, hVar, true, ((ll.a) nfVar.f23782b).f45494j.c(nVar));
                    ArrayList<fl.z> arrayListE = nVar.e();
                    ArrayList arrayList4 = new ArrayList(arrayListE.size());
                    pVar = pVar2;
                    nl.a aVarI = android.support.v4.media.session.a.I(2, false, null, 6);
                    int i10 = 0;
                    for (fl.z zVar : arrayListE) {
                        arrayList4.add(new x0(bVarA2, null, i10, hVar, zVar.c(), ((v9.e) nfVar.f23786f).L(zVar.f(), aVarI), false, false, false, null, ((ll.a) nfVar.f23782b).f45494j.c(zVar)));
                        i10++;
                    }
                    bVarA2.S0(false);
                    il.o PROTECTED_AND_PACKAGE = eVar.getVisibility();
                    kotlin.jvm.internal.n.e(PROTECTED_AND_PACKAGE, "classDescriptor.visibility");
                    if (PROTECTED_AND_PACKAGE.equals(il.p.f43098b)) {
                        PROTECTED_AND_PACKAGE = il.p.f43099c;
                        kotlin.jvm.internal.n.e(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    bVarA2.X0(arrayList4, PROTECTED_AND_PACKAGE);
                    bVarA2.R0(false);
                    bVarA2.T0(eVar.g());
                    int i11 = 2;
                    String strU = go.k.u(bVarA2, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(bVarA2);
                        ((ll.a) nfVar3.f23782b).f45491g.getClass();
                    } else {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                arrayList2.add(bVarA2);
                                ((ll.a) nfVar3.f23782b).f45491g.getClass();
                            } else if (!go.k.u((cl.l) it2.next(), i11).equals(strU)) {
                                i11 = 2;
                            }
                        }
                    }
                } else {
                    pVar = pVar2;
                }
                ((gm.a) ((ll.a) nfVar3.f23782b).f45507x).a(nfVar3, eVar, arrayList2);
                ql.c cVar = ((ll.a) nfVar3.f23782b).f45501r;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listR = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        ll.a aVar2 = (ll.a) nfVar.f23782b;
                        v9.e eVar2 = (v9.e) nfVar.f23786f;
                        ?? A1 = kl.b.a1(eVar, hVar, true, aVar2.f45494j.c(nVar));
                        if (zIsAnnotation) {
                            Collection collectionD = nVar.d();
                            arrayList = new ArrayList(collectionD.size());
                            nl.a aVarI2 = android.support.v4.media.session.a.I(2, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList<fl.w> arrayList6 = new ArrayList();
                            for (Object obj : collectionD) {
                                if (kotlin.jvm.internal.n.a(((fl.w) obj).c(), il.y.f43121b)) {
                                    arrayList5.add(obj);
                                } else {
                                    arrayList6.add(obj);
                                }
                            }
                            arrayList5.size();
                            fl.w wVar = (fl.w) xj.n.q0(arrayList5);
                            if (wVar != null) {
                                fl.a0 a0VarF = wVar.f();
                                if (a0VarF instanceof fl.h) {
                                    fl.h hVar2 = (fl.h) a0VarF;
                                    fVar = new wj.f(eVar2.K(hVar2, aVarI2, true), eVar2.L(hVar2.f40994b, aVarI2));
                                } else {
                                    fVar = new wj.f(eVar2.L(a0VarF, aVarI2), null);
                                }
                                ?? r3 = pVar;
                                r3.x(arrayList, A1, 0, wVar, (pm.y) fVar.f53283a, (pm.y) fVar.f53284b);
                                r2 = r3;
                            } else {
                                r2 = pVar;
                            }
                            int i12 = wVar != null ? 1 : 0;
                            int i13 = 0;
                            for (fl.w wVar2 : arrayList6) {
                                r2.x(arrayList, A1, i13 + i12, wVar2, eVar2.L(wVar2.f(), aVarI2), null);
                                i13++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        A1.S0(false);
                        il.o PROTECTED_AND_PACKAGE2 = eVar.getVisibility();
                        kotlin.jvm.internal.n.e(PROTECTED_AND_PACKAGE2, "classDescriptor.visibility");
                        if (PROTECTED_AND_PACKAGE2.equals(il.p.f43098b)) {
                            PROTECTED_AND_PACKAGE2 = il.p.f43099c;
                            kotlin.jvm.internal.n.e(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                        }
                        A1.X0(arrayList, PROTECTED_AND_PACKAGE2);
                        A1.R0(true);
                        A1.T0(eVar.g());
                        ((ll.a) nfVar.f23782b).f45491g.getClass();
                        r14 = A1;
                    } else {
                        r14 = 0;
                    }
                    listR = xj.o.R(r14);
                }
                return xj.n.N0(cVar.e(nfVar3, listR));
            default:
                nf nfVar4 = this.f46217f;
                return xj.n.R0(((gm.a) ((ll.a) nfVar4.f23782b).f45507x).f(nfVar4, this.f46218g.f46221n));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, nf nfVar) {
        super(0);
        this.f46218g = pVar;
        this.f46217f = nfVar;
    }
}
