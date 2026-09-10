package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class ProtoEnumFlags {

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44434b;

        static {
            int[] iArr = new int[ProtoBuf.Modality.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44433a = iArr;
            int[] iArr2 = new int[Modality.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[1] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[ProtoBuf.Class.Kind.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[5] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[6] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f44434b = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[5] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr6 = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[2] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr7 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[2] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[3] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr8 = new int[Variance.values().length];
            try {
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[2] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[0] = 3;
            } catch (NoSuchFieldError unused37) {
            }
        }
    }

    public static Modality a(ProtoBuf.Modality modality) {
        int i2 = modality == null ? -1 : WhenMappings.f44433a[modality.ordinal()];
        Modality modality2 = Modality.X;
        if (i2 != 1) {
            if (i2 == 2) {
                return Modality.Z;
            }
            if (i2 == 3) {
                return Modality.e0;
            }
            if (i2 == 4) {
                return Modality.f43574Y;
            }
        }
        return modality2;
    }
}
