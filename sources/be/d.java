package be;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.google.gson.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eb.d0 f5609b;

    public /* synthetic */ d(eb.d0 d0Var, int i10) {
        this.f5608a = i10;
        this.f5609b = d0Var;
    }

    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        Type[] actualTypeArguments;
        int i10 = this.f5608a;
        eb.d0 d0Var = this.f5609b;
        Type type = Object.class;
        switch (i10) {
            case 0:
                Type type2 = aVar.f40810b;
                Class cls = aVar.f40809a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type typeH = ae.i.h(type2, cls, Collection.class);
                type = typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
                return new c(new r(dVar, dVar.c(new fe.a(type)), type), d0Var.T0(aVar, false));
            default:
                Type type3 = aVar.f40810b;
                Class cls2 = aVar.f40809a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeH2 = ae.i.h(type3, cls2, Map.class);
                    actualTypeArguments = typeH2 instanceof ParameterizedType ? ((ParameterizedType) typeH2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                return new r(this, new r(dVar, (type4 == Boolean.TYPE || type4 == Boolean.class) ? i1.f5625c : dVar.c(new fe.a(type4)), type4), new r(dVar, dVar.c(new fe.a(type5)), type5), d0Var.T0(aVar, false));
        }
    }
}
