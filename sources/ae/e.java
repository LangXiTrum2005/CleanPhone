package ae;

import com.google.android.gms.internal.measurement.f2;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements com.google.gson.u, Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f3498c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3500b;

    public e() {
        List list = Collections.EMPTY_LIST;
        this.f3499a = list;
        this.f3500b = list;
    }

    public final boolean a(Class cls, boolean z10) {
        if (!z10 && !Enum.class.isAssignableFrom(cls)) {
            com.bumptech.glide.c cVar = de.c.f38839a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z10 ? this.f3499a : this.f3500b).iterator();
        if (it.hasNext()) {
            throw f2.j(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (e) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.u
    public final com.google.gson.t create(com.google.gson.d dVar, fe.a aVar) {
        Class cls = aVar.f40809a;
        boolean zA = a(cls, true);
        boolean zA2 = a(cls, false);
        if (zA || zA2) {
            return new d(this, zA2, zA, dVar, aVar);
        }
        return null;
    }
}
