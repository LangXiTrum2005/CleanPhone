package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.core.view.empress;
import androidx.core.view.lotta;
import androidx.core.view.premeiotic;
import com.google.android.material.card.MaterialCardView;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class grimness implements adultoid {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public CharSequence f5457apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f5458arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public Toolbar f5459attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public Drawable f5460beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Drawable f5461competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public CharSequence f5462cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public View f5463dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public Window.Callback f5464formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public boolean f5465impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f5466impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f5467kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Drawable f5468marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public Drawable f5469monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f5470saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public CharSequence f5471taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public ActionMenuPresenter f5472triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public View f5473wireman;

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    public class attabal implements View.OnClickListener {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final androidx.appcompat.view.menu.attabal f5475kowloon;

        public attabal() {
            this.f5475kowloon = new androidx.appcompat.view.menu.attabal(grimness.this.f5459attabal.getContext(), 0, R.id.home, 0, 0, grimness.this.f5471taiyuan);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            grimness grimnessVar = grimness.this;
            Window.Callback callback = grimnessVar.f5464formularize;
            if (callback == null || !grimnessVar.f5465impassible) {
                return;
            }
            callback.onMenuItemSelected(0, this.f5475kowloon);
        }
    }

    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    public class saneness extends empress {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f5476attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ int f5478saneness;

        public saneness(int i) {
            this.f5478saneness = i;
        }

        @Override // androidx.core.view.empress, androidx.core.view.sayid
        public void attabal(View view) {
            this.f5476attabal = true;
        }

        @Override // androidx.core.view.empress, androidx.core.view.sayid
        public void dern(View view) {
            grimness.this.f5459attabal.setVisibility(0);
        }

        @Override // androidx.core.view.sayid
        public void saneness(View view) {
            if (this.f5476attabal) {
                return;
            }
            grimness.this.f5459attabal.setVisibility(this.f5478saneness);
        }
    }

    public grimness(Toolbar toolbar, boolean z) {
        this(toolbar, z, beachfront.impromptu.abc_action_bar_up_description, beachfront.marial.abc_ic_ab_back_material);
    }

    public void adultoid(Drawable drawable) {
        this.f5460beachfront = drawable;
        oilcan();
    }

    @Override // androidx.appcompat.widget.adultoid
    public int arytenoidectomy() {
        return this.f5470saneness;
    }

    @Override // androidx.appcompat.widget.adultoid
    public boolean attabal() {
        return this.f5459attabal.wireman();
    }

    @Override // androidx.appcompat.widget.adultoid
    public boolean beachfront() {
        return this.f5459attabal.dovishness();
    }

    @Override // androidx.appcompat.widget.adultoid
    public void collapseActionView() {
        this.f5459attabal.marial();
    }

    @Override // androidx.appcompat.widget.adultoid
    public void competently(int i) {
        View view;
        int i2 = this.f5470saneness ^ i;
        this.f5470saneness = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    stratoscope();
                }
                trm();
            }
            if ((i2 & 3) != 0) {
                oilcan();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f5459attabal.setTitle(this.f5471taiyuan);
                    this.f5459attabal.setSubtitle(this.f5462cutely);
                } else {
                    this.f5459attabal.setTitle((CharSequence) null);
                    this.f5459attabal.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f5473wireman) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f5459attabal.addView(view);
            } else {
                this.f5459attabal.removeView(view);
            }
        }
    }

    public void cord(CharSequence charSequence) {
        this.f5466impromptu = true;
        cuirassed(charSequence);
    }

    public final void cuirassed(CharSequence charSequence) {
        this.f5471taiyuan = charSequence;
        if ((this.f5470saneness & 8) != 0) {
            this.f5459attabal.setTitle(charSequence);
            if (this.f5466impromptu) {
                premeiotic.coi(this.f5459attabal.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.adultoid
    public boolean dern() {
        return this.f5459attabal.seminary();
    }

    public void dovishness(int i) {
        gintrap(i == 0 ? null : getContext().getString(i));
    }

    @Override // androidx.appcompat.widget.adultoid
    public void formularize(boolean z) {
        this.f5459attabal.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.adultoid
    public Context getContext() {
        return this.f5459attabal.getContext();
    }

    @Override // androidx.appcompat.widget.adultoid
    public CharSequence getTitle() {
        return this.f5459attabal.getTitle();
    }

    public void gintrap(CharSequence charSequence) {
        this.f5457apical = charSequence;
        stratoscope();
    }

    public void graveside(int i) {
        if (i == this.f5458arytenoidectomy) {
            return;
        }
        this.f5458arytenoidectomy = i;
        if (TextUtils.isEmpty(this.f5459attabal.getNavigationContentDescription())) {
            dovishness(this.f5458arytenoidectomy);
        }
    }

    @Override // androidx.appcompat.widget.adultoid
    public void impassible() {
        this.f5459attabal.beachfront();
    }

    @Override // androidx.appcompat.widget.adultoid
    public int impromptu() {
        return this.f5467kowloon;
    }

    @Override // androidx.appcompat.widget.adultoid
    public void kowloon(int i) {
        adultoid(i != 0 ? competently.attabal.saneness(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.adultoid
    public boolean marial() {
        return this.f5459attabal.cuirassed();
    }

    public void molybdenite(View view) {
        View view2 = this.f5473wireman;
        if (view2 != null && (this.f5470saneness & 16) != 0) {
            this.f5459attabal.removeView(view2);
        }
        this.f5473wireman = view;
        if (view == null || (this.f5470saneness & 16) == 0) {
            return;
        }
        this.f5459attabal.addView(view);
    }

    public final void oilcan() {
        Drawable drawable;
        int i = this.f5470saneness;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f5460beachfront) == null) {
            drawable = this.f5468marial;
        }
        this.f5459attabal.setLogo(drawable);
    }

    public final int polloi() {
        if (this.f5459attabal.getNavigationIcon() == null) {
            return 11;
        }
        this.f5469monoploid = this.f5459attabal.getNavigationIcon();
        return 15;
    }

    public void preprohormone(CharSequence charSequence) {
        this.f5462cutely = charSequence;
        if ((this.f5470saneness & 8) != 0) {
            this.f5459attabal.setSubtitle(charSequence);
        }
    }

    public void rotuma(Drawable drawable) {
        this.f5461competently = drawable;
        trm();
    }

    @Override // androidx.appcompat.widget.adultoid
    public boolean saneness() {
        return this.f5459attabal.gintrap();
    }

    @Override // androidx.appcompat.widget.adultoid
    public void setIcon(int i) {
        setIcon(i != 0 ? competently.attabal.saneness(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.adultoid
    public void setMenu(Menu menu, androidx.appcompat.view.menu.apical.attabal attabalVar) {
        if (this.f5472triweekly == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f5459attabal.getContext());
            this.f5472triweekly = actionMenuPresenter;
            actionMenuPresenter.taiyuan(beachfront.beachfront.action_menu_presenter);
        }
        this.f5472triweekly.setCallback(attabalVar);
        this.f5459attabal.setMenu((androidx.appcompat.view.menu.marial) menu, this.f5472triweekly);
    }

    @Override // androidx.appcompat.widget.adultoid
    public void setMenuPrepared() {
        this.f5465impassible = true;
    }

    @Override // androidx.appcompat.widget.adultoid
    public void setVisibility(int i) {
        this.f5459attabal.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.adultoid
    public void setWindowCallback(Window.Callback callback) {
        this.f5464formularize = callback;
    }

    @Override // androidx.appcompat.widget.adultoid
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f5466impromptu) {
            return;
        }
        cuirassed(charSequence);
    }

    public final void stratoscope() {
        if ((this.f5470saneness & 4) != 0) {
            if (TextUtils.isEmpty(this.f5457apical)) {
                this.f5459attabal.setNavigationContentDescription(this.f5458arytenoidectomy);
            } else {
                this.f5459attabal.setNavigationContentDescription(this.f5457apical);
            }
        }
    }

    @Override // androidx.appcompat.widget.adultoid
    public lotta taiyuan(int i, long j) {
        return premeiotic.marial(this.f5459attabal).saneness(i == 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).competently(j).taiyuan(new saneness(i));
    }

    @Override // androidx.appcompat.widget.adultoid
    public void triweekly(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f5463dern;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f5459attabal;
            if (parent == toolbar) {
                toolbar.removeView(this.f5463dern);
            }
        }
        this.f5463dern = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f5467kowloon != 2) {
            return;
        }
        this.f5459attabal.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f5463dern.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.f4538attabal = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    public final void trm() {
        if ((this.f5470saneness & 4) == 0) {
            this.f5459attabal.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f5459attabal;
        Drawable drawable = this.f5461competently;
        if (drawable == null) {
            drawable = this.f5469monoploid;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.adultoid
    public boolean wireman() {
        return this.f5459attabal.stratoscope();
    }

    public grimness(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f5467kowloon = 0;
        this.f5458arytenoidectomy = 0;
        this.f5459attabal = toolbar;
        this.f5471taiyuan = toolbar.getTitle();
        this.f5462cutely = toolbar.getSubtitle();
        this.f5466impromptu = this.f5471taiyuan != null;
        this.f5461competently = toolbar.getNavigationIcon();
        restrictive restrictiveVarDovishness = restrictive.dovishness(toolbar.getContext(), null, beachfront.cutely.ActionBar, beachfront.attabal.actionBarStyle, 0);
        this.f5469monoploid = restrictiveVarDovishness.competently(beachfront.cutely.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceArytenoidectomy = restrictiveVarDovishness.arytenoidectomy(beachfront.cutely.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceArytenoidectomy)) {
                cord(charSequenceArytenoidectomy);
            }
            CharSequence charSequenceArytenoidectomy2 = restrictiveVarDovishness.arytenoidectomy(beachfront.cutely.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceArytenoidectomy2)) {
                preprohormone(charSequenceArytenoidectomy2);
            }
            Drawable drawableCompetently = restrictiveVarDovishness.competently(beachfront.cutely.ActionBar_logo);
            if (drawableCompetently != null) {
                adultoid(drawableCompetently);
            }
            Drawable drawableCompetently2 = restrictiveVarDovishness.competently(beachfront.cutely.ActionBar_icon);
            if (drawableCompetently2 != null) {
                setIcon(drawableCompetently2);
            }
            if (this.f5461competently == null && (drawable = this.f5469monoploid) != null) {
                rotuma(drawable);
            }
            competently(restrictiveVarDovishness.apical(beachfront.cutely.ActionBar_displayOptions, 0));
            int iTriweekly = restrictiveVarDovishness.triweekly(beachfront.cutely.ActionBar_customNavigationLayout, 0);
            if (iTriweekly != 0) {
                molybdenite(LayoutInflater.from(this.f5459attabal.getContext()).inflate(iTriweekly, (ViewGroup) this.f5459attabal, false));
                competently(this.f5470saneness | 16);
            }
            int iImpassible = restrictiveVarDovishness.impassible(beachfront.cutely.ActionBar_height, 0);
            if (iImpassible > 0) {
                ViewGroup.LayoutParams layoutParams = this.f5459attabal.getLayoutParams();
                layoutParams.height = iImpassible;
                this.f5459attabal.setLayoutParams(layoutParams);
            }
            int iMarial = restrictiveVarDovishness.marial(beachfront.cutely.ActionBar_contentInsetStart, -1);
            int iMarial2 = restrictiveVarDovishness.marial(beachfront.cutely.ActionBar_contentInsetEnd, -1);
            if (iMarial >= 0 || iMarial2 >= 0) {
                this.f5459attabal.setContentInsetsRelative(Math.max(iMarial, 0), Math.max(iMarial2, 0));
            }
            int iTriweekly2 = restrictiveVarDovishness.triweekly(beachfront.cutely.ActionBar_titleTextStyle, 0);
            if (iTriweekly2 != 0) {
                Toolbar toolbar2 = this.f5459attabal;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iTriweekly2);
            }
            int iTriweekly3 = restrictiveVarDovishness.triweekly(beachfront.cutely.ActionBar_subtitleTextStyle, 0);
            if (iTriweekly3 != 0) {
                Toolbar toolbar3 = this.f5459attabal;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iTriweekly3);
            }
            int iTriweekly4 = restrictiveVarDovishness.triweekly(beachfront.cutely.ActionBar_popupTheme, 0);
            if (iTriweekly4 != 0) {
                this.f5459attabal.setPopupTheme(iTriweekly4);
            }
        } else {
            this.f5470saneness = polloi();
        }
        restrictiveVarDovishness.rotuma();
        graveside(i);
        this.f5457apical = this.f5459attabal.getNavigationContentDescription();
        this.f5459attabal.setNavigationOnClickListener(new attabal());
    }

    @Override // androidx.appcompat.widget.adultoid
    public void setIcon(Drawable drawable) {
        this.f5468marial = drawable;
        oilcan();
    }

    @Override // androidx.appcompat.widget.adultoid
    public void apical() {
    }

    @Override // androidx.appcompat.widget.adultoid
    public void monoploid() {
    }

    @Override // androidx.appcompat.widget.adultoid
    public void cutely(boolean z) {
    }
}
