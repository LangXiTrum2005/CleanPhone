package oj;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
        Set setE0 = xj.k.E0(new String[]{"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"});
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || setE0.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
