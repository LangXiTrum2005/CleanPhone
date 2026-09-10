package empress;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: DependencyGraph.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.wireman f25670attabal;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.wireman f25678wireman;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f25676saneness = true;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f25673dern = true;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public ArrayList<WidgetRun> f25675marial = new ArrayList<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public ArrayList<taiyuan> f25671beachfront = new ArrayList<>();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public saneness.InterfaceC0598saneness f25672competently = null;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public saneness.attabal f25674impromptu = new saneness.attabal();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public ArrayList<taiyuan> f25677taiyuan = new ArrayList<>();

    public marial(androidx.constraintlayout.core.widgets.wireman wiremanVar) {
        this.f25670attabal = wiremanVar;
        this.f25678wireman = wiremanVar;
    }

    public void apical() {
        this.f25673dern = true;
    }

    public final void attabal(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<taiyuan> arrayList, taiyuan taiyuanVar) {
        int i3;
        DependencyNode dependencyNode3;
        ArrayList<taiyuan> arrayList2;
        WidgetRun widgetRun = dependencyNode.f8193wireman;
        if (widgetRun.f8199dern == null) {
            androidx.constraintlayout.core.widgets.wireman wiremanVar = this.f25670attabal;
            if (widgetRun == wiremanVar.f8130marial || widgetRun == wiremanVar.f8090beachfront) {
                return;
            }
            if (taiyuanVar == null) {
                taiyuanVar = new taiyuan(widgetRun, i2);
                arrayList.add(taiyuanVar);
            }
            taiyuan taiyuanVar2 = taiyuanVar;
            widgetRun.f8199dern = taiyuanVar2;
            taiyuanVar2.attabal(widgetRun);
            for (wireman wiremanVar2 : widgetRun.f8200impromptu.f8187cutely) {
                if (wiremanVar2 instanceof DependencyNode) {
                    i3 = i;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                    attabal((DependencyNode) wiremanVar2, i3, 0, dependencyNode3, arrayList2, taiyuanVar2);
                } else {
                    i3 = i;
                    dependencyNode3 = dependencyNode2;
                    arrayList2 = arrayList;
                }
                i = i3;
                dependencyNode2 = dependencyNode3;
                arrayList = arrayList2;
            }
            int i4 = i;
            DependencyNode dependencyNode4 = dependencyNode2;
            ArrayList<taiyuan> arrayList3 = arrayList;
            for (wireman wiremanVar3 : widgetRun.f8203taiyuan.f8187cutely) {
                if (wiremanVar3 instanceof DependencyNode) {
                    attabal((DependencyNode) wiremanVar3, i4, 1, dependencyNode4, arrayList3, taiyuanVar2);
                }
            }
            if (i4 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.wireman)) {
                for (wireman wiremanVar4 : ((androidx.constraintlayout.core.widgets.analyzer.wireman) widgetRun).f8210apical.f8187cutely) {
                    if (wiremanVar4 instanceof DependencyNode) {
                        attabal((DependencyNode) wiremanVar4, i4, 2, dependencyNode4, arrayList3, taiyuanVar2);
                    }
                }
            }
            for (DependencyNode dependencyNode5 : widgetRun.f8200impromptu.f8183apical) {
                if (dependencyNode5 == dependencyNode4) {
                    taiyuanVar2.f25701saneness = true;
                }
                attabal(dependencyNode5, i4, 0, dependencyNode4, arrayList3, taiyuanVar2);
            }
            for (DependencyNode dependencyNode6 : widgetRun.f8203taiyuan.f8183apical) {
                if (dependencyNode6 == dependencyNode4) {
                    taiyuanVar2.f25701saneness = true;
                }
                attabal(dependencyNode6, i4, 1, dependencyNode4, arrayList3, taiyuanVar2);
            }
            if (i4 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.wireman)) {
                Iterator<DependencyNode> it = ((androidx.constraintlayout.core.widgets.analyzer.wireman) widgetRun).f8210apical.f8183apical.iterator();
                while (it.hasNext()) {
                    attabal(it.next(), i4, 2, dependencyNode4, arrayList3, taiyuanVar2);
                }
            }
        }
    }

    public boolean beachfront(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f25676saneness || this.f25673dern) {
            for (ConstraintWidget constraintWidget : this.f25670attabal.f37384osteal) {
                constraintWidget.arytenoidectomy();
                constraintWidget.f8087attabal = false;
                constraintWidget.f8130marial.polloi();
                constraintWidget.f8090beachfront.monoploid();
            }
            this.f25670attabal.arytenoidectomy();
            androidx.constraintlayout.core.widgets.wireman wiremanVar = this.f25670attabal;
            wiremanVar.f8087attabal = false;
            wiremanVar.f8130marial.polloi();
            this.f25670attabal.f8090beachfront.monoploid();
            this.f25673dern = false;
        }
        if (saneness(this.f25678wireman)) {
            return false;
        }
        this.f25670attabal.ctenidium(0);
        this.f25670attabal.rajahship(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap = this.f25670attabal.gintrap(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap2 = this.f25670attabal.gintrap(1);
        if (this.f25676saneness) {
            dern();
        }
        int iPermissivist = this.f25670attabal.permissivist();
        int iCultivated = this.f25670attabal.cultivated();
        this.f25670attabal.f8130marial.f8200impromptu.wireman(iPermissivist);
        this.f25670attabal.f8090beachfront.f8200impromptu.wireman(iCultivated);
        impassible();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviourGintrap == dimensionBehaviour || dimensionBehaviourGintrap2 == dimensionBehaviour) {
            if (z) {
                Iterator<WidgetRun> it = this.f25675marial.iterator();
                while (it.hasNext()) {
                    if (!it.next().impassible()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && dimensionBehaviourGintrap == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f25670attabal.prefect(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.wireman wiremanVar2 = this.f25670attabal;
                wiremanVar2.hyalinization(marial(wiremanVar2, 0));
                androidx.constraintlayout.core.widgets.wireman wiremanVar3 = this.f25670attabal;
                wiremanVar3.f8130marial.f8201marial.wireman(wiremanVar3.dent());
            }
            if (z && dimensionBehaviourGintrap2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f25670attabal.vir(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.wireman wiremanVar4 = this.f25670attabal;
                wiremanVar4.sakeen(marial(wiremanVar4, 1));
                androidx.constraintlayout.core.widgets.wireman wiremanVar5 = this.f25670attabal;
                wiremanVar5.f8090beachfront.f8201marial.wireman(wiremanVar5.cord());
            }
        }
        androidx.constraintlayout.core.widgets.wireman wiremanVar6 = this.f25670attabal;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = wiremanVar6.f8149premeiotic[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            int iDent = wiremanVar6.dent() + iPermissivist;
            this.f25670attabal.f8130marial.f8203taiyuan.wireman(iDent);
            this.f25670attabal.f8130marial.f8201marial.wireman(iDent - iPermissivist);
            impassible();
            androidx.constraintlayout.core.widgets.wireman wiremanVar7 = this.f25670attabal;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = wiremanVar7.f8149premeiotic[1];
            if (dimensionBehaviour4 == dimensionBehaviour3 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iCord = wiremanVar7.cord() + iCultivated;
                this.f25670attabal.f8090beachfront.f8203taiyuan.wireman(iCord);
                this.f25670attabal.f8090beachfront.f8201marial.wireman(iCord - iCultivated);
            }
            impassible();
            z2 = true;
        } else {
            z2 = false;
        }
        for (WidgetRun widgetRun : this.f25675marial) {
            if (widgetRun.f8202saneness != this.f25670attabal || widgetRun.f8197competently) {
                widgetRun.marial();
            }
        }
        for (WidgetRun widgetRun2 : this.f25675marial) {
            if (z2 || widgetRun2.f8202saneness != this.f25670attabal) {
                if (!widgetRun2.f8200impromptu.f8192taiyuan || ((!widgetRun2.f8203taiyuan.f8192taiyuan && !(widgetRun2 instanceof impromptu)) || (!widgetRun2.f8201marial.f8192taiyuan && !(widgetRun2 instanceof dern) && !(widgetRun2 instanceof impromptu)))) {
                    this.f25670attabal.prefect(dimensionBehaviourGintrap);
                    this.f25670attabal.vir(dimensionBehaviourGintrap2);
                    return z3;
                }
            }
        }
        z3 = true;
        this.f25670attabal.prefect(dimensionBehaviourGintrap);
        this.f25670attabal.vir(dimensionBehaviourGintrap2);
        return z3;
    }

    public boolean competently(boolean z) {
        if (this.f25676saneness) {
            for (ConstraintWidget constraintWidget : this.f25670attabal.f37384osteal) {
                constraintWidget.arytenoidectomy();
                constraintWidget.f8087attabal = false;
                androidx.constraintlayout.core.widgets.analyzer.dern dernVar = constraintWidget.f8130marial;
                dernVar.f8201marial.f8192taiyuan = false;
                dernVar.f8197competently = false;
                dernVar.polloi();
                androidx.constraintlayout.core.widgets.analyzer.wireman wiremanVar = constraintWidget.f8090beachfront;
                wiremanVar.f8201marial.f8192taiyuan = false;
                wiremanVar.f8197competently = false;
                wiremanVar.monoploid();
            }
            this.f25670attabal.arytenoidectomy();
            androidx.constraintlayout.core.widgets.wireman wiremanVar2 = this.f25670attabal;
            wiremanVar2.f8087attabal = false;
            androidx.constraintlayout.core.widgets.analyzer.dern dernVar2 = wiremanVar2.f8130marial;
            dernVar2.f8201marial.f8192taiyuan = false;
            dernVar2.f8197competently = false;
            dernVar2.polloi();
            androidx.constraintlayout.core.widgets.analyzer.wireman wiremanVar3 = this.f25670attabal.f8090beachfront;
            wiremanVar3.f8201marial.f8192taiyuan = false;
            wiremanVar3.f8197competently = false;
            wiremanVar3.monoploid();
            dern();
        }
        if (saneness(this.f25678wireman)) {
            return false;
        }
        this.f25670attabal.ctenidium(0);
        this.f25670attabal.rajahship(0);
        this.f25670attabal.f8130marial.f8200impromptu.wireman(0);
        this.f25670attabal.f8090beachfront.f8200impromptu.wireman(0);
        return true;
    }

    public void cutely() {
        this.f25676saneness = true;
    }

    public void dern() {
        wireman(this.f25675marial);
        this.f25677taiyuan.clear();
        taiyuan.f25695impromptu = 0;
        taiyuan(this.f25670attabal.f8130marial, 0, this.f25677taiyuan);
        taiyuan(this.f25670attabal.f8090beachfront, 1, this.f25677taiyuan);
        this.f25676saneness = false;
    }

    public final void formularize(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        saneness.attabal attabalVar = this.f25674impromptu;
        attabalVar.f25685attabal = dimensionBehaviour;
        attabalVar.f25692saneness = dimensionBehaviour2;
        attabalVar.f25689dern = i;
        attabalVar.f25694wireman = i2;
        this.f25672competently.saneness(constraintWidget, attabalVar);
        constraintWidget.hyalinization(this.f25674impromptu.f25691marial);
        constraintWidget.sakeen(this.f25674impromptu.f25686beachfront);
        constraintWidget.molet(this.f25674impromptu.f25690impromptu);
        constraintWidget.outmarry(this.f25674impromptu.f25687competently);
    }

    public void impassible() {
        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar;
        for (ConstraintWidget constraintWidget : this.f25670attabal.f37384osteal) {
            if (!constraintWidget.f8087attabal) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f8149premeiotic;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.f8109gintrap;
                int i2 = constraintWidget.f8154rotuma;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar2 = constraintWidget.f8130marial.f8201marial;
                boolean z3 = attabalVar2.f8192taiyuan;
                androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar3 = constraintWidget.f8090beachfront.f8201marial;
                boolean z4 = attabalVar3.f8192taiyuan;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    formularize(constraintWidget, dimensionBehaviour4, attabalVar2.value, dimensionBehaviour4, attabalVar3.value);
                    constraintWidget.f8087attabal = true;
                } else if (z3 && z) {
                    formularize(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, attabalVar2.value, dimensionBehaviour3, attabalVar3.value);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f8090beachfront.f8201marial.f8207formularize = constraintWidget.cord();
                    } else {
                        constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                        constraintWidget.f8087attabal = true;
                    }
                } else if (z4 && z2) {
                    formularize(constraintWidget, dimensionBehaviour3, attabalVar2.value, ConstraintWidget.DimensionBehaviour.FIXED, attabalVar3.value);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f8130marial.f8201marial.f8207formularize = constraintWidget.dent();
                    } else {
                        constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                        constraintWidget.f8087attabal = true;
                    }
                }
                if (constraintWidget.f8087attabal && (attabalVar = constraintWidget.f8090beachfront.f8211formularize) != null) {
                    attabalVar.wireman(constraintWidget.polloi());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c1  */
    public boolean impromptu(boolean z, int i) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z3 = false;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap = this.f25670attabal.gintrap(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap2 = this.f25670attabal.gintrap(1);
        int iPermissivist = this.f25670attabal.permissivist();
        int iCultivated = this.f25670attabal.cultivated();
        if (z && (dimensionBehaviourGintrap == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourGintrap2 == dimensionBehaviour)) {
            for (WidgetRun widgetRun : this.f25675marial) {
                if (widgetRun.f8196beachfront == i && !widgetRun.impassible()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && dimensionBehaviourGintrap == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    this.f25670attabal.prefect(ConstraintWidget.DimensionBehaviour.FIXED);
                    androidx.constraintlayout.core.widgets.wireman wiremanVar = this.f25670attabal;
                    wiremanVar.hyalinization(marial(wiremanVar, 0));
                    androidx.constraintlayout.core.widgets.wireman wiremanVar2 = this.f25670attabal;
                    wiremanVar2.f8130marial.f8201marial.wireman(wiremanVar2.dent());
                }
            } else if (z && dimensionBehaviourGintrap2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                this.f25670attabal.vir(ConstraintWidget.DimensionBehaviour.FIXED);
                androidx.constraintlayout.core.widgets.wireman wiremanVar3 = this.f25670attabal;
                wiremanVar3.sakeen(marial(wiremanVar3, 1));
                androidx.constraintlayout.core.widgets.wireman wiremanVar4 = this.f25670attabal;
                wiremanVar4.f8090beachfront.f8201marial.wireman(wiremanVar4.cord());
            }
        }
        if (i == 0) {
            androidx.constraintlayout.core.widgets.wireman wiremanVar5 = this.f25670attabal;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = wiremanVar5.f8149premeiotic[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iDent = wiremanVar5.dent() + iPermissivist;
                this.f25670attabal.f8130marial.f8203taiyuan.wireman(iDent);
                this.f25670attabal.f8130marial.f8201marial.wireman(iDent - iPermissivist);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            androidx.constraintlayout.core.widgets.wireman wiremanVar6 = this.f25670attabal;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = wiremanVar6.f8149premeiotic[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iCord = wiremanVar6.cord() + iCultivated;
                this.f25670attabal.f8090beachfront.f8203taiyuan.wireman(iCord);
                this.f25670attabal.f8090beachfront.f8201marial.wireman(iCord - iCultivated);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        impassible();
        for (WidgetRun widgetRun2 : this.f25675marial) {
            if (widgetRun2.f8196beachfront == i && (widgetRun2.f8202saneness != this.f25670attabal || widgetRun2.f8197competently)) {
                widgetRun2.marial();
            }
        }
        for (WidgetRun widgetRun3 : this.f25675marial) {
            if (widgetRun3.f8196beachfront == i && (z2 || widgetRun3.f8202saneness != this.f25670attabal)) {
                if (!widgetRun3.f8200impromptu.f8192taiyuan || !widgetRun3.f8203taiyuan.f8192taiyuan || (!(widgetRun3 instanceof dern) && !widgetRun3.f8201marial.f8192taiyuan)) {
                    this.f25670attabal.prefect(dimensionBehaviourGintrap);
                    this.f25670attabal.vir(dimensionBehaviourGintrap2);
                    return z3;
                }
            }
        }
        z3 = true;
        this.f25670attabal.prefect(dimensionBehaviourGintrap);
        this.f25670attabal.vir(dimensionBehaviourGintrap2);
        return z3;
    }

    public final int marial(androidx.constraintlayout.core.widgets.wireman wiremanVar, int i) {
        int size = this.f25677taiyuan.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.f25677taiyuan.get(i2).saneness(wiremanVar, i));
        }
        return (int) jMax;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final boolean saneness(androidx.constraintlayout.core.widgets.wireman wiremanVar) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i;
        char c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        for (ConstraintWidget constraintWidget : wiremanVar.f37384osteal) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f8149premeiotic;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = dimensionBehaviourArr[1];
            if (constraintWidget.clubfoot() == 8) {
                constraintWidget.f8087attabal = true;
            } else {
                if (constraintWidget.f8165stratoscope < 1.0f && dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f8109gintrap = 2;
                }
                if (constraintWidget.f8180yemenite < 1.0f && dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f8154rotuma = 2;
                }
                if (constraintWidget.rotuma() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour6 == dimensionBehaviour8 && (dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f8109gintrap = 3;
                    } else if (dimensionBehaviour7 == dimensionBehaviour8 && (dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f8154rotuma = 3;
                    } else if (dimensionBehaviour6 == dimensionBehaviour8 && dimensionBehaviour7 == dimensionBehaviour8) {
                        if (constraintWidget.f8109gintrap == 0) {
                            constraintWidget.f8109gintrap = 3;
                        }
                        if (constraintWidget.f8154rotuma == 0) {
                            constraintWidget.f8154rotuma = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour6 == dimensionBehaviour9 && constraintWidget.f8109gintrap == 1 && (constraintWidget.f8164starveling.f8073beachfront == null || constraintWidget.f8177walach.f8073beachfront == null)) {
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (dimensionBehaviour7 == dimensionBehaviour9 && constraintWidget.f8154rotuma == 1 && (constraintWidget.f8116hydrovane.f8073beachfront == null || constraintWidget.f8144peridotite.f8073beachfront == null)) {
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                androidx.constraintlayout.core.widgets.analyzer.dern dernVar = constraintWidget.f8130marial;
                dernVar.f8204wireman = dimensionBehaviour6;
                int i2 = constraintWidget.f8109gintrap;
                dernVar.f8195attabal = i2;
                androidx.constraintlayout.core.widgets.analyzer.wireman wiremanVar2 = constraintWidget.f8090beachfront;
                wiremanVar2.f8204wireman = dimensionBehaviour7;
                int i3 = constraintWidget.f8154rotuma;
                wiremanVar2.f8195attabal = i3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour6 == dimensionBehaviour10 || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour7 == dimensionBehaviour10 || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour7 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviour7;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviour6;
                    int iDent = constraintWidget.dent();
                    if (dimensionBehaviour12 == dimensionBehaviour10) {
                        iDent = (wiremanVar.dent() - constraintWidget.f8164starveling.f8074competently) - constraintWidget.f8177walach.f8074competently;
                        dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int i4 = iDent;
                    int iCord = constraintWidget.cord();
                    if (dimensionBehaviour11 == dimensionBehaviour10) {
                        iCord = (wiremanVar.cord() - constraintWidget.f8116hydrovane.f8074competently) - constraintWidget.f8144peridotite.f8074competently;
                        dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    formularize(constraintWidget, dimensionBehaviour12, i4, dimensionBehaviour11, iCord);
                    constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                    constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                    constraintWidget.f8087attabal = true;
                } else {
                    if (dimensionBehaviour6 == dimensionBehaviour9) {
                        dimensionBehaviour2 = dimensionBehaviour9;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        c = 0;
                        if (dimensionBehaviour7 != dimensionBehaviour13 && dimensionBehaviour7 != ConstraintWidget.DimensionBehaviour.FIXED) {
                            dimensionBehaviour = dimensionBehaviour7;
                            i = 3;
                        } else if (i2 == 3) {
                            if (dimensionBehaviour7 == dimensionBehaviour13) {
                                formularize(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                            }
                            int iCord2 = constraintWidget.cord();
                            int i5 = (int) ((iCord2 * constraintWidget.f8121itchy) + 0.5f);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                            formularize(constraintWidget, dimensionBehaviour14, i5, dimensionBehaviour14, iCord2);
                            constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                            constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                            constraintWidget.f8087attabal = true;
                        } else if (i2 == 1) {
                            formularize(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour7, 0);
                            constraintWidget.f8130marial.f8201marial.f8207formularize = constraintWidget.dent();
                        } else {
                            dimensionBehaviour = dimensionBehaviour7;
                            i = 3;
                            if (i2 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = wiremanVar.f8149premeiotic[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour15 == dimensionBehaviour16 || dimensionBehaviour15 == dimensionBehaviour10) {
                                    formularize(constraintWidget, dimensionBehaviour16, (int) ((constraintWidget.f8165stratoscope * wiremanVar.dent()) + 0.5f), dimensionBehaviour, constraintWidget.cord());
                                    constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                                    constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                                    constraintWidget.f8087attabal = true;
                                }
                            } else {
                                ConstraintAnchor[] constraintAnchorArr = constraintWidget.f8103dent;
                                if (constraintAnchorArr[0].f8073beachfront == null || constraintAnchorArr[1].f8073beachfront == null) {
                                    formularize(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour, 0);
                                    constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                                    constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                                    constraintWidget.f8087attabal = true;
                                } else if (dimensionBehaviour == dimensionBehaviour2 || !(dimensionBehaviour6 == (dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour6 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                                    dimensionBehaviour3 = dimensionBehaviour6;
                                    if (dimensionBehaviour3 != dimensionBehaviour2 && dimensionBehaviour == dimensionBehaviour2) {
                                        if (i2 == 1 || i3 == 1) {
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                            formularize(constraintWidget, dimensionBehaviour17, 0, dimensionBehaviour17, 0);
                                            constraintWidget.f8130marial.f8201marial.f8207formularize = constraintWidget.dent();
                                            constraintWidget.f8090beachfront.f8201marial.f8207formularize = constraintWidget.cord();
                                        } else if (i3 == 2 && i2 == 2) {
                                            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = wiremanVar.f8149premeiotic;
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr2[c];
                                            ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = ConstraintWidget.DimensionBehaviour.FIXED;
                                            if (dimensionBehaviour18 == dimensionBehaviour19 && dimensionBehaviourArr2[1] == dimensionBehaviour19) {
                                                formularize(constraintWidget, dimensionBehaviour19, (int) ((constraintWidget.f8165stratoscope * wiremanVar.dent()) + 0.5f), dimensionBehaviour19, (int) ((constraintWidget.f8180yemenite * wiremanVar.cord()) + 0.5f));
                                                constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                                                constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                                                constraintWidget.f8087attabal = true;
                                            }
                                        }
                                    }
                                } else if (i3 == i) {
                                    if (dimensionBehaviour6 == dimensionBehaviour4) {
                                        formularize(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour4, 0);
                                    }
                                    int iDent2 = constraintWidget.dent();
                                    float f = constraintWidget.f8121itchy;
                                    if (constraintWidget.preprohormone() == -1) {
                                        f = 1.0f / f;
                                    }
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = ConstraintWidget.DimensionBehaviour.FIXED;
                                    formularize(constraintWidget, dimensionBehaviour20, iDent2, dimensionBehaviour20, (int) ((iDent2 * f) + 0.5f));
                                    constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                                    constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                                    constraintWidget.f8087attabal = true;
                                } else if (i3 == 1) {
                                    formularize(constraintWidget, dimensionBehaviour6, 0, dimensionBehaviour4, 0);
                                    constraintWidget.f8090beachfront.f8201marial.f8207formularize = constraintWidget.cord();
                                } else {
                                    dimensionBehaviour3 = dimensionBehaviour6;
                                    if (i3 == 2) {
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = wiremanVar.f8149premeiotic[1];
                                        dimensionBehaviour5 = dimensionBehaviour;
                                        ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = ConstraintWidget.DimensionBehaviour.FIXED;
                                        if (dimensionBehaviour21 == dimensionBehaviour22 || dimensionBehaviour21 == dimensionBehaviour10) {
                                            formularize(constraintWidget, dimensionBehaviour3, constraintWidget.dent(), dimensionBehaviour22, (int) ((constraintWidget.f8180yemenite * wiremanVar.cord()) + 0.5f));
                                            constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                                            constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                                            constraintWidget.f8087attabal = true;
                                        } else {
                                            dimensionBehaviour = dimensionBehaviour5;
                                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                            }
                                        }
                                    } else {
                                        dimensionBehaviour5 = dimensionBehaviour;
                                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.f8103dent;
                                        if (constraintAnchorArr2[2].f8073beachfront == null || constraintAnchorArr2[i].f8073beachfront == null) {
                                            formularize(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour5, 0);
                                            constraintWidget.f8130marial.f8201marial.wireman(constraintWidget.dent());
                                            constraintWidget.f8090beachfront.f8201marial.wireman(constraintWidget.cord());
                                            constraintWidget.f8087attabal = true;
                                        } else {
                                            dimensionBehaviour = dimensionBehaviour5;
                                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour7;
                        i = 3;
                        c = 0;
                        dimensionBehaviour2 = dimensionBehaviour9;
                    }
                    if (dimensionBehaviour == dimensionBehaviour2) {
                    }
                    dimensionBehaviour3 = dimensionBehaviour6;
                    if (dimensionBehaviour3 != dimensionBehaviour2) {
                    }
                }
            }
        }
        return false;
    }

    public final void taiyuan(WidgetRun widgetRun, int i, ArrayList<taiyuan> arrayList) {
        for (wireman wiremanVar : widgetRun.f8200impromptu.f8187cutely) {
            if (wiremanVar instanceof DependencyNode) {
                attabal((DependencyNode) wiremanVar, i, 0, widgetRun.f8203taiyuan, arrayList, null);
            } else if (wiremanVar instanceof WidgetRun) {
                attabal(((WidgetRun) wiremanVar).f8200impromptu, i, 0, widgetRun.f8203taiyuan, arrayList, null);
            }
        }
        for (wireman wiremanVar2 : widgetRun.f8203taiyuan.f8187cutely) {
            if (wiremanVar2 instanceof DependencyNode) {
                attabal((DependencyNode) wiremanVar2, i, 1, widgetRun.f8200impromptu, arrayList, null);
            } else if (wiremanVar2 instanceof WidgetRun) {
                attabal(((WidgetRun) wiremanVar2).f8203taiyuan, i, 1, widgetRun.f8200impromptu, arrayList, null);
            }
        }
        int i2 = i;
        if (i2 == 1) {
            for (wireman wiremanVar3 : ((androidx.constraintlayout.core.widgets.analyzer.wireman) widgetRun).f8210apical.f8187cutely) {
                if (wiremanVar3 instanceof DependencyNode) {
                    attabal((DependencyNode) wiremanVar3, i2, 2, null, arrayList, null);
                }
                i2 = i;
            }
        }
    }

    public void triweekly(saneness.InterfaceC0598saneness interfaceC0598saneness) {
        this.f25672competently = interfaceC0598saneness;
    }

    public void wireman(ArrayList<WidgetRun> arrayList) {
        arrayList.clear();
        this.f25678wireman.f8130marial.beachfront();
        this.f25678wireman.f8090beachfront.beachfront();
        arrayList.add(this.f25678wireman.f8130marial);
        arrayList.add(this.f25678wireman.f8090beachfront);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.f25678wireman.f37384osteal) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.beachfront) {
                arrayList.add(new impromptu(constraintWidget));
            } else {
                if (constraintWidget.sayid()) {
                    if (constraintWidget.f8104dern == null) {
                        constraintWidget.f8104dern = new dern(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f8104dern);
                } else {
                    arrayList.add(constraintWidget.f8130marial);
                }
                if (constraintWidget.coi()) {
                    if (constraintWidget.f8178wireman == null) {
                        constraintWidget.f8178wireman = new dern(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f8178wireman);
                } else {
                    arrayList.add(constraintWidget.f8090beachfront);
                }
                if (constraintWidget instanceof sayid.saneness) {
                    arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.saneness(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().beachfront();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f8202saneness != this.f25678wireman) {
                widgetRun.wireman();
            }
        }
    }
}
