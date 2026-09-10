package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import sensatory.wireman;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public float f8345creditor;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public int f8346grimness;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public int f8347hydrovane;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public boolean f8348kattegat;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public int f8349merc;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f8350oilcan;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public Runnable f8351peridotite;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public int f8352polder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public int f8353privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f8354restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public int f8355saran;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f8356sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public float f8357seminary;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public int f8358starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public final ArrayList<View> f8359stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public int f8360supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public int f8361trm;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public int f8362walach;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public MotionLayout f8363yemenite;

    public class attabal implements Runnable {
        public attabal() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.f8363yemenite.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Carousel.this.merc();
            Carousel.supplicat(Carousel.this);
            int unused = Carousel.this.f8350oilcan;
            throw null;
        }
    }

    public interface saneness {
    }

    public Carousel(Context context) {
        super(context);
        this.f8359stratoscope = new ArrayList<>();
        this.f8361trm = 0;
        this.f8350oilcan = 0;
        this.f8356sealless = -1;
        this.f8348kattegat = false;
        this.f8360supplicat = -1;
        this.f8354restrictive = -1;
        this.f8349merc = -1;
        this.f8352polder = -1;
        this.f8357seminary = 0.9f;
        this.f8346grimness = 0;
        this.f8355saran = 4;
        this.f8353privatdozent = 1;
        this.f8345creditor = 2.0f;
        this.f8358starveling = -1;
        this.f8347hydrovane = 200;
        this.f8362walach = -1;
        this.f8351peridotite = new attabal();
    }

    public static /* synthetic */ saneness supplicat(Carousel carousel) {
        carousel.getClass();
        return null;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.taiyuan
    public void attabal(MotionLayout motionLayout, int i, int i2, float f) {
        this.f8362walach = i;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.f8350oilcan;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.f8359stratoscope.clear();
            for (int i = 0; i < this.f8779arytenoidectomy; i++) {
                int i2 = this.f8783kowloon[i];
                View viewApical = motionLayout.apical(i2);
                if (this.f8356sealless == i2) {
                    this.f8346grimness = i;
                }
                this.f8359stratoscope.add(viewApical);
            }
            this.f8363yemenite = motionLayout;
            if (this.f8353privatdozent == 2) {
                androidx.constraintlayout.motion.widget.attabal.saneness sanenessVarSayid = motionLayout.sayid(this.f8354restrictive);
                if (sanenessVarSayid != null) {
                    sanenessVarSayid.kattegat(5);
                }
                androidx.constraintlayout.motion.widget.attabal.saneness sanenessVarSayid2 = this.f8363yemenite.sayid(this.f8360supplicat);
                if (sanenessVarSayid2 != null) {
                    sanenessVarSayid2.kattegat(5);
                }
            }
            merc();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8359stratoscope.clear();
    }

    public final void restrictive(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wireman.Carousel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == wireman.Carousel_carousel_firstView) {
                    this.f8356sealless = typedArrayObtainStyledAttributes.getResourceId(index, this.f8356sealless);
                } else if (index == wireman.Carousel_carousel_backwardTransition) {
                    this.f8360supplicat = typedArrayObtainStyledAttributes.getResourceId(index, this.f8360supplicat);
                } else if (index == wireman.Carousel_carousel_forwardTransition) {
                    this.f8354restrictive = typedArrayObtainStyledAttributes.getResourceId(index, this.f8354restrictive);
                } else if (index == wireman.Carousel_carousel_emptyViewsBehavior) {
                    this.f8355saran = typedArrayObtainStyledAttributes.getInt(index, this.f8355saran);
                } else if (index == wireman.Carousel_carousel_previousState) {
                    this.f8349merc = typedArrayObtainStyledAttributes.getResourceId(index, this.f8349merc);
                } else if (index == wireman.Carousel_carousel_nextState) {
                    this.f8352polder = typedArrayObtainStyledAttributes.getResourceId(index, this.f8352polder);
                } else if (index == wireman.Carousel_carousel_touchUp_dampeningFactor) {
                    this.f8357seminary = typedArrayObtainStyledAttributes.getFloat(index, this.f8357seminary);
                } else if (index == wireman.Carousel_carousel_touchUpMode) {
                    this.f8353privatdozent = typedArrayObtainStyledAttributes.getInt(index, this.f8353privatdozent);
                } else if (index == wireman.Carousel_carousel_touchUp_velocityThreshold) {
                    this.f8345creditor = typedArrayObtainStyledAttributes.getFloat(index, this.f8345creditor);
                } else if (index == wireman.Carousel_carousel_infinite) {
                    this.f8348kattegat = typedArrayObtainStyledAttributes.getBoolean(index, this.f8348kattegat);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.taiyuan
    public void saneness(MotionLayout motionLayout, int i) {
        int i2 = this.f8350oilcan;
        this.f8361trm = i2;
        if (i == this.f8352polder) {
            this.f8350oilcan = i2 + 1;
        } else if (i == this.f8349merc) {
            this.f8350oilcan = i2 - 1;
        }
        if (!this.f8348kattegat) {
            throw null;
        }
        throw null;
    }

    public void setInfinite(boolean z) {
        this.f8348kattegat = z;
    }

    public final void merc() {
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8359stratoscope = new ArrayList<>();
        this.f8361trm = 0;
        this.f8350oilcan = 0;
        this.f8356sealless = -1;
        this.f8348kattegat = false;
        this.f8360supplicat = -1;
        this.f8354restrictive = -1;
        this.f8349merc = -1;
        this.f8352polder = -1;
        this.f8357seminary = 0.9f;
        this.f8346grimness = 0;
        this.f8355saran = 4;
        this.f8353privatdozent = 1;
        this.f8345creditor = 2.0f;
        this.f8358starveling = -1;
        this.f8347hydrovane = 200;
        this.f8362walach = -1;
        this.f8351peridotite = new attabal();
        restrictive(context, attributeSet);
    }

    public void setAdapter(saneness sanenessVar) {
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8359stratoscope = new ArrayList<>();
        this.f8361trm = 0;
        this.f8350oilcan = 0;
        this.f8356sealless = -1;
        this.f8348kattegat = false;
        this.f8360supplicat = -1;
        this.f8354restrictive = -1;
        this.f8349merc = -1;
        this.f8352polder = -1;
        this.f8357seminary = 0.9f;
        this.f8346grimness = 0;
        this.f8355saran = 4;
        this.f8353privatdozent = 1;
        this.f8345creditor = 2.0f;
        this.f8358starveling = -1;
        this.f8347hydrovane = 200;
        this.f8362walach = -1;
        this.f8351peridotite = new attabal();
        restrictive(context, attributeSet);
    }
}
