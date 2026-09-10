package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import empress.taiyuan;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements empress.wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f8195attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public taiyuan f8199dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ConstraintWidget f8202saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f8204wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.attabal f8201marial = new androidx.constraintlayout.core.widgets.analyzer.attabal(this);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f8196beachfront = 0;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f8197competently = false;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public DependencyNode f8200impromptu = new DependencyNode(this);

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public DependencyNode f8203taiyuan = new DependencyNode(this);

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public RunType f8198cutely = RunType.NONE;

    public enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f8206attabal;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f8206attabal = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8206attabal[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8206attabal[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8206attabal[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8206attabal[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f8202saneness = constraintWidget;
    }

    public boolean apical() {
        return this.f8197competently;
    }

    public abstract void beachfront();

    public final int competently(int i, int i2) {
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f8202saneness;
            int i3 = constraintWidget.f8098cuirassed;
            int iMax = Math.max(constraintWidget.f8096cord, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f8202saneness;
            int i4 = constraintWidget2.f8140oilcan;
            int iMax2 = Math.max(constraintWidget2.f8173trm, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long cutely() {
        androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = this.f8201marial;
        if (attabalVar.f8192taiyuan) {
            return attabalVar.value;
        }
        return 0L;
    }

    public final void dern(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar) {
        dependencyNode.f8183apical.add(dependencyNode2);
        dependencyNode.f8183apical.add(this.f8201marial);
        dependencyNode.f8186competently = i;
        dependencyNode.f8189impromptu = attabalVar;
        dependencyNode2.f8187cutely.add(dependencyNode);
        attabalVar.f8187cutely.add(dependencyNode);
    }

    public final void formularize(int i, int i2) {
        int i3 = this.f8195attabal;
        if (i3 == 0) {
            this.f8201marial.wireman(competently(i2, i));
            return;
        }
        if (i3 == 1) {
            this.f8201marial.wireman(Math.min(competently(this.f8201marial.f8207formularize, i), i2));
            return;
        }
        if (i3 == 2) {
            ConstraintWidget constraintWidgetGrimness = this.f8202saneness.grimness();
            if (constraintWidgetGrimness != null) {
                androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = (i == 0 ? constraintWidgetGrimness.f8130marial : constraintWidgetGrimness.f8090beachfront).f8201marial;
                if (attabalVar.f8192taiyuan) {
                    this.f8201marial.wireman(competently((int) ((attabalVar.value * (i == 0 ? this.f8202saneness.f8165stratoscope : this.f8202saneness.f8180yemenite)) + 0.5f), i));
                    return;
                }
                return;
            }
            return;
        }
        if (i3 != 3) {
            return;
        }
        ConstraintWidget constraintWidget = this.f8202saneness;
        WidgetRun widgetRun = constraintWidget.f8130marial;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.f8204wireman;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.f8195attabal == 3) {
            wireman wiremanVar = constraintWidget.f8090beachfront;
            if (wiremanVar.f8204wireman == dimensionBehaviour2 && wiremanVar.f8195attabal == 3) {
                return;
            }
        }
        if (i == 0) {
            widgetRun = constraintWidget.f8090beachfront;
        }
        if (widgetRun.f8201marial.f8192taiyuan) {
            float fRotuma = constraintWidget.rotuma();
            this.f8201marial.wireman(i == 1 ? (int) ((widgetRun.f8201marial.value / fRotuma) + 0.5f) : (int) ((fRotuma * widgetRun.f8201marial.value) + 0.5f));
        }
    }

    public abstract boolean impassible();

    public final DependencyNode impromptu(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f8073beachfront;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f8080wireman;
        int i = attabal.f8206attabal[constraintAnchor2.f8077marial.ordinal()];
        if (i == 1) {
            return constraintWidget.f8130marial.f8200impromptu;
        }
        if (i == 2) {
            return constraintWidget.f8130marial.f8203taiyuan;
        }
        if (i == 3) {
            return constraintWidget.f8090beachfront.f8200impromptu;
        }
        if (i == 4) {
            return constraintWidget.f8090beachfront.f8210apical;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f8090beachfront.f8203taiyuan;
    }

    public abstract void marial();

    public final void saneness(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f8183apical.add(dependencyNode2);
        dependencyNode.f8185beachfront = i;
        dependencyNode2.f8187cutely.add(dependencyNode);
    }

    public final DependencyNode taiyuan(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f8073beachfront;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f8080wireman;
        WidgetRun widgetRun = i == 0 ? constraintWidget.f8130marial : constraintWidget.f8090beachfront;
        int i2 = attabal.f8206attabal[constraintAnchor2.f8077marial.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.f8203taiyuan;
        }
        return widgetRun.f8200impromptu;
    }

    public void triweekly(empress.wireman wiremanVar, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        DependencyNode dependencyNodeImpromptu = impromptu(constraintAnchor);
        DependencyNode dependencyNodeImpromptu2 = impromptu(constraintAnchor2);
        if (dependencyNodeImpromptu.f8192taiyuan && dependencyNodeImpromptu2.f8192taiyuan) {
            int iBeachfront = dependencyNodeImpromptu.value + constraintAnchor.beachfront();
            int iBeachfront2 = dependencyNodeImpromptu2.value - constraintAnchor2.beachfront();
            int i2 = iBeachfront2 - iBeachfront;
            if (!this.f8201marial.f8192taiyuan && this.f8204wireman == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                formularize(i, i2);
            }
            androidx.constraintlayout.core.widgets.analyzer.attabal attabalVar = this.f8201marial;
            if (attabalVar.f8192taiyuan) {
                if (attabalVar.value == i2) {
                    this.f8200impromptu.wireman(iBeachfront);
                    this.f8203taiyuan.wireman(iBeachfront2);
                    return;
                }
                float fCuirassed = i == 0 ? this.f8202saneness.cuirassed() : this.f8202saneness.peridotite();
                if (dependencyNodeImpromptu == dependencyNodeImpromptu2) {
                    iBeachfront = dependencyNodeImpromptu.value;
                    iBeachfront2 = dependencyNodeImpromptu2.value;
                    fCuirassed = 0.5f;
                }
                this.f8200impromptu.wireman((int) (iBeachfront + 0.5f + (((iBeachfront2 - iBeachfront) - this.f8201marial.value) * fCuirassed)));
                this.f8203taiyuan.wireman(this.f8200impromptu.value + this.f8201marial.value);
            }
        }
    }

    public abstract void wireman();

    public void arytenoidectomy(empress.wireman wiremanVar) {
    }

    @Override // empress.wireman
    public void attabal(empress.wireman wiremanVar) {
    }

    public void kowloon(empress.wireman wiremanVar) {
    }
}
