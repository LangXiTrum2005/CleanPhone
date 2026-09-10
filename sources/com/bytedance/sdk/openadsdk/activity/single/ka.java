package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.cutely;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.ri.sf;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.model.dw;
import com.bytedance.sdk.openadsdk.core.model.fr;
import com.bytedance.sdk.openadsdk.core.model.igq;
import com.bytedance.sdk.openadsdk.core.model.oh;
import com.bytedance.sdk.openadsdk.core.model.su;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends com.bytedance.sdk.openadsdk.activity.single.ik implements Handler.Callback {
    private boolean aac;
    private final boolean ac;
    private final AtomicBoolean aw;
    private boolean ay;
    private final HashSet<String> bgr;
    private long bnj;
    private final HashSet<Integer> bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final boolean f18074co;
    private final RecyclerView di;
    private boolean dw;
    private int dzy;
    private JSONObject fe;
    private FrameLayout feb;
    private int fr;
    private boolean gcp;
    private mj hcw;
    private boolean ig;
    private int igq;
    private boolean ihz;
    private final TopLayoutDislike2 jbs;
    private JSONObject jc;
    private boolean kt;
    private final LinearLayoutManager mj;
    private boolean nd;
    private final PAGLogoView nr;
    private com.bytedance.sdk.openadsdk.activity.single.lr.fi oh;
    private int ory;
    private com.bytedance.sdk.openadsdk.activity.single.fi pv;
    private fr.ri qd;
    private di qh;
    private final Handler qt;
    private Message rzk;
    private final FrameLayout sf;
    private boolean siy;
    private final boolean slm;
    private int srn;
    private boolean su;
    private long ta;
    private final ArrayList<Message> tan;
    private JSONObject tnn;
    private View tw;
    private int uq;
    private final boolean vr;
    private boolean whw;
    private int wjv;
    private int xd;
    private final ri xha;
    private boolean xm;
    private long zb;
    private boolean zf;
    private boolean zyn;

    public static abstract class di implements Runnable {
        private long fi;
        private long ik;
        private long ka;
        private final long lr;
        private final Handler ri = new Handler(Looper.getMainLooper());

        public di(long j) {
            this.lr = j;
        }

        public long di() {
            long jElapsedRealtime;
            long j;
            if (this.ik > this.fi) {
                jElapsedRealtime = this.lr - (SystemClock.elapsedRealtime() - this.ik);
                j = this.ka;
            } else {
                jElapsedRealtime = this.lr;
                j = this.ka;
            }
            long j2 = jElapsedRealtime - j;
            if (j2 < 0) {
                return 0L;
            }
            return j2;
        }

        public void fi() {
            this.ri.postDelayed(this, this.lr);
            this.ik = SystemClock.elapsedRealtime();
        }

        public void ik() {
            long j = this.lr - this.ka;
            if (j < 0) {
                return;
            }
            this.ri.removeCallbacks(this);
            this.ri.postDelayed(this, j);
            this.ik = SystemClock.elapsedRealtime();
        }

        public void ka() {
            this.ri.removeCallbacks(this);
        }

        public void lr() {
            this.ri.removeCallbacks(this);
            if (this.fi > this.ik) {
                return;
            }
            this.ka += SystemClock.elapsedRealtime() - this.ik;
            this.fi = SystemClock.elapsedRealtime();
        }

        public abstract void ri();

        @Override // java.lang.Runnable
        public void run() {
            ri();
        }
    }

    public static abstract class fi extends RecyclerView.stratoscope {
        public fi(View view) {
            super(view);
        }

        public abstract void ri(ka kaVar, C0222ka c0222ka, int i);
    }

    public static class ik extends fi {
        private final TextView ri;

        public ik(View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(view.getContext());
            this.ri = mjVar;
            mjVar.setTextColor(Color.parseColor("#99FFFFFF"));
            mjVar.setTextSize(14.0f);
            mjVar.setGravity(17);
            mjVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(mjVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.ka.fi
        public void ri(ka kaVar, C0222ka c0222ka, int i) {
            this.ri.setText(c0222ka.ik);
        }
    }

    public static class lr extends fi {
        private com.bytedance.sdk.openadsdk.activity.single.ri ik;
        private final com.bytedance.sdk.openadsdk.component.reward.view.lr lr;
        private final ri ri;

        public lr(ri riVar, View view) {
            super(view);
            this.ri = riVar;
            this.lr = (com.bytedance.sdk.openadsdk.component.reward.view.lr) view;
        }

        public mj ri() {
            return this.ik;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.single.ka.fi
        public void ri(ka kaVar, C0222ka c0222ka, int i) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = kaVar.ri;
            if (com.bytedance.sdk.component.utils.lr.ri(activity)) {
                return;
            }
            wjv wjvVar = c0222ka.lr;
            com.bytedance.sdk.openadsdk.activity.single.ri riVar = this.ik;
            if (riVar != null) {
                if (ri(riVar, wjvVar)) {
                    this.ik.ri(wjvVar, bindingAdapterPosition, i);
                } else {
                    this.ri.ri(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.single.lr lrVar = kaVar.ka;
            if (this.ik == null) {
                this.ik = wjvVar.qa() ? new xha(lrVar, wjvVar, bindingAdapterPosition, i, false) : new com.bytedance.sdk.openadsdk.activity.single.di(lrVar, wjvVar, bindingAdapterPosition, i, false);
            }
            com.bytedance.sdk.openadsdk.activity.single.lr.fi fiVar = new com.bytedance.sdk.openadsdk.activity.single.lr.fi(1, null);
            fiVar.ka = kaVar.dw;
            this.ik.lr(activity, fiVar);
            this.ri.ri(this.ik);
            com.bytedance.sdk.openadsdk.component.reward.view.mj mjVarRi = this.ik.ri();
            if (mjVarRi == null) {
                return;
            }
            ViewParent parent = mjVarRi.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(mjVarRi);
            }
            if (!kaVar.vr) {
                float fKl = wjvVar.kl();
                if (fKl > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.lr.setWidthAndHeightRatio(fKl);
                } else {
                    this.lr.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.lr.ri(mjVarRi, new FrameLayout.LayoutParams(-1, -1));
            this.lr.setScene(this.ik);
        }

        private boolean ri(mj mjVar, wjv wjvVar) {
            oh ohVarZv;
            if (mjVar.hcw() && (ohVarZv = mjVar.di.zv()) != null) {
                oh ohVarZv2 = wjvVar.zv();
                if (TextUtils.equals(ohVarZv.ri(), ohVarZv2.ri()) && TextUtils.equals(ohVarZv.lr(), ohVarZv2.lr()) && mjVar.oh()) {
                    return true;
                }
            }
            return false;
        }

        public void ri(boolean z) {
            com.bytedance.sdk.openadsdk.activity.single.ri riVar = this.ik;
            if (riVar == null) {
                return;
            }
            riVar.di(z);
            this.ik.tan();
            if (!z) {
                this.ik = null;
            }
            this.lr.ri();
        }
    }

    public ka(final Activity activity, final wjv wjvVar, final com.bytedance.sdk.openadsdk.activity.single.lr lrVar) {
        fr frVarQt;
        super(activity, wjvVar, lrVar);
        this.qt = new Handler(Looper.getMainLooper(), this);
        boolean z = false;
        this.aw = new AtomicBoolean(false);
        this.bgr = new HashSet<>();
        this.bu = new HashSet<>();
        this.tan = new ArrayList<>();
        this.uq = 5;
        this.wjv = 3;
        this.ory = -1;
        int i = 1;
        this.oh = new com.bytedance.sdk.openadsdk.activity.single.lr.fi(1, null);
        boolean z2 = wjvVar.nd() == 44;
        this.vr = z2;
        boolean zQa = wjvVar.qa();
        this.f18074co = zQa;
        this.slm = sf.ri(activity, wjvVar) == 1;
        com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(activity) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                ka.this.tnn = null;
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.sf = ikVar;
        if (Build.VERSION.SDK_INT >= 35) {
            ikVar.setFitsSystemWindows(true);
        }
        activity.setContentView(ikVar);
        this.fi = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa = wjvVar.ka();
        if (riVarKa != null && (frVarQt = riVarKa.qt()) != null) {
            this.ig = frVarQt.vr();
            this.qd = frVarQt.di();
            int iMax = Math.max(0, frVarQt.jbs());
            this.xd = iMax;
            this.dzy = iMax;
            this.zf = frVarQt.bgr();
            this.su = frVarQt.sf();
            this.fr = frVarQt.mj();
            this.jc = frVarQt.co();
            this.ay = frVarQt.qt();
            this.ihz = frVarQt.ri();
            this.kt = this.fr > 0;
            this.uq = frVarQt.ka();
            this.wjv = frVarQt.fi();
            this.tnn = frVarQt.lr();
            this.fe = frVarQt.ik();
            if (!this.su) {
                this.ig = false;
            }
        }
        if (zQa) {
            int iZk = wjvVar.zk();
            this.igq = (int) ((1.0f - (Math.max(0, Math.min(100, iZk < 0 ? nr.ka().su(String.valueOf(wjvVar.ur())).di : iZk)) / 100.0f)) * this.xd);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.di = recyclerView;
        fr.ri riVar = this.qd;
        if (riVar != null) {
            int iIk = riVar.ik();
            int iKa = this.qd.ka();
            if (iIk > 0 || iKa > 0) {
                recyclerView.setPadding(qd.lr(activity, iIk), 0, qd.lr(activity, iKa), 0);
            }
            int iLr = this.qd.lr();
            int iRi = this.qd.ri();
            int iFi = this.qd.fi();
            if (iLr > 0 || iFi > 0 || iRi > 0) {
                final int iLr2 = qd.lr(activity, iLr);
                final int iLr3 = qd.lr(activity, iRi);
                final int iLr4 = qd.lr(activity, iFi);
                recyclerView.addItemDecoration(new RecyclerView.triweekly() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.11
                    @Override // androidx.recyclerview.widget.RecyclerView.triweekly
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.rotuma rotumaVar) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = iLr2;
                        } else {
                            rect.top = iLr4 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = iLr3;
                        } else {
                            rect.bottom = iLr4 / 2;
                        }
                    }
                });
            }
        }
        ikVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.jbs = topLayoutDislike2;
        ikVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(wjvVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean zBu = nr.ka().bu(String.valueOf(wjvVar.ur()));
        this.dw = zBu;
        topLayoutDislike2.setSoundMute(zBu);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.lr() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.12
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ik(View view) {
                lrVar.xha();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void lr(View view) {
                if (ka.this.hcw != null) {
                    ka.this.hcw.e_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view) {
                com.bytedance.sdk.openadsdk.core.aw.ka kaVarRi;
                wjv wjvVar2 = wjvVar;
                com.bytedance.sdk.openadsdk.ka.ik.ri("skip", wjvVar2, wjvVar2.fi(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.ka kaVarQc = wjvVar.qc();
                if (kaVarQc != null && (kaVarRi = kaVarQc.ri()) != null) {
                    kaVarRi.di(0L);
                    kaVarRi.fi(0L);
                }
                ka.this.fr();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ri(View view, String str) {
                if (ka.this.hcw != null) {
                    ka.this.hcw.ri(str);
                    ka kaVar = ka.this;
                    kaVar.dw = !kaVar.dw;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.lr
            public void ka(View view) {
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i, z) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.13
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.rotuma rotumaVar, int[] iArr) {
                super.calculateExtraLayoutSpace(rotumaVar, iArr);
                int height = ka.this.di.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.mj = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        ri riVar2 = new ri(this, wjvVar.lsq());
        this.xha = riVar2;
        recyclerView.setAdapter(riVar2);
        if (!this.kt && !this.ay) {
            riVar2.ri(uq.ri(activity, "tt_list_end_tip"));
        }
        if (z2) {
            new cutely().attachToRecyclerView(recyclerView);
        } else if (this.su) {
            new com.bytedance.sdk.openadsdk.component.reward.view.ri().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.14
            private int fi;
            private final Rect ik = new Rect();
            private int ka = -1;

            /* JADX WARN: Code duplicated, block: B:22:0x006d  */
            /* JADX WARN: Code duplicated, block: B:24:0x007b  */
            /* JADX WARN: Code duplicated, block: B:26:0x0083  */
            /* JADX WARN: Code duplicated, block: B:29:0x008e  */
            /* JADX WARN: Code duplicated, block: B:37:0x0090 A[SYNTHETIC] */
            private void ri() {
                int iKa2;
                View viewFindViewByPosition;
                RecyclerView.stratoscope stratoscopeVarFindViewHolderForAdapterPosition;
                lr lrVar2;
                if (ka.this.ihz && (iKa2 = ka.this.xha.ka()) != 0) {
                    int iFindFirstVisibleItemPosition = ka.this.mj.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = ka.this.mj.findLastVisibleItemPosition();
                    if (iFindLastVisibleItemPosition % iKa2 > this.ka) {
                        for (int i2 = iFindFirstVisibleItemPosition; i2 <= iFindLastVisibleItemPosition; i2++) {
                            int i3 = i2 % iKa2;
                            if (i3 > this.ka) {
                                if ((i2 == iFindFirstVisibleItemPosition || i2 == iFindLastVisibleItemPosition) && (viewFindViewByPosition = ka.this.mj.findViewByPosition(i2)) != null) {
                                    this.ik.setEmpty();
                                    viewFindViewByPosition.getGlobalVisibleRect(this.ik);
                                    int height = viewFindViewByPosition.getHeight();
                                    if (height > 0 && (this.ik.height() * 1.0f) / height >= 0.5f) {
                                        stratoscopeVarFindViewHolderForAdapterPosition = ka.this.di.findViewHolderForAdapterPosition(i2);
                                        if (stratoscopeVarFindViewHolderForAdapterPosition instanceof lr) {
                                            lrVar2 = (lr) stratoscopeVarFindViewHolderForAdapterPosition;
                                            if (lrVar2.ik != null) {
                                                lrVar2.ik.zb();
                                            }
                                        }
                                        if (i3 > this.ka) {
                                            this.ka = i3;
                                        }
                                    }
                                } else {
                                    stratoscopeVarFindViewHolderForAdapterPosition = ka.this.di.findViewHolderForAdapterPosition(i2);
                                    if (stratoscopeVarFindViewHolderForAdapterPosition instanceof lr) {
                                        lrVar2 = (lr) stratoscopeVarFindViewHolderForAdapterPosition;
                                        if (lrVar2.ik != null) {
                                            lrVar2.ik.zb();
                                        }
                                    }
                                    if (i3 > this.ka) {
                                        this.ka = i3;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                super.onScrollStateChanged(recyclerView2, i2);
                if (com.bytedance.sdk.component.utils.lr.ri(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = ka.this.mj.findFirstCompletelyVisibleItemPosition();
                ka.this.mj.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = ka.this.mj.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i2 == 0 && iFindFirstCompletelyVisibleItemPosition != ka.this.ory) {
                    boolean z3 = iFindFirstCompletelyVisibleItemPosition == ka.this.srn;
                    ka kaVar = ka.this;
                    kaVar.ri(iFindFirstCompletelyVisibleItemPosition, kaVar.ig && z3);
                    if (ka.this.ig && !z3 && ka.this.zf) {
                        ka.this.ig = false;
                    }
                    if (ka.this.qh != null) {
                        ka.this.qh.ka();
                        ka.this.qh = null;
                    }
                }
                if (i2 == 0) {
                    ka.this.srn = -1;
                }
                if (!ka.this.kt || ka.this.fr <= 0 || iFindLastVisibleItemPosition < ka.this.xha.ri() - ka.this.fr) {
                    return;
                }
                ka.this.uq();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                super.onScrolled(recyclerView2, i2, i3);
                if (i3 == 0 || com.bytedance.sdk.component.utils.lr.ri(activity)) {
                    return;
                }
                ri();
                int iFindLastVisibleItemPosition = ka.this.mj.findLastVisibleItemPosition();
                if (i3 > 0 && ka.this.kt && ka.this.fr > 0 && iFindLastVisibleItemPosition >= ka.this.xha.ri() - ka.this.fr) {
                    ka.this.uq();
                }
                if (this.fi != iFindLastVisibleItemPosition) {
                    this.fi = iFindLastVisibleItemPosition;
                    if (!ka.this.bu.isEmpty() && ka.this.bu.contains(Integer.valueOf(iFindLastVisibleItemPosition))) {
                        ka.this.bu.remove(Integer.valueOf(iFindLastVisibleItemPosition));
                        RecyclerView.stratoscope stratoscopeVarFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (stratoscopeVarFindViewHolderForAdapterPosition instanceof lr) {
                            lr lrVar2 = (lr) stratoscopeVarFindViewHolderForAdapterPosition;
                            lrVar2.ik.fi(true);
                            lrVar2.ik.igq();
                            return;
                        }
                        return;
                    }
                    if (ka.this.whw) {
                        ka.this.whw = false;
                        RecyclerView.stratoscope stratoscopeVarFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (stratoscopeVarFindViewHolderForAdapterPosition2 instanceof lr) {
                            lr lrVar3 = (lr) stratoscopeVarFindViewHolderForAdapterPosition2;
                            if (lrVar3.ik != null) {
                                lrVar3.ik.fi(true);
                                lrVar3.ik.su();
                            }
                        }
                    }
                }
            }
        });
        hcw();
        final int iIhz = ihz();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.15
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.lr.ri(activity)) {
                    return;
                }
                ka.this.ri(iIhz, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, wjvVar);
        this.nr = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = qd.lr(activity, 16.0f);
        ikVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                wjv wjvVar2 = wjvVar;
                TTWebsiteActivity.ri(context, wjvVar2, wjvVar2.fi());
            }
        });
        this.ac = com.bytedance.sdk.openadsdk.wjv.fi.ri("draw_feed_item_reuse", 0) == 1;
    }

    private void dw() {
        if (this.tnn == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.co.jbs.ri(this.ri).ri(this.tnn, com.bytedance.sdk.openadsdk.core.jbs.ri.lr.lr(), this.fe, new com.bytedance.sdk.openadsdk.core.co.xha.ka() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.8
            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ka
            public void ri(int i, String str) {
                ka.this.nd = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.co.xha.ka
            public void ri(com.bytedance.adsdk.ugeno.lr.ik<View> ikVar) {
                View viewSf = ikVar.sf();
                ViewGroup viewGroup = (ViewGroup) viewSf.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewSf);
                }
                ka.this.tw = viewSf;
                if (ka.this.feb != null) {
                    ka.this.feb.addView(viewSf, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    private void dzy() {
        if (this.aac) {
            this.zb = System.currentTimeMillis();
        }
        this.qt.removeMessages(1);
        di diVar = this.qh;
        if (diVar != null) {
            diVar.lr();
        }
    }

    private void hcw() {
        fr frVarQt;
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa = this.lr.ka();
        if (riVarKa == null || (frVarQt = riVarKa.qt()) == null || TextUtils.isEmpty(frVarQt.xha())) {
            return;
        }
        this.pv = new com.bytedance.sdk.openadsdk.activity.single.fi(this.ka, this.lr, -1, 1, false, false, true);
    }

    private void igq() {
        mj mjVar;
        if (!this.f18074co || this.ka.bu() || (mjVar = this.hcw) == null) {
            return;
        }
        mjVar.bnj();
    }

    private boolean oh() {
        FrameLayout frameLayout = this.feb;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    private void ory() {
        if (this.feb != null || this.tnn == null || this.nd) {
            return;
        }
        this.zyn = true;
        this.feb = new com.bytedance.sdk.openadsdk.core.di.ik(this.ri) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.9
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                ka.this.qt.removeMessages(4);
                ka.this.qt.sendEmptyMessage(4);
                try {
                    return super.dispatchTouchEvent(motionEvent);
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        View view = this.tw;
        if (view != null && view.getParent() == null) {
            this.feb.addView(this.tw, new FrameLayout.LayoutParams(-1, -1));
        }
        this.sf.addView(this.feb, new FrameLayout.LayoutParams(-1, -1));
        this.qt.sendEmptyMessageDelayed(4, ((long) this.wjv) * 1000);
        mj mjVar = this.hcw;
        if (mjVar instanceof com.bytedance.sdk.openadsdk.activity.single.ri) {
            ((com.bytedance.sdk.openadsdk.activity.single.ri) mjVar).zf();
        }
        dzy();
    }

    private void su() {
        FrameLayout frameLayout = this.feb;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.feb);
        }
        this.feb = null;
        mj mjVar = this.hcw;
        if (mjVar instanceof com.bytedance.sdk.openadsdk.activity.single.ri) {
            ((com.bytedance.sdk.openadsdk.activity.single.ri) mjVar).dw();
        }
        xd();
        Message message = this.rzk;
        if (message != null) {
            handleMessage(message);
            this.rzk = null;
        }
    }

    private void xd() {
        if (this.zb != 0) {
            mj mjVar = this.hcw;
            if (mjVar != null && dw.lr(mjVar.di)) {
                int iCurrentTimeMillis = this.xd - ((int) ((System.currentTimeMillis() - this.zb) / 1000));
                this.xd = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.xd = 0;
                }
            }
            this.zb = 0L;
        }
        if (this.xd >= 0) {
            this.qt.removeMessages(1);
            this.qt.sendEmptyMessage(1);
        }
        di diVar = this.qh;
        if (diVar != null) {
            diVar.ik();
        }
    }

    private void zf() {
        if (this.zyn || this.tnn == null) {
            return;
        }
        this.qt.removeMessages(3);
        this.qt.sendEmptyMessageDelayed(3, ((long) this.uq) * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public com.bytedance.sdk.openadsdk.component.reward.top.ik co() {
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.xm) {
            this.tan.add(this.qt.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i = message.what;
        if (i == 1) {
            int i2 = this.xd;
            if (i2 > 0) {
                if (i2 <= this.igq) {
                    igq();
                }
                int i3 = this.dzy;
                int i4 = (int) ((((double) (i3 - this.xd)) * 100.0d) / ((double) i3));
                TopLayoutDislike2 topLayoutDislike2 = this.jbs;
                StringBuilder sb = new StringBuilder();
                int i5 = this.xd;
                this.xd = i5 - 1;
                sb.append(i5);
                sb.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb.toString(), i4);
                if (this.xd >= 0) {
                    this.qt.removeMessages(message.what);
                    this.qt.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                igq();
                if (ka()) {
                    this.jbs.showSkipButton();
                } else {
                    this.jbs.showCloseButton();
                }
            }
        } else if (i == 3) {
            ory();
        } else if (i == 4) {
            su();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void nr() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(int i) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void tan() {
    }

    private void ay() {
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.lr.ri(ka.this.ri)) {
                    return;
                }
                ka.this.aw.set(false);
                if (!ka.this.ay) {
                    ka.this.xha.ri(uq.ri(nr.ri(), "tt_list_end_tip"));
                } else {
                    ka.this.xha.ri("");
                    ka.this.wjv();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fr() {
        com.bytedance.sdk.openadsdk.activity.single.fi fiVar = this.pv;
        if (fiVar == null || !fiVar.wjv()) {
            this.ka.xha();
            return;
        }
        lr(this.pv);
        this.sf.removeView(this.di);
        this.jbs.setVisibility(8);
        this.nr.setVisibility(8);
    }

    private int ihz() {
        if (!this.ay || this.xha.ik() || this.aw.get() || this.kt) {
            return 0;
        }
        int iRi = ri(this.ory, this.xha.ka(), 1073741823);
        this.xha.ri(this.ory, iRi);
        if (this.ory < 0) {
            this.di.scrollToPosition(iRi);
            return iRi;
        }
        this.ory = iRi;
        return iRi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uq() {
        if (this.aw.compareAndSet(false, true)) {
            AdSlot adSlotEb = this.lr.eb();
            igq igqVar = new igq();
            igqVar.di = true;
            if (this.lr.sez() != null || this.lr.zv() != null) {
                igqVar.jbs = 2;
            }
            igqVar.xha = this.jc;
            this.xha.ri(uq.ri(this.ri, "tt_loading_more"));
            nr.ik().ri(adSlotEb, igqVar, this.lr.go(), new com.bytedance.sdk.openadsdk.core.uq() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.17
                @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
                public void ri(int i, String str) {
                    ka.this.ri(i, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
                public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                    ka.this.ri(riVar, ikVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wjv() {
        if (this.kt) {
            return;
        }
        if (this.ay) {
            ihz();
        } else {
            dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.18
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.lr.ri(ka.this.ri)) {
                        return;
                    }
                    ka.this.xha.ri(uq.ri(nr.ri(), "tt_list_end_tip"));
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    /* JADX INFO: renamed from: ac, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.single.ri aw() {
        RecyclerView.stratoscope stratoscopeVarFindViewHolderForAdapterPosition = this.di.findViewHolderForAdapterPosition(this.ory + 1);
        if (!(stratoscopeVarFindViewHolderForAdapterPosition instanceof lr)) {
            return null;
        }
        mj mjVarRi = ((lr) stratoscopeVarFindViewHolderForAdapterPosition).ri();
        if (mjVarRi instanceof com.bytedance.sdk.openadsdk.activity.single.ri) {
            return (com.bytedance.sdk.openadsdk.activity.single.ri) mjVarRi;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void bu() {
        super.bu();
        this.aac = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public boolean fi() {
        return this.dw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public int mj() {
        return this.xd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public int qt() {
        return this.bgr.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public mj sf() {
        return this.hcw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void slm() {
        if (this.siy) {
            return;
        }
        this.siy = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.bnj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        wjv wjvVar = this.lr;
        com.bytedance.sdk.openadsdk.ka.ik.ri(jCurrentTimeMillis, wjvVar, wjvVar.fi(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.10
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public List<wjv> vr() {
        return this.xha.fi();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.single.ka$ka, reason: collision with other inner class name */
    public static class C0222ka {
        public String ik;
        public wjv lr;
        public int ri = 0;

        public C0222ka(wjv wjvVar) {
            this.lr = wjvVar;
        }

        public C0222ka(String str) {
            this.ik = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik(mj mjVar) {
        mj mjVar2 = this.hcw;
        if (mjVar != mjVar2) {
            return;
        }
        if (this.ig) {
            if (this.ory < this.xha.ri() - 1) {
                int i = this.ory + 1;
                this.srn = i;
                if (this.vr) {
                    this.di.smoothScrollToPosition(i);
                } else {
                    lr(i);
                }
            } else {
                this.srn = 0;
                this.di.scrollToPosition(0);
                this.di.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.lr.ri(ka.this.ri)) {
                            return;
                        }
                        ka kaVar = ka.this;
                        kaVar.ri(kaVar.srn, true);
                    }
                });
            }
        } else if (this.gcp) {
            mjVar2.ik();
        } else {
            mjVar2.pv();
        }
        this.qh = null;
        this.gcp = false;
    }

    private void lr(mj mjVar) {
        for (mj mjVar2 : this.xha.lr()) {
            if (mjVar2 != mjVar) {
                mjVar2.ri(this.hcw, mjVar, this.oh);
            }
        }
        com.bytedance.sdk.openadsdk.activity.single.fi fiVar = this.pv;
        if (fiVar != null && fiVar != mjVar) {
            fiVar.ri(this.hcw, mjVar, this.oh);
        }
        mj mjVar3 = this.hcw;
        this.hcw = mjVar;
        if (mjVar3 != null) {
            mjVar3.f18078co = false;
            mjVar3.bgr();
            mjVar3.ka();
        }
        mjVar.f18078co = true;
        mjVar.lr(this.ri, new com.bytedance.sdk.openadsdk.activity.single.lr.fi(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.mj mjVarRi = mjVar.ri();
        if (mjVarRi.getVisibility() != 0) {
            mjVarRi.setVisibility(0);
        }
        if (mjVarRi.getParent() == null) {
            this.sf.addView(mjVarRi, new FrameLayout.LayoutParams(-1, -1));
        }
        this.ka.lr(mjVar);
        if (mjVar.f_() != this.dw) {
            mjVar.ri("card_sync");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public boolean ka() {
        return this.pv != null;
    }

    public static class ri extends RecyclerView.Adapter<fi> {
        private boolean fi;
        private final ka ik;
        private boolean ka;
        private final ArrayList<C0222ka> ri = new ArrayList<>();
        private final ArrayList<mj> lr = new ArrayList<>();

        public ri(ka kaVar, List<wjv> list) {
            this.ik = kaVar;
            for (int i = 0; i < list.size(); i++) {
                wjv wjvVar = list.get(i);
                if (wjvVar != null && kaVar != null) {
                    wjvVar.ig(kaVar.fi);
                }
                this.ri.add(new C0222ka(wjvVar));
            }
        }

        public List<wjv> fi() {
            ArrayList arrayList = new ArrayList();
            for (C0222ka c0222ka : this.ri) {
                if (c0222ka.ri == 0) {
                    arrayList.add(c0222ka.lr);
                }
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.fi) {
                return Integer.MAX_VALUE;
            }
            return this.ri.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            C0222ka c0222ka = this.ri.get(i % this.ri.size());
            if (c0222ka.ri != 0) {
                return -1;
            }
            oh ohVarZv = c0222ka.lr.zv();
            if (ohVarZv == null) {
                return 1;
            }
            return (ohVarZv.ri() + ohVarZv.lr()).hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(fi fiVar) {
            super.onViewRecycled(fiVar);
            if (fiVar instanceof lr) {
                lr lrVar = (lr) fiVar;
                com.bytedance.sdk.openadsdk.activity.single.ri riVar = lrVar.ik;
                if (!this.ik.ac) {
                    ri(lrVar, false);
                    return;
                }
                boolean zLr = lr(riVar);
                if (riVar != null) {
                    ri(lrVar, zLr);
                }
            }
        }

        public int ka() {
            return this.ka ? this.ri.size() - 1 : this.ri.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(fi fiVar) {
            com.bytedance.sdk.openadsdk.activity.single.ri riVar;
            super.onViewDetachedFromWindow(fiVar);
            if (!(fiVar instanceof lr) || (riVar = ((lr) fiVar).ik) == null) {
                return;
            }
            riVar.ay().ihz.tnn();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public fi onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == -1) {
                com.bytedance.sdk.openadsdk.core.di.ik ikVar = new com.bytedance.sdk.openadsdk.core.di.ik(viewGroup.getContext());
                ikVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new ik(ikVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.lr lrVar = new com.bytedance.sdk.openadsdk.component.reward.view.lr(viewGroup.getContext(), this.ik.slm, this.ik.vr, qd.lr(viewGroup.getContext(), 10.0f));
            lrVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new lr(this, lrVar);
        }

        private boolean lr(mj mjVar) {
            return mjVar != null && mjVar.hcw();
        }

        public ArrayList<mj> lr() {
            return this.lr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(fi fiVar, int i) {
            if (i >= this.ri.size()) {
                i %= this.ri.size();
            }
            fiVar.ri(this.ik, this.ri.get(i), i);
        }

        public boolean ik() {
            return this.fi;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(fi fiVar) {
            super.onViewAttachedToWindow(fiVar);
        }

        public int ri() {
            int itemCount = getItemCount();
            return this.ka ? itemCount - 1 : itemCount;
        }

        public void ri(String str) {
            int size = this.ri.size();
            C0222ka c0222ka = size > 0 ? this.ri.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (c0222ka == null || c0222ka.ri != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.ri.add(new C0222ka(str));
                notifyItemInserted(size);
                this.ka = true;
                return;
            }
            if (!zIsEmpty) {
                c0222ka.ik = str;
                notifyItemChanged(size - 1);
            } else {
                this.ri.remove(c0222ka);
                notifyItemRemoved(size - 1);
                this.ka = false;
            }
        }

        public void ri(mj mjVar) {
            this.lr.add(mjVar);
        }

        public void ri(List<wjv> list) {
            ka kaVar;
            int size = this.ri.size();
            if (this.ka) {
                size--;
            }
            for (int i = 0; i < list.size(); i++) {
                wjv wjvVar = list.get(i);
                if (wjvVar != null && (kaVar = this.ik) != null) {
                    wjvVar.ig(kaVar.fi);
                }
                this.ri.add(size + i, new C0222ka(wjvVar));
                wjvVar.zp();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void ri(int i, int i2) {
            if (this.fi) {
                return;
            }
            this.fi = true;
            if (i < 0) {
                i = 0;
            }
            int size = this.ri.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i2) - (size - i));
            notifyItemRangeInserted(0, i2 - i);
        }

        public void ri(lr lrVar, boolean z) {
            if (lrVar.ik == null) {
                return;
            }
            this.lr.remove(lrVar.ik);
            lrVar.ri(z);
        }
    }

    private static int ri(int i, int i2, int i3) {
        if (i < 0) {
            i = 0;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            if (i5 % i2 == i) {
                return i5;
            }
            int i6 = i3 - i4;
            if (i6 % i2 == i) {
                return i6;
            }
        }
        return i3;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(Bundle bundle) {
        super.ri(bundle);
        dw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i, String str) {
        this.kt = false;
        ay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
        this.kt = false;
        if (riVar.ka() != null && !riVar.ka().isEmpty()) {
            ri(riVar);
            return;
        }
        ikVar.ri(-3);
        ikVar.ik(1);
        com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
        ay();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ik() {
        super.ik();
        this.xm = true;
        mj mjVar = this.hcw;
        if (mjVar != null) {
            mjVar.bgr();
        }
        dzy();
        this.gcp = this.qh != null;
        this.qt.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void lr(Activity activity) {
        super.lr(activity);
        qd.ri(activity);
    }

    private void lr(int i) {
        RecyclerView.stratoscope stratoscopeVarFindViewHolderForAdapterPosition;
        int iFindFirstVisibleItemPosition = this.mj.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.mj.findLastVisibleItemPosition();
        if (i < iFindFirstVisibleItemPosition) {
            this.di.smoothScrollToPosition(i);
            return;
        }
        if (i <= iFindLastVisibleItemPosition) {
            int i2 = i - iFindFirstVisibleItemPosition;
            int childCount = this.di.getChildCount();
            if (i2 <= 0 || i2 >= childCount || (stratoscopeVarFindViewHolderForAdapterPosition = this.di.findViewHolderForAdapterPosition(i - 1)) == null) {
                return;
            }
            this.di.smoothScrollBy(0, stratoscopeVarFindViewHolderForAdapterPosition.itemView.getBottom());
            return;
        }
        this.di.smoothScrollToPosition(this.srn);
    }

    private void ri(final com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        fr frVarQt = riVar.qt();
        if (frVarQt != null) {
            this.jc = frVarQt.co();
            this.kt = frVarQt.aw();
        }
        if (!this.vr) {
            for (wjv wjvVar : riVar.ka()) {
                if (wjvVar.eu() != null && wjv.fi(wjvVar)) {
                    com.bytedance.sdk.openadsdk.core.bgr.ri.lr lrVarRi = wjv.ri(CacheDirFactory.getICacheDir(wjvVar.qf()).ri(), wjvVar);
                    lrVarRi.ri("material_meta", wjvVar);
                    lrVarRi.ri("ad_slot", wjvVar.eb());
                    com.bytedance.sdk.openadsdk.core.bgr.fi.ri.ri(lrVarRi, new laky.attabal() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.2
                        @Override // laky.saneness.attabal
                        public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i) {
                        }

                        @Override // laky.saneness.attabal
                        public void ri(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar, int i, String str) {
                        }
                    });
                }
            }
        }
        dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.lr.ri(ka.this.ri)) {
                    return;
                }
                ka.this.aw.set(false);
                ka.this.xha.ri("");
                ka.this.xha.ri(riVar.ka());
                ka.this.wjv();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void lr() {
        super.lr();
        this.xm = false;
        this.aac = false;
        mj mjVar = this.hcw;
        if (mjVar != null && !this.gcp) {
            mjVar.ik();
        }
        if (this.bnj == 0) {
            this.bnj = SystemClock.elapsedRealtime();
        }
        xd();
        zf();
        Iterator<Message> it = this.tan.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.tan.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(int i, boolean z) {
        int i2;
        RecyclerView.stratoscope stratoscopeVarFindViewHolderForAdapterPosition = this.di.findViewHolderForAdapterPosition(i);
        if (stratoscopeVarFindViewHolderForAdapterPosition == null || !(stratoscopeVarFindViewHolderForAdapterPosition instanceof lr) || (i2 = this.ory) == i) {
            return;
        }
        ri(i2, i, z);
        this.ory = i;
        this.ta = SystemClock.elapsedRealtime();
        mj mjVarRi = ((lr) stratoscopeVarFindViewHolderForAdapterPosition).ri();
        if (mjVarRi == null) {
            return;
        }
        lr(mjVarRi);
        this.bgr.add(mjVarRi.di.fe());
        if (this.kt && this.fr > 0 && this.ory >= this.xha.ri() - this.fr) {
            uq();
        }
        com.bytedance.sdk.openadsdk.activity.single.ri riVarAw = aw();
        if (riVarAw != null) {
            if (!this.vr && this.mj.findLastVisibleItemPosition() >= this.ory + 1) {
                riVarAw.fi(true);
            }
            this.bu.add(Integer.valueOf(this.ory + 1));
            riVarAw.su();
            this.whw = false;
            return;
        }
        this.whw = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void lr(mj mjVar, int i) {
        mj mjVar2 = this.hcw;
        if (mjVar != mjVar2) {
            return;
        }
        if (i == 2) {
            dzy();
            return;
        }
        if (i == 1) {
            if (oh()) {
                mj mjVar3 = this.hcw;
                if (mjVar3 instanceof com.bytedance.sdk.openadsdk.activity.single.ri) {
                    ((com.bytedance.sdk.openadsdk.activity.single.ri) mjVar3).zf();
                    return;
                }
                return;
            }
            xd();
            return;
        }
        if (i == 3 || i == 4) {
            try {
                mjVar2.ay().ihz.oh();
            } catch (Throwable th) {
                ac.ik("CardsLayoutManager", th);
            }
        }
    }

    private void ri(int i, int i2, boolean z) {
        String str;
        if (i < 0 || i2 < 0 || i == i2) {
            return;
        }
        if (z) {
            str = "auto_down";
        } else {
            str = i2 > i ? "down" : "up";
        }
        final String str2 = str;
        final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.ta) / 1000;
        List<wjv> listFi = this.xha.fi();
        final int size = i % listFi.size();
        final int size2 = i2 % listFi.size();
        wjv wjvVar = listFi.get(size);
        com.bytedance.sdk.openadsdk.ka.ik.ri(System.currentTimeMillis(), wjvVar, wjvVar.fi(), "slide", new com.bytedance.sdk.openadsdk.slm.lr.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.5
            @Override // com.bytedance.sdk.openadsdk.slm.lr.ri, com.bytedance.sdk.openadsdk.slm.lr.lr
            public JSONObject ri() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("from", size + 1);
                    jSONObject.put("to", size2 + 1);
                    jSONObject.put("direction", str2);
                    jSONObject.put("click_user_remaining", jElapsedRealtime);
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(final mj mjVar, mj mjVar2, com.bytedance.sdk.openadsdk.activity.single.lr.fi fiVar) {
        long jKa;
        if (mjVar != this.hcw) {
            return;
        }
        if (mjVar.fr() || dw.lr(mjVar.di)) {
            jKa = 500;
        } else {
            su suVarDob = mjVar.di.dob();
            jKa = suVarDob != null ? ((long) suVarDob.ka()) * 1000 : 0L;
        }
        di diVar = this.qh;
        if (diVar != null) {
            diVar.ka();
        }
        di diVar2 = new di(Math.max(500L, jKa)) { // from class: com.bytedance.sdk.openadsdk.activity.single.ka.6
            @Override // com.bytedance.sdk.openadsdk.activity.single.ka.di
            public void ri() {
                if (com.bytedance.sdk.component.utils.lr.ri(ka.this.ri)) {
                    return;
                }
                ka.this.ik(mjVar);
            }
        };
        this.qh = diVar2;
        diVar2.fi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(boolean z) {
        super.ri(z);
        mj mjVar = this.hcw;
        if (mjVar != null) {
            mjVar.ik(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public boolean ri(mj mjVar, int i) {
        com.bytedance.sdk.openadsdk.activity.single.fi fiVar = this.pv;
        return fiVar != null && fiVar == mjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(View view) {
        super.ri(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.sf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(Activity activity) {
        super.ri(activity);
        mj mjVar = this.hcw;
        if (mjVar != null) {
            mjVar.lr(activity);
        }
        com.bytedance.sdk.openadsdk.activity.single.fi fiVar = this.pv;
        if (fiVar != null) {
            fiVar.tan();
        }
        Iterator<mj> it = this.xha.lr().iterator();
        while (it.hasNext()) {
            it.next().tan();
        }
        this.qt.removeCallbacksAndMessages(null);
        di diVar = this.qh;
        if (diVar != null) {
            diVar.ka();
            this.qh = null;
        }
        mj mjVar2 = this.hcw;
        if (mjVar2 == null || mjVar2.uq() || this.lr.bl()) {
            return;
        }
        vr.lr().post(new com.bytedance.sdk.openadsdk.activity.single.lr.ik(this.lr));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.ik
    public void ri(Map<String, Object> map, mj mjVar, float f, float f2) {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.mj mjVarRi = mjVar.ri();
                ((JSONObject) jSONObject).put("width", mjVarRi.getWidth());
                ((JSONObject) jSONObject).put("height", mjVarRi.getHeight());
                int i = mjVar.qt;
                ((JSONObject) jSONObject).put("click_feed_top", i == this.mj.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_on_final", i == this.xha.ka() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.xd);
                ((JSONObject) jSONObject).put("click_user_remaining", i == this.ory ? (SystemClock.elapsedRealtime() - this.ta) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
