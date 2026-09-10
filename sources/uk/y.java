package uk;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f52251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f52252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f52253c;

    public y(Method method, List list) {
        this.f52251a = method;
        this.f52252b = list;
        Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.n.e(returnType, "unboxMethod.returnType");
        this.f52253c = returnType;
    }

    @Override // uk.f
    public final List a() {
        return this.f52252b;
    }

    @Override // uk.f
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // uk.f
    public final Type getReturnType() {
        return this.f52253c;
    }
}
