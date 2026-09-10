package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import yeast.formularize;

/* JADX INFO: compiled from: DeserializedAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cutely extends attabal {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cutely(formularize storageManager, Function0<? extends List<? extends dern>> compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial
    public boolean isEmpty() {
        return false;
    }
}
