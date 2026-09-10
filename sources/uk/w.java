package uk;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends y implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f52250d;

    public w(Object obj, Method method) {
        super(method, xj.v.f53866a);
        this.f52250d = obj;
    }

    @Override // uk.f
    public final Object call(Object[] args) {
        kotlin.jvm.internal.n.f(args, "args");
        com.google.android.gms.internal.auth.o.c(this, args);
        return this.f52251a.invoke(this.f52250d, Arrays.copyOf(args, args.length));
    }
}
