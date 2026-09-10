package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStates {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f4062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4063b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4064c = -1;
    public final SparseArray d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f4065e = new SparseArray();

    public static class State {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f4067b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4068c;
        public final ConstraintSet d;

        public State(Context context, XmlResourceParser xmlResourceParser) {
            this.f4068c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f4134p);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f4066a = typedArrayObtainStyledAttributes.getResourceId(index, this.f4066a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4068c);
                    this.f4068c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.d = constraintSet;
                        constraintSet.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Variant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f4070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f4071c;
        public final float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4072e;
        public final ConstraintSet f;

        public Variant(Context context, XmlResourceParser xmlResourceParser) {
            this.f4069a = Float.NaN;
            this.f4070b = Float.NaN;
            this.f4071c = Float.NaN;
            this.d = Float.NaN;
            this.f4072e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f4072e);
                    this.f4072e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f = constraintSet;
                        constraintSet.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f4070b = typedArrayObtainStyledAttributes.getDimension(index, this.f4070b);
                } else if (index == 3) {
                    this.f4071c = typedArrayObtainStyledAttributes.getDimension(index, this.f4071c);
                } else if (index == 4) {
                    this.f4069a = typedArrayObtainStyledAttributes.getDimension(index, this.f4069a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f2) {
            float f3 = this.f4069a;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.f4070b;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f4071c;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.d;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i2) {
        byte b2;
        State state = null;
        this.f4062a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b2 = 4;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
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
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
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
                            state = new State(context, xml);
                            this.d.put(state.f4066a, state);
                        } else if (b2 == 3) {
                            Variant variant = new Variant(context, xml);
                            if (state != null) {
                                state.f4067b.add(variant);
                            }
                        } else if (b2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i2))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i2);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.m(context, xmlResourceParser);
                this.f4065e.put(identifier, constraintSet);
                return;
            }
        }
    }

    public final void b(int i2, float f, float f2) {
        int i3 = this.f4063b;
        SparseArray sparseArray = this.d;
        int i4 = 0;
        ConstraintLayout constraintLayout = this.f4062a;
        if (i3 == i2) {
            State state = i2 == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(i3);
            int i5 = this.f4064c;
            if (i5 == -1 || !((Variant) state.f4067b.get(i5)).a(f, f2)) {
                while (true) {
                    ArrayList arrayList = state.f4067b;
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    } else if (((Variant) arrayList.get(i4)).a(f, f2)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (this.f4064c == i4) {
                    return;
                }
                ArrayList arrayList2 = state.f4067b;
                ConstraintSet constraintSet = i4 == -1 ? null : ((Variant) arrayList2.get(i4)).f;
                if (i4 != -1) {
                    int i6 = ((Variant) arrayList2.get(i4)).f4072e;
                }
                if (constraintSet == null) {
                    return;
                }
                this.f4064c = i4;
                constraintSet.b(constraintLayout);
                return;
            }
            return;
        }
        this.f4063b = i2;
        State state2 = (State) sparseArray.get(i2);
        while (true) {
            ArrayList arrayList3 = state2.f4067b;
            if (i4 >= arrayList3.size()) {
                i4 = -1;
                break;
            } else if (((Variant) arrayList3.get(i4)).a(f, f2)) {
                break;
            } else {
                i4++;
            }
        }
        ArrayList arrayList4 = state2.f4067b;
        ConstraintSet constraintSet2 = i4 == -1 ? state2.d : ((Variant) arrayList4.get(i4)).f;
        if (i4 != -1) {
            int i7 = ((Variant) arrayList4.get(i4)).f4072e;
        }
        if (constraintSet2 != null) {
            this.f4064c = i4;
            constraintSet2.b(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f + ", " + f2);
    }
}
