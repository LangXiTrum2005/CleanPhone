package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04855v extends YN implements InterfaceC0904Nb {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C0992Qs, QH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"", "CN7S8zFAdfJ9bVqwMW5SENbnF587rDMj", "ECtvHbgJLZyJlGB78wDP7r1UThztX0Vy", "vZtVD3U5uaTLh0U8YiXzC85k7FHIe0Qs", "kpJyRxDTLVyluzy4Ki", "I2f81on3HcFOk9u5oPzBv5nIGa89bXIT", "pIHA85qiURHoc0OmgkveP1MohnBa7K19", "P0ETTFDWchCwGrAdEF6EXZ7NnZlGXY62"};
    public static final C04855v A0J = new QL().A0u();

    @Deprecated
    public static final C04855v A0I = A0J;
    public static final String A0W = AbstractC1600gE.A0h(1000);
    public static final String A0Q = AbstractC1600gE.A0h(1001);
    public static final String A0R = AbstractC1600gE.A0h(1002);
    public static final String A0T = AbstractC1600gE.A0h(PointerIconCompat.TYPE_HELP);
    public static final String A0M = AbstractC1600gE.A0h(1004);
    public static final String A0N = AbstractC1600gE.A0h(1005);
    public static final String A0K = AbstractC1600gE.A0h(PointerIconCompat.TYPE_CELL);
    public static final String A0V = AbstractC1600gE.A0h(PointerIconCompat.TYPE_CROSSHAIR);
    public static final String A0b = AbstractC1600gE.A0h(PointerIconCompat.TYPE_TEXT);
    public static final String A0O = AbstractC1600gE.A0h(PointerIconCompat.TYPE_VERTICAL_TEXT);
    public static final String A0Z = AbstractC1600gE.A0h(1010);
    public static final String A0a = AbstractC1600gE.A0h(1011);
    public static final String A0Y = AbstractC1600gE.A0h(1012);
    public static final String A0X = AbstractC1600gE.A0h(PointerIconCompat.TYPE_ALL_SCROLL);
    public static final String A0P = AbstractC1600gE.A0h(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW);
    public static final String A0L = AbstractC1600gE.A0h(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW);
    public static final String A0S = AbstractC1600gE.A0h(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
    public static final String A0U = AbstractC1600gE.A0h(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
    public static final InterfaceC0903Na<C04855v> A0H = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.QM
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return new QL(bundle).A0u();
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C0992Qs, QH> map, Map<C0992Qs, QH> map2) {
        Map.Entry<C0992Qs, QH> next;
        C0992Qs key;
        if (map2.size() != map.size()) {
            return false;
        }
        Set<Map.Entry<C0992Qs, QH>> setEntrySet = map.entrySet();
        if (A0G[0].length() == 20) {
            throw new RuntimeException();
        }
        A0G[6] = "31qVyA37JmHIq7wJWl6tQ8rYGcKQjTnj";
        Iterator<Map.Entry<C0992Qs, QH>> it = setEntrySet.iterator();
        do {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0G;
            if (strArr[3].charAt(29) == strArr[2].charAt(29)) {
                String[] strArr2 = A0G;
                strArr2[5] = "yEjaVA6ulEwRrX3LDmFuvRh8vmcDT6Dr";
                strArr2[7] = "pBkPhNgZ1sM3uFKmd2X4jzJEolZPtmfi";
                if (!zHasNext) {
                    return true;
                }
            } else if (!zHasNext) {
                return true;
            }
            next = it.next();
            key = next.getKey();
            if (!map2.containsKey(key)) {
                break;
            }
        } while (AbstractC1600gE.A1E(next.getValue(), map2.get(key)));
        return false;
    }

    public C04855v(QL ql) {
        super(ql);
        this.A0C = ql.A0C;
        this.A06 = ql.A06;
        this.A07 = ql.A07;
        this.A05 = ql.A05;
        this.A09 = ql.A09;
        this.A02 = ql.A02;
        this.A03 = ql.A03;
        this.A00 = ql.A00;
        this.A01 = ql.A01;
        this.A08 = ql.A08;
        this.A0B = ql.A0B;
        this.A0D = ql.A0D;
        this.A04 = ql.A04;
        this.A0E = ql.A0E;
        this.A0F = ql.A0F;
        this.A0A = ql.A0A;
    }

    public static C04855v A02(Context context) {
        return new QL(context).A0u();
    }

    public static /* synthetic */ String A09() {
        String str = A0U;
        String[] strArr = A0G;
        if (strArr[5].charAt(26) == strArr[7].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[3] = "mtf43clS1eUU5UHx5TRFOAR5zRqTy0Kh";
        strArr2[2] = "CrDKZHTScJRyP82QiFXNC9HezVyEH0fT";
        return str;
    }

    public static /* synthetic */ String A0D() {
        String str = A0W;
        if (A0G[0].length() == 20) {
            throw new RuntimeException();
        }
        A0G[0] = "6LY";
        return str;
    }

    public static boolean A0M(SparseArray<Map<C0992Qs, QH>> sparseArray, SparseArray<Map<C0992Qs, QH>> sparseArray2) {
        int size = sparseArray.size();
        int firstSize = sparseArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInSecond = 0; indexInSecond < size; indexInSecond++) {
            int iKeyAt = sparseArray.keyAt(indexInSecond);
            String[] strArr = A0G;
            String str = strArr[5];
            String str2 = strArr[7];
            int indexInFirst = str.charAt(26);
            int firstSize2 = str2.charAt(26);
            if (indexInFirst == firstSize2) {
                throw new RuntimeException();
            }
            A0G[6] = "wixiVooXq8HdB8U083lu4f3TdrAsOKAk";
            int firstSize3 = sparseArray2.indexOfKey(iKeyAt);
            if (firstSize3 < 0 || !A0O(sparseArray.valueAt(indexInSecond), sparseArray2.valueAt(firstSize3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final QL A0P() {
        return new QL(this);
    }

    @Deprecated
    public final QH A0Q(int i, C0992Qs c0992Qs) {
        Map<C0992Qs, QH> map = this.A0E.get(i);
        if (map != null) {
            return map.get(c0992Qs);
        }
        return null;
    }

    public final boolean A0R(int i) {
        return this.A0F.get(i);
    }

    @Deprecated
    public final boolean A0S(int i, C0992Qs c0992Qs) {
        Map<C0992Qs, QH> map = this.A0E.get(i);
        return map != null && map.containsKey(c0992Qs);
    }

    @Override // com.facebook.ads.redexgen.core.YN
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            if (A0G[0].length() == 20) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "V1cytgY1ecLGUxbfCQ4Qe5VFfNWaEeXc";
            strArr[7] = "gmZ51llyJGBZ5cGYVq8w3xbcdRfXtWAW";
            if (cls == obj.getClass()) {
                C04855v c04855v = (C04855v) obj;
                if (super.equals(c04855v) && this.A0C == c04855v.A0C && this.A06 == c04855v.A06 && this.A07 == c04855v.A07 && this.A05 == c04855v.A05 && this.A09 == c04855v.A09 && this.A02 == c04855v.A02 && this.A03 == c04855v.A03 && this.A00 == c04855v.A00 && this.A01 == c04855v.A01 && this.A08 == c04855v.A08 && this.A0B == c04855v.A0B && this.A0D == c04855v.A0D && this.A04 == c04855v.A04 && A0N(this.A0F, c04855v.A0F) && A0M(this.A0E, c04855v.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.YN
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
