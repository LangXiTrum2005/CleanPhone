package empress;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: ChainRun.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends WidgetRun {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public ArrayList<WidgetRun> f25668apical;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f25669formularize;

    public dern(ConstraintWidget constraintWidget, int i) {
        super(constraintWidget);
        this.f25668apical = new ArrayList<>();
        this.f8196beachfront = i;
        monoploid();
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, empress.wireman
    public void attabal(wireman wiremanVar) {
        int i;
        int i2;
        boolean z;
        float f;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        if (this.f8200impromptu.f8192taiyuan && this.f8203taiyuan.f8192taiyuan) {
            ConstraintWidget constraintWidgetGrimness = this.f8202saneness.grimness();
            boolean zBleacherite = constraintWidgetGrimness instanceof androidx.constraintlayout.core.widgets.wireman ? ((androidx.constraintlayout.core.widgets.wireman) constraintWidgetGrimness).bleacherite() : false;
            int i11 = this.f8203taiyuan.value - this.f8200impromptu.value;
            int size = this.f25668apical.size();
            int i12 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i12 >= size) {
                    i12 = -1;
                    break;
                } else if (this.f25668apical.get(i12).f8202saneness.clubfoot() != 8) {
                    break;
                } else {
                    i12++;
                }
            }
            int i13 = size - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                if (this.f25668apical.get(i14).f8202saneness.clubfoot() != 8) {
                    i = i14;
                    break;
                }
            }
            int i15 = 0;
            while (true) {
                if (i15 >= 2) {
                    z = zBleacherite;
                    f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    f2 = 0.0f;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    break;
                }
                int i16 = 0;
                i4 = 0;
                i5 = 0;
                int i17 = 0;
                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (i16 < size) {
                    WidgetRun widgetRun = this.f25668apical.get(i16);
                    if (widgetRun.f8202saneness.clubfoot() == i2) {
                        z2 = zBleacherite;
                    } else {
                        i17++;
                        if (i16 > 0 && i16 >= i12) {
                            i4 += widgetRun.f8200impromptu.f8185beachfront;
                        }
                        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = widgetRun.f8201marial;
                        int i18 = attabalVar.value;
                        boolean z3 = widgetRun.f8204wireman != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (z3) {
                            int i19 = this.f8196beachfront;
                            if (i19 == 0 && !widgetRun.f8202saneness.f8130marial.f8201marial.f8192taiyuan) {
                                return;
                            }
                            if (i19 == 1 && !widgetRun.f8202saneness.f8090beachfront.f8201marial.f8192taiyuan) {
                                return;
                            } else {
                                z2 = zBleacherite;
                            }
                        } else {
                            z2 = zBleacherite;
                            if (widgetRun.f8195attabal == 1 && i15 == 0) {
                                i18 = attabalVar.f8207formularize;
                                i5++;
                            } else if (attabalVar.f8192taiyuan) {
                            }
                            z3 = true;
                        }
                        if (z3) {
                            i4 += i18;
                        } else {
                            i5++;
                            float f4 = widgetRun.f8202saneness.f8127libyan[this.f8196beachfront];
                            if (f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f2 += f4;
                            }
                        }
                        if (i16 < i13 && i16 < i) {
                            i4 += -widgetRun.f8203taiyuan.f8185beachfront;
                        }
                    }
                    i16++;
                    zBleacherite = z2;
                    i2 = 8;
                }
                z = zBleacherite;
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i4 < i11 || i5 == 0) {
                    i3 = i17;
                    break;
                } else {
                    i15++;
                    zBleacherite = z;
                    i2 = 8;
                }
            }
            int i20 = this.f8200impromptu.value;
            if (z) {
                i20 = this.f8203taiyuan.value;
            }
            float f5 = 0.5f;
            if (i4 > i11) {
                i20 = z ? i20 + ((int) (((i4 - i11) / 2.0f) + 0.5f)) : i20 - ((int) (((i4 - i11) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f6 = i11 - i4;
                int i21 = (int) ((f6 / i5) + 0.5f);
                int i22 = 0;
                int i23 = 0;
                while (i22 < size) {
                    WidgetRun widgetRun2 = this.f25668apical.get(i22);
                    float f7 = f5;
                    int i24 = i20;
                    if (widgetRun2.f8202saneness.clubfoot() != 8 && widgetRun2.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar2 = widgetRun2.f8201marial;
                        if (attabalVar2.f8192taiyuan) {
                            i21 = i21;
                            i23 = i23;
                        } else {
                            int i25 = f2 > f ? (int) (((widgetRun2.f8202saneness.f8127libyan[this.f8196beachfront] * f6) / f2) + f7) : i21;
                            if (this.f8196beachfront == 0) {
                                ConstraintWidget constraintWidget = widgetRun2.f8202saneness;
                                i9 = constraintWidget.f8098cuirassed;
                                i10 = constraintWidget.f8096cord;
                            } else {
                                ConstraintWidget constraintWidget2 = widgetRun2.f8202saneness;
                                i9 = constraintWidget2.f8140oilcan;
                                i10 = constraintWidget2.f8173trm;
                            }
                            int i26 = i23;
                            int iMax = Math.max(i10, widgetRun2.f8195attabal == 1 ? Math.min(i25, attabalVar2.f8207formularize) : i25);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i25) {
                                i23 = i26 + 1;
                                i25 = iMax;
                            } else {
                                i23 = i26;
                            }
                            widgetRun2.f8201marial.wireman(i25);
                        }
                    } else {
                        i21 = i21;
                        i23 = i23;
                    }
                    i22++;
                    f5 = f7;
                    i20 = i24;
                    f6 = f6;
                    i21 = i21;
                }
                i6 = i20;
                f3 = f5;
                int i27 = i23;
                if (i27 > 0) {
                    i5 -= i27;
                    i4 = 0;
                    for (int i28 = 0; i28 < size; i28++) {
                        WidgetRun widgetRun3 = this.f25668apical.get(i28);
                        if (widgetRun3.f8202saneness.clubfoot() != 8) {
                            if (i28 > 0 && i28 >= i12) {
                                i4 += widgetRun3.f8200impromptu.f8185beachfront;
                            }
                            i4 += widgetRun3.f8201marial.value;
                            if (i28 < i13 && i28 < i) {
                                i4 += -widgetRun3.f8203taiyuan.f8185beachfront;
                            }
                        }
                    }
                }
                i8 = 2;
                if (this.f25669formularize == 2 && i27 == 0) {
                    i7 = 0;
                    this.f25669formularize = 0;
                } else {
                    i7 = 0;
                }
            } else {
                i6 = i20;
                f3 = 0.5f;
                i7 = 0;
                i8 = 2;
            }
            if (i4 > i11) {
                this.f25669formularize = i8;
            }
            if (i3 > 0 && i5 == 0 && i12 == i) {
                this.f25669formularize = i8;
            }
            int i29 = this.f25669formularize;
            if (i29 == 1) {
                int i30 = i3 > 1 ? (i11 - i4) / (i3 - 1) : i3 == 1 ? (i11 - i4) / 2 : i7;
                if (i5 > 0) {
                    i30 = i7;
                }
                int i31 = i6;
                while (i7 < size) {
                    WidgetRun widgetRun4 = this.f25668apical.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun4.f8202saneness.clubfoot() == 8) {
                        widgetRun4.f8200impromptu.wireman(i31);
                        widgetRun4.f8203taiyuan.wireman(i31);
                    } else {
                        if (i7 > 0) {
                            i31 = z ? i31 - i30 : i31 + i30;
                        }
                        if (i7 > 0 && i7 >= i12) {
                            i31 = z ? i31 - widgetRun4.f8200impromptu.f8185beachfront : i31 + widgetRun4.f8200impromptu.f8185beachfront;
                        }
                        if (z) {
                            widgetRun4.f8203taiyuan.wireman(i31);
                        } else {
                            widgetRun4.f8200impromptu.wireman(i31);
                        }
                        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar3 = widgetRun4.f8201marial;
                        int i32 = attabalVar3.value;
                        if (widgetRun4.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun4.f8195attabal == 1) {
                            i32 = attabalVar3.f8207formularize;
                        }
                        i31 = z ? i31 - i32 : i31 + i32;
                        if (z) {
                            widgetRun4.f8200impromptu.wireman(i31);
                        } else {
                            widgetRun4.f8203taiyuan.wireman(i31);
                        }
                        widgetRun4.f8197competently = true;
                        if (i7 < i13 && i7 < i) {
                            i31 = z ? i31 - (-widgetRun4.f8203taiyuan.f8185beachfront) : i31 + (-widgetRun4.f8203taiyuan.f8185beachfront);
                        }
                    }
                    i7++;
                }
                return;
            }
            if (i29 == 0) {
                int i33 = (i11 - i4) / (i3 + 1);
                if (i5 > 0) {
                    i33 = i7;
                }
                int i34 = i6;
                while (i7 < size) {
                    WidgetRun widgetRun5 = this.f25668apical.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun5.f8202saneness.clubfoot() == 8) {
                        widgetRun5.f8200impromptu.wireman(i34);
                        widgetRun5.f8203taiyuan.wireman(i34);
                    } else {
                        int i35 = z ? i34 - i33 : i34 + i33;
                        if (i7 > 0 && i7 >= i12) {
                            i35 = z ? i35 - widgetRun5.f8200impromptu.f8185beachfront : i35 + widgetRun5.f8200impromptu.f8185beachfront;
                        }
                        if (z) {
                            widgetRun5.f8203taiyuan.wireman(i35);
                        } else {
                            widgetRun5.f8200impromptu.wireman(i35);
                        }
                        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar4 = widgetRun5.f8201marial;
                        int iMin = attabalVar4.value;
                        if (widgetRun5.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun5.f8195attabal == 1) {
                            iMin = Math.min(iMin, attabalVar4.f8207formularize);
                        }
                        i34 = z ? i35 - iMin : i35 + iMin;
                        if (z) {
                            widgetRun5.f8200impromptu.wireman(i34);
                        } else {
                            widgetRun5.f8203taiyuan.wireman(i34);
                        }
                        if (i7 < i13 && i7 < i) {
                            i34 = z ? i34 - (-widgetRun5.f8203taiyuan.f8185beachfront) : i34 + (-widgetRun5.f8203taiyuan.f8185beachfront);
                        }
                    }
                    i7++;
                }
                return;
            }
            if (i29 == 2) {
                float fCuirassed = this.f8196beachfront == 0 ? this.f8202saneness.cuirassed() : this.f8202saneness.peridotite();
                if (z) {
                    fCuirassed = 1.0f - fCuirassed;
                }
                int i36 = (int) (((i11 - i4) * fCuirassed) + f3);
                if (i36 < 0 || i5 > 0) {
                    i36 = i7;
                }
                int i37 = z ? i6 - i36 : i6 + i36;
                while (i7 < size) {
                    WidgetRun widgetRun6 = this.f25668apical.get(z ? size - (i7 + 1) : i7);
                    if (widgetRun6.f8202saneness.clubfoot() == 8) {
                        widgetRun6.f8200impromptu.wireman(i37);
                        widgetRun6.f8203taiyuan.wireman(i37);
                    } else {
                        if (i7 > 0 && i7 >= i12) {
                            i37 = z ? i37 - widgetRun6.f8200impromptu.f8185beachfront : i37 + widgetRun6.f8200impromptu.f8185beachfront;
                        }
                        if (z) {
                            widgetRun6.f8203taiyuan.wireman(i37);
                        } else {
                            widgetRun6.f8200impromptu.wireman(i37);
                        }
                        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar5 = widgetRun6.f8201marial;
                        int i38 = attabalVar5.value;
                        if (widgetRun6.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && widgetRun6.f8195attabal == 1) {
                            i38 = attabalVar5.f8207formularize;
                        }
                        i37 = z ? i37 - i38 : i37 + i38;
                        if (z) {
                            widgetRun6.f8200impromptu.wireman(i37);
                        } else {
                            widgetRun6.f8203taiyuan.wireman(i37);
                        }
                        if (i7 < i13 && i7 < i) {
                            i37 = z ? i37 - (-widgetRun6.f8203taiyuan.f8185beachfront) : i37 + (-widgetRun6.f8203taiyuan.f8185beachfront);
                        }
                    }
                    i7++;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void beachfront() {
        this.f8199dern = null;
        Iterator<WidgetRun> it = this.f25668apical.iterator();
        while (it.hasNext()) {
            it.next().beachfront();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long cutely() {
        int size = this.f25668apical.size();
        long jCutely = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.f25668apical.get(i);
            jCutely = jCutely + ((long) widgetRun.f8200impromptu.f8185beachfront) + widgetRun.cutely() + ((long) widgetRun.f8203taiyuan.f8185beachfront);
        }
        return jCutely;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean impassible() {
        int size = this.f25668apical.size();
        for (int i = 0; i < size; i++) {
            if (!this.f25668apical.get(i).impassible()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void marial() {
        for (int i = 0; i < this.f25668apical.size(); i++) {
            this.f25668apical.get(i).marial();
        }
    }

    public final ConstraintWidget molybdenite() {
        for (int size = this.f25668apical.size() - 1; size >= 0; size--) {
            WidgetRun widgetRun = this.f25668apical.get(size);
            if (widgetRun.f8202saneness.clubfoot() != 8) {
                return widgetRun.f8202saneness;
            }
        }
        return null;
    }

    public final void monoploid() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2 = this.f8202saneness;
        ConstraintWidget constraintWidgetSaran = constraintWidget2.saran(this.f8196beachfront);
        while (true) {
            ConstraintWidget constraintWidget3 = constraintWidgetSaran;
            constraintWidget = constraintWidget2;
            constraintWidget2 = constraintWidget3;
            if (constraintWidget2 == null) {
                break;
            } else {
                constraintWidgetSaran = constraintWidget2.saran(this.f8196beachfront);
            }
        }
        this.f8202saneness = constraintWidget;
        this.f25668apical.add(constraintWidget.creditor(this.f8196beachfront));
        ConstraintWidget constraintWidgetSeminary = constraintWidget.seminary(this.f8196beachfront);
        while (constraintWidgetSeminary != null) {
            this.f25668apical.add(constraintWidgetSeminary.creditor(this.f8196beachfront));
            constraintWidgetSeminary = constraintWidgetSeminary.seminary(this.f8196beachfront);
        }
        for (WidgetRun widgetRun : this.f25668apical) {
            int i = this.f8196beachfront;
            if (i == 0) {
                widgetRun.f8202saneness.f8104dern = this;
            } else if (i == 1) {
                widgetRun.f8202saneness.f8178wireman = this;
            }
        }
        if (this.f8196beachfront == 0 && ((androidx.constraintlayout.core.widgets.wireman) this.f8202saneness.grimness()).bleacherite() && this.f25668apical.size() > 1) {
            ArrayList<WidgetRun> arrayList = this.f25668apical;
            this.f8202saneness = arrayList.get(arrayList.size() - 1).f8202saneness;
        }
        this.f25669formularize = this.f8196beachfront == 0 ? this.f8202saneness.stratoscope() : this.f8202saneness.mathsort();
    }

    public final ConstraintWidget polloi() {
        for (int i = 0; i < this.f25668apical.size(); i++) {
            WidgetRun widgetRun = this.f25668apical.get(i);
            if (widgetRun.f8202saneness.clubfoot() != 8) {
                return widgetRun.f8202saneness;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f8196beachfront == 0 ? "horizontal : " : "vertical : ");
        for (WidgetRun widgetRun : this.f25668apical) {
            sb.append("<");
            sb.append(widgetRun);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void wireman() {
        Iterator<WidgetRun> it = this.f25668apical.iterator();
        while (it.hasNext()) {
            it.next().wireman();
        }
        int size = this.f25668apical.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f25668apical.get(0).f8202saneness;
        ConstraintWidget constraintWidget2 = this.f25668apical.get(size - 1).f8202saneness;
        if (this.f8196beachfront == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f8164starveling;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f8177walach;
            DependencyNode dependencyNodeTaiyuan = taiyuan(constraintAnchor, 0);
            int iBeachfront = constraintAnchor.beachfront();
            ConstraintWidget constraintWidgetPolloi = polloi();
            if (constraintWidgetPolloi != null) {
                iBeachfront = constraintWidgetPolloi.f8164starveling.beachfront();
            }
            if (dependencyNodeTaiyuan != null) {
                saneness(this.f8200impromptu, dependencyNodeTaiyuan, iBeachfront);
            }
            DependencyNode dependencyNodeTaiyuan2 = taiyuan(constraintAnchor2, 0);
            int iBeachfront2 = constraintAnchor2.beachfront();
            ConstraintWidget constraintWidgetMolybdenite = molybdenite();
            if (constraintWidgetMolybdenite != null) {
                iBeachfront2 = constraintWidgetMolybdenite.f8177walach.beachfront();
            }
            if (dependencyNodeTaiyuan2 != null) {
                saneness(this.f8203taiyuan, dependencyNodeTaiyuan2, -iBeachfront2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f8116hydrovane;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f8144peridotite;
            DependencyNode dependencyNodeTaiyuan3 = taiyuan(constraintAnchor3, 1);
            int iBeachfront3 = constraintAnchor3.beachfront();
            ConstraintWidget constraintWidgetPolloi2 = polloi();
            if (constraintWidgetPolloi2 != null) {
                iBeachfront3 = constraintWidgetPolloi2.f8116hydrovane.beachfront();
            }
            if (dependencyNodeTaiyuan3 != null) {
                saneness(this.f8200impromptu, dependencyNodeTaiyuan3, iBeachfront3);
            }
            DependencyNode dependencyNodeTaiyuan4 = taiyuan(constraintAnchor4, 1);
            int iBeachfront4 = constraintAnchor4.beachfront();
            ConstraintWidget constraintWidgetMolybdenite2 = molybdenite();
            if (constraintWidgetMolybdenite2 != null) {
                iBeachfront4 = constraintWidgetMolybdenite2.f8144peridotite.beachfront();
            }
            if (dependencyNodeTaiyuan4 != null) {
                saneness(this.f8203taiyuan, dependencyNodeTaiyuan4, -iBeachfront4);
            }
        }
        this.f8200impromptu.f8184attabal = this;
        this.f8203taiyuan.f8184attabal = this;
    }
}
