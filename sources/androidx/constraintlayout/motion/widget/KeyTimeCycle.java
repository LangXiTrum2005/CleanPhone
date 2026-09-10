package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class KeyTimeCycle extends Key {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3828c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3829e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3831i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3832l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3833n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3834p;
    public float q;
    public float r;

    public static class Loader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f3835a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3835a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(19, 19);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f4130h);
        SparseIntArray sparseIntArray = Loader.f3835a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f3835a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 2:
                    this.f3829e = typedArrayObtainStyledAttributes.getDimension(index, this.f3829e);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 5:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 6:
                    this.f3830h = typedArrayObtainStyledAttributes.getFloat(index, this.f3830h);
                    break;
                case 7:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 8:
                    this.f3831i = typedArrayObtainStyledAttributes.getFloat(index, this.f3831i);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
                    int i3 = MotionLayout.R0;
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f3804b = typedArrayObtainStyledAttributes.getResourceId(index, this.f3804b);
                    }
                    break;
                case 12:
                    this.f3803a = typedArrayObtainStyledAttributes.getInt(index, this.f3803a);
                    break;
                case 13:
                    this.f3828c = typedArrayObtainStyledAttributes.getInteger(index, this.f3828c);
                    break;
                case 14:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 15:
                    this.f3832l = typedArrayObtainStyledAttributes.getDimension(index, this.f3832l);
                    break;
                case 16:
                    this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 17:
                    this.f3833n = typedArrayObtainStyledAttributes.getDimension(index, this.f3833n);
                    break;
                case 18:
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 19:
                    this.f3834p = typedArrayObtainStyledAttributes.getInt(index, this.f3834p);
                    break;
                case 20:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.r = typedArrayObtainStyledAttributes.getDimension(index, this.r);
                    } else {
                        this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    }
                    break;
            }
        }
    }
}
