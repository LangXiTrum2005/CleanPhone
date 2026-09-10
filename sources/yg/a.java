package yg;

import ak.f;
import android.os.VibrationEffect;
import android.os.Vibrator;
import ck.i;
import cn.a0;
import com.bumptech.glide.d;
import jk.c;
import t9.e;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f54395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f54396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f54397h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(double d10, b bVar, double d11, f fVar) {
        super(2, fVar);
        this.f54395f = d10;
        this.f54396g = bVar;
        this.f54397h = d11;
    }

    @Override // ck.a
    public final f create(Object obj, f fVar) {
        return new a(this.f54395f, this.f54396g, this.f54397h, fVar);
    }

    @Override // jk.c
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) create((a0) obj, (f) obj2);
        r rVar = r.f53297a;
        aVar.invokeSuspend(rVar);
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r10
  0x0034: PHI (r10v7 double) = (r10v0 double), (r10v1 double) binds: [B:8:0x0032, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ck.a
    public final Object invokeSuspend(Object obj) {
        e.z(obj);
        int i10 = (int) (((double) 1000) * 0.1d);
        double d10 = this.f54395f;
        int iMax = Math.max(1, (int) Math.floor(d10 / 0.1d));
        long[] jArr = new long[iMax];
        for (int i11 = 0; i11 < iMax; i11++) {
            jArr[i11] = i10;
        }
        int[] iArr = new int[iMax];
        for (int i12 = 0; i12 < iMax; i12++) {
            double d11 = (((double) i12) * 0.1d) / d10;
            double d12 = 0.0d;
            if (d11 < 0.0d) {
                d11 = d12;
            } else {
                d12 = 1.0d;
                if (d11 > 1.0d) {
                    d11 = d12;
                }
            }
            double d13 = this.f54397h;
            iArr[i12] = d.m(d.m((int) ((d13 * d13 * d11 * d13 * ((double) 155)) + ((double) 20)), 1, 255), 1, 255);
        }
        b bVar = this.f54396g;
        Vibrator vibratorC = bVar.c();
        if (vibratorC != null) {
            vibratorC.cancel();
        }
        Vibrator vibratorC2 = bVar.c();
        if (vibratorC2 != null) {
            vibratorC2.vibrate(VibrationEffect.createWaveform(jArr, iArr, -1));
        }
        return r.f53297a;
    }
}
