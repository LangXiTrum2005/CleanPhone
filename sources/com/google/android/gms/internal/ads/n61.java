package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n61 implements l61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a71 f17687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17688b;

    public n61(a71 a71Var, long j10) {
        this.f17687a = a71Var;
        this.f17688b = j10;
    }

    public static boolean c(l31 l31Var) {
        int iZ = l31Var.A().z().z();
        int iA = l31Var.A().z().A();
        byte[] versionArray = rb0.m();
        kotlin.jvm.internal.n.f(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        kotlin.jvm.internal.n.e(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZ);
        byteBufferAllocate.putInt(iA);
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.n.e(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.l61
    public final boolean a(l31 l31Var) {
        a71 a71Var = this.f17687a;
        if (l31Var == null || l31Var.equals(l31.F())) {
            a71Var.b(20204);
            return false;
        }
        if (c(l31Var)) {
            return true;
        }
        a71Var.b(20206);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.l61
    public final boolean b(l31 l31Var) {
        a71 a71Var = this.f17687a;
        if (l31Var == null || l31Var.equals(l31.F())) {
            a71Var.b(20202);
            return true;
        }
        if (!c(l31Var)) {
            a71Var.b(20205);
            return true;
        }
        boolean z10 = l31Var.A().B() - System.currentTimeMillis() <= this.f17688b;
        if (z10) {
            a71Var.b(20203);
        }
        return z10;
    }
}
