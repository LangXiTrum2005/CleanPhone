package com.bytedance.sdk.openadsdk.component.reward.qdl;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.koa;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class rq {
    private boolean lnr;
    protected int qdl;
    private final com.bytedance.sdk.openadsdk.component.reward.qdl.qdl ud;

    public static abstract class qdl implements View.OnLayoutChangeListener {
        private int qdl;
        private int ud;

        private qdl() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10 = i4 - i2;
            int i11 = i5 - i3;
            if (i10 == this.qdl && i11 == this.ud) {
                return;
            }
            this.qdl = i10;
            this.ud = i11;
            qdl(i10, i11);
        }

        public abstract void qdl(int i2, int i3);
    }

    public rq(com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar) {
        this.qdl = 0;
        this.lnr = false;
        this.ud = qdlVar;
        ud();
        try {
            this.qdl = ax.lnr(qdlVar.ag, ax.qdl());
            if (!qdlVar.ag.getWindow().hasFeature(1)) {
                qdlVar.ag.requestWindowFeature(1);
            }
            qdlVar.ag.getWindow().addFlags(16777344);
            if (qdlVar.zlt == 2 || !ax.lnr(qdlVar.ag)) {
                qdlVar.ag.getWindow().addFlags(1024);
            }
            this.lnr = qdlVar.zvv;
            new Throwable();
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    private void lnr() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        if (qdlVar.zlt != 2) {
            ud(qdlVar.ag, 1);
        } else if (qdlVar.car) {
            ud(qdlVar.ag, 8);
        } else {
            ud(qdlVar.ag, 0);
        }
    }

    private float mml() {
        return ax.lnr(this.ud.ag, ax.exu(this.ud.ag));
    }

    private float mzz() {
        return ax.lnr(this.ud.ag, ax.fs(this.ud.ag));
    }

    private static boolean qdl(int i2, int i3) {
        return i2 == 2 && i3 == 2;
    }

    private void ud() {
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
        qdlVar.taz = qdlVar.ud.nv();
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
        qdlVar2.zlt = qdl(qdlVar2.ag, qdlVar2.ud);
    }

    private float[] ud(int i2) {
        float fMzz = mzz();
        float fMml = mml();
        int i3 = this.ud.zlt;
        if ((i3 == 1) != (fMzz > fMml)) {
            float f = fMzz + fMml;
            fMml = f - fMml;
            fMzz = f - fMml;
        }
        if (i3 == 1) {
            fMzz -= i2;
        } else {
            fMml -= i2;
        }
        return new float[]{fMml, fMzz};
    }

    public static class ud {
        private qdl qdl;

        public void qdl(Activity activity) {
            Window window;
            if (this.qdl == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.qdl);
            this.qdl = null;
        }

        public void qdl(final Activity activity, final int i2, final float f, final boolean z2) {
            if (this.qdl == null) {
                try {
                    final boolean z3 = com.bytedance.sdk.openadsdk.core.yt.mml().yh() == 1;
                    final boolean zLnr = ax.lnr(activity);
                    if (zLnr || z3) {
                        try {
                            this.qdl = new qdl() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.ud.1
                                boolean qdl;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super();
                                }

                                private void ud() {
                                    try {
                                        int iLnr = rq.lnr(activity, i2);
                                        View decorView = activity.getWindow().getDecorView();
                                        if (iLnr == 0) {
                                            int[] iArrUd = rq.ud(activity, decorView, i2, zLnr, z3);
                                            if (iArrUd[4] == 1) {
                                                this.qdl = rq.ud(decorView, iArrUd[0], iArrUd[1], iArrUd[2], iArrUd[3], f);
                                            }
                                        } else if (this.qdl) {
                                            decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                            this.qdl = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }

                                @Override // com.bytedance.sdk.openadsdk.component.reward.qdl.rq.qdl
                                public void qdl(int i3, int i4) {
                                    if (z2) {
                                        ud();
                                    } else {
                                        qdl();
                                    }
                                }

                                /* JADX WARN: Code duplicated, block: B:28:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:31:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:8:0x0046, B:10:0x005e, B:12:0x0067, B:14:0x0075, B:15:0x0079, B:26:0x00a1, B:28:0x00a7, B:29:0x00ac, B:31:0x00b4, B:16:0x007c, B:18:0x0080, B:20:0x008e, B:22:0x0092, B:23:0x0098, B:25:0x009c, B:33:0x00ba, B:35:0x00be, B:7:0x002d), top: B:38:0x0000 }] */
                                /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
                                private void qdl() {
                                    int iAbs;
                                    float fQdl;
                                    try {
                                        if (i2 == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                            iAbs = Math.abs(ax.exu(activity) - activity.getWindow().getDecorView().getWidth());
                                        } else {
                                            iAbs = Math.abs(ax.fs(activity) - activity.getWindow().getDecorView().getHeight());
                                        }
                                        View decorView = activity.getWindow().getDecorView();
                                        int paddingLeft = decorView.getPaddingLeft();
                                        int paddingRight = decorView.getPaddingRight();
                                        int paddingBottom = decorView.getPaddingBottom();
                                        if (iAbs == 0) {
                                            int paddingTop = decorView.getPaddingTop();
                                            if (i2 == 1 && activity.getResources().getConfiguration().orientation == 1) {
                                                fQdl = ax.qdl();
                                            } else {
                                                if (i2 == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                                    if (zLnr) {
                                                        paddingLeft += (int) ax.qdl();
                                                    }
                                                    if (z3) {
                                                        fQdl = ax.qdl();
                                                    }
                                                }
                                                if (decorView.isAttachedToWindow()) {
                                                    decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                    this.qdl = true;
                                                }
                                                if (f == 100.0f) {
                                                    decorView.setBackgroundColor(-16777216);
                                                    return;
                                                }
                                                return;
                                            }
                                            paddingTop += (int) fQdl;
                                            if (decorView.isAttachedToWindow()) {
                                                decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                                this.qdl = true;
                                            }
                                            if (f == 100.0f) {
                                                decorView.setBackgroundColor(-16777216);
                                                return;
                                            }
                                            return;
                                        }
                                        if (this.qdl) {
                                            decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                            this.qdl = false;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            };
                            activity.getWindow().getDecorView().addOnLayoutChangeListener(this.qdl);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lnr(Activity activity, int i2) {
        int i3 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (qdl(i2, i3)) {
            return Math.abs(ax.exu(activity) - decorView.getWidth());
        }
        return Math.abs(ax.fs(activity) - decorView.getHeight());
    }

    public void qdl(koa koaVar) {
        if (koaVar == null) {
            return;
        }
        koaVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.1
            @Override // java.lang.Runnable
            public void run() {
                View viewFindViewById;
                try {
                    View decorView = rq.this.ud.ag.getWindow().getDecorView();
                    if (decorView == null || (viewFindViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    viewFindViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    public static int qdl(Activity activity, ljh ljhVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return ljhVar.jb();
    }

    private static void ud(Activity activity, int i2) {
        if (activity.getRequestedOrientation() == i2) {
            return;
        }
        int i3 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean ud(View view, int i2, int i3, int i4, int i5, float f) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i2, i3, i4, i5);
        if (f != 100.0f) {
            return true;
        }
        view.setBackgroundColor(-16777216);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    public void qdl(boolean z2) {
        float fMin;
        float fMax;
        int iMax;
        int iMax2;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 != 26) {
            if (i3 == 27) {
                try {
                    lnr();
                } catch (Throwable unused) {
                }
            } else {
                lnr();
            }
        }
        float fMml = mml();
        float fMzz = mzz();
        if (this.ud.zlt == 2) {
            fMin = Math.max(fMml, fMzz);
            fMax = Math.min(fMml, fMzz);
        } else {
            fMin = Math.min(fMml, fMzz);
            fMax = Math.max(fMml, fMzz);
        }
        Activity activity = this.ud.ag;
        int iLnr = ax.lnr(activity, ax.qdl());
        if (this.ud.zlt != 2) {
            if (ax.lnr(activity)) {
                fMax -= iLnr;
            }
        } else if (ax.lnr(activity)) {
            fMin -= iLnr;
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar = this.ud;
            qdlVar.tid = (int) fMin;
            qdlVar.sy = (int) fMax;
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar2 = this.ud;
        int i4 = 20;
        if (qdlVar2.zlt != 2) {
            float f = qdlVar2.taz;
            if (f == 0.0f || f == 100.0f) {
                i4 = 0;
                iMax = 0;
                iMax2 = 0;
                i2 = 0;
            } else {
                iMax2 = (int) Math.max((fMax - (((fMin - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                i2 = iMax2;
                iMax = 20;
            }
        } else {
            float f2 = qdlVar2.taz;
            if (f2 == 0.0f || f2 == 100.0f) {
                i4 = 0;
                iMax = 0;
                iMax2 = 0;
                i2 = 0;
            } else {
                iMax = (int) Math.max((fMin - (((fMax - 20.0f) - 20.0f) * f2)) / 2.0f, 0.0f);
                iMax2 = 20;
                i2 = 20;
                i4 = iMax;
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.qdl.qdl qdlVar3 = this.ud;
        float f3 = i4;
        float f4 = iMax;
        qdlVar3.tid = (int) ((fMin - f3) - f4);
        float f5 = iMax2;
        float f6 = i2;
        qdlVar3.sy = (int) ((fMax - f5) - f6);
        com.bytedance.sdk.openadsdk.activity.jpc jpcVar = qdlVar3.lq;
        if (jpcVar == null || jpcVar.to == 0) {
            activity.getWindow().getDecorView().setPadding(ax.ud(activity, f3), ax.ud(activity, f5), ax.ud(activity, f4), ax.ud(activity, f6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] ud(Activity activity, View view, int i2, boolean z2, boolean z3) {
        int paddingLeft;
        int paddingBottom;
        int paddingTop;
        int paddingRight;
        float fQdl;
        int i3 = 0;
        if (activity != null && view != null) {
            int i4 = activity.getResources().getConfiguration().orientation;
            int paddingLeft2 = view.getPaddingLeft();
            int paddingTop2 = view.getPaddingTop();
            int paddingRight2 = view.getPaddingRight();
            int paddingBottom2 = view.getPaddingBottom();
            if (i2 == 1) {
                if (i4 == 1) {
                    fQdl = ax.qdl();
                    paddingTop2 += (int) fQdl;
                    i3 = 1;
                } else {
                    paddingLeft2 += (int) ax.qdl();
                }
            } else if (i2 == 2) {
                if (i4 == 2) {
                    if (z2) {
                        paddingLeft2 += (int) ax.qdl();
                        i3 = 1;
                    }
                    if (z3) {
                        fQdl = ax.qdl();
                        paddingTop2 += (int) fQdl;
                        i3 = 1;
                    }
                } else {
                    paddingTop2 += (int) ax.qdl();
                }
            }
            return new int[]{paddingLeft2, paddingTop2, paddingRight2, paddingBottom2, i3};
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

    public float[] qdl(int i2) {
        float[] fArrUd = new float[2];
        Activity activity = this.ud.ag;
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.lnr && paddingLeft == 0 && paddingTop == 0 && lnr(activity, i2) == 0) {
            int[] iArrUd = ud(activity, decorView, i2, ax.lnr(activity), com.bytedance.sdk.openadsdk.core.yt.mml().yh() == 1);
            int i3 = iArrUd[0];
            paddingTop = iArrUd[1];
            paddingLeft = i3;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 35 && this.ud.ud.nv() == 100.0f) {
            fArrUd[0] = decorView.getWidth() - paddingLeft;
            fArrUd[1] = decorView.getHeight() - paddingTop;
        } else {
            fArrUd[0] = decorView.getWidth() - (paddingLeft * 2);
            fArrUd[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArrUd[0] = ax.lnr(activity, fArrUd[0]);
        float fLnr = ax.lnr(activity, fArrUd[1]);
        fArrUd[1] = fLnr;
        if (fArrUd[0] < 10.0f || fLnr < 10.0f) {
            fArrUd = ud(this.qdl);
        }
        if (i4 != 26 && i4 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i2) {
                    if (i2 == 2) {
                        float f = fArrUd[0];
                        float f2 = fArrUd[1];
                        if (f < f2) {
                            fArrUd[1] = f;
                            fArrUd[0] = f2;
                        }
                    } else {
                        float f3 = fArrUd[0];
                        float f4 = fArrUd[1];
                        if (f3 > f4) {
                            fArrUd[1] = f3;
                            fArrUd[0] = f4;
                        }
                    }
                }
            }
            float f5 = fArrUd[0];
            float f6 = fArrUd[1];
        }
        return fArrUd;
    }

    public void qdl() {
        ax.qdl(this.ud.ag);
        this.ud.ag.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i2) {
                if (i2 == 0) {
                    try {
                        if (rq.this.ud.ag.isFinishing()) {
                            return;
                        }
                        rq.this.ud.ag.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.qdl.rq.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ax.qdl(rq.this.ud.ag);
                            }
                        }, 2500L);
                    } catch (Exception e2) {
                        aaj.lnr("TTAD.RFSM", e2.getMessage());
                    }
                }
            }
        });
    }
}
