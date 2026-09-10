package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f18004f;

    public nv0(int i10) {
        switch (i10) {
            case 1:
                this.f18004f = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
                this.f17999a = 16;
                this.f18000b = 16;
                long j10 = 0;
                this.f18001c = j10;
                this.f18002d = j10;
                this.f18003e = 0;
                break;
            default:
                this.f18004f = new mv0();
                this.f17999a = 0;
                this.f18000b = 0;
                this.f18003e = 0;
                ((p9.b) zzt.zzk()).getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f18001c = jCurrentTimeMillis;
                this.f18002d = jCurrentTimeMillis;
                break;
        }
    }

    public void a() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f18004f;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= this.f18000b) {
            b(byteBuffer);
        }
        byteBuffer.compact();
    }

    public void b(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getLong();
        long j11 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j10 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.f18001c;
        this.f18001c = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j12 = this.f18002d;
        this.f18001c = ((jRotateLeft2 + j12) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j11 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j12;
        this.f18002d = jRotateLeft3;
        this.f18002d = ((Long.rotateLeft(jRotateLeft3, 31) + this.f18001c) * 5) + 944331445;
        this.f18003e += 16;
    }

    public nv0 c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = (ByteBuffer) this.f18004f;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                a();
            }
            return this;
        }
        int iPosition = this.f17999a - byteBuffer.position();
        for (int i10 = 0; i10 < iPosition; i10++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        a();
        while (byteBufferOrder.remaining() >= this.f18000b) {
            b(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }
}
