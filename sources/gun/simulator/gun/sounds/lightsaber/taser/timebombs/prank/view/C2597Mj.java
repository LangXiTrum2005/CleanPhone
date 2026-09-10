package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2597Mj extends AbstractC3763j9 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public C2597Mj(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
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
            java.io.FileInputStream r3 = r5.h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.h = r0
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
            r5.h()
        L2b:
            return
        L2c:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj r4 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L3d
            r5.j = r2
            r5.h()
        L3d:
            throw r1
        L3e:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj r4 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.h = r0
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
            r5.h()
        L5d:
            throw r3
        L5e:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj r4 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lj     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.g = r0
            boolean r0 = r5.j
            if (r0 == 0) goto L6f
            r5.j = r2
            r5.h()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2597Mj.close():void");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) throws C2572Lj {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = c4868vl.f5150a;
            this.f = uri;
            i();
            boolean zEquals = "content".equals(c4868vl.f5150a.getScheme());
            ContentResolver contentResolver = this.e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C2572Lj(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.h = fileInputStream;
            long j = c4868vl.f;
            if (length != -1 && j > length) {
                throw new C2572Lj(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new C2572Lj(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.i = jPosition;
                    if (jPosition < 0) {
                        throw new C2572Lj(null, 2008);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.i = j2;
                if (j2 < 0) {
                    throw new C2572Lj(null, 2008);
                }
            }
            long j3 = c4868vl.g;
            if (j3 != -1) {
                long j4 = this.i;
                this.i = j4 == -1 ? j3 : Math.min(j4, j3);
            }
            this.j = true;
            j(c4868vl);
            return j3 != -1 ? j3 : this.i;
        } catch (C2572Lj e) {
            throw e;
        } catch (IOException e2) {
            throw new C2572Lj(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.f;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws C2572Lj {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C2572Lj(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = Ug0.f3833a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - ((long) i4);
        }
        g(i4);
        return i4;
    }
}
