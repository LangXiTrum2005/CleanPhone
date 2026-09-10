package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03520o extends AbstractC04695e {
    public static byte[] A04;
    public static String[] A05 = {"zq8MhPDvEFWi6bbSuU04Ys6u7K6w1V28", "kKM54d1p9EzrYvf0sjzdnQmELqHD8xkg", "20heykQgb97NKPnaJTAAZkudKcyqi4W4", "a8qwO2VROPEtdQoyrgn7esU6CnMuvqlK", "5O1WH", "DrQxGCTXw4yPZeikI8NlQTNhiELd0lEV", "6JQ5RW6FmfxdvDpkV4jJlFxXb5y8PD2X", "q4so9pf3WZg0WNeSwryZWYZ4LAo0CIow"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{124, 115, 118, 127, 73, 104, 121, 72, 127, 123, 126, 85, 106, 127, 116, 125, 114, 119, 126, 72, 105, 120, 73, 126, 122, 127, 73, 90, 93, 110, 38, 33, 58, 115, 59, 50, 32, 115, 34, 38, 54, 33, 42, 115, 50, 61, 55, 124, 60, 33, 115, 53, 33, 50, 52, 62, 54, 61, 39, 127, 115, 36, 59, 58, 48, 59, 115, 50, 33, 54, 115, 61, 60, 39, 115, 32, 38, 35, 35, 60, 33, 39, 54, 55, 125, 115, 23, 58, 55, 115, 42, 60, 38, 115, 48, 50, 63, 63, 115, 6, 33, 58, 125, 35, 50, 33, 32, 54, 123, 122, 115, 60, 61, 115, 50, 115, 32, 39, 33, 58, 61, 52, 115, 48, 60, 61, 39, 50, 58, 61, 58, 61, 52, 115, 116, 108, 116, 115, 60, 33, 115, 116, 112, 116, 108, 115, 6, 32, 54, 115, 6, 33, 58, 125, 53, 33, 60, 62, 21, 58, 63, 54, 123, 61, 54, 36, 115, 21, 58, 63, 54, 123, 35, 50, 39, 59, 122, 122, 115, 39, 60, 115, 50, 37, 60, 58, 55, 115, 39, 59, 58, 32, 125, 115, 35, 50, 39, 59, 110, 118, 32, 127, 34, 38, 54, 33, 42, 110, 118, 32, 127, 53, 33, 50, 52, 62, 54, 61, 39, 110, 118, 32};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.Q7
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AFq(C1447dj c1447dj) throws C0965Po {
        AbstractC1591g5.A02(A01(0, 15, 38));
        Uri uri = c1447dj.A06;
        this.A01 = uri;
        A0G(c1447dj);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(c1447dj.A04);
                this.A00 = c1447dj.A03 == -1 ? this.A02.length() - c1447dj.A04 : c1447dj.A03;
                AbstractC1591g5.A00();
                if (this.A00 < 0) {
                    throw new C0965Po(null, null, 2008);
                }
                this.A03 = true;
                A0H(c1447dj);
                return this.A00;
            } catch (IOException e) {
                throw new C0965Po(e, 2000);
            }
        } catch (Throwable th) {
            AbstractC1591g5.A00();
            throw th;
        }
    }

    static {
        A02();
    }

    public C03520o() {
        super(false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    public static RandomAccessFile A00(Uri uri) throws C0965Po {
        int i = 2006;
        try {
            return new RandomAccessFile((String) AbstractC1517es.A01(uri.getPath()), A01(29, 1, 32));
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (AbstractC1600gE.A02 < 21) {
                    i = 2005;
                } else {
                    boolean zA00 = C1453dq.A00(e.getCause());
                    if (A05[2].charAt(28) != 'i') {
                        throw new RuntimeException();
                    }
                    A05[4] = "RDfor";
                    if (!zA00) {
                        i = 2005;
                    }
                }
                throw new C0965Po(e, i);
            }
            throw new C0965Po(String.format(A01(30, 192, 111), uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new C0965Po(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C0965Po(e3, 2000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Q7
    public final Uri A9F() {
        return this.A01;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003e */
    @Override // com.facebook.ads.redexgen.core.Q7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.facebook.ads.redexgen.core.C0965Po {
        /*
            r5 = this;
            r4 = 0
            r5.A01 = r4
            r3 = 0
            java.io.RandomAccessFile r0 = r5.A02     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L3e
            if (r0 == 0) goto Ld
            java.io.RandomAccessFile r0 = r5.A02     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L3e
            r0.close()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L3e
        Ld:
            r5.A02 = r4
            boolean r0 = r5.A03
            if (r0 == 0) goto L2e
            r5.A03 = r3
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C03520o.A05
            r0 = 1
            r1 = r1[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            r0 = 65
            if (r1 == r0) goto L2f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C03520o.A05
            java.lang.String r1 = "uz9XzfKcDIZebiI3wjwG5MELJoWkELq0"
            r0 = 7
            r2[r0] = r1
            r5.A0E()
        L2e:
            return
        L2f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L35:
            r2 = move-exception
            r1 = 2000(0x7d0, float:2.803E-42)
            com.facebook.ads.redexgen.X.Po r0 = new com.facebook.ads.redexgen.X.Po     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        L3e:
            r1 = move-exception
            r5.A02 = r4
            boolean r0 = r5.A03
            if (r0 == 0) goto L4a
            r5.A03 = r3
            r5.A0E()
        L4a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C03520o.close():void");
    }

    @Override // com.facebook.ads.redexgen.core.O9
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i, int i2) throws C0965Po {
        if (i2 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                AbstractC1591g5.A02(A01(15, 14, 39));
                int i3 = ((RandomAccessFile) AbstractC1600gE.A0f(this.A02)).read(bArr, i, (int) Math.min(this.A00, i2));
                AbstractC1591g5.A00();
                if (i3 > 0) {
                    this.A00 -= (long) i3;
                    A0F(i3);
                }
                return i3;
            } catch (IOException e) {
                throw new C0965Po(e, 2000);
            }
        } catch (Throwable th) {
            AbstractC1591g5.A00();
            throw th;
        }
    }
}
