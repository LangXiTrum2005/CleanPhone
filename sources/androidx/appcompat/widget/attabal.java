package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.lotta;
import androidx.core.view.premeiotic;
import androidx.core.view.sayid;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: AbsActionBarView.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class attabal extends ViewGroup {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f5401adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Context f5402arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f5403dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public lotta f5404graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final C0032attabal f5405kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f5406molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public ActionMenuView f5407monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ActionMenuPresenter f5408polloi;

    /* JADX INFO: renamed from: androidx.appcompat.widget.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    public class C0032attabal implements sayid {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f5409attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f5411saneness;

        public C0032attabal() {
        }

        @Override // androidx.core.view.sayid
        public void attabal(View view) {
            this.f5409attabal = true;
        }

        @Override // androidx.core.view.sayid
        public void dern(View view) {
            attabal.super.setVisibility(0);
            this.f5409attabal = false;
        }

        @Override // androidx.core.view.sayid
        public void saneness(View view) {
            if (this.f5409attabal) {
                return;
            }
            attabal attabalVar = attabal.this;
            attabalVar.f5404graveside = null;
            attabal.super.setVisibility(this.f5411saneness);
        }

        public C0032attabal wireman(lotta lottaVar, int i) {
            attabal.this.f5404graveside = lottaVar;
            this.f5411saneness = i;
            return this;
        }
    }

    public attabal(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int wireman(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public lotta beachfront(int i, long j) {
        lotta lottaVar = this.f5404graveside;
        if (lottaVar != null) {
            lottaVar.dern();
        }
        if (i != 0) {
            lotta lottaVarSaneness = premeiotic.marial(this).saneness(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            lottaVarSaneness.competently(j);
            lottaVarSaneness.taiyuan(this.f5405kowloon.wireman(lottaVarSaneness, i));
            return lottaVarSaneness;
        }
        if (getVisibility() != 0) {
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        lotta lottaVarSaneness2 = premeiotic.marial(this).saneness(1.0f);
        lottaVarSaneness2.competently(j);
        lottaVarSaneness2.taiyuan(this.f5405kowloon.wireman(lottaVarSaneness2, i));
        return lottaVarSaneness2;
    }

    public int dern(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int getAnimatedVisibility() {
        return this.f5404graveside != null ? this.f5405kowloon.f5411saneness : getVisibility();
    }

    public int getContentHeight() {
        return this.f5406molybdenite;
    }

    public int marial(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, beachfront.cutely.ActionBar, beachfront.attabal.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(beachfront.cutely.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f5408polloi;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.preprohormone(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5403dovishness = false;
        }
        if (!this.f5403dovishness) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5403dovishness = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5403dovishness = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5401adultoid = false;
        }
        if (!this.f5401adultoid) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5401adultoid = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5401adultoid = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f5406molybdenite = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            lotta lottaVar = this.f5404graveside;
            if (lottaVar != null) {
                lottaVar.dern();
            }
            super.setVisibility(i);
        }
    }

    public attabal(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5405kowloon = new C0032attabal();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(beachfront.attabal.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f5402arytenoidectomy = context;
        } else {
            this.f5402arytenoidectomy = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
