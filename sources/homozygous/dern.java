package homozygous;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.premeiotic;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: ViewDragHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final Interpolator f27891rotuma = new attabal();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f27892adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f27893apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f27894arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f27895attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float[] f27896beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float[] f27897competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int[] f27898cutely;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final ViewGroup f27900dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public VelocityTracker f27901formularize;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public View f27903graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f27904impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int[] f27905impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f27906kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public float[] f27907marial;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final AbstractC0636dern f27908molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f27909monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public OverScroller f27910polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f27911saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int[] f27912taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f27913triweekly;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public float[] f27914wireman;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f27899dern = -1;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final Runnable f27902gintrap = new saneness();

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class attabal implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: ViewDragHelper.java */
    public class saneness implements Runnable {
        public saneness() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dern.this.polder(0);
        }
    }

    public dern(Context context, ViewGroup viewGroup, AbstractC0636dern abstractC0636dern) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0636dern == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f27900dovishness = viewGroup;
        this.f27908molybdenite = abstractC0636dern;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f27894arytenoidectomy = i;
        this.f27906kowloon = i;
        this.f27911saneness = viewConfiguration.getScaledTouchSlop();
        this.f27904impassible = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f27913triweekly = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f27910polloi = new OverScroller(context, f27891rotuma);
    }

    public static dern kowloon(ViewGroup viewGroup, AbstractC0636dern abstractC0636dern) {
        return new dern(viewGroup.getContext(), viewGroup, abstractC0636dern);
    }

    public static dern triweekly(ViewGroup viewGroup, float f, AbstractC0636dern abstractC0636dern) {
        dern dernVarKowloon = kowloon(viewGroup, abstractC0636dern);
        dernVarKowloon.f27911saneness = (int) (dernVarKowloon.f27911saneness * (1.0f / f));
        return dernVarKowloon;
    }

    public final boolean adultoid(int i, int i2, int i3, int i4) {
        int left = this.f27903graveside.getLeft();
        int top = this.f27903graveside.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f27910polloi.abortAnimation();
            polder(0);
            return false;
        }
        this.f27910polloi.startScroll(left, top, i5, i6, formularize(this.f27903graveside, i5, i6, i3, i4));
        polder(2);
        return true;
    }

    public final int apical(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f27900dovishness.getWidth();
        float f = width / 2;
        float fMonoploid = f + (monoploid(Math.min(1.0f, Math.abs(i) / width)) * f);
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fMonoploid / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final void arytenoidectomy(float f, float f2) {
        this.f27892adultoid = true;
        this.f27908molybdenite.formularize(this.f27903graveside, f, f2);
        this.f27892adultoid = false;
        if (this.f27895attabal == 1) {
            polder(0);
        }
    }

    public void attabal() {
        this.f27899dern = -1;
        taiyuan();
        VelocityTracker velocityTracker = this.f27901formularize;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27901formularize = null;
        }
    }

    public final boolean beachfront(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f27908molybdenite.wireman(view) > 0;
        boolean z2 = this.f27908molybdenite.marial(view) > 0;
        if (z && z2) {
            float f3 = (f * f) + (f2 * f2);
            int i = this.f27911saneness;
            return f3 > ((float) (i * i));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f27911saneness);
        }
        return z2 && Math.abs(f2) > ((float) this.f27911saneness);
    }

    public final float competently(float f, float f2, float f3) {
        float fAbs = Math.abs(f);
        if (fAbs < f2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (fAbs > f3) {
            return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f3 : -f3;
        }
        return f;
    }

    public int cord() {
        return this.f27911saneness;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    public boolean creditor(MotionEvent motionEvent) {
        View viewGraveside;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            attabal();
        }
        if (this.f27901formularize == null) {
            this.f27901formularize = VelocityTracker.obtain();
        }
        this.f27901formularize.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            restrictive(x, y, pointerId);
            View viewGraveside2 = graveside((int) x, (int) y);
            if (viewGraveside2 == this.f27903graveside && this.f27895attabal == 2) {
                hydrovane(viewGraveside2, pointerId);
            }
            int i = this.f27905impromptu[pointerId];
            int i2 = this.f27909monoploid;
            if ((i & i2) != 0) {
                this.f27908molybdenite.impromptu(i & i2, pointerId);
            }
        } else if (actionMasked == 1) {
            attabal();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                attabal();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                restrictive(x2, y2, pointerId2);
                int i3 = this.f27895attabal;
                if (i3 == 0) {
                    int i4 = this.f27905impromptu[pointerId2];
                    int i5 = this.f27909monoploid;
                    if ((i4 & i5) != 0) {
                        this.f27908molybdenite.impromptu(i4 & i5, pointerId2);
                    }
                } else if (i3 == 2 && (viewGraveside = graveside((int) x2, (int) y2)) == this.f27903graveside) {
                    hydrovane(viewGraveside, pointerId2);
                }
            } else if (actionMasked == 6) {
                cutely(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f27914wireman != null && this.f27907marial != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i6 = 0; i6 < pointerCount; i6++) {
                int pointerId3 = motionEvent.getPointerId(i6);
                if (oilcan(pointerId3)) {
                    float x3 = motionEvent.getX(i6);
                    float y3 = motionEvent.getY(i6);
                    float f = x3 - this.f27914wireman[pointerId3];
                    float f2 = y3 - this.f27907marial[pointerId3];
                    View viewGraveside3 = graveside((int) x3, (int) y3);
                    boolean z = viewGraveside3 != null && beachfront(viewGraveside3, f, f2);
                    if (!z) {
                        supplicat(f, f2, pointerId3);
                        if (this.f27895attabal != 1) {
                            break;
                        }
                    } else {
                        int left = viewGraveside3.getLeft();
                        int i7 = (int) f;
                        int iAttabal = this.f27908molybdenite.attabal(viewGraveside3, left + i7, i7);
                        int top = viewGraveside3.getTop();
                        int i8 = (int) f2;
                        int iSaneness = this.f27908molybdenite.saneness(viewGraveside3, top + i8, i8);
                        int iWireman = this.f27908molybdenite.wireman(viewGraveside3);
                        int iMarial = this.f27908molybdenite.marial(viewGraveside3);
                        if ((iWireman == 0 || (iWireman > 0 && iAttabal == left)) && (iMarial == 0 || (iMarial > 0 && iSaneness == top))) {
                            break;
                        }
                        supplicat(f, f2, pointerId3);
                        if (this.f27895attabal != 1 || (z && hydrovane(viewGraveside3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            merc(motionEvent);
        }
        return this.f27895attabal == 1;
    }

    public int cuirassed() {
        return this.f27895attabal;
    }

    public final void cutely(int i) {
        if (this.f27914wireman == null || !trm(i)) {
            return;
        }
        this.f27914wireman[i] = 0.0f;
        this.f27907marial[i] = 0.0f;
        this.f27896beachfront[i] = 0.0f;
        this.f27897competently[i] = 0.0f;
        this.f27905impromptu[i] = 0;
        this.f27912taiyuan[i] = 0;
        this.f27898cutely[i] = 0;
        this.f27893apical = (~(1 << i)) & this.f27893apical;
    }

    public final boolean dern(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.f27905impromptu[i] & i2) == i2 && (this.f27909monoploid & i2) != 0 && (this.f27898cutely[i] & i2) != i2 && (this.f27912taiyuan[i] & i2) != i2) {
            int i3 = this.f27911saneness;
            if (fAbs > i3 || fAbs2 > i3) {
                if (fAbs < fAbs2 * 0.5f && this.f27908molybdenite.competently(i2)) {
                    int[] iArr = this.f27898cutely;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.f27912taiyuan[i] & i2) == 0 && fAbs > this.f27911saneness) {
                    return true;
                }
            }
        }
        return false;
    }

    public View dovishness() {
        return this.f27903graveside;
    }

    public final int formularize(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int iImpromptu = impromptu(i3, (int) this.f27913triweekly, (int) this.f27904impassible);
        int iImpromptu2 = impromptu(i4, (int) this.f27913triweekly, (int) this.f27904impassible);
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        int iAbs3 = Math.abs(iImpromptu);
        int iAbs4 = Math.abs(iImpromptu2);
        int i5 = iAbs3 + iAbs4;
        int i6 = iAbs + iAbs2;
        if (iImpromptu != 0) {
            f = iAbs3;
            f2 = i5;
        } else {
            f = iAbs;
            f2 = i6;
        }
        float f5 = f / f2;
        if (iImpromptu2 != 0) {
            f3 = iAbs4;
            f4 = i5;
        } else {
            f3 = iAbs2;
            f4 = i6;
        }
        return (int) ((apical(i, iImpromptu, this.f27908molybdenite.wireman(view)) * f5) + (apical(i2, iImpromptu2, this.f27908molybdenite.marial(view)) * (f3 / f4)));
    }

    public int gintrap() {
        return this.f27894arytenoidectomy;
    }

    public View graveside(int i, int i2) {
        for (int childCount = this.f27900dovishness.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f27900dovishness.getChildAt(this.f27908molybdenite.dern(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void grimness(int i) {
        this.f27909monoploid = i;
    }

    public boolean hydrovane(View view, int i) {
        if (view == this.f27903graveside && this.f27899dern == i) {
            return true;
        }
        if (view == null || !this.f27908molybdenite.impassible(view, i)) {
            return false;
        }
        this.f27899dern = i;
        saneness(view, i);
        return true;
    }

    public boolean impassible(boolean z) {
        if (this.f27895attabal == 2) {
            boolean zComputeScrollOffset = this.f27910polloi.computeScrollOffset();
            int currX = this.f27910polloi.getCurrX();
            int currY = this.f27910polloi.getCurrY();
            int left = currX - this.f27903graveside.getLeft();
            int top = currY - this.f27903graveside.getTop();
            if (left != 0) {
                premeiotic.mathsort(this.f27903graveside, left);
            }
            if (top != 0) {
                premeiotic.splinterproof(this.f27903graveside, top);
            }
            if (left != 0 || top != 0) {
                this.f27908molybdenite.apical(this.f27903graveside, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f27910polloi.getFinalX() && currY == this.f27910polloi.getFinalY()) {
                this.f27910polloi.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z) {
                    this.f27900dovishness.post(this.f27902gintrap);
                } else {
                    polder(0);
                }
            }
        }
        return this.f27895attabal == 2;
    }

    public final int impromptu(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    public final void kattegat() {
        this.f27901formularize.computeCurrentVelocity(1000, this.f27904impassible);
        arytenoidectomy(competently(this.f27901formularize.getXVelocity(this.f27899dern), this.f27913triweekly, this.f27904impassible), competently(this.f27901formularize.getYVelocity(this.f27899dern), this.f27913triweekly, this.f27904impassible));
    }

    public boolean marial(int i, int i2) {
        if (!trm(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f27896beachfront[i2] - this.f27914wireman[i2];
        float f2 = this.f27897competently[i2] - this.f27907marial[i2];
        if (z && z2) {
            float f3 = (f * f) + (f2 * f2);
            int i3 = this.f27911saneness;
            return f3 > ((float) (i3 * i3));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f27911saneness);
        }
        return z2 && Math.abs(f2) > ((float) this.f27911saneness);
    }

    public final void merc(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (oilcan(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f27896beachfront[pointerId] = x;
                this.f27897competently[pointerId] = y;
            }
        }
    }

    public final void molybdenite(int i) {
        float[] fArr = this.f27914wireman;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f27907marial;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f27896beachfront;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f27897competently;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f27905impromptu;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f27912taiyuan;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f27898cutely;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f27914wireman = fArr2;
            this.f27907marial = fArr3;
            this.f27896beachfront = fArr4;
            this.f27897competently = fArr5;
            this.f27905impromptu = iArr;
            this.f27912taiyuan = iArr2;
            this.f27898cutely = iArr3;
        }
    }

    public final float monoploid(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public final boolean oilcan(int i) {
        return trm(i);
    }

    public void polder(int i) {
        this.f27900dovishness.removeCallbacks(this.f27902gintrap);
        if (this.f27895attabal != i) {
            this.f27895attabal = i;
            this.f27908molybdenite.cutely(i);
            if (this.f27895attabal == 0) {
                this.f27903graveside = null;
            }
        }
    }

    public final void polloi(int i, int i2, int i3, int i4) {
        int left = this.f27903graveside.getLeft();
        int top = this.f27903graveside.getTop();
        if (i3 != 0) {
            i = this.f27908molybdenite.attabal(this.f27903graveside, i, i3);
            premeiotic.mathsort(this.f27903graveside, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f27908molybdenite.saneness(this.f27903graveside, i2, i4);
            premeiotic.splinterproof(this.f27903graveside, i2 - top);
        }
        int i6 = i2;
        if (i3 == 0 && i4 == 0) {
            return;
        }
        this.f27908molybdenite.apical(this.f27903graveside, i5, i6, i5 - left, i6 - top);
    }

    public final int preprohormone(int i, int i2) {
        int i3 = i < this.f27900dovishness.getLeft() + this.f27906kowloon ? 1 : 0;
        if (i2 < this.f27900dovishness.getTop() + this.f27906kowloon) {
            i3 |= 4;
        }
        if (i > this.f27900dovishness.getRight() - this.f27906kowloon) {
            i3 |= 2;
        }
        return i2 > this.f27900dovishness.getBottom() - this.f27906kowloon ? i3 | 8 : i3;
    }

    public boolean privatdozent(int i, int i2) {
        if (this.f27892adultoid) {
            return adultoid(i, i2, (int) this.f27901formularize.getXVelocity(this.f27899dern), (int) this.f27901formularize.getYVelocity(this.f27899dern));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final void restrictive(float f, float f2, int i) {
        molybdenite(i);
        float[] fArr = this.f27914wireman;
        this.f27896beachfront[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f27907marial;
        this.f27897competently[i] = f2;
        fArr2[i] = f2;
        this.f27905impromptu[i] = preprohormone((int) f, (int) f2);
        this.f27893apical |= 1 << i;
    }

    public int rotuma() {
        return this.f27906kowloon;
    }

    public void saneness(View view, int i) {
        if (view.getParent() == this.f27900dovishness) {
            this.f27903graveside = view;
            this.f27899dern = i;
            this.f27908molybdenite.taiyuan(view, i);
            polder(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f27900dovishness + ")");
    }

    public void saran(float f) {
        this.f27913triweekly = f;
    }

    public void sealless(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            attabal();
        }
        if (this.f27901formularize == null) {
            this.f27901formularize = VelocityTracker.obtain();
        }
        this.f27901formularize.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewGraveside = graveside((int) x, (int) y);
            restrictive(x, y, pointerId);
            hydrovane(viewGraveside, pointerId);
            int i3 = this.f27905impromptu[pointerId];
            int i4 = this.f27909monoploid;
            if ((i3 & i4) != 0) {
                this.f27908molybdenite.impromptu(i3 & i4, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f27895attabal == 1) {
                kattegat();
            }
            attabal();
            return;
        }
        if (actionMasked == 2) {
            if (this.f27895attabal == 1) {
                if (oilcan(this.f27899dern)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f27899dern);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f27896beachfront;
                    int i5 = this.f27899dern;
                    int i6 = (int) (x2 - fArr[i5]);
                    int i7 = (int) (y2 - this.f27897competently[i5]);
                    polloi(this.f27903graveside.getLeft() + i6, this.f27903graveside.getTop() + i7, i6, i7);
                    merc(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i2 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i2);
                if (oilcan(pointerId2)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f27914wireman[pointerId2];
                    float f2 = y3 - this.f27907marial[pointerId2];
                    supplicat(f, f2, pointerId2);
                    if (this.f27895attabal != 1) {
                        View viewGraveside2 = graveside((int) x3, (int) y3);
                        if (beachfront(viewGraveside2, f, f2) && hydrovane(viewGraveside2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            merc(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f27895attabal == 1) {
                arytenoidectomy(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            attabal();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            restrictive(x4, y4, pointerId3);
            if (this.f27895attabal != 0) {
                if (stratoscope((int) x4, (int) y4)) {
                    hydrovane(this.f27903graveside, pointerId3);
                    return;
                }
                return;
            } else {
                hydrovane(graveside((int) x4, (int) y4), pointerId3);
                int i8 = this.f27905impromptu[pointerId3];
                int i9 = this.f27909monoploid;
                if ((i8 & i9) != 0) {
                    this.f27908molybdenite.impromptu(i8 & i9, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f27895attabal == 1 && pointerId4 == this.f27899dern) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.f27899dern) {
                    View viewGraveside3 = graveside((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.f27903graveside;
                    if (viewGraveside3 == view && hydrovane(view, pointerId5)) {
                        i = this.f27899dern;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                kattegat();
            }
        }
        cutely(pointerId4);
    }

    public void seminary(int i) {
        this.f27906kowloon = i;
    }

    public boolean starveling(View view, int i, int i2) {
        this.f27903graveside = view;
        this.f27899dern = -1;
        boolean zAdultoid = adultoid(i, i2, 0, 0);
        if (!zAdultoid && this.f27895attabal == 0 && this.f27903graveside != null) {
            this.f27903graveside = null;
        }
        return zAdultoid;
    }

    public boolean stratoscope(int i, int i2) {
        return yemenite(this.f27903graveside, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [homozygous.dern$dern] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void supplicat(float f, float f2, int i) {
        int i2;
        boolean zDern = dern(f, f2, i, 1);
        ?? r0 = zDern;
        if (dern(f2, f, i, 4)) {
            r0 = (zDern ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (dern(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (dern(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.f27912taiyuan;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.f27908molybdenite.beachfront(r2, i);
    }

    public final void taiyuan() {
        float[] fArr = this.f27914wireman;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f27907marial, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f27896beachfront, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f27897competently, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Arrays.fill(this.f27905impromptu, 0);
        Arrays.fill(this.f27912taiyuan, 0);
        Arrays.fill(this.f27898cutely, 0);
        this.f27893apical = 0;
    }

    public boolean trm(int i) {
        return ((1 << i) & this.f27893apical) != 0;
    }

    public boolean wireman(int i) {
        int length = this.f27914wireman.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (marial(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public boolean yemenite(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* JADX INFO: renamed from: homozygous.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ViewDragHelper.java */
    public static abstract class AbstractC0636dern {
        public abstract void apical(View view, int i, int i2, int i3, int i4);

        public abstract int attabal(View view, int i, int i2);

        public boolean competently(int i) {
            return false;
        }

        public abstract void cutely(int i);

        public abstract void formularize(View view, float f, float f2);

        public abstract boolean impassible(View view, int i);

        public int marial(View view) {
            return 0;
        }

        public abstract int saneness(View view, int i, int i2);

        public int wireman(View view) {
            return 0;
        }

        public int dern(int i) {
            return i;
        }

        public void beachfront(int i, int i2) {
        }

        public void impromptu(int i, int i2) {
        }

        public void taiyuan(View view, int i) {
        }
    }
}
