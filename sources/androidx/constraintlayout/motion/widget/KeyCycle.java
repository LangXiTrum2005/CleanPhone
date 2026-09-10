package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class KeyCycle extends Key {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3813c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3814e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3816i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3817l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3818n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3819p;
    public float q;
    public float r;
    public float s;

    public static class Loader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f3820a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3820a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(18, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(19, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f);
        SparseIntArray sparseIntArray = Loader.f3820a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f3820a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    int i3 = MotionLayout.R0;
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f3804b = typedArrayObtainStyledAttributes.getResourceId(index, this.f3804b);
                    }
                    break;
                case 2:
                    this.f3803a = typedArrayObtainStyledAttributes.getInt(index, this.f3803a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f3813c = typedArrayObtainStyledAttributes.getInteger(index, this.f3813c);
                    break;
                case 5:
                    this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                    break;
                case 6:
                    this.f3814e = typedArrayObtainStyledAttributes.getFloat(index, this.f3814e);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                    } else {
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    }
                    break;
                case 8:
                    this.f3815h = typedArrayObtainStyledAttributes.getInt(index, this.f3815h);
                    break;
                case 9:
                    this.f3816i = typedArrayObtainStyledAttributes.getFloat(index, this.f3816i);
                    break;
                case 10:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 11:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 12:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 13:
                    this.f3818n = typedArrayObtainStyledAttributes.getFloat(index, this.f3818n);
                    break;
                case 14:
                    this.f3817l = typedArrayObtainStyledAttributes.getFloat(index, this.f3817l);
                    break;
                case 15:
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 16:
                    this.f3819p = typedArrayObtainStyledAttributes.getFloat(index, this.f3819p);
                    break;
                case 17:
                    this.q = typedArrayObtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 18:
                    this.r = typedArrayObtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 19:
                    this.s = typedArrayObtainStyledAttributes.getDimension(index, this.s);
                    break;
                case 20:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }
}
