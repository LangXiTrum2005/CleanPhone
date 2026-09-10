package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes7.dex */
public interface ResolutionScope {

    public static final class DefaultImpls {
        public static /* synthetic */ Collection a(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, int i2) {
            if ((i2 & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.m;
            }
            MemberScope.f44348a.getClass();
            return resolutionScope.g(descriptorKindFilter, MemberScope$Companion$ALL_NAME_FILTER$1.X);
        }
    }

    ClassifierDescriptor f(Name name, LookupLocation lookupLocation);

    Collection g(DescriptorKindFilter descriptorKindFilter, Function1 function1);
}
