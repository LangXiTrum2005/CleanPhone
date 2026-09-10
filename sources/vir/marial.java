package vir;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class marial extends InputStream {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final competently f39577arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public long f39578graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final androidx.media3.datasource.attabal f39579kowloon;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f39582polloi = false;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f39580molybdenite = false;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final byte[] f39581monoploid = new byte[1];

    public marial(androidx.media3.datasource.attabal attabalVar, competently competentlyVar) {
        this.f39579kowloon = attabalVar;
        this.f39577arytenoidectomy = competentlyVar;
    }

    public final void attabal() throws IOException {
        if (this.f39582polloi) {
            return;
        }
        this.f39579kowloon.attabal(this.f39577arytenoidectomy);
        this.f39582polloi = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f39580molybdenite) {
            return;
        }
        this.f39579kowloon.close();
        this.f39580molybdenite = true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f39581monoploid) == -1) {
            return -1;
        }
        return this.f39581monoploid[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        decarock.attabal.competently(!this.f39580molybdenite);
        attabal();
        int i3 = this.f39579kowloon.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f39578graveside += (long) i3;
        return i3;
    }
}
