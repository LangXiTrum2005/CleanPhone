package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.util.Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f5728e;
    public Uri f;
    public AssetFileDescriptor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f5729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5730i;
    public boolean j;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f5728e = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) throws ContentDataSourceException {
        int i2;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = dataSpec.f5736a.normalizeScheme();
                this.f = uriNormalizeScheme;
                e(dataSpec);
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f5728e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i2 = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e2) {
                        e = e2;
                        if (e instanceof FileNotFoundException) {
                            i2 = 2005;
                        }
                        throw new ContentDataSourceException(e, i2);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f5729h = fileInputStream;
                long j = dataSpec.f5739e;
                if (length != -1 && j > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f5730i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f5730i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f5730i = j2;
                    if (j2 < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                long j3 = dataSpec.f;
                if (j3 != -1) {
                    long j4 = this.f5730i;
                    this.f5730i = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.j = true;
                f(dataSpec);
                return j3 != -1 ? j3 : this.f5730i;
            } catch (IOException e3) {
                e = e3;
                i2 = 2000;
            }
        } catch (ContentDataSourceException e4) {
            throw e4;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f5729h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f5729h = r0
            android.content.res.AssetFileDescriptor r3 = r5.g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L2b
            r5.j = r2
            r5.d()
        L2b:
            return
        L2c:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L3d
            r5.j = r2
            r5.d()
        L3d:
            throw r1
        L3e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f5729h = r0
            android.content.res.AssetFileDescriptor r4 = r5.g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L5d
            r5.j = r2
            r5.d()
        L5d:
            throw r3
        L5e:
            androidx.media3.datasource.ContentDataSource$ContentDataSourceException r4 = new androidx.media3.datasource.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L6f
            r5.j = r2
            r5.d()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.ContentDataSource.close():void");
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws ContentDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j = this.f5730i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i3 = (int) Math.min(j, i3);
                } catch (IOException e2) {
                    throw new ContentDataSourceException(e2, 2000);
                }
            }
            FileInputStream fileInputStream = this.f5729h;
            int i4 = Util.f5683a;
            int i5 = fileInputStream.read(bArr, i2, i3);
            if (i5 != -1) {
                long j2 = this.f5730i;
                if (j2 != -1) {
                    this.f5730i = j2 - ((long) i5);
                }
                c(i5);
                return i5;
            }
        }
        return -1;
    }
}
