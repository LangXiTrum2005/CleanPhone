package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.premeiotic;

/* JADX INFO: compiled from: AppCompatImageHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ImageView f5375attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public kattegat f5376dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f5377marial = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public kattegat f5378saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public kattegat f5379wireman;

    public apical(ImageView imageView) {
        this.f5375attabal = imageView;
    }

    public void apical(PorterDuff.Mode mode) {
        if (this.f5376dern == null) {
            this.f5376dern = new kattegat();
        }
        kattegat kattegatVar = this.f5376dern;
        kattegatVar.f5490saneness = mode;
        kattegatVar.f5489dern = true;
        dern();
    }

    public final boolean attabal(Drawable drawable) {
        if (this.f5379wireman == null) {
            this.f5379wireman = new kattegat();
        }
        kattegat kattegatVar = this.f5379wireman;
        kattegatVar.attabal();
        ColorStateList colorStateListAttabal = androidx.core.widget.taiyuan.attabal(this.f5375attabal);
        if (colorStateListAttabal != null) {
            kattegatVar.f5491wireman = true;
            kattegatVar.f5488attabal = colorStateListAttabal;
        }
        PorterDuff.Mode modeSaneness = androidx.core.widget.taiyuan.saneness(this.f5375attabal);
        if (modeSaneness != null) {
            kattegatVar.f5489dern = true;
            kattegatVar.f5490saneness = modeSaneness;
        }
        if (!kattegatVar.f5491wireman && !kattegatVar.f5489dern) {
            return false;
        }
        competently.taiyuan(drawable, kattegatVar, this.f5375attabal.getDrawableState());
        return true;
    }

    public boolean beachfront() {
        return !(this.f5375attabal.getBackground() instanceof RippleDrawable);
    }

    public void competently(AttributeSet attributeSet, int i) {
        int iTriweekly;
        restrictive restrictiveVarDovishness = restrictive.dovishness(this.f5375attabal.getContext(), attributeSet, beachfront.cutely.AppCompatImageView, i, 0);
        ImageView imageView = this.f5375attabal;
        premeiotic.nosophobia(imageView, imageView.getContext(), beachfront.cutely.AppCompatImageView, attributeSet, restrictiveVarDovishness.polloi(), i, 0);
        try {
            Drawable drawable = this.f5375attabal.getDrawable();
            if (drawable == null && (iTriweekly = restrictiveVarDovishness.triweekly(beachfront.cutely.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = competently.attabal.saneness(this.f5375attabal.getContext(), iTriweekly)) != null) {
                this.f5375attabal.setImageDrawable(drawable);
            }
            if (drawable != null) {
                dovishness.saneness(drawable);
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatImageView_tint)) {
                androidx.core.widget.taiyuan.dern(this.f5375attabal, restrictiveVarDovishness.dern(beachfront.cutely.AppCompatImageView_tint));
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatImageView_tintMode)) {
                androidx.core.widget.taiyuan.wireman(this.f5375attabal, dovishness.marial(restrictiveVarDovishness.apical(beachfront.cutely.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            restrictiveVarDovishness.rotuma();
        }
    }

    public void cutely(ColorStateList colorStateList) {
        if (this.f5376dern == null) {
            this.f5376dern = new kattegat();
        }
        kattegat kattegatVar = this.f5376dern;
        kattegatVar.f5488attabal = colorStateList;
        kattegatVar.f5491wireman = true;
        dern();
    }

    public void dern() {
        Drawable drawable = this.f5375attabal.getDrawable();
        if (drawable != null) {
            dovishness.saneness(drawable);
        }
        if (drawable != null) {
            if (formularize() && attabal(drawable)) {
                return;
            }
            kattegat kattegatVar = this.f5376dern;
            if (kattegatVar != null) {
                competently.taiyuan(drawable, kattegatVar, this.f5375attabal.getDrawableState());
                return;
            }
            kattegat kattegatVar2 = this.f5378saneness;
            if (kattegatVar2 != null) {
                competently.taiyuan(drawable, kattegatVar2, this.f5375attabal.getDrawableState());
            }
        }
    }

    public final boolean formularize() {
        return this.f5378saneness != null;
    }

    public void impromptu(Drawable drawable) {
        this.f5377marial = drawable.getLevel();
    }

    public PorterDuff.Mode marial() {
        kattegat kattegatVar = this.f5376dern;
        if (kattegatVar != null) {
            return kattegatVar.f5490saneness;
        }
        return null;
    }

    public void saneness() {
        if (this.f5375attabal.getDrawable() != null) {
            this.f5375attabal.getDrawable().setLevel(this.f5377marial);
        }
    }

    public void taiyuan(int i) {
        if (i != 0) {
            Drawable drawableSaneness = competently.attabal.saneness(this.f5375attabal.getContext(), i);
            if (drawableSaneness != null) {
                dovishness.saneness(drawableSaneness);
            }
            this.f5375attabal.setImageDrawable(drawableSaneness);
        } else {
            this.f5375attabal.setImageDrawable(null);
        }
        dern();
    }

    public ColorStateList wireman() {
        kattegat kattegatVar = this.f5376dern;
        if (kattegatVar != null) {
            return kattegatVar.f5488attabal;
        }
        return null;
    }
}
