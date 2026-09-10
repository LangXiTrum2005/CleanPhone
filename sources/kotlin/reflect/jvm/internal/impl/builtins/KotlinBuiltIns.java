package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.common.n.mo;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDependenciesImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public abstract class KotlinBuiltIns {
    public static final Name f = Name.i("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ModuleDescriptorImpl f43460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotNullLazyValue f43461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f43462c;
    public final MemoizedFunctionToNotNull d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LockBasedStorageManager f43463e;

    public static class Primitives {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumMap f43465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f43466b;

        public Primitives(EnumMap enumMap, HashMap map, HashMap map2) {
            this.f43465a = enumMap;
            this.f43466b = map2;
        }
    }

    public KotlinBuiltIns(LockBasedStorageManager lockBasedStorageManager) {
        this.f43463e = lockBasedStorageManager;
        this.f43462c = lockBasedStorageManager.a(new Function0<Collection<PackageViewDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
                return Arrays.asList(kotlinBuiltIns.k().e0(StandardNames.k), kotlinBuiltIns.k().e0(StandardNames.m), kotlinBuiltIns.k().e0(StandardNames.f43479n), kotlinBuiltIns.k().e0(StandardNames.f43478l));
            }
        });
        this.f43461b = lockBasedStorageManager.a(new Function0<Primitives>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EnumMap enumMap = new EnumMap(PrimitiveType.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (PrimitiveType primitiveType : PrimitiveType.values()) {
                    String strB = primitiveType.X.b();
                    Name name = KotlinBuiltIns.f;
                    KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
                    if (strB == null) {
                        kotlinBuiltIns.getClass();
                        KotlinBuiltIns.a(46);
                        throw null;
                    }
                    SimpleType simpleTypeO = kotlinBuiltIns.j(strB).o();
                    if (simpleTypeO == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    String strB2 = primitiveType.f43467Y.b();
                    if (strB2 == null) {
                        KotlinBuiltIns.a(46);
                        throw null;
                    }
                    SimpleType simpleTypeO2 = kotlinBuiltIns.j(strB2).o();
                    if (simpleTypeO2 == null) {
                        KotlinBuiltIns.a(47);
                        throw null;
                    }
                    enumMap.put(primitiveType, simpleTypeO2);
                    map.put(simpleTypeO, simpleTypeO2);
                    map2.put(simpleTypeO2, simpleTypeO);
                }
                return new Primitives(enumMap, map, map2);
            }
        });
        this.d = lockBasedStorageManager.g(new Function1<Name, ClassDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Name name = (Name) obj;
                ModuleDescriptorImpl moduleDescriptorImplK = KotlinBuiltIns.this.k();
                FqName fqName = StandardNames.k;
                MemberScope memberScopeN = moduleDescriptorImplK.e0(fqName).n();
                if (memberScopeN == null) {
                    KotlinBuiltIns.a(11);
                    throw null;
                }
                ClassifierDescriptor classifierDescriptorF = ((AbstractScopeAdapter) memberScopeN).f(name, NoLookupLocation.X);
                if (classifierDescriptorF == null) {
                    throw new AssertionError("Built-in class " + fqName.c(name) + " is not found");
                }
                if (classifierDescriptorF instanceof ClassDescriptor) {
                    return (ClassDescriptor) classifierDescriptorF;
                }
                throw new AssertionError("Must be a class descriptor " + name + ", but was " + classifierDescriptorF);
            }
        });
    }

    public static boolean A(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe != null) {
            return z(kotlinType, fqNameUnsafe) && !kotlinType.I0();
        }
        a(135);
        throw null;
    }

    public static boolean B(FunctionDescriptor functionDescriptor) {
        if (functionDescriptor.y0().getAnnotations().E0(StandardNames.FqNames.m)) {
            return true;
        }
        if (!(functionDescriptor instanceof PropertyDescriptor)) {
            return false;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) functionDescriptor;
        boolean zI = propertyDescriptor.I();
        PropertyGetterDescriptorImpl getter = propertyDescriptor.getGetter();
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        if (getter == null || !B(getter)) {
            return false;
        }
        if (zI) {
            return setter != null && B(setter);
        }
        return true;
    }

    public static boolean C(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe != null) {
            return !kotlinType.I0() && z(kotlinType, fqNameUnsafe);
        }
        a(106);
        throw null;
    }

    public static boolean D(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            throw null;
        }
        if (kotlinType != null) {
            return z(kotlinType, StandardNames.FqNames.f43495b) && !TypeUtils.e(kotlinType);
        }
        a(138);
        throw null;
    }

    public static boolean E(KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
            return (classifierDescriptorC == null || q(classifierDescriptorC) == null) ? false : true;
        }
        a(91);
        throw null;
    }

    public static boolean F(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(94);
            throw null;
        }
        if (kotlinType.I0()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (!(classifierDescriptorC instanceof ClassDescriptor)) {
            return false;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorC;
        if (classDescriptor != null) {
            return s(classDescriptor) != null;
        }
        a(96);
        throw null;
    }

    public static boolean G(KotlinType kotlinType) {
        return C(kotlinType, StandardNames.FqNames.f);
    }

    public static boolean H(TypeConstructor typeConstructor, FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            a(101);
            throw null;
        }
        if (fqNameUnsafe != null) {
            ClassifierDescriptor classifierDescriptorC = typeConstructor.c();
            return (classifierDescriptorC instanceof ClassDescriptor) && b((ClassDescriptor) classifierDescriptorC, fqNameUnsafe);
        }
        a(102);
        throw null;
    }

    public static boolean I(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            a(10);
            throw null;
        }
        for (DeclarationDescriptor declarationDescriptorD = classifierDescriptor; declarationDescriptorD != null; declarationDescriptorD = declarationDescriptorD.d()) {
            if (declarationDescriptorD instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptorD).c().h(StandardNames.j);
            }
        }
        return false;
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
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
            case 47:
            case 48:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
            case mo.oom.ooo /* 74 */:
            case mo.oom.m00 /* 81 */:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case mo.oom.oom /* 75 */:
            case 76:
            case mo.oom.ono /* 77 */:
            case 78:
            case mo.oom.on0 /* 79 */:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
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
            case 47:
            case 48:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
            case mo.oom.ooo /* 74 */:
            case mo.oom.m00 /* 81 */:
            case 84:
            case 86:
            case 87:
                i3 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case mo.oom.oom /* 75 */:
            case 76:
            case mo.oom.ono /* 77 */:
            case 78:
            case mo.oom.on0 /* 79 */:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 72:
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
            case 47:
            case 48:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
            case mo.oom.ooo /* 74 */:
            case mo.oom.m00 /* 81 */:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case mo.oom.ono /* 77 */:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
            case 91:
            case mo.oom.m0n /* 92 */:
            case mo.oom.mo0 /* 93 */:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
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
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
            case OMSDK_JS_WRITE_FAILED_VALUE:
            case 134:
            case PRIVACY_URL_ERROR_VALUE:
            case TPAT_RETRY_FAILED_VALUE:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case mo.oom.oom /* 75 */:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case mo.oom.on0 /* 79 */:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
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
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case mo.oom.oom /* 75 */:
            case 76:
            case mo.oom.ono /* 77 */:
            case 78:
            case mo.oom.on0 /* 79 */:
            case 80:
            case 82:
            case 83:
            case 85:
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
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case AD_REWARD_USER_VALUE:
                objArr[1] = "getNullableAnyType";
                break;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                objArr[1] = "getDefaultBound";
                break;
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
                objArr[1] = "getArrayElementType";
                break;
            case mo.oom.ooo /* 74 */:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case mo.oom.m00 /* 81 */:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i2) {
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
            case 47:
            case 48:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
            case mo.oom.ooo /* 74 */:
            case mo.oom.m00 /* 81 */:
            case 84:
            case 86:
            case 87:
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
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case mo.oom.oom /* 75 */:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case mo.oom.mo0 /* 93 */:
                objArr[2] = "getPrimitiveType";
                break;
            case mo.oom.ono /* 77 */:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case mo.oom.on0 /* 79 */:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case mo.oom.m0n /* 92 */:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                objArr[2] = "isUnsignedArrayType";
                break;
            case OMSDK_JS_WRITE_FAILED_VALUE:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case PRIVACY_URL_ERROR_VALUE:
                objArr[2] = "isNothing";
                break;
            case TPAT_RETRY_FAILED_VALUE:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
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
            case 47:
            case 48:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 64:
            case 65:
            case 66:
            case 68:
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
            case mo.oom.ooo /* 74 */:
            case mo.oom.m00 /* 81 */:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case mo.oom.oom /* 75 */:
            case 76:
            case mo.oom.ono /* 77 */:
            case 78:
            case mo.oom.on0 /* 79 */:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static boolean b(ClassDescriptor classDescriptor, FqNameUnsafe fqNameUnsafe) {
        if (classDescriptor == null) {
            a(103);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return classDescriptor.getName().equals(fqNameUnsafe.f()) && fqNameUnsafe.equals(DescriptorUtils.g(classDescriptor));
        }
        a(104);
        throw null;
    }

    public static PrimitiveType q(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            a(77);
            throw null;
        }
        if (StandardNames.FqNames.a0.contains(classifierDescriptor.getName())) {
            return (PrimitiveType) StandardNames.FqNames.f43498c0.get(DescriptorUtils.g(classifierDescriptor));
        }
        return null;
    }

    public static PrimitiveType s(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(76);
            throw null;
        }
        if (StandardNames.FqNames.Z.contains(classDescriptor.getName())) {
            return (PrimitiveType) StandardNames.FqNames.f43496b0.get(DescriptorUtils.g(classDescriptor));
        }
        return null;
    }

    public static boolean w(KotlinType kotlinType) {
        if (kotlinType != null) {
            return z(kotlinType, StandardNames.FqNames.f43494a);
        }
        a(139);
        throw null;
    }

    public static boolean x(KotlinType kotlinType) {
        if (kotlinType != null) {
            return z(kotlinType, StandardNames.FqNames.g);
        }
        a(88);
        throw null;
    }

    public static boolean y(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return DescriptorUtils.i(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean z(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(97);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return H(kotlinType.H0(), fqNameUnsafe);
        }
        a(98);
        throw null;
    }

    public final void J(final ModuleDescriptorImpl moduleDescriptorImpl) {
        this.f43463e.d(new Function0<Void>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinBuiltIns kotlinBuiltIns = KotlinBuiltIns.this;
                ModuleDescriptorImpl moduleDescriptorImpl2 = kotlinBuiltIns.f43460a;
                ModuleDescriptorImpl moduleDescriptorImpl3 = moduleDescriptorImpl;
                if (moduleDescriptorImpl2 == null) {
                    kotlinBuiltIns.f43460a = moduleDescriptorImpl3;
                    return null;
                }
                throw new AssertionError("Built-ins module is already set: " + kotlinBuiltIns.f43460a + " (attempting to reset to " + moduleDescriptorImpl3 + ")");
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(boolean z2) {
        Name moduleName = f;
        Intrinsics.f(moduleName, "moduleName");
        LockBasedStorageManager lockBasedStorageManager = this.f43463e;
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(moduleName, lockBasedStorageManager, this, 48);
        this.f43460a = moduleDescriptorImpl;
        BuiltInsLoader.f43456a.getClass();
        moduleDescriptorImpl.i0 = ((BuiltInsLoader) BuiltInsLoader.Companion.f43458b.getX()).a(lockBasedStorageManager, this.f43460a, l(), o(), d(), z2);
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f43460a;
        moduleDescriptorImpl2.getClass();
        moduleDescriptorImpl2.h0 = new ModuleDependenciesImpl(ArraysKt.M(new ModuleDescriptorImpl[]{moduleDescriptorImpl2}));
    }

    public AdditionalClassPartsProvider d() {
        return AdditionalClassPartsProvider.None.f43621a;
    }

    public final SimpleType e() {
        SimpleType simpleTypeO = j("Any").o();
        if (simpleTypeO != null) {
            return simpleTypeO;
        }
        a(50);
        throw null;
    }

    public final KotlinType f(KotlinType kotlinType) {
        ClassId classIdF;
        ClassId classId;
        ClassDescriptor classDescriptorA;
        SimpleType simpleTypeO = null;
        if (kotlinType == null) {
            a(67);
            throw null;
        }
        if (x(kotlinType)) {
            if (kotlinType.F0().size() != 1) {
                throw new IllegalStateException();
            }
            KotlinType type = ((TypeProjection) kotlinType.F0().get(0)).getType();
            if (type != null) {
                return type;
            }
            a(68);
            throw null;
        }
        UnwrappedType unwrappedTypeG = TypeUtils.g(kotlinType, false);
        KotlinType kotlinType2 = (KotlinType) ((Primitives) this.f43461b.invoke()).f43466b.get(unwrappedTypeG);
        if (kotlinType2 != null) {
            return kotlinType2;
        }
        int i2 = DescriptorUtils.f44280a;
        ClassifierDescriptor classifierDescriptorC = unwrappedTypeG.H0().c();
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptorE = classifierDescriptorC == null ? null : DescriptorUtils.e(classifierDescriptorC);
        if (moduleDescriptorE != null) {
            ClassifierDescriptor classifierDescriptorC2 = unwrappedTypeG.H0().c();
            if (classifierDescriptorC2 != null) {
                Set set = UnsignedTypes.f43511a;
                Name name = classifierDescriptorC2.getName();
                Intrinsics.f(name, "name");
                if (UnsignedTypes.d.contains(name) && (classIdF = DescriptorUtilsKt.f(classifierDescriptorC2)) != null && (classId = (ClassId) UnsignedTypes.f43512b.get(classIdF)) != null && (classDescriptorA = FindClassInModuleKt.a(moduleDescriptorE, classId)) != null) {
                    simpleTypeO = classDescriptorA.o();
                }
            }
            if (simpleTypeO != null) {
                return simpleTypeO;
            }
        }
        throw new IllegalStateException("not array: " + kotlinType);
    }

    public final SimpleType g(UnwrappedType unwrappedType) {
        Variance variance = Variance.INVARIANT;
        if (unwrappedType != null) {
            return h(variance, unwrappedType, Annotations.Companion.f43614a);
        }
        a(83);
        throw null;
    }

    public final SimpleType h(Variance variance, KotlinType kotlinType, Annotations annotations) {
        if (kotlinType != null) {
            return KotlinTypeFactory.c(DefaultTypeAttributeTranslator.f44500a.a(annotations), j("Array"), Collections.singletonList(new TypeProjectionImpl(kotlinType, variance)));
        }
        a(79);
        throw null;
    }

    public final ClassDescriptor i(FqName fqName) {
        if (fqName == null) {
            a(12);
            throw null;
        }
        ClassDescriptor classDescriptorB = DescriptorUtilKt.b(k(), fqName);
        if (classDescriptorB != null) {
            return classDescriptorB;
        }
        a(13);
        throw null;
    }

    public final ClassDescriptor j(String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) this.d.invoke(Name.g(str));
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(15);
        throw null;
    }

    public final ModuleDescriptorImpl k() {
        this.f43460a.getClass();
        ModuleDescriptorImpl moduleDescriptorImpl = this.f43460a;
        if (moduleDescriptorImpl != null) {
            return moduleDescriptorImpl;
        }
        a(7);
        throw null;
    }

    public Iterable l() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.f43463e, k()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final SimpleType m() {
        SimpleType simpleTypeO = j("Nothing").o();
        if (simpleTypeO != null) {
            return simpleTypeO;
        }
        a(48);
        throw null;
    }

    public final SimpleType n() {
        SimpleType simpleTypeO0 = e().L0(true);
        if (simpleTypeO0 != null) {
            return simpleTypeO0;
        }
        a(51);
        throw null;
    }

    public PlatformDependentDeclarationFilter o() {
        return PlatformDependentDeclarationFilter.NoPlatformDependent.f43623a;
    }

    public final SimpleType p(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(73);
            throw null;
        }
        SimpleType simpleType = (SimpleType) ((Primitives) this.f43461b.invoke()).f43465a.get(primitiveType);
        if (simpleType != null) {
            return simpleType;
        }
        a(74);
        throw null;
    }

    public final SimpleType r(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(53);
            throw null;
        }
        if (primitiveType == null) {
            a(16);
            throw null;
        }
        SimpleType simpleTypeO = j(primitiveType.X.b()).o();
        if (simpleTypeO != null) {
            return simpleTypeO;
        }
        a(54);
        throw null;
    }

    public final SimpleType t() {
        SimpleType simpleTypeO = j("String").o();
        if (simpleTypeO != null) {
            return simpleTypeO;
        }
        a(65);
        throw null;
    }

    public final ClassDescriptor u(int i2) {
        return i(StandardNames.f43475e.c(Name.g(FunctionClassKind.f0.f43517Y + i2)));
    }

    public final SimpleType v() {
        SimpleType simpleTypeO = j("Unit").o();
        if (simpleTypeO != null) {
            return simpleTypeO;
        }
        a(64);
        throw null;
    }
}
