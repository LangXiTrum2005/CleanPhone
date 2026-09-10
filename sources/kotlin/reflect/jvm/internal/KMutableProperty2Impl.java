package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "Lkotlin/reflect/KMutableProperty2;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KMutableProperty2Impl<D, E, V> extends KProperty2Impl<D, E, V> implements KMutableProperty2<D, E, V> {
    public final Object p0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0004\b\u0005\u0010\u00032\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty2Impl$Setter;", "D", "E", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty2$Setter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Setter<D, E, V> extends KPropertyImpl.Setter<V> implements KMutableProperty2.Setter<D, E, V> {
        public final KMutableProperty2Impl j0;

        public Setter(KMutableProperty2Impl property) {
            Intrinsics.f(property, "property");
            this.j0 = property;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            ((Setter) this.j0.p0.getX()).call(obj, obj2, obj3);
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final KPropertyImpl s() {
            return this.j0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(KDeclarationContainerImpl container, String name, String signature) {
        super(container, name, signature);
        Intrinsics.f(container, "container");
        Intrinsics.f(name, "name");
        Intrinsics.f(signature, "signature");
        this.p0 = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<Setter<Object, Object, Object>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KMutableProperty2Impl.Setter(this.X);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.p0.getX();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty2, kotlin.reflect.KMutableProperty
    public final KMutableProperty2.Setter getSetter() {
        return (Setter) this.p0.getX();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty2Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.f(container, "container");
        Intrinsics.f(descriptor, "descriptor");
        this.p0 = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<Setter<Object, Object, Object>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty2Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KMutableProperty2Impl.Setter(this.X);
            }
        });
    }
}
