package wf;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.r;
import m5.k;
import qk.w;
import xj.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w[] f53178g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f53179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f53180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ec.a f53181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f53182d = new a(this, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f53183e = new a(this, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f53184f = new j();

    static {
        r rVar = new r(b.class, "dequeuedInputs", "getDequeuedInputs()I");
        e0 e0Var = d0.f44761a;
        f53178g = new w[]{e0Var.e(rVar), e0Var.e(new r(b.class, "dequeuedOutputs", "getDequeuedOutputs()I"))};
    }

    public b(MediaCodec mediaCodec, k kVar, ec.a aVar) {
        this.f53179a = mediaCodec;
        this.f53180b = kVar;
        this.f53181c = aVar;
    }

    public final int a() {
        return ((Number) this.f53182d.getValue(this, f53178g[0])).intValue();
    }

    public final int b() {
        return ((Number) this.f53183e.getValue(this, f53178g[1])).intValue();
    }

    public final wj.f c() {
        j jVar = this.f53184f;
        if (!jVar.isEmpty()) {
            wj.f fVar = (wj.f) jVar.removeFirst();
            ec.a aVar = this.f53181c;
            if (aVar != null) {
                aVar.c(d());
            }
            return fVar;
        }
        MediaCodec mediaCodec = this.f53179a;
        int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(100L);
        if (iDequeueInputBuffer >= 0) {
            e(a() + 1);
            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(iDequeueInputBuffer);
            if (inputBuffer != null) {
                return new wj.f(inputBuffer, Integer.valueOf(iDequeueInputBuffer));
            }
            throw new IllegalStateException(defpackage.e.h(iDequeueInputBuffer, "inputBuffer(", ") should not be null.").toString());
        }
        ec.a aVar2 = this.f53181c;
        if (aVar2 == null) {
            return null;
        }
        aVar2.a("buffer() failed with " + iDequeueInputBuffer + ". " + d());
        return null;
    }

    public final String d() {
        int iA = a();
        int iB = b();
        int iH = this.f53184f.h();
        StringBuilder sbL = l1.d.l("dequeuedInputs=", iA, " dequeuedOutputs=", iB, " heldInputs=");
        sbL.append(iH);
        return sbL.toString();
    }

    public final void e(int i10) {
        this.f53182d.setValue(this, f53178g[0], Integer.valueOf(i10));
    }

    public final void f(int i10) {
        this.f53183e.setValue(this, f53178g[1], Integer.valueOf(i10));
    }
}
