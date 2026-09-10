package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import byname.dern;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.jvm.wireman;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.load.java.graveside;
import p002kotlin.reflect.jvm.internal.impl.types.checker.kowloon;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class formularize {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f30640attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final saneness f30641saneness;

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f30642attabal;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30642attabal = iArr;
        }
    }

    static {
        dern ENHANCED_NULLABILITY_ANNOTATION = graveside.f30423dovishness;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f30640attabal = new saneness(ENHANCED_NULLABILITY_ANNOTATION);
        dern ENHANCED_MUTABILITY_ANNOTATION = graveside.f30425gintrap;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f30641saneness = new saneness(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final beachfront beachfront(beachfront beachfrontVar, wireman wiremanVar, TypeComponentPosition typeComponentPosition) {
        wireman wiremanVar2 = wireman.f29882attabal;
        if (!cutely.attabal(typeComponentPosition) || !(beachfrontVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman)) {
            return null;
        }
        if (wiremanVar.dern() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar3 = (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVar;
            if (wiremanVar2.dern(wiremanVar3)) {
                return wiremanVar2.attabal(wiremanVar3);
            }
        }
        if (wiremanVar.dern() == MutabilityQualifier.MUTABLE && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar4 = (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVar;
            if (wiremanVar2.wireman(wiremanVar4)) {
                return wiremanVar2.saneness(wiremanVar4);
            }
        }
        return null;
    }

    public static final marial competently() {
        return f30640attabal;
    }

    public static final Boolean impromptu(wireman wiremanVar, TypeComponentPosition typeComponentPosition) {
        if (!cutely.attabal(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier nullabilityQualifierWireman = wiremanVar.wireman();
        int i = nullabilityQualifierWireman == null ? -1 : attabal.f30642attabal[nullabilityQualifierWireman.ordinal()];
        if (i == 1) {
            return Boolean.TRUE;
        }
        if (i != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final marial marial(List<? extends marial> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new CompositeAnnotations((List<? extends marial>) CollectionsKt.molet(list)) : (marial) CollectionsKt.herdbook(list);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    public static final boolean taiyuan(oilcan oilcanVar) {
        Intrinsics.checkNotNullParameter(oilcanVar, "<this>");
        return impassible.dern(kowloon.f31733attabal, oilcanVar);
    }
}
