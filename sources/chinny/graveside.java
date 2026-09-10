package chinny;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ShapeableDelegateV22.java */
/* JADX INFO: loaded from: classes3.dex */
public class graveside extends molybdenite {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f15483beachfront = false;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f15484competently = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: compiled from: ShapeableDelegateV22.java */
    public class attabal extends ViewOutlineProvider {
        public attabal() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            graveside gravesideVar = graveside.this;
            if (gravesideVar.f15514dern == null || gravesideVar.f15517wireman.isEmpty()) {
                return;
            }
            graveside gravesideVar2 = graveside.this;
            RectF rectF = gravesideVar2.f15517wireman;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, gravesideVar2.f15484competently);
        }
    }

    public graveside(View view) {
        triweekly(view);
    }

    public static boolean monoploid(kowloon kowloonVar) {
        return (kowloonVar.monoploid() instanceof triweekly) && (kowloonVar.molybdenite() instanceof triweekly) && (kowloonVar.taiyuan() instanceof triweekly) && (kowloonVar.apical() instanceof triweekly);
    }

    private void triweekly(View view) {
        view.setOutlineProvider(new attabal());
    }

    public final boolean arytenoidectomy() {
        kowloon kowloonVar;
        if (!this.f15517wireman.isEmpty() && (kowloonVar = this.f15514dern) != null && this.f15516saneness && !kowloonVar.dovishness(this.f15517wireman) && monoploid(this.f15514dern)) {
            float fAttabal = this.f15514dern.polloi().attabal(this.f15517wireman);
            float fAttabal2 = this.f15514dern.graveside().attabal(this.f15517wireman);
            float fAttabal3 = this.f15514dern.cutely().attabal(this.f15517wireman);
            float fAttabal4 = this.f15514dern.formularize().attabal(this.f15517wireman);
            if (fAttabal == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal2 == fAttabal4) {
                RectF rectF = this.f15517wireman;
                rectF.set(rectF.left - fAttabal2, rectF.top, rectF.right, rectF.bottom);
                this.f15484competently = fAttabal2;
                return true;
            }
            if (fAttabal == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal3 == fAttabal4) {
                RectF rectF2 = this.f15517wireman;
                rectF2.set(rectF2.left, rectF2.top - fAttabal3, rectF2.right, rectF2.bottom);
                this.f15484competently = fAttabal3;
                return true;
            }
            if (fAttabal2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal == fAttabal3) {
                RectF rectF3 = this.f15517wireman;
                rectF3.set(rectF3.left, rectF3.top, rectF3.right + fAttabal, rectF3.bottom);
                this.f15484competently = fAttabal;
                return true;
            }
            if (fAttabal3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fAttabal == fAttabal2) {
                RectF rectF4 = this.f15517wireman;
                rectF4.set(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom + fAttabal);
                this.f15484competently = fAttabal;
                return true;
            }
        }
        return false;
    }

    @Override // chinny.molybdenite
    public boolean cutely() {
        return !this.f15483beachfront || this.f15513attabal;
    }

    public final float impassible() {
        RectF rectF;
        kowloon kowloonVar = this.f15514dern;
        return (kowloonVar == null || (rectF = this.f15517wireman) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : kowloonVar.f15491beachfront.attabal(rectF);
    }

    public final boolean kowloon() {
        kowloon kowloonVar;
        if (this.f15517wireman.isEmpty() || (kowloonVar = this.f15514dern) == null) {
            return false;
        }
        return kowloonVar.dovishness(this.f15517wireman);
    }

    @Override // chinny.molybdenite
    public void saneness(View view) {
        this.f15484competently = impassible();
        this.f15483beachfront = kowloon() || arytenoidectomy();
        view.setClipToOutline(!cutely());
        if (cutely()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
