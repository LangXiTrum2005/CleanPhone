package decarock;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Utf8;
import com.google.common.collect.ImmutableSet;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class stratoscope {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public byte[] f25137attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f25138dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f25139saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final char[] f25136wireman = {'\r', '\n'};

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final char[] f25135marial = {'\n'};

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final ImmutableSet<Charset> f25134beachfront = ImmutableSet.of(com.google.common.base.dern.f21532attabal, com.google.common.base.dern.f21534dern, com.google.common.base.dern.f21533beachfront, com.google.common.base.dern.f21537wireman, com.google.common.base.dern.f21535marial);

    public stratoscope() {
        this.f25137attabal = grimness.f25081beachfront;
    }

    public int adultoid() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i4 = i + 2;
        this.f25139saneness = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        int i6 = i + 3;
        this.f25139saneness = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        this.f25139saneness = i + 4;
        return ((bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i7;
    }

    public void apical(cuirassed cuirassedVar, int i) {
        formularize(cuirassedVar.f25071attabal, 0, i);
        cuirassedVar.arytenoidectomy(0);
    }

    public float arytenoidectomy() {
        return Float.intBitsToFloat(monoploid());
    }

    public int attabal() {
        return this.f25138dern - this.f25139saneness;
    }

    public int beachfront() {
        return this.f25139saneness;
    }

    public int competently() {
        return this.f25138dern;
    }

    public int cord() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f25139saneness = i + 2;
        return ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
    }

    public Charset creditor() {
        if (attabal() >= 3) {
            byte[] bArr = this.f25137attabal;
            int i = this.f25139saneness;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f25139saneness = i + 3;
                return com.google.common.base.dern.f21534dern;
            }
        }
        if (attabal() < 2) {
            return null;
        }
        byte[] bArr2 = this.f25137attabal;
        int i2 = this.f25139saneness;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f25139saneness = i2 + 2;
            return com.google.common.base.dern.f21537wireman;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f25139saneness = i2 + 2;
        return com.google.common.base.dern.f21535marial;
    }

    public long cuirassed() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f25139saneness = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f25139saneness = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f25139saneness = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f25139saneness = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f25139saneness = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f25139saneness = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f25139saneness = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    public int cutely() {
        return this.f25137attabal[this.f25139saneness] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public void dern(int i) {
        if (i > saneness()) {
            this.f25137attabal = Arrays.copyOf(this.f25137attabal, i);
        }
    }

    public long dovishness() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f25139saneness = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f25139saneness = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f25139saneness = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f25139saneness = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f25139saneness = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f25139saneness = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f25139saneness = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    public void formularize(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f25137attabal, this.f25139saneness, bArr, i, i2);
        this.f25139saneness += i2;
    }

    public short gintrap() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        this.f25139saneness = i + 2;
        return (short) (((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3);
    }

    public String graveside(Charset charset) {
        attabal.saneness(f25134beachfront.contains(charset), "Unsupported charset: " + charset);
        if (attabal() == 0) {
            return null;
        }
        if (!charset.equals(com.google.common.base.dern.f21532attabal)) {
            creditor();
        }
        String strSealless = sealless(wireman(charset) - this.f25139saneness, charset);
        if (this.f25139saneness == this.f25138dern) {
            return strSealless;
        }
        overspeculate(charset);
        return strSealless;
    }

    public long grimness() {
        long jCuirassed = cuirassed();
        if (jCuirassed >= 0) {
            return jCuirassed;
        }
        throw new IllegalStateException("Top bit not zero: " + jCuirassed);
    }

    public void hydrovane(byte[] bArr) {
        walach(bArr, bArr.length);
    }

    public final char impassible(Charset charset, char[] cArr) {
        int iTaiyuan = taiyuan(charset);
        if (iTaiyuan == 0) {
            return (char) 0;
        }
        char c = (char) (iTaiyuan >> 16);
        if (!com.google.common.primitives.saneness.saneness(cArr, c)) {
            return (char) 0;
        }
        this.f25139saneness += iTaiyuan & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return c;
    }

    public char impromptu(Charset charset) {
        attabal.saneness(f25134beachfront.contains(charset), "Unsupported charset: " + charset);
        return (char) (taiyuan(charset) >> 16);
    }

    public int kattegat() {
        return (supplicat() << 21) | (supplicat() << 14) | (supplicat() << 7) | supplicat();
    }

    public double kowloon() {
        return Double.longBitsToDouble(cuirassed());
    }

    public byte[] marial() {
        return this.f25137attabal;
    }

    public void mathsort(int i) {
        attabal.attabal(i >= 0 && i <= this.f25138dern);
        this.f25139saneness = i;
    }

    public long merc() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f25139saneness = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f25139saneness = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f25139saneness = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    public String molybdenite() {
        return graveside(com.google.common.base.dern.f21534dern);
    }

    public int monoploid() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        int i4 = i + 2;
        this.f25139saneness = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | i3;
        int i6 = i + 3;
        this.f25139saneness = i6;
        int i7 = i5 | ((bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        this.f25139saneness = i + 4;
        return (bArr[i6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i7;
    }

    public short oilcan() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f25139saneness = i + 2;
        return (short) ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3);
    }

    public final void overspeculate(Charset charset) {
        if (impassible(charset, f25136wireman) == '\r') {
            impassible(charset, f25135marial);
        }
    }

    public void peridotite(int i) {
        attabal.attabal(i >= 0 && i <= this.f25137attabal.length);
        this.f25138dern = i;
    }

    public int polder() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        int i4 = i + 2;
        this.f25139saneness = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        this.f25139saneness = i + 3;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
    }

    public int polloi() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        int i4 = i + 2;
        this.f25139saneness = i4;
        int i5 = ((bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | i3;
        this.f25139saneness = i + 3;
        return (bArr[i4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i5;
    }

    public int preprohormone() {
        int iAdultoid = adultoid();
        if (iAdultoid >= 0) {
            return iAdultoid;
        }
        throw new IllegalStateException("Top bit not zero: " + iAdultoid);
    }

    public long privatdozent() {
        int i;
        int i2;
        long j = this.f25137attabal[this.f25139saneness];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f25137attabal[this.f25139saneness + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & Utf8.REPLACEMENT_BYTE));
        }
        this.f25139saneness += i2;
        return j;
    }

    public int restrictive() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f25139saneness = i + 2;
        int i4 = (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3;
        this.f25139saneness = i + 4;
        return i4;
    }

    public long rotuma() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f25139saneness = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f25139saneness = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f25139saneness = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    public int saneness() {
        return this.f25137attabal.length;
    }

    public int saran() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        int i2 = i + 1;
        this.f25139saneness = i2;
        int i3 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        this.f25139saneness = i + 2;
        return (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i3;
    }

    public String sealless(int i, Charset charset) {
        String str = new String(this.f25137attabal, this.f25139saneness, i, charset);
        this.f25139saneness += i;
        return str;
    }

    public int seminary() {
        int iMonoploid = monoploid();
        if (iMonoploid >= 0) {
            return iMonoploid;
        }
        throw new IllegalStateException("Top bit not zero: " + iMonoploid);
    }

    public void splinterproof(int i) {
        mathsort(this.f25139saneness + i);
    }

    public void starveling(int i) {
        walach(saneness() < i ? new byte[i] : this.f25137attabal, i);
    }

    public String stratoscope() {
        return triweekly((char) 0);
    }

    public int supplicat() {
        byte[] bArr = this.f25137attabal;
        int i = this.f25139saneness;
        this.f25139saneness = i + 1;
        return bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int taiyuan(Charset charset) {
        byte bAttabal;
        char cDern;
        int i = 1;
        if ((charset.equals(com.google.common.base.dern.f21534dern) || charset.equals(com.google.common.base.dern.f21532attabal)) && attabal() >= 1) {
            bAttabal = (byte) com.google.common.primitives.saneness.attabal(com.google.common.primitives.competently.saneness(this.f25137attabal[this.f25139saneness]));
        } else {
            if ((charset.equals(com.google.common.base.dern.f21533beachfront) || charset.equals(com.google.common.base.dern.f21537wireman)) && attabal() >= 2) {
                byte[] bArr = this.f25137attabal;
                int i2 = this.f25139saneness;
                cDern = com.google.common.primitives.saneness.dern(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(com.google.common.base.dern.f21535marial) || attabal() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f25137attabal;
                int i3 = this.f25139saneness;
                cDern = com.google.common.primitives.saneness.dern(bArr2[i3 + 1], bArr2[i3]);
            }
            bAttabal = (byte) cDern;
            i = 2;
        }
        return (com.google.common.primitives.saneness.attabal(bAttabal) << 16) + i;
    }

    public String triweekly(char c) {
        if (attabal() == 0) {
            return null;
        }
        int i = this.f25139saneness;
        while (i < this.f25138dern && this.f25137attabal[i] != c) {
            i++;
        }
        byte[] bArr = this.f25137attabal;
        int i2 = this.f25139saneness;
        String strSupplicat = grimness.supplicat(bArr, i2, i - i2);
        this.f25139saneness = i;
        if (i < this.f25138dern) {
            this.f25139saneness = i + 1;
        }
        return strSupplicat;
    }

    public String trm(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f25139saneness;
        int i3 = (i2 + i) - 1;
        String strSupplicat = grimness.supplicat(this.f25137attabal, i2, (i3 >= this.f25138dern || this.f25137attabal[i3] != 0) ? i : i - 1);
        this.f25139saneness += i;
        return strSupplicat;
    }

    public void walach(byte[] bArr, int i) {
        this.f25137attabal = bArr;
        this.f25138dern = i;
        this.f25139saneness = 0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3 A[SYNTHETIC] */
    public final int wireman(Charset charset) {
        int i;
        byte[] bArr;
        if (charset.equals(com.google.common.base.dern.f21534dern) || charset.equals(com.google.common.base.dern.f21532attabal)) {
            i = 1;
        } else {
            if (!charset.equals(com.google.common.base.dern.f21533beachfront) && !charset.equals(com.google.common.base.dern.f21535marial) && !charset.equals(com.google.common.base.dern.f21537wireman)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f25139saneness;
        while (true) {
            int i3 = this.f25138dern;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((!charset.equals(com.google.common.base.dern.f21534dern) && !charset.equals(com.google.common.base.dern.f21532attabal)) || !grimness.julian(this.f25137attabal[i2])) {
                if (charset.equals(com.google.common.base.dern.f21533beachfront) || charset.equals(com.google.common.base.dern.f21537wireman)) {
                    byte[] bArr2 = this.f25137attabal;
                    if (bArr2[i2] != 0 || !grimness.julian(bArr2[i2 + 1])) {
                        if (charset.equals(com.google.common.base.dern.f21535marial)) {
                            bArr = this.f25137attabal;
                            if (bArr[i2 + 1] != 0 || !grimness.julian(bArr[i2])) {
                            }
                        }
                        i2 += i;
                    }
                } else {
                    if (charset.equals(com.google.common.base.dern.f21535marial)) {
                        bArr = this.f25137attabal;
                        if (bArr[i2 + 1] != 0) {
                            continue;
                        }
                    }
                    i2 += i;
                }
            }
            return i2;
        }
    }

    public String yemenite(int i) {
        return sealless(i, com.google.common.base.dern.f21534dern);
    }

    public stratoscope(int i) {
        this.f25137attabal = new byte[i];
        this.f25138dern = i;
    }

    public stratoscope(byte[] bArr) {
        this.f25137attabal = bArr;
        this.f25138dern = bArr.length;
    }

    public stratoscope(byte[] bArr, int i) {
        this.f25137attabal = bArr;
        this.f25138dern = i;
    }
}
