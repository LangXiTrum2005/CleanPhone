package p002kotlin.reflect.jvm.internal.impl.load.java;

import com.ironsource.C3474d8;
import java.util.HashMap;
import java.util.Map;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.treadless;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;
import snook.competently;

/* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
/* JADX INFO: loaded from: classes5.dex */
public class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final molybdenite f30438attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final molybdenite f30439dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final molybdenite f30440saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Map<treadless, molybdenite> f30441wireman;

    /* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
    public static class attabal extends arytenoidectomy {
        public attabal(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(competently competentlyVar, kowloon kowloonVar, apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            return impassible.wireman(kowloonVar, apicalVar);
        }
    }

    /* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
    public static class dern extends arytenoidectomy {
        public dern(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(competently competentlyVar, kowloon kowloonVar, apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            return impassible.marial(competentlyVar, kowloonVar, apicalVar);
        }
    }

    /* JADX INFO: compiled from: JavaDescriptorVisibilities.java */
    public static class saneness extends arytenoidectomy {
        public saneness(treadless treadlessVar) {
            super(treadlessVar);
        }

        private static /* synthetic */ void competently(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = C3474d8.k;
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite
        public boolean marial(competently competentlyVar, kowloon kowloonVar, apical apicalVar, boolean z) {
            if (kowloonVar == null) {
                competently(0);
            }
            if (apicalVar == null) {
                competently(1);
            }
            return impassible.marial(competentlyVar, kowloonVar, apicalVar);
        }
    }

    static {
        attabal attabalVar = new attabal(lemures.attabal.f32737saneness);
        f30438attabal = attabalVar;
        saneness sanenessVar = new saneness(lemures.dern.f32738saneness);
        f30440saneness = sanenessVar;
        dern dernVar = new dern(lemures.saneness.f32739saneness);
        f30439dern = dernVar;
        f30441wireman = new HashMap();
        beachfront(attabalVar);
        beachfront(sanenessVar);
        beachfront(dernVar);
    }

    public static /* synthetic */ void attabal(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static void beachfront(molybdenite molybdeniteVar) {
        f30441wireman.put(molybdeniteVar.saneness(), molybdeniteVar);
    }

    public static molybdenite competently(treadless treadlessVar) {
        if (treadlessVar == null) {
            attabal(4);
        }
        molybdenite molybdeniteVar = f30441wireman.get(treadlessVar);
        if (molybdeniteVar != null) {
            return molybdeniteVar;
        }
        molybdenite molybdeniteVarCutely = polloi.cutely(treadlessVar);
        if (molybdeniteVarCutely == null) {
            attabal(5);
        }
        return molybdeniteVarCutely;
    }

    public static boolean marial(competently competentlyVar, kowloon kowloonVar, apical apicalVar) {
        if (kowloonVar == null) {
            attabal(0);
        }
        if (apicalVar == null) {
            attabal(1);
        }
        if (wireman(marial.grimness(kowloonVar), apicalVar)) {
            return true;
        }
        return polloi.f30207dern.marial(competentlyVar, kowloonVar, apicalVar, false);
    }

    public static boolean wireman(apical apicalVar, apical apicalVar2) {
        if (apicalVar == null) {
            attabal(2);
        }
        if (apicalVar2 == null) {
            attabal(3);
        }
        sealless seallessVar = (sealless) marial.polloi(apicalVar, sealless.class, false);
        sealless seallessVar2 = (sealless) marial.polloi(apicalVar2, sealless.class, false);
        return (seallessVar2 == null || seallessVar == null || !seallessVar.marial().equals(seallessVar2.marial())) ? false : true;
    }
}
