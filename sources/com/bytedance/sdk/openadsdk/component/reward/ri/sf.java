package com.bytedance.sdk.openadsdk.component.reward.ri;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.igq;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class sf {
    private boolean ik;
    private final com.bytedance.sdk.openadsdk.component.reward.ri.ri lr;
    protected int ri;

    public static abstract class ri implements View.OnLayoutChangeListener {
        private int lr;
        private int ri;

        private ri() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.ri && i10 == this.lr) {
                return;
            }
            this.ri = i9;
            this.lr = i10;
            ri(i9, i10);
        }

        public abstract void ri(int i, int i2);
    }

    public sf(com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar) {
        this.ri = 0;
        this.ik = false;
        this.lr = riVar;
        lr();
        try {
            this.ri = qd.ik(riVar.ig, qd.ri());
            if (!riVar.ig.getWindow().hasFeature(1)) {
                riVar.ig.requestWindowFeature(1);
            }
            riVar.ig.getWindow().addFlags(16777344);
            if (riVar.bnj == 2 || !qd.ik(riVar.ig)) {
                riVar.ig.getWindow().addFlags(1024);
            }
            this.ik = riVar.id;
        } catch (Throwable unused) {
        }
    }

    private float fi() {
        return qd.ik(this.lr.ig, qd.co(this.lr.ig));
    }

    private void ik() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        if (riVar.bnj != 2) {
            lr(riVar.ig, 1);
        } else if (riVar.rzk) {
            lr(riVar.ig, 8);
        } else {
            lr(riVar.ig, 0);
        }
    }

    private float ka() {
        return qd.ik(this.lr.ig, qd.aw(this.lr.ig));
    }

    private void lr() {
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
        riVar.siy = riVar.lr.gz();
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
        riVar2.bnj = ri(riVar2.ig, riVar2.lr);
    }

    private static boolean ri(int i, int i2) {
        return i == 2 && i2 == 2;
    }

    private float[] lr(int i) {
        float fFi = fi();
        float fKa = ka();
        int i2 = this.lr.bnj;
        if ((i2 == 1) != (fFi > fKa)) {
            float f = fFi + fKa;
            fKa = f - fKa;
            fFi = f - fKa;
        }
        if (i2 == 1) {
            fFi -= i;
        } else {
            fKa -= i;
        }
        return new float[]{fKa, fFi};
    }

    public static class lr {
        private ri ri;

        public void ri(Activity activity) {
            Window window;
            if (this.ri == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.ri);
            this.ri = null;
        }

        public void ri(final Activity activity, final int i, final float f, final boolean z) {
            if (this.ri == null) {
                try {
                    final boolean z2 = nr.ka().zyn() == 1;
                    final boolean zIk = qd.ik(activity);
                    if (zIk || z2) {
                        try {
                            this.ri = new ri() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.lr.1
                                boolean ri;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                private void lr() {
                                    try {
                                        int iIk = sf.ik(activity, i);
                                        View decorView = activity.getWindow().getDecorView();
                                        if (iIk == 0) {
                                            int[] iArrLr = sf.lr(activity, decorView, i, zIk, z2);
                                            if (iArrLr[4] == 1) {
                                                this.ri = sf.lr(decorView, iArrLr[0], iArrLr[1], iArrLr[2], iArrLr[3], f);
                                            }
                                        } else if (this.ri) {
                                            decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                            this.ri = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.component.reward.ri.sf.ri
                                public void ri(int i2, int i3) {
                                    if (z) {
                                        lr();
                                    } else {
                                        ri();
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
                                private void ri() {
                                    int iAbs;
                                    float fRi;
                                    try {
                                        if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                            iAbs = Math.abs(qd.aw(activity) - activity.getWindow().getDecorView().getWidth());
                                        } else {
                                            iAbs = Math.abs(qd.co(activity) - activity.getWindow().getDecorView().getHeight());
                                        }
                                        View decorView = activity.getWindow().getDecorView();
                                        int paddingLeft = decorView.getPaddingLeft();
                                        int paddingRight = decorView.getPaddingRight();
                                        int paddingBottom = decorView.getPaddingBottom();
                                        if (iAbs == 0) {
                                            int paddingTop = decorView.getPaddingTop();
                                            if (i == 1 && activity.getResources().getConfiguration().orientation == 1) {
                                                fRi = qd.ri();
                                            } else {
                                                if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                                    if (zIk) {
                                                        paddingLeft += (int) qd.ri();
                                                    }
                                                    if (z2) {
                                                        fRi = qd.ri();
                                                    }
                                                }
                                                if (decorView.isAttachedToWindow()) {
                                                    decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                    this.ri = true;
                                                }
                                                if (f == 100.0f) {
                                                    decorView.setBackgroundColor(-16777216);
                                                    return;
                                                }
                                                return;
                                            }
                                            paddingTop += (int) fRi;
                                            if (decorView.isAttachedToWindow()) {
                                                decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                this.ri = true;
                                            }
                                            if (f == 100.0f) {
                                                decorView.setBackgroundColor(-16777216);
                                                return;
                                            }
                                            return;
                                        }
                                        if (this.ri) {
                                            decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                            this.ri = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.ri);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ik(Activity activity, int i) {
        int i2 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (ri(i, i2)) {
            return Math.abs(qd.aw(activity) - decorView.getWidth());
        }
        return Math.abs(qd.co(activity) - decorView.getHeight());
    }

    public void ri(igq igqVar) {
        if (igqVar == null) {
            return;
        }
        igqVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = sf.this.lr.ig.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    private static void lr(Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        int i2 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i);
    }

    public static int ri(Activity activity, wjv wjvVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return wjvVar.bbu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lr(View view, int i, int i2, int i3, int i4, float f) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i, i2, i3, i4);
        if (f != 100.0f) {
            return true;
        }
        view.setBackgroundColor(-16777216);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    public void ri(boolean z) {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 != 26) {
            if (i2 == 27) {
                try {
                    ik();
                } catch (Throwable unused) {
                }
            } else {
                ik();
            }
        }
        float fKa = ka();
        float fFi = fi();
        if (this.lr.bnj == 2) {
            fMin = Math.max(fKa, fFi);
            fMax = Math.min(fKa, fFi);
        } else {
            fMin = Math.min(fKa, fFi);
            fMax = Math.max(fKa, fFi);
        }
        Activity activity = this.lr.ig;
        int iIk = qd.ik(activity, qd.ri());
        if (this.lr.bnj != 2) {
            if (qd.ik(activity)) {
                fMax -= iIk;
            }
        } else if (qd.ik(activity)) {
            fMin -= iIk;
        }
        if (z) {
            com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar = this.lr;
            riVar.whw = (int) fMin;
            riVar.xm = (int) fMax;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar2 = this.lr;
        int i3 = 20;
        if (riVar2.bnj != 2) {
            float f = riVar2.siy;
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == 100.0f) {
                i3 = 0;
                iMax = 0;
                iMax2 = 0;
                i = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i = iMax2;
                iMax = 20;
            }
        } else {
            float f2 = riVar2.siy;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == 100.0f) {
                i3 = 0;
                iMax = 0;
                iMax2 = 0;
                i = 0;
            } else {
                iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f2)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                iMax2 = 20;
                i = 20;
                i3 = iMax;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.ri.ri riVar3 = this.lr;
        float f3 = i3;
        float f4 = iMax;
        riVar3.whw = (int) ((fMin - f3) - f4);
        float f5 = iMax2;
        float f6 = i;
        riVar3.xm = (int) ((fMax - f5) - f6);
        com.bytedance.sdk.openadsdk.activity.single.mj mjVar = riVar3.ajz;
        if (mjVar == null || mjVar.qt == 0) {
            activity.getWindow().getDecorView().setPadding(qd.lr(activity, f3), qd.lr(activity, f5), qd.lr(activity, f4), qd.lr(activity, f6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] lr(Activity activity, View view, int i, boolean z, boolean z2) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fRi;
        int i2 = 0;
        if (activity != null && view != null) {
            int i3 = activity.getResources().getConfiguration().orientation;
            int paddingLeft2 = view.getPaddingLeft();
            int paddingTop2 = view.getPaddingTop();
            int paddingRight2 = view.getPaddingRight();
            int paddingBottom2 = view.getPaddingBottom();
            if (i == 1) {
                if (i3 == 1) {
                    fRi = qd.ri();
                    paddingTop2 += (int) fRi;
                    i2 = 1;
                } else {
                    paddingLeft2 += (int) qd.ri();
                }
            } else if (i == 2) {
                if (i3 == 2) {
                    if (z) {
                        paddingLeft2 += (int) qd.ri();
                        i2 = 1;
                    }
                    if (z2) {
                        fRi = qd.ri();
                        paddingTop2 += (int) fRi;
                        i2 = 1;
                    }
                } else {
                    paddingTop2 += (int) qd.ri();
                }
            }
            return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i2};
        }
        if (view != null) {
            paddingLeft = view.getPaddingLeft();
            paddingTop = view.getPaddingTop();
            paddingRight = view.getPaddingRight();
            paddingBottom = view.getPaddingBottom();
        } else {
            paddingLeft = 0;
            paddingBottom = 0;
            paddingTop = 0;
            paddingRight = 0;
        }
        return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, 0};
    }

    public float[] ri(int i) {
        float[] fArrLr = new float[2];
        Activity activity = this.lr.ig;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.ik && paddingLeft == 0 && paddingTop == 0 && ik(activity, i) == 0) {
            int[] iArrLr = lr(activity, decorView, i, qd.ik(activity), nr.ka().zyn() == 1);
            int i2 = iArrLr[0];
            paddingTop = iArrLr[1];
            paddingLeft = i2;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35 && this.lr.lr.gz() == 100.0f) {
            fArrLr[0] = decorView.getWidth() - paddingLeft;
            fArrLr[1] = decorView.getHeight() - paddingTop;
        } else {
            fArrLr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArrLr[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArrLr[0] = qd.ik(activity, fArrLr[0]);
        float fIk = qd.ik(activity, fArrLr[1]);
        fArrLr[1] = fIk;
        if (fArrLr[0] < 10.0f || fIk < 10.0f) {
            fArrLr = lr(this.ri);
        }
        if (i3 != 26 && i3 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                    if (i == 2) {
                        float f = fArrLr[0];
                        float f2 = fArrLr[1];
                        if (f < f2) {
                            fArrLr[1] = f;
                            fArrLr[0] = f2;
                        }
                    } else {
                        float f3 = fArrLr[0];
                        float f4 = fArrLr[1];
                        if (f3 > f4) {
                            fArrLr[1] = f3;
                            fArrLr[0] = f4;
                        }
                    }
                }
            }
            float f5 = fArrLr[0];
            float f6 = fArrLr[1];
        }
        return fArrLr;
    }

    public void ri() {
        qd.ri(this.lr.ig);
        this.lr.ig.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (sf.this.lr.ig.isFinishing()) {
                            return;
                        }
                        sf.this.lr.ig.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ri.sf.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                qd.ri(sf.this.lr.ig);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        ac.ik("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }
}
