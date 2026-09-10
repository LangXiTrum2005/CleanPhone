package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AttributeType f4022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f4024c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4025e;
    public int f;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintAttribute$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4026a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f4026a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4026a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4026a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4026a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4026a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4026a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4026a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AttributeType {
        public static final AttributeType X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final AttributeType f4027Y;
        public static final AttributeType Z;
        public static final AttributeType e0;
        public static final AttributeType f0;
        public static final AttributeType g0;
        public static final AttributeType h0;
        public static final /* synthetic */ AttributeType[] i0;

        static {
            AttributeType attributeType = new AttributeType("INT_TYPE", 0);
            X = attributeType;
            AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
            f4027Y = attributeType2;
            AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
            Z = attributeType3;
            AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
            e0 = attributeType4;
            AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
            f0 = attributeType5;
            AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
            g0 = attributeType6;
            AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
            h0 = attributeType7;
            i0 = new AttributeType[]{attributeType, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7};
        }

        public static AttributeType valueOf(String str) {
            return (AttributeType) Enum.valueOf(AttributeType.class, str);
        }

        public static AttributeType[] values() {
            return (AttributeType[]) i0.clone();
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        constraintAttribute.getClass();
        this.f4022a = constraintAttribute.f4022a;
        c(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        AttributeType attributeType;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        AttributeType attributeType2 = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.g0;
            } else {
                if (index == 3) {
                    attributeType = AttributeType.Z;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    attributeType = AttributeType.e0;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    AttributeType attributeType3 = AttributeType.h0;
                    if (index == 7) {
                        objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                    } else if (index == 4) {
                        objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                    } else if (index == 5) {
                        attributeType = AttributeType.f4027Y;
                        string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                    } else if (index == 6) {
                        attributeType = AttributeType.X;
                        string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                    } else if (index == 8) {
                        attributeType = AttributeType.f0;
                        string = typedArrayObtainStyledAttributes.getString(index);
                    }
                    attributeType2 = attributeType3;
                }
                Object obj = string;
                attributeType2 = attributeType;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            ConstraintAttribute constraintAttribute = new ConstraintAttribute();
            constraintAttribute.f4022a = attributeType2;
            constraintAttribute.c(objValueOf);
            map.put(string2, constraintAttribute);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void b(View view, HashMap map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) map.get(str);
            String strC = a.C("set", str);
            try {
                int iOrdinal = constraintAttribute.f4022a.ordinal();
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(strC, cls2).invoke(view, Integer.valueOf(constraintAttribute.f4023b));
                        break;
                    case 1:
                        cls.getMethod(strC, cls3).invoke(view, Float.valueOf(constraintAttribute.f4024c));
                        break;
                    case 2:
                        cls.getMethod(strC, cls2).invoke(view, Integer.valueOf(constraintAttribute.f));
                        break;
                    case 3:
                        Method method = cls.getMethod(strC, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.f);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(strC, CharSequence.class).invoke(view, constraintAttribute.d);
                        break;
                    case 5:
                        cls.getMethod(strC, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f4025e));
                        break;
                    case 6:
                        cls.getMethod(strC, cls3).invoke(view, Float.valueOf(constraintAttribute.f4024c));
                        break;
                }
            } catch (IllegalAccessException e2) {
                StringBuilder sbY = a.y(" Custom Attribute \"", str, "\" not found on ");
                sbY.append(cls.getName());
                Log.e("TransitionLayout", sbY.toString());
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                Log.e("TransitionLayout", e3.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + strC);
            } catch (InvocationTargetException e4) {
                StringBuilder sbY2 = a.y(" Custom Attribute \"", str, "\" not found on ");
                sbY2.append(cls.getName());
                Log.e("TransitionLayout", sbY2.toString());
                e4.printStackTrace();
            }
        }
    }

    public final void c(Object obj) {
        switch (this.f4022a.ordinal()) {
            case 0:
                this.f4023b = ((Integer) obj).intValue();
                break;
            case 1:
                this.f4024c = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f = ((Integer) obj).intValue();
                break;
            case 4:
                this.d = (String) obj;
                break;
            case 5:
                this.f4025e = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f4024c = ((Float) obj).floatValue();
                break;
        }
    }
}
