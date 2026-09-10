package com.facebook.ads.redexgen.core;

import com.smartdigimkt.a6.d;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2921rf extends AbstractList<Integer> implements RandomAccess, Serializable {
    public static byte[] A03;
    public static String[] A04 = {"YU1VDkaJfx0npt5ZCy0wfRWqTvB0gzrf", "HnEPzK", "p4nBQ52ikpMWjKifemE03jhF", "yEe4449S5FSBazETcjdBTZewZPLdBAWq", "Xlyhv", "2ScPcgGnYkk5iwJP9xeXeJNhXWw9hNmB", "BfGEj8ajDZOUDr9MhSeGOx8aXIdVpKot", "7ounehwY5pAPt7bmg9fcb1FAHFBm19vl"};
    public static final long serialVersionUID = 0;
    public final int A00;
    public final int A01;
    public final int[] A02;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) + d.o);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-87, -99};
    }

    static {
        A04();
    }

    public C2921rf(int[] array) {
        this(array, 0, array.length);
    }

    public C2921rf(int[] array, int start, int end) {
        this.A02 = array;
        this.A01 = start;
        this.A00 = end;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Integer get(int index) {
        AbstractC2530ki.A00(index, size());
        return Integer.valueOf(this.A02[this.A01 + index]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final Integer set(int index, Integer element) {
        AbstractC2530ki.A00(index, size());
        int i2 = this.A02[this.A01 + index];
        int[] iArr = this.A02;
        int i3 = this.A01 + index;
        int oldValue = ((Integer) AbstractC2530ki.A04(element)).intValue();
        iArr[i3] = oldValue;
        return Integer.valueOf(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final Spliterator.OfInt spliterator() {
        return Spliterators.spliterator(this.A02, this.A01, this.A00, 0);
    }

    public final int[] A05() {
        return Arrays.copyOfRange(this.A02, this.A01, this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object target) {
        return (target instanceof Integer) && AbstractC1244As.A04(this.A02, ((Integer) target).intValue(), this.A01, this.A00) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        boolean z2 = object instanceof C2921rf;
        if (A04[2].length() != 24) {
            throw new RuntimeException();
        }
        A04[2] = "hkNtVJfoNZugUfjtOIkeX8Ri";
        if (z2) {
            C2921rf c2921rf = (C2921rf) object;
            int size = size();
            if (c2921rf.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int size2 = this.A02[this.A01 + i2];
                if (size2 != c2921rf.A02[c2921rf.A01 + i2]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(object);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = this.A01; i3 < result; i3++) {
            int result = this.A02[i3];
            i2 = (i2 * 31) + AbstractC1244As.A00(result);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(@CheckForNull Object target) {
        if (target instanceof Integer) {
            int[] iArr = this.A02;
            String[] strArr = A04;
            if (strArr[6].charAt(15) == strArr[5].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "lB9Ee3UdEb1Lo8jQSlnhxnRY63rogU68";
            strArr2[5] = "23HXI0mrZUyV0MEjy70kUSUiY9qLKHl0";
            int i2 = AbstractC1244As.A04(iArr, ((Integer) target).intValue(), this.A01, this.A00);
            if (i2 >= 0) {
                return i2 - this.A01;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(@CheckForNull Object target) {
        int iA05;
        if ((target instanceof Integer) && (iA05 = AbstractC1244As.A05(this.A02, ((Integer) target).intValue(), this.A01, this.A00)) >= 0) {
            int i2 = this.A01;
            return iA05 - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00 - this.A01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<Integer> subList(int fromIndex, int toIndex) {
        int size = size();
        AbstractC2530ki.A0B(fromIndex, toIndex, size);
        if (fromIndex == toIndex) {
            return Collections.emptyList();
        }
        return new C2921rf(this.A02, this.A01 + fromIndex, this.A01 + toIndex);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST).append(this.A02[this.A01]);
        for (int i2 = this.A01 + 1; i2 < this.A00; i2++) {
            sb.append(A02(0, 2, 23)).append(this.A02[i2]);
        }
        StringBuilder builder = sb.append(AbstractJsonLexerKt.END_LIST);
        return builder.toString();
    }
}
