package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.widget.CompoundButtonCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
class FlexboxHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlexboxLayoutManager f19039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f19040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f19041c;
    public long[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f19042e;

    public static class FlexLinesResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f19043a;
    }

    public static class Order implements Comparable<Order> {
        @Override // java.lang.Comparable
        public final int compareTo(Order order) {
            order.getClass();
            return 0 - 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(0);
            sb.append(", index=");
            return a.p(sb, 0, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public FlexboxHelper(FlexboxLayoutManager flexboxLayoutManager) {
        this.f19039a = flexboxLayoutManager;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01d4  */
    public final void a(FlexLinesResult flexLinesResult, int i2, int i3, int i4, int i5, int i6, List list) {
        int i7;
        int i8;
        int iQ;
        FlexItem flexItem;
        int topDecorationHeight;
        int bottomDecorationHeight;
        int i9;
        int i10;
        boolean z2;
        int i11 = i2;
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        boolean zX = flexboxLayoutManager.x();
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        List arrayList = list == null ? new ArrayList() : list;
        flexLinesResult.f19043a = arrayList;
        boolean z3 = i6 == -1;
        int paddingStart = zX ? flexboxLayoutManager.getPaddingStart() : flexboxLayoutManager.getPaddingTop();
        int paddingEnd = zX ? flexboxLayoutManager.getPaddingEnd() : flexboxLayoutManager.getPaddingBottom();
        int paddingTop = zX ? flexboxLayoutManager.getPaddingTop() : flexboxLayoutManager.getPaddingStart();
        int paddingBottom = zX ? flexboxLayoutManager.getPaddingBottom() : flexboxLayoutManager.getPaddingEnd();
        FlexLine flexLine = new FlexLine();
        int i12 = i5;
        int i13 = 1;
        flexLine.o = i12;
        int i14 = paddingStart + paddingEnd;
        flexLine.f19033e = i14;
        int iB = flexboxLayoutManager.k0.b();
        int i15 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i16 = 0;
        while (i12 < iB) {
            boolean z4 = z3;
            View viewT = flexboxLayoutManager.t(i12);
            if (viewT == null) {
                if (i12 == iB - 1 && flexLine.a() != 0) {
                    flexLine.m = i16;
                    flexLine.f19038p = i12;
                    arrayList.add(flexLine);
                }
                i7 = iB;
                i8 = paddingTop;
            } else {
                i7 = iB;
                i8 = paddingTop;
                if (viewT.getVisibility() == 8) {
                    flexLine.f19035i++;
                    flexLine.f19034h++;
                    if (i12 == i7 - 1 && flexLine.a() != 0) {
                        flexLine.m = i16;
                        flexLine.f19038p = i12;
                        arrayList.add(flexLine);
                    }
                } else {
                    if (viewT instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewT;
                        FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                        int iK = flexItem2.K();
                        int iJ0 = flexItem2.J0();
                        Drawable drawableA = CompoundButtonCompat.a(compoundButton);
                        int minimumWidth = drawableA == null ? 0 : drawableA.getMinimumWidth();
                        int minimumHeight = drawableA == null ? 0 : drawableA.getMinimumHeight();
                        if (iK == -1) {
                            iK = minimumWidth;
                        }
                        flexItem2.setMinWidth(iK);
                        if (iJ0 == -1) {
                            iJ0 = minimumHeight;
                        }
                        flexItem2.S(iJ0);
                    }
                    FlexItem flexItem3 = (FlexItem) viewT.getLayoutParams();
                    if (flexItem3.I() == 4) {
                        flexLine.f19037n.add(Integer.valueOf(i12));
                    }
                    int width = zX ? flexItem3.getWidth() : flexItem3.getHeight();
                    if (flexItem3.U() != -1.0f && mode == 1073741824) {
                        width = Math.round(size * flexItem3.U());
                    }
                    if (zX) {
                        iQ = flexboxLayoutManager.r(i11, i14 + flexItem3.s0() + flexItem3.G0(), width);
                        int iQ2 = flexboxLayoutManager.q(i3, i8 + paddingBottom + flexItem3.P() + flexItem3.q0() + i16, flexItem3.getHeight());
                        viewT.measure(iQ, iQ2);
                        q(i12, iQ, iQ2, viewT);
                    } else {
                        int iR = flexboxLayoutManager.r(i3, i8 + paddingBottom + flexItem3.s0() + flexItem3.G0() + i16, flexItem3.getWidth());
                        iQ = flexboxLayoutManager.q(i11, i14 + flexItem3.P() + flexItem3.q0(), width);
                        viewT.measure(iR, iQ);
                        q(i12, iR, iQ, viewT);
                    }
                    flexboxLayoutManager.F(i12, viewT);
                    b(i12, viewT);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewT.getMeasuredState());
                    int i17 = flexLine.f19033e;
                    int measuredWidth = (zX ? viewT.getMeasuredWidth() : viewT.getMeasuredHeight()) + (zX ? flexItem3.s0() : flexItem3.P()) + (zX ? flexItem3.G0() : flexItem3.q0());
                    int size2 = arrayList.size();
                    if (flexboxLayoutManager.f19045Y != 0) {
                        if (flexItem3.Y()) {
                            flexItem = flexItem3;
                        } else {
                            if (mode == 0) {
                                flexItem = flexItem3;
                            } else {
                                int i18 = flexboxLayoutManager.e0;
                                flexItem = flexItem3;
                                if (i18 == -1 || i18 > size2 + 1) {
                                    if (flexboxLayoutManager.x()) {
                                        topDecorationHeight = flexboxLayoutManager.getLeftDecorationWidth(viewT);
                                        bottomDecorationHeight = flexboxLayoutManager.getRightDecorationWidth(viewT);
                                    } else {
                                        topDecorationHeight = flexboxLayoutManager.getTopDecorationHeight(viewT);
                                        bottomDecorationHeight = flexboxLayoutManager.getBottomDecorationHeight(viewT);
                                    }
                                    int i19 = bottomDecorationHeight + topDecorationHeight;
                                    if (i19 > 0) {
                                        measuredWidth += i19;
                                    }
                                    if (size < i17 + measuredWidth) {
                                    }
                                }
                            }
                            i14 = i14;
                            flexLine.f19034h += i13;
                            i9 = i15;
                        }
                        if (flexLine.a() > 0) {
                            int i20 = i12 > 0 ? i12 - 1 : 0;
                            flexLine.m = i16;
                            flexLine.f19038p = i20;
                            arrayList.add(flexLine);
                            i16 += flexLine.g;
                        }
                        if (zX) {
                            if (flexItem.getHeight() == -1) {
                                viewT.measure(iQ, flexboxLayoutManager.q(i3, flexboxLayoutManager.getPaddingTop() + flexboxLayoutManager.getPaddingBottom() + flexItem.P() + flexItem.q0() + i16, flexItem.getHeight()));
                                b(i12, viewT);
                            }
                        } else if (flexItem.getWidth() == -1) {
                            viewT.measure(flexboxLayoutManager.r(i3, flexboxLayoutManager.getPaddingLeft() + flexboxLayoutManager.getPaddingRight() + flexItem.s0() + flexItem.G0() + i16, flexItem.getWidth()), iQ);
                            b(i12, viewT);
                        }
                        flexLine = new FlexLine();
                        flexLine.f19034h = i13;
                        i14 = i14;
                        flexLine.f19033e = i14;
                        flexLine.o = i12;
                        i9 = Integer.MIN_VALUE;
                    } else {
                        flexItem = flexItem3;
                        i14 = i14;
                        flexLine.f19034h += i13;
                        i9 = i15;
                    }
                    flexLine.q |= flexItem.T() != 0.0f;
                    flexLine.r |= flexItem.J() != 0.0f;
                    int[] iArr = this.f19041c;
                    if (iArr != null) {
                        iArr[i12] = arrayList.size();
                    }
                    flexLine.f19033e = (zX ? viewT.getMeasuredWidth() : viewT.getMeasuredHeight()) + (zX ? flexItem.s0() : flexItem.P()) + (zX ? flexItem.G0() : flexItem.q0()) + flexLine.f19033e;
                    flexLine.j += flexItem.T();
                    flexLine.k += flexItem.J();
                    flexboxLayoutManager.calculateItemDecorationsForChild(viewT, FlexboxLayoutManager.z0);
                    if (flexboxLayoutManager.x()) {
                        int rightDecorationWidth = flexboxLayoutManager.getRightDecorationWidth(viewT) + flexboxLayoutManager.getLeftDecorationWidth(viewT);
                        flexLine.f19033e += rightDecorationWidth;
                        flexLine.f += rightDecorationWidth;
                    } else {
                        int bottomDecorationHeight2 = flexboxLayoutManager.getBottomDecorationHeight(viewT) + flexboxLayoutManager.getTopDecorationHeight(viewT);
                        flexLine.f19033e += bottomDecorationHeight2;
                        flexLine.f += bottomDecorationHeight2;
                    }
                    int iMax = Math.max(i9, flexboxLayoutManager.s(viewT) + (zX ? viewT.getMeasuredHeight() : viewT.getMeasuredWidth()) + (zX ? flexItem.P() : flexItem.s0()) + (zX ? flexItem.q0() : flexItem.G0()));
                    flexLine.g = Math.max(flexLine.g, iMax);
                    if (zX) {
                        if (flexboxLayoutManager.f19045Y != 2) {
                            flexLine.f19036l = Math.max(flexLine.f19036l, viewT.getBaseline() + flexItem.P());
                        } else {
                            flexLine.f19036l = Math.max(flexLine.f19036l, (viewT.getMeasuredHeight() - viewT.getBaseline()) + flexItem.q0());
                        }
                    }
                    if (i12 == i7 - 1 && flexLine.a() != 0) {
                        flexLine.m = i16;
                        flexLine.f19038p = i12;
                        arrayList.add(flexLine);
                        i16 += flexLine.g;
                    }
                    if (i6 == -1 || arrayList.size() <= 0) {
                        i10 = 1;
                    } else {
                        i10 = 1;
                        if (((FlexLine) androidx.media3.extractor.text.ttml.a.h(1, arrayList)).f19038p >= i6 && i12 >= i6 && !z4) {
                            i16 = -flexLine.g;
                            z2 = true;
                        }
                        if (i16 <= i4 && z2) {
                            return;
                        } else {
                            i15 = iMax;
                        }
                    }
                    z2 = z4;
                    if (i16 <= i4) {
                    }
                    i15 = iMax;
                }
                i12++;
                i11 = i2;
                i13 = i10;
                z3 = z2;
                iB = i7;
                paddingTop = i8;
            }
            z2 = z4;
            i10 = i13;
            i12++;
            i11 = i2;
            i13 = i10;
            z3 = z2;
            iB = i7;
            paddingTop = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void b(int i2, View view) {
        boolean z2;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z3 = true;
        if (measuredWidth >= flexItem.K()) {
            if (measuredWidth > flexItem.c0()) {
                measuredWidth = flexItem.c0();
            } else {
                z2 = false;
            }
            if (measuredHeight < flexItem.J0()) {
                measuredHeight = flexItem.J0();
            } else if (measuredHeight > flexItem.L0()) {
                measuredHeight = flexItem.L0();
            } else {
                z3 = z2;
            }
            if (z3) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                q(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f19039a.F(i2, view);
            }
        }
        measuredWidth = flexItem.K();
        z2 = true;
        if (measuredHeight < flexItem.J0()) {
            measuredHeight = flexItem.J0();
        } else if (measuredHeight > flexItem.L0()) {
            measuredHeight = flexItem.L0();
        } else {
            z3 = z2;
        }
        if (z3) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            q(i2, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f19039a.F(i2, view);
        }
    }

    public final void c(int i2, List list) {
        int i3 = this.f19041c[i2];
        if (i3 == -1) {
            i3 = 0;
        }
        for (int size = list.size() - 1; size >= i3; size--) {
            list.remove(size);
        }
        int[] iArr = this.f19041c;
        int length = iArr.length - 1;
        if (i2 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i2, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i2 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i2, length2, 0L);
        }
    }

    public final void d(int i2, int i3, int i4) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        int iB = flexboxLayoutManager.k0.b();
        boolean[] zArr = this.f19040b;
        if (zArr == null) {
            if (iB < 10) {
                iB = 10;
            }
            this.f19040b = new boolean[iB];
        } else if (zArr.length < iB) {
            int length = zArr.length * 2;
            if (length >= iB) {
                iB = length;
            }
            this.f19040b = new boolean[iB];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i4 >= flexboxLayoutManager.k0.b()) {
            return;
        }
        int i7 = flexboxLayoutManager.X;
        if (i7 == 0 || i7 == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            int iU = flexboxLayoutManager.u();
            if (mode != 1073741824 && iU <= size) {
                size = iU;
            }
            paddingLeft = flexboxLayoutManager.getPaddingLeft();
            paddingRight = flexboxLayoutManager.getPaddingRight();
        } else {
            if (i7 != 2 && i7 != 3) {
                throw new IllegalArgumentException(a.h(i7, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
            if (mode2 != 1073741824) {
                size = flexboxLayoutManager.u();
            }
            paddingLeft = flexboxLayoutManager.getPaddingTop();
            paddingRight = flexboxLayoutManager.getPaddingBottom();
        }
        int i8 = paddingLeft + paddingRight;
        int i9 = size;
        int[] iArr = this.f19041c;
        int i10 = iArr != null ? iArr[i4] : 0;
        List list = flexboxLayoutManager.h0;
        int size2 = list.size();
        while (i10 < size2) {
            FlexLine flexLine = (FlexLine) list.get(i10);
            int i11 = flexLine.f19033e;
            if (i11 >= i9 || !flexLine.q) {
                i5 = i2;
                i6 = i3;
                if (i11 > i9 && flexLine.r) {
                    m(i5, i6, flexLine, i9, i8, false);
                }
            } else {
                i5 = i2;
                i6 = i3;
                h(i5, i6, flexLine, i9, i8, false);
            }
            i10++;
            i2 = i5;
            i3 = i6;
        }
    }

    public final void e(int i2) {
        int[] iArr = this.f19041c;
        if (iArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f19041c = new int[i2];
        } else if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f19041c = Arrays.copyOf(iArr, i2);
        }
    }

    public final void f(int i2) {
        long[] jArr = this.d;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.d = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.d = Arrays.copyOf(jArr, i2);
        }
    }

    public final void g(int i2) {
        long[] jArr = this.f19042e;
        if (jArr == null) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f19042e = new long[i2];
        } else if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (length >= i2) {
                i2 = length;
            }
            this.f19042e = Arrays.copyOf(jArr, i2);
        }
    }

    public final void h(int i2, int i3, FlexLine flexLine, int i4, int i5, boolean z2) {
        int i6;
        float f;
        float f2;
        int iMax;
        double d;
        double d2;
        float f3 = flexLine.j;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i4 < (i6 = flexLine.f19033e)) {
            return;
        }
        float f5 = (i4 - i6) / f3;
        flexLine.f19033e = i5 + flexLine.f;
        if (!z2) {
            flexLine.g = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z3 = false;
        int i8 = 0;
        float f6 = 0.0f;
        while (i7 < flexLine.f19034h) {
            int i9 = flexLine.o + i7;
            FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
            View viewT = flexboxLayoutManager.t(i9);
            if (viewT == null || viewT.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z3 = z3;
            } else {
                FlexItem flexItem = (FlexItem) viewT.getLayoutParams();
                int i10 = flexboxLayoutManager.X;
                f = f4;
                if (i10 == 0 || i10 == 1) {
                    f2 = f5;
                    boolean z4 = z3;
                    int measuredWidth = viewT.getMeasuredWidth();
                    long[] jArr = this.f19042e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = viewT.getMeasuredHeight();
                    long[] jArr2 = this.f19042e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i9] >> 32);
                    }
                    if (this.f19040b[i9] || flexItem.T() <= f) {
                        z3 = z4;
                    } else {
                        float fT = (flexItem.T() * f2) + measuredWidth;
                        if (i7 == flexLine.f19034h - 1) {
                            fT += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fT);
                        if (iRound > flexItem.c0()) {
                            iRound = flexItem.c0();
                            this.f19040b[i9] = true;
                            flexLine.j -= flexItem.T();
                            z3 = true;
                        } else {
                            float f7 = (fT - iRound) + f6;
                            double d3 = f7;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d = d3 + 1.0d;
                                }
                                f6 = f7;
                                z3 = z4;
                            }
                            f7 = (float) d;
                            f6 = f7;
                            z3 = z4;
                        }
                        int i11 = i(i3, flexItem, flexLine.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewT.measure(iMakeMeasureSpec, i11);
                        int measuredWidth2 = viewT.getMeasuredWidth();
                        int measuredHeight2 = viewT.getMeasuredHeight();
                        q(i9, iMakeMeasureSpec, i11, viewT);
                        flexboxLayoutManager.F(i9, viewT);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, flexboxLayoutManager.s(viewT) + measuredHeight + flexItem.P() + flexItem.q0());
                    flexLine.f19033e = measuredWidth + flexItem.s0() + flexItem.G0() + flexLine.f19033e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewT.getMeasuredHeight();
                    long[] jArr3 = this.f19042e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i9] >> 32);
                    }
                    int measuredWidth3 = viewT.getMeasuredWidth();
                    long[] jArr4 = this.f19042e;
                    f2 = f5;
                    boolean z5 = z3;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (this.f19040b[i9] || flexItem.T() <= f) {
                        z3 = z5;
                    } else {
                        float fT2 = (flexItem.T() * f2) + measuredHeight3;
                        if (i7 == flexLine.f19034h - 1) {
                            fT2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fT2);
                        if (iRound2 > flexItem.L0()) {
                            iRound2 = flexItem.L0();
                            this.f19040b[i9] = true;
                            flexLine.j -= flexItem.T();
                            z3 = true;
                        } else {
                            float f8 = (fT2 - iRound2) + f6;
                            double d4 = f8;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                }
                                f6 = f8;
                                z3 = z5;
                            }
                            f8 = (float) d2;
                            f6 = f8;
                            z3 = z5;
                        }
                        int iJ = j(i2, flexItem, flexLine.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewT.measure(iJ, iMakeMeasureSpec2);
                        measuredWidth3 = viewT.getMeasuredWidth();
                        int measuredHeight4 = viewT.getMeasuredHeight();
                        q(i9, iJ, iMakeMeasureSpec2, viewT);
                        flexboxLayoutManager.F(i9, viewT);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, flexboxLayoutManager.s(viewT) + measuredWidth3 + flexItem.s0() + flexItem.G0());
                    flexLine.f19033e = measuredHeight3 + flexItem.P() + flexItem.q0() + flexLine.f19033e;
                }
                flexLine.g = Math.max(flexLine.g, iMax);
                i8 = iMax;
            }
            i7++;
            f4 = f;
            f5 = f2;
        }
        if (!z3 || i6 == flexLine.f19033e) {
            return;
        }
        h(i2, i3, flexLine, i4, i5, true);
    }

    public final int i(int i2, FlexItem flexItem, int i3) {
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        int iQ = flexboxLayoutManager.q(i2, flexboxLayoutManager.getPaddingTop() + flexboxLayoutManager.getPaddingBottom() + flexItem.P() + flexItem.q0() + i3, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iQ);
        if (size > flexItem.L0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.L0(), View.MeasureSpec.getMode(iQ));
        }
        return size < flexItem.J0() ? View.MeasureSpec.makeMeasureSpec(flexItem.J0(), View.MeasureSpec.getMode(iQ)) : iQ;
    }

    public final int j(int i2, FlexItem flexItem, int i3) {
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        int iR = flexboxLayoutManager.r(i2, flexboxLayoutManager.getPaddingLeft() + flexboxLayoutManager.getPaddingRight() + flexItem.s0() + flexItem.G0() + i3, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iR);
        if (size > flexItem.c0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.c0(), View.MeasureSpec.getMode(iR));
        }
        return size < flexItem.K() ? View.MeasureSpec.makeMeasureSpec(flexItem.K(), View.MeasureSpec.getMode(iR)) : iR;
    }

    public final void k(View view, FlexLine flexLine, int i2, int i3, int i4, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        int I2 = flexboxLayoutManager.Z;
        if (flexItem.I() != -1) {
            I2 = flexItem.I();
        }
        int i6 = flexLine.g;
        if (I2 != 0) {
            if (I2 == 1) {
                if (flexboxLayoutManager.f19045Y != 2) {
                    int i7 = i3 + i6;
                    view.layout(i2, (i7 - view.getMeasuredHeight()) - flexItem.q0(), i4, i7 - flexItem.q0());
                    return;
                } else {
                    view.layout(i2, view.getMeasuredHeight() + (i3 - i6) + flexItem.P(), i4, view.getMeasuredHeight() + (i5 - i6) + flexItem.P());
                    return;
                }
            }
            if (I2 == 2) {
                int measuredHeight = (((i6 - view.getMeasuredHeight()) + flexItem.P()) - flexItem.q0()) / 2;
                if (flexboxLayoutManager.f19045Y != 2) {
                    int i8 = i3 + measuredHeight;
                    view.layout(i2, i8, i4, view.getMeasuredHeight() + i8);
                    return;
                } else {
                    int i9 = i3 - measuredHeight;
                    view.layout(i2, i9, i4, view.getMeasuredHeight() + i9);
                    return;
                }
            }
            if (I2 == 3) {
                if (flexboxLayoutManager.f19045Y != 2) {
                    int iMax = Math.max(flexLine.f19036l - view.getBaseline(), flexItem.P());
                    view.layout(i2, i3 + iMax, i4, i5 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (flexLine.f19036l - view.getMeasuredHeight()), flexItem.q0());
                    view.layout(i2, i3 - iMax2, i4, i5 - iMax2);
                    return;
                }
            }
            if (I2 != 4) {
                return;
            }
        }
        if (flexboxLayoutManager.f19045Y != 2) {
            view.layout(i2, i3 + flexItem.P(), i4, i5 + flexItem.P());
        } else {
            view.layout(i2, i3 - flexItem.q0(), i4, i5 - flexItem.q0());
        }
    }

    public final void l(View view, FlexLine flexLine, boolean z2, int i2, int i3, int i4, int i5) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int I2 = this.f19039a.Z;
        if (flexItem.I() != -1) {
            I2 = flexItem.I();
        }
        int i6 = flexLine.g;
        if (I2 != 0) {
            if (I2 == 1) {
                if (!z2) {
                    view.layout(((i2 + i6) - view.getMeasuredWidth()) - flexItem.G0(), i3, ((i4 + i6) - view.getMeasuredWidth()) - flexItem.G0(), i5);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i2 - i6) + flexItem.s0(), i3, view.getMeasuredWidth() + (i4 - i6) + flexItem.s0(), i5);
                return;
            }
            if (I2 == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i6 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z2) {
                    view.layout(i2 - marginStart, i3, i4 - marginStart, i5);
                    return;
                } else {
                    view.layout(i2 + marginStart, i3, i4 + marginStart, i5);
                    return;
                }
            }
            if (I2 != 3 && I2 != 4) {
                return;
            }
        }
        if (z2) {
            view.layout(i2 - flexItem.G0(), i3, i4 - flexItem.G0(), i5);
        } else {
            view.layout(i2 + flexItem.s0(), i3, i4 + flexItem.s0(), i5);
        }
    }

    public final void m(int i2, int i3, FlexLine flexLine, int i4, int i5, boolean z2) {
        float f;
        int iMax;
        int i6 = flexLine.f19033e;
        float f2 = flexLine.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i4 > i6) {
            return;
        }
        float f4 = (i6 - i4) / f2;
        flexLine.f19033e = i5 + flexLine.f;
        if (!z2) {
            flexLine.g = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z3 = false;
        int i8 = 0;
        float f5 = 0.0f;
        while (i7 < flexLine.f19034h) {
            int i9 = flexLine.o + i7;
            FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
            View viewT = flexboxLayoutManager.t(i9);
            if (viewT == null || viewT.getVisibility() == 8) {
                f = f3;
            } else {
                FlexItem flexItem = (FlexItem) viewT.getLayoutParams();
                int i10 = flexboxLayoutManager.X;
                f = f3;
                if (i10 == 0 || i10 == 1) {
                    int measuredWidth = viewT.getMeasuredWidth();
                    long[] jArr = this.f19042e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = viewT.getMeasuredHeight();
                    long[] jArr2 = this.f19042e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i9] >> 32);
                    }
                    if (!this.f19040b[i9] && flexItem.J() > f) {
                        float fJ = measuredWidth - (flexItem.J() * f4);
                        if (i7 == flexLine.f19034h - 1) {
                            fJ += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fJ);
                        if (iRound < flexItem.K()) {
                            iRound = flexItem.K();
                            this.f19040b[i9] = true;
                            flexLine.k -= flexItem.J();
                            z3 = true;
                        } else {
                            float f6 = (fJ - iRound) + f5;
                            double d = f6;
                            if (d > 1.0d) {
                                iRound++;
                                f6 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f6 += 1.0f;
                            }
                            f5 = f6;
                        }
                        int i11 = i(i3, flexItem, flexLine.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewT.measure(iMakeMeasureSpec, i11);
                        int measuredWidth2 = viewT.getMeasuredWidth();
                        int measuredHeight2 = viewT.getMeasuredHeight();
                        q(i9, iMakeMeasureSpec, i11, viewT);
                        flexboxLayoutManager.F(i9, viewT);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, flexboxLayoutManager.s(viewT) + measuredHeight + flexItem.P() + flexItem.q0());
                    flexLine.f19033e = measuredWidth + flexItem.s0() + flexItem.G0() + flexLine.f19033e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewT.getMeasuredHeight();
                    long[] jArr3 = this.f19042e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i9] >> 32);
                    }
                    int measuredWidth3 = viewT.getMeasuredWidth();
                    long[] jArr4 = this.f19042e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (!this.f19040b[i9] && flexItem.J() > f) {
                        float fJ2 = measuredHeight3 - (flexItem.J() * f4);
                        if (i7 == flexLine.f19034h - 1) {
                            fJ2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fJ2);
                        if (iRound2 < flexItem.J0()) {
                            iRound2 = flexItem.J0();
                            this.f19040b[i9] = true;
                            flexLine.k -= flexItem.J();
                            z3 = true;
                        } else {
                            float f7 = (fJ2 - iRound2) + f5;
                            double d2 = f7;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f7 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f7 += 1.0f;
                            }
                            f5 = f7;
                        }
                        int iJ = j(i2, flexItem, flexLine.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewT.measure(iJ, iMakeMeasureSpec2);
                        measuredWidth3 = viewT.getMeasuredWidth();
                        int measuredHeight4 = viewT.getMeasuredHeight();
                        q(i9, iJ, iMakeMeasureSpec2, viewT);
                        flexboxLayoutManager.F(i9, viewT);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, flexboxLayoutManager.s(viewT) + measuredWidth3 + flexItem.s0() + flexItem.G0());
                    flexLine.f19033e = measuredHeight3 + flexItem.P() + flexItem.q0() + flexLine.f19033e;
                }
                flexLine.g = Math.max(flexLine.g, iMax);
                i8 = iMax;
            }
            i7++;
            f3 = f;
        }
        if (!z3 || i6 == flexLine.f19033e) {
            return;
        }
        m(i2, i3, flexLine, i4, i5, true);
    }

    public final void n(int i2, int i3, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iS0 = (i2 - flexItem.s0()) - flexItem.G0();
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        int iMin = Math.min(Math.max(iS0 - flexboxLayoutManager.s(view), flexItem.K()), flexItem.c0());
        long[] jArr = this.f19042e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i3] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        q(i3, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        flexboxLayoutManager.F(i3, view);
    }

    public final void o(int i2, int i3, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iP = (i2 - flexItem.P()) - flexItem.q0();
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        int iMin = Math.min(Math.max(iP - flexboxLayoutManager.s(view), flexItem.J0()), flexItem.L0());
        long[] jArr = this.f19042e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i3] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        q(i3, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        flexboxLayoutManager.F(i3, view);
    }

    public final void p(int i2) {
        View viewT;
        FlexboxLayoutManager flexboxLayoutManager = this.f19039a;
        if (i2 >= flexboxLayoutManager.k0.b()) {
            return;
        }
        int i3 = flexboxLayoutManager.X;
        if (flexboxLayoutManager.Z != 4) {
            for (FlexLine flexLine : flexboxLayoutManager.h0) {
                for (Integer num : flexLine.f19037n) {
                    View viewT2 = flexboxLayoutManager.t(num.intValue());
                    if (i3 == 0 || i3 == 1) {
                        o(flexLine.g, num.intValue(), viewT2);
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            throw new IllegalArgumentException(a.h(i3, "Invalid flex direction: "));
                        }
                        n(flexLine.g, num.intValue(), viewT2);
                    }
                }
            }
            return;
        }
        int[] iArr = this.f19041c;
        List list = flexboxLayoutManager.h0;
        int size = list.size();
        for (int i4 = iArr != null ? iArr[i2] : 0; i4 < size; i4++) {
            FlexLine flexLine2 = (FlexLine) list.get(i4);
            int i5 = flexLine2.f19034h;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = flexLine2.o + i6;
                if (i6 < flexboxLayoutManager.k0.b() && (viewT = flexboxLayoutManager.t(i7)) != null && viewT.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewT.getLayoutParams();
                    if (flexItem.I() == -1 || flexItem.I() == 4) {
                        if (i3 == 0 || i3 == 1) {
                            o(flexLine2.g, i7, viewT);
                        } else {
                            if (i3 != 2 && i3 != 3) {
                                throw new IllegalArgumentException(a.h(i3, "Invalid flex direction: "));
                            }
                            n(flexLine2.g, i7, viewT);
                        }
                    }
                }
            }
        }
    }

    public final void q(int i2, int i3, int i4, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i2] = (((long) i3) & 4294967295L) | (((long) i4) << 32);
        }
        long[] jArr2 = this.f19042e;
        if (jArr2 != null) {
            jArr2[i2] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
