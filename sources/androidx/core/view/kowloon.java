package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: DifferentialMotionFlingController.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f9355attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public float f9356beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f9357competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public final int[] f9358cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness f9359dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f9360impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public VelocityTracker f9361marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final arytenoidectomy f9362saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f9363taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final attabal f9364wireman;

    /* JADX INFO: compiled from: DifferentialMotionFlingController.java */
    public interface attabal {
        float attabal(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    /* JADX INFO: compiled from: DifferentialMotionFlingController.java */
    public interface saneness {
        void attabal(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public kowloon(Context context, arytenoidectomy arytenoidectomyVar) {
        this(context, arytenoidectomyVar, new saneness() { // from class: androidx.core.view.impassible
            @Override // androidx.core.view.kowloon.saneness
            public final void attabal(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                kowloon.dern(context2, iArr, motionEvent, i);
            }
        }, new attabal() { // from class: androidx.core.view.triweekly
            @Override // androidx.core.view.kowloon.attabal
            public final float attabal(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return kowloon.beachfront(velocityTracker, motionEvent, i);
            }
        });
    }

    public static float beachfront(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        dent.attabal(velocityTracker, motionEvent);
        dent.saneness(velocityTracker, 1000);
        return dent.wireman(velocityTracker, i);
    }

    public static void dern(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = treadless.taiyuan(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = treadless.impromptu(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public void competently(MotionEvent motionEvent, int i) {
        boolean zWireman = wireman(motionEvent, i);
        if (this.f9358cutely[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f9361marial;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9361marial = null;
                return;
            }
            return;
        }
        float fMarial = marial(motionEvent, i) * this.f9362saneness.saneness();
        float fSignum = Math.signum(fMarial);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (zWireman || (fSignum != Math.signum(this.f9356beachfront) && fSignum != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            this.f9362saneness.dern();
        }
        float fAbs = Math.abs(fMarial);
        int[] iArr = this.f9358cutely;
        if (fAbs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float fMax = Math.max(-i2, Math.min(fMarial, i2));
        if (this.f9362saneness.attabal(fMax)) {
            f = fMax;
        }
        this.f9356beachfront = f;
    }

    public final float marial(MotionEvent motionEvent, int i) {
        if (this.f9361marial == null) {
            this.f9361marial = VelocityTracker.obtain();
        }
        return this.f9364wireman.attabal(this.f9361marial, motionEvent, i);
    }

    public final boolean wireman(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f9360impromptu == source && this.f9363taiyuan == deviceId && this.f9357competently == i) {
            return false;
        }
        this.f9359dern.attabal(this.f9355attabal, this.f9358cutely, motionEvent, i);
        this.f9360impromptu = source;
        this.f9363taiyuan = deviceId;
        this.f9357competently = i;
        return true;
    }

    public kowloon(Context context, arytenoidectomy arytenoidectomyVar, saneness sanenessVar, attabal attabalVar) {
        this.f9357competently = -1;
        this.f9360impromptu = -1;
        this.f9363taiyuan = -1;
        this.f9358cutely = new int[]{Integer.MAX_VALUE, 0};
        this.f9355attabal = context;
        this.f9362saneness = arytenoidectomyVar;
        this.f9359dern = sanenessVar;
        this.f9364wireman = attabalVar;
    }
}
