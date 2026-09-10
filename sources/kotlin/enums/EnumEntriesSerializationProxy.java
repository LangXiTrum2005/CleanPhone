package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\bJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", "", "E", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Class X;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public EnumEntriesSerializationProxy(Enum[] entries) {
        Intrinsics.f(entries, "entries");
        Class<?> componentType = entries.getClass().getComponentType();
        Intrinsics.c(componentType);
        this.X = componentType;
    }

    private final Object readResolve() {
        Object[] enumConstants = this.X.getEnumConstants();
        Intrinsics.e(enumConstants, "getEnumConstants(...)");
        return EnumEntriesKt.a((Enum[]) enumConstants);
    }
}
