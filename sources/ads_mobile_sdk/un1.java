package ads_mobile_sdk;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class un1 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    public final yj1 a;
    public final WeakReference b;

    public un1(yj1 nativeAdCore, WeakReference clickedView) {
        Intrinsics.checkNotNullParameter(nativeAdCore, "nativeAdCore");
        Intrinsics.checkNotNullParameter(clickedView, "clickedView");
        this.a = nativeAdCore;
        this.b = clickedView;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        int value;
        float x;
        int i;
        Intrinsics.checkNotNullParameter(e2, "e2");
        if (motionEvent == null) {
            return false;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            value = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? NativeAd.SwipeGestureDirection.RIGHT.getValue() : NativeAd.SwipeGestureDirection.LEFT.getValue();
        } else {
            if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    value = NativeAd.SwipeGestureDirection.UP.getValue();
                }
                return false;
            }
            value = NativeAd.SwipeGestureDirection.DOWN.getValue();
        }
        if (value != this.a.e()) {
            return false;
        }
        if (value != NativeAd.SwipeGestureDirection.RIGHT.getValue() && value != NativeAd.SwipeGestureDirection.LEFT.getValue()) {
            if (value == NativeAd.SwipeGestureDirection.UP.getValue() || value == NativeAd.SwipeGestureDirection.DOWN.getValue()) {
                x = (e2.getY() - motionEvent.getY()) / f2;
            } else {
                i = 0;
            }
            this.a.a((View) this.b.get(), i);
            return false;
        }
        x = (e2.getX() - motionEvent.getX()) / f;
        i = (int) (x * 1000);
        this.a.a((View) this.b.get(), i);
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent e2, float f, float f2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.a.d()) {
            return false;
        }
        this.a.c();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "e");
        return false;
    }
}
