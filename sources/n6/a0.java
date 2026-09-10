package n6;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements e6.g, com.bumptech.glide.load.data.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f46565a;

    public a0(ByteBuffer byteBuffer) {
        this.f46565a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.g
    public Object a() {
        ByteBuffer byteBuffer = this.f46565a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // e6.g
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f46565a) {
            this.f46565a.position(0);
            messageDigest.update(this.f46565a.putLong(l.longValue()).array());
        }
    }

    public a0() {
        this.f46565a = ByteBuffer.allocate(8);
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
    }
}
