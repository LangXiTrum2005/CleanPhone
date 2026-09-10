package kotlin.reflect.jvm.internal;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements KMutableProperty1<T, V> {
    public final Object p0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty1$Setter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Setter<T, V> extends KPropertyImpl.Setter<V> implements KMutableProperty1.Setter<T, V> {
        public final KMutableProperty1Impl j0;

        public Setter(KMutableProperty1Impl property) {
            Intrinsics.f(property, "property");
            this.j0 = property;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            ((Setter) this.j0.p0.getX()).call(obj, obj2);
            return Unit.f43263a;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final KPropertyImpl s() {
            return this.j0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.f(container, "container");
        Intrinsics.f(name, "name");
        Intrinsics.f(signature, "signature");
        this.p0 = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<Setter<Object, Object>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KMutableProperty1Impl.Setter(this.X);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.p0.getX();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    public final KMutableProperty1.Setter getSetter() {
        return (Setter) this.p0.getX();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.f(container, "container");
        Intrinsics.f(descriptor, "descriptor");
        this.p0 = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<Setter<Object, Object>>() { // from class: kotlin.reflect.jvm.internal.KMutableProperty1Impl$_setter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KMutableProperty1Impl.Setter(this.X);
            }
        });
    }
}
