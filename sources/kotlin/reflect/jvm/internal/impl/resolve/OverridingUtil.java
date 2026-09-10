package kotlin.reflect.jvm.internal.impl.resolve;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.smartdigimkt.f3.b;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m6.a;
import com.smartdigimkt.sdk.basead.ui.animplayerview.scale.AlbumScaleMainView;
import com.smartdigimkt.y4.g;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* JADX INFO: loaded from: classes7.dex */
public class OverridingUtil {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f44283b = CollectionsKt.i0(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final OverridingUtil f44284c;
    public static final KotlinTypeChecker.TypeConstructorEquality d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinTypeChecker.TypeConstructorEquality f44285a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$1, reason: invalid class name */
    public static class AnonymousClass1 implements KotlinTypeChecker.TypeConstructorEquality {
        public static /* synthetic */ void b(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        public final boolean a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                b(0);
                throw null;
            }
            if (typeConstructor2 != null) {
                return typeConstructor.equals(typeConstructor2);
            }
            b(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$2, reason: invalid class name */
    final class AnonymousClass2 implements Function2<CallableDescriptor, CallableDescriptor, Pair<CallableDescriptor, CallableDescriptor>> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new Pair((CallableDescriptor) obj, (CallableDescriptor) obj2);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$4, reason: invalid class name */
    final class AnonymousClass4 implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return (CallableMemberDescriptor) obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$6, reason: invalid class name */
    final class AnonymousClass6 implements Function1<CallableMemberDescriptor, CallableDescriptor> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return (CallableMemberDescriptor) obj;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$8, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f44288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f44289c;

        static {
            int[] iArr = new int[Modality.values().length];
            f44289c = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44289c[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44289c[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44289c[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f44288b = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44288b[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44288b[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f44287a = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44287a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44287a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f44287a[3] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final OverrideCompatibilityInfo f44290b = new OverrideCompatibilityInfo(Result.X, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Result f44291a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Result {
            public static final Result X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final Result f44292Y;
            public static final Result Z;
            public static final /* synthetic */ Result[] e0;

            static {
                Result result = new Result("OVERRIDABLE", 0);
                X = result;
                Result result2 = new Result("INCOMPATIBLE", 1);
                f44292Y = result2;
                Result result3 = new Result("CONFLICT", 2);
                Z = result3;
                e0 = new Result[]{result, result2, result3};
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) e0.clone();
            }
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            this.f44291a = result;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? 3 : 2];
            if (i2 == 1 || i2 == 2) {
                objArr[0] = "debugMessage";
            } else if (i2 == 3) {
                objArr[0] = "success";
            } else if (i2 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i2 == 1) {
                objArr[2] = "incompatible";
            } else if (i2 == 2) {
                objArr[2] = "conflict";
            } else if (i2 == 3 || i2 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        public static OverrideCompatibilityInfo b(String str) {
            return new OverrideCompatibilityInfo(Result.Z, str);
        }

        public static OverrideCompatibilityInfo d(String str) {
            return new OverrideCompatibilityInfo(Result.f44292Y, str);
        }

        public final Result c() {
            Result result = this.f44291a;
            if (result != null) {
                return result;
            }
            a(5);
            throw null;
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        d = anonymousClass1;
        f44284c = new OverridingUtil(anonymousClass1);
    }

    public OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (typeConstructorEquality != null) {
            this.f44285a = typeConstructorEquality;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        if (i2 != 11 && i2 != 12 && i2 != 16 && i2 != 21 && i2 != 95 && i2 != 98 && i2 != 103 && i2 != 44 && i2 != 45) {
            switch (i2) {
                default:
                    switch (i2) {
                        default:
                            switch (i2) {
                                default:
                                    switch (i2) {
                                        case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                        case 91:
                                        case mo.oom.m0n /* 92 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case mo.oom.m00 /* 81 */:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i2 != 11 && i2 != 12 && i2 != 16 && i2 != 21 && i2 != 95 && i2 != 98 && i2 != 103 && i2 != 44 && i2 != 45) {
            switch (i2) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    i3 = 2;
                    break;
                default:
                    switch (i2) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            i3 = 2;
                            break;
                        default:
                            switch (i2) {
                                case 80:
                                case mo.oom.m00 /* 81 */:
                                case 82:
                                case 83:
                                case 84:
                                    i3 = 2;
                                    break;
                                default:
                                    switch (i2) {
                                        case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                        case 91:
                                        case mo.oom.m0n /* 92 */:
                                            i3 = 2;
                                            break;
                                        default:
                                            i3 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i3 = 2;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case mo.oom.m00 /* 81 */:
            case 82:
            case 83:
            case 84:
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
            case 91:
            case mo.oom.m0n /* 92 */:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = f.j;
                break;
            case 14:
                objArr[0] = g.f40227p;
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case AD_REWARD_USER_VALUE:
            case mo.oom.ono /* 77 */:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                objArr[0] = "membersFromCurrent";
                break;
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 64:
            case 86:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = a.r.f36787A;
                break;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case mo.oom.onn /* 69 */:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case b.B0 /* 70 */:
            case mo.oom.oom /* 75 */:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case mo.oom.mo0 /* 93 */:
            case 109:
                objArr[0] = "descriptors";
                break;
            case mo.oom.ooo /* 74 */:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case mo.oom.on0 /* 79 */:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i2 == 11 || i2 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i2 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i2 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i2 == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i2 == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i2 == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i2 != 44 && i2 != 45) {
            switch (i2) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i2) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i2) {
                                case 80:
                                case mo.oom.m00 /* 81 */:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i2) {
                                        case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                        case 91:
                                        case mo.oom.m0n /* 92 */:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i2) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case mo.oom.m00 /* 81 */:
            case 82:
            case 83:
            case 84:
            case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
            case 91:
            case mo.oom.m0n /* 92 */:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case AD_REWARD_USER_VALUE:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
            case 53:
            case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
            case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case mo.oom.onn /* 69 */:
            case b.B0 /* 70 */:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case mo.oom.ooo /* 74 */:
            case mo.oom.oom /* 75 */:
            case 76:
            case mo.oom.ono /* 77 */:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case mo.oom.on0 /* 79 */:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case mo.oom.mo0 /* 93 */:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 11 && i2 != 12 && i2 != 16 && i2 != 21 && i2 != 95 && i2 != 98 && i2 != 103 && i2 != 44 && i2 != 45) {
            switch (i2) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i2) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i2) {
                                case 80:
                                case mo.oom.m00 /* 81 */:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i2) {
                                        case AlbumScaleMainView.MAIN_VIEW_INIT_WIDTH /* 90 */:
                                        case 91:
                                        case mo.oom.m0n /* 92 */:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(KotlinType kotlinType, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            a(46);
            throw null;
        }
        if (kotlinType2 == null) {
            a(47);
            throw null;
        }
        if (KotlinTypeKt.a(kotlinType) && KotlinTypeKt.a(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.e(typeCheckerState, kotlinType.K0(), kotlinType2.K0());
    }

    public static void c(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            a(17);
            throw null;
        }
        CallableMemberDescriptor.Kind kind = callableMemberDescriptor.getKind();
        kind.getClass();
        if (kind != CallableMemberDescriptor.Kind.f43557Y) {
            linkedHashSet.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.l().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator it = callableMemberDescriptor.l().iterator();
        while (it.hasNext()) {
            c((CallableMemberDescriptor) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor receiverParameterDescriptorJ = callableDescriptor.J();
        ArrayList arrayList = new ArrayList();
        if (receiverParameterDescriptorJ != null) {
            arrayList.add(receiverParameterDescriptorJ.getType());
        }
        Iterator it = callableDescriptor.e().iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    public static void e(Collection collection, final ClassDescriptor classDescriptor, NonReportingOverrideStrategy nonReportingOverrideStrategy) {
        Modality modality;
        if (collection == null) {
            a(85);
            throw null;
        }
        if (classDescriptor == null) {
            a(86);
            throw null;
        }
        ArrayList arrayListT = CollectionsKt.t(collection, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.5
            /* JADX WARN: Code duplicated, block: B:11:0x0020  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z2;
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
                if (DescriptorVisibilities.e(callableMemberDescriptor.getVisibility())) {
                    z2 = false;
                } else {
                    ClassDescriptor classDescriptor2 = classDescriptor;
                    if (classDescriptor2 == null) {
                        DescriptorVisibilities.a(3);
                        throw null;
                    }
                    if (DescriptorVisibilities.c(DescriptorVisibilities.m, callableMemberDescriptor, classDescriptor2) == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            }
        });
        boolean zIsEmpty = arrayListT.isEmpty();
        if (!zIsEmpty) {
            collection = arrayListT;
        }
        Iterator it = collection.iterator();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (!it.hasNext()) {
                boolean zD0 = classDescriptor.d0();
                Modality modality2 = Modality.e0;
                if (zD0 && classDescriptor.q() != modality2 && classDescriptor.q() != Modality.f43574Y) {
                    z2 = true;
                }
                if (z3 && !z4) {
                    modality = Modality.Z;
                    break;
                }
                if (!z3 && z4) {
                    Modality modalityQ = z2 ? classDescriptor.q() : modality2;
                    if (modalityQ != null) {
                        modality = modalityQ;
                        break;
                    } else {
                        a(92);
                        throw null;
                    }
                }
                HashSet<CallableMemberDescriptor> hashSet = new HashSet();
                for (CallableMemberDescriptor callableMemberDescriptor : collection) {
                    if (callableMemberDescriptor == null) {
                        a(15);
                        throw null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    c(callableMemberDescriptor, linkedHashSet);
                    hashSet.addAll(linkedHashSet);
                }
                if (!hashSet.isEmpty()) {
                }
                AnonymousClass2 anonymousClass2 = new AnonymousClass2();
                if (hashSet.size() > 1) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Object obj : hashSet) {
                        Iterator it2 = linkedHashSet2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                linkedHashSet2.add(obj);
                                break;
                            }
                            Pair pair = (Pair) anonymousClass2.invoke(obj, it2.next());
                            CallableDescriptor callableDescriptor = (CallableDescriptor) pair.X;
                            CallableDescriptor callableDescriptor2 = (CallableDescriptor) pair.f43249Y;
                            if (!q(callableDescriptor, callableDescriptor2)) {
                                if (q(callableDescriptor2, callableDescriptor)) {
                                    break;
                                }
                            } else {
                                it2.remove();
                            }
                        }
                    }
                    hashSet = linkedHashSet2;
                }
                Modality modalityQ2 = classDescriptor.q();
                if (modalityQ2 == null) {
                    a(94);
                    throw null;
                }
                Modality modality3 = modality2;
                for (CallableMemberDescriptor callableMemberDescriptor2 : hashSet) {
                    Modality modalityQ3 = (z2 && callableMemberDescriptor2.q() == modality2) ? modalityQ2 : callableMemberDescriptor2.q();
                    if (modalityQ3.compareTo(modality3) < 0) {
                        modality3 = modalityQ3;
                    }
                }
                if (modality3 != null) {
                    modality = modality3;
                    break;
                } else {
                    a(95);
                    throw null;
                }
            }
            CallableMemberDescriptor callableMemberDescriptor3 = (CallableMemberDescriptor) it.next();
            int iOrdinal = callableMemberDescriptor3.q().ordinal();
            if (iOrdinal == 0) {
                modality = Modality.X;
                break;
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor3);
            }
            if (iOrdinal == 2) {
                z3 = true;
            } else if (iOrdinal == 3) {
                z4 = true;
            }
        }
        CallableMemberDescriptor callableMemberDescriptorC0 = ((CallableMemberDescriptor) s(collection, new AnonymousClass4())).C0(classDescriptor, modality, (DelegatedDescriptorVisibility) (zIsEmpty ? DescriptorVisibilities.f43565h : DescriptorVisibilities.g));
        nonReportingOverrideStrategy.b(callableMemberDescriptorC0, collection);
        nonReportingOverrideStrategy.a(callableMemberDescriptorC0);
    }

    public static ArrayList g(Object obj, LinkedList linkedList, Function1 function1, Function1 function2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultJ = j(callableDescriptor, callableDescriptor2);
                if (resultJ == OverrideCompatibilityInfo.Result.X) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultJ == OverrideCompatibilityInfo.Result.Z) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static OverrideCompatibilityInfo i(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z2;
        OverrideCompatibilityInfo overrideCompatibilityInfoD;
        if (callableDescriptor == null) {
            a(40);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(41);
            throw null;
        }
        boolean z3 = callableDescriptor instanceof FunctionDescriptor;
        if ((z3 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z2 = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.d("Member kind mismatch");
        }
        if (!z3 && !z2) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.d("Name mismatch");
        }
        if ((callableDescriptor.J() == null) != (callableDescriptor2.J() == null)) {
            overrideCompatibilityInfoD = OverrideCompatibilityInfo.d("Receiver presence mismatch");
        } else {
            overrideCompatibilityInfoD = callableDescriptor.e().size() != callableDescriptor2.e().size() ? OverrideCompatibilityInfo.d("Value parameter number mismatch") : null;
        }
        if (overrideCompatibilityInfoD != null) {
            return overrideCompatibilityInfoD;
        }
        return null;
    }

    public static OverrideCompatibilityInfo.Result j(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = f44284c;
        OverrideCompatibilityInfo.Result resultC = overridingUtil.l(callableDescriptor2, callableDescriptor, null).c();
        OverrideCompatibilityInfo.Result resultC2 = overridingUtil.m(callableDescriptor, callableDescriptor2, null, false).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.X;
        if (resultC == result && resultC2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.Z;
        return (resultC == result2 || resultC2 == result2) ? result2 : OverrideCompatibilityInfo.Result.f44292Y;
    }

    public static boolean k(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(67);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(68);
            throw null;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!p(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateF = f44284c.f(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof FunctionDescriptor) {
            return o(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            throw new IllegalArgumentException("Unexpected callable: " + callableDescriptor.getClass());
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        PropertySetterDescriptor setter2 = propertyDescriptor2.getSetter();
        if (!((setter == null || setter2 == null) ? true : p(setter, setter2))) {
            return false;
        }
        if (propertyDescriptor.I() && propertyDescriptor2.I()) {
            return AbstractTypeChecker.e(typeCheckerStateF, returnType.K0(), returnType2.K0());
        }
        return (propertyDescriptor.I() || !propertyDescriptor2.I()) && o(callableDescriptor, returnType, callableDescriptor2, returnType2, typeCheckerStateF);
    }

    public static boolean o(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            a(73);
            throw null;
        }
        if (kotlinType == null) {
            a(74);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(75);
            throw null;
        }
        if (kotlinType2 != null) {
            return AbstractTypeChecker.i(AbstractTypeChecker.f44488a, typeCheckerState, kotlinType.K0(), kotlinType2.K0());
        }
        a(76);
        throw null;
    }

    public static boolean p(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(69);
            throw null;
        }
        if (callableDescriptor2 != null) {
            Integer numB = DescriptorVisibilities.b(callableDescriptor.getVisibility(), callableDescriptor2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            a(13);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = callableDescriptor.equals(callableDescriptor2);
        DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides = DescriptorEquivalenceForOverrides.f44275a;
        if (!zEquals && descriptorEquivalenceForOverrides.a(callableDescriptor.y0(), callableDescriptor2.y0(), false)) {
            return true;
        }
        CallableDescriptor callableDescriptorY0 = callableDescriptor2.y0();
        int i2 = DescriptorUtils.f44280a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorUtils.b(callableDescriptor.y0(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (descriptorEquivalenceForOverrides.a(callableDescriptorY0, (CallableDescriptor) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(CallableMemberDescriptor callableMemberDescriptor, Function1 function1) {
        DescriptorVisibility descriptorVisibility;
        DescriptorVisibility descriptorVisibilityD;
        DescriptorVisibility descriptorVisibility2;
        if (callableMemberDescriptor == null) {
            a(107);
            throw null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.l()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.g) {
                r(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.g) {
            return;
        }
        Collection<CallableMemberDescriptor> collectionL = callableMemberDescriptor.l();
        if (collectionL == null) {
            a(109);
            throw null;
        }
        if (!collectionL.isEmpty()) {
            Iterator it = collectionL.iterator();
            loop3: while (true) {
                descriptorVisibility = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    DescriptorVisibility visibility = ((CallableMemberDescriptor) it.next()).getVisibility();
                    if (descriptorVisibility != null) {
                        Integer numB = DescriptorVisibilities.b(visibility, descriptorVisibility);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    descriptorVisibility = visibility;
                }
            }
            if (descriptorVisibility == null) {
                descriptorVisibilityD = null;
                break;
            }
            Iterator it2 = collectionL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    descriptorVisibilityD = descriptorVisibility;
                    break;
                }
                Integer numB2 = DescriptorVisibilities.b(descriptorVisibility, ((CallableMemberDescriptor) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    descriptorVisibilityD = null;
                    break;
                }
            }
        } else {
            descriptorVisibilityD = DescriptorVisibilities.k;
        }
        if (descriptorVisibilityD == null) {
            descriptorVisibilityD = null;
            break;
        }
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.f43557Y) {
            for (CallableMemberDescriptor callableMemberDescriptor3 : collectionL) {
                if (callableMemberDescriptor3.q() != Modality.e0 && !callableMemberDescriptor3.getVisibility().equals(descriptorVisibilityD)) {
                    descriptorVisibilityD = null;
                    break;
                }
            }
        } else {
            descriptorVisibilityD = descriptorVisibilityD.d();
        }
        if (descriptorVisibilityD == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            descriptorVisibility2 = DescriptorVisibilities.f43564e;
        } else {
            descriptorVisibility2 = descriptorVisibilityD;
        }
        if (callableMemberDescriptor instanceof PropertyDescriptorImpl) {
            PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) callableMemberDescriptor;
            if (descriptorVisibility2 == null) {
                PropertyDescriptorImpl.Z(20);
                throw null;
            }
            propertyDescriptorImpl.k0 = descriptorVisibility2;
            Iterator it3 = ((PropertyDescriptor) callableMemberDescriptor).s().iterator();
            while (it3.hasNext()) {
                r((PropertyAccessorDescriptor) it3.next(), descriptorVisibilityD == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
            FunctionDescriptorImpl functionDescriptorImpl = (FunctionDescriptorImpl) callableMemberDescriptor;
            if (descriptorVisibility2 != null) {
                functionDescriptorImpl.m0 = descriptorVisibility2;
                return;
            } else {
                FunctionDescriptorImpl.Z(10);
                throw null;
            }
        }
        PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
        propertyAccessorDescriptorImpl.l0 = descriptorVisibility2;
        if (descriptorVisibility2 != propertyAccessorDescriptorImpl.P().getVisibility()) {
            propertyAccessorDescriptorImpl.f0 = false;
        }
    }

    public static Object s(Collection collection, Function1 function1) {
        Object next;
        if (collection.size() == 1) {
            Object objV = CollectionsKt.v(collection);
            if (objV != null) {
                return objV;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        Object objV2 = CollectionsKt.v(collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(objV2);
        for (Object obj : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(obj);
            if (callableDescriptor2 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(callableDescriptor2, (CallableDescriptor) it2.next()));
            if (k(callableDescriptor2, callableDescriptor) && !k(callableDescriptor, callableDescriptor2)) {
                objV2 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objV2 != null) {
                return objV2;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objV3 = CollectionsKt.v(arrayList);
            if (objV3 != null) {
                return objV3;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (FlexibleTypesKt.a(((CallableDescriptor) function1.invoke(next)).getReturnType()));
        if (next != null) {
            return next;
        }
        Object objV4 = CollectionsKt.v(arrayList);
        if (objV4 != null) {
            return objV4;
        }
        a(84);
        throw null;
    }

    public final TypeCheckerState f(List list, List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        KotlinTypeRefiner.Default r7 = KotlinTypeRefiner.Default.f44564a;
        KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality = this.f44285a;
        KotlinTypePreparator.Default r6 = KotlinTypePreparator.Default.f44563a;
        if (zIsEmpty) {
            return new TypeCheckerState(true, true, new OverridingUtilTypeSystemContext(null, typeConstructorEquality), r6, r7);
        }
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            map.put(((TypeParameterDescriptor) list.get(i2)).h(), ((TypeParameterDescriptor) list2.get(i2)).h());
        }
        return new TypeCheckerState(true, true, new OverridingUtilTypeSystemContext(map, typeConstructorEquality), r6, r7);
    }

    public final void h(Name name, Collection collection, Collection collection2, ClassDescriptor classDescriptor, final NonReportingOverrideStrategy nonReportingOverrideStrategy) {
        Integer numB;
        if (name == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (classDescriptor == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
            if (callableMemberDescriptor == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            SmartSet smartSet = new SmartSet();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) it2.next();
                OverrideCompatibilityInfo.Result resultC = l(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).c();
                boolean z2 = !DescriptorVisibilities.e(callableMemberDescriptor2.getVisibility()) && DescriptorVisibilities.c(DescriptorVisibilities.m, callableMemberDescriptor2, callableMemberDescriptor) == null;
                int iOrdinal = resultC.ordinal();
                if (iOrdinal == 0) {
                    if (z2) {
                        smartSet.add(callableMemberDescriptor2);
                    }
                    arrayList.add(callableMemberDescriptor2);
                } else if (iOrdinal == 2) {
                    if (z2) {
                        nonReportingOverrideStrategy.c(callableMemberDescriptor2, callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor2);
                }
            }
            nonReportingOverrideStrategy.b(callableMemberDescriptor, smartSet);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            final DeclarationDescriptor declarationDescriptorD = ((CallableMemberDescriptor) linkedHashSet.iterator().next()).d();
            Function1<CallableMemberDescriptor, Boolean> function1 = new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((CallableMemberDescriptor) obj).d() == declarationDescriptorD);
                }
            };
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) function1.invoke(it3.next())).booleanValue()) {
                        LinkedList<CallableMemberDescriptor> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            final CallableMemberDescriptor callableMemberDescriptor3 = null;
                            for (CallableMemberDescriptor callableMemberDescriptor4 : linkedList) {
                                if (callableMemberDescriptor3 == null || ((numB = DescriptorVisibilities.b(callableMemberDescriptor3.getVisibility(), callableMemberDescriptor4.getVisibility())) != null && numB.intValue() < 0)) {
                                    callableMemberDescriptor3 = callableMemberDescriptor4;
                                }
                            }
                            Intrinsics.c(callableMemberDescriptor3);
                            e(g(callableMemberDescriptor3, linkedList, new AnonymousClass6(), new Function1<CallableMemberDescriptor, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    CallableMemberDescriptor second = (CallableMemberDescriptor) obj;
                                    NonReportingOverrideStrategy nonReportingOverrideStrategy2 = nonReportingOverrideStrategy;
                                    CallableMemberDescriptor callableMemberDescriptor5 = callableMemberDescriptor3;
                                    Intrinsics.f(second, "second");
                                    nonReportingOverrideStrategy2.c(callableMemberDescriptor5, second);
                                    return Unit.f43263a;
                                }
                            }), classDescriptor, nonReportingOverrideStrategy);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((CallableMemberDescriptor) it4.next()), classDescriptor, nonReportingOverrideStrategy);
        }
    }

    public final OverrideCompatibilityInfo l(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            a(19);
            throw null;
        }
        if (callableDescriptor2 != null) {
            return m(callableDescriptor, callableDescriptor2, classDescriptor, false);
        }
        a(20);
        throw null;
    }

    public final OverrideCompatibilityInfo m(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z2) {
        if (callableDescriptor == null) {
            a(22);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(23);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoN = n(callableDescriptor, callableDescriptor2, z2);
        boolean z3 = overrideCompatibilityInfoN.c() == OverrideCompatibilityInfo.Result.X;
        List<ExternalOverridabilityCondition> list = f44283b;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ExternalOverridabilityCondition.Contract contract = ExternalOverridabilityCondition.Contract.X;
            if (!zHasNext) {
                if (!z3) {
                    return overrideCompatibilityInfoN;
                }
                for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                    if (externalOverridabilityCondition.a() == contract) {
                        int iOrdinal = externalOverridabilityCondition.b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                        if (iOrdinal == 1) {
                            return OverrideCompatibilityInfo.b("External condition failed");
                        }
                        if (iOrdinal == 2) {
                            return OverrideCompatibilityInfo.d("External condition");
                        }
                    }
                }
                OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f44290b;
                if (overrideCompatibilityInfo != null) {
                    return overrideCompatibilityInfo;
                }
                OverrideCompatibilityInfo.a(0);
                throw null;
            }
            ExternalOverridabilityCondition externalOverridabilityCondition2 = (ExternalOverridabilityCondition) it.next();
            if (externalOverridabilityCondition2.a() != contract && (!z3 || externalOverridabilityCondition2.a() != ExternalOverridabilityCondition.Contract.f44281Y)) {
                int iOrdinal2 = externalOverridabilityCondition2.b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal();
                if (iOrdinal2 == 0) {
                    z3 = true;
                } else {
                    if (iOrdinal2 == 1) {
                        return OverrideCompatibilityInfo.b("External condition failed");
                    }
                    if (iOrdinal2 == 2) {
                        return OverrideCompatibilityInfo.d("External condition");
                    }
                }
            }
        }
    }

    public final OverrideCompatibilityInfo n(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z2) {
        if (callableDescriptor == null) {
            a(30);
            throw null;
        }
        if (callableDescriptor2 == null) {
            a(31);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoI = i(callableDescriptor, callableDescriptor2);
        if (overrideCompatibilityInfoI != null) {
            return overrideCompatibilityInfoI;
        }
        ArrayList arrayListD = d(callableDescriptor);
        ArrayList arrayListD2 = d(callableDescriptor2);
        List typeParameters = callableDescriptor.getTypeParameters();
        List typeParameters2 = callableDescriptor2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i2 = 0; i2 < arrayListD.size(); i2++) {
                if (!KotlinTypeChecker.f44562a.c((KotlinType) arrayListD.get(i2), (KotlinType) arrayListD2.get(i2))) {
                    return OverrideCompatibilityInfo.d("Type parameter number mismatch");
                }
            }
            return OverrideCompatibilityInfo.b("Type parameter number mismatch");
        }
        TypeCheckerState typeCheckerStateF = f(typeParameters, typeParameters2);
        for (int i3 = 0; i3 < typeParameters.size(); i3++) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) typeParameters.get(i3);
            TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) typeParameters2.get(i3);
            if (typeParameterDescriptor == null) {
                a(49);
                throw null;
            }
            if (typeParameterDescriptor2 == null) {
                a(50);
                throw null;
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (KotlinType kotlinType : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(kotlinType, (KotlinType) listIterator.next(), typeCheckerStateF));
                    listIterator.remove();
                }
            }
            return OverrideCompatibilityInfo.d("Type parameter bounds mismatch");
        }
        for (int i4 = 0; i4 < arrayListD.size(); i4++) {
            if (!b((KotlinType) arrayListD.get(i4), (KotlinType) arrayListD2.get(i4), typeCheckerStateF)) {
                return OverrideCompatibilityInfo.d("Value parameter type mismatch");
            }
        }
        if ((callableDescriptor instanceof FunctionDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && ((FunctionDescriptor) callableDescriptor).isSuspend() != ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
            return OverrideCompatibilityInfo.b("Incompatible suspendability");
        }
        if (z2) {
            KotlinType returnType = callableDescriptor.getReturnType();
            KotlinType returnType2 = callableDescriptor2.getReturnType();
            if (returnType != null && returnType2 != null && ((!KotlinTypeKt.a(returnType2) || !KotlinTypeKt.a(returnType)) && !AbstractTypeChecker.i(AbstractTypeChecker.f44488a, typeCheckerStateF, returnType2.K0(), returnType.K0()))) {
                return OverrideCompatibilityInfo.b("Return type mismatch");
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f44290b;
        if (overrideCompatibilityInfo != null) {
            return overrideCompatibilityInfo;
        }
        OverrideCompatibilityInfo.a(0);
        throw null;
    }
}
