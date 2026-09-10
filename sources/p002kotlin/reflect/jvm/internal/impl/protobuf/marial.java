package p002kotlin.reflect.jvm.internal.impl.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public final class marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f31134apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f31135attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final InputStream f31136beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f31137competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f31138cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f31139dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f31140formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f31141impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f31142impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f31143marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f31144saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f31145taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f31146wireman;

    public marial(InputStream inputStream) {
        this.f31142impromptu = false;
        this.f31138cutely = Integer.MAX_VALUE;
        this.f31140formularize = 64;
        this.f31141impassible = 67108864;
        this.f31135attabal = new byte[4096];
        this.f31139dern = 0;
        this.f31143marial = 0;
        this.f31145taiyuan = 0;
        this.f31136beachfront = inputStream;
        this.f31144saneness = false;
    }

    public static marial competently(InputStream inputStream) {
        return new marial(inputStream);
    }

    public static long dern(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static marial impromptu(impassible impassibleVar) {
        marial marialVar = new marial(impassibleVar);
        try {
            marialVar.cutely(impassibleVar.size());
            return marialVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int saneness(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static int stratoscope(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public <T extends triweekly> T adultoid(arytenoidectomy<T> arytenoidectomyVar, beachfront beachfrontVar) throws IOException {
        int iCuirassed = cuirassed();
        if (this.f31134apical >= this.f31140formularize) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iCutely = cutely(iCuirassed);
        this.f31134apical++;
        T tDern = arytenoidectomyVar.dern(this, beachfrontVar);
        attabal(0);
        this.f31134apical--;
        taiyuan(iCutely);
        return tDern;
    }

    public boolean apical() throws IOException {
        return trm() != 0;
    }

    public long arytenoidectomy() throws IOException {
        return cord();
    }

    public void attabal(int i) throws InvalidProtocolBufferException {
        if (this.f31137competently != i) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public boolean beachfront() throws IOException {
        return this.f31143marial == this.f31139dern && !peridotite(1);
    }

    public long cord() throws IOException {
        int i = this.f31143marial;
        if (this.f31139dern - i < 8) {
            privatdozent(8);
            i = this.f31143marial;
        }
        byte[] bArr = this.f31135attabal;
        this.f31143marial = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public boolean creditor(int i, CodedOutputStream codedOutputStream) throws IOException {
        int iSaneness = WireFormat.saneness(i);
        if (iSaneness == 0) {
            long jGraveside = graveside();
            codedOutputStream.sensatory(i);
            codedOutputStream.achondroplasia(jGraveside);
            return true;
        }
        if (iSaneness == 1) {
            long jCord = cord();
            codedOutputStream.sensatory(i);
            codedOutputStream.splinterproof(jCord);
            return true;
        }
        if (iSaneness == 2) {
            wireman wiremanVarFormularize = formularize();
            codedOutputStream.sensatory(i);
            codedOutputStream.creditor(wiremanVarFormularize);
            return true;
        }
        if (iSaneness == 3) {
            codedOutputStream.sensatory(i);
            starveling(codedOutputStream);
            int iDern = WireFormat.dern(WireFormat.attabal(i), 4);
            attabal(iDern);
            codedOutputStream.sensatory(iDern);
            return true;
        }
        if (iSaneness == 4) {
            return false;
        }
        if (iSaneness != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iPreprohormone = preprohormone();
        codedOutputStream.sensatory(i);
        codedOutputStream.mathsort(iPreprohormone);
        return true;
    }

    public int cuirassed() throws IOException {
        int i;
        int i2 = this.f31143marial;
        int i3 = this.f31139dern;
        if (i3 != i2) {
            byte[] bArr = this.f31135attabal;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f31143marial = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        long j3 = i10;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (int) (((long) (i10 ^ (b2 << 28))) ^ 266354560);
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f31143marial = i5;
                return i;
            }
        }
        return (int) oilcan();
    }

    public int cutely(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = i + this.f31145taiyuan + this.f31143marial;
        int i3 = this.f31138cutely;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f31138cutely = i2;
        saran();
        return i3;
    }

    public void dovishness(triweekly.attabal attabalVar, beachfront beachfrontVar) throws IOException {
        int iCuirassed = cuirassed();
        if (this.f31134apical >= this.f31140formularize) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iCutely = cutely(iCuirassed);
        this.f31134apical++;
        attabalVar.cutely(this, beachfrontVar);
        attabal(0);
        this.f31134apical--;
        taiyuan(iCutely);
    }

    public wireman formularize() throws IOException {
        int iCuirassed = cuirassed();
        int i = this.f31139dern;
        int i2 = this.f31143marial;
        if (iCuirassed > i - i2 || iCuirassed <= 0) {
            return iCuirassed == 0 ? wireman.f31186kowloon : new impassible(rotuma(iCuirassed));
        }
        wireman dernVar = (this.f31144saneness && this.f31142impromptu) ? new dern(this.f31135attabal, this.f31143marial, iCuirassed) : wireman.beachfront(this.f31135attabal, i2, iCuirassed);
        this.f31143marial += iCuirassed;
        return dernVar;
    }

    public byte gintrap() throws IOException {
        if (this.f31143marial == this.f31139dern) {
            privatdozent(1);
        }
        byte[] bArr = this.f31135attabal;
        int i = this.f31143marial;
        this.f31143marial = i + 1;
        return bArr[i];
    }

    public long graveside() throws IOException {
        return trm();
    }

    public long grimness() throws IOException {
        return trm();
    }

    public void hydrovane(int i) throws IOException {
        int i2 = this.f31139dern;
        int i3 = this.f31143marial;
        if (i > i2 - i3 || i < 0) {
            walach(i);
        } else {
            this.f31143marial = i3 + i;
        }
    }

    public double impassible() throws IOException {
        return Double.longBitsToDouble(cord());
    }

    public int kattegat() throws IOException {
        return saneness(cuirassed());
    }

    public int kowloon() throws IOException {
        return preprohormone();
    }

    public int marial() {
        int i = this.f31138cutely;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f31145taiyuan + this.f31143marial);
    }

    public String merc() throws IOException {
        byte[] bArrRotuma;
        int iCuirassed = cuirassed();
        int i = this.f31143marial;
        if (iCuirassed <= this.f31139dern - i && iCuirassed > 0) {
            bArrRotuma = this.f31135attabal;
            this.f31143marial = i + iCuirassed;
        } else {
            if (iCuirassed == 0) {
                return "";
            }
            bArrRotuma = rotuma(iCuirassed);
            i = 0;
        }
        if (adultoid.beachfront(bArrRotuma, i, i + iCuirassed)) {
            return new String(bArrRotuma, i, iCuirassed, C.UTF8_NAME);
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int molybdenite() throws IOException {
        return cuirassed();
    }

    public float monoploid() throws IOException {
        return Float.intBitsToFloat(preprohormone());
    }

    public long oilcan() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bGintrap = gintrap();
            j |= ((long) (bGintrap & 127)) << i;
            if ((bGintrap & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public final boolean peridotite(int i) throws IOException {
        int i2 = this.f31143marial;
        int i3 = i2 + i;
        int i4 = this.f31139dern;
        if (i3 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        if (this.f31145taiyuan + i2 + i <= this.f31138cutely && this.f31136beachfront != null) {
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f31135attabal;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f31145taiyuan += i2;
                this.f31139dern -= i2;
                this.f31143marial = 0;
            }
            InputStream inputStream = this.f31136beachfront;
            byte[] bArr2 = this.f31135attabal;
            int i5 = this.f31139dern;
            int i6 = inputStream.read(bArr2, i5, bArr2.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > this.f31135attabal.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(i6);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i6 > 0) {
                this.f31139dern += i6;
                if ((this.f31145taiyuan + i) - this.f31141impassible > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                saran();
                if (this.f31139dern >= i) {
                    return true;
                }
                return peridotite(i);
            }
        }
        return false;
    }

    public int polder() throws IOException {
        if (beachfront()) {
            this.f31137competently = 0;
            return 0;
        }
        int iCuirassed = cuirassed();
        this.f31137competently = iCuirassed;
        if (WireFormat.attabal(iCuirassed) != 0) {
            return this.f31137competently;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public void polloi(int i, triweekly.attabal attabalVar, beachfront beachfrontVar) throws IOException {
        int i2 = this.f31134apical;
        if (i2 >= this.f31140formularize) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.f31134apical = i2 + 1;
        attabalVar.cutely(this, beachfrontVar);
        attabal(WireFormat.dern(i, 4));
        this.f31134apical--;
    }

    public int preprohormone() throws IOException {
        int i = this.f31143marial;
        if (this.f31139dern - i < 4) {
            privatdozent(4);
            i = this.f31143marial;
        }
        byte[] bArr = this.f31135attabal;
        this.f31143marial = i + 4;
        return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final void privatdozent(int i) throws IOException {
        if (!peridotite(i)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public String restrictive() throws IOException {
        int iCuirassed = cuirassed();
        int i = this.f31139dern;
        int i2 = this.f31143marial;
        if (iCuirassed > i - i2 || iCuirassed <= 0) {
            return iCuirassed == 0 ? "" : new String(rotuma(iCuirassed), C.UTF8_NAME);
        }
        String str = new String(this.f31135attabal, i2, iCuirassed, C.UTF8_NAME);
        this.f31143marial += iCuirassed;
        return str;
    }

    public final byte[] rotuma(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return impromptu.f31132attabal;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f31145taiyuan;
        int i3 = this.f31143marial;
        int i4 = i2 + i3 + i;
        int i5 = this.f31138cutely;
        if (i4 > i5) {
            hydrovane((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i6 = this.f31139dern - i3;
            System.arraycopy(this.f31135attabal, i3, bArr, 0, i6);
            this.f31143marial = this.f31139dern;
            int i7 = i - i6;
            wireman(i7);
            System.arraycopy(this.f31135attabal, 0, bArr, i6, i7);
            this.f31143marial = i7;
            return bArr;
        }
        int i8 = this.f31139dern;
        this.f31145taiyuan = i2 + i8;
        this.f31143marial = 0;
        this.f31139dern = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr2 = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                InputStream inputStream = this.f31136beachfront;
                int i11 = inputStream == null ? -1 : inputStream.read(bArr2, i10, iMin - i10);
                if (i11 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f31145taiyuan += i11;
                i10 += i11;
            }
            i9 -= iMin;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        System.arraycopy(this.f31135attabal, i3, bArr3, 0, length);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
            length += bArr4.length;
        }
        return bArr3;
    }

    public final void saran() {
        int i = this.f31139dern + this.f31146wireman;
        this.f31139dern = i;
        int i2 = this.f31145taiyuan + i;
        int i3 = this.f31138cutely;
        if (i2 <= i3) {
            this.f31146wireman = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f31146wireman = i4;
        this.f31139dern = i - i4;
    }

    public long sealless() throws IOException {
        return cord();
    }

    public int seminary() throws IOException {
        return cuirassed();
    }

    public void starveling(CodedOutputStream codedOutputStream) throws IOException {
        int iPolder;
        do {
            iPolder = polder();
            if (iPolder == 0) {
                return;
            }
        } while (creditor(iPolder, codedOutputStream));
    }

    public long supplicat() throws IOException {
        return dern(trm());
    }

    public void taiyuan(int i) {
        this.f31138cutely = i;
        saran();
    }

    public int triweekly() throws IOException {
        return cuirassed();
    }

    public long trm() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.f31143marial;
        int i2 = this.f31139dern;
        if (i2 != i) {
            byte[] bArr = this.f31135attabal;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f31143marial = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                long j4 = (bArr[i3] << 7) ^ b;
                if (j4 >= 0) {
                    int i5 = i + 3;
                    long j5 = j4 ^ ((long) (bArr[i4] << 14));
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i4 = i + 4;
                        j4 = j5 ^ ((long) (bArr[i5] << 21));
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i5 = i + 5;
                            j5 = j4 ^ (((long) bArr[i4]) << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i4 = i + 6;
                                j4 = j5 ^ (((long) bArr[i5]) << 35);
                                if (j4 >= 0) {
                                    i5 = i + 7;
                                    j5 = j4 ^ (((long) bArr[i4]) << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j4 = j5 ^ (((long) bArr[i5]) << 49);
                                        if (j4 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i5 = i + 9;
                                            long j6 = (j4 ^ (((long) bArr[i4]) << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i5] >= 0) {
                                                    j = j6;
                                                }
                                            } else {
                                                j = j6;
                                                i4 = i5;
                                            }
                                        }
                                    }
                                    this.f31143marial = i4;
                                    return j;
                                }
                                j2 = -34093383808L;
                            }
                        }
                    }
                    j = j5 ^ j3;
                    i4 = i5;
                    this.f31143marial = i4;
                    return j;
                }
                j2 = -128;
                j = j4 ^ j2;
                this.f31143marial = i4;
                return j;
            }
        }
        return oilcan();
    }

    public final void walach(int i) throws IOException {
        if (i < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i2 = this.f31145taiyuan;
        int i3 = this.f31143marial;
        int i4 = i2 + i3 + i;
        int i5 = this.f31138cutely;
        if (i4 > i5) {
            hydrovane((i5 - i2) - i3);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i6 = this.f31139dern;
        int i7 = i6 - i3;
        this.f31143marial = i6;
        privatdozent(1);
        while (true) {
            int i8 = i - i7;
            int i9 = this.f31139dern;
            if (i8 <= i9) {
                this.f31143marial = i8;
                return;
            } else {
                i7 += i9;
                this.f31143marial = i9;
                privatdozent(1);
            }
        }
    }

    public final void wireman(int i) throws IOException {
        if (this.f31139dern - this.f31143marial < i) {
            privatdozent(i);
        }
    }

    public int yemenite() throws IOException {
        return preprohormone();
    }

    public marial(impassible impassibleVar) {
        this.f31142impromptu = false;
        this.f31138cutely = Integer.MAX_VALUE;
        this.f31140formularize = 64;
        this.f31141impassible = 67108864;
        this.f31135attabal = impassibleVar.f31127arytenoidectomy;
        int iCuirassed = impassibleVar.cuirassed();
        this.f31143marial = iCuirassed;
        this.f31139dern = iCuirassed + impassibleVar.size();
        this.f31145taiyuan = -this.f31143marial;
        this.f31136beachfront = null;
        this.f31144saneness = true;
    }
}
