package p002kotlin.reflect.jvm.internal.impl.resolve;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
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
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cord;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import p002kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p002kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;

/* JADX INFO: loaded from: classes5.dex */
public class OverridingUtil {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final OverridingUtil f31285beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.types.checker.marial.attabal f31286competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final List<ExternalOverridabilityCondition> f31287marial = CollectionsKt.molet(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront f31288attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.checker.marial.attabal f31289dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final KotlinTypePreparator f31290saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Function2<oilcan, oilcan, Boolean> f31291wireman;

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final OverrideCompatibilityInfo f31292dern = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Result f31293attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f31294saneness;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                attabal(3);
            }
            if (str == null) {
                attabal(4);
            }
            this.f31293attabal = result;
            this.f31294saneness = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        public static /* synthetic */ void attabal(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
            if (i == 1 || i == 2) {
                objArr[0] = "debugMessage";
            } else if (i == 3) {
                objArr[0] = "success";
            } else if (i != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i) {
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
            if (i == 1) {
                objArr[2] = "incompatible";
            } else if (i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        public static OverrideCompatibilityInfo marial() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f31292dern;
            if (overrideCompatibilityInfo == null) {
                attabal(0);
            }
            return overrideCompatibilityInfo;
        }

        public static OverrideCompatibilityInfo saneness(String str) {
            if (str == null) {
                attabal(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public static OverrideCompatibilityInfo wireman(String str) {
            if (str == null) {
                attabal(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public Result dern() {
            Result result = this.f31293attabal;
            if (result == null) {
                attabal(5);
            }
            return result;
        }
    }

    public static class attabal implements kotlin.reflect.jvm.internal.impl.types.checker.marial.attabal {
        public static /* synthetic */ void saneness(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.marial.attabal
        public boolean attabal(permissivist permissivistVar, permissivist permissivistVar2) {
            if (permissivistVar == null) {
                saneness(0);
            }
            if (permissivistVar2 == null) {
                saneness(1);
            }
            return permissivistVar.equals(permissivistVar2);
        }
    }

    public static class competently implements Function1<CallableMemberDescriptor, Unit> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ CallableMemberDescriptor f31296arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ taiyuan f31297kowloon;

        public competently(taiyuan taiyuanVar, CallableMemberDescriptor callableMemberDescriptor) {
            this.f31297kowloon = taiyuanVar;
            this.f31296arytenoidectomy = callableMemberDescriptor;
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
            this.f31297kowloon.saneness(this.f31296arytenoidectomy, callableMemberDescriptor);
            return Unit.f29295attabal;
        }
    }

    public static class dern implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ apical f31298kowloon;

        public dern(apical apicalVar) {
            this.f31298kowloon = apicalVar;
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return Boolean.valueOf(callableMemberDescriptor.saneness() == this.f31298kowloon);
        }
    }

    public static /* synthetic */ class impromptu {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31299attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final /* synthetic */ int[] f31300dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f31301saneness;

        static {
            int[] iArr = new int[Modality.values().length];
            f31300dern = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31300dern[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31300dern[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31300dern[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f31301saneness = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31301saneness[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31301saneness[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f31299attabal = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f31299attabal[ExternalOverridabilityCondition.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f31299attabal[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f31299attabal[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class marial implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ p002kotlin.reflect.jvm.internal.impl.descriptors.wireman f31302kowloon;

        public marial(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
            this.f31302kowloon = wiremanVar;
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z = false;
            if (!polloi.competently(callableMemberDescriptor.getVisibility()) && polloi.impromptu(callableMemberDescriptor, this.f31302kowloon, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    public static class saneness<D> implements Function2<D, D, Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal>> {
        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Lkotlin/Pair<Lkotlin/reflect/jvm/internal/impl/descriptors/attabal;Lkotlin/reflect/jvm/internal/impl/descriptors/attabal;>; */
        @Override // p002kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public Pair invoke(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2) {
            return new Pair(attabalVar, attabalVar2);
        }
    }

    static {
        attabal attabalVar = new attabal();
        f31286competently = attabalVar;
        f31285beachfront = new OverridingUtil(attabalVar, kotlin.reflect.jvm.internal.impl.types.checker.beachfront.attabal.f31721attabal, KotlinTypePreparator.attabal.f31707attabal, null);
    }

    public OverridingUtil(kotlin.reflect.jvm.internal.impl.types.checker.marial.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront beachfrontVar, KotlinTypePreparator kotlinTypePreparator, Function2<oilcan, oilcan, Boolean> function2) {
        if (attabalVar == null) {
            attabal(5);
        }
        if (beachfrontVar == null) {
            attabal(6);
        }
        if (kotlinTypePreparator == null) {
            attabal(7);
        }
        this.f31289dern = attabalVar;
        this.f31288attabal = beachfrontVar;
        this.f31290saneness = kotlinTypePreparator;
        this.f31291wireman = function2;
    }

    public static molybdenite adultoid(Collection<? extends CallableMemberDescriptor> collection2) {
        molybdenite molybdeniteVar;
        if (collection2 == null) {
            attabal(109);
        }
        if (collection2.isEmpty()) {
            return polloi.f30208formularize;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
        loop0: while (true) {
            molybdeniteVar = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                molybdenite visibility = it.next().getVisibility();
                if (molybdeniteVar != null) {
                    Integer numWireman = polloi.wireman(visibility, molybdeniteVar);
                    if (numWireman == null) {
                        break;
                    }
                    if (numWireman.intValue() > 0) {
                    }
                }
                molybdeniteVar = visibility;
            }
        }
        if (molybdeniteVar == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection2.iterator();
        while (it2.hasNext()) {
            Integer numWireman2 = polloi.wireman(molybdeniteVar, it2.next().getVisibility());
            if (numWireman2 == null || numWireman2.intValue() < 0) {
                return null;
            }
        }
        return molybdeniteVar;
    }

    public static void apical(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, Collection<CallableMemberDescriptor> collection2, taiyuan taiyuanVar) {
        if (wiremanVar == null) {
            attabal(64);
        }
        if (collection2 == null) {
            attabal(65);
        }
        if (taiyuanVar == null) {
            attabal(66);
        }
        if (saneness(collection2)) {
            Iterator<CallableMemberDescriptor> it = collection2.iterator();
            while (it.hasNext()) {
                cutely(Collections.singleton(it.next()), wiremanVar, taiyuanVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection2);
            while (!linkedList.isEmpty()) {
                cutely(monoploid(arytenoidectomy.attabal(linkedList), linkedList, taiyuanVar), wiremanVar, taiyuanVar);
            }
        }
    }

    public static <H> Collection<H> arytenoidectomy(H h, Collection<H> collection2, Function1<H, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> function1, Function1<H, Unit> function2) {
        if (h == null) {
            attabal(99);
        }
        if (collection2 == null) {
            attabal(100);
        }
        if (function1 == null) {
            attabal(101);
        }
        if (function2 == null) {
            attabal(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarInvoke = function1.invoke(h);
        Iterator<H> it = collection2.iterator();
        while (it.hasNext()) {
            H next = it.next();
            p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarInvoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultRotuma = rotuma(attabalVarInvoke, attabalVarInvoke2);
                if (resultRotuma == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultRotuma == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 95 && i != 98 && i != 103 && i != 44 && i != 45) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
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
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 95 && i != 98 && i != 103 && i != 44 && i != 45) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
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
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
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
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = X3.f.e;
                break;
            case 57:
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
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B;
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
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
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 44 && i != 45) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
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
                            switch (i) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 90:
                                        case 91:
                                        case 92:
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
        switch (i) {
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
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
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
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
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
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
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
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 95 && i != 98 && i != 103 && i != 44 && i != 45) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i) {
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
                            switch (i) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i) {
                                        case 90:
                                        case 91:
                                        case 92:
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

    public static void beachfront(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            attabal(17);
        }
        if (set == null) {
            attabal(18);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.wireman().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.wireman().iterator();
        while (it.hasNext()) {
            beachfront(it.next(), set);
        }
    }

    public static List<oilcan> competently(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar) {
        starveling starvelingVarPolder = attabalVar.polder();
        ArrayList arrayList = new ArrayList();
        if (starvelingVarPolder != null) {
            arrayList.add(starvelingVarPolder.getType());
        }
        Iterator<cultivated> it = attabalVar.beachfront().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    public static Set<CallableMemberDescriptor> cord(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            attabal(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        beachfront(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean cuirassed(grimness grimnessVar, grimness grimnessVar2) {
        if (grimnessVar == null || grimnessVar2 == null) {
            return true;
        }
        return supplicat(grimnessVar, grimnessVar2);
    }

    public static void cutely(Collection<CallableMemberDescriptor> collection2, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, taiyuan taiyuanVar) {
        if (collection2 == null) {
            attabal(85);
        }
        if (wiremanVar == null) {
            attabal(86);
        }
        if (taiyuanVar == null) {
            attabal(87);
        }
        Collection<CallableMemberDescriptor> collectionGraveside = graveside(wiremanVar, collection2);
        boolean zIsEmpty = collectionGraveside.isEmpty();
        if (!zIsEmpty) {
            collection2 = collectionGraveside;
        }
        CallableMemberDescriptor callableMemberDescriptorMerc = ((CallableMemberDescriptor) seminary(collection2, new wireman())).merc(wiremanVar, triweekly(collection2, wiremanVar), zIsEmpty ? polloi.f30210impromptu : polloi.f30205competently, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        taiyuanVar.wireman(callableMemberDescriptorMerc, collection2);
        taiyuanVar.attabal(callableMemberDescriptorMerc);
    }

    public static boolean dern(clubfoot clubfootVar, clubfoot clubfootVar2, TypeCheckerState typeCheckerState) {
        if (clubfootVar == null) {
            attabal(49);
        }
        if (clubfootVar2 == null) {
            attabal(50);
        }
        if (typeCheckerState == null) {
            attabal(51);
        }
        List<oilcan> upperBounds = clubfootVar.getUpperBounds();
        ArrayList arrayList = new ArrayList(clubfootVar2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (oilcan oilcanVar : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (wireman(oilcanVar, (oilcan) listIterator.next(), typeCheckerState)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    public static OverrideCompatibilityInfo gintrap(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2) {
        boolean z;
        if (attabalVar == null) {
            attabal(40);
        }
        if (attabalVar2 == null) {
            attabal(41);
        }
        boolean z2 = attabalVar instanceof dovishness;
        if ((z2 && !(attabalVar2 instanceof dovishness)) || (((z = attabalVar instanceof saran)) && !(attabalVar2 instanceof saran))) {
            return OverrideCompatibilityInfo.wireman("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + attabalVar);
        }
        if (!attabalVar.getName().equals(attabalVar2.getName())) {
            return OverrideCompatibilityInfo.wireman("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoMarial = marial(attabalVar, attabalVar2);
        if (overrideCompatibilityInfoMarial != null) {
            return overrideCompatibilityInfoMarial;
        }
        return null;
    }

    public static Collection<CallableMemberDescriptor> graveside(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, Collection<CallableMemberDescriptor> collection2) {
        if (wiremanVar == null) {
            attabal(96);
        }
        if (collection2 == null) {
            attabal(97);
        }
        List listMilliradian = CollectionsKt.milliradian(collection2, new marial(wiremanVar));
        if (listMilliradian == null) {
            attabal(98);
        }
        return listMilliradian;
    }

    public static OverridingUtil impassible(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront beachfrontVar) {
        if (beachfrontVar == null) {
            attabal(0);
        }
        return new OverridingUtil(f31286competently, beachfrontVar, KotlinTypePreparator.attabal.f31707attabal, null);
    }

    public static molybdenite impromptu(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            attabal(108);
        }
        Collection<? extends CallableMemberDescriptor> collectionWireman = callableMemberDescriptor.wireman();
        molybdenite molybdeniteVarAdultoid = adultoid(collectionWireman);
        if (molybdeniteVarAdultoid == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return molybdeniteVarAdultoid.beachfront();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collectionWireman) {
            if (callableMemberDescriptor2.kowloon() != Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(molybdeniteVarAdultoid)) {
                return null;
            }
        }
        return molybdeniteVarAdultoid;
    }

    public static boolean kattegat(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, oilcan oilcanVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2, oilcan oilcanVar2, TypeCheckerState typeCheckerState) {
        if (attabalVar == null) {
            attabal(73);
        }
        if (oilcanVar == null) {
            attabal(74);
        }
        if (attabalVar2 == null) {
            attabal(75);
        }
        if (oilcanVar2 == null) {
            attabal(76);
        }
        if (typeCheckerState == null) {
            attabal(77);
        }
        return AbstractTypeChecker.f31648attabal.polloi(typeCheckerState, oilcanVar.homozygous(), oilcanVar2.homozygous());
    }

    public static OverrideCompatibilityInfo marial(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2) {
        if ((attabalVar.polder() == null) != (attabalVar2.polder() == null)) {
            return OverrideCompatibilityInfo.wireman("Receiver presence mismatch");
        }
        if (attabalVar.beachfront().size() != attabalVar2.beachfront().size()) {
            return OverrideCompatibilityInfo.wireman("Value parameter number mismatch");
        }
        return null;
    }

    public static <D extends p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> boolean merc(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            attabal(13);
        }
        if (d2 == null) {
            attabal(14);
        }
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.f31282attabal.beachfront(d.attabal(), d2.attabal(), z, z2)) {
            return true;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarAttabal = d2.attabal();
        Iterator it = p002kotlin.reflect.jvm.internal.impl.resolve.marial.wireman(d).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.f31282attabal.beachfront(attabalVarAttabal, (p002kotlin.reflect.jvm.internal.impl.descriptors.attabal) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    public static <D> Set<D> molybdenite(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal>> function2) {
        if (set == null) {
            attabal(9);
        }
        if (function2 == null) {
            attabal(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                Pair<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> pairInvoke = function2.invoke(obj, (Object) it.next());
                p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarComponent1 = pairInvoke.component1();
                p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarComponent2 = pairInvoke.component2();
                if (!merc(attabalVarComponent1, attabalVarComponent2, z, true)) {
                    if (merc(attabalVarComponent2, attabalVarComponent1, z, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<CallableMemberDescriptor> monoploid(CallableMemberDescriptor callableMemberDescriptor, Queue<CallableMemberDescriptor> queue, taiyuan taiyuanVar) {
        if (callableMemberDescriptor == null) {
            attabal(104);
        }
        if (queue == null) {
            attabal(105);
        }
        if (taiyuanVar == null) {
            attabal(106);
        }
        return arytenoidectomy(callableMemberDescriptor, queue, new beachfront(), new competently(taiyuanVar, callableMemberDescriptor));
    }

    public static void polder(CallableMemberDescriptor callableMemberDescriptor, Function1<CallableMemberDescriptor, Unit> function1) {
        molybdenite molybdeniteVar;
        if (callableMemberDescriptor == null) {
            attabal(107);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.wireman()) {
            if (callableMemberDescriptor2.getVisibility() == polloi.f30205competently) {
                polder(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != polloi.f30205competently) {
            return;
        }
        molybdenite molybdeniteVarImpromptu = impromptu(callableMemberDescriptor);
        if (molybdeniteVarImpromptu == null) {
            if (function1 != null) {
                function1.invoke(callableMemberDescriptor);
            }
            molybdeniteVar = polloi.f30212marial;
        } else {
            molybdeniteVar = molybdeniteVarImpromptu;
        }
        if (callableMemberDescriptor instanceof cord) {
            ((cord) callableMemberDescriptor).cosy(molybdeniteVar);
            Iterator<grimness> it = ((saran) callableMemberDescriptor).molybdenite().iterator();
            while (it.hasNext()) {
                polder(it.next(), molybdeniteVarImpromptu == null ? null : function1);
            }
            return;
        }
        if (callableMemberDescriptor instanceof kowloon) {
            ((kowloon) callableMemberDescriptor).linendraper(molybdeniteVar);
            return;
        }
        preprohormone preprohormoneVar = (preprohormone) callableMemberDescriptor;
        preprohormoneVar.attendance(molybdeniteVar);
        if (molybdeniteVar != preprohormoneVar.starveling().getVisibility()) {
            preprohormoneVar.setterwort(false);
        }
    }

    public static <D extends p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> Set<D> polloi(Set<D> set) {
        if (set == null) {
            attabal(8);
        }
        return molybdenite(set, !set.isEmpty() && DescriptorUtilsKt.dovishness(DescriptorUtilsKt.arytenoidectomy(set.iterator().next())), null, new saneness());
    }

    public static Modality preprohormone(Collection<CallableMemberDescriptor> collection2, boolean z, Modality modality) {
        if (collection2 == null) {
            attabal(93);
        }
        if (modality == null) {
            attabal(94);
        }
        Modality modality2 = Modality.ABSTRACT;
        for (CallableMemberDescriptor callableMemberDescriptor : collection2) {
            Modality modalityKowloon = (z && callableMemberDescriptor.kowloon() == Modality.ABSTRACT) ? modality : callableMemberDescriptor.kowloon();
            if (modalityKowloon.compareTo(modality2) < 0) {
                modality2 = modalityKowloon;
            }
        }
        if (modality2 == null) {
            attabal(95);
        }
        return modality2;
    }

    public static boolean restrictive(p002kotlin.reflect.jvm.internal.impl.descriptors.cord cordVar, p002kotlin.reflect.jvm.internal.impl.descriptors.cord cordVar2, boolean z) {
        if (cordVar == null) {
            attabal(57);
        }
        if (cordVar2 == null) {
            attabal(58);
        }
        return !polloi.competently(cordVar2.getVisibility()) && polloi.impromptu(cordVar2, cordVar, z);
    }

    public static OverrideCompatibilityInfo.Result rotuma(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2) {
        OverridingUtil overridingUtil = f31285beachfront;
        OverrideCompatibilityInfo.Result resultDern = overridingUtil.oilcan(attabalVar2, attabalVar, null).dern();
        OverrideCompatibilityInfo.Result resultDern2 = overridingUtil.oilcan(attabalVar, attabalVar2, null).dern();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (resultDern == result && resultDern2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (resultDern == result2 || resultDern2 == result2) ? result2 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    public static boolean saneness(Collection<CallableMemberDescriptor> collection2) {
        if (collection2 == null) {
            attabal(63);
        }
        if (collection2.size() < 2) {
            return true;
        }
        return CollectionsKt.overspeculate(collection2, new dern(collection2.iterator().next().saneness()));
    }

    public static <H> H seminary(Collection<H> collection2, Function1<H, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> function1) {
        H h;
        if (collection2 == null) {
            attabal(78);
        }
        if (function1 == null) {
            attabal(79);
        }
        if (collection2.size() == 1) {
            H h2 = (H) CollectionsKt.coffeecake(collection2);
            if (h2 == null) {
                attabal(80);
            }
            return h2;
        }
        ArrayList arrayList = new ArrayList(2);
        List listPalmyra = CollectionsKt.palmyra(collection2, function1);
        H h3 = (H) CollectionsKt.coffeecake(collection2);
        p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarInvoke = function1.invoke(h3);
        for (H h4 : collection2) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarInvoke2 = function1.invoke(h4);
            if (trm(attabalVarInvoke2, listPalmyra)) {
                arrayList.add(h4);
            }
            if (stratoscope(attabalVarInvoke2, attabalVarInvoke) && !stratoscope(attabalVarInvoke, attabalVarInvoke2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                attabal(81);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) CollectionsKt.coffeecake(arrayList);
            if (h5 == null) {
                attabal(82);
            }
            return h5;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                h = null;
                break;
            }
            h = (H) it.next();
        } while (stratoscope.saneness(function1.invoke(h).getReturnType()));
        if (h != null) {
            return h;
        }
        H h6 = (H) CollectionsKt.coffeecake(arrayList);
        if (h6 == null) {
            attabal(84);
        }
        return h6;
    }

    public static boolean stratoscope(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2) {
        if (attabalVar == null) {
            attabal(67);
        }
        if (attabalVar2 == null) {
            attabal(68);
        }
        oilcan returnType = attabalVar.getReturnType();
        oilcan returnType2 = attabalVar2.getReturnType();
        if (!supplicat(attabalVar, attabalVar2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateFormularize = f31285beachfront.formularize(attabalVar.getTypeParameters(), attabalVar2.getTypeParameters());
        if (attabalVar instanceof dovishness) {
            return kattegat(attabalVar, returnType, attabalVar2, returnType2, typeCheckerStateFormularize);
        }
        if (!(attabalVar instanceof saran)) {
            throw new IllegalArgumentException("Unexpected callable: " + attabalVar.getClass());
        }
        saran saranVar = (saran) attabalVar;
        saran saranVar2 = (saran) attabalVar2;
        if (!cuirassed(saranVar.getSetter(), saranVar2.getSetter())) {
            return false;
        }
        if (saranVar.restrictive() && saranVar2.restrictive()) {
            return AbstractTypeChecker.f31648attabal.apical(typeCheckerStateFormularize, returnType.homozygous(), returnType2.homozygous());
        }
        return (saranVar.restrictive() || !saranVar2.restrictive()) && kattegat(attabalVar, returnType, attabalVar2, returnType2, typeCheckerStateFormularize);
    }

    public static boolean supplicat(p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon kowloonVar2) {
        if (kowloonVar == null) {
            attabal(69);
        }
        if (kowloonVar2 == null) {
            attabal(70);
        }
        Integer numWireman = polloi.wireman(kowloonVar.getVisibility(), kowloonVar2.getVisibility());
        return numWireman == null || numWireman.intValue() >= 0;
    }

    public static OverridingUtil taiyuan(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront beachfrontVar, kotlin.reflect.jvm.internal.impl.types.checker.marial.attabal attabalVar) {
        if (beachfrontVar == null) {
            attabal(3);
        }
        if (attabalVar == null) {
            attabal(4);
        }
        return new OverridingUtil(attabalVar, beachfrontVar, KotlinTypePreparator.attabal.f31707attabal, null);
    }

    public static Modality triweekly(Collection<CallableMemberDescriptor> collection2, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (collection2 == null) {
            attabal(88);
        }
        if (wiremanVar == null) {
            attabal(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (CallableMemberDescriptor callableMemberDescriptor : collection2) {
            int i = impromptu.f31300dern[callableMemberDescriptor.kowloon().ordinal()];
            if (i == 1) {
                Modality modality = Modality.FINAL;
                if (modality == null) {
                    attabal(90);
                }
                return modality;
            }
            if (i == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
            }
            if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (wiremanVar.coffeecake() && wiremanVar.kowloon() != Modality.ABSTRACT && wiremanVar.kowloon() != Modality.SEALED) {
            z = true;
        }
        if (z2 && !z3) {
            Modality modality2 = Modality.OPEN;
            if (modality2 == null) {
                attabal(91);
            }
            return modality2;
        }
        if (!z2 && z3) {
            Modality modalityKowloon = z ? wiremanVar.kowloon() : Modality.ABSTRACT;
            if (modalityKowloon == null) {
                attabal(92);
            }
            return modalityKowloon;
        }
        HashSet hashSet = new HashSet();
        Iterator<CallableMemberDescriptor> it = collection2.iterator();
        while (it.hasNext()) {
            hashSet.addAll(cord(it.next()));
        }
        return preprohormone(polloi(hashSet), z, wiremanVar.kowloon());
    }

    public static boolean trm(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, Collection<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> collection2) {
        if (attabalVar == null) {
            attabal(71);
        }
        if (collection2 == null) {
            attabal(72);
        }
        Iterator<p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> it = collection2.iterator();
        while (it.hasNext()) {
            if (!stratoscope(attabalVar, it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean wireman(oilcan oilcanVar, oilcan oilcanVar2, TypeCheckerState typeCheckerState) {
        if (oilcanVar == null) {
            attabal(46);
        }
        if (oilcanVar2 == null) {
            attabal(47);
        }
        if (typeCheckerState == null) {
            attabal(48);
        }
        if (yemenite.attabal(oilcanVar) && yemenite.attabal(oilcanVar2)) {
            return true;
        }
        return AbstractTypeChecker.f31648attabal.apical(typeCheckerState, oilcanVar.homozygous(), oilcanVar2.homozygous());
    }

    public void dovishness(byname.marial marialVar, Collection<? extends CallableMemberDescriptor> collection2, Collection<? extends CallableMemberDescriptor> collection3, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, taiyuan taiyuanVar) {
        if (marialVar == null) {
            attabal(52);
        }
        if (collection2 == null) {
            attabal(53);
        }
        if (collection3 == null) {
            attabal(54);
        }
        if (wiremanVar == null) {
            attabal(55);
        }
        if (taiyuanVar == null) {
            attabal(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection2);
        Iterator<? extends CallableMemberDescriptor> it = collection3.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(kowloon(it.next(), collection2, wiremanVar, taiyuanVar));
        }
        apical(wiremanVar, linkedHashSet, taiyuanVar);
    }

    public final TypeCheckerState formularize(List<clubfoot> list, List<clubfoot> list2) {
        if (list == null) {
            attabal(42);
        }
        if (list2 == null) {
            attabal(43);
        }
        if (list.isEmpty()) {
            TypeCheckerState typeCheckerState = new cutely(null, this.f31289dern, this.f31288attabal, this.f31290saneness, this.f31291wireman).setterwort(true, true);
            if (typeCheckerState == null) {
                attabal(44);
            }
            return typeCheckerState;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).impromptu(), list2.get(i).impromptu());
        }
        TypeCheckerState typeCheckerState2 = new cutely(map, this.f31289dern, this.f31288attabal, this.f31290saneness, this.f31291wireman).setterwort(true, true);
        if (typeCheckerState2 == null) {
            attabal(45);
        }
        return typeCheckerState2;
    }

    public final Collection<CallableMemberDescriptor> kowloon(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection2, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, taiyuan taiyuanVar) {
        if (callableMemberDescriptor == null) {
            attabal(59);
        }
        if (collection2 == null) {
            attabal(60);
        }
        if (wiremanVar == null) {
            attabal(61);
        }
        if (taiyuanVar == null) {
            attabal(62);
        }
        ArrayList arrayList = new ArrayList(collection2.size());
        lyreflower.beachfront beachfrontVarSaneness = lyreflower.beachfront.saneness();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection2) {
            OverrideCompatibilityInfo.Result resultDern = oilcan(callableMemberDescriptor2, callableMemberDescriptor, wiremanVar).dern();
            boolean zRestrictive = restrictive(callableMemberDescriptor, callableMemberDescriptor2, false);
            int i = impromptu.f31301saneness[resultDern.ordinal()];
            if (i == 1) {
                if (zRestrictive) {
                    beachfrontVarSaneness.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i == 2) {
                if (zRestrictive) {
                    taiyuanVar.dern(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        taiyuanVar.wireman(callableMemberDescriptor, beachfrontVarSaneness);
        return arrayList;
    }

    public OverrideCompatibilityInfo oilcan(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        if (attabalVar == null) {
            attabal(19);
        }
        if (attabalVar2 == null) {
            attabal(20);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoYemenite = yemenite(attabalVar, attabalVar2, wiremanVar, false);
        if (overrideCompatibilityInfoYemenite == null) {
            attabal(21);
        }
        return overrideCompatibilityInfoYemenite;
    }

    public OverrideCompatibilityInfo sealless(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2, boolean z) {
        if (attabalVar == null) {
            attabal(30);
        }
        if (attabalVar2 == null) {
            attabal(31);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoGintrap = gintrap(attabalVar, attabalVar2);
        if (overrideCompatibilityInfoGintrap != null) {
            return overrideCompatibilityInfoGintrap;
        }
        List<oilcan> listCompetently = competently(attabalVar);
        List<oilcan> listCompetently2 = competently(attabalVar2);
        List<clubfoot> typeParameters = attabalVar.getTypeParameters();
        List<clubfoot> typeParameters2 = attabalVar2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < listCompetently.size()) {
                if (!p002kotlin.reflect.jvm.internal.impl.types.checker.marial.f31734attabal.saneness(listCompetently.get(i), listCompetently2.get(i))) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoWireman = OverrideCompatibilityInfo.wireman("Type parameter number mismatch");
                    if (overrideCompatibilityInfoWireman == null) {
                        attabal(33);
                    }
                    return overrideCompatibilityInfoWireman;
                }
                i++;
            }
            OverrideCompatibilityInfo overrideCompatibilityInfoSaneness = OverrideCompatibilityInfo.saneness("Type parameter number mismatch");
            if (overrideCompatibilityInfoSaneness == null) {
                attabal(34);
            }
            return overrideCompatibilityInfoSaneness;
        }
        TypeCheckerState typeCheckerStateFormularize = formularize(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!dern(typeParameters.get(i2), typeParameters2.get(i2), typeCheckerStateFormularize)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoWireman2 = OverrideCompatibilityInfo.wireman("Type parameter bounds mismatch");
                if (overrideCompatibilityInfoWireman2 == null) {
                    attabal(35);
                }
                return overrideCompatibilityInfoWireman2;
            }
        }
        while (i < listCompetently.size()) {
            if (!wireman(listCompetently.get(i), listCompetently2.get(i), typeCheckerStateFormularize)) {
                OverrideCompatibilityInfo overrideCompatibilityInfoWireman3 = OverrideCompatibilityInfo.wireman("Value parameter type mismatch");
                if (overrideCompatibilityInfoWireman3 == null) {
                    attabal(36);
                }
                return overrideCompatibilityInfoWireman3;
            }
            i++;
        }
        if ((attabalVar instanceof dovishness) && (attabalVar2 instanceof dovishness) && ((dovishness) attabalVar).isSuspend() != ((dovishness) attabalVar2).isSuspend()) {
            OverrideCompatibilityInfo overrideCompatibilityInfoSaneness2 = OverrideCompatibilityInfo.saneness("Incompatible suspendability");
            if (overrideCompatibilityInfoSaneness2 == null) {
                attabal(37);
            }
            return overrideCompatibilityInfoSaneness2;
        }
        if (z) {
            oilcan returnType = attabalVar.getReturnType();
            oilcan returnType2 = attabalVar2.getReturnType();
            if (returnType != null && returnType2 != null && ((!yemenite.attabal(returnType2) || !yemenite.attabal(returnType)) && !AbstractTypeChecker.f31648attabal.polloi(typeCheckerStateFormularize, returnType2.homozygous(), returnType.homozygous()))) {
                OverrideCompatibilityInfo overrideCompatibilityInfoSaneness3 = OverrideCompatibilityInfo.saneness("Return type mismatch");
                if (overrideCompatibilityInfoSaneness3 == null) {
                    attabal(38);
                }
                return overrideCompatibilityInfoSaneness3;
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoMarial = OverrideCompatibilityInfo.marial();
        if (overrideCompatibilityInfoMarial == null) {
            attabal(39);
        }
        return overrideCompatibilityInfoMarial;
    }

    public OverrideCompatibilityInfo yemenite(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar2, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar, boolean z) {
        if (attabalVar == null) {
            attabal(22);
        }
        if (attabalVar2 == null) {
            attabal(23);
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoSealless = sealless(attabalVar, attabalVar2, z);
        boolean z2 = overrideCompatibilityInfoSealless.dern() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : f31287marial) {
            if (externalOverridabilityCondition.attabal() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.attabal() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = impromptu.f31299attabal[externalOverridabilityCondition.saneness(attabalVar, attabalVar2, wiremanVar).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else {
                    if (i == 2) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoSaneness = OverrideCompatibilityInfo.saneness("External condition failed");
                        if (overrideCompatibilityInfoSaneness == null) {
                            attabal(24);
                        }
                        return overrideCompatibilityInfoSaneness;
                    }
                    if (i == 3) {
                        OverrideCompatibilityInfo overrideCompatibilityInfoWireman = OverrideCompatibilityInfo.wireman("External condition");
                        if (overrideCompatibilityInfoWireman == null) {
                            attabal(25);
                        }
                        return overrideCompatibilityInfoWireman;
                    }
                }
            }
        }
        if (!z2) {
            return overrideCompatibilityInfoSealless;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : f31287marial) {
            if (externalOverridabilityCondition2.attabal() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = impromptu.f31299attabal[externalOverridabilityCondition2.saneness(attabalVar, attabalVar2, wiremanVar).ordinal()];
                if (i2 == 1) {
                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i2 == 2) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoSaneness2 = OverrideCompatibilityInfo.saneness("External condition failed");
                    if (overrideCompatibilityInfoSaneness2 == null) {
                        attabal(27);
                    }
                    return overrideCompatibilityInfoSaneness2;
                }
                if (i2 == 3) {
                    OverrideCompatibilityInfo overrideCompatibilityInfoWireman2 = OverrideCompatibilityInfo.wireman("External condition");
                    if (overrideCompatibilityInfoWireman2 == null) {
                        attabal(28);
                    }
                    return overrideCompatibilityInfoWireman2;
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoMarial = OverrideCompatibilityInfo.marial();
        if (overrideCompatibilityInfoMarial == null) {
            attabal(29);
        }
        return overrideCompatibilityInfoMarial;
    }

    public static class beachfront implements Function1<CallableMemberDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> {
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public p002kotlin.reflect.jvm.internal.impl.descriptors.attabal invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    public static class wireman implements Function1<CallableMemberDescriptor, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> {
        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }
}
