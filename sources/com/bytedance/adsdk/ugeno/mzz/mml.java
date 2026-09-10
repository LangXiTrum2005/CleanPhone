package com.bytedance.adsdk.ugeno.mzz;

import android.graphics.drawable.Drawable;
import android.support.v4.media.a;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
class mml {
    static final /* synthetic */ boolean lnr = true;
    private final com.bytedance.adsdk.ugeno.mzz.qdl mml;
    private long[] mo;
    private boolean[] mzz;
    int[] qdl;
    long[] ud;

    public static class qdl {
        List<lnr> qdl;
        int ud;

        public void qdl() {
            this.qdl = null;
            this.ud = 0;
        }
    }

    public static class ud implements Comparable<ud> {
        int qdl;
        int ud;

        private ud() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public int compareTo(ud udVar) {
            int i2 = this.ud;
            int i3 = udVar.ud;
            return i2 != i3 ? i2 - i3 : this.qdl - udVar.qdl;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Order{order=");
            sb.append(this.ud);
            sb.append(", index=");
            return a.p(sb, this.qdl, AbstractJsonLexerKt.END_OBJ);
        }
    }

    public mml(com.bytedance.adsdk.ugeno.mzz.qdl qdlVar) {
        this.mml = qdlVar;
    }

    private int lnr(boolean z2) {
        return z2 ? this.mml.getPaddingTop() : this.mml.getPaddingStart();
    }

    private int mml(boolean z2) {
        return z2 ? this.mml.getPaddingBottom() : this.mml.getPaddingEnd();
    }

    private int mo(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z2) {
        return z2 ? udVar.jtx() : udVar.bjy();
    }

    private int mzz(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z2) {
        return z2 ? udVar.rdp() : udVar.exu();
    }

    public int qdl(long j) {
        return (int) j;
    }

    public int ud(long j) {
        return (int) (j >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int[] qdl(View view, int i2, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.mml.getFlexItemCount();
        List<ud> listUd = ud(flexItemCount);
        ud udVar = new ud();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.mzz.ud)) {
            udVar.ud = 1;
        } else {
            udVar.ud = ((com.bytedance.adsdk.ugeno.mzz.ud) layoutParams).lnr();
        }
        if (i2 == -1 || i2 == flexItemCount || i2 >= this.mml.getFlexItemCount()) {
            udVar.qdl = flexItemCount;
        } else {
            udVar.qdl = i2;
            while (i2 < flexItemCount) {
                listUd.get(i2).qdl++;
                i2++;
            }
        }
        listUd.add(udVar);
        return qdl(flexItemCount + 1, listUd, sparseIntArray);
    }

    public long ud(int i2, int i3) {
        return (((long) i2) & 4294967295L) | (((long) i3) << 32);
    }

    private int lnr(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z2) {
        if (z2) {
            return udVar.exu();
        }
        return udVar.rdp();
    }

    private int mml(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z2) {
        if (z2) {
            return udVar.bjy();
        }
        return udVar.jtx();
    }

    private List<ud> ud(int i2) {
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) this.mml.qdl(i3).getLayoutParams();
            ud udVar2 = new ud();
            udVar2.ud = udVar.lnr();
            udVar2.qdl = i3;
            arrayList.add(udVar2);
        }
        return arrayList;
    }

    private void lnr(int i2) {
        boolean[] zArr = this.mzz;
        if (zArr == null) {
            this.mzz = new boolean[Math.max(i2, 10)];
        } else if (zArr.length < i2) {
            this.mzz = new boolean[Math.max(zArr.length * 2, i2)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public boolean ud(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mml.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i2 = 0; i2 < flexItemCount; i2++) {
            View viewQdl = this.mml.qdl(i2);
            if (viewQdl != null && ((com.bytedance.adsdk.ugeno.mzz.ud) viewQdl.getLayoutParams()).lnr() != sparseIntArray.get(i2)) {
                return true;
            }
        }
        return false;
    }

    public void ud(qdl qdlVar, int i2, int i3) {
        qdl(qdlVar, i3, i2, Integer.MAX_VALUE, 0, -1, (List<lnr>) null);
    }

    private int ud(boolean z2) {
        if (z2) {
            return this.mml.getPaddingEnd();
        }
        return this.mml.getPaddingBottom();
    }

    public int[] qdl(SparseIntArray sparseIntArray) {
        int flexItemCount = this.mml.getFlexItemCount();
        return qdl(flexItemCount, ud(flexItemCount), sparseIntArray);
    }

    private int ud(View view, boolean z2) {
        if (z2) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] qdl(int i2, List<ud> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i2];
        int i3 = 0;
        for (ud udVar : list) {
            int i4 = udVar.qdl;
            iArr[i3] = i4;
            sparseIntArray.append(i4, udVar.ud);
            i3++;
        }
        return iArr;
    }

    private int ud(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z2) {
        if (z2) {
            return udVar.ud();
        }
        return udVar.qdl();
    }

    private void ud(int i2, int i3, lnr lnrVar, int i4, int i5, boolean z2) {
        float f;
        float f2;
        int iMax;
        int iWd;
        int i6 = lnrVar.mzz;
        float f3 = lnrVar.rq;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i4 > i6) {
            return;
        }
        float f5 = (i6 - i4) / f3;
        lnrVar.mzz = i5 + lnrVar.mo;
        if (!z2) {
            lnrVar.wd = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z3 = false;
        int i8 = 0;
        float f6 = 0.0f;
        while (i7 < lnrVar.jpc) {
            int i9 = lnrVar.bjy + i7;
            View viewUd = this.mml.ud(i9);
            if (viewUd == null || viewUd.getVisibility() == 8) {
                f = f4;
                f2 = f5;
            } else {
                com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                int flexDirection = this.mml.getFlexDirection();
                f = f4;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewUd.getMeasuredHeight();
                    long[] jArr = this.mo;
                    if (jArr != null) {
                        measuredHeight = ud(jArr[i9]);
                    }
                    int measuredWidth = viewUd.getMeasuredWidth();
                    long[] jArr2 = this.mo;
                    if (jArr2 != null) {
                        measuredWidth = qdl(jArr2[i9]);
                    }
                    if (!this.mzz[i9] && udVar.mzz() > f) {
                        float fMzz = measuredHeight - (udVar.mzz() * f5);
                        if (i7 == lnrVar.jpc - 1) {
                            fMzz += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fMzz);
                        if (iRound < udVar.jpc()) {
                            iRound = udVar.jpc();
                            this.mzz[i9] = true;
                            lnrVar.rq -= udVar.mzz();
                            z3 = true;
                        } else {
                            float f7 = (fMzz - iRound) + f6;
                            double d = f7;
                            if (d > 1.0d) {
                                iRound++;
                                f7 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f7 += 1.0f;
                            }
                            f6 = f7;
                        }
                        int iQdl = qdl(i2, udVar, lnrVar.exu);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewUd.measure(iQdl, iMakeMeasureSpec);
                        int measuredWidth2 = viewUd.getMeasuredWidth();
                        int measuredHeight2 = viewUd.getMeasuredHeight();
                        qdl(i9, iQdl, iMakeMeasureSpec, viewUd);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i8, udVar.bjy() + udVar.exu() + measuredWidth + this.mml.qdl(viewUd));
                    lnrVar.mzz = udVar.jtx() + udVar.rdp() + measuredHeight + lnrVar.mzz;
                    f2 = f5;
                } else {
                    int measuredWidth3 = viewUd.getMeasuredWidth();
                    long[] jArr3 = this.mo;
                    if (jArr3 != null) {
                        measuredWidth3 = qdl(jArr3[i9]);
                    }
                    int measuredHeight3 = viewUd.getMeasuredHeight();
                    long[] jArr4 = this.mo;
                    f2 = f5;
                    if (jArr4 != null) {
                        measuredHeight3 = ud(jArr4[i9]);
                    }
                    if (!this.mzz[i9] && udVar.mzz() > f) {
                        float fMzz2 = measuredWidth3 - (udVar.mzz() * f2);
                        if (i7 == lnrVar.jpc - 1) {
                            fMzz2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fMzz2);
                        if (iRound2 < udVar.wd()) {
                            iWd = udVar.wd();
                            this.mzz[i9] = true;
                            lnrVar.rq -= udVar.mzz();
                            z3 = true;
                        } else {
                            float f8 = (fMzz2 - iRound2) + f6;
                            double d2 = f8;
                            if (d2 > 1.0d) {
                                iWd = iRound2 + 1;
                                f8 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iWd = iRound2 - 1;
                                f8 += 1.0f;
                            } else {
                                iWd = iRound2;
                            }
                            f6 = f8;
                        }
                        int iUd = ud(i3, udVar, lnrVar.exu);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iWd, 1073741824);
                        viewUd.measure(iMakeMeasureSpec2, iUd);
                        int measuredWidth4 = viewUd.getMeasuredWidth();
                        int measuredHeight4 = viewUd.getMeasuredHeight();
                        qdl(i9, iMakeMeasureSpec2, iUd, viewUd);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i8, udVar.jtx() + udVar.rdp() + measuredHeight3 + this.mml.qdl(viewUd));
                    lnrVar.mzz = udVar.bjy() + udVar.exu() + measuredWidth3 + lnrVar.mzz;
                    iMax = iMax2;
                }
                lnrVar.wd = Math.max(lnrVar.wd, iMax);
                i8 = iMax;
            }
            i7++;
            f5 = f2;
            f4 = f;
        }
        if (!z3 || i6 == lnrVar.mzz) {
            return;
        }
        ud(i2, i3, lnrVar, i4, i5, true);
    }

    public void qdl(qdl qdlVar, int i2, int i3) {
        qdl(qdlVar, i2, i3, Integer.MAX_VALUE, 0, -1, (List<lnr>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void qdl(qdl qdlVar, int i2, int i3, int i4, int i5, int i6, List<lnr> list) {
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int iQdl;
        int i11;
        int i12;
        lnr lnrVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i2;
        boolean zQdl = this.mml.qdl();
        int mode = View.MeasureSpec.getMode(i18);
        int size = View.MeasureSpec.getSize(i18);
        List<lnr> arrayList = list == null ? new ArrayList() : list;
        qdlVar.qdl = arrayList;
        boolean z3 = i6 == -1;
        int iQdl2 = qdl(zQdl);
        int iUd = ud(zQdl);
        int iLnr = lnr(zQdl);
        int iMml = mml(zQdl);
        lnr lnrVar2 = new lnr();
        int i19 = i5;
        lnrVar2.bjy = i19;
        int i20 = iQdl2 + iUd;
        lnrVar2.mzz = i20;
        int flexItemCount = this.mml.getFlexItemCount();
        boolean z4 = z3;
        lnr lnrVar3 = lnrVar2;
        int i21 = Integer.MIN_VALUE;
        int i22 = 0;
        int iCombineMeasuredStates = 0;
        int i23 = 0;
        while (i19 < flexItemCount) {
            View viewUd = this.mml.ud(i19);
            if (viewUd == null) {
                if (qdl(i19, flexItemCount, lnrVar3)) {
                    qdl(arrayList, lnrVar3, i19, i22);
                }
                i8 = i20;
                z2 = true;
            } else {
                z2 = true;
                i8 = i20;
                if (viewUd.getVisibility() == 8) {
                    lnrVar3.tvp++;
                    lnrVar3.jpc++;
                    if (qdl(i19, flexItemCount, lnrVar3)) {
                        qdl(arrayList, lnrVar3, i19, i22);
                    }
                } else {
                    if (viewUd instanceof CompoundButton) {
                        qdl((CompoundButton) viewUd);
                    }
                    com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                    int i24 = flexItemCount;
                    if (udVar.mo() == 4) {
                        lnrVar3.rdp.add(Integer.valueOf(i19));
                    }
                    int iQdl3 = qdl(udVar, zQdl);
                    if (udVar.fs() != -1.0f && mode == 1073741824) {
                        iQdl3 = Math.round(udVar.fs() * size);
                    }
                    if (zQdl) {
                        iQdl = this.mml.qdl(i18, i8 + lnr(udVar, true) + mml(udVar, true), iQdl3);
                        i9 = i22;
                        int iUd2 = this.mml.ud(i3, iLnr + iMml + mzz(udVar, true) + mo(udVar, true) + i22, ud(udVar, true));
                        viewUd.measure(iQdl, iUd2);
                        qdl(i19, iQdl, iUd2, viewUd);
                        i10 = 0;
                    } else {
                        i9 = i22;
                        i10 = 0;
                        int iQdl4 = this.mml.qdl(i3, iLnr + iMml + mzz(udVar, false) + mo(udVar, false) + i9, ud(udVar, false));
                        int iUd3 = this.mml.ud(i18, i8 + lnr(udVar, false) + mml(udVar, false), iQdl3);
                        viewUd.measure(iQdl4, iUd3);
                        qdl(i19, iQdl4, iUd3, viewUd);
                        iQdl = iUd3;
                    }
                    qdl(viewUd, i19);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewUd.getMeasuredState());
                    int i25 = i10;
                    i11 = i19;
                    int i26 = iQdl;
                    lnr lnrVar4 = lnrVar3;
                    int i27 = i23;
                    i12 = i9;
                    size = size;
                    if (qdl(viewUd, mode, size, lnrVar3.mzz, qdl(viewUd, zQdl) + lnr(udVar, zQdl) + mml(udVar, zQdl), udVar, i11, i27, arrayList.size())) {
                        if (lnrVar4.ud() > 0) {
                            qdl(arrayList, lnrVar4, i11 > 0 ? i11 - 1 : i25, i12);
                            i17 = i12 + lnrVar4.wd;
                        } else {
                            i17 = i12;
                        }
                        if (zQdl) {
                            if (udVar.ud() == -1) {
                                com.bytedance.adsdk.ugeno.mzz.qdl qdlVar2 = this.mml;
                                viewUd.measure(i26, qdlVar2.ud(i3, udVar.jtx() + udVar.rdp() + qdlVar2.getPaddingTop() + this.mml.getPaddingBottom() + i17, udVar.ud()));
                                qdl(viewUd, i11);
                            }
                        } else if (udVar.qdl() == -1) {
                            com.bytedance.adsdk.ugeno.mzz.qdl qdlVar3 = this.mml;
                            viewUd.measure(qdlVar3.qdl(i3, udVar.bjy() + udVar.exu() + qdlVar3.getPaddingLeft() + this.mml.getPaddingRight() + i17, udVar.qdl()), i26);
                            qdl(viewUd, i11);
                        }
                        lnr lnrVar5 = new lnr();
                        lnrVar5.jpc = 1;
                        i13 = i8;
                        lnrVar5.mzz = i13;
                        lnrVar5.bjy = i11;
                        i12 = i17;
                        i15 = Integer.MIN_VALUE;
                        lnrVar = lnrVar5;
                        i14 = i25;
                    } else {
                        lnrVar = lnrVar4;
                        i13 = i8;
                        lnrVar.jpc++;
                        i14 = i27 + 1;
                        i15 = i21;
                    }
                    lnrVar.yt = (lnrVar.yt ? 1 : 0) | (udVar.mml() != 0.0f ? 1 : i25);
                    lnrVar.jl = (lnrVar.jl ? 1 : 0) | (udVar.mzz() != 0.0f ? 1 : i25);
                    int[] iArr = this.qdl;
                    if (iArr != null) {
                        iArr[i11] = arrayList.size();
                    }
                    lnrVar.mzz = qdl(viewUd, zQdl) + lnr(udVar, zQdl) + mml(udVar, zQdl) + lnrVar.mzz;
                    lnrVar.to = udVar.mml() + lnrVar.to;
                    lnrVar.rq = udVar.mzz() + lnrVar.rq;
                    this.mml.qdl(viewUd, i11, i14, lnrVar);
                    int iMax = Math.max(i15, ud(viewUd, zQdl) + mzz(udVar, zQdl) + mo(udVar, zQdl) + this.mml.qdl(viewUd));
                    lnrVar.wd = Math.max(lnrVar.wd, iMax);
                    if (zQdl) {
                        if (this.mml.getFlexWrap() != 2) {
                            lnrVar.fs = Math.max(lnrVar.fs, udVar.rdp() + viewUd.getBaseline());
                        } else {
                            lnrVar.fs = Math.max(lnrVar.fs, udVar.jtx() + (viewUd.getMeasuredHeight() - viewUd.getBaseline()));
                        }
                    }
                    i16 = i24;
                    if (qdl(i11, i16, lnrVar)) {
                        qdl(arrayList, lnrVar, i11, i12);
                        i12 += lnrVar.wd;
                    }
                    if (i6 != -1 && arrayList.size() > 0) {
                        if (((lnr) androidx.media3.extractor.text.ttml.a.h(1, arrayList)).jtx >= i6 && i11 >= i6 && !z4) {
                            i12 = -lnrVar.qdl();
                            z4 = true;
                        }
                    }
                    if (i12 > i4 && z4) {
                        i7 = iCombineMeasuredStates;
                        qdlVar.ud = i7;
                    } else {
                        i23 = i14;
                        i21 = iMax;
                    }
                }
                flexItemCount = i16;
                i19 = i11 + 1;
                i20 = i13;
                lnrVar3 = lnrVar;
                i22 = i12;
                mode = mode;
                i18 = i2;
            }
            i11 = i19;
            mode = mode;
            i16 = flexItemCount;
            i12 = i22;
            i13 = i8;
            lnrVar = lnrVar3;
            flexItemCount = i16;
            i19 = i11 + 1;
            i20 = i13;
            lnrVar3 = lnrVar;
            i22 = i12;
            mode = mode;
            i18 = i2;
        }
        i7 = iCombineMeasuredStates;
        qdlVar.ud = i7;
    }

    private int ud(int i2, com.bytedance.adsdk.ugeno.mzz.ud udVar, int i3) {
        com.bytedance.adsdk.ugeno.mzz.qdl qdlVar = this.mml;
        int iUd = qdlVar.ud(i2, udVar.jtx() + udVar.rdp() + qdlVar.getPaddingTop() + this.mml.getPaddingBottom() + i3, udVar.ud());
        int size = View.MeasureSpec.getSize(iUd);
        if (size > udVar.to()) {
            return View.MeasureSpec.makeMeasureSpec(udVar.to(), View.MeasureSpec.getMode(iUd));
        }
        return size < udVar.jpc() ? View.MeasureSpec.makeMeasureSpec(udVar.jpc(), View.MeasureSpec.getMode(iUd)) : iUd;
    }

    public void ud(int i2, int i3, int i4) {
        int mode;
        int size;
        int flexDirection = this.mml.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else {
            int mode2 = View.MeasureSpec.getMode(i3);
            int size2 = View.MeasureSpec.getSize(i3);
            mode = mode2;
            size = size2;
        }
        List<lnr> flexLinesInternal = this.mml.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.mml.getSumOfCrossSize() + i4;
            int i5 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).wd = size - i4;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.mml.getAlignContent();
                if (alignContent == 1) {
                    int i6 = size - sumOfCrossSize;
                    lnr lnrVar = new lnr();
                    lnrVar.wd = i6;
                    flexLinesInternal.add(0, lnrVar);
                    return;
                }
                if (alignContent == 2) {
                    this.mml.setFlexLines(qdl(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i5 < size4) {
                            arrayList.add(flexLinesInternal.get(i5));
                            if (i5 != flexLinesInternal.size() - 1) {
                                lnr lnrVar2 = new lnr();
                                if (i5 == flexLinesInternal.size() - 2) {
                                    lnrVar2.wd = Math.round(f + size3);
                                    f = 0.0f;
                                } else {
                                    lnrVar2.wd = Math.round(size3);
                                }
                                int i7 = lnrVar2.wd;
                                float f2 = (size3 - i7) + f;
                                if (f2 > 1.0f) {
                                    lnrVar2.wd = i7 + 1;
                                    f2 -= 1.0f;
                                } else if (f2 < -1.0f) {
                                    lnrVar2.wd = i7 - 1;
                                    f2 += 1.0f;
                                }
                                f = f2;
                                arrayList.add(lnrVar2);
                            }
                            i5++;
                        }
                        this.mml.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.mml.setFlexLines(qdl(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    lnr lnrVar3 = new lnr();
                    lnrVar3.wd = size5;
                    for (lnr lnrVar4 : flexLinesInternal) {
                        arrayList2.add(lnrVar3);
                        arrayList2.add(lnrVar4);
                        arrayList2.add(lnrVar3);
                    }
                    this.mml.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i5 < size7) {
                        lnr lnrVar5 = flexLinesInternal.get(i5);
                        float f4 = lnrVar5.wd + size6;
                        if (i5 == flexLinesInternal.size() - 1) {
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
                        lnrVar5.wd = iRound;
                        i5++;
                    }
                }
            }
        }
    }

    private void qdl(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) compoundButton.getLayoutParams();
        int iWd = udVar.wd();
        int iJpc = udVar.jpc();
        Drawable drawableQdl = com.bytedance.adsdk.ugeno.wd.mzz.qdl(compoundButton);
        int minimumWidth = drawableQdl == null ? 0 : drawableQdl.getMinimumWidth();
        int minimumHeight = drawableQdl != null ? drawableQdl.getMinimumHeight() : 0;
        if (iWd == -1) {
            iWd = minimumWidth;
        }
        udVar.qdl(iWd);
        if (iJpc == -1) {
            iJpc = minimumHeight;
        }
        udVar.ud(iJpc);
    }

    private int qdl(boolean z2) {
        if (z2) {
            return this.mml.getPaddingStart();
        }
        return this.mml.getPaddingTop();
    }

    private void ud(View view, int i2, int i3) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i2 - udVar.exu()) - udVar.bjy()) - this.mml.qdl(view), udVar.wd()), udVar.tvp());
        long[] jArr = this.mo;
        if (jArr != null) {
            measuredHeight = ud(jArr[i3]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        qdl(i3, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int qdl(View view, boolean z2) {
        if (z2) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private int qdl(com.bytedance.adsdk.ugeno.mzz.ud udVar, boolean z2) {
        if (z2) {
            return udVar.qdl();
        }
        return udVar.ud();
    }

    private boolean qdl(View view, int i2, int i3, int i4, int i5, com.bytedance.adsdk.ugeno.mzz.ud udVar, int i6, int i7, int i8) {
        if (this.mml.getFlexWrap() == 0) {
            return false;
        }
        if (udVar.rq()) {
            return true;
        }
        if (i2 == 0) {
            return false;
        }
        int maxLine = this.mml.getMaxLine();
        if (maxLine != -1 && maxLine <= i8 + 1) {
            return false;
        }
        int iQdl = this.mml.qdl(view, i6, i7);
        if (iQdl > 0) {
            i5 += iQdl;
        }
        return i3 < i4 + i5;
    }

    private boolean qdl(int i2, int i3, lnr lnrVar) {
        return i2 == i3 - 1 && lnrVar.ud() != 0;
    }

    private void qdl(List<lnr> list, lnr lnrVar, int i2, int i3) {
        lnrVar.exu = i3;
        this.mml.qdl(lnrVar);
        lnrVar.jtx = i2;
        list.add(lnrVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void qdl(View view, int i2) {
        boolean z2;
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z3 = true;
        if (measuredWidth < udVar.wd()) {
            measuredWidth = udVar.wd();
        } else {
            if (measuredWidth > udVar.tvp()) {
                measuredWidth = udVar.tvp();
            } else {
                z2 = false;
            }
            if (measuredHeight < udVar.jpc()) {
                measuredHeight = udVar.jpc();
            } else if (measuredHeight > udVar.to()) {
                measuredHeight = udVar.to();
            } else {
                z3 = z2;
            }
            if (z3) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                qdl(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z2 = true;
        if (measuredHeight < udVar.jpc()) {
            measuredHeight = udVar.jpc();
        } else if (measuredHeight > udVar.to()) {
            measuredHeight = udVar.to();
        } else {
            z3 = z2;
        }
        if (z3) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            qdl(i2, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    public void qdl(int i2, int i3) {
        qdl(i2, i3, 0);
    }

    public void qdl(int i2, int i3, int i4) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        lnr(this.mml.getFlexItemCount());
        if (i4 >= this.mml.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mml.getFlexDirection();
        int flexDirection2 = this.mml.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            int largestMainSize = this.mml.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.mml.getPaddingLeft();
            paddingRight = this.mml.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i3);
            size = View.MeasureSpec.getSize(i3);
            if (mode2 != 1073741824) {
                size = this.mml.getLargestMainSize();
            }
            paddingLeft = this.mml.getPaddingTop();
            paddingRight = this.mml.getPaddingBottom();
        }
        int i7 = paddingLeft + paddingRight;
        int i8 = size;
        int[] iArr = this.qdl;
        int i9 = iArr != null ? iArr[i4] : 0;
        List<lnr> flexLinesInternal = this.mml.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i9 < size2) {
            lnr lnrVar = flexLinesInternal.get(i9);
            int i10 = lnrVar.mzz;
            if (i10 < i8 && lnrVar.yt) {
                i5 = i2;
                i6 = i3;
                qdl(i5, i6, lnrVar, i8, i7, false);
            } else {
                i5 = i2;
                i6 = i3;
                if (i10 > i8 && lnrVar.jl) {
                    ud(i5, i6, lnrVar, i8, i7, false);
                }
            }
            i9++;
            i2 = i5;
            i3 = i6;
        }
    }

    private void qdl(int i2, int i3, lnr lnrVar, int i4, int i5, boolean z2) {
        int i6;
        float f;
        float f2;
        int iMax;
        double d;
        double d2;
        float f3 = lnrVar.to;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i4 < (i6 = lnrVar.mzz)) {
            return;
        }
        float f5 = (i4 - i6) / f3;
        lnrVar.mzz = i5 + lnrVar.mo;
        if (!z2) {
            lnrVar.wd = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z3 = false;
        int i8 = 0;
        float f6 = 0.0f;
        while (i7 < lnrVar.jpc) {
            int i9 = lnrVar.bjy + i7;
            View viewUd = this.mml.ud(i9);
            if (viewUd == null || viewUd.getVisibility() == 8) {
                f = f4;
                f2 = f5;
                z3 = z3;
            } else {
                com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                int flexDirection = this.mml.getFlexDirection();
                f = f4;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewUd.getMeasuredHeight();
                    long[] jArr = this.mo;
                    if (jArr != null) {
                        measuredHeight = ud(jArr[i9]);
                    }
                    int measuredWidth = viewUd.getMeasuredWidth();
                    long[] jArr2 = this.mo;
                    f2 = f5;
                    boolean z4 = z3;
                    if (jArr2 != null) {
                        measuredWidth = qdl(jArr2[i9]);
                    }
                    if (this.mzz[i9] || udVar.mml() <= f) {
                        z3 = z4;
                    } else {
                        float fMml = (udVar.mml() * f2) + measuredHeight;
                        if (i7 == lnrVar.jpc - 1) {
                            fMml += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fMml);
                        if (iRound > udVar.to()) {
                            iRound = udVar.to();
                            this.mzz[i9] = true;
                            lnrVar.to -= udVar.mml();
                            z3 = true;
                        } else {
                            float f7 = (fMml - iRound) + f6;
                            double d3 = f7;
                            if (d3 > 1.0d) {
                                iRound++;
                                d2 = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d2 = d3 + 1.0d;
                                }
                                f6 = f7;
                                z3 = z4;
                            }
                            f7 = (float) d2;
                            f6 = f7;
                            z3 = z4;
                        }
                        int iQdl = qdl(i2, udVar, lnrVar.exu);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewUd.measure(iQdl, iMakeMeasureSpec);
                        int measuredWidth2 = viewUd.getMeasuredWidth();
                        int measuredHeight2 = viewUd.getMeasuredHeight();
                        qdl(i9, iQdl, iMakeMeasureSpec, viewUd);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i8, udVar.bjy() + udVar.exu() + measuredWidth + this.mml.qdl(viewUd));
                    lnrVar.mzz = udVar.jtx() + udVar.rdp() + measuredHeight + lnrVar.mzz;
                } else {
                    f2 = f5;
                    boolean z5 = z3;
                    int measuredWidth3 = viewUd.getMeasuredWidth();
                    long[] jArr3 = this.mo;
                    if (jArr3 != null) {
                        measuredWidth3 = qdl(jArr3[i9]);
                    }
                    int measuredHeight3 = viewUd.getMeasuredHeight();
                    long[] jArr4 = this.mo;
                    if (jArr4 != null) {
                        measuredHeight3 = ud(jArr4[i9]);
                    }
                    if (this.mzz[i9] || udVar.mml() <= f) {
                        z3 = z5;
                    } else {
                        float fMml2 = (udVar.mml() * f2) + measuredWidth3;
                        if (i7 == lnrVar.jpc - 1) {
                            fMml2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fMml2);
                        if (iRound2 > udVar.tvp()) {
                            iRound2 = udVar.tvp();
                            this.mzz[i9] = true;
                            lnrVar.to -= udVar.mml();
                            z3 = true;
                        } else {
                            float f8 = (fMml2 - iRound2) + f6;
                            double d4 = f8;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d = d4 + 1.0d;
                                }
                                f6 = f8;
                                z3 = z5;
                            }
                            f8 = (float) d;
                            f6 = f8;
                            z3 = z5;
                        }
                        int iUd = ud(i3, udVar, lnrVar.exu);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewUd.measure(iMakeMeasureSpec2, iUd);
                        int measuredWidth4 = viewUd.getMeasuredWidth();
                        int measuredHeight4 = viewUd.getMeasuredHeight();
                        qdl(i9, iMakeMeasureSpec2, iUd, viewUd);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i8, udVar.jtx() + udVar.rdp() + measuredHeight3 + this.mml.qdl(viewUd));
                    lnrVar.mzz = udVar.bjy() + udVar.exu() + measuredWidth3 + lnrVar.mzz;
                    iMax = iMax2;
                }
                lnrVar.wd = Math.max(lnrVar.wd, iMax);
                i8 = iMax;
            }
            i7++;
            f5 = f2;
            f4 = f;
        }
        if (!z3 || i6 == lnrVar.mzz) {
            return;
        }
        qdl(i2, i3, lnrVar, i4, i5, true);
    }

    private int qdl(int i2, com.bytedance.adsdk.ugeno.mzz.ud udVar, int i3) {
        com.bytedance.adsdk.ugeno.mzz.qdl qdlVar = this.mml;
        int iQdl = qdlVar.qdl(i2, udVar.bjy() + udVar.exu() + qdlVar.getPaddingLeft() + this.mml.getPaddingRight() + i3, udVar.qdl());
        int size = View.MeasureSpec.getSize(iQdl);
        if (size > udVar.tvp()) {
            return View.MeasureSpec.makeMeasureSpec(udVar.tvp(), View.MeasureSpec.getMode(iQdl));
        }
        return size < udVar.wd() ? View.MeasureSpec.makeMeasureSpec(udVar.wd(), View.MeasureSpec.getMode(iQdl)) : iQdl;
    }

    private List<lnr> qdl(List<lnr> list, int i2, int i3) {
        int i4 = (i2 - i3) / 2;
        ArrayList arrayList = new ArrayList();
        lnr lnrVar = new lnr();
        lnrVar.wd = i4;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 == 0) {
                arrayList.add(lnrVar);
            }
            arrayList.add(list.get(i5));
            if (i5 == list.size() - 1) {
                arrayList.add(lnrVar);
            }
        }
        return arrayList;
    }

    public void qdl() {
        qdl(0);
    }

    public void qdl(int i2) {
        View viewUd;
        if (i2 >= this.mml.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.mml.getFlexDirection();
        if (this.mml.getAlignItems() == 4) {
            int[] iArr = this.qdl;
            List<lnr> flexLinesInternal = this.mml.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
                lnr lnrVar = flexLinesInternal.get(i3);
                int i4 = lnrVar.jpc;
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = lnrVar.bjy + i5;
                    if (i5 < this.mml.getFlexItemCount() && (viewUd = this.mml.ud(i6)) != null && viewUd.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) viewUd.getLayoutParams();
                        if (udVar.mo() == -1 || udVar.mo() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                ud(viewUd, lnrVar.wd, i6);
                            } else {
                                qdl(viewUd, lnrVar.wd, i6);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (lnr lnrVar2 : this.mml.getFlexLinesInternal()) {
            for (Integer num : lnrVar2.rdp) {
                View viewUd2 = this.mml.ud(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    ud(viewUd2, lnrVar2.wd, num.intValue());
                } else {
                    qdl(viewUd2, lnrVar2.wd, num.intValue());
                }
            }
        }
    }

    private void qdl(View view, int i2, int i3) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i2 - udVar.rdp()) - udVar.jtx()) - this.mml.qdl(view), udVar.jpc()), udVar.to());
        long[] jArr = this.mo;
        if (jArr != null) {
            measuredWidth = qdl(jArr[i3]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        qdl(i3, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public void qdl(View view, lnr lnrVar, int i2, int i3, int i4, int i5) {
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int alignItems = this.mml.getAlignItems();
        if (udVar.mo() != -1) {
            alignItems = udVar.mo();
        }
        int i6 = lnrVar.wd;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.mml.getFlexWrap() != 2) {
                    int i7 = i3 + i6;
                    view.layout(i2, (i7 - view.getMeasuredHeight()) - udVar.jtx(), i4, i7 - udVar.jtx());
                    return;
                }
                view.layout(i2, udVar.rdp() + view.getMeasuredHeight() + (i3 - i6), i4, udVar.rdp() + view.getMeasuredHeight() + (i5 - i6));
                return;
            }
            if (alignItems == 2) {
                int iRdp = ((udVar.rdp() + (i6 - view.getMeasuredHeight())) - udVar.jtx()) / 2;
                if (this.mml.getFlexWrap() != 2) {
                    int i8 = i3 + iRdp;
                    view.layout(i2, i8, i4, view.getMeasuredHeight() + i8);
                    return;
                } else {
                    int i9 = i3 - iRdp;
                    view.layout(i2, i9, i4, view.getMeasuredHeight() + i9);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.mml.getFlexWrap() != 2) {
                    int iMax = Math.max(lnrVar.fs - view.getBaseline(), udVar.rdp());
                    view.layout(i2, i3 + iMax, i4, i5 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (lnrVar.fs - view.getMeasuredHeight()), udVar.jtx());
                    view.layout(i2, i3 - iMax2, i4, i5 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.mml.getFlexWrap() != 2) {
            view.layout(i2, udVar.rdp() + i3, i4, udVar.rdp() + i5);
        } else {
            view.layout(i2, i3 - udVar.jtx(), i4, i5 - udVar.jtx());
        }
    }

    public void qdl(View view, lnr lnrVar, boolean z2, int i2, int i3, int i4, int i5) {
        com.bytedance.adsdk.ugeno.mzz.ud udVar = (com.bytedance.adsdk.ugeno.mzz.ud) view.getLayoutParams();
        int alignItems = this.mml.getAlignItems();
        if (udVar.mo() != -1) {
            alignItems = udVar.mo();
        }
        int i6 = lnrVar.wd;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z2) {
                    view.layout(((i2 + i6) - view.getMeasuredWidth()) - udVar.bjy(), i3, ((i4 + i6) - view.getMeasuredWidth()) - udVar.bjy(), i5);
                    return;
                }
                view.layout(udVar.exu() + view.getMeasuredWidth() + (i2 - i6), i3, udVar.exu() + view.getMeasuredWidth() + (i4 - i6), i5);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int iQdl = ((com.bytedance.adsdk.ugeno.wd.mo.qdl(marginLayoutParams) + (i6 - view.getMeasuredWidth())) - com.bytedance.adsdk.ugeno.wd.mo.ud(marginLayoutParams)) / 2;
                if (!z2) {
                    view.layout(i2 + iQdl, i3, i4 + iQdl, i5);
                    return;
                } else {
                    view.layout(i2 - iQdl, i3, i4 - iQdl, i5);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z2) {
            view.layout(udVar.exu() + i2, i3, udVar.exu() + i4, i5);
        } else {
            view.layout(i2 - udVar.bjy(), i3, i4 - udVar.bjy(), i5);
        }
    }

    private void qdl(int i2, int i3, int i4, View view) {
        long[] jArr = this.ud;
        if (jArr != null) {
            jArr[i2] = ud(i3, i4);
        }
        long[] jArr2 = this.mo;
        if (jArr2 != null) {
            jArr2[i2] = ud(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
