package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CircularRevealHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f20000attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public dern.marial f20001beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public Drawable f20002competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Path f20003dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f20004impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Paint f20005marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final View f20006saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Paint f20007wireman;

    /* JADX INFO: compiled from: CircularRevealHelper.java */
    public interface attabal {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public saneness(attabal attabalVar) {
        this.f20000attabal = attabalVar;
        View view = (View) attabalVar;
        this.f20006saneness = view;
        view.setWillNotDraw(false);
        this.f20003dern = new Path();
        this.f20007wireman = new Paint(7);
        Paint paint = new Paint(1);
        this.f20005marial = paint;
        paint.setColor(0);
    }

    public void apical(Drawable drawable) {
        this.f20002competently = drawable;
        this.f20006saneness.invalidate();
    }

    public final boolean arytenoidectomy() {
        return (this.f20004impromptu || Color.alpha(this.f20005marial.getColor()) == 0) ? false : true;
    }

    public int beachfront() {
        return this.f20005marial.getColor();
    }

    public final float competently(dern.marial marialVar) {
        return othin.attabal.dern(marialVar.f19994attabal, marialVar.f19996saneness, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f20006saneness.getWidth(), this.f20006saneness.getHeight());
    }

    public boolean cutely() {
        return this.f20000attabal.actualIsOpaque() && !triweekly();
    }

    public void dern(Canvas canvas) {
        Canvas canvas2;
        if (triweekly()) {
            this.f20000attabal.actualDraw(canvas);
            if (arytenoidectomy()) {
                canvas2 = canvas;
                canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f20006saneness.getWidth(), this.f20006saneness.getHeight(), this.f20005marial);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.f20000attabal.actualDraw(canvas2);
            if (arytenoidectomy()) {
                canvas2.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f20006saneness.getWidth(), this.f20006saneness.getHeight(), this.f20005marial);
            }
        }
        wireman(canvas2);
    }

    public void formularize(int i) {
        this.f20005marial.setColor(i);
        this.f20006saneness.invalidate();
    }

    public void impassible(dern.marial marialVar) {
        if (marialVar == null) {
            this.f20001beachfront = null;
        } else {
            dern.marial marialVar2 = this.f20001beachfront;
            if (marialVar2 == null) {
                this.f20001beachfront = new dern.marial(marialVar);
            } else {
                marialVar2.dern(marialVar);
            }
            if (othin.attabal.marial(marialVar.f19995dern, competently(marialVar), 1.0E-4f)) {
                this.f20001beachfront.f19995dern = Float.MAX_VALUE;
            }
        }
        taiyuan();
    }

    public dern.marial impromptu() {
        dern.marial marialVar = this.f20001beachfront;
        if (marialVar == null) {
            return null;
        }
        dern.marial marialVar2 = new dern.marial(marialVar);
        if (marialVar2.attabal()) {
            marialVar2.f19995dern = competently(marialVar2);
        }
        return marialVar2;
    }

    public final boolean kowloon() {
        return (this.f20004impromptu || this.f20002competently == null || this.f20001beachfront == null) ? false : true;
    }

    public Drawable marial() {
        return this.f20002competently;
    }

    public final void taiyuan() {
        this.f20006saneness.invalidate();
    }

    public final boolean triweekly() {
        dern.marial marialVar = this.f20001beachfront;
        return !(marialVar == null || marialVar.attabal());
    }

    public final void wireman(Canvas canvas) {
        if (kowloon()) {
            Rect bounds = this.f20002competently.getBounds();
            float fWidth = this.f20001beachfront.f19994attabal - (bounds.width() / 2.0f);
            float fHeight = this.f20001beachfront.f19996saneness - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f20002competently.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    public void attabal() {
    }

    public void saneness() {
    }
}
