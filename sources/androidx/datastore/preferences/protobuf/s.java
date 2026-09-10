package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile s f4164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f4165b;

    static {
        s sVar = new s();
        Map map = Collections.EMPTY_MAP;
        f4165b = sVar;
    }

    public static s a() {
        s sVar;
        a1 a1Var = a1.f4050c;
        s sVar2 = f4164a;
        if (sVar2 != null) {
            return sVar2;
        }
        synchronized (s.class) {
            try {
                sVar = f4164a;
                if (sVar == null) {
                    Class cls = r.f4162a;
                    s sVar3 = null;
                    if (cls != null) {
                        try {
                            sVar3 = (s) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    sVar = sVar3 != null ? sVar3 : f4165b;
                    f4164a = sVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
