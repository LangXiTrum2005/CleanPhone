package cerebral;

import asosan.impassible;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.jvm.internal.rotuma;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012*\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u0012.\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u0002\u0012&\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u0002\u00122\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0016*\u00020\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJA\u0010!\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\"\b\b\u0000\u0010\u0016*\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0010\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'R$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(R8\u0010\u0007\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010(R<\u0010\u000b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\t0\bj\u0006\u0012\u0002\b\u0003`\n0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R4\u0010\r\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R@\u0010\u0010\u001a.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012 \u0012\u001e\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\bj\u0006\u0012\u0002\b\u0003`\u000f0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Lcerebral/saneness;", "Lcerebral/dern;", "", "Lkurbash/wireman;", "Lcerebral/attabal;", "class2ContextualFactory", "Lasosan/wireman;", "polyBase2Serializers", "Lkotlin/Function1;", "Lasosan/impassible;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2DefaultSerializerProvider", "", "polyBase2NamedSerializers", "Lasosan/dern;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "", "hasInterfaceContextualSerializers", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "baseClass", "value", "beachfront", "(Lkurbash/wireman;Ljava/lang/Object;)Lasosan/impassible;", "serializedClassName", "marial", "(Lkurbash/wireman;Ljava/lang/String;)Lasosan/dern;", "kClass", "", "typeArgumentsSerializers", "saneness", "(Lkurbash/wireman;Ljava/util/List;)Lasosan/wireman;", "Lcerebral/beachfront;", "collector", "", "attabal", "(Lcerebral/beachfront;)V", "Ljava/util/Map;", "dern", "wireman", "Z", "()Z", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class saneness extends dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<kurbash.wireman<?>, attabal> class2ContextualFactory;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final boolean hasInterfaceContextualSerializers;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Map<kurbash.wireman<?>, Function1<?, impassible<?>>> polyBase2DefaultSerializerProvider;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Map<kurbash.wireman<?>, Function1<String, asosan.dern<?>>> polyBase2DefaultDeserializerProvider;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Map<kurbash.wireman<?>, Map<kurbash.wireman<?>, asosan.wireman<?>>> polyBase2Serializers;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final Map<kurbash.wireman<?>, Map<String, asosan.wireman<?>>> polyBase2NamedSerializers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public saneness(Map<kurbash.wireman<?>, ? extends attabal> class2ContextualFactory, Map<kurbash.wireman<?>, ? extends Map<kurbash.wireman<?>, ? extends asosan.wireman<?>>> polyBase2Serializers, Map<kurbash.wireman<?>, ? extends Function1<?, ? extends impassible<?>>> polyBase2DefaultSerializerProvider, Map<kurbash.wireman<?>, ? extends Map<String, ? extends asosan.wireman<?>>> polyBase2NamedSerializers, Map<kurbash.wireman<?>, ? extends Function1<? super String, ? extends asosan.dern<?>>> polyBase2DefaultDeserializerProvider, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
        this.hasInterfaceContextualSerializers = z;
    }

    @Override // cerebral.dern
    public void attabal(beachfront collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry<kurbash.wireman<?>, attabal> entry : this.class2ContextualFactory.entrySet()) {
            kurbash.wireman<?> key = entry.getKey();
            attabal value = entry.getValue();
            if (value instanceof attabal.C0139attabal) {
                Intrinsics.competently(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                asosan.wireman<?> wiremanVarSaneness = ((attabal.C0139attabal) value).saneness();
                Intrinsics.competently(wiremanVarSaneness, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.marial(key, wiremanVarSaneness);
            } else {
                if (!(value instanceof attabal.saneness)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.wireman(key, ((attabal.saneness) value).saneness());
            }
        }
        for (Map.Entry<kurbash.wireman<?>, Map<kurbash.wireman<?>, asosan.wireman<?>>> entry2 : this.polyBase2Serializers.entrySet()) {
            kurbash.wireman<?> key2 = entry2.getKey();
            for (Map.Entry<kurbash.wireman<?>, asosan.wireman<?>> entry3 : entry2.getValue().entrySet()) {
                kurbash.wireman<?> key3 = entry3.getKey();
                asosan.wireman<?> value2 = entry3.getValue();
                Intrinsics.competently(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.competently(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.competently(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.dern(key2, key3, value2);
            }
        }
        for (Map.Entry<kurbash.wireman<?>, Function1<?, impassible<?>>> entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            kurbash.wireman<?> key4 = entry4.getKey();
            Function1<?, impassible<?>> value3 = entry4.getValue();
            Intrinsics.competently(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.competently(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.saneness(key4, (Function1) rotuma.beachfront(value3, 1));
        }
        for (Map.Entry<kurbash.wireman<?>, Function1<String, asosan.dern<?>>> entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            kurbash.wireman<?> key5 = entry5.getKey();
            Function1<String, asosan.dern<?>> value4 = entry5.getValue();
            Intrinsics.competently(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.competently(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.attabal(key5, (Function1) rotuma.beachfront(value4, 1));
        }
    }

    @Override // cerebral.dern
    public <T> impassible<T> beachfront(kurbash.wireman<? super T> baseClass, T value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.beachfront(value)) {
            return null;
        }
        Map<kurbash.wireman<?>, asosan.wireman<?>> map = this.polyBase2Serializers.get(baseClass);
        asosan.wireman<?> wiremanVar = map != null ? map.get(polloi.saneness(value.getClass())) : null;
        if (wiremanVar == null) {
            wiremanVar = null;
        }
        if (wiremanVar != null) {
            return wiremanVar;
        }
        Function1<?, impassible<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        Function1<?, impassible<?>> function2 = rotuma.impassible(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (impassible) function2.invoke(value);
        }
        return null;
    }

    @Override // cerebral.dern
    public <T> asosan.dern<T> marial(kurbash.wireman<? super T> baseClass, String serializedClassName) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map<String, asosan.wireman<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        asosan.wireman<?> wiremanVar = map != null ? map.get(serializedClassName) : null;
        if (wiremanVar == null) {
            wiremanVar = null;
        }
        if (wiremanVar != null) {
            return wiremanVar;
        }
        Function1<String, asosan.dern<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        Function1<String, asosan.dern<?>> function2 = rotuma.impassible(function1, 1) ? function1 : null;
        if (function2 != null) {
            return (asosan.dern) function2.invoke(serializedClassName);
        }
        return null;
    }

    @Override // cerebral.dern
    public <T> asosan.wireman<T> saneness(kurbash.wireman<T> kClass, List<? extends asosan.wireman<?>> typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        attabal attabalVar = this.class2ContextualFactory.get(kClass);
        asosan.wireman<T> wiremanVar = attabalVar != null ? (asosan.wireman<T>) attabalVar.attabal(typeArgumentsSerializers) : null;
        if (wiremanVar != null) {
            return wiremanVar;
        }
        return null;
    }

    @Override // cerebral.dern
    /* JADX INFO: renamed from: wireman, reason: from getter */
    public boolean getHasInterfaceContextualSerializers() {
        return this.hasInterfaceContextualSerializers;
    }
}
