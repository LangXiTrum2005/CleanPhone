package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface x40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f21739a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a(ByteBuffer byteBuffer);

    void b(a40 a40Var);

    z20 d(z20 z20Var);

    boolean zzc();

    void zze();

    ByteBuffer zzf();

    boolean zzg();

    void zzj();

    default long c(long j10) {
        return j10;
    }
}
