package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: LayoutState.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f13386attabal = true;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f13387beachfront = 0;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f13388competently = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f13389dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f13390impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f13391marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f13392saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f13393taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f13394wireman;

    public boolean attabal(RecyclerView.rotuma rotumaVar) {
        int i = this.f13389dern;
        return i >= 0 && i < rotumaVar.saneness();
    }

    public View saneness(RecyclerView.graveside gravesideVar) {
        View viewKowloon = gravesideVar.kowloon(this.f13389dern);
        this.f13389dern += this.f13394wireman;
        return viewKowloon;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f13392saneness + ", mCurrentPosition=" + this.f13389dern + ", mItemDirection=" + this.f13394wireman + ", mLayoutDirection=" + this.f13391marial + ", mStartLine=" + this.f13387beachfront + ", mEndLine=" + this.f13388competently + '}';
    }
}
