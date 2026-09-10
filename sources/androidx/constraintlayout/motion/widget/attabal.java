package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import czestochowa.competently;
import czestochowa.impassible;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import sensatory.marial;

/* JADX INFO: compiled from: MotionScene.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MotionLayout.beachfront f8558arytenoidectomy;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final MotionLayout f8559attabal;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public float f8565graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public MotionEvent f8566impassible;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public float f8570molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public boolean f8571monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final wireman f8572polloi;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public marial f8573saneness = null;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public saneness f8563dern = null;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f8576wireman = false;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public ArrayList<saneness> f8569marial = new ArrayList<>();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public saneness f8560beachfront = null;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public ArrayList<saneness> f8561competently = new ArrayList<>();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.attabal> f8567impromptu = new SparseArray<>();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public HashMap<String, Integer> f8574taiyuan = new HashMap<>();

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public SparseIntArray f8562cutely = new SparseIntArray();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f8557apical = 400;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f8564formularize = 0;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f8575triweekly = false;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f8568kowloon = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MotionScene.java */
    public class InterpolatorC0053attabal implements Interpolator {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ lerp.dern f8577attabal;

        public InterpolatorC0053attabal(lerp.dern dernVar) {
            this.f8577attabal = dernVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f8577attabal.attabal(f);
        }
    }

    public attabal(Context context, MotionLayout motionLayout, int i) {
        this.f8559attabal = motionLayout;
        this.f8572polloi = new wireman(motionLayout);
        polder(context, i);
        this.f8567impromptu.put(sensatory.dern.motion_base, new androidx.constraintlayout.widget.attabal());
        this.f8574taiyuan.put("motion_base", Integer.valueOf(sensatory.dern.motion_base));
    }

    public static String cultivated(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public float adultoid() {
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f8563dern.f8586formularize.competently();
    }

    public int apical() {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return 0;
        }
        return this.f8563dern.f8586formularize.wireman();
    }

    public int arytenoidectomy() {
        saneness sanenessVar = this.f8563dern;
        return sanenessVar != null ? sanenessVar.f8588impromptu : this.f8557apical;
    }

    public void beachfront(MotionLayout motionLayout, int i) {
        for (saneness sanenessVar : this.f8569marial) {
            if (sanenessVar.f8587impassible.size() > 0) {
                Iterator it = sanenessVar.f8587impassible.iterator();
                while (it.hasNext()) {
                    ((saneness.ViewOnClickListenerC0054attabal) it.next()).dern(motionLayout);
                }
            }
        }
        for (saneness sanenessVar2 : this.f8561competently) {
            if (sanenessVar2.f8587impassible.size() > 0) {
                Iterator it2 = sanenessVar2.f8587impassible.iterator();
                while (it2.hasNext()) {
                    ((saneness.ViewOnClickListenerC0054attabal) it2.next()).dern(motionLayout);
                }
            }
        }
        for (saneness sanenessVar3 : this.f8569marial) {
            if (sanenessVar3.f8587impassible.size() > 0) {
                Iterator it3 = sanenessVar3.f8587impassible.iterator();
                while (it3.hasNext()) {
                    ((saneness.ViewOnClickListenerC0054attabal) it3.next()).attabal(motionLayout, i, sanenessVar3);
                }
            }
        }
        for (saneness sanenessVar4 : this.f8561competently) {
            if (sanenessVar4.f8587impassible.size() > 0) {
                Iterator it4 = sanenessVar4.f8587impassible.iterator();
                while (it4.hasNext()) {
                    ((saneness.ViewOnClickListenerC0054attabal) it4.next()).attabal(motionLayout, i, sanenessVar4);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0075 A[SYNTHETIC] */
    public void clubfoot(int i, int i2) {
        int iDern;
        int iDern2;
        saneness sanenessVar;
        Iterator<saneness> it;
        saneness sanenessVar2;
        saneness sanenessVar3;
        saneness next;
        marial marialVar = this.f8573saneness;
        if (marialVar != null) {
            iDern = marialVar.dern(i, -1, -1);
            if (iDern == -1) {
                iDern = i;
            }
            iDern2 = this.f8573saneness.dern(i2, -1, -1);
            if (iDern2 == -1) {
            }
            sanenessVar = this.f8563dern;
            if (sanenessVar == null && sanenessVar.f8585dern == i2 && this.f8563dern.f8596wireman == i) {
                return;
            }
            it = this.f8569marial.iterator();
            while (true) {
                if (it.hasNext()) {
                    sanenessVar2 = this.f8560beachfront;
                    for (saneness sanenessVar4 : this.f8561competently) {
                        if (sanenessVar4.f8585dern == i2) {
                            sanenessVar2 = sanenessVar4;
                        }
                    }
                    sanenessVar3 = new saneness(this, sanenessVar2);
                    sanenessVar3.f8596wireman = iDern;
                    sanenessVar3.f8585dern = iDern2;
                    if (iDern != -1) {
                        this.f8569marial.add(sanenessVar3);
                    }
                    this.f8563dern = sanenessVar3;
                    return;
                }
                next = it.next();
                if ((next.f8585dern != iDern2 && next.f8596wireman == iDern) || (next.f8585dern == i2 && next.f8596wireman == i)) {
                    break;
                }
            }
            this.f8563dern = next;
            if (next != null || next.f8586formularize == null) {
            }
            this.f8563dern.f8586formularize.rotuma(this.f8571monoploid);
            return;
        }
        iDern = i;
        iDern2 = i2;
        sanenessVar = this.f8563dern;
        if (sanenessVar == null) {
        }
        it = this.f8569marial.iterator();
        while (true) {
            if (it.hasNext()) {
                sanenessVar2 = this.f8560beachfront;
                while (r3.hasNext()) {
                    if (sanenessVar4.f8585dern == i2) {
                        sanenessVar2 = sanenessVar4;
                    }
                }
                sanenessVar3 = new saneness(this, sanenessVar2);
                sanenessVar3.f8596wireman = iDern;
                sanenessVar3.f8585dern = iDern2;
                if (iDern != -1) {
                    this.f8569marial.add(sanenessVar3);
                }
                this.f8563dern = sanenessVar3;
                return;
            }
            next = it.next();
            if (next.f8585dern != iDern2) {
            }
        }
        this.f8563dern = next;
        if (next != null) {
        }
    }

    public boolean competently(int i, impassible impassibleVar) {
        return this.f8572polloi.wireman(i, impassibleVar);
    }

    public int cord() {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return 0;
        }
        return this.f8563dern.f8586formularize.apical();
    }

    public void creditor(float f, float f2) {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return;
        }
        this.f8563dern.f8586formularize.adultoid(f, f2);
    }

    public float cuirassed() {
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f8563dern.f8586formularize.formularize();
    }

    public int cutely() {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar != null) {
            return sanenessVar.f8580arytenoidectomy;
        }
        return -1;
    }

    public void dent(saneness sanenessVar) {
        this.f8563dern = sanenessVar;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return;
        }
        this.f8563dern.f8586formularize.rotuma(this.f8571monoploid);
    }

    public float dovishness() {
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f8563dern.f8586formularize.impromptu();
    }

    public androidx.constraintlayout.widget.attabal formularize(int i) {
        return impassible(i, -1, -1);
    }

    public boolean gintrap() {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return false;
        }
        return this.f8563dern.f8586formularize.taiyuan();
    }

    public void graveside(impassible impassibleVar) {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar != null) {
            Iterator it = sanenessVar.f8579apical.iterator();
            while (it.hasNext()) {
                ((competently) it.next()).saneness(impassibleVar);
            }
        } else {
            saneness sanenessVar2 = this.f8560beachfront;
            if (sanenessVar2 != null) {
                Iterator it2 = sanenessVar2.f8579apical.iterator();
                while (it2.hasNext()) {
                    ((competently) it2.next()).saneness(impassibleVar);
                }
            }
        }
    }

    public final int grimness(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return seminary(context, xml);
                }
            }
            return -1;
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    public void hydrovane(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.beachfront beachfrontVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f8558arytenoidectomy == null) {
            this.f8558arytenoidectomy = this.f8559attabal.underbelly();
        }
        this.f8558arytenoidectomy.saneness(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f8570molybdenite = motionEvent.getRawX();
                this.f8565graveside = motionEvent.getRawY();
                this.f8566impassible = motionEvent;
                this.f8575triweekly = false;
                if (this.f8563dern.f8586formularize != null) {
                    RectF rectFBeachfront = this.f8563dern.f8586formularize.beachfront(this.f8559attabal, rectF);
                    if (rectFBeachfront != null && !rectFBeachfront.contains(this.f8566impassible.getX(), this.f8566impassible.getY())) {
                        this.f8566impassible = null;
                        this.f8575triweekly = true;
                        return;
                    }
                    RectF rectFArytenoidectomy = this.f8563dern.f8586formularize.arytenoidectomy(this.f8559attabal, rectF);
                    if (rectFArytenoidectomy == null || rectFArytenoidectomy.contains(this.f8566impassible.getX(), this.f8566impassible.getY())) {
                        this.f8568kowloon = false;
                    } else {
                        this.f8568kowloon = true;
                    }
                    this.f8563dern.f8586formularize.gintrap(this.f8570molybdenite, this.f8565graveside);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f8575triweekly) {
                float rawY = motionEvent.getRawY() - this.f8565graveside;
                float rawX = motionEvent.getRawX() - this.f8570molybdenite;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f8566impassible) == null) {
                    return;
                }
                saneness sanenessVarTaiyuan = taiyuan(i, rawX, rawY, motionEvent2);
                if (sanenessVarTaiyuan != null) {
                    motionLayout.setTransition(sanenessVarTaiyuan);
                    RectF rectFArytenoidectomy2 = this.f8563dern.f8586formularize.arytenoidectomy(this.f8559attabal, rectF);
                    if (rectFArytenoidectomy2 != null && !rectFArytenoidectomy2.contains(this.f8566impassible.getX(), this.f8566impassible.getY())) {
                        z = true;
                    }
                    this.f8568kowloon = z;
                    this.f8563dern.f8586formularize.cord(this.f8570molybdenite, this.f8565graveside);
                }
            }
        }
        if (this.f8575triweekly) {
            return;
        }
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar != null && sanenessVar.f8586formularize != null && !this.f8568kowloon) {
            this.f8563dern.f8586formularize.molybdenite(motionEvent, this.f8558arytenoidectomy, i, this);
        }
        this.f8570molybdenite = motionEvent.getRawX();
        this.f8565graveside = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (beachfrontVar = this.f8558arytenoidectomy) == null) {
            return;
        }
        beachfrontVar.attabal();
        this.f8558arytenoidectomy = null;
        int i2 = motionLayout.f8508walach;
        if (i2 != -1) {
            impromptu(motionLayout, i2);
        }
    }

    public androidx.constraintlayout.widget.attabal impassible(int i, int i2, int i3) {
        int iDern;
        marial marialVar = this.f8573saneness;
        if (marialVar != null && (iDern = marialVar.dern(i, i2, i3)) != -1) {
            i = iDern;
        }
        if (this.f8567impromptu.get(i) != null) {
            return this.f8567impromptu.get(i);
        }
        czestochowa.attabal.dern(this.f8559attabal.getContext(), i);
        SparseArray<androidx.constraintlayout.widget.attabal> sparseArray = this.f8567impromptu;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public boolean impromptu(MotionLayout motionLayout, int i) {
        saneness sanenessVar;
        if (merc() || this.f8576wireman) {
            return false;
        }
        for (saneness sanenessVar2 : this.f8569marial) {
            if (sanenessVar2.f8595triweekly != 0 && ((sanenessVar = this.f8563dern) != sanenessVar2 || !sanenessVar.oilcan(2))) {
                if (i == sanenessVar2.f8596wireman && (sanenessVar2.f8595triweekly == 4 || sanenessVar2.f8595triweekly == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(sanenessVar2);
                    if (sanenessVar2.f8595triweekly == 4) {
                        motionLayout.lightstruck();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.premeiotic(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.preterite();
                    }
                    return true;
                }
                if (i == sanenessVar2.f8585dern && (sanenessVar2.f8595triweekly == 3 || sanenessVar2.f8595triweekly == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(sanenessVar2);
                    if (sanenessVar2.f8595triweekly == 3) {
                        motionLayout.julian();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        motionLayout.premeiotic(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.preterite();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public saneness kattegat(int i) {
        for (saneness sanenessVar : this.f8569marial) {
            if (sanenessVar.f8581attabal == i) {
                return sanenessVar;
            }
        }
        return null;
    }

    public ArrayList<saneness> kowloon() {
        return this.f8569marial;
    }

    public void mathsort(int i, androidx.constraintlayout.widget.attabal attabalVar) {
        this.f8567impromptu.put(i, attabalVar);
    }

    public final boolean merc() {
        return this.f8558arytenoidectomy != null;
    }

    public Interpolator molybdenite() {
        int i = this.f8563dern.f8590marial;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f8559attabal.getContext(), this.f8563dern.f8583competently);
        }
        if (i == -1) {
            return new InterpolatorC0053attabal(lerp.dern.dern(this.f8563dern.f8582beachfront));
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

    public int monoploid() {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null) {
            return -1;
        }
        return sanenessVar.f8585dern;
    }

    public float oilcan() {
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f8563dern.f8586formularize.kowloon();
    }

    public void overspeculate(boolean z) {
        this.f8571monoploid = z;
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return;
        }
        this.f8563dern.f8586formularize.rotuma(this.f8571monoploid);
    }

    public void peridotite(MotionLayout motionLayout) {
        for (int i = 0; i < this.f8567impromptu.size(); i++) {
            int iKeyAt = this.f8567impromptu.keyAt(i);
            if (restrictive(iKeyAt)) {
                return;
            }
            walach(iKeyAt, motionLayout);
        }
    }

    public void permissivist() {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return;
        }
        this.f8563dern.f8586formularize.cuirassed();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void polder(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            saneness sanenessVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                seminary(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                competently competentlyVar = new competently(context, xml);
                                if (sanenessVar != null) {
                                    sanenessVar.f8579apical.add(competentlyVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                saran(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                this.f8572polloi.attabal(new dern(context, xml));
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                ArrayList<saneness> arrayList = this.f8569marial;
                                sanenessVar = new saneness(this, context, xml);
                                arrayList.add(sanenessVar);
                                if (this.f8563dern == null && !sanenessVar.f8593saneness) {
                                    this.f8563dern = sanenessVar;
                                    if (sanenessVar.f8586formularize != null) {
                                        this.f8563dern.f8586formularize.rotuma(this.f8571monoploid);
                                    }
                                }
                                if (sanenessVar.f8593saneness) {
                                    if (sanenessVar.f8585dern == -1) {
                                        this.f8560beachfront = sanenessVar;
                                    } else {
                                        this.f8561competently.add(sanenessVar);
                                    }
                                    this.f8569marial.remove(sanenessVar);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && sanenessVar != null && !this.f8559attabal.isInEditMode()) {
                                sanenessVar.adultoid(context, xml);
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (sanenessVar == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (sanenessVar != null) {
                                    sanenessVar.f8586formularize = new androidx.constraintlayout.motion.widget.saneness(context, this.f8559attabal, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                privatdozent(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f8573saneness = new marial(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                saran(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final int polloi(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    public boolean premeiotic() {
        Iterator<saneness> it = this.f8569marial.iterator();
        while (it.hasNext()) {
            if (it.next().f8586formularize != null) {
                return true;
            }
        }
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? false : true;
    }

    public final int preprohormone(int i) {
        int iDern;
        marial marialVar = this.f8573saneness;
        return (marialVar == null || (iDern = marialVar.dern(i, -1, -1)) == -1) ? i : iDern;
    }

    public final void privatdozent(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), sensatory.wireman.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == sensatory.wireman.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f8557apical);
                this.f8557apical = i2;
                if (i2 < 8) {
                    this.f8557apical = 8;
                }
            } else if (index == sensatory.wireman.MotionScene_layoutDuringTransition) {
                this.f8564formularize = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean restrictive(int i) {
        int i2 = this.f8562cutely.get(i);
        int size = this.f8562cutely.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f8562cutely.get(i2);
            size = i3;
        }
        return false;
    }

    public float rotuma(float f, float f2) {
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f8563dern.f8586formularize.cutely(f, f2);
    }

    public final void saran(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), sensatory.wireman.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == sensatory.wireman.include_constraintSet) {
                grimness(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public int sealless() {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null) {
            return -1;
        }
        return sanenessVar.f8596wireman;
    }

    public final int seminary(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.attabal attabalVar = new androidx.constraintlayout.widget.attabal();
        attabalVar.starveling(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iPolloi = -1;
        int iPolloi2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iPolloi2 = polloi(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        attabalVar.f8929marial = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                attabalVar.f8929marial = 4;
                                break;
                            case "left":
                                attabalVar.f8929marial = 2;
                                break;
                            case "none":
                                attabalVar.f8929marial = 0;
                                break;
                            case "right":
                                attabalVar.f8929marial = 1;
                                break;
                            case "x_right":
                                attabalVar.f8929marial = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iPolloi = polloi(context, attributeValue);
                    this.f8574taiyuan.put(cultivated(attributeValue), Integer.valueOf(iPolloi));
                    attabalVar.f8930saneness = czestochowa.attabal.dern(context, iPolloi);
                    break;
                case "stateLabels":
                    attabalVar.hydrovane(attributeValue);
                    break;
            }
        }
        if (iPolloi != -1) {
            if (this.f8559attabal.f8490sayid != 0) {
                attabalVar.walach(true);
            }
            attabalVar.oilcan(context, xmlPullParser);
            if (iPolloi2 != -1) {
                this.f8562cutely.put(iPolloi, iPolloi2);
            }
            this.f8567impromptu.put(iPolloi, attabalVar);
        }
        return iPolloi;
    }

    public void splinterproof(int i) {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar != null) {
            sanenessVar.yemenite(i);
        } else {
            this.f8557apical = i;
        }
    }

    public void starveling(float f, float f2) {
        saneness sanenessVar = this.f8563dern;
        if (sanenessVar == null || sanenessVar.f8586formularize == null) {
            return;
        }
        this.f8563dern.f8586formularize.dovishness(f, f2);
    }

    public float stratoscope() {
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f8563dern.f8586formularize.impassible();
    }

    public List<saneness> supplicat(int i) {
        int iPreprohormone = preprohormone(i);
        ArrayList arrayList = new ArrayList();
        for (saneness sanenessVar : this.f8569marial) {
            if (sanenessVar.f8596wireman == iPreprohormone || sanenessVar.f8585dern == iPreprohormone) {
                arrayList.add(sanenessVar);
            }
        }
        return arrayList;
    }

    public saneness taiyuan(int i, float f, float f2, MotionEvent motionEvent) {
        if (i == -1) {
            return this.f8563dern;
        }
        List<saneness> listSupplicat = supplicat(i);
        RectF rectF = new RectF();
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        saneness sanenessVar = null;
        for (saneness sanenessVar2 : listSupplicat) {
            if (!sanenessVar2.f8589kowloon && sanenessVar2.f8586formularize != null) {
                sanenessVar2.f8586formularize.rotuma(this.f8571monoploid);
                RectF rectFArytenoidectomy = sanenessVar2.f8586formularize.arytenoidectomy(this.f8559attabal, rectF);
                if (rectFArytenoidectomy == null || motionEvent == null || rectFArytenoidectomy.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFBeachfront = sanenessVar2.f8586formularize.beachfront(this.f8559attabal, rectF);
                    if (rectFBeachfront == null || motionEvent == null || rectFBeachfront.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fAttabal = sanenessVar2.f8586formularize.attabal(f, f2);
                        if (sanenessVar2.f8586formularize.f8652formularize && motionEvent != null) {
                            float x = motionEvent.getX() - sanenessVar2.f8586formularize.f8668taiyuan;
                            float y = motionEvent.getY() - sanenessVar2.f8586formularize.f8649cutely;
                            fAttabal = ((float) (Math.atan2(f2 + y, f + x) - Math.atan2(x, y))) * 10.0f;
                        }
                        float f4 = fAttabal * (sanenessVar2.f8585dern == i ? -1.0f : 1.1f);
                        if (f4 > f3) {
                            sanenessVar = sanenessVar2;
                            f3 = f4;
                        }
                    }
                }
            }
        }
        return sanenessVar;
    }

    public void timberyard(int i, View... viewArr) {
        this.f8572polloi.taiyuan(i, viewArr);
    }

    public int[] triweekly() {
        int size = this.f8567impromptu.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f8567impromptu.keyAt(i);
        }
        return iArr;
    }

    public float trm() {
        saneness sanenessVar = this.f8563dern;
        return (sanenessVar == null || sanenessVar.f8586formularize == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f8563dern.f8586formularize.triweekly();
    }

    public final void walach(int i, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.attabal attabalVar = this.f8567impromptu.get(i);
        attabalVar.f8927dern = attabalVar.f8930saneness;
        int i2 = this.f8562cutely.get(i);
        if (i2 > 0) {
            walach(i2, motionLayout);
            androidx.constraintlayout.widget.attabal attabalVar2 = this.f8567impromptu.get(i2);
            if (attabalVar2 == null) {
                czestochowa.attabal.dern(this.f8559attabal.getContext(), i2);
                return;
            }
            attabalVar.f8927dern += "/" + attabalVar2.f8927dern;
            attabalVar.seminary(attabalVar2);
        } else {
            attabalVar.f8927dern += "  layout";
            attabalVar.polder(motionLayout);
        }
        attabalVar.impromptu(attabalVar);
    }

    public float yemenite() {
        saneness sanenessVar = this.f8563dern;
        return sanenessVar != null ? sanenessVar.f8594taiyuan : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX INFO: compiled from: MotionScene.java */
    public static class saneness {

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public ArrayList<competently> f8579apical;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f8580arytenoidectomy;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f8581attabal;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public String f8582beachfront;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f8583competently;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public final attabal f8584cutely;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f8585dern;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.saneness f8586formularize;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public ArrayList<ViewOnClickListenerC0054attabal> f8587impassible;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f8588impromptu;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public boolean f8589kowloon;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f8590marial;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f8591monoploid;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f8592polloi;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f8593saneness;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public float f8594taiyuan;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f8595triweekly;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f8596wireman;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.attabal$saneness$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MotionScene.java */
        public static class ViewOnClickListenerC0054attabal implements View.OnClickListener {

            /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
            public int f8597arytenoidectomy;

            /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
            public final saneness f8598kowloon;

            /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
            public int f8599monoploid;

            public ViewOnClickListenerC0054attabal(Context context, saneness sanenessVar, XmlPullParser xmlPullParser) {
                this.f8597arytenoidectomy = -1;
                this.f8599monoploid = 17;
                this.f8598kowloon = sanenessVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), sensatory.wireman.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == sensatory.wireman.OnClick_targetId) {
                        this.f8597arytenoidectomy = typedArrayObtainStyledAttributes.getResourceId(index, this.f8597arytenoidectomy);
                    } else if (index == sensatory.wireman.OnClick_clickAction) {
                        this.f8599monoploid = typedArrayObtainStyledAttributes.getInt(index, this.f8599monoploid);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void attabal(MotionLayout motionLayout, int i, saneness sanenessVar) {
                boolean z;
                View viewFindViewById;
                int i2 = this.f8597arytenoidectomy;
                View view = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    view = viewFindViewById;
                    return;
                }
                int i3 = sanenessVar.f8596wireman;
                int i4 = sanenessVar.f8585dern;
                if (i3 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.f8599monoploid;
                boolean z2 = false;
                if ((i5 & 1) == 0 || i != i3) {
                    view = viewFindViewById;
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = ((i5 & 1) != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z2 = true;
                }
                if (z3 || z2) {
                    view.setOnClickListener(this);
                }
            }

            public void dern(MotionLayout motionLayout) {
                View viewFindViewById;
                int i = this.f8597arytenoidectomy;
                if (i == -1 || (viewFindViewById = motionLayout.findViewById(i)) == null) {
                    return;
                }
                viewFindViewById.setOnClickListener(null);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f8598kowloon.f8584cutely.f8559attabal;
                if (motionLayout.sensatory()) {
                    if (this.f8598kowloon.f8596wireman == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.achondroplasia(this.f8598kowloon.f8585dern);
                            return;
                        }
                        saneness sanenessVar = new saneness(this.f8598kowloon.f8584cutely, this.f8598kowloon);
                        sanenessVar.f8596wireman = currentState;
                        sanenessVar.f8585dern = this.f8598kowloon.f8585dern;
                        motionLayout.setTransition(sanenessVar);
                        motionLayout.lightstruck();
                        return;
                    }
                    saneness sanenessVar2 = this.f8598kowloon.f8584cutely.f8563dern;
                    int i = this.f8599monoploid;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        saneness sanenessVar3 = this.f8598kowloon.f8584cutely.f8563dern;
                        saneness sanenessVar4 = this.f8598kowloon;
                        if (sanenessVar3 != sanenessVar4) {
                            motionLayout.setTransition(sanenessVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z3 = false;
                            z = z2;
                        }
                    } else {
                        z = z2;
                    }
                    if (saneness(sanenessVar2, motionLayout)) {
                        if (z && (this.f8599monoploid & 1) != 0) {
                            motionLayout.setTransition(this.f8598kowloon);
                            motionLayout.lightstruck();
                            return;
                        }
                        if (z3 && (this.f8599monoploid & 16) != 0) {
                            motionLayout.setTransition(this.f8598kowloon);
                            motionLayout.julian();
                        } else if (z && (this.f8599monoploid & 256) != 0) {
                            motionLayout.setTransition(this.f8598kowloon);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.f8599monoploid & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f8598kowloon);
                            motionLayout.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    }
                }
            }

            public boolean saneness(saneness sanenessVar, MotionLayout motionLayout) {
                saneness sanenessVar2 = this.f8598kowloon;
                if (sanenessVar2 == sanenessVar) {
                    return true;
                }
                int i = sanenessVar2.f8585dern;
                int i2 = this.f8598kowloon.f8596wireman;
                if (i2 == -1) {
                    return motionLayout.f8508walach != i;
                }
                int i3 = motionLayout.f8508walach;
                return i3 == i2 || i3 == i;
            }
        }

        public saneness(attabal attabalVar, saneness sanenessVar) {
            this.f8581attabal = -1;
            this.f8593saneness = false;
            this.f8585dern = -1;
            this.f8596wireman = -1;
            this.f8590marial = 0;
            this.f8582beachfront = null;
            this.f8583competently = -1;
            this.f8588impromptu = 400;
            this.f8594taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8579apical = new ArrayList<>();
            this.f8586formularize = null;
            this.f8587impassible = new ArrayList<>();
            this.f8595triweekly = 0;
            this.f8589kowloon = false;
            this.f8580arytenoidectomy = -1;
            this.f8591monoploid = 0;
            this.f8592polloi = 0;
            this.f8584cutely = attabalVar;
            this.f8588impromptu = attabalVar.f8557apical;
            if (sanenessVar != null) {
                this.f8580arytenoidectomy = sanenessVar.f8580arytenoidectomy;
                this.f8590marial = sanenessVar.f8590marial;
                this.f8582beachfront = sanenessVar.f8582beachfront;
                this.f8583competently = sanenessVar.f8583competently;
                this.f8588impromptu = sanenessVar.f8588impromptu;
                this.f8579apical = sanenessVar.f8579apical;
                this.f8594taiyuan = sanenessVar.f8594taiyuan;
                this.f8591monoploid = sanenessVar.f8591monoploid;
            }
        }

        public void adultoid(Context context, XmlPullParser xmlPullParser) {
            this.f8587impassible.add(new ViewOnClickListenerC0054attabal(context, this, xmlPullParser));
        }

        public int cord() {
            return this.f8591monoploid;
        }

        public int cuirassed() {
            return this.f8596wireman;
        }

        public final void dovishness(attabal attabalVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == sensatory.wireman.Transition_constraintSetEnd) {
                    this.f8585dern = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8585dern);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.attabal attabalVar2 = new androidx.constraintlayout.widget.attabal();
                        attabalVar2.trm(context, this.f8585dern);
                        attabalVar.f8567impromptu.append(this.f8585dern, attabalVar2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f8585dern = attabalVar.grimness(context, this.f8585dern);
                    }
                } else if (index == sensatory.wireman.Transition_constraintSetStart) {
                    this.f8596wireman = typedArray.getResourceId(index, this.f8596wireman);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f8596wireman);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.attabal attabalVar3 = new androidx.constraintlayout.widget.attabal();
                        attabalVar3.trm(context, this.f8596wireman);
                        attabalVar.f8567impromptu.append(this.f8596wireman, attabalVar3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f8596wireman = attabalVar.grimness(context, this.f8596wireman);
                    }
                } else if (index == sensatory.wireman.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f8583competently = resourceId;
                        if (resourceId != -1) {
                            this.f8590marial = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f8582beachfront = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f8583competently = typedArray.getResourceId(index, -1);
                                this.f8590marial = -2;
                            } else {
                                this.f8590marial = -1;
                            }
                        }
                    } else {
                        this.f8590marial = typedArray.getInteger(index, this.f8590marial);
                    }
                } else if (index == sensatory.wireman.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.f8588impromptu);
                    this.f8588impromptu = i3;
                    if (i3 < 8) {
                        this.f8588impromptu = 8;
                    }
                } else if (index == sensatory.wireman.Transition_staggered) {
                    this.f8594taiyuan = typedArray.getFloat(index, this.f8594taiyuan);
                } else if (index == sensatory.wireman.Transition_autoTransition) {
                    this.f8595triweekly = typedArray.getInteger(index, this.f8595triweekly);
                } else if (index == sensatory.wireman.Transition_android_id) {
                    this.f8581attabal = typedArray.getResourceId(index, this.f8581attabal);
                } else if (index == sensatory.wireman.Transition_transitionDisable) {
                    this.f8589kowloon = typedArray.getBoolean(index, this.f8589kowloon);
                } else if (index == sensatory.wireman.Transition_pathMotionArc) {
                    this.f8580arytenoidectomy = typedArray.getInteger(index, -1);
                } else if (index == sensatory.wireman.Transition_layoutDuringTransition) {
                    this.f8591monoploid = typedArray.getInteger(index, 0);
                } else if (index == sensatory.wireman.Transition_transitionFlags) {
                    this.f8592polloi = typedArray.getInteger(index, 0);
                }
            }
            if (this.f8596wireman == -1) {
                this.f8593saneness = true;
            }
        }

        public final void gintrap(attabal attabalVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sensatory.wireman.Transition);
            dovishness(attabalVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void graveside(competently competentlyVar) {
            this.f8579apical.add(competentlyVar);
        }

        public void kattegat(int i) {
            androidx.constraintlayout.motion.widget.saneness sanenessVarStratoscope = stratoscope();
            if (sanenessVarStratoscope != null) {
                sanenessVarStratoscope.preprohormone(i);
            }
        }

        public boolean oilcan(int i) {
            return (i & this.f8592polloi) != 0;
        }

        public int preprohormone() {
            return this.f8585dern;
        }

        public int rotuma() {
            return this.f8595triweekly;
        }

        public void sealless(int i, String str, int i2) {
            this.f8590marial = i;
            this.f8582beachfront = str;
            this.f8583competently = i2;
        }

        public androidx.constraintlayout.motion.widget.saneness stratoscope() {
            return this.f8586formularize;
        }

        public void supplicat(int i) {
            this.f8580arytenoidectomy = i;
        }

        public boolean trm() {
            return !this.f8589kowloon;
        }

        public void yemenite(int i) {
            this.f8588impromptu = Math.max(i, 8);
        }

        public saneness(int i, attabal attabalVar, int i2, int i3) {
            this.f8581attabal = -1;
            this.f8593saneness = false;
            this.f8585dern = -1;
            this.f8596wireman = -1;
            this.f8590marial = 0;
            this.f8582beachfront = null;
            this.f8583competently = -1;
            this.f8588impromptu = 400;
            this.f8594taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8579apical = new ArrayList<>();
            this.f8586formularize = null;
            this.f8587impassible = new ArrayList<>();
            this.f8595triweekly = 0;
            this.f8589kowloon = false;
            this.f8580arytenoidectomy = -1;
            this.f8591monoploid = 0;
            this.f8592polloi = 0;
            this.f8581attabal = i;
            this.f8584cutely = attabalVar;
            this.f8596wireman = i2;
            this.f8585dern = i3;
            this.f8588impromptu = attabalVar.f8557apical;
            this.f8591monoploid = attabalVar.f8564formularize;
        }

        public saneness(attabal attabalVar, Context context, XmlPullParser xmlPullParser) {
            this.f8581attabal = -1;
            this.f8593saneness = false;
            this.f8585dern = -1;
            this.f8596wireman = -1;
            this.f8590marial = 0;
            this.f8582beachfront = null;
            this.f8583competently = -1;
            this.f8588impromptu = 400;
            this.f8594taiyuan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.f8579apical = new ArrayList<>();
            this.f8586formularize = null;
            this.f8587impassible = new ArrayList<>();
            this.f8595triweekly = 0;
            this.f8589kowloon = false;
            this.f8580arytenoidectomy = -1;
            this.f8591monoploid = 0;
            this.f8592polloi = 0;
            this.f8588impromptu = attabalVar.f8557apical;
            this.f8591monoploid = attabalVar.f8564formularize;
            this.f8584cutely = attabalVar;
            gintrap(attabalVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
