package com.facebook.ads.redexgen.core;

import android.R;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1283b5 extends RelativeLayout implements IQ {
    public static byte[] A09;
    public static String[] A0A = {"QrML4Ecz92sfYCeCtaSnFCosFmipGlTz", "VhmrcYjsqpOA7Iy", "ZK9HRS350jRidth", "ZjYoflRzQYTDfI0m0JAvuVl9vp7GlkSu", "MmC", "ZvQ3uBw3DQ7M1xesozkO3pU9", "XD5i8EmzP8U96tjWoOsk6YaJBmNCgDM7", "cjtQcAKtxYCLU"};
    public static final int A0B;
    public static final int A0C;
    public int A00;
    public int A01;
    public ObjectAnimator A02;
    public ProgressBar A03;
    public C9K A04;
    public C9K A05;
    public C9K A06;
    public C9K A07;
    public C1361cL A08;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        String[] strArr = A0A;
        if (strArr[0].charAt(7) != strArr[6].charAt(7)) {
            throw new RuntimeException();
        }
        A0A[4] = "F3xM2b87YXaGRbor1WnSFNsn05JfW";
        A09 = new byte[]{-5, -3, -6, -14, -3, -16, -2, -2};
    }

    static {
        A03();
        A0B = (int) (CP.A02 * 8.0f);
        A0C = (int) (CP.A02 * 6.0f);
    }

    public C1283b5(C1828k1 c1828k1, int i) {
        this(c1828k1, A0C, -12549889, 0, i);
    }

    public C1283b5(C1828k1 c1828k1, int i, int i2) {
        this(c1828k1, i2, -12549889, 0, i);
    }

    public C1283b5(C1828k1 c1828k1, int i, int i2, int i3, int i4) {
        super(c1828k1);
        this.A01 = -1;
        this.A07 = new IW(this);
        this.A05 = new IA(this);
        this.A06 = new C0765Hj(this);
        this.A04 = new C0764Hi(this);
        this.A00 = i4;
        this.A03 = new ProgressBar(c1828k1, null, R.attr.progressBarStyleHorizontal);
        A06(i2, i3, false);
        this.A03.setMax(10000);
        addView(this.A03, new RelativeLayout.LayoutParams(-1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A02 != null) {
            this.A02.cancel();
            this.A02.setTarget(null);
            this.A02 = null;
            this.A03.clearAnimation();
        }
    }

    public final void A05() {
        A02();
        this.A02 = ObjectAnimator.ofInt(this.A03, A01(0, 8, 56), 0, 0);
        this.A02.setDuration(0L);
        this.A02.setInterpolator(new LinearInterpolator());
        this.A02.start();
        this.A01 = -1;
    }

    public final void A06(int i, int i2, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i);
        if (z) {
            gradientDrawable.setCornerRadius(40.0f);
            gradientDrawable2.setCornerRadius(40.0f);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ColorDrawable(i2), new ScaleDrawable(gradientDrawable2, GravityCompat.START, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        this.A03.setProgressDrawable(layerDrawable);
    }

    public final void A07(boolean z) {
        if (this.A08 == null) {
            return;
        }
        A02();
        int currentPositionInMillis = this.A08.getCurrentPositionInMillis();
        int position = this.A00;
        int duration = position == -1 ? this.A08.getDuration() : this.A00;
        int progress = duration > 0 ? (currentPositionInMillis * 10000) / duration : 0;
        int position2 = this.A01;
        if (position2 >= progress || duration <= currentPositionInMillis) {
            int position3 = this.A00;
            if (position3 != -1) {
                ProgressBar progressBar = this.A03;
                int duration2 = A0A[4].length();
                if (duration2 == 30) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[1] = "syTqF0L9nDi3kEs";
                strArr[2] = "uJUK3R2iV2qYkdz";
                if (progressBar != null) {
                    int position4 = this.A03.getProgress();
                    if (position4 < 10000) {
                        ProgressBar progressBar2 = this.A03;
                        int duration3 = A0A[7].length();
                        if (duration3 != 13) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[1] = "gPPa1eoNR6fU59j";
                        strArr2[2] = "tP1o0tbkokKAn2S";
                        progressBar2.setProgress(10000);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            ProgressBar progressBar3 = this.A03;
            int position5 = this.A01;
            this.A02 = ObjectAnimator.ofInt(progressBar3, A01(0, 8, 56), position5, progress);
            ObjectAnimator objectAnimator = this.A02;
            int position6 = Math.min(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, duration - currentPositionInMillis);
            objectAnimator.setDuration(position6);
            this.A02.setInterpolator(new LinearInterpolator());
            this.A02.start();
        } else {
            this.A03.setProgress(progress);
        }
        this.A01 = progress;
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AAk(C1361cL c1361cL) {
        this.A08 = c1361cL;
        c1361cL.getEventBus().A03(this.A05, this.A06, this.A07, this.A04);
    }

    @Override // com.facebook.ads.redexgen.core.IQ
    public final void AJa(C1361cL c1361cL) {
        c1361cL.getEventBus().A04(this.A07, this.A06, this.A05, this.A04);
        this.A08 = null;
    }
}
