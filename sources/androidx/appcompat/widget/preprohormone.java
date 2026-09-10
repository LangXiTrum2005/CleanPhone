package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: ForwardingListener.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class preprohormone implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f5537adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final int f5538arytenoidectomy;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f5539dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final int[] f5540gintrap = new int[2];

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public Runnable f5541graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final float f5542kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public Runnable f5543molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f5544monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final View f5545polloi;

    /* JADX INFO: compiled from: ForwardingListener.java */
    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = preprohormone.this.f5545polloi.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: ForwardingListener.java */
    public class saneness implements Runnable {
        public saneness() {
        }

        @Override // java.lang.Runnable
        public void run() {
            preprohormone.this.marial();
        }
    }

    public preprohormone(View view) {
        this.f5545polloi = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f5542kowloon = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f5538arytenoidectomy = tapTimeout;
        this.f5544monoploid = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean impromptu(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    public final void attabal() {
        Runnable runnable = this.f5541graveside;
        if (runnable != null) {
            this.f5545polloi.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f5543molybdenite;
        if (runnable2 != null) {
            this.f5545polloi.removeCallbacks(runnable2);
        }
    }

    public final boolean beachfront(MotionEvent motionEvent) {
        gintrap gintrapVar;
        View view = this.f5545polloi;
        androidx.appcompat.view.menu.triweekly triweeklyVarSaneness = saneness();
        if (triweeklyVarSaneness != null && triweeklyVarSaneness.attabal() && (gintrapVar = (gintrap) triweeklyVarSaneness.kowloon()) != null && gintrapVar.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            taiyuan(view, motionEventObtainNoHistory);
            cutely(gintrapVar, motionEventObtainNoHistory);
            boolean zOnForwardedEvent = gintrapVar.onForwardedEvent(motionEventObtainNoHistory, this.f5539dovishness);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zOnForwardedEvent && z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final boolean competently(MotionEvent motionEvent) {
        View view = this.f5545polloi;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5539dovishness = motionEvent.getPointerId(0);
            if (this.f5543molybdenite == null) {
                this.f5543molybdenite = new attabal();
            }
            view.postDelayed(this.f5543molybdenite, this.f5538arytenoidectomy);
            if (this.f5541graveside == null) {
                this.f5541graveside = new saneness();
            }
            view.postDelayed(this.f5541graveside, this.f5544monoploid);
        } else if (actionMasked == 1) {
            attabal();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f5539dovishness);
            if (iFindPointerIndex >= 0 && !impromptu(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f5542kowloon)) {
                attabal();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            attabal();
        }
        return false;
    }

    public final boolean cutely(View view, MotionEvent motionEvent) {
        int[] iArr = this.f5540gintrap;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract boolean dern();

    public void marial() {
        attabal();
        View view = this.f5545polloi;
        if (view.isEnabled() && !view.isLongClickable() && dern()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f5537adultoid = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f5537adultoid;
        if (z2) {
            z = beachfront(motionEvent) || !wireman();
        } else {
            z = competently(motionEvent) && dern();
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                this.f5545polloi.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f5537adultoid = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f5537adultoid = false;
        this.f5539dovishness = -1;
        Runnable runnable = this.f5543molybdenite;
        if (runnable != null) {
            this.f5545polloi.removeCallbacks(runnable);
        }
    }

    public abstract androidx.appcompat.view.menu.triweekly saneness();

    public final boolean taiyuan(View view, MotionEvent motionEvent) {
        int[] iArr = this.f5540gintrap;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public boolean wireman() {
        androidx.appcompat.view.menu.triweekly triweeklyVarSaneness = saneness();
        if (triweeklyVarSaneness == null || !triweeklyVarSaneness.attabal()) {
            return true;
        }
        triweeklyVarSaneness.dismiss();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
