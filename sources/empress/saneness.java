package empress;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: BasicMeasure.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.wireman f25680dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ArrayList<ConstraintWidget> f25679attabal = new ArrayList<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public attabal f25681saneness = new attabal();

    /* JADX INFO: compiled from: BasicMeasure.java */
    public static class attabal {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public static int f25682apical = 0;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public static int f25683formularize = 1;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public static int f25684impassible = 2;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f25685attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f25686beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f25687competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f25688cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f25689dern;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public boolean f25690impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f25691marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ConstraintWidget.DimensionBehaviour f25692saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public boolean f25693taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f25694wireman;
    }

    /* JADX INFO: renamed from: empress.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BasicMeasure.java */
    public interface InterfaceC0598saneness {
        void attabal();

        void saneness(ConstraintWidget constraintWidget, attabal attabalVar);
    }

    public saneness(androidx.constraintlayout.core.widgets.wireman wiremanVar) {
        this.f25680dern = wiremanVar;
    }

    public final boolean attabal(InterfaceC0598saneness interfaceC0598saneness, ConstraintWidget constraintWidget, int i) {
        this.f25681saneness.f25685attabal = constraintWidget.trm();
        this.f25681saneness.f25692saneness = constraintWidget.splinterproof();
        this.f25681saneness.f25689dern = constraintWidget.dent();
        this.f25681saneness.f25694wireman = constraintWidget.cord();
        attabal attabalVar = this.f25681saneness;
        attabalVar.f25693taiyuan = false;
        attabalVar.f25688cutely = i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = attabalVar.f25685attabal;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = attabalVar.f25692saneness == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f8121itchy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && constraintWidget.f8121itchy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z3 && constraintWidget.f8150preprohormone[0] == 4) {
            attabalVar.f25685attabal = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z4 && constraintWidget.f8150preprohormone[1] == 4) {
            attabalVar.f25692saneness = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        interfaceC0598saneness.saneness(constraintWidget, attabalVar);
        constraintWidget.hyalinization(this.f25681saneness.f25691marial);
        constraintWidget.sakeen(this.f25681saneness.f25686beachfront);
        constraintWidget.molet(this.f25681saneness.f25690impromptu);
        constraintWidget.outmarry(this.f25681saneness.f25687competently);
        attabal attabalVar2 = this.f25681saneness;
        attabalVar2.f25688cutely = attabal.f25682apical;
        return attabalVar2.f25693taiyuan;
    }

    public final void dern(androidx.constraintlayout.core.widgets.wireman wiremanVar, String str, int i, int i2, int i3) {
        wiremanVar.getClass();
        int iPolder = wiremanVar.polder();
        int iMerc = wiremanVar.merc();
        wiremanVar.linendraper(0);
        wiremanVar.sultanate(0);
        wiremanVar.hyalinization(i2);
        wiremanVar.sakeen(i3);
        wiremanVar.linendraper(iPolder);
        wiremanVar.sultanate(iMerc);
        this.f25680dern.transformable(i);
        this.f25680dern.hydromechanics();
    }

    public void marial(androidx.constraintlayout.core.widgets.wireman wiremanVar) {
        this.f25679attabal.clear();
        int size = wiremanVar.f37384osteal.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = wiremanVar.f37384osteal.get(i);
            ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = constraintWidget.trm();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviourTrm == dimensionBehaviour || constraintWidget.splinterproof() == dimensionBehaviour) {
                this.f25679attabal.add(constraintWidget);
            }
        }
        wiremanVar.balance();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[PHI: r10
  0x0097: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0061, B:34:0x0067, B:36:0x006b, B:54:0x0094, B:52:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void saneness(androidx.constraintlayout.core.widgets.wireman wiremanVar) {
        boolean z;
        androidx.constraintlayout.core.widgets.analyzer.dern dernVar;
        androidx.constraintlayout.core.widgets.analyzer.wireman wiremanVar2;
        int size = wiremanVar.f37384osteal.size();
        boolean zElectropaint = wiremanVar.electropaint(64);
        InterfaceC0598saneness interfaceC0598sanenessImparkation = wiremanVar.imparkation();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = wiremanVar.f37384osteal.get(i);
            if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.beachfront) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.attabal) && !constraintWidget.czestochowa() && (!zElectropaint || (dernVar = constraintWidget.f8130marial) == null || (wiremanVar2 = constraintWidget.f8090beachfront) == null || !dernVar.f8201marial.f8192taiyuan || !wiremanVar2.f8201marial.f8192taiyuan)) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap = constraintWidget.gintrap(0);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap2 = constraintWidget.gintrap(1);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z2 = dimensionBehaviourGintrap == dimensionBehaviour && constraintWidget.f8109gintrap != 1 && dimensionBehaviourGintrap2 == dimensionBehaviour && constraintWidget.f8154rotuma != 1;
                if (!z2 && wiremanVar.electropaint(1) && !(constraintWidget instanceof androidx.constraintlayout.core.widgets.taiyuan)) {
                    if (dimensionBehaviourGintrap == dimensionBehaviour && constraintWidget.f8109gintrap == 0 && dimensionBehaviourGintrap2 != dimensionBehaviour && !constraintWidget.sayid()) {
                        z2 = true;
                    }
                    if (dimensionBehaviourGintrap2 == dimensionBehaviour && constraintWidget.f8154rotuma == 0 && dimensionBehaviourGintrap != dimensionBehaviour && !constraintWidget.sayid()) {
                        z2 = true;
                    }
                    z = (!(dimensionBehaviourGintrap == dimensionBehaviour || dimensionBehaviourGintrap2 == dimensionBehaviour) || constraintWidget.f8121itchy <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? z2 : true;
                }
                if (!z) {
                    attabal(interfaceC0598sanenessImparkation, constraintWidget, attabal.f25682apical);
                }
            }
        }
        interfaceC0598sanenessImparkation.attabal();
    }

    public long wireman(androidx.constraintlayout.core.widgets.wireman wiremanVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zMurrine;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13;
        boolean z2;
        saneness sanenessVar = this;
        InterfaceC0598saneness interfaceC0598sanenessImparkation = wiremanVar.imparkation();
        int size = wiremanVar.f37384osteal.size();
        int iDent = wiremanVar.dent();
        int iCord = wiremanVar.cord();
        boolean zSaneness = androidx.constraintlayout.core.widgets.competently.saneness(i, 128);
        boolean z3 = zSaneness || androidx.constraintlayout.core.widgets.competently.saneness(i, 64);
        if (z3) {
            for (int i14 = 0; i14 < size; i14++) {
                ConstraintWidget constraintWidget = wiremanVar.f37384osteal.get(i14);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = constraintWidget.trm();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z4 = (dimensionBehaviourTrm == dimensionBehaviour) && (constraintWidget.splinterproof() == dimensionBehaviour) && constraintWidget.rotuma() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if ((constraintWidget.sayid() && z4) || ((constraintWidget.coi() && z4) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.taiyuan) || constraintWidget.sayid() || constraintWidget.coi())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3) {
            boolean z5 = androidx.constraintlayout.core.dern.f8031molybdenite;
        }
        boolean z6 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zSaneness);
        int i15 = 2;
        if (z6) {
            int iMin = Math.min(wiremanVar.restrictive(), i5);
            int iMin2 = Math.min(wiremanVar.supplicat(), i7);
            if (i4 == 1073741824 && wiremanVar.dent() != iMin) {
                wiremanVar.hyalinization(iMin);
                wiremanVar.balance();
            }
            if (i6 == 1073741824 && wiremanVar.cord() != iMin2) {
                wiremanVar.sakeen(iMin2);
                wiremanVar.balance();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zMurrine = wiremanVar.nomenclative(zSaneness);
                i10 = 2;
            } else {
                boolean zHypokinesis = wiremanVar.hypokinesis(zSaneness);
                if (i4 == 1073741824) {
                    zHypokinesis &= wiremanVar.murrine(zSaneness, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zMurrine = wiremanVar.murrine(zSaneness, 1) & zHypokinesis;
                    i10++;
                } else {
                    zMurrine = zHypokinesis;
                }
            }
            if (zMurrine) {
                wiremanVar.undecorated(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zMurrine = false;
            i10 = 0;
        }
        if (zMurrine && i10 == 2) {
            return 0L;
        }
        int iBrighton = wiremanVar.brighton();
        if (size > 0) {
            saneness(wiremanVar);
        }
        marial(wiremanVar);
        int size2 = sanenessVar.f25679attabal.size();
        if (size > 0) {
            sanenessVar.dern(wiremanVar, "First pass", 0, iDent, iCord);
            i11 = iDent;
            i12 = iCord;
        } else {
            i11 = iDent;
            i12 = iCord;
        }
        if (size2 > 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm2 = wiremanVar.trm();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z7 = dimensionBehaviourTrm2 == dimensionBehaviour2;
            boolean z8 = wiremanVar.splinterproof() == dimensionBehaviour2;
            int iMax = Math.max(wiremanVar.dent(), sanenessVar.f25680dern.polder());
            int iMax2 = Math.max(wiremanVar.cord(), sanenessVar.f25680dern.merc());
            int i16 = 0;
            boolean zNomenclative = false;
            while (i16 < size2) {
                ConstraintWidget constraintWidget2 = sanenessVar.f25679attabal.get(i16);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.taiyuan) {
                    int iDent2 = constraintWidget2.dent();
                    int iCord2 = constraintWidget2.cord();
                    boolean zAttabal = sanenessVar.attabal(interfaceC0598sanenessImparkation, constraintWidget2, attabal.f25683formularize) | zNomenclative;
                    int iDent3 = constraintWidget2.dent();
                    int iCord3 = constraintWidget2.cord();
                    if (iDent3 != iDent2) {
                        constraintWidget2.hyalinization(iDent3);
                        if (z7 && constraintWidget2.privatdozent() > iMax) {
                            iMax = Math.max(iMax, constraintWidget2.privatdozent() + constraintWidget2.monoploid(ConstraintAnchor.Type.RIGHT).beachfront());
                        }
                        z2 = true;
                    } else {
                        z2 = zAttabal;
                    }
                    if (iCord3 != iCord2) {
                        constraintWidget2.sakeen(iCord3);
                        if (z8 && constraintWidget2.graveside() > iMax2) {
                            iMax2 = Math.max(iMax2, constraintWidget2.graveside() + constraintWidget2.monoploid(ConstraintAnchor.Type.BOTTOM).beachfront());
                        }
                        z2 = true;
                    }
                    zNomenclative = z2 | ((androidx.constraintlayout.core.widgets.taiyuan) constraintWidget2).nomenclative();
                }
                i16++;
                i11 = i11;
                i15 = 2;
            }
            int i17 = i11;
            int i18 = i15;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = 0;
                while (i20 < size2) {
                    ConstraintWidget constraintWidget3 = sanenessVar.f25679attabal.get(i20);
                    if (((constraintWidget3 instanceof sayid.attabal) && !(constraintWidget3 instanceof androidx.constraintlayout.core.widgets.taiyuan)) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.beachfront) || constraintWidget3.clubfoot() == 8 || ((z6 && constraintWidget3.f8130marial.f8201marial.f8192taiyuan && constraintWidget3.f8090beachfront.f8201marial.f8192taiyuan) || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.taiyuan))) {
                        z = z6;
                        i13 = size2;
                    } else {
                        int iDent4 = constraintWidget3.dent();
                        int iCord4 = constraintWidget3.cord();
                        z = z6;
                        int iPolloi = constraintWidget3.polloi();
                        int i21 = attabal.f25683formularize;
                        i13 = size2;
                        if (i19 == 1) {
                            i21 = attabal.f25684impassible;
                        }
                        boolean zAttabal2 = sanenessVar.attabal(interfaceC0598sanenessImparkation, constraintWidget3, i21) | zNomenclative;
                        int iDent5 = constraintWidget3.dent();
                        int iCord5 = constraintWidget3.cord();
                        if (iDent5 != iDent4) {
                            constraintWidget3.hyalinization(iDent5);
                            if (z7 && constraintWidget3.privatdozent() > iMax) {
                                iMax = Math.max(iMax, constraintWidget3.privatdozent() + constraintWidget3.monoploid(ConstraintAnchor.Type.RIGHT).beachfront());
                            }
                            zAttabal2 = true;
                        }
                        if (iCord5 != iCord4) {
                            constraintWidget3.sakeen(iCord5);
                            if (z8 && constraintWidget3.graveside() > iMax2) {
                                iMax2 = Math.max(iMax2, constraintWidget3.graveside() + constraintWidget3.monoploid(ConstraintAnchor.Type.BOTTOM).beachfront());
                            }
                            zAttabal2 = true;
                        }
                        zNomenclative = (!constraintWidget3.premeiotic() || iPolloi == constraintWidget3.polloi()) ? zAttabal2 : true;
                    }
                    i20++;
                    sanenessVar = this;
                    size2 = i13;
                    z6 = z;
                }
                boolean z9 = z6;
                int i22 = size2;
                if (!zNomenclative) {
                    break;
                }
                i19++;
                dern(wiremanVar, "intermediate pass", i19, i17, i12);
                sanenessVar = this;
                size2 = i22;
                z6 = z9;
                i18 = 2;
                zNomenclative = false;
            }
        }
        wiremanVar.rsp(iBrighton);
        return 0L;
    }
}
