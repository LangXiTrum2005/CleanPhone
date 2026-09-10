package lm;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import tk.k1;
import tk.o1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f45567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f45568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f45569h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, zl.a aVar, int i10, int i11) {
        super(0);
        this.f45566e = i11;
        this.f45567f = rVar;
        this.f45568g = aVar;
        this.f45569h = i10;
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, wj.d] */
    @Override // jk.a
    public final Object invoke() {
        List listN0;
        List listP;
        switch (this.f45566e) {
            case 0:
                r rVar = (r) this.f45567f;
                com.google.android.gms.internal.consent_sdk.d dVar = rVar.f45583a;
                u uVarA = rVar.a((zk.j) dVar.f22983c);
                if (uVarA != null) {
                    listN0 = xj.n.N0(((i) dVar.f22981a).f45541e.i(uVarA, (zl.a) this.f45568g, this.f45569h));
                } else {
                    listN0 = null;
                }
                return listN0 == null ? xj.v.f53866a : listN0;
            case 1:
                r rVar2 = (r) this.f45567f;
                com.google.android.gms.internal.consent_sdk.d dVar2 = rVar2.f45583a;
                u uVarA2 = rVar2.a((zk.j) dVar2.f22983c);
                if (uVarA2 != null) {
                    listP = ((i) dVar2.f22981a).f45541e.P(uVarA2, (zl.a) this.f45568g, this.f45569h);
                } else {
                    listP = null;
                }
                return listP == null ? xj.v.f53866a : listP;
            default:
                k1 k1Var = (k1) this.f45567f;
                o1 o1Var = k1Var.f51003b;
                Type type = o1Var != null ? (Type) o1Var.invoke() : null;
                if (type instanceof Class) {
                    Class cls = (Class) type;
                    Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                    kotlin.jvm.internal.n.e(componentType, "{\n                      …                        }");
                    return componentType;
                }
                boolean z10 = type instanceof GenericArrayType;
                int i10 = this.f45569h;
                if (z10) {
                    if (i10 == 0) {
                        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                        kotlin.jvm.internal.n.e(genericComponentType, "{\n                      …                        }");
                        return genericComponentType;
                    }
                    throw new cn.c0("Array type has been queried for a non-0th argument: " + k1Var, 3);
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new cn.c0("Non-generic type has been queried for arguments: " + k1Var, 3);
                }
                Type type2 = (Type) ((List) this.f45568g.getValue()).get(i10);
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type2;
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    kotlin.jvm.internal.n.e(lowerBounds, "argument.lowerBounds");
                    Type type3 = (Type) xj.k.p0(lowerBounds);
                    if (type3 == null) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        kotlin.jvm.internal.n.e(upperBounds, "argument.upperBounds");
                        type2 = (Type) xj.k.o0(upperBounds);
                    } else {
                        type2 = type3;
                    }
                }
                kotlin.jvm.internal.n.e(type2, "{\n                      …                        }");
                return type2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k1 k1Var, int i10, wj.d dVar) {
        super(0);
        this.f45566e = 2;
        this.f45567f = k1Var;
        this.f45569h = i10;
        this.f45568g = dVar;
    }
}
