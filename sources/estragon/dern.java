package estragon;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f25956beachfront;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f25962impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public float f25963kowloon;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public String f25955attabal = "";

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f25966saneness = "";

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Set<String> f25959dern = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String f25969wireman = "";

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public String f25964marial = null;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f25957competently = false;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f25967taiyuan = false;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f25958cutely = -1;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f25953apical = -1;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f25960formularize = -1;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public int f25961impassible = -1;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f25968triweekly = -1;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f25954arytenoidectomy = -1;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f25965monoploid = false;

    public static int stratoscope(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public dern adultoid(boolean z) {
        this.f25961impassible = z ? 1 : 0;
        return this;
    }

    public boolean apical() {
        return this.f25957competently;
    }

    public dern arytenoidectomy(boolean z) {
        this.f25965monoploid = z;
        return this;
    }

    public int attabal() {
        if (this.f25967taiyuan) {
            return this.f25962impromptu;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public int beachfront() {
        return this.f25968triweekly;
    }

    public int competently() {
        return this.f25954arytenoidectomy;
    }

    public void cord(String str) {
        this.f25969wireman = str;
    }

    public dern cuirassed(boolean z) {
        this.f25953apical = z ? 1 : 0;
        return this;
    }

    public boolean cutely() {
        return this.f25967taiyuan;
    }

    public int dern() {
        if (this.f25957competently) {
            return this.f25956beachfront;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public dern dovishness(int i) {
        this.f25954arytenoidectomy = i;
        return this;
    }

    public boolean formularize() {
        return this.f25958cutely == 1;
    }

    public void gintrap(String[] strArr) {
        this.f25959dern = new HashSet(Arrays.asList(strArr));
    }

    public dern graveside(int i) {
        this.f25968triweekly = i;
        return this;
    }

    public boolean impassible() {
        return this.f25953apical == 1;
    }

    public int impromptu(String str, String str2, Set<String> set, String str3) {
        if (this.f25955attabal.isEmpty() && this.f25966saneness.isEmpty() && this.f25959dern.isEmpty() && this.f25969wireman.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iStratoscope = stratoscope(stratoscope(stratoscope(0, this.f25955attabal, str, 1073741824), this.f25966saneness, str2, 2), this.f25969wireman, str3, 4);
        if (iStratoscope == -1 || !set.containsAll(this.f25959dern)) {
            return 0;
        }
        return iStratoscope + (this.f25959dern.size() * 4);
    }

    public dern kowloon(boolean z) {
        this.f25960formularize = z ? 1 : 0;
        return this;
    }

    public float marial() {
        return this.f25963kowloon;
    }

    public dern molybdenite(float f) {
        this.f25963kowloon = f;
        return this;
    }

    public dern monoploid(int i) {
        this.f25956beachfront = i;
        this.f25957competently = true;
        return this;
    }

    public dern polloi(String str) {
        this.f25964marial = str == null ? null : com.google.common.base.attabal.beachfront(str);
        return this;
    }

    public void preprohormone(String str) {
        this.f25966saneness = str;
    }

    public void rotuma(String str) {
        this.f25955attabal = str;
    }

    public boolean saneness() {
        return this.f25965monoploid;
    }

    public int taiyuan() {
        int i = this.f25960formularize;
        if (i == -1 && this.f25961impassible == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.f25961impassible == 1 ? 2 : 0);
    }

    public dern triweekly(int i) {
        this.f25962impromptu = i;
        this.f25967taiyuan = true;
        return this;
    }

    public String wireman() {
        return this.f25964marial;
    }
}
