package com.bytedance.sdk.openadsdk.activity;

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
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.qdl.rq;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.aaj;
import com.bytedance.sdk.openadsdk.core.jyq;
import com.bytedance.sdk.openadsdk.core.model.bqt;
import com.bytedance.sdk.openadsdk.core.model.ekw;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.model.uw;
import com.bytedance.sdk.openadsdk.core.model.vu;
import com.bytedance.sdk.openadsdk.core.model.xmv;
import com.bytedance.sdk.openadsdk.core.oth;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mml extends com.bytedance.sdk.openadsdk.activity.lnr implements Handler.Callback {
    private final boolean aaj;
    private JSONObject ag;
    private int ax;
    private boolean bch;
    private final boolean bjy;
    private int bqt;
    private View car;
    private boolean cx;
    private boolean dk;
    private com.bytedance.sdk.openadsdk.activity.ud.mzz ekw;
    private final ArrayList<Message> exc;
    private final AtomicBoolean exu;
    private com.bytedance.sdk.openadsdk.activity.mzz fco;
    private final boolean fs;
    private long gt;
    private uw.qdl gy;
    private int hkc;
    private int hzv;
    private long irn;
    private boolean jjk;
    private final PAGLogoView jl;
    private final LinearLayoutManager jpc;
    private final boolean jtx;
    private boolean jyq;
    private jpc kdv;
    private boolean koa;
    private int ljh;
    private long lte;
    private boolean mlb;
    private final RecyclerView mo;
    private boolean mrf;
    private FrameLayout om;
    private int oth;
    private int rc;
    private final HashSet<String> rdp;
    private final FrameLayout rq;
    private boolean sy;
    private Message taz;
    private mo tid;
    private final Handler to;
    private final TopLayoutDislike2 tvp;
    private int uw;
    private boolean vu;
    private JSONObject wak;
    private boolean wc;
    private final qdl wd;
    private boolean xi;
    private boolean xmv;
    private JSONObject yh;
    private final HashSet<Integer> yt;
    private boolean zlt;

    public static class lnr extends mzz {
        private final TextView qdl;

        public lnr(View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(view.getContext());
            this.qdl = jpcVar;
            jpcVar.setTextColor(Color.parseColor("#99FFFFFF"));
            jpcVar.setTextSize(14.0f);
            jpcVar.setGravity(17);
            jpcVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(jpcVar, new FrameLayout.LayoutParams(-1, -2));
        }

        @Override // com.bytedance.sdk.openadsdk.activity.mml.mzz
        public void qdl(mml mmlVar, C0101mml c0101mml, int i2) {
            this.qdl.setText(c0101mml.lnr);
        }
    }

    public static abstract class mo implements Runnable {
        private long lnr;
        private long mml;
        private long mzz;
        private final Handler qdl = new Handler(Looper.getMainLooper());
        private final long ud;

        public mo(long j) {
            this.ud = j;
        }

        public void lnr() {
            long j = this.ud - this.mml;
            if (j < 0) {
                return;
            }
            this.qdl.removeCallbacks(this);
            this.qdl.postDelayed(this, j);
            this.lnr = SystemClock.elapsedRealtime();
        }

        public void mml() {
            this.qdl.removeCallbacks(this);
        }

        public long mo() {
            long jElapsedRealtime;
            long j;
            if (this.lnr > this.mzz) {
                jElapsedRealtime = this.ud - (SystemClock.elapsedRealtime() - this.lnr);
                j = this.mml;
            } else {
                jElapsedRealtime = this.ud;
                j = this.mml;
            }
            long j2 = jElapsedRealtime - j;
            if (j2 < 0) {
                return 0L;
            }
            return j2;
        }

        public void mzz() {
            this.qdl.postDelayed(this, this.ud);
            this.lnr = SystemClock.elapsedRealtime();
        }

        public abstract void qdl();

        @Override // java.lang.Runnable
        public void run() {
            qdl();
        }

        public void ud() {
            this.qdl.removeCallbacks(this);
            if (this.mzz > this.lnr) {
                return;
            }
            this.mml = (SystemClock.elapsedRealtime() - this.lnr) + this.mml;
            this.mzz = SystemClock.elapsedRealtime();
        }
    }

    public static abstract class mzz extends RecyclerView.ViewHolder {
        public mzz(View view) {
            super(view);
        }

        public abstract void qdl(mml mmlVar, C0101mml c0101mml, int i2);
    }

    public static class ud extends mzz {
        private com.bytedance.sdk.openadsdk.activity.qdl lnr;
        private final qdl qdl;
        private final com.bytedance.sdk.openadsdk.component.reward.view.ud ud;

        public ud(qdl qdlVar, View view) {
            super(view);
            this.qdl = qdlVar;
            this.ud = (com.bytedance.sdk.openadsdk.component.reward.view.ud) view;
        }

        public jpc qdl() {
            return this.lnr;
        }

        @Override // com.bytedance.sdk.openadsdk.activity.mml.mzz
        public void qdl(mml mmlVar, C0101mml c0101mml, int i2) {
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = mmlVar.qdl;
            if (com.bytedance.sdk.component.utils.ud.qdl(activity)) {
                return;
            }
            ljh ljhVar = c0101mml.ud;
            com.bytedance.sdk.openadsdk.activity.qdl qdlVar = this.lnr;
            if (qdlVar != null) {
                if (qdl(qdlVar, ljhVar)) {
                    this.lnr.qdl(ljhVar, bindingAdapterPosition, i2);
                } else {
                    this.qdl.qdl(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.ud udVar = mmlVar.mml;
            if (this.lnr == null) {
                this.lnr = ljhVar.mq() ? new wd(udVar, ljhVar, bindingAdapterPosition, i2, false) : new com.bytedance.sdk.openadsdk.activity.mo(udVar, ljhVar, bindingAdapterPosition, i2, false);
            }
            com.bytedance.sdk.openadsdk.activity.ud.mzz mzzVar = new com.bytedance.sdk.openadsdk.activity.ud.mzz(1, null);
            mzzVar.mml = mmlVar.vu;
            this.lnr.ud(activity, mzzVar);
            this.qdl.qdl(this.lnr);
            com.bytedance.sdk.openadsdk.component.reward.view.tvp tvpVarQdl = this.lnr.qdl();
            if (tvpVarQdl == null) {
                return;
            }
            ViewParent parent = tvpVarQdl.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(tvpVarQdl);
            }
            if (!mmlVar.bjy) {
                float fEx = ljhVar.ex();
                if (fEx > 0.0f) {
                    this.ud.setWidthAndHeightRatio(fEx);
                } else {
                    this.ud.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            this.ud.qdl(tvpVarQdl, new FrameLayout.LayoutParams(-1, -1));
            this.ud.setScene(this.lnr);
        }

        private boolean qdl(jpc jpcVar, ljh ljhVar) {
            ekw ekwVarKr;
            if (jpcVar.hzv() && (ekwVarKr = jpcVar.mo.kr()) != null) {
                ekw ekwVarKr2 = ljhVar.kr();
                if (TextUtils.equals(ekwVarKr.qdl(), ekwVarKr2.qdl()) && TextUtils.equals(ekwVarKr.ud(), ekwVarKr2.ud()) && jpcVar.fco()) {
                    return true;
                }
            }
            return false;
        }

        public void qdl(boolean z2) {
            com.bytedance.sdk.openadsdk.activity.qdl qdlVar = this.lnr;
            if (qdlVar == null) {
                return;
            }
            qdlVar.mo(z2);
            this.lnr.aaj();
            if (!z2) {
                this.lnr = null;
            }
            this.ud.qdl();
        }
    }

    public mml(final Activity activity, final ljh ljhVar, final com.bytedance.sdk.openadsdk.activity.ud udVar) {
        uw uwVarFs;
        super(activity, ljhVar, udVar);
        this.to = new Handler(Looper.getMainLooper(), this);
        boolean z2 = false;
        this.exu = new AtomicBoolean(false);
        this.rdp = new HashSet<>();
        this.yt = new HashSet<>();
        this.exc = new ArrayList<>();
        this.oth = 5;
        this.ljh = 3;
        this.rc = -1;
        int i2 = 1;
        this.ekw = new com.bytedance.sdk.openadsdk.activity.ud.mzz(1, null);
        boolean z3 = ljhVar.taz() == 44;
        this.bjy = z3;
        boolean zMq = ljhVar.mq();
        this.fs = zMq;
        this.jtx = rq.qdl(activity, ljhVar) == 1;
        com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(activity) { // from class: com.bytedance.sdk.openadsdk.activity.mml.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                mml.this.yh = null;
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.rq = lnrVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lnrVar.setFitsSystemWindows(true);
        }
        activity.setContentView(lnrVar);
        this.mzz = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarMml = ljhVar.mml();
        if (qdlVarMml != null && (uwVarFs = qdlVarMml.fs()) != null) {
            this.mrf = uwVarFs.bjy();
            this.gy = uwVarFs.mo();
            int iMax = Math.max(0, uwVarFs.tvp());
            this.hkc = iMax;
            this.hzv = iMax;
            this.koa = uwVarFs.rdp();
            this.xmv = uwVarFs.rq();
            this.uw = uwVarFs.jpc();
            this.ag = uwVarFs.fs();
            this.bch = uwVarFs.to();
            this.jyq = uwVarFs.qdl();
            this.wc = this.uw > 0;
            this.oth = uwVarFs.mml();
            this.ljh = uwVarFs.mzz();
            this.yh = uwVarFs.ud();
            this.wak = uwVarFs.lnr();
            if (!this.xmv) {
                this.mrf = false;
            }
        }
        if (zMq) {
            int iIjp = ljhVar.ijp();
            this.bqt = (int) ((1.0f - (Math.max(0, Math.min(100, iIjp < 0 ? yt.mml().xmv(String.valueOf(ljhVar.fz())).mo : iIjp)) / 100.0f)) * this.hkc);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.mo = recyclerView;
        uw.qdl qdlVar = this.gy;
        if (qdlVar != null) {
            int iLnr = qdlVar.lnr();
            int iMml = this.gy.mml();
            if (iLnr > 0 || iMml > 0) {
                recyclerView.setPadding(ax.ud(activity, iLnr), 0, ax.ud(activity, iMml), 0);
            }
            int iUd = this.gy.ud();
            int iQdl = this.gy.qdl();
            int iMzz = this.gy.mzz();
            if (iUd > 0 || iMzz > 0 || iQdl > 0) {
                final int iUd2 = ax.ud(activity, iUd);
                final int iUd3 = ax.ud(activity, iQdl);
                final int iUd4 = ax.ud(activity, iMzz);
                recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.bytedance.sdk.openadsdk.activity.mml.12
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = iUd2;
                        } else {
                            rect.top = iUd4 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = iUd3;
                        } else {
                            rect.bottom = iUd4 / 2;
                        }
                    }
                });
            }
        }
        lnrVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.tvp = topLayoutDislike2;
        lnrVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(ljhVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        boolean zYt = yt.mml().yt(String.valueOf(ljhVar.fz()));
        this.vu = zYt;
        topLayoutDislike2.setSoundMute(zYt);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.ud() { // from class: com.bytedance.sdk.openadsdk.activity.mml.13
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void lnr(View view) {
                udVar.mo();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void mml(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view) {
                com.bytedance.sdk.openadsdk.core.fs.mml mmlVarQdl;
                ljh ljhVar2 = ljhVar;
                com.bytedance.sdk.openadsdk.mml.lnr.qdl("skip", ljhVar2, ljhVar2.mzz(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.mml mmlVarZm = ljhVar.zm();
                if (mmlVarZm != null && (mmlVarQdl = mmlVarZm.qdl()) != null) {
                    mmlVarQdl.mo(0L);
                    mmlVarQdl.mzz(0L);
                }
                mml.this.uw();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void ud(View view) {
                if (mml.this.kdv != null) {
                    mml.this.kdv.c_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.ud
            public void qdl(View view, String str) {
                if (mml.this.kdv != null) {
                    mml.this.kdv.qdl(str);
                    mml mmlVar = mml.this;
                    mmlVar.vu = !mmlVar.vu;
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, i2, z2) { // from class: com.bytedance.sdk.openadsdk.activity.mml.14
            {
                super(i2, z2);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                super.calculateExtraLayoutSpace(state, iArr);
                int height = mml.this.mo.getHeight();
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.jpc = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        qdl qdlVar2 = new qdl(this, ljhVar.gxp());
        this.wd = qdlVar2;
        recyclerView.setAdapter(qdlVar2);
        if (!this.wc && !this.bch) {
            qdlVar2.qdl(com.bytedance.sdk.component.utils.ljh.qdl(activity, "tt_list_end_tip"));
        }
        if (z3) {
            new PagerSnapHelper().attachToRecyclerView(recyclerView);
        } else if (this.xmv) {
            new com.bytedance.sdk.openadsdk.component.reward.view.qdl().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.mml.15
            private final Rect lnr = new Rect();
            private int mml = -1;
            private int mzz;

            /* JADX WARN: Code duplicated, block: B:22:0x006d  */
            /* JADX WARN: Code duplicated, block: B:24:0x007b  */
            /* JADX WARN: Code duplicated, block: B:26:0x0083  */
            /* JADX WARN: Code duplicated, block: B:29:0x008e  */
            /* JADX WARN: Code duplicated, block: B:37:0x0090 A[SYNTHETIC] */
            private void qdl() {
                int iMml2;
                View viewFindViewByPosition;
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                ud udVar2;
                if (mml.this.jyq && (iMml2 = mml.this.wd.mml()) != 0) {
                    int iFindFirstVisibleItemPosition = mml.this.jpc.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = mml.this.jpc.findLastVisibleItemPosition();
                    if (iFindLastVisibleItemPosition % iMml2 > this.mml) {
                        for (int i3 = iFindFirstVisibleItemPosition; i3 <= iFindLastVisibleItemPosition; i3++) {
                            int i4 = i3 % iMml2;
                            if (i4 > this.mml) {
                                if ((i3 == iFindFirstVisibleItemPosition || i3 == iFindLastVisibleItemPosition) && (viewFindViewByPosition = mml.this.jpc.findViewByPosition(i3)) != null) {
                                    this.lnr.setEmpty();
                                    viewFindViewByPosition.getGlobalVisibleRect(this.lnr);
                                    int height = viewFindViewByPosition.getHeight();
                                    if (height > 0 && (this.lnr.height() * 1.0f) / height >= 0.5f) {
                                        viewHolderFindViewHolderForAdapterPosition = mml.this.mo.findViewHolderForAdapterPosition(i3);
                                        if (viewHolderFindViewHolderForAdapterPosition instanceof ud) {
                                            udVar2 = (ud) viewHolderFindViewHolderForAdapterPosition;
                                            if (udVar2.lnr != null) {
                                                udVar2.lnr.koa();
                                            }
                                        }
                                        if (i4 > this.mml) {
                                            this.mml = i4;
                                        }
                                    }
                                } else {
                                    viewHolderFindViewHolderForAdapterPosition = mml.this.mo.findViewHolderForAdapterPosition(i3);
                                    if (viewHolderFindViewHolderForAdapterPosition instanceof ud) {
                                        udVar2 = (ud) viewHolderFindViewHolderForAdapterPosition;
                                        if (udVar2.lnr != null) {
                                            udVar2.lnr.koa();
                                        }
                                    }
                                    if (i4 > this.mml) {
                                        this.mml = i4;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView2, int i3) {
                super.onScrollStateChanged(recyclerView2, i3);
                if (com.bytedance.sdk.component.utils.ud.qdl(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = mml.this.jpc.findFirstCompletelyVisibleItemPosition();
                mml.this.jpc.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = mml.this.jpc.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i3 == 0 && iFindFirstCompletelyVisibleItemPosition != mml.this.rc) {
                    boolean z4 = iFindFirstCompletelyVisibleItemPosition == mml.this.ax;
                    mml mmlVar = mml.this;
                    mmlVar.qdl(iFindFirstCompletelyVisibleItemPosition, mmlVar.mrf && z4);
                    if (mml.this.mrf && !z4 && mml.this.koa) {
                        mml.this.mrf = false;
                    }
                    if (mml.this.tid != null) {
                        mml.this.tid.mml();
                        mml.this.tid = null;
                    }
                }
                if (i3 == 0) {
                    mml.this.ax = -1;
                }
                if (!mml.this.wc || mml.this.uw <= 0 || iFindLastVisibleItemPosition < mml.this.wd.qdl() - mml.this.uw) {
                    return;
                }
                mml.this.oth();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView2, int i3, int i4) {
                super.onScrolled(recyclerView2, i3, i4);
                if (i4 == 0 || com.bytedance.sdk.component.utils.ud.qdl(activity)) {
                    return;
                }
                qdl();
                int iFindLastVisibleItemPosition = mml.this.jpc.findLastVisibleItemPosition();
                if (i4 > 0 && mml.this.wc && mml.this.uw > 0 && iFindLastVisibleItemPosition >= mml.this.wd.qdl() - mml.this.uw) {
                    mml.this.oth();
                }
                if (this.mzz != iFindLastVisibleItemPosition) {
                    this.mzz = iFindLastVisibleItemPosition;
                    if (!mml.this.yt.isEmpty() && mml.this.yt.contains(Integer.valueOf(iFindLastVisibleItemPosition))) {
                        mml.this.yt.remove(Integer.valueOf(iFindLastVisibleItemPosition));
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (viewHolderFindViewHolderForAdapterPosition instanceof ud) {
                            ud udVar2 = (ud) viewHolderFindViewHolderForAdapterPosition;
                            udVar2.lnr.mzz(true);
                            udVar2.lnr.rc();
                            return;
                        }
                        return;
                    }
                    if (mml.this.jjk) {
                        mml.this.jjk = false;
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition);
                        if (viewHolderFindViewHolderForAdapterPosition2 instanceof ud) {
                            ud udVar3 = (ud) viewHolderFindViewHolderForAdapterPosition2;
                            if (udVar3.lnr != null) {
                                udVar3.lnr.mzz(true);
                                udVar3.lnr.vu();
                            }
                        }
                    }
                }
            }
        });
        kdv();
        final int iJyq = jyq();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.mml.16
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.ud.qdl(activity)) {
                    return;
                }
                mml.this.qdl(iJyq, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, ljhVar);
        this.jl = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = ax.ud(activity, 16.0f);
        lnrVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.mml.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Context context = view.getContext();
                ljh ljhVar2 = ljhVar;
                TTWebsiteActivity.qdl(context, ljhVar2, ljhVar2.mzz());
            }
        });
        this.aaj = com.bytedance.sdk.openadsdk.jyq.qdl.qdl("draw_feed_item_reuse", 0) == 1;
    }

    private void bqt() {
        jpc jpcVar;
        if (!this.fs || this.mml.bjy() || (jpcVar = this.kdv) == null) {
            return;
        }
        jpcVar.xi();
    }

    private boolean ekw() {
        FrameLayout frameLayout = this.om;
        return (frameLayout == null || frameLayout.getParent() == null) ? false : true;
    }

    private void hkc() {
        if (this.lte != 0) {
            jpc jpcVar = this.kdv;
            if (jpcVar != null && vu.ud(jpcVar.mo)) {
                int iCurrentTimeMillis = this.hkc - ((int) ((System.currentTimeMillis() - this.lte) / 1000));
                this.hkc = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.hkc = 0;
                }
            }
            this.lte = 0L;
        }
        if (this.hkc >= 0) {
            this.to.removeMessages(1);
            this.to.sendEmptyMessage(1);
        }
        mo moVar = this.tid;
        if (moVar != null) {
            moVar.lnr();
        }
    }

    private void hzv() {
        if (this.dk) {
            this.lte = System.currentTimeMillis();
        }
        this.to.removeMessages(1);
        mo moVar = this.tid;
        if (moVar != null) {
            moVar.ud();
        }
    }

    private void kdv() {
        uw uwVarFs;
        com.bytedance.sdk.openadsdk.core.model.qdl qdlVarMml = this.ud.mml();
        if (qdlVarMml == null || (uwVarFs = qdlVarMml.fs()) == null || TextUtils.isEmpty(uwVarFs.wd())) {
            return;
        }
        this.fco = new com.bytedance.sdk.openadsdk.activity.mzz(this.mml, this.ud, -1, 1, false, false, true);
    }

    private void koa() {
        if (this.cx || this.yh == null) {
            return;
        }
        this.to.removeMessages(3);
        this.to.sendEmptyMessageDelayed(3, ((long) this.oth) * 1000);
    }

    private void rc() {
        if (this.om != null || this.yh == null || this.mlb) {
            return;
        }
        this.cx = true;
        this.om = new com.bytedance.sdk.openadsdk.core.mo.lnr(this.qdl) { // from class: com.bytedance.sdk.openadsdk.activity.mml.10
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                mml.this.to.removeMessages(4);
                mml.this.to.sendEmptyMessage(4);
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        View view = this.car;
        if (view != null && view.getParent() == null) {
            this.om.addView(this.car, new FrameLayout.LayoutParams(-1, -1));
        }
        this.rq.addView(this.om, new FrameLayout.LayoutParams(-1, -1));
        this.to.sendEmptyMessageDelayed(4, ((long) this.ljh) * 1000);
        jpc jpcVar = this.kdv;
        if (jpcVar instanceof com.bytedance.sdk.openadsdk.activity.qdl) {
            ((com.bytedance.sdk.openadsdk.activity.qdl) jpcVar).kdv();
        }
        hzv();
    }

    private void vu() {
        if (this.yh == null) {
            return;
        }
        new com.bytedance.sdk.openadsdk.core.rq.tvp.qdl(this.qdl).qdl(this.yh, com.bytedance.sdk.openadsdk.core.tvp.qdl.ud.ud(), this.wak, new com.bytedance.sdk.openadsdk.core.rq.wd.mml() { // from class: com.bytedance.sdk.openadsdk.activity.mml.9
            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.mml
            public void qdl(int i2, String str) {
                mml.this.mlb = true;
            }

            @Override // com.bytedance.sdk.openadsdk.core.rq.wd.mml
            public void qdl(com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVar) {
                View viewRq = lnrVar.rq();
                ViewGroup viewGroup = (ViewGroup) viewRq.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(viewRq);
                }
                mml.this.car = viewRq;
                if (mml.this.om != null) {
                    mml.this.om.addView(viewRq, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        });
    }

    private void xmv() {
        FrameLayout frameLayout = this.om;
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.om);
        }
        this.om = null;
        jpc jpcVar = this.kdv;
        if (jpcVar instanceof com.bytedance.sdk.openadsdk.activity.qdl) {
            ((com.bytedance.sdk.openadsdk.activity.qdl) jpcVar).ekw();
        }
        hkc();
        Message message = this.taz;
        if (message != null) {
            handleMessage(message);
            this.taz = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void exc() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public com.bytedance.sdk.openadsdk.component.reward.top.lnr fs() {
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.zlt) {
            this.exc.add(this.to.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i2 = message.what;
        if (i2 == 1) {
            int i3 = this.hkc;
            if (i3 > 0) {
                if (i3 <= this.bqt) {
                    bqt();
                }
                int i4 = this.hzv;
                int i5 = (int) ((((double) (i4 - this.hkc)) * 100.0d) / ((double) i4));
                TopLayoutDislike2 topLayoutDislike2 = this.tvp;
                StringBuilder sb = new StringBuilder();
                int i6 = this.hkc;
                this.hkc = i6 - 1;
                sb.append(i6);
                sb.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb.toString(), i5);
                if (this.hkc >= 0) {
                    this.to.removeMessages(message.what);
                    this.to.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                bqt();
                if (mml()) {
                    this.tvp.showSkipButton();
                } else {
                    this.tvp.showCloseButton();
                }
            }
        } else if (i2 == 3) {
            rc();
        } else if (i2 == 4) {
            xmv();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void jl() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(int i2) {
    }

    private void bch() {
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.mml.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.ud.qdl(mml.this.qdl)) {
                    return;
                }
                mml.this.exu.set(false);
                if (!mml.this.bch) {
                    mml.this.wd.qdl(com.bytedance.sdk.component.utils.ljh.qdl(yt.qdl(), "tt_list_end_tip"));
                } else {
                    mml.this.wd.qdl("");
                    mml.this.ljh();
                }
            }
        });
    }

    private int jyq() {
        if (!this.bch || this.wd.lnr() || this.exu.get() || this.wc) {
            return 0;
        }
        int iQdl = qdl(this.rc, this.wd.mml(), 1073741823);
        this.wd.qdl(this.rc, iQdl);
        if (this.rc < 0) {
            this.mo.scrollToPosition(iQdl);
            return iQdl;
        }
        this.rc = iQdl;
        return iQdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ljh() {
        if (this.wc) {
            return;
        }
        if (this.bch) {
            jyq();
        } else {
            fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.mml.2
                @Override // java.lang.Runnable
                public void run() {
                    if (com.bytedance.sdk.component.utils.ud.qdl(mml.this.qdl)) {
                        return;
                    }
                    mml.this.wd.qdl(com.bytedance.sdk.component.utils.ljh.qdl(yt.qdl(), "tt_list_end_tip"));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oth() {
        if (this.exu.compareAndSet(false, true)) {
            AdSlot adSlotJi = this.ud.ji();
            bqt bqtVar = new bqt();
            bqtVar.mo = true;
            if (this.ud.xdk() != null || this.ud.kr() != null) {
                bqtVar.tvp = 2;
            }
            bqtVar.wd = this.ag;
            this.wd.qdl(com.bytedance.sdk.component.utils.ljh.qdl(this.qdl, "tt_loading_more"));
            if (com.bytedance.sdk.openadsdk.utils.ud.qdl()) {
                yt.lnr().qdl(adSlotJi, bqtVar, this.ud.ok(), (aaj) new jyq() { // from class: com.bytedance.sdk.openadsdk.activity.mml.18
                    @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                    public void qdl(int i2, String str) {
                        mml.this.qdl(i2, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.jyq, com.bytedance.sdk.openadsdk.core.oth.qdl
                    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                        mml.this.qdl(qdlVar, lnrVar);
                    }
                });
            } else {
                yt.lnr().qdl(adSlotJi, bqtVar, this.ud.ok(), new oth.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.mml.19
                    @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                    public void qdl(int i2, String str) {
                        mml.this.qdl(i2, str);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.oth.qdl
                    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
                        mml.this.qdl(qdlVar, lnrVar);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uw() {
        com.bytedance.sdk.openadsdk.activity.mzz mzzVar = this.fco;
        if (mzzVar == null || !mzzVar.exc()) {
            this.mml.mo();
            return;
        }
        ud(this.fco);
        this.rq.removeView(this.mo);
        this.tvp.setVisibility(8);
        this.jl.setVisibility(8);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    /* JADX INFO: renamed from: aaj, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.qdl exu() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.mo.findViewHolderForAdapterPosition(this.rc + 1);
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof ud)) {
            return null;
        }
        jpc jpcVarQdl = ((ud) viewHolderFindViewHolderForAdapterPosition).qdl();
        if (jpcVarQdl instanceof com.bytedance.sdk.openadsdk.activity.qdl) {
            return (com.bytedance.sdk.openadsdk.activity.qdl) jpcVarQdl;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public List<ljh> bjy() {
        return this.wd.mzz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public int jpc() {
        return this.hkc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void jtx() {
        if (this.xi) {
            return;
        }
        this.xi = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.irn;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ljh ljhVar = this.ud;
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(jCurrentTimeMillis, ljhVar, ljhVar.mzz(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.mml.11
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject ud() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public boolean mzz() {
        return this.vu;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public jpc rq() {
        return this.kdv;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public int to() {
        return this.rdp.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void yt() {
        super.yt();
        this.dk = true;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.mml$mml, reason: collision with other inner class name */
    public static class C0101mml {
        public String lnr;
        public int qdl = 0;
        public ljh ud;

        public C0101mml(ljh ljhVar) {
            this.ud = ljhVar;
        }

        public C0101mml(String str) {
            this.lnr = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lnr(jpc jpcVar) {
        jpc jpcVar2 = this.kdv;
        if (jpcVar != jpcVar2) {
            return;
        }
        if (this.mrf) {
            if (this.rc < this.wd.qdl() - 1) {
                int i2 = this.rc + 1;
                this.ax = i2;
                if (this.bjy) {
                    this.mo.smoothScrollToPosition(i2);
                } else {
                    ud(i2);
                }
            } else {
                this.ax = 0;
                this.mo.scrollToPosition(0);
                this.mo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.mml.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.bytedance.sdk.component.utils.ud.qdl(mml.this.qdl)) {
                            return;
                        }
                        mml mmlVar = mml.this;
                        mmlVar.qdl(mmlVar.ax, true);
                    }
                });
            }
        } else if (this.sy) {
            jpcVar2.lnr();
        } else {
            jpcVar2.ax();
        }
        this.tid = null;
        this.sy = false;
    }

    private void ud(jpc jpcVar) {
        for (jpc jpcVar2 : this.wd.ud()) {
            if (jpcVar2 != jpcVar) {
                jpcVar2.qdl(this.kdv, jpcVar, this.ekw);
            }
        }
        com.bytedance.sdk.openadsdk.activity.mzz mzzVar = this.fco;
        if (mzzVar != null && mzzVar != jpcVar) {
            mzzVar.qdl(this.kdv, jpcVar, this.ekw);
        }
        jpc jpcVar3 = this.kdv;
        this.kdv = jpcVar;
        if (jpcVar3 != null) {
            jpcVar3.fs = false;
            jpcVar3.rdp();
            jpcVar3.mml();
        }
        jpcVar.fs = true;
        jpcVar.ud(this.qdl, new com.bytedance.sdk.openadsdk.activity.ud.mzz(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.tvp tvpVarQdl = jpcVar.qdl();
        if (tvpVarQdl.getVisibility() != 0) {
            tvpVarQdl.setVisibility(0);
        }
        if (tvpVarQdl.getParent() == null) {
            this.rq.addView(tvpVarQdl, new FrameLayout.LayoutParams(-1, -1));
        }
        this.mml.ud(jpcVar);
        if (jpcVar.d_() != this.vu) {
            jpcVar.qdl("card_sync");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public boolean mml() {
        return this.fco != null;
    }

    public static class qdl extends RecyclerView.Adapter<mzz> {
        private final mml lnr;
        private boolean mml;
        private boolean mzz;
        private final ArrayList<C0101mml> qdl = new ArrayList<>();
        private final ArrayList<jpc> ud = new ArrayList<>();

        public qdl(mml mmlVar, List<ljh> list) {
            this.lnr = mmlVar;
            for (int i2 = 0; i2 < list.size(); i2++) {
                ljh ljhVar = list.get(i2);
                if (ljhVar != null && mmlVar != null) {
                    ljhVar.fco(mmlVar.mzz);
                }
                this.qdl.add(new C0101mml(ljhVar));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.mzz) {
                return Integer.MAX_VALUE;
            }
            return this.qdl.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i2) {
            C0101mml c0101mml = this.qdl.get(i2 % this.qdl.size());
            if (c0101mml.qdl != 0) {
                return -1;
            }
            ekw ekwVarKr = c0101mml.ud.kr();
            if (ekwVarKr == null) {
                return 1;
            }
            return (ekwVarKr.qdl() + ekwVarKr.ud()).hashCode();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: lnr, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(mzz mzzVar) {
            super.onViewRecycled(mzzVar);
            if (mzzVar instanceof ud) {
                ud udVar = (ud) mzzVar;
                com.bytedance.sdk.openadsdk.activity.qdl qdlVar = udVar.lnr;
                if (!this.lnr.aaj) {
                    qdl(udVar, false);
                    return;
                }
                boolean zUd = ud(qdlVar);
                if (qdlVar != null) {
                    qdl(udVar, zUd);
                }
            }
        }

        public int mml() {
            return this.mml ? this.qdl.size() - 1 : this.qdl.size();
        }

        public List<ljh> mzz() {
            ArrayList arrayList = new ArrayList();
            for (C0101mml c0101mml : this.qdl) {
                if (c0101mml.qdl == 0) {
                    arrayList.add(c0101mml.ud);
                }
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public mzz onCreateViewHolder(ViewGroup viewGroup, int i2) {
            if (i2 == -1) {
                com.bytedance.sdk.openadsdk.core.mo.lnr lnrVar = new com.bytedance.sdk.openadsdk.core.mo.lnr(viewGroup.getContext());
                lnrVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new lnr(lnrVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.ud udVar = new com.bytedance.sdk.openadsdk.component.reward.view.ud(viewGroup.getContext(), this.lnr.jtx, this.lnr.bjy, ax.ud(viewGroup.getContext(), 10.0f));
            udVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new ud(this, udVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: ud, reason: merged with bridge method [inline-methods] */
        public void onViewDetachedFromWindow(mzz mzzVar) {
            com.bytedance.sdk.openadsdk.activity.qdl qdlVar;
            super.onViewDetachedFromWindow(mzzVar);
            if (!(mzzVar instanceof ud) || (qdlVar = ((ud) mzzVar).lnr) == null) {
                return;
            }
            qdlVar.xmv().bch.om();
        }

        private boolean ud(jpc jpcVar) {
            return jpcVar != null && jpcVar.hzv();
        }

        public ArrayList<jpc> ud() {
            return this.ud;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(mzz mzzVar, int i2) {
            if (i2 >= this.qdl.size()) {
                i2 %= this.qdl.size();
            }
            mzzVar.qdl(this.lnr, this.qdl.get(i2), i2);
        }

        public boolean lnr() {
            return this.mzz;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
        public void onViewAttachedToWindow(mzz mzzVar) {
            super.onViewAttachedToWindow(mzzVar);
        }

        public int qdl() {
            int itemCount = getItemCount();
            return this.mml ? itemCount - 1 : itemCount;
        }

        public void qdl(String str) {
            int size = this.qdl.size();
            C0101mml c0101mml = size > 0 ? this.qdl.get(size - 1) : null;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            if (c0101mml == null || c0101mml.qdl != 1) {
                if (zIsEmpty) {
                    return;
                }
                this.qdl.add(new C0101mml(str));
                notifyItemInserted(size);
                this.mml = true;
                return;
            }
            if (!zIsEmpty) {
                c0101mml.lnr = str;
                notifyItemChanged(size - 1);
            } else {
                this.qdl.remove(c0101mml);
                notifyItemRemoved(size - 1);
                this.mml = false;
            }
        }

        public void qdl(jpc jpcVar) {
            this.ud.add(jpcVar);
        }

        public void qdl(List<ljh> list) {
            mml mmlVar;
            int size = this.qdl.size();
            if (this.mml) {
                size--;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                ljh ljhVar = list.get(i2);
                if (ljhVar != null && (mmlVar = this.lnr) != null) {
                    ljhVar.fco(mmlVar.mzz);
                }
                this.qdl.add(size + i2, new C0101mml(ljhVar));
                ljhVar.wxg();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public void qdl(int i2, int i3) {
            if (this.mzz) {
                return;
            }
            this.mzz = true;
            if (i2 < 0) {
                i2 = 0;
            }
            int size = this.qdl.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i3) - (size - i2));
            notifyItemRangeInserted(0, i3 - i2);
        }

        public void qdl(ud udVar, boolean z2) {
            if (udVar.lnr == null) {
                return;
            }
            this.ud.remove(udVar.lnr);
            udVar.qdl(z2);
        }
    }

    private static int qdl(int i2, int i3, int i4) {
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i4 + i5;
            if (i6 % i3 == i2) {
                return i6;
            }
            int i7 = i4 - i5;
            if (i7 % i3 == i2) {
                return i7;
            }
        }
        return i4;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(Bundle bundle) {
        super.qdl(bundle);
        vu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2, String str) {
        this.wc = false;
        bch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(com.bytedance.sdk.openadsdk.core.model.qdl qdlVar, com.bytedance.sdk.openadsdk.core.model.lnr lnrVar) {
        this.wc = false;
        if (qdlVar.mml() != null && !qdlVar.mml().isEmpty()) {
            qdl(qdlVar);
            return;
        }
        lnrVar.qdl(-3);
        lnrVar.lnr(1);
        com.bytedance.sdk.openadsdk.core.model.lnr.qdl(lnrVar);
        bch();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void lnr() {
        super.lnr();
        this.zlt = true;
        jpc jpcVar = this.kdv;
        if (jpcVar != null) {
            jpcVar.rdp();
        }
        hzv();
        this.sy = this.tid != null;
        this.to.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void ud(Activity activity) {
        super.ud(activity);
        ax.qdl(activity);
    }

    private void qdl(final com.bytedance.sdk.openadsdk.core.model.qdl qdlVar) {
        uw uwVarFs = qdlVar.fs();
        if (uwVarFs != null) {
            this.ag = uwVarFs.fs();
            this.wc = uwVarFs.exu();
        }
        if (!this.bjy) {
            for (ljh ljhVar : qdlVar.mml()) {
                if (ljhVar.tdy() != null && ljh.mzz(ljhVar)) {
                    com.bytedance.sdk.openadsdk.core.exu.qdl.ud udVarQdl = ljh.qdl(CacheDirFactory.getICacheDir(ljhVar.lhl()).qdl(), ljhVar);
                    udVarQdl.qdl("material_meta", ljhVar);
                    udVarQdl.qdl("ad_slot", ljhVar.ji());
                    com.bytedance.sdk.openadsdk.core.exu.mzz.qdl.qdl(udVarQdl, new com.bykv.vk.openvk.qdl.qdl.qdl.mzz.ud() { // from class: com.bytedance.sdk.openadsdk.activity.mml.3
                        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2) {
                        }

                        @Override // com.bykv.vk.openvk.qdl.qdl.qdl.mzz.qdl.InterfaceC0056qdl
                        public void qdl(com.bykv.vk.openvk.qdl.qdl.qdl.lnr.lnr lnrVar, int i2, String str) {
                        }
                    });
                }
            }
        }
        fco.qdl(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.mml.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.bytedance.sdk.component.utils.ud.qdl(mml.this.qdl)) {
                    return;
                }
                mml.this.exu.set(false);
                mml.this.wd.qdl("");
                mml.this.wd.qdl(qdlVar.mml());
                mml.this.ljh();
            }
        });
    }

    private void ud(int i2) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int iFindFirstVisibleItemPosition = this.jpc.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.jpc.findLastVisibleItemPosition();
        if (i2 < iFindFirstVisibleItemPosition) {
            this.mo.smoothScrollToPosition(i2);
            return;
        }
        if (i2 <= iFindLastVisibleItemPosition) {
            int i3 = i2 - iFindFirstVisibleItemPosition;
            int childCount = this.mo.getChildCount();
            if (i3 <= 0 || i3 >= childCount || (viewHolderFindViewHolderForAdapterPosition = this.mo.findViewHolderForAdapterPosition(i2 - 1)) == null) {
                return;
            }
            this.mo.smoothScrollBy(0, viewHolderFindViewHolderForAdapterPosition.itemView.getBottom());
            return;
        }
        this.mo.smoothScrollToPosition(this.ax);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void ud() {
        super.ud();
        this.zlt = false;
        this.dk = false;
        jpc jpcVar = this.kdv;
        if (jpcVar != null && !this.sy) {
            jpcVar.lnr();
        }
        if (this.irn == 0) {
            this.irn = SystemClock.elapsedRealtime();
        }
        hkc();
        koa();
        Iterator<Message> it = this.exc.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.exc.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(int i2, boolean z2) {
        int i3;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.mo.findViewHolderForAdapterPosition(i2);
        if (viewHolderFindViewHolderForAdapterPosition == null || !(viewHolderFindViewHolderForAdapterPosition instanceof ud) || (i3 = this.rc) == i2) {
            return;
        }
        qdl(i3, i2, z2);
        this.rc = i2;
        this.gt = SystemClock.elapsedRealtime();
        jpc jpcVarQdl = ((ud) viewHolderFindViewHolderForAdapterPosition).qdl();
        if (jpcVarQdl == null) {
            return;
        }
        ud(jpcVarQdl);
        this.rdp.add(jpcVarQdl.mo.wc());
        if (this.wc && this.uw > 0 && this.rc >= this.wd.qdl() - this.uw) {
            oth();
        }
        com.bytedance.sdk.openadsdk.activity.qdl qdlVarExu = exu();
        if (qdlVarExu != null) {
            if (!this.bjy && this.jpc.findLastVisibleItemPosition() >= this.rc + 1) {
                qdlVarExu.mzz(true);
            }
            this.yt.add(Integer.valueOf(this.rc + 1));
            qdlVarExu.vu();
            this.jjk = false;
            return;
        }
        this.jjk = true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void ud(jpc jpcVar, int i2) {
        jpc jpcVar2 = this.kdv;
        if (jpcVar != jpcVar2) {
            return;
        }
        if (i2 == 2) {
            hzv();
            return;
        }
        if (i2 == 1) {
            if (ekw()) {
                jpc jpcVar3 = this.kdv;
                if (jpcVar3 instanceof com.bytedance.sdk.openadsdk.activity.qdl) {
                    ((com.bytedance.sdk.openadsdk.activity.qdl) jpcVar3).kdv();
                    return;
                }
                return;
            }
            hkc();
            return;
        }
        if (i2 == 3 || i2 == 4) {
            try {
                jpcVar2.xmv().bch.rc();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr("CardsLayoutManager", th);
            }
        }
    }

    private void qdl(int i2, int i3, boolean z2) {
        String str;
        if (i2 < 0 || i3 < 0 || i2 == i3) {
            return;
        }
        if (z2) {
            str = "auto_down";
        } else {
            str = i3 > i2 ? "down" : "up";
        }
        final String str2 = str;
        final long jElapsedRealtime = (SystemClock.elapsedRealtime() - this.gt) / 1000;
        List<ljh> listMzz = this.wd.mzz();
        final int size = i2 % listMzz.size();
        final int size2 = i3 % listMzz.size();
        ljh ljhVar = listMzz.get(size);
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(System.currentTimeMillis(), ljhVar, ljhVar.mzz(), "slide", new com.bytedance.sdk.openadsdk.bjy.lnr.qdl() { // from class: com.bytedance.sdk.openadsdk.activity.mml.6
            @Override // com.bytedance.sdk.openadsdk.bjy.lnr.qdl, com.bytedance.sdk.openadsdk.bjy.lnr.ud
            public JSONObject qdl() {
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

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(final jpc jpcVar, jpc jpcVar2, com.bytedance.sdk.openadsdk.activity.ud.mzz mzzVar) {
        long jMml;
        if (jpcVar != this.kdv) {
            return;
        }
        if (jpcVar.bqt() || vu.ud(jpcVar.mo)) {
            jMml = 500;
        } else {
            xmv xmvVarRaf = jpcVar.mo.raf();
            jMml = xmvVarRaf != null ? ((long) xmvVarRaf.mml()) * 1000 : 0L;
        }
        mo moVar = this.tid;
        if (moVar != null) {
            moVar.mml();
        }
        mo moVar2 = new mo(Math.max(500L, jMml)) { // from class: com.bytedance.sdk.openadsdk.activity.mml.7
            @Override // com.bytedance.sdk.openadsdk.activity.mml.mo
            public void qdl() {
                if (com.bytedance.sdk.component.utils.ud.qdl(mml.this.qdl)) {
                    return;
                }
                mml.this.lnr(jpcVar);
            }
        };
        this.tid = moVar2;
        moVar2.mzz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(boolean z2) {
        super.qdl(z2);
        jpc jpcVar = this.kdv;
        if (jpcVar != null) {
            jpcVar.lnr(z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public boolean qdl(jpc jpcVar, int i2) {
        com.bytedance.sdk.openadsdk.activity.mzz mzzVar = this.fco;
        return mzzVar != null && mzzVar == jpcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(View view) {
        super.qdl(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.rq.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(Activity activity) {
        super.qdl(activity);
        jpc jpcVar = this.kdv;
        if (jpcVar != null) {
            jpcVar.ud(activity);
        }
        com.bytedance.sdk.openadsdk.activity.mzz mzzVar = this.fco;
        if (mzzVar != null) {
            mzzVar.aaj();
        }
        Iterator<jpc> it = this.wd.ud().iterator();
        while (it.hasNext()) {
            it.next().aaj();
        }
        this.to.removeCallbacksAndMessages(null);
        mo moVar = this.tid;
        if (moVar != null) {
            moVar.mml();
            this.tid = null;
        }
        jpc jpcVar2 = this.kdv;
        if (jpcVar2 == null || jpcVar2.ljh() || this.ud.ilu()) {
            return;
        }
        rdp.ud().post(new com.bytedance.sdk.openadsdk.activity.ud.lnr(this.ud));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lnr
    public void qdl(Map<String, Object> map, jpc jpcVar, float f, float f2) {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.tvp tvpVarQdl = jpcVar.qdl();
                ((JSONObject) jSONObject).put("width", tvpVarQdl.getWidth());
                ((JSONObject) jSONObject).put("height", tvpVarQdl.getHeight());
                int i2 = jpcVar.to;
                ((JSONObject) jSONObject).put("click_feed_top", i2 == this.jpc.findFirstVisibleItemPosition() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_on_final", i2 == this.wd.mml() ? 1 : 0);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.hkc);
                ((JSONObject) jSONObject).put("click_user_remaining", i2 == this.rc ? (SystemClock.elapsedRealtime() - this.gt) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
