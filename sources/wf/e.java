package wf;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;
import xj.b0;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements eg.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f53191b;

    public /* synthetic */ e(fc.f fVar, int i10) {
        this.f53190a = i10;
        this.f53191b = fVar;
    }

    public void b(vf.c type, Object obj) {
        n.f(type, "type");
        ((LinkedHashMap) this.f53191b).put(type, obj);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f53190a) {
            case 0:
                break;
            case 1:
                break;
        }
        return eg.a.b(this);
    }

    @Override // eg.e
    public final Object j() {
        switch (this.f53190a) {
            case 0:
                return (Boolean) eg.a.a(this, vf.c.VIDEO);
            case 1:
                return (Boolean) eg.a.a(this, vf.c.VIDEO);
            default:
                return eg.a.a(this, vf.c.VIDEO);
        }
    }

    @Override // eg.e
    public final boolean k(vf.c type) {
        switch (this.f53190a) {
            case 0:
            case 1:
                n.f(type, "type");
                return true;
            default:
                n.f(type, "type");
                return ((LinkedHashMap) this.f53191b).get(type) != null;
        }
    }

    @Override // eg.e
    public final Object l(vf.c type) {
        switch (this.f53190a) {
            case 0:
                n.f(type, "type");
                return Boolean.valueOf(((Number) ((eg.e) ((fc.f) this.f53191b).f40782d).l(type)).intValue() == 0);
            case 1:
                n.f(type, "type");
                fc.f fVar = (fc.f) this.f53191b;
                return Boolean.valueOf(((Number) ((eg.e) fVar.f40782d).l(type)).intValue() == o.P(((f) fVar.f40780b).l(type)));
            default:
                n.f(type, "type");
                Object obj = ((LinkedHashMap) this.f53191b).get(type);
                if (obj != null) {
                    return obj;
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // eg.e
    public final Object o() {
        switch (this.f53190a) {
            case 0:
                return (Boolean) eg.a.a(this, vf.c.AUDIO);
            case 1:
                return (Boolean) eg.a.a(this, vf.c.AUDIO);
            default:
                return eg.a.a(this, vf.c.AUDIO);
        }
    }

    public e(Object obj, Object obj2) {
        this.f53190a = 2;
        this.f53191b = b0.R(new wj.f(vf.c.VIDEO, obj), new wj.f(vf.c.AUDIO, obj2));
    }
}
