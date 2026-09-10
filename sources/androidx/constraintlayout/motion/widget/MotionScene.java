package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
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
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import com.charging.screenshow.battery.animations.themes.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class MotionScene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f3847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StateSet f3848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Transition f3849c;
    public final ArrayList d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Transition f3850e;
    public final ArrayList f;
    public final SparseArray g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f3851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f3852i;
    public int j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f3853l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MotionLayout.MotionTracker f3854n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3855p;
    public float q;

    public MotionScene(Context context, MotionLayout motionLayout, int i2) {
        Transition transition = null;
        this.f3848b = null;
        this.f3849c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f3850e = null;
        this.f = new ArrayList();
        this.g = new SparseArray();
        this.f3851h = new HashMap();
        this.f3852i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.f3847a = motionLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            while (true) {
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        switch (name) {
                            case "MotionScene":
                                g(context, xml);
                                break;
                            case "Transition":
                                transition = new Transition(this, context, xml);
                                arrayList.add(transition);
                                if (this.f3849c == null && !transition.f3858b) {
                                    this.f3849c = transition;
                                    TouchResponse touchResponse = transition.f3863l;
                                    if (touchResponse != null) {
                                        touchResponse.b(this.o);
                                    }
                                }
                                if (!transition.f3858b) {
                                    break;
                                } else {
                                    if (transition.f3859c == -1) {
                                        this.f3850e = transition;
                                    } else {
                                        this.f.add(transition);
                                    }
                                    arrayList.remove(transition);
                                    break;
                                }
                                break;
                            case "OnSwipe":
                                if (transition == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i2) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                transition.f3863l = new TouchResponse(context, this.f3847a, xml);
                                break;
                            case "OnClick":
                                transition.getClass();
                                transition.m.add(new Transition.TransitionOnClick(context, transition, xml));
                                break;
                            case "StateSet":
                                this.f3848b = new StateSet(context, xml);
                                break;
                            case "ConstraintSet":
                                f(context, xml);
                                break;
                            case "KeyFrameSet":
                                transition.k.add(new KeyFrames(context, xml));
                                break;
                            default:
                                Log.v("MotionScene", "WARNING UNKNOWN ATTRIBUTE " + name);
                                break;
                        }
                    }
                    eventType = xml.next();
                }
                this.g.put(R.id.motion_base, new ConstraintSet());
                this.f3851h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final boolean a(MotionLayout motionLayout, int i2) {
        if (this.f3854n != null) {
            return false;
        }
        for (Transition transition : this.d) {
            int i3 = transition.f3864n;
            if (i3 != 0) {
                int i4 = transition.d;
                MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.Z;
                MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.f3846Y;
                MotionLayout.TransitionState transitionState3 = MotionLayout.TransitionState.X;
                if (i2 == i4 && (i3 == 4 || i3 == 2)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition);
                    if (transition.f3864n == 4) {
                        motionLayout.c(1.0f);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.h(true);
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                    motionLayout.setState(transitionState);
                    return true;
                }
                if (i2 == transition.f3859c && (i3 == 3 || i3 == 1)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition);
                    if (transition.f3864n == 3) {
                        motionLayout.c(0.0f);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.h(true);
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                    motionLayout.setState(transitionState);
                    return true;
                }
            }
        }
        return false;
    }

    public final ConstraintSet b(int i2) {
        int iB;
        StateSet stateSet = this.f3848b;
        if (stateSet != null && (iB = stateSet.b(i2)) != -1) {
            i2 = iB;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i2) != null) {
            return (ConstraintSet) sparseArray.get(i2);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.a(this.f3847a.getContext(), i2) + " In MotionScene");
        return (ConstraintSet) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final Interpolator d() {
        Transition transition = this.f3849c;
        int i2 = transition.f3860e;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.f3847a.getContext(), this.f3849c.g);
        }
        if (i2 == -1) {
            final Easing easingB = Easing.b(transition.f);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) easingB.a(f);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new AnticipateInterpolator();
        }
        if (i2 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public final float e() {
        TouchResponse touchResponse;
        Transition transition = this.f3849c;
        if (transition == null || (touchResponse = transition.f3863l) == null) {
            return 0.0f;
        }
        return touchResponse.o;
    }

    public final void f(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.f4075b = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlResourceParser.getAttributeName(i2);
            String attributeValue = xmlResourceParser.getAttributeValue(i2);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iC2 = c(context, attributeValue);
            } else if (attributeName.equals("id")) {
                iC = c(context, attributeValue);
                int iIndexOf = attributeValue.indexOf(47);
                if (iIndexOf >= 0) {
                    attributeValue = attributeValue.substring(iIndexOf + 1);
                }
                this.f3851h.put(attributeValue, Integer.valueOf(iC));
            }
        }
        if (iC != -1) {
            int i3 = this.f3847a.w0;
            constraintSet.m(context, xmlResourceParser);
            if (iC2 != -1) {
                this.f3852i.put(iC, iC2);
            }
            this.g.put(iC, constraintSet);
        }
    }

    public final void g(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.f4132l);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.j = typedArrayObtainStyledAttributes.getInt(index, this.j);
            } else if (index == 1) {
                this.k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void h(int i2) {
        SparseIntArray sparseIntArray = this.f3852i;
        int i3 = sparseIntArray.get(i2);
        if (i3 > 0) {
            h(sparseIntArray.get(i2));
            SparseArray sparseArray = this.g;
            ConstraintSet constraintSet = (ConstraintSet) sparseArray.get(i2);
            ConstraintSet constraintSet2 = (ConstraintSet) sparseArray.get(i3);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.a(this.f3847a.getContext(), i3));
                return;
            }
            constraintSet.getClass();
            HashMap map = constraintSet2.f4076c;
            for (Integer num : map.keySet()) {
                num.getClass();
                ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) map.get(num);
                HashMap map2 = constraintSet.f4076c;
                if (!map2.containsKey(num)) {
                    map2.put(num, new ConstraintSet.Constraint());
                }
                ConstraintSet.Constraint constraint2 = (ConstraintSet.Constraint) map2.get(num);
                ConstraintSet.Layout layout = constraint2.d;
                if (!layout.f4095b) {
                    layout.a(constraint.d);
                }
                ConstraintSet.PropertySet propertySet = constraint2.f4078b;
                if (!propertySet.f4114a) {
                    ConstraintSet.PropertySet propertySet2 = constraint.f4078b;
                    propertySet.f4114a = propertySet2.f4114a;
                    propertySet.f4115b = propertySet2.f4115b;
                    propertySet.d = propertySet2.d;
                    propertySet.f4117e = propertySet2.f4117e;
                    propertySet.f4116c = propertySet2.f4116c;
                }
                ConstraintSet.Transform transform = constraint2.f4080e;
                if (!transform.f4119a) {
                    transform.a(constraint.f4080e);
                }
                ConstraintSet.Motion motion = constraint2.f4079c;
                if (!motion.f4110a) {
                    motion.a(constraint.f4079c);
                }
                for (String str : constraint.f.keySet()) {
                    if (!constraint2.f.containsKey(str)) {
                        constraint2.f.put(str, constraint.f.get(str));
                    }
                }
            }
            sparseIntArray.put(i2, -1);
        }
    }

    public final void i(MotionLayout motionLayout) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.g;
            if (i2 >= sparseArray.size()) {
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    ConstraintSet constraintSet = (ConstraintSet) sparseArray.valueAt(i3);
                    constraintSet.getClass();
                    int childCount = motionLayout.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = motionLayout.getChildAt(i4);
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        int id = childAt.getId();
                        if (constraintSet.f4075b && id == -1) {
                            throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                        }
                        HashMap map = constraintSet.f4076c;
                        if (!map.containsKey(Integer.valueOf(id))) {
                            map.put(Integer.valueOf(id), new ConstraintSet.Constraint());
                        }
                        ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) map.get(Integer.valueOf(id));
                        if (!constraint.d.f4095b) {
                            constraint.b(id, layoutParams);
                            boolean z2 = childAt instanceof ConstraintHelper;
                            ConstraintSet.Layout layout = constraint.d;
                            if (z2) {
                                layout.e0 = ((ConstraintHelper) childAt).getReferencedIds();
                                if (childAt instanceof Barrier) {
                                    Barrier barrier = (Barrier) childAt;
                                    layout.j0 = barrier.n0.h0;
                                    layout.f4096b0 = barrier.getType();
                                    layout.f4098c0 = barrier.getMargin();
                                }
                            }
                            layout.f4095b = true;
                        }
                        ConstraintSet.PropertySet propertySet = constraint.f4078b;
                        if (!propertySet.f4114a) {
                            propertySet.f4115b = childAt.getVisibility();
                            propertySet.d = childAt.getAlpha();
                            propertySet.f4114a = true;
                        }
                        ConstraintSet.Transform transform = constraint.f4080e;
                        if (!transform.f4119a) {
                            transform.f4119a = true;
                            transform.f4120b = childAt.getRotation();
                            transform.f4121c = childAt.getRotationX();
                            transform.d = childAt.getRotationY();
                            transform.f4122e = childAt.getScaleX();
                            transform.f = childAt.getScaleY();
                            float pivotX = childAt.getPivotX();
                            float pivotY = childAt.getPivotY();
                            if (pivotX != 0.0d || pivotY != 0.0d) {
                                transform.g = pivotX;
                                transform.f4123h = pivotY;
                            }
                            transform.f4124i = childAt.getTranslationX();
                            transform.j = childAt.getTranslationY();
                            transform.k = childAt.getTranslationZ();
                            if (transform.f4125l) {
                                transform.m = childAt.getElevation();
                            }
                        }
                    }
                }
                return;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            SparseIntArray sparseIntArray = this.f3852i;
            int i5 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i5 > 0) {
                if (i5 != iKeyAt) {
                    int i6 = size - 1;
                    if (size >= 0) {
                        i5 = sparseIntArray.get(i5);
                        size = i6;
                    }
                }
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            h(iKeyAt);
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public final void j(int i2, int i3) {
        int iB;
        int iB2;
        ArrayList arrayList;
        Iterator it;
        Transition transition;
        Transition transition2;
        Transition transition3;
        int i4;
        TouchResponse touchResponse;
        StateSet stateSet = this.f3848b;
        if (stateSet != null) {
            iB = stateSet.b(i2);
            if (iB == -1) {
                iB = i2;
            }
            iB2 = this.f3848b.b(i3);
            if (iB2 == -1) {
            }
            arrayList = this.d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    transition = this.f3850e;
                    for (Transition transition4 : this.f) {
                        if (transition4.f3859c == i3) {
                            transition = transition4;
                        }
                    }
                    transition2 = new Transition(this, transition);
                    transition2.d = iB;
                    transition2.f3859c = iB2;
                    if (iB != -1) {
                        arrayList.add(transition2);
                    }
                    this.f3849c = transition2;
                    return;
                }
                transition3 = (Transition) it.next();
                i4 = transition3.f3859c;
                if ((i4 != iB2 && transition3.d == iB) || (i4 == i3 && transition3.d == i2)) {
                    break;
                }
            }
            this.f3849c = transition3;
            touchResponse = transition3.f3863l;
            if (touchResponse != null) {
                touchResponse.b(this.o);
            }
        }
        iB = i2;
        iB2 = i3;
        arrayList = this.d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                transition = this.f3850e;
                while (r4.hasNext()) {
                    if (transition4.f3859c == i3) {
                        transition = transition4;
                    }
                }
                transition2 = new Transition(this, transition);
                transition2.d = iB;
                transition2.f3859c = iB2;
                if (iB != -1) {
                    arrayList.add(transition2);
                }
                this.f3849c = transition2;
                return;
            }
            transition3 = (Transition) it.next();
            i4 = transition3.f3859c;
            if (i4 != iB2) {
            }
        }
        this.f3849c = transition3;
        touchResponse = transition3.f3863l;
        if (touchResponse != null) {
            touchResponse.b(this.o);
        }
    }

    public final boolean k() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((Transition) it.next()).f3863l != null) {
                return true;
            }
        }
        Transition transition = this.f3849c;
        return (transition == null || transition.f3863l == null) ? false : true;
    }

    public static class Transition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f3858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3859c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3860e;
        public final String f;
        public final int g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3861h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f3862i;
        public final MotionScene j;
        public final ArrayList k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public TouchResponse f3863l;
        public final ArrayList m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f3864n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f3865p;
        public final int q;

        public static class TransitionOnClick implements View.OnClickListener {
            public final Transition X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final int f3866Y;
            public final int Z;

            public TransitionOnClick(Context context, Transition transition, XmlResourceParser xmlResourceParser) {
                this.f3866Y = -1;
                this.Z = 17;
                this.X = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.m);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    if (index == 1) {
                        this.f3866Y = typedArrayObtainStyledAttributes.getResourceId(index, this.f3866Y);
                    } else if (index == 0) {
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void a(MotionLayout motionLayout, int i2, Transition transition) {
                boolean z2;
                View viewFindViewById;
                int i3 = this.f3866Y;
                View view = motionLayout;
                if (i3 != -1) {
                    viewFindViewById = motionLayout.findViewById(i3);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", "OnClick could not find id " + i3);
                    return;
                }
                int i4 = transition.d;
                int i5 = transition.f3859c;
                if (i4 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i6 = this.Z;
                int i7 = i6 & 1;
                if (i7 == 0 || i2 != i4) {
                    view = viewFindViewById;
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (((i7 != 0 && i2 == i4) | z2 | ((i6 & 256) != 0 && i2 == i4) | ((i6 & 16) != 0 && i2 == i5)) || ((i6 & 4096) != 0 && i2 == i5)) {
                    view.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i2 = this.f3866Y;
                if (i2 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i2);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i2);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Transition transition = this.X;
                MotionScene motionScene = transition.j;
                MotionLayout motionLayout = motionScene.f3847a;
                if (motionLayout.m0) {
                    if (transition.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.t(transition.f3859c);
                            return;
                        }
                        Transition transition2 = new Transition(motionScene, transition);
                        transition2.d = currentState;
                        transition2.f3859c = transition.f3859c;
                        motionLayout.setTransition(transition2);
                        motionLayout.c(1.0f);
                        return;
                    }
                    Transition transition3 = motionScene.f3849c;
                    int i2 = this.Z;
                    int i3 = i2 & 1;
                    boolean z2 = true;
                    boolean z3 = false;
                    boolean z4 = (i3 == 0 && (i2 & 256) == 0) ? false : true;
                    int i4 = i2 & 16;
                    if (i4 == 0 && (i2 & 4096) == 0) {
                        z2 = false;
                    }
                    if (z4 && z2) {
                        if (transition3 != transition) {
                            motionLayout.setTransition(transition);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z2 = false;
                            z3 = z4;
                        }
                    } else {
                        z3 = z4;
                    }
                    if (transition != transition3) {
                        int i5 = transition.f3859c;
                        int i6 = transition.d;
                        if (i6 != -1) {
                            int i7 = motionLayout.i0;
                            if (i7 != i6 && i7 != i5) {
                                return;
                            }
                        } else if (motionLayout.i0 == i5) {
                            return;
                        }
                    }
                    if (z3 && i3 != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.c(1.0f);
                        return;
                    }
                    if (z2 && i4 != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.c(0.0f);
                    } else if (z3 && (i2 & 256) != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.setProgress(1.0f);
                    } else {
                        if (!z2 || (i2 & 4096) == 0) {
                            return;
                        }
                        motionLayout.setTransition(transition);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public Transition(MotionScene motionScene, Transition transition) {
            this.f3857a = -1;
            this.f3858b = false;
            this.f3859c = -1;
            this.d = -1;
            this.f3860e = 0;
            this.f = null;
            this.g = -1;
            this.f3861h = 400;
            this.f3862i = 0.0f;
            this.k = new ArrayList();
            this.f3863l = null;
            this.m = new ArrayList();
            this.f3864n = 0;
            this.o = false;
            this.f3865p = 0;
            this.q = 0;
            this.j = motionScene;
            if (transition != null) {
                this.f3860e = transition.f3860e;
                this.f = transition.f;
                this.g = transition.g;
                this.f3861h = transition.f3861h;
                this.k = transition.k;
                this.f3862i = transition.f3862i;
                this.f3865p = transition.f3865p;
            }
        }

        public Transition(MotionScene motionScene, Context context, XmlResourceParser xmlResourceParser) {
            this.f3857a = -1;
            this.f3858b = false;
            this.f3859c = -1;
            this.d = -1;
            this.f3860e = 0;
            this.f = null;
            this.g = -1;
            this.f3861h = 400;
            this.f3862i = 0.0f;
            this.k = new ArrayList();
            this.f3863l = null;
            this.m = new ArrayList();
            this.f3864n = 0;
            this.o = false;
            this.f3865p = 0;
            this.q = 0;
            this.f3861h = motionScene.j;
            this.f3865p = motionScene.k;
            this.j = motionScene;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                SparseArray sparseArray = motionScene.g;
                if (index == 2) {
                    this.f3859c = typedArrayObtainStyledAttributes.getResourceId(index, this.f3859c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f3859c))) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.l(context, this.f3859c);
                        sparseArray.append(this.f3859c, constraintSet);
                    }
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.d))) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.l(context, this.d);
                        sparseArray.append(this.d, constraintSet2);
                    }
                } else if (index == 6) {
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.f3860e = -2;
                        }
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string.indexOf("/") > 0) {
                            this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f3860e = -2;
                        } else {
                            this.f3860e = -1;
                        }
                    } else {
                        this.f3860e = typedArrayObtainStyledAttributes.getInteger(index, this.f3860e);
                    }
                } else if (index == 4) {
                    this.f3861h = typedArrayObtainStyledAttributes.getInt(index, this.f3861h);
                } else if (index == 8) {
                    this.f3862i = typedArrayObtainStyledAttributes.getFloat(index, this.f3862i);
                } else if (index == 1) {
                    this.f3864n = typedArrayObtainStyledAttributes.getInteger(index, this.f3864n);
                } else if (index == 0) {
                    this.f3857a = typedArrayObtainStyledAttributes.getResourceId(index, this.f3857a);
                } else if (index == 9) {
                    this.o = typedArrayObtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == 7) {
                    typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f3865p = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.f3858b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
