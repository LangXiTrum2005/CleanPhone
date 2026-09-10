package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedOutputStream extends impromptu {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Logger f22109dern = Logger.getLogger(CodedOutputStream.class.getName());

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final boolean f22110wireman = sayid.supplicat();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public apical f22111attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f22112saneness;

    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        public OutOfSpaceException(int i, int i2, int i3) {
            this(i, i2, i3, (Throwable) null);
        }

        public OutOfSpaceException(int i, int i2, int i3, Throwable th) {
            this(i, i2, i3, th);
        }

        public OutOfSpaceException(long j, long j2, int i) {
            this(j, j2, i, (Throwable) null);
        }

        public OutOfSpaceException(long j, long j2, int i, Throwable th) {
            this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)), th);
        }
    }

    public static abstract class saneness extends CodedOutputStream {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f22117beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f22118competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f22119impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final byte[] f22120marial;

        public saneness(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f22120marial = bArr;
            this.f22117beachfront = bArr.length;
        }

        public final void basify(long j) {
            int i = this.f22118competently;
            byte[] bArr = this.f22120marial;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f22118competently = i + 8;
            this.f22119impromptu += 8;
        }

        public final void immediately(int i) {
            int i2 = this.f22118competently;
            byte[] bArr = this.f22120marial;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f22118competently = i2 + 4;
            this.f22119impromptu += 4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int itchy() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void licking(long j) {
            if (!CodedOutputStream.f22110wireman) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f22120marial;
                    int i = this.f22118competently;
                    this.f22118competently = i + 1;
                    bArr[i] = (byte) (((int) j) | 128);
                    this.f22119impromptu++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.f22120marial;
                int i2 = this.f22118competently;
                this.f22118competently = i2 + 1;
                bArr2[i2] = (byte) j;
                this.f22119impromptu++;
                return;
            }
            long j2 = this.f22118competently;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.f22120marial;
                int i3 = this.f22118competently;
                this.f22118competently = i3 + 1;
                sayid.privatdozent(bArr3, i3, (byte) (((int) j) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f22120marial;
            int i4 = this.f22118competently;
            this.f22118competently = i4 + 1;
            sayid.privatdozent(bArr4, i4, (byte) j);
            this.f22119impromptu += (int) (((long) this.f22118competently) - j2);
        }

        public final void osteal(int i) {
            if (!CodedOutputStream.f22110wireman) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f22120marial;
                    int i2 = this.f22118competently;
                    this.f22118competently = i2 + 1;
                    bArr[i2] = (byte) (i | 128);
                    this.f22119impromptu++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.f22120marial;
                int i3 = this.f22118competently;
                this.f22118competently = i3 + 1;
                bArr2[i3] = (byte) i;
                this.f22119impromptu++;
                return;
            }
            long j = this.f22118competently;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.f22120marial;
                int i4 = this.f22118competently;
                this.f22118competently = i4 + 1;
                sayid.privatdozent(bArr3, i4, (byte) (i | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.f22120marial;
            int i5 = this.f22118competently;
            this.f22118competently = i5 + 1;
            sayid.privatdozent(bArr4, i5, (byte) i);
            this.f22119impromptu += (int) (((long) this.f22118competently) - j);
        }

        public final void prefect(int i, int i2) {
            osteal(WireFormat.dern(i, i2));
        }

        public final void sakeen(byte b) {
            int i = this.f22118competently;
            this.f22120marial[i] = b;
            this.f22118competently = i + 1;
            this.f22119impromptu++;
        }

        public final void tectonization(int i) {
            if (i >= 0) {
                osteal(i);
            } else {
                licking(i);
            }
        }
    }

    public static final class wireman extends saneness {

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public final OutputStream f22121taiyuan;

        public wireman(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f22121taiyuan = outputStream;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.impromptu
        public void attabal(ByteBuffer byteBuffer) throws IOException {
            cosy(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void attendance(int i, String str) throws IOException {
            homozygous(i, 2);
            sultanate(str);
        }

        public void cig(int i, privatdozent privatdozentVar) throws IOException {
            homozygous(i, 2);
            demilitarize(privatdozentVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void claque(int i, ByteString byteString) throws IOException {
            homozygous(1, 3);
            lampshade(2, i);
            lotta(3, byteString);
            homozygous(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void coffeecake(byte b) throws IOException {
            if (this.f22118competently == this.f22117beachfront) {
                microchemistry();
            }
            sakeen(b);
        }

        public void cosy(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i = this.f22117beachfront;
            int i2 = this.f22118competently;
            if (i - i2 >= iRemaining) {
                byteBuffer.get(this.f22120marial, i2, iRemaining);
                this.f22118competently += iRemaining;
                this.f22119impromptu += iRemaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.f22120marial, i2, i3);
            int i4 = iRemaining - i3;
            this.f22118competently = this.f22117beachfront;
            this.f22119impromptu += i3;
            microchemistry();
            while (true) {
                int i5 = this.f22117beachfront;
                if (i4 <= i5) {
                    byteBuffer.get(this.f22120marial, 0, i4);
                    this.f22118competently = i4;
                    this.f22119impromptu += i4;
                    return;
                } else {
                    byteBuffer.get(this.f22120marial, 0, i5);
                    this.f22121taiyuan.write(this.f22120marial, 0, this.f22117beachfront);
                    int i6 = this.f22117beachfront;
                    i4 -= i6;
                    this.f22119impromptu += i6;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void deadwork(int i, long j) throws IOException {
            fastrack(20);
            prefect(i, 0);
            licking(j);
        }

        public void demilitarize(privatdozent privatdozentVar) throws IOException {
            libyan(privatdozentVar.getSerializedSize());
            privatdozentVar.attabal(this);
        }

        public final void fastrack(int i) throws IOException {
            if (this.f22117beachfront - this.f22118competently < i) {
                microchemistry();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void homozygous(int i, int i2) throws IOException {
            libyan(WireFormat.dern(i, i2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void lampshade(int i, int i2) throws IOException {
            fastrack(20);
            prefect(i, 0);
            osteal(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void lerp(int i, boolean z) throws IOException {
            fastrack(11);
            prefect(i, 0);
            sakeen(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void libyan(int i) throws IOException {
            fastrack(5);
            osteal(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void lightstruck(int i, int i2) throws IOException {
            fastrack(20);
            prefect(i, 0);
            tectonization(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void lotta(int i, ByteString byteString) throws IOException {
            homozygous(i, 2);
            tarboosh(byteString);
        }

        public final void microchemistry() throws IOException {
            this.f22121taiyuan.write(this.f22120marial, 0, this.f22118competently);
            this.f22118competently = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void molet(long j) throws IOException {
            fastrack(10);
            licking(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void monroe(int i) throws IOException {
            if (i >= 0) {
                libyan(i);
            } else {
                molet(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void permissivist() throws IOException {
            if (this.f22118competently > 0) {
                microchemistry();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void preterite(int i, long j) throws IOException {
            fastrack(18);
            prefect(i, 1);
            basify(j);
        }

        public void pruinose(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f22117beachfront;
            int i4 = this.f22118competently;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.f22120marial, i4, i2);
                this.f22118competently += i2;
                this.f22119impromptu += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.f22120marial, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.f22118competently = this.f22117beachfront;
            this.f22119impromptu += i5;
            microchemistry();
            if (i7 <= this.f22117beachfront) {
                System.arraycopy(bArr, i6, this.f22120marial, 0, i7);
                this.f22118competently = i7;
            } else {
                this.f22121taiyuan.write(bArr, i6, i7);
            }
            this.f22119impromptu += i7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.impromptu
        public void saneness(byte[] bArr, int i, int i2) throws IOException {
            pruinose(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void sensatory(int i, int i2) throws IOException {
            fastrack(14);
            prefect(i, 5);
            immediately(i2);
        }

        public void sultanate(String str) throws IOException {
            int iCutely;
            try {
                int length = str.length() * 3;
                int iMathsort = CodedOutputStream.mathsort(length);
                int i = iMathsort + length;
                int i2 = this.f22117beachfront;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int iTaiyuan = Utf8.taiyuan(str, bArr, 0, length);
                    libyan(iTaiyuan);
                    saneness(bArr, 0, iTaiyuan);
                    return;
                }
                if (i > i2 - this.f22118competently) {
                    microchemistry();
                }
                int iMathsort2 = CodedOutputStream.mathsort(str.length());
                int i3 = this.f22118competently;
                try {
                    if (iMathsort2 == iMathsort) {
                        int i4 = i3 + iMathsort2;
                        this.f22118competently = i4;
                        int iTaiyuan2 = Utf8.taiyuan(str, this.f22120marial, i4, this.f22117beachfront - i4);
                        this.f22118competently = i3;
                        iCutely = (iTaiyuan2 - i3) - iMathsort2;
                        osteal(iCutely);
                        this.f22118competently = iTaiyuan2;
                    } else {
                        iCutely = Utf8.cutely(str);
                        osteal(iCutely);
                        this.f22118competently = Utf8.taiyuan(str, this.f22120marial, this.f22118competently, iCutely);
                    }
                    this.f22119impromptu += iCutely;
                } catch (Utf8.UnpairedSurrogateException e) {
                    this.f22119impromptu -= this.f22118competently - i3;
                    this.f22118competently = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (Utf8.UnpairedSurrogateException e3) {
                cultivated(str, e3);
            }
        }

        public void tarboosh(ByteString byteString) throws IOException {
            libyan(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void unconsolidated(int i, privatdozent privatdozentVar) throws IOException {
            homozygous(1, 3);
            lampshade(2, i);
            cig(3, privatdozentVar);
            homozygous(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void underbelly(int i) throws IOException {
            fastrack(4);
            immediately(i);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void wostteth(long j) throws IOException {
            fastrack(8);
            basify(j);
        }
    }

    @Deprecated
    public static int adultoid(privatdozent privatdozentVar, premeiotic premeioticVar) {
        return ((com.google.crypto.tink.shaded.protobuf.attabal) privatdozentVar).dern(premeioticVar);
    }

    public static int apical(double d) {
        return 8;
    }

    public static int arytenoidectomy(int i, long j) {
        return walach(i) + monoploid(j);
    }

    public static int beachfront(boolean z) {
        return 1;
    }

    public static int clubfoot(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int competently(byte[] bArr) {
        return trm(bArr.length);
    }

    public static int cord(int i, stratoscope stratoscopeVar) {
        return (walach(1) * 2) + peridotite(2, i) + cuirassed(3, stratoscopeVar);
    }

    public static int creditor(long j) {
        return overspeculate(dent(j));
    }

    public static int cuirassed(int i, stratoscope stratoscopeVar) {
        return walach(i) + stratoscope(stratoscopeVar);
    }

    public static int cutely(int i, double d) {
        return walach(i) + apical(d);
    }

    public static long dent(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int dovishness(int i, int i2) {
        return walach(i) + gintrap(i2);
    }

    public static int formularize(int i, int i2) {
        return walach(i) + impassible(i2);
    }

    public static int gintrap(int i) {
        return overspeculate(i);
    }

    @Deprecated
    public static int graveside(int i, privatdozent privatdozentVar, premeiotic premeioticVar) {
        return (walach(i) * 2) + adultoid(privatdozentVar, premeioticVar);
    }

    public static int grimness(int i, int i2) {
        return walach(i) + saran(i2);
    }

    public static int hydrovane(String str) {
        int length;
        try {
            length = Utf8.cutely(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(rotuma.f22277saneness).length;
        }
        return trm(length);
    }

    public static int impassible(int i) {
        return gintrap(i);
    }

    public static int impromptu(int i, ByteString byteString) {
        return walach(i) + taiyuan(byteString);
    }

    public static int kattegat(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int kowloon(int i) {
        return 4;
    }

    public static int marial(int i, boolean z) {
        return walach(i) + beachfront(z);
    }

    public static int mathsort(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int merc(int i) {
        return 4;
    }

    public static CodedOutputStream milliradian(byte[] bArr) {
        return treadless(bArr, 0, bArr.length);
    }

    public static int molybdenite(float f) {
        return 4;
    }

    public static int monoploid(long j) {
        return 8;
    }

    public static int oilcan(int i, privatdozent privatdozentVar) {
        return (walach(1) * 2) + peridotite(2, i) + yemenite(3, privatdozentVar);
    }

    public static int overspeculate(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int peridotite(int i, int i2) {
        return walach(i) + mathsort(i2);
    }

    public static int polder(int i, long j) {
        return walach(i) + seminary(j);
    }

    public static int polloi(int i, float f) {
        return walach(i) + molybdenite(f);
    }

    public static int preprohormone(long j) {
        return overspeculate(j);
    }

    public static int privatdozent(int i, long j) {
        return walach(i) + creditor(j);
    }

    public static int restrictive(int i, int i2) {
        return walach(i) + merc(i2);
    }

    public static int rotuma(int i, long j) {
        return walach(i) + preprohormone(j);
    }

    public static int saran(int i) {
        return mathsort(clubfoot(i));
    }

    public static int sealless(privatdozent privatdozentVar) {
        return trm(privatdozentVar.getSerializedSize());
    }

    public static int seminary(long j) {
        return 8;
    }

    public static int splinterproof(int i, long j) {
        return walach(i) + overspeculate(j);
    }

    public static int starveling(int i, String str) {
        return walach(i) + hydrovane(str);
    }

    public static int stratoscope(stratoscope stratoscopeVar) {
        return trm(stratoscopeVar.saneness());
    }

    public static int supplicat(int i, ByteString byteString) {
        return (walach(1) * 2) + peridotite(2, i) + impromptu(3, byteString);
    }

    public static int taiyuan(ByteString byteString) {
        return trm(byteString.size());
    }

    public static CodedOutputStream timberyard(OutputStream outputStream, int i) {
        return new wireman(outputStream, i);
    }

    public static CodedOutputStream treadless(byte[] bArr, int i, int i2) {
        return new dern(bArr, i, i2);
    }

    public static int triweekly(int i, int i2) {
        return walach(i) + kowloon(i2);
    }

    public static int trm(int i) {
        return mathsort(i) + i;
    }

    public static int walach(int i) {
        return mathsort(WireFormat.dern(i, 0));
    }

    public static int yemenite(int i, privatdozent privatdozentVar) {
        return walach(i) + sealless(privatdozentVar);
    }

    public final void achondroplasia(long j) throws IOException {
        molet(j);
    }

    public abstract void attendance(int i, String str) throws IOException;

    public abstract void claque(int i, ByteString byteString) throws IOException;

    public abstract void coffeecake(byte b) throws IOException;

    public final void coi(int i, int i2) throws IOException {
        lightstruck(i, i2);
    }

    public final void cultivated(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws IOException {
        f22109dern.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(rotuma.f22277saneness);
        try {
            libyan(bytes.length);
            saneness(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    public final void czestochowa(int i) throws IOException {
        monroe(i);
    }

    public abstract void deadwork(int i, long j) throws IOException;

    public final void dhss(int i, int i2) throws IOException {
        lampshade(i, clubfoot(i2));
    }

    public final void empress(double d) throws IOException {
        wostteth(Double.doubleToRawLongBits(d));
    }

    public final void gusty(float f) throws IOException {
        underbelly(Float.floatToRawIntBits(f));
    }

    public final void hardpan(int i, int i2) throws IOException {
        sensatory(i, i2);
    }

    public final void herdbook(int i) throws IOException {
        underbelly(i);
    }

    public abstract void homozygous(int i, int i2) throws IOException;

    public final void igbo(int i, float f) throws IOException {
        sensatory(i, Float.floatToRawIntBits(f));
    }

    public abstract int itchy();

    public final void julian(int i, long j) throws IOException {
        deadwork(i, j);
    }

    public abstract void lampshade(int i, int i2) throws IOException;

    public abstract void lerp(int i, boolean z) throws IOException;

    public abstract void libyan(int i) throws IOException;

    public abstract void lightstruck(int i, int i2) throws IOException;

    public abstract void lotta(int i, ByteString byteString) throws IOException;

    public final void mastfed(long j) throws IOException {
        molet(dent(j));
    }

    public abstract void molet(long j) throws IOException;

    public abstract void monroe(int i) throws IOException;

    public final void nosophobia(boolean z) throws IOException {
        coffeecake(z ? (byte) 1 : (byte) 0);
    }

    public final void outmarry(long j) throws IOException {
        wostteth(j);
    }

    @Deprecated
    public final void palmyra(privatdozent privatdozentVar, premeiotic premeioticVar) throws IOException {
        premeioticVar.dern(privatdozentVar, this.f22111attabal);
    }

    public abstract void permissivist() throws IOException;

    @Deprecated
    public final void picketboat(int i, privatdozent privatdozentVar, premeiotic premeioticVar) throws IOException {
        homozygous(i, 3);
        palmyra(privatdozentVar, premeioticVar);
        homozygous(i, 4);
    }

    public boolean premeiotic() {
        return this.f22112saneness;
    }

    public abstract void preterite(int i, long j) throws IOException;

    @Override // com.google.crypto.tink.shaded.protobuf.impromptu
    public abstract void saneness(byte[] bArr, int i, int i2) throws IOException;

    public final void sayid(int i, double d) throws IOException {
        preterite(i, Double.doubleToRawLongBits(d));
    }

    public abstract void sensatory(int i, int i2) throws IOException;

    public final void setterwort(int i, long j) throws IOException {
        deadwork(i, dent(j));
    }

    public final void technofreak(int i, long j) throws IOException {
        preterite(i, j);
    }

    public abstract void unconsolidated(int i, privatdozent privatdozentVar) throws IOException;

    public abstract void underbelly(int i) throws IOException;

    public final void vesuvio(int i) throws IOException {
        libyan(clubfoot(i));
    }

    public final void wireman() {
        if (itchy() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void wostteth(long j) throws IOException;

    public CodedOutputStream() {
    }

    public static class dern extends CodedOutputStream {

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final int f22113beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public final int f22114competently;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f22115impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final byte[] f22116marial;

        public dern(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f22116marial = bArr;
            this.f22113beachfront = i;
            this.f22115impromptu = i;
            this.f22114competently = i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.impromptu
        public final void attabal(ByteBuffer byteBuffer) throws IOException {
            sakeen(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void attendance(int i, String str) throws IOException {
            homozygous(i, 2);
            osteal(str);
        }

        public final void basify(ByteString byteString) throws IOException {
            libyan(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void claque(int i, ByteString byteString) throws IOException {
            homozygous(1, 3);
            lampshade(2, i);
            lotta(3, byteString);
            homozygous(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void coffeecake(byte b) throws IOException {
            int i = this.f22115impromptu;
            try {
                int i2 = i + 1;
                try {
                    this.f22116marial[i] = b;
                    this.f22115impromptu = i2;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i2;
                    throw new OutOfSpaceException(i, this.f22114competently, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void deadwork(int i, long j) throws IOException {
            homozygous(i, 0);
            molet(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void homozygous(int i, int i2) throws IOException {
            libyan(WireFormat.dern(i, i2));
        }

        public final void immediately(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f22116marial, this.f22115impromptu, i2);
                this.f22115impromptu += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(this.f22115impromptu, this.f22114competently, i2, (Throwable) e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int itchy() {
            return this.f22114competently - this.f22115impromptu;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void lampshade(int i, int i2) throws IOException {
            homozygous(i, 0);
            libyan(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void lerp(int i, boolean z) throws IOException {
            homozygous(i, 0);
            coffeecake(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void libyan(int i) throws IOException {
            int i2;
            int i3 = this.f22115impromptu;
            while ((i & (-128)) != 0) {
                try {
                    i2 = i3 + 1;
                    try {
                        this.f22116marial[i3] = (byte) (i | 128);
                        i >>>= 7;
                        i3 = i2;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i2;
                        throw new OutOfSpaceException(i3, this.f22114competently, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    throw new OutOfSpaceException(i3, this.f22114competently, 1, (Throwable) e);
                }
            }
            i2 = i3 + 1;
            this.f22116marial[i3] = (byte) i;
            this.f22115impromptu = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void lightstruck(int i, int i2) throws IOException {
            homozygous(i, 0);
            monroe(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void lotta(int i, ByteString byteString) throws IOException {
            homozygous(i, 2);
            basify(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void molet(long j) throws IOException {
            int i;
            int i2 = this.f22115impromptu;
            if (!CodedOutputStream.f22110wireman || itchy() < 10) {
                while ((j & (-128)) != 0) {
                    try {
                        int i3 = i2 + 1;
                        try {
                            this.f22116marial[i2] = (byte) (((int) j) | 128);
                            j >>>= 7;
                            i2 = i3;
                        } catch (IndexOutOfBoundsException e) {
                            e = e;
                            i2 = i3;
                            throw new OutOfSpaceException(i2, this.f22114competently, 1, (Throwable) e);
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        e = e2;
                    }
                }
                i = i2 + 1;
                try {
                    this.f22116marial[i2] = (byte) j;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i2 = i;
                    throw new OutOfSpaceException(i2, this.f22114competently, 1, (Throwable) e);
                }
            } else {
                while ((j & (-128)) != 0) {
                    sayid.privatdozent(this.f22116marial, i2, (byte) (((int) j) | 128));
                    j >>>= 7;
                    i2++;
                }
                i = i2 + 1;
                sayid.privatdozent(this.f22116marial, i2, (byte) j);
            }
            this.f22115impromptu = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void monroe(int i) throws IOException {
            if (i >= 0) {
                libyan(i);
            } else {
                molet(i);
            }
        }

        public final void osteal(String str) throws IOException {
            int i = this.f22115impromptu;
            try {
                int iMathsort = CodedOutputStream.mathsort(str.length() * 3);
                int iMathsort2 = CodedOutputStream.mathsort(str.length());
                if (iMathsort2 != iMathsort) {
                    libyan(Utf8.cutely(str));
                    this.f22115impromptu = Utf8.taiyuan(str, this.f22116marial, this.f22115impromptu, itchy());
                    return;
                }
                int i2 = i + iMathsort2;
                this.f22115impromptu = i2;
                int iTaiyuan = Utf8.taiyuan(str, this.f22116marial, i2, itchy());
                this.f22115impromptu = i;
                libyan((iTaiyuan - i) - iMathsort2);
                this.f22115impromptu = iTaiyuan;
            } catch (Utf8.UnpairedSurrogateException e) {
                this.f22115impromptu = i;
                cultivated(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final void prefect(privatdozent privatdozentVar) throws IOException {
            libyan(privatdozentVar.getSerializedSize());
            privatdozentVar.attabal(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void preterite(int i, long j) throws IOException {
            homozygous(i, 1);
            wostteth(j);
        }

        public final void sakeen(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f22116marial, this.f22115impromptu, iRemaining);
                this.f22115impromptu += iRemaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(this.f22115impromptu, this.f22114competently, iRemaining, (Throwable) e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.impromptu
        public final void saneness(byte[] bArr, int i, int i2) throws IOException {
            immediately(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void sensatory(int i, int i2) throws IOException {
            homozygous(i, 5);
            underbelly(i2);
        }

        public final void tectonization(int i, privatdozent privatdozentVar) throws IOException {
            homozygous(i, 2);
            prefect(privatdozentVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void unconsolidated(int i, privatdozent privatdozentVar) throws IOException {
            homozygous(1, 3);
            lampshade(2, i);
            tectonization(3, privatdozentVar);
            homozygous(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void underbelly(int i) throws IOException {
            int i2 = this.f22115impromptu;
            try {
                byte[] bArr = this.f22116marial;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                bArr[i2 + 3] = (byte) (i >> 24);
                this.f22115impromptu = i2 + 4;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(i2, this.f22114competently, 4, (Throwable) e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void wostteth(long j) throws IOException {
            int i = this.f22115impromptu;
            try {
                byte[] bArr = this.f22116marial;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                bArr[i + 7] = (byte) (j >> 56);
                this.f22115impromptu = i + 8;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(i, this.f22114competently, 8, (Throwable) e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void permissivist() {
        }
    }
}
