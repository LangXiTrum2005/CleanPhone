package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.marial;
import genesic.kowloon;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotationArguments.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class monoploid extends marial implements kowloon {
    private final Object value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public monoploid(marial marialVar, Object value) {
        super(marialVar, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // genesic.kowloon
    public Object getValue() {
        return this.value;
    }
}
