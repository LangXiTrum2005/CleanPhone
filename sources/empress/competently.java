package empress;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Grouping.java */
/* JADX INFO: loaded from: classes.dex */
public class competently {
    public static cutely attabal(ConstraintWidget constraintWidget, int i, ArrayList<cutely> arrayList, cutely cutelyVar) {
        int iHydromechanics;
        int i2 = i == 0 ? constraintWidget.f8089basify : constraintWidget.f8169tectonization;
        if (i2 != -1 && (cutelyVar == null || i2 != cutelyVar.dern())) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                cutely cutelyVar2 = arrayList.get(i3);
                if (cutelyVar2.dern() == i2) {
                    if (cutelyVar != null) {
                        cutelyVar.competently(i, cutelyVar2);
                        arrayList.remove(cutelyVar);
                    }
                    cutelyVar = cutelyVar2;
                    break;
                }
            }
        } else if (i2 != -1) {
            return cutelyVar;
        }
        if (cutelyVar == null) {
            if ((constraintWidget instanceof sayid.saneness) && (iHydromechanics = ((sayid.saneness) constraintWidget).hydromechanics(i)) != -1) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    cutely cutelyVar3 = arrayList.get(i4);
                    if (cutelyVar3.dern() == iHydromechanics) {
                        cutelyVar = cutelyVar3;
                        break;
                    }
                }
            }
            if (cutelyVar == null) {
                cutelyVar = new cutely(i);
            }
            arrayList.add(cutelyVar);
        }
        if (cutelyVar.attabal(constraintWidget)) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.beachfront) {
                androidx.constraintlayout.core.widgets.beachfront beachfrontVar = (androidx.constraintlayout.core.widgets.beachfront) constraintWidget;
                beachfrontVar.microanalysis().dern(beachfrontVar.hydromechanics() == 0 ? 1 : 0, arrayList, cutelyVar);
            }
            if (i == 0) {
                constraintWidget.f8089basify = cutelyVar.dern();
                constraintWidget.f8164starveling.dern(i, arrayList, cutelyVar);
                constraintWidget.f8177walach.dern(i, arrayList, cutelyVar);
            } else {
                constraintWidget.f8169tectonization = cutelyVar.dern();
                constraintWidget.f8116hydrovane.dern(i, arrayList, cutelyVar);
                constraintWidget.f8132mathsort.dern(i, arrayList, cutelyVar);
                constraintWidget.f8144peridotite.dern(i, arrayList, cutelyVar);
            }
            constraintWidget.f8092clubfoot.dern(i, arrayList, cutelyVar);
        }
        return cutelyVar;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0349  */
    public static boolean dern(androidx.constraintlayout.core.widgets.wireman wiremanVar, saneness.InterfaceC0598saneness interfaceC0598saneness) {
        cutely cutelyVar;
        boolean z;
        cutely cutelyVar2;
        ArrayList<ConstraintWidget> arrayListMicroanalysis = wiremanVar.microanalysis();
        int size = arrayListMicroanalysis.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = arrayListMicroanalysis.get(i2);
            if (!wireman(wiremanVar.trm(), wiremanVar.splinterproof(), constraintWidget.trm(), constraintWidget.splinterproof()) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.marial)) {
                return false;
            }
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList<sayid.saneness> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<sayid.saneness> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            ConstraintWidget constraintWidget2 = arrayListMicroanalysis.get(i3);
            if (!wireman(wiremanVar.trm(), wiremanVar.splinterproof(), constraintWidget2.trm(), constraintWidget2.splinterproof())) {
                androidx.constraintlayout.core.widgets.wireman.crock(i, constraintWidget2, interfaceC0598saneness, wiremanVar.f8305bluecoat, saneness.attabal.f25682apical);
            }
            boolean z2 = constraintWidget2 instanceof androidx.constraintlayout.core.widgets.beachfront;
            if (z2) {
                androidx.constraintlayout.core.widgets.beachfront beachfrontVar = (androidx.constraintlayout.core.widgets.beachfront) constraintWidget2;
                if (beachfrontVar.hydromechanics() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(beachfrontVar);
                }
                if (beachfrontVar.hydromechanics() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(beachfrontVar);
                }
            }
            if (constraintWidget2 instanceof sayid.saneness) {
                if (constraintWidget2 instanceof androidx.constraintlayout.core.widgets.attabal) {
                    androidx.constraintlayout.core.widgets.attabal attabalVar = (androidx.constraintlayout.core.widgets.attabal) constraintWidget2;
                    if (attabalVar.collection() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(attabalVar);
                    }
                    if (attabalVar.collection() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(attabalVar);
                    }
                } else {
                    sayid.saneness sanenessVar = (sayid.saneness) constraintWidget2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(sanenessVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(sanenessVar);
                }
            }
            if (constraintWidget2.f8164starveling.f8073beachfront == null && constraintWidget2.f8177walach.f8073beachfront == null && !z2 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.attabal)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(constraintWidget2);
            }
            if (constraintWidget2.f8116hydrovane.f8073beachfront == null && constraintWidget2.f8144peridotite.f8073beachfront == null && constraintWidget2.f8132mathsort.f8073beachfront == null && !z2 && !(constraintWidget2 instanceof androidx.constraintlayout.core.widgets.attabal)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(constraintWidget2);
            }
            i3++;
            i = 0;
        }
        ArrayList<cutely> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                attabal((androidx.constraintlayout.core.widgets.beachfront) it.next(), 0, arrayList7, null);
            }
        }
        cutely cutelyVar3 = null;
        int i4 = 0;
        if (arrayList2 != null) {
            for (sayid.saneness sanenessVar2 : arrayList2) {
                cutely cutelyVarAttabal = attabal(sanenessVar2, i4, arrayList7, cutelyVar3);
                sanenessVar2.microanalysis(arrayList7, i4, cutelyVarAttabal);
                cutelyVarAttabal.saneness(arrayList7);
                cutelyVar3 = null;
                i4 = 0;
            }
        }
        ConstraintAnchor constraintAnchorMonoploid = wiremanVar.monoploid(ConstraintAnchor.Type.LEFT);
        if (constraintAnchorMonoploid.wireman() != null) {
            Iterator<ConstraintAnchor> it2 = constraintAnchorMonoploid.wireman().iterator();
            while (it2.hasNext()) {
                attabal(it2.next().f8080wireman, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorMonoploid2 = wiremanVar.monoploid(ConstraintAnchor.Type.RIGHT);
        if (constraintAnchorMonoploid2.wireman() != null) {
            Iterator<ConstraintAnchor> it3 = constraintAnchorMonoploid2.wireman().iterator();
            while (it3.hasNext()) {
                attabal(it3.next().f8080wireman, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorMonoploid3 = wiremanVar.monoploid(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorMonoploid3.wireman() != null) {
            Iterator<ConstraintAnchor> it4 = constraintAnchorMonoploid3.wireman().iterator();
            while (it4.hasNext()) {
                attabal(it4.next().f8080wireman, 0, arrayList7, null);
            }
        }
        cutely cutelyVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                attabal((ConstraintWidget) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                attabal((androidx.constraintlayout.core.widgets.beachfront) it6.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            for (sayid.saneness sanenessVar3 : arrayList4) {
                cutely cutelyVarAttabal2 = attabal(sanenessVar3, i5, arrayList7, cutelyVar4);
                sanenessVar3.microanalysis(arrayList7, i5, cutelyVarAttabal2);
                cutelyVarAttabal2.saneness(arrayList7);
                cutelyVar4 = null;
                i5 = 1;
            }
        }
        ConstraintAnchor constraintAnchorMonoploid4 = wiremanVar.monoploid(ConstraintAnchor.Type.TOP);
        if (constraintAnchorMonoploid4.wireman() != null) {
            Iterator<ConstraintAnchor> it7 = constraintAnchorMonoploid4.wireman().iterator();
            while (it7.hasNext()) {
                attabal(it7.next().f8080wireman, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorMonoploid5 = wiremanVar.monoploid(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorMonoploid5.wireman() != null) {
            Iterator<ConstraintAnchor> it8 = constraintAnchorMonoploid5.wireman().iterator();
            while (it8.hasNext()) {
                attabal(it8.next().f8080wireman, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorMonoploid6 = wiremanVar.monoploid(ConstraintAnchor.Type.BOTTOM);
        if (constraintAnchorMonoploid6.wireman() != null) {
            Iterator<ConstraintAnchor> it9 = constraintAnchorMonoploid6.wireman().iterator();
            while (it9.hasNext()) {
                attabal(it9.next().f8080wireman, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchorMonoploid7 = wiremanVar.monoploid(ConstraintAnchor.Type.CENTER);
        if (constraintAnchorMonoploid7.wireman() != null) {
            Iterator<ConstraintAnchor> it10 = constraintAnchorMonoploid7.wireman().iterator();
            while (it10.hasNext()) {
                attabal(it10.next().f8080wireman, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                attabal((ConstraintWidget) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            ConstraintWidget constraintWidget3 = arrayListMicroanalysis.get(i6);
            if (constraintWidget3.picketboat()) {
                cutely cutelyVarSaneness = saneness(arrayList7, constraintWidget3.f8089basify);
                cutely cutelyVarSaneness2 = saneness(arrayList7, constraintWidget3.f8169tectonization);
                if (cutelyVarSaneness != null && cutelyVarSaneness2 != null) {
                    cutelyVarSaneness.competently(0, cutelyVarSaneness2);
                    cutelyVarSaneness2.taiyuan(2);
                    arrayList7.remove(cutelyVarSaneness);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (wiremanVar.trm() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            cutelyVar = null;
            int i7 = 0;
            for (cutely cutelyVar5 : arrayList7) {
                if (cutelyVar5.wireman() != 1) {
                    cutelyVar5.impromptu(false);
                    int iBeachfront = cutelyVar5.beachfront(wiremanVar.infiltration(), 0);
                    if (iBeachfront > i7) {
                        cutelyVar = cutelyVar5;
                        i7 = iBeachfront;
                    }
                }
            }
            if (cutelyVar != null) {
                wiremanVar.prefect(ConstraintWidget.DimensionBehaviour.FIXED);
                wiremanVar.hyalinization(i7);
                cutelyVar.impromptu(true);
            } else {
                cutelyVar = null;
            }
        } else {
            cutelyVar = null;
        }
        if (wiremanVar.splinterproof() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            cutely cutelyVar6 = null;
            int i8 = 0;
            for (cutely cutelyVar7 : arrayList7) {
                if (cutelyVar7.wireman() != 0) {
                    cutelyVar7.impromptu(false);
                    int iBeachfront2 = cutelyVar7.beachfront(wiremanVar.infiltration(), 1);
                    if (iBeachfront2 > i8) {
                        cutelyVar6 = cutelyVar7;
                        i8 = iBeachfront2;
                    }
                }
            }
            z = true;
            if (cutelyVar6 != null) {
                wiremanVar.vir(ConstraintWidget.DimensionBehaviour.FIXED);
                wiremanVar.sakeen(i8);
                cutelyVar6.impromptu(true);
                cutelyVar2 = cutelyVar6;
            }
            if (cutelyVar == null || cutelyVar2 != null) {
                return z;
            }
            return false;
        }
        z = true;
        cutelyVar2 = null;
        if (cutelyVar == null) {
        }
        return z;
    }

    public static cutely saneness(ArrayList<cutely> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cutely cutelyVar = arrayList.get(i2);
            if (i == cutelyVar.dern()) {
                return cutelyVar;
            }
        }
        return null;
    }

    public static boolean wireman(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
