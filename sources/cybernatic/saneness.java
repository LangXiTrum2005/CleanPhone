package cybernatic;

import androidx.media3.common.DrmInitData;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.nio.ByteBuffer;
import org.objectweb.asm.Opcodes;

/* JADX INFO: compiled from: Ac3Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final int[] f24746attabal = {1, 2, 3, 6};

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final int[] f24750saneness = {48000, 44100, 32000};

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int[] f24748dern = {24000, 22050, 16000};

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final int[] f24751wireman = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int[] f24749marial = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int[] f24747beachfront = {69, 87, 104, 121, Opcodes.F2I, Opcodes.FRETURN, Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: cybernatic.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Ac3Util.java */
    public static final class C0583saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f24752attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f24753beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final int f24754competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final int f24755dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final int f24756marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f24757saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int f24758wireman;

        public C0583saneness(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.f24752attabal = str;
            this.f24757saneness = i;
            this.f24758wireman = i2;
            this.f24755dern = i3;
            this.f24756marial = i4;
            this.f24753beachfront = i5;
            this.f24754competently = i6;
        }
    }

    public static int attabal(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    public static C0583saneness beachfront(decarock.cuirassed cuirassedVar) {
        int iDern;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iMarial = cuirassedVar.marial();
        cuirassedVar.polloi(40);
        boolean z = cuirassedVar.impromptu(5) > 10;
        cuirassedVar.arytenoidectomy(iMarial);
        int i10 = -1;
        if (z) {
            cuirassedVar.polloi(16);
            int iImpromptu = cuirassedVar.impromptu(2);
            if (iImpromptu == 0) {
                i10 = 0;
            } else if (iImpromptu == 1) {
                i10 = 1;
            } else if (iImpromptu == 2) {
                i10 = 2;
            }
            cuirassedVar.polloi(3);
            iDern = (cuirassedVar.impromptu(11) + 1) * 2;
            int iImpromptu2 = cuirassedVar.impromptu(2);
            if (iImpromptu2 == 3) {
                i = f24748dern[cuirassedVar.impromptu(2)];
                i5 = 3;
                i6 = 6;
            } else {
                int iImpromptu3 = cuirassedVar.impromptu(2);
                int i11 = f24746attabal[iImpromptu3];
                i5 = iImpromptu3;
                i = f24750saneness[iImpromptu2];
                i6 = i11;
            }
            i3 = i6 * 256;
            int iAttabal = attabal(iDern, i, i6);
            int iImpromptu4 = cuirassedVar.impromptu(3);
            boolean zCompetently = cuirassedVar.competently();
            i2 = f24751wireman[iImpromptu4] + (zCompetently ? 1 : 0);
            cuirassedVar.polloi(10);
            if (cuirassedVar.competently()) {
                cuirassedVar.polloi(8);
            }
            if (iImpromptu4 == 0) {
                cuirassedVar.polloi(5);
                if (cuirassedVar.competently()) {
                    cuirassedVar.polloi(8);
                }
            }
            if (i10 == 1 && cuirassedVar.competently()) {
                cuirassedVar.polloi(16);
            }
            if (cuirassedVar.competently()) {
                if (iImpromptu4 > 2) {
                    cuirassedVar.polloi(2);
                }
                if ((iImpromptu4 & 1) == 0 || iImpromptu4 <= 2) {
                    i8 = 6;
                } else {
                    i8 = 6;
                    cuirassedVar.polloi(6);
                }
                if ((iImpromptu4 & 4) != 0) {
                    cuirassedVar.polloi(i8);
                }
                if (zCompetently && cuirassedVar.competently()) {
                    cuirassedVar.polloi(5);
                }
                if (i10 == 0) {
                    if (cuirassedVar.competently()) {
                        i9 = 6;
                        cuirassedVar.polloi(6);
                    } else {
                        i9 = 6;
                    }
                    if (iImpromptu4 == 0 && cuirassedVar.competently()) {
                        cuirassedVar.polloi(i9);
                    }
                    if (cuirassedVar.competently()) {
                        cuirassedVar.polloi(i9);
                    }
                    int iImpromptu5 = cuirassedVar.impromptu(2);
                    if (iImpromptu5 == 1) {
                        cuirassedVar.polloi(5);
                    } else if (iImpromptu5 == 2) {
                        cuirassedVar.polloi(12);
                    } else if (iImpromptu5 == 3) {
                        int iImpromptu6 = cuirassedVar.impromptu(5);
                        if (cuirassedVar.competently()) {
                            cuirassedVar.polloi(5);
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(4);
                            }
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(4);
                            }
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(4);
                            }
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(4);
                            }
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(4);
                            }
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(4);
                            }
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(4);
                            }
                            if (cuirassedVar.competently()) {
                                if (cuirassedVar.competently()) {
                                    cuirassedVar.polloi(4);
                                }
                                if (cuirassedVar.competently()) {
                                    cuirassedVar.polloi(4);
                                }
                            }
                        }
                        if (cuirassedVar.competently()) {
                            cuirassedVar.polloi(5);
                            if (cuirassedVar.competently()) {
                                cuirassedVar.polloi(7);
                                if (cuirassedVar.competently()) {
                                    cuirassedVar.polloi(8);
                                }
                            }
                        }
                        cuirassedVar.polloi((iImpromptu6 + 2) * 8);
                        cuirassedVar.dern();
                    }
                    if (iImpromptu4 < 2) {
                        if (cuirassedVar.competently()) {
                            cuirassedVar.polloi(14);
                        }
                        if (iImpromptu4 == 0 && cuirassedVar.competently()) {
                            cuirassedVar.polloi(14);
                        }
                    }
                    if (cuirassedVar.competently()) {
                        if (i5 == 0) {
                            cuirassedVar.polloi(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (cuirassedVar.competently()) {
                                    cuirassedVar.polloi(5);
                                }
                            }
                        }
                    }
                }
            }
            if (cuirassedVar.competently()) {
                cuirassedVar.polloi(5);
                if (iImpromptu4 == 2) {
                    cuirassedVar.polloi(4);
                }
                if (iImpromptu4 >= 6) {
                    cuirassedVar.polloi(2);
                }
                if (cuirassedVar.competently()) {
                    cuirassedVar.polloi(8);
                }
                if (iImpromptu4 == 0 && cuirassedVar.competently()) {
                    cuirassedVar.polloi(8);
                }
                if (iImpromptu2 < 3) {
                    cuirassedVar.monoploid();
                }
            }
            if (i10 == 0 && i5 != 3) {
                cuirassedVar.monoploid();
            }
            if (i10 == 2 && (i5 == 3 || cuirassedVar.competently())) {
                i7 = 6;
                cuirassedVar.polloi(6);
            } else {
                i7 = 6;
            }
            str = (cuirassedVar.competently() && cuirassedVar.impromptu(i7) == 1 && cuirassedVar.impromptu(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i4 = iAttabal;
        } else {
            cuirassedVar.polloi(32);
            int iImpromptu7 = cuirassedVar.impromptu(2);
            String str2 = iImpromptu7 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iImpromptu8 = cuirassedVar.impromptu(6);
            int i13 = f24749marial[iImpromptu8 / 2] * 1000;
            iDern = dern(iImpromptu7, iImpromptu8);
            cuirassedVar.polloi(8);
            int iImpromptu9 = cuirassedVar.impromptu(3);
            if ((iImpromptu9 & 1) != 0 && iImpromptu9 != 1) {
                cuirassedVar.polloi(2);
            }
            if ((iImpromptu9 & 4) != 0) {
                cuirassedVar.polloi(2);
            }
            if (iImpromptu9 == 2) {
                cuirassedVar.polloi(2);
            }
            int[] iArr = f24750saneness;
            i = iImpromptu7 < iArr.length ? iArr[iImpromptu7] : -1;
            i2 = f24751wireman[iImpromptu9] + (cuirassedVar.competently() ? 1 : 0);
            i3 = 1536;
            str = str2;
            i4 = i13;
        }
        return new C0583saneness(str, i10, i2, i, iDern, i3, i4);
    }

    public static int competently(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return dern((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
    }

    public static int cutely(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                return 40 << ((bArr[(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int dern(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f24750saneness;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f24747beachfront;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f24749marial[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static androidx.media3.common.polloi impromptu(decarock.stratoscope stratoscopeVar, String str, String str2, DrmInitData drmInitData) {
        String str3;
        decarock.cuirassed cuirassedVar = new decarock.cuirassed();
        cuirassedVar.impassible(stratoscopeVar);
        int iImpromptu = cuirassedVar.impromptu(13) * 1000;
        cuirassedVar.polloi(3);
        int i = f24750saneness[cuirassedVar.impromptu(2)];
        cuirassedVar.polloi(10);
        int i2 = f24751wireman[cuirassedVar.impromptu(3)];
        if (cuirassedVar.impromptu(1) != 0) {
            i2++;
        }
        cuirassedVar.polloi(3);
        int iImpromptu2 = cuirassedVar.impromptu(4);
        cuirassedVar.polloi(1);
        if (iImpromptu2 > 0) {
            cuirassedVar.polloi(6);
            if (cuirassedVar.impromptu(1) != 0) {
                i2 += 2;
            }
            cuirassedVar.polloi(1);
        }
        if (cuirassedVar.saneness() > 7) {
            cuirassedVar.polloi(7);
            if (cuirassedVar.impromptu(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = MimeTypes.AUDIO_E_AC3;
            }
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        cuirassedVar.dern();
        stratoscopeVar.mathsort(cuirassedVar.wireman());
        return new androidx.media3.common.polloi.saneness().cultivated(str).sensatory(str3).saran(i2).underbelly(i).mathsort(drmInitData).treadless(str2).lotta(iImpromptu).polder();
    }

    public static int marial(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f24746attabal[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int saneness(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((decarock.grimness.saran(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int taiyuan(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static androidx.media3.common.polloi wireman(decarock.stratoscope stratoscopeVar, String str, String str2, DrmInitData drmInitData) {
        decarock.cuirassed cuirassedVar = new decarock.cuirassed();
        cuirassedVar.impassible(stratoscopeVar);
        int i = f24750saneness[cuirassedVar.impromptu(2)];
        cuirassedVar.polloi(8);
        int i2 = f24751wireman[cuirassedVar.impromptu(3)];
        if (cuirassedVar.impromptu(1) != 0) {
            i2++;
        }
        int i3 = f24749marial[cuirassedVar.impromptu(5)] * 1000;
        cuirassedVar.dern();
        stratoscopeVar.mathsort(cuirassedVar.wireman());
        return new androidx.media3.common.polloi.saneness().cultivated(str).sensatory(MimeTypes.AUDIO_AC3).saran(i2).underbelly(i).mathsort(drmInitData).treadless(str2).grimness(i3).lotta(i3).polder();
    }
}
