package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.smartdigimkt.f3.b;
import com.thinkup.core.common.n.mo;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {
    public static final int[] d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f4073e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4074a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4075b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4076c = new HashMap();

    public static class Constraint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PropertySet f4078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Motion f4079c;
        public final Layout d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Transform f4080e;
        public HashMap f;

        public Constraint() {
            PropertySet propertySet = new PropertySet();
            propertySet.f4114a = false;
            propertySet.f4115b = 0;
            propertySet.f4116c = 0;
            propertySet.d = 1.0f;
            propertySet.f4117e = Float.NaN;
            this.f4078b = propertySet;
            Motion motion = new Motion();
            motion.f4110a = false;
            motion.f4111b = -1;
            motion.f4112c = null;
            motion.d = -1;
            motion.f4113e = 0;
            motion.f = Float.NaN;
            motion.g = Float.NaN;
            this.f4079c = motion;
            Layout layout = new Layout();
            layout.f4094a = false;
            layout.f4095b = false;
            layout.f4100e = -1;
            layout.f = -1;
            layout.g = -1.0f;
            layout.f4101h = -1;
            layout.f4102i = -1;
            layout.j = -1;
            layout.k = -1;
            layout.f4103l = -1;
            layout.m = -1;
            layout.f4104n = -1;
            layout.o = -1;
            layout.f4105p = -1;
            layout.q = -1;
            layout.r = -1;
            layout.s = -1;
            layout.t = -1;
            layout.f4106u = 0.5f;
            layout.v = 0.5f;
            layout.f4107w = null;
            layout.x = -1;
            layout.y = 0;
            layout.f4108z = 0.0f;
            layout.f4081A = -1;
            layout.f4082B = -1;
            layout.C = -1;
            layout.D = -1;
            layout.f4083E = -1;
            layout.f4084F = -1;
            layout.G = -1;
            layout.H = -1;
            layout.f4085I = -1;
            layout.f4086J = -1;
            layout.K = -1;
            layout.L = -1;
            layout.M = -1;
            layout.f4087N = -1;
            layout.O = -1;
            layout.f4088P = -1.0f;
            layout.f4089Q = -1.0f;
            layout.f4090R = 0;
            layout.S = 0;
            layout.T = 0;
            layout.f4091U = 0;
            layout.f4092V = -1;
            layout.W = -1;
            layout.X = -1;
            layout.f4093Y = -1;
            layout.Z = 1.0f;
            layout.a0 = 1.0f;
            layout.f4096b0 = -1;
            layout.f4098c0 = 0;
            layout.f4099d0 = -1;
            layout.h0 = false;
            layout.i0 = false;
            layout.j0 = true;
            this.d = layout;
            Transform transform = new Transform();
            transform.f4119a = false;
            transform.f4120b = 0.0f;
            transform.f4121c = 0.0f;
            transform.d = 0.0f;
            transform.f4122e = 1.0f;
            transform.f = 1.0f;
            transform.g = Float.NaN;
            transform.f4123h = Float.NaN;
            transform.f4124i = 0.0f;
            transform.j = 0.0f;
            transform.k = 0.0f;
            transform.f4125l = false;
            transform.m = 0.0f;
            this.f4080e = transform;
            this.f = new HashMap();
        }

        public final void a(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.d;
            layoutParams.d = layout.f4101h;
            layoutParams.f4048e = layout.f4102i;
            layoutParams.f = layout.j;
            layoutParams.g = layout.k;
            layoutParams.f4049h = layout.f4103l;
            layoutParams.f4050i = layout.m;
            layoutParams.j = layout.f4104n;
            layoutParams.k = layout.o;
            layoutParams.f4051l = layout.f4105p;
            layoutParams.f4053p = layout.q;
            layoutParams.q = layout.r;
            layoutParams.r = layout.s;
            layoutParams.s = layout.t;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.D;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.f4083E;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.f4084F;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.G;
            layoutParams.x = layout.O;
            layoutParams.y = layout.f4087N;
            layoutParams.f4054u = layout.K;
            layoutParams.f4055w = layout.M;
            layoutParams.f4056z = layout.f4106u;
            layoutParams.f4029A = layout.v;
            layoutParams.m = layout.x;
            layoutParams.f4052n = layout.y;
            layoutParams.o = layout.f4108z;
            layoutParams.f4030B = layout.f4107w;
            layoutParams.f4036P = layout.f4081A;
            layoutParams.f4037Q = layout.f4082B;
            layoutParams.f4031E = layout.f4088P;
            layoutParams.D = layout.f4089Q;
            layoutParams.G = layout.S;
            layoutParams.f4032F = layout.f4090R;
            layoutParams.S = layout.h0;
            layoutParams.T = layout.i0;
            layoutParams.H = layout.T;
            layoutParams.f4033I = layout.f4091U;
            layoutParams.L = layout.f4092V;
            layoutParams.M = layout.W;
            layoutParams.f4034J = layout.X;
            layoutParams.K = layout.f4093Y;
            layoutParams.f4035N = layout.Z;
            layoutParams.O = layout.a0;
            layoutParams.f4038R = layout.C;
            layoutParams.f4045c = layout.g;
            layoutParams.f4042a = layout.f4100e;
            layoutParams.f4043b = layout.f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.f4097c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.d;
            String str = layout.g0;
            if (str != null) {
                layoutParams.f4039U = str;
            }
            layoutParams.setMarginStart(layout.f4085I);
            layoutParams.setMarginEnd(layout.H);
            layoutParams.a();
        }

        public final void b(int i2, ConstraintLayout.LayoutParams layoutParams) {
            this.f4077a = i2;
            int i3 = layoutParams.d;
            Layout layout = this.d;
            layout.f4101h = i3;
            layout.f4102i = layoutParams.f4048e;
            layout.j = layoutParams.f;
            layout.k = layoutParams.g;
            layout.f4103l = layoutParams.f4049h;
            layout.m = layoutParams.f4050i;
            layout.f4104n = layoutParams.j;
            layout.o = layoutParams.k;
            layout.f4105p = layoutParams.f4051l;
            layout.q = layoutParams.f4053p;
            layout.r = layoutParams.q;
            layout.s = layoutParams.r;
            layout.t = layoutParams.s;
            layout.f4106u = layoutParams.f4056z;
            layout.v = layoutParams.f4029A;
            layout.f4107w = layoutParams.f4030B;
            layout.x = layoutParams.m;
            layout.y = layoutParams.f4052n;
            layout.f4108z = layoutParams.o;
            layout.f4081A = layoutParams.f4036P;
            layout.f4082B = layoutParams.f4037Q;
            layout.C = layoutParams.f4038R;
            layout.g = layoutParams.f4045c;
            layout.f4100e = layoutParams.f4042a;
            layout.f = layoutParams.f4043b;
            layout.f4097c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.D = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.f4083E = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.f4084F = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.G = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.f4088P = layoutParams.f4031E;
            layout.f4089Q = layoutParams.D;
            layout.S = layoutParams.G;
            layout.f4090R = layoutParams.f4032F;
            layout.h0 = layoutParams.S;
            layout.i0 = layoutParams.T;
            layout.T = layoutParams.H;
            layout.f4091U = layoutParams.f4033I;
            layout.f4092V = layoutParams.L;
            layout.W = layoutParams.M;
            layout.X = layoutParams.f4034J;
            layout.f4093Y = layoutParams.K;
            layout.Z = layoutParams.f4035N;
            layout.a0 = layoutParams.O;
            layout.g0 = layoutParams.f4039U;
            layout.K = layoutParams.f4054u;
            layout.M = layoutParams.f4055w;
            layout.f4086J = layoutParams.t;
            layout.L = layoutParams.v;
            layout.O = layoutParams.x;
            layout.f4087N = layoutParams.y;
            layout.H = layoutParams.getMarginEnd();
            layout.f4085I = layoutParams.getMarginStart();
        }

        public final void c(int i2, Constraints.LayoutParams layoutParams) {
            b(i2, layoutParams);
            this.f4078b.d = layoutParams.m0;
            float f = layoutParams.p0;
            Transform transform = this.f4080e;
            transform.f4120b = f;
            transform.f4121c = layoutParams.q0;
            transform.d = layoutParams.r0;
            transform.f4122e = layoutParams.s0;
            transform.f = layoutParams.t0;
            transform.g = layoutParams.u0;
            transform.f4123h = layoutParams.v0;
            transform.f4124i = layoutParams.w0;
            transform.j = layoutParams.x0;
            transform.k = layoutParams.y0;
            transform.m = layoutParams.o0;
            transform.f4125l = layoutParams.n0;
        }

        public final Object clone() {
            Constraint constraint = new Constraint();
            constraint.d.a(this.d);
            constraint.f4079c.a(this.f4079c);
            PropertySet propertySet = constraint.f4078b;
            PropertySet propertySet2 = this.f4078b;
            propertySet.f4114a = propertySet2.f4114a;
            propertySet.f4115b = propertySet2.f4115b;
            propertySet.d = propertySet2.d;
            propertySet.f4117e = propertySet2.f4117e;
            propertySet.f4116c = propertySet2.f4116c;
            constraint.f4080e.a(this.f4080e);
            constraint.f4077a = this.f4077a;
            return constraint;
        }
    }

    public static class Layout {
        public static final SparseIntArray k0;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f4081A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f4082B;
        public int C;
        public int D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f4083E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f4084F;
        public int G;
        public int H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f4085I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f4086J;
        public int K;
        public int L;
        public int M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f4087N;
        public int O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f4088P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f4089Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f4090R;
        public int S;
        public int T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f4091U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f4092V;
        public int W;
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f4093Y;
        public float Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4094a;
        public float a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4095b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f4096b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4097c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f4098c0;
        public int d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f4099d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4100e;
        public int[] e0;
        public int f;
        public String f0;
        public float g;
        public String g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4101h;
        public boolean h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4102i;
        public boolean i0;
        public int j;
        public boolean j0;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f4103l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f4104n;
        public int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f4105p;
        public int q;
        public int r;
        public int s;
        public int t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f4106u;
        public float v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f4107w;
        public int x;
        public int y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f4108z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            k0 = sparseIntArray;
            sparseIntArray.append(38, 24);
            sparseIntArray.append(39, 25);
            sparseIntArray.append(41, 28);
            sparseIntArray.append(42, 29);
            sparseIntArray.append(47, 35);
            sparseIntArray.append(46, 34);
            sparseIntArray.append(20, 4);
            sparseIntArray.append(19, 3);
            sparseIntArray.append(17, 1);
            sparseIntArray.append(55, 6);
            sparseIntArray.append(56, 7);
            sparseIntArray.append(27, 17);
            sparseIntArray.append(28, 18);
            sparseIntArray.append(29, 19);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(43, 31);
            sparseIntArray.append(44, 32);
            sparseIntArray.append(26, 10);
            sparseIntArray.append(25, 9);
            sparseIntArray.append(59, 13);
            sparseIntArray.append(62, 16);
            sparseIntArray.append(60, 14);
            sparseIntArray.append(57, 11);
            sparseIntArray.append(61, 15);
            sparseIntArray.append(58, 12);
            sparseIntArray.append(50, 38);
            sparseIntArray.append(36, 37);
            sparseIntArray.append(35, 39);
            sparseIntArray.append(49, 40);
            sparseIntArray.append(34, 20);
            sparseIntArray.append(48, 36);
            sparseIntArray.append(24, 5);
            sparseIntArray.append(37, 76);
            sparseIntArray.append(45, 76);
            sparseIntArray.append(40, 76);
            sparseIntArray.append(18, 76);
            sparseIntArray.append(16, 76);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(21, 61);
            sparseIntArray.append(23, 62);
            sparseIntArray.append(22, 63);
            sparseIntArray.append(54, 69);
            sparseIntArray.append(33, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Layout layout) {
            this.f4094a = layout.f4094a;
            this.f4097c = layout.f4097c;
            this.f4095b = layout.f4095b;
            this.d = layout.d;
            this.f4100e = layout.f4100e;
            this.f = layout.f;
            this.g = layout.g;
            this.f4101h = layout.f4101h;
            this.f4102i = layout.f4102i;
            this.j = layout.j;
            this.k = layout.k;
            this.f4103l = layout.f4103l;
            this.m = layout.m;
            this.f4104n = layout.f4104n;
            this.o = layout.o;
            this.f4105p = layout.f4105p;
            this.q = layout.q;
            this.r = layout.r;
            this.s = layout.s;
            this.t = layout.t;
            this.f4106u = layout.f4106u;
            this.v = layout.v;
            this.f4107w = layout.f4107w;
            this.x = layout.x;
            this.y = layout.y;
            this.f4108z = layout.f4108z;
            this.f4081A = layout.f4081A;
            this.f4082B = layout.f4082B;
            this.C = layout.C;
            this.D = layout.D;
            this.f4083E = layout.f4083E;
            this.f4084F = layout.f4084F;
            this.G = layout.G;
            this.H = layout.H;
            this.f4085I = layout.f4085I;
            this.f4086J = layout.f4086J;
            this.K = layout.K;
            this.L = layout.L;
            this.M = layout.M;
            this.f4087N = layout.f4087N;
            this.O = layout.O;
            this.f4088P = layout.f4088P;
            this.f4089Q = layout.f4089Q;
            this.f4090R = layout.f4090R;
            this.S = layout.S;
            this.T = layout.T;
            this.f4091U = layout.f4091U;
            this.f4092V = layout.f4092V;
            this.W = layout.W;
            this.X = layout.X;
            this.f4093Y = layout.f4093Y;
            this.Z = layout.Z;
            this.a0 = layout.a0;
            this.f4096b0 = layout.f4096b0;
            this.f4098c0 = layout.f4098c0;
            this.f4099d0 = layout.f4099d0;
            this.g0 = layout.g0;
            int[] iArr = layout.e0;
            if (iArr != null) {
                this.e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.e0 = null;
            }
            this.f0 = layout.f0;
            this.h0 = layout.h0;
            this.i0 = layout.i0;
            this.j0 = layout.j0;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.j);
            this.f4095b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                SparseIntArray sparseIntArray = k0;
                int i3 = sparseIntArray.get(index);
                if (i3 == 80) {
                    this.h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            this.f4105p = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.f4105p);
                            break;
                        case 2:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.o = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.o);
                            break;
                        case 4:
                            this.f4104n = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.f4104n);
                            break;
                        case 5:
                            this.f4107w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f4081A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4081A);
                            break;
                        case 7:
                            this.f4082B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4082B);
                            break;
                        case 8:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.t = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.t);
                            break;
                        case 10:
                            this.s = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 11:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.f4087N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4087N);
                            break;
                        case 13:
                            this.f4086J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4086J);
                            break;
                        case 14:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f4100e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4100e);
                            break;
                        case 18:
                            this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                            break;
                        case 19:
                            this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                            break;
                        case 20:
                            this.f4106u = typedArrayObtainStyledAttributes.getFloat(index, this.f4106u);
                            break;
                        case 21:
                            this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                            break;
                        case 22:
                            this.f4097c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f4097c);
                            break;
                        case 23:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f4101h = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.f4101h);
                            break;
                        case 25:
                            this.f4102i = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.f4102i);
                            break;
                        case 26:
                            this.C = typedArrayObtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.f4083E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4083E);
                            break;
                        case 28:
                            this.j = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.j);
                            break;
                        case 29:
                            this.k = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.k);
                            break;
                        case 30:
                            this.f4085I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4085I);
                            break;
                        case 31:
                            this.q = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.q);
                            break;
                        case 32:
                            this.r = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 33:
                            this.f4084F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4084F);
                            break;
                        case 34:
                            this.m = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.m);
                            break;
                        case 35:
                            this.f4103l = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.f4103l);
                            break;
                        case 36:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 37:
                            this.f4089Q = typedArrayObtainStyledAttributes.getFloat(index, this.f4089Q);
                            break;
                        case 38:
                            this.f4088P = typedArrayObtainStyledAttributes.getFloat(index, this.f4088P);
                            break;
                        case 39:
                            this.f4090R = typedArrayObtainStyledAttributes.getInt(index, this.f4090R);
                            break;
                        case 40:
                            this.S = typedArrayObtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i3) {
                                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                                    this.T = typedArrayObtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                                    this.f4091U = typedArrayObtainStyledAttributes.getInt(index, this.f4091U);
                                    break;
                                case 56:
                                    this.f4092V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4092V);
                                    break;
                                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                                    this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.f4093Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4093Y);
                                    break;
                                default:
                                    switch (i3) {
                                        case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                                            this.x = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.x);
                                            break;
                                        case 62:
                                            this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                                            break;
                                        case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                                            this.f4108z = typedArrayObtainStyledAttributes.getFloat(index, this.f4108z);
                                            break;
                                        default:
                                            switch (i3) {
                                                case mo.oom.onn /* 69 */:
                                                    this.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case b.B0 /* 70 */:
                                                    this.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f4096b0 = typedArrayObtainStyledAttributes.getInt(index, this.f4096b0);
                                                    break;
                                                case 73:
                                                    this.f4098c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4098c0);
                                                    break;
                                                case mo.oom.ooo /* 74 */:
                                                    this.f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case mo.oom.oom /* 75 */:
                                                    this.j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                                case mo.oom.ono /* 77 */:
                                                    this.g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Motion {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final SparseIntArray f4109h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4111b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4112c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4113e;
        public float f;
        public float g;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4109h = sparseIntArray;
            sparseIntArray.append(2, 1);
            sparseIntArray.append(4, 2);
            sparseIntArray.append(5, 3);
            sparseIntArray.append(1, 4);
            sparseIntArray.append(0, 5);
            sparseIntArray.append(3, 6);
        }

        public final void a(Motion motion) {
            this.f4110a = motion.f4110a;
            this.f4111b = motion.f4111b;
            this.f4112c = motion.f4112c;
            this.d = motion.d;
            this.f4113e = motion.f4113e;
            this.g = motion.g;
            this.f = motion.f;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.k);
            this.f4110a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f4109h.get(index)) {
                    case 1:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 2:
                        this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f4112c = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f4112c = Easing.f3799c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f4113e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f4111b = ConstraintSet.n(typedArrayObtainStyledAttributes, index, this.f4111b);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class PropertySet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4116c;
        public float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4117e;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.o);
            this.f4114a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                } else if (index == 0) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f4115b);
                    this.f4115b = i3;
                    this.f4115b = ConstraintSet.d[i3];
                } else if (index == 4) {
                    this.f4116c = typedArrayObtainStyledAttributes.getInt(index, this.f4116c);
                } else if (index == 3) {
                    this.f4117e = typedArrayObtainStyledAttributes.getFloat(index, this.f4117e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Transform {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final SparseIntArray f4118n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f4119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f4120b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4121c;
        public float d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f4122e;
        public float f;
        public float g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f4123h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f4124i;
        public float j;
        public float k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f4125l;
        public float m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4118n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
        }

        public final void a(Transform transform) {
            this.f4119a = transform.f4119a;
            this.f4120b = transform.f4120b;
            this.f4121c = transform.f4121c;
            this.d = transform.d;
            this.f4122e = transform.f4122e;
            this.f = transform.f;
            this.g = transform.g;
            this.f4123h = transform.f4123h;
            this.f4124i = transform.f4124i;
            this.j = transform.j;
            this.k = transform.k;
            this.f4125l = transform.f4125l;
            this.m = transform.m;
        }

        public final void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.r);
            this.f4119a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (f4118n.get(index)) {
                    case 1:
                        this.f4120b = typedArrayObtainStyledAttributes.getFloat(index, this.f4120b);
                        break;
                    case 2:
                        this.f4121c = typedArrayObtainStyledAttributes.getFloat(index, this.f4121c);
                        break;
                    case 3:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.f4122e = typedArrayObtainStyledAttributes.getFloat(index, this.f4122e);
                        break;
                    case 5:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.f4123h = typedArrayObtainStyledAttributes.getDimension(index, this.f4123h);
                        break;
                    case 8:
                        this.f4124i = typedArrayObtainStyledAttributes.getDimension(index, this.f4124i);
                        break;
                    case 9:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 11:
                        this.f4125l = true;
                        this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4073e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] i(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static Constraint j(Context context, AttributeSet attributeSet) {
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f4126a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            PropertySet propertySet = constraint.f4078b;
            Motion motion = constraint.f4079c;
            Transform transform = constraint.f4080e;
            Layout layout = constraint.d;
            if (index != 1 && 23 != index && 24 != index) {
                motion.f4110a = true;
                layout.f4095b = true;
                propertySet.f4114a = true;
                transform.f4119a = true;
            }
            SparseIntArray sparseIntArray = f4073e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    layout.f4105p = n(typedArrayObtainStyledAttributes, index, layout.f4105p);
                    break;
                case 2:
                    layout.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.G);
                    break;
                case 3:
                    layout.o = n(typedArrayObtainStyledAttributes, index, layout.o);
                    break;
                case 4:
                    layout.f4104n = n(typedArrayObtainStyledAttributes, index, layout.f4104n);
                    break;
                case 5:
                    layout.f4107w = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    layout.f4081A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f4081A);
                    break;
                case 7:
                    layout.f4082B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f4082B);
                    break;
                case 8:
                    layout.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.H);
                    break;
                case 9:
                    layout.t = n(typedArrayObtainStyledAttributes, index, layout.t);
                    break;
                case 10:
                    layout.s = n(typedArrayObtainStyledAttributes, index, layout.s);
                    break;
                case 11:
                    layout.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.M);
                    break;
                case 12:
                    layout.f4087N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4087N);
                    break;
                case 13:
                    layout.f4086J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4086J);
                    break;
                case 14:
                    layout.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.L);
                    break;
                case 15:
                    layout.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.O);
                    break;
                case 16:
                    layout.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.K);
                    break;
                case 17:
                    layout.f4100e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f4100e);
                    break;
                case 18:
                    layout.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f);
                    break;
                case 19:
                    layout.g = typedArrayObtainStyledAttributes.getFloat(index, layout.g);
                    break;
                case 20:
                    layout.f4106u = typedArrayObtainStyledAttributes.getFloat(index, layout.f4106u);
                    break;
                case 21:
                    layout.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.d);
                    break;
                case 22:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, propertySet.f4115b);
                    propertySet.f4115b = i3;
                    propertySet.f4115b = d[i3];
                    break;
                case 23:
                    layout.f4097c = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.f4097c);
                    break;
                case 24:
                    layout.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.D);
                    break;
                case 25:
                    layout.f4101h = n(typedArrayObtainStyledAttributes, index, layout.f4101h);
                    break;
                case 26:
                    layout.f4102i = n(typedArrayObtainStyledAttributes, index, layout.f4102i);
                    break;
                case 27:
                    layout.C = typedArrayObtainStyledAttributes.getInt(index, layout.C);
                    break;
                case 28:
                    layout.f4083E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4083E);
                    break;
                case 29:
                    layout.j = n(typedArrayObtainStyledAttributes, index, layout.j);
                    break;
                case 30:
                    layout.k = n(typedArrayObtainStyledAttributes, index, layout.k);
                    break;
                case 31:
                    layout.f4085I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4085I);
                    break;
                case 32:
                    layout.q = n(typedArrayObtainStyledAttributes, index, layout.q);
                    break;
                case 33:
                    layout.r = n(typedArrayObtainStyledAttributes, index, layout.r);
                    break;
                case 34:
                    layout.f4084F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4084F);
                    break;
                case 35:
                    layout.m = n(typedArrayObtainStyledAttributes, index, layout.m);
                    break;
                case 36:
                    layout.f4103l = n(typedArrayObtainStyledAttributes, index, layout.f4103l);
                    break;
                case 37:
                    layout.v = typedArrayObtainStyledAttributes.getFloat(index, layout.v);
                    break;
                case 38:
                    constraint.f4077a = typedArrayObtainStyledAttributes.getResourceId(index, constraint.f4077a);
                    break;
                case 39:
                    layout.f4089Q = typedArrayObtainStyledAttributes.getFloat(index, layout.f4089Q);
                    break;
                case 40:
                    layout.f4088P = typedArrayObtainStyledAttributes.getFloat(index, layout.f4088P);
                    break;
                case 41:
                    layout.f4090R = typedArrayObtainStyledAttributes.getInt(index, layout.f4090R);
                    break;
                case 42:
                    layout.S = typedArrayObtainStyledAttributes.getInt(index, layout.S);
                    break;
                case 43:
                    propertySet.d = typedArrayObtainStyledAttributes.getFloat(index, propertySet.d);
                    break;
                case 44:
                    transform.f4125l = true;
                    transform.m = typedArrayObtainStyledAttributes.getDimension(index, transform.m);
                    break;
                case 45:
                    transform.f4121c = typedArrayObtainStyledAttributes.getFloat(index, transform.f4121c);
                    break;
                case 46:
                    transform.d = typedArrayObtainStyledAttributes.getFloat(index, transform.d);
                    break;
                case 47:
                    transform.f4122e = typedArrayObtainStyledAttributes.getFloat(index, transform.f4122e);
                    break;
                case 48:
                    transform.f = typedArrayObtainStyledAttributes.getFloat(index, transform.f);
                    break;
                case 49:
                    transform.g = typedArrayObtainStyledAttributes.getDimension(index, transform.g);
                    break;
                case 50:
                    transform.f4123h = typedArrayObtainStyledAttributes.getDimension(index, transform.f4123h);
                    break;
                case AD_REWARD_USER_VALUE:
                    transform.f4124i = typedArrayObtainStyledAttributes.getDimension(index, transform.f4124i);
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    transform.j = typedArrayObtainStyledAttributes.getDimension(index, transform.j);
                    break;
                case 53:
                    transform.k = typedArrayObtainStyledAttributes.getDimension(index, transform.k);
                    break;
                case AD_BACKGROUND_BEFORE_IMPRESSION_VALUE:
                    layout.T = typedArrayObtainStyledAttributes.getInt(index, layout.T);
                    break;
                case AD_CLOSED_BEFORE_IMPRESSION_VALUE:
                    layout.f4091U = typedArrayObtainStyledAttributes.getInt(index, layout.f4091U);
                    break;
                case 56:
                    layout.f4092V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4092V);
                    break;
                case INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE:
                    layout.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.W);
                    break;
                case 58:
                    layout.X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.X);
                    break;
                case 59:
                    layout.f4093Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4093Y);
                    break;
                case 60:
                    transform.f4120b = typedArrayObtainStyledAttributes.getFloat(index, transform.f4120b);
                    break;
                case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    layout.x = n(typedArrayObtainStyledAttributes, index, layout.x);
                    break;
                case 62:
                    layout.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.y);
                    break;
                case AD_PLAY_WITH_PARTIAL_DOWNLOAD_ASSET_VALUE:
                    layout.f4108z = typedArrayObtainStyledAttributes.getFloat(index, layout.f4108z);
                    break;
                case 64:
                    motion.f4111b = n(typedArrayObtainStyledAttributes, index, motion.f4111b);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        motion.f4112c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        motion.f4112c = Easing.f3799c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    motion.f4113e = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    motion.g = typedArrayObtainStyledAttributes.getFloat(index, motion.g);
                    break;
                case 68:
                    propertySet.f4117e = typedArrayObtainStyledAttributes.getFloat(index, propertySet.f4117e);
                    break;
                case mo.oom.onn /* 69 */:
                    layout.Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case b.B0 /* 70 */:
                    layout.a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    layout.f4096b0 = typedArrayObtainStyledAttributes.getInt(index, layout.f4096b0);
                    break;
                case 73:
                    layout.f4098c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f4098c0);
                    break;
                case mo.oom.ooo /* 74 */:
                    layout.f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case mo.oom.oom /* 75 */:
                    layout.j0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.j0);
                    break;
                case 76:
                    motion.d = typedArrayObtainStyledAttributes.getInt(index, motion.d);
                    break;
                case mo.oom.ono /* 77 */:
                    layout.g0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    propertySet.f4116c = typedArrayObtainStyledAttributes.getInt(index, propertySet.f4116c);
                    break;
                case mo.oom.on0 /* 79 */:
                    motion.f = typedArrayObtainStyledAttributes.getFloat(index, motion.f);
                    break;
                case 80:
                    layout.h0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.h0);
                    break;
                case mo.oom.m00 /* 81 */:
                    layout.i0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    public static int n(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    public static String o(int i2) {
        switch (i2) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return TtmlNode.END;
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    public final void a(MotionLayout motionLayout) {
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            HashMap map = this.f4076c;
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.v("ConstraintSet", "id unknown " + Debug.b(childAt));
            } else {
                if (this.f4075b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id))) {
                    ConstraintAttribute.b(childAt, ((Constraint) map.get(Integer.valueOf(id))).f);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f4076c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.b(childAt));
            } else {
                if (this.f4075b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        Constraint constraint = (Constraint) map.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            constraint.d.f4099d0 = 1;
                        }
                        int i3 = constraint.d.f4099d0;
                        if (i3 != -1 && i3 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            Layout layout = constraint.d;
                            barrier.setType(layout.f4096b0);
                            barrier.setMargin(layout.f4098c0);
                            barrier.setAllowsGoneWidget(layout.j0);
                            int[] iArr = layout.e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = layout.f0;
                                if (str != null) {
                                    int[] iArrI = i(barrier, str);
                                    layout.e0 = iArrI;
                                    barrier.setReferencedIds(iArrI);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.a();
                        constraint.a(layoutParams);
                        ConstraintAttribute.b(childAt, constraint.f);
                        childAt.setLayoutParams(layoutParams);
                        PropertySet propertySet = constraint.f4078b;
                        if (propertySet.f4116c == 0) {
                            childAt.setVisibility(propertySet.f4115b);
                        }
                        childAt.setAlpha(propertySet.d);
                        Transform transform = constraint.f4080e;
                        childAt.setRotation(transform.f4120b);
                        childAt.setRotationX(transform.f4121c);
                        childAt.setRotationY(transform.d);
                        childAt.setScaleX(transform.f4122e);
                        childAt.setScaleY(transform.f);
                        if (!Float.isNaN(transform.g)) {
                            childAt.setPivotX(transform.g);
                        }
                        if (!Float.isNaN(transform.f4123h)) {
                            childAt.setPivotY(transform.f4123h);
                        }
                        childAt.setTranslationX(transform.f4124i);
                        childAt.setTranslationY(transform.j);
                        childAt.setTranslationZ(transform.k);
                        if (transform.f4125l) {
                            childAt.setElevation(transform.m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            Constraint constraint2 = (Constraint) map.get(num);
            Layout layout2 = constraint2.d;
            int i4 = layout2.f4099d0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = layout2.e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = layout2.f0;
                    if (str2 != null) {
                        int[] iArrI2 = i(barrier2, str2);
                        layout2.e0 = iArrI2;
                        barrier2.setReferencedIds(iArrI2);
                    }
                }
                barrier2.setType(layout2.f4096b0);
                barrier2.setMargin(layout2.f4098c0);
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.j();
                constraint2.a(layoutParamsGenerateDefaultLayoutParams);
                constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
            }
            if (layout2.f4094a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                constraint2.a(layoutParamsGenerateDefaultLayoutParams2);
                constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
            }
        }
    }

    public final void d(int i2, int i3) {
        HashMap map = this.f4076c;
        if (map.containsKey(Integer.valueOf(i2))) {
            Constraint constraint = (Constraint) map.get(Integer.valueOf(i2));
            switch (i3) {
                case 1:
                    Layout layout = constraint.d;
                    layout.f4102i = -1;
                    layout.f4101h = -1;
                    layout.D = -1;
                    layout.f4086J = -1;
                    return;
                case 2:
                    Layout layout2 = constraint.d;
                    layout2.k = -1;
                    layout2.j = -1;
                    layout2.f4083E = -1;
                    layout2.L = -1;
                    return;
                case 3:
                    Layout layout3 = constraint.d;
                    layout3.m = -1;
                    layout3.f4103l = -1;
                    layout3.f4084F = -1;
                    layout3.K = -1;
                    return;
                case 4:
                    Layout layout4 = constraint.d;
                    layout4.f4104n = -1;
                    layout4.o = -1;
                    layout4.G = -1;
                    layout4.M = -1;
                    return;
                case 5:
                    constraint.d.f4105p = -1;
                    return;
                case 6:
                    Layout layout5 = constraint.d;
                    layout5.q = -1;
                    layout5.r = -1;
                    layout5.f4085I = -1;
                    layout5.O = -1;
                    return;
                case 7:
                    Layout layout6 = constraint.d;
                    layout6.s = -1;
                    layout6.t = -1;
                    layout6.H = -1;
                    layout6.f4087N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i2;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = constraintSet.f4076c;
        map.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f4075b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) map.get(Integer.valueOf(id));
            HashMap map2 = constraintSet.f4074a;
            HashMap map3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        i2 = childCount;
                    } else {
                        i2 = childCount;
                        try {
                            map3.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                } catch (IllegalAccessException e5) {
                    e = e5;
                    i2 = childCount;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                    i2 = childCount;
                } catch (InvocationTargetException e7) {
                    e = e7;
                    i2 = childCount;
                }
                childCount = i2;
            }
            int i4 = childCount;
            constraint.f = map3;
            constraint.b(id, layoutParams);
            int visibility = childAt.getVisibility();
            PropertySet propertySet = constraint.f4078b;
            propertySet.f4115b = visibility;
            propertySet.d = childAt.getAlpha();
            float rotation = childAt.getRotation();
            Transform transform = constraint.f4080e;
            transform.f4120b = rotation;
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
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                boolean z2 = barrier.n0.h0;
                Layout layout = constraint.d;
                layout.j0 = z2;
                layout.e0 = barrier.getReferencedIds();
                layout.f4096b0 = barrier.getType();
                layout.f4098c0 = barrier.getMargin();
            }
            i3++;
            constraintSet = this;
            childCount = i4;
        }
    }

    public final void f(int i2, int i3, int i4, int i5) {
        HashMap map = this.f4076c;
        if (!map.containsKey(Integer.valueOf(i2))) {
            map.put(Integer.valueOf(i2), new Constraint());
        }
        Constraint constraint = (Constraint) map.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    Layout layout = constraint.d;
                    layout.f4101h = i4;
                    layout.f4102i = -1;
                    return;
                } else if (i5 == 2) {
                    Layout layout2 = constraint.d;
                    layout2.f4102i = i4;
                    layout2.f4101h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + o(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    Layout layout3 = constraint.d;
                    layout3.j = i4;
                    layout3.k = -1;
                    return;
                } else if (i5 == 2) {
                    Layout layout4 = constraint.d;
                    layout4.k = i4;
                    layout4.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    Layout layout5 = constraint.d;
                    layout5.f4103l = i4;
                    layout5.m = -1;
                    layout5.f4105p = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                }
                Layout layout6 = constraint.d;
                layout6.m = i4;
                layout6.f4103l = -1;
                layout6.f4105p = -1;
                return;
            case 4:
                if (i5 == 4) {
                    Layout layout7 = constraint.d;
                    layout7.o = i4;
                    layout7.f4104n = -1;
                    layout7.f4105p = -1;
                    return;
                }
                if (i5 != 3) {
                    throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                }
                Layout layout8 = constraint.d;
                layout8.f4104n = i4;
                layout8.o = -1;
                layout8.f4105p = -1;
                return;
            case 5:
                if (i5 != 5) {
                    throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                }
                Layout layout9 = constraint.d;
                layout9.f4105p = i4;
                layout9.o = -1;
                layout9.f4104n = -1;
                layout9.f4103l = -1;
                layout9.m = -1;
                return;
            case 6:
                if (i5 == 6) {
                    Layout layout10 = constraint.d;
                    layout10.r = i4;
                    layout10.q = -1;
                    return;
                } else if (i5 == 7) {
                    Layout layout11 = constraint.d;
                    layout11.q = i4;
                    layout11.r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    Layout layout12 = constraint.d;
                    layout12.t = i4;
                    layout12.s = -1;
                    return;
                } else if (i5 == 6) {
                    Layout layout13 = constraint.d;
                    layout13.s = i4;
                    layout13.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(o(i3) + " to " + o(i5) + " unknown");
        }
    }

    public final void g(int i2, int i3, int i4, int i5, int i6) {
        HashMap map = this.f4076c;
        if (!map.containsKey(Integer.valueOf(i2))) {
            map.put(Integer.valueOf(i2), new Constraint());
        }
        Constraint constraint = (Constraint) map.get(Integer.valueOf(i2));
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    Layout layout = constraint.d;
                    layout.f4101h = i4;
                    layout.f4102i = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Left to " + o(i5) + " undefined");
                    }
                    Layout layout2 = constraint.d;
                    layout2.f4102i = i4;
                    layout2.f4101h = -1;
                }
                constraint.d.D = i6;
                return;
            case 2:
                if (i5 == 1) {
                    Layout layout3 = constraint.d;
                    layout3.j = i4;
                    layout3.k = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                    }
                    Layout layout4 = constraint.d;
                    layout4.k = i4;
                    layout4.j = -1;
                }
                constraint.d.f4083E = i6;
                return;
            case 3:
                if (i5 == 3) {
                    Layout layout5 = constraint.d;
                    layout5.f4103l = i4;
                    layout5.m = -1;
                    layout5.f4105p = -1;
                } else {
                    if (i5 != 4) {
                        throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                    }
                    Layout layout6 = constraint.d;
                    layout6.m = i4;
                    layout6.f4103l = -1;
                    layout6.f4105p = -1;
                }
                constraint.d.f4084F = i6;
                return;
            case 4:
                if (i5 == 4) {
                    Layout layout7 = constraint.d;
                    layout7.o = i4;
                    layout7.f4104n = -1;
                    layout7.f4105p = -1;
                } else {
                    if (i5 != 3) {
                        throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                    }
                    Layout layout8 = constraint.d;
                    layout8.f4104n = i4;
                    layout8.o = -1;
                    layout8.f4105p = -1;
                }
                constraint.d.G = i6;
                return;
            case 5:
                if (i5 != 5) {
                    throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                }
                Layout layout9 = constraint.d;
                layout9.f4105p = i4;
                layout9.o = -1;
                layout9.f4104n = -1;
                layout9.f4103l = -1;
                layout9.m = -1;
                return;
            case 6:
                if (i5 == 6) {
                    Layout layout10 = constraint.d;
                    layout10.r = i4;
                    layout10.q = -1;
                } else {
                    if (i5 != 7) {
                        throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                    }
                    Layout layout11 = constraint.d;
                    layout11.q = i4;
                    layout11.r = -1;
                }
                constraint.d.f4085I = i6;
                return;
            case 7:
                if (i5 == 7) {
                    Layout layout12 = constraint.d;
                    layout12.t = i4;
                    layout12.s = -1;
                } else {
                    if (i5 != 6) {
                        throw new IllegalArgumentException("right to " + o(i5) + " undefined");
                    }
                    Layout layout13 = constraint.d;
                    layout13.s = i4;
                    layout13.t = -1;
                }
                constraint.d.H = i6;
                return;
            default:
                throw new IllegalArgumentException(o(i3) + " to " + o(i5) + " unknown");
        }
    }

    public final void h(int i2, int i3) {
        k(i2).d.f4097c = i3;
    }

    public final Constraint k(int i2) {
        HashMap map = this.f4076c;
        if (!map.containsKey(Integer.valueOf(i2))) {
            map.put(Integer.valueOf(i2), new Constraint());
        }
        return (Constraint) map.get(Integer.valueOf(i2));
    }

    public final void l(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    Constraint constraintJ = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintJ.d.f4094a = true;
                    }
                    this.f4076c.put(Integer.valueOf(constraintJ.f4077a), constraintJ);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    public final void m(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            Constraint constraintJ = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlResourceParser.getName()) {
                            case "Constraint":
                                constraintJ = j(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                            case "Guideline":
                                constraintJ = j(context, Xml.asAttributeSet(xmlResourceParser));
                                Layout layout = constraintJ.d;
                                layout.f4094a = true;
                                layout.f4095b = true;
                                break;
                            case "Barrier":
                                constraintJ = j(context, Xml.asAttributeSet(xmlResourceParser));
                                constraintJ.d.f4099d0 = 1;
                                break;
                            case "PropertySet":
                                if (constraintJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraintJ.f4078b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                                break;
                            case "Transform":
                                if (constraintJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraintJ.f4080e.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                                break;
                            case "Layout":
                                if (constraintJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraintJ.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                                break;
                            case "Motion":
                                if (constraintJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                constraintJ.f4079c.b(context, Xml.asAttributeSet(xmlResourceParser));
                                break;
                                break;
                            case "CustomAttribute":
                                if (constraintJ == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                ConstraintAttribute.a(context, xmlResourceParser, constraintJ.f);
                                break;
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name = xmlResourceParser.getName();
                        if ("ConstraintSet".equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.f4076c.put(Integer.valueOf(constraintJ.f4077a), constraintJ);
                            constraintJ = null;
                        }
                    }
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
