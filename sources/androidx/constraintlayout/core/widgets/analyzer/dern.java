package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: HorizontalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class dern extends WidgetRun {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static int[] f8208apical = new int[2];

    /* JADX INFO: compiled from: HorizontalWidgetRun.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f8209attabal;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f8209attabal = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8209attabal[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8209attabal[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public dern(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f8200impromptu.f8190marial = DependencyNode.Type.LEFT;
        this.f8203taiyuan.f8190marial = DependencyNode.Type.RIGHT;
        this.f8196beachfront = 0;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d9  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, empress.wireman
    public void attabal(empress.wireman wiremanVar) {
        int iCompetently;
        int i;
        int iCompetently2;
        float f;
        float fRotuma;
        float fRotuma2;
        int i2;
        int i3 = attabal.f8209attabal[this.f8198cutely.ordinal()];
        if (i3 == 1) {
            arytenoidectomy(wiremanVar);
        } else if (i3 == 2) {
            kowloon(wiremanVar);
        } else if (i3 == 3) {
            ConstraintWidget constraintWidget = this.f8202saneness;
            triweekly(wiremanVar, constraintWidget.f8164starveling, constraintWidget.f8177walach, 0);
            return;
        }
        if (!this.f8201marial.f8192taiyuan && this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f8202saneness;
            int i4 = constraintWidget2.f8109gintrap;
            if (i4 == 2) {
                ConstraintWidget constraintWidgetGrimness = constraintWidget2.grimness();
                if (constraintWidgetGrimness != null) {
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = constraintWidgetGrimness.f8130marial.f8201marial;
                    if (attabalVar.f8192taiyuan) {
                        this.f8201marial.wireman((int) ((attabalVar.value * this.f8202saneness.f8165stratoscope) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i5 = constraintWidget2.f8154rotuma;
                if (i5 == 0 || i5 == 3) {
                    wireman wiremanVar2 = constraintWidget2.f8090beachfront;
                    DependencyNode dependencyNode = wiremanVar2.f8200impromptu;
                    DependencyNode dependencyNode2 = wiremanVar2.f8203taiyuan;
                    boolean z = constraintWidget2.f8164starveling.f8073beachfront != null;
                    boolean z2 = constraintWidget2.f8116hydrovane.f8073beachfront != null;
                    boolean z3 = constraintWidget2.f8177walach.f8073beachfront != null;
                    boolean z4 = constraintWidget2.f8144peridotite.f8073beachfront != null;
                    int iPreprohormone = constraintWidget2.preprohormone();
                    if (z && z2 && z3 && z4) {
                        float fRotuma3 = this.f8202saneness.rotuma();
                        if (dependencyNode.f8192taiyuan && dependencyNode2.f8192taiyuan) {
                            DependencyNode dependencyNode3 = this.f8200impromptu;
                            if (dependencyNode3.f8188dern && this.f8203taiyuan.f8188dern) {
                                monoploid(f8208apical, this.f8200impromptu.f8185beachfront + dependencyNode3.f8183apical.get(0).value, this.f8203taiyuan.f8183apical.get(0).value - this.f8203taiyuan.f8185beachfront, dependencyNode.f8185beachfront + dependencyNode.value, dependencyNode2.value - dependencyNode2.f8185beachfront, fRotuma3, iPreprohormone);
                                this.f8201marial.wireman(f8208apical[0]);
                                this.f8202saneness.f8090beachfront.f8201marial.wireman(f8208apical[1]);
                                return;
                            }
                            return;
                        }
                        DependencyNode dependencyNode4 = this.f8200impromptu;
                        if (dependencyNode4.f8192taiyuan) {
                            DependencyNode dependencyNode5 = this.f8203taiyuan;
                            if (dependencyNode5.f8192taiyuan) {
                                if (!dependencyNode.f8188dern || !dependencyNode2.f8188dern) {
                                    return;
                                }
                                monoploid(f8208apical, dependencyNode4.value + dependencyNode4.f8185beachfront, dependencyNode5.value - dependencyNode5.f8185beachfront, dependencyNode.f8185beachfront + dependencyNode.f8183apical.get(0).value, dependencyNode2.f8183apical.get(0).value - dependencyNode2.f8185beachfront, fRotuma3, iPreprohormone);
                                this.f8201marial.wireman(f8208apical[0]);
                                this.f8202saneness.f8090beachfront.f8201marial.wireman(f8208apical[1]);
                            }
                        }
                        DependencyNode dependencyNode6 = this.f8200impromptu;
                        if (!dependencyNode6.f8188dern || !this.f8203taiyuan.f8188dern || !dependencyNode.f8188dern || !dependencyNode2.f8188dern) {
                            return;
                        }
                        monoploid(f8208apical, this.f8200impromptu.f8185beachfront + dependencyNode6.f8183apical.get(0).value, this.f8203taiyuan.f8183apical.get(0).value - this.f8203taiyuan.f8185beachfront, dependencyNode.f8185beachfront + dependencyNode.f8183apical.get(0).value, dependencyNode2.f8183apical.get(0).value - dependencyNode2.f8185beachfront, fRotuma3, iPreprohormone);
                        this.f8201marial.wireman(f8208apical[0]);
                        this.f8202saneness.f8090beachfront.f8201marial.wireman(f8208apical[1]);
                    } else if (z && z3) {
                        if (!this.f8200impromptu.f8188dern || !this.f8203taiyuan.f8188dern) {
                            return;
                        }
                        float fRotuma4 = this.f8202saneness.rotuma();
                        int i6 = this.f8200impromptu.f8183apical.get(0).value + this.f8200impromptu.f8185beachfront;
                        int i7 = this.f8203taiyuan.f8183apical.get(0).value - this.f8203taiyuan.f8185beachfront;
                        if (iPreprohormone == -1 || iPreprohormone == 0) {
                            int iCompetently3 = competently(i7 - i6, 0);
                            int i8 = (int) ((iCompetently3 * fRotuma4) + 0.5f);
                            int iCompetently4 = competently(i8, 1);
                            if (i8 != iCompetently4) {
                                iCompetently3 = (int) ((iCompetently4 / fRotuma4) + 0.5f);
                            }
                            this.f8201marial.wireman(iCompetently3);
                            this.f8202saneness.f8090beachfront.f8201marial.wireman(iCompetently4);
                        } else if (iPreprohormone == 1) {
                            int iCompetently5 = competently(i7 - i6, 0);
                            int i9 = (int) ((iCompetently5 / fRotuma4) + 0.5f);
                            int iCompetently6 = competently(i9, 1);
                            if (i9 != iCompetently6) {
                                iCompetently5 = (int) ((iCompetently6 * fRotuma4) + 0.5f);
                            }
                            this.f8201marial.wireman(iCompetently5);
                            this.f8202saneness.f8090beachfront.f8201marial.wireman(iCompetently6);
                        }
                    } else if (z2 && z4) {
                        if (!dependencyNode.f8188dern || !dependencyNode2.f8188dern) {
                            return;
                        }
                        float fRotuma5 = this.f8202saneness.rotuma();
                        int i10 = dependencyNode.f8183apical.get(0).value + dependencyNode.f8185beachfront;
                        int i11 = dependencyNode2.f8183apical.get(0).value - dependencyNode2.f8185beachfront;
                        if (iPreprohormone == -1) {
                            iCompetently = competently(i11 - i10, 1);
                            i = (int) ((iCompetently / fRotuma5) + 0.5f);
                            iCompetently2 = competently(i, 0);
                            if (i != iCompetently2) {
                                iCompetently = (int) ((iCompetently2 * fRotuma5) + 0.5f);
                            }
                            this.f8201marial.wireman(iCompetently2);
                            this.f8202saneness.f8090beachfront.f8201marial.wireman(iCompetently);
                        } else if (iPreprohormone == 0) {
                            int iCompetently7 = competently(i11 - i10, 1);
                            int i12 = (int) ((iCompetently7 * fRotuma5) + 0.5f);
                            int iCompetently8 = competently(i12, 0);
                            if (i12 != iCompetently8) {
                                iCompetently7 = (int) ((iCompetently8 / fRotuma5) + 0.5f);
                            }
                            this.f8201marial.wireman(iCompetently8);
                            this.f8202saneness.f8090beachfront.f8201marial.wireman(iCompetently7);
                        } else if (iPreprohormone == 1) {
                            iCompetently = competently(i11 - i10, 1);
                            i = (int) ((iCompetently / fRotuma5) + 0.5f);
                            iCompetently2 = competently(i, 0);
                            if (i != iCompetently2) {
                                iCompetently = (int) ((iCompetently2 * fRotuma5) + 0.5f);
                            }
                            this.f8201marial.wireman(iCompetently2);
                            this.f8202saneness.f8090beachfront.f8201marial.wireman(iCompetently);
                        }
                    }
                } else {
                    int iPreprohormone2 = constraintWidget2.preprohormone();
                    if (iPreprohormone2 != -1) {
                        if (iPreprohormone2 == 0) {
                            ConstraintWidget constraintWidget3 = this.f8202saneness;
                            fRotuma2 = constraintWidget3.f8090beachfront.f8201marial.value / constraintWidget3.rotuma();
                            i2 = (int) (fRotuma2 + 0.5f);
                        } else if (iPreprohormone2 != 1) {
                            i2 = 0;
                        } else {
                            ConstraintWidget constraintWidget4 = this.f8202saneness;
                            f = constraintWidget4.f8090beachfront.f8201marial.value;
                            fRotuma = constraintWidget4.rotuma();
                        }
                        this.f8201marial.wireman(i2);
                    } else {
                        ConstraintWidget constraintWidget5 = this.f8202saneness;
                        f = constraintWidget5.f8090beachfront.f8201marial.value;
                        fRotuma = constraintWidget5.rotuma();
                    }
                    fRotuma2 = f * fRotuma;
                    i2 = (int) (fRotuma2 + 0.5f);
                    this.f8201marial.wireman(i2);
                }
            }
        }
        DependencyNode dependencyNode7 = this.f8200impromptu;
        if (dependencyNode7.f8188dern) {
            DependencyNode dependencyNode8 = this.f8203taiyuan;
            if (dependencyNode8.f8188dern) {
                if (dependencyNode7.f8192taiyuan && dependencyNode8.f8192taiyuan && this.f8201marial.f8192taiyuan) {
                    return;
                }
                if (!this.f8201marial.f8192taiyuan && this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f8202saneness;
                    if (constraintWidget6.f8109gintrap == 0 && !constraintWidget6.sayid()) {
                        DependencyNode dependencyNode9 = this.f8200impromptu.f8183apical.get(0);
                        DependencyNode dependencyNode10 = this.f8203taiyuan.f8183apical.get(0);
                        int i13 = dependencyNode9.value;
                        DependencyNode dependencyNode11 = this.f8200impromptu;
                        int i14 = i13 + dependencyNode11.f8185beachfront;
                        int i15 = dependencyNode10.value + this.f8203taiyuan.f8185beachfront;
                        dependencyNode11.wireman(i14);
                        this.f8203taiyuan.wireman(i15);
                        this.f8201marial.wireman(i15 - i14);
                        return;
                    }
                }
                if (!this.f8201marial.f8192taiyuan && this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f8195attabal == 1 && this.f8200impromptu.f8183apical.size() > 0 && this.f8203taiyuan.f8183apical.size() > 0) {
                    int iMin = Math.min((this.f8203taiyuan.f8183apical.get(0).value + this.f8203taiyuan.f8185beachfront) - (this.f8200impromptu.f8183apical.get(0).value + this.f8200impromptu.f8185beachfront), this.f8201marial.f8207formularize);
                    ConstraintWidget constraintWidget7 = this.f8202saneness;
                    int i16 = constraintWidget7.f8098cuirassed;
                    int iMax = Math.max(constraintWidget7.f8096cord, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    this.f8201marial.wireman(iMax);
                }
                if (this.f8201marial.f8192taiyuan) {
                    DependencyNode dependencyNode12 = this.f8200impromptu.f8183apical.get(0);
                    DependencyNode dependencyNode13 = this.f8203taiyuan.f8183apical.get(0);
                    int i17 = dependencyNode12.value + this.f8200impromptu.f8185beachfront;
                    int i18 = dependencyNode13.value + this.f8203taiyuan.f8185beachfront;
                    float fCuirassed = this.f8202saneness.cuirassed();
                    if (dependencyNode12 == dependencyNode13) {
                        i17 = dependencyNode12.value;
                        i18 = dependencyNode13.value;
                        fCuirassed = 0.5f;
                    }
                    this.f8200impromptu.wireman((int) (i17 + 0.5f + (((i18 - i17) - this.f8201marial.value) * fCuirassed)));
                    this.f8203taiyuan.wireman(this.f8200impromptu.value + this.f8201marial.value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void beachfront() {
        this.f8199dern = null;
        this.f8200impromptu.dern();
        this.f8203taiyuan.dern();
        this.f8201marial.dern();
        this.f8197competently = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean impassible() {
        return this.f8204wireman != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f8202saneness.f8109gintrap == 0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void marial() {
        DependencyNode dependencyNode = this.f8200impromptu;
        if (dependencyNode.f8192taiyuan) {
            this.f8202saneness.ctenidium(dependencyNode.value);
        }
    }

    public final void monoploid(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void polloi() {
        this.f8197competently = false;
        this.f8200impromptu.dern();
        this.f8200impromptu.f8192taiyuan = false;
        this.f8203taiyuan.dern();
        this.f8203taiyuan.f8192taiyuan = false;
        this.f8201marial.f8192taiyuan = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f8202saneness.dovishness();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void wireman() {
        ConstraintWidget constraintWidgetGrimness;
        ConstraintWidget constraintWidgetGrimness2;
        ConstraintWidget constraintWidget = this.f8202saneness;
        if (constraintWidget.f8087attabal) {
            this.f8201marial.wireman(constraintWidget.dent());
        }
        if (this.f8201marial.f8192taiyuan) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f8204wireman;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (constraintWidgetGrimness = this.f8202saneness.grimness()) != null && (constraintWidgetGrimness.trm() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetGrimness.trm() == dimensionBehaviour2)) {
                saneness(this.f8200impromptu, constraintWidgetGrimness.f8130marial.f8200impromptu, this.f8202saneness.f8164starveling.beachfront());
                saneness(this.f8203taiyuan, constraintWidgetGrimness.f8130marial.f8203taiyuan, -this.f8202saneness.f8177walach.beachfront());
                return;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = this.f8202saneness.trm();
            this.f8204wireman = dimensionBehaviourTrm;
            if (dimensionBehaviourTrm != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviourTrm == dimensionBehaviour3 && (constraintWidgetGrimness2 = this.f8202saneness.grimness()) != null && (constraintWidgetGrimness2.trm() == ConstraintWidget.DimensionBehaviour.FIXED || constraintWidgetGrimness2.trm() == dimensionBehaviour3)) {
                    int iDent = (constraintWidgetGrimness2.dent() - this.f8202saneness.f8164starveling.beachfront()) - this.f8202saneness.f8177walach.beachfront();
                    saneness(this.f8200impromptu, constraintWidgetGrimness2.f8130marial.f8200impromptu, this.f8202saneness.f8164starveling.beachfront());
                    saneness(this.f8203taiyuan, constraintWidgetGrimness2.f8130marial.f8203taiyuan, -this.f8202saneness.f8177walach.beachfront());
                    this.f8201marial.wireman(iDent);
                    return;
                }
                if (this.f8204wireman == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f8201marial.wireman(this.f8202saneness.dent());
                }
            }
        }
        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = this.f8201marial;
        if (attabalVar.f8192taiyuan) {
            ConstraintWidget constraintWidget2 = this.f8202saneness;
            if (constraintWidget2.f8087attabal) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f8103dent;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f8073beachfront;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f8073beachfront != null) {
                    if (constraintWidget2.sayid()) {
                        this.f8200impromptu.f8185beachfront = this.f8202saneness.f8103dent[0].beachfront();
                        this.f8203taiyuan.f8185beachfront = -this.f8202saneness.f8103dent[1].beachfront();
                        return;
                    }
                    DependencyNode dependencyNodeImpromptu = impromptu(this.f8202saneness.f8103dent[0]);
                    if (dependencyNodeImpromptu != null) {
                        saneness(this.f8200impromptu, dependencyNodeImpromptu, this.f8202saneness.f8103dent[0].beachfront());
                    }
                    DependencyNode dependencyNodeImpromptu2 = impromptu(this.f8202saneness.f8103dent[1]);
                    if (dependencyNodeImpromptu2 != null) {
                        saneness(this.f8203taiyuan, dependencyNodeImpromptu2, -this.f8202saneness.f8103dent[1].beachfront());
                    }
                    this.f8200impromptu.f8191saneness = true;
                    this.f8203taiyuan.f8191saneness = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeImpromptu3 = impromptu(constraintAnchor);
                    if (dependencyNodeImpromptu3 != null) {
                        saneness(this.f8200impromptu, dependencyNodeImpromptu3, this.f8202saneness.f8103dent[0].beachfront());
                        saneness(this.f8203taiyuan, this.f8200impromptu, this.f8201marial.value);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f8073beachfront != null) {
                    DependencyNode dependencyNodeImpromptu4 = impromptu(constraintAnchor3);
                    if (dependencyNodeImpromptu4 != null) {
                        saneness(this.f8203taiyuan, dependencyNodeImpromptu4, -this.f8202saneness.f8103dent[1].beachfront());
                        saneness(this.f8200impromptu, this.f8203taiyuan, -this.f8201marial.value);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof sayid.attabal) || constraintWidget2.grimness() == null || this.f8202saneness.monoploid(ConstraintAnchor.Type.CENTER).f8073beachfront != null) {
                    return;
                }
                saneness(this.f8200impromptu, this.f8202saneness.grimness().f8130marial.f8200impromptu, this.f8202saneness.permissivist());
                saneness(this.f8203taiyuan, this.f8200impromptu, this.f8201marial.value);
                return;
            }
        }
        if (this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget3 = this.f8202saneness;
            int i = constraintWidget3.f8109gintrap;
            if (i == 2) {
                ConstraintWidget constraintWidgetGrimness3 = constraintWidget3.grimness();
                if (constraintWidgetGrimness3 != null) {
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar2 = constraintWidgetGrimness3.f8090beachfront.f8201marial;
                    this.f8201marial.f8183apical.add(attabalVar2);
                    attabalVar2.f8187cutely.add(this.f8201marial);
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar3 = this.f8201marial;
                    attabalVar3.f8191saneness = true;
                    attabalVar3.f8187cutely.add(this.f8200impromptu);
                    this.f8201marial.f8187cutely.add(this.f8203taiyuan);
                }
            } else if (i == 3) {
                if (constraintWidget3.f8154rotuma == 3) {
                    this.f8200impromptu.f8184attabal = this;
                    this.f8203taiyuan.f8184attabal = this;
                    wireman wiremanVar = constraintWidget3.f8090beachfront;
                    wiremanVar.f8200impromptu.f8184attabal = this;
                    wiremanVar.f8203taiyuan.f8184attabal = this;
                    attabalVar.f8184attabal = this;
                    if (constraintWidget3.coi()) {
                        this.f8201marial.f8183apical.add(this.f8202saneness.f8090beachfront.f8201marial);
                        this.f8202saneness.f8090beachfront.f8201marial.f8187cutely.add(this.f8201marial);
                        wireman wiremanVar2 = this.f8202saneness.f8090beachfront;
                        wiremanVar2.f8201marial.f8184attabal = this;
                        this.f8201marial.f8183apical.add(wiremanVar2.f8200impromptu);
                        this.f8201marial.f8183apical.add(this.f8202saneness.f8090beachfront.f8203taiyuan);
                        this.f8202saneness.f8090beachfront.f8200impromptu.f8187cutely.add(this.f8201marial);
                        this.f8202saneness.f8090beachfront.f8203taiyuan.f8187cutely.add(this.f8201marial);
                    } else if (this.f8202saneness.sayid()) {
                        this.f8202saneness.f8090beachfront.f8201marial.f8183apical.add(this.f8201marial);
                        this.f8201marial.f8187cutely.add(this.f8202saneness.f8090beachfront.f8201marial);
                    } else {
                        this.f8202saneness.f8090beachfront.f8201marial.f8183apical.add(this.f8201marial);
                    }
                } else {
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar4 = constraintWidget3.f8090beachfront.f8201marial;
                    attabalVar.f8183apical.add(attabalVar4);
                    attabalVar4.f8187cutely.add(this.f8201marial);
                    this.f8202saneness.f8090beachfront.f8200impromptu.f8187cutely.add(this.f8201marial);
                    this.f8202saneness.f8090beachfront.f8203taiyuan.f8187cutely.add(this.f8201marial);
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar5 = this.f8201marial;
                    attabalVar5.f8191saneness = true;
                    attabalVar5.f8187cutely.add(this.f8200impromptu);
                    this.f8201marial.f8187cutely.add(this.f8203taiyuan);
                    this.f8200impromptu.f8183apical.add(this.f8201marial);
                    this.f8203taiyuan.f8183apical.add(this.f8201marial);
                }
            }
        }
        ConstraintWidget constraintWidget4 = this.f8202saneness;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget4.f8103dent;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f8073beachfront;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f8073beachfront != null) {
            if (constraintWidget4.sayid()) {
                this.f8200impromptu.f8185beachfront = this.f8202saneness.f8103dent[0].beachfront();
                this.f8203taiyuan.f8185beachfront = -this.f8202saneness.f8103dent[1].beachfront();
                return;
            }
            DependencyNode dependencyNodeImpromptu5 = impromptu(this.f8202saneness.f8103dent[0]);
            DependencyNode dependencyNodeImpromptu6 = impromptu(this.f8202saneness.f8103dent[1]);
            if (dependencyNodeImpromptu5 != null) {
                dependencyNodeImpromptu5.saneness(this);
            }
            if (dependencyNodeImpromptu6 != null) {
                dependencyNodeImpromptu6.saneness(this);
            }
            this.f8198cutely = WidgetRun.RunType.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            DependencyNode dependencyNodeImpromptu7 = impromptu(constraintAnchor4);
            if (dependencyNodeImpromptu7 != null) {
                saneness(this.f8200impromptu, dependencyNodeImpromptu7, this.f8202saneness.f8103dent[0].beachfront());
                dern(this.f8203taiyuan, this.f8200impromptu, 1, this.f8201marial);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f8073beachfront != null) {
            DependencyNode dependencyNodeImpromptu8 = impromptu(constraintAnchor6);
            if (dependencyNodeImpromptu8 != null) {
                saneness(this.f8203taiyuan, dependencyNodeImpromptu8, -this.f8202saneness.f8103dent[1].beachfront());
                dern(this.f8200impromptu, this.f8203taiyuan, -1, this.f8201marial);
                return;
            }
            return;
        }
        if ((constraintWidget4 instanceof sayid.attabal) || constraintWidget4.grimness() == null) {
            return;
        }
        saneness(this.f8200impromptu, this.f8202saneness.grimness().f8130marial.f8200impromptu, this.f8202saneness.permissivist());
        dern(this.f8203taiyuan, this.f8200impromptu, 1, this.f8201marial);
    }
}
