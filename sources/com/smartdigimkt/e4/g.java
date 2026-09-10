package com.smartdigimkt.e4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.smartdigimkt.w3.m;
import com.smartdigimkt.w3.n;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends com.smartdigimkt.w3.a implements Handler.Callback {
    private static final int v0 = 0;
    private static final int w0 = 5;
    private final d k0;
    private final f l0;
    private final Handler m0;
    private final n n0;
    private final e o0;
    private final com.smartdigimkt.e4.a[] p0;
    private final long[] q0;
    private int r0;
    private int s0;
    private b t0;
    private boolean u0;

    @Deprecated
    public interface a extends f {
    }

    public g(f fVar, Looper looper) {
        this(fVar, looper, d.f34611a);
    }

    private void b(com.smartdigimkt.e4.a aVar) {
        this.l0.a(aVar);
    }

    private void v() {
        Arrays.fill(this.p0, (Object) null);
        this.r0 = 0;
        this.s0 = 0;
    }

    @Override // com.smartdigimkt.w3.z
    public int a(m mVar) {
        if (this.k0.a(mVar)) {
            return com.smartdigimkt.w3.a.a((com.smartdigimkt.a4.g<?>) null, mVar.f39336i) ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        b((com.smartdigimkt.e4.a) message.obj);
        return true;
    }

    @Override // com.smartdigimkt.w3.y
    public boolean isReady() {
        return true;
    }

    @Override // com.smartdigimkt.w3.a
    public void s() {
        v();
        this.t0 = null;
    }

    public g(f fVar, Looper looper, d dVar) {
        super(4);
        this.l0 = (f) com.smartdigimkt.p4.a.a(fVar);
        this.m0 = looper == null ? null : new Handler(looper, this);
        this.k0 = (d) com.smartdigimkt.p4.a.a(dVar);
        this.n0 = new n();
        this.o0 = new e();
        this.p0 = new com.smartdigimkt.e4.a[5];
        this.q0 = new long[5];
    }

    @Override // com.smartdigimkt.w3.a
    public void a(m[] mVarArr, long j) throws com.smartdigimkt.w3.g {
        this.t0 = this.k0.b(mVarArr[0]);
    }

    @Override // com.smartdigimkt.w3.a
    public void a(long j, boolean z2) {
        v();
        this.u0 = false;
    }

    @Override // com.smartdigimkt.w3.y
    public void a(long j, long j2) throws com.smartdigimkt.w3.g {
        if (!this.u0 && this.s0 < 5) {
            this.o0.a();
            if (a(this.n0, (com.smartdigimkt.z3.e) this.o0, false) == -4) {
                if (this.o0.c()) {
                    this.u0 = true;
                } else if (!this.o0.b()) {
                    e eVar = this.o0;
                    eVar.f34612i = this.n0.f39343a.j;
                    eVar.e();
                    try {
                        int i2 = (this.r0 + this.s0) % 5;
                        this.p0[i2] = this.t0.a(this.o0);
                        this.q0[i2] = this.o0.d;
                        this.s0++;
                    } catch (c e2) {
                        throw com.smartdigimkt.w3.g.a(e2, p());
                    }
                }
            }
        }
        if (this.s0 > 0) {
            long[] jArr = this.q0;
            int i3 = this.r0;
            if (jArr[i3] <= j) {
                a(this.p0[i3]);
                com.smartdigimkt.e4.a[] aVarArr = this.p0;
                int i4 = this.r0;
                aVarArr[i4] = null;
                this.r0 = (i4 + 1) % 5;
                this.s0--;
            }
        }
    }

    @Override // com.smartdigimkt.w3.y
    public boolean a() {
        return this.u0;
    }

    private void a(com.smartdigimkt.e4.a aVar) {
        Handler handler = this.m0;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }
}
