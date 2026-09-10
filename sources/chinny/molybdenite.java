package chinny;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: ShapeableDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class molybdenite {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public kowloon f15514dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f15513attabal = false;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f15516saneness = false;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public RectF f15517wireman = new RectF();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Path f15515marial = new Path();

    public static molybdenite attabal(View view) {
        return Build.VERSION.SDK_INT >= 33 ? new adultoid(view) : new graveside(view);
    }

    public final void apical() {
        if (!wireman() || this.f15514dern == null) {
            return;
        }
        arytenoidectomy.formularize().wireman(this.f15514dern, 1.0f, this.f15517wireman, this.f15515marial);
    }

    public void beachfront(View view, RectF rectF) {
        this.f15517wireman = rectF;
        apical();
        saneness(view);
    }

    public void competently(View view, kowloon kowloonVar) {
        this.f15514dern = kowloonVar;
        apical();
        saneness(view);
    }

    public abstract boolean cutely();

    public boolean dern() {
        return this.f15513attabal;
    }

    public void impromptu(View view, boolean z) {
        if (z != this.f15513attabal) {
            this.f15513attabal = z;
            saneness(view);
        }
    }

    public void marial(Canvas canvas, punish.attabal.InterfaceC0778attabal interfaceC0778attabal) {
        if (!cutely() || this.f15515marial.isEmpty()) {
            interfaceC0778attabal.attabal(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f15515marial);
        interfaceC0778attabal.attabal(canvas);
        canvas.restore();
    }

    public abstract void saneness(View view);

    public void taiyuan(View view, boolean z) {
        this.f15516saneness = z;
        saneness(view);
    }

    public final boolean wireman() {
        RectF rectF = this.f15517wireman;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }
}
