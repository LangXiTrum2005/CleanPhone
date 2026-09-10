package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public class Me0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3413a = 4;
    public int b;
    public final Object c;

    public Me0(Object[] objArr) {
        AbstractC2995aW.q(objArr, "array");
        this.c = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f3413a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((byte[]) obj).length;
            case 1:
                return this.b < ((int[]) obj).length;
            case 2:
                return this.b < ((long[]) obj).length;
            case 3:
                return this.b < ((short[]) obj).length;
            case 4:
                return this.b < ((AbstractC4887w) obj).a();
            default:
                return this.b < ((Object[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3413a;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i2 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i2 + 1;
                return new Le0(bArr[i2]);
            case 1:
                int i3 = this.b;
                int[] iArr = (int[]) obj;
                if (i3 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i3 + 1;
                return new Re0(iArr[i3]);
            case 2:
                int i4 = this.b;
                long[] jArr = (long[]) obj;
                if (i4 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i4 + 1;
                return new We0(jArr[i4]);
            case 3:
                int i5 = this.b;
                short[] sArr = (short[]) obj;
                if (i5 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.b));
                }
                this.b = i5 + 1;
                return new C3099bf0(sArr[i5]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i6 = this.b;
                this.b = i6 + 1;
                return ((AbstractC4887w) obj).get(i6);
            default:
                try {
                    int i7 = this.b;
                    this.b = i7 + 1;
                    return ((Object[]) obj)[i7];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3413a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Me0(byte[] bArr) {
        AbstractC2995aW.q(bArr, "array");
        this.c = bArr;
    }

    public Me0(int[] iArr) {
        AbstractC2995aW.q(iArr, "array");
        this.c = iArr;
    }

    public Me0(long[] jArr) {
        AbstractC2995aW.q(jArr, "array");
        this.c = jArr;
    }

    public Me0(short[] sArr) {
        AbstractC2995aW.q(sArr, "array");
        this.c = sArr;
    }

    public Me0(AbstractC4887w abstractC4887w) {
        this.c = abstractC4887w;
    }
}
