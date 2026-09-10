package affiche;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Base64.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Charset f3918attabal = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: compiled from: Base64.java */
    public static abstract class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public byte[] f3919attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f3920saneness;
    }

    /* JADX INFO: compiled from: Base64.java */
    public static class saneness extends attabal {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f3923dern;
        private int value;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final int[] f3924wireman;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final int[] f3922marial = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final int[] f3921beachfront = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        public saneness(int i, byte[] bArr) {
            this.f3919attabal = bArr;
            this.f3924wireman = (i & 8) == 0 ? f3922marial : f3921beachfront;
            this.f3923dern = 0;
            this.value = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        public boolean attabal(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.f3923dern;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.value;
            byte[] bArr2 = this.f3919attabal;
            int[] iArr = this.f3924wireman;
            int i6 = 0;
            int i7 = i5;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4 || (i7 = (iArr[bArr[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 18) | (iArr[bArr[i9 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 12) | (iArr[bArr[i9 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED] << 6) | iArr[bArr[i9 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED]) < 0) {
                            break;
                        }
                        bArr2[i6 + 2] = (byte) i7;
                        bArr2[i6 + 1] = (byte) (i7 >> 8);
                        bArr2[i6] = (byte) (i7 >> 16);
                        i6 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5 && i12 != -1) {
                                        this.f3923dern = 6;
                                        return false;
                                    }
                                } else if (i12 == -2) {
                                    i8++;
                                } else if (i12 != -1) {
                                    this.f3923dern = 6;
                                    return false;
                                }
                            } else if (i12 >= 0) {
                                int i13 = i12 | (i7 << 6);
                                bArr2[i6 + 2] = (byte) i13;
                                bArr2[i6 + 1] = (byte) (i13 >> 8);
                                bArr2[i6] = (byte) (i13 >> 16);
                                i6 += 3;
                                i7 = i13;
                                i8 = 0;
                            } else if (i12 == -2) {
                                bArr2[i6 + 1] = (byte) (i7 >> 2);
                                bArr2[i6] = (byte) (i7 >> 10);
                                i6 += 2;
                                i8 = 5;
                            } else if (i12 != -1) {
                                this.f3923dern = 6;
                                return false;
                            }
                        } else if (i12 >= 0) {
                            i12 |= i7 << 6;
                            i8++;
                            i7 = i12;
                        } else if (i12 == -2) {
                            bArr2[i6] = (byte) (i7 >> 4);
                            i6++;
                            i8 = 4;
                        } else if (i12 != -1) {
                            this.f3923dern = 6;
                            return false;
                        }
                    } else if (i12 >= 0) {
                        i12 |= i7 << 6;
                        i8++;
                        i7 = i12;
                    } else if (i12 != -1) {
                        this.f3923dern = 6;
                        return false;
                    }
                } else if (i12 >= 0) {
                    i8++;
                    i7 = i12;
                } else if (i12 != -1) {
                    this.f3923dern = 6;
                    return false;
                }
                i9 = i11;
            }
            if (!z) {
                this.f3923dern = i8;
                this.value = i7;
                this.f3920saneness = i6;
                return true;
            }
            if (i8 == 1) {
                this.f3923dern = 6;
                return false;
            }
            if (i8 == 2) {
                bArr2[i6] = (byte) (i7 >> 4);
                i6++;
            } else if (i8 == 3) {
                int i14 = i6 + 1;
                bArr2[i6] = (byte) (i7 >> 10);
                i6 += 2;
                bArr2[i14] = (byte) (i7 >> 2);
            } else if (i8 == 4) {
                this.f3923dern = 6;
                return false;
            }
            this.f3923dern = i8;
            this.f3920saneness = i6;
            return true;
        }
    }

    public static byte[] attabal(String str) {
        return saneness(str, 2);
    }

    public static byte[] dern(byte[] bArr, int i) {
        return wireman(bArr, 0, bArr.length, i);
    }

    public static byte[] marial(String str) {
        return saneness(str, 11);
    }

    public static byte[] saneness(String str, int i) {
        return dern(str.getBytes(f3918attabal), i);
    }

    public static byte[] wireman(byte[] bArr, int i, int i2, int i3) {
        saneness sanenessVar = new saneness(i3, new byte[(i2 * 3) / 4]);
        if (!sanenessVar.attabal(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i4 = sanenessVar.f3920saneness;
        byte[] bArr2 = sanenessVar.f3919attabal;
        if (i4 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr2, 0, bArr3, 0, i4);
        return bArr3;
    }
}
