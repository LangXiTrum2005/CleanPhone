package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.premeiotic;

/* JADX INFO: compiled from: AppCompatCompoundButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final CompoundButton f5412attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public boolean f5413beachfront;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ColorStateList f5416saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public PorterDuff.Mode f5414dern = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f5417wireman = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public boolean f5415marial = false;

    public beachfront(CompoundButton compoundButton) {
        this.f5412attabal = compoundButton;
    }

    public void attabal() {
        Drawable drawableAttabal = androidx.core.widget.dern.attabal(this.f5412attabal);
        if (drawableAttabal != null) {
            if (this.f5417wireman || this.f5415marial) {
                Drawable drawableMutate = DrawableCompat.wrap(drawableAttabal).mutate();
                if (this.f5417wireman) {
                    DrawableCompat.setTintList(drawableMutate, this.f5416saneness);
                }
                if (this.f5415marial) {
                    DrawableCompat.setTintMode(drawableMutate, this.f5414dern);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f5412attabal.getDrawableState());
                }
                this.f5412attabal.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void beachfront(ColorStateList colorStateList) {
        this.f5416saneness = colorStateList;
        this.f5417wireman = true;
        attabal();
    }

    public void competently(PorterDuff.Mode mode) {
        this.f5414dern = mode;
        this.f5415marial = true;
        attabal();
    }

    public PorterDuff.Mode dern() {
        return this.f5414dern;
    }

    public void marial() {
        if (this.f5413beachfront) {
            this.f5413beachfront = false;
        } else {
            this.f5413beachfront = true;
            attabal();
        }
    }

    public ColorStateList saneness() {
        return this.f5416saneness;
    }

    public void wireman(AttributeSet attributeSet, int i) {
        int iTriweekly;
        int iTriweekly2;
        restrictive restrictiveVarDovishness = restrictive.dovishness(this.f5412attabal.getContext(), attributeSet, beachfront.cutely.CompoundButton, i, 0);
        CompoundButton compoundButton = this.f5412attabal;
        premeiotic.nosophobia(compoundButton, compoundButton.getContext(), beachfront.cutely.CompoundButton, attributeSet, restrictiveVarDovishness.polloi(), i, 0);
        try {
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CompoundButton_buttonCompat) && (iTriweekly2 = restrictiveVarDovishness.triweekly(beachfront.cutely.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f5412attabal;
                    compoundButton2.setButtonDrawable(competently.attabal.saneness(compoundButton2.getContext(), iTriweekly2));
                } catch (Resources.NotFoundException unused) {
                    if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CompoundButton_android_button)) {
                        CompoundButton compoundButton3 = this.f5412attabal;
                        compoundButton3.setButtonDrawable(competently.attabal.saneness(compoundButton3.getContext(), iTriweekly));
                    }
                }
            } else if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CompoundButton_android_button) && (iTriweekly = restrictiveVarDovishness.triweekly(beachfront.cutely.CompoundButton_android_button, 0)) != 0) {
                CompoundButton compoundButton4 = this.f5412attabal;
                compoundButton4.setButtonDrawable(competently.attabal.saneness(compoundButton4.getContext(), iTriweekly));
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CompoundButton_buttonTint)) {
                androidx.core.widget.dern.wireman(this.f5412attabal, restrictiveVarDovishness.dern(beachfront.cutely.CompoundButton_buttonTint));
            }
            if (restrictiveVarDovishness.molybdenite(beachfront.cutely.CompoundButton_buttonTintMode)) {
                androidx.core.widget.dern.marial(this.f5412attabal, dovishness.marial(restrictiveVarDovishness.apical(beachfront.cutely.CompoundButton_buttonTintMode, -1), null));
            }
        } finally {
            restrictiveVarDovishness.rotuma();
        }
    }
}
