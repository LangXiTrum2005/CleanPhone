package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xw1 implements zb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zw1 f22011h = zw1.j(xw1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22012a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f22015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f22016e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s10 f22018g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f22017f = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22014c = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22013b = true;

    public xw1(String str) {
        this.f22012a = str;
    }

    @Override // com.google.android.gms.internal.ads.zb
    public final void a(s10 s10Var, ByteBuffer byteBuffer, long j10, wb wbVar) {
        this.f22016e = s10Var.d();
        byteBuffer.remaining();
        this.f22017f = j10;
        this.f22018g = s10Var;
        s10Var.f19758a.position((int) (s10Var.d() + j10));
        this.f22014c = false;
        this.f22013b = false;
        d();
    }

    public final synchronized void b() {
        try {
            if (this.f22014c) {
                return;
            }
            try {
                zw1 zw1Var = f22011h;
                String str = this.f22012a;
                zw1Var.e(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                s10 s10Var = this.f22018g;
                long j10 = this.f22016e;
                long j11 = this.f22017f;
                ByteBuffer byteBuffer = s10Var.f19758a;
                int iPosition = byteBuffer.position();
                byteBuffer.position((int) j10);
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit((int) j11);
                byteBuffer.position(iPosition);
                this.f22015d = byteBufferSlice;
                this.f22014c = true;
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            zw1 zw1Var = f22011h;
            String str = this.f22012a;
            zw1Var.e(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f22015d;
            if (byteBuffer != null) {
                this.f22013b = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f22015d = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
