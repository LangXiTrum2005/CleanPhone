package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import iaido.wireman;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class triweekly implements impassible<formularize> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final triweekly f30804attabal = new triweekly();

    /* JADX INFO: compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f30805attabal;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f30805attabal = iArr;
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.impassible
    /* JADX INFO: renamed from: apical, reason: merged with bridge method [inline-methods] */
    public formularize beachfront() {
        return marial("java/lang/Class");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.impassible
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public formularize saneness(formularize possiblyPrimitiveType) {
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        if (!(possiblyPrimitiveType instanceof formularize.wireman)) {
            return possiblyPrimitiveType;
        }
        formularize.wireman wiremanVar = (formularize.wireman) possiblyPrimitiveType;
        if (wiremanVar.taiyuan() == null) {
            return possiblyPrimitiveType;
        }
        String strBeachfront = wireman.dern(wiremanVar.taiyuan().getWrapperFqName()).beachfront();
        Intrinsics.checkNotNullExpressionValue(strBeachfront, "getInternalName(...)");
        return marial(strBeachfront);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.impassible
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public formularize dern(PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        switch (attabal.f30805attabal[primitiveType.ordinal()]) {
            case 1:
                return formularize.f30743attabal.attabal();
            case 2:
                return formularize.f30743attabal.dern();
            case 3:
                return formularize.f30743attabal.saneness();
            case 4:
                return formularize.f30743attabal.impromptu();
            case 5:
                return formularize.f30743attabal.beachfront();
            case 6:
                return formularize.f30743attabal.marial();
            case 7:
                return formularize.f30743attabal.competently();
            case 8:
                return formularize.f30743attabal.wireman();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.impassible
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public String wireman(formularize type) {
        String desc;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof formularize.attabal) {
            return '[' + wireman(((formularize.attabal) type).taiyuan());
        }
        if (type instanceof formularize.wireman) {
            JvmPrimitiveType jvmPrimitiveTypeTaiyuan = ((formularize.wireman) type).taiyuan();
            return (jvmPrimitiveTypeTaiyuan == null || (desc = jvmPrimitiveTypeTaiyuan.getDesc()) == null) ? "V" : desc;
        }
        if (!(type instanceof formularize.dern)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((formularize.dern) type).taiyuan() + ';';
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.impassible
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public formularize attabal(String representation) {
        JvmPrimitiveType jvmPrimitiveType;
        Intrinsics.checkNotNullParameter(representation, "representation");
        representation.length();
        char cCharAt = representation.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new formularize.wireman(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new formularize.wireman(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return new formularize.attabal(attabal(strSubstring));
        }
        if (cCharAt == 'L') {
            StringsKt.permissivist(representation, ';', false, 2, null);
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return new formularize.dern(strSubstring2);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.load.kotlin.impassible
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public formularize.dern marial(String internalName) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        return new formularize.dern(internalName);
    }
}
