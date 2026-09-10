package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import czestochowa.competently;
import czestochowa.impassible;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes.dex */
public class dern {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public String f8601apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f8603attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public competently f8604beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public androidx.constraintlayout.widget.attabal.C0056attabal f8605competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f8606cutely;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Context f8613kowloon;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f8614marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f8618saneness = -1;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f8607dern = false;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f8621wireman = 0;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f8612impromptu = -1;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f8619taiyuan = -1;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f8609formularize = 0;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public String f8611impassible = null;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f8620triweekly = -1;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f8602arytenoidectomy = -1;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f8616monoploid = -1;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f8617polloi = -1;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f8615molybdenite = -1;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f8610graveside = -1;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f8600adultoid = -1;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f8608dovishness = -1;

    /* JADX INFO: compiled from: ViewTransition.java */
    public class attabal implements Interpolator {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ lerp.dern f8622attabal;

        public attabal(lerp.dern dernVar) {
            this.f8622attabal = dernVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f8622attabal.attabal(f);
        }
    }

    /* JADX INFO: compiled from: ViewTransition.java */
    public static class saneness {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public float f8624apical;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f8625attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f8626beachfront;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public long f8629dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public float f8630formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public long f8631impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public wireman f8632impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public boolean f8633kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f8634marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final int f8635saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public Interpolator f8636taiyuan;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public impassible f8638wireman;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public lerp.wireman f8627competently = new lerp.wireman();

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public boolean f8628cutely = false;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public Rect f8637triweekly = new Rect();

        public saneness(wireman wiremanVar, impassible impassibleVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.f8633kowloon = false;
            this.f8632impromptu = wiremanVar;
            this.f8638wireman = impassibleVar;
            this.f8634marial = i;
            this.f8626beachfront = i2;
            long jNanoTime = System.nanoTime();
            this.f8629dern = jNanoTime;
            this.f8631impassible = jNanoTime;
            this.f8632impromptu.saneness(this);
            this.f8636taiyuan = interpolator;
            this.f8625attabal = i4;
            this.f8635saneness = i5;
            if (i3 == 3) {
                this.f8633kowloon = true;
            }
            this.f8630formularize = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            attabal();
        }

        public void attabal() {
            if (this.f8628cutely) {
                dern();
            } else {
                saneness();
            }
        }

        public void dern() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.f8631impassible;
            this.f8631impassible = jNanoTime;
            float f = this.f8624apical - (((float) (j * 1.0E-6d)) * this.f8630formularize);
            this.f8624apical = f;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.f8624apical = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            Interpolator interpolator = this.f8636taiyuan;
            float interpolation = interpolator == null ? this.f8624apical : interpolator.getInterpolation(this.f8624apical);
            impassible impassibleVar = this.f8638wireman;
            boolean zRotuma = impassibleVar.rotuma(impassibleVar.f24962saneness, interpolation, jNanoTime, this.f8627competently);
            if (this.f8624apical <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (this.f8625attabal != -1) {
                    this.f8638wireman.dovishness().setTag(this.f8625attabal, Long.valueOf(System.nanoTime()));
                }
                if (this.f8635saneness != -1) {
                    this.f8638wireman.dovishness().setTag(this.f8635saneness, null);
                }
                this.f8632impromptu.competently(this);
            }
            if (this.f8624apical > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || zRotuma) {
                this.f8632impromptu.marial();
            }
        }

        public void marial(boolean z) {
            int i;
            this.f8628cutely = z;
            if (z && (i = this.f8626beachfront) != -1) {
                this.f8630formularize = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f8632impromptu.marial();
            this.f8631impassible = System.nanoTime();
        }

        public void saneness() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.f8631impassible;
            this.f8631impassible = jNanoTime;
            float f = this.f8624apical + (((float) (j * 1.0E-6d)) * this.f8630formularize);
            this.f8624apical = f;
            if (f >= 1.0f) {
                this.f8624apical = 1.0f;
            }
            Interpolator interpolator = this.f8636taiyuan;
            float interpolation = interpolator == null ? this.f8624apical : interpolator.getInterpolation(this.f8624apical);
            impassible impassibleVar = this.f8638wireman;
            boolean zRotuma = impassibleVar.rotuma(impassibleVar.f24962saneness, interpolation, jNanoTime, this.f8627competently);
            if (this.f8624apical >= 1.0f) {
                if (this.f8625attabal != -1) {
                    this.f8638wireman.dovishness().setTag(this.f8625attabal, Long.valueOf(System.nanoTime()));
                }
                if (this.f8635saneness != -1) {
                    this.f8638wireman.dovishness().setTag(this.f8635saneness, null);
                }
                if (!this.f8633kowloon) {
                    this.f8632impromptu.competently(this);
                }
            }
            if (this.f8624apical < 1.0f || zRotuma) {
                this.f8632impromptu.marial();
            }
        }

        public void wireman(int i, float f, float f2) {
            if (i == 1) {
                if (this.f8628cutely) {
                    return;
                }
                marial(true);
            } else {
                if (i != 2) {
                    return;
                }
                this.f8638wireman.dovishness().getHitRect(this.f8637triweekly);
                if (this.f8637triweekly.contains((int) f, (int) f2) || this.f8628cutely) {
                    return;
                }
                marial(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: IOException | XmlPullParserException -> 0x009a, IOException | XmlPullParserException -> 0x009a, TryCatch #0 {IOException | XmlPullParserException -> 0x009a, blocks: (B:3:0x0026, B:11:0x0036, B:11:0x0036, B:33:0x0095, B:33:0x0095, B:14:0x0041, B:14:0x0041, B:15:0x0049, B:15:0x0049, B:32:0x008f, B:32:0x008f, B:17:0x004d, B:17:0x004d, B:22:0x005e, B:22:0x005e, B:20:0x0056, B:20:0x0056, B:23:0x0066, B:23:0x0066, B:25:0x006c, B:25:0x006c, B:26:0x0070, B:26:0x0070, B:28:0x0078, B:28:0x0078, B:29:0x0080, B:29:0x0080, B:31:0x0088, B:31:0x0088), top: B:37:0x0026 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public dern(Context context, XmlPullParser xmlPullParser) {
        this.f8613kowloon = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                czestochowa.attabal.attabal();
                                xmlPullParser.getLineNumber();
                            } else {
                                this.f8605competently = androidx.constraintlayout.widget.attabal.impassible(context, xmlPullParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                czestochowa.attabal.attabal();
                                xmlPullParser.getLineNumber();
                            } else {
                                this.f8604beachfront = new competently(context, xmlPullParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                czestochowa.attabal.attabal();
                                xmlPullParser.getLineNumber();
                            } else {
                                apical(context, xmlPullParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                czestochowa.attabal.attabal();
                                xmlPullParser.getLineNumber();
                            } else {
                                ConstraintAttribute.taiyuan(context, xmlPullParser, this.f8605competently.f8934competently);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                czestochowa.attabal.attabal();
                                xmlPullParser.getLineNumber();
                            } else {
                                ConstraintAttribute.taiyuan(context, xmlPullParser, this.f8605competently.f8934competently);
                            }
                            break;
                        default:
                            czestochowa.attabal.attabal();
                            xmlPullParser.getLineNumber();
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public static /* synthetic */ void attabal(dern dernVar, View[] viewArr) {
        if (dernVar.f8602arytenoidectomy != -1) {
            for (View view : viewArr) {
                view.setTag(dernVar.f8602arytenoidectomy, Long.valueOf(System.nanoTime()));
            }
        }
        if (dernVar.f8616monoploid != -1) {
            for (View view2 : viewArr) {
                view2.setTag(dernVar.f8616monoploid, null);
            }
        }
    }

    public final void apical(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), sensatory.wireman.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == sensatory.wireman.ViewTransition_android_id) {
                this.f8603attabal = typedArrayObtainStyledAttributes.getResourceId(index, this.f8603attabal);
            } else if (index == sensatory.wireman.ViewTransition_motionTarget) {
                if (MotionLayout.f8430incorrectly) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f8606cutely);
                    this.f8606cutely = resourceId;
                    if (resourceId == -1) {
                        this.f8601apical = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f8601apical = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f8606cutely = typedArrayObtainStyledAttributes.getResourceId(index, this.f8606cutely);
                }
            } else if (index == sensatory.wireman.ViewTransition_onStateTransition) {
                this.f8618saneness = typedArrayObtainStyledAttributes.getInt(index, this.f8618saneness);
            } else if (index == sensatory.wireman.ViewTransition_transitionDisable) {
                this.f8607dern = typedArrayObtainStyledAttributes.getBoolean(index, this.f8607dern);
            } else if (index == sensatory.wireman.ViewTransition_pathMotionArc) {
                this.f8621wireman = typedArrayObtainStyledAttributes.getInt(index, this.f8621wireman);
            } else if (index == sensatory.wireman.ViewTransition_duration) {
                this.f8612impromptu = typedArrayObtainStyledAttributes.getInt(index, this.f8612impromptu);
            } else if (index == sensatory.wireman.ViewTransition_upDuration) {
                this.f8619taiyuan = typedArrayObtainStyledAttributes.getInt(index, this.f8619taiyuan);
            } else if (index == sensatory.wireman.ViewTransition_viewTransitionMode) {
                this.f8614marial = typedArrayObtainStyledAttributes.getInt(index, this.f8614marial);
            } else if (index == sensatory.wireman.ViewTransition_motionInterpolator) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f8620triweekly = resourceId2;
                    if (resourceId2 != -1) {
                        this.f8609formularize = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f8611impassible = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f8609formularize = -1;
                    } else {
                        this.f8620triweekly = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f8609formularize = -2;
                    }
                } else {
                    this.f8609formularize = typedArrayObtainStyledAttributes.getInteger(index, this.f8609formularize);
                }
            } else if (index == sensatory.wireman.ViewTransition_setsTag) {
                this.f8602arytenoidectomy = typedArrayObtainStyledAttributes.getResourceId(index, this.f8602arytenoidectomy);
            } else if (index == sensatory.wireman.ViewTransition_clearsTag) {
                this.f8616monoploid = typedArrayObtainStyledAttributes.getResourceId(index, this.f8616monoploid);
            } else if (index == sensatory.wireman.ViewTransition_ifTagSet) {
                this.f8617polloi = typedArrayObtainStyledAttributes.getResourceId(index, this.f8617polloi);
            } else if (index == sensatory.wireman.ViewTransition_ifTagNotSet) {
                this.f8615molybdenite = typedArrayObtainStyledAttributes.getResourceId(index, this.f8615molybdenite);
            } else if (index == sensatory.wireman.ViewTransition_SharedValueId) {
                this.f8600adultoid = typedArrayObtainStyledAttributes.getResourceId(index, this.f8600adultoid);
            } else if (index == sensatory.wireman.ViewTransition_SharedValue) {
                this.f8610graveside = typedArrayObtainStyledAttributes.getInteger(index, this.f8610graveside);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Interpolator beachfront(Context context) {
        int i = this.f8609formularize;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.f8620triweekly);
        }
        if (i == -1) {
            return new attabal(lerp.dern.dern(this.f8611impassible));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int competently() {
        return this.f8610graveside;
    }

    public boolean cutely(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.f8606cutely == -1 && this.f8601apical == null) || !wireman(view)) {
            return false;
        }
        if (view.getId() == this.f8606cutely) {
            return true;
        }
        return this.f8601apical != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).f8878timberyard) != null && str.matches(this.f8601apical);
    }

    public void dern(wireman wiremanVar, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.attabal attabalVar, final View... viewArr) {
        if (this.f8607dern) {
            return;
        }
        int i2 = this.f8614marial;
        if (i2 == 2) {
            saneness(wiremanVar, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.getConstraintSetIds()) {
                if (i3 != i) {
                    androidx.constraintlayout.widget.attabal attabalVarNosophobia = motionLayout.nosophobia(i3);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.attabal.C0056attabal c0056attabalDovishness = attabalVarNosophobia.dovishness(view.getId());
                        androidx.constraintlayout.widget.attabal.C0056attabal c0056attabal = this.f8605competently;
                        if (c0056attabal != null) {
                            c0056attabal.wireman(c0056attabalDovishness);
                            c0056attabalDovishness.f8934competently.putAll(this.f8605competently.f8934competently);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.attabal attabalVar2 = new androidx.constraintlayout.widget.attabal();
        attabalVar2.arytenoidectomy(attabalVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.attabal.C0056attabal c0056attabalDovishness2 = attabalVar2.dovishness(view2.getId());
            androidx.constraintlayout.widget.attabal.C0056attabal c0056attabal2 = this.f8605competently;
            if (c0056attabal2 != null) {
                c0056attabal2.wireman(c0056attabalDovishness2);
                c0056attabalDovishness2.f8934competently.putAll(this.f8605competently.f8934competently);
            }
        }
        motionLayout.herdbook(i, attabalVar2);
        motionLayout.herdbook(sensatory.dern.view_transition, attabalVar);
        motionLayout.setState(sensatory.dern.view_transition, -1, -1);
        androidx.constraintlayout.motion.widget.attabal.saneness sanenessVar = new androidx.constraintlayout.motion.widget.attabal.saneness(-1, motionLayout.f8489saran, sensatory.dern.view_transition, i);
        for (View view3 : viewArr) {
            impassible(sanenessVar, view3);
        }
        motionLayout.setTransition(sanenessVar);
        motionLayout.monroe(new Runnable() { // from class: czestochowa.arytenoidectomy
            @Override // java.lang.Runnable
            public final void run() {
                androidx.constraintlayout.motion.widget.dern.attabal(this.f24861kowloon, viewArr);
            }
        });
    }

    public boolean formularize(int i) {
        int i2 = this.f8618saneness;
        if (i2 == 1) {
            return i == 0;
        }
        if (i2 == 2) {
            return i == 1;
        }
        return i2 == 3 && i == 0;
    }

    public final void impassible(androidx.constraintlayout.motion.widget.attabal.saneness sanenessVar, View view) {
        int i = this.f8612impromptu;
        if (i != -1) {
            sanenessVar.yemenite(i);
        }
        sanenessVar.supplicat(this.f8621wireman);
        sanenessVar.sealless(this.f8609formularize, this.f8611impassible, this.f8620triweekly);
        int id = view.getId();
        competently competentlyVar = this.f8604beachfront;
        if (competentlyVar != null) {
            ArrayList<czestochowa.wireman> arrayListWireman = competentlyVar.wireman(-1);
            competently competentlyVar2 = new competently();
            Iterator<czestochowa.wireman> it = arrayListWireman.iterator();
            while (it.hasNext()) {
                competentlyVar2.dern(it.next().clone().taiyuan(id));
            }
            sanenessVar.graveside(competentlyVar2);
        }
    }

    public int impromptu() {
        return this.f8600adultoid;
    }

    public int marial() {
        return this.f8603attabal;
    }

    public void saneness(wireman wiremanVar, MotionLayout motionLayout, View view) {
        impassible impassibleVar = new impassible(view);
        impassibleVar.stratoscope(view);
        this.f8604beachfront.attabal(impassibleVar);
        impassibleVar.restrictive(motionLayout.getWidth(), motionLayout.getHeight(), this.f8612impromptu, System.nanoTime());
        new saneness(wiremanVar, impassibleVar, this.f8612impromptu, this.f8619taiyuan, this.f8618saneness, beachfront(motionLayout.getContext()), this.f8602arytenoidectomy, this.f8616monoploid);
    }

    public int taiyuan() {
        return this.f8618saneness;
    }

    public String toString() {
        return "ViewTransition(" + czestochowa.attabal.dern(this.f8613kowloon, this.f8603attabal) + ")";
    }

    public boolean wireman(View view) {
        int i = this.f8617polloi;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.f8615molybdenite;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }
}
