package com.smartdigimkt.p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public class y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator<c> f37629h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Comparator<c> f37630i = new b();
    private static final int j = -1;
    private static final int k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f37631l = 1;
    private static final int m = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37632a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37635e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c[] f37634c = new c[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<c> f37633b = new ArrayList<>();
    private int d = -1;

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return cVar.f37636a - cVar2.f37636a;
        }
    }

    public class b implements Comparator<c> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            float f = cVar.f37638c;
            float f2 = cVar2.f37638c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f37638c;

        private c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public y(int i2) {
        this.f37632a = i2;
    }

    private void b() {
        if (this.d != 0) {
            Collections.sort(this.f37633b, f37630i);
            this.d = 0;
        }
    }

    public void a(int i2, float f) {
        c cVar;
        a();
        int i3 = this.g;
        if (i3 > 0) {
            c[] cVarArr = this.f37634c;
            int i4 = i3 - 1;
            this.g = i4;
            cVar = cVarArr[i4];
        } else {
            cVar = new c(null);
        }
        int i5 = this.f37635e;
        this.f37635e = i5 + 1;
        cVar.f37636a = i5;
        cVar.f37637b = i2;
        cVar.f37638c = f;
        this.f37633b.add(cVar);
        this.f += i2;
        while (true) {
            int i6 = this.f;
            int i7 = this.f37632a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            c cVar2 = this.f37633b.get(0);
            int i9 = cVar2.f37637b;
            if (i9 <= i8) {
                this.f -= i9;
                this.f37633b.remove(0);
                int i10 = this.g;
                if (i10 < 5) {
                    c[] cVarArr2 = this.f37634c;
                    this.g = i10 + 1;
                    cVarArr2[i10] = cVar2;
                }
            } else {
                cVar2.f37637b = i9 - i8;
                this.f -= i8;
            }
        }
    }

    public float a(float f) {
        b();
        float f2 = f * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f37633b.size(); i3++) {
            c cVar = this.f37633b.get(i3);
            i2 += cVar.f37637b;
            if (i2 >= f2) {
                return cVar.f37638c;
            }
        }
        if (this.f37633b.isEmpty()) {
            return Float.NaN;
        }
        return ((c) android.support.v4.media.a.d(1, this.f37633b)).f37638c;
    }

    private void a() {
        if (this.d != 1) {
            Collections.sort(this.f37633b, f37629h);
            this.d = 1;
        }
    }
}
