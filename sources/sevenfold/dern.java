package sevenfold;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.util.apical;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: GifDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class dern extends Drawable implements competently.saneness, Animatable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f37572adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f37573arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f37574dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public Paint f37575gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f37576graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final attabal f37577kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f37578molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f37579monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f37580polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public List<weimar.saneness> f37581preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public Rect f37582rotuma;

    /* JADX INFO: compiled from: GifDrawable.java */
    public static final class attabal extends Drawable.ConstantState {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final competently f37583attabal;

        public attabal(competently competentlyVar) {
            this.f37583attabal = competentlyVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new dern(this);
        }
    }

    public dern(Context context, terni.attabal attabalVar, maggot.competently<Bitmap> competentlyVar, int i, int i2, Bitmap bitmap) {
        this(new attabal(new competently(com.bumptech.glide.saneness.dern(context), attabalVar, i, i2, competentlyVar, bitmap)));
    }

    public void apical() {
        this.f37580polloi = true;
        this.f37577kowloon.f37583attabal.attabal();
    }

    @Override // sevenfold.competently.saneness
    public void attabal() {
        if (saneness() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (competently() == beachfront() - 1) {
            this.f37576graveside++;
        }
        int i = this.f37572adultoid;
        if (i == -1 || this.f37576graveside < i) {
            return;
        }
        cutely();
        stop();
    }

    public int beachfront() {
        return this.f37577kowloon.f37583attabal.beachfront();
    }

    public int competently() {
        return this.f37577kowloon.f37583attabal.wireman();
    }

    public final void cutely() {
        List<weimar.saneness> list = this.f37581preprohormone;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f37581preprohormone.get(i).saneness(this);
            }
        }
    }

    public ByteBuffer dern() {
        return this.f37577kowloon.f37583attabal.saneness();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f37580polloi) {
            return;
        }
        if (this.f37574dovishness) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), wireman());
            this.f37574dovishness = false;
        }
        canvas.drawBitmap(this.f37577kowloon.f37583attabal.dern(), (Rect) null, wireman(), impromptu());
    }

    public final void formularize() {
        this.f37576graveside = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f37577kowloon;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f37577kowloon.f37583attabal.impromptu();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f37577kowloon.f37583attabal.apical();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public void impassible(maggot.competently<Bitmap> competentlyVar, Bitmap bitmap) {
        this.f37577kowloon.f37583attabal.kowloon(competentlyVar, bitmap);
    }

    public final Paint impromptu() {
        if (this.f37575gintrap == null) {
            this.f37575gintrap = new Paint(2);
        }
        return this.f37575gintrap;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f37573arytenoidectomy;
    }

    public final void kowloon() {
        this.f37573arytenoidectomy = false;
        this.f37577kowloon.f37583attabal.molybdenite(this);
    }

    public Bitmap marial() {
        return this.f37577kowloon.f37583attabal.marial();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f37574dovishness = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback saneness() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        impromptu().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        impromptu().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        apical.attabal(!this.f37580polloi, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f37578molybdenite = z;
        if (!z) {
            kowloon();
        } else if (this.f37579monoploid) {
            triweekly();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f37579monoploid = true;
        formularize();
        if (this.f37578molybdenite) {
            triweekly();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f37579monoploid = false;
        kowloon();
    }

    public int taiyuan() {
        return this.f37577kowloon.f37583attabal.cutely();
    }

    public final void triweekly() {
        apical.attabal(!this.f37580polloi, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f37577kowloon.f37583attabal.beachfront() == 1) {
            invalidateSelf();
        } else {
            if (this.f37573arytenoidectomy) {
                return;
            }
            this.f37573arytenoidectomy = true;
            this.f37577kowloon.f37583attabal.polloi(this);
            invalidateSelf();
        }
    }

    public final Rect wireman() {
        if (this.f37582rotuma == null) {
            this.f37582rotuma = new Rect();
        }
        return this.f37582rotuma;
    }

    public dern(attabal attabalVar) {
        this.f37578molybdenite = true;
        this.f37572adultoid = -1;
        this.f37577kowloon = (attabal) apical.wireman(attabalVar);
    }
}
