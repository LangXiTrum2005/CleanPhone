package androidx.constraintlayout.core.widgets;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: compiled from: ChainHead.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f8227adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f8228apical = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f8229arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ConstraintWidget f8230attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public ConstraintWidget f8231beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public ConstraintWidget f8232competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f8233cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public ConstraintWidget f8234dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f8235dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f8236formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f8237graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f8238impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f8239impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f8240kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public ConstraintWidget f8241marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f8242molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f8243monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f8244polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ConstraintWidget f8245saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f8246taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f8247triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ConstraintWidget f8248wireman;

    public dern(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f8230attabal = constraintWidget;
        this.f8229arytenoidectomy = i;
        this.f8243monoploid = z;
    }

    public static boolean dern(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.clubfoot() == 8 || constraintWidget.f8149premeiotic[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            return false;
        }
        int i2 = constraintWidget.f8150preprohormone[i];
        return i2 == 0 || i2 == 3;
    }

    public void attabal() {
        if (!this.f8235dovishness) {
            saneness();
        }
        this.f8235dovishness = true;
    }

    public final void saneness() {
        int i = this.f8229arytenoidectomy * 2;
        ConstraintWidget constraintWidget = this.f8230attabal;
        this.f8240kowloon = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z = false;
        while (!z) {
            this.f8246taiyuan++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f8135molet;
            int i2 = this.f8229arytenoidectomy;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i2] = null;
            constraintWidget.f8102deadwork[i2] = null;
            if (constraintWidget.clubfoot() != 8) {
                this.f8236formularize++;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourGintrap = constraintWidget.gintrap(this.f8229arytenoidectomy);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviourGintrap != dimensionBehaviour) {
                    this.f8238impassible += constraintWidget.kattegat(this.f8229arytenoidectomy);
                }
                int iBeachfront = this.f8238impassible + constraintWidget.f8103dent[i].beachfront();
                this.f8238impassible = iBeachfront;
                int i3 = i + 1;
                this.f8238impassible = iBeachfront + constraintWidget.f8103dent[i3].beachfront();
                int iBeachfront2 = this.f8247triweekly + constraintWidget.f8103dent[i].beachfront();
                this.f8247triweekly = iBeachfront2;
                this.f8247triweekly = iBeachfront2 + constraintWidget.f8103dent[i3].beachfront();
                if (this.f8245saneness == null) {
                    this.f8245saneness = constraintWidget;
                }
                this.f8248wireman = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f8149premeiotic;
                int i4 = this.f8229arytenoidectomy;
                if (dimensionBehaviourArr[i4] == dimensionBehaviour) {
                    int i5 = constraintWidget.f8150preprohormone[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f8233cutely++;
                        float f = constraintWidget.f8127libyan[i4];
                        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.f8228apical += f;
                        }
                        if (dern(constraintWidget, i4)) {
                            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                this.f8244polloi = true;
                            } else {
                                this.f8242molybdenite = true;
                            }
                            if (this.f8239impromptu == null) {
                                this.f8239impromptu = new ArrayList<>();
                            }
                            this.f8239impromptu.add(constraintWidget);
                        }
                        if (this.f8231beachfront == null) {
                            this.f8231beachfront = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f8232competently;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f8102deadwork[this.f8229arytenoidectomy] = constraintWidget;
                        }
                        this.f8232competently = constraintWidget;
                    }
                    if (this.f8229arytenoidectomy == 0) {
                        if (constraintWidget.f8109gintrap != 0 || constraintWidget.f8096cord != 0 || constraintWidget.f8098cuirassed != 0) {
                            this.f8240kowloon = false;
                        }
                    } else if (constraintWidget.f8154rotuma != 0 || constraintWidget.f8173trm != 0 || constraintWidget.f8140oilcan != 0) {
                        this.f8240kowloon = false;
                    }
                    if (constraintWidget.f8121itchy != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.f8240kowloon = false;
                        this.f8227adultoid = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f8135molet[this.f8229arytenoidectomy] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f8103dent[i + 1].f8073beachfront;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f8080wireman;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f8103dent[i].f8073beachfront;
                if (constraintAnchor2 != null && constraintAnchor2.f8080wireman == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f8245saneness;
        if (constraintWidget6 != null) {
            this.f8238impassible -= constraintWidget6.f8103dent[i].beachfront();
        }
        ConstraintWidget constraintWidget7 = this.f8248wireman;
        if (constraintWidget7 != null) {
            this.f8238impassible -= constraintWidget7.f8103dent[i + 1].beachfront();
        }
        this.f8234dern = constraintWidget;
        if (this.f8229arytenoidectomy == 0 && this.f8243monoploid) {
            this.f8241marial = constraintWidget;
        } else {
            this.f8241marial = this.f8230attabal;
        }
        this.f8237graveside = this.f8242molybdenite && this.f8244polloi;
    }
}
