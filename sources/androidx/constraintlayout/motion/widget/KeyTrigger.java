package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class KeyTrigger extends Key {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3836c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3837e;
    public float f;
    public boolean g;

    public static class Loader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f3838a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3838a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f4131i);
        SparseIntArray sparseIntArray = Loader.f3838a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f3838a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    typedArrayObtainStyledAttributes.getString(index);
                    continue;
                    break;
                case 2:
                    typedArrayObtainStyledAttributes.getString(index);
                    continue;
                    break;
                case 4:
                    typedArrayObtainStyledAttributes.getString(index);
                    continue;
                    break;
                case 5:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    continue;
                    break;
                case 6:
                    this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                    continue;
                    break;
                case 7:
                    int i3 = MotionLayout.R0;
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        continue;
                    } else {
                        this.f3804b = typedArrayObtainStyledAttributes.getResourceId(index, this.f3804b);
                    }
                    break;
                case 8:
                    this.f3803a = typedArrayObtainStyledAttributes.getInteger(index, this.f3803a);
                    continue;
                    break;
                case 9:
                    this.f3837e = typedArrayObtainStyledAttributes.getResourceId(index, this.f3837e);
                    continue;
                    break;
                case 10:
                    this.g = typedArrayObtainStyledAttributes.getBoolean(index, this.g);
                    continue;
                    break;
                case 11:
                    this.f3836c = typedArrayObtainStyledAttributes.getResourceId(index, this.f3836c);
                    break;
            }
            Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
        }
    }
}
