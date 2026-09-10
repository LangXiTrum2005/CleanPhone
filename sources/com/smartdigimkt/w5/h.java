package com.smartdigimkt.w5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView;
import com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.CountDownSkipIncentiveTaskView;
import com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.QAIncentiveTaskView;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class h extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    com.smartdigimkt.h7.c f39433l;
    BaseIncentiveTaskView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f39434n;
    private long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f39435p;
    private int q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f39432i = 1;
    private final int j = 2;
    private final int k = 3;
    private int r = 3;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.c();
        }
    }

    public class b implements BaseIncentiveTaskView.c {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.c
        public void a(long j) {
            c.a aVar = h.this.f39415h;
            if (aVar instanceof c.b) {
                ((c.b) aVar).a(j);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.c
        public void onClose() {
            h hVar = h.this;
            com.smartdigimkt.i7.d.a(hVar.f39413c, hVar.f39412b, hVar.o, h.this.f39435p, h.this.f39434n, h.this.r);
            h.this.b();
        }

        @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.c
        public void a() {
            h.this.f39435p = true;
            h hVar = h.this;
            c.a aVar = hVar.f39415h;
            if (aVar != null) {
                aVar.a(16, hVar.q == 3 ? 42 : 13);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.improveclick.incentivetask.BaseIncentiveTaskView.c
        public void a(int i2) {
            h.this.r = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BaseIncentiveTaskView baseIncentiveTaskView = this.m;
        if (baseIncentiveTaskView != null) {
            com.smartdigimkt.j7.c.a(baseIncentiveTaskView);
            c.a aVar = this.f39415h;
            if (aVar instanceof c.b) {
                ((c.b) aVar).b();
            }
            this.m.release();
            this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        int iM0 = this.f39413c.t.m0();
        this.q = iM0;
        if (iM0 == 2) {
            this.m = new QAIncentiveTaskView(this.f39411a);
        } else if (iM0 == 3) {
            this.m = new CountDownSkipIncentiveTaskView(this.f39411a);
        }
        if (this.m != null) {
            this.o = System.currentTimeMillis();
            this.m.initSetting(this.f39412b, this.f39413c.t, this.f39434n, new b());
            if (this.f != null) {
                this.f.addView(this.m, new RelativeLayout.LayoutParams(-1, -1));
                c.a aVar = this.f39415h;
                if (aVar instanceof c.b) {
                    ((c.b) aVar).a();
                }
            }
        }
    }

    @Override // com.smartdigimkt.w5.c
    public void a(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i2, c.a aVar2) {
        super.a(context, fVar, aVar, viewGroup, relativeLayout, view, i2, aVar2);
    }

    @Override // com.smartdigimkt.w5.c
    public void a(int i2, Map<String, Object> map) {
        Object obj;
        if (i2 != 107 && i2 != 108) {
            if (i2 == 114) {
                if (this.f39433l == null) {
                    this.f39433l = new com.smartdigimkt.h7.c(this.f39413c.t.k0(), new a(), true);
                }
                if (map != null && (obj = map.get("video_length")) != null && (obj instanceof Long)) {
                    this.f39434n = ((Long) obj).longValue();
                }
                com.smartdigimkt.h7.c cVar = this.f39433l;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            }
            if (i2 != 120) {
                switch (i2) {
                    case 110:
                        com.smartdigimkt.h7.c cVar2 = this.f39433l;
                        if (cVar2 != null) {
                            cVar2.b();
                        }
                        BaseIncentiveTaskView baseIncentiveTaskView = this.m;
                        if (baseIncentiveTaskView != null) {
                            baseIncentiveTaskView.onResume();
                        }
                        break;
                    case 111:
                        com.smartdigimkt.h7.c cVar3 = this.f39433l;
                        if (cVar3 != null) {
                            cVar3.a();
                        }
                        BaseIncentiveTaskView baseIncentiveTaskView2 = this.m;
                        if (baseIncentiveTaskView2 != null) {
                            baseIncentiveTaskView2.onPause();
                        }
                        break;
                }
                return;
            }
        }
        a();
    }

    @Override // com.smartdigimkt.w5.c
    public void a() {
        com.smartdigimkt.h7.c cVar = this.f39433l;
        if (cVar != null) {
            cVar.c();
            this.f39433l = null;
        }
        b();
    }
}
