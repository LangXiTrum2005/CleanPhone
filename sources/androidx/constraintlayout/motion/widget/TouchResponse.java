package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
class TouchResponse {
    public static final float[][] t = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float[][] f3867u = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3870c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3871e;
    public final int f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3872h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3873i = false;
    public final float[] j = new float[2];
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3874l;
    public final MotionLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f3875n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3876p;
    public final float q;
    public final int r;
    public final float s;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.TouchResponse$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    public TouchResponse(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f3868a = 0;
        this.f3869b = 0;
        this.f3870c = 0;
        this.d = -1;
        this.f3871e = -1;
        this.f = -1;
        this.g = 0.0f;
        this.f3872h = 1.0f;
        this.f3875n = 4.0f;
        this.o = 1.2f;
        this.f3876p = true;
        this.q = 1.0f;
        this.r = 0;
        this.s = 10.0f;
        this.m = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f4133n);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 9) {
                this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == 10) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f3868a);
                this.f3868a = i3;
                float[] fArr = t[i3];
                float f = fArr[0];
                float f2 = fArr[1];
            } else if (index == 0) {
                int i4 = typedArrayObtainStyledAttributes.getInt(index, this.f3869b);
                this.f3869b = i4;
                float[] fArr2 = f3867u[i4];
                this.g = fArr2[0];
                this.f3872h = fArr2[1];
            } else if (index == 5) {
                this.f3875n = typedArrayObtainStyledAttributes.getFloat(index, this.f3875n);
            } else if (index == 4) {
                this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
            } else if (index == 6) {
                this.f3876p = typedArrayObtainStyledAttributes.getBoolean(index, this.f3876p);
            } else if (index == 1) {
                this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
            } else if (index == 2) {
                this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
            } else if (index == 11) {
                this.f3871e = typedArrayObtainStyledAttributes.getResourceId(index, this.f3871e);
            } else if (index == 8) {
                this.f3870c = typedArrayObtainStyledAttributes.getInt(index, this.f3870c);
            } else if (index == 7) {
                this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 3) {
                this.f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RectF a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i2 = this.f3871e;
        if (i2 == -1 || (viewFindViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public final void b(boolean z2) {
        float[][] fArr = t;
        float[][] fArr2 = f3867u;
        if (z2) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f3868a];
        float f = fArr3[0];
        float f2 = fArr3[1];
        float[] fArr4 = fArr2[this.f3869b];
        this.g = fArr4[0];
        this.f3872h = fArr4[1];
    }

    public final String toString() {
        return this.g + " , " + this.f3872h;
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.TouchResponse$2, reason: invalid class name */
    class AnonymousClass2 implements NestedScrollView.OnScrollChangeListener {
        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public final void a(NestedScrollView nestedScrollView) {
        }
    }
}
