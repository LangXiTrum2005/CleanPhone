package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: VerticalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends WidgetRun {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public DependencyNode f8210apical;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.attabal f8211formularize;

    /* JADX INFO: compiled from: VerticalWidgetRun.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f8212attabal;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f8212attabal = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8212attabal[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8212attabal[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public wireman(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f8210apical = dependencyNode;
        this.f8211formularize = null;
        this.f8200impromptu.f8190marial = DependencyNode.Type.TOP;
        this.f8203taiyuan.f8190marial = DependencyNode.Type.BOTTOM;
        dependencyNode.f8190marial = DependencyNode.Type.BASELINE;
        this.f8196beachfront = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, empress.wireman
    public void attabal(empress.wireman wiremanVar) {
        float f;
        float fRotuma;
        float fRotuma2;
        int i;
        int i2 = attabal.f8212attabal[this.f8198cutely.ordinal()];
        if (i2 == 1) {
            arytenoidectomy(wiremanVar);
        } else if (i2 == 2) {
            kowloon(wiremanVar);
        } else if (i2 == 3) {
            ConstraintWidget constraintWidget = this.f8202saneness;
            triweekly(wiremanVar, constraintWidget.f8116hydrovane, constraintWidget.f8144peridotite, 1);
            return;
        }
        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = this.f8201marial;
        if (attabalVar.f8188dern && !attabalVar.f8192taiyuan && this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f8202saneness;
            int i3 = constraintWidget2.f8154rotuma;
            if (i3 == 2) {
                ConstraintWidget constraintWidgetGrimness = constraintWidget2.grimness();
                if (constraintWidgetGrimness != null) {
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar2 = constraintWidgetGrimness.f8090beachfront.f8201marial;
                    if (attabalVar2.f8192taiyuan) {
                        this.f8201marial.wireman((int) ((attabalVar2.value * this.f8202saneness.f8180yemenite) + 0.5f));
                    }
                }
            } else if (i3 == 3 && constraintWidget2.f8130marial.f8201marial.f8192taiyuan) {
                int iPreprohormone = constraintWidget2.preprohormone();
                if (iPreprohormone != -1) {
                    if (iPreprohormone == 0) {
                        ConstraintWidget constraintWidget3 = this.f8202saneness;
                        fRotuma2 = constraintWidget3.f8130marial.f8201marial.value * constraintWidget3.rotuma();
                        i = (int) (fRotuma2 + 0.5f);
                    } else if (iPreprohormone != 1) {
                        i = 0;
                    } else {
                        ConstraintWidget constraintWidget4 = this.f8202saneness;
                        f = constraintWidget4.f8130marial.f8201marial.value;
                        fRotuma = constraintWidget4.rotuma();
                    }
                    this.f8201marial.wireman(i);
                } else {
                    ConstraintWidget constraintWidget5 = this.f8202saneness;
                    f = constraintWidget5.f8130marial.f8201marial.value;
                    fRotuma = constraintWidget5.rotuma();
                }
                fRotuma2 = f / fRotuma;
                i = (int) (fRotuma2 + 0.5f);
                this.f8201marial.wireman(i);
            }
        }
        DependencyNode dependencyNode = this.f8200impromptu;
        if (dependencyNode.f8188dern) {
            DependencyNode dependencyNode2 = this.f8203taiyuan;
            if (dependencyNode2.f8188dern) {
                if (dependencyNode.f8192taiyuan && dependencyNode2.f8192taiyuan && this.f8201marial.f8192taiyuan) {
                    return;
                }
                if (!this.f8201marial.f8192taiyuan && this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget6 = this.f8202saneness;
                    if (constraintWidget6.f8109gintrap == 0 && !constraintWidget6.coi()) {
                        DependencyNode dependencyNode3 = this.f8200impromptu.f8183apical.get(0);
                        DependencyNode dependencyNode4 = this.f8203taiyuan.f8183apical.get(0);
                        int i4 = dependencyNode3.value;
                        DependencyNode dependencyNode5 = this.f8200impromptu;
                        int i5 = i4 + dependencyNode5.f8185beachfront;
                        int i6 = dependencyNode4.value + this.f8203taiyuan.f8185beachfront;
                        dependencyNode5.wireman(i5);
                        this.f8203taiyuan.wireman(i6);
                        this.f8201marial.wireman(i6 - i5);
                        return;
                    }
                }
                if (!this.f8201marial.f8192taiyuan && this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f8195attabal == 1 && this.f8200impromptu.f8183apical.size() > 0 && this.f8203taiyuan.f8183apical.size() > 0) {
                    DependencyNode dependencyNode6 = this.f8200impromptu.f8183apical.get(0);
                    int i7 = (this.f8203taiyuan.f8183apical.get(0).value + this.f8203taiyuan.f8185beachfront) - (dependencyNode6.value + this.f8200impromptu.f8185beachfront);
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar3 = this.f8201marial;
                    int i8 = attabalVar3.f8207formularize;
                    if (i7 < i8) {
                        attabalVar3.wireman(i7);
                    } else {
                        attabalVar3.wireman(i8);
                    }
                }
                if (this.f8201marial.f8192taiyuan && this.f8200impromptu.f8183apical.size() > 0 && this.f8203taiyuan.f8183apical.size() > 0) {
                    DependencyNode dependencyNode7 = this.f8200impromptu.f8183apical.get(0);
                    DependencyNode dependencyNode8 = this.f8203taiyuan.f8183apical.get(0);
                    int i9 = dependencyNode7.value + this.f8200impromptu.f8185beachfront;
                    int i10 = dependencyNode8.value + this.f8203taiyuan.f8185beachfront;
                    float fPeridotite = this.f8202saneness.peridotite();
                    if (dependencyNode7 == dependencyNode8) {
                        i9 = dependencyNode7.value;
                        i10 = dependencyNode8.value;
                        fPeridotite = 0.5f;
                    }
                    this.f8200impromptu.wireman((int) (i9 + 0.5f + (((i10 - i9) - this.f8201marial.value) * fPeridotite)));
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
        this.f8210apical.dern();
        this.f8201marial.dern();
        this.f8197competently = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public boolean impassible() {
        return this.f8204wireman != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f8202saneness.f8154rotuma == 0;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void marial() {
        DependencyNode dependencyNode = this.f8200impromptu;
        if (dependencyNode.f8192taiyuan) {
            this.f8202saneness.rajahship(dependencyNode.value);
        }
    }

    public void monoploid() {
        this.f8197competently = false;
        this.f8200impromptu.dern();
        this.f8200impromptu.f8192taiyuan = false;
        this.f8203taiyuan.dern();
        this.f8203taiyuan.f8192taiyuan = false;
        this.f8210apical.dern();
        this.f8210apical.f8192taiyuan = false;
        this.f8201marial.f8192taiyuan = false;
    }

    public String toString() {
        return "VerticalRun " + this.f8202saneness.dovishness();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void wireman() {
        ConstraintWidget constraintWidgetGrimness;
        ConstraintWidget constraintWidgetGrimness2;
        ConstraintWidget constraintWidget = this.f8202saneness;
        if (constraintWidget.f8087attabal) {
            this.f8201marial.wireman(constraintWidget.cord());
        }
        if (!this.f8201marial.f8192taiyuan) {
            this.f8204wireman = this.f8202saneness.splinterproof();
            if (this.f8202saneness.premeiotic()) {
                this.f8211formularize = new empress.attabal(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f8204wireman;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetGrimness2 = this.f8202saneness.grimness()) != null && constraintWidgetGrimness2.splinterproof() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iCord = (constraintWidgetGrimness2.cord() - this.f8202saneness.f8116hydrovane.beachfront()) - this.f8202saneness.f8144peridotite.beachfront();
                    saneness(this.f8200impromptu, constraintWidgetGrimness2.f8090beachfront.f8200impromptu, this.f8202saneness.f8116hydrovane.beachfront());
                    saneness(this.f8203taiyuan, constraintWidgetGrimness2.f8090beachfront.f8203taiyuan, -this.f8202saneness.f8144peridotite.beachfront());
                    this.f8201marial.wireman(iCord);
                    return;
                }
                if (this.f8204wireman == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f8201marial.wireman(this.f8202saneness.cord());
                }
            }
        } else if (this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidgetGrimness = this.f8202saneness.grimness()) != null && constraintWidgetGrimness.splinterproof() == ConstraintWidget.DimensionBehaviour.FIXED) {
            saneness(this.f8200impromptu, constraintWidgetGrimness.f8090beachfront.f8200impromptu, this.f8202saneness.f8116hydrovane.beachfront());
            saneness(this.f8203taiyuan, constraintWidgetGrimness.f8090beachfront.f8203taiyuan, -this.f8202saneness.f8144peridotite.beachfront());
            return;
        }
        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = this.f8201marial;
        boolean z = attabalVar.f8192taiyuan;
        if (z) {
            ConstraintWidget constraintWidget2 = this.f8202saneness;
            if (constraintWidget2.f8087attabal) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget2.f8103dent;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f8073beachfront;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f8073beachfront != null) {
                    if (constraintWidget2.coi()) {
                        this.f8200impromptu.f8185beachfront = this.f8202saneness.f8103dent[2].beachfront();
                        this.f8203taiyuan.f8185beachfront = -this.f8202saneness.f8103dent[3].beachfront();
                    } else {
                        DependencyNode dependencyNodeImpromptu = impromptu(this.f8202saneness.f8103dent[2]);
                        if (dependencyNodeImpromptu != null) {
                            saneness(this.f8200impromptu, dependencyNodeImpromptu, this.f8202saneness.f8103dent[2].beachfront());
                        }
                        DependencyNode dependencyNodeImpromptu2 = impromptu(this.f8202saneness.f8103dent[3]);
                        if (dependencyNodeImpromptu2 != null) {
                            saneness(this.f8203taiyuan, dependencyNodeImpromptu2, -this.f8202saneness.f8103dent[3].beachfront());
                        }
                        this.f8200impromptu.f8191saneness = true;
                        this.f8203taiyuan.f8191saneness = true;
                    }
                    if (this.f8202saneness.premeiotic()) {
                        saneness(this.f8210apical, this.f8200impromptu, this.f8202saneness.polloi());
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    DependencyNode dependencyNodeImpromptu3 = impromptu(constraintAnchor);
                    if (dependencyNodeImpromptu3 != null) {
                        saneness(this.f8200impromptu, dependencyNodeImpromptu3, this.f8202saneness.f8103dent[2].beachfront());
                        saneness(this.f8203taiyuan, this.f8200impromptu, this.f8201marial.value);
                        if (this.f8202saneness.premeiotic()) {
                            saneness(this.f8210apical, this.f8200impromptu, this.f8202saneness.polloi());
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f8073beachfront != null) {
                    DependencyNode dependencyNodeImpromptu4 = impromptu(constraintAnchor3);
                    if (dependencyNodeImpromptu4 != null) {
                        saneness(this.f8203taiyuan, dependencyNodeImpromptu4, -this.f8202saneness.f8103dent[3].beachfront());
                        saneness(this.f8200impromptu, this.f8203taiyuan, -this.f8201marial.value);
                    }
                    if (this.f8202saneness.premeiotic()) {
                        saneness(this.f8210apical, this.f8200impromptu, this.f8202saneness.polloi());
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f8073beachfront != null) {
                    DependencyNode dependencyNodeImpromptu5 = impromptu(constraintAnchor4);
                    if (dependencyNodeImpromptu5 != null) {
                        saneness(this.f8210apical, dependencyNodeImpromptu5, 0);
                        saneness(this.f8200impromptu, this.f8210apical, -this.f8202saneness.polloi());
                        saneness(this.f8203taiyuan, this.f8200impromptu, this.f8201marial.value);
                        return;
                    }
                    return;
                }
                if ((constraintWidget2 instanceof sayid.attabal) || constraintWidget2.grimness() == null || this.f8202saneness.monoploid(ConstraintAnchor.Type.CENTER).f8073beachfront != null) {
                    return;
                }
                saneness(this.f8200impromptu, this.f8202saneness.grimness().f8090beachfront.f8200impromptu, this.f8202saneness.cultivated());
                saneness(this.f8203taiyuan, this.f8200impromptu, this.f8201marial.value);
                if (this.f8202saneness.premeiotic()) {
                    saneness(this.f8210apical, this.f8200impromptu, this.f8202saneness.polloi());
                    return;
                }
                return;
            }
        }
        if (z || this.f8204wireman != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            attabalVar.saneness(this);
        } else {
            ConstraintWidget constraintWidget3 = this.f8202saneness;
            int i = constraintWidget3.f8154rotuma;
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
            } else if (i == 3 && !constraintWidget3.coi()) {
                ConstraintWidget constraintWidget4 = this.f8202saneness;
                if (constraintWidget4.f8109gintrap != 3) {
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar4 = constraintWidget4.f8130marial.f8201marial;
                    this.f8201marial.f8183apical.add(attabalVar4);
                    attabalVar4.f8187cutely.add(this.f8201marial);
                    androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar5 = this.f8201marial;
                    attabalVar5.f8191saneness = true;
                    attabalVar5.f8187cutely.add(this.f8200impromptu);
                    this.f8201marial.f8187cutely.add(this.f8203taiyuan);
                }
            }
        }
        ConstraintWidget constraintWidget5 = this.f8202saneness;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget5.f8103dent;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f8073beachfront;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f8073beachfront != null) {
            if (constraintWidget5.coi()) {
                this.f8200impromptu.f8185beachfront = this.f8202saneness.f8103dent[2].beachfront();
                this.f8203taiyuan.f8185beachfront = -this.f8202saneness.f8103dent[3].beachfront();
            } else {
                DependencyNode dependencyNodeImpromptu6 = impromptu(this.f8202saneness.f8103dent[2]);
                DependencyNode dependencyNodeImpromptu7 = impromptu(this.f8202saneness.f8103dent[3]);
                if (dependencyNodeImpromptu6 != null) {
                    dependencyNodeImpromptu6.saneness(this);
                }
                if (dependencyNodeImpromptu7 != null) {
                    dependencyNodeImpromptu7.saneness(this);
                }
                this.f8198cutely = WidgetRun.RunType.CENTER;
            }
            if (this.f8202saneness.premeiotic()) {
                dern(this.f8210apical, this.f8200impromptu, 1, this.f8211formularize);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode dependencyNodeImpromptu8 = impromptu(constraintAnchor5);
            if (dependencyNodeImpromptu8 != null) {
                saneness(this.f8200impromptu, dependencyNodeImpromptu8, this.f8202saneness.f8103dent[2].beachfront());
                dern(this.f8203taiyuan, this.f8200impromptu, 1, this.f8201marial);
                if (this.f8202saneness.premeiotic()) {
                    dern(this.f8210apical, this.f8200impromptu, 1, this.f8211formularize);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f8204wireman;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3 && this.f8202saneness.rotuma() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    dern dernVar = this.f8202saneness.f8130marial;
                    if (dernVar.f8204wireman == dimensionBehaviour3) {
                        dernVar.f8201marial.f8187cutely.add(this.f8201marial);
                        this.f8201marial.f8183apical.add(this.f8202saneness.f8130marial.f8201marial);
                        this.f8201marial.f8184attabal = this;
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f8073beachfront != null) {
                DependencyNode dependencyNodeImpromptu9 = impromptu(constraintAnchor7);
                if (dependencyNodeImpromptu9 != null) {
                    saneness(this.f8203taiyuan, dependencyNodeImpromptu9, -this.f8202saneness.f8103dent[3].beachfront());
                    dern(this.f8200impromptu, this.f8203taiyuan, -1, this.f8201marial);
                    if (this.f8202saneness.premeiotic()) {
                        dern(this.f8210apical, this.f8200impromptu, 1, this.f8211formularize);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f8073beachfront != null) {
                    DependencyNode dependencyNodeImpromptu10 = impromptu(constraintAnchor8);
                    if (dependencyNodeImpromptu10 != null) {
                        saneness(this.f8210apical, dependencyNodeImpromptu10, 0);
                        dern(this.f8200impromptu, this.f8210apical, -1, this.f8211formularize);
                        dern(this.f8203taiyuan, this.f8200impromptu, 1, this.f8201marial);
                    }
                } else if (!(constraintWidget5 instanceof sayid.attabal) && constraintWidget5.grimness() != null) {
                    saneness(this.f8200impromptu, this.f8202saneness.grimness().f8090beachfront.f8200impromptu, this.f8202saneness.cultivated());
                    dern(this.f8203taiyuan, this.f8200impromptu, 1, this.f8201marial);
                    if (this.f8202saneness.premeiotic()) {
                        dern(this.f8210apical, this.f8200impromptu, 1, this.f8211formularize);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f8204wireman;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5 && this.f8202saneness.rotuma() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        dern dernVar2 = this.f8202saneness.f8130marial;
                        if (dernVar2.f8204wireman == dimensionBehaviour5) {
                            dernVar2.f8201marial.f8187cutely.add(this.f8201marial);
                            this.f8201marial.f8183apical.add(this.f8202saneness.f8130marial.f8201marial);
                            this.f8201marial.f8184attabal = this;
                        }
                    }
                }
            }
        }
        if (this.f8201marial.f8183apical.size() == 0) {
            this.f8201marial.f8188dern = true;
        }
    }
}
