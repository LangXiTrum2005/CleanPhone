package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l22 implements m22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16682b;

    public l22() {
        this.f16681a = new HashSet();
    }

    @Override // com.google.android.gms.internal.ads.m22
    public ByteBuffer a(int i10) {
        return ((MediaCodec) this.f16681a).getOutputBuffer(i10);
    }

    public void b(int i10) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f16682b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f16682b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, td1.f20333a, new k22());
        this.f16682b = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.f16681a).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f16682b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            ps1.c0(((HashSet) this.f16681a).add(mediaCodec));
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f16681a).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f16682b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public ByteBuffer e(int i10) {
        return ((MediaCodec) this.f16681a).getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void g(ArrayList arrayList) {
        ((MediaCodec) this.f16681a).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void h(Bundle bundle) {
        ((MediaCodec) this.f16681a).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void i(Surface surface) {
        ((MediaCodec) this.f16681a).setOutputSurface(surface);
    }

    public void j() {
        ((HashSet) this.f16681a).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f16682b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // com.google.android.gms.internal.ads.m22
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f16681a).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void s(int i10, long j10) {
        ((MediaCodec) this.f16681a).releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void u(int i10, qx1 qx1Var, long j10, int i11) {
        ((MediaCodec) this.f16681a).queueSecureInputBuffer(i10, 0, qx1Var.f19238i, j10, i11);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void y(int i10) {
        ((MediaCodec) this.f16681a).setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void z(int i10, int i11, int i12, long j10) {
        ((MediaCodec) this.f16681a).queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzc(int i10) {
        ((MediaCodec) this.f16681a).releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public int zze() {
        return ((MediaCodec) this.f16681a).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public MediaFormat zzg() {
        return ((MediaCodec) this.f16681a).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzk() {
        ((MediaCodec) this.f16681a).flush();
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzl() {
        l22 l22Var = (l22) this.f16682b;
        MediaCodec mediaCodec = (MediaCodec) this.f16681a;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 33) {
                mediaCodec.stop();
            }
            if (i10 >= 35 && l22Var != null) {
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && l22Var != null) {
                l22Var.d(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzo() {
        ((MediaCodec) this.f16681a).detachOutputSurface();
    }

    public /* synthetic */ l22(MediaCodec mediaCodec, l22 l22Var) {
        this.f16681a = mediaCodec;
        this.f16682b = l22Var;
        if (Build.VERSION.SDK_INT < 35 || l22Var == null) {
            return;
        }
        l22Var.c(mediaCodec);
    }
}
