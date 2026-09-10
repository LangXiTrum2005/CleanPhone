package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: AppCompatSeekBarHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class triweekly extends formularize {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public ColorStateList f5574beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public PorterDuff.Mode f5575competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public boolean f5576impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public Drawable f5577marial;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public boolean f5578taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final SeekBar f5579wireman;

    public triweekly(SeekBar seekBar) {
        super(seekBar);
        this.f5574beachfront = null;
        this.f5575competently = null;
        this.f5576impromptu = false;
        this.f5578taiyuan = false;
        this.f5579wireman = seekBar;
    }

    public final void beachfront() {
        Drawable drawable = this.f5577marial;
        if (drawable != null) {
            if (this.f5576impromptu || this.f5578taiyuan) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
                this.f5577marial = drawableWrap;
                if (this.f5576impromptu) {
                    DrawableCompat.setTintList(drawableWrap, this.f5574beachfront);
                }
                if (this.f5578taiyuan) {
                    DrawableCompat.setTintMode(this.f5577marial, this.f5575competently);
                }
                if (this.f5577marial.isStateful()) {
                    this.f5577marial.setState(this.f5579wireman.getDrawableState());
                }
            }
        }
    }

    public void competently(Canvas canvas) {
        if (this.f5577marial != null) {
            int max = this.f5579wireman.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f5577marial.getIntrinsicWidth();
                int intrinsicHeight = this.f5577marial.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f5577marial.setBounds(-i, -i2, i, i2);
                float width = ((this.f5579wireman.getWidth() - this.f5579wireman.getPaddingLeft()) - this.f5579wireman.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f5579wireman.getPaddingLeft(), this.f5579wireman.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f5577marial.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void cutely(Drawable drawable) {
        Drawable drawable2 = this.f5577marial;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f5577marial = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f5579wireman);
            DrawableCompat.setLayoutDirection(drawable, this.f5579wireman.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f5579wireman.getDrawableState());
            }
            beachfront();
        }
        this.f5579wireman.invalidate();
    }

    @Override // androidx.appcompat.widget.formularize
    public void dern(AttributeSet attributeSet, int i) {
        super.dern(attributeSet, i);
        restrictive restrictiveVarDovishness = restrictive.dovishness(this.f5579wireman.getContext(), attributeSet, beachfront.cutely.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.f5579wireman;
        premeiotic.nosophobia(seekBar, seekBar.getContext(), beachfront.cutely.AppCompatSeekBar, attributeSet, restrictiveVarDovishness.polloi(), i, 0);
        Drawable drawableImpromptu = restrictiveVarDovishness.impromptu(beachfront.cutely.AppCompatSeekBar_android_thumb);
        if (drawableImpromptu != null) {
            this.f5579wireman.setThumb(drawableImpromptu);
        }
        cutely(restrictiveVarDovishness.competently(beachfront.cutely.AppCompatSeekBar_tickMark));
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatSeekBar_tickMarkTintMode)) {
            this.f5575competently = dovishness.marial(restrictiveVarDovishness.apical(beachfront.cutely.AppCompatSeekBar_tickMarkTintMode, -1), this.f5575competently);
            this.f5578taiyuan = true;
        }
        if (restrictiveVarDovishness.molybdenite(beachfront.cutely.AppCompatSeekBar_tickMarkTint)) {
            this.f5574beachfront = restrictiveVarDovishness.dern(beachfront.cutely.AppCompatSeekBar_tickMarkTint);
            this.f5576impromptu = true;
        }
        restrictiveVarDovishness.rotuma();
        beachfront();
    }

    public void impromptu() {
        Drawable drawable = this.f5577marial;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f5579wireman.getDrawableState())) {
            this.f5579wireman.invalidateDrawable(drawable);
        }
    }

    public void taiyuan() {
        Drawable drawable = this.f5577marial;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }
}
