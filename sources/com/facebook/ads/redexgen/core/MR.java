package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class MR extends C1994bk {
    public static String[] A01 = {"Er9uQMazYAvywc84qssi8CcPD5K", "bpAOsy1ZAool4ZO", "456cLSbicHverE2", "OQn0GSeoKkB55mmrW6XfcsGu8yTW4vwY", "5C5KK7QE3ZVmFSCl85soxjy8aya", "FZZqXqYfqR5sLOGe", "aaYiwVUQ6XuTYr3PnCNNWh", "fICxnQOCOsz8JBbFc5EZnQUEppLIkjem"};
    public ImageView.ScaleType A00;

    public MR(C2300gi c2300gi) {
        super(c2300gi);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int heightSpecSize;
        int heightSpecSize2;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int heightSpecSize3 = View.MeasureSpec.getMode(i2);
        if (heightSpecSize3 == 1073741824) {
            int heightSpecSize4 = View.MeasureSpec.getMode(i3);
            if (heightSpecSize4 == 1073741824) {
                int heightSpecSize5 = Math.min(size2, size);
                setMeasuredDimension(heightSpecSize5, heightSpecSize5);
            } else {
                heightSpecSize = View.MeasureSpec.getMode(i2);
                if (heightSpecSize == 1073741824) {
                    if (size > 0) {
                        size2 = Math.min(size2, size);
                    }
                    setMeasuredDimension(size2, size2);
                } else {
                    heightSpecSize2 = View.MeasureSpec.getMode(i3);
                    if (heightSpecSize2 == 1073741824) {
                        if (size2 > 0) {
                            size = Math.min(size2, size);
                        }
                        setMeasuredDimension(size, size);
                    } else {
                        super.onMeasure(i2, i3);
                    }
                }
            }
        } else {
            heightSpecSize = View.MeasureSpec.getMode(i2);
            if (heightSpecSize == 1073741824) {
                if (size > 0) {
                    size2 = Math.min(size2, size);
                }
                setMeasuredDimension(size2, size2);
            } else {
                heightSpecSize2 = View.MeasureSpec.getMode(i3);
                if (heightSpecSize2 == 1073741824) {
                    if (size2 > 0) {
                        size = Math.min(size2, size);
                    }
                    setMeasuredDimension(size, size);
                } else {
                    super.onMeasure(i2, i3);
                }
            }
        }
        if (this.A00 != null) {
            ImageView.ScaleType scaleType = this.A00;
            int widthSpecSize = A01[2].length();
            if (widthSpecSize != 15) {
                throw new RuntimeException();
            }
            A01[0] = "1TQeY3NJoCywMKTf";
            super.setScaleType(scaleType);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
