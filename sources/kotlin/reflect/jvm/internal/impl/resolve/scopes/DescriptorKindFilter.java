package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import android.support.v4.media.a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class DescriptorKindFilter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f44331c = new Companion();
    public static final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44332e;
    public static final int f;
    public static final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44333h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44334i;
    public static final int j;
    public static final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44335l;
    public static final DescriptorKindFilter m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final DescriptorKindFilter f44336n;
    public static final DescriptorKindFilter o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final DescriptorKindFilter f44337p;
    public static final DescriptorKindFilter q;
    public static final ArrayList r;
    public static final ArrayList s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44339b;

    public static final class Companion {

        public static final class MaskToName {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f44340a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f44341b;

            public MaskToName(int i2, String str) {
                this.f44340a = i2;
                this.f44341b = str;
            }
        }
    }

    static {
        Companion.MaskToName maskToName;
        int i2 = d;
        int i3 = i2 << 1;
        f44332e = i2;
        int i4 = i2 << 2;
        f = i3;
        int i5 = i2 << 3;
        g = i4;
        int i6 = i2 << 4;
        f44333h = i5;
        int i7 = i2 << 5;
        f44334i = i6;
        j = i7;
        d = i2 << 7;
        int i8 = (i2 << 6) - 1;
        k = i8;
        int i9 = i2 | i3 | i4;
        f44335l = i9;
        m = new DescriptorKindFilter(i8);
        f44336n = new DescriptorKindFilter(i6 | i7);
        new DescriptorKindFilter(i2);
        new DescriptorKindFilter(i3);
        new DescriptorKindFilter(i4);
        o = new DescriptorKindFilter(i9);
        new DescriptorKindFilter(i5);
        f44337p = new DescriptorKindFilter(i6);
        q = new DescriptorKindFilter(i7);
        new DescriptorKindFilter(i3 | i6 | i7);
        Field[] fields = DescriptorKindFilter.class.getFields();
        Intrinsics.e(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            Companion.MaskToName maskToName2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            DescriptorKindFilter descriptorKindFilter = obj instanceof DescriptorKindFilter ? (DescriptorKindFilter) obj : null;
            if (descriptorKindFilter != null) {
                String name = field2.getName();
                Intrinsics.e(name, "field.name");
                maskToName2 = new Companion.MaskToName(descriptorKindFilter.f44339b, name);
            }
            if (maskToName2 != null) {
                arrayList2.add(maskToName2);
            }
        }
        r = arrayList2;
        Field[] fields2 = DescriptorKindFilter.class.getFields();
        Intrinsics.e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (Intrinsics.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                Intrinsics.e(name2, "field.name");
                maskToName = new Companion.MaskToName(iIntValue, name2);
            } else {
                maskToName = null;
            }
            if (maskToName != null) {
                arrayList5.add(maskToName);
            }
        }
        s = arrayList5;
    }

    public DescriptorKindFilter(int i2, List excludes) {
        Intrinsics.f(excludes, "excludes");
        this.f44338a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i2 &= ~((DescriptorKindExclude) it.next()).a();
        }
        this.f44339b = i2;
    }

    public final boolean a(int i2) {
        return (i2 & this.f44339b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!DescriptorKindFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        DescriptorKindFilter descriptorKindFilter = (DescriptorKindFilter) obj;
        return Intrinsics.a(this.f44338a, descriptorKindFilter.f44338a) && this.f44339b == descriptorKindFilter.f44339b;
    }

    public final int hashCode() {
        return (this.f44338a.hashCode() * 31) + this.f44339b;
    }

    public final String toString() {
        Object next;
        Iterator it = r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Companion.MaskToName) next).f44340a != this.f44339b);
        Companion.MaskToName maskToName = (Companion.MaskToName) next;
        String strD = maskToName != null ? maskToName.f44341b : null;
        if (strD == null) {
            ArrayList<Companion.MaskToName> arrayList = s;
            ArrayList arrayList2 = new ArrayList();
            for (Companion.MaskToName maskToName2 : arrayList) {
                String str = a(maskToName2.f44340a) ? maskToName2.f44341b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strD = CollectionsKt.D(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder sbY = a.y("DescriptorKindFilter(", strD, ", ");
        sbY.append(this.f44338a);
        sbY.append(')');
        return sbY.toString();
    }

    public /* synthetic */ DescriptorKindFilter(int i2) {
        this(i2, EmptyList.X);
    }
}
