package eg;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f40037a = {0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f40038b = {0, 0, 0, 1};

    public static Object a(e eVar, vf.c type) {
        n.f(type, "type");
        if (eVar.k(type)) {
            return eVar.l(type);
        }
        return null;
    }

    public static Iterator b(e eVar) {
        return k.m0(new Object[]{eVar.j(), eVar.o()}).iterator();
    }
}
