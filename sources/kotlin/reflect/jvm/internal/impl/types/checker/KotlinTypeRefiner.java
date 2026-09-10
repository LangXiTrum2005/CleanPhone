package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {
    public abstract void b(ClassId classId);

    public abstract void c(ModuleDescriptor moduleDescriptor);

    public abstract void d(DeclarationDescriptor declarationDescriptor);

    public abstract Collection e(ClassDescriptor classDescriptor);

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract KotlinType a(KotlinTypeMarker kotlinTypeMarker);

    public static final class Default extends KotlinTypeRefiner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f44564a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final void d(DeclarationDescriptor descriptor) {
            Intrinsics.f(descriptor, "descriptor");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final Collection e(ClassDescriptor classDescriptor) {
            Intrinsics.f(classDescriptor, "classDescriptor");
            Collection collectionD = classDescriptor.h().d();
            Intrinsics.e(collectionD, "classDescriptor.typeConstructor.supertypes");
            return collectionD;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: f */
        public final KotlinType a(KotlinTypeMarker type) {
            Intrinsics.f(type, "type");
            return (KotlinType) type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final void b(ClassId classId) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public final void c(ModuleDescriptor moduleDescriptor) {
        }
    }
}
