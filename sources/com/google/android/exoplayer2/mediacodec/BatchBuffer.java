package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class BatchBuffer extends DecoderInputBuffer {
    public long i0;
    public int j0;
    public int k0;

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    public final void d() {
        super.d();
        this.j0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(com.google.android.exoplayer2.decoder.DecoderInputBuffer r6) {
        /*
            r5 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r6.b(r0)
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.b(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r6.b(r0)
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.b(r0)
            r0 = 4
            boolean r0 = r6.b(r0)
            r0 = r0 ^ r1
            com.google.android.exoplayer2.util.Assertions.b(r0)
            int r0 = r5.j0
            r2 = 0
            if (r0 <= 0) goto L25
            r3 = r1
            goto L26
        L25:
            r3 = r2
        L26:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != 0) goto L2b
            goto L52
        L2b:
            int r3 = r5.k0
            if (r0 < r3) goto L30
            goto L51
        L30:
            boolean r0 = r6.b(r4)
            boolean r3 = r5.b(r4)
            if (r0 == r3) goto L3b
            goto L51
        L3b:
            java.nio.ByteBuffer r0 = r6.Z
            if (r0 == 0) goto L52
            java.nio.ByteBuffer r3 = r5.Z
            if (r3 == 0) goto L52
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L52
        L51:
            return r2
        L52:
            int r0 = r5.j0
            int r2 = r0 + 1
            r5.j0 = r2
            if (r0 != 0) goto L66
            long r2 = r6.f0
            r5.f0 = r2
            boolean r0 = r6.b(r1)
            if (r0 == 0) goto L66
            r5.X = r1
        L66:
            boolean r0 = r6.b(r4)
            if (r0 == 0) goto L6e
            r5.X = r4
        L6e:
            java.nio.ByteBuffer r0 = r6.Z
            if (r0 == 0) goto L7e
            int r2 = r0.remaining()
            r5.g(r2)
            java.nio.ByteBuffer r2 = r5.Z
            r2.put(r0)
        L7e:
            long r2 = r6.f0
            r5.i0 = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.BatchBuffer.i(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }
}
