package beccafico;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.ri.ri.ri.ik.ik;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import rostrated.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class attabal extends MediaDataSource {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final ConcurrentHashMap<String, attabal> f15028molybdenite = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public long f15029arytenoidectomy = -2147483648L;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final rostrated.attabal f15030kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Context f15031monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final ik f15032polloi;

    public attabal(Context context, ik ikVar) {
        this.f15031monoploid = context;
        this.f15032polloi = ikVar;
        this.f15030kowloon = new saneness(ikVar);
    }

    public static attabal attabal(Context context, ik ikVar) {
        attabal attabalVar = new attabal(context, ikVar);
        f15028molybdenite.put(ikVar.bu(), attabalVar);
        return attabalVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f15032polloi.slm();
        rostrated.attabal attabalVar = this.f15030kowloon;
        if (attabalVar != null) {
            attabalVar.lr();
        }
        f15028molybdenite.remove(this.f15032polloi.bu());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.f15029arytenoidectomy == -2147483648L) {
            if (this.f15031monoploid == null || TextUtils.isEmpty(this.f15032polloi.slm())) {
                return -1L;
            }
            this.f15029arytenoidectomy = this.f15030kowloon.ik();
        }
        return this.f15029arytenoidectomy;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int iAttabal = this.f15030kowloon.attabal(j, bArr, i, i2);
        int length = bArr.length;
        return iAttabal;
    }

    public ik saneness() {
        return this.f15032polloi;
    }
}
