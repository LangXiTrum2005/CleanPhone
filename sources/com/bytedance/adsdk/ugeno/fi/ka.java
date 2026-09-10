package com.bytedance.adsdk.ugeno.fi;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class ka {
    static final /* synthetic */ boolean ik = true;
    private long[] di;
    private boolean[] fi;
    private final com.bytedance.adsdk.ugeno.fi.ri ka;
    long[] lr;
    int[] ri;

    public static class lr implements Comparable<lr> {
        int lr;
        int ri;

        private lr() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public int compareTo(lr lrVar) {
            int i = this.lr;
            int i2 = lrVar.lr;
            return i != i2 ? i - i2 : this.ri - lrVar.ri;
        }

        public String toString() {
            return "Order{order=" + this.lr + ", index=" + this.ri + '}';
        }
    }

    public static class ri {
        int lr;
        List<ik> ri;

        public void ri() {
            this.ri = null;
            this.lr = 0;
        }
    }

    public ka(com.bytedance.adsdk.ugeno.fi.ri riVar) {
        this.ka = riVar;
    }

    private int di(com.bytedance.adsdk.ugeno.fi.lr lrVar, boolean z) {
        return z ? lrVar.slm() : lrVar.vr();
    }

    private int fi(com.bytedance.adsdk.ugeno.fi.lr lrVar, boolean z) {
        return z ? lrVar.bgr() : lrVar.aw();
    }

    private int ik(boolean z) {
        return z ? this.ka.getPaddingTop() : this.ka.getPaddingStart();
    }

    private int ka(boolean z) {
        return z ? this.ka.getPaddingBottom() : this.ka.getPaddingEnd();
    }

    public int lr(long j) {
        return (int) (j >> 32);
    }

    public int ri(long j) {
        return (int) j;
    }

    public long lr(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] ri(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.ka.getFlexItemCount();
        List<lr> listLr = lr(flexItemCount);
        lr lrVar = new lr();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.fi.lr)) {
            lrVar.lr = 1;
        } else {
            lrVar.lr = ((com.bytedance.adsdk.ugeno.fi.lr) layoutParams).ik();
        }
        if (i == -1 || i == flexItemCount || i >= this.ka.getFlexItemCount()) {
            lrVar.ri = flexItemCount;
        } else {
            lrVar.ri = i;
            while (i < flexItemCount) {
                listLr.get(i).ri++;
                i++;
            }
        }
        listLr.add(lrVar);
        return ri(flexItemCount + 1, listLr, sparseIntArray);
    }

    private int ik(com.bytedance.adsdk.ugeno.fi.lr lrVar, boolean z) {
        if (z) {
            return lrVar.aw();
        }
        return lrVar.bgr();
    }

    private int ka(com.bytedance.adsdk.ugeno.fi.lr lrVar, boolean z) {
        if (z) {
            return lrVar.vr();
        }
        return lrVar.slm();
    }

    private List<lr> lr(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) this.ka.ri(i2).getLayoutParams();
            lr lrVar2 = new lr();
            lrVar2.lr = lrVar.ik();
            lrVar2.ri = i2;
            arrayList.add(lrVar2);
        }
        return arrayList;
    }

    private void ik(int i) {
        boolean[] zArr = this.fi;
        if (zArr == null) {
            this.fi = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.fi = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean lr(SparseIntArray sparseIntArray) {
        int flexItemCount = this.ka.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewRi = this.ka.ri(i);
            if (viewRi != null && ((com.bytedance.adsdk.ugeno.fi.lr) viewRi.getLayoutParams()).ik() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void lr(ri riVar, int i, int i2) {
        ri(riVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<ik>) null);
    }

    private int lr(boolean z) {
        if (z) {
            return this.ka.getPaddingEnd();
        }
        return this.ka.getPaddingBottom();
    }

    public int[] ri(SparseIntArray sparseIntArray) {
        int flexItemCount = this.ka.getFlexItemCount();
        return ri(flexItemCount, lr(flexItemCount), sparseIntArray);
    }

    private int lr(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] ri(int i, List<lr> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (lr lrVar : list) {
            int i3 = lrVar.ri;
            iArr[i2] = i3;
            sparseIntArray.append(i3, lrVar.lr);
            i2++;
        }
        return iArr;
    }

    private int lr(com.bytedance.adsdk.ugeno.fi.lr lrVar, boolean z) {
        if (z) {
            return lrVar.lr();
        }
        return lrVar.ri();
    }

    private void lr(int i, int i2, ik ikVar, int i3, int i4, boolean z) {
        float f;
        float f2;
        int iMax;
        int iXha;
        int i5 = ikVar.fi;
        float f3 = ikVar.sf;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 > i5) {
            return;
        }
        float f5 = (i5 - i3) / f3;
        ikVar.fi = i4 + ikVar.di;
        if (!z) {
            ikVar.xha = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < ikVar.mj) {
            int i8 = ikVar.vr + i6;
            View viewLr = this.ka.lr(i8);
            if (viewLr == null || viewLr.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) viewLr.getLayoutParams();
                int flexDirection = this.ka.getFlexDirection();
                f = f4;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewLr.getMeasuredHeight();
                    long[] jArr = this.di;
                    if (jArr != null) {
                        measuredHeight = lr(jArr[i8]);
                    }
                    int measuredWidth = viewLr.getMeasuredWidth();
                    long[] jArr2 = this.di;
                    if (jArr2 != null) {
                        measuredWidth = ri(jArr2[i8]);
                    }
                    if (!this.fi[i8] && lrVar.fi() > f) {
                        float fFi = measuredHeight - (lrVar.fi() * f5);
                        if (i6 == ikVar.mj - 1) {
                            fFi += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fFi);
                        if (iRound < lrVar.mj()) {
                            iRound = lrVar.mj();
                            this.fi[i8] = true;
                            ikVar.sf -= lrVar.fi();
                            z2 = true;
                        } else {
                            f6 += fFi - iRound;
                            double d = f6;
                            if (d > 1.0d) {
                                iRound++;
                                f6 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f6 += 1.0f;
                            }
                        }
                        int iRi = ri(i, lrVar, ikVar.aw);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewLr.measure(iRi, iMakeMeasureSpec);
                        int measuredWidth2 = viewLr.getMeasuredWidth();
                        int measuredHeight2 = viewLr.getMeasuredHeight();
                        ri(i8, iRi, iMakeMeasureSpec, viewLr);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i7, measuredWidth + lrVar.aw() + lrVar.vr() + this.ka.ri(viewLr));
                    ikVar.fi += measuredHeight + lrVar.bgr() + lrVar.slm();
                    f2 = f5;
                } else {
                    int measuredWidth3 = viewLr.getMeasuredWidth();
                    long[] jArr3 = this.di;
                    if (jArr3 != null) {
                        measuredWidth3 = ri(jArr3[i8]);
                    }
                    int measuredHeight3 = viewLr.getMeasuredHeight();
                    long[] jArr4 = this.di;
                    f2 = f5;
                    if (jArr4 != null) {
                        measuredHeight3 = lr(jArr4[i8]);
                    }
                    if (!this.fi[i8] && lrVar.fi() > f) {
                        float fFi2 = measuredWidth3 - (f2 * lrVar.fi());
                        if (i6 == ikVar.mj - 1) {
                            fFi2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fFi2);
                        if (iRound2 < lrVar.xha()) {
                            iXha = lrVar.xha();
                            this.fi[i8] = true;
                            ikVar.sf -= lrVar.fi();
                            z2 = true;
                        } else {
                            f6 += fFi2 - iRound2;
                            double d2 = f6;
                            if (d2 > 1.0d) {
                                iXha = iRound2 + 1;
                                f6 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iXha = iRound2 - 1;
                                f6 += 1.0f;
                            } else {
                                iXha = iRound2;
                            }
                        }
                        int iLr = lr(i2, lrVar, ikVar.aw);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iXha, 1073741824);
                        viewLr.measure(iMakeMeasureSpec2, iLr);
                        int measuredWidth4 = viewLr.getMeasuredWidth();
                        int measuredHeight4 = viewLr.getMeasuredHeight();
                        ri(i8, iMakeMeasureSpec2, iLr, viewLr);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i7, measuredHeight3 + lrVar.bgr() + lrVar.slm() + this.ka.ri(viewLr));
                    ikVar.fi += measuredWidth3 + lrVar.aw() + lrVar.vr();
                    iMax = iMax2;
                }
                ikVar.xha = Math.max(ikVar.xha, iMax);
                i7 = iMax;
            }
            i6++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i5 == ikVar.fi) {
            return;
        }
        lr(i, i2, ikVar, i3, i4, true);
    }

    public void ri(ri riVar, int i, int i2) {
        ri(riVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<ik>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void ri(ri riVar, int i, int i2, int i3, int i4, int i5, List<ik> list) {
        int i6;
        int i7;
        int i8;
        int i9;
        int iRi;
        int i10;
        int i11;
        int i12;
        ik ikVar;
        int i13;
        int i14;
        boolean z;
        int i15;
        boolean z2;
        int i16;
        int i17 = i;
        boolean zRi = this.ka.ri();
        int mode = View.MeasureSpec.getMode(i17);
        int size = View.MeasureSpec.getSize(i17);
        List<ik> arrayList = list == null ? new ArrayList() : list;
        riVar.ri = arrayList;
        boolean z3 = i5 == -1;
        int iRi2 = ri(zRi);
        int iLr = lr(zRi);
        int iIk = ik(zRi);
        int iKa = ka(zRi);
        ik ikVar2 = new ik();
        int i18 = i4;
        ikVar2.vr = i18;
        int i19 = iRi2 + iLr;
        ikVar2.fi = i19;
        int flexItemCount = this.ka.getFlexItemCount();
        boolean z4 = z3;
        ik ikVar3 = ikVar2;
        int i20 = Integer.MIN_VALUE;
        int i21 = 0;
        int iCombineMeasuredStates = 0;
        int i22 = 0;
        while (i18 < flexItemCount) {
            View viewLr = this.ka.lr(i18);
            if (viewLr == null) {
                if (ri(i18, flexItemCount, ikVar3)) {
                    ri(arrayList, ikVar3, i18, i21);
                }
                i7 = i19;
            } else {
                i7 = i19;
                if (viewLr.getVisibility() == 8) {
                    ikVar3.jbs++;
                    ikVar3.mj++;
                    if (ri(i18, flexItemCount, ikVar3)) {
                        ri(arrayList, ikVar3, i18, i21);
                    }
                } else {
                    if (viewLr instanceof CompoundButton) {
                        ri((CompoundButton) viewLr);
                    }
                    com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) viewLr.getLayoutParams();
                    int i23 = flexItemCount;
                    if (lrVar.di() == 4) {
                        ikVar3.bgr.add(Integer.valueOf(i18));
                    }
                    int iRi3 = ri(lrVar, zRi);
                    if (lrVar.co() != -1.0f && mode == 1073741824) {
                        iRi3 = Math.round(size * lrVar.co());
                    }
                    if (zRi) {
                        iRi = this.ka.ri(i17, i7 + ik(lrVar, true) + ka(lrVar, true), iRi3);
                        i8 = i21;
                        int iLr2 = this.ka.lr(i2, iIk + iKa + fi(lrVar, true) + di(lrVar, true) + i21, lr(lrVar, true));
                        viewLr.measure(iRi, iLr2);
                        ri(i18, iRi, iLr2, viewLr);
                        i9 = 0;
                    } else {
                        i8 = i21;
                        i9 = 0;
                        int iRi4 = this.ka.ri(i2, iIk + iKa + fi(lrVar, false) + di(lrVar, false) + i8, lr(lrVar, false));
                        int iLr3 = this.ka.lr(i17, i7 + ik(lrVar, false) + ka(lrVar, false), iRi3);
                        viewLr.measure(iRi4, iLr3);
                        ri(i18, iRi4, iLr3, viewLr);
                        iRi = iLr3;
                    }
                    ri(viewLr, i18);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewLr.getMeasuredState());
                    int i24 = i9;
                    i10 = i18;
                    int i25 = iRi;
                    ik ikVar4 = ikVar3;
                    int i26 = i22;
                    i11 = i7;
                    i12 = i8;
                    boolean z5 = zRi;
                    size = size;
                    if (ri(viewLr, mode, size, ikVar3.fi, ri(viewLr, zRi) + ik(lrVar, zRi) + ka(lrVar, zRi), lrVar, i10, i26, arrayList.size())) {
                        if (ikVar4.lr() > 0) {
                            ri(arrayList, ikVar4, i10 > 0 ? i10 - 1 : i24, i12);
                            i16 = i12 + ikVar4.xha;
                        } else {
                            i16 = i12;
                        }
                        if (z5) {
                            if (lrVar.lr() == -1) {
                                com.bytedance.adsdk.ugeno.fi.ri riVar2 = this.ka;
                                viewLr.measure(i25, riVar2.lr(i2, riVar2.getPaddingTop() + this.ka.getPaddingBottom() + lrVar.bgr() + lrVar.slm() + i16, lrVar.lr()));
                                ri(viewLr, i10);
                            }
                        } else if (lrVar.ri() == -1) {
                            com.bytedance.adsdk.ugeno.fi.ri riVar3 = this.ka;
                            viewLr.measure(riVar3.ri(i2, riVar3.getPaddingLeft() + this.ka.getPaddingRight() + lrVar.aw() + lrVar.vr() + i16, lrVar.ri()), i25);
                            ri(viewLr, i10);
                        }
                        ik ikVar5 = new ik();
                        ikVar5.mj = 1;
                        ikVar5.fi = i11;
                        ikVar5.vr = i10;
                        i12 = i16;
                        i13 = i24;
                        ikVar = ikVar5;
                        i14 = Integer.MIN_VALUE;
                    } else {
                        ikVar = ikVar4;
                        ikVar.mj++;
                        i13 = i26 + 1;
                        i14 = i20;
                    }
                    ikVar.bu = (ikVar.bu ? 1 : 0) | (lrVar.ka() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i24);
                    ikVar.nr = (ikVar.nr ? 1 : 0) | (lrVar.fi() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i24);
                    int[] iArr = this.ri;
                    if (iArr != null) {
                        iArr[i10] = arrayList.size();
                    }
                    z = z5;
                    ikVar.fi += ri(viewLr, z) + ik(lrVar, z) + ka(lrVar, z);
                    ikVar.qt += lrVar.ka();
                    ikVar.sf += lrVar.fi();
                    this.ka.ri(viewLr, i10, i13, ikVar);
                    int iMax = Math.max(i14, lr(viewLr, z) + fi(lrVar, z) + di(lrVar, z) + this.ka.ri(viewLr));
                    ikVar.xha = Math.max(ikVar.xha, iMax);
                    if (z) {
                        if (this.ka.getFlexWrap() != 2) {
                            ikVar.f18015co = Math.max(ikVar.f18015co, viewLr.getBaseline() + lrVar.bgr());
                        } else {
                            ikVar.f18015co = Math.max(ikVar.f18015co, (viewLr.getMeasuredHeight() - viewLr.getBaseline()) + lrVar.slm());
                        }
                    }
                    i15 = i23;
                    if (ri(i10, i15, ikVar)) {
                        ri(arrayList, ikVar, i10, i12);
                        i12 += ikVar.xha;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).slm >= i5 && i10 >= i5 && !z4) {
                            i12 = -ikVar.ri();
                            z2 = true;
                        }
                        if (i12 <= i3 && z2) {
                            i6 = iCombineMeasuredStates;
                            riVar.lr = i6;
                        } else {
                            i20 = iMax;
                            z4 = z2;
                            i22 = i13;
                        }
                    }
                    z2 = z4;
                    if (i12 <= i3) {
                    }
                    i20 = iMax;
                    z4 = z2;
                    i22 = i13;
                }
                int i27 = i10 + 1;
                zRi = z;
                ikVar3 = ikVar;
                i19 = i11;
                i21 = i12;
                i17 = i;
                flexItemCount = i15;
                i18 = i27;
                mode = mode;
            }
            i10 = i18;
            mode = mode;
            i15 = flexItemCount;
            i12 = i21;
            z = zRi;
            i11 = i7;
            ikVar = ikVar3;
            int i28 = i10 + 1;
            zRi = z;
            ikVar3 = ikVar;
            i19 = i11;
            i21 = i12;
            i17 = i;
            flexItemCount = i15;
            i18 = i28;
            mode = mode;
        }
        i6 = iCombineMeasuredStates;
        riVar.lr = i6;
    }

    private int lr(int i, com.bytedance.adsdk.ugeno.fi.lr lrVar, int i2) {
        com.bytedance.adsdk.ugeno.fi.ri riVar = this.ka;
        int iLr = riVar.lr(i, riVar.getPaddingTop() + this.ka.getPaddingBottom() + lrVar.bgr() + lrVar.slm() + i2, lrVar.lr());
        int size = View.MeasureSpec.getSize(iLr);
        if (size > lrVar.qt()) {
            return View.MeasureSpec.makeMeasureSpec(lrVar.qt(), View.MeasureSpec.getMode(iLr));
        }
        return size < lrVar.mj() ? View.MeasureSpec.makeMeasureSpec(lrVar.mj(), View.MeasureSpec.getMode(iLr)) : iLr;
    }

    public void lr(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.ka.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        } else {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        }
        List<ik> flexLinesInternal = this.ka.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.ka.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).xha = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.ka.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    ik ikVar = new ik();
                    ikVar.xha = i5;
                    flexLinesInternal.add(0, ikVar);
                    return;
                }
                if (alignContent == 2) {
                    this.ka.setFlexLines(ri(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i4 < size4) {
                            arrayList.add(flexLinesInternal.get(i4));
                            if (i4 != flexLinesInternal.size() - 1) {
                                ik ikVar2 = new ik();
                                if (i4 == flexLinesInternal.size() - 2) {
                                    ikVar2.xha = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    ikVar2.xha = Math.round(size3);
                                }
                                int i6 = ikVar2.xha;
                                f += size3 - i6;
                                if (f > 1.0f) {
                                    ikVar2.xha = i6 + 1;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    ikVar2.xha = i6 - 1;
                                    f += 1.0f;
                                }
                                arrayList.add(ikVar2);
                            }
                            i4++;
                        }
                        this.ka.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.ka.setFlexLines(ri(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    ik ikVar3 = new ik();
                    ikVar3.xha = size5;
                    for (ik ikVar4 : flexLinesInternal) {
                        arrayList2.add(ikVar3);
                        arrayList2.add(ikVar4);
                        arrayList2.add(ikVar3);
                    }
                    this.ka.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i4 < size7) {
                        ik ikVar5 = flexLinesInternal.get(i4);
                        float f3 = ikVar5.xha + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int iRound = Math.round(f3);
                        f2 += f3 - iRound;
                        if (f2 > 1.0f) {
                            iRound++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            iRound--;
                            f2 += 1.0f;
                        }
                        ikVar5.xha = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    private void ri(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) compoundButton.getLayoutParams();
        int iXha = lrVar.xha();
        int iMj = lrVar.mj();
        Drawable drawableRi = com.bytedance.adsdk.ugeno.xha.fi.ri(compoundButton);
        int minimumWidth = drawableRi == null ? 0 : drawableRi.getMinimumWidth();
        int minimumHeight = drawableRi != null ? drawableRi.getMinimumHeight() : 0;
        if (iXha == -1) {
            iXha = minimumWidth;
        }
        lrVar.ri(iXha);
        if (iMj == -1) {
            iMj = minimumHeight;
        }
        lrVar.lr(iMj);
    }

    private int ri(boolean z) {
        if (z) {
            return this.ka.getPaddingStart();
        }
        return this.ka.getPaddingTop();
    }

    private int ri(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void lr(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - lrVar.aw()) - lrVar.vr()) - this.ka.ri(view), lrVar.xha()), lrVar.jbs());
        long[] jArr = this.di;
        if (jArr != null) {
            measuredHeight = lr(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        ri(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int ri(com.bytedance.adsdk.ugeno.fi.lr lrVar, boolean z) {
        if (z) {
            return lrVar.ri();
        }
        return lrVar.lr();
    }

    private boolean ri(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.fi.lr lrVar, int i5, int i6, int i7) {
        if (this.ka.getFlexWrap() == 0) {
            return false;
        }
        if (lrVar.sf()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.ka.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iRi = this.ka.ri(view, i5, i6);
        if (iRi > 0) {
            i4 += iRi;
        }
        return i2 < i3 + i4;
    }

    private boolean ri(int i, int i2, ik ikVar) {
        return i == i2 - 1 && ikVar.lr() != 0;
    }

    private void ri(List<ik> list, ik ikVar, int i, int i2) {
        ikVar.aw = i2;
        this.ka.ri(ikVar);
        ikVar.slm = i;
        list.add(ikVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void ri(View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < lrVar.xha()) {
            measuredWidth = lrVar.xha();
        } else {
            if (measuredWidth > lrVar.jbs()) {
                measuredWidth = lrVar.jbs();
            } else {
                z = false;
            }
            if (measuredHeight < lrVar.mj()) {
                measuredHeight = lrVar.mj();
            } else if (measuredHeight > lrVar.qt()) {
                measuredHeight = lrVar.qt();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                ri(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z = true;
        if (measuredHeight < lrVar.mj()) {
            measuredHeight = lrVar.mj();
        } else if (measuredHeight > lrVar.qt()) {
            measuredHeight = lrVar.qt();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            ri(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    public void ri(int i, int i2) {
        ri(i, i2, 0);
    }

    public void ri(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i4;
        int i5;
        ik(this.ka.getFlexItemCount());
        if (i3 >= this.ka.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.ka.getFlexDirection();
        int flexDirection2 = this.ka.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.ka.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.ka.getPaddingLeft();
            paddingRight = this.ka.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.ka.getLargestMainSize();
            }
            paddingLeft = this.ka.getPaddingTop();
            paddingRight = this.ka.getPaddingBottom();
        }
        int i6 = paddingLeft + paddingRight;
        int i7 = size;
        int[] iArr = this.ri;
        int i8 = iArr != null ? iArr[i3] : 0;
        List<ik> flexLinesInternal = this.ka.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            ik ikVar = flexLinesInternal.get(i8);
            int i9 = ikVar.fi;
            if (i9 < i7 && ikVar.bu) {
                i4 = i;
                i5 = i2;
                ri(i4, i5, ikVar, i7, i6, false);
            } else {
                i4 = i;
                i5 = i2;
                if (i9 > i7 && ikVar.nr) {
                    lr(i4, i5, ikVar, i7, i6, false);
                }
            }
            i8++;
            i = i4;
            i2 = i5;
        }
    }

    private void ri(int i, int i2, ik ikVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        int iMax;
        double d;
        double d2;
        float f3 = ikVar.qt;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i3 < (i5 = ikVar.fi)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        ikVar.fi = i4 + ikVar.di;
        if (!z) {
            ikVar.xha = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f6 = 0.0f;
        while (i6 < ikVar.mj) {
            int i8 = ikVar.vr + i6;
            View viewLr = this.ka.lr(i8);
            if (viewLr == null || viewLr.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z2 = z2;
            } else {
                com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) viewLr.getLayoutParams();
                int flexDirection = this.ka.getFlexDirection();
                f = f4;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewLr.getMeasuredHeight();
                    long[] jArr = this.di;
                    if (jArr != null) {
                        measuredHeight = lr(jArr[i8]);
                    }
                    int measuredWidth = viewLr.getMeasuredWidth();
                    long[] jArr2 = this.di;
                    f2 = f5;
                    boolean z3 = z2;
                    if (jArr2 != null) {
                        measuredWidth = ri(jArr2[i8]);
                    }
                    if (this.fi[i8] || lrVar.ka() <= f) {
                        z2 = z3;
                    } else {
                        float fKa = measuredHeight + (lrVar.ka() * f2);
                        if (i6 == ikVar.mj - 1) {
                            fKa += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fKa);
                        if (iRound > lrVar.qt()) {
                            iRound = lrVar.qt();
                            this.fi[i8] = true;
                            ikVar.qt -= lrVar.ka();
                            z2 = true;
                        } else {
                            f6 += fKa - iRound;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                iRound++;
                                d2 = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d2 = d3 + 1.0d;
                                }
                                z2 = z3;
                            }
                            f6 = (float) d2;
                            z2 = z3;
                        }
                        int iRi = ri(i, lrVar, ikVar.aw);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewLr.measure(iRi, iMakeMeasureSpec);
                        int measuredWidth2 = viewLr.getMeasuredWidth();
                        int measuredHeight2 = viewLr.getMeasuredHeight();
                        ri(i8, iRi, iMakeMeasureSpec, viewLr);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i7, measuredWidth + lrVar.aw() + lrVar.vr() + this.ka.ri(viewLr));
                    ikVar.fi += measuredHeight + lrVar.bgr() + lrVar.slm();
                } else {
                    f2 = f5;
                    boolean z4 = z2;
                    int measuredWidth3 = viewLr.getMeasuredWidth();
                    long[] jArr3 = this.di;
                    if (jArr3 != null) {
                        measuredWidth3 = ri(jArr3[i8]);
                    }
                    int measuredHeight3 = viewLr.getMeasuredHeight();
                    long[] jArr4 = this.di;
                    if (jArr4 != null) {
                        measuredHeight3 = lr(jArr4[i8]);
                    }
                    if (this.fi[i8] || lrVar.ka() <= f) {
                        z2 = z4;
                    } else {
                        float fKa2 = measuredWidth3 + (lrVar.ka() * f2);
                        if (i6 == ikVar.mj - 1) {
                            fKa2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fKa2);
                        if (iRound2 > lrVar.jbs()) {
                            iRound2 = lrVar.jbs();
                            this.fi[i8] = true;
                            ikVar.qt -= lrVar.ka();
                            z2 = true;
                        } else {
                            f6 += fKa2 - iRound2;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d = d4 + 1.0d;
                                }
                                z2 = z4;
                            }
                            f6 = (float) d;
                            z2 = z4;
                        }
                        int iLr = lr(i2, lrVar, ikVar.aw);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewLr.measure(iMakeMeasureSpec2, iLr);
                        int measuredWidth4 = viewLr.getMeasuredWidth();
                        int measuredHeight4 = viewLr.getMeasuredHeight();
                        ri(i8, iMakeMeasureSpec2, iLr, viewLr);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i7, measuredHeight3 + lrVar.bgr() + lrVar.slm() + this.ka.ri(viewLr));
                    ikVar.fi += measuredWidth3 + lrVar.aw() + lrVar.vr();
                    iMax = iMax2;
                }
                ikVar.xha = Math.max(ikVar.xha, iMax);
                i7 = iMax;
            }
            i6++;
            f5 = f2;
            f4 = f;
        }
        if (!z2 || i5 == ikVar.fi) {
            return;
        }
        ri(i, i2, ikVar, i3, i4, true);
    }

    private int ri(int i, com.bytedance.adsdk.ugeno.fi.lr lrVar, int i2) {
        com.bytedance.adsdk.ugeno.fi.ri riVar = this.ka;
        int iRi = riVar.ri(i, riVar.getPaddingLeft() + this.ka.getPaddingRight() + lrVar.aw() + lrVar.vr() + i2, lrVar.ri());
        int size = View.MeasureSpec.getSize(iRi);
        if (size > lrVar.jbs()) {
            return View.MeasureSpec.makeMeasureSpec(lrVar.jbs(), View.MeasureSpec.getMode(iRi));
        }
        return size < lrVar.xha() ? View.MeasureSpec.makeMeasureSpec(lrVar.xha(), View.MeasureSpec.getMode(iRi)) : iRi;
    }

    private List<ik> ri(List<ik> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        ik ikVar = new ik();
        ikVar.xha = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(ikVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(ikVar);
            }
        }
        return arrayList;
    }

    public void ri() {
        ri(0);
    }

    public void ri(int i) {
        View viewLr;
        if (i >= this.ka.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.ka.getFlexDirection();
        if (this.ka.getAlignItems() == 4) {
            int[] iArr = this.ri;
            List<ik> flexLinesInternal = this.ka.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                ik ikVar = flexLinesInternal.get(i2);
                int i3 = ikVar.mj;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = ikVar.vr + i4;
                    if (i4 < this.ka.getFlexItemCount() && (viewLr = this.ka.lr(i5)) != null && viewLr.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) viewLr.getLayoutParams();
                        if (lrVar.di() == -1 || lrVar.di() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                lr(viewLr, ikVar.xha, i5);
                            } else {
                                ri(viewLr, ikVar.xha, i5);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (ik ikVar2 : this.ka.getFlexLinesInternal()) {
            for (Integer num : ikVar2.bgr) {
                View viewLr2 = this.ka.lr(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    lr(viewLr2, ikVar2.xha, num.intValue());
                } else {
                    ri(viewLr2, ikVar2.xha, num.intValue());
                }
            }
        }
    }

    private void ri(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - lrVar.bgr()) - lrVar.slm()) - this.ka.ri(view), lrVar.mj()), lrVar.qt());
        long[] jArr = this.di;
        if (jArr != null) {
            measuredWidth = ri(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ri(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void ri(View view, ik ikVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) view.getLayoutParams();
        int alignItems = this.ka.getAlignItems();
        if (lrVar.di() != -1) {
            alignItems = lrVar.di();
        }
        int i5 = ikVar.xha;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.ka.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - lrVar.slm(), i3, i6 - lrVar.slm());
                    return;
                } else {
                    view.layout(i, (i2 - i5) + view.getMeasuredHeight() + lrVar.bgr(), i3, (i4 - i5) + view.getMeasuredHeight() + lrVar.bgr());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + lrVar.bgr()) - lrVar.slm()) / 2;
                if (this.ka.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.ka.getFlexWrap() != 2) {
                    int iMax = Math.max(ikVar.f18015co - view.getBaseline(), lrVar.bgr());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((ikVar.f18015co - view.getMeasuredHeight()) + view.getBaseline(), lrVar.slm());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.ka.getFlexWrap() != 2) {
            view.layout(i, i2 + lrVar.bgr(), i3, i4 + lrVar.bgr());
        } else {
            view.layout(i, i2 - lrVar.slm(), i3, i4 - lrVar.slm());
        }
    }

    public void ri(View view, ik ikVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.fi.lr lrVar = (com.bytedance.adsdk.ugeno.fi.lr) view.getLayoutParams();
        int alignItems = this.ka.getAlignItems();
        if (lrVar.di() != -1) {
            alignItems = lrVar.di();
        }
        int i5 = ikVar.xha;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - lrVar.vr(), i2, ((i3 + i5) - view.getMeasuredWidth()) - lrVar.vr(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + lrVar.aw(), i2, (i3 - i5) + view.getMeasuredWidth() + lrVar.aw(), i4);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.xha.di.ri(marginLayoutParams)) - com.bytedance.adsdk.ugeno.xha.di.lr(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + lrVar.aw(), i2, i3 + lrVar.aw(), i4);
        } else {
            view.layout(i - lrVar.vr(), i2, i3 - lrVar.vr(), i4);
        }
    }

    private void ri(int i, int i2, int i3, View view) {
        long[] jArr = this.lr;
        if (jArr != null) {
            jArr[i] = lr(i2, i3);
        }
        long[] jArr2 = this.di;
        if (jArr2 != null) {
            jArr2[i] = lr(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
