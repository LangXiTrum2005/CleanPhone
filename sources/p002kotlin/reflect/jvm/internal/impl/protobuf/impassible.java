package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: LiteralByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public class impassible extends wireman {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final byte[] f31127arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f31128monoploid = 0;

    /* JADX INFO: compiled from: LiteralByteString.java */
    public class saneness implements wireman.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final int f31129arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f31130kowloon;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31130kowloon < this.f31129arytenoidectomy;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.wireman.attabal
        public byte nextByte() {
            try {
                byte[] bArr = impassible.this.f31127arytenoidectomy;
                int i = this.f31130kowloon;
                this.f31130kowloon = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public saneness() {
            this.f31130kowloon = 0;
            this.f31129arytenoidectomy = impassible.this.size();
        }
    }

    public impassible(byte[] bArr) {
        this.f31127arytenoidectomy = bArr;
    }

    public static int stratoscope(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public String adultoid(String str) throws UnsupportedEncodingException {
        return new String(this.f31127arytenoidectomy, cuirassed(), size(), str);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public boolean apical() {
        return true;
    }

    public boolean cord(impassible impassibleVar, int i, int i2) {
        if (i2 > impassibleVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 > impassibleVar.size()) {
            int size2 = impassibleVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f31127arytenoidectomy;
        byte[] bArr2 = impassibleVar.f31127arytenoidectomy;
        int iCuirassed = cuirassed() + i2;
        int iCuirassed2 = cuirassed();
        int iCuirassed3 = impassibleVar.cuirassed() + i;
        while (iCuirassed2 < iCuirassed) {
            if (bArr[iCuirassed2] != bArr2[iCuirassed3]) {
                return false;
            }
            iCuirassed2++;
            iCuirassed3++;
        }
        return true;
    }

    public int cuirassed() {
        return 0;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int cutely() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wireman) || size() != ((wireman) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof impassible) {
            return cord((impassible) obj, 0, size());
        }
        if (obj instanceof polloi) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(strValueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int iMonoploid = this.f31128monoploid;
        if (iMonoploid == 0) {
            int size = size();
            iMonoploid = monoploid(size, 0, size);
            if (iMonoploid == 0) {
                iMonoploid = 1;
            }
            this.f31128monoploid = iMonoploid;
        }
        return iMonoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public boolean impassible() {
        int iCuirassed = cuirassed();
        return adultoid.beachfront(this.f31127arytenoidectomy, iCuirassed, size() + iCuirassed);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public marial kowloon() {
        return marial.impromptu(this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int molybdenite() {
        return this.f31128monoploid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int monoploid(int i, int i2, int i3) {
        return stratoscope(i, this.f31127arytenoidectomy, cuirassed() + i2, i3);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int polloi(int i, int i2, int i3) {
        int iCuirassed = cuirassed() + i2;
        return adultoid.competently(i, this.f31127arytenoidectomy, iCuirassed, i3 + iCuirassed);
    }

    public byte preprohormone(int i) {
        return this.f31127arytenoidectomy[i];
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public void rotuma(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f31127arytenoidectomy, cuirassed() + i, i2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int size() {
        return this.f31127arytenoidectomy.length;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public void taiyuan(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f31127arytenoidectomy, i, bArr, i2, i3);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.wireman, java.lang.Iterable
    /* JADX INFO: renamed from: triweekly, reason: merged with bridge method [inline-methods] */
    public wireman.attabal iterator() {
        return new saneness();
    }
}
