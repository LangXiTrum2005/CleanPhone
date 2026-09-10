package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5107yX extends AbstractC3763j9 {
    public final Resources e;
    public final String f;
    public Uri g;
    public AssetFileDescriptor h;
    public FileInputStream i;
    public long j;
    public boolean k;

    public C5107yX(Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
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
            r5.g = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.i     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.i = r0
            android.content.res.AssetFileDescriptor r3 = r5.h     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.h = r0
            boolean r0 = r5.k
            if (r0 == 0) goto L2b
            r5.k = r2
            r5.h()
        L2b:
            return
        L2c:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xX r4 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xX     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.h = r0
            boolean r0 = r5.k
            if (r0 == 0) goto L3d
            r5.k = r2
            r5.h()
        L3d:
            throw r1
        L3e:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xX r4 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xX     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.i = r0
            android.content.res.AssetFileDescriptor r4 = r5.h     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.h = r0
            boolean r0 = r5.k
            if (r0 == 0) goto L5d
            r5.k = r2
            r5.h()
        L5d:
            throw r3
        L5e:
            gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xX r4 = new gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xX     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.h = r0
            boolean r0 = r5.k
            if (r0 == 0) goto L6f
            r5.k = r2
            r5.h()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5107yX.close():void");
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) throws C5019xX {
        int identifier;
        Uri uri = c4868vl.f5150a;
        this.g = uri;
        boolean zEquals = TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme());
        Resources resources = this.e;
        if (zEquals) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new C5019xX("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                String lastPathSegment2 = uri.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uri.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uri.getScheme())) {
                throw new C5019xX("URI must either use scheme rawresource or android.resource", null, 1004);
            }
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            identifier = resources.getIdentifier(DM.m(new StringBuilder(), TextUtils.isEmpty(host) ? "" : DM.h(host, ":"), path), "raw", this.f);
            if (identifier == 0) {
                throw new C5019xX("Resource not found.", null, 2005);
            }
        }
        i();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C5019xX("Resource is compressed: " + uri, null, 2000);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.i = fileInputStream;
            long j = c4868vl.f;
            try {
                if (length != -1 && j > length) {
                    throw new C5019xX(null, null, 2008);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new C5019xX(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.j = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.j = size;
                        if (size < 0) {
                            throw new C5019xX(null, null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.j = j2;
                    if (j2 < 0) {
                        throw new C4604sl(2008);
                    }
                }
                long j3 = c4868vl.g;
                if (j3 != -1) {
                    long j4 = this.j;
                    this.j = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.k = true;
                j(c4868vl);
                return j3 != -1 ? j3 : this.j;
            } catch (C5019xX e) {
                throw e;
            } catch (IOException e2) {
                throw new C5019xX(null, e2, 2000);
            }
        } catch (Resources.NotFoundException e3) {
            throw new C5019xX(null, e3, 2005);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.g;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws C5019xX {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C5019xX(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.i;
        int i3 = Ug0.f3833a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new C5019xX("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - ((long) i4);
        }
        g(i4);
        return i4;
    }
}
