package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.util.Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class ContentDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f18735e;
    public Uri f;
    public AssetFileDescriptor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f18736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18737i;
    public boolean j;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f18735e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) throws ContentDataSourceException {
        int i2;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = dataSpec.f18742a;
                this.f = uri;
                e(dataSpec);
                boolean zEquals = "content".equals(dataSpec.f18742a.getScheme());
                ContentResolver contentResolver = this.f18735e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i2 = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri), 2000);
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
                this.f18736h = fileInputStream;
                long j = dataSpec.f;
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
                        this.f18737i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f18737i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f18737i = j2;
                    if (j2 < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                long j3 = dataSpec.g;
                if (j3 != -1) {
                    long j4 = this.f18737i;
                    this.f18737i = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.j = true;
                f(dataSpec);
                return j3 != -1 ? j3 : this.f18737i;
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
    @Override // com.google.android.exoplayer2.upstream.DataSource
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
            java.io.FileInputStream r3 = r5.f18736h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f18736h = r0
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
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L1c
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
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f18736h = r0
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
            com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException r4 = new com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException     // Catch: java.lang.Throwable -> L4e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.ContentDataSource.close():void");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws ContentDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j = this.f18737i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i3 = (int) Math.min(j, i3);
                } catch (IOException e2) {
                    throw new ContentDataSourceException(e2, 2000);
                }
            }
            FileInputStream fileInputStream = this.f18736h;
            int i4 = Util.f18979a;
            int i5 = fileInputStream.read(bArr, i2, i3);
            if (i5 != -1) {
                long j2 = this.f18737i;
                if (j2 != -1) {
                    this.f18737i = j2 - ((long) i5);
                }
                c(i5);
                return i5;
            }
        }
        return -1;
    }
}
