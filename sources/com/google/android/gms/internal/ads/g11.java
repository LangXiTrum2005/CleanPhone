package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g11 implements s0.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g11 f14656a = new g11();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f11 f14657b;

    static {
        f11 f11VarC = f11.C();
        kotlin.jvm.internal.n.e(f11VarC, "getDefaultInstance(...)");
        f14657b = f11VarC;
    }

    @Override // s0.a1
    public final /* synthetic */ Object getDefaultValue() {
        return f14657b;
    }

    @Override // s0.a1
    public final Object readFrom(InputStream inputStream, ak.f fVar) {
        try {
            return f11.B((FileInputStream) inputStream);
        } catch (Exception unused) {
            return f14657b;
        }
    }

    @Override // s0.a1
    public final /* synthetic */ Object writeTo(Object obj, OutputStream outputStream, ak.f fVar) {
        ((f11) obj).c(outputStream);
        return wj.r.f53297a;
    }
}
