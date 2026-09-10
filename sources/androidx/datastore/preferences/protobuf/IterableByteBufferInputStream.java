package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class IterableByteBufferInputStream extends InputStream {
    public Iterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ByteBuffer f4860Y;
    public int Z;
    public int e0;
    public int f0;
    public boolean g0;
    public byte[] h0;
    public int i0;
    public long j0;

    public final boolean d() {
        this.e0++;
        Iterator it = this.X;
        if (!it.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) it.next();
        this.f4860Y = byteBuffer;
        this.f0 = byteBuffer.position();
        if (this.f4860Y.hasArray()) {
            this.g0 = true;
            this.h0 = this.f4860Y.array();
            this.i0 = this.f4860Y.arrayOffset();
        } else {
            this.g0 = false;
            this.j0 = UnsafeUtil.b(this.f4860Y);
            this.h0 = null;
        }
        return true;
    }

    public final void h(int i2) {
        int i3 = this.f0 + i2;
        this.f0 = i3;
        if (i3 == this.f4860Y.limit()) {
            d();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.e0 == this.Z) {
            return -1;
        }
        if (this.g0) {
            int i2 = this.h0[this.f0 + this.i0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            h(1);
            return i2;
        }
        int iF = UnsafeUtil.f4938c.f(((long) this.f0) + this.j0) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        h(1);
        return iF;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (this.e0 == this.Z) {
            return -1;
        }
        int iLimit = this.f4860Y.limit();
        int i4 = this.f0;
        int i5 = iLimit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.g0) {
            System.arraycopy(this.h0, i4 + this.i0, bArr, i2, i3);
            h(i3);
            return i3;
        }
        int iPosition = this.f4860Y.position();
        this.f4860Y.position(this.f0);
        this.f4860Y.get(bArr, i2, i3);
        this.f4860Y.position(iPosition);
        h(i3);
        return i3;
    }
}
