package p002kotlin.reflect.jvm.internal.impl.descriptors;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ModalityUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cuirassed {
    public static final boolean attabal(wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        return wiremanVar.kowloon() == Modality.FINAL && wiremanVar.getKind() != ClassKind.ENUM_CLASS;
    }
}
