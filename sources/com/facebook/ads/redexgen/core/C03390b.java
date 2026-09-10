package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0096\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "T", "", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", "", "([Ljava/lang/Enum;)V", "[Ljava/lang/Enum;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Enum;)Z", "get", "index", "(I)Ljava/lang/Enum;", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "writeReplace", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class C03390b<T extends Enum<T>> extends C2D<T> implements NU<T>, Serializable {
    public static byte[] A01;
    public static String[] A02 = {"AVZQJd0UEEpCfQYexpiIPdV6nKB0YzQ", "QqlKW", "LWUEIKmYT4jP0BQzvTVCB9TDfmAcQ", "J57H", "dmSyAydKU", "OjmNHHLSPz5X5IKUnklYZThClhBJ6", "SQG9TvtavaoImfrEhtlqecs", "bZpI3MN8M6FoE67UndtxHFSVy2"};
    public final T[] A00;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A02[1] = "sc7yo";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 22);
            i4++;
        }
    }

    public static void A04() {
        A01 = new byte[]{28, 21, 28, 20, 28, 23, cw.k, 2, 9, 19, 21, cw.l, 2, 20};
    }

    static {
        A04();
    }

    public C03390b(T[] tArr) {
        C2052nk.A09(tArr, A03(7, 7, 113));
        this.A00 = tArr;
    }

    private final int A00(T t) {
        C2052nk.A09(t, A03(0, 7, 111));
        int iOrdinal = t.ordinal();
        if (((Enum) AbstractC03410d.A00(this.A00, iOrdinal)) == t) {
            return iOrdinal;
        }
        return -1;
    }

    private final int A01(T t) {
        C2052nk.A09(t, A03(0, 7, 111));
        return indexOf(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.C2D, java.util.List
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final T get(int i) {
        C2D.A02.A03(i, this.A00.length);
        return this.A00[i];
    }

    private final boolean A05(T t) {
        C2052nk.A09(t, A03(0, 7, 111));
        Enum target = (Enum) AbstractC03410d.A00(this.A00, t.ordinal());
        return target == t;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Ne
    /* JADX INFO: renamed from: A0A */
    public final int getA00() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0907Ne, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return A05((Enum) obj);
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C2D, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return A00((Enum) obj);
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.C2D, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return A01((Enum) obj);
        }
        return -1;
    }
}
