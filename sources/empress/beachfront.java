package empress;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Direct.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static saneness.attabal f25651attabal = new saneness.attabal();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static int f25653saneness = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static int f25652dern = 0;

    public static boolean attabal(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = constraintWidget.trm();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourSplinterproof = constraintWidget.splinterproof();
        androidx.constraintlayout.core.widgets.wireman wiremanVar = constraintWidget.grimness() != null ? (androidx.constraintlayout.core.widgets.wireman) constraintWidget.grimness() : null;
        if (wiremanVar != null) {
            wiremanVar.trm();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (wiremanVar != null) {
            wiremanVar.splinterproof();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviourTrm == dimensionBehaviour5 || constraintWidget.underbelly() || dimensionBehaviourTrm == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourTrm == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f8109gintrap == 0 && constraintWidget.f8121itchy == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && constraintWidget.timberyard(0)) || (dimensionBehaviourTrm == dimensionBehaviour2 && constraintWidget.f8109gintrap == 1 && constraintWidget.itchy(0, constraintWidget.dent()));
        boolean z2 = dimensionBehaviourSplinterproof == dimensionBehaviour5 || constraintWidget.preterite() || dimensionBehaviourSplinterproof == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviourSplinterproof == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f8154rotuma == 0 && constraintWidget.f8121itchy == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && constraintWidget.timberyard(1)) || (dimensionBehaviourSplinterproof == dimensionBehaviour && constraintWidget.f8154rotuma == 1 && constraintWidget.itchy(1, constraintWidget.cord()));
        if (constraintWidget.f8121itchy <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void beachfront(int i, saneness.InterfaceC0598saneness interfaceC0598saneness, ConstraintWidget constraintWidget) {
        float fPeridotite = constraintWidget.peridotite();
        int iMarial = constraintWidget.f8116hydrovane.f8073beachfront.marial();
        int iMarial2 = constraintWidget.f8144peridotite.f8073beachfront.marial();
        int iBeachfront = constraintWidget.f8116hydrovane.beachfront() + iMarial;
        int iBeachfront2 = iMarial2 - constraintWidget.f8144peridotite.beachfront();
        if (iMarial == iMarial2) {
            fPeridotite = 0.5f;
        } else {
            iMarial = iBeachfront;
            iMarial2 = iBeachfront2;
        }
        int iCord = constraintWidget.cord();
        int i2 = (iMarial2 - iMarial) - iCord;
        if (iMarial > iMarial2) {
            i2 = (iMarial - iMarial2) - iCord;
        }
        int i3 = (int) (i2 > 0 ? (fPeridotite * i2) + 0.5f : fPeridotite * i2);
        int i4 = iMarial + i3;
        int i5 = i4 + iCord;
        if (iMarial > iMarial2) {
            i4 = iMarial - i3;
            i5 = i4 - iCord;
        }
        constraintWidget.libyan(i4, i5);
        taiyuan(i + 1, constraintWidget, interfaceC0598saneness);
    }

    public static void competently(int i, ConstraintWidget constraintWidget, saneness.InterfaceC0598saneness interfaceC0598saneness, ConstraintWidget constraintWidget2) {
        float fPeridotite = constraintWidget2.peridotite();
        int iMarial = constraintWidget2.f8116hydrovane.f8073beachfront.marial() + constraintWidget2.f8116hydrovane.beachfront();
        int iMarial2 = constraintWidget2.f8144peridotite.f8073beachfront.marial() - constraintWidget2.f8144peridotite.beachfront();
        if (iMarial2 >= iMarial) {
            int iCord = constraintWidget2.cord();
            if (constraintWidget2.clubfoot() != 8) {
                int i2 = constraintWidget2.f8154rotuma;
                if (i2 == 2) {
                    iCord = (int) (fPeridotite * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.wireman ? constraintWidget.cord() : constraintWidget.grimness().cord()));
                } else if (i2 == 0) {
                    iCord = iMarial2 - iMarial;
                }
                iCord = Math.max(constraintWidget2.f8173trm, iCord);
                int i3 = constraintWidget2.f8140oilcan;
                if (i3 > 0) {
                    iCord = Math.min(i3, iCord);
                }
            }
            int i4 = iMarial + ((int) ((fPeridotite * ((iMarial2 - iMarial) - iCord)) + 0.5f));
            constraintWidget2.libyan(i4, iCord + i4);
            taiyuan(i + 1, constraintWidget2, interfaceC0598saneness);
        }
    }

    public static void dern(int i, androidx.constraintlayout.core.widgets.attabal attabalVar, saneness.InterfaceC0598saneness interfaceC0598saneness, int i2, boolean z) {
        if (attabalVar.polyfoil()) {
            if (i2 == 0) {
                saneness(i + 1, attabalVar, interfaceC0598saneness, z);
            } else {
                taiyuan(i + 1, attabalVar, interfaceC0598saneness);
            }
        }
    }

    public static void impromptu(androidx.constraintlayout.core.widgets.wireman wiremanVar, saneness.InterfaceC0598saneness interfaceC0598saneness) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = wiremanVar.trm();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourSplinterproof = wiremanVar.splinterproof();
        f25653saneness = 0;
        f25652dern = 0;
        wiremanVar.julian();
        ArrayList<ConstraintWidget> arrayListMicroanalysis = wiremanVar.microanalysis();
        int size = arrayListMicroanalysis.size();
        for (int i = 0; i < size; i++) {
            arrayListMicroanalysis.get(i).julian();
        }
        boolean zBleacherite = wiremanVar.bleacherite();
        if (dimensionBehaviourTrm == ConstraintWidget.DimensionBehaviour.FIXED) {
            wiremanVar.attendance(0, wiremanVar.dent());
        } else {
            wiremanVar.homozygous(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = arrayListMicroanalysis.get(i2);
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.beachfront) {
                androidx.constraintlayout.core.widgets.beachfront beachfrontVar = (androidx.constraintlayout.core.widgets.beachfront) constraintWidget;
                if (beachfrontVar.hydromechanics() == 1) {
                    if (beachfrontVar.polyfoil() != -1) {
                        beachfrontVar.cybernatic(beachfrontVar.polyfoil());
                    } else if (beachfrontVar.bluecoat() != -1 && wiremanVar.underbelly()) {
                        beachfrontVar.cybernatic(wiremanVar.dent() - beachfrontVar.bluecoat());
                    } else if (wiremanVar.underbelly()) {
                        beachfrontVar.cybernatic((int) ((beachfrontVar.harlequinade() * wiremanVar.dent()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((constraintWidget instanceof androidx.constraintlayout.core.widgets.attabal) && ((androidx.constraintlayout.core.widgets.attabal) constraintWidget).collection() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = arrayListMicroanalysis.get(i3);
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.beachfront) {
                    androidx.constraintlayout.core.widgets.beachfront beachfrontVar2 = (androidx.constraintlayout.core.widgets.beachfront) constraintWidget2;
                    if (beachfrontVar2.hydromechanics() == 1) {
                        saneness(0, beachfrontVar2, interfaceC0598saneness, zBleacherite);
                    }
                }
            }
        }
        saneness(0, wiremanVar, interfaceC0598saneness, zBleacherite);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget3 = arrayListMicroanalysis.get(i4);
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.attabal) {
                    androidx.constraintlayout.core.widgets.attabal attabalVar = (androidx.constraintlayout.core.widgets.attabal) constraintWidget3;
                    if (attabalVar.collection() == 0) {
                        dern(0, attabalVar, interfaceC0598saneness, 0, zBleacherite);
                    }
                }
            }
        }
        if (dimensionBehaviourSplinterproof == ConstraintWidget.DimensionBehaviour.FIXED) {
            wiremanVar.libyan(0, wiremanVar.cord());
        } else {
            wiremanVar.lampshade(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = arrayListMicroanalysis.get(i5);
            if (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.beachfront) {
                androidx.constraintlayout.core.widgets.beachfront beachfrontVar3 = (androidx.constraintlayout.core.widgets.beachfront) constraintWidget4;
                if (beachfrontVar3.hydromechanics() == 0) {
                    if (beachfrontVar3.polyfoil() != -1) {
                        beachfrontVar3.cybernatic(beachfrontVar3.polyfoil());
                    } else if (beachfrontVar3.bluecoat() != -1 && wiremanVar.preterite()) {
                        beachfrontVar3.cybernatic(wiremanVar.cord() - beachfrontVar3.bluecoat());
                    } else if (wiremanVar.preterite()) {
                        beachfrontVar3.cybernatic((int) ((beachfrontVar3.harlequinade() * wiremanVar.cord()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((constraintWidget4 instanceof androidx.constraintlayout.core.widgets.attabal) && ((androidx.constraintlayout.core.widgets.attabal) constraintWidget4).collection() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = arrayListMicroanalysis.get(i6);
                if (constraintWidget5 instanceof androidx.constraintlayout.core.widgets.beachfront) {
                    androidx.constraintlayout.core.widgets.beachfront beachfrontVar4 = (androidx.constraintlayout.core.widgets.beachfront) constraintWidget5;
                    if (beachfrontVar4.hydromechanics() == 0) {
                        taiyuan(1, beachfrontVar4, interfaceC0598saneness);
                    }
                }
            }
        }
        taiyuan(0, wiremanVar, interfaceC0598saneness);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget6 = arrayListMicroanalysis.get(i7);
                if (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.attabal) {
                    androidx.constraintlayout.core.widgets.attabal attabalVar2 = (androidx.constraintlayout.core.widgets.attabal) constraintWidget6;
                    if (attabalVar2.collection() == 1) {
                        dern(0, attabalVar2, interfaceC0598saneness, 1, zBleacherite);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget7 = arrayListMicroanalysis.get(i8);
            if (constraintWidget7.sensatory() && attabal(0, constraintWidget7)) {
                androidx.constraintlayout.core.widgets.wireman.crock(0, constraintWidget7, interfaceC0598saneness, f25651attabal, saneness.attabal.f25682apical);
                if (!(constraintWidget7 instanceof androidx.constraintlayout.core.widgets.beachfront)) {
                    saneness(0, constraintWidget7, interfaceC0598saneness, zBleacherite);
                    taiyuan(0, constraintWidget7, interfaceC0598saneness);
                } else if (((androidx.constraintlayout.core.widgets.beachfront) constraintWidget7).hydromechanics() == 0) {
                    taiyuan(0, constraintWidget7, interfaceC0598saneness);
                } else {
                    saneness(0, constraintWidget7, interfaceC0598saneness, zBleacherite);
                }
            }
        }
    }

    public static void marial(int i, ConstraintWidget constraintWidget, saneness.InterfaceC0598saneness interfaceC0598saneness, ConstraintWidget constraintWidget2, boolean z) {
        float fCuirassed = constraintWidget2.cuirassed();
        int iMarial = constraintWidget2.f8164starveling.f8073beachfront.marial() + constraintWidget2.f8164starveling.beachfront();
        int iMarial2 = constraintWidget2.f8177walach.f8073beachfront.marial() - constraintWidget2.f8177walach.beachfront();
        if (iMarial2 >= iMarial) {
            int iDent = constraintWidget2.dent();
            if (constraintWidget2.clubfoot() != 8) {
                int i2 = constraintWidget2.f8109gintrap;
                if (i2 == 2) {
                    iDent = (int) (constraintWidget2.cuirassed() * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.wireman ? constraintWidget.dent() : constraintWidget.grimness().dent()));
                } else if (i2 == 0) {
                    iDent = iMarial2 - iMarial;
                }
                iDent = Math.max(constraintWidget2.f8096cord, iDent);
                int i3 = constraintWidget2.f8098cuirassed;
                if (i3 > 0) {
                    iDent = Math.min(i3, iDent);
                }
            }
            int i4 = iMarial + ((int) ((fCuirassed * ((iMarial2 - iMarial) - iDent)) + 0.5f));
            constraintWidget2.attendance(i4, iDent + i4);
            saneness(i + 1, constraintWidget2, interfaceC0598saneness, z);
        }
    }

    public static void saneness(int i, ConstraintWidget constraintWidget, saneness.InterfaceC0598saneness interfaceC0598saneness, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.nosophobia()) {
            return;
        }
        boolean z2 = true;
        f25653saneness++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.wireman) && constraintWidget.sensatory()) {
            int i2 = i + 1;
            if (attabal(i2, constraintWidget)) {
                androidx.constraintlayout.core.widgets.wireman.crock(i2, constraintWidget, interfaceC0598saneness, new saneness.attabal(), saneness.attabal.f25682apical);
            }
        }
        ConstraintAnchor constraintAnchorMonoploid = constraintWidget.monoploid(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorMonoploid2 = constraintWidget.monoploid(ConstraintAnchor.Type.RIGHT);
        int iMarial = constraintAnchorMonoploid.marial();
        int iMarial2 = constraintAnchorMonoploid2.marial();
        if (constraintAnchorMonoploid.wireman() != null && constraintAnchorMonoploid.triweekly()) {
            Iterator<ConstraintAnchor> it = constraintAnchorMonoploid.wireman().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f8080wireman;
                int i3 = i + 1;
                boolean zAttabal = attabal(i3, constraintWidget2);
                if (constraintWidget2.sensatory() && zAttabal) {
                    androidx.constraintlayout.core.widgets.wireman.crock(i3, constraintWidget2, interfaceC0598saneness, new saneness.attabal(), saneness.attabal.f25682apical);
                }
                boolean z3 = ((next == constraintWidget2.f8164starveling && (constraintAnchor4 = constraintWidget2.f8177walach.f8073beachfront) != null && constraintAnchor4.triweekly()) || (next == constraintWidget2.f8177walach && (constraintAnchor3 = constraintWidget2.f8164starveling.f8073beachfront) != null && constraintAnchor3.triweekly())) ? z2 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = constraintWidget2.trm();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourTrm != dimensionBehaviour || zAttabal) {
                    if (!constraintWidget2.sensatory()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.f8164starveling;
                        if (next == constraintAnchor5 && constraintWidget2.f8177walach.f8073beachfront == null) {
                            int iBeachfront = constraintAnchor5.beachfront() + iMarial;
                            constraintWidget2.attendance(iBeachfront, constraintWidget2.dent() + iBeachfront);
                            saneness(i3, constraintWidget2, interfaceC0598saneness, z);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.f8177walach;
                            if (next == constraintAnchor6 && constraintAnchor5.f8073beachfront == null) {
                                int iBeachfront2 = iMarial - constraintAnchor6.beachfront();
                                constraintWidget2.attendance(iBeachfront2 - constraintWidget2.dent(), iBeachfront2);
                                saneness(i3, constraintWidget2, interfaceC0598saneness, z);
                            } else if (z3 && !constraintWidget2.sayid()) {
                                wireman(i3, interfaceC0598saneness, constraintWidget2, z);
                            }
                        }
                    }
                } else if (constraintWidget2.trm() == dimensionBehaviour && constraintWidget2.f8098cuirassed >= 0 && constraintWidget2.f8096cord >= 0 && ((constraintWidget2.clubfoot() == 8 || (constraintWidget2.f8109gintrap == 0 && constraintWidget2.rotuma() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) && !constraintWidget2.sayid() && !constraintWidget2.czestochowa() && z3 && !constraintWidget2.sayid())) {
                    marial(i3, constraintWidget, interfaceC0598saneness, constraintWidget2, z);
                }
                z2 = z2;
            }
        }
        boolean z4 = z2;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.beachfront) {
            return;
        }
        if (constraintAnchorMonoploid2.wireman() != null && constraintAnchorMonoploid2.triweekly()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorMonoploid2.wireman().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f8080wireman;
                int i4 = i + 1;
                boolean zAttabal2 = attabal(i4, constraintWidget3);
                if (constraintWidget3.sensatory() && zAttabal2) {
                    androidx.constraintlayout.core.widgets.wireman.crock(i4, constraintWidget3, interfaceC0598saneness, new saneness.attabal(), saneness.attabal.f25682apical);
                }
                boolean z5 = ((next2 == constraintWidget3.f8164starveling && (constraintAnchor2 = constraintWidget3.f8177walach.f8073beachfront) != null && constraintAnchor2.triweekly()) || (next2 == constraintWidget3.f8177walach && (constraintAnchor = constraintWidget3.f8164starveling.f8073beachfront) != null && constraintAnchor.triweekly())) ? z4 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm2 = constraintWidget3.trm();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourTrm2 != dimensionBehaviour2 || zAttabal2) {
                    if (!constraintWidget3.sensatory()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.f8164starveling;
                        if (next2 == constraintAnchor7 && constraintWidget3.f8177walach.f8073beachfront == null) {
                            int iBeachfront3 = constraintAnchor7.beachfront() + iMarial2;
                            constraintWidget3.attendance(iBeachfront3, constraintWidget3.dent() + iBeachfront3);
                            saneness(i4, constraintWidget3, interfaceC0598saneness, z);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.f8177walach;
                            if (next2 == constraintAnchor8 && constraintAnchor7.f8073beachfront == null) {
                                int iBeachfront4 = iMarial2 - constraintAnchor8.beachfront();
                                constraintWidget3.attendance(iBeachfront4 - constraintWidget3.dent(), iBeachfront4);
                                saneness(i4, constraintWidget3, interfaceC0598saneness, z);
                            } else if (z5 && !constraintWidget3.sayid()) {
                                wireman(i4, interfaceC0598saneness, constraintWidget3, z);
                            }
                        }
                    }
                } else if (constraintWidget3.trm() == dimensionBehaviour2 && constraintWidget3.f8098cuirassed >= 0 && constraintWidget3.f8096cord >= 0 && (constraintWidget3.clubfoot() == 8 || (constraintWidget3.f8109gintrap == 0 && constraintWidget3.rotuma() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!constraintWidget3.sayid() && !constraintWidget3.czestochowa() && z5 && !constraintWidget3.sayid()) {
                        marial(i4, constraintWidget, interfaceC0598saneness, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.igbo();
    }

    public static void taiyuan(int i, ConstraintWidget constraintWidget, saneness.InterfaceC0598saneness interfaceC0598saneness) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.wostteth()) {
            return;
        }
        boolean z = true;
        f25652dern++;
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.wireman) && constraintWidget.sensatory()) {
            int i2 = i + 1;
            if (attabal(i2, constraintWidget)) {
                androidx.constraintlayout.core.widgets.wireman.crock(i2, constraintWidget, interfaceC0598saneness, new saneness.attabal(), saneness.attabal.f25682apical);
            }
        }
        ConstraintAnchor constraintAnchorMonoploid = constraintWidget.monoploid(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorMonoploid2 = constraintWidget.monoploid(ConstraintAnchor.Type.BOTTOM);
        int iMarial = constraintAnchorMonoploid.marial();
        int iMarial2 = constraintAnchorMonoploid2.marial();
        if (constraintAnchorMonoploid.wireman() != null && constraintAnchorMonoploid.triweekly()) {
            Iterator<ConstraintAnchor> it = constraintAnchorMonoploid.wireman().iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f8080wireman;
                int i3 = i + 1;
                boolean zAttabal = attabal(i3, constraintWidget2);
                if (constraintWidget2.sensatory() && zAttabal) {
                    androidx.constraintlayout.core.widgets.wireman.crock(i3, constraintWidget2, interfaceC0598saneness, new saneness.attabal(), saneness.attabal.f25682apical);
                }
                boolean z2 = ((next == constraintWidget2.f8116hydrovane && (constraintAnchor4 = constraintWidget2.f8144peridotite.f8073beachfront) != null && constraintAnchor4.triweekly()) || (next == constraintWidget2.f8144peridotite && (constraintAnchor3 = constraintWidget2.f8116hydrovane.f8073beachfront) != null && constraintAnchor3.triweekly())) ? z : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourSplinterproof = constraintWidget2.splinterproof();
                boolean z3 = z;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourSplinterproof != dimensionBehaviour || zAttabal) {
                    if (!constraintWidget2.sensatory()) {
                        ConstraintAnchor constraintAnchor5 = constraintWidget2.f8116hydrovane;
                        if (next == constraintAnchor5 && constraintWidget2.f8144peridotite.f8073beachfront == null) {
                            int iBeachfront = constraintAnchor5.beachfront() + iMarial;
                            constraintWidget2.libyan(iBeachfront, constraintWidget2.cord() + iBeachfront);
                            taiyuan(i3, constraintWidget2, interfaceC0598saneness);
                        } else {
                            ConstraintAnchor constraintAnchor6 = constraintWidget2.f8144peridotite;
                            if (next == constraintAnchor6 && constraintAnchor5.f8073beachfront == null) {
                                int iBeachfront2 = iMarial - constraintAnchor6.beachfront();
                                constraintWidget2.libyan(iBeachfront2 - constraintWidget2.cord(), iBeachfront2);
                                taiyuan(i3, constraintWidget2, interfaceC0598saneness);
                            } else if (z2 && !constraintWidget2.coi()) {
                                beachfront(i3, interfaceC0598saneness, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.splinterproof() == dimensionBehaviour && constraintWidget2.f8140oilcan >= 0 && constraintWidget2.f8173trm >= 0 && ((constraintWidget2.clubfoot() == 8 || (constraintWidget2.f8154rotuma == 0 && constraintWidget2.rotuma() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) && !constraintWidget2.coi() && !constraintWidget2.czestochowa() && z2 && !constraintWidget2.coi())) {
                    competently(i3, constraintWidget, interfaceC0598saneness, constraintWidget2);
                }
                z = z3;
            }
        }
        boolean z4 = z;
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.beachfront) {
            return;
        }
        if (constraintAnchorMonoploid2.wireman() != null && constraintAnchorMonoploid2.triweekly()) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorMonoploid2.wireman().iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f8080wireman;
                int i4 = i + 1;
                boolean zAttabal2 = attabal(i4, constraintWidget3);
                if (constraintWidget3.sensatory() && zAttabal2) {
                    androidx.constraintlayout.core.widgets.wireman.crock(i4, constraintWidget3, interfaceC0598saneness, new saneness.attabal(), saneness.attabal.f25682apical);
                }
                boolean z5 = ((next2 == constraintWidget3.f8116hydrovane && (constraintAnchor2 = constraintWidget3.f8144peridotite.f8073beachfront) != null && constraintAnchor2.triweekly()) || (next2 == constraintWidget3.f8144peridotite && (constraintAnchor = constraintWidget3.f8116hydrovane.f8073beachfront) != null && constraintAnchor.triweekly())) ? z4 : false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourSplinterproof2 = constraintWidget3.splinterproof();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourSplinterproof2 != dimensionBehaviour2 || zAttabal2) {
                    if (!constraintWidget3.sensatory()) {
                        ConstraintAnchor constraintAnchor7 = constraintWidget3.f8116hydrovane;
                        if (next2 == constraintAnchor7 && constraintWidget3.f8144peridotite.f8073beachfront == null) {
                            int iBeachfront3 = constraintAnchor7.beachfront() + iMarial2;
                            constraintWidget3.libyan(iBeachfront3, constraintWidget3.cord() + iBeachfront3);
                            taiyuan(i4, constraintWidget3, interfaceC0598saneness);
                        } else {
                            ConstraintAnchor constraintAnchor8 = constraintWidget3.f8144peridotite;
                            if (next2 == constraintAnchor8 && constraintAnchor7.f8073beachfront == null) {
                                int iBeachfront4 = iMarial2 - constraintAnchor8.beachfront();
                                constraintWidget3.libyan(iBeachfront4 - constraintWidget3.cord(), iBeachfront4);
                                taiyuan(i4, constraintWidget3, interfaceC0598saneness);
                            } else if (z5 && !constraintWidget3.coi()) {
                                beachfront(i4, interfaceC0598saneness, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.splinterproof() == dimensionBehaviour2 && constraintWidget3.f8140oilcan >= 0 && constraintWidget3.f8173trm >= 0 && (constraintWidget3.clubfoot() == 8 || (constraintWidget3.f8154rotuma == 0 && constraintWidget3.rotuma() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                    if (!constraintWidget3.coi() && !constraintWidget3.czestochowa() && z5 && !constraintWidget3.coi()) {
                        competently(i4, constraintWidget, interfaceC0598saneness, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorMonoploid3 = constraintWidget.monoploid(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorMonoploid3.wireman() != null && constraintAnchorMonoploid3.triweekly()) {
            int iMarial3 = constraintAnchorMonoploid3.marial();
            for (ConstraintAnchor constraintAnchor9 : constraintAnchorMonoploid3.wireman()) {
                ConstraintWidget constraintWidget4 = constraintAnchor9.f8080wireman;
                int i5 = i + 1;
                boolean zAttabal3 = attabal(i5, constraintWidget4);
                if (constraintWidget4.sensatory() && zAttabal3) {
                    androidx.constraintlayout.core.widgets.wireman.crock(i5, constraintWidget4, interfaceC0598saneness, new saneness.attabal(), saneness.attabal.f25682apical);
                }
                if (constraintWidget4.splinterproof() != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zAttabal3) {
                    if (!constraintWidget4.sensatory() && constraintAnchor9 == constraintWidget4.f8132mathsort) {
                        constraintWidget4.mastfed(constraintAnchor9.beachfront() + iMarial3);
                        taiyuan(i5, constraintWidget4, interfaceC0598saneness);
                    }
                }
            }
        }
        constraintWidget.gusty();
    }

    public static void wireman(int i, saneness.InterfaceC0598saneness interfaceC0598saneness, ConstraintWidget constraintWidget, boolean z) {
        float fCuirassed = constraintWidget.cuirassed();
        int iMarial = constraintWidget.f8164starveling.f8073beachfront.marial();
        int iMarial2 = constraintWidget.f8177walach.f8073beachfront.marial();
        int iBeachfront = constraintWidget.f8164starveling.beachfront() + iMarial;
        int iBeachfront2 = iMarial2 - constraintWidget.f8177walach.beachfront();
        if (iMarial == iMarial2) {
            fCuirassed = 0.5f;
        } else {
            iMarial = iBeachfront;
            iMarial2 = iBeachfront2;
        }
        int iDent = constraintWidget.dent();
        int i2 = (iMarial2 - iMarial) - iDent;
        if (iMarial > iMarial2) {
            i2 = (iMarial - iMarial2) - iDent;
        }
        int i3 = ((int) (i2 > 0 ? (fCuirassed * i2) + 0.5f : fCuirassed * i2)) + iMarial;
        int i4 = i3 + iDent;
        if (iMarial > iMarial2) {
            i4 = i3 - iDent;
        }
        constraintWidget.attendance(i3, i4);
        saneness(i + 1, constraintWidget, interfaceC0598saneness, z);
    }
}
