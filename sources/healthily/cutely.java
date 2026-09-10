package healthily;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly;

/* JADX INFO: compiled from: RuntimeErrorReporter.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cutely implements triweekly {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final cutely f27608saneness = new cutely();

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly
    public void attabal(CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.triweekly
    public void saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman descriptor, List<String> unresolvedSuperClasses) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(unresolvedSuperClasses, "unresolvedSuperClasses");
        throw new IllegalStateException("Incomplete hierarchy for class " + descriptor.getName() + ", unresolved classes " + unresolvedSuperClasses);
    }
}
