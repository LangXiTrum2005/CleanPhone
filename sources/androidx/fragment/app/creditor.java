package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.mathsort;
import androidx.p001lifecycle.splinterproof;
import cig.CreationExtras;

/* JADX INFO: compiled from: FragmentViewLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
public class creditor implements androidx.p001lifecycle.taiyuan, inrooted.taiyuan, splinterproof {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final mathsort f10305arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final Fragment f10307kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final Runnable f10309monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public androidx.lifecycle.peridotite.dern f10310polloi;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public androidx.p001lifecycle.polloi f10308molybdenite = null;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public inrooted.impromptu f10306graveside = null;

    public creditor(Fragment fragment, mathsort mathsortVar, Runnable runnable) {
        this.f10307kowloon = fragment;
        this.f10305arytenoidectomy = mathsortVar;
        this.f10309monoploid = runnable;
    }

    public void attabal(Lifecycle.Event event) {
        this.f10308molybdenite.taiyuan(event);
    }

    public void beachfront(Lifecycle.State state) {
        this.f10308molybdenite.triweekly(state);
    }

    public boolean dern() {
        return this.f10308molybdenite != null;
    }

    @Override // androidx.p001lifecycle.taiyuan
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f10307kowloon.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        cig.saneness sanenessVar = new cig.saneness();
        if (application != null) {
            sanenessVar.dern(androidx.lifecycle.peridotite.attabal.f10510impromptu, application);
        }
        sanenessVar.dern(androidx.p001lifecycle.restrictive.f10539attabal, this.f10307kowloon);
        sanenessVar.dern(androidx.p001lifecycle.restrictive.f10541saneness, this);
        if (this.f10307kowloon.getArguments() != null) {
            sanenessVar.dern(androidx.p001lifecycle.restrictive.f10540dern, this.f10307kowloon.getArguments());
        }
        return sanenessVar;
    }

    @Override // androidx.p001lifecycle.taiyuan
    public androidx.lifecycle.peridotite.dern getDefaultViewModelProviderFactory() {
        Application application;
        androidx.lifecycle.peridotite.dern defaultViewModelProviderFactory = this.f10307kowloon.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f10307kowloon.mDefaultFactory)) {
            this.f10310polloi = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f10310polloi == null) {
            Context applicationContext = this.f10307kowloon.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f10307kowloon;
            this.f10310polloi = new androidx.p001lifecycle.grimness(application, fragment, fragment.getArguments());
        }
        return this.f10310polloi;
    }

    @Override // androidx.p001lifecycle.arytenoidectomy
    public Lifecycle getLifecycle() {
        saneness();
        return this.f10308molybdenite;
    }

    @Override // inrooted.taiyuan
    public inrooted.beachfront getSavedStateRegistry() {
        saneness();
        return this.f10306graveside.getSavedStateRegistry();
    }

    @Override // androidx.p001lifecycle.splinterproof
    public mathsort getViewModelStore() {
        saneness();
        return this.f10305arytenoidectomy;
    }

    public void marial(Bundle bundle) {
        this.f10306graveside.marial(bundle);
    }

    public void saneness() {
        if (this.f10308molybdenite == null) {
            this.f10308molybdenite = new androidx.p001lifecycle.polloi(this);
            inrooted.impromptu impromptuVarAttabal = inrooted.impromptu.attabal(this);
            this.f10306graveside = impromptuVarAttabal;
            impromptuVarAttabal.dern();
            this.f10309monoploid.run();
        }
    }

    public void wireman(Bundle bundle) {
        this.f10306graveside.wireman(bundle);
    }
}
