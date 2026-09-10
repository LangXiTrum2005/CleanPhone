package rsp;

import android.text.Layout;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class competently {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public float f36935apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Layout.Alignment f36936arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f36937attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f36941dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public String f36942formularize;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Layout.Alignment f36945kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f36946marial;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public saneness f36949polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f36950saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f36953wireman;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f36938beachfront = -1;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f36939competently = -1;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f36944impromptu = -1;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f36951taiyuan = -1;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f36940cutely = -1;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f36943impassible = -1;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f36952triweekly = -1;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f36948monoploid = -1;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f36947molybdenite = Float.MAX_VALUE;

    public competently adultoid(int i) {
        this.f36953wireman = i;
        this.f36946marial = true;
        return this;
    }

    public float apical() {
        return this.f36947molybdenite;
    }

    public boolean arytenoidectomy() {
        return this.f36946marial;
    }

    public competently attabal(competently competentlyVar) {
        return polloi(competentlyVar, true);
    }

    public int beachfront() {
        return this.f36940cutely;
    }

    public String competently() {
        return this.f36942formularize;
    }

    public competently cord(int i) {
        this.f36940cutely = i;
        return this;
    }

    public competently cuirassed(String str) {
        this.f36942formularize = str;
        return this;
    }

    public int cutely() {
        return this.f36943impassible;
    }

    public int dern() {
        if (this.f36941dern) {
            return this.f36950saneness;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public competently dovishness(boolean z) {
        this.f36944impromptu = z ? 1 : 0;
        return this;
    }

    public int formularize() {
        int i = this.f36944impromptu;
        if (i == -1 && this.f36951taiyuan == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f36951taiyuan == 1 ? 2 : 0);
    }

    public competently gintrap(int i) {
        this.f36950saneness = i;
        this.f36941dern = true;
        return this;
    }

    public boolean graveside() {
        return this.f36939competently == 1;
    }

    public Layout.Alignment impassible() {
        return this.f36945kowloon;
    }

    public Layout.Alignment impromptu() {
        return this.f36936arytenoidectomy;
    }

    public competently kattegat(float f) {
        this.f36947molybdenite = f;
        return this;
    }

    public saneness kowloon() {
        return this.f36949polloi;
    }

    public float marial() {
        return this.f36935apical;
    }

    public competently merc(saneness sanenessVar) {
        this.f36949polloi = sanenessVar;
        return this;
    }

    public boolean molybdenite() {
        return this.f36938beachfront == 1;
    }

    public boolean monoploid() {
        return this.f36941dern;
    }

    public competently oilcan(Layout.Alignment alignment) {
        this.f36936arytenoidectomy = alignment;
        return this;
    }

    public competently polder(boolean z) {
        this.f36939competently = z ? 1 : 0;
        return this;
    }

    public final competently polloi(competently competentlyVar, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (competentlyVar != null) {
            if (!this.f36941dern && competentlyVar.f36941dern) {
                gintrap(competentlyVar.f36950saneness);
            }
            if (this.f36944impromptu == -1) {
                this.f36944impromptu = competentlyVar.f36944impromptu;
            }
            if (this.f36951taiyuan == -1) {
                this.f36951taiyuan = competentlyVar.f36951taiyuan;
            }
            if (this.f36937attabal == null && (str = competentlyVar.f36937attabal) != null) {
                this.f36937attabal = str;
            }
            if (this.f36938beachfront == -1) {
                this.f36938beachfront = competentlyVar.f36938beachfront;
            }
            if (this.f36939competently == -1) {
                this.f36939competently = competentlyVar.f36939competently;
            }
            if (this.f36952triweekly == -1) {
                this.f36952triweekly = competentlyVar.f36952triweekly;
            }
            if (this.f36945kowloon == null && (alignment2 = competentlyVar.f36945kowloon) != null) {
                this.f36945kowloon = alignment2;
            }
            if (this.f36936arytenoidectomy == null && (alignment = competentlyVar.f36936arytenoidectomy) != null) {
                this.f36936arytenoidectomy = alignment;
            }
            if (this.f36948monoploid == -1) {
                this.f36948monoploid = competentlyVar.f36948monoploid;
            }
            if (this.f36940cutely == -1) {
                this.f36940cutely = competentlyVar.f36940cutely;
                this.f36935apical = competentlyVar.f36935apical;
            }
            if (this.f36949polloi == null) {
                this.f36949polloi = competentlyVar.f36949polloi;
            }
            if (this.f36947molybdenite == Float.MAX_VALUE) {
                this.f36947molybdenite = competentlyVar.f36947molybdenite;
            }
            if (z && !this.f36946marial && competentlyVar.f36946marial) {
                adultoid(competentlyVar.f36953wireman);
            }
            if (z && this.f36943impassible == -1 && (i = competentlyVar.f36943impassible) != -1) {
                this.f36943impassible = i;
            }
        }
        return this;
    }

    public competently preprohormone(float f) {
        this.f36935apical = f;
        return this;
    }

    public competently restrictive(boolean z) {
        this.f36948monoploid = z ? 1 : 0;
        return this;
    }

    public competently rotuma(String str) {
        this.f36937attabal = str;
        return this;
    }

    public int saneness() {
        if (this.f36946marial) {
            return this.f36953wireman;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public competently sealless(int i) {
        this.f36943impassible = i;
        return this;
    }

    public competently stratoscope(boolean z) {
        this.f36951taiyuan = z ? 1 : 0;
        return this;
    }

    public competently supplicat(Layout.Alignment alignment) {
        this.f36945kowloon = alignment;
        return this;
    }

    public int taiyuan() {
        return this.f36952triweekly;
    }

    public boolean triweekly() {
        return this.f36948monoploid == 1;
    }

    public competently trm(boolean z) {
        this.f36938beachfront = z ? 1 : 0;
        return this;
    }

    public String wireman() {
        return this.f36937attabal;
    }

    public competently yemenite(int i) {
        this.f36952triweekly = i;
        return this;
    }
}
