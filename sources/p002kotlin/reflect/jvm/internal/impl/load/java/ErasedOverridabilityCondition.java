package p002kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.hydrovane;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p002kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: ErasedOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* JADX INFO: compiled from: ErasedOverridabilityCondition.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f30286attabal;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30286attabal = iArr;
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract attabal() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal superDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal subDescriptor, wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
            List<clubfoot> typeParameters = javaMethodDescriptor.getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoGintrap = OverridingUtil.gintrap(superDescriptor, subDescriptor);
                if ((overrideCompatibilityInfoGintrap != null ? overrideCompatibilityInfoGintrap.dern() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<cultivated> listBeachfront = javaMethodDescriptor.beachfront();
                Intrinsics.checkNotNullExpressionValue(listBeachfront, "getValueParameters(...)");
                Sequence sequenceRestrictive = SequencesKt___SequencesKt.restrictive(CollectionsKt.clubfoot(listBeachfront), new Function1<cultivated, oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$isOverridable$signatureTypes$1
                    @Override // p002kotlin.jvm.functions.Function1
                    public final oilcan invoke(cultivated cultivatedVar) {
                        return cultivatedVar.getType();
                    }
                });
                oilcan returnType = javaMethodDescriptor.getReturnType();
                Intrinsics.beachfront(returnType);
                Sequence sequenceSeminary = SequencesKt___SequencesKt.seminary(sequenceRestrictive, returnType);
                starveling starvelingVarPolder = javaMethodDescriptor.polder();
                for (oilcan oilcanVar : SequencesKt___SequencesKt.polder(sequenceSeminary, adultoid.arytenoidectomy(starvelingVarPolder != null ? starvelingVarPolder.getType() : null))) {
                    if (!oilcanVar.dhss().isEmpty() && !(oilcanVar.homozygous() instanceof RawTypeImpl)) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                }
                p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarDern = superDescriptor.dern(new RawSubstitution(null, 1, null).dern());
                if (attabalVarDern == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (attabalVarDern instanceof hydrovane) {
                    hydrovane hydrovaneVar = (hydrovane) attabalVarDern;
                    List<clubfoot> typeParameters2 = hydrovaneVar.getTypeParameters();
                    Intrinsics.checkNotNullExpressionValue(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        attabalVarDern = hydrovaneVar.monoploid().kowloon(adultoid.formularize()).build();
                        Intrinsics.beachfront(attabalVarDern);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result resultDern = OverridingUtil.f31285beachfront.sealless(attabalVarDern, subDescriptor, false).dern();
                Intrinsics.checkNotNullExpressionValue(resultDern, "getResult(...)");
                return attabal.f30286attabal[resultDern.ordinal()] == 1 ? ExternalOverridabilityCondition.Result.OVERRIDABLE : ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
