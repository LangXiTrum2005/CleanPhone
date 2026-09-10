package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class KeyAttributes extends Key {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3805c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3806e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3808i;
    public float j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3809l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f3810n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f3811p;
    public float q;

    public static class Loader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f3812a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3812a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(17, 8);
            sparseIntArray.append(16, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f4129e);
        SparseIntArray sparseIntArray = Loader.f3812a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f3812a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 2:
                    this.f3806e = typedArrayObtainStyledAttributes.getDimension(index, this.f3806e);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 5:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 6:
                    this.f3807h = typedArrayObtainStyledAttributes.getFloat(index, this.f3807h);
                    break;
                case 7:
                    this.f3809l = typedArrayObtainStyledAttributes.getFloat(index, this.f3809l);
                    break;
                case 8:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
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
                    this.f3805c = typedArrayObtainStyledAttributes.getInteger(index, this.f3805c);
                    break;
                case 14:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.f3810n = typedArrayObtainStyledAttributes.getDimension(index, this.f3810n);
                    break;
                case 16:
                    this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 17:
                    this.f3811p = typedArrayObtainStyledAttributes.getDimension(index, this.f3811p);
                    break;
                case 18:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 19:
                    this.f3808i = typedArrayObtainStyledAttributes.getDimension(index, this.f3808i);
                    break;
                case 20:
                    this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                    break;
            }
        }
    }
}
