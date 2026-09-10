package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BoundedByteString.java */
/* JADX INFO: loaded from: classes5.dex */
public class dern extends impassible {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final int f31116molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final int f31117polloi;

    /* JADX INFO: compiled from: BoundedByteString.java */
    public class saneness implements wireman.attabal {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final int f31118arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f31119kowloon;

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31119kowloon < this.f31118arytenoidectomy;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.wireman.attabal
        public byte nextByte() {
            int i = this.f31119kowloon;
            if (i >= this.f31118arytenoidectomy) {
                throw new NoSuchElementException();
            }
            byte[] bArr = dern.this.f31127arytenoidectomy;
            this.f31119kowloon = i + 1;
            return bArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public saneness() {
            int iCuirassed = dern.this.cuirassed();
            this.f31119kowloon = iCuirassed;
            this.f31118arytenoidectomy = iCuirassed + dern.this.size();
        }
    }

    public dern(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (((long) i) + ((long) i2) <= bArr.length) {
            this.f31117polloi = i;
            this.f31116molybdenite = i2;
            return;
        }
        StringBuilder sb3 = new StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i);
        sb3.append("+");
        sb3.append(i2);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.impassible
    public int cuirassed() {
        return this.f31117polloi;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.impassible
    public byte preprohormone(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        if (i < size()) {
            return this.f31127arytenoidectomy[this.f31117polloi + i];
        }
        int size = size();
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Index too large: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.impassible, p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public int size() {
        return this.f31116molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.impassible, p002kotlin.reflect.jvm.internal.impl.protobuf.wireman
    public void taiyuan(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f31127arytenoidectomy, cuirassed() + i, bArr, i2, i3);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.impassible, p002kotlin.reflect.jvm.internal.impl.protobuf.wireman, java.lang.Iterable
    /* JADX INFO: renamed from: triweekly */
    public wireman.attabal iterator() {
        return new saneness();
    }
}
