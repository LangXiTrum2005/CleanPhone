package com.smartdigimkt.y3;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
final class p implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40145b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40146c = -1;
    private int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f40147e;
    private ByteBuffer f;
    private boolean g;

    public p() {
        ByteBuffer byteBuffer = f.f40052a;
        this.f40147e = byteBuffer;
        this.f = byteBuffer;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a(int i2, int i3, int i4) throws f.a {
        if (i4 != 3 && i4 != 2 && i4 != Integer.MIN_VALUE && i4 != 1073741824) {
            throw new f.a(i2, i3, i4);
        }
        if (this.f40145b == i2 && this.f40146c == i3 && this.d == i4) {
            return false;
        }
        this.f40145b = i2;
        this.f40146c = i3;
        this.d = i4;
        return true;
    }

    @Override // com.smartdigimkt.y3.f
    public void c() {
        flush();
        this.f40145b = -1;
        this.f40146c = -1;
        this.d = 0;
        this.f40147e = f.f40052a;
    }

    @Override // com.smartdigimkt.y3.f
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.f;
        this.f = f.f40052a;
        return byteBuffer;
    }

    @Override // com.smartdigimkt.y3.f
    public void e() {
        this.g = true;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean f() {
        int i2 = this.d;
        return (i2 == 0 || i2 == 2) ? false : true;
    }

    @Override // com.smartdigimkt.y3.f
    public void flush() {
        this.f = f.f40052a;
        this.g = false;
    }

    @Override // com.smartdigimkt.y3.f
    public int g() {
        return this.f40146c;
    }

    @Override // com.smartdigimkt.y3.f
    public int h() {
        return this.f40145b;
    }

    @Override // com.smartdigimkt.y3.f
    public int i() {
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[ADDED_TO_REGION, LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_START, PHI: r0
  0x0049: PHI (r0v6 int) = (r0v0 int), (r0v7 int) binds: [B:18:0x0047, B:20:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION, LOOP:1: B:23:0x006a->B:24:0x006c, LOOP_START, PHI: r0
  0x006a: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:17:0x0045, B:24:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:1: B:23:0x006a->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0083 A[ADDED_TO_REGION, LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_START, PHI: r0
  0x0083: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0043, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0085 A[LOOP:2: B:25:0x0083->B:26:0x0085, LOOP_END] */
    @Override // com.smartdigimkt.y3.f
    public void a(ByteBuffer byteBuffer) {
        int i2;
        int i3;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i4 = iLimit - iPosition;
        int i5 = this.d;
        if (i5 == Integer.MIN_VALUE) {
            i4 /= 3;
        } else {
            if (i5 != 3) {
                if (i5 == 1073741824) {
                    i2 = i4 / 2;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.f40147e.capacity() < i2) {
                this.f40147e = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
            } else {
                this.f40147e.clear();
            }
            i3 = this.d;
            if (i3 != Integer.MIN_VALUE) {
                while (iPosition < iLimit) {
                    this.f40147e.put(byteBuffer.get(iPosition + 1));
                    this.f40147e.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else if (i3 != 3) {
                while (iPosition < iLimit) {
                    this.f40147e.put((byte) 0);
                    this.f40147e.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                    iPosition++;
                }
            } else {
                if (i3 == 1073741824) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    this.f40147e.put(byteBuffer.get(iPosition + 2));
                    this.f40147e.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            this.f40147e.flip();
            this.f = this.f40147e;
        }
        i2 = i4 * 2;
        if (this.f40147e.capacity() < i2) {
            this.f40147e = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f40147e.clear();
        }
        i3 = this.d;
        if (i3 != Integer.MIN_VALUE) {
            while (iPosition < iLimit) {
                this.f40147e.put(byteBuffer.get(iPosition + 1));
                this.f40147e.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 != 3) {
            while (iPosition < iLimit) {
                this.f40147e.put((byte) 0);
                this.f40147e.put((byte) ((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                iPosition++;
            }
        } else {
            if (i3 == 1073741824) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                this.f40147e.put(byteBuffer.get(iPosition + 2));
                this.f40147e.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f40147e.flip();
        this.f = this.f40147e;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a() {
        return this.g && this.f == f.f40052a;
    }
}
