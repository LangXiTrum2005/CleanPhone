package be;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f5681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Method f5683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.t f5684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.google.gson.t f5685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5687h;

    public w(String str, Field field, Method method, com.google.gson.t tVar, com.google.gson.t tVar2, boolean z10, boolean z11) {
        this.f5683d = method;
        this.f5684e = tVar;
        this.f5685f = tVar2;
        this.f5686g = z10;
        this.f5687h = z11;
        this.f5680a = str;
        this.f5681b = field;
        this.f5682c = field.getName();
    }

    public final void a(ge.b bVar, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.f5683d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e10) {
                throw new com.google.gson.h(defpackage.e.o("Accessor ", de.c.d(method, false), " threw exception"), e10.getCause());
            }
        } else {
            objInvoke = this.f5681b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        bVar.q(this.f5680a);
        this.f5684e.c(bVar, objInvoke);
    }
}
