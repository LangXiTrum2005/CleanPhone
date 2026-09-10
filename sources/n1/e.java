package n1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.ironsource.F9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ContentResolver f46352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f46353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AssetFileDescriptor f46354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FileInputStream f46355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f46356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f46357j;

    public e(Context context) {
        super(false);
        this.f46352e = context.getContentResolver();
    }

    @Override // n1.h
    public final long C(k kVar) throws d {
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = kVar.f46369a;
                long j10 = kVar.f46374f;
                long j11 = kVar.f46373e;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f46353f = uriNormalizeScheme;
                e();
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f46352e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f46354g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i10 = 2000;
                    try {
                        throw new d(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e10) {
                        e = e10;
                        throw new d(e instanceof FileNotFoundException ? F9.a.f26068d : i10, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f46355h = fileInputStream;
                if (length != -1 && j11 > length) {
                    throw new d(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j11) - startOffset;
                if (jSkip != j11) {
                    throw new d(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f46356i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f46356i = jPosition;
                        if (jPosition < 0) {
                            throw new d(2008, null);
                        }
                    }
                } else {
                    long j12 = length - jSkip;
                    this.f46356i = j12;
                    if (j12 < 0) {
                        throw new d(2008, null);
                    }
                }
                if (j10 != -1) {
                    long j13 = this.f46356i;
                    this.f46356i = j13 == -1 ? j10 : Math.min(j13, j10);
                }
                this.f46357j = true;
                g(kVar);
                return j10 != -1 ? j10 : this.f46356i;
            } catch (d e11) {
                throw e11;
            }
        } catch (IOException e12) {
            e = e12;
            i10 = 2000;
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
            r5.f46353f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f46355h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.f46355h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f46354g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.f46354g = r0
            boolean r0 = r5.f46357j
            if (r0 == 0) goto L2b
            r5.f46357j = r2
            r5.d()
        L2b:
            return
        L2c:
            n1.d r4 = new n1.d     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f46354g = r0
            boolean r0 = r5.f46357j
            if (r0 == 0) goto L3d
            r5.f46357j = r2
            r5.d()
        L3d:
            throw r1
        L3e:
            n1.d r4 = new n1.d     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f46355h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f46354g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.f46354g = r0
            boolean r0 = r5.f46357j
            if (r0 == 0) goto L5d
            r5.f46357j = r2
            r5.d()
        L5d:
            throw r3
        L5e:
            n1.d r4 = new n1.d     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f46354g = r0
            boolean r0 = r5.f46357j
            if (r0 == 0) goto L6f
            r5.f46357j = r2
            r5.d()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.e.close():void");
    }

    @Override // n1.h
    public final Uri getUri() {
        return this.f46353f;
    }

    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws d {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f46356i;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new d(2000, e10);
                }
            }
            FileInputStream fileInputStream = this.f46355h;
            String str = l1.y.f44830a;
            int i12 = fileInputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                long j11 = this.f46356i;
                if (j11 != -1) {
                    this.f46356i = j11 - ((long) i12);
                }
                b(i12);
                return i12;
            }
        }
        return -1;
    }
}
