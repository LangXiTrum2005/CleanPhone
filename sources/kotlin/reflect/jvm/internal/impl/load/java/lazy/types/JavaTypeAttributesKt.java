package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaTypeAttributesKt {
    public static JavaTypeAttributes a(TypeUsage typeUsage, boolean z2, LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor, int i2) {
        boolean z3 = (i2 & 1) != 0 ? false : z2;
        boolean z4 = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            lazyJavaTypeParameterDescriptor = null;
        }
        return new JavaTypeAttributes(typeUsage, z4, z3, lazyJavaTypeParameterDescriptor != null ? SetsKt.h(lazyJavaTypeParameterDescriptor) : null, 34);
    }
}
