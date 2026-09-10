package kotlin.jvm.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 {
    public static List a(List list) {
        if ((list instanceof kk.a) && !(list instanceof kk.c)) {
            f(list, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return list;
        } catch (ClassCastException e10) {
            n.i(e10, h0.class.getName());
            throw e10;
        }
    }

    public static Map b(HashMap map) {
        if (!(map instanceof kk.a) || (map instanceof kk.d)) {
            return map;
        }
        f(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static Set c(Object obj) {
        if ((obj instanceof kk.a) && !(obj instanceof kk.e)) {
            f(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            n.i(e10, h0.class.getName());
            throw e10;
        }
    }

    public static void d(int i10, Object obj) {
        if (obj == null || e(i10, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    public static boolean e(int i10, Object obj) {
        int arity;
        if (obj instanceof wj.a) {
            if (obj instanceof i) {
                arity = ((i) obj).getArity();
            } else if (obj instanceof jk.a) {
                arity = 0;
            } else if (obj instanceof jk.b) {
                arity = 1;
            } else if (obj instanceof jk.c) {
                arity = 2;
            } else if (obj instanceof jk.d) {
                arity = 3;
            } else {
                boolean z10 = obj instanceof tk.e;
                if (z10) {
                    arity = 4;
                } else if (obj instanceof jk.e) {
                    arity = 5;
                } else if (obj instanceof jk.f) {
                    arity = 6;
                } else if (z10) {
                    arity = 7;
                } else if (z10) {
                    arity = 8;
                } else if (z10) {
                    arity = 9;
                } else if (z10) {
                    arity = 10;
                } else if (z10) {
                    arity = 11;
                } else if (z10) {
                    arity = 12;
                } else if (z10) {
                    arity = 13;
                } else if (z10) {
                    arity = 14;
                } else if (z10) {
                    arity = 15;
                } else if (z10) {
                    arity = 16;
                } else if (z10) {
                    arity = 17;
                } else if (z10) {
                    arity = 18;
                } else if (z10) {
                    arity = 19;
                } else if (z10) {
                    arity = 20;
                } else if (z10) {
                    arity = 21;
                } else {
                    arity = z10 ? 22 : -1;
                }
            }
            if (arity == i10) {
                return true;
            }
        }
        return false;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(wi.d.i(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        n.i(classCastException, h0.class.getName());
        throw classCastException;
    }
}
