package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyWrappedType extends WrappedType {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final LockBasedStorageManager f44517Y;
    public final Lambda Z;
    public final NotNullLazyValue e0;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(LockBasedStorageManager storageManager, Function0 function0) {
        Intrinsics.f(storageManager, "storageManager");
        this.f44517Y = storageManager;
        this.Z = (Lambda) function0;
        this.e0 = storageManager.a(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    /* JADX INFO: renamed from: J0 */
    public final KotlinType M0(final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.f(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f44517Y, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$refine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return kotlinTypeRefiner.a((KotlinTypeMarker) this.Z.invoke());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public final KotlinType L0() {
        return (KotlinType) this.e0.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public final boolean M0() {
        return this.e0.j();
    }
}
