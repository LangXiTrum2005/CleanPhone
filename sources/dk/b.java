package dk;

import java.io.Serializable;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f38945a;

    public b(Enum[] enumArr) {
        Class<?> componentType = enumArr.getClass().getComponentType();
        n.c(componentType);
        this.f38945a = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.f38945a.getEnumConstants();
        n.e(enumConstants, "getEnumConstants(...)");
        return new a((Enum[]) enumConstants);
    }
}
