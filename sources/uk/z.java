package uk;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f52254a = new z();

    @Override // uk.f
    public final List a() {
        return xj.v.f53866a;
    }

    @Override // uk.f
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // uk.f
    public final Object call(Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // uk.f
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        kotlin.jvm.internal.n.e(TYPE, "TYPE");
        return TYPE;
    }
}
