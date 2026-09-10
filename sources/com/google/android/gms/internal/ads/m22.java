package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface m22 {
    ByteBuffer a(int i10);

    ByteBuffer e(int i10);

    default void f(f12 f12Var) {
        f12Var.run();
    }

    void g(ArrayList arrayList);

    void h(Bundle bundle);

    void i(Surface surface);

    default boolean m(wv0 wv0Var) {
        return false;
    }

    int n(MediaCodec.BufferInfo bufferInfo);

    void s(int i10, long j10);

    void u(int i10, qx1 qx1Var, long j10, int i11);

    void y(int i10);

    void z(int i10, int i11, int i12, long j10);

    void zzc(int i10);

    int zze();

    MediaFormat zzg();

    void zzk();

    void zzl();

    void zzo();
}
