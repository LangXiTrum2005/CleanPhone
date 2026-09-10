package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class StateSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f4136b = new SparseArray();

    public static class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f4138b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4139c;

        public State(Context context, XmlResourceParser xmlResourceParser) {
            this.f4139c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f4134p);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f4137a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4137a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4139c);
                    this.f4139c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f4141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f4142c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4143e;

        public Variant(Context context, XmlResourceParser xmlResourceParser) {
            this.f4140a = Float.NaN;
            this.f4141b = Float.NaN;
            this.f4142c = Float.NaN;
            this.d = Float.NaN;
            this.f4143e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4143e);
                    this.f4143e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f4141b = typedArrayObtainStyledAttributes.getDimension(index, this.f4141b);
                } else if (index == 3) {
                    this.f4142c = typedArrayObtainStyledAttributes.getDimension(index, this.f4142c);
                } else if (index == 4) {
                    this.f4140a = typedArrayObtainStyledAttributes.getDimension(index, this.f4140a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f2) {
            float f3 = this.f4140a;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f4141b;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f4142c;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.d;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public StateSet(Context context, XmlResourceParser xmlResourceParser) {
        byte b2;
        this.f4135a = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f4135a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4135a);
            }
        }
        try {
            int eventType = xmlResourceParser.getEventType();
            State state = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 != 0 && b2 != 1) {
                        if (b2 == 2) {
                            state = new State(context, xmlResourceParser);
                            this.f4136b.put(state.f4137a, state);
                        } else if (b2 != 3) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            Variant variant = new Variant(context, xmlResourceParser);
                            if (state != null) {
                                state.f4138b.add(variant);
                            }
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final int a(float f, float f2, int i2, int i3) {
        State state = (State) this.f4136b.get(i3);
        if (state == null) {
            return i3;
        }
        ArrayList<Variant> arrayList = state.f4138b;
        int i4 = state.f4139c;
        if (f != -1.0f && f2 != -1.0f) {
            Variant variant = null;
            for (Variant variant2 : arrayList) {
                if (variant2.a(f, f2)) {
                    if (i2 != variant2.f4143e) {
                        variant = variant2;
                    }
                }
            }
            return variant != null ? variant.f4143e : i4;
        }
        if (i4 != i2) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (i2 == ((Variant) it.next()).f4143e) {
                }
            }
            return i4;
        }
        return i2;
    }

    public final int b(int i2) {
        float f = -1;
        SparseArray sparseArray = this.f4136b;
        int i3 = 0;
        if (-1 == i2) {
            State state = i2 == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(-1);
            if (state != null) {
                while (true) {
                    ArrayList arrayList = state.f4138b;
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    }
                    if (((Variant) arrayList.get(i3)).a(f, f)) {
                        break;
                    }
                    i3++;
                }
                if (-1 != i3) {
                    return i3 == -1 ? state.f4139c : ((Variant) state.f4138b.get(i3)).f4143e;
                }
            }
        } else {
            State state2 = (State) sparseArray.get(i2);
            if (state2 != null) {
                while (true) {
                    ArrayList arrayList2 = state2.f4138b;
                    if (i3 >= arrayList2.size()) {
                        i3 = -1;
                        break;
                    }
                    if (((Variant) arrayList2.get(i3)).a(f, f)) {
                        break;
                    }
                    i3++;
                }
                return i3 == -1 ? state2.f4139c : ((Variant) state2.f4138b.get(i3)).f4143e;
            }
        }
        return -1;
    }
}
