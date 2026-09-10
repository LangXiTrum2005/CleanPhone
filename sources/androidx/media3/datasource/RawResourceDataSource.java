package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RawResourceDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5778e;
    public DataSpec f;
    public AssetFileDescriptor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f5779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5780i;
    public boolean j;

    public static class RawResourceDataSourceException extends DataSourceException {
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f5778e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i2) {
        return Uri.parse("rawresource:///" + i2);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i2;
        Resources resources;
        this.f = dataSpec;
        e(dataSpec);
        Uri uriNormalizeScheme = dataSpec.f5736a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f5778e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i2 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e2, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(android.support.v4.media.a.D(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i2 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i2);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException(android.support.v4.media.a.k(uriNormalizeScheme, "Resource is compressed: "), null, 2000);
            }
            this.g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
            this.f5779h = fileInputStream;
            long j = dataSpec.f5739e;
            try {
                if (length != -1 && j > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f5780i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f5780i = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f5780i = j2;
                    if (j2 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j3 = dataSpec.f;
                if (j3 != -1) {
                    long j4 = this.f5780i;
                    this.f5780i = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.j = true;
                f(dataSpec);
                return j3 != -1 ? j3 : this.f5780i;
            } catch (RawResourceDataSourceException e3) {
                throw e3;
            } catch (IOException e4) {
                throw new RawResourceDataSourceException(null, e4, 2000);
            }
        } catch (Resources.NotFoundException e5) {
            throw new RawResourceDataSourceException(null, e5, 2005);
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
            java.io.FileInputStream r3 = r5.f5779h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f5779h = r0
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
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
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
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f5779h = r0
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
            androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException r4 = new androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.RawResourceDataSource.close():void");
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.f;
        if (dataSpec != null) {
            return dataSpec.f5736a;
        }
        return null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws RawResourceDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        long j = this.f5780i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i3 = (int) Math.min(j, i3);
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
            FileInputStream fileInputStream = this.f5779h;
            int i4 = Util.f5683a;
            int i5 = fileInputStream.read(bArr, i2, i3);
            if (i5 != -1) {
                long j2 = this.f5780i;
                if (j2 != -1) {
                    this.f5780i = j2 - ((long) i5);
                }
                c(i5);
                return i5;
            }
            if (this.f5780i != -1) {
                throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
