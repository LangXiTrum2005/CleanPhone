package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class KeyPosition extends KeyPositionBase {
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3823e;
    public float f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3825i;
    public int j;

    public static class Loader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseIntArray f3826a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3826a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.g);
        SparseIntArray sparseIntArray = Loader.f3826a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = Loader.f3826a;
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
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        String str = Easing.f3799c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f3827c = typedArrayObtainStyledAttributes.getInteger(index, this.f3827c);
                    break;
                case 5:
                    this.f3823e = typedArrayObtainStyledAttributes.getInt(index, this.f3823e);
                    break;
                case 6:
                    this.f3824h = typedArrayObtainStyledAttributes.getFloat(index, this.f3824h);
                    break;
                case 7:
                    this.f3825i = typedArrayObtainStyledAttributes.getFloat(index, this.f3825i);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    this.f = f;
                    this.g = f;
                    break;
                case 9:
                    this.j = typedArrayObtainStyledAttributes.getInt(index, this.j);
                    break;
                case 10:
                    this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                    break;
                case 11:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 12:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f3803a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
