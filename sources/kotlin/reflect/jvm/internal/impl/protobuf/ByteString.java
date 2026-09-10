package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final ByteString X = new LiteralByteString(new byte[0]);

    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    public static ByteString a(Iterator it, int i2) {
        if (i2 == 1) {
            return (ByteString) it.next();
        }
        int i3 = i2 >>> 1;
        return a(it, i3).c(a(it, i2 - i3));
    }

    public static ByteString d(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    public static Output o() {
        return new Output();
    }

    public final ByteString c(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = RopeByteString.i0;
        RopeByteString ropeByteString = this instanceof RopeByteString ? (RopeByteString) this : null;
        if (byteString.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return byteString;
        }
        int size3 = byteString.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = byteString.size();
            byte[] bArr = new byte[size4 + size5];
            e(bArr, 0, 0, size4);
            byteString.e(bArr, 0, size4, size5);
            return new LiteralByteString(bArr);
        }
        if (ropeByteString != null) {
            ByteString byteString2 = ropeByteString.e0;
            if (byteString.size() + byteString2.size() < 128) {
                int size6 = byteString2.size();
                int size7 = byteString.size();
                byte[] bArr2 = new byte[size6 + size7];
                byteString2.e(bArr2, 0, 0, size6);
                byteString.e(bArr2, 0, size6, size7);
                return new RopeByteString(ropeByteString.Z, new LiteralByteString(bArr2));
            }
        }
        if (ropeByteString != null) {
            ByteString byteString3 = ropeByteString.Z;
            int iG = byteString3.g();
            ByteString byteString4 = ropeByteString.e0;
            if (iG > byteString4.g()) {
                if (ropeByteString.g0 > byteString.g()) {
                    return new RopeByteString(byteString3, new RopeByteString(byteString4, byteString));
                }
            }
        }
        if (size3 >= RopeByteString.i0[Math.max(g(), byteString.g()) + 1]) {
            return new RopeByteString(this, byteString);
        }
        RopeByteString.Balancer balancer = new RopeByteString.Balancer();
        balancer.a(this);
        balancer.a(byteString);
        Stack stack = balancer.f44222a;
        ByteString ropeByteString2 = (ByteString) stack.pop();
        while (!stack.isEmpty()) {
            ropeByteString2 = new RopeByteString((ByteString) stack.pop(), ropeByteString2);
        }
        return ropeByteString2;
    }

    public final void e(byte[] bArr, int i2, int i3, int i4) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i4 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i4);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i5 = i2 + i4;
        if (i5 > size()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i5);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i6 = i3 + i4;
        if (i6 <= bArr.length) {
            if (i4 > 0) {
                f(bArr, i2, i3, i4);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i6);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract void f(byte[] bArr, int i2, int i3, int i4);

    public abstract int g();

    public abstract boolean h();

    public abstract boolean i();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: l */
    public abstract ByteIterator iterator();

    public abstract int p(int i2, int i3, int i4);

    public abstract int s(int i2, int i3, int i4);

    public abstract int size();

    public abstract int t();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String u();

    public final String v() {
        try {
            return u();
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    public abstract void w(OutputStream outputStream, int i2, int i3);

    public static final class Output extends OutputStream {
        public static final byte[] g0 = new byte[0];
        public int Z;
        public int f0;
        public final int X = 128;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final ArrayList f44188Y = new ArrayList();
        public byte[] e0 = new byte[128];

        public final void a(int i2) {
            this.f44188Y.add(new LiteralByteString(this.e0));
            int length = this.Z + this.e0.length;
            this.Z = length;
            this.e0 = new byte[Math.max(this.X, Math.max(i2, length >>> 1))];
            this.f0 = 0;
        }

        public final void d() {
            int i2 = this.f0;
            byte[] bArr = this.e0;
            int length = bArr.length;
            ArrayList arrayList = this.f44188Y;
            if (i2 >= length) {
                arrayList.add(new LiteralByteString(this.e0));
                this.e0 = g0;
            } else if (i2 > 0) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
                arrayList.add(new LiteralByteString(bArr2));
            }
            this.Z += this.f0;
            this.f0 = 0;
        }

        public final synchronized ByteString h() {
            ArrayList arrayList;
            d();
            arrayList = this.f44188Y;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((ByteString) it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? ByteString.X : ByteString.a(arrayList.iterator(), arrayList.size());
        }

        public final String toString() {
            int i2;
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
                i2 = this.Z + this.f0;
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i2));
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i2) {
            try {
                if (this.f0 == this.e0.length) {
                    a(1);
                }
                byte[] bArr = this.e0;
                int i3 = this.f0;
                this.f0 = i3 + 1;
                bArr[i3] = (byte) i2;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i2, int i3) {
            try {
                byte[] bArr2 = this.e0;
                int length = bArr2.length;
                int i4 = this.f0;
                if (i3 <= length - i4) {
                    System.arraycopy(bArr, i2, bArr2, i4, i3);
                    this.f0 += i3;
                } else {
                    int length2 = bArr2.length - i4;
                    System.arraycopy(bArr, i2, bArr2, i4, length2);
                    int i5 = i3 - length2;
                    a(i5);
                    System.arraycopy(bArr, i2 + length2, this.e0, 0, i5);
                    this.f0 = i5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
