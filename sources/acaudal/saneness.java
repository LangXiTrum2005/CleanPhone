package acaudal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bubbles.beachfront;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;
import com.unity3d.services.UnityAdsConstants;
import weimar.competently;

/* JADX INFO: compiled from: LoadingIndicatorDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f3263adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Context f3264arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public Drawable f3265dovishness;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public attabal f3268molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final LoadingIndicatorSpec f3269monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public dern f3270polloi;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public com.google.android.material.progressindicator.attabal f3267kowloon = new com.google.android.material.progressindicator.attabal();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public Paint f3266graveside = new Paint();

    public saneness(Context context, LoadingIndicatorSpec loadingIndicatorSpec, dern dernVar, attabal attabalVar) {
        this.f3264arytenoidectomy = context;
        this.f3269monoploid = loadingIndicatorSpec;
        this.f3270polloi = dernVar;
        this.f3268molybdenite = attabalVar;
        attabalVar.cutely(this);
        setAlpha(255);
    }

    public static saneness attabal(Context context, LoadingIndicatorSpec loadingIndicatorSpec) {
        saneness sanenessVar = new saneness(context, loadingIndicatorSpec, new dern(loadingIndicatorSpec), new attabal(loadingIndicatorSpec));
        sanenessVar.marial(competently.saneness(context.getResources(), beachfront.ic_mtrl_arrow_circle, null));
        return sanenessVar;
    }

    public boolean beachfront(boolean z, boolean z2, boolean z3) {
        boolean visible = super.setVisible(z, z2);
        this.f3268molybdenite.marial();
        if (z && z3 && !wireman()) {
            this.f3268molybdenite.triweekly();
        }
        return visible;
    }

    public dern dern() {
        return this.f3270polloi;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (wireman() && (drawable = this.f3265dovishness) != null) {
                drawable.setBounds(bounds);
                this.f3265dovishness.setTint(this.f3269monoploid.f20546marial[0]);
                this.f3265dovishness.draw(canvas);
            } else {
                canvas.save();
                this.f3270polloi.attabal(canvas, bounds);
                this.f3270polloi.saneness(canvas, this.f3266graveside, this.f3269monoploid.f20544beachfront, getAlpha());
                this.f3270polloi.dern(canvas, this.f3266graveside, this.f3268molybdenite.f3250impromptu, getAlpha());
                canvas.restore();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3263adultoid;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3270polloi.wireman();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3270polloi.marial();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void marial(Drawable drawable) {
        this.f3265dovishness = drawable;
    }

    public attabal saneness() {
        return this.f3268molybdenite;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f3263adultoid != i) {
            this.f3263adultoid = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3266graveside.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return beachfront(z, z2, z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean wireman() {
        com.google.android.material.progressindicator.attabal attabalVar = this.f3267kowloon;
        return attabalVar != null && attabalVar.attabal(this.f3264arytenoidectomy.getContentResolver()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
