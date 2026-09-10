package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AssetDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AssetManager f5720e;
    public Uri f;
    public InputStream g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5722i;

    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f5720e = context.getAssets();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) throws AssetDataSourceException {
        try {
            Uri uri = dataSpec.f5736a;
            long j = dataSpec.f5739e;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e(dataSpec);
            InputStream inputStreamOpen = this.f5720e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j2 = dataSpec.f;
            if (j2 != -1) {
                this.f5721h = j2;
            } else {
                long jAvailable = this.g.available();
                this.f5721h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f5721h = -1L;
                }
            }
            this.f5722i = true;
            f(dataSpec);
            return this.f5721h;
        } catch (AssetDataSourceException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new AssetDataSourceException(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.f5722i) {
                    this.f5722i = false;
                    d();
                }
            } catch (IOException e2) {
                throw new AssetDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.f5722i) {
                this.f5722i = false;
                d();
            }
            throw th;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws AssetDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j = this.f5721h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i3 = (int) Math.min(j, i3);
                } catch (IOException e2) {
                    throw new AssetDataSourceException(e2, 2000);
                }
            }
            InputStream inputStream = this.g;
            int i4 = Util.f5683a;
            int i5 = inputStream.read(bArr, i2, i3);
            if (i5 != -1) {
                long j2 = this.f5721h;
                if (j2 != -1) {
                    this.f5721h = j2 - ((long) i5);
                }
                c(i5);
                return i5;
            }
        }
        return -1;
    }
}
