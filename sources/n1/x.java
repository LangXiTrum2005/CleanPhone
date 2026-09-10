package n1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.F9;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f46410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k f46411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f46412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f46413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f46414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46415j;

    public x(Context context) {
        super(false);
        this.f46410e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // n1.h
    public final long C(k kVar) throws w {
        Resources resourcesForApplication;
        int identifier;
        int i10;
        Resources resources;
        this.f46411f = kVar;
        e();
        Uri uri = kVar.f46369a;
        long j10 = kVar.f46374f;
        long j11 = kVar.f46373e;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme());
        Context context = this.f46410e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new w(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i10 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new w(1004, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new w(1004, null, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.");
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
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new w(F9.a.f26068d, e10, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new w(1004, null, "Resource identifier must be an integer.");
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(wi.d.i(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new w(F9.a.f26068d, null, "Resource not found.");
                }
            }
            i10 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i10);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new w(2000, null, "Resource is compressed: " + uriNormalizeScheme);
            }
            this.f46412g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f46412g.getFileDescriptor());
            this.f46413h = fileInputStream;
            try {
                if (length != -1 && j11 > length) {
                    throw new w(2008, null, null);
                }
                long startOffset = this.f46412g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new w(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f46414i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f46414i = size;
                        if (size < 0) {
                            throw new w(2008, null, null);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f46414i = j12;
                    if (j12 < 0) {
                        throw new i(2008);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f46414i;
                    this.f46414i = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f46415j = true;
                g(kVar);
                return j10 != -1 ? j10 : this.f46414i;
            } catch (w e11) {
                throw e11;
            } catch (IOException e12) {
                throw new w(2000, e12, null);
            }
        } catch (Resources.NotFoundException e13) {
            throw new w(F9.a.f26068d, e13, null);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // n1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f46411f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f46413h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f46413h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f46412g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f46412g = r0
            boolean r0 = r5.f46415j
            if (r0 == 0) goto L2b
            r5.f46415j = r2
            r5.d()
        L2b:
            return
        L2c:
            n1.w r4 = new n1.w     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3, r0)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f46412g = r0
            boolean r0 = r5.f46415j
            if (r0 == 0) goto L3d
            r5.f46415j = r2
            r5.d()
        L3d:
            throw r1
        L3e:
            n1.w r4 = new n1.w     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3, r0)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f46413h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f46412g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f46412g = r0
            boolean r0 = r5.f46415j
            if (r0 == 0) goto L5d
            r5.f46415j = r2
            r5.d()
        L5d:
            throw r3
        L5e:
            n1.w r4 = new n1.w     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3, r0)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f46412g = r0
            boolean r0 = r5.f46415j
            if (r0 == 0) goto L6f
            r5.f46415j = r2
            r5.d()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.x.close():void");
    }

    @Override // n1.h
    public final Uri getUri() {
        k kVar = this.f46411f;
        if (kVar != null) {
            return kVar.f46369a;
        }
        return null;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws w {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f46414i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new w(2000, e10, null);
                }
            }
            FileInputStream fileInputStream = this.f46413h;
            String str = l1.y.f44830a;
            int i12 = fileInputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                long j11 = this.f46414i;
                if (j11 != -1) {
                    this.f46414i = j11 - ((long) i12);
                }
                b(i12);
                return i12;
            }
            if (this.f46414i != -1) {
                throw new w(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }
}
