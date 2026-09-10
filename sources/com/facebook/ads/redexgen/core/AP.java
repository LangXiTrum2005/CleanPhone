package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Base64;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization("OculusDefaultDataSource extends this class and hence cannot be final")
public final class AP implements InterfaceC2796pF {
    public static byte[] A0B;
    public static String[] A0C = {"tGdrGbTKqUAyZjAtECCaXso437TIFtay", "xasvTmVCH4LeG7al8p8ObQF4UIpko", "linuVDi59rGKxPba8cSgrQfx0g5xcZS0", "EsZJycHVVsXuEv", "at8NLtJKkPgo1aJyGFOZsbSRJOLI96cu", "TOIRSmJtL8rNzzbss9LVqHyYWtEEJZpF", "R6ga9urJMlxgk01j3rMsq3yEpAD", "8pNo6y0"};
    public InterfaceC2796pF A00;
    public InterfaceC2796pF A01;
    public InterfaceC2796pF A02;
    public InterfaceC2796pF A03;
    public InterfaceC2796pF A04;
    public InterfaceC2796pF A05;
    public InterfaceC2796pF A06;

    @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public InterfaceC2796pF A07;
    public final InterfaceC2796pF A08;

    @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public final Context A09;

    @MetaExoPlayerCustomization("OculusDefaultDataSource accesses this field directly")
    public final List<InterfaceC11315t> A0A = new ArrayList();

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 6);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{24, 86, 89, 83, 69, 88, 94, 83, 104, 86, 68, 68, 82, 67, 24, 76, 121, 121, 104, 96, 125, 121, 100, 99, 106, 45, 121, 98, 45, 125, 97, 108, 116, 45, 95, 89, 64, 93, 45, 126, 121, AbstractJsonLexerKt.TC_INVALID, 104, 108, 96, 45, 122, 100, 121, 101, 98, 120, 121, 45, 105, 104, 125, 104, 99, 105, 100, 99, 106, 45, 98, 99, 45, 121, 101, 104, 45, 95, 89, 64, 93, 45, 104, 117, 121, 104, 99, 126, 100, 98, 99, 83, 114, 113, 118, 98, 123, 99, 83, 118, 99, 118, 68, 120, 98, 101, 116, 114, 7, 48, 48, 45, 48, 98, 43, 44, 49, 54, 35, 44, 54, 43, 35, 54, 43, 44, 37, 98, 16, 22, 15, 18, 98, 39, 58, 54, 39, 44, 49, 43, 45, 44, 70, 73, 67, 85, 72, 78, 67, 9, 85, 66, 84, 72, 82, 85, 68, 66, 48, 34, 34, 52, 37, 38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 36, 33, 54, 107, 34, 42, 42, 34, 41, 32, 107, 36, 43, 33, 55, 42, 44, 33, 107, 32, 61, 42, 53, 41, 36, 60, 32, 55, 119, 107, 32, 61, 49, 107, 55, 49, 40, 53, 107, 23, 49, 40, 53, 1, 36, 49, 36, 22, 42, 48, 55, 38, 32, 12, 0, 1, 27, 10, 1, 27, 63, 58, 47, 58, 51, 32, 54, 51, 36, 50, 46, 52, 51, 34, 36, 75, 77, 84, 73, 70, 87, 67};
    }

    static {
        A08();
    }

    public AP(Context context, InterfaceC2796pF interfaceC2796pF) {
        this.A09 = context.getApplicationContext();
        this.A08 = (InterfaceC2796pF) AbstractC10843y.A01(interfaceC2796pF);
    }

    private InterfaceC2796pF A00() {
        if (this.A00 == null) {
            final Context context = this.A09;
            this.A00 = new AQ(context) { // from class: com.facebook.ads.redexgen.X.1n
                public static byte[] A05;
                public static String[] A06 = {"PTz87XAKzq7jvDXOa", "sgpUZ", "Bde9N92B9PLOW1wkk", "DRZuAIPcc", "gakZC5ePxUI2GDKV9", "pz9vQcEWFJbuREE6smExYo368tZlwkrG", "j43UPSzsV7IrH", "51Zh85ddLdY4jrUIDlK8L"};
                public long A00;
                public Uri A01;
                public InputStream A02;
                public boolean A03;
                public final AssetManager A04;

                public static String A00(int i2, int i3, int i4) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
                    for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                        int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 113;
                        String[] strArr = A06;
                        if (strArr[2].length() != strArr[4].length()) {
                            throw new RuntimeException();
                        }
                        A06[1] = "rCVU";
                        bArrCopyOfRange[i5] = (byte) i6;
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A05 = new byte[]{124, 116, 58, 53, 63, 41, 52, 50, 63, 4, 58, 40, 40, 62, 47, 116};
                }

                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException
                 */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                public final long AGi(C11205i c11205i) throws C2798pH {
                    try {
                        this.A01 = c11205i.A06;
                        String strSubstring = (String) AbstractC10843y.A01(this.A01.getPath());
                        boolean zStartsWith = strSubstring.startsWith(A00(1, 15, 42));
                        String[] strArr = A06;
                        if (strArr[2].length() == strArr[4].length()) {
                            String[] strArr2 = A06;
                            strArr2[2] = "3xdRIl55zUe0UeQhp";
                            strArr2[4] = "pS29hwepCfn47vExr";
                            if (zStartsWith) {
                                strSubstring = strSubstring.substring(15);
                            } else if (strSubstring.startsWith(A00(0, 1, 34))) {
                                strSubstring = strSubstring.substring(1);
                            }
                            A0G(c11205i);
                            this.A02 = this.A04.open(strSubstring, 1);
                            if (this.A02.skip(c11205i.A04) < c11205i.A04) {
                                throw new C2798pH(null, 2008);
                            }
                            if (c11205i.A03 != -1) {
                                this.A00 = c11205i.A03;
                            } else {
                                this.A00 = this.A02.available();
                                if (this.A00 == 2147483647L) {
                                    this.A00 = -1L;
                                }
                            }
                            this.A03 = true;
                            A0H(c11205i);
                            return this.A00;
                        }
                    } catch (C2798pH e2) {
                        throw e2;
                    } catch (IOException e3) {
                        boolean z2 = e3 instanceof FileNotFoundException;
                        if (A06[6].length() == 13) {
                            A06[6] = "P3wDYI6sXfUMf";
                            throw new C2798pH(e3, z2 ? 2005 : 2000);
                        }
                    }
                    throw new RuntimeException();
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A04 = context.getAssets();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                public final Uri A9P() {
                    return this.A01;
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x0022 */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void close() throws com.facebook.ads.redexgen.core.C2798pH {
                    /*
                        r5 = this;
                        r4 = 0
                        r5.A01 = r4
                        r3 = 0
                        java.io.InputStream r0 = r5.A02     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
                        if (r0 == 0) goto Ld
                        java.io.InputStream r0 = r5.A02     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
                        r0.close()     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L22
                    Ld:
                        r5.A02 = r4
                        boolean r0 = r5.A03
                        if (r0 == 0) goto L18
                        r5.A03 = r3
                        r5.A0E()
                    L18:
                        return
                    L19:
                        r2 = move-exception
                        r1 = 2000(0x7d0, float:2.803E-42)
                        com.facebook.ads.redexgen.X.pH r0 = new com.facebook.ads.redexgen.X.pH     // Catch: java.lang.Throwable -> L22
                        r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L22
                        throw r0     // Catch: java.lang.Throwable -> L22
                    L22:
                        r1 = move-exception
                        r5.A02 = r4
                        boolean r0 = r5.A03
                        if (r0 == 0) goto L2e
                        r5.A03 = r3
                        r5.A0E()
                    L2e:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10251n.close():void");
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC10402c
                public final int read(byte[] bArr, int i2, int i3) throws IOException {
                    if (i3 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i3 = (int) Math.min(this.A00, i3);
                        }
                        int i4 = ((InputStream) C5C.A0f(this.A02)).read(bArr, i2, i3);
                        if (i4 == -1) {
                            return -1;
                        }
                        long j = this.A00;
                        if (A06[6].length() != 13) {
                            throw new RuntimeException();
                        }
                        A06[6] = "7Z6S4bUZVA19c";
                        if (j != -1) {
                            this.A00 -= (long) i4;
                        }
                        A0F(i4);
                        return i4;
                    } catch (IOException e2) {
                        throw new C2798pH(e2, 2000);
                    }
                }
            };
            A09(this.A00);
        }
        return this.A00;
    }

    private InterfaceC2796pF A01() {
        if (this.A01 == null) {
            final Context context = this.A09;
            this.A01 = new AQ(context) { // from class: com.facebook.ads.redexgen.X.1m
                public static byte[] A06;
                public static String[] A07 = {"2ftN4rqyMzReasXlS0Bd7yvXq4Z2w8Rd", "SB3v1XRSpovCjfjTdx7anKa7xqXJKcRT", "XVjCn6r7eDTGJtLvngTS2wgt8nCOhnB8", "1Z3zzaFrxDlwod4BzGavHrSG6vNvtkR5", "UgcL11Y1AQOJlkVRTNTymNMOAMwNhJW2", "NkTGPgJcqOjwrAzhjPkYXMY7OTNaeVTG", "UuxCrg9I54LtW8vlxqROWB7HyIfBI135", "4rxicH75x32fMwhdD1obBcUBdLwTm4oP"};
                public long A00;
                public AssetFileDescriptor A01;
                public Uri A02;
                public FileInputStream A03;
                public boolean A04;
                public final ContentResolver A05;

                public static String A00(int i2, int i3, int i4) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
                    for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 87);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A06 = new byte[]{-76, -71, -76, 10, 54, 60, 51, 43, -25, 53, 54, 59, -25, 54, 55, 44, 53, -25, 45, 48, 51, 44, -25, 43, 44, 58, 42, 57, 48, 55, 59, 54, 57, -25, 45, 54, 57, 1, -25, 12, 25, 15, 29, 26, 20, 15, -39, 27, 29, 26, 33, 20, 15, 16, 29, -39, 16, 35, 31, 29, 12, -39, -20, -18, -18, -16, -5, -1, 10, -6, -3, -12, -14, -12, -7, -20, -9, 10, -8, -16, -17, -12, -20, 10, -15, -6, -3, -8, -20, -1, -70, -58, -59, -53, -68, -59, -53, 1};
                }

                /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
                
                    if (r0 >= 0) goto L39;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
                
                    throw new com.facebook.ads.redexgen.core.C2797pG(null, 2008);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
                
                    throw new com.facebook.ads.redexgen.core.C2797pG(null, 2008);
                 */
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 15
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
                	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
                	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
                	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
                	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
                 */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final long AGi(com.facebook.ads.redexgen.core.C11205i r14) throws com.facebook.ads.redexgen.core.C2797pG {
                    /*
                        Method dump skipped, instruction units count: 449
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10241m.AGi(com.facebook.ads.redexgen.X.5i):long");
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A05 = context.getContentResolver();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                public final Uri A9P() {
                    return this.A02;
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x002d */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void close() throws com.facebook.ads.redexgen.core.C2797pG {
                    /*
                        r5 = this;
                        r3 = 0
                        r5.A02 = r3
                        r4 = 2000(0x7d0, float:2.803E-42)
                        r2 = 0
                        java.io.FileInputStream r0 = r5.A03     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
                        if (r0 == 0) goto Lf
                        java.io.FileInputStream r0 = r5.A03     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L41
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
                        com.facebook.ads.redexgen.X.pG r0 = new com.facebook.ads.redexgen.X.pG     // Catch: java.lang.Throwable -> L2d
                        r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L2d
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
                        com.facebook.ads.redexgen.X.pG r0 = new com.facebook.ads.redexgen.X.pG     // Catch: java.lang.Throwable -> L41
                        r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L41
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
                        com.facebook.ads.redexgen.X.pG r0 = new com.facebook.ads.redexgen.X.pG     // Catch: java.lang.Throwable -> L60
                        r0.<init>(r1, r4)     // Catch: java.lang.Throwable -> L60
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
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10241m.close():void");
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC10402c
                public final int read(byte[] bArr, int i2, int i3) throws IOException {
                    if (i3 == 0) {
                        return 0;
                    }
                    long j = this.A00;
                    if (A07[1].charAt(15) != 'T') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A07;
                    strArr[0] = "xrRDl1n0HP8M9562uVsbLDb97IGJJORF";
                    strArr[3] = "BxGqKYmJPgWUa88HGr5IfMWzChfrhfRY";
                    if (j == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i3 = (int) Math.min(this.A00, i3);
                        }
                        int i4 = ((FileInputStream) C5C.A0f(this.A03)).read(bArr, i2, i3);
                        if (i4 == -1) {
                            return -1;
                        }
                        if (this.A00 != -1) {
                            this.A00 -= (long) i4;
                        }
                        A0F(i4);
                        return i4;
                    } catch (IOException e2) {
                        throw new C2797pG(e2, 2000);
                    }
                }
            };
            A09(this.A01);
        }
        return this.A01;
    }

    private InterfaceC2796pF A02() {
        if (this.A02 == null) {
            this.A02 = new AQ() { // from class: com.facebook.ads.redexgen.X.1l
                public static byte[] A04;
                public int A00;
                public int A01;
                public C11205i A02;
                public byte[] A03;

                static {
                    A01();
                }

                public static String A00(int i2, int i3, int i4) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
                    for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 120);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A04 = new byte[]{-17, 48, 87, 86, 104, 90, 43, 41, 58, 103, 103, 100, 103, 21, 108, 93, 94, 97, 90, 21, 101, 86, 103, 104, 94, 99, 92, 21, 55, 86, 104, 90, 43, 41, 21, 90, 99, 88, 100, 89, 90, 89, 21, 104, 105, 103, 94, 99, 92, 47, 21, -23, 2, -7, 12, 4, -7, -9, 8, -7, -8, -76, -23, -26, -35, -76, -6, 3, 6, 1, -11, 8, -50, -76, 60, 85, 90, 92, 87, 87, 86, 89, 91, 76, 75, 7, 90, 74, 79, 76, 84, 76, 33, 7, 25, 22, 41, 22};
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                public final Uri A9P() {
                    if (this.A02 != null) {
                        return this.A02.A06;
                    }
                    return null;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                public final long AGi(C11205i c11205i) throws IOException {
                    A0G(c11205i);
                    this.A02 = c11205i;
                    Uri uri = c11205i.A06;
                    String scheme = uri.getScheme();
                    AbstractC10843y.A09(A00(94, 4, 61).equals(scheme), A00(74, 20, 111) + scheme);
                    String[] uriParts = C5C.A1O(uri.getSchemeSpecificPart(), A00(0, 1, 75));
                    if (uriParts.length == 2) {
                        String str = uriParts[1];
                        String dataString = uriParts[0];
                        if (dataString.contains(A00(1, 7, 125))) {
                            try {
                                this.A03 = Base64.decode(str, 0);
                            } catch (IllegalArgumentException e2) {
                                throw C3K.A02(A00(8, 43, 125) + str, e2);
                            }
                        } else {
                            this.A03 = C5C.A1G(URLDecoder.decode(str, AbstractC2497k9.A01.name()));
                        }
                        if (c11205i.A04 <= this.A03.length) {
                            this.A01 = (int) c11205i.A04;
                            this.A00 = this.A03.length - this.A01;
                            if (c11205i.A03 != -1) {
                                this.A00 = (int) Math.min(this.A00, c11205i.A03);
                            }
                            A0H(c11205i);
                            return c11205i.A03 != -1 ? c11205i.A03 : this.A00;
                        }
                        this.A03 = null;
                        throw new C11135b(2008);
                    }
                    throw C3K.A02(A00(51, 23, 28) + uri, null);
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                public final void close() {
                    if (this.A03 != null) {
                        this.A03 = null;
                        A0E();
                    }
                    this.A02 = null;
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC10402c
                public final int read(byte[] bArr, int i2, int i3) {
                    if (i3 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    int iMin = Math.min(i3, this.A00);
                    System.arraycopy(C5C.A0f(this.A03), this.A01, bArr, i2, iMin);
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

    private InterfaceC2796pF A03() {
        if (this.A03 == null) {
            this.A03 = new C10211j();
            A09(this.A03);
        }
        return this.A03;
    }

    private InterfaceC2796pF A04() {
        if (this.A04 == null) {
            final Context context = this.A09;
            this.A04 = new AQ(context) { // from class: com.facebook.ads.redexgen.X.1i
                public static byte[] A07;
                public static String[] A08 = {"QLuP8Pt4KiB", "RgtlFkBshe2uzsEMObMvf6GLE9oju0kX", "TTP1lITjIL7gpSd4kE", "ZIRCIqgztw3RRTH34yg2MmGGdHBG3Sqw", "W8lxrl5W", "1BP9Supp2XIZ7aBeV", "CPoLKetsO3XScG5XHhoA5", "r"};
                public long A00;
                public AssetFileDescriptor A01;
                public Uri A02;
                public InputStream A03;
                public boolean A04;
                public final Resources A05;
                public final String A06;

                public static String A00(int i2, int i3, int i4) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
                    for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
                        bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 127);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A07 = new byte[]{105, 54, 72, 99, 105, 45, 98, 107, 45, 126, 121, AbstractJsonLexerKt.TC_INVALID, 104, 108, 96, 45, AbstractJsonLexerKt.TC_INVALID, 104, 108, 110, 101, 104, 105, 45, 101, 108, 123, 100, 99, 106, 45, 99, 98, 121, 45, AbstractJsonLexerKt.TC_INVALID, 104, 108, 105, 45, 126, 120, 107, 107, 100, 110, 100, 104, 99, 121, 45, 105, 108, 121, 108, 35, 122, 77, 91, 71, 93, 90, 75, 77, 8, 65, 76, 77, 70, 92, 65, 78, 65, 77, 90, 8, 69, 93, 91, 92, 8, 74, 77, 8, 73, 70, 8, 65, 70, 92, 77, 79, 77, 90, 6, 27, 44, 58, 38, 60, 59, 42, 44, 105, 32, 58, 105, 42, 38, 36, 57, 59, 44, 58, 58, 44, 45, 115, 105, 50, 5, 19, 15, 21, 18, 3, 5, 64, 14, 15, 20, 64, 6, 15, 21, 14, 4, 78, 115, 116, 111, 6, 75, 83, 85, 82, 6, 67, 79, 82, 78, 67, 84, 6, 83, 85, 67, 6, 85, 69, 78, 67, 75, 67, 6, 84, 71, 81, 84, 67, 85, 73, 83, 84, 69, 67, 6, 73, 84, 6, 71, 72, 66, 84, 73, 79, 66, 8, 84, 67, 85, 73, 83, 84, 69, 67, 114, 74, 5, 98, 109, 103, 113, 108, 106, 103, 45, 113, 102, 112, 108, 118, 113, 96, 102, 69, 86, 64, 92, 79, 89, 92, 75, 93, 65, 91, 92, 77, 75};
                }

                /* JADX WARN: Code duplicated, block: B:107:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:109:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:33:0x013d  */
                /* JADX WARN: Code duplicated, block: B:37:0x015a  */
                /* JADX WARN: Code duplicated, block: B:38:0x015b A[Catch: IOException -> 0x0189, p3 -> 0x018c, TryCatch #10 {p3 -> 0x018c, IOException -> 0x0189, blocks: (B:35:0x0154, B:38:0x015b, B:39:0x0160, B:48:0x0186), top: B:109:0x0154 }] */
                /* JADX WARN: Code duplicated, block: B:43:0x0173  */
                /* JADX WARN: Code duplicated, block: B:45:0x0179 A[Catch: IOException -> 0x0212, p3 -> 0x0214, TryCatch #9 {p3 -> 0x0214, IOException -> 0x0212, blocks: (B:41:0x016d, B:45:0x0179), top: B:110:0x016d }] */
                /* JADX WARN: Code duplicated, block: B:47:0x0185  */
                /* JADX WARN: Code duplicated, block: B:53:0x018f  */
                /* JADX WARN: Code duplicated, block: B:56:0x01a1  */
                /* JADX WARN: Code duplicated, block: B:57:0x01a2 A[Catch: IOException -> 0x0218, p3 -> 0x0223, TryCatch #8 {p3 -> 0x0223, IOException -> 0x0218, blocks: (B:54:0x0190, B:57:0x01a2, B:58:0x01a9, B:59:0x01aa, B:77:0x0202, B:78:0x0209, B:79:0x020a, B:80:0x0211), top: B:112:0x0171 }] */
                /* JADX WARN: Code duplicated, block: B:59:0x01aa A[Catch: IOException -> 0x0218, p3 -> 0x0223, TryCatch #8 {p3 -> 0x0223, IOException -> 0x0218, blocks: (B:54:0x0190, B:57:0x01a2, B:58:0x01a9, B:59:0x01aa, B:77:0x0202, B:78:0x0209, B:79:0x020a, B:80:0x0211), top: B:112:0x0171 }] */
                /* JADX WARN: Code duplicated, block: B:63:0x01ca  */
                /* JADX WARN: Code duplicated, block: B:65:0x01d5  */
                /* JADX WARN: Code duplicated, block: B:67:0x01db  */
                /* JADX WARN: Code duplicated, block: B:71:0x01ed  */
                /* JADX WARN: Code duplicated, block: B:73:0x01f0  */
                /* JADX WARN: Code duplicated, block: B:74:0x01f3  */
                /* JADX WARN: Code duplicated, block: B:77:0x0202 A[Catch: IOException -> 0x0218, p3 -> 0x0223, TRY_ENTER, TryCatch #8 {p3 -> 0x0223, IOException -> 0x0218, blocks: (B:54:0x0190, B:57:0x01a2, B:58:0x01a9, B:59:0x01aa, B:77:0x0202, B:78:0x0209, B:79:0x020a, B:80:0x0211), top: B:112:0x0171 }] */
                /* JADX WARN: Code duplicated, block: B:79:0x020a A[Catch: IOException -> 0x0218, p3 -> 0x0223, TryCatch #8 {p3 -> 0x0223, IOException -> 0x0218, blocks: (B:54:0x0190, B:57:0x01a2, B:58:0x01a9, B:59:0x01aa, B:77:0x0202, B:78:0x0209, B:79:0x020a, B:80:0x0211), top: B:112:0x0171 }] */
                /* JADX WARN: Code duplicated, block: B:94:0x0225  */
                /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
                
                    throw new com.facebook.ads.redexgen.core.C2784p3(A00(119, 19, 31), null, 2005);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x00f7, code lost:
                
                    if (r1 != 0) goto L25;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
                
                    if (r1 != 0) goto L25;
                 */
                /* JADX WARN: Failed to parse debug info
                java.lang.ArrayIndexOutOfBoundsException
                 */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final long AGi(com.facebook.ads.redexgen.core.C11205i r14) throws com.facebook.ads.redexgen.core.C2784p3 {
                    /*
                        Method dump skipped, instruction units count: 641
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10201i.AGi(com.facebook.ads.redexgen.X.5i):long");
                }

                static {
                    A01();
                }

                {
                    super(false);
                    this.A05 = context.getResources();
                    this.A06 = context.getPackageName();
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                public final Uri A9P() {
                    return this.A02;
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x002d */
                @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void close() throws com.facebook.ads.redexgen.core.C2784p3 {
                    /*
                        r5 = this;
                        r2 = 0
                        r5.A02 = r2
                        r4 = 2000(0x7d0, float:2.803E-42)
                        r3 = 0
                        java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L62
                        if (r0 == 0) goto Lf
                        java.io.InputStream r0 = r5.A03     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L62
                        r0.close()     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L62
                    Lf:
                        r5.A03 = r2
                        android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                        if (r0 == 0) goto L1a
                        android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                        r0.close()     // Catch: java.io.IOException -> L26 java.lang.Throwable -> L2d
                    L1a:
                        r5.A01 = r2
                        boolean r0 = r5.A04
                        if (r0 == 0) goto L25
                        r5.A04 = r3
                        r5.A0E()
                    L25:
                        return
                    L26:
                        r1 = move-exception
                        com.facebook.ads.redexgen.X.p3 r0 = new com.facebook.ads.redexgen.X.p3     // Catch: java.lang.Throwable -> L2d
                        r0.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L2d
                        throw r0     // Catch: java.lang.Throwable -> L2d
                    L2d:
                        r4 = move-exception
                        r5.A01 = r2
                        java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10201i.A08
                        r0 = 1
                        r1 = r2[r0]
                        r0 = 3
                        r2 = r2[r0]
                        r0 = 14
                        char r1 = r1.charAt(r0)
                        char r0 = r2.charAt(r0)
                        if (r1 == r0) goto L55
                        java.lang.String[] r2 = com.facebook.ads.redexgen.core.C10201i.A08
                        java.lang.String r1 = "iC26zNxzLLnB2GH7qyOIGlAQhGgRPuU"
                        r0 = 6
                        r2[r0] = r1
                        boolean r0 = r5.A04
                        if (r0 == 0) goto L54
                        r5.A04 = r3
                        r5.A0E()
                    L54:
                        throw r4
                    L55:
                        java.lang.RuntimeException r0 = new java.lang.RuntimeException
                        r0.<init>()
                        throw r0
                    L5b:
                        r1 = move-exception
                        com.facebook.ads.redexgen.X.p3 r0 = new com.facebook.ads.redexgen.X.p3     // Catch: java.lang.Throwable -> L62
                        r0.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L62
                        throw r0     // Catch: java.lang.Throwable -> L62
                    L62:
                        r1 = move-exception
                        r5.A03 = r2
                        android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L81
                        if (r0 == 0) goto L6e
                        android.content.res.AssetFileDescriptor r0 = r5.A01     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L81
                        r0.close()     // Catch: java.io.IOException -> L7a java.lang.Throwable -> L81
                    L6e:
                        r5.A01 = r2
                        boolean r0 = r5.A04
                        if (r0 == 0) goto L79
                        r5.A04 = r3
                        r5.A0E()
                    L79:
                        throw r1
                    L7a:
                        r1 = move-exception
                        com.facebook.ads.redexgen.X.p3 r0 = new com.facebook.ads.redexgen.X.p3     // Catch: java.lang.Throwable -> L81
                        r0.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L81
                        throw r0     // Catch: java.lang.Throwable -> L81
                    L81:
                        r1 = move-exception
                        r5.A01 = r2
                        boolean r0 = r5.A04
                        if (r0 == 0) goto L8d
                        r5.A04 = r3
                        r5.A0E()
                    L8d:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C10201i.close():void");
                }

                @Override // com.facebook.ads.redexgen.core.InterfaceC10402c
                public final int read(byte[] bArr, int i2, int i3) throws C2784p3 {
                    if (i3 == 0) {
                        return 0;
                    }
                    if (this.A00 == 0) {
                        return -1;
                    }
                    try {
                        if (this.A00 != -1) {
                            i3 = (int) Math.min(this.A00, i3);
                        }
                        int i4 = ((InputStream) C5C.A0f(this.A03)).read(bArr, i2, i3);
                        if (i4 == -1) {
                            if (this.A00 == -1) {
                                return -1;
                            }
                            throw new C2784p3(A00(2, 54, 114), new EOFException(), 2000);
                        }
                        if (this.A00 != -1) {
                            this.A00 -= (long) i4;
                        }
                        A0F(i4);
                        return i4;
                    } catch (IOException e2) {
                        throw new C2784p3(null, e2, 2000);
                    }
                }
            };
            A09(this.A04);
        }
        return this.A04;
    }

    private InterfaceC2796pF A05() throws Exception {
        if (this.A05 == null) {
            try {
                this.A05 = (InterfaceC2796pF) Class.forName(A07(157, 66, 67)).getConstructor(new Class[0]).newInstance(new Object[0]);
                A09(this.A05);
            } catch (ClassNotFoundException unused) {
                AbstractC10924g.A07(A07(85, 17, 17), A07(15, 70, 11));
            } catch (Exception e2) {
                throw new RuntimeException(A07(102, 34, 68), e2);
            }
            if (this.A05 == null) {
                this.A05 = this.A08;
            }
        }
        return this.A05;
    }

    private InterfaceC2796pF A06() {
        if (this.A06 == null) {
            this.A06 = new C10191h();
            A09(this.A06);
        }
        return this.A06;
    }

    private void A09(InterfaceC2796pF interfaceC2796pF) {
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC2796pF.A43(this.A0A.get(i2));
        }
    }

    private void A0A(InterfaceC2796pF interfaceC2796pF, InterfaceC11315t interfaceC11315t) {
        if (interfaceC2796pF != null) {
            interfaceC2796pF.A43(interfaceC11315t);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final void A43(InterfaceC11315t interfaceC11315t) {
        AbstractC10843y.A01(interfaceC11315t);
        this.A08.A43(interfaceC11315t);
        this.A0A.add(interfaceC11315t);
        A0A(this.A03, interfaceC11315t);
        A0A(this.A00, interfaceC11315t);
        A0A(this.A01, interfaceC11315t);
        A0A(this.A05, interfaceC11315t);
        A0A(this.A06, interfaceC11315t);
        A0A(this.A02, interfaceC11315t);
        A0A(this.A04, interfaceC11315t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final Map<String, List<String>> A8t() {
        return this.A07 == null ? Collections.emptyMap() : this.A07.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final Uri A9P() {
        if (this.A07 == null) {
            return null;
        }
        return this.A07.A9P();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final long AGi(C11205i c11205i) throws IOException {
        AbstractC10843y.A08(this.A07 == null);
        String scheme = c11205i.A06.getScheme();
        if (C5C.A1A(c11205i.A06)) {
            String path = c11205i.A06.getPath();
            if (path != null) {
                String[] strArr = A0C;
                String uriPath = strArr[4];
                if (uriPath.charAt(27) != strArr[0].charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0C;
                strArr2[4] = "woaZ3GsQ3DbiayOrUPjNVqqq8n8IT0aY";
                strArr2[0] = "klzvMTRWbU3yZvxB9bRoGsioUmbI9kjx";
                String scheme2 = A07(0, 15, 49);
                if (path.startsWith(scheme2)) {
                    InterfaceC2796pF interfaceC2796pFA00 = A00();
                    String[] strArr3 = A0C;
                    String uriPath2 = strArr3[4];
                    if (uriPath2.charAt(27) != strArr3[0].charAt(27)) {
                        String[] strArr4 = A0C;
                        strArr4[1] = "PIVfyqk1Etrv0Wbxq4vDpVOoMCV7O";
                        strArr4[7] = "Bsp2dR1";
                        this.A07 = interfaceC2796pFA00;
                    } else {
                        String[] strArr5 = A0C;
                        strArr5[1] = "maZBVk5L4nnlZEqCNC7SxmxFjkMbb";
                        strArr5[7] = "XTvzFpJ";
                        this.A07 = interfaceC2796pFA00;
                    }
                } else {
                    this.A07 = A03();
                }
            } else {
                this.A07 = A03();
            }
        } else {
            String scheme3 = A07(152, 5, 87);
            if (scheme3.equals(scheme)) {
                this.A07 = A00();
            } else {
                String scheme4 = A07(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 7, 105);
                if (scheme4.equals(scheme)) {
                    this.A07 = A01();
                } else {
                    String scheme5 = A07(245, 4, 63);
                    if (scheme5.equals(scheme)) {
                        this.A07 = A05();
                    } else {
                        String scheme6 = A07(249, 3, 53);
                        if (scheme6.equals(scheme)) {
                            this.A07 = A06();
                        } else {
                            String scheme7 = A07(230, 4, 93);
                            if (scheme7.equals(scheme)) {
                                this.A07 = A02();
                            } else {
                                String scheme8 = A07(234, 11, 71);
                                if (scheme8.equals(scheme)) {
                                    this.A07 = A04();
                                } else {
                                    String scheme9 = A07(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 16, 33);
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
        return this.A07.AGi(c11205i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final void close() throws IOException {
        if (this.A07 != null) {
            try {
                this.A07.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10402c
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        return ((InterfaceC2796pF) AbstractC10843y.A01(this.A07)).read(bArr, i2, i3);
    }
}
