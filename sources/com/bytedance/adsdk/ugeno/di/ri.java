package com.bytedance.adsdk.ugeno.di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri<T> extends FrameLayout implements com.bytedance.adsdk.ugeno.mj.ik.ka {
    private static final Interpolator igq = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.di.ri.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private int ac;
    private boolean aw;
    private C0188ri ay;
    private boolean bgr;
    private boolean bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private boolean f18012co;
    private int di;
    private final Runnable dw;
    private int fi;
    private com.bytedance.adsdk.ugeno.di.ik fr;
    private int ihz;
    protected Context ik;
    private int jbs;
    private int ka;
    protected com.bytedance.adsdk.ugeno.mj.ik lr;
    private int mj;
    private int nr;
    private String qt;
    protected List<T> ri;
    private float sf;
    private boolean slm;
    private Scroller su;
    private int tan;
    private FrameLayout uq;
    private boolean vr;
    private com.bytedance.adsdk.ugeno.di.ri.ri wjv;
    private int xha;
    private final Runnable zf;

    public class ik extends com.bytedance.adsdk.ugeno.mj.ik {
        public ik(Context context) {
            super(context);
        }

        private MotionEvent ri(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.mj.ik, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ri.this.vr) {
                return false;
            }
            try {
                if (ri.this.ihz != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(ri(motionEvent));
                ri(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.mj.ik, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ri.this.vr) {
                return false;
            }
            try {
                return ri.this.ihz == 1 ? super.onTouchEvent(ri(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public class lr extends Scroller {
        public lr(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, ri.this.di);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i, int i2, int i3, int i4) {
            super.startScroll(i, i2, i3, i4, ri.this.di);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.di.ri$ri, reason: collision with other inner class name */
    public class C0188ri extends com.bytedance.adsdk.ugeno.mj.lr {
        public C0188ri() {
        }

        @Override // com.bytedance.adsdk.ugeno.mj.lr
        public int ri(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.mj.lr
        public boolean ri(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.mj.lr
        public int ri() {
            if (ri.this.bgr) {
                return 1024;
            }
            return ri.this.ri.size();
        }

        @Override // com.bytedance.adsdk.ugeno.mj.lr
        public Object ri(ViewGroup viewGroup, int i) {
            View viewRi = ri.this.ri(i, ka.ri(ri.this.bgr, i, ri.this.ri.size()));
            viewGroup.addView(viewRi);
            return viewRi;
        }

        @Override // com.bytedance.adsdk.ugeno.mj.lr
        public void ri(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.mj.lr
        public float ri(int i) {
            if (ri.this.sf <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 1.0f;
            }
            return 1.0f / ri.this.sf;
        }
    }

    public ri(Context context) {
        super(context);
        this.ri = new CopyOnWriteArrayList();
        this.ka = 2000;
        this.fi = 500;
        this.di = 500;
        this.xha = 0;
        this.mj = -1;
        this.jbs = -1;
        this.qt = "normal";
        this.sf = 1.0f;
        this.f18012co = true;
        this.aw = true;
        this.bgr = true;
        this.vr = true;
        this.nr = 0;
        this.tan = 0;
        this.ac = 0;
        this.ihz = 0;
        this.zf = new Runnable() { // from class: com.bytedance.adsdk.ugeno.di.ri.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = ri.this.lr.getCurrentItem() + 1;
                if (ri.this.bgr) {
                    if (currentItem >= 1024) {
                        ri.this.lr.ri(512, false);
                        return;
                    } else {
                        ri.this.lr.ri(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.mj.lr adapter = ri.this.lr.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.ri()) {
                        ri.this.lr.ri(0, false);
                    } else {
                        ri.this.lr.ri(currentItem, true);
                    }
                }
            }
        };
        this.dw = new Runnable() { // from class: com.bytedance.adsdk.ugeno.di.ri.3
            @Override // java.lang.Runnable
            public void run() {
                if (ri.this.aw) {
                    int currentItem = ri.this.lr.getCurrentItem() + 1;
                    if (ri.this.bgr) {
                        if (currentItem >= 1024) {
                            ri.this.lr.ri(512, false);
                        } else {
                            ri.this.lr.ri(currentItem, true);
                        }
                        ri riVar = ri.this;
                        riVar.postDelayed(riVar.dw, ri.this.ka);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.mj.lr adapter = ri.this.lr.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.ri()) {
                            ri.this.lr.ri(0, false);
                            ri riVar2 = ri.this;
                            riVar2.postDelayed(riVar2.dw, ri.this.ka);
                        } else {
                            ri.this.lr.ri(currentItem, true);
                            ri riVar3 = ri.this;
                            riVar3.postDelayed(riVar3.dw, ri.this.ka);
                        }
                    }
                }
            }
        };
        this.ik = context;
        this.uq = new FrameLayout(context);
        this.lr = ri();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.uq.addView(this.lr, layoutParams);
        addView(this.uq);
    }

    public void aw(int i) {
        ri(this.qt, this.xha, this.mj, this.jbs, true);
        if (this.ay == null) {
            this.ay = new C0188ri();
            this.lr.ri((com.bytedance.adsdk.ugeno.mj.ik.ka) this);
            this.lr.setAdapter(this.ay);
        }
        if (this.bgr) {
            if (i >= 1024) {
                this.lr.ri(512, false);
                return;
            } else {
                this.lr.ri(i, true);
                return;
            }
        }
        if (i < 0 || i >= this.ri.size()) {
            return;
        }
        this.lr.ri(i, true);
    }

    @Override // com.bytedance.adsdk.ugeno.mj.ik.ka
    public void co(int i) {
        if (i == 1 && this.slm) {
            di();
        }
        com.bytedance.adsdk.ugeno.di.ik ikVar = this.fr;
        if (ikVar != null) {
            ikVar.ri(this.bgr, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.aw) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.slm) {
                    fi();
                }
            } else if (action == 0) {
                di();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.mj.lr getAdapter() {
        return this.lr.getAdapter();
    }

    public int getCurrentItem() {
        return this.lr.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.mj.ik getViewPager() {
        return this.lr;
    }

    public ri jbs(int i) {
        this.jbs = i;
        ri(this.qt, this.xha, this.mj, i, true);
        return this;
    }

    public abstract View qt(int i);

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.di.ik ikVar) {
        this.fr = ikVar;
    }

    public void setTwoItems(boolean z) {
        this.bu = z;
    }

    @Override // com.bytedance.adsdk.ugeno.mj.ik.ka
    public void sf(int i) {
        int i2;
        if (this.fr != null) {
            int iRi = ka.ri(this.bgr, i, this.ri.size());
            i2 = i;
            this.fr.ri(this.bgr, iRi, i2, iRi == 0, iRi == this.ri.size() - 1);
        } else {
            i2 = i;
        }
        if (this.f18012co) {
            this.wjv.ri(i2);
        }
    }

    public ri di(int i) {
        this.wjv.setUnSelectedColor(i);
        return this;
    }

    public ri fi(int i) {
        this.wjv.setSelectedColor(i);
        return this;
    }

    public ri ik(float f) {
        this.wjv.setIndicatorX(f);
        return this;
    }

    public ri ka(float f) {
        this.wjv.setIndicatorY(f);
        return this;
    }

    public ri lr(float f) {
        this.wjv.setIndicatorHeight((int) f);
        return this;
    }

    public ri<T> mj(int i) {
        this.mj = i;
        ri(this.qt, this.xha, i, this.jbs, true);
        return this;
    }

    public com.bytedance.adsdk.ugeno.mj.ik ri() {
        return new ik(getContext());
    }

    public ri xha(int i) {
        this.xha = i;
        ri(this.qt, i, this.mj, this.jbs, true);
        return this;
    }

    public void di() {
        removeCallbacks(this.dw);
    }

    public ri fi(float f) {
        this.sf = f;
        return this;
    }

    public ri ik(int i) {
        this.di = i;
        if (this.su == null) {
            this.su = new lr(this.ik, igq);
        }
        this.lr.setScroller(this.su);
        return this;
    }

    public ri ka(int i) {
        this.ka = i;
        fi();
        return this;
    }

    public ri lr() {
        this.wjv.ri();
        return this;
    }

    public ri ri(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.wjv = new com.bytedance.adsdk.ugeno.di.ri.ik(this.ik);
        } else {
            this.wjv = new com.bytedance.adsdk.ugeno.di.ri.lr(this.ik);
        }
        addView(this.wjv, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    private boolean xha() {
        return this.ri.size() <= 2 && this.bgr;
    }

    public ri fi(boolean z) {
        this.slm = z;
        return this;
    }

    public ri lr(String str) {
        this.wjv.setIndicatorDirection(str);
        return this;
    }

    public void fi() {
        removeCallbacks(this.dw);
        postDelayed(this.dw, this.ka);
    }

    public ri ka(boolean z) {
        this.wjv.setLoop(z);
        if (this.bgr != z) {
            int iRi = ka.ri(z, this.lr.getCurrentItem(), this.ri.size());
            this.bgr = z;
            C0188ri c0188ri = this.ay;
            if (c0188ri != null) {
                c0188ri.ik();
                this.lr.setCurrentItem(iRi);
            }
        }
        return this;
    }

    public ri lr(int i) {
        this.fi = i;
        return this;
    }

    public ri lr(boolean z) {
        this.vr = z;
        return this;
    }

    public ri ik(boolean z) {
        this.f18012co = z;
        return this;
    }

    public ri ri(float f) {
        this.wjv.setIndicatorWidth((int) f);
        return this;
    }

    public ri ik(String str) {
        this.qt = str;
        ri(str, this.xha, this.mj, this.jbs, true);
        return this;
    }

    public ri ri(int i) {
        this.ihz = i;
        return this;
    }

    public ri ri(boolean z) {
        this.aw = z;
        fi();
        return this;
    }

    public void ik() {
        int i;
        ri(this.qt, this.xha, this.mj, this.jbs, true);
        if (this.ay == null) {
            this.ay = new C0188ri();
            this.lr.ri((com.bytedance.adsdk.ugeno.mj.ik.ka) this);
            this.lr.setAdapter(this.ay);
        }
        int i2 = this.nr;
        if (i2 < 0 || i2 >= this.ri.size()) {
            this.nr = 0;
        }
        if (this.bgr) {
            i = this.nr + 512;
        } else {
            i = this.nr;
        }
        this.lr.ri(i, true);
        if (!this.bgr) {
            sf(i);
        }
        if (this.aw) {
            fi();
        }
    }

    public void ri(String str, int i, int i2, int i3, boolean z) {
        C0188ri c0188ri = this.ay;
        if (c0188ri != null) {
            c0188ri.ik();
        }
        this.lr.setPageMargin(i);
        if (i2 > 0 || i3 > 0) {
            if (this.ihz == 1) {
                this.lr.setPadding(0, i2 + i, 0, i3 + i);
            } else {
                this.lr.setPadding(i2 + i, 0, i3 + i, 0);
            }
            this.uq.setClipChildren(false);
            this.lr.setClipChildren(false);
            this.lr.setClipToPadding(false);
        }
        if (this.ihz == 1) {
            com.bytedance.adsdk.ugeno.di.lr.ka kaVar = new com.bytedance.adsdk.ugeno.di.lr.ka();
            kaVar.ri(str);
            this.lr.ri(true, (com.bytedance.adsdk.ugeno.mj.ik.fi) kaVar);
            this.lr.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.lr.ri(false, (com.bytedance.adsdk.ugeno.mj.ik.fi) new com.bytedance.adsdk.ugeno.di.lr.ik());
        } else if (TextUtils.equals(str, "cube")) {
            this.lr.ri(false, (com.bytedance.adsdk.ugeno.mj.ik.fi) new com.bytedance.adsdk.ugeno.di.lr.ri());
        } else if (TextUtils.equals(str, "fade")) {
            this.lr.ri(false, (com.bytedance.adsdk.ugeno.mj.ik.fi) new com.bytedance.adsdk.ugeno.di.lr.lr());
        } else {
            this.lr.ri(false, (com.bytedance.adsdk.ugeno.mj.ik.fi) null);
        }
        this.lr.setOffscreenPageLimit((int) this.sf);
    }

    public void ka() {
        di();
        if (this.ay != null) {
            this.lr.lr((com.bytedance.adsdk.ugeno.mj.ik.ka) this);
            this.lr.setAdapter(null);
            this.ay = null;
            this.lr.removeAllViews();
            this.ri.clear();
            this.wjv.ik();
        }
    }

    public View ri(int i, int i2) {
        if (this.ri.size() == 0) {
            return new View(getContext());
        }
        View viewQt = qt(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewQt instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (xha()) {
            viewQt.setTag("two_items_tag");
        }
        if (viewQt.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewQt.getParent()).removeView(viewQt);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewQt, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (xha()) {
            frameLayout.setTag(Integer.valueOf(i));
        }
        return frameLayout;
    }

    public ri<T> ri(T t) {
        if (t != null) {
            this.ri.add(t);
            if (this.f18012co) {
                this.wjv.lr();
            }
        }
        C0188ri c0188ri = this.ay;
        if (c0188ri != null) {
            c0188ri.ik();
            this.wjv.ri(this.nr, this.lr.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.mj.ik.ka
    public void ri(int i, float f, int i2) {
        com.bytedance.adsdk.ugeno.di.ik ikVar = this.fr;
        if (ikVar != null) {
            boolean z = this.bgr;
            ikVar.ri(z, ka.ri(z, i, this.ri.size()), f, i2);
        }
        if (xha()) {
            ri(i, findViewWithTag(Integer.valueOf(i)));
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i3 = i + 1;
                ri(i3, findViewWithTag(Integer.valueOf(i3)));
            }
        }
    }

    private void ri(int i, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t = this.ri.get(ka.ri(true, i, this.ri.size()));
            if (t == null) {
                return;
            }
            if (t instanceof com.bytedance.adsdk.ugeno.lr.ik) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.lr.ik) t).sf();
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
