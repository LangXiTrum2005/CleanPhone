package com.google.crypto.tink.shaded.protobuf;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CodedInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class taiyuan {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static volatile int f22319competently = 100;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f22320attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f22321beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f22322dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public cutely f22323marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f22324saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f22325wireman;

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class dern extends taiyuan {

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public long f22326adultoid;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public final boolean f22327apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f22328arytenoidectomy;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public ByteBuffer f22329cutely;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public long f22330dovishness;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public boolean f22331formularize;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public long f22332graveside;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f22333impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final Iterable<ByteBuffer> f22334impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f22335kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public long f22336molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f22337monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f22338polloi;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final Iterator<ByteBuffer> f22339taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f22340triweekly;

        private void overspeculate() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (grimness() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void peridotite() {
            int i = this.f22333impassible + this.f22340triweekly;
            this.f22333impassible = i;
            int i2 = i - this.f22338polloi;
            int i3 = this.f22335kowloon;
            if (i2 <= i3) {
                this.f22340triweekly = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f22340triweekly = i4;
            this.f22333impassible = i - i4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int adultoid() throws IOException {
            return privatdozent();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int arytenoidectomy(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iBeachfront = i + beachfront();
            int i2 = this.f22335kowloon;
            if (iBeachfront > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22335kowloon = iBeachfront;
            peridotite();
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f22328arytenoidectomy != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int beachfront() {
            return (int) ((((long) (this.f22337monoploid - this.f22338polloi)) + this.f22336molybdenite) - this.f22332graveside);
        }

        public final ByteBuffer clubfoot(int i, int i2) throws IOException {
            int iPosition = this.f22329cutely.position();
            int iLimit = this.f22329cutely.limit();
            ByteBuffer byteBuffer = this.f22329cutely;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    ByteBuffer byteBufferSlice = this.f22329cutely.slice();
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

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean competently() throws IOException {
            return (((long) this.f22337monoploid) + this.f22336molybdenite) - this.f22332graveside == ((long) this.f22333impassible);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int cord() throws IOException {
            return privatdozent();
        }

        public long creditor() throws IOException {
            char c;
            long jGrimness;
            byte bGrimness;
            if (polder() >= 8) {
                long j = this.f22336molybdenite;
                this.f22336molybdenite = 8 + j;
                c = '8';
                jGrimness = (((long) sayid.dovishness(j)) & 255) | ((((long) sayid.dovishness(1 + j)) & 255) << 8) | ((((long) sayid.dovishness(2 + j)) & 255) << 16) | ((((long) sayid.dovishness(3 + j)) & 255) << 24) | ((((long) sayid.dovishness(4 + j)) & 255) << 32) | ((((long) sayid.dovishness(5 + j)) & 255) << 40) | ((((long) sayid.dovishness(6 + j)) & 255) << 48);
                bGrimness = sayid.dovishness(j + 7);
            } else {
                c = '8';
                jGrimness = (((long) grimness()) & 255) | ((((long) grimness()) & 255) << 8) | ((((long) grimness()) & 255) << 16) | ((((long) grimness()) & 255) << 24) | ((((long) grimness()) & 255) << 32) | ((((long) grimness()) & 255) << 40) | ((((long) grimness()) & 255) << 48);
                bGrimness = grimness();
            }
            return jGrimness | ((((long) bGrimness) & 255) << c);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long cuirassed() throws IOException {
            return creditor();
        }

        public final void dent() {
            ByteBuffer next = this.f22339taiyuan.next();
            this.f22329cutely = next;
            this.f22337monoploid += (int) (this.f22336molybdenite - this.f22332graveside);
            long jPosition = next.position();
            this.f22336molybdenite = jPosition;
            this.f22332graveside = jPosition;
            this.f22330dovishness = this.f22329cutely.limit();
            long jApical = sayid.apical(this.f22329cutely);
            this.f22326adultoid = jApical;
            this.f22336molybdenite += jApical;
            this.f22332graveside += jApical;
            this.f22330dovishness += jApical;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long dovishness() throws IOException {
            return creditor();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public float gintrap() throws IOException {
            return Float.intBitsToFloat(privatdozent());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int graveside() throws IOException {
            return starveling();
        }

        public byte grimness() throws IOException {
            if (polder() == 0) {
                seminary();
            }
            long j = this.f22336molybdenite;
            this.f22336molybdenite = 1 + j;
            return sayid.dovishness(j);
        }

        public long hydrovane() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.f22336molybdenite;
            if (this.f22330dovishness != j4) {
                long j5 = j4 + 1;
                byte bDovishness = sayid.dovishness(j4);
                if (bDovishness >= 0) {
                    this.f22336molybdenite++;
                    return bDovishness;
                }
                if (this.f22330dovishness - this.f22336molybdenite >= 10) {
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
                    this.f22336molybdenite = j6;
                    return j;
                }
            }
            return walach();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int kattegat() throws IOException {
            return starveling();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void kowloon(int i) {
            this.f22335kowloon = i;
            peridotite();
        }

        public final int mathsort() {
            return (int) ((((long) (this.f22333impassible - this.f22337monoploid)) - this.f22336molybdenite) + this.f22332graveside);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public double molybdenite() throws IOException {
            return Double.longBitsToDouble(creditor());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean monoploid() throws IOException {
            return hydrovane() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String oilcan() throws IOException {
            int iStarveling = starveling();
            if (iStarveling > 0) {
                long j = iStarveling;
                long j2 = this.f22330dovishness;
                long j3 = this.f22336molybdenite;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[iStarveling];
                    sayid.kowloon(j3, bArr, 0L, j);
                    String str = new String(bArr, rotuma.f22277saneness);
                    this.f22336molybdenite += j;
                    return str;
                }
            }
            if (iStarveling > 0 && iStarveling <= mathsort()) {
                byte[] bArr2 = new byte[iStarveling];
                saran(bArr2, 0, iStarveling);
                return new String(bArr2, rotuma.f22277saneness);
            }
            if (iStarveling == 0) {
                return "";
            }
            if (iStarveling < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final long polder() {
            return this.f22330dovishness - this.f22336molybdenite;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public ByteString polloi() throws IOException {
            int iStarveling = starveling();
            if (iStarveling > 0) {
                long j = iStarveling;
                long j2 = this.f22330dovishness;
                long j3 = this.f22336molybdenite;
                if (j <= j2 - j3) {
                    if (this.f22327apical && this.f22331formularize) {
                        int i = (int) (j3 - this.f22326adultoid);
                        ByteString byteStringWrap = ByteString.wrap(clubfoot(i, iStarveling + i));
                        this.f22336molybdenite += j;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[iStarveling];
                    sayid.kowloon(j3, bArr, 0L, j);
                    this.f22336molybdenite += j;
                    return ByteString.wrap(bArr);
                }
            }
            if (iStarveling <= 0 || iStarveling > mathsort()) {
                if (iStarveling == 0) {
                    return ByteString.EMPTY;
                }
                if (iStarveling < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.f22327apical || !this.f22331formularize) {
                byte[] bArr2 = new byte[iStarveling];
                saran(bArr2, 0, iStarveling);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iStarveling > 0) {
                if (polder() == 0) {
                    seminary();
                }
                int iMin = Math.min(iStarveling, (int) polder());
                int i2 = (int) (this.f22336molybdenite - this.f22326adultoid);
                arrayList.add(ByteString.wrap(clubfoot(i2, i2 + iMin)));
                iStarveling -= iMin;
                this.f22336molybdenite += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long preprohormone() throws IOException {
            return hydrovane();
        }

        public int privatdozent() throws IOException {
            if (polder() < 4) {
                return (grimness() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((grimness() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((grimness() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((grimness() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
            }
            long j = this.f22336molybdenite;
            this.f22336molybdenite = 4 + j;
            return ((sayid.dovishness(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (sayid.dovishness(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((sayid.dovishness(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((sayid.dovishness(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean restrictive(int i) throws IOException {
            int iSaneness = WireFormat.saneness(i);
            if (iSaneness == 0) {
                overspeculate();
                return true;
            }
            if (iSaneness == 1) {
                splinterproof(8);
                return true;
            }
            if (iSaneness == 2) {
                splinterproof(starveling());
                return true;
            }
            if (iSaneness == 3) {
                merc();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                dern();
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            splinterproof(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int rotuma() throws IOException {
            return starveling();
        }

        public final void saran(byte[] bArr, int i, int i2) throws IOException {
            if (i2 < 0 || i2 > mathsort()) {
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
                if (polder() == 0) {
                    seminary();
                }
                int iMin = Math.min(i3, (int) polder());
                long j = iMin;
                sayid.kowloon(this.f22336molybdenite, bArr, (i2 - i3) + i, j);
                i3 -= iMin;
                this.f22336molybdenite += j;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int sealless() throws IOException {
            if (competently()) {
                this.f22328arytenoidectomy = 0;
                return 0;
            }
            int iStarveling = starveling();
            this.f22328arytenoidectomy = iStarveling;
            if (WireFormat.attabal(iStarveling) != 0) {
                return this.f22328arytenoidectomy;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public final void seminary() throws InvalidProtocolBufferException {
            if (!this.f22339taiyuan.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            dent();
        }

        public void splinterproof(int i) throws IOException {
            if (i < 0 || i > (((long) (this.f22333impassible - this.f22337monoploid)) - this.f22336molybdenite) + this.f22332graveside) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i > 0) {
                if (polder() == 0) {
                    seminary();
                }
                int iMin = Math.min(i, (int) polder());
                i -= iMin;
                this.f22336molybdenite += (long) iMin;
            }
        }

        public int starveling() throws IOException {
            int i;
            long j = this.f22336molybdenite;
            if (this.f22330dovishness != j) {
                long j2 = j + 1;
                byte bDovishness = sayid.dovishness(j);
                if (bDovishness >= 0) {
                    this.f22336molybdenite++;
                    return bDovishness;
                }
                if (this.f22330dovishness - this.f22336molybdenite >= 10) {
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
                    this.f22336molybdenite = j3;
                    return i;
                }
            }
            return (int) walach();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int stratoscope() throws IOException {
            return taiyuan.wireman(starveling());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long supplicat() throws IOException {
            return hydrovane();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long trm() throws IOException {
            return taiyuan.marial(hydrovane());
        }

        public long walach() throws IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String yemenite() throws IOException {
            int iStarveling = starveling();
            if (iStarveling > 0) {
                long j = iStarveling;
                long j2 = this.f22330dovishness;
                long j3 = this.f22336molybdenite;
                if (j <= j2 - j3) {
                    String strCompetently = Utf8.competently(this.f22329cutely, (int) (j3 - this.f22332graveside), iStarveling);
                    this.f22336molybdenite += j;
                    return strCompetently;
                }
            }
            if (iStarveling >= 0 && iStarveling <= mathsort()) {
                byte[] bArr = new byte[iStarveling];
                saran(bArr, 0, iStarveling);
                return Utf8.impromptu(bArr, 0, iStarveling);
            }
            if (iStarveling == 0) {
                return "";
            }
            if (iStarveling <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public dern(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.f22335kowloon = Integer.MAX_VALUE;
            this.f22333impassible = i;
            this.f22334impromptu = iterable;
            this.f22339taiyuan = iterable.iterator();
            this.f22327apical = z;
            this.f22337monoploid = 0;
            this.f22338polloi = 0;
            if (i != 0) {
                dent();
                return;
            }
            this.f22329cutely = rotuma.f22276marial;
            this.f22336molybdenite = 0L;
            this.f22332graveside = 0L;
            this.f22330dovishness = 0L;
            this.f22326adultoid = 0L;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class marial extends taiyuan {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public long f22341apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public boolean f22342arytenoidectomy;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final long f22343cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public long f22344formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public long f22345impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final ByteBuffer f22346impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f22347kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f22348monoploid;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final boolean f22349taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f22350triweekly;

        private void clubfoot() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (grimness() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void overspeculate() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.f22344formularize;
                this.f22344formularize = 1 + j;
                if (sayid.dovishness(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private int peridotite() {
            return (int) (this.f22341apical - this.f22344formularize);
        }

        public static boolean seminary() {
            return sayid.restrictive();
        }

        private void splinterproof() throws IOException {
            if (peridotite() >= 10) {
                overspeculate();
            } else {
                clubfoot();
            }
        }

        private void walach() {
            long j = this.f22341apical + ((long) this.f22350triweekly);
            this.f22341apical = j;
            int i = (int) (j - this.f22345impassible);
            int i2 = this.f22348monoploid;
            if (i <= i2) {
                this.f22350triweekly = 0;
                return;
            }
            int i3 = i - i2;
            this.f22350triweekly = i3;
            this.f22341apical = j - ((long) i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int adultoid() throws IOException {
            return saran();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int arytenoidectomy(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iBeachfront = i + beachfront();
            int i2 = this.f22348monoploid;
            if (iBeachfront > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22348monoploid = iBeachfront;
            walach();
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f22347kowloon != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int beachfront() {
            return (int) (this.f22344formularize - this.f22345impassible);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean competently() throws IOException {
            return this.f22344formularize == this.f22341apical;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int cord() throws IOException {
            return saran();
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int creditor() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f22344formularize
                long r2 = r9.f22341apical
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r0)
                if (r4 < 0) goto L16
                r9.f22344formularize = r2
                return r4
            L16:
                long r5 = r9.f22341apical
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r5)
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
                byte r3 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.sayid.dovishness(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.hydrovane()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f22344formularize = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.taiyuan.marial.creditor():int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long cuirassed() throws IOException {
            return privatdozent();
        }

        public final ByteBuffer dent(long j, long j2) throws IOException {
            int iPosition = this.f22346impromptu.position();
            int iLimit = this.f22346impromptu.limit();
            ByteBuffer byteBuffer = this.f22346impromptu;
            try {
                try {
                    byteBuffer.position(polder(j));
                    byteBuffer.limit(polder(j2));
                    ByteBuffer byteBufferSlice = this.f22346impromptu.slice();
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

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long dovishness() throws IOException {
            return privatdozent();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public float gintrap() throws IOException {
            return Float.intBitsToFloat(saran());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int graveside() throws IOException {
            return creditor();
        }

        public byte grimness() throws IOException {
            long j = this.f22344formularize;
            if (j == this.f22341apical) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22344formularize = 1 + j;
            return sayid.dovishness(j);
        }

        public long hydrovane() throws IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int kattegat() throws IOException {
            return creditor();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void kowloon(int i) {
            this.f22348monoploid = i;
            walach();
        }

        public void mathsort(int i) throws IOException {
            if (i >= 0 && i <= peridotite()) {
                this.f22344formularize += (long) i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public double molybdenite() throws IOException {
            return Double.longBitsToDouble(privatdozent());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean monoploid() throws IOException {
            return starveling() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String oilcan() throws IOException {
            int iCreditor = creditor();
            if (iCreditor <= 0 || iCreditor > peridotite()) {
                if (iCreditor == 0) {
                    return "";
                }
                if (iCreditor < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iCreditor];
            long j = iCreditor;
            sayid.kowloon(this.f22344formularize, bArr, 0L, j);
            String str = new String(bArr, rotuma.f22277saneness);
            this.f22344formularize += j;
            return str;
        }

        public final int polder(long j) {
            return (int) (j - this.f22343cutely);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public ByteString polloi() throws IOException {
            int iCreditor = creditor();
            if (iCreditor <= 0 || iCreditor > peridotite()) {
                if (iCreditor == 0) {
                    return ByteString.EMPTY;
                }
                if (iCreditor < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.f22349taiyuan && this.f22342arytenoidectomy) {
                long j = this.f22344formularize;
                long j2 = iCreditor;
                ByteBuffer byteBufferDent = dent(j, j + j2);
                this.f22344formularize += j2;
                return ByteString.wrap(byteBufferDent);
            }
            byte[] bArr = new byte[iCreditor];
            long j3 = iCreditor;
            sayid.kowloon(this.f22344formularize, bArr, 0L, j3);
            this.f22344formularize += j3;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long preprohormone() throws IOException {
            return starveling();
        }

        public long privatdozent() throws IOException {
            long j = this.f22344formularize;
            if (this.f22341apical - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22344formularize = 8 + j;
            return ((((long) sayid.dovishness(j + 7)) & 255) << 56) | (((long) sayid.dovishness(j)) & 255) | ((((long) sayid.dovishness(1 + j)) & 255) << 8) | ((((long) sayid.dovishness(2 + j)) & 255) << 16) | ((((long) sayid.dovishness(3 + j)) & 255) << 24) | ((((long) sayid.dovishness(4 + j)) & 255) << 32) | ((((long) sayid.dovishness(5 + j)) & 255) << 40) | ((((long) sayid.dovishness(6 + j)) & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean restrictive(int i) throws IOException {
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
                merc();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                dern();
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            mathsort(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int rotuma() throws IOException {
            return creditor();
        }

        public int saran() throws IOException {
            long j = this.f22344formularize;
            if (this.f22341apical - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22344formularize = 4 + j;
            return ((sayid.dovishness(j + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (sayid.dovishness(j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((sayid.dovishness(1 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((sayid.dovishness(2 + j) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int sealless() throws IOException {
            if (competently()) {
                this.f22347kowloon = 0;
                return 0;
            }
            int iCreditor = creditor();
            this.f22347kowloon = iCreditor;
            if (WireFormat.attabal(iCreditor) != 0) {
                return this.f22347kowloon;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public long starveling() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f22344formularize;
            if (this.f22341apical != j4) {
                long j5 = 1 + j4;
                byte bDovishness = sayid.dovishness(j4);
                if (bDovishness >= 0) {
                    this.f22344formularize = j5;
                    return bDovishness;
                }
                if (this.f22341apical - j5 >= 9) {
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
                        this.f22344formularize = j6;
                        return j;
                    }
                    i = iDovishness ^ (-128);
                    j = i;
                    this.f22344formularize = j6;
                    return j;
                }
            }
            return hydrovane();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int stratoscope() throws IOException {
            return taiyuan.wireman(creditor());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long supplicat() throws IOException {
            return starveling();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long trm() throws IOException {
            return taiyuan.marial(starveling());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String yemenite() throws IOException {
            int iCreditor = creditor();
            if (iCreditor > 0 && iCreditor <= peridotite()) {
                String strCompetently = Utf8.competently(this.f22346impromptu, polder(this.f22344formularize), iCreditor);
                this.f22344formularize += (long) iCreditor;
                return strCompetently;
            }
            if (iCreditor == 0) {
                return "";
            }
            if (iCreditor <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public marial(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f22348monoploid = Integer.MAX_VALUE;
            this.f22346impromptu = byteBuffer.duplicate();
            long jApical = sayid.apical(byteBuffer);
            this.f22343cutely = jApical;
            this.f22341apical = ((long) byteBuffer.limit()) + jApical;
            long jPosition = jApical + ((long) byteBuffer.position());
            this.f22344formularize = jPosition;
            this.f22345impassible = jPosition;
            this.f22349taiyuan = z;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class saneness extends taiyuan {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f22351apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f22352arytenoidectomy;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f22353cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f22354formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f22355impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final byte[] f22356impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public boolean f22357kowloon;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final boolean f22358taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f22359triweekly;

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int adultoid() throws IOException {
            return grimness();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int arytenoidectomy(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iBeachfront = i + beachfront();
            if (iBeachfront < 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i2 = this.f22352arytenoidectomy;
            if (iBeachfront > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22352arytenoidectomy = iBeachfront;
            hydrovane();
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f22359triweekly != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int beachfront() {
            return this.f22354formularize - this.f22355impassible;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean competently() throws IOException {
            return this.f22354formularize == this.f22353cutely;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int cord() throws IOException {
            return grimness();
        }

        public long creditor() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f22354formularize;
            int i2 = this.f22353cutely;
            if (i2 != i) {
                byte[] bArr = this.f22356impromptu;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f22354formularize = i3;
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
                    this.f22354formularize = i4;
                    return j;
                }
            }
            return starveling();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long cuirassed() throws IOException {
            return saran();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long dovishness() throws IOException {
            return saran();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public float gintrap() throws IOException {
            return Float.intBitsToFloat(grimness());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int graveside() throws IOException {
            return privatdozent();
        }

        public int grimness() throws IOException {
            int i = this.f22354formularize;
            if (this.f22353cutely - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f22356impromptu;
            this.f22354formularize = i + 4;
            return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        public final void hydrovane() {
            int i = this.f22353cutely + this.f22351apical;
            this.f22353cutely = i;
            int i2 = i - this.f22355impassible;
            int i3 = this.f22352arytenoidectomy;
            if (i2 <= i3) {
                this.f22351apical = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f22351apical = i4;
            this.f22353cutely = i - i4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int kattegat() throws IOException {
            return privatdozent();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void kowloon(int i) {
            this.f22352arytenoidectomy = i;
            hydrovane();
        }

        public final void mathsort() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f22356impromptu;
                int i2 = this.f22354formularize;
                this.f22354formularize = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public double molybdenite() throws IOException {
            return Double.longBitsToDouble(saran());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean monoploid() throws IOException {
            return creditor() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String oilcan() throws IOException {
            int iPrivatdozent = privatdozent();
            if (iPrivatdozent > 0) {
                int i = this.f22353cutely;
                int i2 = this.f22354formularize;
                if (iPrivatdozent <= i - i2) {
                    String str = new String(this.f22356impromptu, i2, iPrivatdozent, rotuma.f22277saneness);
                    this.f22354formularize += iPrivatdozent;
                    return str;
                }
            }
            if (iPrivatdozent == 0) {
                return "";
            }
            if (iPrivatdozent < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public final void peridotite() throws IOException {
            if (this.f22353cutely - this.f22354formularize >= 10) {
                mathsort();
            } else {
                splinterproof();
            }
        }

        public byte polder() throws IOException {
            int i = this.f22354formularize;
            if (i == this.f22353cutely) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f22356impromptu;
            this.f22354formularize = i + 1;
            return bArr[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public ByteString polloi() throws IOException {
            int iPrivatdozent = privatdozent();
            if (iPrivatdozent > 0) {
                int i = this.f22353cutely;
                int i2 = this.f22354formularize;
                if (iPrivatdozent <= i - i2) {
                    ByteString byteStringWrap = (this.f22358taiyuan && this.f22357kowloon) ? ByteString.wrap(this.f22356impromptu, i2, iPrivatdozent) : ByteString.copyFrom(this.f22356impromptu, i2, iPrivatdozent);
                    this.f22354formularize += iPrivatdozent;
                    return byteStringWrap;
                }
            }
            return iPrivatdozent == 0 ? ByteString.EMPTY : ByteString.wrap(seminary(iPrivatdozent));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long preprohormone() throws IOException {
            return creditor();
        }

        public int privatdozent() throws IOException {
            int i;
            int i2 = this.f22354formularize;
            int i3 = this.f22353cutely;
            if (i3 != i2) {
                byte[] bArr = this.f22356impromptu;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f22354formularize = i4;
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
                    this.f22354formularize = i5;
                    return i;
                }
            }
            return (int) starveling();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean restrictive(int i) throws IOException {
            int iSaneness = WireFormat.saneness(i);
            if (iSaneness == 0) {
                peridotite();
                return true;
            }
            if (iSaneness == 1) {
                walach(8);
                return true;
            }
            if (iSaneness == 2) {
                walach(privatdozent());
                return true;
            }
            if (iSaneness == 3) {
                merc();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                dern();
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            walach(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int rotuma() throws IOException {
            return privatdozent();
        }

        public long saran() throws IOException {
            int i = this.f22354formularize;
            if (this.f22353cutely - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f22356impromptu;
            this.f22354formularize = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int sealless() throws IOException {
            if (competently()) {
                this.f22359triweekly = 0;
                return 0;
            }
            int iPrivatdozent = privatdozent();
            this.f22359triweekly = iPrivatdozent;
            if (WireFormat.attabal(iPrivatdozent) != 0) {
                return this.f22359triweekly;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public byte[] seminary(int i) throws IOException {
            if (i > 0) {
                int i2 = this.f22353cutely;
                int i3 = this.f22354formularize;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f22354formularize = i4;
                    return Arrays.copyOfRange(this.f22356impromptu, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return rotuma.f22278wireman;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public final void splinterproof() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (polder() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public long starveling() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bPolder = polder();
                j |= ((long) (bPolder & 127)) << i;
                if ((bPolder & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int stratoscope() throws IOException {
            return taiyuan.wireman(privatdozent());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long supplicat() throws IOException {
            return creditor();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long trm() throws IOException {
            return taiyuan.marial(creditor());
        }

        public void walach(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f22353cutely;
                int i3 = this.f22354formularize;
                if (i <= i2 - i3) {
                    this.f22354formularize = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String yemenite() throws IOException {
            int iPrivatdozent = privatdozent();
            if (iPrivatdozent > 0) {
                int i = this.f22353cutely;
                int i2 = this.f22354formularize;
                if (iPrivatdozent <= i - i2) {
                    String strImpromptu = Utf8.impromptu(this.f22356impromptu, i2, iPrivatdozent);
                    this.f22354formularize += iPrivatdozent;
                    return strImpromptu;
                }
            }
            if (iPrivatdozent == 0) {
                return "";
            }
            if (iPrivatdozent <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public saneness(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.f22352arytenoidectomy = Integer.MAX_VALUE;
            this.f22356impromptu = bArr;
            this.f22353cutely = i2 + i;
            this.f22354formularize = i;
            this.f22355impassible = i;
            this.f22358taiyuan = z;
        }
    }

    /* JADX INFO: compiled from: CodedInputStream.java */
    public static final class wireman extends taiyuan {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f22360apical;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f22361cutely;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f22362formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f22363impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public final InputStream f22364impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f22365kowloon;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final byte[] f22366taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f22367triweekly;

        public static long dent(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void milliradian() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (saran() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void overspeculate() {
            int i = this.f22361cutely + this.f22360apical;
            this.f22361cutely = i;
            int i2 = this.f22367triweekly + i;
            int i3 = this.f22365kowloon;
            if (i2 <= i3) {
                this.f22360apical = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f22360apical = i4;
            this.f22361cutely = i - i4;
        }

        public static int polder(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void premeiotic() throws IOException {
            if (this.f22361cutely - this.f22362formularize >= 10) {
                timberyard();
            } else {
                milliradian();
            }
        }

        public static int seminary(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void timberyard() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f22366taiyuan;
                int i2 = this.f22362formularize;
                this.f22362formularize = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int adultoid() throws IOException {
            return hydrovane();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int arytenoidectomy(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.f22367triweekly + this.f22362formularize;
            if (i2 < 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i3 = this.f22365kowloon;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22365kowloon = i2;
            overspeculate();
            return i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void attabal(int i) throws InvalidProtocolBufferException {
            if (this.f22363impassible != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int beachfront() {
            return this.f22367triweekly + this.f22362formularize;
        }

        public final void clubfoot(int i) throws IOException {
            if (treadless(i)) {
                return;
            }
            if (i <= (this.f22325wireman - this.f22367triweekly) - this.f22362formularize) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean competently() throws IOException {
            return this.f22362formularize == this.f22361cutely && !treadless(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int cord() throws IOException {
            return hydrovane();
        }

        public final byte[] creditor(int i) throws IOException {
            if (i == 0) {
                return rotuma.f22278wireman;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.f22367triweekly;
            int i3 = this.f22362formularize;
            int i4 = i2 + i3 + i;
            if (i4 - this.f22325wireman > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i5 = this.f22365kowloon;
            if (i4 > i5) {
                permissivist((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = this.f22361cutely - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > polder(this.f22364impromptu)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f22366taiyuan, this.f22362formularize, bArr, 0, i6);
            this.f22367triweekly += this.f22361cutely;
            this.f22362formularize = 0;
            this.f22361cutely = 0;
            while (i6 < i) {
                int iSeminary = seminary(this.f22364impromptu, bArr, i6, i - i6);
                if (iSeminary == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f22367triweekly += iSeminary;
                i6 += iSeminary;
            }
            return bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long cuirassed() throws IOException {
            return walach();
        }

        public final void cultivated(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.f22367triweekly;
            int i3 = this.f22362formularize;
            int i4 = i2 + i3 + i;
            int i5 = this.f22365kowloon;
            if (i4 > i5) {
                permissivist((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f22367triweekly = i2 + i3;
            int i6 = this.f22361cutely - i3;
            this.f22361cutely = 0;
            this.f22362formularize = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jDent = dent(this.f22364impromptu, j);
                    if (jDent < 0 || jDent > j) {
                        throw new IllegalStateException(this.f22364impromptu.getClass() + "#skip returned invalid result: " + jDent + "\nThe InputStream implementation is buggy.");
                    }
                    if (jDent == 0) {
                        break;
                    } else {
                        i6 += (int) jDent;
                    }
                } catch (Throwable th) {
                    this.f22367triweekly += i6;
                    overspeculate();
                    throw th;
                }
            }
            this.f22367triweekly += i6;
            overspeculate();
            if (i6 >= i) {
                return;
            }
            int i7 = this.f22361cutely;
            int i8 = i7 - this.f22362formularize;
            this.f22362formularize = i7;
            clubfoot(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.f22361cutely;
                if (i9 <= i10) {
                    this.f22362formularize = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f22362formularize = i10;
                    clubfoot(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long dovishness() throws IOException {
            return walach();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public float gintrap() throws IOException {
            return Float.intBitsToFloat(hydrovane());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int graveside() throws IOException {
            return peridotite();
        }

        public final ByteString grimness(int i) throws IOException {
            byte[] bArrCreditor = creditor(i);
            if (bArrCreditor != null) {
                return ByteString.copyFrom(bArrCreditor);
            }
            int i2 = this.f22362formularize;
            int i3 = this.f22361cutely;
            int length = i3 - i2;
            this.f22367triweekly += i3;
            this.f22362formularize = 0;
            this.f22361cutely = 0;
            List<byte[]> listStarveling = starveling(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f22366taiyuan, i2, bArr, 0, length);
            for (byte[] bArr2 : listStarveling) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        public int hydrovane() throws IOException {
            int i = this.f22362formularize;
            if (this.f22361cutely - i < 4) {
                clubfoot(4);
                i = this.f22362formularize;
            }
            byte[] bArr = this.f22366taiyuan;
            this.f22362formularize = i + 4;
            return ((bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int kattegat() throws IOException {
            return peridotite();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public void kowloon(int i) {
            this.f22365kowloon = i;
            overspeculate();
        }

        public long mathsort() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f22362formularize;
            int i2 = this.f22361cutely;
            if (i2 != i) {
                byte[] bArr = this.f22366taiyuan;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.f22362formularize = i3;
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
                    this.f22362formularize = i4;
                    return j;
                }
            }
            return splinterproof();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public double molybdenite() throws IOException {
            return Double.longBitsToDouble(walach());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean monoploid() throws IOException {
            return mathsort() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String oilcan() throws IOException {
            int iPeridotite = peridotite();
            if (iPeridotite > 0) {
                int i = this.f22361cutely;
                int i2 = this.f22362formularize;
                if (iPeridotite <= i - i2) {
                    String str = new String(this.f22366taiyuan, i2, iPeridotite, rotuma.f22277saneness);
                    this.f22362formularize += iPeridotite;
                    return str;
                }
            }
            if (iPeridotite == 0) {
                return "";
            }
            if (iPeridotite < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (iPeridotite > this.f22361cutely) {
                return new String(privatdozent(iPeridotite, false), rotuma.f22277saneness);
            }
            clubfoot(iPeridotite);
            String str2 = new String(this.f22366taiyuan, this.f22362formularize, iPeridotite, rotuma.f22277saneness);
            this.f22362formularize += iPeridotite;
            return str2;
        }

        public int peridotite() throws IOException {
            int i;
            int i2 = this.f22362formularize;
            int i3 = this.f22361cutely;
            if (i3 != i2) {
                byte[] bArr = this.f22366taiyuan;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.f22362formularize = i4;
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
                    this.f22362formularize = i5;
                    return i;
                }
            }
            return (int) splinterproof();
        }

        public void permissivist(int i) throws IOException {
            int i2 = this.f22361cutely;
            int i3 = this.f22362formularize;
            if (i > i2 - i3 || i < 0) {
                cultivated(i);
            } else {
                this.f22362formularize = i3 + i;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public ByteString polloi() throws IOException {
            int iPeridotite = peridotite();
            int i = this.f22361cutely;
            int i2 = this.f22362formularize;
            if (iPeridotite <= i - i2 && iPeridotite > 0) {
                ByteString byteStringCopyFrom = ByteString.copyFrom(this.f22366taiyuan, i2, iPeridotite);
                this.f22362formularize += iPeridotite;
                return byteStringCopyFrom;
            }
            if (iPeridotite == 0) {
                return ByteString.EMPTY;
            }
            if (iPeridotite >= 0) {
                return grimness(iPeridotite);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long preprohormone() throws IOException {
            return mathsort();
        }

        public final byte[] privatdozent(int i, boolean z) throws IOException {
            byte[] bArrCreditor = creditor(i);
            if (bArrCreditor != null) {
                return z ? (byte[]) bArrCreditor.clone() : bArrCreditor;
            }
            int i2 = this.f22362formularize;
            int i3 = this.f22361cutely;
            int length = i3 - i2;
            this.f22367triweekly += i3;
            this.f22362formularize = 0;
            this.f22361cutely = 0;
            List<byte[]> listStarveling = starveling(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f22366taiyuan, i2, bArr, 0, length);
            for (byte[] bArr2 : listStarveling) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public boolean restrictive(int i) throws IOException {
            int iSaneness = WireFormat.saneness(i);
            if (iSaneness == 0) {
                premeiotic();
                return true;
            }
            if (iSaneness == 1) {
                permissivist(8);
                return true;
            }
            if (iSaneness == 2) {
                permissivist(peridotite());
                return true;
            }
            if (iSaneness == 3) {
                merc();
                attabal(WireFormat.dern(WireFormat.attabal(i), 4));
                return true;
            }
            if (iSaneness == 4) {
                dern();
                return false;
            }
            if (iSaneness != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            permissivist(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int rotuma() throws IOException {
            return peridotite();
        }

        public byte saran() throws IOException {
            if (this.f22362formularize == this.f22361cutely) {
                clubfoot(1);
            }
            byte[] bArr = this.f22366taiyuan;
            int i = this.f22362formularize;
            this.f22362formularize = i + 1;
            return bArr[i];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int sealless() throws IOException {
            if (competently()) {
                this.f22363impassible = 0;
                return 0;
            }
            int iPeridotite = peridotite();
            this.f22363impassible = iPeridotite;
            if (WireFormat.attabal(iPeridotite) != 0) {
                return this.f22363impassible;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public long splinterproof() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bSaran = saran();
                j |= ((long) (bSaran & 127)) << i;
                if ((bSaran & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final List<byte[]> starveling(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.f22364impromptu.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f22367triweekly += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public int stratoscope() throws IOException {
            return taiyuan.wireman(peridotite());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long supplicat() throws IOException {
            return mathsort();
        }

        public final boolean treadless(int i) throws IOException {
            int i2 = this.f22362formularize;
            int i3 = i2 + i;
            int i4 = this.f22361cutely;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.f22325wireman;
            int i6 = this.f22367triweekly;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f22365kowloon) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.f22366taiyuan;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.f22367triweekly += i2;
                this.f22361cutely -= i2;
                this.f22362formularize = 0;
            }
            InputStream inputStream = this.f22364impromptu;
            byte[] bArr2 = this.f22366taiyuan;
            int i7 = this.f22361cutely;
            int iSeminary = seminary(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.f22325wireman - this.f22367triweekly) - i7));
            if (iSeminary != 0 && iSeminary >= -1 && iSeminary <= this.f22366taiyuan.length) {
                if (iSeminary <= 0) {
                    return false;
                }
                this.f22361cutely += iSeminary;
                overspeculate();
                return this.f22361cutely >= i || treadless(i);
            }
            throw new IllegalStateException(this.f22364impromptu.getClass() + "#read(byte[]) returned invalid result: " + iSeminary + "\nThe InputStream implementation is buggy.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public long trm() throws IOException {
            return taiyuan.marial(mathsort());
        }

        public long walach() throws IOException {
            int i = this.f22362formularize;
            if (this.f22361cutely - i < 8) {
                clubfoot(8);
                i = this.f22362formularize;
            }
            byte[] bArr = this.f22366taiyuan;
            this.f22362formularize = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.taiyuan
        public String yemenite() throws IOException {
            byte[] bArrPrivatdozent;
            int iPeridotite = peridotite();
            int i = this.f22362formularize;
            int i2 = this.f22361cutely;
            if (iPeridotite <= i2 - i && iPeridotite > 0) {
                bArrPrivatdozent = this.f22366taiyuan;
                this.f22362formularize = i + iPeridotite;
            } else {
                if (iPeridotite == 0) {
                    return "";
                }
                if (iPeridotite < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i = 0;
                if (iPeridotite <= i2) {
                    clubfoot(iPeridotite);
                    bArrPrivatdozent = this.f22366taiyuan;
                    this.f22362formularize = iPeridotite;
                } else {
                    bArrPrivatdozent = privatdozent(iPeridotite, false);
                }
            }
            return Utf8.impromptu(bArrPrivatdozent, i, iPeridotite);
        }

        public wireman(InputStream inputStream, int i) {
            super();
            this.f22365kowloon = Integer.MAX_VALUE;
            rotuma.saneness(inputStream, "input");
            this.f22364impromptu = inputStream;
            this.f22366taiyuan = new byte[i];
            this.f22361cutely = 0;
            this.f22362formularize = 0;
            this.f22367triweekly = 0;
        }
    }

    public static taiyuan apical(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return triweekly(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && marial.seminary()) {
            return new marial(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return triweekly(bArr, 0, iRemaining, true);
    }

    public static taiyuan cutely(Iterable<ByteBuffer> iterable, boolean z) {
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new dern(iterable, iRemaining, z) : impromptu(new preprohormone(iterable));
    }

    public static taiyuan formularize(byte[] bArr) {
        return impassible(bArr, 0, bArr.length);
    }

    public static taiyuan impassible(byte[] bArr, int i, int i2) {
        return triweekly(bArr, i, i2, false);
    }

    public static taiyuan impromptu(InputStream inputStream) {
        return taiyuan(inputStream, 4096);
    }

    public static long marial(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static taiyuan taiyuan(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? formularize(rotuma.f22278wireman) : new wireman(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static taiyuan triweekly(byte[] bArr, int i, int i2, boolean z) {
        saneness sanenessVar = new saneness(bArr, i, i2, z);
        try {
            sanenessVar.arytenoidectomy(i2);
            return sanenessVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int wireman(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int adultoid() throws IOException;

    public abstract int arytenoidectomy(int i) throws InvalidProtocolBufferException;

    public abstract void attabal(int i) throws InvalidProtocolBufferException;

    public abstract int beachfront();

    public abstract boolean competently() throws IOException;

    public abstract int cord() throws IOException;

    public abstract long cuirassed() throws IOException;

    public void dern() throws InvalidProtocolBufferException {
        if (this.f22324saneness == 0) {
            attabal(0);
        }
    }

    public abstract long dovishness() throws IOException;

    public abstract float gintrap() throws IOException;

    public abstract int graveside() throws IOException;

    public abstract int kattegat() throws IOException;

    public abstract void kowloon(int i);

    public void merc() throws IOException {
        boolean zRestrictive;
        do {
            int iSealless = sealless();
            if (iSealless == 0) {
                return;
            }
            saneness();
            this.f22324saneness++;
            zRestrictive = restrictive(iSealless);
            this.f22324saneness--;
        } while (zRestrictive);
    }

    public abstract double molybdenite() throws IOException;

    public abstract boolean monoploid() throws IOException;

    public abstract String oilcan() throws IOException;

    public abstract ByteString polloi() throws IOException;

    public abstract long preprohormone() throws IOException;

    public abstract boolean restrictive(int i) throws IOException;

    public abstract int rotuma() throws IOException;

    public void saneness() throws InvalidProtocolBufferException {
        if (this.f22320attabal + this.f22324saneness >= this.f22322dern) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public abstract int sealless() throws IOException;

    public abstract int stratoscope() throws IOException;

    public abstract long supplicat() throws IOException;

    public abstract long trm() throws IOException;

    public abstract String yemenite() throws IOException;

    public taiyuan() {
        this.f22322dern = f22319competently;
        this.f22325wireman = Integer.MAX_VALUE;
        this.f22321beachfront = false;
    }
}
