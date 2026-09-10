package uk;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Member f52243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f52244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f52245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f52246d;

    public u(Member member, Type type, Class cls, Type[] typeArr) {
        List listC0;
        this.f52243a = member;
        this.f52244b = type;
        this.f52245c = cls;
        if (cls != null) {
            h2.d dVar = new h2.d(2);
            dVar.f(cls);
            dVar.h(typeArr);
            ArrayList arrayList = dVar.f42079a;
            listC0 = xj.o.Q(arrayList.toArray(new Type[arrayList.size()]));
        } else {
            listC0 = xj.k.C0(typeArr);
        }
        this.f52246d = listC0;
    }

    @Override // uk.f
    public final List a() {
        return this.f52246d;
    }

    @Override // uk.f
    public final Member b() {
        return this.f52243a;
    }

    public void c(Object[] objArr) {
        com.google.android.gms.internal.auth.o.c(this, objArr);
    }

    public final void d(Object obj) {
        if (obj == null || !this.f52243a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // uk.f
    public final Type getReturnType() {
        return this.f52244b;
    }
}
