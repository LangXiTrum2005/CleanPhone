package com.smartdigimkt.m4;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.smartdigimkt.j4.e0;
import com.smartdigimkt.j4.f0;
import com.smartdigimkt.w3.a0;
import com.smartdigimkt.w3.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class c extends com.smartdigimkt.m4.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f36646e = 0.98f;
    private static final int[] f = new int[0];
    private static final int g = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.smartdigimkt.m4.f.a f36647c;
    private final AtomicReference<d> d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36650c;

        public b(int i2, int i3, String str) {
            this.f36648a = i2;
            this.f36649b = i3;
            this.f36650c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f36648a == bVar.f36648a && this.f36649b == bVar.f36649b && TextUtils.equals(this.f36650c, bVar.f36650c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i2 = ((this.f36648a * 31) + this.f36649b) * 31;
            String str = this.f36650c;
            return i2 + (str != null ? str.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.m4.c$c, reason: collision with other inner class name */
    public static final class C0541c implements Comparable<C0541c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f36651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36652b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36653c;
        private final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f36654e;
        private final int f;
        private final int g;

        public C0541c(m mVar, d dVar, int i2) {
            this.f36651a = dVar;
            this.f36652b = c.a(i2, false) ? 1 : 0;
            this.f36653c = c.a(mVar, dVar.f36657c) ? 1 : 0;
            this.d = (mVar.x & 1) != 0 ? 1 : 0;
            this.f36654e = mVar.s;
            this.f = mVar.t;
            this.g = mVar.f39332b;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(C0541c c0541c) {
            int i2 = this.f36652b;
            int i3 = c0541c.f36652b;
            if (i2 != i3) {
                return c.c(i2, i3);
            }
            int i4 = this.f36653c;
            int i5 = c0541c.f36653c;
            if (i4 != i5) {
                return c.c(i4, i5);
            }
            int i6 = this.d;
            int i7 = c0541c.d;
            if (i6 != i7) {
                return c.c(i6, i7);
            }
            if (this.f36651a.f36662n) {
                return c.c(c0541c.g, this.g);
            }
            int i8 = i2 != 1 ? -1 : 1;
            int i9 = this.f36654e;
            int i10 = c0541c.f36654e;
            if (i9 != i10) {
                return c.c(i9, i10) * i8;
            }
            int i11 = this.f;
            int i12 = c0541c.f;
            return i11 != i12 ? c.c(i11, i12) * i8 : c.c(this.g, c0541c.g) * i8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0541c.class == obj.getClass()) {
                C0541c c0541c = (C0541c) obj;
                if (this.f36652b == c0541c.f36652b && this.f36653c == c0541c.f36653c && this.d == c0541c.d && this.f36654e == c0541c.f36654e && this.f == c0541c.f && this.g == c0541c.g) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((((((this.f36652b * 31) + this.f36653c) * 31) + this.d) * 31) + this.f36654e) * 31) + this.f) * 31) + this.g;
        }
    }

    public static final class d implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<Map<f0, f>> f36655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseBooleanArray f36656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36657c;
        public final String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f36658e;
        public final int f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f36659h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f36660i;
        public final boolean j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f36661l;
        public final boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f36662n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f36663p;
        public final boolean q;
        public final int r;
        public static final d s = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        private d() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f36658e == dVar.f36658e && this.f == dVar.f && this.f36662n == dVar.f36662n && this.o == dVar.o && this.f36663p == dVar.f36663p && this.g == dVar.g && this.f36659h == dVar.f36659h && this.j == dVar.j && this.q == dVar.q && this.m == dVar.m && this.k == dVar.k && this.f36661l == dVar.f36661l && this.f36660i == dVar.f36660i && this.r == dVar.r && TextUtils.equals(this.f36657c, dVar.f36657c) && TextUtils.equals(this.d, dVar.d) && a(this.f36656b, dVar.f36656b) && a(this.f36655a, dVar.f36655a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i2 = (((((((((((((((((((((((((((this.f36658e ? 1 : 0) * 31) + this.f) * 31) + (this.f36662n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.f36663p ? 1 : 0)) * 31) + this.g) * 31) + this.f36659h) * 31) + (this.j ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + this.k) * 31) + this.f36661l) * 31) + this.f36660i) * 31) + this.r) * 31;
            String str = this.f36657c;
            int iHashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            a(parcel, this.f36655a);
            parcel.writeSparseBooleanArray(this.f36656b);
            parcel.writeString(this.f36657c);
            parcel.writeString(this.d);
            com.smartdigimkt.p4.f0.a(parcel, this.f36658e);
            parcel.writeInt(this.f);
            com.smartdigimkt.p4.f0.a(parcel, this.f36662n);
            com.smartdigimkt.p4.f0.a(parcel, this.o);
            com.smartdigimkt.p4.f0.a(parcel, this.f36663p);
            parcel.writeInt(this.g);
            parcel.writeInt(this.f36659h);
            parcel.writeInt(this.f36660i);
            com.smartdigimkt.p4.f0.a(parcel, this.j);
            com.smartdigimkt.p4.f0.a(parcel, this.q);
            parcel.writeInt(this.k);
            parcel.writeInt(this.f36661l);
            com.smartdigimkt.p4.f0.a(parcel, this.m);
            parcel.writeInt(this.r);
        }

        public d(SparseArray<Map<f0, f>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z2, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, int i5, boolean z6, boolean z7, int i6, int i7, boolean z8, int i8) {
            this.f36655a = sparseArray;
            this.f36656b = sparseBooleanArray;
            this.f36657c = com.smartdigimkt.p4.f0.h(str);
            this.d = com.smartdigimkt.p4.f0.h(str2);
            this.f36658e = z2;
            this.f = i2;
            this.f36662n = z3;
            this.o = z4;
            this.f36663p = z5;
            this.g = i3;
            this.f36659h = i4;
            this.f36660i = i5;
            this.j = z6;
            this.q = z7;
            this.k = i6;
            this.f36661l = i7;
            this.m = z8;
            this.r = i8;
        }

        public final boolean a(int i2) {
            return this.f36656b.get(i2);
        }

        public final boolean b(int i2, f0 f0Var) {
            Map<f0, f> map = this.f36655a.get(i2);
            return map != null && map.containsKey(f0Var);
        }

        public final f a(int i2, f0 f0Var) {
            Map<f0, f> map = this.f36655a.get(i2);
            if (map != null) {
                return map.get(f0Var);
            }
            return null;
        }

        public e a() {
            return new e(this);
        }

        private static SparseArray<Map<f0, f>> a(Parcel parcel) {
            int i2 = parcel.readInt();
            SparseArray<Map<f0, f>> sparseArray = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                HashMap map = new HashMap(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    map.put((f0) parcel.readParcelable(f0.class.getClassLoader()), (f) parcel.readParcelable(f.class.getClassLoader()));
                }
                sparseArray.put(i4, map);
            }
            return sparseArray;
        }

        private static void a(Parcel parcel, SparseArray<Map<f0, f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                Map<f0, f> mapValueAt = sparseArray.valueAt(i2);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<f0, f> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        public d(Parcel parcel) {
            this.f36655a = a(parcel);
            this.f36656b = parcel.readSparseBooleanArray();
            this.f36657c = parcel.readString();
            this.d = parcel.readString();
            this.f36658e = com.smartdigimkt.p4.f0.a(parcel);
            this.f = parcel.readInt();
            this.f36662n = com.smartdigimkt.p4.f0.a(parcel);
            this.o = com.smartdigimkt.p4.f0.a(parcel);
            this.f36663p = com.smartdigimkt.p4.f0.a(parcel);
            this.g = parcel.readInt();
            this.f36659h = parcel.readInt();
            this.f36660i = parcel.readInt();
            this.j = com.smartdigimkt.p4.f0.a(parcel);
            this.q = com.smartdigimkt.p4.f0.a(parcel);
            this.k = parcel.readInt();
            this.f36661l = parcel.readInt();
            this.m = com.smartdigimkt.p4.f0.a(parcel);
            this.r = parcel.readInt();
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(SparseArray<Map<f0, f>> sparseArray, SparseArray<Map<f0, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (iIndexOfKey < 0 || !a(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(Map<f0, f> map, Map<f0, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<f0, f> entry : map.entrySet()) {
                f0 key = entry.getKey();
                if (!map2.containsKey(key) || !com.smartdigimkt.p4.f0.a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray<Map<f0, f>> f36664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseBooleanArray f36665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f36666c;
        private String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f36667e;
        private int f;
        private boolean g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f36668h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f36669i;
        private int j;
        private int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f36670l;
        private boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f36671n;
        private int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f36672p;
        private boolean q;
        private int r;

        public e a(String str) {
            this.f36666c = str;
            return this;
        }

        public e b(String str) {
            this.d = str;
            return this;
        }

        public e c() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public e d(boolean z2) {
            this.m = z2;
            return this;
        }

        public e e(boolean z2) {
            this.g = z2;
            return this;
        }

        public e f(boolean z2) {
            this.f36667e = z2;
            return this;
        }

        public e() {
            this(d.s);
        }

        public e a(boolean z2) {
            this.f36668h = z2;
            return this;
        }

        public e b(int i2) {
            this.f = i2;
            return this;
        }

        public e c(int i2) {
            this.f36670l = i2;
            return this;
        }

        public e d() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public e e() {
            return a(1279, 719);
        }

        private e(d dVar) {
            this.f36664a = a((SparseArray<Map<f0, f>>) dVar.f36655a);
            this.f36665b = dVar.f36656b.clone();
            this.f36666c = dVar.f36657c;
            this.d = dVar.d;
            this.f36667e = dVar.f36658e;
            this.f = dVar.f;
            this.g = dVar.f36662n;
            this.f36668h = dVar.o;
            this.f36669i = dVar.f36663p;
            this.j = dVar.g;
            this.k = dVar.f36659h;
            this.f36670l = dVar.f36660i;
            this.m = dVar.j;
            this.f36671n = dVar.q;
            this.o = dVar.k;
            this.f36672p = dVar.f36661l;
            this.q = dVar.m;
            this.r = dVar.r;
        }

        public e a(int i2, int i3) {
            this.j = i2;
            this.k = i3;
            return this;
        }

        public e b(boolean z2) {
            this.f36669i = z2;
            return this;
        }

        public e c(boolean z2) {
            this.f36671n = z2;
            return this;
        }

        public e d(int i2) {
            if (this.r != i2) {
                this.r = i2;
            }
            return this;
        }

        public final e b() {
            if (this.f36664a.size() == 0) {
                return this;
            }
            this.f36664a.clear();
            return this;
        }

        public e a(Context context, boolean z2) {
            Point pointA = com.smartdigimkt.p4.f0.a(context);
            return a(pointA.x, pointA.y, z2);
        }

        public e a(int i2, int i3, boolean z2) {
            this.o = i2;
            this.f36672p = i3;
            this.q = z2;
            return this;
        }

        public final e a(int i2, boolean z2) {
            if (this.f36665b.get(i2) == z2) {
                return this;
            }
            if (z2) {
                this.f36665b.put(i2, true);
                return this;
            }
            this.f36665b.delete(i2);
            return this;
        }

        public final e a(int i2, f0 f0Var, f fVar) {
            Map<f0, f> map = this.f36664a.get(i2);
            if (map == null) {
                map = new HashMap<>();
                this.f36664a.put(i2, map);
            }
            if (map.containsKey(f0Var) && com.smartdigimkt.p4.f0.a(map.get(f0Var), fVar)) {
                return this;
            }
            map.put(f0Var, fVar);
            return this;
        }

        public final e a(int i2, f0 f0Var) {
            Map<f0, f> map = this.f36664a.get(i2);
            if (map != null && map.containsKey(f0Var)) {
                map.remove(f0Var);
                if (map.isEmpty()) {
                    this.f36664a.remove(i2);
                }
            }
            return this;
        }

        public final e a(int i2) {
            Map<f0, f> map = this.f36664a.get(i2);
            if (map != null && !map.isEmpty()) {
                this.f36664a.remove(i2);
            }
            return this;
        }

        public d a() {
            return new d(this.f36664a, this.f36665b, this.f36666c, this.d, this.f36667e, this.f, this.g, this.f36668h, this.f36669i, this.j, this.k, this.f36670l, this.m, this.f36671n, this.o, this.f36672p, this.q, this.r);
        }

        private static SparseArray<Map<f0, f>> a(SparseArray<Map<f0, f>> sparseArray) {
            SparseArray<Map<f0, f>> sparseArray2 = new SparseArray<>();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray2.put(sparseArray.keyAt(i2), new HashMap(sparseArray.valueAt(i2)));
            }
            return sparseArray2;
        }
    }

    public c() {
        this((com.smartdigimkt.m4.f.a) null);
    }

    public static boolean a(int i2, boolean z2) {
        int i3 = i2 & 7;
        if (i3 != 4) {
            return z2 && i3 == 3;
        }
        return true;
    }

    private static int b(int i2, int i3) {
        if (i2 == -1) {
            return i3 == -1 ? 0 : -1;
        }
        if (i3 == -1) {
            return 1;
        }
        return i2 - i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i2, int i3) {
        if (i2 > i3) {
            return 1;
        }
        return i3 > i2 ? -1 : 0;
    }

    @Deprecated
    public final void d() {
        a(c().b());
    }

    public d e() {
        return this.d.get();
    }

    public c(com.smartdigimkt.n4.d dVar) {
        this(new com.smartdigimkt.m4.a.C0539a(dVar));
    }

    @Deprecated
    public final void b(int i2, boolean z2) {
        a(c().a(i2, z2));
    }

    public e c() {
        return e().a();
    }

    public c(com.smartdigimkt.m4.f.a aVar) {
        this.f36647c = aVar;
        this.d = new AtomicReference<>(d.s);
    }

    public void a(d dVar) {
        com.smartdigimkt.p4.a.a(dVar);
        if (this.d.getAndSet(dVar).equals(dVar)) {
            return;
        }
        a();
    }

    @Deprecated
    public final boolean b(int i2) {
        return e().a(i2);
    }

    @Deprecated
    public final boolean c(int i2, f0 f0Var) {
        return e().b(i2, f0Var);
    }

    @Deprecated
    public final f b(int i2, f0 f0Var) {
        return e().a(i2, f0Var);
    }

    @Deprecated
    public void c(int i2) {
        a(c().d(i2));
    }

    public static final class f implements Parcelable {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f36674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36675c;

        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i2) {
                return new f[i2];
            }
        }

        public f(int i2, int... iArr) {
            this.f36673a = i2;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f36674b = iArrCopyOf;
            this.f36675c = iArr.length;
            Arrays.sort(iArrCopyOf);
        }

        public boolean a(int i2) {
            for (int i3 : this.f36674b) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f36673a == fVar.f36673a && Arrays.equals(this.f36674b, fVar.f36674b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f36674b) + (this.f36673a * 31);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f36673a);
            parcel.writeInt(this.f36674b.length);
            parcel.writeIntArray(this.f36674b);
        }

        public f(Parcel parcel) {
            this.f36673a = parcel.readInt();
            int i2 = parcel.readByte();
            this.f36675c = i2;
            int[] iArr = new int[i2];
            this.f36674b = iArr;
            parcel.readIntArray(iArr);
        }
    }

    private static int b(e0 e0Var, int[] iArr, int i2, String str, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int iIntValue = list.get(i7).intValue();
            if (a(e0Var.a(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    public com.smartdigimkt.m4.f c(f0 f0Var, int[][] iArr, int i2, d dVar, com.smartdigimkt.m4.f.a aVar) throws com.smartdigimkt.w3.g {
        com.smartdigimkt.m4.f fVarA = (dVar.f36662n || aVar == null) ? null : a(f0Var, iArr, i2, dVar, aVar);
        return fVarA == null ? a(f0Var, iArr, dVar) : fVarA;
    }

    public void a(e eVar) {
        a(eVar.a());
    }

    @Deprecated
    public final void a(int i2, f0 f0Var, f fVar) {
        a(c().a(i2, f0Var, fVar));
    }

    @Deprecated
    public final void a(int i2, f0 f0Var) {
        a(c().a(i2, f0Var));
    }

    public com.smartdigimkt.m4.f b(f0 f0Var, int[][] iArr, int i2, d dVar, com.smartdigimkt.m4.f.a aVar) throws com.smartdigimkt.w3.g {
        int i3 = -1;
        int i4 = -1;
        C0541c c0541c = null;
        for (int i5 = 0; i5 < f0Var.f35974a; i5++) {
            e0 e0VarA = f0Var.a(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < e0VarA.f35964a; i6++) {
                if (a(iArr2[i6], dVar.q)) {
                    C0541c c0541c2 = new C0541c(e0VarA.a(i6), dVar, iArr2[i6]);
                    if (c0541c == null || c0541c2.compareTo(c0541c) > 0) {
                        i3 = i5;
                        i4 = i6;
                        c0541c = c0541c2;
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        e0 e0VarA2 = f0Var.a(i3);
        if (!dVar.f36662n && aVar != null) {
            int[] iArrA = a(e0VarA2, iArr[i3], dVar.o);
            if (iArrA.length > 0) {
                return aVar.a(e0VarA2, iArrA);
            }
        }
        return new com.smartdigimkt.m4.d(e0VarA2, i4);
    }

    @Deprecated
    public final void a(int i2) {
        a(c().a(i2));
    }

    @Override // com.smartdigimkt.m4.e
    public final Pair<a0[], com.smartdigimkt.m4.f[]> a(com.smartdigimkt.m4.e.a aVar, int[][][] iArr, int[] iArr2) throws com.smartdigimkt.w3.g {
        d dVar = this.d.get();
        int iA = aVar.a();
        com.smartdigimkt.m4.f[] fVarArrA = a(aVar, iArr, iArr2, dVar);
        for (int i2 = 0; i2 < iA; i2++) {
            if (dVar.a(i2)) {
                fVarArrA[i2] = null;
            } else {
                f0 f0VarC = aVar.c(i2);
                if (dVar.b(i2, f0VarC)) {
                    f fVarA = dVar.a(i2, f0VarC);
                    if (fVarA == null) {
                        fVarArrA[i2] = null;
                    } else if (fVarA.f36675c == 1) {
                        fVarArrA[i2] = new com.smartdigimkt.m4.d(f0VarC.a(fVarA.f36673a), fVarA.f36674b[0]);
                    } else {
                        fVarArrA[i2] = ((com.smartdigimkt.m4.f.a) com.smartdigimkt.p4.a.a(this.f36647c)).a(f0VarC.a(fVarA.f36673a), fVarA.f36674b);
                    }
                }
            }
        }
        a0[] a0VarArr = new a0[iA];
        for (int i3 = 0; i3 < iA; i3++) {
            a0VarArr[i3] = (dVar.a(i3) || (aVar.b(i3) != 5 && fVarArrA[i3] == null)) ? null : a0.f39200b;
        }
        a(aVar, iArr, a0VarArr, fVarArrA, dVar.r);
        return Pair.create(a0VarArr, fVarArrA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.smartdigimkt.m4.f b(f0 f0Var, int[][] iArr, d dVar) throws com.smartdigimkt.w3.g {
        int i2 = 0;
        int i3 = 0;
        e0 e0Var = null;
        for (int i4 = 0; i4 < f0Var.f35974a; i4++) {
            e0 e0VarA = f0Var.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < e0VarA.f35964a; i5++) {
                if (a(iArr2[i5], dVar.q)) {
                    m mVarA = e0VarA.a(i5);
                    int i6 = mVarA.x & (~dVar.f);
                    int i7 = 1;
                    byte b2 = (i6 & 1) != 0;
                    byte b3 = (i6 & 2) != 0;
                    boolean zA = a(mVarA, dVar.d);
                    if (zA || (dVar.f36658e && a(mVarA))) {
                        i7 = (b2 == true ? 8 : b3 == false ? 6 : 4) + (zA ? 1 : 0);
                    } else if (b2 == true) {
                        i7 = 3;
                    } else if (b3 != false) {
                        if (a(mVarA, dVar.f36657c)) {
                            i7 = 2;
                        }
                    }
                    if (a(iArr2[i5], false)) {
                        i7 += 1000;
                    }
                    if (i7 > i3) {
                        e0Var = e0VarA;
                        i2 = i5;
                        i3 = i7;
                    }
                }
            }
        }
        if (e0Var == null) {
            return null;
        }
        return new com.smartdigimkt.m4.d(e0Var, i2);
    }

    public com.smartdigimkt.m4.f[] a(com.smartdigimkt.m4.e.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws com.smartdigimkt.w3.g {
        int iA = aVar.a();
        com.smartdigimkt.m4.f[] fVarArr = new com.smartdigimkt.m4.f[iA];
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= iA) {
                break;
            }
            if (2 == aVar.b(i2)) {
                if (!z2) {
                    com.smartdigimkt.m4.f fVarC = c(aVar.c(i2), iArr[i2], iArr2[i2], dVar, this.f36647c);
                    fVarArr[i2] = fVarC;
                    z2 = fVarC != null;
                }
                z3 |= aVar.c(i2).f35974a > 0;
            }
            i2++;
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i3 = 0; i3 < iA; i3++) {
            int iB = aVar.b(i3);
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        fVarArr[i3] = a(iB, aVar.c(i3), iArr[i3], dVar);
                    } else if (!z5) {
                        com.smartdigimkt.m4.f fVarB = b(aVar.c(i3), iArr[i3], dVar);
                        fVarArr[i3] = fVarB;
                        z5 = fVarB != null;
                    }
                }
            } else if (!z4) {
                com.smartdigimkt.m4.f fVarB2 = b(aVar.c(i3), iArr[i3], iArr2[i3], dVar, z3 ? null : this.f36647c);
                fVarArr[i3] = fVarB2;
                z4 = fVarB2 != null;
            }
        }
        return fVarArr;
    }

    private static com.smartdigimkt.m4.f a(f0 f0Var, int[][] iArr, int i2, d dVar, com.smartdigimkt.m4.f.a aVar) throws com.smartdigimkt.w3.g {
        int i3 = dVar.f36663p ? 24 : 16;
        boolean z2 = dVar.o && (i2 & i3) != 0;
        for (int i4 = 0; i4 < f0Var.f35974a; i4++) {
            e0 e0VarA = f0Var.a(i4);
            int[] iArrA = a(e0VarA, iArr[i4], z2, i3, dVar.g, dVar.f36659h, dVar.f36660i, dVar.k, dVar.f36661l, dVar.m);
            if (iArrA.length > 0) {
                return ((com.smartdigimkt.m4.f.a) com.smartdigimkt.p4.a.a(aVar)).a(e0VarA, iArrA);
            }
        }
        return null;
    }

    private static int[] a(e0 e0Var, int[] iArr, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, boolean z3) {
        int i8;
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int[] iArr2;
        e0 e0Var2;
        if (e0Var.f35964a < 2) {
            return f;
        }
        List<Integer> listA = a(e0Var, i6, i7, z3);
        if (listA.size() < 2) {
            return f;
        }
        if (z2) {
            i8 = i4;
            i9 = i3;
            i10 = i5;
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            int i14 = 0;
            int i15 = 0;
            String str2 = null;
            while (i14 < listA.size()) {
                String str3 = e0Var.a(listA.get(i14).intValue()).f;
                if (hashSet.add(str3)) {
                    int i16 = i5;
                    i13 = i4;
                    i11 = i3;
                    iArr2 = iArr;
                    e0Var2 = e0Var;
                    int iB = b(e0Var2, iArr2, i2, str3, i11, i13, i16, listA);
                    i12 = i16;
                    if (iB > i15) {
                        i15 = iB;
                        str2 = str3;
                    }
                } else {
                    int i17 = i4;
                    i11 = i3;
                    i12 = i5;
                    i13 = i17;
                    iArr2 = iArr;
                    e0Var2 = e0Var;
                }
                i14++;
                int i18 = i13;
                i5 = i12;
                i3 = i11;
                i4 = i18;
                e0Var = e0Var2;
                iArr = iArr2;
            }
            i8 = i4;
            i9 = i3;
            i10 = i5;
            str = str2;
        }
        a(e0Var, iArr, i2, str, i9, i8, i10, listA);
        return listA.size() < 2 ? f : com.smartdigimkt.p4.f0.a(listA);
    }

    private static void a(e0 e0Var, int[] iArr, int i2, String str, int i3, int i4, int i5, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!a(e0Var.a(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5)) {
                list.remove(size);
            }
        }
    }

    private static boolean a(m mVar, String str, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        return a(i2, false) && (i2 & i3) != 0 && (str == null || com.smartdigimkt.p4.f0.a((Object) mVar.f, (Object) str)) && (((i7 = mVar.k) == -1 || i7 <= i4) && (((i8 = mVar.f39337l) == -1 || i8 <= i5) && ((i9 = mVar.f39332b) == -1 || i9 <= i6)));
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    private static com.smartdigimkt.m4.f a(f0 f0Var, int[][] iArr, d dVar) {
        int iB;
        int i2;
        int i3;
        int i4;
        int i5 = -1;
        int iA = -1;
        int i6 = -1;
        int i7 = 0;
        e0 e0Var = null;
        int i8 = 0;
        int i9 = 0;
        while (i7 < f0Var.f35974a) {
            e0 e0VarA = f0Var.a(i7);
            List<Integer> listA = a(e0VarA, dVar.k, dVar.f36661l, dVar.m);
            int[] iArr2 = iArr[i7];
            int i10 = 0;
            while (i10 < e0VarA.f35964a) {
                if (a(iArr2[i10], dVar.q)) {
                    m mVarA = e0VarA.a(i10);
                    boolean z2 = listA.contains(Integer.valueOf(i10)) && ((i2 = mVarA.k) == i5 || i2 <= dVar.g) && (((i3 = mVarA.f39337l) == i5 || i3 <= dVar.f36659h) && ((i4 = mVarA.f39332b) == i5 || i4 <= dVar.f36660i));
                    if (z2 || dVar.j) {
                        int i11 = z2 ? 2 : 1;
                        boolean zA = a(iArr2[i10], false);
                        if (zA) {
                            i11 += 1000;
                        }
                        boolean z3 = i11 > i9;
                        if (i11 == i9) {
                            if (dVar.f36662n) {
                                if (b(mVarA.f39332b, i6) < 0) {
                                    i6 = mVarA.f39332b;
                                    iA = mVarA.a();
                                    e0Var = e0VarA;
                                    i8 = i10;
                                    i9 = i11;
                                }
                            } else {
                                int iA2 = mVarA.a();
                                if (iA2 != iA) {
                                    iB = b(iA2, iA);
                                } else {
                                    iB = b(mVarA.f39332b, i6);
                                }
                                if (zA && z2) {
                                    if (iB > 0) {
                                        i6 = mVarA.f39332b;
                                        iA = mVarA.a();
                                        e0Var = e0VarA;
                                        i8 = i10;
                                        i9 = i11;
                                    }
                                } else if (iB < 0) {
                                    i6 = mVarA.f39332b;
                                    iA = mVarA.a();
                                    e0Var = e0VarA;
                                    i8 = i10;
                                    i9 = i11;
                                }
                            }
                        } else if (z3) {
                            i6 = mVarA.f39332b;
                            iA = mVarA.a();
                            e0Var = e0VarA;
                            i8 = i10;
                            i9 = i11;
                        }
                    }
                }
                i10++;
                i5 = -1;
            }
            i7++;
            i5 = -1;
        }
        if (e0Var == null) {
            return null;
        }
        return new com.smartdigimkt.m4.d(e0Var, i8);
    }

    private static int[] a(e0 e0Var, int[] iArr, boolean z2) {
        int iA;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        b bVar = null;
        for (int i3 = 0; i3 < e0Var.f35964a; i3++) {
            m mVarA = e0Var.a(i3);
            b bVar2 = new b(mVarA.s, mVarA.t, z2 ? null : mVarA.f);
            if (hashSet.add(bVar2) && (iA = a(e0Var, iArr, bVar2)) > i2) {
                i2 = iA;
                bVar = bVar2;
            }
        }
        if (i2 > 1) {
            int[] iArr2 = new int[i2];
            int i4 = 0;
            for (int i5 = 0; i5 < e0Var.f35964a; i5++) {
                if (a(e0Var.a(i5), iArr[i5], (b) com.smartdigimkt.p4.a.a(bVar))) {
                    iArr2[i4] = i5;
                    i4++;
                }
            }
            return iArr2;
        }
        return f;
    }

    private static int a(e0 e0Var, int[] iArr, b bVar) {
        int i2 = 0;
        for (int i3 = 0; i3 < e0Var.f35964a; i3++) {
            if (a(e0Var.a(i3), iArr[i3], bVar)) {
                i2++;
            }
        }
        return i2;
    }

    private static boolean a(m mVar, int i2, b bVar) {
        String str;
        return a(i2, false) && mVar.s == bVar.f36648a && mVar.t == bVar.f36649b && ((str = bVar.f36650c) == null || TextUtils.equals(str, mVar.f));
    }

    public com.smartdigimkt.m4.f a(int i2, f0 f0Var, int[][] iArr, d dVar) throws com.smartdigimkt.w3.g {
        e0 e0Var = null;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < f0Var.f35974a; i5++) {
            e0 e0VarA = f0Var.a(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < e0VarA.f35964a; i6++) {
                if (a(iArr2[i6], dVar.q)) {
                    int i7 = (e0VarA.a(i6).x & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i6], false)) {
                        i7 += 1000;
                    }
                    if (i7 > i4) {
                        e0Var = e0VarA;
                        i3 = i6;
                        i4 = i7;
                    }
                }
            }
        }
        if (e0Var == null) {
            return null;
        }
        return new com.smartdigimkt.m4.d(e0Var, i3);
    }

    private static void a(com.smartdigimkt.m4.e.a aVar, int[][][] iArr, a0[] a0VarArr, com.smartdigimkt.m4.f[] fVarArr, int i2) {
        boolean z2;
        if (i2 == 0) {
            return;
        }
        boolean z3 = false;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i3 >= aVar.a()) {
                z2 = true;
                break;
            }
            int iB = aVar.b(i3);
            com.smartdigimkt.m4.f fVar = fVarArr[i3];
            if ((iB == 1 || iB == 2) && fVar != null && a(iArr[i3], aVar.c(i3), fVar)) {
                if (iB == 1) {
                    if (i5 != -1) {
                        z2 = false;
                        break;
                    }
                    i5 = i3;
                } else {
                    if (i4 != -1) {
                        z2 = false;
                        break;
                    }
                    i4 = i3;
                }
            }
            i3++;
        }
        if (i5 != -1 && i4 != -1) {
            z3 = true;
        }
        if (z2 && z3) {
            a0 a0Var = new a0(i2);
            a0VarArr[i5] = a0Var;
            a0VarArr[i4] = a0Var;
        }
    }

    private static boolean a(int[][] iArr, f0 f0Var, com.smartdigimkt.m4.f fVar) {
        if (fVar == null) {
            return false;
        }
        int iA = f0Var.a(fVar.f());
        for (int i2 = 0; i2 < fVar.j(); i2++) {
            if ((iArr[iA][fVar.b(i2)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(m mVar) {
        return TextUtils.isEmpty(mVar.y) || a(mVar, "und");
    }

    public static boolean a(m mVar, String str) {
        return str != null && TextUtils.equals(str, com.smartdigimkt.p4.f0.h(mVar.y));
    }

    private static List<Integer> a(e0 e0Var, int i2, int i3, boolean z2) {
        int i4;
        ArrayList arrayList = new ArrayList(e0Var.f35964a);
        for (int i5 = 0; i5 < e0Var.f35964a; i5++) {
            arrayList.add(Integer.valueOf(i5));
        }
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < e0Var.f35964a; i7++) {
                m mVarA = e0Var.a(i7);
                int i8 = mVarA.k;
                if (i8 > 0 && (i4 = mVarA.f39337l) > 0) {
                    Point pointA = a(z2, i2, i3, i8, i4);
                    int i9 = mVarA.k;
                    int i10 = mVarA.f39337l;
                    int i11 = i9 * i10;
                    if (i9 >= ((int) (pointA.x * f36646e)) && i10 >= ((int) (pointA.y * f36646e)) && i11 < i6) {
                        i6 = i11;
                    }
                }
            }
            if (i6 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iA = e0Var.a(((Integer) arrayList.get(size)).intValue()).a();
                    if (iA == -1 || iA > i6) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    private static Point a(boolean z2, int i2, int i3, int i4, int i5) {
        if (z2) {
            if ((i4 > i5) == (i2 > i3)) {
                i3 = i2;
                i2 = i3;
            }
        } else {
            i3 = i2;
            i2 = i3;
        }
        int i6 = i4 * i2;
        int i7 = i5 * i3;
        if (i6 >= i7) {
            return new Point(i3, com.smartdigimkt.p4.f0.a(i7, i4));
        }
        return new Point(com.smartdigimkt.p4.f0.a(i6, i5), i2);
    }
}
