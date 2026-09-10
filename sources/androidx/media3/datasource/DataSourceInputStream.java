package androidx.media3.datasource;

import androidx.media3.common.util.Assertions;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceInputStream extends InputStream {
    public final DataSource X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DataSpec f5735Y;
    public boolean e0 = false;
    public boolean f0 = false;
    public final byte[] Z = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
        this.X = dataSource;
        this.f5735Y = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f0) {
            return;
        }
        this.X.close();
        this.f0 = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.Z;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        Assertions.e(!this.f0);
        boolean z2 = this.e0;
        DataSource dataSource = this.X;
        if (!z2) {
            dataSource.b(this.f5735Y);
            this.e0 = true;
        }
        int i4 = dataSource.read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        return i4;
    }
}
