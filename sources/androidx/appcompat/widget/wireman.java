package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.premeiotic;

/* JADX INFO: compiled from: AppCompatBackgroundHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final View f5590attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public kattegat f5591beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public kattegat f5593marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public kattegat f5595wireman;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f5592dern = -1;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f5594saneness = competently.saneness();

    public wireman(View view) {
        this.f5590attabal = view;
    }

    public final boolean apical() {
        return this.f5595wireman != null;
    }

    public final boolean attabal(Drawable drawable) {
        if (this.f5591beachfront == null) {
            this.f5591beachfront = new kattegat();
        }
        kattegat kattegatVar = this.f5591beachfront;
        kattegatVar.attabal();
        ColorStateList colorStateListPolloi = premeiotic.polloi(this.f5590attabal);
        if (colorStateListPolloi != null) {
            kattegatVar.f5491wireman = true;
            kattegatVar.f5488attabal = colorStateListPolloi;
        }
        PorterDuff.Mode modeMolybdenite = premeiotic.molybdenite(this.f5590attabal);
        if (modeMolybdenite != null) {
            kattegatVar.f5489dern = true;
            kattegatVar.f5490saneness = modeMolybdenite;
        }
        if (!kattegatVar.f5491wireman && !kattegatVar.f5489dern) {
            return false;
        }
        competently.taiyuan(drawable, kattegatVar, this.f5590attabal.getDrawableState());
        return true;
    }

    public void beachfront(Drawable drawable) {
        this.f5592dern = -1;
        impromptu(null);
        saneness();
    }

    public void competently(int i) {
        this.f5592dern = i;
        competently competentlyVar = this.f5594saneness;
        impromptu(competentlyVar != null ? competentlyVar.beachfront(this.f5590attabal.getContext(), i) : null);
        saneness();
    }

    public void cutely(PorterDuff.Mode mode) {
        if (this.f5593marial == null) {
            this.f5593marial = new kattegat();
        }
        kattegat kattegatVar = this.f5593marial;
        kattegatVar.f5490saneness = mode;
        kattegatVar.f5489dern = true;
        saneness();
    }

    public ColorStateList dern() {
        kattegat kattegatVar = this.f5593marial;
        if (kattegatVar != null) {
            return kattegatVar.f5488attabal;
        }
        return null;
    }

    public void impromptu(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5595wireman == null) {
                this.f5595wireman = new kattegat();
            }
            kattegat kattegatVar = this.f5595wireman;
            kattegatVar.f5488attabal = colorStateList;
            kattegatVar.f5491wireman = true;
        } else {
            this.f5595wireman = null;
        }
        saneness();
    }

    public void marial(AttributeSet attributeSet, int i) {
        restrictive restrictiveVarDovishness = restrictive.dovishness(this.f5590attabal.getContext(), attributeSet, beachfront.cutely.ViewBackgroundHelper, i, 0);
        View view = this.f5590attabal;
        premeiotic.nosophobia(view, view.getContext(), beachfront.cutely.ViewBackgroundHelper, attributeSet, restrictiveVarDovishness.polloi(), i, 0);
        try {
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.ViewBackgroundHelper_android_background)) {
                this.f5592dern = restrictiveVarDovishness.triweekly(beachfront.cutely.ViewBackgroundHelper_android_background, -1);
                ColorStateList colorStateListBeachfront = this.f5594saneness.beachfront(this.f5590attabal.getContext(), this.f5592dern);
                if (colorStateListBeachfront != null) {
                    impromptu(colorStateListBeachfront);
                }
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.ViewBackgroundHelper_backgroundTint)) {
                premeiotic.sensatory(this.f5590attabal, restrictiveVarDovishness.dern(beachfront.cutely.ViewBackgroundHelper_backgroundTint));
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.ViewBackgroundHelper_backgroundTintMode)) {
                premeiotic.underbelly(this.f5590attabal, dovishness.marial(restrictiveVarDovishness.apical(beachfront.cutely.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            restrictiveVarDovishness.rotuma();
        }
    }

    public void saneness() {
        Drawable background = this.f5590attabal.getBackground();
        if (background != null) {
            if (apical() && attabal(background)) {
                return;
            }
            kattegat kattegatVar = this.f5593marial;
            if (kattegatVar != null) {
                competently.taiyuan(background, kattegatVar, this.f5590attabal.getDrawableState());
                return;
            }
            kattegat kattegatVar2 = this.f5595wireman;
            if (kattegatVar2 != null) {
                competently.taiyuan(background, kattegatVar2, this.f5590attabal.getDrawableState());
            }
        }
    }

    public void taiyuan(ColorStateList colorStateList) {
        if (this.f5593marial == null) {
            this.f5593marial = new kattegat();
        }
        kattegat kattegatVar = this.f5593marial;
        kattegatVar.f5488attabal = colorStateList;
        kattegatVar.f5491wireman = true;
        saneness();
    }

    public PorterDuff.Mode wireman() {
        kattegat kattegatVar = this.f5593marial;
        if (kattegatVar != null) {
            return kattegatVar.f5490saneness;
        }
        return null;
    }
}
