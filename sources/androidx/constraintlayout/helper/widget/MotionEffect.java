package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import sensatory.wireman;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public boolean f8417kattegat;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f8418oilcan;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f8419restrictive;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f8420sealless;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public float f8421stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public int f8422supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public int f8423trm;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f8424yemenite;

    public MotionEffect(Context context) {
        super(context);
        this.f8421stratoscope = 0.1f;
        this.f8423trm = 49;
        this.f8418oilcan = 50;
        this.f8424yemenite = 0;
        this.f8420sealless = 0;
        this.f8417kattegat = true;
        this.f8422supplicat = -1;
        this.f8419restrictive = -1;
    }

    private void yemenite(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wireman.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f8423trm);
                    this.f8423trm = i2;
                    this.f8423trm = Math.max(Math.min(i2, 99), 0);
                } else if (index == wireman.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f8418oilcan);
                    this.f8418oilcan = i3;
                    this.f8418oilcan = Math.max(Math.min(i3, 99), 0);
                } else if (index == wireman.MotionEffect_motionEffect_translationX) {
                    this.f8424yemenite = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8424yemenite);
                } else if (index == wireman.MotionEffect_motionEffect_translationY) {
                    this.f8420sealless = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8420sealless);
                } else if (index == wireman.MotionEffect_motionEffect_alpha) {
                    this.f8421stratoscope = typedArrayObtainStyledAttributes.getFloat(index, this.f8421stratoscope);
                } else if (index == wireman.MotionEffect_motionEffect_move) {
                    this.f8419restrictive = typedArrayObtainStyledAttributes.getInt(index, this.f8419restrictive);
                } else if (index == wireman.MotionEffect_motionEffect_strict) {
                    this.f8417kattegat = typedArrayObtainStyledAttributes.getBoolean(index, this.f8417kattegat);
                } else if (index == wireman.MotionEffect_motionEffect_viewTransition) {
                    this.f8422supplicat = typedArrayObtainStyledAttributes.getResourceId(index, this.f8422supplicat);
                }
            }
            int i4 = this.f8423trm;
            int i5 = this.f8418oilcan;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f8423trm = i4 - 1;
                } else {
                    this.f8418oilcan = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cc  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0169, code lost:
    
        if (r14 == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017f, code lost:
    
        if (r14 == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (r15 == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L59;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void oilcan(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, czestochowa.impassible> r24) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.oilcan(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean rotuma() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8421stratoscope = 0.1f;
        this.f8423trm = 49;
        this.f8418oilcan = 50;
        this.f8424yemenite = 0;
        this.f8420sealless = 0;
        this.f8417kattegat = true;
        this.f8422supplicat = -1;
        this.f8419restrictive = -1;
        yemenite(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8421stratoscope = 0.1f;
        this.f8423trm = 49;
        this.f8418oilcan = 50;
        this.f8424yemenite = 0;
        this.f8420sealless = 0;
        this.f8417kattegat = true;
        this.f8422supplicat = -1;
        this.f8419restrictive = -1;
        yemenite(context, attributeSet);
    }
}
