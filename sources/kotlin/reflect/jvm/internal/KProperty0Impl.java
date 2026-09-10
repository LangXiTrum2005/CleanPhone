package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "V", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class KProperty0Impl<V> extends KPropertyImpl<V> implements KProperty0<V> {
    public final Object n0;
    public final Object o0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Getter<R> extends KPropertyImpl.Getter<R> implements KProperty0.Getter<R> {
        public final KProperty0Impl j0;

        public Getter(KProperty0Impl property) {
            Intrinsics.f(property, "property");
            this.j0 = property;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.j0.get();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final KPropertyImpl s() {
            return this.j0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.f(container, "container");
        Intrinsics.f(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        this.n0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Getter<Object>>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KProperty0Impl.Getter(this.X);
            }
        });
        this.o0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Object>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty0Impl kProperty0Impl = this.X;
                return kProperty0Impl.s(kProperty0Impl.r(), null);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty0
    public final Object get() {
        return ((Getter) this.n0.getX()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty0
    public final Object getDelegate() {
        return this.o0.getX();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.n0.getX();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    public final KPropertyImpl.Getter u() {
        return (Getter) this.n0.getX();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return (Getter) this.n0.getX();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.f(container, "container");
        Intrinsics.f(name, "name");
        Intrinsics.f(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        this.n0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Getter<Object>>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KProperty0Impl.Getter(this.X);
            }
        });
        this.o0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Object>() { // from class: kotlin.reflect.jvm.internal.KProperty0Impl$delegateValue$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty0Impl kProperty0Impl = this.X;
                return kProperty0Impl.s(kProperty0Impl.r(), null);
            }
        });
    }
}
