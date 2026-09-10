package coi;

import czestochowa.triweekly;
import lerp.apical;
import lerp.impassible;

/* JADX INFO: compiled from: StopLogic.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness extends triweekly {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public lerp.triweekly f15777attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public impassible f15778dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public apical f15779saneness;

    public saneness() {
        lerp.triweekly triweeklyVar = new lerp.triweekly();
        this.f15777attabal = triweeklyVar;
        this.f15778dern = triweeklyVar;
    }

    @Override // czestochowa.triweekly
    public float attabal() {
        return this.f15778dern.attabal();
    }

    public boolean dern() {
        return this.f15778dern.saneness();
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.f15778dern.getInterpolation(f);
    }

    public void saneness(float f, float f2, float f3, float f4, float f5, float f6) {
        lerp.triweekly triweeklyVar = this.f15777attabal;
        this.f15778dern = triweeklyVar;
        triweeklyVar.wireman(f, f2, f3, f4, f5, f6);
    }

    public void wireman(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.f15779saneness == null) {
            this.f15779saneness = new apical();
        }
        apical apicalVar = this.f15779saneness;
        this.f15778dern = apicalVar;
        apicalVar.wireman(f, f2, f3, f4, f5, f6, f7, i);
    }
}
