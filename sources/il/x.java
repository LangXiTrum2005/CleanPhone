package il;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yl.c f43118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final yl.b f43119b;

    static {
        yl.c cVar = new yl.c("kotlin.jvm.JvmField");
        f43118a = cVar;
        yl.b.j(cVar);
        yl.b.j(new yl.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f43119b = yl.b.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String propertyName) {
        kotlin.jvm.internal.n.f(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + android.support.v4.media.session.a.c(propertyName);
    }

    public static final String b(String str) {
        String strC;
        StringBuilder sb2 = new StringBuilder("set");
        if (c(str)) {
            strC = str.substring(2);
            kotlin.jvm.internal.n.e(strC, "this as java.lang.String).substring(startIndex)");
        } else {
            strC = android.support.v4.media.session.a.c(str);
        }
        sb2.append(strC);
        return sb2.toString();
    }

    public static final boolean c(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        if (an.p.p0(name, "is", false) && name.length() != 2) {
            char cCharAt = name.charAt(2);
            if (kotlin.jvm.internal.n.h(97, cCharAt) > 0 || kotlin.jvm.internal.n.h(cCharAt, 122) > 0) {
                return true;
            }
        }
        return false;
    }
}
