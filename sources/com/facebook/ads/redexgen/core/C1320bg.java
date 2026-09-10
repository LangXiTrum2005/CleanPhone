package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.google.android.exoplayer2.source.SpannedData;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1320bg<V> {
    public static String[] A03 = {"rLSW2buOZNXNtwKZ8LLqG4k", "", "HY0C8zXao6DDvDSJqr9fyECJ1DYaHW1G", "", "FjTQGEoSfzmicptQ", "2vjRtV7KAdMNBRiXtca2zsNdxrjj9H3j", "kjlhOzcChYBWstEDMyVRgHZZ1PVWeDwQ", "Y7jooGhFWI1jixK8rYtezEfaFZw3Wo"};
    public int A00;
    public final SparseArray<V> A01;
    public final InterfaceC1528f3<V> A02;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public C1320bg() {
        this(new InterfaceC1528f3() { // from class: com.facebook.ads.redexgen.X.Qu
            @Override // com.facebook.ads.redexgen.core.InterfaceC1528f3
            public final void A2z(Object obj) {
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.f3 != com.google.android.exoplayer2.util.Consumer<V> */
    public C1320bg(InterfaceC1528f3<V> interfaceC1528f3) {
        this.A01 = new SparseArray<>();
        this.A02 = interfaceC1528f3;
        this.A00 = -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public final V A00() {
        return this.A01.valueAt(this.A01.size() - 1);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public final V A01(int i) {
        if (this.A00 == -1) {
            this.A00 = 0;
        }
        while (this.A00 > 0 && i < this.A01.keyAt(this.A00)) {
            this.A00--;
        }
        while (this.A00 < this.A01.size() - 1 && i >= this.A01.keyAt(this.A00 + 1)) {
            this.A00++;
        }
        return this.A01.valueAt(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public final void A02() {
        for (int i = 0; i < i; i++) {
            SpannedData<V> spannedData = this.A02;
            SparseArray<V> sparseArray = this.A01;
            String[] strArr = A03;
            String str = strArr[1];
            String str2 = strArr[3];
            int length = str.length();
            int i2 = str2.length();
            if (length != i2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "";
            strArr2[3] = "";
            spannedData.A2z(sparseArray.valueAt(i));
        }
        this.A00 = -1;
        this.A01.clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public final void A03(int i) {
        for (int size = this.A01.size() - 1; size >= 0 && i < this.A01.keyAt(size); size--) {
            this.A02.A2z(this.A01.valueAt(size));
            this.A01.removeAt(size);
        }
        this.A00 = this.A01.size() > 0 ? Math.min(this.A00, this.A01.size() - 1) : -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public final void A04(int i) {
        for (int i2 = 0; i2 < this.A01.size() - 1 && i >= this.A01.keyAt(i2 + 1); i2++) {
            this.A02.A2z(this.A01.valueAt(i2));
            this.A01.removeAt(i2);
            if (this.A00 > 0) {
                this.A00--;
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public final void A05(int i, V v) {
        if (this.A00 == -1) {
            AbstractC1517es.A08(this.A01.size() == 0);
            this.A00 = 0;
        }
        SparseArray<V> sparseArray = this.A01;
        if (A03[5].charAt(8) != 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "";
        strArr[3] = "";
        if (sparseArray.size() > 0) {
            int iKeyAt = this.A01.keyAt(this.A01.size() - 1);
            AbstractC1517es.A07(i >= iKeyAt);
            if (iKeyAt == i) {
                this.A02.A2z(this.A01.valueAt(this.A01.size() - 1));
            }
        }
        this.A01.append(i, v);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.google.android.exoplayer2.source.SpannedData<V> */
    public final boolean A06() {
        return this.A01.size() == 0;
    }
}
