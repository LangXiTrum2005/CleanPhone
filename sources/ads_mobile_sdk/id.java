package ads_mobile_sdk;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import saneness.vintage;

/* JADX INFO: loaded from: classes.dex */
public final class id implements vintage {
    public final FileChannel a;
    public final long b;
    public final long c;

    public id(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // saneness.vintage
    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // saneness.vintage
    public final long size() {
        return this.c;
    }
}
