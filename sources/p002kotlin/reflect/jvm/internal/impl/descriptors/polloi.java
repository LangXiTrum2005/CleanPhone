package p002kotlin.reflect.jvm.internal.impl.descriptors;

import com.ironsource.C3474d8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import p002kotlin.collections.creditor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.sealless;
import p002kotlin.reflect.jvm.internal.impl.types.adultoid;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: DescriptorVisibilities.java */
/* JADX INFO: loaded from: classes5.dex */
public class polloi {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Map<molybdenite, Integer> f30201apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final p002kotlin.reflect.jvm.internal.impl.util.apical f30202arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f30203attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final molybdenite f30204beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final molybdenite f30205competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Set<molybdenite> f30206cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final molybdenite f30207dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final molybdenite f30208formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final snook.competently f30209impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final molybdenite f30210impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    @Deprecated
    public static final snook.competently f30211kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final molybdenite f30212marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final Map<treadless, molybdenite> f30213monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final molybdenite f30214saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final molybdenite f30215taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static final snook.competently f30216triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final molybdenite f30217wireman;

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class apical extends arytenoidectomy {
        public apical(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class attabal implements snook.competently {
        @Override // snook.competently
        public oilcan getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class beachfront extends arytenoidectomy {
        public beachfront(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = C3474d8.k;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public final boolean impromptu(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
            if (kowloonVar == null) {
                competently(2);
            }
            if (wiremanVar == null) {
                competently(3);
            }
            if (competentlyVar == polloi.f30211kowloon) {
                return false;
            }
            if (!(kowloonVar instanceof CallableMemberDescriptor) || (kowloonVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.cutely) || competentlyVar == polloi.f30216triweekly) {
                return true;
            }
            if (competentlyVar == polloi.f30209impassible || competentlyVar == null) {
                return false;
            }
            oilcan oilcanVarSaneness = competentlyVar instanceof snook.impromptu ? ((snook.impromptu) competentlyVar).saneness() : competentlyVar.getType();
            return p002kotlin.reflect.jvm.internal.impl.resolve.marial.restrictive(oilcanVarSaneness, wiremanVar) || adultoid.attabal(oilcanVarSaneness);
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar;
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar2 = (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) p002kotlin.reflect.jvm.internal.impl.resolve.marial.monoploid(kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman.class);
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar3 = (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) p002kotlin.reflect.jvm.internal.impl.resolve.marial.polloi(apicalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman.class, false);
            if (wiremanVar3 == null) {
                return false;
            }
            if (wiremanVar2 != null && p002kotlin.reflect.jvm.internal.impl.resolve.marial.rotuma(wiremanVar2) && (wiremanVar = (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) p002kotlin.reflect.jvm.internal.impl.resolve.marial.monoploid(wiremanVar2, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman.class)) != null && p002kotlin.reflect.jvm.internal.impl.resolve.marial.supplicat(wiremanVar3, wiremanVar)) {
                return true;
            }
            kowloon kowloonVarGrimness = p002kotlin.reflect.jvm.internal.impl.resolve.marial.grimness(kowloonVar);
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar4 = (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) p002kotlin.reflect.jvm.internal.impl.resolve.marial.monoploid(kowloonVarGrimness, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman.class);
            if (wiremanVar4 == null) {
                return false;
            }
            if (p002kotlin.reflect.jvm.internal.impl.resolve.marial.supplicat(wiremanVar3, wiremanVar4) && impromptu(competentlyVar, kowloonVarGrimness, wiremanVar3)) {
                return true;
            }
            return marial(competentlyVar, kowloonVar, wiremanVar3.saneness(), z);
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class competently extends arytenoidectomy {
        public competently(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            if (p002kotlin.reflect.jvm.internal.impl.resolve.marial.competently(apicalVar).sealless(p002kotlin.reflect.jvm.internal.impl.resolve.marial.competently(kowloonVar))) {
                return polloi.f30202arytenoidectomy.attabal(kowloonVar, apicalVar);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class cutely extends arytenoidectomy {
        public cutely(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class dern implements snook.competently {
        @Override // snook.competently
        public oilcan getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class formularize extends arytenoidectomy {
        public formularize(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class impromptu extends arytenoidectomy {
        public impromptu(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class marial extends arytenoidectomy {
        public marial(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVarMonoploid;
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            if (polloi.f30203attabal.marial(competentlyVar, kowloonVar, apicalVar, z)) {
                if (competentlyVar == polloi.f30216triweekly) {
                    return true;
                }
                if (competentlyVar != polloi.f30209impassible && (apicalVarMonoploid = p002kotlin.reflect.jvm.internal.impl.resolve.marial.monoploid(kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman.class)) != null && (competentlyVar instanceof snook.taiyuan)) {
                    return ((snook.taiyuan) competentlyVar).arytenoidectomy().attabal().equals(apicalVarMonoploid.attabal());
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class saneness implements snook.competently {
        @Override // snook.competently
        public oilcan getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class taiyuan extends arytenoidectomy {
        public taiyuan(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: compiled from: DescriptorVisibilities.java */
    public static class wireman extends arytenoidectomy {
        public wireman(treadless treadlessVar) {
            super(treadlessVar);
        }

        public static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = C3474d8.k;
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public final boolean impromptu(p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar) {
            if (apicalVar == null) {
                competently(0);
            }
            return p002kotlin.reflect.jvm.internal.impl.resolve.marial.cutely(apicalVar) != peridotite.f30200attabal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
            if (kowloonVar == 0) {
                competently(1);
            }
            if (apicalVar == null) {
                competently(2);
            }
            if (p002kotlin.reflect.jvm.internal.impl.resolve.marial.merc(kowloonVar) && impromptu(apicalVar)) {
                return polloi.beachfront(kowloonVar, apicalVar);
            }
            if (kowloonVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.cutely) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.competently competentlyVarSaneness = ((p002kotlin.reflect.jvm.internal.impl.descriptors.cutely) kowloonVar).saneness();
                if (z && p002kotlin.reflect.jvm.internal.impl.resolve.marial.kattegat(competentlyVarSaneness) && p002kotlin.reflect.jvm.internal.impl.resolve.marial.merc(competentlyVarSaneness) && (apicalVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.cutely) && p002kotlin.reflect.jvm.internal.impl.resolve.marial.merc(apicalVar.saneness()) && polloi.beachfront(kowloonVar, apicalVar)) {
                    return true;
                }
            }
            while (kowloonVar != 0) {
                kowloonVar = kowloonVar.saneness();
                if (((kowloonVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) && !p002kotlin.reflect.jvm.internal.impl.resolve.marial.rotuma(kowloonVar)) || (kowloonVar instanceof sealless)) {
                    break;
                }
            }
            if (kowloonVar == 0) {
                return false;
            }
            while (apicalVar != null) {
                if (kowloonVar == apicalVar) {
                    return true;
                }
                if (apicalVar instanceof sealless) {
                    return (kowloonVar instanceof sealless) && ((sealless) kowloonVar).marial().equals(((sealless) apicalVar).marial()) && p002kotlin.reflect.jvm.internal.impl.resolve.marial.saneness(apicalVar, kowloonVar);
                }
                apicalVar = apicalVar.saneness();
            }
            return false;
        }
    }

    static {
        wireman wiremanVar = new wireman(milliradian.marial.f30194saneness);
        f30203attabal = wiremanVar;
        marial marialVar = new marial(milliradian.beachfront.f30190saneness);
        f30214saneness = marialVar;
        beachfront beachfrontVar = new beachfront(milliradian.competently.f30191saneness);
        f30207dern = beachfrontVar;
        competently competentlyVar = new competently(milliradian.saneness.f30195saneness);
        f30217wireman = competentlyVar;
        impromptu impromptuVar = new impromptu(milliradian.impromptu.f30193saneness);
        f30212marial = impromptuVar;
        taiyuan taiyuanVar = new taiyuan(milliradian.wireman.f30197saneness);
        f30204beachfront = taiyuanVar;
        cutely cutelyVar = new cutely(milliradian.attabal.f30189saneness);
        f30205competently = cutelyVar;
        apical apicalVar = new apical(milliradian.dern.f30192saneness);
        f30210impromptu = apicalVar;
        formularize formularizeVar = new formularize(milliradian.taiyuan.f30196saneness);
        f30215taiyuan = formularizeVar;
        f30206cutely = Collections.unmodifiableSet(creditor.impromptu(wiremanVar, marialVar, competentlyVar, taiyuanVar));
        HashMap mapMarial = lyreflower.attabal.marial(4);
        mapMarial.put(marialVar, 0);
        mapMarial.put(wiremanVar, 0);
        mapMarial.put(competentlyVar, 1);
        mapMarial.put(beachfrontVar, 1);
        mapMarial.put(impromptuVar, 2);
        f30201apical = Collections.unmodifiableMap(mapMarial);
        f30208formularize = impromptuVar;
        f30209impassible = new attabal();
        f30216triweekly = new saneness();
        f30211kowloon = new dern();
        Iterator it = ServiceLoader.load(p002kotlin.reflect.jvm.internal.impl.util.apical.class, p002kotlin.reflect.jvm.internal.impl.util.apical.class.getClassLoader()).iterator();
        f30202arytenoidectomy = it.hasNext() ? (p002kotlin.reflect.jvm.internal.impl.util.apical) it.next() : kotlin.reflect.jvm.internal.impl.util.apical.attabal.f31841attabal;
        f30213monoploid = new HashMap();
        taiyuan(wiremanVar);
        taiyuan(marialVar);
        taiyuan(beachfrontVar);
        taiyuan(competentlyVar);
        taiyuan(impromptuVar);
        taiyuan(taiyuanVar);
        taiyuan(cutelyVar);
        taiyuan(apicalVar);
        taiyuan(formularizeVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    public static /* synthetic */ void attabal(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = C3474d8.k;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static boolean beachfront(p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar2) {
        if (apicalVar == null) {
            attabal(6);
        }
        if (apicalVar2 == null) {
            attabal(7);
        }
        peridotite peridotiteVarCutely = p002kotlin.reflect.jvm.internal.impl.resolve.marial.cutely(apicalVar2);
        if (peridotiteVarCutely != peridotite.f30200attabal) {
            return peridotiteVarCutely.equals(p002kotlin.reflect.jvm.internal.impl.resolve.marial.cutely(apicalVar));
        }
        return false;
    }

    public static boolean competently(molybdenite molybdeniteVar) {
        if (molybdeniteVar == null) {
            attabal(14);
        }
        return molybdeniteVar == f30203attabal || molybdeniteVar == f30214saneness;
    }

    public static molybdenite cutely(treadless treadlessVar) {
        if (treadlessVar == null) {
            attabal(15);
        }
        molybdenite molybdeniteVar = f30213monoploid.get(treadlessVar);
        if (molybdeniteVar != null) {
            return molybdeniteVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + treadlessVar);
    }

    public static boolean impromptu(kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
        if (kowloonVar == null) {
            attabal(2);
        }
        if (apicalVar == null) {
            attabal(3);
        }
        return marial(f30216triweekly, kowloonVar, apicalVar, z) == null;
    }

    public static kowloon marial(snook.competently competentlyVar, kowloon kowloonVar, p002kotlin.reflect.jvm.internal.impl.descriptors.apical apicalVar, boolean z) {
        kowloon kowloonVarMarial;
        if (kowloonVar == null) {
            attabal(8);
        }
        if (apicalVar == null) {
            attabal(9);
        }
        for (kowloon kowloonVar2 = (kowloon) kowloonVar.attabal(); kowloonVar2 != null && kowloonVar2.getVisibility() != f30204beachfront; kowloonVar2 = (kowloon) p002kotlin.reflect.jvm.internal.impl.resolve.marial.monoploid(kowloonVar2, kowloon.class)) {
            if (!kowloonVar2.getVisibility().marial(competentlyVar, kowloonVar2, apicalVar, z)) {
                return kowloonVar2;
            }
        }
        if (!(kowloonVar instanceof sealless) || (kowloonVarMarial = marial(competentlyVar, ((sealless) kowloonVar).saran(), apicalVar, z)) == null) {
            return null;
        }
        return kowloonVarMarial;
    }

    public static void taiyuan(molybdenite molybdeniteVar) {
        f30213monoploid.put(molybdeniteVar.saneness(), molybdeniteVar);
    }

    public static Integer wireman(molybdenite molybdeniteVar, molybdenite molybdeniteVar2) {
        if (molybdeniteVar == null) {
            attabal(12);
        }
        if (molybdeniteVar2 == null) {
            attabal(13);
        }
        Integer numAttabal = molybdeniteVar.attabal(molybdeniteVar2);
        if (numAttabal != null) {
            return numAttabal;
        }
        Integer numAttabal2 = molybdeniteVar2.attabal(molybdeniteVar);
        if (numAttabal2 != null) {
            return Integer.valueOf(-numAttabal2.intValue());
        }
        return null;
    }
}
