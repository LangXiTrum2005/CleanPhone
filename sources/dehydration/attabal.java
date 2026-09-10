package dehydration;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kurbash.arytenoidectomy;
import kurbash.beachfront;
import p002kotlin.Metadata;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.KTypeProjection;
import p002kotlin.reflect.KVariance;
import p002kotlin.reflect.jvm.internal.KTypeImpl;
import p002kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impromptu;
import presbytery.cutely;

/* JADX INFO: compiled from: KClassifiers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkurbash/beachfront;", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "", "nullable", "", "annotations", "Lkurbash/arytenoidectomy;", "saneness", "(Lkurbash/beachfront;Ljava/util/List;ZLjava/util/List;)Lkurbash/arytenoidectomy;", "Lkotlin/reflect/jvm/internal/impl/types/overspeculate;", "attributes", "Lkotlin/reflect/jvm/internal/impl/types/permissivist;", "typeConstructor", "Lkotlin/reflect/jvm/internal/impl/types/merc;", "attabal", "(Lkotlin/reflect/jvm/internal/impl/types/overspeculate;Lkotlin/reflect/jvm/internal/impl/types/permissivist;Ljava/util/List;Z)Lkotlin/reflect/jvm/internal/impl/types/merc;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: dehydration.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: KClassifiers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C0586attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f25161attabal;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25161attabal = iArr;
        }
    }

    public static final merc attabal(overspeculate overspeculateVar, permissivist permissivistVar, List<KTypeProjection> list, boolean z) {
        cutely starProjectionImpl;
        List<clubfoot> parameters = permissivistVar.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<KTypeProjection> list2 = list;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                adultoid.dovishness();
            }
            KTypeProjection kTypeProjection = (KTypeProjection) obj;
            KTypeImpl kTypeImpl = (KTypeImpl) kTypeProjection.getType();
            oilcan type = kTypeImpl != null ? kTypeImpl.getType() : null;
            KVariance kVarianceWireman = kTypeProjection.wireman();
            int i3 = kVarianceWireman == null ? -1 : C0586attabal.f25161attabal[kVarianceWireman.ordinal()];
            if (i3 == -1) {
                clubfoot clubfootVar = parameters.get(i);
                Intrinsics.checkNotNullExpressionValue(clubfootVar, "get(...)");
                starProjectionImpl = new StarProjectionImpl(clubfootVar);
            } else if (i3 == 1) {
                Variance variance = Variance.INVARIANT;
                Intrinsics.beachfront(type);
                starProjectionImpl = new treadless(variance, type);
            } else if (i3 == 2) {
                Variance variance2 = Variance.IN_VARIANCE;
                Intrinsics.beachfront(type);
                starProjectionImpl = new treadless(variance2, type);
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Variance variance3 = Variance.OUT_VARIANCE;
                Intrinsics.beachfront(type);
                starProjectionImpl = new treadless(variance3, type);
            }
            arrayList.add(starProjectionImpl);
            i = i2;
        }
        return KotlinTypeFactory.formularize(overspeculateVar, permissivistVar, arrayList, z, null, 16, null);
    }

    public static final arytenoidectomy saneness(beachfront beachfrontVar, List<KTypeProjection> arguments, boolean z, List<? extends Annotation> annotations) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront descriptor;
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        impromptu impromptuVar = beachfrontVar instanceof impromptu ? (impromptu) beachfrontVar : null;
        if (impromptuVar == null || (descriptor = impromptuVar.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + beachfrontVar + " (" + beachfrontVar.getClass() + ')');
        }
        permissivist permissivistVarImpromptu = descriptor.impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        List<clubfoot> parameters = permissivistVarImpromptu.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        if (parameters.size() == arguments.size()) {
            return new KTypeImpl(attabal(annotations.isEmpty() ? overspeculate.f31797arytenoidectomy.taiyuan() : overspeculate.f31797arytenoidectomy.taiyuan(), permissivistVarImpromptu, arguments, z), null, 2, null);
        }
        throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + arguments.size() + " were provided.");
    }
}
