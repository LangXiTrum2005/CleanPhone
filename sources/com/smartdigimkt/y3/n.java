package com.smartdigimkt.y3;

import com.inmobi.commons.core.configs.AdConfig;
import com.smartdigimkt.p4.f0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes6.dex */
final class n implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f40139h = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double f40140i = 4.656612875245797E-10d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40141b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40142c = -1;
    private int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f40143e;
    private ByteBuffer f;
    private boolean g;

    public n() {
        ByteBuffer byteBuffer = f.f40052a;
        this.f40143e = byteBuffer;
        this.f = byteBuffer;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a(int i2, int i3, int i4) throws f.a {
        if (!f0.f(i4)) {
            throw new f.a(i2, i3, i4);
        }
        if (this.f40141b == i2 && this.f40142c == i3 && this.d == i4) {
            return false;
        }
        this.f40141b = i2;
        this.f40142c = i3;
        this.d = i4;
        return true;
    }

    @Override // com.smartdigimkt.y3.f
    public void c() {
        flush();
        this.f40141b = -1;
        this.f40142c = -1;
        this.d = 0;
        this.f40143e = f.f40052a;
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
        return f0.f(this.d);
    }

    @Override // com.smartdigimkt.y3.f
    public void flush() {
        this.f = f.f40052a;
        this.g = false;
    }

    @Override // com.smartdigimkt.y3.f
    public int g() {
        return this.f40142c;
    }

    @Override // com.smartdigimkt.y3.f
    public int h() {
        return this.f40141b;
    }

    @Override // com.smartdigimkt.y3.f
    public int i() {
        return 4;
    }

    @Override // com.smartdigimkt.y3.f
    public void a(ByteBuffer byteBuffer) {
        boolean z2 = this.d == 1073741824;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        if (!z2) {
            i2 = (i2 / 3) * 4;
        }
        if (this.f40143e.capacity() < i2) {
            this.f40143e = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f40143e.clear();
        }
        if (z2) {
            while (iPosition < iLimit) {
                a((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), this.f40143e);
                iPosition += 4;
            }
        } else {
            while (iPosition < iLimit) {
                a(((byteBuffer.get(iPosition) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(iPosition + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(iPosition + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), this.f40143e);
                iPosition += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.f40143e.flip();
        this.f = this.f40143e;
    }

    @Override // com.smartdigimkt.y3.f
    public boolean a() {
        return this.g && this.f == f.f40052a;
    }

    private static void a(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * f40140i));
        if (iFloatToIntBits == f40139h) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }
}
