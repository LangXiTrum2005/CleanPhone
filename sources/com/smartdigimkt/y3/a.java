package com.smartdigimkt.y3;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40026a = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40027b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f40028c = 256;
    private static final int d = 1536;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f40029e = {1, 2, 3, 6};
    private static final int[] f = {48000, 44100, 32000};
    private static final int[] g = {24000, 22050, 16000};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f40030h = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f40031i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, PsExtractor.AUDIO_STREAM, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, com.smartdigimkt.v0.p.e.f39014a, 512, 576, 640};
    private static final int[] j = {69, 87, 104, 121, 139, 174, 208, 243, com.smartdigimkt.b0.a.W0, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {
        public static final int g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f40032h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f40033i = 1;
        public static final int j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40036c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f40037e;
        public final int f;

        /* JADX INFO: renamed from: com.smartdigimkt.y3.a$b$a, reason: collision with other inner class name */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0643a {
        }

        private b(String str, int i2, int i3, int i4, int i5, int i6) {
            this.f40034a = str;
            this.f40035b = i2;
            this.d = i3;
            this.f40036c = i4;
            this.f40037e = i5;
            this.f = i6;
        }
    }

    private a() {
    }

    public static int a() {
        return d;
    }

    public static com.smartdigimkt.w3.m b(com.smartdigimkt.p4.s sVar, String str, String str2, com.smartdigimkt.a4.e eVar) {
        sVar.f(2);
        int i2 = f[(sVar.x() & PsExtractor.AUDIO_STREAM) >> 6];
        int iX = sVar.x();
        int i3 = f40030h[(iX & 14) >> 1];
        if ((iX & 1) != 0) {
            i3++;
        }
        if (((sVar.x() & 30) >> 1) > 0 && (2 & sVar.x()) != 0) {
            i3 += 2;
        }
        return com.smartdigimkt.w3.m.a(str, (sVar.a() <= 0 || (sVar.x() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i3, i2, null, eVar, 0, str2);
    }

    public static com.smartdigimkt.w3.m a(com.smartdigimkt.p4.s sVar, String str, String str2, com.smartdigimkt.a4.e eVar) {
        int i2 = f[(sVar.x() & PsExtractor.AUDIO_STREAM) >> 6];
        int iX = sVar.x();
        int i3 = f40030h[(iX & 56) >> 3];
        if ((iX & 4) != 0) {
            i3++;
        }
        return com.smartdigimkt.w3.m.a(str, "audio/ac3", null, -1, -1, i3, i2, null, eVar, 0, str2);
    }

    public static b a(com.smartdigimkt.p4.r rVar) {
        int iA;
        int i2;
        int i3;
        String str;
        int i4;
        int iA2;
        int i5;
        int i6;
        int iE = rVar.e();
        rVar.c(40);
        boolean z2 = rVar.a(5) == 16;
        rVar.b(iE);
        int i7 = -1;
        if (z2) {
            rVar.c(16);
            int iA3 = rVar.a(2);
            if (iA3 == 0) {
                i7 = 0;
            } else if (iA3 == 1) {
                i7 = 1;
            } else if (iA3 == 2) {
                i7 = 2;
            }
            rVar.c(3);
            iA = (rVar.a(11) + 1) * 2;
            int iA4 = rVar.a(2);
            if (iA4 == 3) {
                i5 = 6;
                i2 = g[rVar.a(2)];
                iA2 = 3;
            } else {
                iA2 = rVar.a(2);
                i5 = f40029e[iA2];
                i2 = f[iA4];
            }
            i4 = i5 * 256;
            int iA5 = rVar.a(3);
            boolean zF = rVar.f();
            i3 = f40030h[iA5] + (zF ? 1 : 0);
            rVar.c(10);
            if (rVar.f()) {
                rVar.c(8);
            }
            if (iA5 == 0) {
                rVar.c(5);
                if (rVar.f()) {
                    rVar.c(8);
                }
            }
            if (i7 == 1 && rVar.f()) {
                rVar.c(16);
            }
            if (rVar.f()) {
                if (iA5 > 2) {
                    rVar.c(2);
                }
                if ((iA5 & 1) != 0 && iA5 > 2) {
                    rVar.c(6);
                }
                if ((iA5 & 4) != 0) {
                    rVar.c(6);
                }
                if (zF && rVar.f()) {
                    rVar.c(5);
                }
                if (i7 == 0) {
                    if (rVar.f()) {
                        rVar.c(6);
                    }
                    if (iA5 == 0 && rVar.f()) {
                        rVar.c(6);
                    }
                    if (rVar.f()) {
                        rVar.c(6);
                    }
                    int iA6 = rVar.a(2);
                    if (iA6 == 1) {
                        rVar.c(5);
                    } else if (iA6 == 2) {
                        rVar.c(12);
                    } else if (iA6 == 3) {
                        int iA7 = rVar.a(5);
                        if (rVar.f()) {
                            rVar.c(5);
                            if (rVar.f()) {
                                rVar.c(4);
                            }
                            if (rVar.f()) {
                                rVar.c(4);
                            }
                            if (rVar.f()) {
                                rVar.c(4);
                            }
                            if (rVar.f()) {
                                rVar.c(4);
                            }
                            if (rVar.f()) {
                                rVar.c(4);
                            }
                            if (rVar.f()) {
                                rVar.c(4);
                            }
                            if (rVar.f()) {
                                rVar.c(4);
                            }
                            if (rVar.f()) {
                                if (rVar.f()) {
                                    rVar.c(4);
                                }
                                if (rVar.f()) {
                                    rVar.c(4);
                                }
                            }
                        }
                        if (rVar.f()) {
                            rVar.c(5);
                            if (rVar.f()) {
                                rVar.c(7);
                                if (rVar.f()) {
                                    rVar.c(8);
                                }
                            }
                        }
                        rVar.c((iA7 + 2) * 8);
                        rVar.c();
                    }
                    if (iA5 < 2) {
                        if (rVar.f()) {
                            rVar.c(14);
                        }
                        if (iA5 == 0 && rVar.f()) {
                            rVar.c(14);
                        }
                    }
                    if (rVar.f()) {
                        if (iA2 == 0) {
                            rVar.c(5);
                        } else {
                            for (int i8 = 0; i8 < i5; i8++) {
                                if (rVar.f()) {
                                    rVar.c(5);
                                }
                            }
                        }
                    }
                }
            }
            if (rVar.f()) {
                rVar.c(5);
                if (iA5 == 2) {
                    rVar.c(4);
                }
                if (iA5 >= 6) {
                    rVar.c(2);
                }
                if (rVar.f()) {
                    rVar.c(8);
                }
                if (iA5 == 0 && rVar.f()) {
                    rVar.c(8);
                }
                i6 = 3;
                if (iA4 < 3) {
                    rVar.g();
                }
            } else {
                i6 = 3;
            }
            if (i7 == 0 && iA2 != i6) {
                rVar.g();
            }
            if (i7 == 2 && (iA2 == i6 || rVar.f())) {
                rVar.c(6);
            }
            if (rVar.f() && rVar.a(6) == 1 && rVar.a(8) == 1) {
                str = "audio/eac3-joc";
            } else {
                str = "audio/eac3";
            }
        } else {
            rVar.c(32);
            int iA8 = rVar.a(2);
            iA = a(iA8, rVar.a(6));
            rVar.c(8);
            int iA9 = rVar.a(3);
            if ((iA9 & 1) != 0 && iA9 != 1) {
                rVar.c(2);
            }
            if ((iA9 & 4) != 0) {
                rVar.c(2);
            }
            if (iA9 == 2) {
                rVar.c(2);
            }
            i2 = f[iA8];
            i3 = f40030h[iA9] + (rVar.f() ? 1 : 0);
            str = "audio/ac3";
            i4 = d;
        }
        return new b(str, i7, i3, i2, iA, i4);
    }

    public static int b(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f40029e[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i2 = iPosition; i2 <= iLimit; i2++) {
            if ((byteBuffer.getInt(i2 + 4) & (-16777217)) == -1167101192) {
                return i2 - iPosition;
            }
        }
        return -1;
    }

    public static int a(ByteBuffer byteBuffer, int i2) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + ((byteBuffer.get((byteBuffer.position() + i2) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = f;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = j;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + iArr2[i4]) * 2;
        }
        int i6 = f40031i[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }
}
