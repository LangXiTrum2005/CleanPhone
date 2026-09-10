package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: Flow.java */
/* JADX INFO: loaded from: classes.dex */
public class marial extends taiyuan {

    /* JADX INFO: renamed from: alloy, reason: collision with root package name */
    public ConstraintWidget[] f8249alloy;

    /* JADX INFO: renamed from: liable, reason: collision with root package name */
    public int f8261liable = -1;

    /* JADX INFO: renamed from: vir, reason: collision with root package name */
    public int f8273vir = -1;

    /* JADX INFO: renamed from: twybill, reason: collision with root package name */
    public int f8271twybill = -1;

    /* JADX INFO: renamed from: miliaria, reason: collision with root package name */
    public int f8264miliaria = -1;

    /* JADX INFO: renamed from: incorrectly, reason: collision with root package name */
    public int f8260incorrectly = -1;

    /* JADX INFO: renamed from: hyalinization, reason: collision with root package name */
    public int f8258hyalinization = -1;

    /* JADX INFO: renamed from: puffin, reason: collision with root package name */
    public float f8267puffin = 0.5f;

    /* JADX INFO: renamed from: ctenidium, reason: collision with root package name */
    public float f8252ctenidium = 0.5f;

    /* JADX INFO: renamed from: rajahship, reason: collision with root package name */
    public float f8268rajahship = 0.5f;

    /* JADX INFO: renamed from: tout, reason: collision with root package name */
    public float f8270tout = 0.5f;

    /* JADX INFO: renamed from: undecorated, reason: collision with root package name */
    public float f8272undecorated = 0.5f;

    /* JADX INFO: renamed from: ethene, reason: collision with root package name */
    public float f8254ethene = 0.5f;

    /* JADX INFO: renamed from: microanalysis, reason: collision with root package name */
    public int f8263microanalysis = 0;

    /* JADX INFO: renamed from: hydromechanics, reason: collision with root package name */
    public int f8259hydromechanics = 0;

    /* JADX INFO: renamed from: polyfoil, reason: collision with root package name */
    public int f8266polyfoil = 2;

    /* JADX INFO: renamed from: bluecoat, reason: collision with root package name */
    public int f8250bluecoat = 2;

    /* JADX INFO: renamed from: harlequinade, reason: collision with root package name */
    public int f8256harlequinade = 0;

    /* JADX INFO: renamed from: cybernatic, reason: collision with root package name */
    public int f8253cybernatic = -1;

    /* JADX INFO: renamed from: collection, reason: collision with root package name */
    public int f8251collection = 0;

    /* JADX INFO: renamed from: likeable, reason: collision with root package name */
    public ArrayList<attabal> f8262likeable = new ArrayList<>();

    /* JADX INFO: renamed from: homophylic, reason: collision with root package name */
    public ConstraintWidget[] f8257homophylic = null;

    /* JADX INFO: renamed from: genii, reason: collision with root package name */
    public ConstraintWidget[] f8255genii = null;

    /* JADX INFO: renamed from: saccharic, reason: collision with root package name */
    public int[] f8269saccharic = null;

    /* JADX INFO: renamed from: palewise, reason: collision with root package name */
    public int f8265palewise = 0;

    /* JADX INFO: compiled from: Flow.java */
    public class attabal {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f8274apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f8276attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public ConstraintAnchor f8277beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public ConstraintAnchor f8278competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f8279cutely;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f8283impromptu;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public ConstraintAnchor f8285marial;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f8286monoploid;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f8289taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public ConstraintAnchor f8291wireman;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ConstraintWidget f8288saneness = null;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f8280dern = 0;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f8281formularize = 0;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f8282impassible = 0;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f8290triweekly = 0;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f8284kowloon = 0;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f8275arytenoidectomy = 0;

        public attabal(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.f8283impromptu = 0;
            this.f8289taiyuan = 0;
            this.f8279cutely = 0;
            this.f8274apical = 0;
            this.f8286monoploid = 0;
            this.f8276attabal = i;
            this.f8291wireman = constraintAnchor;
            this.f8285marial = constraintAnchor2;
            this.f8277beachfront = constraintAnchor3;
            this.f8278competently = constraintAnchor4;
            this.f8283impromptu = marial.this.homophylic();
            this.f8289taiyuan = marial.this.saccharic();
            this.f8279cutely = marial.this.genii();
            this.f8274apical = marial.this.likeable();
            this.f8286monoploid = i2;
        }

        public int beachfront() {
            return this.f8276attabal == 0 ? this.f8281formularize - marial.this.f8263microanalysis : this.f8281formularize;
        }

        public void competently(int i) {
            int i2 = this.f8275arytenoidectomy;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f8284kowloon;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3 && this.f8290triweekly + i5 < marial.this.f8265palewise; i5++) {
                ConstraintWidget constraintWidget = marial.this.f8249alloy[this.f8290triweekly + i5];
                if (this.f8276attabal == 0) {
                    if (constraintWidget != null && constraintWidget.trm() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f8109gintrap == 0) {
                        marial.this.palewise(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, constraintWidget.splinterproof(), constraintWidget.cord());
                    }
                } else if (constraintWidget != null && constraintWidget.splinterproof() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f8154rotuma == 0) {
                    int i6 = i4;
                    marial.this.palewise(constraintWidget, constraintWidget.trm(), constraintWidget.dent(), ConstraintWidget.DimensionBehaviour.FIXED, i6);
                    i4 = i6;
                }
            }
            impromptu();
        }

        public void cutely(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.f8276attabal = i;
            this.f8291wireman = constraintAnchor;
            this.f8285marial = constraintAnchor2;
            this.f8277beachfront = constraintAnchor3;
            this.f8278competently = constraintAnchor4;
            this.f8283impromptu = i2;
            this.f8289taiyuan = i3;
            this.f8279cutely = i4;
            this.f8274apical = i5;
            this.f8286monoploid = i6;
        }

        public void dern() {
            this.f8280dern = 0;
            this.f8288saneness = null;
            this.f8281formularize = 0;
            this.f8282impassible = 0;
            this.f8290triweekly = 0;
            this.f8284kowloon = 0;
            this.f8275arytenoidectomy = 0;
        }

        public final void impromptu() {
            this.f8281formularize = 0;
            this.f8282impassible = 0;
            this.f8288saneness = null;
            this.f8280dern = 0;
            int i = this.f8284kowloon;
            for (int i2 = 0; i2 < i && this.f8290triweekly + i2 < marial.this.f8265palewise; i2++) {
                ConstraintWidget constraintWidget = marial.this.f8249alloy[this.f8290triweekly + i2];
                if (this.f8276attabal == 0) {
                    int iDent = constraintWidget.dent();
                    int i3 = marial.this.f8263microanalysis;
                    if (constraintWidget.clubfoot() == 8) {
                        i3 = 0;
                    }
                    this.f8281formularize += iDent + i3;
                    int iIconoclasm = marial.this.iconoclasm(constraintWidget, this.f8286monoploid);
                    if (this.f8288saneness == null || this.f8280dern < iIconoclasm) {
                        this.f8288saneness = constraintWidget;
                        this.f8280dern = iIconoclasm;
                        this.f8282impassible = iIconoclasm;
                    }
                } else {
                    int iPremed = marial.this.premed(constraintWidget, this.f8286monoploid);
                    int iIconoclasm2 = marial.this.iconoclasm(constraintWidget, this.f8286monoploid);
                    int i4 = marial.this.f8259hydromechanics;
                    if (constraintWidget.clubfoot() == 8) {
                        i4 = 0;
                    }
                    this.f8282impassible += iIconoclasm2 + i4;
                    if (this.f8288saneness == null || this.f8280dern < iPremed) {
                        this.f8288saneness = constraintWidget;
                        this.f8280dern = iPremed;
                        this.f8281formularize = iPremed;
                    }
                }
            }
        }

        public int marial() {
            return this.f8276attabal == 1 ? this.f8282impassible - marial.this.f8259hydromechanics : this.f8282impassible;
        }

        public void saneness(ConstraintWidget constraintWidget) {
            if (this.f8276attabal == 0) {
                int iPremed = marial.this.premed(constraintWidget, this.f8286monoploid);
                if (constraintWidget.trm() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f8275arytenoidectomy++;
                    iPremed = 0;
                }
                this.f8281formularize += iPremed + (constraintWidget.clubfoot() != 8 ? marial.this.f8263microanalysis : 0);
                int iIconoclasm = marial.this.iconoclasm(constraintWidget, this.f8286monoploid);
                if (this.f8288saneness == null || this.f8280dern < iIconoclasm) {
                    this.f8288saneness = constraintWidget;
                    this.f8280dern = iIconoclasm;
                    this.f8282impassible = iIconoclasm;
                }
            } else {
                int iPremed2 = marial.this.premed(constraintWidget, this.f8286monoploid);
                int iIconoclasm2 = marial.this.iconoclasm(constraintWidget, this.f8286monoploid);
                if (constraintWidget.splinterproof() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f8275arytenoidectomy++;
                    iIconoclasm2 = 0;
                }
                this.f8282impassible += iIconoclasm2 + (constraintWidget.clubfoot() != 8 ? marial.this.f8259hydromechanics : 0);
                if (this.f8288saneness == null || this.f8280dern < iPremed2) {
                    this.f8288saneness = constraintWidget;
                    this.f8280dern = iPremed2;
                    this.f8281formularize = iPremed2;
                }
            }
            this.f8284kowloon++;
        }

        public void taiyuan(int i) {
            this.f8290triweekly = i;
        }

        public void wireman(boolean z, int i, boolean z2) {
            ConstraintWidget constraintWidget;
            int i2;
            char c;
            float f;
            float f2;
            int i3 = this.f8284kowloon;
            for (int i4 = 0; i4 < i3 && this.f8290triweekly + i4 < marial.this.f8265palewise; i4++) {
                ConstraintWidget constraintWidget2 = marial.this.f8249alloy[this.f8290triweekly + i4];
                if (constraintWidget2 != null) {
                    constraintWidget2.monroe();
                }
            }
            if (i3 == 0 || this.f8288saneness == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i5 = -1;
            int i6 = -1;
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = z ? (i3 - 1) - i7 : i7;
                if (this.f8290triweekly + i8 >= marial.this.f8265palewise) {
                    break;
                }
                ConstraintWidget constraintWidget3 = marial.this.f8249alloy[this.f8290triweekly + i8];
                if (constraintWidget3 != null && constraintWidget3.clubfoot() == 0) {
                    if (i5 == -1) {
                        i5 = i7;
                    }
                    i6 = i7;
                }
            }
            ConstraintWidget constraintWidget4 = null;
            if (this.f8276attabal != 0) {
                ConstraintWidget constraintWidget5 = this.f8288saneness;
                constraintWidget5.basify(marial.this.f8261liable);
                int i9 = this.f8283impromptu;
                if (i > 0) {
                    i9 += marial.this.f8263microanalysis;
                }
                if (z) {
                    constraintWidget5.f8177walach.attabal(this.f8277beachfront, i9);
                    if (z2) {
                        constraintWidget5.f8164starveling.attabal(this.f8291wireman, this.f8279cutely);
                    }
                    if (i > 0) {
                        this.f8277beachfront.f8080wireman.f8164starveling.attabal(constraintWidget5.f8177walach, 0);
                    }
                } else {
                    constraintWidget5.f8164starveling.attabal(this.f8291wireman, i9);
                    if (z2) {
                        constraintWidget5.f8177walach.attabal(this.f8277beachfront, this.f8279cutely);
                    }
                    if (i > 0) {
                        this.f8291wireman.f8080wireman.f8177walach.attabal(constraintWidget5.f8164starveling, 0);
                    }
                }
                for (int i10 = 0; i10 < i3 && this.f8290triweekly + i10 < marial.this.f8265palewise; i10++) {
                    ConstraintWidget constraintWidget6 = marial.this.f8249alloy[this.f8290triweekly + i10];
                    if (constraintWidget6 != null) {
                        if (i10 == 0) {
                            constraintWidget6.formularize(constraintWidget6.f8116hydrovane, this.f8285marial, this.f8289taiyuan);
                            int i11 = marial.this.f8273vir;
                            float f3 = marial.this.f8252ctenidium;
                            if (this.f8290triweekly == 0 && marial.this.f8264miliaria != -1) {
                                i11 = marial.this.f8264miliaria;
                                f3 = marial.this.f8270tout;
                            } else if (z2 && marial.this.f8258hyalinization != -1) {
                                i11 = marial.this.f8258hyalinization;
                                f3 = marial.this.f8254ethene;
                            }
                            constraintWidget6.tailoring(i11);
                            constraintWidget6.decarock(f3);
                        }
                        if (i10 == i3 - 1) {
                            constraintWidget6.formularize(constraintWidget6.f8144peridotite, this.f8278competently, this.f8274apical);
                        }
                        if (constraintWidget4 != null) {
                            constraintWidget6.f8116hydrovane.attabal(constraintWidget4.f8144peridotite, marial.this.f8259hydromechanics);
                            if (i10 == i5) {
                                constraintWidget6.f8116hydrovane.adultoid(this.f8289taiyuan);
                            }
                            constraintWidget4.f8144peridotite.attabal(constraintWidget6.f8116hydrovane, 0);
                            if (i10 == i6 + 1) {
                                constraintWidget4.f8144peridotite.adultoid(this.f8274apical);
                            }
                        }
                        if (constraintWidget6 != constraintWidget5) {
                            if (z) {
                                int i12 = marial.this.f8266polyfoil;
                                if (i12 == 0) {
                                    constraintWidget6.f8177walach.attabal(constraintWidget5.f8177walach, 0);
                                } else if (i12 == 1) {
                                    constraintWidget6.f8164starveling.attabal(constraintWidget5.f8164starveling, 0);
                                } else if (i12 == 2) {
                                    constraintWidget6.f8164starveling.attabal(constraintWidget5.f8164starveling, 0);
                                    constraintWidget6.f8177walach.attabal(constraintWidget5.f8177walach, 0);
                                }
                            } else {
                                int i13 = marial.this.f8266polyfoil;
                                if (i13 == 0) {
                                    constraintWidget6.f8164starveling.attabal(constraintWidget5.f8164starveling, 0);
                                } else if (i13 == 1) {
                                    constraintWidget6.f8177walach.attabal(constraintWidget5.f8177walach, 0);
                                } else if (i13 == 2) {
                                    if (z3) {
                                        constraintWidget6.f8164starveling.attabal(this.f8291wireman, this.f8283impromptu);
                                        constraintWidget6.f8177walach.attabal(this.f8277beachfront, this.f8279cutely);
                                    } else {
                                        constraintWidget6.f8164starveling.attabal(constraintWidget5.f8164starveling, 0);
                                        constraintWidget6.f8177walach.attabal(constraintWidget5.f8177walach, 0);
                                    }
                                }
                            }
                        }
                        constraintWidget4 = constraintWidget6;
                    }
                }
                return;
            }
            ConstraintWidget constraintWidget7 = this.f8288saneness;
            constraintWidget7.tailoring(marial.this.f8273vir);
            int i14 = this.f8289taiyuan;
            if (i > 0) {
                i14 += marial.this.f8259hydromechanics;
            }
            constraintWidget7.f8116hydrovane.attabal(this.f8285marial, i14);
            if (z2) {
                constraintWidget7.f8144peridotite.attabal(this.f8278competently, this.f8274apical);
            }
            if (i > 0) {
                this.f8285marial.f8080wireman.f8144peridotite.attabal(constraintWidget7.f8116hydrovane, 0);
            }
            char c2 = 3;
            if (marial.this.f8250bluecoat != 3 || constraintWidget7.premeiotic()) {
                constraintWidget = constraintWidget7;
                break;
            }
            int i15 = 0;
            while (true) {
                if (i15 < i3) {
                    int i16 = z ? (i3 - 1) - i15 : i15;
                    if (this.f8290triweekly + i16 < marial.this.f8265palewise) {
                        constraintWidget = marial.this.f8249alloy[this.f8290triweekly + i16];
                        if (constraintWidget.premeiotic()) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                constraintWidget = constraintWidget7;
                break;
            }
            int i17 = 0;
            while (i17 < i3) {
                int i18 = z ? (i3 - 1) - i17 : i17;
                if (this.f8290triweekly + i18 >= marial.this.f8265palewise) {
                    return;
                }
                ConstraintWidget constraintWidget8 = marial.this.f8249alloy[this.f8290triweekly + i18];
                if (constraintWidget8 == null) {
                    constraintWidget8 = constraintWidget4;
                    c = c2;
                } else {
                    if (i17 == 0) {
                        i2 = 1;
                        constraintWidget8.formularize(constraintWidget8.f8164starveling, this.f8291wireman, this.f8283impromptu);
                    } else {
                        i2 = 1;
                    }
                    if (i18 == 0) {
                        int i19 = marial.this.f8261liable;
                        float f4 = marial.this.f8267puffin;
                        if (z) {
                            f4 = 1.0f - f4;
                        }
                        if (this.f8290triweekly == 0 && marial.this.f8271twybill != -1) {
                            i19 = marial.this.f8271twybill;
                            if (z) {
                                f2 = marial.this.f8268rajahship;
                                f = 1.0f - f2;
                            } else {
                                f = marial.this.f8268rajahship;
                            }
                            f4 = f;
                        } else if (z2 && marial.this.f8260incorrectly != -1) {
                            i19 = marial.this.f8260incorrectly;
                            if (z) {
                                f2 = marial.this.f8272undecorated;
                                f = 1.0f - f2;
                            } else {
                                f = marial.this.f8272undecorated;
                            }
                            f4 = f;
                        }
                        constraintWidget8.basify(i19);
                        constraintWidget8.immediately(f4);
                    }
                    if (i17 == i3 - 1) {
                        constraintWidget8.formularize(constraintWidget8.f8177walach, this.f8277beachfront, this.f8279cutely);
                    }
                    if (constraintWidget4 != null) {
                        constraintWidget8.f8164starveling.attabal(constraintWidget4.f8177walach, marial.this.f8263microanalysis);
                        if (i17 == i5) {
                            constraintWidget8.f8164starveling.adultoid(this.f8283impromptu);
                        }
                        constraintWidget4.f8177walach.attabal(constraintWidget8.f8164starveling, 0);
                        if (i17 == i6 + 1) {
                            constraintWidget4.f8177walach.adultoid(this.f8279cutely);
                        }
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        c = 3;
                        if (marial.this.f8250bluecoat == 3 && constraintWidget.premeiotic() && constraintWidget8 != constraintWidget && constraintWidget8.premeiotic()) {
                            constraintWidget8.f8132mathsort.attabal(constraintWidget.f8132mathsort, 0);
                        } else {
                            int i20 = marial.this.f8250bluecoat;
                            if (i20 == 0) {
                                constraintWidget8.f8116hydrovane.attabal(constraintWidget7.f8116hydrovane, 0);
                            } else if (i20 == i2) {
                                constraintWidget8.f8144peridotite.attabal(constraintWidget7.f8144peridotite, 0);
                            } else if (z3) {
                                constraintWidget8.f8116hydrovane.attabal(this.f8285marial, this.f8289taiyuan);
                                constraintWidget8.f8144peridotite.attabal(this.f8278competently, this.f8274apical);
                            } else {
                                constraintWidget8.f8116hydrovane.attabal(constraintWidget7.f8116hydrovane, 0);
                                constraintWidget8.f8144peridotite.attabal(constraintWidget7.f8144peridotite, 0);
                            }
                        }
                    } else {
                        c = 3;
                    }
                }
                i17++;
                c2 = c;
                constraintWidget4 = constraintWidget8;
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.taiyuan
    public void alloy(int i, int i2, int i3, int i4) {
        int i5;
        ConstraintWidget[] constraintWidgetArr;
        if (this.f37385licking > 0 && !livable()) {
            murrine(0, 0);
            hypokinesis(false);
            return;
        }
        int iHomophylic = homophylic();
        int iGenii = genii();
        int iSaccharic = saccharic();
        int iLikeable = likeable();
        int[] iArr = new int[2];
        int i6 = (i2 - iHomophylic) - iGenii;
        int i7 = this.f8251collection;
        if (i7 == 1) {
            i6 = (i4 - iSaccharic) - iLikeable;
        }
        int i8 = i6;
        if (i7 == 0) {
            if (this.f8261liable == -1) {
                this.f8261liable = 0;
            }
            if (this.f8273vir == -1) {
                this.f8273vir = 0;
            }
        } else {
            if (this.f8261liable == -1) {
                this.f8261liable = 0;
            }
            if (this.f8273vir == -1) {
                this.f8273vir = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f37386osteal;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = this.f37385licking;
            if (i9 >= i5) {
                break;
            }
            if (this.f37386osteal[i9].clubfoot() == 8) {
                i10++;
            }
            i9++;
        }
        if (i10 > 0) {
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[i5 - i10];
            int i11 = 0;
            i5 = 0;
            while (i11 < this.f37385licking) {
                ConstraintWidget constraintWidget = this.f37386osteal[i11];
                ConstraintWidget[] constraintWidgetArr4 = constraintWidgetArr3;
                if (constraintWidget.clubfoot() != 8) {
                    constraintWidgetArr4[i5] = constraintWidget;
                    i5++;
                }
                i11++;
                constraintWidgetArr3 = constraintWidgetArr4;
            }
            constraintWidgetArr = constraintWidgetArr3;
        } else {
            constraintWidgetArr = constraintWidgetArr2;
        }
        int i12 = i5;
        this.f8249alloy = constraintWidgetArr;
        this.f8265palewise = i12;
        int i13 = this.f8256harlequinade;
        if (i13 == 0) {
            weimar(constraintWidgetArr, i12, this.f8251collection, i8, iArr);
        } else if (i13 == 1) {
            ferrovanadium(constraintWidgetArr, i12, this.f8251collection, i8, iArr);
        } else if (i13 == 2) {
            montera(constraintWidgetArr, i12, this.f8251collection, i8, iArr);
        } else if (i13 == 3) {
            earstone(constraintWidgetArr, i12, this.f8251collection, i8, iArr);
        }
        int iMin = iArr[0] + iHomophylic + iGenii;
        int iMin2 = iArr[1] + iSaccharic + iLikeable;
        if (i == 1073741824) {
            iMin = i2;
        } else if (i == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, i2);
        } else if (i != 0) {
            iMin = 0;
        }
        if (i3 == 1073741824) {
            iMin2 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            iMin2 = Math.min(iMin2, i4);
        } else if (i3 != 0) {
            iMin2 = 0;
        }
        murrine(iMin, iMin2);
        hyalinization(iMin);
        sakeen(iMin2);
        hypokinesis(this.f37385licking > 0);
    }

    public void arugula(int i) {
        this.f8259hydromechanics = i;
    }

    public void ayutthaya(int i) {
        this.f8261liable = i;
    }

    public void blighty(int i) {
        this.f8273vir = i;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void competently(androidx.constraintlayout.core.dern dernVar, boolean z) {
        super.competently(dernVar, z);
        boolean z2 = grimness() != null && ((wireman) grimness()).bleacherite();
        int i = this.f8256harlequinade;
        if (i != 0) {
            if (i == 1) {
                int size = this.f8262likeable.size();
                int i2 = 0;
                while (i2 < size) {
                    this.f8262likeable.get(i2).wireman(z2, i2, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2) {
                wittig(z2);
            } else if (i == 3) {
                int size2 = this.f8262likeable.size();
                int i3 = 0;
                while (i3 < size2) {
                    this.f8262likeable.get(i3).wireman(z2, i3, i3 == size2 + (-1));
                    i3++;
                }
            }
        } else if (this.f8262likeable.size() > 0) {
            this.f8262likeable.get(0).wireman(z2, 0, true);
        }
        hypokinesis(false);
    }

    public void crosspiece(int i) {
        this.f8264miliaria = i;
    }

    public void diakinesis(float f) {
        this.f8254ethene = f;
    }

    public void disrupture(int i) {
        this.f8258hyalinization = i;
    }

    public final void earstone(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        marial marialVar;
        int i5;
        ConstraintAnchor constraintAnchor;
        int i6;
        marial marialVar2 = this;
        if (i == 0) {
            return;
        }
        marialVar2.f8262likeable.clear();
        int i7 = i3;
        attabal attabalVar = marialVar2.new attabal(i2, marialVar2.f8164starveling, marialVar2.f8116hydrovane, marialVar2.f8177walach, marialVar2.f8144peridotite, i7);
        marialVar2.f8262likeable.add(attabalVar);
        boolean z = true;
        if (i2 == 0) {
            int i8 = 0;
            i4 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i10 < i) {
                i8++;
                ConstraintWidget constraintWidget = constraintWidgetArr[i10];
                int iPremed = marialVar2.premed(constraintWidget, i7);
                if (constraintWidget.trm() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i11 = i4;
                boolean z2 = (i9 == i7 || (marialVar2.f8263microanalysis + i9) + iPremed > i7) && attabalVar.f8288saneness != null;
                if (!z2 && i10 > 0 && (i6 = marialVar2.f8253cybernatic) > 0 && i8 > i6) {
                    z2 = true;
                }
                if (z2) {
                    attabalVar = marialVar2.new attabal(i2, marialVar2.f8164starveling, marialVar2.f8116hydrovane, marialVar2.f8177walach, marialVar2.f8144peridotite, i7);
                    attabalVar.taiyuan(i10);
                    marialVar2.f8262likeable.add(attabalVar);
                    i8 = 1;
                } else {
                    if (i10 > 0) {
                        i9 += marialVar2.f8263microanalysis + iPremed;
                    }
                    attabalVar.saneness(constraintWidget);
                    i10++;
                    i4 = i11;
                }
                i9 = iPremed;
                attabalVar.saneness(constraintWidget);
                i10++;
                i4 = i11;
            }
        } else {
            int i12 = 0;
            i4 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i) {
                i12++;
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i14];
                int iIconoclasm = marialVar2.iconoclasm(constraintWidget2, i7);
                if (constraintWidget2.splinterproof() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i15 = i4;
                boolean z3 = (i13 == i7 || (marialVar2.f8259hydromechanics + i13) + iIconoclasm > i7) && attabalVar.f8288saneness != null;
                if (!z3 && i14 > 0 && (i5 = marialVar2.f8253cybernatic) > 0 && i12 > i5) {
                    z3 = true;
                }
                if (z3) {
                    attabalVar = marialVar2.new attabal(i2, marialVar2.f8164starveling, marialVar2.f8116hydrovane, marialVar2.f8177walach, marialVar2.f8144peridotite, i7);
                    marialVar = marialVar2;
                    attabalVar.taiyuan(i14);
                    marialVar.f8262likeable.add(attabalVar);
                    i12 = 1;
                } else {
                    marialVar = marialVar2;
                    if (i14 > 0) {
                        i13 += marialVar.f8259hydromechanics + iIconoclasm;
                    }
                    attabalVar.saneness(constraintWidget2);
                    i14++;
                    i7 = i3;
                    i4 = i15;
                    marialVar2 = marialVar;
                }
                i13 = iIconoclasm;
                attabalVar.saneness(constraintWidget2);
                i14++;
                i7 = i3;
                i4 = i15;
                marialVar2 = marialVar;
            }
        }
        marial marialVar3 = marialVar2;
        int size = marialVar3.f8262likeable.size();
        ConstraintAnchor constraintAnchor2 = marialVar3.f8164starveling;
        ConstraintAnchor constraintAnchor3 = marialVar3.f8116hydrovane;
        ConstraintAnchor constraintAnchor4 = marialVar3.f8177walach;
        ConstraintAnchor constraintAnchor5 = marialVar3.f8144peridotite;
        int iHomophylic = marialVar3.homophylic();
        int iSaccharic = marialVar3.saccharic();
        int iGenii = marialVar3.genii();
        int iLikeable = marialVar3.likeable();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = marialVar3.trm();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z4 = dimensionBehaviourTrm == dimensionBehaviour || marialVar3.splinterproof() == dimensionBehaviour;
        if (i4 > 0 && z4) {
            for (int i16 = 0; i16 < size; i16++) {
                attabal attabalVar2 = marialVar3.f8262likeable.get(i16);
                if (i2 == 0) {
                    attabalVar2.competently(i3 - attabalVar2.beachfront());
                } else {
                    attabalVar2.competently(i3 - attabalVar2.marial());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor3;
        int iLikeable2 = iLikeable;
        int i17 = 0;
        int i18 = 0;
        int iGenii2 = iGenii;
        int i19 = iSaccharic;
        int i20 = iHomophylic;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor2;
        int i21 = 0;
        while (i18 < size) {
            attabal attabalVar3 = marialVar3.f8262likeable.get(i18);
            if (i2 == 0) {
                if (i18 < size - 1) {
                    constraintAnchor7 = marialVar3.f8262likeable.get(i18 + 1).f8288saneness.f8116hydrovane;
                    iLikeable2 = 0;
                } else {
                    constraintAnchor7 = marialVar3.f8144peridotite;
                    iLikeable2 = marialVar3.likeable();
                }
                ConstraintAnchor constraintAnchor10 = attabalVar3.f8288saneness.f8144peridotite;
                int i22 = i17;
                attabalVar3.cutely(i2, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i20, i19, iGenii2, iLikeable2, i3);
                int iMax = Math.max(i21, attabalVar3.beachfront());
                int iMarial = attabalVar3.marial() + i22;
                if (i18 > 0) {
                    iMarial += marialVar3.f8259hydromechanics;
                }
                i17 = iMarial;
                i21 = iMax;
                constraintAnchor6 = constraintAnchor10;
                i19 = 0;
            } else {
                int i23 = i17;
                int i24 = i21;
                if (i18 < size - 1) {
                    constraintAnchor = marialVar3.f8262likeable.get(i18 + 1).f8288saneness.f8164starveling;
                    iGenii2 = 0;
                } else {
                    constraintAnchor = marialVar3.f8177walach;
                    iGenii2 = marialVar3.genii();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = attabalVar3.f8288saneness.f8177walach;
                attabalVar3.cutely(i2, constraintAnchor9, constraintAnchor6, constraintAnchor8, constraintAnchor7, i20, i19, iGenii2, iLikeable2, i3);
                int iBeachfront = attabalVar3.beachfront() + i24;
                int iMax2 = Math.max(i23, attabalVar3.marial());
                if (i18 > 0) {
                    iBeachfront += marialVar3.f8263microanalysis;
                }
                int i25 = iBeachfront;
                i17 = iMax2;
                i21 = i25;
                i20 = 0;
                constraintAnchor9 = constraintAnchor11;
            }
            i18++;
            z = z;
        }
        iArr[0] = i21;
        iArr[z ? 1 : 0] = i17;
    }

    public void energid(float f) {
        this.f8267puffin = f;
    }

    public final void ferrovanadium(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        int i4;
        marial marialVar;
        int i5;
        ConstraintAnchor constraintAnchor;
        int i6;
        marial marialVar2 = this;
        if (i == 0) {
            return;
        }
        marialVar2.f8262likeable.clear();
        int i7 = i3;
        attabal attabalVar = marialVar2.new attabal(i2, marialVar2.f8164starveling, marialVar2.f8116hydrovane, marialVar2.f8177walach, marialVar2.f8144peridotite, i7);
        marialVar2.f8262likeable.add(attabalVar);
        if (i2 == 0) {
            i4 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i9 < i) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i9];
                int iPremed = marialVar2.premed(constraintWidget, i7);
                if (constraintWidget.trm() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i10 = i4;
                boolean z = (i8 == i7 || (marialVar2.f8263microanalysis + i8) + iPremed > i7) && attabalVar.f8288saneness != null;
                if (!z && i9 > 0 && (i6 = marialVar2.f8253cybernatic) > 0 && i9 % i6 == 0) {
                    z = true;
                }
                if (z) {
                    attabalVar = marialVar2.new attabal(i2, marialVar2.f8164starveling, marialVar2.f8116hydrovane, marialVar2.f8177walach, marialVar2.f8144peridotite, i7);
                    attabalVar.taiyuan(i9);
                    marialVar2.f8262likeable.add(attabalVar);
                } else {
                    if (i9 > 0) {
                        i8 += marialVar2.f8263microanalysis + iPremed;
                    }
                    attabalVar.saneness(constraintWidget);
                    i9++;
                    i4 = i10;
                }
                i8 = iPremed;
                attabalVar.saneness(constraintWidget);
                i9++;
                i4 = i10;
            }
        } else {
            i4 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i12 < i) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i12];
                int iIconoclasm = marialVar2.iconoclasm(constraintWidget2, i7);
                if (constraintWidget2.splinterproof() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i4++;
                }
                int i13 = i4;
                boolean z2 = (i11 == i7 || (marialVar2.f8259hydromechanics + i11) + iIconoclasm > i7) && attabalVar.f8288saneness != null;
                if (!z2 && i12 > 0 && (i5 = marialVar2.f8253cybernatic) > 0 && i12 % i5 == 0) {
                    z2 = true;
                }
                if (z2) {
                    attabalVar = marialVar2.new attabal(i2, marialVar2.f8164starveling, marialVar2.f8116hydrovane, marialVar2.f8177walach, marialVar2.f8144peridotite, i7);
                    marialVar = marialVar2;
                    attabalVar.taiyuan(i12);
                    marialVar.f8262likeable.add(attabalVar);
                } else {
                    marialVar = marialVar2;
                    if (i12 > 0) {
                        i11 += marialVar.f8259hydromechanics + iIconoclasm;
                    }
                    attabalVar.saneness(constraintWidget2);
                    i12++;
                    i7 = i3;
                    i4 = i13;
                    marialVar2 = marialVar;
                }
                i11 = iIconoclasm;
                attabalVar.saneness(constraintWidget2);
                i12++;
                i7 = i3;
                i4 = i13;
                marialVar2 = marialVar;
            }
        }
        marial marialVar3 = marialVar2;
        int size = marialVar3.f8262likeable.size();
        ConstraintAnchor constraintAnchor2 = marialVar3.f8164starveling;
        ConstraintAnchor constraintAnchor3 = marialVar3.f8116hydrovane;
        ConstraintAnchor constraintAnchor4 = marialVar3.f8177walach;
        ConstraintAnchor constraintAnchor5 = marialVar3.f8144peridotite;
        int iHomophylic = marialVar3.homophylic();
        int iSaccharic = marialVar3.saccharic();
        int iGenii = marialVar3.genii();
        int iLikeable = marialVar3.likeable();
        ConstraintWidget.DimensionBehaviour dimensionBehaviourTrm = marialVar3.trm();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z3 = dimensionBehaviourTrm == dimensionBehaviour || marialVar3.splinterproof() == dimensionBehaviour;
        if (i4 > 0 && z3) {
            for (int i14 = 0; i14 < size; i14++) {
                attabal attabalVar2 = marialVar3.f8262likeable.get(i14);
                if (i2 == 0) {
                    attabalVar2.competently(i3 - attabalVar2.beachfront());
                } else {
                    attabalVar2.competently(i3 - attabalVar2.marial());
                }
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchor2;
        int iLikeable2 = iLikeable;
        int i15 = 0;
        int iGenii2 = iGenii;
        int i16 = iSaccharic;
        int i17 = iHomophylic;
        ConstraintAnchor constraintAnchor7 = constraintAnchor5;
        ConstraintAnchor constraintAnchor8 = constraintAnchor4;
        ConstraintAnchor constraintAnchor9 = constraintAnchor3;
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            attabal attabalVar3 = marialVar3.f8262likeable.get(i19);
            if (i2 == 0) {
                if (i19 < size - 1) {
                    constraintAnchor7 = marialVar3.f8262likeable.get(i19 + 1).f8288saneness.f8116hydrovane;
                    iLikeable2 = 0;
                } else {
                    constraintAnchor7 = marialVar3.f8144peridotite;
                    iLikeable2 = marialVar3.likeable();
                }
                ConstraintAnchor constraintAnchor10 = attabalVar3.f8288saneness.f8144peridotite;
                int i20 = i18;
                attabalVar3.cutely(i2, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i17, i16, iGenii2, iLikeable2, i3);
                int iMax = Math.max(i15, attabalVar3.beachfront());
                int iMarial = attabalVar3.marial() + i20;
                if (i19 > 0) {
                    iMarial += marialVar3.f8259hydromechanics;
                }
                i18 = iMarial;
                i15 = iMax;
                constraintAnchor9 = constraintAnchor10;
                i16 = 0;
            } else {
                int i21 = i15;
                int i22 = i18;
                if (i19 < size - 1) {
                    constraintAnchor = marialVar3.f8262likeable.get(i19 + 1).f8288saneness.f8164starveling;
                    iGenii2 = 0;
                } else {
                    constraintAnchor = marialVar3.f8177walach;
                    iGenii2 = marialVar3.genii();
                }
                constraintAnchor8 = constraintAnchor;
                ConstraintAnchor constraintAnchor11 = attabalVar3.f8288saneness.f8177walach;
                attabalVar3.cutely(i2, constraintAnchor6, constraintAnchor9, constraintAnchor8, constraintAnchor7, i17, i16, iGenii2, iLikeable2, i3);
                int iBeachfront = attabalVar3.beachfront() + i21;
                int iMax2 = Math.max(i22, attabalVar3.marial());
                if (i19 > 0) {
                    iBeachfront += marialVar3.f8263microanalysis;
                }
                int i23 = iBeachfront;
                i18 = iMax2;
                i15 = i23;
                i17 = 0;
                constraintAnchor6 = constraintAnchor11;
            }
        }
        iArr[0] = i15;
        iArr[1] = i18;
    }

    public void goonda(int i) {
        this.f8271twybill = i;
    }

    public void http(int i) {
        this.f8266polyfoil = i;
    }

    public final int iconoclasm(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.splinterproof() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f8154rotuma;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f8180yemenite * i);
                if (i3 != constraintWidget.cord()) {
                    constraintWidget.demilitarize(true);
                    palewise(constraintWidget, constraintWidget.trm(), constraintWidget.dent(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.cord();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.dent() * constraintWidget2.f8121itchy) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.cord();
    }

    public void interweave(float f) {
        this.f8270tout = f;
    }

    public void kabul(int i) {
        this.f8253cybernatic = i;
    }

    public void kinesic(int i) {
        this.f8256harlequinade = i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:119:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0059 A[ADDED_TO_REGION, EDGE_INSN: B:122:0x0059->B:42:0x0059 BREAK  A[LOOP:1: B:44:0x005c->B:124:0x005c], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00d3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x00ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060  */
    /* JADX WARN: Code duplicated, block: B:47:0x006a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0080  */
    /* JADX WARN: Code duplicated, block: B:57:0x0088  */
    /* JADX WARN: Code duplicated, block: B:61:0x0090  */
    /* JADX WARN: Code duplicated, block: B:64:0x0097  */
    /* JADX WARN: Code duplicated, block: B:66:0x009a  */
    /* JADX WARN: Code duplicated, block: B:68:0x009f  */
    /* JADX WARN: Code duplicated, block: B:72:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:97:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x00fa A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x010d -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x010f -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0115 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:109:0x0117 -> B:42:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:45:0x005e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void montera(androidx.constraintlayout.core.widgets.ConstraintWidget[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.marial.montera(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    public void notornis(float f) {
        this.f8268rajahship = f;
    }

    public void ocellation(int i) {
        this.f8250bluecoat = i;
    }

    public void overassessment(int i) {
        this.f8263microanalysis = i;
    }

    public void pedagogism(float f) {
        this.f8272undecorated = f;
    }

    public final int premed(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.trm() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.f8109gintrap;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.f8165stratoscope * i);
                if (i3 != constraintWidget.dent()) {
                    constraintWidget.demilitarize(true);
                    palewise(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.splinterproof(), constraintWidget.cord());
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.dent();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.cord() * constraintWidget2.f8121itchy) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.dent();
    }

    public void specky(int i) {
        this.f8251collection = i;
    }

    public void talweg(float f) {
        this.f8252ctenidium = f;
    }

    public void transitional(int i) {
        this.f8260incorrectly = i;
    }

    @Override // sayid.saneness, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void triweekly(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.triweekly(constraintWidget, map);
        marial marialVar = (marial) constraintWidget;
        this.f8261liable = marialVar.f8261liable;
        this.f8273vir = marialVar.f8273vir;
        this.f8271twybill = marialVar.f8271twybill;
        this.f8264miliaria = marialVar.f8264miliaria;
        this.f8260incorrectly = marialVar.f8260incorrectly;
        this.f8258hyalinization = marialVar.f8258hyalinization;
        this.f8267puffin = marialVar.f8267puffin;
        this.f8252ctenidium = marialVar.f8252ctenidium;
        this.f8268rajahship = marialVar.f8268rajahship;
        this.f8270tout = marialVar.f8270tout;
        this.f8272undecorated = marialVar.f8272undecorated;
        this.f8254ethene = marialVar.f8254ethene;
        this.f8263microanalysis = marialVar.f8263microanalysis;
        this.f8259hydromechanics = marialVar.f8259hydromechanics;
        this.f8266polyfoil = marialVar.f8266polyfoil;
        this.f8250bluecoat = marialVar.f8250bluecoat;
        this.f8256harlequinade = marialVar.f8256harlequinade;
        this.f8253cybernatic = marialVar.f8253cybernatic;
        this.f8251collection = marialVar.f8251collection;
    }

    public final void weimar(ConstraintWidget[] constraintWidgetArr, int i, int i2, int i3, int[] iArr) {
        attabal attabalVar;
        if (i == 0) {
            return;
        }
        if (this.f8262likeable.size() == 0) {
            attabalVar = new attabal(i2, this.f8164starveling, this.f8116hydrovane, this.f8177walach, this.f8144peridotite, i3);
            this.f8262likeable.add(attabalVar);
        } else {
            attabal attabalVar2 = this.f8262likeable.get(0);
            attabalVar2.dern();
            attabalVar2.cutely(i2, this.f8164starveling, this.f8116hydrovane, this.f8177walach, this.f8144peridotite, homophylic(), saccharic(), genii(), likeable(), i3);
            attabalVar = attabalVar2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            attabalVar.saneness(constraintWidgetArr[i4]);
        }
        iArr[0] = attabalVar.beachfront();
        iArr[1] = attabalVar.marial();
    }

    public final void wittig(boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        if (this.f8269saccharic == null || this.f8255genii == null || this.f8257homophylic == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f8265palewise; i2++) {
            this.f8249alloy[i2].monroe();
        }
        int[] iArr = this.f8269saccharic;
        int i3 = iArr[0];
        int i4 = iArr[1];
        float f2 = this.f8267puffin;
        ConstraintWidget constraintWidget2 = null;
        int i5 = 0;
        while (i5 < i3) {
            if (z) {
                i = (i3 - i5) - 1;
                f = 1.0f - this.f8267puffin;
            } else {
                f = f2;
                i = i5;
            }
            ConstraintWidget constraintWidget3 = this.f8255genii[i];
            if (constraintWidget3 != null && constraintWidget3.clubfoot() != 8) {
                if (i5 == 0) {
                    constraintWidget3.formularize(constraintWidget3.f8164starveling, this.f8164starveling, homophylic());
                    constraintWidget3.basify(this.f8261liable);
                    constraintWidget3.immediately(f);
                }
                if (i5 == i3 - 1) {
                    constraintWidget3.formularize(constraintWidget3.f8177walach, this.f8177walach, genii());
                }
                if (i5 > 0 && constraintWidget2 != null) {
                    constraintWidget3.formularize(constraintWidget3.f8164starveling, constraintWidget2.f8177walach, this.f8263microanalysis);
                    constraintWidget2.formularize(constraintWidget2.f8177walach, constraintWidget3.f8164starveling, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i5++;
            f2 = f;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            ConstraintWidget constraintWidget4 = this.f8257homophylic[i6];
            if (constraintWidget4 != null && constraintWidget4.clubfoot() != 8) {
                if (i6 == 0) {
                    constraintWidget4.formularize(constraintWidget4.f8116hydrovane, this.f8116hydrovane, saccharic());
                    constraintWidget4.tailoring(this.f8273vir);
                    constraintWidget4.decarock(this.f8252ctenidium);
                }
                if (i6 == i4 - 1) {
                    constraintWidget4.formularize(constraintWidget4.f8144peridotite, this.f8144peridotite, likeable());
                }
                if (i6 > 0 && constraintWidget2 != null) {
                    constraintWidget4.formularize(constraintWidget4.f8116hydrovane, constraintWidget2.f8144peridotite, this.f8259hydromechanics);
                    constraintWidget2.formularize(constraintWidget2.f8144peridotite, constraintWidget4.f8116hydrovane, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i7 = 0; i7 < i3; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = (i8 * i3) + i7;
                if (this.f8251collection == 1) {
                    i9 = (i7 * i4) + i8;
                }
                ConstraintWidget[] constraintWidgetArr = this.f8249alloy;
                if (i9 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i9]) != null && constraintWidget.clubfoot() != 8) {
                    ConstraintWidget constraintWidget5 = this.f8255genii[i7];
                    ConstraintWidget constraintWidget6 = this.f8257homophylic[i8];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.formularize(constraintWidget.f8164starveling, constraintWidget5.f8164starveling, 0);
                        constraintWidget.formularize(constraintWidget.f8177walach, constraintWidget5.f8177walach, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.formularize(constraintWidget.f8116hydrovane, constraintWidget6.f8116hydrovane, 0);
                        constraintWidget.formularize(constraintWidget.f8144peridotite, constraintWidget6.f8144peridotite, 0);
                    }
                }
            }
        }
    }
}
