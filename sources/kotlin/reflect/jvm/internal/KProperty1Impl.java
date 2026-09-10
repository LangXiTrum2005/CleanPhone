package kotlin.reflect.jvm.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Member;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements KProperty1<T, V> {
    public final Object n0;
    public final Object o0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "kotlin-reflection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Getter<T, V> extends KPropertyImpl.Getter<V> implements KProperty1.Getter<T, V> {
        public final KProperty1Impl j0;

        public Getter(KProperty1Impl property) {
            Intrinsics.f(property, "property");
            this.j0 = property;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return this.j0.get(obj);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final KPropertyImpl s() {
            return this.j0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.f(container, "container");
        Intrinsics.f(name, "name");
        Intrinsics.f(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        this.n0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Getter<Object, Object>>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KProperty1Impl.Getter(this.X);
            }
        });
        this.o0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Member>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.X.r();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((Getter) this.n0.getX()).call(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty1
    public final Object getDelegate(Object obj) {
        return s((Member) this.o0.getX(), obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.n0.getX();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.KPropertyImpl
    public final KPropertyImpl.Getter u() {
        return (Getter) this.n0.getX();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final KProperty1.Getter getGetter() {
        return (Getter) this.n0.getX();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(KDeclarationContainerImpl container, PropertyDescriptorImpl descriptor) {
        super(container, descriptor);
        Intrinsics.f(container, "container");
        Intrinsics.f(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f43248Y;
        this.n0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Getter<Object, Object>>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$_getter$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KProperty1Impl.Getter(this.X);
            }
        });
        this.o0 = LazyKt.a(lazyThreadSafetyMode, new Function0<Member>() { // from class: kotlin.reflect.jvm.internal.KProperty1Impl$delegateSource$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.X.r();
            }
        });
    }
}
