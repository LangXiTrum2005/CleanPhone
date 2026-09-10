package p002kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.LazyThreadSafetyMode;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Lambda;
import p002kotlin.reflect.KTypeProjection;
import p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class KTypeImpl$arguments$2 extends Lambda implements Function0<List<? extends KTypeProjection>> {
    final /* synthetic */ Function0<Type> $computeJavaType;
    final /* synthetic */ KTypeImpl this$0;

    /* JADX INFO: compiled from: KTypeImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f29542attabal;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29542attabal = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, Function0<? extends Type> function0) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$computeJavaType = function0;
    }

    public static final List<Type> attabal(taiyuan<? extends List<? extends Type>> taiyuanVar) {
        return (List) taiyuanVar.getValue();
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final List<? extends KTypeProjection> invoke() {
        KTypeProjection kTypeProjectionWireman;
        List<timberyard> listDhss = this.this$0.getType().dhss();
        if (listDhss.isEmpty()) {
            return adultoid.formularize();
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final KTypeImpl kTypeImpl = this.this$0;
        final taiyuan taiyuanVarAttabal = saneness.attabal(lazyThreadSafetyMode, new Function0<List<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final List<? extends Type> invoke() {
                Type typeMarial = kTypeImpl.marial();
                Intrinsics.beachfront(typeMarial);
                return ReflectClassUtilKt.wireman(typeMarial);
            }
        });
        List<timberyard> list = listDhss;
        Function0<Type> function0 = this.$computeJavaType;
        final KTypeImpl kTypeImpl2 = this.this$0;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        final int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            timberyard timberyardVar = (timberyard) obj;
            if (timberyardVar.saneness()) {
                kTypeProjectionWireman = KTypeProjection.INSTANCE.dern();
            } else {
                oilcan type = timberyardVar.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                KTypeImpl kTypeImpl3 = new KTypeImpl(type, function0 == null ? null : new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$1$type$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public final Type invoke() {
                        Type typeMarial = kTypeImpl2.marial();
                        if (typeMarial instanceof Class) {
                            Class cls = (Class) typeMarial;
                            Class<?> componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                            Intrinsics.beachfront(componentType);
                            return componentType;
                        }
                        if (typeMarial instanceof GenericArrayType) {
                            if (i == 0) {
                                Type genericComponentType = ((GenericArrayType) typeMarial).getGenericComponentType();
                                Intrinsics.beachfront(genericComponentType);
                                return genericComponentType;
                            }
                            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + kTypeImpl2);
                        }
                        if (!(typeMarial instanceof ParameterizedType)) {
                            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + kTypeImpl2);
                        }
                        Type type2 = (Type) KTypeImpl$arguments$2.attabal(taiyuanVarAttabal).get(i);
                        if (type2 instanceof WildcardType) {
                            WildcardType wildcardType = (WildcardType) type2;
                            Type[] lowerBounds = wildcardType.getLowerBounds();
                            Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
                            Type type3 = (Type) polloi.starveling(lowerBounds);
                            if (type3 == null) {
                                Type[] upperBounds = wildcardType.getUpperBounds();
                                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                                type2 = (Type) polloi.creditor(upperBounds);
                            } else {
                                type2 = type3;
                            }
                        }
                        Intrinsics.beachfront(type2);
                        return type2;
                    }
                });
                int i3 = attabal.f29542attabal[timberyardVar.dern().ordinal()];
                if (i3 == 1) {
                    kTypeProjectionWireman = KTypeProjection.INSTANCE.wireman(kTypeImpl3);
                } else if (i3 == 2) {
                    kTypeProjectionWireman = KTypeProjection.INSTANCE.attabal(kTypeImpl3);
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kTypeProjectionWireman = KTypeProjection.INSTANCE.saneness(kTypeImpl3);
                }
            }
            arrayList.add(kTypeProjectionWireman);
            i = i2;
        }
        return arrayList;
    }
}
