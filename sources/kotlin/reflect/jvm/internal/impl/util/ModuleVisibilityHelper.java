package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;

/* JADX INFO: loaded from: classes7.dex */
public interface ModuleVisibilityHelper {

    public static final class EMPTY implements ModuleVisibilityHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EMPTY f44616a = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper
        public final void a(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor from) {
            Intrinsics.f(from, "from");
        }
    }

    void a(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor);
}
