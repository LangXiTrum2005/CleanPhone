package com.bytedance.adsdk.ugeno.mo;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl<T> extends FrameLayout implements com.bytedance.adsdk.ugeno.jpc.lnr.mml {
    private static final Interpolator bqt = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.mo.qdl.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private int aaj;
    private C0065qdl bch;
    private boolean bjy;
    private int exc;
    private boolean exu;
    private boolean fs;
    private int jl;
    private int jpc;
    private boolean jtx;
    private int jyq;
    private final Runnable koa;
    private com.bytedance.adsdk.ugeno.mo.qdl.qdl ljh;
    protected Context lnr;
    private int mml;
    private int mo;
    private int mzz;
    private FrameLayout oth;
    protected List<T> qdl;
    private boolean rdp;
    private float rq;
    private String to;
    private int tvp;
    protected com.bytedance.adsdk.ugeno.jpc.lnr ud;
    private com.bytedance.adsdk.ugeno.mo.lnr uw;
    private final Runnable vu;
    private int wd;
    private Scroller xmv;
    private boolean yt;

    public class lnr extends com.bytedance.adsdk.ugeno.jpc.lnr {
        public lnr(Context context) {
            super(context);
        }

        private MotionEvent qdl(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.lnr, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!qdl.this.bjy) {
                return false;
            }
            try {
                if (qdl.this.jyq != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(qdl(motionEvent));
                qdl(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.lnr, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!qdl.this.bjy) {
                return false;
            }
            try {
                return qdl.this.jyq == 1 ? super.onTouchEvent(qdl(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.mo.qdl$qdl, reason: collision with other inner class name */
    public class C0065qdl extends com.bytedance.adsdk.ugeno.jpc.ud {
        public C0065qdl() {
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.ud
        public int qdl(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.ud
        public boolean qdl(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.ud
        public int qdl() {
            if (qdl.this.rdp) {
                return 1024;
            }
            return qdl.this.qdl.size();
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.ud
        public Object qdl(ViewGroup viewGroup, int i2) {
            View viewQdl = qdl.this.qdl(i2, mml.qdl(qdl.this.rdp, i2, qdl.this.qdl.size()));
            viewGroup.addView(viewQdl);
            return viewQdl;
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.ud
        public void qdl(ViewGroup viewGroup, int i2, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.jpc.ud
        public float qdl(int i2) {
            if (qdl.this.rq <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / qdl.this.rq;
        }
    }

    public class ud extends Scroller {
        public ud(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i2, int i3, int i4, int i5, int i6) {
            super.startScroll(i2, i3, i4, i5, qdl.this.mo);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i2, int i3, int i4, int i5) {
            super.startScroll(i2, i3, i4, i5, qdl.this.mo);
        }
    }

    public qdl(Context context) {
        super(context);
        this.qdl = new CopyOnWriteArrayList();
        this.mml = 2000;
        this.mzz = 500;
        this.mo = 500;
        this.wd = 0;
        this.jpc = -1;
        this.tvp = -1;
        this.to = "normal";
        this.rq = 1.0f;
        this.fs = true;
        this.exu = true;
        this.rdp = true;
        this.bjy = true;
        this.jl = 0;
        this.exc = 0;
        this.aaj = 0;
        this.jyq = 0;
        this.koa = new Runnable() { // from class: com.bytedance.adsdk.ugeno.mo.qdl.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = qdl.this.ud.getCurrentItem() + 1;
                if (qdl.this.rdp) {
                    if (currentItem >= 1024) {
                        qdl.this.ud.qdl(512, false);
                        return;
                    } else {
                        qdl.this.ud.qdl(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.jpc.ud adapter = qdl.this.ud.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.qdl()) {
                        qdl.this.ud.qdl(0, false);
                    } else {
                        qdl.this.ud.qdl(currentItem, true);
                    }
                }
            }
        };
        this.vu = new Runnable() { // from class: com.bytedance.adsdk.ugeno.mo.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                if (qdl.this.exu) {
                    int currentItem = qdl.this.ud.getCurrentItem() + 1;
                    if (qdl.this.rdp) {
                        if (currentItem >= 1024) {
                            qdl.this.ud.qdl(512, false);
                        } else {
                            qdl.this.ud.qdl(currentItem, true);
                        }
                        qdl qdlVar = qdl.this;
                        qdlVar.postDelayed(qdlVar.vu, qdl.this.mml);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.jpc.ud adapter = qdl.this.ud.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.qdl()) {
                            qdl.this.ud.qdl(0, false);
                            qdl qdlVar2 = qdl.this;
                            qdlVar2.postDelayed(qdlVar2.vu, qdl.this.mml);
                        } else {
                            qdl.this.ud.qdl(currentItem, true);
                            qdl qdlVar3 = qdl.this;
                            qdlVar3.postDelayed(qdlVar3.vu, qdl.this.mml);
                        }
                    }
                }
            }
        };
        this.lnr = context;
        this.oth = new FrameLayout(context);
        this.ud = qdl();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.oth.addView(this.ud, layoutParams);
        addView(this.oth);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.exu) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.jtx) {
                    mzz();
                }
            } else if (action == 0) {
                mo();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void exu(int i2) {
        qdl(this.to, this.wd, this.jpc, this.tvp, true);
        if (this.bch == null) {
            this.bch = new C0065qdl();
            this.ud.qdl((com.bytedance.adsdk.ugeno.jpc.lnr.mml) this);
            this.ud.setAdapter(this.bch);
        }
        if (this.rdp) {
            if (i2 >= 1024) {
                this.ud.qdl(512, false);
                return;
            } else {
                this.ud.qdl(i2, true);
                return;
            }
        }
        if (i2 < 0 || i2 >= this.qdl.size()) {
            return;
        }
        this.ud.qdl(i2, true);
    }

    @Override // com.bytedance.adsdk.ugeno.jpc.lnr.mml
    public void fs(int i2) {
        if (i2 == 1 && this.jtx) {
            mo();
        }
        com.bytedance.adsdk.ugeno.mo.lnr lnrVar = this.uw;
        if (lnrVar != null) {
            lnrVar.qdl(this.rdp, i2);
        }
    }

    public com.bytedance.adsdk.ugeno.jpc.ud getAdapter() {
        return this.ud.getAdapter();
    }

    public int getCurrentItem() {
        return this.ud.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.jpc.lnr getViewPager() {
        return this.ud;
    }

    @Override // com.bytedance.adsdk.ugeno.jpc.lnr.mml
    public void rq(int i2) {
        int i3;
        if (this.uw != null) {
            int iQdl = mml.qdl(this.rdp, i2, this.qdl.size());
            i3 = i2;
            this.uw.qdl(this.rdp, iQdl, i3, iQdl == 0, iQdl == this.qdl.size() - 1);
        } else {
            i3 = i2;
        }
        if (this.fs) {
            this.ljh.qdl(i3);
        }
    }

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.mo.lnr lnrVar) {
        this.uw = lnrVar;
    }

    public void setTwoItems(boolean z2) {
        this.yt = z2;
    }

    public abstract View to(int i2);

    public qdl tvp(int i2) {
        this.tvp = i2;
        qdl(this.to, this.wd, this.jpc, i2, true);
        return this;
    }

    public qdl<T> jpc(int i2) {
        this.jpc = i2;
        qdl(this.to, this.wd, i2, this.tvp, true);
        return this;
    }

    public qdl lnr(float f) {
        this.ljh.setIndicatorX(f);
        return this;
    }

    public qdl mml(float f) {
        this.ljh.setIndicatorY(f);
        return this;
    }

    public qdl mo(int i2) {
        this.ljh.setUnSelectedColor(i2);
        return this;
    }

    public qdl mzz(int i2) {
        this.ljh.setSelectedColor(i2);
        return this;
    }

    public com.bytedance.adsdk.ugeno.jpc.lnr qdl() {
        return new lnr(getContext());
    }

    public qdl ud(float f) {
        this.ljh.setIndicatorHeight((int) f);
        return this;
    }

    public qdl wd(int i2) {
        this.wd = i2;
        qdl(this.to, i2, this.jpc, this.tvp, true);
        return this;
    }

    public qdl lnr(int i2) {
        this.mo = i2;
        if (this.xmv == null) {
            this.xmv = new ud(this.lnr, bqt);
        }
        this.ud.setScroller(this.xmv);
        return this;
    }

    public qdl mml(int i2) {
        this.mml = i2;
        mzz();
        return this;
    }

    public void mo() {
        removeCallbacks(this.vu);
    }

    public qdl mzz(float f) {
        this.rq = f;
        return this;
    }

    public qdl qdl(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.ljh = new com.bytedance.adsdk.ugeno.mo.qdl.lnr(this.lnr);
        } else {
            this.ljh = new com.bytedance.adsdk.ugeno.mo.qdl.ud(this.lnr);
        }
        addView(this.ljh, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public qdl ud() {
        this.ljh.qdl();
        return this;
    }

    private boolean wd() {
        return this.qdl.size() <= 2 && this.rdp;
    }

    public qdl mzz(boolean z2) {
        this.jtx = z2;
        return this;
    }

    public qdl ud(String str) {
        this.ljh.setIndicatorDirection(str);
        return this;
    }

    public qdl mml(boolean z2) {
        this.ljh.setLoop(z2);
        if (this.rdp != z2) {
            int iQdl = mml.qdl(z2, this.ud.getCurrentItem(), this.qdl.size());
            this.rdp = z2;
            C0065qdl c0065qdl = this.bch;
            if (c0065qdl != null) {
                c0065qdl.lnr();
                this.ud.setCurrentItem(iQdl);
            }
        }
        return this;
    }

    public void mzz() {
        removeCallbacks(this.vu);
        postDelayed(this.vu, this.mml);
    }

    public qdl ud(int i2) {
        this.mzz = i2;
        return this;
    }

    public qdl ud(boolean z2) {
        this.bjy = z2;
        return this;
    }

    public qdl lnr(boolean z2) {
        this.fs = z2;
        return this;
    }

    public qdl qdl(float f) {
        this.ljh.setIndicatorWidth((int) f);
        return this;
    }

    public qdl lnr(String str) {
        this.to = str;
        qdl(str, this.wd, this.jpc, this.tvp, true);
        return this;
    }

    public qdl qdl(int i2) {
        this.jyq = i2;
        return this;
    }

    public qdl qdl(boolean z2) {
        this.exu = z2;
        mzz();
        return this;
    }

    public void lnr() {
        int i2;
        qdl(this.to, this.wd, this.jpc, this.tvp, true);
        if (this.bch == null) {
            this.bch = new C0065qdl();
            this.ud.qdl((com.bytedance.adsdk.ugeno.jpc.lnr.mml) this);
            this.ud.setAdapter(this.bch);
        }
        int i3 = this.jl;
        if (i3 < 0 || i3 >= this.qdl.size()) {
            this.jl = 0;
        }
        if (this.rdp) {
            i2 = this.jl + 512;
        } else {
            i2 = this.jl;
        }
        this.ud.qdl(i2, true);
        if (!this.rdp) {
            rq(i2);
        }
        if (this.exu) {
            mzz();
        }
    }

    public void qdl(String str, int i2, int i3, int i4, boolean z2) {
        C0065qdl c0065qdl = this.bch;
        if (c0065qdl != null) {
            c0065qdl.lnr();
        }
        this.ud.setPageMargin(i2);
        if (i3 > 0 || i4 > 0) {
            if (this.jyq == 1) {
                this.ud.setPadding(0, i3 + i2, 0, i4 + i2);
            } else {
                this.ud.setPadding(i3 + i2, 0, i4 + i2, 0);
            }
            this.oth.setClipChildren(false);
            this.ud.setClipChildren(false);
            this.ud.setClipToPadding(false);
        }
        if (this.jyq == 1) {
            com.bytedance.adsdk.ugeno.mo.ud.mml mmlVar = new com.bytedance.adsdk.ugeno.mo.ud.mml();
            mmlVar.qdl(str);
            this.ud.qdl(true, (com.bytedance.adsdk.ugeno.jpc.lnr.mzz) mmlVar);
            this.ud.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.ud.qdl(false, (com.bytedance.adsdk.ugeno.jpc.lnr.mzz) new com.bytedance.adsdk.ugeno.mo.ud.lnr());
        } else if (TextUtils.equals(str, "cube")) {
            this.ud.qdl(false, (com.bytedance.adsdk.ugeno.jpc.lnr.mzz) new com.bytedance.adsdk.ugeno.mo.ud.qdl());
        } else if (TextUtils.equals(str, "fade")) {
            this.ud.qdl(false, (com.bytedance.adsdk.ugeno.jpc.lnr.mzz) new com.bytedance.adsdk.ugeno.mo.ud.ud());
        } else {
            this.ud.qdl(false, (com.bytedance.adsdk.ugeno.jpc.lnr.mzz) null);
        }
        this.ud.setOffscreenPageLimit((int) this.rq);
    }

    public void mml() {
        mo();
        if (this.bch != null) {
            this.ud.ud((com.bytedance.adsdk.ugeno.jpc.lnr.mml) this);
            this.ud.setAdapter(null);
            this.bch = null;
            this.ud.removeAllViews();
            this.qdl.clear();
            this.ljh.lnr();
        }
    }

    public View qdl(int i2, int i3) {
        if (this.qdl.size() == 0) {
            return new View(getContext());
        }
        View view = to(i3);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (view instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (wd()) {
            view.setTag("two_items_tag");
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(view, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (wd()) {
            frameLayout.setTag(Integer.valueOf(i2));
        }
        return frameLayout;
    }

    public qdl<T> qdl(T t) {
        if (t != null) {
            this.qdl.add(t);
            if (this.fs) {
                this.ljh.ud();
            }
        }
        C0065qdl c0065qdl = this.bch;
        if (c0065qdl != null) {
            c0065qdl.lnr();
            this.ljh.qdl(this.jl, this.ud.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.jpc.lnr.mml
    public void qdl(int i2, float f, int i3) {
        com.bytedance.adsdk.ugeno.mo.lnr lnrVar = this.uw;
        if (lnrVar != null) {
            boolean z2 = this.rdp;
            lnrVar.qdl(z2, mml.qdl(z2, i2, this.qdl.size()), f, i3);
        }
        if (wd()) {
            qdl(i2, findViewWithTag(Integer.valueOf(i2)));
            if (f > 0.0f) {
                int i4 = i2 + 1;
                qdl(i4, findViewWithTag(Integer.valueOf(i4)));
            }
        }
    }

    private void qdl(int i2, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.qdl.get(mml.qdl(true, i2, this.qdl.size()));
            if (t == null) {
                return;
            }
            if (t instanceof com.bytedance.adsdk.ugeno.ud.lnr) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.ud.lnr) t).rq();
            } else if (t instanceof View) {
                viewFindViewWithTag = (View) t;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
