package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import chinny.gintrap;
import chinny.kowloon;
import chinny.polloi;
import chinny.taiyuan;
import com.google.android.material.internal.cuirassed;
import molet.impassible;

/* JADX INFO: compiled from: MaterialButtonHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class wireman {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f19831apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public Drawable f19832arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MaterialButton f19833attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f19834beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f19835competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f19836cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public gintrap f19837dern;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public LayerDrawable f19838dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public PorterDuff.Mode f19839formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f19840gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f19841graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ColorStateList f19842impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f19843impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public ColorStateList f19844kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public taiyuan.wireman f19845marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public kowloon f19849saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f19850taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public ColorStateList f19851triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public impassible f19852wireman;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f19847monoploid = false;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public boolean f19848polloi = false;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public boolean f19846molybdenite = false;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f19830adultoid = true;

    public wireman(MaterialButton materialButton, kowloon kowloonVar) {
        this.f19833attabal = materialButton;
        this.f19849saneness = kowloonVar;
    }

    public void adultoid(int i) {
        if (competently() != null) {
            competently().setTint(i);
        }
    }

    public gintrap apical() {
        return this.f19837dern;
    }

    public final taiyuan arytenoidectomy() {
        return impromptu(true);
    }

    public final Drawable attabal() {
        taiyuan taiyuanVar = new taiyuan(this.f19849saneness);
        gintrap gintrapVar = this.f19837dern;
        if (gintrapVar != null) {
            taiyuanVar.wostteth(gintrapVar);
        }
        impassible impassibleVar = this.f19852wireman;
        if (impassibleVar != null) {
            taiyuanVar.coffeecake(impassibleVar);
        }
        taiyuan.wireman wiremanVar = this.f19845marial;
        if (wiremanVar != null) {
            taiyuanVar.sayid(wiremanVar);
        }
        taiyuanVar.overspeculate(this.f19833attabal.getContext());
        taiyuanVar.setTintList(this.f19842impassible);
        PorterDuff.Mode mode = this.f19839formularize;
        if (mode != null) {
            taiyuanVar.setTintMode(mode);
        }
        taiyuanVar.gusty(this.f19831apical, this.f19851triweekly);
        taiyuan taiyuanVar2 = new taiyuan(this.f19849saneness);
        gintrap gintrapVar2 = this.f19837dern;
        if (gintrapVar2 != null) {
            taiyuanVar2.wostteth(gintrapVar2);
        }
        impassible impassibleVar2 = this.f19852wireman;
        if (impassibleVar2 != null) {
            taiyuanVar2.coffeecake(impassibleVar2);
        }
        taiyuanVar2.setTint(0);
        taiyuanVar2.igbo(this.f19831apical, this.f19847monoploid ? pyrope.attabal.wireman(this.f19833attabal, bubbles.dern.colorSurface) : 0);
        taiyuan taiyuanVar3 = new taiyuan(this.f19849saneness);
        this.f19832arytenoidectomy = taiyuanVar3;
        gintrap gintrapVar3 = this.f19837dern;
        if (gintrapVar3 != null) {
            taiyuanVar3.wostteth(gintrapVar3);
        }
        impassible impassibleVar3 = this.f19852wireman;
        if (impassibleVar3 != null) {
            ((taiyuan) this.f19832arytenoidectomy).coffeecake(impassibleVar3);
        }
        this.f19832arytenoidectomy.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(appreciation.attabal.wireman(this.f19844kowloon), creditor(new LayerDrawable(new Drawable[]{taiyuanVar2, taiyuanVar})), this.f19832arytenoidectomy);
        this.f19838dovishness = rippleDrawable;
        return rippleDrawable;
    }

    public polloi beachfront() {
        LayerDrawable layerDrawable = this.f19838dovishness;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f19838dovishness.getNumberOfLayers() > 2 ? (polloi) this.f19838dovishness.getDrawable(2) : (polloi) this.f19838dovishness.getDrawable(1);
    }

    public taiyuan competently() {
        return impromptu(false);
    }

    public void cord(impassible impassibleVar) {
        this.f19852wireman = impassibleVar;
        if (this.f19837dern != null) {
            saran();
        }
    }

    public final InsetDrawable creditor(Drawable drawable) {
        return new InsetDrawable(drawable, this.f19834beachfront, this.f19843impromptu, this.f19835competently, this.f19850taiyuan);
    }

    public void cuirassed(int i) {
        seminary(this.f19843impromptu, i);
    }

    public kowloon cutely() {
        return this.f19849saneness;
    }

    public impassible dern() {
        return this.f19852wireman;
    }

    public void dovishness() {
        this.f19848polloi = true;
        this.f19833attabal.setSupportBackgroundTintList(this.f19842impassible);
        this.f19833attabal.setSupportBackgroundTintMode(this.f19839formularize);
    }

    public ColorStateList formularize() {
        return this.f19851triweekly;
    }

    public void gintrap(boolean z) {
        this.f19841graveside = z;
    }

    public void graveside(TypedArray typedArray) {
        this.f19834beachfront = typedArray.getDimensionPixelOffset(bubbles.impassible.MaterialButton_android_insetLeft, 0);
        this.f19835competently = typedArray.getDimensionPixelOffset(bubbles.impassible.MaterialButton_android_insetRight, 0);
        this.f19843impromptu = typedArray.getDimensionPixelOffset(bubbles.impassible.MaterialButton_android_insetTop, 0);
        this.f19850taiyuan = typedArray.getDimensionPixelOffset(bubbles.impassible.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(bubbles.impassible.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(bubbles.impassible.MaterialButton_cornerRadius, -1);
            this.f19836cutely = dimensionPixelSize;
            oilcan(this.f19849saneness.rotuma(dimensionPixelSize));
            this.f19846molybdenite = true;
        }
        this.f19831apical = typedArray.getDimensionPixelSize(bubbles.impassible.MaterialButton_strokeWidth, 0);
        this.f19839formularize = cuirassed.triweekly(typedArray.getInt(bubbles.impassible.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f19842impassible = mullein.dern.attabal(this.f19833attabal.getContext(), typedArray, bubbles.impassible.MaterialButton_backgroundTint);
        this.f19851triweekly = mullein.dern.attabal(this.f19833attabal.getContext(), typedArray, bubbles.impassible.MaterialButton_strokeColor);
        this.f19844kowloon = mullein.dern.attabal(this.f19833attabal.getContext(), typedArray, bubbles.impassible.MaterialButton_rippleColor);
        this.f19841graveside = typedArray.getBoolean(bubbles.impassible.MaterialButton_android_checkable, false);
        this.f19840gintrap = typedArray.getDimensionPixelSize(bubbles.impassible.MaterialButton_elevation, 0);
        this.f19830adultoid = typedArray.getBoolean(bubbles.impassible.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = this.f19833attabal.getPaddingStart();
        int paddingTop = this.f19833attabal.getPaddingTop();
        int paddingEnd = this.f19833attabal.getPaddingEnd();
        int paddingBottom = this.f19833attabal.getPaddingBottom();
        if (typedArray.hasValue(bubbles.impassible.MaterialButton_android_background)) {
            dovishness();
        } else {
            grimness();
        }
        this.f19833attabal.setPaddingRelative(paddingStart + this.f19834beachfront, paddingTop + this.f19843impromptu, paddingEnd + this.f19835competently, paddingBottom + this.f19850taiyuan);
    }

    public final void grimness() {
        this.f19833attabal.setInternalBackground(attabal());
        taiyuan taiyuanVarCompetently = competently();
        if (taiyuanVarCompetently != null) {
            taiyuanVarCompetently.lerp(this.f19840gintrap);
            taiyuanVarCompetently.setState(this.f19833attabal.getDrawableState());
        }
    }

    public int impassible() {
        return this.f19831apical;
    }

    public final taiyuan impromptu(boolean z) {
        LayerDrawable layerDrawable = this.f19838dovishness;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (taiyuan) ((LayerDrawable) ((InsetDrawable) this.f19838dovishness.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public void kattegat(ColorStateList colorStateList) {
        if (this.f19851triweekly != colorStateList) {
            this.f19851triweekly = colorStateList;
            privatdozent();
        }
    }

    public PorterDuff.Mode kowloon() {
        return this.f19839formularize;
    }

    public int marial() {
        return this.f19843impromptu;
    }

    public void merc(PorterDuff.Mode mode) {
        if (this.f19839formularize != mode) {
            this.f19839formularize = mode;
            if (competently() == null || this.f19839formularize == null) {
                return;
            }
            competently().setTintMode(this.f19839formularize);
        }
    }

    public boolean molybdenite() {
        return this.f19830adultoid;
    }

    public boolean monoploid() {
        return this.f19848polloi;
    }

    public void oilcan(kowloon kowloonVar) {
        this.f19849saneness = kowloonVar;
        this.f19837dern = null;
        saran();
    }

    public void polder(boolean z) {
        this.f19830adultoid = z;
    }

    public boolean polloi() {
        return this.f19841graveside;
    }

    public void preprohormone(taiyuan.wireman wiremanVar) {
        this.f19845marial = wiremanVar;
        taiyuan taiyuanVarCompetently = competently();
        if (taiyuanVarCompetently != null) {
            taiyuanVarCompetently.sayid(wiremanVar);
        }
    }

    public final void privatdozent() {
        taiyuan taiyuanVarCompetently = competently();
        taiyuan taiyuanVarArytenoidectomy = arytenoidectomy();
        if (taiyuanVarCompetently != null) {
            taiyuanVarCompetently.gusty(this.f19831apical, this.f19851triweekly);
            if (taiyuanVarArytenoidectomy != null) {
                taiyuanVarArytenoidectomy.igbo(this.f19831apical, this.f19847monoploid ? pyrope.attabal.wireman(this.f19833attabal, bubbles.dern.colorSurface) : 0);
            }
        }
    }

    public void restrictive(ColorStateList colorStateList) {
        if (this.f19842impassible != colorStateList) {
            this.f19842impassible = colorStateList;
            if (competently() != null) {
                competently().setTintList(this.f19842impassible);
            }
        }
    }

    public void rotuma(int i) {
        if (this.f19846molybdenite && this.f19836cutely == i) {
            return;
        }
        this.f19836cutely = i;
        this.f19846molybdenite = true;
        oilcan(this.f19849saneness.rotuma(i));
    }

    public int saneness() {
        return this.f19836cutely;
    }

    public final void saran() {
        taiyuan taiyuanVarCompetently = competently();
        if (taiyuanVarCompetently != null) {
            gintrap gintrapVar = this.f19837dern;
            if (gintrapVar != null) {
                taiyuanVarCompetently.wostteth(gintrapVar);
            } else {
                taiyuanVarCompetently.setShapeAppearanceModel(this.f19849saneness);
            }
            impassible impassibleVar = this.f19852wireman;
            if (impassibleVar != null) {
                taiyuanVarCompetently.coffeecake(impassibleVar);
            }
        }
        taiyuan taiyuanVarArytenoidectomy = arytenoidectomy();
        if (taiyuanVarArytenoidectomy != null) {
            gintrap gintrapVar2 = this.f19837dern;
            if (gintrapVar2 != null) {
                taiyuanVarArytenoidectomy.wostteth(gintrapVar2);
            } else {
                taiyuanVarArytenoidectomy.setShapeAppearanceModel(this.f19849saneness);
            }
            impassible impassibleVar2 = this.f19852wireman;
            if (impassibleVar2 != null) {
                taiyuanVarArytenoidectomy.coffeecake(impassibleVar2);
            }
        }
        polloi polloiVarBeachfront = beachfront();
        if (polloiVarBeachfront != null) {
            polloiVarBeachfront.setShapeAppearanceModel(this.f19849saneness);
            if (polloiVarBeachfront instanceof taiyuan) {
                taiyuan taiyuanVar = (taiyuan) polloiVarBeachfront;
                gintrap gintrapVar3 = this.f19837dern;
                if (gintrapVar3 != null) {
                    taiyuanVar.wostteth(gintrapVar3);
                }
                impassible impassibleVar3 = this.f19852wireman;
                if (impassibleVar3 != null) {
                    taiyuanVar.coffeecake(impassibleVar3);
                }
            }
        }
    }

    public void sealless(gintrap gintrapVar) {
        this.f19837dern = gintrapVar;
        saran();
    }

    public final void seminary(int i, int i2) {
        int paddingStart = this.f19833attabal.getPaddingStart();
        int paddingTop = this.f19833attabal.getPaddingTop();
        int paddingEnd = this.f19833attabal.getPaddingEnd();
        int paddingBottom = this.f19833attabal.getPaddingBottom();
        int i3 = this.f19843impromptu;
        int i4 = this.f19850taiyuan;
        this.f19850taiyuan = i2;
        this.f19843impromptu = i;
        if (!this.f19848polloi) {
            grimness();
        }
        this.f19833attabal.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public void stratoscope(int i) {
        seminary(i, this.f19850taiyuan);
    }

    public void supplicat(int i) {
        if (this.f19831apical != i) {
            this.f19831apical = i;
            privatdozent();
        }
    }

    public ColorStateList taiyuan() {
        return this.f19844kowloon;
    }

    public ColorStateList triweekly() {
        return this.f19842impassible;
    }

    public void trm(ColorStateList colorStateList) {
        if (this.f19844kowloon != colorStateList) {
            this.f19844kowloon = colorStateList;
            if (this.f19833attabal.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f19833attabal.getBackground()).setColor(appreciation.attabal.wireman(colorStateList));
            }
        }
    }

    public int wireman() {
        return this.f19850taiyuan;
    }

    public void yemenite(boolean z) {
        this.f19847monoploid = z;
        privatdozent();
    }
}
