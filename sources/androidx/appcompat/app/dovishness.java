package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.coi;
import androidx.core.view.empress;
import androidx.core.view.lotta;
import androidx.core.view.premeiotic;
import androidx.core.view.sayid;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: WindowDecorActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public class dovishness extends ActionBar implements ActionBarOverlayLayout.wireman {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f4768adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f4770arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Context f4771attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public androidx.appcompat.widget.adultoid f4772beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public ActionBarContextView f4773competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public boolean f4774cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f4775cuirassed;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public Activity f4777dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f4778dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f4779formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f4780gintrap;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public wireman f4782impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public View f4783impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public apical.saneness.attabal f4784kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public ActionBarContainer f4785marial;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f4789polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public apical.impromptu f4790preprohormone;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public Context f4792saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public ScrollingTabContainerView f4794taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public apical.saneness f4795triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public ActionBarOverlayLayout f4797wireman;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final Interpolator f4767yemenite = new AccelerateInterpolator();

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final Interpolator f4766sealless = new DecelerateInterpolator();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public ArrayList<Object> f4776cutely = new ArrayList<>();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f4769apical = -1;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public ArrayList<ActionBar.attabal> f4787monoploid = new ArrayList<>();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f4786molybdenite = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f4781graveside = true;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f4791rotuma = true;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final sayid f4793stratoscope = new attabal();

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final sayid f4796trm = new saneness();

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public final coi f4788oilcan = new dern();

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class attabal extends empress {
        public attabal() {
        }

        @Override // androidx.core.view.sayid
        public void saneness(View view) {
            View view2;
            dovishness dovishnessVar = dovishness.this;
            if (dovishnessVar.f4781graveside && (view2 = dovishnessVar.f4783impromptu) != null) {
                view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                dovishness.this.f4785marial.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            dovishness.this.f4785marial.setVisibility(8);
            dovishness.this.f4785marial.setTransitioning(false);
            dovishness dovishnessVar2 = dovishness.this;
            dovishnessVar2.f4790preprohormone = null;
            dovishnessVar2.gintrap();
            ActionBarOverlayLayout actionBarOverlayLayout = dovishness.this.f4797wireman;
            if (actionBarOverlayLayout != null) {
                premeiotic.lerp(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class dern implements coi {
        public dern() {
        }

        @Override // androidx.core.view.coi
        public void attabal(View view) {
            ((View) dovishness.this.f4785marial.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class saneness extends empress {
        public saneness() {
        }

        @Override // androidx.core.view.sayid
        public void saneness(View view) {
            dovishness dovishnessVar = dovishness.this;
            dovishnessVar.f4790preprohormone = null;
            dovishnessVar.f4785marial.requestLayout();
        }
    }

    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class wireman extends apical.saneness implements androidx.appcompat.view.menu.marial.attabal {

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public WeakReference<View> f4802graveside;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public apical.saneness.attabal f4803molybdenite;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final Context f4804monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final androidx.appcompat.view.menu.marial f4805polloi;

        public wireman(Context context, apical.saneness.attabal attabalVar) {
            this.f4804monoploid = context;
            this.f4803molybdenite = attabalVar;
            androidx.appcompat.view.menu.marial marialVarClubfoot = new androidx.appcompat.view.menu.marial(context).clubfoot(1);
            this.f4805polloi = marialVarClubfoot;
            marialVarClubfoot.overspeculate(this);
        }

        @Override // apical.saneness
        public void apical() {
            if (dovishness.this.f4782impassible != this) {
                return;
            }
            this.f4805polloi.nosophobia();
            try {
                this.f4803molybdenite.saneness(this, this.f4805polloi);
            } finally {
                this.f4805polloi.lerp();
            }
        }

        @Override // androidx.appcompat.view.menu.marial.attabal
        public boolean attabal(androidx.appcompat.view.menu.marial marialVar, MenuItem menuItem) {
            apical.saneness.attabal attabalVar = this.f4803molybdenite;
            if (attabalVar != null) {
                return attabalVar.attabal(this, menuItem);
            }
            return false;
        }

        @Override // apical.saneness
        public MenuInflater beachfront() {
            return new apical.competently(this.f4804monoploid);
        }

        @Override // apical.saneness
        public CharSequence competently() {
            return dovishness.this.f4773competently.getSubtitle();
        }

        @Override // apical.saneness
        public void dern() {
            dovishness dovishnessVar = dovishness.this;
            if (dovishnessVar.f4782impassible != this) {
                return;
            }
            if (dovishness.dovishness(dovishnessVar.f4768adultoid, dovishnessVar.f4778dovishness, false)) {
                this.f4803molybdenite.wireman(this);
            } else {
                dovishness dovishnessVar2 = dovishness.this;
                dovishnessVar2.f4795triweekly = this;
                dovishnessVar2.f4784kowloon = this.f4803molybdenite;
            }
            this.f4803molybdenite = null;
            dovishness.this.adultoid(false);
            dovishness.this.f4773competently.competently();
            dovishness dovishnessVar3 = dovishness.this;
            dovishnessVar3.f4797wireman.setHideOnContentScrollEnabled(dovishnessVar3.f4775cuirassed);
            dovishness.this.f4782impassible = null;
        }

        @Override // apical.saneness
        public boolean formularize() {
            return dovishness.this.f4773competently.cutely();
        }

        public boolean graveside() {
            this.f4805polloi.nosophobia();
            try {
                return this.f4803molybdenite.dern(this, this.f4805polloi);
            } finally {
                this.f4805polloi.lerp();
            }
        }

        @Override // apical.saneness
        public void impassible(View view) {
            dovishness.this.f4773competently.setCustomView(view);
            this.f4802graveside = new WeakReference<>(view);
        }

        @Override // apical.saneness
        public void kowloon(CharSequence charSequence) {
            dovishness.this.f4773competently.setSubtitle(charSequence);
        }

        @Override // apical.saneness
        public Menu marial() {
            return this.f4805polloi;
        }

        @Override // apical.saneness
        public void molybdenite(boolean z) {
            super.molybdenite(z);
            dovishness.this.f4773competently.setTitleOptional(z);
        }

        @Override // apical.saneness
        public void monoploid(int i) {
            polloi(dovishness.this.f4771attabal.getResources().getString(i));
        }

        @Override // apical.saneness
        public void polloi(CharSequence charSequence) {
            dovishness.this.f4773competently.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.menu.marial.attabal
        public void saneness(androidx.appcompat.view.menu.marial marialVar) {
            if (this.f4803molybdenite == null) {
                return;
            }
            apical();
            dovishness.this.f4773competently.formularize();
        }

        @Override // apical.saneness
        public CharSequence taiyuan() {
            return dovishness.this.f4773competently.getTitle();
        }

        @Override // apical.saneness
        public void triweekly(int i) {
            kowloon(dovishness.this.f4771attabal.getResources().getString(i));
        }

        @Override // apical.saneness
        public View wireman() {
            WeakReference<View> weakReference = this.f4802graveside;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }
    }

    public dovishness(Activity activity, boolean z) {
        this.f4777dern = activity;
        View decorView = activity.getWindow().getDecorView();
        trm(decorView);
        if (z) {
            return;
        }
        this.f4783impromptu = decorView.findViewById(R.id.content);
    }

    public static boolean dovishness(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public void adultoid(boolean z) {
        lotta lottaVarTaiyuan;
        lotta lottaVarBeachfront;
        if (z) {
            polder();
        } else {
            stratoscope();
        }
        if (!merc()) {
            if (z) {
                this.f4772beachfront.setVisibility(4);
                this.f4773competently.setVisibility(0);
                return;
            } else {
                this.f4772beachfront.setVisibility(0);
                this.f4773competently.setVisibility(8);
                return;
            }
        }
        if (z) {
            lottaVarBeachfront = this.f4772beachfront.taiyuan(4, 100L);
            lottaVarTaiyuan = this.f4773competently.beachfront(0, 200L);
        } else {
            lottaVarTaiyuan = this.f4772beachfront.taiyuan(0, 200L);
            lottaVarBeachfront = this.f4773competently.beachfront(8, 100L);
        }
        apical.impromptu impromptuVar = new apical.impromptu();
        impromptuVar.wireman(lottaVarBeachfront, lottaVarTaiyuan);
        impromptuVar.impromptu();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wireman
    public void attabal() {
        if (this.f4778dovishness) {
            this.f4778dovishness = false;
            seminary(true);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean competently() {
        androidx.appcompat.widget.adultoid adultoidVar = this.f4772beachfront;
        if (adultoidVar == null || !adultoidVar.beachfront()) {
            return false;
        }
        this.f4772beachfront.collapseActionView();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.appcompat.widget.adultoid cord(View view) {
        if (view instanceof androidx.appcompat.widget.adultoid) {
            return (androidx.appcompat.widget.adultoid) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int cuirassed() {
        return this.f4772beachfront.impromptu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public Context cutely() {
        if (this.f4792saneness == null) {
            TypedValue typedValue = new TypedValue();
            this.f4771attabal.getTheme().resolveAttribute(beachfront.attabal.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f4792saneness = new ContextThemeWrapper(this.f4771attabal, i);
            } else {
                this.f4792saneness = this.f4771attabal;
            }
        }
        return this.f4792saneness;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wireman
    public void dern(boolean z) {
        this.f4781graveside = z;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void formularize(Configuration configuration) {
        kattegat(apical.attabal.saneness(this.f4771attabal).competently());
    }

    public void gintrap() {
        apical.saneness.attabal attabalVar = this.f4784kowloon;
        if (attabalVar != null) {
            attabalVar.wireman(this.f4795triweekly);
            this.f4795triweekly = null;
            this.f4784kowloon = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public apical.saneness graveside(apical.saneness.attabal attabalVar) {
        wireman wiremanVar = this.f4782impassible;
        if (wiremanVar != null) {
            wiremanVar.dern();
        }
        this.f4797wireman.setHideOnContentScrollEnabled(false);
        this.f4773competently.apical();
        wireman wiremanVar2 = new wireman(this.f4773competently.getContext(), attabalVar);
        if (!wiremanVar2.graveside()) {
            return null;
        }
        this.f4782impassible = wiremanVar2;
        wiremanVar2.apical();
        this.f4773competently.impromptu(wiremanVar2);
        adultoid(true);
        return wiremanVar2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public void impromptu(boolean z) {
        if (z == this.f4770arytenoidectomy) {
            return;
        }
        this.f4770arytenoidectomy = z;
        int size = this.f4787monoploid.size();
        for (int i = 0; i < size; i++) {
            this.f4787monoploid.get(i).onMenuVisibilityChanged(z);
        }
    }

    public final void kattegat(boolean z) {
        this.f4789polloi = z;
        if (z) {
            this.f4785marial.setTabContainer(null);
            this.f4772beachfront.triweekly(this.f4794taiyuan);
        } else {
            this.f4772beachfront.triweekly(null);
            this.f4785marial.setTabContainer(this.f4794taiyuan);
        }
        boolean z2 = cuirassed() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f4794taiyuan;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4797wireman;
                if (actionBarOverlayLayout != null) {
                    premeiotic.lerp(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f4772beachfront.formularize(!this.f4789polloi && z2);
        this.f4797wireman.setHasNonEmbeddedTabs(!this.f4789polloi && z2);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wireman
    public void marial() {
        apical.impromptu impromptuVar = this.f4790preprohormone;
        if (impromptuVar != null) {
            impromptuVar.attabal();
            this.f4790preprohormone = null;
        }
    }

    public final boolean merc() {
        return this.f4785marial.isLaidOut();
    }

    @Override // androidx.appcompat.app.ActionBar
    public void molybdenite(CharSequence charSequence) {
        this.f4772beachfront.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void monoploid(boolean z) {
        if (this.f4779formularize) {
            return;
        }
        oilcan(z);
    }

    public void oilcan(boolean z) {
        yemenite(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wireman
    public void onWindowVisibilityChanged(int i) {
        this.f4786molybdenite = i;
    }

    public final void polder() {
        if (this.f4780gintrap) {
            return;
        }
        this.f4780gintrap = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4797wireman;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        seminary(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public void polloi(boolean z) {
        apical.impromptu impromptuVar;
        this.f4774cord = z;
        if (z || (impromptuVar = this.f4790preprohormone) == null) {
            return;
        }
        impromptuVar.attabal();
    }

    public void preprohormone(boolean z) {
        View view;
        View view2;
        apical.impromptu impromptuVar = this.f4790preprohormone;
        if (impromptuVar != null) {
            impromptuVar.attabal();
        }
        this.f4785marial.setVisibility(0);
        if (this.f4786molybdenite == 0 && (this.f4774cord || z)) {
            this.f4785marial.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f = -this.f4785marial.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.f4785marial.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.f4785marial.setTranslationY(f);
            apical.impromptu impromptuVar2 = new apical.impromptu();
            lotta lottaVarTriweekly = premeiotic.marial(this.f4785marial).triweekly(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            lottaVarTriweekly.formularize(this.f4788oilcan);
            impromptuVar2.dern(lottaVarTriweekly);
            if (this.f4781graveside && (view2 = this.f4783impromptu) != null) {
                view2.setTranslationY(f);
                impromptuVar2.dern(premeiotic.marial(this.f4783impromptu).triweekly(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
            impromptuVar2.beachfront(f4766sealless);
            impromptuVar2.marial(250L);
            impromptuVar2.competently(this.f4796trm);
            this.f4790preprohormone = impromptuVar2;
            impromptuVar2.impromptu();
        } else {
            this.f4785marial.setAlpha(1.0f);
            this.f4785marial.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.f4781graveside && (view = this.f4783impromptu) != null) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            this.f4796trm.saneness(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4797wireman;
        if (actionBarOverlayLayout != null) {
            premeiotic.lerp(actionBarOverlayLayout);
        }
    }

    public void restrictive(boolean z) {
        this.f4772beachfront.cutely(z);
    }

    public void rotuma(boolean z) {
        View view;
        apical.impromptu impromptuVar = this.f4790preprohormone;
        if (impromptuVar != null) {
            impromptuVar.attabal();
        }
        if (this.f4786molybdenite != 0 || (!this.f4774cord && !z)) {
            this.f4793stratoscope.saneness(null);
            return;
        }
        this.f4785marial.setAlpha(1.0f);
        this.f4785marial.setTransitioning(true);
        apical.impromptu impromptuVar2 = new apical.impromptu();
        float f = -this.f4785marial.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.f4785marial.getLocationInWindow(iArr);
            f -= iArr[1];
        }
        lotta lottaVarTriweekly = premeiotic.marial(this.f4785marial).triweekly(f);
        lottaVarTriweekly.formularize(this.f4788oilcan);
        impromptuVar2.dern(lottaVarTriweekly);
        if (this.f4781graveside && (view = this.f4783impromptu) != null) {
            impromptuVar2.dern(premeiotic.marial(view).triweekly(f));
        }
        impromptuVar2.beachfront(f4767yemenite);
        impromptuVar2.marial(250L);
        impromptuVar2.competently(this.f4793stratoscope);
        this.f4790preprohormone = impromptuVar2;
        impromptuVar2.impromptu();
    }

    public void sealless(float f) {
        premeiotic.preterite(this.f4785marial, f);
    }

    public final void seminary(boolean z) {
        if (dovishness(this.f4768adultoid, this.f4778dovishness, this.f4780gintrap)) {
            if (this.f4791rotuma) {
                return;
            }
            this.f4791rotuma = true;
            preprohormone(z);
            return;
        }
        if (this.f4791rotuma) {
            this.f4791rotuma = false;
            rotuma(z);
        }
    }

    public final void stratoscope() {
        if (this.f4780gintrap) {
            this.f4780gintrap = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f4797wireman;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            seminary(false);
        }
    }

    public void supplicat(boolean z) {
        if (z && !this.f4797wireman.arytenoidectomy()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f4775cuirassed = z;
        this.f4797wireman.setHideOnContentScrollEnabled(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public int taiyuan() {
        return this.f4772beachfront.arytenoidectomy();
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean triweekly(int i, KeyEvent keyEvent) {
        Menu menuMarial;
        wireman wiremanVar = this.f4782impassible;
        if (wiremanVar == null || (menuMarial = wiremanVar.marial()) == null) {
            return false;
        }
        menuMarial.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMarial.performShortcut(i, keyEvent, 0);
    }

    public final void trm(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(beachfront.beachfront.decor_content_parent);
        this.f4797wireman = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f4772beachfront = cord(view.findViewById(beachfront.beachfront.action_bar));
        this.f4773competently = (ActionBarContextView) view.findViewById(beachfront.beachfront.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(beachfront.beachfront.action_bar_container);
        this.f4785marial = actionBarContainer;
        androidx.appcompat.widget.adultoid adultoidVar = this.f4772beachfront;
        if (adultoidVar == null || this.f4773competently == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f4771attabal = adultoidVar.getContext();
        boolean z = (this.f4772beachfront.arytenoidectomy() & 4) != 0;
        if (z) {
            this.f4779formularize = true;
        }
        apical.attabal attabalVarSaneness = apical.attabal.saneness(this.f4771attabal);
        restrictive(attabalVarSaneness.attabal() || z);
        kattegat(attabalVarSaneness.competently());
        TypedArray typedArrayObtainStyledAttributes = this.f4771attabal.obtainStyledAttributes(null, beachfront.cutely.ActionBar, beachfront.attabal.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(beachfront.cutely.ActionBar_hideOnContentScroll, false)) {
            supplicat(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(beachfront.cutely.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            sealless(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wireman
    public void wireman() {
        if (this.f4778dovishness) {
            return;
        }
        this.f4778dovishness = true;
        seminary(true);
    }

    public void yemenite(int i, int i2) {
        int iArytenoidectomy = this.f4772beachfront.arytenoidectomy();
        if ((i2 & 4) != 0) {
            this.f4779formularize = true;
        }
        this.f4772beachfront.competently((i & i2) | ((~i2) & iArytenoidectomy));
    }

    public dovishness(Dialog dialog) {
        trm(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.wireman
    public void saneness() {
    }
}
