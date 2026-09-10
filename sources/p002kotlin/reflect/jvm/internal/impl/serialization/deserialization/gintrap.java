package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: ProtoEnumFlags.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class gintrap {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final gintrap f31577attabal = new gintrap();

    /* JADX INFO: compiled from: ProtoEnumFlags.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31578attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final /* synthetic */ int[] f31579beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final /* synthetic */ int[] f31580competently;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final /* synthetic */ int[] f31581dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final /* synthetic */ int[] f31582impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final /* synthetic */ int[] f31583marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f31584saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final /* synthetic */ int[] f31585wireman;

        static {
            int[] iArr = new int[ProtoBuf$Modality.values().length];
            try {
                iArr[ProtoBuf$Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf$Modality.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf$Modality.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf$Modality.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31578attabal = iArr;
            int[] iArr2 = new int[Modality.values().length];
            try {
                iArr2[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Modality.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Modality.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Modality.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f31584saneness = iArr2;
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
            f31581dern = iArr3;
            int[] iArr4 = new int[ProtoBuf$Class.Kind.values().length];
            try {
                iArr4[ProtoBuf$Class.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ProtoBuf$Class.Kind.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ProtoBuf$Class.Kind.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ProtoBuf$Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ProtoBuf$Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[ProtoBuf$Class.Kind.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[ProtoBuf$Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f31585wireman = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            try {
                iArr5[ClassKind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[ClassKind.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[ClassKind.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[ClassKind.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[ClassKind.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f31583marial = iArr5;
            int[] iArr6 = new int[ProtoBuf$TypeParameter.Variance.values().length];
            try {
                iArr6[ProtoBuf$TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[ProtoBuf$TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[ProtoBuf$TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f31579beachfront = iArr6;
            int[] iArr7 = new int[ProtoBuf$Type.Argument.Projection.values().length];
            try {
                iArr7[ProtoBuf$Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[ProtoBuf$Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[ProtoBuf$Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[ProtoBuf$Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f31580competently = iArr7;
            int[] iArr8 = new int[Variance.values().length];
            try {
                iArr8[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[Variance.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[Variance.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f31582impromptu = iArr8;
        }
    }

    public final ClassKind attabal(ProtoBuf$Class.Kind kind) {
        switch (kind == null ? -1 : attabal.f31585wireman[kind.ordinal()]) {
            case 1:
                return ClassKind.CLASS;
            case 2:
                return ClassKind.INTERFACE;
            case 3:
                return ClassKind.ENUM_CLASS;
            case 4:
                return ClassKind.ENUM_ENTRY;
            case 5:
                return ClassKind.ANNOTATION_CLASS;
            case 6:
            case 7:
                return ClassKind.OBJECT;
            default:
                return ClassKind.CLASS;
        }
    }

    public final Variance dern(ProtoBuf$Type.Argument.Projection projection) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        int i = attabal.f31580competently[projection.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    public final Modality saneness(ProtoBuf$Modality protoBuf$Modality) {
        int i = protoBuf$Modality == null ? -1 : attabal.f31578attabal[protoBuf$Modality.ordinal()];
        if (i == 1) {
            return Modality.FINAL;
        }
        if (i == 2) {
            return Modality.OPEN;
        }
        if (i != 3) {
            return i != 4 ? Modality.FINAL : Modality.SEALED;
        }
        return Modality.ABSTRACT;
    }

    public final Variance wireman(ProtoBuf$TypeParameter.Variance variance) {
        Intrinsics.checkNotNullParameter(variance, "variance");
        int i = attabal.f31579beachfront[variance.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
