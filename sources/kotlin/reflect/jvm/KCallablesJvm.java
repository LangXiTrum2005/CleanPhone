package kotlin.reflect.jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.jvm.internal.KPropertyImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class KCallablesJvm {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(KPropertyImpl kPropertyImpl) {
        if (kPropertyImpl instanceof KMutableProperty) {
            Field fieldA = ReflectJvmMapping.a(kPropertyImpl);
            if (!(fieldA != null ? fieldA.isAccessible() : true)) {
                return false;
            }
            Method methodB = ReflectJvmMapping.b(kPropertyImpl.getGetter());
            if (!(methodB != null ? methodB.isAccessible() : true)) {
                return false;
            }
            Method methodB2 = ReflectJvmMapping.b(((KMutableProperty) kPropertyImpl).getSetter());
            if (!(methodB2 != null ? methodB2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldA2 = ReflectJvmMapping.a(kPropertyImpl);
            if (!(fieldA2 != null ? fieldA2.isAccessible() : true)) {
                return false;
            }
            Method methodB3 = ReflectJvmMapping.b(kPropertyImpl.getGetter());
            if (!(methodB3 != null ? methodB3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
