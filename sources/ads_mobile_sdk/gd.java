package ads_mobile_sdk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import saneness.vintage;

/* JADX INFO: loaded from: classes.dex */
public final class gd implements vintage {
    public final ByteBuffer a;

    public gd(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // saneness.vintage
    public final void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer byteBufferSlice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            byteBufferSlice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // saneness.vintage
    public final long size() {
        return this.a.capacity();
    }
}
