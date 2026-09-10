package com.bytedance.adsdk.ugeno.JXs;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ZU {
    static final /* synthetic */ boolean lk = true;
    private boolean[] JXs;
    long[] LD;
    int[] Lxb;
    private final com.bytedance.adsdk.ugeno.JXs.Lxb ZU;
    private long[] lc;

    public static class LD implements Comparable<LD> {
        int LD;
        int Lxb;

        private LD() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
        public int compareTo(LD ld) {
            int i = this.LD;
            int i2 = ld.LD;
            return i != i2 ? i - i2 : this.Lxb - ld.Lxb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.LD);
            sb.append(", index=");
            return DM.k(sb, this.Lxb, '}');
        }
    }

    public static class Lxb {
        int LD;
        List<lk> Lxb;

        public void Lxb() {
            this.Lxb = null;
            this.LD = 0;
        }
    }

    public ZU(com.bytedance.adsdk.ugeno.JXs.Lxb lxb) {
        this.ZU = lxb;
    }

    private int JXs(com.bytedance.adsdk.ugeno.JXs.LD ld, boolean z) {
        return z ? ld.STP() : ld.NXR();
    }

    private int ZU(boolean z) {
        return z ? this.ZU.getPaddingBottom() : this.ZU.getPaddingEnd();
    }

    private int lc(com.bytedance.adsdk.ugeno.JXs.LD ld, boolean z) {
        return z ? ld.VVE() : ld.IeN();
    }

    private int lk(boolean z) {
        return z ? this.ZU.getPaddingTop() : this.ZU.getPaddingStart();
    }

    public int LD(long j) {
        return (int) (j >> 32);
    }

    public int Lxb(long j) {
        return (int) j;
    }

    public long LD(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] Lxb(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.ZU.getFlexItemCount();
        List<LD> listLD = LD(flexItemCount);
        LD ld = new LD();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.JXs.LD)) {
            ld.LD = 1;
        } else {
            ld.LD = ((com.bytedance.adsdk.ugeno.JXs.LD) layoutParams).lk();
        }
        if (i == -1 || i == flexItemCount || i >= this.ZU.getFlexItemCount()) {
            ld.Lxb = flexItemCount;
        } else {
            ld.Lxb = i;
            while (i < flexItemCount) {
                listLD.get(i).Lxb++;
                i++;
            }
        }
        listLD.add(ld);
        return Lxb(flexItemCount + 1, listLD, sparseIntArray);
    }

    private List<LD> LD(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) this.ZU.Lxb(i2).getLayoutParams();
            LD ld2 = new LD();
            ld2.LD = ld.lk();
            ld2.Lxb = i2;
            arrayList.add(ld2);
        }
        return arrayList;
    }

    private int ZU(com.bytedance.adsdk.ugeno.JXs.LD ld, boolean z) {
        if (z) {
            return ld.IeN();
        }
        return ld.VVE();
    }

    private int lk(com.bytedance.adsdk.ugeno.JXs.LD ld, boolean z) {
        if (z) {
            return ld.NXR();
        }
        return ld.STP();
    }

    private void lk(int i) {
        boolean[] zArr = this.JXs;
        if (zArr == null) {
            this.JXs = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.JXs = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean LD(SparseIntArray sparseIntArray) {
        int flexItemCount = this.ZU.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View viewLxb = this.ZU.Lxb(i);
            if (viewLxb != null && ((com.bytedance.adsdk.ugeno.JXs.LD) viewLxb.getLayoutParams()).lk() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    public void LD(Lxb lxb, int i, int i2) {
        Lxb(lxb, i2, i, Integer.MAX_VALUE, 0, -1, (List<lk>) null);
    }

    private int LD(boolean z) {
        if (z) {
            return this.ZU.getPaddingEnd();
        }
        return this.ZU.getPaddingBottom();
    }

    public int[] Lxb(SparseIntArray sparseIntArray) {
        int flexItemCount = this.ZU.getFlexItemCount();
        return Lxb(flexItemCount, LD(flexItemCount), sparseIntArray);
    }

    private int LD(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] Lxb(int i, List<LD> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (LD ld : list) {
            int i3 = ld.Lxb;
            iArr[i2] = i3;
            sparseIntArray.append(i3, ld.LD);
            i2++;
        }
        return iArr;
    }

    private int LD(com.bytedance.adsdk.ugeno.JXs.LD ld, boolean z) {
        if (z) {
            return ld.LD();
        }
        return ld.Lxb();
    }

    private void LD(int i, int i2, lk lkVar, int i3, int i4, boolean z) {
        int iMax;
        int i5 = lkVar.JXs;
        float f = lkVar.JVA;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i5) {
            return;
        }
        float f3 = (i5 - i3) / f;
        lkVar.JXs = i4 + lkVar.lc;
        if (!z) {
            lkVar.ebl = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f4 = 0.0f;
        while (i6 < lkVar.OY) {
            int i8 = lkVar.IeN + i6;
            View viewLD = this.ZU.LD(i8);
            if (viewLD == null || viewLD.getVisibility() == 8) {
                i5 = i5;
                i6 = i6;
            } else {
                com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) viewLD.getLayoutParams();
                int flexDirection = this.ZU.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewLD.getMeasuredHeight();
                    long[] jArr = this.lc;
                    if (jArr != null) {
                        measuredHeight = LD(jArr[i8]);
                    }
                    int measuredWidth = viewLD.getMeasuredWidth();
                    long[] jArr2 = this.lc;
                    if (jArr2 != null) {
                        measuredWidth = Lxb(jArr2[i8]);
                    }
                    if (this.JXs[i8] || ld.JXs() <= f2) {
                        i5 = i5;
                        i6 = i6;
                    } else {
                        float fJXs = measuredHeight - (ld.JXs() * f3);
                        if (i6 == lkVar.OY - 1) {
                            fJXs += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(fJXs);
                        if (iRound < ld.OY()) {
                            iRound = ld.OY();
                            this.JXs[i8] = true;
                            lkVar.JVA -= ld.JXs();
                            z2 = true;
                        } else {
                            float f5 = (fJXs - iRound) + f4;
                            double d = f5;
                            if (d > 1.0d) {
                                iRound++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f5 += 1.0f;
                            }
                            f4 = f5;
                        }
                        int iLxb = Lxb(i, ld, lkVar.NXR);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewLD.measure(iLxb, iMakeMeasureSpec);
                        measuredWidth = viewLD.getMeasuredWidth();
                        int measuredHeight2 = viewLD.getMeasuredHeight();
                        Lxb(i8, iLxb, iMakeMeasureSpec, viewLD);
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i7, ld.IeN() + ld.NXR() + measuredWidth + this.ZU.Lxb(viewLD));
                    lkVar.JXs = ld.VVE() + ld.STP() + measuredHeight + lkVar.JXs;
                } else {
                    i5 = i5;
                    int i9 = i6;
                    int measuredWidth2 = viewLD.getMeasuredWidth();
                    long[] jArr3 = this.lc;
                    if (jArr3 != null) {
                        measuredWidth2 = Lxb(jArr3[i8]);
                    }
                    int measuredHeight3 = viewLD.getMeasuredHeight();
                    long[] jArr4 = this.lc;
                    if (jArr4 != null) {
                        measuredHeight3 = LD(jArr4[i8]);
                    }
                    if (this.JXs[i8] || ld.JXs() <= 0.0f) {
                        i6 = i9;
                    } else {
                        float fJXs2 = measuredWidth2 - (ld.JXs() * f3);
                        if (i6 == lkVar.OY - 1) {
                            i6 = i9;
                            fJXs2 += f4;
                            f4 = 0.0f;
                        }
                        i6 = i9;
                        int iRound2 = Math.round(fJXs2);
                        if (iRound2 < ld.ebl()) {
                            iRound2 = ld.ebl();
                            this.JXs[i8] = true;
                            lkVar.JVA -= ld.JXs();
                            z2 = true;
                        } else {
                            float f6 = (fJXs2 - iRound2) + f4;
                            double d2 = f6;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f6 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f6 += 1.0f;
                            }
                            f4 = f6;
                        }
                        int iLD = LD(i2, ld, lkVar.NXR);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewLD.measure(iMakeMeasureSpec2, iLD);
                        int measuredWidth3 = viewLD.getMeasuredWidth();
                        int measuredHeight4 = viewLD.getMeasuredHeight();
                        Lxb(i8, iMakeMeasureSpec2, iLD, viewLD);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i7, ld.VVE() + ld.STP() + measuredHeight3 + this.ZU.Lxb(viewLD));
                    lkVar.JXs = ld.IeN() + ld.NXR() + measuredWidth2 + lkVar.JXs;
                    iMax = iMax2;
                }
                lkVar.ebl = Math.max(lkVar.ebl, iMax);
                i7 = iMax;
            }
            i6++;
            i5 = i5;
            f2 = 0.0f;
        }
        int i10 = i5;
        if (!z2 || i10 == lkVar.JXs) {
            return;
        }
        LD(i, i2, lkVar, i3, i4, true);
    }

    public void Lxb(Lxb lxb, int i, int i2) {
        Lxb(lxb, i, i2, Integer.MAX_VALUE, 0, -1, (List<lk>) null);
    }

    public void Lxb(Lxb lxb, int i, int i2, int i3, int i4, int i5, List<lk> list) {
        int i6;
        int i7;
        List<lk> list2;
        int i8;
        View view;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i2;
        int i17 = i5;
        boolean zLxb = this.ZU.Lxb();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<lk> arrayList = list == null ? new ArrayList() : list;
        lxb.Lxb = arrayList;
        boolean z = i17 == -1;
        int iLxb = Lxb(zLxb);
        int iLD = LD(zLxb);
        int iLk = lk(zLxb);
        int iZU = ZU(zLxb);
        lk lkVar = new lk();
        int i18 = i4;
        lkVar.IeN = i18;
        int i19 = iLD + iLxb;
        lkVar.JXs = i19;
        int flexItemCount = this.ZU.getFlexItemCount();
        boolean z2 = z;
        int i20 = 0;
        int iCombineMeasuredStates = 0;
        int i21 = 0;
        int i22 = Integer.MIN_VALUE;
        while (i18 < flexItemCount) {
            View viewLD = this.ZU.LD(i18);
            if (viewLD == null) {
                if (Lxb(i18, flexItemCount, lkVar)) {
                    Lxb(arrayList, lkVar, i18, i20);
                }
            } else {
                if (viewLD.getVisibility() == 8) {
                    lkVar.QAg++;
                    lkVar.OY++;
                    if (Lxb(i18, flexItemCount, lkVar)) {
                        Lxb(arrayList, lkVar, i18, i20);
                    }
                } else {
                    if (viewLD instanceof CompoundButton) {
                        Lxb((CompoundButton) viewLD);
                    }
                    com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) viewLD.getLayoutParams();
                    int i23 = flexItemCount;
                    if (ld.lc() == 4) {
                        lkVar.STP.add(Integer.valueOf(i18));
                    }
                    int iLxb2 = Lxb(ld, zLxb);
                    if (ld.sLN() != -1.0f && mode == 1073741824) {
                        iLxb2 = Math.round(ld.sLN() * size);
                    }
                    if (zLxb) {
                        int iLxb3 = this.ZU.Lxb(i, i19 + lk(ld, true) + ZU(ld, true), iLxb2);
                        int iLD2 = this.ZU.LD(i16, iLk + iZU + JXs(ld, true) + lc(ld, true) + i20, LD(ld, true));
                        viewLD.measure(iLxb3, iLD2);
                        Lxb(i18, iLxb3, iLD2, viewLD);
                        i7 = iLxb3;
                    } else {
                        int iLxb4 = this.ZU.Lxb(i16, iLk + iZU + JXs(ld, false) + lc(ld, false) + i20, LD(ld, false));
                        int iLD3 = this.ZU.LD(i, lk(ld, false) + i19 + ZU(ld, false), iLxb2);
                        viewLD.measure(iLxb4, iLD3);
                        Lxb(i18, iLxb4, iLD3, viewLD);
                        i7 = iLD3;
                    }
                    Lxb(viewLD, i18);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewLD.getMeasuredState());
                    int i24 = i20;
                    int i25 = i19;
                    lk lkVar2 = lkVar;
                    int i26 = i18;
                    list2 = arrayList;
                    int i27 = i7;
                    if (Lxb(viewLD, mode, size, lkVar.JXs, ZU(ld, zLxb) + Lxb(viewLD, zLxb) + lk(ld, zLxb), ld, i26, i21, arrayList.size())) {
                        i18 = i26;
                        if (lkVar2.LD() > 0) {
                            Lxb(list2, lkVar2, i18 > 0 ? i18 - 1 : 0, i24);
                            i20 = lkVar2.ebl + i24;
                        } else {
                            i20 = i24;
                        }
                        if (zLxb) {
                            if (ld.LD() == -1) {
                                com.bytedance.adsdk.ugeno.JXs.Lxb lxb2 = this.ZU;
                                i8 = i2;
                                i11 = -1;
                                view = viewLD;
                                view.measure(i27, lxb2.LD(i8, ld.VVE() + ld.STP() + lxb2.getPaddingTop() + this.ZU.getPaddingBottom() + i20, ld.LD()));
                                Lxb(view, i18);
                            } else {
                                i8 = i2;
                                view = viewLD;
                                i11 = -1;
                            }
                        } else {
                            i8 = i2;
                            view = viewLD;
                            i11 = -1;
                            if (ld.Lxb() == -1) {
                                com.bytedance.adsdk.ugeno.JXs.Lxb lxb3 = this.ZU;
                                view.measure(lxb3.Lxb(i8, ld.IeN() + ld.NXR() + lxb3.getPaddingLeft() + this.ZU.getPaddingRight() + i20, ld.Lxb()), i27);
                                Lxb(view, i18);
                            }
                        }
                        lkVar = new lk();
                        i10 = 1;
                        lkVar.OY = 1;
                        i9 = i25;
                        lkVar.JXs = i9;
                        lkVar.IeN = i18;
                        i12 = 0;
                        i13 = Integer.MIN_VALUE;
                    } else {
                        i8 = i2;
                        i18 = i26;
                        view = viewLD;
                        lkVar = lkVar2;
                        i9 = i25;
                        i10 = 1;
                        i11 = -1;
                        lkVar.OY++;
                        i12 = i21 + 1;
                        i20 = i24;
                        i13 = i22;
                    }
                    lkVar.kqm |= ld.ZU() != 0.0f;
                    lkVar.brP |= ld.JXs() != 0.0f;
                    int[] iArr = this.Lxb;
                    if (iArr != null) {
                        iArr[i18] = list2.size();
                    }
                    lkVar.JXs = Lxb(view, zLxb) + lk(ld, zLxb) + ZU(ld, zLxb) + lkVar.JXs;
                    lkVar.nBu = ld.ZU() + lkVar.nBu;
                    lkVar.JVA = ld.JXs() + lkVar.JVA;
                    this.ZU.Lxb(view, i18, i12, lkVar);
                    int iMax = Math.max(i13, LD(view, zLxb) + JXs(ld, zLxb) + lc(ld, zLxb) + this.ZU.Lxb(view));
                    lkVar.ebl = Math.max(lkVar.ebl, iMax);
                    if (zLxb) {
                        if (this.ZU.getFlexWrap() != 2) {
                            lkVar.sLN = Math.max(lkVar.sLN, ld.STP() + view.getBaseline());
                        } else {
                            lkVar.sLN = Math.max(lkVar.sLN, ld.VVE() + (view.getMeasuredHeight() - view.getBaseline()));
                        }
                    }
                    i14 = i23;
                    if (Lxb(i18, i14, lkVar)) {
                        Lxb(list2, lkVar, i18, i20);
                        i20 += lkVar.ebl;
                    }
                    i15 = i5;
                    if (i15 != i11 && list2.size() > 0 && ((lk) DM.f(list2, i10)).VVE >= i15 && i18 >= i15 && !z2) {
                        i20 = -lkVar.Lxb();
                        z2 = true;
                    }
                    if (i20 > i3 && z2) {
                        i6 = iCombineMeasuredStates;
                        lxb.LD = i6;
                    } else {
                        i21 = i12;
                        i22 = iMax;
                    }
                }
                i18++;
                flexItemCount = i14;
                i16 = i8;
                i19 = i9;
                arrayList = list2;
                size = size;
                mode = mode;
                i17 = i15;
            }
            size = size;
            mode = mode;
            i8 = i16;
            i15 = i17;
            i9 = i19;
            list2 = arrayList;
            i14 = flexItemCount;
            i18++;
            flexItemCount = i14;
            i16 = i8;
            i19 = i9;
            arrayList = list2;
            size = size;
            mode = mode;
            i17 = i15;
        }
        i6 = iCombineMeasuredStates;
        lxb.LD = i6;
    }

    private int LD(int i, com.bytedance.adsdk.ugeno.JXs.LD ld, int i2) {
        com.bytedance.adsdk.ugeno.JXs.Lxb lxb = this.ZU;
        int iLD = lxb.LD(i, ld.VVE() + ld.STP() + lxb.getPaddingTop() + this.ZU.getPaddingBottom() + i2, ld.LD());
        int size = View.MeasureSpec.getSize(iLD);
        if (size > ld.nBu()) {
            return View.MeasureSpec.makeMeasureSpec(ld.nBu(), View.MeasureSpec.getMode(iLD));
        }
        return size < ld.OY() ? View.MeasureSpec.makeMeasureSpec(ld.OY(), View.MeasureSpec.getMode(iLD)) : iLD;
    }

    public void LD(int i, int i2, int i3) {
        int mode;
        int size;
        int flexDirection = this.ZU.getFlexDirection();
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
        List<lk> flexLinesInternal = this.ZU.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.ZU.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).ebl = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.ZU.getAlignContent();
                if (alignContent == 1) {
                    int i5 = size - sumOfCrossSize;
                    lk lkVar = new lk();
                    lkVar.ebl = i5;
                    flexLinesInternal.add(0, lkVar);
                    return;
                }
                if (alignContent == 2) {
                    this.ZU.setFlexLines(Lxb(flexLinesInternal, size, sumOfCrossSize));
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
                                lk lkVar2 = new lk();
                                if (i4 == flexLinesInternal.size() - 2) {
                                    lkVar2.ebl = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    lkVar2.ebl = Math.round(size3);
                                }
                                int i6 = lkVar2.ebl;
                                float f2 = (size3 - i6) + f;
                                if (f2 > 1.0f) {
                                    lkVar2.ebl = i6 + 1;
                                    f2 -= 1.0f;
                                } else if (f2 < -1.0f) {
                                    lkVar2.ebl = i6 - 1;
                                    f2 += 1.0f;
                                }
                                f = f2;
                                arrayList.add(lkVar2);
                            }
                            i4++;
                        }
                        this.ZU.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.ZU.setFlexLines(Lxb(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    lk lkVar3 = new lk();
                    lkVar3.ebl = size5;
                    for (lk lkVar4 : flexLinesInternal) {
                        arrayList2.add(lkVar3);
                        arrayList2.add(lkVar4);
                        arrayList2.add(lkVar3);
                    }
                    this.ZU.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        lk lkVar5 = flexLinesInternal.get(i4);
                        float f4 = lkVar5.ebl + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        float f5 = (f4 - iRound) + f3;
                        if (f5 > 1.0f) {
                            iRound++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        lkVar5.ebl = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    private void Lxb(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) compoundButton.getLayoutParams();
        int iEbl = ld.ebl();
        int iOY = ld.OY();
        Drawable drawableLxb = com.bytedance.adsdk.ugeno.ebl.JXs.Lxb(compoundButton);
        int minimumWidth = drawableLxb == null ? 0 : drawableLxb.getMinimumWidth();
        int minimumHeight = drawableLxb != null ? drawableLxb.getMinimumHeight() : 0;
        if (iEbl == -1) {
            iEbl = minimumWidth;
        }
        ld.Lxb(iEbl);
        if (iOY == -1) {
            iOY = minimumHeight;
        }
        ld.LD(iOY);
    }

    private void LD(View view, int i, int i2) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - ld.NXR()) - ld.IeN()) - this.ZU.Lxb(view), ld.ebl()), ld.QAg());
        long[] jArr = this.lc;
        if (jArr != null) {
            measuredHeight = LD(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Lxb(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int Lxb(boolean z) {
        if (z) {
            return this.ZU.getPaddingStart();
        }
        return this.ZU.getPaddingTop();
    }

    private int Lxb(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int Lxb(com.bytedance.adsdk.ugeno.JXs.LD ld, boolean z) {
        if (z) {
            return ld.Lxb();
        }
        return ld.LD();
    }

    private boolean Lxb(View view, int i, int i2, int i3, int i4, com.bytedance.adsdk.ugeno.JXs.LD ld, int i5, int i6, int i7) {
        if (this.ZU.getFlexWrap() == 0) {
            return false;
        }
        if (ld.JVA()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.ZU.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int iLxb = this.ZU.Lxb(view, i5, i6);
        if (iLxb > 0) {
            i4 += iLxb;
        }
        return i2 < i3 + i4;
    }

    private boolean Lxb(int i, int i2, lk lkVar) {
        return i == i2 - 1 && lkVar.LD() != 0;
    }

    private void Lxb(List<lk> list, lk lkVar, int i, int i2) {
        lkVar.NXR = i2;
        this.ZU.Lxb(lkVar);
        lkVar.VVE = i;
        list.add(lkVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void Lxb(View view, int i) {
        boolean z;
        com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < ld.ebl()) {
            measuredWidth = ld.ebl();
        } else {
            if (measuredWidth > ld.QAg()) {
                measuredWidth = ld.QAg();
            } else {
                z = false;
            }
            if (measuredHeight < ld.OY()) {
                measuredHeight = ld.OY();
            } else if (measuredHeight > ld.nBu()) {
                measuredHeight = ld.nBu();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                Lxb(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z = true;
        if (measuredHeight < ld.OY()) {
            measuredHeight = ld.OY();
        } else if (measuredHeight > ld.nBu()) {
            measuredHeight = ld.nBu();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            Lxb(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    public void Lxb(int i, int i2) {
        Lxb(i, i2, 0);
    }

    public void Lxb(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        lk(this.ZU.getFlexItemCount());
        if (i3 >= this.ZU.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.ZU.getFlexDirection();
        int flexDirection2 = this.ZU.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                size = this.ZU.getLargestMainSize();
            }
            paddingLeft = this.ZU.getPaddingTop();
            paddingRight = this.ZU.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.ZU.getLargestMainSize();
            if (mode2 != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.ZU.getPaddingLeft();
            paddingRight = this.ZU.getPaddingRight();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.Lxb;
        List<lk> flexLinesInternal = this.ZU.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            lk lkVar = flexLinesInternal.get(i5);
            int i6 = lkVar.JXs;
            if (i6 < size && lkVar.kqm) {
                Lxb(i, i2, lkVar, size, i4, false);
            } else if (i6 > size && lkVar.brP) {
                LD(i, i2, lkVar, size, i4, false);
            }
        }
    }

    private void Lxb(int i, int i2, lk lkVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iMax;
        double d;
        int i7;
        double d2;
        float f = lkVar.nBu;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = lkVar.JXs)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        lkVar.JXs = i4 + lkVar.lc;
        if (!z) {
            lkVar.ebl = Integer.MIN_VALUE;
        }
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        float f4 = 0.0f;
        while (i8 < lkVar.OY) {
            int i10 = lkVar.IeN + i8;
            View viewLD = this.ZU.LD(i10);
            if (viewLD == null || viewLD.getVisibility() == 8) {
                i6 = i5;
            } else {
                com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) viewLD.getLayoutParams();
                int flexDirection = this.ZU.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewLD.getMeasuredHeight();
                    long[] jArr = this.lc;
                    if (jArr != null) {
                        measuredHeight = LD(jArr[i10]);
                    }
                    int measuredWidth = viewLD.getMeasuredWidth();
                    long[] jArr2 = this.lc;
                    if (jArr2 != null) {
                        measuredWidth = Lxb(jArr2[i10]);
                    }
                    if (this.JXs[i10] || ld.ZU() <= f2) {
                        i7 = i5;
                    } else {
                        float fZU = (ld.ZU() * f3) + measuredHeight;
                        if (i8 == lkVar.OY - 1) {
                            fZU += f4;
                            f4 = 0.0f;
                        }
                        int iRound = Math.round(fZU);
                        if (iRound > ld.nBu()) {
                            iRound = ld.nBu();
                            this.JXs[i10] = true;
                            lkVar.nBu -= ld.ZU();
                            i7 = i5;
                            z2 = true;
                        } else {
                            float f5 = (fZU - iRound) + f4;
                            i7 = i5;
                            double d3 = f5;
                            if (d3 > 1.0d) {
                                iRound++;
                                d2 = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d2 = d3 + 1.0d;
                            } else {
                                f4 = f5;
                            }
                            f4 = (float) d2;
                        }
                        int iLxb = Lxb(i, ld, lkVar.NXR);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewLD.measure(iLxb, iMakeMeasureSpec);
                        measuredWidth = viewLD.getMeasuredWidth();
                        int measuredHeight2 = viewLD.getMeasuredHeight();
                        Lxb(i10, iLxb, iMakeMeasureSpec, viewLD);
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i9, ld.IeN() + ld.NXR() + measuredWidth + this.ZU.Lxb(viewLD));
                    lkVar.JXs = ld.VVE() + ld.STP() + measuredHeight + lkVar.JXs;
                    i6 = i7;
                } else {
                    int i11 = i5;
                    int measuredWidth2 = viewLD.getMeasuredWidth();
                    long[] jArr3 = this.lc;
                    if (jArr3 != null) {
                        measuredWidth2 = Lxb(jArr3[i10]);
                    }
                    int measuredHeight3 = viewLD.getMeasuredHeight();
                    long[] jArr4 = this.lc;
                    i6 = i11;
                    if (jArr4 != null) {
                        measuredHeight3 = LD(jArr4[i10]);
                    }
                    if (!this.JXs[i10] && ld.ZU() > 0.0f) {
                        float fZU2 = (ld.ZU() * f3) + measuredWidth2;
                        if (i8 == lkVar.OY - 1) {
                            fZU2 += f4;
                            f4 = 0.0f;
                        }
                        int iRound2 = Math.round(fZU2);
                        if (iRound2 > ld.QAg()) {
                            iRound2 = ld.QAg();
                            this.JXs[i10] = true;
                            lkVar.nBu -= ld.ZU();
                            z2 = true;
                        } else {
                            float f6 = (fZU2 - iRound2) + f4;
                            double d4 = f6;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d = d4 + 1.0d;
                                }
                                f4 = f6;
                            }
                            f6 = (float) d;
                            f4 = f6;
                        }
                        int iLD = LD(i2, ld, lkVar.NXR);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewLD.measure(iMakeMeasureSpec2, iLD);
                        int measuredWidth3 = viewLD.getMeasuredWidth();
                        int measuredHeight4 = viewLD.getMeasuredHeight();
                        Lxb(i10, iMakeMeasureSpec2, iLD, viewLD);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i9, ld.VVE() + ld.STP() + measuredHeight3 + this.ZU.Lxb(viewLD));
                    lkVar.JXs = ld.IeN() + ld.NXR() + measuredWidth2 + lkVar.JXs;
                    iMax = iMax2;
                }
                lkVar.ebl = Math.max(lkVar.ebl, iMax);
                i9 = iMax;
            }
            i8++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i12 = i5;
        if (!z2 || i12 == lkVar.JXs) {
            return;
        }
        Lxb(i, i2, lkVar, i3, i4, true);
    }

    private int Lxb(int i, com.bytedance.adsdk.ugeno.JXs.LD ld, int i2) {
        com.bytedance.adsdk.ugeno.JXs.Lxb lxb = this.ZU;
        int iLxb = lxb.Lxb(i, ld.IeN() + ld.NXR() + lxb.getPaddingLeft() + this.ZU.getPaddingRight() + i2, ld.Lxb());
        int size = View.MeasureSpec.getSize(iLxb);
        if (size > ld.QAg()) {
            return View.MeasureSpec.makeMeasureSpec(ld.QAg(), View.MeasureSpec.getMode(iLxb));
        }
        return size < ld.ebl() ? View.MeasureSpec.makeMeasureSpec(ld.ebl(), View.MeasureSpec.getMode(iLxb)) : iLxb;
    }

    private List<lk> Lxb(List<lk> list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        lk lkVar = new lk();
        lkVar.ebl = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(lkVar);
            }
            arrayList.add(list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(lkVar);
            }
        }
        return arrayList;
    }

    public void Lxb() {
        Lxb(0);
    }

    public void Lxb(int i) {
        View viewLD;
        if (i >= this.ZU.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.ZU.getFlexDirection();
        if (this.ZU.getAlignItems() == 4) {
            int[] iArr = this.Lxb;
            List<lk> flexLinesInternal = this.ZU.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                lk lkVar = flexLinesInternal.get(i2);
                int i3 = lkVar.OY;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = lkVar.IeN + i4;
                    if (i4 < this.ZU.getFlexItemCount() && (viewLD = this.ZU.LD(i5)) != null && viewLD.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) viewLD.getLayoutParams();
                        if (ld.lc() == -1 || ld.lc() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                LD(viewLD, lkVar.ebl, i5);
                            } else {
                                Lxb(viewLD, lkVar.ebl, i5);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (lk lkVar2 : this.ZU.getFlexLinesInternal()) {
            for (Integer num : lkVar2.STP) {
                View viewLD2 = this.ZU.LD(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    LD(viewLD2, lkVar2.ebl, num.intValue());
                } else {
                    Lxb(viewLD2, lkVar2.ebl, num.intValue());
                }
            }
        }
    }

    private void Lxb(View view, int i, int i2) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i - ld.STP()) - ld.VVE()) - this.ZU.Lxb(view), ld.OY()), ld.nBu());
        long[] jArr = this.lc;
        if (jArr != null) {
            measuredWidth = Lxb(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Lxb(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void Lxb(View view, lk lkVar, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) view.getLayoutParams();
        int alignItems = this.ZU.getAlignItems();
        if (ld.lc() != -1) {
            alignItems = ld.lc();
        }
        int i5 = lkVar.ebl;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.ZU.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - ld.VVE(), i3, i6 - ld.VVE());
                    return;
                }
                view.layout(i, ld.STP() + view.getMeasuredHeight() + (i2 - i5), i3, ld.STP() + view.getMeasuredHeight() + (i4 - i5));
                return;
            }
            if (alignItems == 2) {
                int iSTP = ((ld.STP() + (i5 - view.getMeasuredHeight())) - ld.VVE()) / 2;
                if (this.ZU.getFlexWrap() != 2) {
                    int i7 = i2 + iSTP;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - iSTP;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.ZU.getFlexWrap() != 2) {
                    int iMax = Math.max(lkVar.sLN - view.getBaseline(), ld.STP());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (lkVar.sLN - view.getMeasuredHeight()), ld.VVE());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.ZU.getFlexWrap() != 2) {
            view.layout(i, ld.STP() + i2, i3, ld.STP() + i4);
        } else {
            view.layout(i, i2 - ld.VVE(), i3, i4 - ld.VVE());
        }
    }

    public void Lxb(View view, lk lkVar, boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.JXs.LD ld = (com.bytedance.adsdk.ugeno.JXs.LD) view.getLayoutParams();
        int alignItems = this.ZU.getAlignItems();
        if (ld.lc() != -1) {
            alignItems = ld.lc();
        }
        int i5 = lkVar.ebl;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - ld.IeN(), i2, ((i3 + i5) - view.getMeasuredWidth()) - ld.IeN(), i4);
                    return;
                }
                view.layout(ld.NXR() + view.getMeasuredWidth() + (i - i5), i2, ld.NXR() + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iLxb = ((com.bytedance.adsdk.ugeno.ebl.lc.Lxb(marginLayoutParams) + (i5 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.ebl.lc.LD(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + iLxb, i2, i3 + iLxb, i4);
                    return;
                } else {
                    view.layout(i - iLxb, i2, i3 - iLxb, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(ld.NXR() + i, i2, ld.NXR() + i3, i4);
        } else {
            view.layout(i - ld.IeN(), i2, i3 - ld.IeN(), i4);
        }
    }

    private void Lxb(int i, int i2, int i3, View view) {
        long[] jArr = this.LD;
        if (jArr != null) {
            jArr[i] = LD(i2, i3);
        }
        long[] jArr2 = this.lc;
        if (jArr2 != null) {
            jArr2[i] = LD(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
