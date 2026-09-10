package a7;

import com.google.android.gms.internal.ads.ra;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class l implements ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3437c;

    public l(FileChannel fileChannel, long j10, long j11) {
        this.f3437c = fileChannel;
        this.f3435a = j10;
        this.f3436b = j11;
    }

    public synchronized Object a(Object obj) {
        k kVar;
        kVar = (k) ((LinkedHashMap) this.f3437c).get(obj);
        return kVar != null ? kVar.f3433a : null;
    }

    @Override // com.google.android.gms.internal.ads.ra
    public void b(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = ((FileChannel) this.f3437c).map(FileChannel.MapMode.READ_ONLY, this.f3435a + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public int c(Object obj) {
        return 1;
    }

    public synchronized Object e(Object obj, Object obj2) {
        int iC = c(obj2);
        long j10 = iC;
        if (j10 >= this.f3435a) {
            d(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f3436b += j10;
        }
        k kVar = (k) ((LinkedHashMap) this.f3437c).put(obj, obj2 == null ? null : new k(obj2, iC));
        if (kVar != null) {
            this.f3436b -= (long) kVar.f3434b;
            if (!kVar.f3433a.equals(obj2)) {
                d(obj, kVar.f3433a);
            }
        }
        f(this.f3435a);
        return kVar != null ? kVar.f3433a : null;
    }

    public synchronized void f(long j10) {
        while (this.f3436b > j10) {
            Iterator it = ((LinkedHashMap) this.f3437c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            k kVar = (k) entry.getValue();
            this.f3436b -= (long) kVar.f3434b;
            Object key = entry.getKey();
            it.remove();
            d(key, kVar.f3433a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ra
    public long zza() {
        return this.f3436b;
    }

    public l(long j10) {
        this.f3437c = new LinkedHashMap(100, 0.75f, true);
        this.f3435a = j10;
    }

    public l(long j10, long j11, TimeUnit timeUnit) {
        this.f3435a = j10;
        this.f3436b = j11;
        this.f3437c = timeUnit;
    }

    public void d(Object obj, Object obj2) {
    }
}
