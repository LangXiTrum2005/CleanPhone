package androidx.datastore.preferences.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class impromptu {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static volatile int f9725beachfront = 100;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f9726attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f9727dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f9728marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f9729saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public taiyuan f9730wireman;

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class dern extends impromptu {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public long f9731adultoid;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public boolean f9732apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f9733arytenoidectomy;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final Iterable<ByteBuffer> f9734competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final boolean f9735cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f9736formularize;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public long f9737graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f9738impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final Iterator<ByteBuffer> f9739impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f9740kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public long f9741molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f9742monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public long f9743polloi;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public ByteBuffer f9744taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f9745triweekly;

        private void splinterproof() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (seminary() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void walach() {
            int i = this.f9736formularize + this.f9738impassible;
            this.f9736formularize = i;
            int i2 = i - this.f9742monoploid;
            int i3 = this.f9745triweekly;
            if (i2 <= i3) {
                this.f9738impassible = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f9738impassible = i4;
            this.f9736formularize = i - i4;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long adultoid() throws IOException {
            return privatdozent();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean arytenoidectomy() throws IOException {
            return starveling() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f9740kowloon != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean beachfront() throws IOException {
            return (((long) this.f9733arytenoidectomy) + this.f9743polloi) - this.f9741molybdenite == ((long) this.f9736formularize);
        }

        public final void clubfoot() {
            ByteBuffer next = this.f9739impromptu.next();
            this.f9744taiyuan = next;
            this.f9733arytenoidectomy += (int) (this.f9743polloi - this.f9741molybdenite);
            long jPosition = next.position();
            this.f9743polloi = jPosition;
            this.f9741molybdenite = jPosition;
            this.f9731adultoid = this.f9744taiyuan.limit();
            long jApical = sayid.apical(this.f9744taiyuan);
            this.f9737graveside = jApical;
            this.f9743polloi += jApical;
            this.f9741molybdenite += jApical;
            this.f9731adultoid += jApical;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long cord() throws IOException {
            return privatdozent();
        }

        public int creditor() throws IOException {
            int i;
            long j = this.f9743polloi;
            if (this.f9731adultoid != j) {
                long j2 = j + 1;
                byte bDovishness = sayid.dovishness(j);
                if (bDovishness >= 0) {
                    this.f9743polloi++;
                    return bDovishness;
                }
                if (this.f9731adultoid - this.f9743polloi >= 10) {
                    long j3 = 2 + j;
                    int iDovishness = (sayid.dovishness(j2) << 7) ^ bDovishness;
                    if (iDovishness < 0) {
                        i = iDovishness ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iDovishness2 = (sayid.dovishness(j3) << 14) ^ iDovishness;
                        if (iDovishness2 >= 0) {
                            i = iDovishness2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iDovishness3 = iDovishness2 ^ (sayid.dovishness(j4) << 21);
                            if (iDovishness3 < 0) {
                                i = (-2080896) ^ iDovishness3;
                            } else {
                                j4 = 5 + j;
                                byte bDovishness2 = sayid.dovishness(j5);
                                int i2 = (iDovishness3 ^ (bDovishness2 << 28)) ^ 266354560;
                                if (bDovishness2 < 0) {
                                    j5 = 6 + j;
                                    if (sayid.dovishness(j4) < 0) {
                                        j4 = 7 + j;
                                        if (sayid.dovishness(j5) < 0) {
                                            j5 = 8 + j;
                                            if (sayid.dovishness(j4) < 0) {
                                                j4 = 9 + j;
                                                if (sayid.dovishness(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (sayid.dovishness(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.f9743polloi = j3;
                    return i;
                }
            }
            return (int) hydrovane();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int cuirassed() throws IOException {
            return impromptu.dern(creditor());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public float dovishness() throws IOException {
            return Float.intBitsToFloat(saran());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int gintrap() throws IOException {
            return creditor();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int graveside() throws IOException {
            return saran();
        }

        public final void grimness(byte[] bArr, int i, int i2) throws IOException {
            if (i2 < 0 || i2 > peridotite()) {
                if (i2 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i2 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (merc() == 0) {
                    polder();
                }
                int iMin = Math.min(i3, (int) merc());
                long j = iMin;
                sayid.kowloon(this.f9743polloi, bArr, (i2 - i3) + i, j);
                i3 -= iMin;
                this.f9743polloi += j;
            }
        }

        public long hydrovane() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bSeminary = seminary();
                j |= ((long) (bSeminary & 127)) << i;
                if ((bSeminary & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long kattegat() throws IOException {
            return starveling();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int kowloon(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iMarial = i + marial();
            int i2 = this.f9745triweekly;
            if (iMarial > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9745triweekly = iMarial;
            walach();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int marial() {
            return (int) ((((long) (this.f9733arytenoidectomy - this.f9742monoploid)) + this.f9743polloi) - this.f9741molybdenite);
        }

        public void mathsort(int i) throws IOException {
            if (i < 0 || i > (((long) (this.f9736formularize - this.f9733arytenoidectomy)) - this.f9743polloi) + this.f9741molybdenite) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i > 0) {
                if (merc() == 0) {
                    polder();
                }
                int iMin = Math.min(i, (int) merc());
                i -= iMin;
                this.f9743polloi += (long) iMin;
            }
        }

        public final long merc() {
            return this.f9731adultoid - this.f9743polloi;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int molybdenite() throws IOException {
            return creditor();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public ByteString monoploid() throws IOException {
            int iCreditor = creditor();
            if (iCreditor > 0) {
                long j = iCreditor;
                long j2 = this.f9731adultoid;
                long j3 = this.f9743polloi;
                if (j <= j2 - j3) {
                    if (this.f9735cutely && this.f9732apical) {
                        int i = (int) (j3 - this.f9737graveside);
                        ByteString byteStringWrap = ByteString.wrap(overspeculate(i, iCreditor + i));
                        this.f9743polloi += j;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[iCreditor];
                    sayid.kowloon(j3, bArr, 0L, j);
                    this.f9743polloi += j;
                    return ByteString.wrap(bArr);
                }
            }
            if (iCreditor <= 0 || iCreditor > peridotite()) {
                if (iCreditor == 0) {
                    return ByteString.EMPTY;
                }
                if (iCreditor < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.f9735cutely || !this.f9732apical) {
                byte[] bArr2 = new byte[iCreditor];
                grimness(bArr2, 0, iCreditor);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iCreditor > 0) {
                if (merc() == 0) {
                    polder();
                }
                int iMin = Math.min(iCreditor, (int) merc());
                int i2 = (int) (this.f9743polloi - this.f9737graveside);
                arrayList.add(ByteString.wrap(overspeculate(i2, i2 + iMin)));
                iCreditor -= iMin;
                this.f9743polloi += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String oilcan() throws IOException {
            int iCreditor = creditor();
            if (iCreditor > 0) {
                long j = iCreditor;
                long j2 = this.f9731adultoid;
                long j3 = this.f9743polloi;
                if (j <= j2 - j3) {
                    String strCompetently = Utf8.competently(this.f9744taiyuan, (int) (j3 - this.f9741molybdenite), iCreditor);
                    this.f9743polloi += j;
                    return strCompetently;
                }
            }
            if (iCreditor >= 0 && iCreditor <= peridotite()) {
                byte[] bArr = new byte[iCreditor];
                grimness(bArr, 0, iCreditor);
                return Utf8.impromptu(bArr, 0, iCreditor);
            }
            if (iCreditor == 0) {
                return "";
            }
            if (iCreditor <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final ByteBuffer overspeculate(int i, int i2) throws IOException {
            int iPosition = this.f9744taiyuan.position();
            int iLimit = this.f9744taiyuan.limit();
            ByteBuffer byteBuffer = this.f9744taiyuan;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    ByteBuffer byteBufferSlice = this.f9744taiyuan.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        public final int peridotite() {
            return (int) ((((long) (this.f9736formularize - this.f9733arytenoidectomy)) - this.f9743polloi) + this.f9741molybdenite);
        }

        public final void polder() throws InvalidProtocolBufferException {
            if (!this.f9739impromptu.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            clubfoot();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public double polloi() throws IOException {
            return Double.longBitsToDouble(privatdozent());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int preprohormone() throws IOException {
            return saran();
        }

        public long privatdozent() throws IOException {
            char c;
            long jSeminary;
            byte bSeminary;
            if (merc() >= 8) {
                long j = this.f9743polloi;
                this.f9743polloi = 8 + j;
                c = '8';
                jSeminary = (((long) sayid.dovishness(j)) & 255) | ((((long) sayid.dovishness(1 + j)) & 255) << 8) | ((((long) sayid.dovishness(2 + j)) & 255) << 16) | ((((long) sayid.dovishness(3 + j)) & 255) << 24) | ((((long) sayid.dovishness(4 + j)) & 255) << 32) | ((((long) sayid.dovishness(5 + j)) & 255) << 40) | ((((long) sayid.dovishness(6 + j)) & 255) << 48);
                bSeminary = sayid.dovishness(j + 7);
            } else {
                c = '8';
                jSeminary = (((long) seminary()) & 255) | ((((long) seminary()) & 255) << 8) | ((((long) seminary()) & 255) << 16) | ((((long) seminary()) & 255) << 24) | ((((long) seminary()) & 255) << 32) | ((((long) seminary()) & 255) << 40) | ((((long) seminary()) & 255) << 48);
                bSeminary = seminary();
            }
            return jSeminary | ((((long) bSeminary) & 255) << c);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long rotuma() throws IOException {
            return starveling();
        }

        public int saran() throws IOException {
            if (merc() < 4) {
                return (seminary() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((seminary() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((seminary() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((seminary() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
            }
            long j = this.f9743polloi;
            this.f9743polloi = 4 + j;
            return ((sayid.dovishness(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (sayid.dovishness(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((sayid.dovishness(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((sayid.dovishness(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int sealless() throws IOException {
            return creditor();
        }

        public byte seminary() throws IOException {
            if (merc() == 0) {
                polder();
            }
            long j = this.f9743polloi;
            this.f9743polloi = 1 + j;
            return sayid.dovishness(j);
        }

        public long starveling() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.f9743polloi;
            if (this.f9731adultoid != j4) {
                long j5 = j4 + 1;
                byte bDovishness = sayid.dovishness(j4);
                if (bDovishness >= 0) {
                    this.f9743polloi++;
                    return bDovishness;
                }
                if (this.f9731adultoid - this.f9743polloi >= 10) {
                    long j6 = 2 + j4;
                    int iDovishness = (sayid.dovishness(j5) << 7) ^ bDovishness;
                    if (iDovishness < 0) {
                        j = iDovishness ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int iDovishness2 = (sayid.dovishness(j6) << 14) ^ iDovishness;
                        if (iDovishness2 >= 0) {
                            j = iDovishness2 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int iDovishness3 = iDovishness2 ^ (sayid.dovishness(j7) << 21);
                            if (iDovishness3 < 0) {
                                j = (-2080896) ^ iDovishness3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long jDovishness = (((long) sayid.dovishness(j8)) << 28) ^ ((long) iDovishness3);
                                if (jDovishness >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long jDovishness2 = jDovishness ^ (((long) sayid.dovishness(j9)) << 35);
                                    if (jDovishness2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        jDovishness = jDovishness2 ^ (((long) sayid.dovishness(j10)) << 42);
                                        if (jDovishness >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            jDovishness2 = jDovishness ^ (((long) sayid.dovishness(j9)) << 49);
                                            if (jDovishness2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long jDovishness3 = (jDovishness2 ^ (((long) sayid.dovishness(j10)) << 56)) ^ 71499008037633920L;
                                                if (jDovishness3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (sayid.dovishness(j9) >= 0) {
                                                        j6 = j11;
                                                        j = jDovishness3;
                                                    }
                                                } else {
                                                    j = jDovishness3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jDovishness2;
                                    j6 = j10;
                                }
                                j = j3 ^ jDovishness;
                                j6 = j9;
                            }
                        }
                    }
                    this.f9743polloi = j6;
                    return j;
                }
            }
            return hydrovane();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long stratoscope() throws IOException {
            return impromptu.wireman(starveling());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean supplicat(int i) throws IOException {
            int iSaneness = WireFormat.saneness(i);
            if (iSaneness == 0) {
                splinterproof();
                return true;
            }
            if (iSaneness == 1) {
                mathsort(8);
                return true;
            }
            if (iSaneness == 2) {
                mathsort(creditor());
                return true;
            }
            if (iSaneness == 3) {
                restrictive();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            mathsort(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void triweekly(int i) {
            this.f9745triweekly = i;
            walach();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String trm() throws IOException {
            int iCreditor = creditor();
            if (iCreditor > 0) {
                long j = iCreditor;
                long j2 = this.f9731adultoid;
                long j3 = this.f9743polloi;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[iCreditor];
                    sayid.kowloon(j3, bArr, 0L, j);
                    String str = new String(bArr, gintrap.f9718saneness);
                    this.f9743polloi += j;
                    return str;
                }
            }
            if (iCreditor > 0 && iCreditor <= peridotite()) {
                byte[] bArr2 = new byte[iCreditor];
                grimness(bArr2, 0, iCreditor);
                return new String(bArr2, gintrap.f9718saneness);
            }
            if (iCreditor == 0) {
                return "";
            }
            if (iCreditor < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int yemenite() throws IOException {
            if (beachfront()) {
                this.f9740kowloon = 0;
                return 0;
            }
            int iCreditor = creditor();
            this.f9740kowloon = iCreditor;
            if (WireFormat.attabal(iCreditor) != 0) {
                return this.f9740kowloon;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public dern(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f9745triweekly = Integer.MAX_VALUE;
            this.f9736formularize = i;
            this.f9734competently = iterable;
            this.f9739impromptu = iterable.iterator();
            this.f9735cutely = z;
            this.f9733arytenoidectomy = 0;
            this.f9742monoploid = 0;
            if (i != 0) {
                clubfoot();
                return;
            }
            this.f9744taiyuan = gintrap.f9717marial;
            this.f9743polloi = 0L;
            this.f9741molybdenite = 0L;
            this.f9731adultoid = 0L;
            this.f9737graveside = 0L;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class marial extends impromptu {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public long f9746apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f9747arytenoidectomy;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final ByteBuffer f9748competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public long f9749cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public long f9750formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f9751impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final boolean f9752impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public boolean f9753kowloon;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final long f9754taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f9755triweekly;

        private void hydrovane() {
            long j = this.f9749cutely + ((long) this.f9751impassible);
            this.f9749cutely = j;
            int i = (int) (j - this.f9750formularize);
            int i2 = this.f9747arytenoidectomy;
            if (i <= i2) {
                this.f9751impassible = 0;
                return;
            }
            int i3 = i - i2;
            this.f9751impassible = i3;
            this.f9749cutely = j - ((long) i3);
        }

        private void mathsort() throws IOException {
            if (walach() >= 10) {
                splinterproof();
            } else {
                overspeculate();
            }
        }

        private void overspeculate() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (seminary() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public static boolean polder() {
            return sayid.restrictive();
        }

        private void splinterproof() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.f9746apical;
                this.f9746apical = 1 + j;
                if (sayid.dovishness(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private int walach() {
            return (int) (this.f9749cutely - this.f9746apical);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long adultoid() throws IOException {
            return saran();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean arytenoidectomy() throws IOException {
            return creditor() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f9755triweekly != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean beachfront() throws IOException {
            return this.f9746apical == this.f9749cutely;
        }

        public final ByteBuffer clubfoot(long j, long j2) throws IOException {
            int iPosition = this.f9748competently.position();
            int iLimit = this.f9748competently.limit();
            ByteBuffer byteBuffer = this.f9748competently;
            try {
                try {
                    byteBuffer.position(merc(j));
                    byteBuffer.limit(merc(j2));
                    ByteBuffer byteBufferSlice = this.f9748competently.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long cord() throws IOException {
            return saran();
        }

        public long creditor() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f9746apical;
            if (this.f9749cutely != j4) {
                long j5 = 1 + j4;
                byte bDovishness = sayid.dovishness(j4);
                if (bDovishness >= 0) {
                    this.f9746apical = j5;
                    return bDovishness;
                }
                if (this.f9749cutely - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iDovishness = (sayid.dovishness(j5) << 7) ^ bDovishness;
                    if (iDovishness >= 0) {
                        long j7 = 3 + j4;
                        int iDovishness2 = iDovishness ^ (sayid.dovishness(j6) << 14);
                        if (iDovishness2 >= 0) {
                            j = iDovishness2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iDovishness3 = iDovishness2 ^ (sayid.dovishness(j7) << 21);
                            if (iDovishness3 < 0) {
                                i = (-2080896) ^ iDovishness3;
                            } else {
                                long j8 = 5 + j4;
                                long jDovishness = ((long) iDovishness3) ^ (((long) sayid.dovishness(j6)) << 28);
                                if (jDovishness >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jDovishness2 = jDovishness ^ (((long) sayid.dovishness(j8)) << 35);
                                    if (jDovishness2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jDovishness = jDovishness2 ^ (((long) sayid.dovishness(j9)) << 42);
                                        if (jDovishness >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jDovishness2 = jDovishness ^ (((long) sayid.dovishness(j8)) << 49);
                                            if (jDovishness2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jDovishness3 = (jDovishness2 ^ (((long) sayid.dovishness(j9)) << 56)) ^ 71499008037633920L;
                                                if (jDovishness3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (sayid.dovishness(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jDovishness3;
                                                    }
                                                } else {
                                                    j = jDovishness3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jDovishness2;
                                    j6 = j9;
                                }
                                j = j3 ^ jDovishness;
                                j6 = j8;
                            }
                        }
                        this.f9746apical = j6;
                        return j;
                    }
                    i = iDovishness ^ (-128);
                    j = i;
                    this.f9746apical = j6;
                    return j;
                }
            }
            return starveling();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int cuirassed() throws IOException {
            return impromptu.dern(privatdozent());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public float dovishness() throws IOException {
            return Float.intBitsToFloat(grimness());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int gintrap() throws IOException {
            return privatdozent();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int graveside() throws IOException {
            return grimness();
        }

        public int grimness() throws IOException {
            long j = this.f9746apical;
            if (this.f9749cutely - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9746apical = 4 + j;
            return ((sayid.dovishness(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (sayid.dovishness(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((sayid.dovishness(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((sayid.dovishness(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long kattegat() throws IOException {
            return creditor();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int kowloon(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iMarial = i + marial();
            int i2 = this.f9747arytenoidectomy;
            if (iMarial > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9747arytenoidectomy = iMarial;
            hydrovane();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int marial() {
            return (int) (this.f9746apical - this.f9750formularize);
        }

        public final int merc(long j) {
            return (int) (j - this.f9754taiyuan);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int molybdenite() throws IOException {
            return privatdozent();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public ByteString monoploid() throws IOException {
            int iPrivatdozent = privatdozent();
            if (iPrivatdozent <= 0 || iPrivatdozent > walach()) {
                if (iPrivatdozent == 0) {
                    return ByteString.EMPTY;
                }
                if (iPrivatdozent < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f9752impromptu && this.f9753kowloon) {
                long j = this.f9746apical;
                long j2 = iPrivatdozent;
                ByteBuffer byteBufferClubfoot = clubfoot(j, j + j2);
                this.f9746apical += j2;
                return ByteString.wrap(byteBufferClubfoot);
            }
            byte[] bArr = new byte[iPrivatdozent];
            long j3 = iPrivatdozent;
            sayid.kowloon(this.f9746apical, bArr, 0L, j3);
            this.f9746apical += j3;
            return ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String oilcan() throws IOException {
            int iPrivatdozent = privatdozent();
            if (iPrivatdozent > 0 && iPrivatdozent <= walach()) {
                String strCompetently = Utf8.competently(this.f9748competently, merc(this.f9746apical), iPrivatdozent);
                this.f9746apical += (long) iPrivatdozent;
                return strCompetently;
            }
            if (iPrivatdozent == 0) {
                return "";
            }
            if (iPrivatdozent <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public void peridotite(int i) throws IOException {
            if (i >= 0 && i <= walach()) {
                this.f9746apical += (long) i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public double polloi() throws IOException {
            return Double.longBitsToDouble(saran());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int preprohormone() throws IOException {
            return grimness();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (androidx.datastore.preferences.protobuf.sayid.dovishness(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int privatdozent() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f9746apical
                long r2 = r9.f9749cutely
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = androidx.datastore.preferences.protobuf.sayid.dovishness(r0)
                if (r4 < 0) goto L16
                r9.f9746apical = r2
                return r4
            L16:
                long r5 = r9.f9749cutely
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = androidx.datastore.preferences.protobuf.sayid.dovishness(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.sayid.dovishness(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.sayid.dovishness(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.sayid.dovishness(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.sayid.dovishness(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = androidx.datastore.preferences.protobuf.sayid.dovishness(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = androidx.datastore.preferences.protobuf.sayid.dovishness(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = androidx.datastore.preferences.protobuf.sayid.dovishness(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = androidx.datastore.preferences.protobuf.sayid.dovishness(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.starveling()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f9746apical = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.impromptu.marial.privatdozent():int");
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long rotuma() throws IOException {
            return creditor();
        }

        public long saran() throws IOException {
            long j = this.f9746apical;
            if (this.f9749cutely - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9746apical = 8 + j;
            return ((((long) sayid.dovishness(j + 7)) & 255) << 56) | (((long) sayid.dovishness(j)) & 255) | ((((long) sayid.dovishness(1 + j)) & 255) << 8) | ((((long) sayid.dovishness(2 + j)) & 255) << 16) | ((((long) sayid.dovishness(3 + j)) & 255) << 24) | ((((long) sayid.dovishness(4 + j)) & 255) << 32) | ((((long) sayid.dovishness(5 + j)) & 255) << 40) | ((((long) sayid.dovishness(6 + j)) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int sealless() throws IOException {
            return privatdozent();
        }

        public byte seminary() throws IOException {
            long j = this.f9746apical;
            if (j == this.f9749cutely) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9746apical = 1 + j;
            return sayid.dovishness(j);
        }

        public long starveling() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bSeminary = seminary();
                j |= ((long) (bSeminary & 127)) << i;
                if ((bSeminary & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long stratoscope() throws IOException {
            return impromptu.wireman(creditor());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean supplicat(int i) throws IOException {
            int iSaneness = WireFormat.saneness(i);
            if (iSaneness == 0) {
                mathsort();
                return true;
            }
            if (iSaneness == 1) {
                peridotite(8);
                return true;
            }
            if (iSaneness == 2) {
                peridotite(privatdozent());
                return true;
            }
            if (iSaneness == 3) {
                restrictive();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            peridotite(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void triweekly(int i) {
            this.f9747arytenoidectomy = i;
            hydrovane();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String trm() throws IOException {
            int iPrivatdozent = privatdozent();
            if (iPrivatdozent <= 0 || iPrivatdozent > walach()) {
                if (iPrivatdozent == 0) {
                    return "";
                }
                if (iPrivatdozent < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iPrivatdozent];
            long j = iPrivatdozent;
            sayid.kowloon(this.f9746apical, bArr, 0L, j);
            String str = new String(bArr, gintrap.f9718saneness);
            this.f9746apical += j;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int yemenite() throws IOException {
            if (beachfront()) {
                this.f9755triweekly = 0;
                return 0;
            }
            int iPrivatdozent = privatdozent();
            this.f9755triweekly = iPrivatdozent;
            if (WireFormat.attabal(iPrivatdozent) != 0) {
                return this.f9755triweekly;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public marial(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f9747arytenoidectomy = Integer.MAX_VALUE;
            this.f9748competently = byteBuffer;
            long jApical = sayid.apical(byteBuffer);
            this.f9754taiyuan = jApical;
            this.f9749cutely = ((long) byteBuffer.limit()) + jApical;
            long jPosition = jApical + ((long) byteBuffer.position());
            this.f9746apical = jPosition;
            this.f9750formularize = jPosition;
            this.f9752impromptu = z;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class saneness extends impromptu {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f9756apical;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final byte[] f9757competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f9758cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f9759formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f9760impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final boolean f9761impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f9762kowloon;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f9763taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public boolean f9764triweekly;

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long adultoid() throws IOException {
            return grimness();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean arytenoidectomy() throws IOException {
            return privatdozent() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f9760impassible != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean beachfront() throws IOException {
            return this.f9756apical == this.f9763taiyuan;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long cord() throws IOException {
            return grimness();
        }

        public long creditor() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bMerc = merc();
                j |= ((long) (bMerc & 127)) << i;
                if ((bMerc & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int cuirassed() throws IOException {
            return impromptu.dern(saran());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public float dovishness() throws IOException {
            return Float.intBitsToFloat(seminary());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int gintrap() throws IOException {
            return saran();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int graveside() throws IOException {
            return seminary();
        }

        public long grimness() throws IOException {
            int i = this.f9756apical;
            if (this.f9763taiyuan - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9757competently;
            this.f9756apical = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public void hydrovane(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f9763taiyuan;
                int i3 = this.f9756apical;
                if (i <= i2 - i3) {
                    this.f9756apical = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long kattegat() throws IOException {
            return privatdozent();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int kowloon(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iMarial = i + marial();
            if (iMarial < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.f9762kowloon;
            if (iMarial > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9762kowloon = iMarial;
            starveling();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int marial() {
            return this.f9756apical - this.f9759formularize;
        }

        public final void mathsort() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (merc() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public byte merc() throws IOException {
            int i = this.f9756apical;
            if (i == this.f9763taiyuan) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9757competently;
            this.f9756apical = i + 1;
            return bArr[i];
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int molybdenite() throws IOException {
            return saran();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public ByteString monoploid() throws IOException {
            int iSaran = saran();
            if (iSaran > 0) {
                int i = this.f9763taiyuan;
                int i2 = this.f9756apical;
                if (iSaran <= i - i2) {
                    ByteString byteStringWrap = (this.f9761impromptu && this.f9764triweekly) ? ByteString.wrap(this.f9757competently, i2, iSaran) : ByteString.copyFrom(this.f9757competently, i2, iSaran);
                    this.f9756apical += iSaran;
                    return byteStringWrap;
                }
            }
            return iSaran == 0 ? ByteString.EMPTY : ByteString.wrap(polder(iSaran));
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String oilcan() throws IOException {
            int iSaran = saran();
            if (iSaran > 0) {
                int i = this.f9763taiyuan;
                int i2 = this.f9756apical;
                if (iSaran <= i - i2) {
                    String strImpromptu = Utf8.impromptu(this.f9757competently, i2, iSaran);
                    this.f9756apical += iSaran;
                    return strImpromptu;
                }
            }
            if (iSaran == 0) {
                return "";
            }
            if (iSaran <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final void peridotite() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f9757competently;
                int i2 = this.f9756apical;
                this.f9756apical = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public byte[] polder(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f9763taiyuan;
                int i3 = this.f9756apical;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f9756apical = i4;
                    return Arrays.copyOfRange(this.f9757competently, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return gintrap.f9719wireman;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public double polloi() throws IOException {
            return Double.longBitsToDouble(grimness());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int preprohormone() throws IOException {
            return seminary();
        }

        public long privatdozent() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f9756apical;
            int i2 = this.f9763taiyuan;
            if (i2 != i) {
                byte[] bArr = this.f9757competently;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f9756apical = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.f9756apical = i4;
                    return j;
                }
            }
            return creditor();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long rotuma() throws IOException {
            return privatdozent();
        }

        public int saran() throws IOException {
            int i;
            int i2 = this.f9756apical;
            int i3 = this.f9763taiyuan;
            if (i3 != i2) {
                byte[] bArr = this.f9757competently;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f9756apical = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
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
                    this.f9756apical = i5;
                    return i;
                }
            }
            return (int) creditor();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int sealless() throws IOException {
            return saran();
        }

        public int seminary() throws IOException {
            int i = this.f9756apical;
            if (this.f9763taiyuan - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9757competently;
            this.f9756apical = i + 4;
            return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public final void starveling() {
            int i = this.f9763taiyuan + this.f9758cutely;
            this.f9763taiyuan = i;
            int i2 = i - this.f9759formularize;
            int i3 = this.f9762kowloon;
            if (i2 <= i3) {
                this.f9758cutely = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f9758cutely = i4;
            this.f9763taiyuan = i - i4;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long stratoscope() throws IOException {
            return impromptu.wireman(privatdozent());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean supplicat(int i) throws IOException {
            int iSaneness = WireFormat.saneness(i);
            if (iSaneness == 0) {
                walach();
                return true;
            }
            if (iSaneness == 1) {
                hydrovane(8);
                return true;
            }
            if (iSaneness == 2) {
                hydrovane(saran());
                return true;
            }
            if (iSaneness == 3) {
                restrictive();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            hydrovane(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void triweekly(int i) {
            this.f9762kowloon = i;
            starveling();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String trm() throws IOException {
            int iSaran = saran();
            if (iSaran > 0) {
                int i = this.f9763taiyuan;
                int i2 = this.f9756apical;
                if (iSaran <= i - i2) {
                    String str = new String(this.f9757competently, i2, iSaran, gintrap.f9718saneness);
                    this.f9756apical += iSaran;
                    return str;
                }
            }
            if (iSaran == 0) {
                return "";
            }
            if (iSaran < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final void walach() throws IOException {
            if (this.f9763taiyuan - this.f9756apical >= 10) {
                peridotite();
            } else {
                mathsort();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int yemenite() throws IOException {
            if (beachfront()) {
                this.f9760impassible = 0;
                return 0;
            }
            int iSaran = saran();
            this.f9760impassible = iSaran;
            if (WireFormat.attabal(iSaran) != 0) {
                return this.f9760impassible;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public saneness(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f9762kowloon = Integer.MAX_VALUE;
            this.f9757competently = bArr;
            this.f9763taiyuan = i2 + i;
            this.f9756apical = i;
            this.f9759formularize = i;
            this.f9761impromptu = z;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class wireman extends impromptu {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f9765apical;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final InputStream f9766competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f9767cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f9768formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f9769impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final byte[] f9770impromptu;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f9771taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f9772triweekly;

        public static long clubfoot(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void cultivated() throws IOException {
            if (this.f9771taiyuan - this.f9765apical >= 10) {
                premeiotic();
            } else {
                timberyard();
            }
        }

        public static int merc(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        public static int polder(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void premeiotic() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f9770impromptu;
                int i2 = this.f9765apical;
                this.f9765apical = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void splinterproof() {
            int i = this.f9771taiyuan + this.f9767cutely;
            this.f9771taiyuan = i;
            int i2 = this.f9769impassible + i;
            int i3 = this.f9772triweekly;
            if (i2 <= i3) {
                this.f9767cutely = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f9767cutely = i4;
            this.f9771taiyuan = i - i4;
        }

        private void timberyard() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (grimness() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long adultoid() throws IOException {
            return hydrovane();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean arytenoidectomy() throws IOException {
            return peridotite() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f9768formularize != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean beachfront() throws IOException {
            return this.f9765apical == this.f9771taiyuan && !milliradian(1);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long cord() throws IOException {
            return hydrovane();
        }

        public final List<byte[]> creditor(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.f9766competently.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f9769impassible += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int cuirassed() throws IOException {
            return impromptu.dern(walach());
        }

        public void dent(int i) throws IOException {
            int i2 = this.f9771taiyuan;
            int i3 = this.f9765apical;
            if (i > i2 - i3 || i < 0) {
                permissivist(i);
            } else {
                this.f9765apical = i3 + i;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public float dovishness() throws IOException {
            return Float.intBitsToFloat(starveling());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int gintrap() throws IOException {
            return walach();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int graveside() throws IOException {
            return starveling();
        }

        public byte grimness() throws IOException {
            if (this.f9765apical == this.f9771taiyuan) {
                overspeculate(1);
            }
            byte[] bArr = this.f9770impromptu;
            int i = this.f9765apical;
            this.f9765apical = i + 1;
            return bArr[i];
        }

        public long hydrovane() throws IOException {
            int i = this.f9765apical;
            if (this.f9771taiyuan - i < 8) {
                overspeculate(8);
                i = this.f9765apical;
            }
            byte[] bArr = this.f9770impromptu;
            this.f9765apical = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long kattegat() throws IOException {
            return peridotite();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int kowloon(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.f9769impassible + this.f9765apical;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i3 = this.f9772triweekly;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9772triweekly = i2;
            splinterproof();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int marial() {
            return this.f9769impassible + this.f9765apical;
        }

        public long mathsort() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bGrimness = grimness();
                j |= ((long) (bGrimness & 127)) << i;
                if ((bGrimness & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final boolean milliradian(int i) throws IOException {
            int i2 = this.f9765apical;
            int i3 = i2 + i;
            int i4 = this.f9771taiyuan;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.f9727dern;
            int i6 = this.f9769impassible;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f9772triweekly) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f9770impromptu;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f9769impassible += i2;
                this.f9771taiyuan -= i2;
                this.f9765apical = 0;
            }
            InputStream inputStream = this.f9766competently;
            byte[] bArr2 = this.f9770impromptu;
            int i7 = this.f9771taiyuan;
            int iPolder = polder(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f9727dern - this.f9769impassible) - i7));
            if (iPolder == 0 || iPolder < -1 || iPolder > this.f9770impromptu.length) {
                throw new IllegalStateException(this.f9766competently.getClass() + "#read(byte[]) returned invalid result: " + iPolder + "\nThe InputStream implementation is buggy.");
            }
            if (iPolder <= 0) {
                return false;
            }
            this.f9771taiyuan += iPolder;
            splinterproof();
            if (this.f9771taiyuan >= i) {
                return true;
            }
            return milliradian(i);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int molybdenite() throws IOException {
            return walach();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public ByteString monoploid() throws IOException {
            int iWalach = walach();
            int i = this.f9771taiyuan;
            int i2 = this.f9765apical;
            if (iWalach <= i - i2 && iWalach > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.f9770impromptu, i2, iWalach);
                this.f9765apical += iWalach;
                return byteStringCopyFrom;
            }
            if (iWalach == 0) {
                return ByteString.EMPTY;
            }
            if (iWalach >= 0) {
                return seminary(iWalach);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String oilcan() throws IOException {
            byte[] bArrSaran;
            int iWalach = walach();
            int i = this.f9765apical;
            int i2 = this.f9771taiyuan;
            if (iWalach <= i2 - i && iWalach > 0) {
                bArrSaran = this.f9770impromptu;
                this.f9765apical = i + iWalach;
            } else {
                if (iWalach == 0) {
                    return "";
                }
                if (iWalach < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i = 0;
                if (iWalach <= i2) {
                    overspeculate(iWalach);
                    bArrSaran = this.f9770impromptu;
                    this.f9765apical = iWalach;
                } else {
                    bArrSaran = saran(iWalach, false);
                }
            }
            return Utf8.impromptu(bArrSaran, i, iWalach);
        }

        public final void overspeculate(int i) throws IOException {
            if (milliradian(i)) {
                return;
            }
            if (i <= (this.f9727dern - this.f9769impassible) - this.f9765apical) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        public long peridotite() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f9765apical;
            int i2 = this.f9771taiyuan;
            if (i2 != i) {
                byte[] bArr = this.f9770impromptu;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f9765apical = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.f9765apical = i4;
                    return j;
                }
            }
            return mathsort();
        }

        public final void permissivist(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.f9769impassible;
            int i3 = this.f9765apical;
            int i4 = i2 + i3 + i;
            int i5 = this.f9772triweekly;
            if (i4 > i5) {
                dent((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f9769impassible = i2 + i3;
            int i6 = this.f9771taiyuan - i3;
            this.f9771taiyuan = 0;
            this.f9765apical = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jClubfoot = clubfoot(this.f9766competently, j);
                    if (jClubfoot < 0 || jClubfoot > j) {
                        throw new IllegalStateException(this.f9766competently.getClass() + "#skip returned invalid result: " + jClubfoot + "\nThe InputStream implementation is buggy.");
                    }
                    if (jClubfoot == 0) {
                        break;
                    } else {
                        i6 += (int) jClubfoot;
                    }
                } catch (Throwable th) {
                    this.f9769impassible += i6;
                    splinterproof();
                    throw th;
                }
            }
            this.f9769impassible += i6;
            splinterproof();
            if (i6 >= i) {
                return;
            }
            int i7 = this.f9771taiyuan;
            int i8 = i7 - this.f9765apical;
            this.f9765apical = i7;
            overspeculate(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.f9771taiyuan;
                if (i9 <= i10) {
                    this.f9765apical = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f9765apical = i10;
                    overspeculate(1);
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public double polloi() throws IOException {
            return Double.longBitsToDouble(hydrovane());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int preprohormone() throws IOException {
            return starveling();
        }

        public final byte[] privatdozent(int i) throws IOException {
            if (i == 0) {
                return gintrap.f9719wireman;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.f9769impassible;
            int i3 = this.f9765apical;
            int i4 = i2 + i3 + i;
            if (i4 - this.f9727dern > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i5 = this.f9772triweekly;
            if (i4 > i5) {
                dent((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = this.f9771taiyuan - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > merc(this.f9766competently)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f9770impromptu, this.f9765apical, bArr, 0, i6);
            this.f9769impassible += this.f9771taiyuan;
            this.f9765apical = 0;
            this.f9771taiyuan = 0;
            while (i6 < i) {
                int iPolder = polder(this.f9766competently, bArr, i6, i - i6);
                if (iPolder == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f9769impassible += iPolder;
                i6 += iPolder;
            }
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long rotuma() throws IOException {
            return peridotite();
        }

        public final byte[] saran(int i, boolean z) throws IOException {
            byte[] bArrPrivatdozent = privatdozent(i);
            if (bArrPrivatdozent != null) {
                return z ? (byte[]) bArrPrivatdozent.clone() : bArrPrivatdozent;
            }
            int i2 = this.f9765apical;
            int i3 = this.f9771taiyuan;
            int length = i3 - i2;
            this.f9769impassible += i3;
            this.f9765apical = 0;
            this.f9771taiyuan = 0;
            List<byte[]> listCreditor = creditor(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f9770impromptu, i2, bArr, 0, length);
            for (byte[] bArr2 : listCreditor) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int sealless() throws IOException {
            return walach();
        }

        public final ByteString seminary(int i) throws IOException {
            byte[] bArrPrivatdozent = privatdozent(i);
            if (bArrPrivatdozent != null) {
                return ByteString.copyFrom(bArrPrivatdozent);
            }
            int i2 = this.f9765apical;
            int i3 = this.f9771taiyuan;
            int length = i3 - i2;
            this.f9769impassible += i3;
            this.f9765apical = 0;
            this.f9771taiyuan = 0;
            List<byte[]> listCreditor = creditor(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f9770impromptu, i2, bArr, 0, length);
            for (byte[] bArr2 : listCreditor) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        public int starveling() throws IOException {
            int i = this.f9765apical;
            if (this.f9771taiyuan - i < 4) {
                overspeculate(4);
                i = this.f9765apical;
            }
            byte[] bArr = this.f9770impromptu;
            this.f9765apical = i + 4;
            return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public long stratoscope() throws IOException {
            return impromptu.wireman(peridotite());
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public boolean supplicat(int i) throws IOException {
            int iSaneness = WireFormat.saneness(i);
            if (iSaneness == 0) {
                cultivated();
                return true;
            }
            if (iSaneness == 1) {
                dent(8);
                return true;
            }
            if (iSaneness == 2) {
                dent(walach());
                return true;
            }
            if (iSaneness == 3) {
                restrictive();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            dent(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public void triweekly(int i) {
            this.f9772triweekly = i;
            splinterproof();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public String trm() throws IOException {
            int iWalach = walach();
            if (iWalach > 0) {
                int i = this.f9771taiyuan;
                int i2 = this.f9765apical;
                if (iWalach <= i - i2) {
                    String str = new String(this.f9770impromptu, i2, iWalach, gintrap.f9718saneness);
                    this.f9765apical += iWalach;
                    return str;
                }
            }
            if (iWalach == 0) {
                return "";
            }
            if (iWalach < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (iWalach > this.f9771taiyuan) {
                return new String(saran(iWalach, false), gintrap.f9718saneness);
            }
            overspeculate(iWalach);
            String str2 = new String(this.f9770impromptu, this.f9765apical, iWalach, gintrap.f9718saneness);
            this.f9765apical += iWalach;
            return str2;
        }

        public int walach() throws IOException {
            int i;
            int i2 = this.f9765apical;
            int i3 = this.f9771taiyuan;
            if (i3 != i2) {
                byte[] bArr = this.f9770impromptu;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f9765apical = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
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
                    this.f9765apical = i5;
                    return i;
                }
            }
            return (int) mathsort();
        }

        @Override // androidx.datastore.preferences.protobuf.impromptu
        public int yemenite() throws IOException {
            if (beachfront()) {
                this.f9768formularize = 0;
                return 0;
            }
            int iWalach = walach();
            this.f9768formularize = iWalach;
            if (WireFormat.attabal(iWalach) != 0) {
                return this.f9768formularize;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public wireman(InputStream inputStream, int i) {
            super();
            this.f9772triweekly = Integer.MAX_VALUE;
            gintrap.saneness(inputStream, "input");
            this.f9766competently = inputStream;
            this.f9770impromptu = new byte[i];
            this.f9771taiyuan = 0;
            this.f9765apical = 0;
            this.f9769impassible = 0;
        }
    }

    public static impromptu apical(byte[] bArr) {
        return formularize(bArr, 0, bArr.length);
    }

    public static impromptu competently(InputStream inputStream) {
        return impromptu(inputStream, 4096);
    }

    public static impromptu cutely(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return impassible(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && marial.polder()) {
            return new marial(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return impassible(bArr, 0, iRemaining, true);
    }

    public static int dern(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static impromptu formularize(byte[] bArr, int i, int i2) {
        return impassible(bArr, i, i2, false);
    }

    public static impromptu impassible(byte[] bArr, int i, int i2, boolean z) {
        saneness sanenessVar = new saneness(bArr, i, i2, z);
        try {
            sanenessVar.kowloon(i2);
            return sanenessVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static impromptu impromptu(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? apical(gintrap.f9719wireman) : new wireman(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static impromptu taiyuan(Iterable<ByteBuffer> iterable, boolean z) {
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new dern(iterable, iRemaining, z) : competently(new rotuma(iterable));
    }

    public static long wireman(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract long adultoid() throws IOException;

    public abstract boolean arytenoidectomy() throws IOException;

    public abstract void attabal(int i) throws InvalidProtocolBufferException;

    public abstract boolean beachfront() throws IOException;

    public abstract long cord() throws IOException;

    public abstract int cuirassed() throws IOException;

    public abstract float dovishness() throws IOException;

    public abstract int gintrap() throws IOException;

    public abstract int graveside() throws IOException;

    public abstract long kattegat() throws IOException;

    public abstract int kowloon(int i) throws InvalidProtocolBufferException;

    public abstract int marial();

    public abstract int molybdenite() throws IOException;

    public abstract ByteString monoploid() throws IOException;

    public abstract String oilcan() throws IOException;

    public abstract double polloi() throws IOException;

    public abstract int preprohormone() throws IOException;

    public void restrictive() throws IOException {
        boolean zSupplicat;
        do {
            int iYemenite = yemenite();
            if (iYemenite == 0) {
                return;
            }
            saneness();
            this.f9726attabal++;
            zSupplicat = supplicat(iYemenite);
            this.f9726attabal--;
        } while (zSupplicat);
    }

    public abstract long rotuma() throws IOException;

    public void saneness() throws InvalidProtocolBufferException {
        if (this.f9726attabal >= this.f9729saneness) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public abstract int sealless() throws IOException;

    public abstract long stratoscope() throws IOException;

    public abstract boolean supplicat(int i) throws IOException;

    public abstract void triweekly(int i);

    public abstract String trm() throws IOException;

    public abstract int yemenite() throws IOException;

    public impromptu() {
        this.f9729saneness = f9725beachfront;
        this.f9727dern = Integer.MAX_VALUE;
        this.f9728marial = false;
    }
}
