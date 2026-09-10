package p002kotlin.reflect.jvm.internal;

import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/wireman;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/apical;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/dovishness;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/saran;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "attabal", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class wireman extends apical<KCallableImpl<?>, Unit> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final KDeclarationContainerImpl container;

    public wireman(KDeclarationContainerImpl container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.container = container;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.apical, p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> taiyuan(dovishness descriptor, Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        return new KFunctionImpl(this.container, descriptor);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impassible
    /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
    public KCallableImpl<?> dern(saran descriptor, Unit data) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(data, "data");
        int i = (descriptor.kattegat() != null ? 1 : 0) + (descriptor.polder() != null ? 1 : 0);
        if (descriptor.restrictive()) {
            if (i == 0) {
                return new KMutableProperty0Impl(this.container, descriptor);
            }
            if (i == 1) {
                return new KMutableProperty1Impl(this.container, descriptor);
            }
            if (i == 2) {
                return new cutely(this.container, descriptor);
            }
        } else {
            if (i == 0) {
                return new KProperty0Impl(this.container, descriptor);
            }
            if (i == 1) {
                return new KProperty1Impl(this.container, descriptor);
            }
            if (i == 2) {
                return new KProperty2Impl(this.container, descriptor);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + descriptor);
    }
}
