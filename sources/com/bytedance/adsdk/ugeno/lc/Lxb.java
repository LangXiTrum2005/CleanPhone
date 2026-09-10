package com.bytedance.adsdk.ugeno.lc;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lxb<T> extends FrameLayout implements com.bytedance.adsdk.ugeno.OY.lk.ZU {
    private final Runnable DY;
    private int IeN;
    private boolean JVA;
    private int JXs;
    protected com.bytedance.adsdk.ugeno.OY.lk LD;
    protected List<T> Lxb;
    private boolean NXR;
    private String OY;
    private float QAg;
    private int STP;
    private final Runnable Sfi;
    private int VVE;
    private int ZU;
    private C0040Lxb brP;
    private int ebl;
    private com.bytedance.adsdk.ugeno.lc.Lxb.Lxb kqm;
    private int lc;
    private int lk;
    private boolean nBu;
    private boolean sLN;
    private lk tD;

    public class LD extends com.bytedance.adsdk.ugeno.OY.lk {
        public LD(Context context) {
            super(context);
        }

        @Override // com.bytedance.adsdk.ugeno.OY.lk, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!Lxb.this.NXR) {
                return false;
            }
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.OY.lk, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!Lxb.this.NXR) {
                return false;
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.lc.Lxb$Lxb, reason: collision with other inner class name */
    public class C0040Lxb extends com.bytedance.adsdk.ugeno.OY.LD {
        public C0040Lxb() {
        }

        @Override // com.bytedance.adsdk.ugeno.OY.LD
        public int Lxb(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.OY.LD
        public boolean Lxb(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.OY.LD
        public int Lxb() {
            if (Lxb.this.sLN) {
                return Integer.MAX_VALUE;
            }
            return Lxb.this.Lxb.size();
        }

        @Override // com.bytedance.adsdk.ugeno.OY.LD
        public Object Lxb(ViewGroup viewGroup, int i) {
            View viewLxb = Lxb.this.Lxb(i, ZU.Lxb(Lxb.this.sLN, i, Lxb.this.Lxb.size()));
            viewGroup.addView(viewLxb);
            return viewLxb;
        }

        @Override // com.bytedance.adsdk.ugeno.OY.LD
        public void Lxb(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.OY.LD
        public float Lxb(int i) {
            if (Lxb.this.QAg <= 0.0f) {
                return 1.0f;
            }
            return 1.0f / Lxb.this.QAg;
        }
    }

    public Lxb(Context context) {
        super(context);
        this.Lxb = new CopyOnWriteArrayList();
        this.lk = 2000;
        this.ZU = 500;
        this.JXs = 10;
        this.lc = -1;
        this.ebl = -1;
        this.OY = "normal";
        this.QAg = 1.0f;
        this.nBu = true;
        this.JVA = true;
        this.sLN = true;
        this.NXR = true;
        this.STP = 0;
        this.IeN = 0;
        this.VVE = 0;
        this.DY = new Runnable() { // from class: com.bytedance.adsdk.ugeno.lc.Lxb.1
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = Lxb.this.LD.getCurrentItem() + 1;
                if (Lxb.this.sLN) {
                    if (currentItem >= Integer.MAX_VALUE) {
                        Lxb.this.LD.Lxb(1073741823, false);
                        return;
                    } else {
                        Lxb.this.LD.Lxb(currentItem, true);
                        return;
                    }
                }
                if (currentItem >= Lxb.this.LD.getAdapter().Lxb()) {
                    Lxb.this.LD.Lxb(0, false);
                } else {
                    Lxb.this.LD.Lxb(currentItem, true);
                }
            }
        };
        this.Sfi = new Runnable() { // from class: com.bytedance.adsdk.ugeno.lc.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                if (Lxb.this.JVA) {
                    int currentItem = Lxb.this.LD.getCurrentItem() + 1;
                    if (Lxb.this.sLN) {
                        if (currentItem >= Integer.MAX_VALUE) {
                            Lxb.this.LD.Lxb(1073741823, false);
                        } else {
                            Lxb.this.LD.Lxb(currentItem, true);
                        }
                        Lxb lxb = Lxb.this;
                        lxb.postDelayed(lxb.Sfi, Lxb.this.lk);
                        return;
                    }
                    if (currentItem >= Lxb.this.LD.getAdapter().Lxb()) {
                        Lxb.this.LD.Lxb(0, false);
                        Lxb lxb2 = Lxb.this;
                        lxb2.postDelayed(lxb2.Sfi, Lxb.this.lk);
                    } else {
                        Lxb.this.LD.Lxb(currentItem, true);
                        Lxb lxb3 = Lxb.this;
                        lxb3.postDelayed(lxb3.Sfi, Lxb.this.lk);
                    }
                }
            }
        };
        this.LD = new LD(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.LD, layoutParams);
        com.bytedance.adsdk.ugeno.lc.Lxb.Lxb lxb = new com.bytedance.adsdk.ugeno.lc.Lxb.Lxb(context);
        this.kqm = lxb;
        addView(lxb);
    }

    @Override // com.bytedance.adsdk.ugeno.OY.lk.ZU
    public void OY(int i) {
        if (this.tD != null) {
            int iLxb = ZU.Lxb(this.sLN, i, this.Lxb.size());
            this.tD.Lxb(this.sLN, iLxb, i, iLxb == 0, iLxb == this.Lxb.size() - 1);
        }
        if (this.nBu) {
            this.kqm.Lxb(i);
        }
    }

    public void QAg(int i) {
        Lxb(this.OY, this.JXs, this.lc, this.ebl, true);
        if (this.brP == null) {
            this.brP = new C0040Lxb();
            this.LD.Lxb((com.bytedance.adsdk.ugeno.OY.lk.ZU) this);
            this.LD.setAdapter(this.brP);
        }
        if (this.sLN) {
            if (i >= Integer.MAX_VALUE) {
                this.LD.Lxb(1073741823, false);
                return;
            } else {
                this.LD.Lxb(i, true);
                return;
            }
        }
        if (i < 0 || i >= this.Lxb.size()) {
            return;
        }
        this.LD.Lxb(i, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.JVA) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                LD();
            } else if (action == 0) {
                lk();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public abstract View ebl(int i);

    public com.bytedance.adsdk.ugeno.OY.LD getAdapter() {
        return this.LD.getAdapter();
    }

    public int getCurrentItem() {
        return this.LD.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.OY.lk getViewPager() {
        return this.LD;
    }

    public void setOnPageChangeListener(lk lkVar) {
        this.tD = lkVar;
    }

    public Lxb JXs(int i) {
        this.lc = i;
        Lxb(this.OY, this.JXs, i, this.ebl, true);
        return this;
    }

    public Lxb LD(boolean z) {
        this.nBu = z;
        return this;
    }

    public Lxb Lxb(boolean z) {
        this.JVA = z;
        LD();
        return this;
    }

    public Lxb ZU(int i) {
        this.JXs = i;
        Lxb(this.OY, i, this.lc, this.ebl, true);
        return this;
    }

    public Lxb lc(int i) {
        this.ebl = i;
        Lxb(this.OY, this.JXs, this.lc, i, true);
        return this;
    }

    public Lxb lk(int i) {
        this.kqm.setUnSelectedColor(i);
        return this;
    }

    public Lxb LD(int i) {
        this.kqm.setSelectedColor(i);
        return this;
    }

    public Lxb lk(boolean z) {
        this.kqm.setLoop(z);
        if (this.sLN != z) {
            int iLxb = ZU.Lxb(z, this.LD.getCurrentItem(), this.Lxb.size());
            this.sLN = z;
            C0040Lxb c0040Lxb = this.brP;
            if (c0040Lxb != null) {
                c0040Lxb.lk();
                this.LD.setCurrentItem(iLxb);
            }
        }
        return this;
    }

    public void LD() {
        removeCallbacks(this.Sfi);
        postDelayed(this.Sfi, this.lk);
    }

    public Lxb Lxb(int i) {
        this.lk = i;
        LD();
        return this;
    }

    public Lxb Lxb(float f) {
        this.QAg = f;
        return this;
    }

    public Lxb Lxb(String str) {
        this.OY = str;
        Lxb(str, this.JXs, this.lc, this.ebl, true);
        return this;
    }

    public void Lxb(String str, int i, int i2, int i3, boolean z) {
        C0040Lxb c0040Lxb = this.brP;
        if (c0040Lxb != null) {
            c0040Lxb.lk();
        }
        setClipChildren(false);
        this.LD.setClipChildren(false);
        this.LD.setPageMargin(i);
        ViewGroup.LayoutParams layoutParams = this.LD.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i2 + i;
            marginLayoutParams.rightMargin = i3 + i;
            this.LD.setLayoutParams(layoutParams);
        }
        if (TextUtils.equals(str, "linear")) {
            this.LD.Lxb(false, (com.bytedance.adsdk.ugeno.OY.lk.JXs) new com.bytedance.adsdk.ugeno.lc.LD.Lxb());
        } else {
            this.LD.Lxb(false, (com.bytedance.adsdk.ugeno.OY.lk.JXs) null);
        }
        this.LD.setOffscreenPageLimit((int) this.QAg);
    }

    public void lk() {
        removeCallbacks(this.Sfi);
    }

    public void Lxb() {
        int i;
        Lxb(this.OY, this.JXs, this.lc, this.ebl, true);
        if (this.brP == null) {
            this.brP = new C0040Lxb();
            this.LD.Lxb((com.bytedance.adsdk.ugeno.OY.lk.ZU) this);
            this.LD.setAdapter(this.brP);
        }
        int i2 = this.STP;
        if (i2 < 0 || i2 >= this.Lxb.size()) {
            this.STP = 0;
        }
        if (this.sLN) {
            i = this.STP + 1073741823;
        } else {
            i = this.STP;
        }
        this.LD.Lxb(i, true);
        if (!this.sLN) {
            OY(i);
        }
        if (this.JVA) {
            LD();
        }
    }

    public View Lxb(int i, int i2) {
        if (this.Lxb.size() == 0) {
            return new View(getContext());
        }
        View viewEbl = ebl(i2);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewEbl instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (viewEbl.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewEbl.getParent()).removeView(viewEbl);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewEbl, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public Lxb<T> Lxb(T t) {
        if (t != null) {
            this.Lxb.add(t);
            if (this.nBu) {
                this.kqm.LD();
            }
        }
        C0040Lxb c0040Lxb = this.brP;
        if (c0040Lxb != null) {
            c0040Lxb.lk();
            this.kqm.Lxb(this.STP, this.LD.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.OY.lk.ZU
    public void Lxb(int i, float f, int i2) {
        if (this.tD != null) {
            ZU.Lxb(this.sLN, i, this.Lxb.size());
        }
    }
}
