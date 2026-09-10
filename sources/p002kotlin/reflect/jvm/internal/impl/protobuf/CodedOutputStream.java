package p002kotlin.reflect.jvm.internal.impl.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public final class CodedOutputStream {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f31070attabal;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final OutputStream f31072marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f31073saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f31074wireman = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f31071dern = 0;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f31072marial = outputStream;
        this.f31070attabal = bArr;
        this.f31073saneness = bArr.length;
    }

    public static int adultoid(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int apical(long j) {
        return 8;
    }

    public static int arytenoidectomy(int i) {
        if (i >= 0) {
            return dovishness(i);
        }
        return 10;
    }

    public static int attabal(int i, boolean z) {
        return oilcan(i) + saneness(z);
    }

    public static int beachfront(int i, double d) {
        return oilcan(i) + competently(d);
    }

    public static int competently(double d) {
        return 8;
    }

    public static int cord(int i) {
        return dovishness(kattegat(i));
    }

    public static int cuirassed(int i, long j) {
        return oilcan(i) + stratoscope(j);
    }

    public static int cutely(int i) {
        return 4;
    }

    public static int dern(byte[] bArr) {
        return dovishness(bArr.length) + bArr.length;
    }

    public static int dovishness(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int formularize(int i, float f) {
        return oilcan(i) + impassible(f);
    }

    public static int gintrap(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int graveside(triweekly triweeklyVar) {
        int serializedSize = triweeklyVar.getSerializedSize();
        return dovishness(serializedSize) + serializedSize;
    }

    public static int impassible(float f) {
        return 4;
    }

    public static int impromptu(int i, int i2) {
        return oilcan(i) + taiyuan(i2);
    }

    public static int kattegat(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int kowloon(int i, int i2) {
        return oilcan(i) + arytenoidectomy(i2);
    }

    public static int marial(wireman wiremanVar) {
        return dovishness(wiremanVar.size()) + wiremanVar.size();
    }

    public static CodedOutputStream merc(OutputStream outputStream, int i) {
        return new CodedOutputStream(outputStream, new byte[i]);
    }

    public static int molybdenite(int i, triweekly triweeklyVar) {
        return oilcan(i) + graveside(triweeklyVar);
    }

    public static int monoploid(long j) {
        return gintrap(j);
    }

    public static int oilcan(int i) {
        return dovishness(WireFormat.dern(i, 0));
    }

    public static int polloi(cutely cutelyVar) {
        int iSaneness = cutelyVar.saneness();
        return dovishness(iSaneness) + iSaneness;
    }

    public static int preprohormone(long j) {
        return 8;
    }

    public static int rotuma(int i) {
        return 4;
    }

    public static int saneness(boolean z) {
        return 1;
    }

    public static int sealless(long j) {
        return gintrap(j);
    }

    public static int stratoscope(long j) {
        return gintrap(supplicat(j));
    }

    public static long supplicat(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int taiyuan(int i) {
        return arytenoidectomy(i);
    }

    public static int triweekly(triweekly triweeklyVar) {
        return triweeklyVar.getSerializedSize();
    }

    public static int trm(String str) {
        try {
            byte[] bytes = str.getBytes(C.UTF8_NAME);
            return dovishness(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public static int wireman(int i, wireman wiremanVar) {
        return oilcan(i) + marial(wiremanVar);
    }

    public static int yemenite(int i) {
        return dovishness(i);
    }

    public void achondroplasia(long j) throws IOException {
        underbelly(j);
    }

    public void clubfoot(float f) throws IOException {
        coi(Float.floatToRawIntBits(f));
    }

    public void coffeecake(byte b) throws IOException {
        if (this.f31071dern == this.f31073saneness) {
            polder();
        }
        byte[] bArr = this.f31070attabal;
        int i = this.f31071dern;
        this.f31071dern = i + 1;
        bArr[i] = b;
        this.f31074wireman++;
    }

    public void coi(int i) throws IOException {
        lerp(i & 255);
        lerp((i >> 8) & 255);
        lerp((i >> 16) & 255);
        lerp((i >> 24) & 255);
    }

    public void creditor(wireman wiremanVar) throws IOException {
        sensatory(wiremanVar.size());
        nosophobia(wiremanVar);
    }

    public void cultivated(int i, int i2) throws IOException {
        lightstruck(i, 0);
        premeiotic(i2);
    }

    public void czestochowa(long j) throws IOException {
        lerp(((int) j) & 255);
        lerp(((int) (j >> 8)) & 255);
        lerp(((int) (j >> 16)) & 255);
        lerp(((int) (j >> 24)) & 255);
        lerp(((int) (j >> 32)) & 255);
        lerp(((int) (j >> 40)) & 255);
        lerp(((int) (j >> 48)) & 255);
        lerp(((int) (j >> 56)) & 255);
    }

    public void dent(int i, triweekly triweeklyVar) throws IOException {
        lightstruck(i, 3);
        permissivist(triweeklyVar);
        lightstruck(i, 4);
    }

    public void empress(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f31073saneness;
        int i4 = this.f31071dern;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f31070attabal, i4, i2);
            this.f31071dern += i2;
            this.f31074wireman += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f31070attabal, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f31071dern = this.f31073saneness;
        this.f31074wireman += i5;
        polder();
        if (i7 <= this.f31073saneness) {
            System.arraycopy(bArr, i6, this.f31070attabal, 0, i7);
            this.f31071dern = i7;
        } else {
            this.f31072marial.write(bArr, i6, i7);
        }
        this.f31074wireman += i7;
    }

    public void grimness(boolean z) throws IOException {
        lerp(z ? 1 : 0);
    }

    public void gusty(int i, long j) throws IOException {
        lightstruck(i, 0);
        picketboat(j);
    }

    public void hydrovane(double d) throws IOException {
        czestochowa(Double.doubleToRawLongBits(d));
    }

    public void igbo(int i) throws IOException {
        sensatory(kattegat(i));
    }

    public void itchy(int i, triweekly triweeklyVar) throws IOException {
        lightstruck(1, 3);
        monroe(2, i);
        milliradian(3, triweeklyVar);
        lightstruck(1, 4);
    }

    public void julian(int i) throws IOException {
        sensatory(i);
    }

    public void lerp(int i) throws IOException {
        coffeecake((byte) i);
    }

    public void lightstruck(int i, int i2) throws IOException {
        sensatory(WireFormat.dern(i, i2));
    }

    public void lotta(wireman wiremanVar, int i, int i2) throws IOException {
        int i3 = this.f31073saneness;
        int i4 = this.f31071dern;
        if (i3 - i4 >= i2) {
            wiremanVar.impromptu(this.f31070attabal, i, i4, i2);
            this.f31071dern += i2;
            this.f31074wireman += i2;
            return;
        }
        int i5 = i3 - i4;
        wiremanVar.impromptu(this.f31070attabal, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f31071dern = this.f31073saneness;
        this.f31074wireman += i5;
        polder();
        if (i7 <= this.f31073saneness) {
            wiremanVar.impromptu(this.f31070attabal, i6, 0, i7);
            this.f31071dern = i7;
        } else {
            wiremanVar.gintrap(this.f31072marial, i6, i7);
        }
        this.f31074wireman += i7;
    }

    public void mathsort(int i) throws IOException {
        coi(i);
    }

    public void milliradian(int i, triweekly triweeklyVar) throws IOException {
        lightstruck(i, 2);
        treadless(triweeklyVar);
    }

    public void monroe(int i, int i2) throws IOException {
        lightstruck(i, 0);
        julian(i2);
    }

    public void nosophobia(wireman wiremanVar) throws IOException {
        lotta(wiremanVar, 0, wiremanVar.size());
    }

    public void overspeculate(int i, float f) throws IOException {
        lightstruck(i, 5);
        clubfoot(f);
    }

    public void palmyra(String str) throws IOException {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        sensatory(bytes.length);
        sayid(bytes);
    }

    public void peridotite(int i) throws IOException {
        premeiotic(i);
    }

    public void permissivist(triweekly triweeklyVar) throws IOException {
        triweeklyVar.writeTo(this);
    }

    public void picketboat(long j) throws IOException {
        underbelly(supplicat(j));
    }

    public final void polder() throws IOException {
        OutputStream outputStream = this.f31072marial;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f31070attabal, 0, this.f31071dern);
        this.f31071dern = 0;
    }

    public void premeiotic(int i) throws IOException {
        if (i >= 0) {
            sensatory(i);
        } else {
            underbelly(i);
        }
    }

    public void preterite(int i) throws IOException {
        coi(i);
    }

    public void privatdozent(int i, wireman wiremanVar) throws IOException {
        lightstruck(i, 2);
        creditor(wiremanVar);
    }

    public void restrictive() throws IOException {
        if (this.f31072marial != null) {
            polder();
        }
    }

    public void saran(byte[] bArr) throws IOException {
        sensatory(bArr.length);
        sayid(bArr);
    }

    public void sayid(byte[] bArr) throws IOException {
        empress(bArr, 0, bArr.length);
    }

    public void seminary(int i, boolean z) throws IOException {
        lightstruck(i, 0);
        grimness(z);
    }

    public void sensatory(int i) throws IOException {
        while ((i & (-128)) != 0) {
            lerp((i & 127) | 128);
            i >>>= 7;
        }
        lerp(i);
    }

    public void splinterproof(long j) throws IOException {
        czestochowa(j);
    }

    public void starveling(int i, double d) throws IOException {
        lightstruck(i, 1);
        hydrovane(d);
    }

    public void timberyard(long j) throws IOException {
        underbelly(j);
    }

    public void treadless(triweekly triweeklyVar) throws IOException {
        sensatory(triweeklyVar.getSerializedSize());
        triweeklyVar.writeTo(this);
    }

    public void underbelly(long j) throws IOException {
        while (((-128) & j) != 0) {
            lerp((((int) j) & 127) | 128);
            j >>>= 7;
        }
        lerp((int) j);
    }

    public void walach(int i, int i2) throws IOException {
        lightstruck(i, 0);
        peridotite(i2);
    }

    public void wostteth(long j) throws IOException {
        czestochowa(j);
    }
}
