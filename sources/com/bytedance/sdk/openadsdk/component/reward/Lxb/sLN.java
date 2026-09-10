package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class sLN {
    private final com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb LD;
    protected int Lxb;
    private Lxb ZU;
    private boolean lk = true;

    public static abstract class Lxb implements View.OnLayoutChangeListener {
        private int LD;
        private int Lxb;

        private Lxb() {
        }

        public abstract void Lxb(int i, int i2);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.Lxb && i10 == this.LD) {
                return;
            }
            this.Lxb = i9;
            this.LD = i10;
            Lxb(i9, i10);
        }
    }

    public sLN(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.Lxb = 0;
        this.LD = lxb;
        lk();
        if (lxb.Lxb == 2) {
            return;
        }
        try {
            this.Lxb = le.ZU(lxb.Pw, le.Lxb());
            if (!lxb.Pw.getWindow().hasFeature(1)) {
                lxb.Pw.requestWindowFeature(1);
            }
            lxb.Pw.getWindow().addFlags(16777344);
            if (lxb.Ns == 2 || !le.lk(lxb.Pw)) {
                lxb.Pw.getWindow().addFlags(1024);
            }
        } catch (Throwable unused) {
        }
    }

    private float JXs() {
        return le.ZU(this.LD.Pw, le.nBu(this.LD.Pw));
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void ZU() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        if (lxb.Ns != 2) {
            Lxb(lxb.Pw, 1);
        } else if (lxb.SS) {
            Lxb(lxb.Pw, 8);
        } else {
            Lxb(lxb.Pw, 0);
        }
    }

    private float lc() {
        return le.ZU(this.LD.Pw, le.QAg(this.LD.Pw));
    }

    private void lk() {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
        lxb.Sv = lxb.LD.Za();
        if (26 != Build.VERSION.SDK_INT) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
            lxb2.Ns = lxb2.LD.wCT();
        } else if (this.LD.Pw.getResources().getConfiguration().orientation == 1) {
            this.LD.Ns = 1;
        } else {
            this.LD.Ns = 2;
        }
    }

    public void LD(aH aHVar) {
        try {
            com.bytedance.sdk.openadsdk.activity.lc lcVar = this.LD.FGm;
            if (lcVar == null || lcVar.QAg <= 0) {
                final boolean z = true;
                final boolean z2 = this.lk && com.bytedance.sdk.openadsdk.core.kqm.ZU().le() == 1;
                if (!this.lk || !le.lk(this.LD.Pw)) {
                    z = false;
                }
                if (z || z2) {
                    if (this.ZU == null) {
                        this.ZU = new Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.sLN.2
                            boolean Lxb;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super();
                            }

                            /* JADX WARN: Code duplicated, block: B:28:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Code duplicated, block: B:31:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
                            @Override // com.bytedance.sdk.openadsdk.component.reward.Lxb.sLN.Lxb
                            public void Lxb(int i, int i2) {
                                int iAbs;
                                float fLxb;
                                try {
                                    if (sLN.this.LD.Ns == 2 && sLN.this.LD.Pw.getResources().getConfiguration().orientation == 2) {
                                        iAbs = Math.abs(le.nBu(sLN.this.LD.Pw) - sLN.this.LD.Pw.getWindow().getDecorView().getWidth());
                                    } else {
                                        iAbs = Math.abs(le.QAg(sLN.this.LD.Pw) - sLN.this.LD.Pw.getWindow().getDecorView().getHeight());
                                    }
                                    View decorView = sLN.this.LD.Pw.getWindow().getDecorView();
                                    int paddingLeft = decorView.getPaddingLeft();
                                    int paddingRight = decorView.getPaddingRight();
                                    int paddingBottom = decorView.getPaddingBottom();
                                    if (iAbs != 0) {
                                        if (this.Lxb) {
                                            decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                            this.Lxb = false;
                                            return;
                                        }
                                        return;
                                    }
                                    int paddingTop = decorView.getPaddingTop();
                                    if (sLN.this.LD.Ns != 1 || sLN.this.LD.Pw.getResources().getConfiguration().orientation != 1) {
                                        if (sLN.this.LD.Ns == 2 && sLN.this.LD.Pw.getResources().getConfiguration().orientation == 2) {
                                            if (z) {
                                                paddingLeft += (int) le.Lxb();
                                            }
                                            if (z2) {
                                                fLxb = le.Lxb();
                                            }
                                        }
                                        if (decorView.isAttachedToWindow()) {
                                            decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                            this.Lxb = true;
                                        }
                                        if (sLN.this.LD.Sv == 100.0f) {
                                            decorView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                        }
                                    }
                                    fLxb = le.Lxb();
                                    paddingTop += (int) fLxb;
                                    if (decorView.isAttachedToWindow()) {
                                        decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                        this.Lxb = true;
                                    }
                                    if (sLN.this.LD.Sv == 100.0f) {
                                        decorView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        };
                    }
                    this.LD.Pw.getWindow().getDecorView().addOnLayoutChangeListener(this.ZU);
                }
                this.lk = false;
            }
        } catch (Exception unused) {
        }
    }

    public void Lxb(aH aHVar) {
        if (aHVar == null) {
            return;
        }
        aHVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.sLN.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = sLN.this.LD.Pw.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    public void Lxb(boolean z) {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 != 26) {
            if (i2 == 27) {
                try {
                    ZU();
                } catch (Throwable unused) {
                }
            } else {
                ZU();
            }
        }
        float fJXs = JXs();
        float fLc = lc();
        if (this.LD.Ns == 2) {
            fMin = Math.max(fJXs, fLc);
            fMax = Math.min(fJXs, fLc);
        } else {
            fMin = Math.min(fJXs, fLc);
            fMax = Math.max(fJXs, fLc);
        }
        Activity activity = this.LD.Pw;
        int iZU = le.ZU(activity, le.Lxb());
        if (this.LD.Ns != 2) {
            if (le.lk(activity)) {
                fMax -= iZU;
            }
        } else if (le.lk(activity)) {
            fMin -= iZU;
        }
        if (z) {
            com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.LD;
            lxb.uxf = (int) fMin;
            lxb.Nu = (int) fMax;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.LD;
        int i3 = 20;
        if (lxb2.Ns != 2) {
            float f = lxb2.Sv;
            if (f == 0.0f || f == 100.0f) {
                i3 = 0;
                iMax = 0;
                iMax2 = 0;
                i = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                i = iMax2;
                iMax = 20;
            }
        } else {
            float f2 = lxb2.Sv;
            if (f2 == 0.0f || f2 == 100.0f) {
                i3 = 0;
                iMax = 0;
                iMax2 = 0;
                i = 0;
            } else {
                iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f2)) / 2.0f, 0.0f);
                i3 = iMax;
                iMax2 = 20;
                i = 20;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb3 = this.LD;
        float f3 = i3;
        float f4 = iMax;
        lxb3.uxf = (int) ((fMin - f3) - f4);
        float f5 = iMax2;
        float f6 = i;
        lxb3.Nu = (int) ((fMax - f5) - f6);
        com.bytedance.sdk.openadsdk.activity.lc lcVar = lxb3.FGm;
        if (lcVar == null || lcVar.QAg <= 0) {
            activity.getWindow().getDecorView().setPadding(le.lk(activity, f3), le.lk(activity, f5), le.lk(activity, f4), le.lk(activity, f6));
        }
    }

    private float[] LD(int i) {
        float fLc = lc();
        float fJXs = JXs();
        int i2 = this.LD.Ns;
        if ((i2 == 1) != (fLc > fJXs)) {
            float f = fLc + fJXs;
            fJXs = f - fJXs;
            fLc = f - fJXs;
        }
        if (i2 == 1) {
            fLc -= i;
        } else {
            fJXs -= i;
        }
        return new float[]{fJXs, fLc};
    }

    public void LD() {
        if (this.ZU != null) {
            this.LD.Pw.getWindow().getDecorView().removeOnLayoutChangeListener(this.ZU);
            this.ZU = null;
        }
    }

    public float[] Lxb(int i) {
        float[] fArrLD = new float[2];
        Activity activity = this.LD.Pw;
        View decorView = activity.getWindow().getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35 && this.LD.LD.Za() == 100.0f) {
            fArrLD[0] = decorView.getWidth() - decorView.getPaddingLeft();
            fArrLD[1] = decorView.getHeight() - decorView.getPaddingTop();
        } else {
            fArrLD[0] = decorView.getWidth() - (decorView.getPaddingLeft() * 2);
            fArrLD[1] = decorView.getHeight() - (decorView.getPaddingTop() * 2);
        }
        fArrLD[0] = le.ZU(activity, fArrLD[0]);
        float fZU = le.ZU(activity, fArrLD[1]);
        fArrLD[1] = fZU;
        if (fArrLD[0] < 10.0f || fZU < 10.0f) {
            fArrLD = LD(this.Lxb);
        }
        if (i2 != 26 && i2 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                if (i == 2) {
                    float f = fArrLD[0];
                    float f2 = fArrLD[1];
                    if (f < f2) {
                        fArrLD[1] = f;
                        fArrLD[0] = f2;
                    }
                } else {
                    float f3 = fArrLD[0];
                    float f4 = fArrLD[1];
                    if (f3 > f4) {
                        fArrLD[1] = f3;
                        fArrLD[0] = f4;
                    }
                }
            }
        }
        return fArrLD;
    }

    public void Lxb() {
        le.Lxb(this.LD.Pw);
        this.LD.Pw.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.sLN.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (sLN.this.LD.Pw.isFinishing()) {
                            return;
                        }
                        sLN.this.LD.Pw.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.sLN.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                le.Lxb(sLN.this.LD.Pw);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    private static void Lxb(Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        activity.setRequestedOrientation(i);
    }
}
