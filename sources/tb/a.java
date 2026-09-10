package tb;

import com.google.android.gms.internal.ads.em0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f50674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f50675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f50678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f50679g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.f50673a = str;
        this.f50674b = Collections.unmodifiableSet(set);
        this.f50675c = Collections.unmodifiableSet(set2);
        this.f50676d = i10;
        this.f50677e = i11;
        this.f50678f = dVar;
        this.f50679g = Collections.unmodifiableSet(set3);
    }

    public static em0 a(Class cls) {
        return new em0(cls, new Class[0]);
    }

    public static em0 b(q qVar) {
        return new em0(qVar, new q[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            a.a.f(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new q1.e(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f50674b.toArray()) + ">{" + this.f50676d + ", type=" + this.f50677e + ", deps=" + Arrays.toString(this.f50675c.toArray()) + "}";
    }
}
