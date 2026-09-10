package kotlin.reflect.jvm.internal.impl.resolve;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.p004ironsource.x4;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.thinkup.core.common.n.mo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public class DescriptorUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44280a = 0;

    static {
        new FqName("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case 60:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case 60:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 94:
            case 96:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
            case 59:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case 60:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = x4.DEFAULT_AUCTION_FALLBACK_VALUE;
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case 68:
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
            case mo.oom.ono /* 77 */:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = f.j;
                break;
            case 73:
                objArr[0] = "current";
                break;
            case mo.oom.ooo /* 74 */:
                objArr[0] = "result";
                break;
            case mo.oom.oom /* 75 */:
                objArr[0] = "memberDescriptor";
                break;
            case mo.oom.on0 /* 79 */:
            case 80:
            case mo.oom.m00 /* 81 */:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
            case mo.oom.m0n /* 92 */:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case mo.oom.mo0 /* 93 */:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i2) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 76:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case 60:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case mo.oom.onn /* 69 */:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case b.B0 /* 70 */:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case mo.oom.ooo /* 74 */:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case mo.oom.oom /* 75 */:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case mo.oom.ono /* 77 */:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case mo.oom.on0 /* 79 */:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case mo.oom.m00 /* 81 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case mo.oom.m0n /* 92 */:
            case mo.oom.mo0 /* 93 */:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case 60:
            case 62:
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 65:
            case 72:
            case 76:
            case 83:
            case 84:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 94:
            case 96:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(CallableDescriptor callableDescriptor, LinkedHashSet linkedHashSet) {
        if (callableDescriptor == null) {
            a(73);
            throw null;
        }
        if (linkedHashSet.contains(callableDescriptor)) {
            return;
        }
        Iterator it = callableDescriptor.y0().l().iterator();
        while (it.hasNext()) {
            CallableDescriptor callableDescriptorY0 = ((CallableDescriptor) it.next()).y0();
            b(callableDescriptorY0, linkedHashSet);
            linkedHashSet.add(callableDescriptorY0);
        }
    }

    public static ClassDescriptor c(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(45);
            throw null;
        }
        TypeConstructor typeConstructorH0 = kotlinType.H0();
        if (typeConstructorH0 == null) {
            a(46);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) typeConstructorH0.c();
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(47);
        throw null;
    }

    public static ModuleDescriptor d(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(21);
            throw null;
        }
        ModuleDescriptor moduleDescriptorE = e(declarationDescriptor);
        if (moduleDescriptorE != null) {
            return moduleDescriptorE;
        }
        a(22);
        throw null;
    }

    public static ModuleDescriptor e(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(23);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof ModuleDescriptor) {
                return (ModuleDescriptor) declarationDescriptor;
            }
            if (declarationDescriptor instanceof PackageViewDescriptor) {
                return ((PackageViewDescriptor) declarationDescriptor).v0();
            }
            declarationDescriptor = declarationDescriptor.d();
        }
        return null;
    }

    public static SourceFile f(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(82);
            throw null;
        }
        if (declarationDescriptor instanceof PropertySetterDescriptor) {
            declarationDescriptor = ((PropertySetterDescriptor) declarationDescriptor).P();
        }
        boolean z2 = declarationDescriptor instanceof DeclarationDescriptorWithSource;
        SourceFile sourceFile = SourceFile.f43592a;
        if (z2) {
            ((DeclarationDescriptorWithSource) declarationDescriptor).f().getClass();
        }
        return sourceFile;
    }

    public static FqNameUnsafe g(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            FqName fqNameH = h(declarationDescriptor);
            return fqNameH != null ? fqNameH.i() : g(declarationDescriptor.d()).b(declarationDescriptor.getName());
        }
        a(2);
        throw null;
    }

    public static FqName h(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(5);
            throw null;
        }
        if ((declarationDescriptor instanceof ModuleDescriptor) || ErrorUtils.f(declarationDescriptor)) {
            return FqName.f44164c;
        }
        if (declarationDescriptor instanceof PackageViewDescriptor) {
            return ((PackageViewDescriptor) declarationDescriptor).c();
        }
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return ((PackageFragmentDescriptor) declarationDescriptor).c();
        }
        return null;
    }

    public static DeclarationDescriptor i(DeclarationDescriptor declarationDescriptor, Class cls, boolean z2) {
        if (declarationDescriptor == null) {
            return null;
        }
        if (z2) {
            declarationDescriptor = declarationDescriptor.d();
        }
        while (declarationDescriptor != null) {
            if (cls.isInstance(declarationDescriptor)) {
                return declarationDescriptor;
            }
            declarationDescriptor = declarationDescriptor.d();
        }
        return null;
    }

    public static ClassDescriptor j(ClassDescriptor classDescriptor) {
        if (classDescriptor == null) {
            a(44);
            throw null;
        }
        Iterator it = classDescriptor.h().d().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorC = c((KotlinType) it.next());
            if (classDescriptorC.getKind() != ClassKind.f43559Y) {
                return classDescriptorC;
            }
        }
        return null;
    }

    public static boolean k(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return n(declarationDescriptor, ClassKind.X) && declarationDescriptor.getName().equals(SpecialNames.f44173a);
        }
        a(34);
        throw null;
    }

    public static boolean l(DeclarationDescriptor declarationDescriptor) {
        return n(declarationDescriptor, ClassKind.g0) && ((ClassDescriptor) declarationDescriptor).T();
    }

    public static boolean m(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return n(declarationDescriptor, ClassKind.e0);
        }
        a(36);
        throw null;
    }

    public static boolean n(DeclarationDescriptor declarationDescriptor, ClassKind classKind) {
        return (declarationDescriptor instanceof ClassDescriptor) && ((ClassDescriptor) declarationDescriptor).getKind() == classKind;
    }

    public static boolean o(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(1);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (k(declarationDescriptor) || ((declarationDescriptor instanceof DeclarationDescriptorWithVisibility) && ((DeclarationDescriptorWithVisibility) declarationDescriptor).getVisibility() == DescriptorVisibilities.f)) {
                return true;
            }
            declarationDescriptor = declarationDescriptor.d();
        }
        return false;
    }

    public static boolean p(KotlinType kotlinType, ClassDescriptor classDescriptor) {
        if (kotlinType == null) {
            a(30);
            throw null;
        }
        if (classDescriptor == null) {
            a(31);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorC = kotlinType.H0().c();
        if (classifierDescriptorC == null) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorY0 = classifierDescriptorC.y0();
        return (declarationDescriptorY0 instanceof ClassifierDescriptor) && classDescriptor.h().equals(((ClassifierDescriptor) declarationDescriptorY0).h());
    }

    public static boolean q(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters) {
        return (n(classifierDescriptorWithTypeParameters, ClassKind.X) || n(classifierDescriptorWithTypeParameters, ClassKind.f43559Y)) && ((ClassDescriptor) classifierDescriptorWithTypeParameters).q() == Modality.f43574Y;
    }

    public static boolean r(KotlinType kotlinType, ClassDescriptor classDescriptor) {
        if (kotlinType == null) {
            a(32);
            throw null;
        }
        if (classDescriptor == null) {
            a(33);
            throw null;
        }
        if (p(kotlinType, classDescriptor)) {
            return true;
        }
        Iterator it = kotlinType.H0().d().iterator();
        while (it.hasNext()) {
            if (r((KotlinType) it.next(), classDescriptor)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(DeclarationDescriptor declarationDescriptor) {
        return declarationDescriptor != null && (declarationDescriptor.d() instanceof PackageFragmentDescriptor);
    }

    public static CallableMemberDescriptor t(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            a(59);
            throw null;
        }
        while (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.f43557Y) {
            Collection collectionL = callableMemberDescriptor.l();
            if (collectionL.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + callableMemberDescriptor);
            }
            callableMemberDescriptor = (CallableMemberDescriptor) collectionL.iterator().next();
        }
        return callableMemberDescriptor;
    }
}
