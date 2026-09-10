package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.badlogic.gdx.Input;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Deprecated
public final class C0970Pt implements InterfaceC1437dZ {
    public final Context A00;
    public final InterfaceC1437dZ A01;
    public final InterfaceC1486eN A02;

    public C0970Pt(Context context, InterfaceC1486eN interfaceC1486eN, InterfaceC1437dZ interfaceC1437dZ) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC1486eN;
        this.A01 = interfaceC1437dZ;
    }

    public C0970Pt(Context context, String str, InterfaceC1486eN interfaceC1486eN) {
        this(context, interfaceC1486eN, new C5K().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.5L] */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1437dZ
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C5L A58() {
        final Context context = this.A00;
        final Q7 q7A58 = this.A01.A58();
        ?? r1 = new Q7(context, q7A58) { // from class: com.facebook.ads.redexgen.X.5L
            public static byte[] A0B;
            public static String[] A0C = {"Qm6an9QvyBEMhzrPoVeL4badJ2ebPr5d", "PKapHge5bLRSHugJBbGktswhmInqAkt4", "0PDVTUJweTUURsmFGPWXgsSdS05i8Khy", "qYoCqzZfrvnAqG7Xn0sV0", "Y2tNNB146JSrElSs", "hFFlUJic6RPbUc1X", "8DkdVmiF3xPnGCeUOxRyR8uKQmKhqi27", "Viys6"};
            public Q7 A00;
            public Q7 A01;
            public Q7 A02;
            public Q7 A03;
            public Q7 A04;
            public Q7 A05;
            public Q7 A06;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public Q7 A07;
            public final Q7 A08;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final Context A09;

            @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
            public final List<InterfaceC1486eN> A0A = new ArrayList();

            public static String A07(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 50);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A08() {
                A0B = new byte[]{-54, -4, 9, -1, cw.k, 10, 4, -1, -6, -4, cw.l, cw.l, 0, cw.m, -54, 119, -86, -86, -101, -93, -90, -86, -97, -92, -99, 86, -86, -91, 86, -90, -94, -105, -81, 86, -120, -118, -125, -122, 86, -87, -86, -88, -101, -105, -93, 86, -83, -97, -86, -98, -91, -85, -86, 86, -102, -101, -90, -101, -92, -102, -97, -92, -99, 86, -91, -92, 86, -86, -98, -101, 86, -120, -118, -125, -122, 86, -101, -82, -86, -101, -92, -87, -97, -91, -92, -39, -6, -5, -10, 10, 1, 9, -39, -10, 9, -10, -24, 4, 10, 7, -8, -6, 127, -84, -84, -87, -84, 90, -93, -88, -83, -82, -101, -88, -82, -93, -101, -82, -93, -88, -95, 90, -116, -114, -121, -118, 90, -97, -78, -82, -97, -88, -83, -93, -87, -88, 18, 31, 21, 35, 32, 26, 21, -33, 35, 22, 36, 32, 38, 35, 20, 22, -61, -43, -43, -57, -42, 11, 23, 21, -42, cw.m, 23, 23, cw.m, 20, cw.k, -42, 9, 22, 12, 26, 23, 17, 12, -42, cw.k, 32, 23, 24, 20, 9, 33, cw.k, 26, -38, -42, cw.k, 32, 28, -42, 26, 28, 21, 24, -42, -6, 28, 21, 24, -20, 9, 28, 9, -5, 23, 29, 26, 11, cw.k, -37, -25, -26, -20, -35, -26, -20, -106, -109, -90, -109, -23, -40, -18, -23, -36, -22, -26, -20, -23, -38, -36, 6, 8, 1, 4, -45, -62, -50};
            }

            static {
                A08();
            }

            {
                this.A09 = context.getApplicationContext();
                this.A08 = (Q7) AbstractC1517es.A01(q7A58);
            }

            private Q7 A00() {
                if (this.A00 == null) {
                    this.A00 = new AbstractC04695e(this.A09) { // from class: com.facebook.ads.redexgen.X.0s
                        public static byte[] A05;
                        public static String[] A06 = {"ijZK9S4", "Y9B02Wdt7Xj5Lewa5ltDFgXj0DYuYSo3", "r3i", "0LbTa2BcsJIqO6SvMMpCA1Ze40sdAelD", "FJ1BB7SRQ0ipPesOCzOqHiL0rS5UuYlV", "tio", "YA4qEPbjEwWaPS8weADkIBBirmo6XITA", "36ZDajpfulynYBV6ANx3GTbLIY4QbGLR"};
                        public long A00;
                        public Uri A01;
                        public InputStream A02;
                        public boolean A03;
                        public final AssetManager A04;

                        public static String A00(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
                            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 125);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A05 = new byte[]{11, -20, 30, 43, 33, 47, 44, 38, 33, 28, 30, 48, 48, 34, 49, -20};
                        }

                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final long AFq(C1447dj c1447dj) throws QA {
                            try {
                                this.A01 = c1447dj.A06;
                                String strSubstring = (String) AbstractC1517es.A01(this.A01.getPath());
                                if (strSubstring.startsWith(A00(1, 15, 64))) {
                                    strSubstring = strSubstring.substring(15);
                                } else if (strSubstring.startsWith(A00(0, 1, 95))) {
                                    strSubstring = strSubstring.substring(1);
                                }
                                A0G(c1447dj);
                                this.A02 = this.A04.open(strSubstring, 1);
                                if (this.A02.skip(c1447dj.A04) < c1447dj.A04) {
                                    throw new QA(null, 2008);
                                }
                                if (c1447dj.A03 != -1) {
                                    this.A00 = c1447dj.A03;
                                } else {
                                    this.A00 = this.A02.available();
                                    long j = this.A00;
                                    if (A06[6].charAt(17) != 'A') {
                                        throw new RuntimeException();
                                    }
                                    A06[0] = "Tv7Yrv9";
                                    if (j == 2147483647L) {
                                        this.A00 = -1L;
                                    }
                                }
                                this.A03 = true;
                                A0H(c1447dj);
                                return this.A00;
                            } catch (QA e) {
                                throw e;
                            } catch (IOException e2) {
                                throw new QA(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
                            }
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A04 = context.getAssets();
                        }

                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final Uri A9F() {
                            return this.A01;
                        }

                        /* JADX WARN: Bottom block not found for handler: all -> 0x0022 */
                        @Override // com.facebook.ads.redexgen.core.Q7
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void close() throws com.facebook.ads.redexgen.core.QA {
                            /*
                                r6 = this;
                                r5 = 0
                                r6.A01 = r5
                                r4 = 0
                                java.io.InputStream r0 = r6.A02     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
                                if (r0 == 0) goto Ld
                                java.io.InputStream r0 = r6.A02     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
                                r0.close()     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
                            Ld:
                                r6.A02 = r5
                                boolean r0 = r6.A03
                                if (r0 == 0) goto L18
                                r6.A03 = r4
                                r6.A0E()
                            L18:
                                return
                            L19:
                                r2 = move-exception
                                r1 = 2000(0x7d0, float:2.803E-42)
                                com.facebook.ads.redexgen.X.QA r0 = new com.facebook.ads.redexgen.X.QA     // Catch: java.lang.Throwable -> L22
                                r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L22
                                throw r0     // Catch: java.lang.Throwable -> L22
                            L22:
                                r3 = move-exception
                                r6.A02 = r5
                                boolean r0 = r6.A03
                                if (r0 == 0) goto L47
                                r6.A03 = r4
                                java.lang.String[] r1 = com.facebook.ads.redexgen.core.C03560s.A06
                                r0 = 0
                                r0 = r1[r0]
                                int r1 = r0.length()
                                r0 = 7
                                if (r1 == r0) goto L3d
                                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                                r0.<init>()
                                throw r0
                            L3d:
                                java.lang.String[] r2 = com.facebook.ads.redexgen.core.C03560s.A06
                                java.lang.String r1 = "SnSHy8yPr0lafSe2PAeGXslDxg5fpZi8"
                                r0 = 6
                                r2[r0] = r1
                                r6.A0E()
                            L47:
                                throw r3
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C03560s.close():void");
                        }

                        @Override // com.facebook.ads.redexgen.core.O9
                        public final int read(byte[] bArr, int i, int i2) throws IOException {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i2 = (int) Math.min(this.A00, i2);
                                }
                                int i3 = ((InputStream) AbstractC1600gE.A0f(this.A02)).read(bArr, i, i2);
                                if (i3 == -1) {
                                    return -1;
                                }
                                if (this.A00 != -1) {
                                    this.A00 -= (long) i3;
                                }
                                A0F(i3);
                                return i3;
                            } catch (IOException e) {
                                throw new QA(e, 2000);
                            }
                        }
                    };
                    A09(this.A00);
                }
                return this.A00;
            }

            private Q7 A01() {
                if (this.A01 == null) {
                    this.A01 = new AbstractC04695e(this.A09) { // from class: com.facebook.ads.redexgen.X.0r
                        public static byte[] A06;
                        public static String[] A07 = {"67bv5djIMF", "BxCohHPRss6mxLNFcQW", "i5wsGlZU6", "vbzLaBVe31BtmOnbzbtnWTTKBElKFQb1", "WdO87ICrhr", "TRDwQanC7FQciUC0ONH", "a94z1ZK8AyeWWjQh2i7I6Bk8umQIl1tM", "RdYzWmRrTAFimrQgIQPfnTbGm0Cxr37W"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public FileInputStream A03;
                        public boolean A04;
                        public final ContentResolver A05;

                        public static String A00(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
                            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 7);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A06 = new byte[]{27, 30, 27, 127, 83, 73, 80, 88, 28, 82, 83, 72, 28, 83, 76, 89, 82, 28, 90, 85, 80, 89, 28, 88, 89, 79, 95, 78, 85, 76, 72, 83, 78, 28, 90, 83, 78, 6, 28, 10, 5, cw.m, 25, 4, 2, cw.m, 69, 27, 25, 4, 29, 2, cw.m, cw.l, 25, 69, cw.l, 19, 31, 25, 10, 69, 42, 40, 40, 46, 59, 63, 52, 36, 57, 34, 44, 34, 37, 42, 39, 52, 38, 46, 47, 34, 42, 52, 45, 36, 57, 38, 42, 63, 82, 94, 95, 69, 84, 95, 69, 6};
                        }

                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 15
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
                        	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
                        	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                        	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
                        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                         */
                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final long AFq(C1447dj c1447dj) throws Q8 {
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
                            try {
                                try {
                                    Uri uri = c1447dj.A06;
                                    this.A02 = uri;
                                    A0G(c1447dj);
                                    if (A00(90, 7, 54).equals(c1447dj.A06.getScheme())) {
                                        Bundle bundle = new Bundle();
                                        bundle.putBoolean(A00(39, 51, 108), true);
                                        assetFileDescriptorOpenAssetFileDescriptor = this.A05.openTypedAssetFileDescriptor(uri, A00(0, 3, 54), bundle);
                                    } else {
                                        assetFileDescriptorOpenAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, A00(97, 1, 115));
                                    }
                                    this.A01 = assetFileDescriptorOpenAssetFileDescriptor;
                                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                                        try {
                                            throw new Q8(new IOException(A00(3, 36, 59) + uri), 2000);
                                        } catch (IOException e) {
                                            e = e;
                                            throw new Q8(e, e instanceof FileNotFoundException ? 2005 : 2000);
                                        }
                                    }
                                    long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                                    FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                                    this.A03 = fileInputStream;
                                    if (length != -1 && c1447dj.A04 > length) {
                                        throw new Q8(null, 2008);
                                    }
                                    long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                                    long jSkip = fileInputStream.skip(c1447dj.A04 + startOffset) - startOffset;
                                    if (jSkip != c1447dj.A04) {
                                        throw new Q8(null, 2008);
                                    }
                                    if (length == -1) {
                                        FileChannel channel = fileInputStream.getChannel();
                                        long size = channel.size();
                                        if (size == 0) {
                                            this.A00 = -1L;
                                        } else {
                                            this.A00 = size - channel.position();
                                            if (this.A00 < 0) {
                                                throw new Q8(null, 2008);
                                            }
                                        }
                                    } else {
                                        this.A00 = length - jSkip;
                                        if (this.A00 < 0) {
                                            throw new Q8(null, 2008);
                                        }
                                    }
                                    if (c1447dj.A03 != -1) {
                                        this.A00 = this.A00 == -1 ? c1447dj.A03 : Math.min(this.A00, c1447dj.A03);
                                    }
                                    this.A04 = true;
                                    A0H(c1447dj);
                                    return c1447dj.A03 != -1 ? c1447dj.A03 : this.A00;
                                } catch (Q8 e2) {
                                    throw e2;
                                }
                            } catch (IOException e3) {
                                e = e3;
                            }
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = context.getContentResolver();
                        }

                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final Uri A9F() {
                            return this.A02;
                        }

                        /* JADX WARN: Bottom block not found for handler: all -> 0x002d */
                        @Override // com.facebook.ads.redexgen.core.Q7
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void close() throws com.facebook.ads.redexgen.core.Q8 {
                            /*
                                r6 = this;
                                r2 = 0
                                r6.A02 = r2
                                r5 = 2000(0x7d0, float:2.803E-42)
                                r3 = 0
                                java.io.FileInputStream r0 = r6.A03     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
                                if (r0 == 0) goto Lf
                                java.io.FileInputStream r0 = r6.A03     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
                                r0.close()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
                            Lf:
                                r6.A03 = r2
                                android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                                if (r0 == 0) goto L1a
                                android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                                r0.close()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                            L1a:
                                r6.A01 = r2
                                boolean r0 = r6.A04
                                if (r0 == 0) goto L25
                                r6.A04 = r3
                                r6.A0E()
                            L25:
                                return
                            L26:
                                r1 = move-exception
                                com.facebook.ads.redexgen.X.Q8 r0 = new com.facebook.ads.redexgen.X.Q8     // Catch: java.lang.Throwable -> L2d
                                r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L2d
                                throw r0     // Catch: java.lang.Throwable -> L2d
                            L2d:
                                r1 = move-exception
                                r6.A01 = r2
                                boolean r0 = r6.A04
                                if (r0 == 0) goto L39
                                r6.A04 = r3
                                r6.A0E()
                            L39:
                                throw r1
                            L3a:
                                r1 = move-exception
                                com.facebook.ads.redexgen.X.Q8 r0 = new com.facebook.ads.redexgen.X.Q8     // Catch: java.lang.Throwable -> L41
                                r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L41
                                throw r0     // Catch: java.lang.Throwable -> L41
                            L41:
                                r4 = move-exception
                                r6.A03 = r2
                                android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L81
                                if (r0 == 0) goto L4d
                                android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L81
                                r0.close()     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L81
                            L4d:
                                r6.A01 = r2
                                java.lang.String[] r1 = com.facebook.ads.redexgen.core.C03550r.A07
                                r0 = 3
                                r1 = r1[r0]
                                r0 = 8
                                char r1 = r1.charAt(r0)
                                r0 = 51
                                if (r1 == r0) goto L64
                                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                                r0.<init>()
                                throw r0
                            L64:
                                java.lang.String[] r2 = com.facebook.ads.redexgen.core.C03550r.A07
                                java.lang.String r1 = "1xbzCf7XKXuGDZ9FSbV"
                                r0 = 1
                                r2[r0] = r1
                                java.lang.String r1 = "KFXJYdfoiPhDSwFgNDN"
                                r0 = 5
                                r2[r0] = r1
                                boolean r0 = r6.A04
                                if (r0 == 0) goto L79
                                r6.A04 = r3
                                r6.A0E()
                            L79:
                                throw r4
                            L7a:
                                r1 = move-exception
                                com.facebook.ads.redexgen.X.Q8 r0 = new com.facebook.ads.redexgen.X.Q8     // Catch: java.lang.Throwable -> L81
                                r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L81
                                throw r0     // Catch: java.lang.Throwable -> L81
                            L81:
                                r1 = move-exception
                                r6.A01 = r2
                                boolean r0 = r6.A04
                                if (r0 == 0) goto L8d
                                r6.A04 = r3
                                r6.A0E()
                            L8d:
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C03550r.close():void");
                        }

                        @Override // com.facebook.ads.redexgen.core.O9
                        public final int read(byte[] bArr, int i, int i2) throws IOException {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i2 = (int) Math.min(this.A00, i2);
                                }
                                int i3 = ((FileInputStream) AbstractC1600gE.A0f(this.A03)).read(bArr, i, i2);
                                if (i3 == -1) {
                                    return -1;
                                }
                                long j = this.A00;
                                if (A07[2].length() == 3) {
                                    throw new RuntimeException();
                                }
                                A07[2] = "VpboIS0bwB8qwjSyFt3nVNUpL";
                                if (j != -1) {
                                    this.A00 -= (long) i3;
                                }
                                A0F(i3);
                                if (A07[3].charAt(8) != '3') {
                                    throw new RuntimeException();
                                }
                                A07[2] = "kp79MYRM217RVhbIBfq1";
                                return i3;
                            } catch (IOException e) {
                                throw new Q8(e, 2000);
                            }
                        }
                    };
                    A09(this.A01);
                }
                return this.A01;
            }

            private Q7 A02() {
                if (this.A02 == null) {
                    this.A02 = new AbstractC04695e() { // from class: com.facebook.ads.redexgen.X.0q
                        public static byte[] A04;
                        public static String[] A05 = {"u3x9p7z2Ttk3I8E6eOCIoGpCfho89q1p", "9mthCpedrhM7phOMoFpvPJ1c476GqM9q", "YMUUWk8tq8s18401lLlJ8I6NG6abq2Bs", "jwZlTiicYRqZfkXPOUfkFRSIyJTsB2bY", "H21C8IuDu4ngyO4p7GkZaRyhtbcuKrkr", "GoUK4HBKeVAAAnH6WNZhF0r8xwC6Wya3", "18JFTHyH4kAwck3cfBIGFWwNjPPbje", "vIlNZmjmc2jNImOQb926fU9NHo6kuVQq"};
                        public int A00;
                        public int A01;
                        public C1447dj A02;
                        public byte[] A03;

                        public static String A00(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
                            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A04 = new byte[]{-6, -12, 27, 26, 44, 30, -17, -19, 37, 82, 82, 79, 82, 0, 87, 72, 73, 76, 69, 0, 80, 65, 82, 83, 73, 78, 71, 0, 34, 65, 83, 69, 22, 20, 0, 69, 78, 67, 79, 68, 69, 68, 0, 83, 84, 82, 73, 78, 71, 26, 0, -45, -20, -29, -10, -18, -29, -31, -14, -29, -30, -98, -45, -48, -57, -98, -28, -19, -16, -21, -33, -14, -72, -98, -48, -23, -18, -16, -21, -21, -22, -19, -17, -32, -33, -101, -18, -34, -29, -32, -24, -32, -75, -101, -11, -14, 5, -14};
                        }

                        static {
                            A01();
                        }

                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final Uri A9F() {
                            if (this.A02 != null) {
                                return this.A02.A06;
                            }
                            return null;
                        }

                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final long AFq(C1447dj c1447dj) throws IOException {
                            A0G(c1447dj);
                            this.A02 = c1447dj;
                            Uri uri = c1447dj.A06;
                            String scheme = uri.getScheme();
                            AbstractC1517es.A09(A00(94, 4, 24).equals(scheme), A00(74, 20, 2) + scheme);
                            String[] uriParts = AbstractC1600gE.A1O(uri.getSchemeSpecificPart(), A00(0, 1, 85));
                            if (uriParts.length == 2) {
                                String str = uriParts[1];
                                String dataString = uriParts[0];
                                if (dataString.contains(A00(1, 7, 64))) {
                                    try {
                                        this.A03 = Base64.decode(str, 0);
                                    } catch (IllegalArgumentException e) {
                                        throw Q6.A02(A00(8, 43, 103) + str, e);
                                    }
                                } else {
                                    this.A03 = AbstractC1600gE.A1G(URLDecoder.decode(str, AbstractC1686hd.A02.name()));
                                }
                                if (c1447dj.A04 <= this.A03.length) {
                                    this.A01 = (int) c1447dj.A04;
                                    this.A00 = this.A03.length - this.A01;
                                    if (c1447dj.A03 != -1) {
                                        this.A00 = (int) Math.min(this.A00, c1447dj.A03);
                                    }
                                    A0H(c1447dj);
                                    return c1447dj.A03 != -1 ? c1447dj.A03 : this.A00;
                                }
                                this.A03 = null;
                                throw new C1440dc(2008);
                            }
                            throw Q6.A02(A00(51, 23, 5) + uri, null);
                        }

                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final void close() {
                            if (this.A03 != null) {
                                this.A03 = null;
                                if (A05[6].length() == 32) {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A05;
                                strArr[7] = "0tC0a2pqDHNLBzULCFZEjdh9P0z1cfYq";
                                strArr[1] = "p5uSIyVweC2dgHzEx12P2whYvoF8pMWq";
                                A0E();
                            }
                            this.A02 = null;
                        }

                        @Override // com.facebook.ads.redexgen.core.O9
                        public final int read(byte[] bArr, int i, int i2) {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            int iMin = Math.min(i2, this.A00);
                            System.arraycopy(AbstractC1600gE.A0f(this.A03), this.A01, bArr, i, iMin);
                            this.A01 += iMin;
                            this.A00 -= iMin;
                            A0F(iMin);
                            return iMin;
                        }
                    };
                    A09(this.A02);
                }
                return this.A02;
            }

            private Q7 A03() {
                if (this.A03 == null) {
                    this.A03 = new C03520o();
                    A09(this.A03);
                }
                return this.A03;
            }

            private Q7 A04() {
                if (this.A04 == null) {
                    this.A04 = new AbstractC04695e(this.A09) { // from class: com.facebook.ads.redexgen.X.0n
                        public static byte[] A07;
                        public static String[] A08 = {"IWRdlT6Nh3wIT", "", "5pAPbUbg9DbQjlF7jX34MQjGBayg7X1P", "KNjB2", "bkODobGUuj7vKzkNuAShSAN7e55Cu8Qc", "fpDwP8Q1xweRusUji1xtt3TNQpJOBlAv", "RkAvgPtrb", "LpfXir7WSIoSn9jmSG7HeS6qpRP3b0pc"};
                        public long A00;
                        public AssetFileDescriptor A01;
                        public Uri A02;
                        public InputStream A03;
                        public boolean A04;
                        public final Resources A05;
                        public final String A06;

                        public static String A00(int i, int i2, int i3) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                            for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                                bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 85);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A07 = new byte[]{25, 112, 69, 110, 100, 32, 111, 102, 32, 115, 116, 114, 101, 97, 109, 32, 114, 101, 97, 99, 104, 101, 100, 32, 104, 97, 118, 105, 110, 103, 32, 110, 111, 116, 32, 114, 101, 97, 100, 32, 115, 117, 102, 102, 105, 99, 105, 101, 110, 116, 32, 100, 97, 116, 97, 46, 39, cw.n, 6, 26, 0, 7, 22, cw.n, 85, 28, 17, cw.n, 27, 1, 28, 19, 28, cw.n, 7, 85, 24, 0, 6, 1, 85, 23, cw.n, 85, 20, 27, 85, 28, 27, 1, cw.n, 18, cw.n, 7, 91, 63, 8, 30, 2, 24, 31, cw.l, 8, 77, 4, 30, 77, cw.l, 2, 0, 29, 31, 8, 30, 30, 8, 9, 87, 77, 7, 48, 38, 58, 32, 39, 54, 48, 117, 59, 58, 33, 117, 51, 58, 32, 59, 49, 123, 111, 104, 115, 26, 87, 79, 73, 78, 26, 95, 83, 78, 82, 95, 72, 26, 79, 73, 95, 26, 73, 89, 82, 95, 87, 95, 26, 72, 91, 77, 72, 95, 73, 85, 79, 72, 89, 95, 26, 85, 72, 26, 91, 84, 94, 72, 85, 83, 94, 20, 72, 95, 73, 85, 79, 72, 89, 95, 25, 33, 110, 85, 90, 80, 70, 91, 93, 80, 26, 70, 81, 71, 91, 65, 70, 87, 81, 105, 122, 108, 62, 45, 59, 62, 41, 63, 35, 57, 62, 47, 41};
                        }

                        /* JADX WARN: Code duplicated, block: B:36:0x011f  */
                        /* JADX WARN: Code duplicated, block: B:38:0x0125 A[Catch: IOException -> 0x019d, Ph -> 0x019f, TryCatch #7 {Ph -> 0x019f, IOException -> 0x019d, blocks: (B:34:0x0119, B:38:0x0125), top: B:102:0x0119 }] */
                        /* JADX WARN: Code duplicated, block: B:40:0x0131  */
                        /* JADX WARN: Code duplicated, block: B:46:0x0139  */
                        /* JADX WARN: Code duplicated, block: B:49:0x014b  */
                        /* JADX WARN: Code duplicated, block: B:50:0x014c A[Catch: IOException -> 0x01a3, Ph -> 0x01ae, TryCatch #8 {Ph -> 0x01ae, IOException -> 0x01a3, blocks: (B:47:0x013a, B:50:0x014c, B:51:0x0153, B:52:0x0154, B:66:0x018d, B:67:0x0194, B:68:0x0195, B:69:0x019c), top: B:101:0x011d }] */
                        /* JADX WARN: Code duplicated, block: B:52:0x0154 A[Catch: IOException -> 0x01a3, Ph -> 0x01ae, TryCatch #8 {Ph -> 0x01ae, IOException -> 0x01a3, blocks: (B:47:0x013a, B:50:0x014c, B:51:0x0153, B:52:0x0154, B:66:0x018d, B:67:0x0194, B:68:0x0195, B:69:0x019c), top: B:101:0x011d }] */
                        /* JADX WARN: Code duplicated, block: B:56:0x0166  */
                        /* JADX WARN: Code duplicated, block: B:58:0x016c  */
                        /* JADX WARN: Code duplicated, block: B:62:0x017e  */
                        /* JADX WARN: Code duplicated, block: B:64:0x0181  */
                        /* JADX WARN: Code duplicated, block: B:65:0x0184  */
                        /* JADX WARN: Code duplicated, block: B:66:0x018d A[Catch: IOException -> 0x01a3, Ph -> 0x01ae, TRY_ENTER, TryCatch #8 {Ph -> 0x01ae, IOException -> 0x01a3, blocks: (B:47:0x013a, B:50:0x014c, B:51:0x0153, B:52:0x0154, B:66:0x018d, B:67:0x0194, B:68:0x0195, B:69:0x019c), top: B:101:0x011d }] */
                        /* JADX WARN: Code duplicated, block: B:68:0x0195 A[Catch: IOException -> 0x01a3, Ph -> 0x01ae, TryCatch #8 {Ph -> 0x01ae, IOException -> 0x01a3, blocks: (B:47:0x013a, B:50:0x014c, B:51:0x0153, B:52:0x0154, B:66:0x018d, B:67:0x0194, B:68:0x0195, B:69:0x019c), top: B:101:0x011d }] */
                        /* JADX WARN: Code duplicated, block: B:94:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Failed to parse debug info
                        java.lang.ArrayIndexOutOfBoundsException
                         */
                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final long AFq(C1447dj c1447dj) throws C0958Ph {
                            int identifier;
                            long jSkip;
                            C03510n c03510n;
                            long jMin;
                            FileChannel channel;
                            Uri uri = c1447dj.A06;
                            this.A02 = uri;
                            if (TextUtils.equals(A00(EnumC4719u30.MRAID_JS_DOES_NOT_EXIST_VALUE, 11, 25), uri.getScheme())) {
                                identifier = Integer.parseInt((String) AbstractC1517es.A01(uri.getLastPathSegment()));
                            } else {
                                String scheme = uri.getScheme();
                                String strA00 = A00(199, 16, 97);
                                if (TextUtils.equals(strA00, scheme) && uri.getPathSegments().size() == 1 && ((String) AbstractC1517es.A01(uri.getLastPathSegment())).matches(A00(196, 3, 16))) {
                                    try {
                                        identifier = Integer.parseInt((String) AbstractC1517es.A01(uri.getLastPathSegment()));
                                    } catch (NumberFormatException unused) {
                                        throw new C0958Ph(A00(56, 39, 32), null, 1004);
                                    }
                                } else {
                                    if (!TextUtils.equals(strA00, uri.getScheme())) {
                                        throw new C0958Ph(A00(138, 58, 111), null, 1004);
                                    }
                                    String strSubstring = (String) AbstractC1517es.A01(uri.getPath());
                                    if (strSubstring.startsWith(A00(0, 1, 99))) {
                                        strSubstring = strSubstring.substring(1);
                                    }
                                    String host = uri.getHost();
                                    identifier = this.A05.getIdentifier((TextUtils.isEmpty(host) ? A00(0, 0, 88) : host + A00(1, 1, 31)) + strSubstring, A00(EnumC4719u30.AD_RESPONSE_EMPTY_VALUE, 3, 78), this.A06);
                                    if (identifier == 0) {
                                        throw new C0958Ph(A00(EnumC4719u30.JSON_ENCODE_ERROR_VALUE, 19, 0), null, 2005);
                                    }
                                }
                            }
                            A0G(c1447dj);
                            try {
                                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.A05.openRawResourceFd(identifier);
                                this.A01 = assetFileDescriptorOpenRawResourceFd;
                                if (assetFileDescriptorOpenRawResourceFd == null) {
                                    throw new C0958Ph(A00(95, 24, 56) + uri, null, 2000);
                                }
                                long length = assetFileDescriptorOpenRawResourceFd.getLength();
                                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
                                this.A03 = fileInputStream;
                                if (length == -1) {
                                    long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                                    jSkip = fileInputStream.skip(c1447dj.A04 + startOffset) - startOffset;
                                    if (jSkip == c1447dj.A04) {
                                        throw new C0958Ph(null, null, 2008);
                                    }
                                    if (length == -1) {
                                        channel = fileInputStream.getChannel();
                                        if (channel.size() == 0) {
                                            c03510n = this;
                                            c03510n.A00 = -1L;
                                        } else {
                                            c03510n = this;
                                            c03510n.A00 = channel.size() - channel.position();
                                            if (c03510n.A00 >= 0) {
                                                throw new C0958Ph(null, null, 2008);
                                            }
                                        }
                                    } else {
                                        c03510n = this;
                                        c03510n.A00 = length - jSkip;
                                        if (c03510n.A00 < 0) {
                                            throw new C1440dc(2008);
                                        }
                                    }
                                    if (c1447dj.A03 != -1) {
                                        if (c03510n.A00 == -1) {
                                            jMin = c1447dj.A03;
                                        } else {
                                            jMin = Math.min(c03510n.A00, c1447dj.A03);
                                        }
                                        c03510n.A00 = jMin;
                                    }
                                    c03510n.A04 = true;
                                    A0H(c1447dj);
                                    if (c1447dj.A03 != -1) {
                                    }
                                }
                                try {
                                    if (c1447dj.A04 > length) {
                                        throw new C0958Ph(null, null, 2008);
                                    }
                                    try {
                                        long startOffset2 = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                                        jSkip = fileInputStream.skip(c1447dj.A04 + startOffset2) - startOffset2;
                                        try {
                                            try {
                                                if (jSkip == c1447dj.A04) {
                                                    throw new C0958Ph(null, null, 2008);
                                                }
                                                if (length == -1) {
                                                    channel = fileInputStream.getChannel();
                                                    if (channel.size() == 0) {
                                                        c03510n = this;
                                                        c03510n.A00 = -1L;
                                                    } else {
                                                        c03510n = this;
                                                        c03510n.A00 = channel.size() - channel.position();
                                                        if (c03510n.A00 >= 0) {
                                                            throw new C0958Ph(null, null, 2008);
                                                        }
                                                    }
                                                } else {
                                                    c03510n = this;
                                                    c03510n.A00 = length - jSkip;
                                                    if (c03510n.A00 < 0) {
                                                        throw new C1440dc(2008);
                                                    }
                                                }
                                                if (c1447dj.A03 != -1) {
                                                    if (c03510n.A00 == -1) {
                                                        jMin = c1447dj.A03;
                                                    } else {
                                                        jMin = Math.min(c03510n.A00, c1447dj.A03);
                                                    }
                                                    c03510n.A00 = jMin;
                                                }
                                                c03510n.A04 = true;
                                                A0H(c1447dj);
                                                return c1447dj.A03 != -1 ? c1447dj.A03 : c03510n.A00;
                                            } catch (C0958Ph e) {
                                                throw e;
                                            } catch (IOException e2) {
                                                e = e2;
                                            }
                                        } catch (C0958Ph e3) {
                                            throw e3;
                                        } catch (IOException e4) {
                                            e = e4;
                                        }
                                    } catch (C0958Ph e5) {
                                        throw e5;
                                    } catch (IOException e6) {
                                        e = e6;
                                    }
                                } catch (C0958Ph e7) {
                                    throw e7;
                                } catch (IOException e8) {
                                    e = e8;
                                }
                                throw new C0958Ph(null, e, 2000);
                            } catch (Resources.NotFoundException e9) {
                                throw new C0958Ph(null, e9, 2005);
                            }
                        }

                        static {
                            A01();
                        }

                        {
                            super(false);
                            this.A05 = context.getResources();
                            this.A06 = context.getPackageName();
                        }

                        @Override // com.facebook.ads.redexgen.core.Q7
                        public final Uri A9F() {
                            return this.A02;
                        }

                        /* JADX WARN: Bottom block not found for handler: all -> 0x002d */
                        @Override // com.facebook.ads.redexgen.core.Q7
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void close() throws com.facebook.ads.redexgen.core.C0958Ph {
                            /*
                                r5 = this;
                                r3 = 0
                                r5.A02 = r3
                                r4 = 2000(0x7d0, float:2.803E-42)
                                r2 = 0
                                java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
                                if (r0 == 0) goto Lf
                                java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
                                r0.close()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
                            Lf:
                                r5.A03 = r3
                                android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                                if (r0 == 0) goto L1a
                                android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                                r0.close()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                            L1a:
                                r5.A01 = r3
                                boolean r0 = r5.A04
                                if (r0 == 0) goto L25
                                r5.A04 = r2
                                r5.A0E()
                            L25:
                                return
                            L26:
                                r1 = move-exception
                                com.facebook.ads.redexgen.X.Ph r0 = new com.facebook.ads.redexgen.X.Ph     // Catch: java.lang.Throwable -> L2d
                                r0.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L2d
                                throw r0     // Catch: java.lang.Throwable -> L2d
                            L2d:
                                r1 = move-exception
                                r5.A01 = r3
                                boolean r0 = r5.A04
                                if (r0 == 0) goto L39
                                r5.A04 = r2
                                r5.A0E()
                            L39:
                                throw r1
                            L3a:
                                r1 = move-exception
                                com.facebook.ads.redexgen.X.Ph r0 = new com.facebook.ads.redexgen.X.Ph     // Catch: java.lang.Throwable -> L41
                                r0.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L41
                                throw r0     // Catch: java.lang.Throwable -> L41
                            L41:
                                r1 = move-exception
                                r5.A03 = r3
                                android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L60
                                if (r0 == 0) goto L4d
                                android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L60
                                r0.close()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> L60
                            L4d:
                                r5.A01 = r3
                                boolean r0 = r5.A04
                                if (r0 == 0) goto L58
                                r5.A04 = r2
                                r5.A0E()
                            L58:
                                throw r1
                            L59:
                                r1 = move-exception
                                com.facebook.ads.redexgen.X.Ph r0 = new com.facebook.ads.redexgen.X.Ph     // Catch: java.lang.Throwable -> L60
                                r0.<init>(r3, r1, r4)     // Catch: java.lang.Throwable -> L60
                                throw r0     // Catch: java.lang.Throwable -> L60
                            L60:
                                r1 = move-exception
                                r5.A01 = r3
                                boolean r0 = r5.A04
                                if (r0 == 0) goto L6c
                                r5.A04 = r2
                                r5.A0E()
                            L6c:
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C03510n.close():void");
                        }

                        @Override // com.facebook.ads.redexgen.core.O9
                        public final int read(byte[] bArr, int i, int i2) throws C0958Ph {
                            if (i2 == 0) {
                                return 0;
                            }
                            if (this.A00 == 0) {
                                return -1;
                            }
                            try {
                                if (this.A00 != -1) {
                                    i2 = (int) Math.min(this.A00, i2);
                                }
                                int i3 = ((InputStream) AbstractC1600gE.A0f(this.A03)).read(bArr, i, i2);
                                if (i3 == -1) {
                                    long j = this.A00;
                                    String[] strArr = A08;
                                    String str = strArr[7];
                                    String str2 = strArr[2];
                                    int bytesRead = str.charAt(1);
                                    if (bytesRead != str2.charAt(1)) {
                                        throw new RuntimeException();
                                    }
                                    A08[0] = "AZxtvN8hu7tYb";
                                    if (j == -1) {
                                        return -1;
                                    }
                                    throw new C0958Ph(A00(2, 54, 85), new EOFException(), 2000);
                                }
                                if (this.A00 != -1) {
                                    long j2 = this.A00 - ((long) i3);
                                    int bytesRead2 = A08[4].charAt(18);
                                    if (bytesRead2 != 83) {
                                        String[] strArr2 = A08;
                                        strArr2[7] = "dpUH5F3Qkb7C8dhX3YikAjSwuXCfbaVT";
                                        strArr2[2] = "bpZlp59TdCP6KZrXUuU2I6OnnP9xBnO3";
                                        this.A00 = j2;
                                    } else {
                                        A08[6] = "09F0b2gN76HHavyQ2P1o1vTX4JYH";
                                        this.A00 = j2;
                                    }
                                }
                                A0F(i3);
                                return i3;
                            } catch (IOException e) {
                                throw new C0958Ph(null, e, 2000);
                            }
                        }
                    };
                    A09(this.A04);
                }
                return this.A04;
            }

            private Q7 A05() throws Exception {
                if (this.A05 == null) {
                    try {
                        this.A05 = (Q7) Class.forName(A07(Input.Keys.NUMPAD_ADD, 53, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE)).getConstructor(new Class[0]).newInstance(new Object[0]);
                        A09(this.A05);
                    } catch (ClassNotFoundException unused) {
                        AbstractC1561fb.A07(A07(85, 17, 99), A07(15, 70, 4));
                    } catch (Exception e) {
                        throw new RuntimeException(A07(102, 34, 8), e);
                    }
                    if (this.A05 == null) {
                        Q7 q7 = this.A08;
                        if (A0C[7].length() != 5) {
                            throw new RuntimeException();
                        }
                        A0C[3] = "MkKzK2TRajiRPNTMTDMAr";
                        this.A05 = q7;
                    }
                }
                return this.A05;
            }

            private Q7 A06() {
                if (this.A06 == null) {
                    this.A06 = new C03500m();
                    A09(this.A06);
                }
                return this.A06;
            }

            private void A09(Q7 q7) {
                for (int i = 0; i < i; i++) {
                    q7.A3t(this.A0A.get(i));
                }
            }

            private void A0A(Q7 q7, InterfaceC1486eN interfaceC1486eN) {
                if (q7 != null) {
                    q7.A3t(interfaceC1486eN);
                }
            }

            @Override // com.facebook.ads.redexgen.core.Q7
            public final void A3t(InterfaceC1486eN interfaceC1486eN) {
                AbstractC1517es.A01(interfaceC1486eN);
                this.A08.A3t(interfaceC1486eN);
                this.A0A.add(interfaceC1486eN);
                A0A(this.A03, interfaceC1486eN);
                A0A(this.A00, interfaceC1486eN);
                A0A(this.A01, interfaceC1486eN);
                A0A(this.A05, interfaceC1486eN);
                A0A(this.A06, interfaceC1486eN);
                A0A(this.A02, interfaceC1486eN);
                A0A(this.A04, interfaceC1486eN);
            }

            @Override // com.facebook.ads.redexgen.core.Q7
            public final Map<String, List<String>> A8j() {
                if (this.A07 == null) {
                    return Collections.emptyMap();
                }
                Q7 q7 = this.A07;
                String[] strArr = A0C;
                if (strArr[0].charAt(18) == strArr[6].charAt(18)) {
                    throw new RuntimeException();
                }
                A0C[2] = "reJjgQCLShmyHM7DeAVLMzH6U5vRqp3K";
                return q7.A8j();
            }

            @Override // com.facebook.ads.redexgen.core.Q7
            public final Uri A9F() {
                if (this.A07 == null) {
                    return null;
                }
                return this.A07.A9F();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0055  */
            /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
            @Override // com.facebook.ads.redexgen.core.Q7
            public final long AFq(C1447dj c1447dj) throws IOException {
                AbstractC1517es.A08(this.A07 == null);
                String scheme = c1447dj.A06.getScheme();
                if (AbstractC1600gE.A1A(c1447dj.A06)) {
                    String path = c1447dj.A06.getPath();
                    if (path != null) {
                        String scheme2 = A07(0, 15, 105);
                        boolean zStartsWith = path.startsWith(scheme2);
                        String[] strArr = A0C;
                        String uriPath = strArr[0];
                        if (uriPath.charAt(18) == strArr[6].charAt(18)) {
                            throw new RuntimeException();
                        }
                        A0C[1] = "3YPpUglDeLMsDukioucZm3DhYp9fLdDl";
                        if (zStartsWith) {
                            this.A07 = A00();
                        } else {
                            this.A07 = A03();
                        }
                    } else {
                        this.A07 = A03();
                    }
                } else {
                    String scheme3 = A07(Input.Keys.NUMPAD_8, 5, 48);
                    if (scheme3.equals(scheme)) {
                        this.A07 = A00();
                    } else {
                        String scheme4 = A07(EnumC4719u30.AD_NOT_LOADED_VALUE, 7, 70);
                        if (scheme4.equals(scheme)) {
                            this.A07 = A01();
                        } else {
                            String scheme5 = A07(232, 4, 98);
                            if (scheme5.equals(scheme)) {
                                this.A07 = A05();
                            } else {
                                String scheme6 = A07(236, 3, 44);
                                if (scheme6.equals(scheme)) {
                                    this.A07 = A06();
                                } else {
                                    String scheme7 = A07(EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, 4, 0);
                                    if (scheme7.equals(scheme)) {
                                        this.A07 = A02();
                                    } else {
                                        String scheme8 = A07(EnumC4719u30.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 11, 69);
                                        if (scheme8.equals(scheme)) {
                                            this.A07 = A04();
                                        } else {
                                            String scheme9 = A07(136, 16, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                                            if (scheme9.equals(scheme)) {
                                                this.A07 = A04();
                                            } else {
                                                this.A07 = this.A08;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return this.A07.AFq(c1447dj);
            }

            @Override // com.facebook.ads.redexgen.core.Q7
            public final void close() throws IOException {
                if (this.A07 != null) {
                    try {
                        this.A07.close();
                    } finally {
                        this.A07 = null;
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.core.O9
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                return ((Q7) AbstractC1517es.A01(this.A07)).read(bArr, i, i2);
            }
        };
        if (this.A02 != null) {
            r1.A3t(this.A02);
        }
        return r1;
    }
}
