package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.marial;
import byname.saneness;
import genesic.impassible;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class kowloon extends marial implements impassible {
    private final Enum<?> value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kowloon(marial marialVar, Enum<?> value) {
        super(marialVar, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // genesic.impassible
    public marial marial() {
        return marial.cutely(this.value.name());
    }

    @Override // genesic.impassible
    public saneness wireman() {
        Class<?> enclosingClass = this.value.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        Intrinsics.beachfront(enclosingClass);
        return ReflectClassUtilKt.attabal(enclosingClass);
    }
}
