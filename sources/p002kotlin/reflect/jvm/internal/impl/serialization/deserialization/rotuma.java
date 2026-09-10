package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;

/* JADX INFO: compiled from: ProtoEnumFlagsUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class rotuma {

    /* JADX INFO: compiled from: ProtoEnumFlagsUtils.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31617attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final /* synthetic */ int[] f31618dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f31619saneness;

        static {
            int[] iArr = new int[ProtoBuf$MemberKind.values().length];
            try {
                iArr[ProtoBuf$MemberKind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf$MemberKind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf$MemberKind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf$MemberKind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31617attabal = iArr;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            try {
                iArr2[CallableMemberDescriptor.Kind.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CallableMemberDescriptor.Kind.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f31619saneness = iArr2;
            int[] iArr3 = new int[ProtoBuf$Visibility.values().length];
            try {
                iArr3[ProtoBuf$Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf$Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf$Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf$Visibility.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf$Visibility.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf$Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f31618dern = iArr3;
        }
    }

    public static final molybdenite attabal(gintrap gintrapVar, ProtoBuf$Visibility protoBuf$Visibility) {
        Intrinsics.checkNotNullParameter(gintrapVar, "<this>");
        switch (protoBuf$Visibility == null ? -1 : attabal.f31618dern[protoBuf$Visibility.ordinal()]) {
            case 1:
                molybdenite INTERNAL = polloi.f30217wireman;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                molybdenite PRIVATE = polloi.f30203attabal;
                Intrinsics.checkNotNullExpressionValue(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                molybdenite PRIVATE_TO_THIS = polloi.f30214saneness;
                Intrinsics.checkNotNullExpressionValue(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                molybdenite PROTECTED = polloi.f30207dern;
                Intrinsics.checkNotNullExpressionValue(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                molybdenite PUBLIC = polloi.f30212marial;
                Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                molybdenite LOCAL = polloi.f30204beachfront;
                Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
                return LOCAL;
            default:
                molybdenite PRIVATE2 = polloi.f30203attabal;
                Intrinsics.checkNotNullExpressionValue(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    public static final CallableMemberDescriptor.Kind saneness(gintrap gintrapVar, ProtoBuf$MemberKind protoBuf$MemberKind) {
        Intrinsics.checkNotNullParameter(gintrapVar, "<this>");
        int i = protoBuf$MemberKind == null ? -1 : attabal.f31617attabal[protoBuf$MemberKind.ordinal()];
        if (i == 1) {
            return CallableMemberDescriptor.Kind.DECLARATION;
        }
        if (i == 2) {
            return CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
        }
        if (i != 3) {
            return i != 4 ? CallableMemberDescriptor.Kind.DECLARATION : CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return CallableMemberDescriptor.Kind.DELEGATION;
    }
}
