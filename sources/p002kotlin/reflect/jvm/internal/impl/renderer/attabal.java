package p002kotlin.reflect.jvm.internal.impl.renderer;

import byname.marial;
import byname.wireman;
import java.util.ArrayList;
import p002kotlin.collections.cuirassed;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;

/* JADX INFO: compiled from: ClassifierNamePolicy.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface attabal {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.renderer.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class C0698attabal implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0698attabal f31276attabal = new C0698attabal();

        @Override // p002kotlin.reflect.jvm.internal.impl.renderer.attabal
        public String attabal(beachfront classifier, DescriptorRenderer renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof clubfoot) {
                marial name = ((clubfoot) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.graveside(name, false);
            }
            wireman wiremanVarImpassible = p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(classifier);
            Intrinsics.checkNotNullExpressionValue(wiremanVarImpassible, "getFqName(...)");
            return renderer.molybdenite(wiremanVarImpassible);
        }
    }

    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class dern implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final dern f31277attabal = new dern();

        @Override // p002kotlin.reflect.jvm.internal.impl.renderer.attabal
        public String attabal(beachfront classifier, DescriptorRenderer renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            return saneness(classifier);
        }

        public final String dern(apical apicalVar) {
            if (apicalVar instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) {
                return saneness((beachfront) apicalVar);
            }
            if (!(apicalVar instanceof sealless)) {
                return null;
            }
            wireman wiremanVarCutely = ((sealless) apicalVar).marial().cutely();
            Intrinsics.checkNotNullExpressionValue(wiremanVarCutely, "toUnsafe(...)");
            return marial.attabal(wiremanVarCutely);
        }

        public final String saneness(beachfront beachfrontVar) {
            marial name = beachfrontVar.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String strSaneness = marial.saneness(name);
            if (beachfrontVar instanceof clubfoot) {
                return strSaneness;
            }
            apical apicalVarSaneness = beachfrontVar.saneness();
            Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
            String strDern = dern(apicalVarSaneness);
            if (strDern == null || Intrinsics.wireman(strDern, "")) {
                return strSaneness;
            }
            return strDern + '.' + strSaneness;
        }
    }

    /* JADX INFO: compiled from: ClassifierNamePolicy.kt */
    public static final class saneness implements attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f31278attabal = new saneness();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.beachfront] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.apical, kotlin.reflect.jvm.internal.impl.descriptors.yemenite] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.apical] */
        @Override // p002kotlin.reflect.jvm.internal.impl.renderer.attabal
        public String attabal(beachfront classifier, DescriptorRenderer renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof clubfoot) {
                marial name = ((clubfoot) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.graveside(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.saneness();
            } while (classifier instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman);
            return marial.dern(cuirassed.hydrovane(arrayList));
        }
    }

    String attabal(beachfront beachfrontVar, DescriptorRenderer descriptorRenderer);
}
