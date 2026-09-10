package p002kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;

/* JADX INFO: compiled from: VisibilityUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class arytenoidectomy {
    public static final CallableMemberDescriptor attabal(Collection<? extends CallableMemberDescriptor> descriptors) {
        Integer numWireman;
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        descriptors.isEmpty();
        CallableMemberDescriptor callableMemberDescriptor = null;
        for (CallableMemberDescriptor callableMemberDescriptor2 : descriptors) {
            if (callableMemberDescriptor == null || ((numWireman = polloi.wireman(callableMemberDescriptor.getVisibility(), callableMemberDescriptor2.getVisibility())) != null && numWireman.intValue() < 0)) {
                callableMemberDescriptor = callableMemberDescriptor2;
            }
        }
        Intrinsics.beachfront(callableMemberDescriptor);
        return callableMemberDescriptor;
    }
}
