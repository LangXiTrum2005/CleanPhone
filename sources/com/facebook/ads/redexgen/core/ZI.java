package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ZI extends ImageView {
    public static String[] A01 = {"zJ2", "QjUwZCbDUlfOcmdTeXyvd13", "pmgXUgQY3G9embGve5GBnFw0VEVT9oeH", "awdDomzwyqRyeOiEyYHeXSv00pR55TnX", "BJj1MoNnpM6JKdO5Mh8uM61yAFI5TCy", "1E", "dRD1sNctYpeCeu2V1pPS6WM", "8C9irfg3VZNd6lZFm"};
    public ImageView.ScaleType A00;

    public ZI(C2300gi c2300gi) {
        super(c2300gi);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i3) {
        int heightSpecSize;
        int mode;
        int widthSpecSize;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int heightSpecSize2 = View.MeasureSpec.getMode(i2);
        if (heightSpecSize2 == 1073741824) {
            int heightSpecSize3 = View.MeasureSpec.getMode(i3);
            if (heightSpecSize3 == 1073741824) {
                int heightSpecSize4 = Math.min(size2, size);
                setMeasuredDimension(heightSpecSize4, heightSpecSize4);
            } else {
                heightSpecSize = View.MeasureSpec.getMode(i2);
                if (heightSpecSize == 1073741824) {
                    if (size > 0) {
                        size2 = Math.min(size2, size);
                    }
                    setMeasuredDimension(size2, size2);
                } else {
                    mode = View.MeasureSpec.getMode(i3);
                    widthSpecSize = A01[6].length();
                    if (widthSpecSize != 25) {
                        throw new RuntimeException();
                    }
                    A01[7] = "z6sTWRHNr9jgarJvj";
                    if (mode == 1073741824) {
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
                mode = View.MeasureSpec.getMode(i3);
                widthSpecSize = A01[6].length();
                if (widthSpecSize != 25) {
                    throw new RuntimeException();
                }
                A01[7] = "z6sTWRHNr9jgarJvj";
                if (mode == 1073741824) {
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
            super.setScaleType(this.A00);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
