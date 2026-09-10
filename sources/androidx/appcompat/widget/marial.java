package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.premeiotic;

/* JADX INFO: compiled from: AppCompatCheckedTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CheckedTextView f5494attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f5495beachfront;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ColorStateList f5498saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public PorterDuff.Mode f5496dern = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f5499wireman = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f5497marial = false;

    public marial(CheckedTextView checkedTextView) {
        this.f5494attabal = checkedTextView;
    }

    public void attabal() {
        Drawable drawableAttabal = androidx.core.widget.saneness.attabal(this.f5494attabal);
        if (drawableAttabal != null) {
            if (this.f5499wireman || this.f5497marial) {
                Drawable drawableMutate = DrawableCompat.wrap(drawableAttabal).mutate();
                if (this.f5499wireman) {
                    DrawableCompat.setTintList(drawableMutate, this.f5498saneness);
                }
                if (this.f5497marial) {
                    DrawableCompat.setTintMode(drawableMutate, this.f5496dern);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f5494attabal.getDrawableState());
                }
                this.f5494attabal.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void beachfront(ColorStateList colorStateList) {
        this.f5498saneness = colorStateList;
        this.f5499wireman = true;
        attabal();
    }

    public void competently(PorterDuff.Mode mode) {
        this.f5496dern = mode;
        this.f5497marial = true;
        attabal();
    }

    public PorterDuff.Mode dern() {
        return this.f5496dern;
    }

    public void marial() {
        if (this.f5495beachfront) {
            this.f5495beachfront = false;
        } else {
            this.f5495beachfront = true;
            attabal();
        }
    }

    public ColorStateList saneness() {
        return this.f5498saneness;
    }

    public void wireman(AttributeSet attributeSet, int i) {
        int iTriweekly;
        int iTriweekly2;
        restrictive restrictiveVarDovishness = restrictive.dovishness(this.f5494attabal.getContext(), attributeSet, beachfront.cutely.CheckedTextView, i, 0);
        CheckedTextView checkedTextView = this.f5494attabal;
        premeiotic.nosophobia(checkedTextView, checkedTextView.getContext(), beachfront.cutely.CheckedTextView, attributeSet, restrictiveVarDovishness.polloi(), i, 0);
        try {
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CheckedTextView_checkMarkCompat) && (iTriweekly2 = restrictiveVarDovishness.triweekly(beachfront.cutely.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f5494attabal;
                    checkedTextView2.setCheckMarkDrawable(competently.attabal.saneness(checkedTextView2.getContext(), iTriweekly2));
                } catch (Resources.NotFoundException unused) {
                    if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CheckedTextView_android_checkMark)) {
                        CheckedTextView checkedTextView3 = this.f5494attabal;
                        checkedTextView3.setCheckMarkDrawable(competently.attabal.saneness(checkedTextView3.getContext(), iTriweekly));
                    }
                }
            } else if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CheckedTextView_android_checkMark) && (iTriweekly = restrictiveVarDovishness.triweekly(beachfront.cutely.CheckedTextView_android_checkMark, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f5494attabal;
                checkedTextView4.setCheckMarkDrawable(competently.attabal.saneness(checkedTextView4.getContext(), iTriweekly));
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CheckedTextView_checkMarkTint)) {
                androidx.core.widget.saneness.saneness(this.f5494attabal, restrictiveVarDovishness.dern(beachfront.cutely.CheckedTextView_checkMarkTint));
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CheckedTextView_checkMarkTintMode)) {
                androidx.core.widget.saneness.dern(this.f5494attabal, dovishness.marial(restrictiveVarDovishness.apical(beachfront.cutely.CheckedTextView_checkMarkTintMode, -1), null));
            }
        } finally {
            restrictiveVarDovishness.rotuma();
        }
    }
}
