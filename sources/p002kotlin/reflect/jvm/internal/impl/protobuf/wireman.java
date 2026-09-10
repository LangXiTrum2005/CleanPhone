package p002kotlin.reflect.jvm.internal.impl.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class wireman implements Iterable<Byte> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final wireman f31186kowloon = new impassible(new byte[0]);

    /* JADX INFO: compiled from: ByteString.java */
    public interface attabal extends Iterator<Byte> {
        byte nextByte();
    }

    public static saneness arytenoidectomy() {
        return new saneness(128);
    }

    public static wireman beachfront(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new impassible(bArr2);
    }

    public static wireman competently(String str) {
        try {
            return new impassible(str.getBytes(C.UTF8_NAME));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static wireman marial(byte[] bArr) {
        return beachfront(bArr, 0, bArr.length);
    }

    public static wireman saneness(Iterator<wireman> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return saneness(it, i2).dern(saneness(it, i - i2));
    }

    public static wireman wireman(Iterable<wireman> iterable) {
        Collection arrayList;
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            arrayList = new ArrayList();
            Iterator<wireman> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList.isEmpty() ? f31186kowloon : saneness(arrayList.iterator(), arrayList.size());
    }

    public abstract String adultoid(String str) throws UnsupportedEncodingException;

    public abstract boolean apical();

    public abstract int cutely();

    public wireman dern(wireman wiremanVar) {
        int size = size();
        int size2 = wiremanVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return polloi.stratoscope(this, wiremanVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public String dovishness() {
        try {
            return adultoid(C.UTF8_NAME);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public void gintrap(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i3 = i + i2;
        if (i3 <= size()) {
            if (i2 > 0) {
                rotuma(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public byte[] graveside() {
        int size = size();
        if (size == 0) {
            return impromptu.f31132attabal;
        }
        byte[] bArr = new byte[size];
        taiyuan(bArr, 0, 0, size);
        return bArr;
    }

    public abstract boolean impassible();

    public void impromptu(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                taiyuan(bArr, i, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract marial kowloon();

    public abstract int molybdenite();

    public abstract int monoploid(int i, int i2, int i3);

    public abstract int polloi(int i, int i2, int i3);

    public abstract void rotuma(OutputStream outputStream, int i, int i2) throws IOException;

    public abstract int size();

    public abstract void taiyuan(byte[] bArr, int i, int i2, int i3);

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: triweekly */
    public abstract attabal iterator();

    /* JADX INFO: compiled from: ByteString.java */
    public static final class saneness extends OutputStream {

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public static final byte[] f31187graveside = new byte[0];

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final ArrayList<wireman> f31188arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final int f31189kowloon;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f31190molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f31191monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public byte[] f31192polloi;

        public saneness(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.f31189kowloon = i;
            this.f31188arytenoidectomy = new ArrayList<>();
            this.f31192polloi = new byte[i];
        }

        public final byte[] attabal(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        public synchronized wireman cutely() {
            dern();
            return wireman.wireman(this.f31188arytenoidectomy);
        }

        public final void dern() {
            int i = this.f31190molybdenite;
            byte[] bArr = this.f31192polloi;
            if (i >= bArr.length) {
                this.f31188arytenoidectomy.add(new impassible(this.f31192polloi));
                this.f31192polloi = f31187graveside;
            } else if (i > 0) {
                this.f31188arytenoidectomy.add(new impassible(attabal(bArr, i)));
            }
            this.f31191monoploid += this.f31190molybdenite;
            this.f31190molybdenite = 0;
        }

        public synchronized int marial() {
            return this.f31191monoploid + this.f31190molybdenite;
        }

        public final void saneness(int i) {
            this.f31188arytenoidectomy.add(new impassible(this.f31192polloi));
            int length = this.f31191monoploid + this.f31192polloi.length;
            this.f31191monoploid = length;
            this.f31192polloi = new byte[Math.max(this.f31189kowloon, Math.max(i, length >>> 1))];
            this.f31190molybdenite = 0;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(marial()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            try {
                if (this.f31190molybdenite == this.f31192polloi.length) {
                    saneness(1);
                }
                byte[] bArr = this.f31192polloi;
                int i2 = this.f31190molybdenite;
                this.f31190molybdenite = i2 + 1;
                bArr[i2] = (byte) i;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            try {
                byte[] bArr2 = this.f31192polloi;
                int length = bArr2.length;
                int i3 = this.f31190molybdenite;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.f31190molybdenite += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    saneness(i4);
                    System.arraycopy(bArr, i + length2, this.f31192polloi, 0, i4);
                    this.f31190molybdenite = i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
