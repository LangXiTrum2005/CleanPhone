package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.unity3d.services.UnityAdsConstants;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: TouchResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public static final float[][] f8639kattegat = {new float[]{0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public static final float[][] f8640supplicat = {new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, new float[]{-1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, new float[]{-1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}, new float[]{1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT}};

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final MotionLayout f8654graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f8659molybdenite;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public float f8662polloi;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f8644attabal = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f8665saneness = 0;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f8650dern = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f8671wireman = -1;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f8658marial = -1;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f8645beachfront = -1;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f8646competently = 0.5f;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public float f8656impromptu = 0.5f;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public float f8668taiyuan = 0.5f;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public float f8649cutely = 0.5f;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f8642apical = -1;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public boolean f8652formularize = false;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public float f8655impassible = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public float f8669triweekly = 1.0f;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f8657kowloon = false;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float[] f8643arytenoidectomy = new float[2];

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int[] f8660monoploid = new int[2];

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public float f8641adultoid = 4.0f;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public float f8651dovishness = 1.2f;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f8653gintrap = true;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public float f8664rotuma = 1.0f;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f8663preprohormone = 0;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public float f8647cord = 10.0f;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public float f8648cuirassed = 10.0f;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public float f8667stratoscope = 1.0f;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public float f8670trm = Float.NaN;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public float f8661oilcan = Float.NaN;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f8672yemenite = 0;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f8666sealless = 0;

    /* JADX INFO: compiled from: TouchResponse.java */
    public class attabal implements View.OnTouchListener {
        public attabal() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    public saneness(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f8654graveside = motionLayout;
        dern(context, Xml.asAttributeSet(xmlPullParser));
    }

    public void adultoid(float f, float f2) {
        float progress = this.f8654graveside.getProgress();
        if (!this.f8657kowloon) {
            this.f8657kowloon = true;
            this.f8654graveside.setProgress(progress);
        }
        this.f8654graveside.lerp(this.f8671wireman, progress, this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
        float f3 = this.f8655impassible;
        float[] fArr = this.f8643arytenoidectomy;
        if (Math.abs((f3 * fArr[0]) + (this.f8669triweekly * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f8643arytenoidectomy;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f4 = this.f8655impassible;
        float fMax = Math.max(Math.min(progress + (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (f * f4) / this.f8643arytenoidectomy[0] : (f2 * this.f8669triweekly) / this.f8643arytenoidectomy[1]), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (fMax != this.f8654graveside.getProgress()) {
            this.f8654graveside.setProgress(fMax);
        }
    }

    public int apical() {
        return this.f8672yemenite;
    }

    public RectF arytenoidectomy(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f8658marial;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public float attabal(float f, float f2) {
        return (f * this.f8655impassible) + (f2 * this.f8669triweekly);
    }

    public RectF beachfront(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f8645beachfront;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public float competently() {
        return this.f8651dovishness;
    }

    public void cord(float f, float f2) {
        this.f8662polloi = f;
        this.f8659molybdenite = f2;
        this.f8657kowloon = false;
    }

    public void cuirassed() {
        View viewFindViewById;
        int i = this.f8671wireman;
        if (i != -1) {
            viewFindViewById = this.f8654graveside.findViewById(i);
            if (viewFindViewById == null) {
                czestochowa.attabal.dern(this.f8654graveside.getContext(), this.f8671wireman);
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new attabal());
            nestedScrollView.setOnScrollChangeListener(new C0055saneness());
        }
    }

    public float cutely(float f, float f2) {
        this.f8654graveside.lerp(this.f8671wireman, this.f8654graveside.getProgress(), this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
        float f3 = this.f8655impassible;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float[] fArr = this.f8643arytenoidectomy;
            if (fArr[0] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f8643arytenoidectomy;
        if (fArr2[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f8669triweekly) / fArr2[1];
    }

    public final void dern(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sensatory.wireman.OnSwipe);
        saneness(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void dovishness(float f, float f2) {
        int i;
        this.f8657kowloon = false;
        float progress = this.f8654graveside.getProgress();
        this.f8654graveside.lerp(this.f8671wireman, progress, this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
        float f3 = this.f8655impassible;
        float[] fArr = this.f8643arytenoidectomy;
        float f4 = fArr[0];
        float f5 = this.f8669triweekly;
        float f6 = fArr[1];
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f8 = f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (f * f3) / f4 : (f2 * f5) / f6;
        if (!Float.isNaN(f8)) {
            progress += f8 / 3.0f;
        }
        if (progress == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || progress == 1.0f || (i = this.f8650dern) == 3) {
            return;
        }
        MotionLayout motionLayout = this.f8654graveside;
        if (progress >= 0.5d) {
            f7 = 1.0f;
        }
        motionLayout.palmyra(i, f7, f8);
    }

    public float formularize() {
        return this.f8648cuirassed;
    }

    public void gintrap(float f, float f2) {
        this.f8662polloi = f;
        this.f8659molybdenite = f2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x026f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0289  */
    /* JADX WARN: Code duplicated, block: B:63:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x02b4  */
    public void graveside(MotionEvent motionEvent, MotionLayout.beachfront beachfrontVar, int i, androidx.constraintlayout.motion.widget.attabal attabalVar) {
        float left;
        float f;
        int top;
        int bottom;
        int i2;
        float degrees;
        float f2;
        int i3;
        float f3;
        beachfrontVar.saneness(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8662polloi = motionEvent.getRawX();
            this.f8659molybdenite = motionEvent.getRawY();
            this.f8657kowloon = false;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            motionEvent.getRawY();
            motionEvent.getRawX();
            float width = this.f8654graveside.getWidth() / 2.0f;
            float height = this.f8654graveside.getHeight() / 2.0f;
            int i4 = this.f8642apical;
            if (i4 != -1) {
                View viewFindViewById = this.f8654graveside.findViewById(i4);
                this.f8654graveside.getLocationOnScreen(this.f8660monoploid);
                float left2 = this.f8660monoploid[0] + ((viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f);
                height = ((viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f) + this.f8660monoploid[1];
                width = left2;
            } else {
                int i5 = this.f8671wireman;
                if (i5 != -1) {
                    View viewFindViewById2 = this.f8654graveside.findViewById(this.f8654graveside.lotta(i5).impromptu());
                    if (viewFindViewById2 != null) {
                        this.f8654graveside.getLocationOnScreen(this.f8660monoploid);
                        width = this.f8660monoploid[0] + ((viewFindViewById2.getLeft() + viewFindViewById2.getRight()) / 2.0f);
                        height = this.f8660monoploid[1] + ((viewFindViewById2.getTop() + viewFindViewById2.getBottom()) / 2.0f);
                    }
                }
            }
            float rawX = motionEvent.getRawX() - width;
            float rawY = motionEvent.getRawY() - height;
            double dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
            float fAtan2 = (float) (((dAtan2 - Math.atan2(this.f8659molybdenite - height, this.f8662polloi - width)) * 180.0d) / 3.141592653589793d);
            if (fAtan2 > 330.0f) {
                fAtan2 -= 360.0f;
            } else if (fAtan2 < -330.0f) {
                fAtan2 += 360.0f;
            }
            if (Math.abs(fAtan2) > 0.01d || this.f8657kowloon) {
                float progress = this.f8654graveside.getProgress();
                if (!this.f8657kowloon) {
                    this.f8657kowloon = true;
                    this.f8654graveside.setProgress(progress);
                }
                int i6 = this.f8671wireman;
                if (i6 != -1) {
                    f3 = progress;
                    this.f8654graveside.lerp(i6, f3, this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
                    float[] fArr = this.f8643arytenoidectomy;
                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    f3 = progress;
                    this.f8643arytenoidectomy[1] = 360.0f;
                }
                float fMax = Math.max(Math.min(f3 + ((fAtan2 * this.f8664rotuma) / this.f8643arytenoidectomy[1]), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float progress2 = this.f8654graveside.getProgress();
                if (fMax != progress2) {
                    if (progress2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || progress2 == 1.0f) {
                        this.f8654graveside.cultivated(progress2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    this.f8654graveside.setProgress(fMax);
                    beachfrontVar.marial(1000);
                    float fWireman = beachfrontVar.wireman();
                    double dDern = beachfrontVar.dern();
                    double d = fWireman;
                    this.f8654graveside.f8494starveling = (float) Math.toDegrees((float) ((Math.hypot(dDern, d) * Math.sin(Math.atan2(dDern, d) - dAtan2)) / Math.hypot(rawX, rawY)));
                } else {
                    this.f8654graveside.f8494starveling = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                this.f8662polloi = motionEvent.getRawX();
                this.f8659molybdenite = motionEvent.getRawY();
                return;
            }
            return;
        }
        this.f8657kowloon = false;
        beachfrontVar.marial(16);
        float fWireman2 = beachfrontVar.wireman();
        float fDern = beachfrontVar.dern();
        float progress3 = this.f8654graveside.getProgress();
        float width2 = this.f8654graveside.getWidth() / 2.0f;
        float height2 = this.f8654graveside.getHeight() / 2.0f;
        int i7 = this.f8642apical;
        if (i7 == -1) {
            int i8 = this.f8671wireman;
            if (i8 != -1) {
                View viewFindViewById3 = this.f8654graveside.findViewById(this.f8654graveside.lotta(i8).impromptu());
                this.f8654graveside.getLocationOnScreen(this.f8660monoploid);
                left = this.f8660monoploid[0] + ((viewFindViewById3.getLeft() + viewFindViewById3.getRight()) / 2.0f);
                f = this.f8660monoploid[1];
                top = viewFindViewById3.getTop();
                bottom = viewFindViewById3.getBottom();
            }
            float rawX2 = motionEvent.getRawX() - width2;
            float rawY2 = motionEvent.getRawY() - height2;
            double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
            i2 = this.f8671wireman;
            if (i2 != -1) {
                this.f8654graveside.lerp(i2, progress3, this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
                float[] fArr2 = this.f8643arytenoidectomy;
                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
            } else {
                this.f8643arytenoidectomy[1] = 360.0f;
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(fDern + rawY2, fWireman2 + rawX2)) - degrees2)) * 62.5f;
            if (Float.isNaN(degrees)) {
                f2 = progress3;
            } else {
                f2 = (((degrees * 3.0f) * this.f8664rotuma) / this.f8643arytenoidectomy[1]) + progress3;
            }
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == 1.0f || (i3 = this.f8650dern) == 3) {
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT < f2 || 1.0f <= f2) {
                    this.f8654graveside.setState(MotionLayout.TransitionState.FINISHED);
                }
                return;
            }
            float fAbs = (degrees * this.f8664rotuma) / this.f8643arytenoidectomy[1];
            float f4 = ((double) f2) < 0.5d ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
            if (i3 == 6) {
                if (progress3 + fAbs < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fAbs = Math.abs(fAbs);
                }
                f4 = 1.0f;
            }
            if (this.f8650dern == 7) {
                if (progress3 + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            this.f8654graveside.palmyra(this.f8650dern, f4, fAbs * 3.0f);
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= progress3 || 1.0f <= progress3) {
                this.f8654graveside.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        View viewFindViewById4 = this.f8654graveside.findViewById(i7);
        this.f8654graveside.getLocationOnScreen(this.f8660monoploid);
        left = this.f8660monoploid[0] + ((viewFindViewById4.getLeft() + viewFindViewById4.getRight()) / 2.0f);
        f = this.f8660monoploid[1];
        top = viewFindViewById4.getTop();
        bottom = viewFindViewById4.getBottom();
        float f5 = left;
        height2 = ((top + bottom) / 2.0f) + f;
        width2 = f5;
        float rawX3 = motionEvent.getRawX() - width2;
        float rawY3 = motionEvent.getRawY() - height2;
        double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
        i2 = this.f8671wireman;
        if (i2 != -1) {
            this.f8654graveside.lerp(i2, progress3, this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
            float[] fArr3 = this.f8643arytenoidectomy;
            fArr3[1] = (float) Math.toDegrees(fArr3[1]);
        } else {
            this.f8643arytenoidectomy[1] = 360.0f;
        }
        degrees = ((float) (Math.toDegrees(Math.atan2(fDern + rawY3, fWireman2 + rawX3)) - degrees3)) * 62.5f;
        if (Float.isNaN(degrees)) {
            f2 = (((degrees * 3.0f) * this.f8664rotuma) / this.f8643arytenoidectomy[1]) + progress3;
        } else {
            f2 = progress3;
        }
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT < f2) {
        }
        this.f8654graveside.setState(MotionLayout.TransitionState.FINISHED);
    }

    public float impassible() {
        return this.f8667stratoscope;
    }

    public float impromptu() {
        return this.f8641adultoid;
    }

    public float kowloon() {
        return this.f8661oilcan;
    }

    public int marial() {
        return this.f8663preprohormone;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public void molybdenite(MotionEvent motionEvent, MotionLayout.beachfront beachfrontVar, int i, androidx.constraintlayout.motion.widget.attabal attabalVar) {
        char c;
        int i2;
        char c2;
        float f;
        char c3;
        if (this.f8652formularize) {
            graveside(motionEvent, beachfrontVar, i, attabalVar);
            return;
        }
        beachfrontVar.saneness(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f8662polloi = motionEvent.getRawX();
            this.f8659molybdenite = motionEvent.getRawY();
            this.f8657kowloon = false;
            return;
        }
        if (action == 1) {
            this.f8657kowloon = false;
            beachfrontVar.marial(1000);
            float fWireman = beachfrontVar.wireman();
            float fDern = beachfrontVar.dern();
            float progress = this.f8654graveside.getProgress();
            int i3 = this.f8671wireman;
            if (i3 != -1) {
                this.f8654graveside.lerp(i3, progress, this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
                c = 0;
            } else {
                float fMin = Math.min(this.f8654graveside.getWidth(), this.f8654graveside.getHeight());
                float[] fArr = this.f8643arytenoidectomy;
                fArr[1] = this.f8669triweekly * fMin;
                c = 0;
                fArr[0] = fMin * this.f8655impassible;
            }
            float f2 = this.f8655impassible;
            float[] fArr2 = this.f8643arytenoidectomy;
            float fAbs = f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? fWireman / fArr2[c] : fDern / fArr2[1];
            float f3 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 == 1.0f || (i2 = this.f8650dern) == 3) {
                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= f3 || 1.0f <= f3) {
                    this.f8654graveside.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float f4 = ((double) f3) < 0.5d ? 0.0f : 1.0f;
            if (i2 == 6) {
                if (progress + fAbs < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    fAbs = Math.abs(fAbs);
                }
                f4 = 1.0f;
            }
            if (this.f8650dern == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f4 = 0.0f;
            }
            this.f8654graveside.palmyra(this.f8650dern, f4, fAbs);
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= progress || 1.0f <= progress) {
                this.f8654graveside.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f8659molybdenite;
        float rawX = motionEvent.getRawX() - this.f8662polloi;
        if (Math.abs((this.f8655impassible * rawX) + (this.f8669triweekly * rawY)) > this.f8647cord || this.f8657kowloon) {
            float progress2 = this.f8654graveside.getProgress();
            if (!this.f8657kowloon) {
                this.f8657kowloon = true;
                this.f8654graveside.setProgress(progress2);
            }
            int i4 = this.f8671wireman;
            if (i4 != -1) {
                c2 = 1;
                c3 = 0;
                f = progress2;
                this.f8654graveside.lerp(i4, f, this.f8656impromptu, this.f8646competently, this.f8643arytenoidectomy);
            } else {
                c2 = 1;
                f = progress2;
                c3 = 0;
                float fMin2 = Math.min(this.f8654graveside.getWidth(), this.f8654graveside.getHeight());
                float[] fArr3 = this.f8643arytenoidectomy;
                fArr3[1] = this.f8669triweekly * fMin2;
                fArr3[0] = fMin2 * this.f8655impassible;
            }
            float f5 = this.f8655impassible;
            float[] fArr4 = this.f8643arytenoidectomy;
            if (Math.abs(((f5 * fArr4[c3]) + (this.f8669triweekly * fArr4[c2])) * this.f8664rotuma) < 0.01d) {
                float[] fArr5 = this.f8643arytenoidectomy;
                fArr5[c3] = 0.01f;
                fArr5[c2] = 0.01f;
            }
            float fMax = Math.max(Math.min(f + (this.f8655impassible != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? rawX / this.f8643arytenoidectomy[c3] : rawY / this.f8643arytenoidectomy[c2]), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.f8650dern == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f8650dern == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f8654graveside.getProgress();
            if (fMax != progress3) {
                if (progress3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || progress3 == 1.0f) {
                    this.f8654graveside.cultivated(progress3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? c2 : c3);
                }
                this.f8654graveside.setProgress(fMax);
                beachfrontVar.marial(1000);
                this.f8654graveside.f8494starveling = this.f8655impassible != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? beachfrontVar.wireman() / this.f8643arytenoidectomy[c3] : beachfrontVar.dern() / this.f8643arytenoidectomy[c2];
            } else {
                this.f8654graveside.f8494starveling = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            this.f8662polloi = motionEvent.getRawX();
            this.f8659molybdenite = motionEvent.getRawY();
        }
    }

    public int monoploid() {
        return this.f8658marial;
    }

    public boolean polloi() {
        return this.f8657kowloon;
    }

    public void preprohormone(int i) {
        this.f8650dern = i;
    }

    public void rotuma(boolean z) {
        if (z) {
            float[][] fArr = f8640supplicat;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f8639kattegat;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f8640supplicat;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f8639kattegat;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = f8639kattegat[this.f8644attabal];
        this.f8656impromptu = fArr5[0];
        this.f8646competently = fArr5[1];
        int i = this.f8665saneness;
        float[][] fArr6 = f8640supplicat;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.f8655impassible = fArr7[0];
        this.f8669triweekly = fArr7[1];
    }

    public final void saneness(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == sensatory.wireman.OnSwipe_touchAnchorId) {
                this.f8671wireman = typedArray.getResourceId(index, this.f8671wireman);
            } else if (index == sensatory.wireman.OnSwipe_touchAnchorSide) {
                int i2 = typedArray.getInt(index, this.f8644attabal);
                this.f8644attabal = i2;
                float[] fArr = f8639kattegat[i2];
                this.f8656impromptu = fArr[0];
                this.f8646competently = fArr[1];
            } else if (index == sensatory.wireman.OnSwipe_dragDirection) {
                int i3 = typedArray.getInt(index, this.f8665saneness);
                this.f8665saneness = i3;
                float[][] fArr2 = f8640supplicat;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.f8655impassible = fArr3[0];
                    this.f8669triweekly = fArr3[1];
                } else {
                    this.f8669triweekly = Float.NaN;
                    this.f8655impassible = Float.NaN;
                    this.f8652formularize = true;
                }
            } else if (index == sensatory.wireman.OnSwipe_maxVelocity) {
                this.f8641adultoid = typedArray.getFloat(index, this.f8641adultoid);
            } else if (index == sensatory.wireman.OnSwipe_maxAcceleration) {
                this.f8651dovishness = typedArray.getFloat(index, this.f8651dovishness);
            } else if (index == sensatory.wireman.OnSwipe_moveWhenScrollAtTop) {
                this.f8653gintrap = typedArray.getBoolean(index, this.f8653gintrap);
            } else if (index == sensatory.wireman.OnSwipe_dragScale) {
                this.f8664rotuma = typedArray.getFloat(index, this.f8664rotuma);
            } else if (index == sensatory.wireman.OnSwipe_dragThreshold) {
                this.f8647cord = typedArray.getFloat(index, this.f8647cord);
            } else if (index == sensatory.wireman.OnSwipe_touchRegionId) {
                this.f8658marial = typedArray.getResourceId(index, this.f8658marial);
            } else if (index == sensatory.wireman.OnSwipe_onTouchUp) {
                this.f8650dern = typedArray.getInt(index, this.f8650dern);
            } else if (index == sensatory.wireman.OnSwipe_nestedScrollFlags) {
                this.f8663preprohormone = typedArray.getInteger(index, 0);
            } else if (index == sensatory.wireman.OnSwipe_limitBoundsTo) {
                this.f8645beachfront = typedArray.getResourceId(index, 0);
            } else if (index == sensatory.wireman.OnSwipe_rotationCenterId) {
                this.f8642apical = typedArray.getResourceId(index, this.f8642apical);
            } else if (index == sensatory.wireman.OnSwipe_springDamping) {
                this.f8648cuirassed = typedArray.getFloat(index, this.f8648cuirassed);
            } else if (index == sensatory.wireman.OnSwipe_springMass) {
                this.f8667stratoscope = typedArray.getFloat(index, this.f8667stratoscope);
            } else if (index == sensatory.wireman.OnSwipe_springStiffness) {
                this.f8670trm = typedArray.getFloat(index, this.f8670trm);
            } else if (index == sensatory.wireman.OnSwipe_springStopThreshold) {
                this.f8661oilcan = typedArray.getFloat(index, this.f8661oilcan);
            } else if (index == sensatory.wireman.OnSwipe_springBoundary) {
                this.f8672yemenite = typedArray.getInt(index, this.f8672yemenite);
            } else if (index == sensatory.wireman.OnSwipe_autoCompleteMode) {
                this.f8666sealless = typedArray.getInt(index, this.f8666sealless);
            }
        }
    }

    public boolean taiyuan() {
        return this.f8653gintrap;
    }

    public String toString() {
        if (Float.isNaN(this.f8655impassible)) {
            return "rotation";
        }
        return this.f8655impassible + " , " + this.f8669triweekly;
    }

    public float triweekly() {
        return this.f8670trm;
    }

    public int wireman() {
        return this.f8666sealless;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TouchResponse.java */
    public class C0055saneness implements NestedScrollView.marial {
        public C0055saneness() {
        }

        @Override // androidx.core.widget.NestedScrollView.marial
        public void attabal(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }
}
