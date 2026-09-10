package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.premeiotic;
import com.ironsource.Sd;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: FastScroller.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman extends RecyclerView.triweekly implements RecyclerView.polloi {

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final int[] f13486oilcan = {R.attr.state_pressed};

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final int[] f13487yemenite = new int[0];

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f13489apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f13490arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f13491attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final int f13492beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final StateListDrawable f13493competently;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public final ValueAnimator f13494cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f13495cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int f13496cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final StateListDrawable f13497dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f13499formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f13502impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final Drawable f13503impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f13504kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f13505marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public RecyclerView f13506molybdenite;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f13511saneness;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final Runnable f13512stratoscope;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final int f13513taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f13514triweekly;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public final RecyclerView.OnScrollListener f13515trm;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Drawable f13516wireman;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f13507monoploid = 0;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f13508polloi = 0;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public boolean f13501graveside = false;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f13488adultoid = false;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f13498dovishness = 0;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f13500gintrap = 0;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final int[] f13510rotuma = new int[2];

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final int[] f13509preprohormone = new int[2];

    /* JADX INFO: compiled from: FastScroller.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wireman.this.apical(500);
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class dern extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f13518attabal = false;

        public dern() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13518attabal = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f13518attabal) {
                this.f13518attabal = false;
                return;
            }
            if (((Float) wireman.this.f13494cord.getAnimatedValue()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                wireman wiremanVar = wireman.this;
                wiremanVar.f13495cuirassed = 0;
                wiremanVar.molybdenite(0);
            } else {
                wireman wiremanVar2 = wireman.this;
                wiremanVar2.f13495cuirassed = 2;
                wiremanVar2.arytenoidectomy();
            }
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    public class saneness extends RecyclerView.OnScrollListener {
        public saneness() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            wireman.this.dovishness(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.wireman$wireman, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FastScroller.java */
    public class C0099wireman implements ValueAnimator.AnimatorUpdateListener {
        public C0099wireman() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            wireman.this.f13497dern.setAlpha(iFloatValue);
            wireman.this.f13516wireman.setAlpha(iFloatValue);
            wireman.this.arytenoidectomy();
        }
    }

    public wireman(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.f13494cord = valueAnimatorOfFloat;
        this.f13495cuirassed = 0;
        this.f13512stratoscope = new attabal();
        this.f13515trm = new saneness();
        this.f13497dern = stateListDrawable;
        this.f13516wireman = drawable;
        this.f13493competently = stateListDrawable2;
        this.f13503impromptu = drawable2;
        this.f13505marial = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f13492beachfront = Math.max(i, drawable.getIntrinsicWidth());
        this.f13513taiyuan = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f13496cutely = Math.max(i, drawable2.getIntrinsicWidth());
        this.f13491attabal = i2;
        this.f13511saneness = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new dern());
        valueAnimatorOfFloat.addUpdateListener(new C0099wireman());
        wireman(recyclerView);
    }

    public void adultoid() {
        int i = this.f13495cuirassed;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.f13494cord.cancel();
            }
        }
        this.f13495cuirassed = 1;
        ValueAnimator valueAnimator = this.f13494cord;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f13494cord.setDuration(500L);
        this.f13494cord.setStartDelay(0L);
        this.f13494cord.start();
    }

    public void apical(int i) {
        int i2 = this.f13495cuirassed;
        if (i2 == 1) {
            this.f13494cord.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f13495cuirassed = 3;
        ValueAnimator valueAnimator = this.f13494cord;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f13494cord.setDuration(i);
        this.f13494cord.start();
    }

    public void arytenoidectomy() {
        this.f13506molybdenite.invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.polloi
    public void attabal(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f13498dovishness == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zKowloon = kowloon(motionEvent.getX(), motionEvent.getY());
            boolean zTriweekly = triweekly(motionEvent.getX(), motionEvent.getY());
            if (zKowloon || zTriweekly) {
                if (zTriweekly) {
                    this.f13500gintrap = 1;
                    this.f13490arytenoidectomy = (int) motionEvent.getX();
                } else if (zKowloon) {
                    this.f13500gintrap = 2;
                    this.f13502impassible = (int) motionEvent.getY();
                }
                molybdenite(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f13498dovishness == 2) {
            this.f13502impassible = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f13490arytenoidectomy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            molybdenite(1);
            this.f13500gintrap = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f13498dovishness == 2) {
            adultoid();
            if (this.f13500gintrap == 1) {
                formularize(motionEvent.getX());
            }
            if (this.f13500gintrap == 2) {
                gintrap(motionEvent.getY());
            }
        }
    }

    public final void beachfront() {
        this.f13506molybdenite.removeItemDecoration(this);
        this.f13506molybdenite.removeOnItemTouchListener(this);
        this.f13506molybdenite.removeOnScrollListener(this.f13515trm);
        marial();
    }

    public final void competently(Canvas canvas) {
        int i = this.f13508polloi;
        int i2 = this.f13513taiyuan;
        int i3 = i - i2;
        int i4 = this.f13504kowloon;
        int i5 = this.f13514triweekly;
        int i6 = i4 - (i5 / 2);
        this.f13493competently.setBounds(0, 0, i5, i2);
        this.f13503impromptu.setBounds(0, 0, this.f13507monoploid, this.f13496cutely);
        canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3);
        this.f13503impromptu.draw(canvas);
        canvas.translate(i6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f13493competently.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    public final int[] cutely() {
        int[] iArr = this.f13510rotuma;
        int i = this.f13511saneness;
        iArr[0] = i;
        iArr[1] = this.f13508polloi - i;
        return iArr;
    }

    public void dovishness(int i, int i2) {
        int iComputeVerticalScrollRange = this.f13506molybdenite.computeVerticalScrollRange();
        int i3 = this.f13508polloi;
        this.f13501graveside = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.f13491attabal;
        int iComputeHorizontalScrollRange = this.f13506molybdenite.computeHorizontalScrollRange();
        int i4 = this.f13507monoploid;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.f13491attabal;
        this.f13488adultoid = z;
        boolean z2 = this.f13501graveside;
        if (!z2 && !z) {
            if (this.f13498dovishness != 0) {
                molybdenite(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f13499formularize = (int) ((f * (i2 + (f / 2.0f))) / iComputeVerticalScrollRange);
            this.f13489apical = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f13488adultoid) {
            float f2 = i4;
            this.f13504kowloon = (int) ((f2 * (i + (f2 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f13514triweekly = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.f13498dovishness;
        if (i5 == 0 || i5 == 1) {
            molybdenite(1);
        }
    }

    public final void formularize(float f) {
        int[] iArrTaiyuan = taiyuan();
        float fMax = Math.max(iArrTaiyuan[0], Math.min(iArrTaiyuan[1], f));
        if (Math.abs(this.f13504kowloon - fMax) < 2.0f) {
            return;
        }
        int iPolloi = polloi(this.f13490arytenoidectomy, fMax, iArrTaiyuan, this.f13506molybdenite.computeHorizontalScrollRange(), this.f13506molybdenite.computeHorizontalScrollOffset(), this.f13507monoploid);
        if (iPolloi != 0) {
            this.f13506molybdenite.scrollBy(iPolloi, 0);
        }
        this.f13490arytenoidectomy = fMax;
    }

    public final void gintrap(float f) {
        int[] iArrCutely = cutely();
        float fMax = Math.max(iArrCutely[0], Math.min(iArrCutely[1], f));
        if (Math.abs(this.f13499formularize - fMax) < 2.0f) {
            return;
        }
        int iPolloi = polloi(this.f13502impassible, fMax, iArrCutely, this.f13506molybdenite.computeVerticalScrollRange(), this.f13506molybdenite.computeVerticalScrollOffset(), this.f13508polloi);
        if (iPolloi != 0) {
            this.f13506molybdenite.scrollBy(0, iPolloi);
        }
        this.f13502impassible = fMax;
    }

    public final void graveside() {
        this.f13506molybdenite.addItemDecoration(this);
        this.f13506molybdenite.addOnItemTouchListener(this);
        this.f13506molybdenite.addOnScrollListener(this.f13515trm);
    }

    public final boolean impassible() {
        return premeiotic.cord(this.f13506molybdenite) == 1;
    }

    public final void impromptu(Canvas canvas) {
        int i = this.f13507monoploid;
        int i2 = this.f13505marial;
        int i3 = i - i2;
        int i4 = this.f13499formularize;
        int i5 = this.f13489apical;
        int i6 = i4 - (i5 / 2);
        this.f13497dern.setBounds(0, 0, i2, i5);
        this.f13516wireman.setBounds(0, 0, this.f13492beachfront, this.f13508polloi);
        if (!impassible()) {
            canvas.translate(i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f13516wireman.draw(canvas);
            canvas.translate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i6);
            this.f13497dern.draw(canvas);
            canvas.translate(-i3, -i6);
            return;
        }
        this.f13516wireman.draw(canvas);
        canvas.translate(this.f13505marial, i6);
        canvas.scale(-1.0f, 1.0f);
        this.f13497dern.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f13505marial, -i6);
    }

    public boolean kowloon(float f, float f2) {
        if (impassible()) {
            if (f > this.f13505marial) {
                return false;
            }
        } else if (f < this.f13507monoploid - this.f13505marial) {
            return false;
        }
        int i = this.f13499formularize;
        int i2 = this.f13489apical;
        return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
    }

    public final void marial() {
        this.f13506molybdenite.removeCallbacks(this.f13512stratoscope);
    }

    public void molybdenite(int i) {
        if (i == 2 && this.f13498dovishness != 2) {
            this.f13497dern.setState(f13486oilcan);
            marial();
        }
        if (i == 0) {
            arytenoidectomy();
        } else {
            adultoid();
        }
        if (this.f13498dovishness == 2 && i != 2) {
            this.f13497dern.setState(f13487yemenite);
            monoploid(Sd.c.d);
        } else if (i == 1) {
            monoploid(1500);
        }
        this.f13498dovishness = i;
    }

    public final void monoploid(int i) {
        marial();
        this.f13506molybdenite.postDelayed(this.f13512stratoscope, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.triweekly
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.rotuma rotumaVar) {
        if (this.f13507monoploid != this.f13506molybdenite.getWidth() || this.f13508polloi != this.f13506molybdenite.getHeight()) {
            this.f13507monoploid = this.f13506molybdenite.getWidth();
            this.f13508polloi = this.f13506molybdenite.getHeight();
            molybdenite(0);
        } else if (this.f13495cuirassed != 0) {
            if (this.f13501graveside) {
                impromptu(canvas);
            }
            if (this.f13488adultoid) {
                competently(canvas);
            }
        }
    }

    public final int polloi(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.polloi
    public boolean saneness(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f13498dovishness;
        if (i != 1) {
            return i == 2;
        }
        boolean zKowloon = kowloon(motionEvent.getX(), motionEvent.getY());
        boolean zTriweekly = triweekly(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zKowloon && !zTriweekly)) {
            return false;
        }
        if (zTriweekly) {
            this.f13500gintrap = 1;
            this.f13490arytenoidectomy = (int) motionEvent.getX();
        } else if (zKowloon) {
            this.f13500gintrap = 2;
            this.f13502impassible = (int) motionEvent.getY();
        }
        molybdenite(2);
        return true;
    }

    public final int[] taiyuan() {
        int[] iArr = this.f13509preprohormone;
        int i = this.f13511saneness;
        iArr[0] = i;
        iArr[1] = this.f13507monoploid - i;
        return iArr;
    }

    public boolean triweekly(float f, float f2) {
        if (f2 < this.f13508polloi - this.f13513taiyuan) {
            return false;
        }
        int i = this.f13504kowloon;
        int i2 = this.f13514triweekly;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
    }

    public void wireman(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f13506molybdenite;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            beachfront();
        }
        this.f13506molybdenite = recyclerView;
        if (recyclerView != null) {
            graveside();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.polloi
    public void dern(boolean z) {
    }
}
