package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* JADX INFO: loaded from: classes7.dex */
public class Flags {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final BooleanFlagField f44102A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final BooleanFlagField f44103B;
    public static final BooleanFlagField C;
    public static final BooleanFlagField D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final BooleanFlagField f44104E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final BooleanFlagField f44105F;
    public static final BooleanFlagField G;
    public static final BooleanFlagField H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final BooleanFlagField f44106I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final BooleanFlagField f44107J;
    public static final BooleanFlagField K;
    public static final BooleanFlagField L;
    public static final BooleanFlagField M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BooleanFlagField f44108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BooleanFlagField f44109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BooleanFlagField f44110c;
    public static final FlagField d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final FlagField f44111e;
    public static final FlagField f;
    public static final BooleanFlagField g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BooleanFlagField f44112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final BooleanFlagField f44113i;
    public static final BooleanFlagField j;
    public static final BooleanFlagField k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final BooleanFlagField f44114l;
    public static final BooleanFlagField m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final BooleanFlagField f44115n;
    public static final FlagField o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final BooleanFlagField f44116p;
    public static final BooleanFlagField q;
    public static final BooleanFlagField r;
    public static final BooleanFlagField s;
    public static final BooleanFlagField t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final BooleanFlagField f44117u;
    public static final BooleanFlagField v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final BooleanFlagField f44118w;
    public static final BooleanFlagField x;
    public static final BooleanFlagField y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final BooleanFlagField f44119z;

    public static class BooleanFlagField extends FlagField<Boolean> {
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final /* bridge */ /* synthetic */ Object c(int i2) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final /* bridge */ /* synthetic */ int d(Object obj) {
            throw null;
        }

        public final Boolean e(int i2) {
            return Boolean.valueOf((i2 & (1 << this.f44121a)) != 0);
        }
    }

    public static class EnumLiteFlagField<E extends Internal.EnumLite> extends FlagField<E> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Internal.EnumLite[] f44120c;

        /* JADX WARN: Illegal instructions before constructor call */
        public EnumLiteFlagField(int i2, Internal.EnumLite[] enumLiteArr) {
            if (enumLiteArr == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            }
            int i3 = 1;
            int length = enumLiteArr.length - 1;
            if (length != 0) {
                for (int i4 = 31; i4 >= 0; i4--) {
                    if (((1 << i4) & length) != 0) {
                        i3 = 1 + i4;
                    }
                }
                throw new IllegalStateException("Empty enum: " + enumLiteArr.getClass());
            }
            super(i2, i3);
            this.f44120c = enumLiteArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final Object c(int i2) {
            int i3 = (1 << this.f44122b) - 1;
            int i4 = this.f44121a;
            int i5 = (i2 & (i3 << i4)) >> i4;
            for (Internal.EnumLite enumLite : this.f44120c) {
                if (enumLite.getNumber() == i5) {
                    return enumLite;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public final int d(Object obj) {
            return ((Internal.EnumLite) obj).getNumber() << this.f44121a;
        }
    }

    public static abstract class FlagField<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44122b;

        public FlagField(int i2, int i3) {
            this.f44121a = i2;
            this.f44122b = i3;
        }

        public static BooleanFlagField a(FlagField flagField) {
            return new BooleanFlagField(flagField.f44121a + flagField.f44122b, 1);
        }

        public static BooleanFlagField b() {
            return new BooleanFlagField(0, 1);
        }

        public abstract Object c(int i2);

        public abstract int d(Object obj);
    }

    static {
        BooleanFlagField booleanFlagFieldB = FlagField.b();
        f44108a = booleanFlagFieldB;
        f44109b = FlagField.a(booleanFlagFieldB);
        BooleanFlagField booleanFlagFieldB2 = FlagField.b();
        f44110c = booleanFlagFieldB2;
        ProtoBuf.Visibility[] visibilityArrValues = ProtoBuf.Visibility.values();
        int i2 = booleanFlagFieldB2.f44121a + booleanFlagFieldB2.f44122b;
        EnumLiteFlagField enumLiteFlagField = new EnumLiteFlagField(i2, visibilityArrValues);
        d = enumLiteFlagField;
        ProtoBuf.Modality[] modalityArrValues = ProtoBuf.Modality.values();
        int i3 = i2 + enumLiteFlagField.f44122b;
        EnumLiteFlagField enumLiteFlagField2 = new EnumLiteFlagField(i3, modalityArrValues);
        f44111e = enumLiteFlagField2;
        ProtoBuf.Class.Kind[] kindArrValues = ProtoBuf.Class.Kind.values();
        int i4 = enumLiteFlagField2.f44122b;
        EnumLiteFlagField enumLiteFlagField3 = new EnumLiteFlagField(i3 + i4, kindArrValues);
        f = enumLiteFlagField3;
        BooleanFlagField booleanFlagFieldA = FlagField.a(enumLiteFlagField3);
        g = booleanFlagFieldA;
        BooleanFlagField booleanFlagFieldA2 = FlagField.a(booleanFlagFieldA);
        f44112h = booleanFlagFieldA2;
        BooleanFlagField booleanFlagFieldA3 = FlagField.a(booleanFlagFieldA2);
        f44113i = booleanFlagFieldA3;
        BooleanFlagField booleanFlagFieldA4 = FlagField.a(booleanFlagFieldA3);
        j = booleanFlagFieldA4;
        BooleanFlagField booleanFlagFieldA5 = FlagField.a(booleanFlagFieldA4);
        k = booleanFlagFieldA5;
        f44114l = FlagField.a(booleanFlagFieldA5);
        BooleanFlagField booleanFlagFieldA6 = FlagField.a(enumLiteFlagField);
        m = booleanFlagFieldA6;
        f44115n = FlagField.a(booleanFlagFieldA6);
        EnumLiteFlagField enumLiteFlagField4 = new EnumLiteFlagField(i3 + i4, ProtoBuf.MemberKind.values());
        o = enumLiteFlagField4;
        BooleanFlagField booleanFlagFieldA7 = FlagField.a(enumLiteFlagField4);
        f44116p = booleanFlagFieldA7;
        BooleanFlagField booleanFlagFieldA8 = FlagField.a(booleanFlagFieldA7);
        q = booleanFlagFieldA8;
        BooleanFlagField booleanFlagFieldA9 = FlagField.a(booleanFlagFieldA8);
        r = booleanFlagFieldA9;
        BooleanFlagField booleanFlagFieldA10 = FlagField.a(booleanFlagFieldA9);
        s = booleanFlagFieldA10;
        BooleanFlagField booleanFlagFieldA11 = FlagField.a(booleanFlagFieldA10);
        t = booleanFlagFieldA11;
        BooleanFlagField booleanFlagFieldA12 = FlagField.a(booleanFlagFieldA11);
        f44117u = booleanFlagFieldA12;
        BooleanFlagField booleanFlagFieldA13 = FlagField.a(booleanFlagFieldA12);
        v = booleanFlagFieldA13;
        f44118w = FlagField.a(booleanFlagFieldA13);
        BooleanFlagField booleanFlagFieldA14 = FlagField.a(enumLiteFlagField4);
        x = booleanFlagFieldA14;
        BooleanFlagField booleanFlagFieldA15 = FlagField.a(booleanFlagFieldA14);
        y = booleanFlagFieldA15;
        BooleanFlagField booleanFlagFieldA16 = FlagField.a(booleanFlagFieldA15);
        f44119z = booleanFlagFieldA16;
        BooleanFlagField booleanFlagFieldA17 = FlagField.a(booleanFlagFieldA16);
        f44102A = booleanFlagFieldA17;
        BooleanFlagField booleanFlagFieldA18 = FlagField.a(booleanFlagFieldA17);
        f44103B = booleanFlagFieldA18;
        BooleanFlagField booleanFlagFieldA19 = FlagField.a(booleanFlagFieldA18);
        C = booleanFlagFieldA19;
        BooleanFlagField booleanFlagFieldA20 = FlagField.a(booleanFlagFieldA19);
        D = booleanFlagFieldA20;
        BooleanFlagField booleanFlagFieldA21 = FlagField.a(booleanFlagFieldA20);
        f44104E = booleanFlagFieldA21;
        f44105F = FlagField.a(booleanFlagFieldA21);
        BooleanFlagField booleanFlagFieldA22 = FlagField.a(booleanFlagFieldB2);
        G = booleanFlagFieldA22;
        BooleanFlagField booleanFlagFieldA23 = FlagField.a(booleanFlagFieldA22);
        H = booleanFlagFieldA23;
        f44106I = FlagField.a(booleanFlagFieldA23);
        BooleanFlagField booleanFlagFieldA24 = FlagField.a(enumLiteFlagField2);
        f44107J = booleanFlagFieldA24;
        BooleanFlagField booleanFlagFieldA25 = FlagField.a(booleanFlagFieldA24);
        K = booleanFlagFieldA25;
        L = FlagField.a(booleanFlagFieldA25);
        M = FlagField.b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "modality";
        } else if (i2 == 2) {
            objArr[0] = "kind";
        } else if (i2 == 5) {
            objArr[0] = "modality";
        } else if (i2 == 6) {
            objArr[0] = "memberKind";
        } else if (i2 == 8) {
            objArr[0] = "modality";
        } else if (i2 == 9) {
            objArr[0] = "memberKind";
        } else if (i2 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i2) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
