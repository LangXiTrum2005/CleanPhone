package p002kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.merc;
import p002kotlin.reflect.jvm.internal.impl.descriptors.monoploid;
import p002kotlin.reflect.jvm.internal.impl.descriptors.privatdozent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import yeast.formularize;
import yeast.impromptu;

/* JADX INFO: compiled from: KotlinBuiltIns.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class beachfront {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final byname.marial f29645competently = byname.marial.impassible("<built-ins module>");

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ModuleDescriptorImpl f29646attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final formularize f29647beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final impromptu<marial> f29648dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final yeast.beachfront<byname.marial, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman> f29649marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public impromptu<ModuleDescriptorImpl> f29650saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final impromptu<Collection<merc>> f29651wireman;

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class attabal implements Function0<Collection<merc>> {
        public attabal() {
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Collection<merc> invoke() {
            return Arrays.asList(beachfront.this.polloi().hydrovane(competently.f29682preprohormone), beachfront.this.polloi().hydrovane(competently.f29667cuirassed), beachfront.this.polloi().hydrovane(competently.f29686stratoscope), beachfront.this.polloi().hydrovane(competently.f29666cord));
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class dern implements Function1<byname.marial, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman> {
        public dern() {
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman invoke(byname.marial marialVar) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarMarial = beachfront.this.molybdenite().marial(marialVar, NoLookupLocation.FROM_BUILTINS);
            if (beachfrontVarMarial == null) {
                throw new AssertionError("Built-in class " + competently.f29682preprohormone.dern(marialVar) + " is not found");
            }
            if (beachfrontVarMarial instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) {
                return (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarMarial;
            }
            throw new AssertionError("Must be a class descriptor " + marialVar + ", but was " + beachfrontVarMarial);
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public static class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Map<PrimitiveType, p002kotlin.reflect.jvm.internal.impl.types.merc> f29654attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final Map<p002kotlin.reflect.jvm.internal.impl.types.merc, p002kotlin.reflect.jvm.internal.impl.types.merc> f29655dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Map<oilcan, p002kotlin.reflect.jvm.internal.impl.types.merc> f29656saneness;

        public /* synthetic */ marial(Map map, Map map2, Map map3, attabal attabalVar) {
            this(map, map2, map3);
        }

        public static /* synthetic */ void attabal(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public marial(Map<PrimitiveType, p002kotlin.reflect.jvm.internal.impl.types.merc> map, Map<oilcan, p002kotlin.reflect.jvm.internal.impl.types.merc> map2, Map<p002kotlin.reflect.jvm.internal.impl.types.merc, p002kotlin.reflect.jvm.internal.impl.types.merc> map3) {
            if (map == null) {
                attabal(0);
            }
            if (map2 == null) {
                attabal(1);
            }
            if (map3 == null) {
                attabal(2);
            }
            this.f29654attabal = map;
            this.f29656saneness = map2;
            this.f29655dern = map3;
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class saneness implements Function0<marial> {
        public saneness() {
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public marial invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                p002kotlin.reflect.jvm.internal.impl.types.merc mercVarMonoploid = beachfront.this.monoploid(primitiveType.getTypeName().dern());
                p002kotlin.reflect.jvm.internal.impl.types.merc mercVarMonoploid2 = beachfront.this.monoploid(primitiveType.getArrayTypeName().dern());
                enumMap.put(primitiveType, mercVarMonoploid2);
                map.put(mercVarMonoploid, mercVarMonoploid2);
                map2.put(mercVarMonoploid2, mercVarMonoploid);
            }
            return new marial(enumMap, map, map2, null);
        }
    }

    /* JADX INFO: compiled from: KotlinBuiltIns.java */
    public class wireman implements Function0<Void> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ ModuleDescriptorImpl f29659kowloon;

        public wireman(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f29659kowloon = moduleDescriptorImpl;
        }

        @Override // p002kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Void invoke() {
            if (beachfront.this.f29646attabal == null) {
                beachfront.this.f29646attabal = this.f29659kowloon;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + beachfront.this.f29646attabal + " (attempting to reset to " + this.f29659kowloon + ")");
        }
    }

    public beachfront(formularize formularizeVar) {
        if (formularizeVar == null) {
            attabal(0);
        }
        this.f29647beachfront = formularizeVar;
        this.f29651wireman = formularizeVar.dern(new attabal());
        this.f29648dern = formularizeVar.dern(new saneness());
        this.f29649marial = formularizeVar.taiyuan(new dern());
    }

    public static boolean achondroplasia(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(132);
        }
        return nosophobia(oilcanVar, competently.attabal.f29777vesuvio.cutely());
    }

    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 73:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 77:
            case 78:
            case 90:
            case 97:
            case 104:
            case 108:
            case 109:
            case Opcodes.D2F /* 144 */:
            case Opcodes.I2S /* 147 */:
            case Opcodes.LCMP /* 148 */:
            case Opcodes.FCMPG /* 150 */:
            case 158:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case 160:
            case Opcodes.IF_ICMPLT /* 161 */:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 99:
            case 101:
            case 103:
            case 105:
            case 107:
            case 136:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 89:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 98:
            case 100:
            case 106:
            case 110:
            case 111:
            case 112:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 137:
            case 138:
            case Opcodes.F2I /* 139 */:
            case Opcodes.F2L /* 140 */:
            case Opcodes.F2D /* 141 */:
            case Opcodes.D2I /* 142 */:
            case Opcodes.D2L /* 143 */:
            case Opcodes.I2B /* 145 */:
            case Opcodes.I2C /* 146 */:
            case Opcodes.FCMPL /* 149 */:
            case Opcodes.DCMPL /* 151 */:
            case Opcodes.DCMPG /* 152 */:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case Opcodes.IF_ICMPGT /* 163 */:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
                objArr[0] = "arrayType";
                break;
            case 72:
                objArr[0] = "notNullArrayType";
                break;
            case 74:
                objArr[0] = "primitiveType";
                break;
            case 76:
                objArr[0] = "kotlinType";
                break;
            case 79:
            case 83:
                objArr[0] = "projectionType";
                break;
            case 80:
            case 84:
            case 86:
                objArr[0] = "argument";
                break;
            case 81:
                objArr[0] = "annotations";
                break;
            case 102:
                objArr[0] = "typeConstructor";
                break;
            case 113:
                objArr[0] = "classDescriptor";
                break;
            case Opcodes.IF_ICMPGE /* 162 */:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKType";
                break;
            case 23:
                objArr[1] = "getKCallable";
                break;
            case 24:
                objArr[1] = "getKProperty";
                break;
            case 25:
                objArr[1] = "getKProperty0";
                break;
            case 26:
                objArr[1] = "getKProperty1";
                break;
            case 27:
                objArr[1] = "getKProperty2";
                break;
            case 28:
                objArr[1] = "getKMutableProperty0";
                break;
            case 29:
                objArr[1] = "getKMutableProperty1";
                break;
            case 30:
                objArr[1] = "getKMutableProperty2";
                break;
            case 31:
                objArr[1] = "getIterator";
                break;
            case 32:
                objArr[1] = "getIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterable";
                break;
            case 34:
                objArr[1] = "getMutableIterator";
                break;
            case 35:
                objArr[1] = "getCollection";
                break;
            case 36:
                objArr[1] = "getMutableCollection";
                break;
            case 37:
                objArr[1] = "getList";
                break;
            case 38:
                objArr[1] = "getMutableList";
                break;
            case 39:
                objArr[1] = "getSet";
                break;
            case 40:
                objArr[1] = "getMutableSet";
                break;
            case 41:
                objArr[1] = "getMap";
                break;
            case 42:
                objArr[1] = "getMutableMap";
                break;
            case 43:
                objArr[1] = "getMapEntry";
                break;
            case 44:
                objArr[1] = "getMutableMapEntry";
                break;
            case 45:
                objArr[1] = "getListIterator";
                break;
            case 46:
                objArr[1] = "getMutableListIterator";
                break;
            case 48:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 49:
                objArr[1] = "getNothingType";
                break;
            case 50:
                objArr[1] = "getNullableNothingType";
                break;
            case 51:
                objArr[1] = "getAnyType";
                break;
            case 52:
                objArr[1] = "getNullableAnyType";
                break;
            case 53:
                objArr[1] = "getDefaultBound";
                break;
            case 55:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 56:
                objArr[1] = "getNumberType";
                break;
            case 57:
                objArr[1] = "getByteType";
                break;
            case 58:
                objArr[1] = "getShortType";
                break;
            case 59:
                objArr[1] = "getIntType";
                break;
            case 60:
                objArr[1] = "getLongType";
                break;
            case 61:
                objArr[1] = "getFloatType";
                break;
            case 62:
                objArr[1] = "getDoubleType";
                break;
            case 63:
                objArr[1] = "getCharType";
                break;
            case 64:
                objArr[1] = "getBooleanType";
                break;
            case 65:
                objArr[1] = "getUnitType";
                break;
            case 66:
                objArr[1] = "getStringType";
                break;
            case 67:
                objArr[1] = "getIterableType";
                break;
            case 69:
            case 70:
            case 71:
                objArr[1] = "getArrayElementType";
                break;
            case 75:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 82:
            case 85:
                objArr[1] = "getArrayType";
                break;
            case 87:
                objArr[1] = "getEnumType";
                break;
            case 88:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 72:
            case 73:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 77:
            case 94:
                objArr[2] = "getPrimitiveType";
                break;
            case 78:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
                objArr[2] = "getArrayType";
                break;
            case 86:
                objArr[2] = "getEnumType";
                break;
            case 89:
                objArr[2] = "isArray";
                break;
            case 90:
            case 91:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 92:
                objArr[2] = "isPrimitiveArray";
                break;
            case 93:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 95:
                objArr[2] = "isPrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 97:
                objArr[2] = "isPrimitiveClass";
                break;
            case 98:
            case 99:
            case 100:
            case 101:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 104:
            case 105:
                objArr[2] = "classFqNameEquals";
                break;
            case 106:
            case 107:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 108:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 109:
            case 110:
                objArr[2] = "isAny";
                break;
            case 111:
            case 113:
                objArr[2] = "isBoolean";
                break;
            case 112:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 114:
                objArr[2] = "isNumber";
                break;
            case 115:
                objArr[2] = "isChar";
                break;
            case 116:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 117:
                objArr[2] = "isInt";
                break;
            case 118:
                objArr[2] = "isByte";
                break;
            case 119:
                objArr[2] = "isLong";
                break;
            case 120:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 121:
                objArr[2] = "isShort";
                break;
            case 122:
                objArr[2] = "isFloat";
                break;
            case 123:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 124:
                objArr[2] = "isDouble";
                break;
            case 125:
                objArr[2] = "isUByte";
                break;
            case 126:
                objArr[2] = "isUShort";
                break;
            case 127:
                objArr[2] = "isUInt";
                break;
            case 128:
                objArr[2] = "isULong";
                break;
            case 129:
                objArr[2] = "isUByteArray";
                break;
            case 130:
                objArr[2] = "isUShortArray";
                break;
            case 131:
                objArr[2] = "isUIntArray";
                break;
            case 132:
                objArr[2] = "isULongArray";
                break;
            case 133:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 134:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 135:
            case 136:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 137:
                objArr[2] = "isNothing";
                break;
            case 138:
                objArr[2] = "isNullableNothing";
                break;
            case Opcodes.F2I /* 139 */:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case Opcodes.F2L /* 140 */:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case Opcodes.F2D /* 141 */:
                objArr[2] = "isNullableAny";
                break;
            case Opcodes.D2I /* 142 */:
                objArr[2] = "isDefaultBound";
                break;
            case Opcodes.D2L /* 143 */:
                objArr[2] = "isUnit";
                break;
            case Opcodes.D2F /* 144 */:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case Opcodes.I2B /* 145 */:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case Opcodes.I2C /* 146 */:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case Opcodes.I2S /* 147 */:
                objArr[2] = "isMemberOfAny";
                break;
            case Opcodes.LCMP /* 148 */:
            case Opcodes.FCMPL /* 149 */:
                objArr[2] = "isEnum";
                break;
            case Opcodes.FCMPG /* 150 */:
            case Opcodes.DCMPL /* 151 */:
                objArr[2] = "isComparable";
                break;
            case Opcodes.DCMPG /* 152 */:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 153:
                objArr[2] = "isListOrNullableList";
                break;
            case 154:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 155:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 156:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 157:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 158:
                objArr[2] = "isThrowable";
                break;
            case Opcodes.IF_ICMPEQ /* 159 */:
                objArr[2] = "isKClass";
                break;
            case 160:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case Opcodes.IF_ICMPLT /* 161 */:
                objArr[2] = "isCloneable";
                break;
            case Opcodes.IF_ICMPGE /* 162 */:
                objArr[2] = "isDeprecated";
                break;
            case Opcodes.IF_ICMPGT /* 163 */:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 75:
            case 82:
            case 85:
            case 87:
            case 88:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 47:
            case 54:
            case 68:
            case 72:
            case 73:
            case 74:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 83:
            case 84:
            case 86:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean claque(apical apicalVar) {
        if (apicalVar == null) {
            attabal(10);
        }
        while (apicalVar != null) {
            if (apicalVar instanceof sealless) {
                return ((sealless) apicalVar).marial().taiyuan(competently.f29683rotuma);
            }
            apicalVar = apicalVar.saneness();
        }
        return false;
    }

    public static boolean coffeecake(apical apicalVar) {
        if (apicalVar == null) {
            attabal(9);
        }
        return p002kotlin.reflect.jvm.internal.impl.resolve.marial.polloi(apicalVar, p002kotlin.reflect.jvm.internal.impl.builtins.attabal.class, false) != null;
    }

    public static boolean coi(oilcan oilcanVar, byname.wireman wiremanVar) {
        if (oilcanVar == null) {
            attabal(106);
        }
        if (wiremanVar == null) {
            attabal(107);
        }
        return !oilcanVar.mastfed() && lerp(oilcanVar, wiremanVar);
    }

    public static PrimitiveType creditor(apical apicalVar) {
        if (apicalVar == null) {
            attabal(78);
        }
        if (competently.attabal.f29735mastfed.contains(apicalVar.getName())) {
            return competently.attabal.f29722homozygous.get(p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(apicalVar));
        }
        return null;
    }

    public static oilcan cuirassed(oilcan oilcanVar, trm trmVar) {
        byname.saneness sanenessVarApical;
        byname.saneness sanenessVarAttabal;
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarAttabal;
        if (oilcanVar == null) {
            attabal(72);
        }
        if (trmVar == null) {
            attabal(73);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman == null) {
            return null;
        }
        taiyuan taiyuanVar = taiyuan.f29885attabal;
        if (!taiyuanVar.saneness(beachfrontVarWireman.getName()) || (sanenessVarApical = DescriptorUtilsKt.apical(beachfrontVarWireman)) == null || (sanenessVarAttabal = taiyuanVar.attabal(sanenessVarApical)) == null || (wiremanVarAttabal = FindClassInModuleKt.attabal(trmVar, sanenessVarAttabal)) == null) {
            return null;
        }
        return wiremanVarAttabal.impassible();
    }

    public static boolean cultivated(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(109);
        }
        return marial(wiremanVar, competently.attabal.f29758saneness);
    }

    public static boolean czestochowa(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(137);
        }
        return sensatory(oilcanVar) && !nosophobia.formularize(oilcanVar);
    }

    public static boolean empress(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(Opcodes.IF_ICMPEQ);
        }
        return marial(wiremanVar, competently.attabal.f29733lotta);
    }

    public static boolean gusty(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(96);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        return (beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) && wostteth((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman);
    }

    public static boolean hardpan(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(Opcodes.D2L);
        }
        return coi(oilcanVar, competently.attabal.f29698beachfront);
    }

    public static boolean herdbook(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(133);
        }
        return monroe(oilcanVar) || unconsolidated(oilcanVar) || julian(oilcanVar) || achondroplasia(oilcanVar);
    }

    public static boolean igbo(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(95);
        }
        return !oilcanVar.mastfed() && gusty(oilcanVar);
    }

    public static boolean itchy(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(111);
        }
        return nosophobia(oilcanVar, competently.attabal.f29708cutely);
    }

    public static boolean julian(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(131);
        }
        return nosophobia(oilcanVar, competently.attabal.f29712dhss.cutely());
    }

    public static boolean lerp(oilcan oilcanVar, byname.wireman wiremanVar) {
        if (oilcanVar == null) {
            attabal(98);
        }
        if (wiremanVar == null) {
            attabal(99);
        }
        return lightstruck(oilcanVar.setterwort(), wiremanVar);
    }

    public static boolean lightstruck(permissivist permissivistVar, byname.wireman wiremanVar) {
        if (permissivistVar == null) {
            attabal(102);
        }
        if (wiremanVar == null) {
            attabal(103);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = permissivistVar.wireman();
        return (beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) && marial(beachfrontVarWireman, wiremanVar);
    }

    public static boolean lotta(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(Opcodes.D2I);
        }
        return underbelly(oilcanVar);
    }

    public static boolean marial(p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVar, byname.wireman wiremanVar) {
        if (beachfrontVar == null) {
            attabal(104);
        }
        if (wiremanVar == null) {
            attabal(105);
        }
        return beachfrontVar.getName().equals(wiremanVar.taiyuan()) && wiremanVar.equals(p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(beachfrontVar));
    }

    public static boolean milliradian(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(90);
        }
        return marial(wiremanVar, competently.attabal.f29769taiyuan) || creditor(wiremanVar) != null;
    }

    public static boolean monroe(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(129);
        }
        return nosophobia(oilcanVar, competently.attabal.f29770technofreak.cutely());
    }

    public static boolean nosophobia(oilcan oilcanVar, byname.wireman wiremanVar) {
        if (oilcanVar == null) {
            attabal(135);
        }
        if (wiremanVar == null) {
            attabal(136);
        }
        return lerp(oilcanVar, wiremanVar) && !oilcanVar.mastfed();
    }

    public static boolean palmyra(oilcan oilcanVar) {
        return oilcanVar != null && coi(oilcanVar, competently.attabal.f29726impromptu);
    }

    public static boolean picketboat(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(108);
        }
        return marial(wiremanVar, competently.attabal.f29758saneness) || marial(wiremanVar, competently.attabal.f29711dern);
    }

    public static boolean premeiotic(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(Opcodes.F2L);
        }
        return lerp(oilcanVar, competently.attabal.f29758saneness);
    }

    public static boolean preterite(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(92);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        return (beachfrontVarWireman == null || creditor(beachfrontVarWireman) == null) ? false : true;
    }

    public static PrimitiveType saran(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(93);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman == null) {
            return null;
        }
        return creditor(beachfrontVarWireman);
    }

    public static boolean sayid(apical apicalVar) {
        if (apicalVar == null) {
            attabal(Opcodes.IF_ICMPGE);
        }
        if (apicalVar.attabal().getAnnotations().restrictive(competently.attabal.f29753preprohormone)) {
            return true;
        }
        if (apicalVar instanceof saran) {
            saran saranVar = (saran) apicalVar;
            boolean zRestrictive = saranVar.restrictive();
            privatdozent getter = saranVar.getGetter();
            creditor setter = saranVar.getSetter();
            if (getter != null && sayid(getter) && (!zRestrictive || (setter != null && sayid(setter)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean sensatory(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(Opcodes.F2I);
        }
        return lerp(oilcanVar, competently.attabal.f29711dern);
    }

    public static boolean timberyard(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(89);
        }
        return lerp(oilcanVar, competently.attabal.f29769taiyuan);
    }

    public static boolean treadless(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(91);
        }
        return timberyard(oilcanVar) || preterite(oilcanVar);
    }

    public static boolean unconsolidated(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(130);
        }
        return nosophobia(oilcanVar, competently.attabal.f29744outmarry.cutely());
    }

    public static boolean underbelly(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(Opcodes.F2D);
        }
        return premeiotic(oilcanVar) && oilcanVar.mastfed();
    }

    public static PrimitiveType walach(apical apicalVar) {
        if (apicalVar == null) {
            attabal(77);
        }
        if (competently.attabal.f29764setterwort.contains(apicalVar.getName())) {
            return competently.attabal.f29697attendance.get(p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(apicalVar));
        }
        return null;
    }

    public static boolean wostteth(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (wiremanVar == null) {
            attabal(97);
        }
        return walach(wiremanVar) != null;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc adultoid() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.CHAR);
        if (mercVarHydrovane == null) {
            attabal(63);
        }
        return mercVarHydrovane;
    }

    public oilcan apical(oilcan oilcanVar) {
        oilcan oilcanVarCuirassed;
        if (oilcanVar == null) {
            attabal(68);
        }
        if (timberyard(oilcanVar)) {
            if (oilcanVar.dhss().size() != 1) {
                throw new IllegalStateException();
            }
            oilcan type = oilcanVar.dhss().get(0).getType();
            if (type == null) {
                attabal(69);
            }
            return type;
        }
        oilcan oilcanVarTriweekly = nosophobia.triweekly(oilcanVar);
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVar = this.f29648dern.invoke().f29655dern.get(oilcanVarTriweekly);
        if (mercVar != null) {
            return mercVar;
        }
        trm trmVarTaiyuan = p002kotlin.reflect.jvm.internal.impl.resolve.marial.taiyuan(oilcanVarTriweekly);
        if (trmVarTaiyuan != null && (oilcanVarCuirassed = cuirassed(oilcanVarTriweekly, trmVarTaiyuan)) != null) {
            return oilcanVarCuirassed;
        }
        throw new IllegalStateException("not array: " + oilcanVar);
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman arytenoidectomy(String str) {
        if (str == null) {
            attabal(14);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarInvoke = this.f29649marial.invoke(byname.marial.cutely(str));
        if (wiremanVarInvoke == null) {
            attabal(15);
        }
        return wiremanVarInvoke;
    }

    public void beachfront(boolean z) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(f29645competently, this.f29647beachfront, this, null);
        this.f29646attabal = moduleDescriptorImpl;
        moduleDescriptorImpl.deadwork(BuiltInsLoader.f29621attabal.attabal().attabal(this.f29647beachfront, this.f29646attabal, dovishness(), grimness(), competently(), z));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f29646attabal;
        moduleDescriptorImpl2.prefect(moduleDescriptorImpl2);
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman clubfoot(int i) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarKowloon = kowloon(competently.f29679monoploid.dern(byname.marial.cutely(competently.wireman(i))));
        if (wiremanVarKowloon == null) {
            attabal(18);
        }
        return wiremanVarKowloon;
    }

    public discontentedness.attabal competently() {
        discontentedness.attabal.C0590attabal c0590attabal = discontentedness.attabal.C0590attabal.f25323attabal;
        if (c0590attabal == null) {
            attabal(3);
        }
        return c0590attabal;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc cord() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.DOUBLE);
        if (mercVarHydrovane == null) {
            attabal(62);
        }
        return mercVarHydrovane;
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman cutely() {
        return arytenoidectomy("Array");
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman dent() {
        return arytenoidectomy("Unit");
    }

    public Iterable<discontentedness.saneness> dovishness() {
        List listSingletonList = Collections.singletonList(new p002kotlin.reflect.jvm.internal.impl.builtins.functions.attabal(this.f29647beachfront, polloi()));
        if (listSingletonList == null) {
            attabal(5);
        }
        return listSingletonList;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc formularize(Variance variance, oilcan oilcanVar) {
        if (variance == null) {
            attabal(83);
        }
        if (oilcanVar == null) {
            attabal(84);
        }
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = impassible(variance, oilcanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.saneness());
        if (mercVarImpassible == null) {
            attabal(85);
        }
        return mercVarImpassible;
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman gintrap() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarKowloon = kowloon(competently.attabal.f29765splinterproof);
        if (wiremanVarKowloon == null) {
            attabal(35);
        }
        return wiremanVarKowloon;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc graveside() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.BYTE);
        if (mercVarHydrovane == null) {
            attabal(57);
        }
        return mercVarHydrovane;
    }

    public discontentedness.dern grimness() {
        discontentedness.dern.saneness sanenessVar = discontentedness.dern.saneness.f25325attabal;
        if (sanenessVar == null) {
            attabal(4);
        }
        return sanenessVar;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc hydrovane(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            attabal(54);
        }
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = starveling(primitiveType).impassible();
        if (mercVarImpassible == null) {
            attabal(55);
        }
        return mercVarImpassible;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc impassible(Variance variance, oilcan oilcanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial marialVar) {
        if (variance == null) {
            attabal(79);
        }
        if (oilcanVar == null) {
            attabal(80);
        }
        if (marialVar == null) {
            attabal(81);
        }
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarCompetently = KotlinTypeFactory.competently(clubfoot.saneness(marialVar), cutely(), Collections.singletonList(new treadless(variance, oilcanVar)));
        if (mercVarCompetently == null) {
            attabal(82);
        }
        return mercVarCompetently;
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman impromptu() {
        return arytenoidectomy("Any");
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman kattegat() {
        return arytenoidectomy("Nothing");
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman kowloon(byname.dern dernVar) {
        if (dernVar == null) {
            attabal(12);
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarWireman = monoploid.wireman(polloi(), dernVar, NoLookupLocation.FROM_BUILTINS);
        if (wiremanVarWireman == null) {
            attabal(13);
        }
        return wiremanVarWireman;
    }

    public formularize mathsort() {
        formularize formularizeVar = this.f29647beachfront;
        if (formularizeVar == null) {
            attabal(6);
        }
        return formularizeVar;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc merc() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarMolet = supplicat().lampshade(true);
        if (mercVarMolet == null) {
            attabal(50);
        }
        return mercVarMolet;
    }

    public MemberScope molybdenite() {
        MemberScope memberScopeFormularize = polloi().hydrovane(competently.f29682preprohormone).formularize();
        if (memberScopeFormularize == null) {
            attabal(11);
        }
        return memberScopeFormularize;
    }

    public final p002kotlin.reflect.jvm.internal.impl.types.merc monoploid(String str) {
        if (str == null) {
            attabal(47);
        }
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = arytenoidectomy(str).impassible();
        if (mercVarImpassible == null) {
            attabal(48);
        }
        return mercVarImpassible;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc oilcan() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.INT);
        if (mercVarHydrovane == null) {
            attabal(59);
        }
        return mercVarHydrovane;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc overspeculate() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = splinterproof().impassible();
        if (mercVarImpassible == null) {
            attabal(66);
        }
        return mercVarImpassible;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc peridotite() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.SHORT);
        if (mercVarHydrovane == null) {
            attabal(58);
        }
        return mercVarHydrovane;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc permissivist() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = dent().impassible();
        if (mercVarImpassible == null) {
            attabal(65);
        }
        return mercVarImpassible;
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman polder() {
        return arytenoidectomy("Number");
    }

    public ModuleDescriptorImpl polloi() {
        if (this.f29646attabal == null) {
            this.f29646attabal = this.f29650saneness.invoke();
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.f29646attabal;
        if (moduleDescriptorImpl == null) {
            attabal(7);
        }
        return moduleDescriptorImpl;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc preprohormone() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarRestrictive = restrictive();
        if (mercVarRestrictive == null) {
            attabal(53);
        }
        return mercVarRestrictive;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc privatdozent(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            attabal(74);
        }
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVar = this.f29648dern.invoke().f29654attabal.get(primitiveType);
        if (mercVar == null) {
            attabal(75);
        }
        return mercVar;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc restrictive() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarMolet = taiyuan().lampshade(true);
        if (mercVarMolet == null) {
            attabal(52);
        }
        return mercVarMolet;
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman rotuma() {
        return arytenoidectomy("Comparable");
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc sealless() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.LONG);
        if (mercVarHydrovane == null) {
            attabal(60);
        }
        return mercVarHydrovane;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc seminary() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = polder().impassible();
        if (mercVarImpassible == null) {
            attabal(56);
        }
        return mercVarImpassible;
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman splinterproof() {
        return arytenoidectomy("String");
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman starveling(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            attabal(16);
        }
        return arytenoidectomy(primitiveType.getTypeName().dern());
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc stratoscope() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.FLOAT);
        if (mercVarHydrovane == null) {
            attabal(61);
        }
        return mercVarHydrovane;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc supplicat() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = kattegat().impassible();
        if (mercVarImpassible == null) {
            attabal(49);
        }
        return mercVarImpassible;
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc taiyuan() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarImpassible = impromptu().impassible();
        if (mercVarImpassible == null) {
            attabal(51);
        }
        return mercVarImpassible;
    }

    public void technofreak(ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            attabal(1);
        }
        this.f29647beachfront.wireman(new wireman(moduleDescriptorImpl));
    }

    public p002kotlin.reflect.jvm.internal.impl.types.merc triweekly() {
        p002kotlin.reflect.jvm.internal.impl.types.merc mercVarHydrovane = hydrovane(PrimitiveType.BOOLEAN);
        if (mercVarHydrovane == null) {
            attabal(64);
        }
        return mercVarHydrovane;
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman trm(int i) {
        return arytenoidectomy(competently.saneness(i));
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman yemenite() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarKowloon = kowloon(competently.attabal.f29733lotta.formularize());
        if (wiremanVarKowloon == null) {
            attabal(21);
        }
        return wiremanVarKowloon;
    }
}
