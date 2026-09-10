package intermigration;

import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes5.dex */
public class saneness implements lyreflower.saneness.dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final boolean f28938attabal;

    public saneness(boolean z) {
        this.f28938attabal = z;
    }

    @Override // lyreflower.saneness.dern
    public Iterable attabal(Object obj) {
        return DescriptorUtilsKt.competently(this.f28938attabal, (CallableMemberDescriptor) obj);
    }
}
