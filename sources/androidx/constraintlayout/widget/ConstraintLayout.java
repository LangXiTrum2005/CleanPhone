package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.solver.widgets.HelperWidget;
import androidx.constraintlayout.solver.widgets.WidgetContainer;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.solver.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.VerticalWidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.1";
    SparseArray<View> mChildrenByIds;
    private ArrayList<ConstraintHelper> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4028a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f4028a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4028a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4028a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4028a[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class Measurer implements BasicMeasure.Measurer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f4058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4060c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4061e;
        public int f;
        public int g;

        public Measurer(ConstraintLayout constraintLayout) {
            this.f4058a = constraintLayout;
        }

        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        public final void a() {
            ConstraintLayout constraintLayout = this.f4058a;
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt;
                    if (placeholder.f0 != null) {
                        LayoutParams layoutParams = (LayoutParams) placeholder.getLayoutParams();
                        LayoutParams layoutParams2 = (LayoutParams) placeholder.f0.getLayoutParams();
                        ConstraintWidget constraintWidget = layoutParams2.l0;
                        constraintWidget.X = 0;
                        ConstraintWidget constraintWidget2 = layoutParams.l0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f3949J[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.X;
                        if (dimensionBehaviour != dimensionBehaviour2) {
                            constraintWidget2.z(constraintWidget.m());
                        }
                        ConstraintWidget constraintWidget3 = layoutParams.l0;
                        if (constraintWidget3.f3949J[1] != dimensionBehaviour2) {
                            constraintWidget3.w(layoutParams2.l0.j());
                        }
                        layoutParams2.l0.X = 8;
                    }
                }
            }
            int size = constraintLayout.mConstraintHelpers.size();
            if (size > 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    ((ConstraintHelper) constraintLayout.mConstraintHelpers.get(i3)).getClass();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0173  */
        /* JADX WARN: Code duplicated, block: B:103:0x0176 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:106:0x017c  */
        /* JADX WARN: Code duplicated, block: B:109:0x0180  */
        /* JADX WARN: Code duplicated, block: B:112:0x0188  */
        /* JADX WARN: Code duplicated, block: B:114:0x018c  */
        /* JADX WARN: Code duplicated, block: B:117:0x0196  */
        /* JADX WARN: Code duplicated, block: B:120:0x01a6 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:129:0x01ba  */
        /* JADX WARN: Code duplicated, block: B:131:0x01be  */
        /* JADX WARN: Code duplicated, block: B:134:0x01cc  */
        /* JADX WARN: Code duplicated, block: B:137:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:138:0x01e4  */
        /* JADX WARN: Code duplicated, block: B:140:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:141:0x01f3  */
        /* JADX WARN: Code duplicated, block: B:144:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:145:0x0202  */
        /* JADX WARN: Code duplicated, block: B:148:0x0207  */
        /* JADX WARN: Code duplicated, block: B:151:0x020f  */
        /* JADX WARN: Code duplicated, block: B:152:0x0214  */
        /* JADX WARN: Code duplicated, block: B:155:0x0219  */
        /* JADX WARN: Code duplicated, block: B:158:0x0221 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:160:0x022a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:161:0x022c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:164:0x0236 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:165:0x0238 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:166:0x023a  */
        /* JADX WARN: Code duplicated, block: B:167:0x0241  */
        /* JADX WARN: Code duplicated, block: B:169:0x0245  */
        /* JADX WARN: Code duplicated, block: B:172:0x025c  */
        /* JADX WARN: Code duplicated, block: B:173:0x025f  */
        /* JADX WARN: Code duplicated, block: B:176:0x0265  */
        /* JADX WARN: Code duplicated, block: B:180:0x026d  */
        /* JADX WARN: Code duplicated, block: B:183:0x0275  */
        /* JADX WARN: Code duplicated, block: B:185:0x0279  */
        /* JADX WARN: Code duplicated, block: B:52:0x00cd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:55:0x00d3  */
        /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:58:0x00db  */
        /* JADX WARN: Code duplicated, block: B:60:0x00df  */
        /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:68:0x0108  */
        /* JADX WARN: Code duplicated, block: B:69:0x010a  */
        /* JADX WARN: Code duplicated, block: B:72:0x0112  */
        /* JADX WARN: Code duplicated, block: B:73:0x0114  */
        /* JADX WARN: Code duplicated, block: B:77:0x0122  */
        /* JADX WARN: Code duplicated, block: B:82:0x012c A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:87:0x013f  */
        /* JADX WARN: Code duplicated, block: B:88:0x014d  */
        /* JADX WARN: Code duplicated, block: B:91:0x015d  */
        /* JADX WARN: Code duplicated, block: B:92:0x015f  */
        /* JADX WARN: Code duplicated, block: B:94:0x0163  */
        /* JADX WARN: Code duplicated, block: B:95:0x0165  */
        /* JADX WARN: Code duplicated, block: B:98:0x016d A[ADDED_TO_REGION] */
        @Override // androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer
        public final void b(ConstraintWidget constraintWidget, BasicMeasure.Measure measure) {
            int iMakeMeasureSpec;
            boolean z2;
            int iOrdinal;
            int iMakeMeasureSpec2;
            boolean z3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            boolean z4;
            boolean z5;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            LayoutParams layoutParams;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int i2;
            int measuredWidth2;
            int i3;
            int i4;
            int measuredHeight2;
            int i5;
            int i6;
            boolean z10;
            boolean z11;
            boolean z12;
            int i7;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.X == 8 && !constraintWidget.x) {
                measure.f3992e = 0;
                measure.f = 0;
                measure.g = 0;
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.f3989a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = measure.f3990b;
            int i8 = measure.f3991c;
            int i9 = measure.d;
            int i10 = this.f4059b + this.f4060c;
            int i11 = this.d;
            View view = constraintWidget.W;
            int iOrdinal2 = dimensionBehaviour3.ordinal();
            ConstraintAnchor constraintAnchor = constraintWidget.f3944A;
            ConstraintAnchor constraintAnchor2 = constraintWidget.y;
            int[] iArr = constraintWidget.g;
            int i12 = 2;
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    i12 = 2;
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
                    iArr[2] = -2;
                } else {
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            i12 = 2;
                            iMakeMeasureSpec = 0;
                            z2 = false;
                        } else {
                            int i13 = this.f;
                            int i14 = constraintAnchor2 != null ? constraintAnchor2.f3941e : 0;
                            if (constraintAnchor != null) {
                                i14 += constraintAnchor.f3941e;
                            }
                            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i11 + i14, -1);
                            iArr[i12] = -1;
                        }
                        iOrdinal = dimensionBehaviour4.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                                iArr[3] = -2;
                            } else {
                                if (iOrdinal != i12) {
                                    if (iOrdinal != 3) {
                                        iMakeMeasureSpec2 = 0;
                                        z3 = false;
                                    } else {
                                        int i15 = this.g;
                                        if (constraintAnchor2 != null) {
                                            i7 = constraintWidget.f3971z.f3941e;
                                        } else {
                                            i7 = 0;
                                        }
                                        if (constraintAnchor != null) {
                                            i7 += constraintWidget.f3945B.f3941e;
                                        }
                                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, i10 + i7, -1);
                                        iArr[3] = -1;
                                    }
                                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                                    if (dimensionBehaviour3 == dimensionBehaviour) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (dimensionBehaviour4 == dimensionBehaviour) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.X;
                                    if (dimensionBehaviour4 != dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour5) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (dimensionBehaviour3 != dimensionBehaviour2 || dimensionBehaviour3 == dimensionBehaviour5) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z4 || constraintWidget.f3950N <= 0.0f) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                    if (z5 || constraintWidget.f3950N <= 0.0f) {
                                        z9 = false;
                                    } else {
                                        z9 = true;
                                    }
                                    layoutParams = (LayoutParams) view.getLayoutParams();
                                    if (measure.j && z4 && constraintWidget.j == 0 && z5 && constraintWidget.k == 0) {
                                        measuredWidth2 = 0;
                                        measuredHeight2 = 0;
                                        baseline = 0;
                                    } else {
                                        if ((view instanceof VirtualLayout) || !(constraintWidget instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) {
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        } else {
                                            ((VirtualLayout) view).k((androidx.constraintlayout.solver.widgets.VirtualLayout) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                        if (z2) {
                                            iArr[0] = measuredWidth;
                                            iArr[2] = measuredHeight;
                                        } else {
                                            iArr[0] = 0;
                                            iArr[2] = 0;
                                        }
                                        if (z3) {
                                            iArr[1] = measuredHeight;
                                            iArr[3] = measuredWidth;
                                        } else {
                                            iArr[1] = 0;
                                            iArr[3] = 0;
                                        }
                                        i2 = constraintWidget.m;
                                        if (i2 > 0) {
                                            measuredWidth2 = Math.max(i2, measuredWidth);
                                        } else {
                                            measuredWidth2 = measuredWidth;
                                        }
                                        i3 = constraintWidget.f3967n;
                                        if (i3 > 0) {
                                            measuredWidth2 = Math.min(i3, measuredWidth2);
                                        }
                                        i4 = constraintWidget.f3968p;
                                        if (i4 > 0) {
                                            measuredHeight2 = Math.max(i4, measuredHeight);
                                        } else {
                                            measuredHeight2 = measuredHeight;
                                        }
                                        i5 = constraintWidget.q;
                                        if (i5 > 0) {
                                            measuredHeight2 = Math.min(i5, measuredHeight2);
                                        }
                                        if (!z8 && z6) {
                                            measuredWidth2 = (int) ((measuredHeight2 * constraintWidget.f3950N) + 0.5f);
                                        } else if (z9 && z7) {
                                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                        }
                                        if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                                            if (measuredWidth != measuredWidth2) {
                                                i6 = 1073741824;
                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                            } else {
                                                i6 = 1073741824;
                                            }
                                            if (measuredHeight != measuredHeight2) {
                                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            measuredWidth2 = view.getMeasuredWidth();
                                            measuredHeight2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                    }
                                    if (baseline != -1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (measuredWidth2 == measure.f3991c || measuredHeight2 != measure.d) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    measure.f3994i = z11;
                                    if (layoutParams.X) {
                                        z10 = true;
                                    }
                                    if (z10 && baseline != -1 && constraintWidget.f3953R != baseline) {
                                        measure.f3994i = true;
                                    }
                                    measure.f3992e = measuredWidth2;
                                    measure.f = measuredHeight2;
                                    measure.f3993h = z10;
                                    measure.g = baseline;
                                }
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                                if (constraintWidget.k == 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                iArr[3] = 0;
                                if (measure.j) {
                                    boolean z13 = !(z12 || iArr[2] == 0 || iArr[1] == constraintWidget.j()) || (view instanceof Placeholder);
                                    if (z12 || z13) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.j(), 1073741824);
                                    }
                                }
                            }
                            z3 = true;
                            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                            if (dimensionBehaviour3 == dimensionBehaviour) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (dimensionBehaviour4 == dimensionBehaviour) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.X;
                            if (dimensionBehaviour4 != dimensionBehaviour2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            if (z4) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z5) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            layoutParams = (LayoutParams) view.getLayoutParams();
                            if (measure.j) {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z2) {
                                    iArr[0] = measuredWidth;
                                    iArr[2] = measuredHeight;
                                } else {
                                    iArr[0] = 0;
                                    iArr[2] = 0;
                                }
                                if (z3) {
                                    iArr[1] = measuredHeight;
                                    iArr[3] = measuredWidth;
                                } else {
                                    iArr[1] = 0;
                                    iArr[3] = 0;
                                }
                                i2 = constraintWidget.m;
                                if (i2 > 0) {
                                    measuredWidth2 = Math.max(i2, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i3 = constraintWidget.f3967n;
                                if (i3 > 0) {
                                    measuredWidth2 = Math.min(i3, measuredWidth2);
                                }
                                i4 = constraintWidget.f3968p;
                                if (i4 > 0) {
                                    measuredHeight2 = Math.max(i4, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i5 = constraintWidget.q;
                                if (i5 > 0) {
                                    measuredHeight2 = Math.min(i5, measuredHeight2);
                                }
                                if (!z8) {
                                    if (z9) {
                                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                    }
                                } else if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            } else {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z2) {
                                    iArr[0] = measuredWidth;
                                    iArr[2] = measuredHeight;
                                } else {
                                    iArr[0] = 0;
                                    iArr[2] = 0;
                                }
                                if (z3) {
                                    iArr[1] = measuredHeight;
                                    iArr[3] = measuredWidth;
                                } else {
                                    iArr[1] = 0;
                                    iArr[3] = 0;
                                }
                                i2 = constraintWidget.m;
                                if (i2 > 0) {
                                    measuredWidth2 = Math.max(i2, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i3 = constraintWidget.f3967n;
                                if (i3 > 0) {
                                    measuredWidth2 = Math.min(i3, measuredWidth2);
                                }
                                i4 = constraintWidget.f3968p;
                                if (i4 > 0) {
                                    measuredHeight2 = Math.max(i4, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i5 = constraintWidget.q;
                                if (i5 > 0) {
                                    measuredHeight2 = Math.min(i5, measuredHeight2);
                                }
                                if (!z8) {
                                    if (z9) {
                                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                    }
                                } else if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            }
                            if (baseline != -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (measuredWidth2 == measure.f3991c) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            measure.f3994i = z11;
                            if (layoutParams.X) {
                                z10 = true;
                            }
                            if (z10) {
                                measure.f3994i = true;
                            }
                            measure.f3992e = measuredWidth2;
                            measure.f = measuredHeight2;
                            measure.f3993h = z10;
                            measure.g = baseline;
                        }
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                        iArr[3] = i9;
                        iMakeMeasureSpec2 = iMakeMeasureSpec3;
                        z3 = false;
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                        if (dimensionBehaviour3 == dimensionBehaviour) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.X;
                        if (dimensionBehaviour4 != dimensionBehaviour2) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (dimensionBehaviour3 != dimensionBehaviour2) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (z4) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z5) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        layoutParams = (LayoutParams) view.getLayoutParams();
                        if (measure.j) {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z2) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z3) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i2 = constraintWidget.m;
                            if (i2 > 0) {
                                measuredWidth2 = Math.max(i2, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i3 = constraintWidget.f3967n;
                            if (i3 > 0) {
                                measuredWidth2 = Math.min(i3, measuredWidth2);
                            }
                            i4 = constraintWidget.f3968p;
                            if (i4 > 0) {
                                measuredHeight2 = Math.max(i4, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i5 = constraintWidget.q;
                            if (i5 > 0) {
                                measuredHeight2 = Math.min(i5, measuredHeight2);
                            }
                            if (!z8) {
                                if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                            } else if (z9) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z2) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z3) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i2 = constraintWidget.m;
                            if (i2 > 0) {
                                measuredWidth2 = Math.max(i2, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i3 = constraintWidget.f3967n;
                            if (i3 > 0) {
                                measuredWidth2 = Math.min(i3, measuredWidth2);
                            }
                            i4 = constraintWidget.f3968p;
                            if (i4 > 0) {
                                measuredHeight2 = Math.max(i4, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i5 = constraintWidget.q;
                            if (i5 > 0) {
                                measuredHeight2 = Math.min(i5, measuredHeight2);
                            }
                            if (!z8) {
                                if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                            } else if (z9) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (measuredWidth2 == measure.f3991c) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        measure.f3994i = z11;
                        if (layoutParams.X) {
                            z10 = true;
                        }
                        if (z10) {
                            measure.f3994i = true;
                        }
                        measure.f3992e = measuredWidth2;
                        measure.f = measuredHeight2;
                        measure.f3993h = z10;
                        measure.g = baseline;
                    }
                    i12 = 2;
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i11, -2);
                    boolean z14 = constraintWidget.j == 1;
                    iArr[2] = 0;
                    if (measure.j) {
                        boolean z15 = !(!z14 || iArr[3] == 0 || iArr[0] == constraintWidget.m()) || (view instanceof Placeholder);
                        if (!z14 || z15) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.m(), 1073741824);
                        }
                    }
                }
                z2 = true;
                iOrdinal = dimensionBehaviour4.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                        iArr[3] = -2;
                    } else {
                        if (iOrdinal != i12) {
                            if (iOrdinal != 3) {
                                iMakeMeasureSpec2 = 0;
                                z3 = false;
                            } else {
                                int i16 = this.g;
                                if (constraintAnchor2 != null) {
                                    i7 = constraintWidget.f3971z.f3941e;
                                } else {
                                    i7 = 0;
                                }
                                if (constraintAnchor != null) {
                                    i7 += constraintWidget.f3945B.f3941e;
                                }
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, i10 + i7, -1);
                                iArr[3] = -1;
                            }
                            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                            if (dimensionBehaviour3 == dimensionBehaviour) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (dimensionBehaviour4 == dimensionBehaviour) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.X;
                            if (dimensionBehaviour4 != dimensionBehaviour2) {
                                z6 = true;
                            } else {
                                z6 = true;
                            }
                            if (dimensionBehaviour3 != dimensionBehaviour2) {
                                z7 = true;
                            } else {
                                z7 = true;
                            }
                            if (z4) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (z5) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            layoutParams = (LayoutParams) view.getLayoutParams();
                            if (measure.j) {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z2) {
                                    iArr[0] = measuredWidth;
                                    iArr[2] = measuredHeight;
                                } else {
                                    iArr[0] = 0;
                                    iArr[2] = 0;
                                }
                                if (z3) {
                                    iArr[1] = measuredHeight;
                                    iArr[3] = measuredWidth;
                                } else {
                                    iArr[1] = 0;
                                    iArr[3] = 0;
                                }
                                i2 = constraintWidget.m;
                                if (i2 > 0) {
                                    measuredWidth2 = Math.max(i2, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i3 = constraintWidget.f3967n;
                                if (i3 > 0) {
                                    measuredWidth2 = Math.min(i3, measuredWidth2);
                                }
                                i4 = constraintWidget.f3968p;
                                if (i4 > 0) {
                                    measuredHeight2 = Math.max(i4, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i5 = constraintWidget.q;
                                if (i5 > 0) {
                                    measuredHeight2 = Math.min(i5, measuredHeight2);
                                }
                                if (!z8) {
                                    if (z9) {
                                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                    }
                                } else if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            } else {
                                if (view instanceof VirtualLayout) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z2) {
                                    iArr[0] = measuredWidth;
                                    iArr[2] = measuredHeight;
                                } else {
                                    iArr[0] = 0;
                                    iArr[2] = 0;
                                }
                                if (z3) {
                                    iArr[1] = measuredHeight;
                                    iArr[3] = measuredWidth;
                                } else {
                                    iArr[1] = 0;
                                    iArr[3] = 0;
                                }
                                i2 = constraintWidget.m;
                                if (i2 > 0) {
                                    measuredWidth2 = Math.max(i2, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i3 = constraintWidget.f3967n;
                                if (i3 > 0) {
                                    measuredWidth2 = Math.min(i3, measuredWidth2);
                                }
                                i4 = constraintWidget.f3968p;
                                if (i4 > 0) {
                                    measuredHeight2 = Math.max(i4, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i5 = constraintWidget.q;
                                if (i5 > 0) {
                                    measuredHeight2 = Math.min(i5, measuredHeight2);
                                }
                                if (!z8) {
                                    if (z9) {
                                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                    }
                                } else if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        i6 = 1073741824;
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    } else {
                                        i6 = 1073741824;
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            }
                            if (baseline != -1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (measuredWidth2 == measure.f3991c) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            measure.f3994i = z11;
                            if (layoutParams.X) {
                                z10 = true;
                            }
                            if (z10) {
                                measure.f3994i = true;
                            }
                            measure.f3992e = measuredWidth2;
                            measure.f = measuredHeight2;
                            measure.f3993h = z10;
                            measure.g = baseline;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                        if (constraintWidget.k == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        iArr[3] = 0;
                        if (measure.j) {
                            if (z12) {
                            }
                            if (z12) {
                            }
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.j(), 1073741824);
                        }
                    }
                    z3 = true;
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.X;
                    if (dimensionBehaviour4 != dimensionBehaviour2) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (dimensionBehaviour3 != dimensionBehaviour2) {
                        z7 = true;
                    } else {
                        z7 = true;
                    }
                    if (z4) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (z5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    layoutParams = (LayoutParams) view.getLayoutParams();
                    if (measure.j) {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z2) {
                            iArr[0] = measuredWidth;
                            iArr[2] = measuredHeight;
                        } else {
                            iArr[0] = 0;
                            iArr[2] = 0;
                        }
                        if (z3) {
                            iArr[1] = measuredHeight;
                            iArr[3] = measuredWidth;
                        } else {
                            iArr[1] = 0;
                            iArr[3] = 0;
                        }
                        i2 = constraintWidget.m;
                        if (i2 > 0) {
                            measuredWidth2 = Math.max(i2, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i3 = constraintWidget.f3967n;
                        if (i3 > 0) {
                            measuredWidth2 = Math.min(i3, measuredWidth2);
                        }
                        i4 = constraintWidget.f3968p;
                        if (i4 > 0) {
                            measuredHeight2 = Math.max(i4, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i5 = constraintWidget.q;
                        if (i5 > 0) {
                            measuredHeight2 = Math.min(i5, measuredHeight2);
                        }
                        if (!z8) {
                            if (z9) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                            }
                        } else if (z9) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                i6 = 1073741824;
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            } else {
                                i6 = 1073741824;
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                i6 = 1073741824;
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            } else {
                                i6 = 1073741824;
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    } else {
                        if (view instanceof VirtualLayout) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z2) {
                            iArr[0] = measuredWidth;
                            iArr[2] = measuredHeight;
                        } else {
                            iArr[0] = 0;
                            iArr[2] = 0;
                        }
                        if (z3) {
                            iArr[1] = measuredHeight;
                            iArr[3] = measuredWidth;
                        } else {
                            iArr[1] = 0;
                            iArr[3] = 0;
                        }
                        i2 = constraintWidget.m;
                        if (i2 > 0) {
                            measuredWidth2 = Math.max(i2, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i3 = constraintWidget.f3967n;
                        if (i3 > 0) {
                            measuredWidth2 = Math.min(i3, measuredWidth2);
                        }
                        i4 = constraintWidget.f3968p;
                        if (i4 > 0) {
                            measuredHeight2 = Math.max(i4, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i5 = constraintWidget.q;
                        if (i5 > 0) {
                            measuredHeight2 = Math.min(i5, measuredHeight2);
                        }
                        if (!z8) {
                            if (z9) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                            }
                        } else if (z9) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                i6 = 1073741824;
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            } else {
                                i6 = 1073741824;
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                i6 = 1073741824;
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            } else {
                                i6 = 1073741824;
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    }
                    if (baseline != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (measuredWidth2 == measure.f3991c) {
                        z11 = true;
                    } else {
                        z11 = true;
                    }
                    measure.f3994i = z11;
                    if (layoutParams.X) {
                        z10 = true;
                    }
                    if (z10) {
                        measure.f3994i = true;
                    }
                    measure.f3992e = measuredWidth2;
                    measure.f = measuredHeight2;
                    measure.f3993h = z10;
                    measure.g = baseline;
                }
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                iArr[3] = i9;
                iMakeMeasureSpec2 = iMakeMeasureSpec4;
                z3 = false;
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dimensionBehaviour4 == dimensionBehaviour) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.X;
                if (dimensionBehaviour4 != dimensionBehaviour2) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dimensionBehaviour3 != dimensionBehaviour2) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (measure.j) {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z2) {
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z3) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = 0;
                        iArr[3] = 0;
                    }
                    i2 = constraintWidget.m;
                    if (i2 > 0) {
                        measuredWidth2 = Math.max(i2, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i3 = constraintWidget.f3967n;
                    if (i3 > 0) {
                        measuredWidth2 = Math.min(i3, measuredWidth2);
                    }
                    i4 = constraintWidget.f3968p;
                    if (i4 > 0) {
                        measuredHeight2 = Math.max(i4, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i5 = constraintWidget.q;
                    if (i5 > 0) {
                        measuredHeight2 = Math.min(i5, measuredHeight2);
                    }
                    if (!z8) {
                        if (z9) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                        }
                    } else if (z9) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z2) {
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z3) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = 0;
                        iArr[3] = 0;
                    }
                    i2 = constraintWidget.m;
                    if (i2 > 0) {
                        measuredWidth2 = Math.max(i2, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i3 = constraintWidget.f3967n;
                    if (i3 > 0) {
                        measuredWidth2 = Math.min(i3, measuredWidth2);
                    }
                    i4 = constraintWidget.f3968p;
                    if (i4 > 0) {
                        measuredHeight2 = Math.max(i4, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i5 = constraintWidget.q;
                    if (i5 > 0) {
                        measuredHeight2 = Math.min(i5, measuredHeight2);
                    }
                    if (!z8) {
                        if (z9) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                        }
                    } else if (z9) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (measuredWidth2 == measure.f3991c) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                measure.f3994i = z11;
                if (layoutParams.X) {
                    z10 = true;
                }
                if (z10) {
                    measure.f3994i = true;
                }
                measure.f3992e = measuredWidth2;
                measure.f = measuredHeight2;
                measure.f3993h = z10;
                measure.g = baseline;
            }
            i12 = 2;
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            iArr[2] = i8;
            iMakeMeasureSpec = iMakeMeasureSpec5;
            z2 = false;
            iOrdinal = dimensionBehaviour4.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                    iArr[3] = -2;
                } else {
                    if (iOrdinal != i12) {
                        if (iOrdinal != 3) {
                            iMakeMeasureSpec2 = 0;
                            z3 = false;
                        } else {
                            int i17 = this.g;
                            if (constraintAnchor2 != null) {
                                i7 = constraintWidget.f3971z.f3941e;
                            } else {
                                i7 = 0;
                            }
                            if (constraintAnchor != null) {
                                i7 += constraintWidget.f3945B.f3941e;
                            }
                            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i10 + i7, -1);
                            iArr[3] = -1;
                        }
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                        if (dimensionBehaviour3 == dimensionBehaviour) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (dimensionBehaviour4 == dimensionBehaviour) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = ConstraintWidget.DimensionBehaviour.X;
                        if (dimensionBehaviour4 != dimensionBehaviour2) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (dimensionBehaviour3 != dimensionBehaviour2) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        if (z4) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (z5) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        layoutParams = (LayoutParams) view.getLayoutParams();
                        if (measure.j) {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z2) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z3) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i2 = constraintWidget.m;
                            if (i2 > 0) {
                                measuredWidth2 = Math.max(i2, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i3 = constraintWidget.f3967n;
                            if (i3 > 0) {
                                measuredWidth2 = Math.min(i3, measuredWidth2);
                            }
                            i4 = constraintWidget.f3968p;
                            if (i4 > 0) {
                                measuredHeight2 = Math.max(i4, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i5 = constraintWidget.q;
                            if (i5 > 0) {
                                measuredHeight2 = Math.min(i5, measuredHeight2);
                            }
                            if (!z8) {
                                if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                            } else if (z9) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof VirtualLayout) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z2) {
                                iArr[0] = measuredWidth;
                                iArr[2] = measuredHeight;
                            } else {
                                iArr[0] = 0;
                                iArr[2] = 0;
                            }
                            if (z3) {
                                iArr[1] = measuredHeight;
                                iArr[3] = measuredWidth;
                            } else {
                                iArr[1] = 0;
                                iArr[3] = 0;
                            }
                            i2 = constraintWidget.m;
                            if (i2 > 0) {
                                measuredWidth2 = Math.max(i2, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i3 = constraintWidget.f3967n;
                            if (i3 > 0) {
                                measuredWidth2 = Math.min(i3, measuredWidth2);
                            }
                            i4 = constraintWidget.f3968p;
                            if (i4 > 0) {
                                measuredHeight2 = Math.max(i4, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i5 = constraintWidget.q;
                            if (i5 > 0) {
                                measuredHeight2 = Math.min(i5, measuredHeight2);
                            }
                            if (!z8) {
                                if (z9) {
                                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                                }
                            } else if (z9) {
                                measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    i6 = 1073741824;
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                } else {
                                    i6 = 1073741824;
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (measuredWidth2 == measure.f3991c) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        measure.f3994i = z11;
                        if (layoutParams.X) {
                            z10 = true;
                        }
                        if (z10) {
                            measure.f3994i = true;
                        }
                        measure.f3992e = measuredWidth2;
                        measure.f = measuredHeight2;
                        measure.f3993h = z10;
                        measure.g = baseline;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i10, -2);
                    if (constraintWidget.k == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    iArr[3] = 0;
                    if (measure.j) {
                        if (z12) {
                        }
                        if (z12) {
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.j(), 1073741824);
                    }
                }
                z3 = true;
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
                if (dimensionBehaviour3 == dimensionBehaviour) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (dimensionBehaviour4 == dimensionBehaviour) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.X;
                if (dimensionBehaviour4 != dimensionBehaviour2) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                if (dimensionBehaviour3 != dimensionBehaviour2) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                if (z4) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (z5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                layoutParams = (LayoutParams) view.getLayoutParams();
                if (measure.j) {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z2) {
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z3) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = 0;
                        iArr[3] = 0;
                    }
                    i2 = constraintWidget.m;
                    if (i2 > 0) {
                        measuredWidth2 = Math.max(i2, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i3 = constraintWidget.f3967n;
                    if (i3 > 0) {
                        measuredWidth2 = Math.min(i3, measuredWidth2);
                    }
                    i4 = constraintWidget.f3968p;
                    if (i4 > 0) {
                        measuredHeight2 = Math.max(i4, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i5 = constraintWidget.q;
                    if (i5 > 0) {
                        measuredHeight2 = Math.min(i5, measuredHeight2);
                    }
                    if (!z8) {
                        if (z9) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                        }
                    } else if (z9) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof VirtualLayout) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z2) {
                        iArr[0] = measuredWidth;
                        iArr[2] = measuredHeight;
                    } else {
                        iArr[0] = 0;
                        iArr[2] = 0;
                    }
                    if (z3) {
                        iArr[1] = measuredHeight;
                        iArr[3] = measuredWidth;
                    } else {
                        iArr[1] = 0;
                        iArr[3] = 0;
                    }
                    i2 = constraintWidget.m;
                    if (i2 > 0) {
                        measuredWidth2 = Math.max(i2, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i3 = constraintWidget.f3967n;
                    if (i3 > 0) {
                        measuredWidth2 = Math.min(i3, measuredWidth2);
                    }
                    i4 = constraintWidget.f3968p;
                    if (i4 > 0) {
                        measuredHeight2 = Math.max(i4, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i5 = constraintWidget.q;
                    if (i5 > 0) {
                        measuredHeight2 = Math.min(i5, measuredHeight2);
                    }
                    if (!z8) {
                        if (z9) {
                            measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                        }
                    } else if (z9) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            i6 = 1073741824;
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        } else {
                            i6 = 1073741824;
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (measuredWidth2 == measure.f3991c) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                measure.f3994i = z11;
                if (layoutParams.X) {
                    z10 = true;
                }
                if (z10) {
                    measure.f3994i = true;
                }
                measure.f3992e = measuredWidth2;
                measure.f = measuredHeight2;
                measure.f3993h = z10;
                measure.g = baseline;
            }
            int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            iArr[3] = i9;
            iMakeMeasureSpec2 = iMakeMeasureSpec6;
            z3 = false;
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
            if (dimensionBehaviour3 == dimensionBehaviour) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (dimensionBehaviour4 == dimensionBehaviour) {
                z5 = true;
            } else {
                z5 = false;
            }
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.e0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.X;
            if (dimensionBehaviour4 != dimensionBehaviour2) {
                z6 = true;
            } else {
                z6 = true;
            }
            if (dimensionBehaviour3 != dimensionBehaviour2) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (z4) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z5) {
                z9 = false;
            } else {
                z9 = false;
            }
            layoutParams = (LayoutParams) view.getLayoutParams();
            if (measure.j) {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z2) {
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z3) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = 0;
                    iArr[3] = 0;
                }
                i2 = constraintWidget.m;
                if (i2 > 0) {
                    measuredWidth2 = Math.max(i2, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i3 = constraintWidget.f3967n;
                if (i3 > 0) {
                    measuredWidth2 = Math.min(i3, measuredWidth2);
                }
                i4 = constraintWidget.f3968p;
                if (i4 > 0) {
                    measuredHeight2 = Math.max(i4, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i5 = constraintWidget.q;
                if (i5 > 0) {
                    measuredHeight2 = Math.min(i5, measuredHeight2);
                }
                if (!z8) {
                    if (z9) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                    }
                } else if (z9) {
                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            } else {
                if (view instanceof VirtualLayout) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z2) {
                    iArr[0] = measuredWidth;
                    iArr[2] = measuredHeight;
                } else {
                    iArr[0] = 0;
                    iArr[2] = 0;
                }
                if (z3) {
                    iArr[1] = measuredHeight;
                    iArr[3] = measuredWidth;
                } else {
                    iArr[1] = 0;
                    iArr[3] = 0;
                }
                i2 = constraintWidget.m;
                if (i2 > 0) {
                    measuredWidth2 = Math.max(i2, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i3 = constraintWidget.f3967n;
                if (i3 > 0) {
                    measuredWidth2 = Math.min(i3, measuredWidth2);
                }
                i4 = constraintWidget.f3968p;
                if (i4 > 0) {
                    measuredHeight2 = Math.max(i4, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i5 = constraintWidget.q;
                if (i5 > 0) {
                    measuredHeight2 = Math.min(i5, measuredHeight2);
                }
                if (!z8) {
                    if (z9) {
                        measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                    }
                } else if (z9) {
                    measuredHeight2 = (int) ((measuredWidth2 / constraintWidget.f3950N) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        i6 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, i6);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            }
            if (baseline != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (measuredWidth2 == measure.f3991c) {
                z11 = true;
            } else {
                z11 = true;
            }
            measure.f3994i = z11;
            if (layoutParams.X) {
                z10 = true;
            }
            if (z10) {
                measure.f3994i = true;
            }
            measure.f3992e = measuredWidth2;
            measure.f = measuredHeight2;
            measure.f3993h = z10;
            measure.g = baseline;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public final void a(AttributeSet attributeSet, int i2) {
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.W = this;
        Measurer measurer = this.mMeasurer;
        constraintWidgetContainer.h0 = measurer;
        constraintWidgetContainer.g0.f = measurer;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f4127b, i2, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 89) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
        int i4 = this.mOptimizationLevel;
        constraintWidgetContainer2.q0 = i4;
        LinearSystem.q = (i4 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:162:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161  */
    /* JADX WARN: Code duplicated, block: B:74:0x0166  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:81:0x018f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x02ed -> B:163:0x02ee). Please report as a decompilation issue!!! */
    public void applyConstraintsFromLayoutParams(boolean z2, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintAnchor.Type type;
        ConstraintWidget constraintWidget2;
        ConstraintAnchor.Type type2;
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor.Type type5;
        int i2;
        ConstraintAnchor.Type type6;
        int i3;
        ConstraintWidget constraintWidget4;
        ConstraintAnchor.Type type7;
        ConstraintAnchor.Type type8;
        int i4;
        ConstraintAnchor.Type type9;
        int i5;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        int i6;
        float f;
        float f2;
        View view2;
        ConstraintWidget constraintWidget7;
        ConstraintWidget constraintWidget8;
        ConstraintWidget constraintWidget9;
        ConstraintWidget constraintWidget10;
        int i7;
        float fAbs;
        int i8;
        float f3;
        ConstraintWidget constraintWidget11 = constraintWidget;
        layoutParams.a();
        constraintWidget11.X = view.getVisibility();
        if (layoutParams.a0) {
            constraintWidget11.x = true;
            constraintWidget11.X = 8;
        }
        constraintWidget11.W = view;
        if (view instanceof ConstraintHelper) {
            ((ConstraintHelper) view).g(constraintWidget11, this.mLayoutWidget.i0);
        }
        int i9 = -1;
        if (layoutParams.f4041Y) {
            androidx.constraintlayout.solver.widgets.Guideline guideline = (androidx.constraintlayout.solver.widgets.Guideline) constraintWidget11;
            int i10 = layoutParams.i0;
            int i11 = layoutParams.j0;
            float f4 = layoutParams.k0;
            if (f4 != -1.0f) {
                if (f4 > -1.0f) {
                    guideline.e0 = f4;
                    guideline.f0 = -1;
                    guideline.g0 = -1;
                    return;
                }
                return;
            }
            if (i10 != -1) {
                if (i10 > -1) {
                    guideline.e0 = -1.0f;
                    guideline.f0 = i10;
                    guideline.g0 = -1;
                    return;
                }
                return;
            }
            if (i11 == -1 || i11 <= -1) {
                return;
            }
            guideline.e0 = -1.0f;
            guideline.f0 = -1;
            guideline.g0 = i11;
            return;
        }
        int i12 = layoutParams.f4044b0;
        int i13 = layoutParams.f4046c0;
        int i14 = layoutParams.f4047d0;
        int i15 = layoutParams.e0;
        int i16 = layoutParams.f0;
        int i17 = layoutParams.g0;
        float f5 = layoutParams.h0;
        int i18 = layoutParams.m;
        ConstraintAnchor.Type type10 = ConstraintAnchor.Type.Z;
        ConstraintAnchor.Type type11 = ConstraintAnchor.Type.X;
        ConstraintAnchor.Type type12 = ConstraintAnchor.Type.e0;
        ConstraintAnchor.Type type13 = ConstraintAnchor.Type.f3943Y;
        if (i18 != -1) {
            ConstraintWidget constraintWidget12 = sparseArray.get(i18);
            if (constraintWidget12 != null) {
                float f6 = layoutParams.o;
                int i19 = layoutParams.f4052n;
                ConstraintAnchor.Type type14 = ConstraintAnchor.Type.g0;
                f3 = 0.0f;
                constraintWidget.p(type14, constraintWidget12, type14, i19, 0);
                constraintWidget11 = constraintWidget;
                constraintWidget11.v = f6;
            } else {
                f3 = 0.0f;
            }
            constraintWidget6 = constraintWidget11;
            f = f3;
            type5 = type10;
            type4 = type11;
            type8 = type12;
            type9 = type13;
        } else {
            if (i12 != -1) {
                ConstraintWidget constraintWidget13 = sparseArray.get(i12);
                if (constraintWidget13 != null) {
                    type = type11;
                    constraintWidget11.p(type, constraintWidget13, type11, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i16);
                } else {
                    type = type11;
                }
            } else {
                type = type11;
                if (i13 != -1 && (constraintWidget2 = sparseArray.get(i13)) != null) {
                    constraintWidget.p(type, constraintWidget2, type10, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i16);
                    type2 = type;
                    type3 = type10;
                }
                if (i14 != -1) {
                    constraintWidget10 = sparseArray.get(i14);
                    if (constraintWidget10 != null) {
                        constraintWidget.p(type3, constraintWidget10, type2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i17);
                    }
                    type4 = type2;
                } else {
                    type4 = type2;
                    if (i15 != -1 && (constraintWidget3 = sparseArray.get(i15)) != null) {
                        constraintWidget.p(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i17);
                    }
                }
                type5 = type3;
                i2 = layoutParams.f4049h;
                if (i2 != -1) {
                    constraintWidget9 = sparseArray.get(i2);
                    if (constraintWidget9 != null) {
                        type6 = type13;
                        constraintWidget.p(type6, constraintWidget9, type13, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f4054u);
                    } else {
                        type6 = type13;
                    }
                } else {
                    type6 = type13;
                    i3 = layoutParams.f4050i;
                    if (i3 == -1 && (constraintWidget4 = sparseArray.get(i3)) != null) {
                        constraintWidget.p(type6, constraintWidget4, type12, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f4054u);
                        type7 = type6;
                        type8 = type12;
                    }
                    i4 = layoutParams.j;
                    if (i4 != -1) {
                        constraintWidget8 = sparseArray.get(i4);
                        if (constraintWidget8 != null) {
                            constraintWidget.p(type8, constraintWidget8, type7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f4055w);
                        }
                        type9 = type7;
                    } else {
                        type9 = type7;
                        i5 = layoutParams.k;
                        if (i5 == -1 && (constraintWidget5 = sparseArray.get(i5)) != null) {
                            constraintWidget6 = constraintWidget;
                            constraintWidget6.p(type8, constraintWidget5, type8, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f4055w);
                        }
                        i6 = layoutParams.f4051l;
                        if (i6 != -1) {
                            view2 = this.mChildrenByIds.get(i6);
                            constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                            if (constraintWidget7 != null && view2 != null && (view2.getLayoutParams() instanceof LayoutParams)) {
                                LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                                layoutParams.X = true;
                                layoutParams2.X = true;
                                ConstraintAnchor.Type type15 = ConstraintAnchor.Type.f0;
                                constraintWidget6.h(type15).b(constraintWidget7.h(type15), 0, -1, true);
                                constraintWidget6.f3970w = true;
                                layoutParams2.l0.f3970w = true;
                                constraintWidget6.h(type9).h();
                                constraintWidget6.h(type8).h();
                            }
                        }
                        f = 0.0f;
                        if (f5 >= 0.0f) {
                            constraintWidget6.f3954U = f5;
                        }
                        f2 = layoutParams.f4029A;
                        if (f2 >= 0.0f) {
                            constraintWidget6.f3955V = f2;
                        }
                    }
                    constraintWidget6 = constraintWidget;
                    i6 = layoutParams.f4051l;
                    if (i6 != -1) {
                        view2 = this.mChildrenByIds.get(i6);
                        constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                        if (constraintWidget7 != null) {
                            LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
                            layoutParams.X = true;
                            layoutParams3.X = true;
                            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.f0;
                            constraintWidget6.h(type16).b(constraintWidget7.h(type16), 0, -1, true);
                            constraintWidget6.f3970w = true;
                            layoutParams3.l0.f3970w = true;
                            constraintWidget6.h(type9).h();
                            constraintWidget6.h(type8).h();
                        }
                    }
                    f = 0.0f;
                    if (f5 >= 0.0f) {
                        constraintWidget6.f3954U = f5;
                    }
                    f2 = layoutParams.f4029A;
                    if (f2 >= 0.0f) {
                        constraintWidget6.f3955V = f2;
                    }
                }
                type7 = type6;
                type8 = type12;
                i4 = layoutParams.j;
                if (i4 != -1) {
                    constraintWidget8 = sparseArray.get(i4);
                    if (constraintWidget8 != null) {
                        constraintWidget.p(type8, constraintWidget8, type7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f4055w);
                    }
                    type9 = type7;
                } else {
                    type9 = type7;
                    i5 = layoutParams.k;
                    if (i5 == -1) {
                    }
                    i6 = layoutParams.f4051l;
                    if (i6 != -1) {
                        view2 = this.mChildrenByIds.get(i6);
                        constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                        if (constraintWidget7 != null) {
                            LayoutParams layoutParams4 = (LayoutParams) view2.getLayoutParams();
                            layoutParams.X = true;
                            layoutParams4.X = true;
                            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.f0;
                            constraintWidget6.h(type17).b(constraintWidget7.h(type17), 0, -1, true);
                            constraintWidget6.f3970w = true;
                            layoutParams4.l0.f3970w = true;
                            constraintWidget6.h(type9).h();
                            constraintWidget6.h(type8).h();
                        }
                    }
                    f = 0.0f;
                    if (f5 >= 0.0f) {
                        constraintWidget6.f3954U = f5;
                    }
                    f2 = layoutParams.f4029A;
                    if (f2 >= 0.0f) {
                        constraintWidget6.f3955V = f2;
                    }
                }
                constraintWidget6 = constraintWidget;
                i6 = layoutParams.f4051l;
                if (i6 != -1) {
                    view2 = this.mChildrenByIds.get(i6);
                    constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                    if (constraintWidget7 != null) {
                        LayoutParams layoutParams5 = (LayoutParams) view2.getLayoutParams();
                        layoutParams.X = true;
                        layoutParams5.X = true;
                        ConstraintAnchor.Type type18 = ConstraintAnchor.Type.f0;
                        constraintWidget6.h(type18).b(constraintWidget7.h(type18), 0, -1, true);
                        constraintWidget6.f3970w = true;
                        layoutParams5.l0.f3970w = true;
                        constraintWidget6.h(type9).h();
                        constraintWidget6.h(type8).h();
                    }
                }
                f = 0.0f;
                if (f5 >= 0.0f) {
                    constraintWidget6.f3954U = f5;
                }
                f2 = layoutParams.f4029A;
                if (f2 >= 0.0f) {
                    constraintWidget6.f3955V = f2;
                }
            }
            type2 = type;
            type3 = type10;
            if (i14 != -1) {
                constraintWidget10 = sparseArray.get(i14);
                if (constraintWidget10 != null) {
                    constraintWidget.p(type3, constraintWidget10, type2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i17);
                }
                type4 = type2;
            } else {
                type4 = type2;
                if (i15 != -1) {
                    constraintWidget.p(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i17);
                }
            }
            type5 = type3;
            i2 = layoutParams.f4049h;
            if (i2 != -1) {
                constraintWidget9 = sparseArray.get(i2);
                if (constraintWidget9 != null) {
                    type6 = type13;
                    constraintWidget.p(type6, constraintWidget9, type13, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f4054u);
                } else {
                    type6 = type13;
                }
            } else {
                type6 = type13;
                i3 = layoutParams.f4050i;
                if (i3 == -1) {
                }
                i4 = layoutParams.j;
                if (i4 != -1) {
                    constraintWidget8 = sparseArray.get(i4);
                    if (constraintWidget8 != null) {
                        constraintWidget.p(type8, constraintWidget8, type7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f4055w);
                    }
                    type9 = type7;
                } else {
                    type9 = type7;
                    i5 = layoutParams.k;
                    if (i5 == -1) {
                    }
                    i6 = layoutParams.f4051l;
                    if (i6 != -1) {
                        view2 = this.mChildrenByIds.get(i6);
                        constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                        if (constraintWidget7 != null) {
                            LayoutParams layoutParams6 = (LayoutParams) view2.getLayoutParams();
                            layoutParams.X = true;
                            layoutParams6.X = true;
                            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.f0;
                            constraintWidget6.h(type19).b(constraintWidget7.h(type19), 0, -1, true);
                            constraintWidget6.f3970w = true;
                            layoutParams6.l0.f3970w = true;
                            constraintWidget6.h(type9).h();
                            constraintWidget6.h(type8).h();
                        }
                    }
                    f = 0.0f;
                    if (f5 >= 0.0f) {
                        constraintWidget6.f3954U = f5;
                    }
                    f2 = layoutParams.f4029A;
                    if (f2 >= 0.0f) {
                        constraintWidget6.f3955V = f2;
                    }
                }
                constraintWidget6 = constraintWidget;
                i6 = layoutParams.f4051l;
                if (i6 != -1) {
                    view2 = this.mChildrenByIds.get(i6);
                    constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                    if (constraintWidget7 != null) {
                        LayoutParams layoutParams7 = (LayoutParams) view2.getLayoutParams();
                        layoutParams.X = true;
                        layoutParams7.X = true;
                        ConstraintAnchor.Type type110 = ConstraintAnchor.Type.f0;
                        constraintWidget6.h(type110).b(constraintWidget7.h(type110), 0, -1, true);
                        constraintWidget6.f3970w = true;
                        layoutParams7.l0.f3970w = true;
                        constraintWidget6.h(type9).h();
                        constraintWidget6.h(type8).h();
                    }
                }
                f = 0.0f;
                if (f5 >= 0.0f) {
                    constraintWidget6.f3954U = f5;
                }
                f2 = layoutParams.f4029A;
                if (f2 >= 0.0f) {
                    constraintWidget6.f3955V = f2;
                }
            }
            type7 = type6;
            type8 = type12;
            i4 = layoutParams.j;
            if (i4 != -1) {
                constraintWidget8 = sparseArray.get(i4);
                if (constraintWidget8 != null) {
                    constraintWidget.p(type8, constraintWidget8, type7, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f4055w);
                }
                type9 = type7;
            } else {
                type9 = type7;
                i5 = layoutParams.k;
                if (i5 == -1) {
                }
                i6 = layoutParams.f4051l;
                if (i6 != -1) {
                    view2 = this.mChildrenByIds.get(i6);
                    constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                    if (constraintWidget7 != null) {
                        LayoutParams layoutParams8 = (LayoutParams) view2.getLayoutParams();
                        layoutParams.X = true;
                        layoutParams8.X = true;
                        ConstraintAnchor.Type type111 = ConstraintAnchor.Type.f0;
                        constraintWidget6.h(type111).b(constraintWidget7.h(type111), 0, -1, true);
                        constraintWidget6.f3970w = true;
                        layoutParams8.l0.f3970w = true;
                        constraintWidget6.h(type9).h();
                        constraintWidget6.h(type8).h();
                    }
                }
                f = 0.0f;
                if (f5 >= 0.0f) {
                    constraintWidget6.f3954U = f5;
                }
                f2 = layoutParams.f4029A;
                if (f2 >= 0.0f) {
                    constraintWidget6.f3955V = f2;
                }
            }
            constraintWidget6 = constraintWidget;
            i6 = layoutParams.f4051l;
            if (i6 != -1) {
                view2 = this.mChildrenByIds.get(i6);
                constraintWidget7 = sparseArray.get(layoutParams.f4051l);
                if (constraintWidget7 != null) {
                    LayoutParams layoutParams9 = (LayoutParams) view2.getLayoutParams();
                    layoutParams.X = true;
                    layoutParams9.X = true;
                    ConstraintAnchor.Type type112 = ConstraintAnchor.Type.f0;
                    constraintWidget6.h(type112).b(constraintWidget7.h(type112), 0, -1, true);
                    constraintWidget6.f3970w = true;
                    layoutParams9.l0.f3970w = true;
                    constraintWidget6.h(type9).h();
                    constraintWidget6.h(type8).h();
                }
            }
            f = 0.0f;
            if (f5 >= 0.0f) {
                constraintWidget6.f3954U = f5;
            }
            f2 = layoutParams.f4029A;
            if (f2 >= 0.0f) {
                constraintWidget6.f3955V = f2;
            }
        }
        if (z2 && ((i8 = layoutParams.f4036P) != -1 || layoutParams.f4037Q != -1)) {
            int i20 = layoutParams.f4037Q;
            constraintWidget6.f3951P = i8;
            constraintWidget6.f3952Q = i20;
        }
        boolean z3 = layoutParams.f4040V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f3974Y;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.X;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.e0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.Z;
        if (z3) {
            constraintWidget6.x(dimensionBehaviour2);
            constraintWidget6.z(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                constraintWidget6.x(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
            if (layoutParams.S) {
                constraintWidget6.x(dimensionBehaviour4);
            } else {
                constraintWidget6.x(dimensionBehaviour3);
            }
            constraintWidget6.h(type4).f3941e = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            constraintWidget6.h(type5).f3941e = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            constraintWidget6.x(dimensionBehaviour4);
            constraintWidget6.z(0);
        }
        if (layoutParams.W) {
            constraintWidget6.y(dimensionBehaviour2);
            constraintWidget6.w(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                constraintWidget6.y(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
            if (layoutParams.T) {
                constraintWidget6.y(dimensionBehaviour4);
            } else {
                constraintWidget6.y(dimensionBehaviour3);
            }
            constraintWidget6.h(type9).f3941e = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            constraintWidget6.h(type8).f3941e = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        } else {
            constraintWidget6.y(dimensionBehaviour4);
            constraintWidget6.w(0);
        }
        String str = layoutParams.f4030B;
        if (str == null || str.length() == 0) {
            constraintWidget6.f3950N = f;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i7 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i9 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i9 = 1;
                }
                i7 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i7);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f;
                    }
                } else {
                    String strSubstring3 = str.substring(i7, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f;
                    } else {
                        float f7 = Float.parseFloat(strSubstring3);
                        float f8 = Float.parseFloat(strSubstring4);
                        if (f7 <= f || f8 <= f) {
                            fAbs = f;
                        } else {
                            fAbs = i9 == 1 ? Math.abs(f8 / f7) : Math.abs(f7 / f8);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f) {
                constraintWidget6.f3950N = fAbs;
                constraintWidget6.O = i9;
            }
        }
        float f9 = layoutParams.D;
        float[] fArr = constraintWidget6.f3959b0;
        fArr[0] = f9;
        fArr[1] = layoutParams.f4031E;
        constraintWidget6.Z = layoutParams.f4032F;
        constraintWidget6.a0 = layoutParams.G;
        int i21 = layoutParams.H;
        int i22 = layoutParams.f4034J;
        int i23 = layoutParams.L;
        float f10 = layoutParams.f4035N;
        constraintWidget6.j = i21;
        constraintWidget6.m = i22;
        if (i23 == Integer.MAX_VALUE) {
            i23 = 0;
        }
        constraintWidget6.f3967n = i23;
        constraintWidget6.o = f10;
        if (f10 > f && f10 < 1.0f && i21 == 0) {
            constraintWidget6.j = 2;
        }
        int i24 = layoutParams.f4033I;
        int i25 = layoutParams.K;
        int i26 = layoutParams.M;
        float f11 = layoutParams.O;
        constraintWidget6.k = i24;
        constraintWidget6.f3968p = i25;
        constraintWidget6.q = i26 != Integer.MAX_VALUE ? i26 : 0;
        constraintWidget6.r = f11;
        if (f11 <= f || f11 >= 1.0f || i24 != 0) {
            return;
        }
        constraintWidget6.k = 2;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.mConstraintHelpers.get(i2).i(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        int i6 = Integer.parseInt(strArrSplit[2]);
                        int i7 = (int) ((i4 / 1080.0f) * width);
                        int i8 = (int) ((i5 / 1920.0f) * height);
                        int i9 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i7;
                        float f2 = i8;
                        float f3 = i7 + ((int) ((i6 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i8 + i9;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
        constraintWidgetContainer.getClass();
        constraintWidgetContainer.j0.getClass();
        LinearSystem.f3890p = metrics;
    }

    @Override // android.view.View
    public void forceLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.forceLayout();
    }

    public Object getDesignInformation(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.q0;
    }

    public View getViewById(int i2) {
        return this.mChildrenByIds.get(i2);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).l0;
    }

    public boolean isRtl() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i2) {
        if (i2 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i2);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.l0;
            if ((childAt.getVisibility() != 8 || layoutParams.f4041Y || layoutParams.Z || zIsInEditMode) && !layoutParams.a0) {
                int iN = constraintWidget.n();
                int iO = constraintWidget.o();
                int iM = constraintWidget.m() + iN;
                int iJ = constraintWidget.j() + iO;
                childAt.layout(iN, iO, iM, iJ);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iN, iO, iM, iJ);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).h();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget;
        this.mOnMeasureWidthMeasureSpec = i2;
        this.mOnMeasureHeightMeasureSpec = i3;
        this.mLayoutWidget.i0 = isRtl();
        if (this.mDirtyHierarchy) {
            int i4 = 0;
            this.mDirtyHierarchy = false;
            int childCount = getChildCount();
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    z2 = false;
                    break;
                } else {
                    if (getChildAt(i5).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i5++;
                }
            }
            if (z2) {
                boolean zIsInEditMode = isInEditMode();
                int childCount2 = getChildCount();
                for (int i6 = 0; i6 < childCount2; i6++) {
                    ConstraintWidget viewWidget = getViewWidget(getChildAt(i6));
                    if (viewWidget != null) {
                        viewWidget.t();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        View childAt = getChildAt(i7);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id = childAt.getId();
                            if (id == 0) {
                                constraintWidget = this.mLayoutWidget;
                            } else {
                                View viewFindViewById = this.mChildrenByIds.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                constraintWidget = viewFindViewById == this ? this.mLayoutWidget : viewFindViewById == null ? null : ((LayoutParams) viewFindViewById.getLayoutParams()).l0;
                            }
                            constraintWidget.f3956Y = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.mConstraintSetId != -1) {
                    for (int i8 = 0; i8 < childCount2; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                            this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                        }
                    }
                }
                ConstraintSet constraintSet = this.mConstraintSet;
                if (constraintSet != null) {
                    constraintSet.c(this);
                }
                this.mLayoutWidget.e0.clear();
                int size = this.mConstraintHelpers.size();
                if (size > 0) {
                    int i9 = 0;
                    while (i9 < size) {
                        ConstraintHelper constraintHelper = this.mConstraintHelpers.get(i9);
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.i0);
                        }
                        HelperWidget helperWidget = constraintHelper.h0;
                        if (helperWidget != null) {
                            helperWidget.f0 = i4;
                            Arrays.fill(helperWidget.e0, obj);
                            for (int i10 = i4; i10 < constraintHelper.f0; i10++) {
                                int i11 = constraintHelper.e0[i10];
                                View viewById = getViewById(i11);
                                if (viewById == null) {
                                    Integer numValueOf = Integer.valueOf(i11);
                                    HashMap map = constraintHelper.k0;
                                    String str = (String) map.get(numValueOf);
                                    int iD = constraintHelper.d(this, str);
                                    if (iD != 0) {
                                        constraintHelper.e0[i10] = iD;
                                        map.put(Integer.valueOf(iD), str);
                                        viewById = getViewById(iD);
                                    }
                                }
                                if (viewById != null) {
                                    HelperWidget helperWidget2 = constraintHelper.h0;
                                    ConstraintWidget viewWidget2 = getViewWidget(viewById);
                                    helperWidget2.getClass();
                                    if (viewWidget2 != helperWidget2 && viewWidget2 != null) {
                                        int i12 = helperWidget2.f0 + 1;
                                        ConstraintWidget[] constraintWidgetArr = helperWidget2.e0;
                                        if (i12 > constraintWidgetArr.length) {
                                            helperWidget2.e0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
                                        }
                                        ConstraintWidget[] constraintWidgetArr2 = helperWidget2.e0;
                                        int i13 = helperWidget2.f0;
                                        constraintWidgetArr2[i13] = viewWidget2;
                                        helperWidget2.f0 = i13 + 1;
                                    }
                                }
                            }
                            constraintHelper.h0.a();
                        }
                        i9++;
                        i4 = 0;
                        obj = null;
                    }
                }
                for (int i14 = 0; i14 < childCount2; i14++) {
                    View childAt3 = getChildAt(i14);
                    if (childAt3 instanceof Placeholder) {
                        Placeholder placeholder = (Placeholder) childAt3;
                        if (placeholder.e0 == -1 && !placeholder.isInEditMode()) {
                            placeholder.setVisibility(placeholder.g0);
                        }
                        View viewFindViewById2 = findViewById(placeholder.e0);
                        placeholder.f0 = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((LayoutParams) viewFindViewById2.getLayoutParams()).a0 = true;
                            placeholder.f0.setVisibility(0);
                            placeholder.setVisibility(0);
                        }
                    }
                }
                this.mTempMapIdToWidget.clear();
                this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
                this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt4 = getChildAt(i15);
                    this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
                }
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt5 = getChildAt(i16);
                    ConstraintWidget viewWidget3 = getViewWidget(childAt5);
                    if (viewWidget3 != null) {
                        LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                        ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutWidget;
                        constraintWidgetContainer.e0.add(viewWidget3);
                        ConstraintWidget constraintWidget2 = viewWidget3.K;
                        if (constraintWidget2 != null) {
                            ((WidgetContainer) constraintWidget2).e0.remove(viewWidget3);
                            viewWidget3.K = null;
                        }
                        viewWidget3.K = constraintWidgetContainer;
                        applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget3, layoutParams, this.mTempMapIdToWidget);
                    }
                }
            }
            if (z2) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutWidget;
                ArrayList arrayList = constraintWidgetContainer2.f0.f3986a;
                arrayList.clear();
                int size2 = constraintWidgetContainer2.e0.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    ConstraintWidget constraintWidget3 = (ConstraintWidget) constraintWidgetContainer2.e0.get(i17);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget3.f3949J;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.Z;
                    if (dimensionBehaviour3 == dimensionBehaviour4 || dimensionBehaviour3 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.e0) || (dimensionBehaviour2 = dimensionBehaviourArr[1]) == dimensionBehaviour4 || dimensionBehaviour2 == dimensionBehaviour) {
                        arrayList.add(constraintWidget3);
                    }
                }
                constraintWidgetContainer2.g0.f3997b = true;
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i2, i3);
        int iM = this.mLayoutWidget.m();
        int iJ = this.mLayoutWidget.j();
        ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutWidget;
        resolveMeasuredDimension(i2, i3, iM, iJ, constraintWidgetContainer3.r0, constraintWidgetContainer3.s0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            androidx.constraintlayout.solver.widgets.Guideline guideline = new androidx.constraintlayout.solver.widgets.Guideline();
            layoutParams.l0 = guideline;
            layoutParams.f4041Y = true;
            guideline.C(layoutParams.f4038R);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.j();
            ((LayoutParams) view.getLayoutParams()).Z = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.e0.remove(viewWidget);
        viewWidget.K = null;
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        Measurer measurer = this.mMeasurer;
        int i6 = measurer.f4061e;
        int iResolveSizeAndState = View.resolveSizeAndState(i4 + measurer.d, i2, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i5 + i6, i3, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z2) {
            iMin |= 16777216;
        }
        if (z3) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:104:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0201  */
    /* JADX WARN: Code duplicated, block: B:113:0x020c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0217  */
    /* JADX WARN: Code duplicated, block: B:12:0x008b  */
    /* JADX WARN: Code duplicated, block: B:131:0x024c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0260  */
    /* JADX WARN: Code duplicated, block: B:138:0x0265  */
    /* JADX WARN: Code duplicated, block: B:13:0x008d  */
    /* JADX WARN: Code duplicated, block: B:140:0x026f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0272  */
    /* JADX WARN: Code duplicated, block: B:145:0x0279  */
    /* JADX WARN: Code duplicated, block: B:146:0x027b  */
    /* JADX WARN: Code duplicated, block: B:150:0x029c  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x033b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0340  */
    /* JADX WARN: Code duplicated, block: B:188:0x0360  */
    /* JADX WARN: Code duplicated, block: B:195:0x0375 A[PHI: r18
  0x0375: PHI (r18v4 java.util.ArrayList) = (r18v2 java.util.ArrayList), (r18v2 java.util.ArrayList), (r18v2 java.util.ArrayList), (r18v5 java.util.ArrayList) binds: [B:186:0x035d, B:194:0x0373, B:191:0x036e, B:181:0x034f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x039c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0098  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:205:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:207:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:211:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:214:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:220:0x0400  */
    /* JADX WARN: Code duplicated, block: B:221:0x0406  */
    /* JADX WARN: Code duplicated, block: B:224:0x0411  */
    /* JADX WARN: Code duplicated, block: B:226:0x041a  */
    /* JADX WARN: Code duplicated, block: B:227:0x041f  */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0427  */
    /* JADX WARN: Code duplicated, block: B:232:0x042d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0433  */
    /* JADX WARN: Code duplicated, block: B:237:0x043d  */
    /* JADX WARN: Code duplicated, block: B:238:0x043f  */
    /* JADX WARN: Code duplicated, block: B:241:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:252:0x032e A[EDGE_INSN: B:252:0x032e->B:171:0x032e BREAK  A[LOOP:2: B:148:0x0296->B:170:0x0324], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x03f1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff A[PHI: r6 r7
  0x00ff: PHI (r6v3 char) = (r6v2 char), (r6v57 char) binds: [B:21:0x009b, B:241:0x00ff] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r7v1 char) = (r7v0 char), (r7v34 char) binds: [B:21:0x009b, B:241:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:83:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0173  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f A[LOOP:5: B:86:0x0179->B:88:0x017f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [int] */
    /* JADX WARN: Type inference failed for: r15v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r3v24, types: [androidx.constraintlayout.solver.widgets.analyzer.DependencyGraph] */
    /* JADX WARN: Type inference failed for: r5v37, types: [androidx.constraintlayout.solver.widgets.analyzer.DependencyNode] */
    /* JADX WARN: Type inference failed for: r5v39, types: [androidx.constraintlayout.solver.widgets.analyzer.DependencyNode] */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4) {
        int i5;
        int i6;
        BasicMeasure basicMeasure;
        BasicMeasure.Measurer measurer;
        int size;
        int iM;
        int iJ;
        boolean z2;
        char c2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        char c3;
        char c4;
        char c5;
        boolean zF;
        int i7;
        int i8;
        ArrayList arrayList;
        int size2;
        boolean z3;
        int i9;
        boolean z4;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        boolean z5;
        boolean z6;
        int iMax;
        int iMax2;
        boolean z7;
        int i10;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        boolean z8;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        ConstraintWidget constraintWidget;
        ArrayList arrayList2;
        int iM2;
        int iJ2;
        int i13;
        int i14;
        int iM3;
        boolean z12;
        int iJ3;
        boolean z13;
        ConstraintWidget constraintWidget2;
        boolean z14;
        int iM4;
        int iJ4;
        boolean zA;
        int iM5;
        int iJ5;
        boolean z15;
        int size3;
        BasicMeasure.Measurer measurer2;
        int i15;
        ConstraintWidget constraintWidget3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourI;
        int iMin;
        ?? r6;
        ?? r3;
        boolean z16;
        ConstraintWidgetContainer constraintWidgetContainer2;
        ?? r15;
        int i16;
        boolean zF2;
        boolean z17;
        boolean z18;
        ?? r7;
        Metrics metrics;
        int i17;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2;
        char c6;
        char c7;
        char c8;
        char c9;
        int mode = View.MeasureSpec.getMode(i3);
        int size4 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size5 = View.MeasureSpec.getSize(i4);
        char c10 = 0;
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i18 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        Measurer measurer3 = this.mMeasurer;
        measurer3.f4059b = iMax3;
        measurer3.f4060c = iMax4;
        measurer3.d = paddingWidth;
        measurer3.f4061e = i18;
        measurer3.f = i3;
        measurer3.g = i4;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 > 0 || iMax6 > 0) {
            if (!isRtl()) {
            }
            i5 = size4 - paddingWidth;
            i6 = size5 - i18;
            setSelfDimensionBehaviour(constraintWidgetContainer, mode, i5, mode2, i6);
            constraintWidgetContainer.k0 = iMax6;
            constraintWidgetContainer.l0 = iMax3;
            basicMeasure = constraintWidgetContainer.f0;
            basicMeasure.getClass();
            measurer = constraintWidgetContainer.h0;
            size = constraintWidgetContainer.e0.size();
            iM = constraintWidgetContainer.m();
            iJ = constraintWidgetContainer.j();
            if ((i2 & 128) == 128) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || (i2 & 64) == 64) {
                c2 = 1;
            } else {
                c2 = 0;
            }
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
            if (c2 != 0) {
                i17 = 0;
                while (true) {
                    if (i17 < size) {
                        c3 = c10;
                        constraintWidget4 = (ConstraintWidget) constraintWidgetContainer.e0.get(i17);
                        c4 = 1;
                        dimensionBehaviourArr2 = constraintWidget4.f3949J;
                        c6 = c2;
                        if (dimensionBehaviourArr2[c3] == dimensionBehaviour) {
                            c7 = 1;
                        } else {
                            c7 = c3;
                        }
                        if (dimensionBehaviourArr2[1] == dimensionBehaviour) {
                            c8 = 1;
                        } else {
                            c8 = c3;
                        }
                        if (c7 != 0 || c8 == 0 || constraintWidget4.f3950N <= 0.0f) {
                            c9 = c3;
                        } else {
                            c9 = 1;
                        }
                        if ((constraintWidget4.r() || c9 == 0) && !((constraintWidget4.s() && c9 != 0) || (constraintWidget4 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout) || constraintWidget4.r() || constraintWidget4.s())) {
                            i17++;
                            c2 = c6;
                            c10 = c3;
                        } else {
                            c5 = c3;
                        }
                    } else {
                        c3 = c10;
                        c4 = 1;
                        c5 = c2;
                    }
                }
            } else {
                c3 = c10;
                c4 = 1;
                c5 = c2;
            }
            if (c5 == 0 && (metrics = LinearSystem.f3890p) != null) {
                metrics.f3899a++;
            }
            if ((c5 & (((mode == 1073741824 || mode2 != 1073741824) && !z2) ? c3 : c4)) != 0) {
                int iMin2 = Math.min(constraintWidgetContainer.f3969u[c3], i5);
                iMin = Math.min(constraintWidgetContainer.f3969u[c4], i6);
                if (mode == 1073741824 || constraintWidgetContainer.m() == iMin2) {
                    r6 = c4;
                } else {
                    constraintWidgetContainer.z(iMin2);
                    r7 = c4;
                    constraintWidgetContainer.g0.f3997b = r7;
                }
                if (mode2 == 1073741824 && constraintWidgetContainer.j() != iMin) {
                    r6 = r7;
                    constraintWidgetContainer.w(iMin);
                    constraintWidgetContainer.g0.f3997b = r6;
                }
                r6 = r7;
                r6 = r7;
                r3 = constraintWidgetContainer.g0;
                if (mode == 1073741824 || mode2 != 1073741824) {
                    z16 = r3.f3997b;
                    constraintWidgetContainer2 = r3.f3996a;
                    if (z16) {
                        for (ConstraintWidget constraintWidget5 : constraintWidgetContainer2.e0) {
                            ?? r16 = c3;
                            constraintWidget5.f3957a = r16;
                            HorizontalWidgetRun horizontalWidgetRun = constraintWidget5.d;
                            horizontalWidgetRun.f4017e.j = r16;
                            horizontalWidgetRun.g = r16;
                            horizontalWidgetRun.n();
                            VerticalWidgetRun verticalWidgetRun = constraintWidget5.f3963e;
                            verticalWidgetRun.f4017e.j = r16;
                            verticalWidgetRun.g = r16;
                            verticalWidgetRun.m();
                        }
                        ?? r17 = c3;
                        constraintWidgetContainer2.f3957a = r17;
                        HorizontalWidgetRun horizontalWidgetRun2 = constraintWidgetContainer2.d;
                        horizontalWidgetRun2.f4017e.j = r17;
                        horizontalWidgetRun2.g = r17;
                        horizontalWidgetRun2.n();
                        VerticalWidgetRun verticalWidgetRun2 = constraintWidgetContainer2.f3963e;
                        verticalWidgetRun2.f4017e.j = r17;
                        verticalWidgetRun2.g = r17;
                        verticalWidgetRun2.m();
                        r3.c();
                        r15 = r17;
                    } else {
                        r15 = c3;
                    }
                    r3.b(r3.d);
                    constraintWidgetContainer2.f3951P = r15;
                    constraintWidgetContainer2.f3952Q = r15;
                    constraintWidgetContainer2.d.f4018h.d(r15);
                    constraintWidgetContainer2.f3963e.f4018h.d(r15);
                    i16 = 1073741824;
                    if (mode == 1073741824) {
                        zF2 = r3.f(r15, z2);
                        i7 = 1;
                    } else {
                        zF2 = true;
                        i7 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zF = r3.f(1, z2) & zF2;
                        i7++;
                    } else {
                        zF = zF2;
                    }
                } else {
                    zF = r3.e(z2);
                    i16 = 1073741824;
                    i7 = 2;
                }
                if (zF) {
                    if (mode == i16) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (mode2 == i16) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    constraintWidgetContainer.A(z17, z18);
                }
            } else {
                zF = false;
                i7 = 0;
            }
            if (zF || i7 != 2) {
                if (size > 0) {
                    size3 = constraintWidgetContainer.e0.size();
                    measurer2 = constraintWidgetContainer.h0;
                    for (i15 = 0; i15 < size3; i15++) {
                        constraintWidget3 = (ConstraintWidget) constraintWidgetContainer.e0.get(i15);
                        if (!(constraintWidget3 instanceof androidx.constraintlayout.solver.widgets.Guideline) && (!constraintWidget3.d.f4017e.j || !constraintWidget3.f3963e.f4017e.j)) {
                            dimensionBehaviourI = constraintWidget3.i(0);
                            ConstraintWidget.DimensionBehaviour dimensionBehaviourI2 = constraintWidget3.i(1);
                            if (dimensionBehaviourI == dimensionBehaviour || constraintWidget3.j == 1 || dimensionBehaviourI2 != dimensionBehaviour || constraintWidget3.k == 1) {
                                basicMeasure.a(measurer2, constraintWidget3, false);
                            }
                        }
                    }
                    measurer2.a();
                }
                i8 = constraintWidgetContainer.q0;
                arrayList = basicMeasure.f3986a;
                size2 = arrayList.size();
                if (size > 0) {
                    basicMeasure.b(constraintWidgetContainer, iM, iJ);
                }
                if (size2 > 0) {
                    dimensionBehaviourArr = constraintWidgetContainer.f3949J;
                    z3 = false;
                    dimensionBehaviour2 = dimensionBehaviourArr[0];
                    dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f3974Y;
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (dimensionBehaviourArr[1] == dimensionBehaviour3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int iM6 = constraintWidgetContainer.m();
                    ConstraintWidgetContainer constraintWidgetContainer3 = basicMeasure.f3988c;
                    iMax = Math.max(iM6, constraintWidgetContainer3.S);
                    iMax2 = Math.max(constraintWidgetContainer.j(), constraintWidgetContainer3.T);
                    z7 = false;
                    i10 = 0;
                    while (true) {
                        type = ConstraintAnchor.Type.e0;
                        type2 = ConstraintAnchor.Type.Z;
                        if (i10 < size2) {
                            break;
                        }
                        z13 = z6;
                        constraintWidget2 = (ConstraintWidget) arrayList.get(i10);
                        z14 = z5;
                        if (!(constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) {
                            iM4 = constraintWidget2.m();
                            boolean z19 = z7;
                            iJ4 = constraintWidget2.j();
                            zA = z19 | basicMeasure.a(measurer, constraintWidget2, true);
                            iM5 = constraintWidget2.m();
                            iJ5 = constraintWidget2.j();
                            if (iM5 != iM4) {
                                constraintWidget2.z(iM5);
                                if (z14 && constraintWidget2.n() + constraintWidget2.L > iMax) {
                                    iMax = Math.max(iMax, constraintWidget2.h(type2).c() + constraintWidget2.n() + constraintWidget2.L);
                                }
                                z15 = true;
                            } else {
                                z15 = zA;
                            }
                            if (iJ5 != iJ4) {
                                constraintWidget2.w(iJ5);
                                if (z13 && constraintWidget2.o() + constraintWidget2.M > iMax2) {
                                    iMax2 = Math.max(iMax2, constraintWidget2.h(type).c() + constraintWidget2.o() + constraintWidget2.M);
                                }
                                z15 = true;
                            }
                            z7 = ((androidx.constraintlayout.solver.widgets.VirtualLayout) constraintWidget2).m0 | z15;
                        }
                        i10++;
                        z6 = z13;
                        z5 = z14;
                        i8 = i8;
                    }
                    int i19 = i8;
                    z8 = z6;
                    z9 = z5;
                    i11 = 0;
                    while (i11 < 2) {
                        z11 = z7;
                        i12 = 0;
                        while (i12 < size2) {
                            constraintWidget = (ConstraintWidget) arrayList.get(i12);
                            if (((constraintWidget instanceof Helper) || (constraintWidget instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) && !(constraintWidget instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
                                arrayList2 = arrayList;
                                if (constraintWidget.X == 8 && ((!constraintWidget.d.f4017e.j || !constraintWidget.f3963e.f4017e.j) && !(constraintWidget instanceof androidx.constraintlayout.solver.widgets.VirtualLayout))) {
                                    iM2 = constraintWidget.m();
                                    iJ2 = constraintWidget.j();
                                    i13 = size2;
                                    int i20 = constraintWidget.f3953R;
                                    i14 = i12;
                                    boolean zA2 = z11 | basicMeasure.a(measurer, constraintWidget, true);
                                    iM3 = constraintWidget.m();
                                    z12 = zA2;
                                    iJ3 = constraintWidget.j();
                                    if (iM3 != iM2) {
                                        constraintWidget.z(iM3);
                                        if (z9 && constraintWidget.n() + constraintWidget.L > iMax) {
                                            iMax = Math.max(iMax, constraintWidget.h(type2).c() + constraintWidget.n() + constraintWidget.L);
                                        }
                                        z12 = true;
                                    }
                                    if (iJ3 != iJ2) {
                                        constraintWidget.w(iJ3);
                                        if (z8 && constraintWidget.o() + constraintWidget.M > iMax2) {
                                            iMax2 = Math.max(iMax2, constraintWidget.h(type).c() + constraintWidget.o() + constraintWidget.M);
                                        }
                                        z11 = true;
                                    } else {
                                        z11 = z12;
                                    }
                                    if (!constraintWidget.f3970w && i20 != constraintWidget.f3953R) {
                                        z11 = true;
                                    }
                                }
                                i12 = i14 + 1;
                                arrayList = arrayList2;
                                size2 = i13;
                            } else {
                                arrayList2 = arrayList;
                            }
                            i13 = size2;
                            i14 = i12;
                            i12 = i14 + 1;
                            arrayList = arrayList2;
                            size2 = i13;
                        }
                        ArrayList arrayList3 = arrayList;
                        int i21 = size2;
                        if (z11) {
                            basicMeasure.b(constraintWidgetContainer, iM, iJ);
                            z7 = false;
                        } else {
                            z7 = z11;
                        }
                        i11++;
                        arrayList = arrayList3;
                        size2 = i21;
                    }
                    if (z7) {
                        basicMeasure.b(constraintWidgetContainer, iM, iJ);
                        if (constraintWidgetContainer.m() < iMax) {
                            constraintWidgetContainer.z(iMax);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (constraintWidgetContainer.j() < iMax2) {
                            constraintWidgetContainer.w(iMax2);
                            z10 = true;
                        }
                        if (z10) {
                            basicMeasure.b(constraintWidgetContainer, iM, iJ);
                        }
                    }
                    i9 = i19;
                } else {
                    z3 = false;
                    i9 = i8;
                }
                constraintWidgetContainer.q0 = i9;
                if ((i9 & 256) == 256) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                LinearSystem.q = z4;
            }
            return;
        }
        iMax5 = Math.max(0, getPaddingLeft());
        iMax6 = iMax5;
        i5 = size4 - paddingWidth;
        i6 = size5 - i18;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i5, mode2, i6);
        constraintWidgetContainer.k0 = iMax6;
        constraintWidgetContainer.l0 = iMax3;
        basicMeasure = constraintWidgetContainer.f0;
        basicMeasure.getClass();
        measurer = constraintWidgetContainer.h0;
        size = constraintWidgetContainer.e0.size();
        iM = constraintWidgetContainer.m();
        iJ = constraintWidgetContainer.j();
        if ((i2 & 128) == 128) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c2 = 1;
        } else {
            c2 = 1;
        }
        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.Z;
        if (c2 != 0) {
            i17 = 0;
            while (true) {
                if (i17 < size) {
                    c3 = c10;
                    constraintWidget4 = (ConstraintWidget) constraintWidgetContainer.e0.get(i17);
                    c4 = 1;
                    dimensionBehaviourArr2 = constraintWidget4.f3949J;
                    c6 = c2;
                    if (dimensionBehaviourArr2[c3] == dimensionBehaviour) {
                        c7 = 1;
                    } else {
                        c7 = c3;
                    }
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour) {
                        c8 = 1;
                    } else {
                        c8 = c3;
                    }
                    if (c7 != 0) {
                        c9 = c3;
                    } else {
                        c9 = c3;
                    }
                    if (constraintWidget4.r()) {
                        i17++;
                        c2 = c6;
                        c10 = c3;
                    } else {
                        i17++;
                        c2 = c6;
                        c10 = c3;
                    }
                    c5 = c3;
                } else {
                    c3 = c10;
                    c4 = 1;
                    c5 = c2;
                }
            }
        } else {
            c3 = c10;
            c4 = 1;
            c5 = c2;
        }
        if (c5 == 0) {
        }
        if ((c5 & (((mode == 1073741824 || mode2 != 1073741824) && !z2) ? c3 : c4)) != 0) {
            int iMin3 = Math.min(constraintWidgetContainer.f3969u[c3], i5);
            iMin = Math.min(constraintWidgetContainer.f3969u[c4], i6);
            if (mode == 1073741824) {
                r6 = c4;
            } else {
                r6 = c4;
            }
            if (mode2 == 1073741824) {
                r6 = r7;
                constraintWidgetContainer.w(iMin);
                constraintWidgetContainer.g0.f3997b = r6;
            }
            r6 = r7;
            r6 = r7;
            r3 = constraintWidgetContainer.g0;
            if (mode == 1073741824) {
                z16 = r3.f3997b;
                constraintWidgetContainer2 = r3.f3996a;
                if (z16) {
                    while (r5.hasNext()) {
                        ?? r18 = c3;
                        constraintWidget5.f3957a = r18;
                        HorizontalWidgetRun horizontalWidgetRun3 = constraintWidget5.d;
                        horizontalWidgetRun3.f4017e.j = r18;
                        horizontalWidgetRun3.g = r18;
                        horizontalWidgetRun3.n();
                        VerticalWidgetRun verticalWidgetRun3 = constraintWidget5.f3963e;
                        verticalWidgetRun3.f4017e.j = r18;
                        verticalWidgetRun3.g = r18;
                        verticalWidgetRun3.m();
                    }
                    ?? r19 = c3;
                    constraintWidgetContainer2.f3957a = r19;
                    HorizontalWidgetRun horizontalWidgetRun4 = constraintWidgetContainer2.d;
                    horizontalWidgetRun4.f4017e.j = r19;
                    horizontalWidgetRun4.g = r19;
                    horizontalWidgetRun4.n();
                    VerticalWidgetRun verticalWidgetRun4 = constraintWidgetContainer2.f3963e;
                    verticalWidgetRun4.f4017e.j = r19;
                    verticalWidgetRun4.g = r19;
                    verticalWidgetRun4.m();
                    r3.c();
                    r15 = r19;
                } else {
                    r15 = c3;
                }
                r3.b(r3.d);
                constraintWidgetContainer2.f3951P = r15;
                constraintWidgetContainer2.f3952Q = r15;
                constraintWidgetContainer2.d.f4018h.d(r15);
                constraintWidgetContainer2.f3963e.f4018h.d(r15);
                i16 = 1073741824;
                if (mode == 1073741824) {
                    zF2 = r3.f(r15, z2);
                    i7 = 1;
                } else {
                    zF2 = true;
                    i7 = 0;
                }
                if (mode2 == 1073741824) {
                    zF = r3.f(1, z2) & zF2;
                    i7++;
                } else {
                    zF = zF2;
                }
            } else {
                z16 = r3.f3997b;
                constraintWidgetContainer2 = r3.f3996a;
                if (z16) {
                    while (r5.hasNext()) {
                        ?? r110 = c3;
                        constraintWidget5.f3957a = r110;
                        HorizontalWidgetRun horizontalWidgetRun5 = constraintWidget5.d;
                        horizontalWidgetRun5.f4017e.j = r110;
                        horizontalWidgetRun5.g = r110;
                        horizontalWidgetRun5.n();
                        VerticalWidgetRun verticalWidgetRun5 = constraintWidget5.f3963e;
                        verticalWidgetRun5.f4017e.j = r110;
                        verticalWidgetRun5.g = r110;
                        verticalWidgetRun5.m();
                    }
                    ?? r111 = c3;
                    constraintWidgetContainer2.f3957a = r111;
                    HorizontalWidgetRun horizontalWidgetRun6 = constraintWidgetContainer2.d;
                    horizontalWidgetRun6.f4017e.j = r111;
                    horizontalWidgetRun6.g = r111;
                    horizontalWidgetRun6.n();
                    VerticalWidgetRun verticalWidgetRun6 = constraintWidgetContainer2.f3963e;
                    verticalWidgetRun6.f4017e.j = r111;
                    verticalWidgetRun6.g = r111;
                    verticalWidgetRun6.m();
                    r3.c();
                    r15 = r111;
                } else {
                    r15 = c3;
                }
                r3.b(r3.d);
                constraintWidgetContainer2.f3951P = r15;
                constraintWidgetContainer2.f3952Q = r15;
                constraintWidgetContainer2.d.f4018h.d(r15);
                constraintWidgetContainer2.f3963e.f4018h.d(r15);
                i16 = 1073741824;
                if (mode == 1073741824) {
                    zF2 = r3.f(r15, z2);
                    i7 = 1;
                } else {
                    zF2 = true;
                    i7 = 0;
                }
                if (mode2 == 1073741824) {
                    zF = r3.f(1, z2) & zF2;
                    i7++;
                } else {
                    zF = zF2;
                }
            }
            if (zF) {
                if (mode == i16) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (mode2 == i16) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                constraintWidgetContainer.A(z17, z18);
            }
        } else {
            zF = false;
            i7 = 0;
        }
        if (zF) {
        }
        if (size > 0) {
            size3 = constraintWidgetContainer.e0.size();
            measurer2 = constraintWidgetContainer.h0;
            while (i15 < size3) {
                constraintWidget3 = (ConstraintWidget) constraintWidgetContainer.e0.get(i15);
                if (!(constraintWidget3 instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
                    dimensionBehaviourI = constraintWidget3.i(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourI3 = constraintWidget3.i(1);
                    if (dimensionBehaviourI == dimensionBehaviour) {
                        basicMeasure.a(measurer2, constraintWidget3, false);
                    } else {
                        basicMeasure.a(measurer2, constraintWidget3, false);
                    }
                }
            }
            measurer2.a();
        }
        i8 = constraintWidgetContainer.q0;
        arrayList = basicMeasure.f3986a;
        size2 = arrayList.size();
        if (size > 0) {
            basicMeasure.b(constraintWidgetContainer, iM, iJ);
        }
        if (size2 > 0) {
            dimensionBehaviourArr = constraintWidgetContainer.f3949J;
            z3 = false;
            dimensionBehaviour2 = dimensionBehaviourArr[0];
            dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f3974Y;
            if (dimensionBehaviour2 == dimensionBehaviour3) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (dimensionBehaviourArr[1] == dimensionBehaviour3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int iM7 = constraintWidgetContainer.m();
            ConstraintWidgetContainer constraintWidgetContainer4 = basicMeasure.f3988c;
            iMax = Math.max(iM7, constraintWidgetContainer4.S);
            iMax2 = Math.max(constraintWidgetContainer.j(), constraintWidgetContainer4.T);
            z7 = false;
            i10 = 0;
            while (true) {
                type = ConstraintAnchor.Type.e0;
                type2 = ConstraintAnchor.Type.Z;
                if (i10 < size2) {
                    break;
                    break;
                }
                z13 = z6;
                constraintWidget2 = (ConstraintWidget) arrayList.get(i10);
                z14 = z5;
                if (!(constraintWidget2 instanceof androidx.constraintlayout.solver.widgets.VirtualLayout)) {
                    iM4 = constraintWidget2.m();
                    boolean z110 = z7;
                    iJ4 = constraintWidget2.j();
                    zA = z110 | basicMeasure.a(measurer, constraintWidget2, true);
                    iM5 = constraintWidget2.m();
                    iJ5 = constraintWidget2.j();
                    if (iM5 != iM4) {
                        constraintWidget2.z(iM5);
                        if (z14) {
                            iMax = Math.max(iMax, constraintWidget2.h(type2).c() + constraintWidget2.n() + constraintWidget2.L);
                        }
                        z15 = true;
                    } else {
                        z15 = zA;
                    }
                    if (iJ5 != iJ4) {
                        constraintWidget2.w(iJ5);
                        if (z13) {
                            iMax2 = Math.max(iMax2, constraintWidget2.h(type).c() + constraintWidget2.o() + constraintWidget2.M);
                        }
                        z15 = true;
                    }
                    z7 = ((androidx.constraintlayout.solver.widgets.VirtualLayout) constraintWidget2).m0 | z15;
                }
                i10++;
                z6 = z13;
                z5 = z14;
                i8 = i8;
            }
            int i110 = i8;
            z8 = z6;
            z9 = z5;
            i11 = 0;
            while (i11 < 2) {
                z11 = z7;
                i12 = 0;
                while (i12 < size2) {
                    constraintWidget = (ConstraintWidget) arrayList.get(i12);
                    if (constraintWidget instanceof Helper) {
                        arrayList2 = arrayList;
                        if (constraintWidget.X == 8) {
                            i13 = size2;
                            i14 = i12;
                        } else {
                            iM2 = constraintWidget.m();
                            iJ2 = constraintWidget.j();
                            i13 = size2;
                            int i22 = constraintWidget.f3953R;
                            i14 = i12;
                            boolean zA3 = z11 | basicMeasure.a(measurer, constraintWidget, true);
                            iM3 = constraintWidget.m();
                            z12 = zA3;
                            iJ3 = constraintWidget.j();
                            if (iM3 != iM2) {
                                constraintWidget.z(iM3);
                                if (z9) {
                                    iMax = Math.max(iMax, constraintWidget.h(type2).c() + constraintWidget.n() + constraintWidget.L);
                                }
                                z12 = true;
                            }
                            if (iJ3 != iJ2) {
                                constraintWidget.w(iJ3);
                                if (z8) {
                                    iMax2 = Math.max(iMax2, constraintWidget.h(type).c() + constraintWidget.o() + constraintWidget.M);
                                }
                                z11 = true;
                            } else {
                                z11 = z12;
                            }
                            if (!constraintWidget.f3970w) {
                            }
                        }
                    } else {
                        arrayList2 = arrayList;
                        if (constraintWidget.X == 8) {
                            i13 = size2;
                            i14 = i12;
                        } else {
                            iM2 = constraintWidget.m();
                            iJ2 = constraintWidget.j();
                            i13 = size2;
                            int i23 = constraintWidget.f3953R;
                            i14 = i12;
                            boolean zA4 = z11 | basicMeasure.a(measurer, constraintWidget, true);
                            iM3 = constraintWidget.m();
                            z12 = zA4;
                            iJ3 = constraintWidget.j();
                            if (iM3 != iM2) {
                                constraintWidget.z(iM3);
                                if (z9) {
                                    iMax = Math.max(iMax, constraintWidget.h(type2).c() + constraintWidget.n() + constraintWidget.L);
                                }
                                z12 = true;
                            }
                            if (iJ3 != iJ2) {
                                constraintWidget.w(iJ3);
                                if (z8) {
                                    iMax2 = Math.max(iMax2, constraintWidget.h(type).c() + constraintWidget.o() + constraintWidget.M);
                                }
                                z11 = true;
                            } else {
                                z11 = z12;
                            }
                            if (!constraintWidget.f3970w) {
                            }
                        }
                    }
                    i12 = i14 + 1;
                    arrayList = arrayList2;
                    size2 = i13;
                }
                ArrayList arrayList4 = arrayList;
                int i24 = size2;
                if (z11) {
                    basicMeasure.b(constraintWidgetContainer, iM, iJ);
                    z7 = false;
                } else {
                    z7 = z11;
                }
                i11++;
                arrayList = arrayList4;
                size2 = i24;
            }
            if (z7) {
                basicMeasure.b(constraintWidgetContainer, iM, iJ);
                if (constraintWidgetContainer.m() < iMax) {
                    constraintWidgetContainer.z(iMax);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (constraintWidgetContainer.j() < iMax2) {
                    constraintWidgetContainer.w(iMax2);
                    z10 = true;
                }
                if (z10) {
                    basicMeasure.b(constraintWidgetContainer, iM, iJ);
                }
            }
            i9 = i110;
        } else {
            z3 = false;
            i9 = i8;
        }
        constraintWidgetContainer.q0 = i9;
        if ((i9 & 256) == 256) {
            z4 = true;
        } else {
            z4 = z3;
        }
        LinearSystem.q = z4;
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.mChildrenByIds.remove(getId());
        super.setId(i2);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
    }

    public void setOptimizationLevel(int i2) {
        this.mOptimizationLevel = i2;
        this.mLayoutWidget.q0 = i2;
        LinearSystem.q = (i2 & 256) == 256;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    public void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i2, int i3, int i4, int i5) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        int i6;
        int i7;
        Measurer measurer = this.mMeasurer;
        int i8 = measurer.f4061e;
        int i9 = measurer.d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.X;
        int childCount = getChildCount();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f3974Y;
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 0) {
                if (i2 != 1073741824) {
                    dimensionBehaviour = dimensionBehaviour2;
                } else {
                    i3 = Math.min(this.mMaxWidth - i9, i3);
                    dimensionBehaviour = dimensionBehaviour2;
                }
                if (i4 != Integer.MIN_VALUE) {
                    if (i4 != 0) {
                        if (i4 == 1073741824) {
                            i5 = Math.min(this.mMaxHeight - i8, i5);
                        }
                        if (i3 == constraintWidgetContainer.m() || i5 != constraintWidgetContainer.j()) {
                            constraintWidgetContainer.g0.f3998c = true;
                        }
                        constraintWidgetContainer.f3951P = 0;
                        constraintWidgetContainer.f3952Q = 0;
                        int i10 = this.mMaxWidth - i9;
                        int[] iArr = constraintWidgetContainer.f3969u;
                        iArr[0] = i10;
                        iArr[1] = this.mMaxHeight - i8;
                        constraintWidgetContainer.S = 0;
                        constraintWidgetContainer.T = 0;
                        constraintWidgetContainer.x(dimensionBehaviour);
                        constraintWidgetContainer.z(i3);
                        constraintWidgetContainer.y(dimensionBehaviour2);
                        constraintWidgetContainer.w(i5);
                        i6 = this.mMinWidth - i9;
                        if (i6 < 0) {
                            constraintWidgetContainer.S = 0;
                        } else {
                            constraintWidgetContainer.S = i6;
                        }
                        i7 = this.mMinHeight - i8;
                        if (i7 < 0) {
                            constraintWidgetContainer.T = 0;
                        } else {
                            constraintWidgetContainer.T = i7;
                        }
                    }
                    if (childCount == 0) {
                        i5 = Math.max(0, this.mMinHeight);
                    } else {
                        dimensionBehaviour2 = dimensionBehaviour3;
                    }
                    i5 = 0;
                    if (i3 == constraintWidgetContainer.m()) {
                        constraintWidgetContainer.g0.f3998c = true;
                    } else {
                        constraintWidgetContainer.g0.f3998c = true;
                    }
                    constraintWidgetContainer.f3951P = 0;
                    constraintWidgetContainer.f3952Q = 0;
                    int i11 = this.mMaxWidth - i9;
                    int[] iArr2 = constraintWidgetContainer.f3969u;
                    iArr2[0] = i11;
                    iArr2[1] = this.mMaxHeight - i8;
                    constraintWidgetContainer.S = 0;
                    constraintWidgetContainer.T = 0;
                    constraintWidgetContainer.x(dimensionBehaviour);
                    constraintWidgetContainer.z(i3);
                    constraintWidgetContainer.y(dimensionBehaviour2);
                    constraintWidgetContainer.w(i5);
                    i6 = this.mMinWidth - i9;
                    if (i6 < 0) {
                        constraintWidgetContainer.S = 0;
                    } else {
                        constraintWidgetContainer.S = i6;
                    }
                    i7 = this.mMinHeight - i8;
                    if (i7 < 0) {
                        constraintWidgetContainer.T = 0;
                    } else {
                        constraintWidgetContainer.T = i7;
                    }
                }
                if (childCount == 0) {
                    i5 = Math.max(0, this.mMinHeight);
                }
                dimensionBehaviour2 = dimensionBehaviour3;
                if (i3 == constraintWidgetContainer.m()) {
                    constraintWidgetContainer.g0.f3998c = true;
                } else {
                    constraintWidgetContainer.g0.f3998c = true;
                }
                constraintWidgetContainer.f3951P = 0;
                constraintWidgetContainer.f3952Q = 0;
                int i12 = this.mMaxWidth - i9;
                int[] iArr3 = constraintWidgetContainer.f3969u;
                iArr3[0] = i12;
                iArr3[1] = this.mMaxHeight - i8;
                constraintWidgetContainer.S = 0;
                constraintWidgetContainer.T = 0;
                constraintWidgetContainer.x(dimensionBehaviour);
                constraintWidgetContainer.z(i3);
                constraintWidgetContainer.y(dimensionBehaviour2);
                constraintWidgetContainer.w(i5);
                i6 = this.mMinWidth - i9;
                if (i6 < 0) {
                    constraintWidgetContainer.S = 0;
                } else {
                    constraintWidgetContainer.S = i6;
                }
                i7 = this.mMinHeight - i8;
                if (i7 < 0) {
                    constraintWidgetContainer.T = 0;
                } else {
                    constraintWidgetContainer.T = i7;
                }
            }
            if (childCount == 0) {
                i3 = Math.max(0, this.mMinWidth);
            } else {
                dimensionBehaviour = dimensionBehaviour3;
            }
            i3 = 0;
            if (i4 != Integer.MIN_VALUE) {
                if (i4 != 0) {
                    if (i4 == 1073741824) {
                        i5 = Math.min(this.mMaxHeight - i8, i5);
                    }
                    if (i3 == constraintWidgetContainer.m()) {
                        constraintWidgetContainer.g0.f3998c = true;
                    } else {
                        constraintWidgetContainer.g0.f3998c = true;
                    }
                    constraintWidgetContainer.f3951P = 0;
                    constraintWidgetContainer.f3952Q = 0;
                    int i13 = this.mMaxWidth - i9;
                    int[] iArr4 = constraintWidgetContainer.f3969u;
                    iArr4[0] = i13;
                    iArr4[1] = this.mMaxHeight - i8;
                    constraintWidgetContainer.S = 0;
                    constraintWidgetContainer.T = 0;
                    constraintWidgetContainer.x(dimensionBehaviour);
                    constraintWidgetContainer.z(i3);
                    constraintWidgetContainer.y(dimensionBehaviour2);
                    constraintWidgetContainer.w(i5);
                    i6 = this.mMinWidth - i9;
                    if (i6 < 0) {
                        constraintWidgetContainer.S = 0;
                    } else {
                        constraintWidgetContainer.S = i6;
                    }
                    i7 = this.mMinHeight - i8;
                    if (i7 < 0) {
                        constraintWidgetContainer.T = 0;
                    } else {
                        constraintWidgetContainer.T = i7;
                    }
                }
                if (childCount == 0) {
                    i5 = Math.max(0, this.mMinHeight);
                } else {
                    dimensionBehaviour2 = dimensionBehaviour3;
                }
                i5 = 0;
                if (i3 == constraintWidgetContainer.m()) {
                    constraintWidgetContainer.g0.f3998c = true;
                } else {
                    constraintWidgetContainer.g0.f3998c = true;
                }
                constraintWidgetContainer.f3951P = 0;
                constraintWidgetContainer.f3952Q = 0;
                int i14 = this.mMaxWidth - i9;
                int[] iArr5 = constraintWidgetContainer.f3969u;
                iArr5[0] = i14;
                iArr5[1] = this.mMaxHeight - i8;
                constraintWidgetContainer.S = 0;
                constraintWidgetContainer.T = 0;
                constraintWidgetContainer.x(dimensionBehaviour);
                constraintWidgetContainer.z(i3);
                constraintWidgetContainer.y(dimensionBehaviour2);
                constraintWidgetContainer.w(i5);
                i6 = this.mMinWidth - i9;
                if (i6 < 0) {
                    constraintWidgetContainer.S = 0;
                } else {
                    constraintWidgetContainer.S = i6;
                }
                i7 = this.mMinHeight - i8;
                if (i7 < 0) {
                    constraintWidgetContainer.T = 0;
                } else {
                    constraintWidgetContainer.T = i7;
                }
            }
            if (childCount == 0) {
                i5 = Math.max(0, this.mMinHeight);
            }
            dimensionBehaviour2 = dimensionBehaviour3;
            if (i3 == constraintWidgetContainer.m()) {
                constraintWidgetContainer.g0.f3998c = true;
            } else {
                constraintWidgetContainer.g0.f3998c = true;
            }
            constraintWidgetContainer.f3951P = 0;
            constraintWidgetContainer.f3952Q = 0;
            int i15 = this.mMaxWidth - i9;
            int[] iArr6 = constraintWidgetContainer.f3969u;
            iArr6[0] = i15;
            iArr6[1] = this.mMaxHeight - i8;
            constraintWidgetContainer.S = 0;
            constraintWidgetContainer.T = 0;
            constraintWidgetContainer.x(dimensionBehaviour);
            constraintWidgetContainer.z(i3);
            constraintWidgetContainer.y(dimensionBehaviour2);
            constraintWidgetContainer.w(i5);
            i6 = this.mMinWidth - i9;
            if (i6 < 0) {
                constraintWidgetContainer.S = 0;
            } else {
                constraintWidgetContainer.S = i6;
            }
            i7 = this.mMinHeight - i8;
            if (i7 < 0) {
                constraintWidgetContainer.T = 0;
            } else {
                constraintWidgetContainer.T = i7;
            }
        }
        if (childCount == 0) {
            i3 = Math.max(0, this.mMinWidth);
        }
        dimensionBehaviour = dimensionBehaviour3;
        if (i4 != Integer.MIN_VALUE) {
            if (i4 != 0) {
                if (i4 == 1073741824) {
                    i5 = Math.min(this.mMaxHeight - i8, i5);
                }
                if (i3 == constraintWidgetContainer.m()) {
                    constraintWidgetContainer.g0.f3998c = true;
                } else {
                    constraintWidgetContainer.g0.f3998c = true;
                }
                constraintWidgetContainer.f3951P = 0;
                constraintWidgetContainer.f3952Q = 0;
                int i16 = this.mMaxWidth - i9;
                int[] iArr7 = constraintWidgetContainer.f3969u;
                iArr7[0] = i16;
                iArr7[1] = this.mMaxHeight - i8;
                constraintWidgetContainer.S = 0;
                constraintWidgetContainer.T = 0;
                constraintWidgetContainer.x(dimensionBehaviour);
                constraintWidgetContainer.z(i3);
                constraintWidgetContainer.y(dimensionBehaviour2);
                constraintWidgetContainer.w(i5);
                i6 = this.mMinWidth - i9;
                if (i6 < 0) {
                    constraintWidgetContainer.S = 0;
                } else {
                    constraintWidgetContainer.S = i6;
                }
                i7 = this.mMinHeight - i8;
                if (i7 < 0) {
                    constraintWidgetContainer.T = 0;
                } else {
                    constraintWidgetContainer.T = i7;
                }
            }
            if (childCount == 0) {
                i5 = Math.max(0, this.mMinHeight);
            } else {
                dimensionBehaviour2 = dimensionBehaviour3;
            }
            i5 = 0;
            if (i3 == constraintWidgetContainer.m()) {
                constraintWidgetContainer.g0.f3998c = true;
            } else {
                constraintWidgetContainer.g0.f3998c = true;
            }
            constraintWidgetContainer.f3951P = 0;
            constraintWidgetContainer.f3952Q = 0;
            int i17 = this.mMaxWidth - i9;
            int[] iArr8 = constraintWidgetContainer.f3969u;
            iArr8[0] = i17;
            iArr8[1] = this.mMaxHeight - i8;
            constraintWidgetContainer.S = 0;
            constraintWidgetContainer.T = 0;
            constraintWidgetContainer.x(dimensionBehaviour);
            constraintWidgetContainer.z(i3);
            constraintWidgetContainer.y(dimensionBehaviour2);
            constraintWidgetContainer.w(i5);
            i6 = this.mMinWidth - i9;
            if (i6 < 0) {
                constraintWidgetContainer.S = 0;
            } else {
                constraintWidgetContainer.S = i6;
            }
            i7 = this.mMinHeight - i8;
            if (i7 < 0) {
                constraintWidgetContainer.T = 0;
            } else {
                constraintWidgetContainer.T = i7;
            }
        }
        if (childCount == 0) {
            i5 = Math.max(0, this.mMinHeight);
        }
        dimensionBehaviour2 = dimensionBehaviour3;
        if (i3 == constraintWidgetContainer.m()) {
            constraintWidgetContainer.g0.f3998c = true;
        } else {
            constraintWidgetContainer.g0.f3998c = true;
        }
        constraintWidgetContainer.f3951P = 0;
        constraintWidgetContainer.f3952Q = 0;
        int i18 = this.mMaxWidth - i9;
        int[] iArr9 = constraintWidgetContainer.f3969u;
        iArr9[0] = i18;
        iArr9[1] = this.mMaxHeight - i8;
        constraintWidgetContainer.S = 0;
        constraintWidgetContainer.T = 0;
        constraintWidgetContainer.x(dimensionBehaviour);
        constraintWidgetContainer.z(i3);
        constraintWidgetContainer.y(dimensionBehaviour2);
        constraintWidgetContainer.w(i5);
        i6 = this.mMinWidth - i9;
        if (i6 < 0) {
            constraintWidgetContainer.S = 0;
        } else {
            constraintWidgetContainer.S = i6;
        }
        i7 = this.mMinHeight - i8;
        if (i7 < 0) {
            constraintWidgetContainer.T = 0;
        } else {
            constraintWidgetContainer.T = i7;
        }
    }

    public void setState(int i2, int i3, int i4) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.b(i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        a(attributeSet, i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public float f4029A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public String f4030B;
        public final int C;
        public float D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f4031E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f4032F;
        public int G;
        public int H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f4033I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f4034J;
        public int K;
        public int L;
        public int M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public float f4035N;
        public float O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f4036P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f4037Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f4038R;
        public boolean S;
        public boolean T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public String f4039U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public boolean f4040V;
        public boolean W;
        public boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f4041Y;
        public boolean Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4042a;
        public boolean a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4043b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f4044b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4045c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f4046c0;
        public int d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f4047d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4048e;
        public int e0;
        public int f;
        public int f0;
        public int g;
        public int g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4049h;
        public float h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f4050i;
        public int i0;
        public int j;
        public int j0;
        public int k;
        public float k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f4051l;
        public ConstraintWidget l0;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f4052n;
        public float o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f4053p;
        public int q;
        public int r;
        public int s;
        public final int t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f4054u;
        public final int v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f4055w;
        public int x;
        public int y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f4056z;

        public static class Table {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f4057a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f4057a = sparseIntArray;
                sparseIntArray.append(63, 8);
                sparseIntArray.append(64, 9);
                sparseIntArray.append(66, 10);
                sparseIntArray.append(67, 11);
                sparseIntArray.append(73, 12);
                sparseIntArray.append(72, 13);
                sparseIntArray.append(45, 14);
                sparseIntArray.append(44, 15);
                sparseIntArray.append(42, 16);
                sparseIntArray.append(46, 2);
                sparseIntArray.append(48, 3);
                sparseIntArray.append(47, 4);
                sparseIntArray.append(81, 49);
                sparseIntArray.append(82, 50);
                sparseIntArray.append(52, 5);
                sparseIntArray.append(53, 6);
                sparseIntArray.append(54, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(68, 17);
                sparseIntArray.append(69, 18);
                sparseIntArray.append(51, 19);
                sparseIntArray.append(50, 20);
                sparseIntArray.append(85, 21);
                sparseIntArray.append(88, 22);
                sparseIntArray.append(86, 23);
                sparseIntArray.append(83, 24);
                sparseIntArray.append(87, 25);
                sparseIntArray.append(84, 26);
                sparseIntArray.append(59, 29);
                sparseIntArray.append(74, 30);
                sparseIntArray.append(49, 44);
                sparseIntArray.append(61, 45);
                sparseIntArray.append(76, 46);
                sparseIntArray.append(60, 47);
                sparseIntArray.append(75, 48);
                sparseIntArray.append(40, 27);
                sparseIntArray.append(39, 28);
                sparseIntArray.append(77, 31);
                sparseIntArray.append(55, 32);
                sparseIntArray.append(79, 33);
                sparseIntArray.append(78, 34);
                sparseIntArray.append(80, 35);
                sparseIntArray.append(57, 36);
                sparseIntArray.append(56, 37);
                sparseIntArray.append(58, 38);
                sparseIntArray.append(62, 39);
                sparseIntArray.append(71, 40);
                sparseIntArray.append(65, 41);
                sparseIntArray.append(43, 42);
                sparseIntArray.append(41, 43);
                sparseIntArray.append(70, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            int i2;
            super(context, attributeSet);
            this.f4042a = -1;
            this.f4043b = -1;
            this.f4045c = -1.0f;
            this.d = -1;
            this.f4048e = -1;
            this.f = -1;
            this.g = -1;
            this.f4049h = -1;
            this.f4050i = -1;
            this.j = -1;
            this.k = -1;
            this.f4051l = -1;
            this.m = -1;
            this.f4052n = 0;
            this.o = 0.0f;
            this.f4053p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.f4054u = -1;
            this.v = -1;
            this.f4055w = -1;
            this.x = -1;
            this.y = -1;
            this.f4056z = 0.5f;
            this.f4029A = 0.5f;
            this.f4030B = null;
            this.C = 1;
            this.D = -1.0f;
            this.f4031E = -1.0f;
            this.f4032F = 0;
            this.G = 0;
            this.H = 0;
            this.f4033I = 0;
            this.f4034J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.f4035N = 1.0f;
            this.O = 1.0f;
            this.f4036P = -1;
            this.f4037Q = -1;
            this.f4038R = -1;
            this.S = false;
            this.T = false;
            this.f4039U = null;
            this.f4040V = true;
            this.W = true;
            this.X = false;
            this.f4041Y = false;
            this.Z = false;
            this.a0 = false;
            this.f4044b0 = -1;
            this.f4046c0 = -1;
            this.f4047d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f4127b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = Table.f4057a.get(index);
                switch (i4) {
                    case 1:
                        this.f4038R = typedArrayObtainStyledAttributes.getInt(index, this.f4038R);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f4052n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4052n);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f;
                        if (f < 0.0f) {
                            this.o = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f4042a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4042a);
                        break;
                    case 6:
                        this.f4043b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4043b);
                        break;
                    case 7:
                        this.f4045c = typedArrayObtainStyledAttributes.getFloat(index, this.f4045c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId2;
                        if (resourceId2 == -1) {
                            this.d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4048e);
                        this.f4048e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f4048e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId5;
                        if (resourceId5 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4049h);
                        this.f4049h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f4049h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4050i);
                        this.f4050i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f4050i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4051l);
                        this.f4051l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f4051l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f4053p);
                        this.f4053p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f4053p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 22:
                        this.f4054u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4054u);
                        break;
                    case 23:
                        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 24:
                        this.f4055w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4055w);
                        break;
                    case 25:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 26:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 27:
                        this.S = typedArrayObtainStyledAttributes.getBoolean(index, this.S);
                        break;
                    case 28:
                        this.T = typedArrayObtainStyledAttributes.getBoolean(index, this.T);
                        break;
                    case 29:
                        this.f4056z = typedArrayObtainStyledAttributes.getFloat(index, this.f4056z);
                        break;
                    case 30:
                        this.f4029A = typedArrayObtainStyledAttributes.getFloat(index, this.f4029A);
                        break;
                    case 31:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.H = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i6 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f4033I = i6;
                        if (i6 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f4034J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4034J);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f4034J) == -2) {
                                this.f4034J = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f4035N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f4035N));
                        this.H = 2;
                        break;
                    case 36:
                        try {
                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                        break;
                    case 38:
                        this.O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.O));
                        this.f4033I = 2;
                        break;
                    default:
                        switch (i4) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f4030B = string;
                                this.C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f4030B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String strSubstring = this.f4030B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i2 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f4030B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f4030B.substring(i2);
                                        if (strSubstring2.length() > 0) {
                                            Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.f4030B.substring(i2, iIndexOf2);
                                        String strSubstring4 = this.f4030B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring3);
                                                float f3 = Float.parseFloat(strSubstring4);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(f3 / f2);
                                                    } else {
                                                        Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            case 46:
                                this.f4031E = typedArrayObtainStyledAttributes.getFloat(index, this.f4031E);
                                break;
                            case 47:
                                this.f4032F = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f4036P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4036P);
                                break;
                            case 50:
                                this.f4037Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4037Q);
                                break;
                            case AD_REWARD_USER_VALUE:
                                this.f4039U = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public final void a() {
            this.f4041Y = false;
            this.f4040V = true;
            this.W = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.S) {
                this.f4040V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.T) {
                this.W = false;
                if (this.f4033I == 0) {
                    this.f4033I = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f4040V = false;
                if (i2 == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (i3 == 0 && this.f4033I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f4045c == -1.0f && this.f4042a == -1 && this.f4043b == -1) {
                return;
            }
            this.f4041Y = true;
            this.f4040V = true;
            this.W = true;
            if (!(this.l0 instanceof androidx.constraintlayout.solver.widgets.Guideline)) {
                this.l0 = new androidx.constraintlayout.solver.widgets.Guideline();
            }
            ((androidx.constraintlayout.solver.widgets.Guideline) this.l0).C(this.f4038R);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:39:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0087  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i8 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i2);
            boolean z2 = false;
            boolean z3 = 1 == getLayoutDirection();
            this.f4047d0 = -1;
            this.e0 = -1;
            this.f4044b0 = -1;
            this.f4046c0 = -1;
            this.f0 = this.t;
            this.g0 = this.v;
            float f = this.f4056z;
            this.h0 = f;
            int i9 = this.f4042a;
            this.i0 = i9;
            int i10 = this.f4043b;
            this.j0 = i10;
            float f2 = this.f4045c;
            this.k0 = f2;
            if (z3) {
                int i11 = this.f4053p;
                if (i11 != -1) {
                    this.f4047d0 = i11;
                } else {
                    int i12 = this.q;
                    if (i12 != -1) {
                        this.e0 = i12;
                    } else {
                        i3 = this.r;
                        if (i3 != -1) {
                            this.f4046c0 = i3;
                            z2 = true;
                        }
                        i4 = this.s;
                        if (i4 != -1) {
                            this.f4044b0 = i4;
                            z2 = true;
                        }
                        i5 = this.x;
                        if (i5 != -1) {
                            this.g0 = i5;
                        }
                        i6 = this.y;
                        if (i6 != -1) {
                            this.f0 = i6;
                        }
                        if (z2) {
                            this.h0 = 1.0f - f;
                        }
                        if (this.f4041Y && this.f4038R == 1) {
                            if (f2 != -1.0f) {
                                this.k0 = 1.0f - f2;
                                this.i0 = -1;
                                this.j0 = -1;
                            } else if (i9 != -1) {
                                this.j0 = i9;
                                this.i0 = -1;
                                this.k0 = -1.0f;
                            } else if (i10 != -1) {
                                this.i0 = i10;
                                this.j0 = -1;
                                this.k0 = -1.0f;
                            }
                        }
                    }
                }
                z2 = true;
                i3 = this.r;
                if (i3 != -1) {
                    this.f4046c0 = i3;
                    z2 = true;
                }
                i4 = this.s;
                if (i4 != -1) {
                    this.f4044b0 = i4;
                    z2 = true;
                }
                i5 = this.x;
                if (i5 != -1) {
                    this.g0 = i5;
                }
                i6 = this.y;
                if (i6 != -1) {
                    this.f0 = i6;
                }
                if (z2) {
                    this.h0 = 1.0f - f;
                }
                if (this.f4041Y) {
                    if (f2 != -1.0f) {
                        this.k0 = 1.0f - f2;
                        this.i0 = -1;
                        this.j0 = -1;
                    } else if (i9 != -1) {
                        this.j0 = i9;
                        this.i0 = -1;
                        this.k0 = -1.0f;
                    } else if (i10 != -1) {
                        this.i0 = i10;
                        this.j0 = -1;
                        this.k0 = -1.0f;
                    }
                }
            } else {
                int i13 = this.f4053p;
                if (i13 != -1) {
                    this.f4046c0 = i13;
                }
                int i14 = this.q;
                if (i14 != -1) {
                    this.f4044b0 = i14;
                }
                int i15 = this.r;
                if (i15 != -1) {
                    this.f4047d0 = i15;
                }
                int i16 = this.s;
                if (i16 != -1) {
                    this.e0 = i16;
                }
                int i17 = this.x;
                if (i17 != -1) {
                    this.f0 = i17;
                }
                int i18 = this.y;
                if (i18 != -1) {
                    this.g0 = i18;
                }
            }
            if (this.r == -1 && this.s == -1 && this.q == -1 && this.f4053p == -1) {
                int i19 = this.f;
                if (i19 != -1) {
                    this.f4047d0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                    }
                } else {
                    int i20 = this.g;
                    if (i20 != -1) {
                        this.e0 = i20;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                        }
                    }
                }
                int i21 = this.d;
                if (i21 != -1) {
                    this.f4044b0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
                    return;
                }
                int i22 = this.f4048e;
                if (i22 != -1) {
                    this.f4046c0 = i22;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
                }
            }
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f4042a = -1;
            this.f4043b = -1;
            this.f4045c = -1.0f;
            this.d = -1;
            this.f4048e = -1;
            this.f = -1;
            this.g = -1;
            this.f4049h = -1;
            this.f4050i = -1;
            this.j = -1;
            this.k = -1;
            this.f4051l = -1;
            this.m = -1;
            this.f4052n = 0;
            this.o = 0.0f;
            this.f4053p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.f4054u = -1;
            this.v = -1;
            this.f4055w = -1;
            this.x = -1;
            this.y = -1;
            this.f4056z = 0.5f;
            this.f4029A = 0.5f;
            this.f4030B = null;
            this.C = 1;
            this.D = -1.0f;
            this.f4031E = -1.0f;
            this.f4032F = 0;
            this.G = 0;
            this.H = 0;
            this.f4033I = 0;
            this.f4034J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.f4035N = 1.0f;
            this.O = 1.0f;
            this.f4036P = -1;
            this.f4037Q = -1;
            this.f4038R = -1;
            this.S = false;
            this.T = false;
            this.f4039U = null;
            this.f4040V = true;
            this.W = true;
            this.X = false;
            this.f4041Y = false;
            this.Z = false;
            this.a0 = false;
            this.f4044b0 = -1;
            this.f4046c0 = -1;
            this.f4047d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new ConstraintWidget();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4042a = -1;
            this.f4043b = -1;
            this.f4045c = -1.0f;
            this.d = -1;
            this.f4048e = -1;
            this.f = -1;
            this.g = -1;
            this.f4049h = -1;
            this.f4050i = -1;
            this.j = -1;
            this.k = -1;
            this.f4051l = -1;
            this.m = -1;
            this.f4052n = 0;
            this.o = 0.0f;
            this.f4053p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.f4054u = -1;
            this.v = -1;
            this.f4055w = -1;
            this.x = -1;
            this.y = -1;
            this.f4056z = 0.5f;
            this.f4029A = 0.5f;
            this.f4030B = null;
            this.C = 1;
            this.D = -1.0f;
            this.f4031E = -1.0f;
            this.f4032F = 0;
            this.G = 0;
            this.H = 0;
            this.f4033I = 0;
            this.f4034J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.f4035N = 1.0f;
            this.O = 1.0f;
            this.f4036P = -1;
            this.f4037Q = -1;
            this.f4038R = -1;
            this.S = false;
            this.T = false;
            this.f4039U = null;
            this.f4040V = true;
            this.W = true;
            this.X = false;
            this.f4041Y = false;
            this.Z = false;
            this.a0 = false;
            this.f4044b0 = -1;
            this.f4046c0 = -1;
            this.f4047d0 = -1;
            this.e0 = -1;
            this.f0 = -1;
            this.g0 = -1;
            this.h0 = 0.5f;
            this.l0 = new ConstraintWidget();
        }
    }
}
