package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.unity3d.services.UnityAdsConstants;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: ConstraintWidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends sayid.dern {

    /* JADX INFO: renamed from: cig, reason: collision with root package name */
    public int f8306cig;

    /* JADX INFO: renamed from: demilitarize, reason: collision with root package name */
    public int f8310demilitarize;

    /* JADX INFO: renamed from: fastrack, reason: collision with root package name */
    public int f8312fastrack;

    /* JADX INFO: renamed from: linendraper, reason: collision with root package name */
    public int f8319linendraper;

    /* JADX INFO: renamed from: sultanate, reason: collision with root package name */
    public int f8328sultanate;

    /* JADX INFO: renamed from: licking, reason: collision with root package name */
    public empress.saneness f8318licking = new empress.saneness(this);

    /* JADX INFO: renamed from: microchemistry, reason: collision with root package name */
    public empress.marial f8321microchemistry = new empress.marial(this);

    /* JADX INFO: renamed from: cosy, reason: collision with root package name */
    public empress.saneness.InterfaceC0598saneness f8307cosy = null;

    /* JADX INFO: renamed from: pruinose, reason: collision with root package name */
    public boolean f8324pruinose = false;

    /* JADX INFO: renamed from: tarboosh, reason: collision with root package name */
    public androidx.constraintlayout.core.dern f8330tarboosh = new androidx.constraintlayout.core.dern();

    /* JADX INFO: renamed from: stupefactive, reason: collision with root package name */
    public int f8327stupefactive = 0;

    /* JADX INFO: renamed from: libya, reason: collision with root package name */
    public int f8317libya = 0;

    /* JADX INFO: renamed from: decarock, reason: collision with root package name */
    public dern[] f8309decarock = new dern[4];

    /* JADX INFO: renamed from: tailoring, reason: collision with root package name */
    public dern[] f8329tailoring = new dern[4];

    /* JADX INFO: renamed from: liable, reason: collision with root package name */
    public boolean f8316liable = false;

    /* JADX INFO: renamed from: vir, reason: collision with root package name */
    public boolean f8334vir = false;

    /* JADX INFO: renamed from: twybill, reason: collision with root package name */
    public boolean f8332twybill = false;

    /* JADX INFO: renamed from: miliaria, reason: collision with root package name */
    public int f8322miliaria = 0;

    /* JADX INFO: renamed from: incorrectly, reason: collision with root package name */
    public int f8315incorrectly = 0;

    /* JADX INFO: renamed from: hyalinization, reason: collision with root package name */
    public int f8313hyalinization = 257;

    /* JADX INFO: renamed from: puffin, reason: collision with root package name */
    public boolean f8325puffin = false;

    /* JADX INFO: renamed from: ctenidium, reason: collision with root package name */
    public boolean f8308ctenidium = false;

    /* JADX INFO: renamed from: rajahship, reason: collision with root package name */
    public boolean f8326rajahship = false;

    /* JADX INFO: renamed from: tout, reason: collision with root package name */
    public int f8331tout = 0;

    /* JADX INFO: renamed from: undecorated, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f8333undecorated = null;

    /* JADX INFO: renamed from: ethene, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f8311ethene = null;

    /* JADX INFO: renamed from: microanalysis, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f8320microanalysis = null;

    /* JADX INFO: renamed from: hydromechanics, reason: collision with root package name */
    public WeakReference<ConstraintAnchor> f8314hydromechanics = null;

    /* JADX INFO: renamed from: polyfoil, reason: collision with root package name */
    public HashSet<ConstraintWidget> f8323polyfoil = new HashSet<>();

    /* JADX INFO: renamed from: bluecoat, reason: collision with root package name */
    public empress.saneness.attabal f8305bluecoat = new empress.saneness.attabal();

    public static boolean crock(int i, ConstraintWidget constraintWidget, empress.saneness.InterfaceC0598saneness interfaceC0598saneness, empress.saneness.attabal attabalVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0598saneness == null) {
            return false;
        }
        if (constraintWidget.clubfoot() == 8 || (constraintWidget instanceof beachfront) || (constraintWidget instanceof attabal)) {
            attabalVar.f25691marial = 0;
            attabalVar.f25686beachfront = 0;
            return false;
        }
        attabalVar.f25685attabal = constraintWidget.trm();
        attabalVar.f25692saneness = constraintWidget.splinterproof();
        attabalVar.f25689dern = constraintWidget.dent();
        attabalVar.f25694wireman = constraintWidget.cord();
        attabalVar.f25693taiyuan = false;
        attabalVar.f25688cutely = i2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = attabalVar.f25685attabal;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        boolean z2 = attabalVar.f25692saneness == dimensionBehaviour2;
        boolean z3 = z && constraintWidget.f8121itchy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z4 = z2 && constraintWidget.f8121itchy > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z && constraintWidget.timberyard(0) && constraintWidget.f8109gintrap == 0 && !z3) {
            attabalVar.f25685attabal = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.f8154rotuma == 0) {
                attabalVar.f25685attabal = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.timberyard(1) && constraintWidget.f8154rotuma == 0 && !z4) {
            attabalVar.f25692saneness = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.f8109gintrap == 0) {
                attabalVar.f25692saneness = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.underbelly()) {
            attabalVar.f25685attabal = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.preterite()) {
            attabalVar.f25692saneness = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.f8150preprohormone[0] == 4) {
                attabalVar.f25685attabal = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = attabalVar.f25692saneness;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour3 == dimensionBehaviour4) {
                    i4 = attabalVar.f25694wireman;
                } else {
                    attabalVar.f25685attabal = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0598saneness.saneness(constraintWidget, attabalVar);
                    i4 = attabalVar.f25686beachfront;
                }
                attabalVar.f25685attabal = dimensionBehaviour4;
                attabalVar.f25689dern = (int) (constraintWidget.rotuma() * i4);
            }
        }
        if (z4) {
            if (constraintWidget.f8150preprohormone[1] == 4) {
                attabalVar.f25692saneness = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = attabalVar.f25685attabal;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    i3 = attabalVar.f25689dern;
                } else {
                    attabalVar.f25692saneness = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    interfaceC0598saneness.saneness(constraintWidget, attabalVar);
                    i3 = attabalVar.f25691marial;
                }
                attabalVar.f25692saneness = dimensionBehaviour6;
                if (constraintWidget.preprohormone() == -1) {
                    attabalVar.f25694wireman = (int) (i3 / constraintWidget.rotuma());
                } else {
                    attabalVar.f25694wireman = (int) (constraintWidget.rotuma() * i3);
                }
            }
        }
        interfaceC0598saneness.saneness(constraintWidget, attabalVar);
        constraintWidget.hyalinization(attabalVar.f25691marial);
        constraintWidget.sakeen(attabalVar.f25686beachfront);
        constraintWidget.molet(attabalVar.f25690impromptu);
        constraintWidget.outmarry(attabalVar.f25687competently);
        attabalVar.f25688cutely = empress.saneness.attabal.f25682apical;
        return attabalVar.f25693taiyuan;
    }

    public final void alloy(ConstraintWidget constraintWidget) {
        int i = this.f8317libya + 1;
        dern[] dernVarArr = this.f8309decarock;
        if (i >= dernVarArr.length) {
            this.f8309decarock = (dern[]) Arrays.copyOf(dernVarArr, dernVarArr.length * 2);
        }
        this.f8309decarock[this.f8317libya] = new dern(constraintWidget, 1, bleacherite());
        this.f8317libya++;
    }

    public final void astrogate() {
        this.f8327stupefactive = 0;
        this.f8317libya = 0;
    }

    public void balance() {
        this.f8321microchemistry.cutely();
    }

    public boolean bavaria() {
        return this.f8326rajahship;
    }

    public boolean bleacherite() {
        return this.f8324pruinose;
    }

    public int brighton() {
        return this.f8313hyalinization;
    }

    public final void collection(ConstraintWidget constraintWidget) {
        int i = this.f8327stupefactive + 1;
        dern[] dernVarArr = this.f8329tailoring;
        if (i >= dernVarArr.length) {
            this.f8329tailoring = (dern[]) Arrays.copyOf(dernVarArr, dernVarArr.length * 2);
        }
        this.f8329tailoring[this.f8327stupefactive] = new dern(constraintWidget, 0, bleacherite());
        this.f8327stupefactive++;
    }

    public boolean cybernatic(androidx.constraintlayout.core.dern dernVar) {
        wireman wiremanVar;
        androidx.constraintlayout.core.dern dernVar2;
        boolean zElectropaint = electropaint(64);
        competently(dernVar, zElectropaint);
        int size = this.f37384osteal.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f37384osteal.get(i);
            constraintWidget.microchemistry(0, false);
            constraintWidget.microchemistry(1, false);
            if (constraintWidget instanceof attabal) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.f37384osteal.get(i2);
                if (constraintWidget2 instanceof attabal) {
                    ((attabal) constraintWidget2).likeable();
                }
            }
        }
        this.f8323polyfoil.clear();
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget3 = this.f37384osteal.get(i3);
            if (constraintWidget3.beachfront()) {
                if (constraintWidget3 instanceof taiyuan) {
                    this.f8323polyfoil.add(constraintWidget3);
                } else {
                    constraintWidget3.competently(dernVar, zElectropaint);
                }
            }
        }
        while (this.f8323polyfoil.size() > 0) {
            int size2 = this.f8323polyfoil.size();
            Iterator<ConstraintWidget> it = this.f8323polyfoil.iterator();
            while (it.hasNext()) {
                taiyuan taiyuanVar = (taiyuan) it.next();
                if (taiyuanVar.harlequinade(this.f8323polyfoil)) {
                    taiyuanVar.competently(dernVar, zElectropaint);
                    this.f8323polyfoil.remove(taiyuanVar);
                    break;
                }
            }
            if (size2 == this.f8323polyfoil.size()) {
                Iterator<ConstraintWidget> it2 = this.f8323polyfoil.iterator();
                while (it2.hasNext()) {
                    it2.next().competently(dernVar, zElectropaint);
                }
                this.f8323polyfoil.clear();
            }
        }
        if (androidx.constraintlayout.core.dern.f8031molybdenite) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                ConstraintWidget constraintWidget4 = this.f37384osteal.get(i4);
                if (!constraintWidget4.beachfront()) {
                    hashSet.add(constraintWidget4);
                }
            }
            wiremanVar = this;
            dernVar2 = dernVar;
            wiremanVar.marial(this, dernVar2, hashSet, trm() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget5 : hashSet) {
                competently.attabal(this, dernVar2, constraintWidget5);
                constraintWidget5.competently(dernVar2, zElectropaint);
            }
        } else {
            wiremanVar = this;
            dernVar2 = dernVar;
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget6 = wiremanVar.f37384osteal.get(i5);
                if (constraintWidget6 instanceof wireman) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget6.f8149premeiotic;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.prefect(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.vir(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget6.competently(dernVar2, zElectropaint);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget6.prefect(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget6.vir(dimensionBehaviour2);
                    }
                } else {
                    competently.attabal(this, dernVar2, constraintWidget6);
                    if (!constraintWidget6.beachfront()) {
                        constraintWidget6.competently(dernVar2, zElectropaint);
                    }
                }
            }
        }
        if (wiremanVar.f8327stupefactive > 0) {
            saneness.saneness(this, dernVar2, null, 0);
        }
        if (wiremanVar.f8317libya > 0) {
            saneness.saneness(this, dernVar2, null, 1);
        }
        return true;
    }

    public boolean electropaint(int i) {
        return (this.f8313hyalinization & i) == i;
    }

    public void estragon(boolean z) {
        this.f8324pruinose = z;
    }

    public final void genii(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f8330tarboosh.impromptu(solverVariable, this.f8330tarboosh.monoploid(constraintAnchor), 0, 5);
    }

    public boolean ghoulish(androidx.constraintlayout.core.dern dernVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zElectropaint = electropaint(64);
        ethene(dernVar, zElectropaint);
        int size = this.f37384osteal.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f37384osteal.get(i);
            constraintWidget.ethene(dernVar, zElectropaint);
            if (constraintWidget.treadless()) {
                z = true;
            }
        }
        return z;
    }

    public void harlequinade(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            collection(constraintWidget);
        } else if (i == 1) {
            alloy(constraintWidget);
        }
    }

    public void homophylic(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8311ethene;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.marial() > this.f8311ethene.get().marial()) {
            this.f8311ethene = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0206  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f  */
    /* JADX WARN: Code duplicated, block: B:124:0x0218 A[LOOP:5: B:123:0x0216->B:124:0x0218, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:143:0x029b  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:164:0x031b A[PHI: r13 r19
  0x031b: PHI (r13v9 ??) = (r13v8 ??), (r13v11 ??), (r13v11 ??), (r13v11 ??) binds: [B:150:0x02d7, B:159:0x0300, B:160:0x0302, B:162:0x0308] A[DONT_GENERATE, DONT_INLINE]
  0x031b: PHI (r19v4 ??) = (r19v3 ??), (r19v6 ??), (r19v6 ??), (r19v6 ??) binds: [B:150:0x02d7, B:159:0x0300, B:160:0x0302, B:162:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:166:0x031f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0322  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v85 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v19 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v20 */
    /* JADX WARN: Type inference failed for: r19v21 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // sayid.dern
    public void hydromechanics() {
        int i;
        int i2;
        boolean z;
        int i3;
        ?? r18;
        char c;
        ?? Cybernatic;
        int i4;
        ?? Ghoulish;
        ?? r19;
        int iMax;
        ?? r110;
        ?? r13;
        int iMax2;
        ?? r111;
        ?? r14;
        int i5;
        ?? r112;
        ?? r15;
        ?? r16;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ?? r6;
        ?? r17;
        ?? r0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        int i6 = 0;
        this.f8126lerp = 0;
        this.f8139nosophobia = 0;
        this.f8308ctenidium = false;
        this.f8326rajahship = false;
        int size = this.f37384osteal.size();
        int iMax3 = Math.max(0, dent());
        int iMax4 = Math.max(0, cord());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f8149premeiotic;
        boolean z2 = true;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[0];
        if (this.f8312fastrack == 0 && competently.saneness(this.f8313hyalinization, 1)) {
            empress.beachfront.impromptu(this, imparkation());
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget = this.f37384osteal.get(i7);
                if (constraintWidget.sensatory() && !(constraintWidget instanceof beachfront) && !(constraintWidget instanceof attabal) && !(constraintWidget instanceof taiyuan) && !constraintWidget.czestochowa()) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap = constraintWidget.gintrap(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap2 = constraintWidget.gintrap(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviourGintrap != dimensionBehaviour6 || constraintWidget.f8109gintrap == 1 || dimensionBehaviourGintrap2 != dimensionBehaviour6 || constraintWidget.f8154rotuma == 1) {
                        crock(0, constraintWidget, this.f8307cosy, new empress.saneness.attabal(), empress.saneness.attabal.f25682apical);
                    }
                }
            }
        }
        char c2 = 2;
        if (size <= 2 || !((dimensionBehaviour5 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == dimensionBehaviour3) && competently.saneness(this.f8313hyalinization, 1024) && empress.competently.dern(this, imparkation()))) {
            i = iMax4;
            i2 = iMax3;
            z = false;
        } else {
            if (dimensionBehaviour5 == dimensionBehaviour3) {
                if (iMax3 >= dent() || iMax3 <= 0) {
                    iMax3 = dent();
                } else {
                    hyalinization(iMax3);
                    this.f8308ctenidium = true;
                }
            }
            if (dimensionBehaviour4 == dimensionBehaviour3) {
                if (iMax4 >= cord() || iMax4 <= 0) {
                    iMax4 = cord();
                } else {
                    sakeen(iMax4);
                    this.f8326rajahship = true;
                }
            }
            i = iMax4;
            i2 = iMax3;
            z = true;
        }
        boolean z3 = electropaint(64) || electropaint(128);
        androidx.constraintlayout.core.dern dernVar = this.f8330tarboosh;
        dernVar.f8049taiyuan = false;
        dernVar.f8039cutely = false;
        if (this.f8313hyalinization != 0 && z3) {
            dernVar.f8039cutely = true;
        }
        ArrayList<ConstraintWidget> arrayList = this.f37384osteal;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = trm();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z4 = dimensionBehaviourTrm == dimensionBehaviour7 || splinterproof() == dimensionBehaviour7;
        astrogate();
        for (int i8 = 0; i8 < size; i8++) {
            ConstraintWidget constraintWidget2 = this.f37384osteal.get(i8);
            if (constraintWidget2 instanceof sayid.dern) {
                ((sayid.dern) constraintWidget2).hydromechanics();
            }
        }
        boolean zElectropaint = electropaint(64);
        ?? r113 = z;
        int i9 = 0;
        ?? r114 = 1;
        while (r114 != 0) {
            int i10 = i9 + 1;
            try {
                this.f8330tarboosh.yemenite();
                astrogate();
                kowloon(this.f8330tarboosh);
                int i11 = i6;
                while (i11 < size) {
                    i3 = i6;
                    try {
                        c = c2;
                        try {
                            this.f37384osteal.get(i11).kowloon(this.f8330tarboosh);
                            i11++;
                            i6 = i3;
                            c2 = c;
                        } catch (Exception e) {
                            e = e;
                            r18 = z2;
                            Cybernatic = r114;
                            e.printStackTrace();
                            PrintStream printStream = System.out;
                            e.toString();
                            printStream.getClass();
                            if (Cybernatic != 0) {
                                Ghoulish = ghoulish(this.f8330tarboosh, competently.f8226attabal);
                            } else {
                                ethene(this.f8330tarboosh, zElectropaint);
                                for (i4 = i3; i4 < size; i4++) {
                                    this.f37384osteal.get(i4).ethene(this.f8330tarboosh, zElectropaint);
                                }
                                Ghoulish = i3;
                            }
                            if (z4) {
                                r19 = Ghoulish == true ? 1 : 0;
                            } else {
                                r19 = Ghoulish == true ? 1 : 0;
                            }
                            iMax = Math.max(this.f8161sensatory, dent());
                            r13 = r113;
                            r110 = r19;
                            if (iMax > dent()) {
                                hyalinization(iMax);
                                this.f8149premeiotic[i3] = ConstraintWidget.DimensionBehaviour.FIXED;
                                ?? r115 = r18;
                                r110 = r115 == true ? 1 : 0;
                                r13 = r115;
                            }
                            iMax2 = Math.max(this.f8175underbelly, cord());
                            r14 = r13;
                            r111 = r110;
                            if (iMax2 > cord()) {
                                sakeen(iMax2);
                                this.f8149premeiotic[r18] = ConstraintWidget.DimensionBehaviour.FIXED;
                                r17 = r18;
                                r111 = r17 == true ? 1 : 0;
                            }
                            if (r14 == 0) {
                                dimensionBehaviour = this.f8149premeiotic[i3];
                                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                if (dimensionBehaviour == dimensionBehaviour2) {
                                    r14 = r17;
                                    r6 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                } else {
                                    r14 = r17;
                                    r6 = r18;
                                    r14 = r14;
                                    r111 = r111;
                                }
                                if (this.f8149premeiotic[r6] == dimensionBehaviour2) {
                                    r14 = r17;
                                    i5 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                } else {
                                    r14 = r17;
                                    i5 = 8;
                                    r15 = r14;
                                    r112 = r111;
                                }
                            } else {
                                r14 = r17;
                                i5 = 8;
                                r15 = r14;
                                r112 = r111;
                            }
                            if (i10 > i5) {
                                r16 = i3;
                            } else {
                                r16 = r112;
                            }
                            i9 = i10;
                            i6 = i3;
                            c2 = c;
                            z2 = true;
                            r113 = r15;
                            r114 = r16;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        c = c2;
                    }
                }
                i3 = i6;
                c = c2;
                Cybernatic = cybernatic(this.f8330tarboosh);
                WeakReference<ConstraintAnchor> weakReference = this.f8333undecorated;
                if (weakReference == null || weakReference.get() == null) {
                    r18 = z2;
                } else {
                    boolean z5 = z2;
                    try {
                        saccharic(this.f8333undecorated.get(), this.f8330tarboosh.monoploid(this.f8116hydrovane));
                        this.f8333undecorated = null;
                        r18 = z5;
                    } catch (Exception e3) {
                        e = e3;
                        Cybernatic = Cybernatic;
                        r18 = z5;
                        e.printStackTrace();
                        PrintStream printStream2 = System.out;
                        e.toString();
                        printStream2.getClass();
                    }
                }
                WeakReference<ConstraintAnchor> weakReference2 = this.f8320microanalysis;
                if (weakReference2 != null && weakReference2.get() != null) {
                    genii(this.f8320microanalysis.get(), this.f8330tarboosh.monoploid(this.f8144peridotite));
                    this.f8320microanalysis = null;
                }
                WeakReference<ConstraintAnchor> weakReference3 = this.f8311ethene;
                if (weakReference3 != null && weakReference3.get() != null) {
                    saccharic(this.f8311ethene.get(), this.f8330tarboosh.monoploid(this.f8164starveling));
                    this.f8311ethene = null;
                }
                WeakReference<ConstraintAnchor> weakReference4 = this.f8314hydromechanics;
                if (weakReference4 != null && weakReference4.get() != null) {
                    genii(this.f8314hydromechanics.get(), this.f8330tarboosh.monoploid(this.f8177walach));
                    this.f8314hydromechanics = null;
                }
                if (Cybernatic != 0) {
                    this.f8330tarboosh.cuirassed();
                }
            } catch (Exception e4) {
                e = e4;
                i3 = i6;
                r18 = z2;
                c = c2;
                Cybernatic = r114;
            }
            if (Cybernatic != 0) {
                Ghoulish = ghoulish(this.f8330tarboosh, competently.f8226attabal);
            } else {
                ethene(this.f8330tarboosh, zElectropaint);
                while (i4 < size) {
                    this.f37384osteal.get(i4).ethene(this.f8330tarboosh, zElectropaint);
                }
                Ghoulish = i3;
            }
            if (z4 || i10 >= 8 || !competently.f8226attabal[c]) {
                r19 = Ghoulish == true ? 1 : 0;
            } else {
                int i12 = i3;
                int iMax5 = i12;
                int iMax6 = iMax5;
                while (i12 < size) {
                    r0 = Ghoulish;
                    ConstraintWidget constraintWidget3 = this.f37384osteal.get(i12);
                    iMax5 = Math.max(iMax5, constraintWidget3.f8126lerp + constraintWidget3.dent());
                    iMax6 = Math.max(iMax6, constraintWidget3.f8139nosophobia + constraintWidget3.cord());
                    i12++;
                    r0 = r0 == true ? 1 : 0;
                }
                r0 = Ghoulish;
                ?? r116 = r0;
                int iMax7 = Math.max(this.f8161sensatory, iMax5);
                int iMax8 = Math.max(this.f8175underbelly, iMax6);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                r113 = r113;
                r19 = r116;
                if (dimensionBehaviour5 == dimensionBehaviour8 && dent() < iMax7) {
                    r113 = r113;
                    r19 = r116;
                    hyalinization(iMax7);
                    this.f8149premeiotic[i3] = dimensionBehaviour8;
                    ?? r117 = r18;
                    r19 = r117 == true ? 1 : 0;
                    r113 = r117;
                }
                if (dimensionBehaviour4 == dimensionBehaviour8 && cord() < iMax8) {
                    sakeen(iMax8);
                    this.f8149premeiotic[r18] = dimensionBehaviour8;
                    r113 = r18;
                    r19 = r113 == true ? 1 : 0;
                }
            }
            iMax = Math.max(this.f8161sensatory, dent());
            r13 = r113;
            r110 = r19;
            if (iMax > dent()) {
                hyalinization(iMax);
                this.f8149premeiotic[i3] = ConstraintWidget.DimensionBehaviour.FIXED;
                ?? r118 = r18;
                r110 = r118 == true ? 1 : 0;
                r13 = r118;
            }
            iMax2 = Math.max(this.f8175underbelly, cord());
            r14 = r13;
            r111 = r110;
            if (iMax2 > cord()) {
                sakeen(iMax2);
                this.f8149premeiotic[r18] = ConstraintWidget.DimensionBehaviour.FIXED;
                r17 = r18;
                r111 = r17 == true ? 1 : 0;
            }
            if (r14 == 0) {
                dimensionBehaviour = this.f8149premeiotic[i3];
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour == dimensionBehaviour2 || i2 <= 0 || dent() <= i2) {
                    r14 = r17;
                    r6 = r18;
                    r14 = r14;
                    r111 = r111;
                } else {
                    ?? r7 = r18;
                    this.f8308ctenidium = r7;
                    this.f8149premeiotic[i3] = ConstraintWidget.DimensionBehaviour.FIXED;
                    hyalinization(i2);
                    boolean z6 = r7 == true ? 1 : 0;
                    r111 = z6 ? 1 : 0;
                    r6 = r7;
                    r14 = z6;
                }
                if (this.f8149premeiotic[r6] == dimensionBehaviour2 || i <= 0 || cord() <= i) {
                    r14 = r17;
                    i5 = 8;
                    r15 = r14;
                    r112 = r111;
                } else {
                    this.f8326rajahship = r6;
                    this.f8149premeiotic[r6] = ConstraintWidget.DimensionBehaviour.FIXED;
                    sakeen(i);
                    i5 = 8;
                    r15 = 1;
                    r112 = 1;
                }
            } else {
                r14 = r17;
                i5 = 8;
                r15 = r14;
                r112 = r111;
            }
            if (i10 > i5) {
                r16 = i3;
            } else {
                r16 = r112;
            }
            i9 = i10;
            i6 = i3;
            c2 = c;
            z2 = true;
            r113 = r15;
            r114 = r16;
        }
        int i13 = i6;
        this.f37384osteal = arrayList;
        if (r113 != 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f8149premeiotic;
            dimensionBehaviourArr2[i13] = dimensionBehaviour5;
            dimensionBehaviourArr2[1] = dimensionBehaviour4;
        }
        achondroplasia(this.f8330tarboosh.gintrap());
    }

    public boolean hypokinesis(boolean z) {
        return this.f8321microchemistry.competently(z);
    }

    public empress.saneness.InterfaceC0598saneness imparkation() {
        return this.f8307cosy;
    }

    public androidx.constraintlayout.core.dern infiltration() {
        return this.f8330tarboosh;
    }

    public void irani(empress.saneness.InterfaceC0598saneness interfaceC0598saneness) {
        this.f8307cosy = interfaceC0598saneness;
        this.f8321microchemistry.triweekly(interfaceC0598saneness);
    }

    public void likeable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8314hydromechanics;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.marial() > this.f8314hydromechanics.get().marial()) {
            this.f8314hydromechanics = new WeakReference<>(constraintAnchor);
        }
    }

    public void livable(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8333undecorated;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.marial() > this.f8333undecorated.get().marial()) {
            this.f8333undecorated = new WeakReference<>(constraintAnchor);
        }
    }

    public void mef() {
        this.f8318licking.marial(this);
    }

    public boolean murrine(boolean z, int i) {
        return this.f8321microchemistry.impromptu(z, i);
    }

    public void nattier() {
        this.f8321microchemistry.apical();
    }

    public boolean nomenclative(boolean z) {
        return this.f8321microchemistry.beachfront(z);
    }

    public void palewise(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f8320microanalysis;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.marial() > this.f8320microanalysis.get().marial()) {
            this.f8320microanalysis = new WeakReference<>(constraintAnchor);
        }
    }

    @Override // sayid.dern, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void palmyra() {
        this.f8330tarboosh.yemenite();
        this.f8306cig = 0;
        this.f8328sultanate = 0;
        this.f8310demilitarize = 0;
        this.f8319linendraper = 0;
        this.f8325puffin = false;
        super.palmyra();
    }

    public long philabeg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f8306cig = i8;
        this.f8310demilitarize = i9;
        return this.f8318licking.wireman(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean polliwog() {
        return false;
    }

    public void rsp(int i) {
        this.f8313hyalinization = i;
        androidx.constraintlayout.core.dern.f8031molybdenite = electropaint(512);
    }

    public final void saccharic(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.f8330tarboosh.impromptu(this.f8330tarboosh.monoploid(constraintAnchor), solverVariable, 0, 5);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void starveling(StringBuilder sb) {
        sb.append(this.f8124kowloon + ":{\n");
        sb.append("  actualWidth:" + this.f8134milliradian);
        sb.append("\n");
        sb.append("  actualHeight:" + this.f8171treadless);
        sb.append("\n");
        Iterator<ConstraintWidget> it = microanalysis().iterator();
        while (it.hasNext()) {
            it.next().starveling(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean strother() {
        return this.f8308ctenidium;
    }

    public void transformable(int i) {
        this.f8312fastrack = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void undecorated(boolean z, boolean z2) {
        super.undecorated(z, z2);
        int size = this.f37384osteal.size();
        for (int i = 0; i < size; i++) {
            this.f37384osteal.get(i).undecorated(z, z2);
        }
    }

    public void untruth(coffeecake.saneness sanenessVar) {
        this.f8330tarboosh.dovishness(sanenessVar);
    }
}
