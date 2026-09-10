package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Util;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class FileDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RandomAccessFile f18787e;
    public Uri f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18788h;

    public static final class Api21 {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public static final class Factory implements DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return new FileDataSource(false);
        }
    }

    public static class FileDataSourceException extends DataSourceException {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.f18742a;
        long j = dataSpec.f;
        this.f = uri;
        e(dataSpec);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f18787e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = dataSpec.g;
                if (length == -1) {
                    length = this.f18787e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new FileDataSourceException(null, null, 2008);
                }
                this.f18788h = true;
                f(dataSpec);
                return this.g;
            } catch (IOException e2) {
                throw new FileDataSourceException(e2, 2000);
            }
        } catch (FileNotFoundException e3) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e3, (Util.f18979a < 21 || !Api21.b(e3.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbQ.append(fragment);
            throw new FileDataSourceException(sbQ.toString(), e3, 1004);
        } catch (SecurityException e4) {
            throw new FileDataSourceException(e4, 2006);
        } catch (RuntimeException e5) {
            throw new FileDataSourceException(e5, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f18787e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f18787e = null;
                if (this.f18788h) {
                    this.f18788h = false;
                    d();
                }
            } catch (IOException e2) {
                throw new FileDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.f18787e = null;
            if (this.f18788h) {
                this.f18788h = false;
                d();
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws FileDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f18787e;
            int i4 = Util.f18979a;
            int i5 = randomAccessFile.read(bArr, i2, (int) Math.min(j, i3));
            if (i5 > 0) {
                this.g -= (long) i5;
                c(i5);
            }
            return i5;
        } catch (IOException e2) {
            throw new FileDataSourceException(e2, 2000);
        }
    }
}
