package com.smartdigimkt.t5;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.CountDownView;
import com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.RPSecondEndCardView;
import com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.SecondEndCardView;
import com.smartdigimkt.sdk.basead.ui.simpleview.SimplePlayer;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class e extends com.smartdigimkt.t5.a {
    ViewGroup q;
    SimplePlayer r;
    SecondEndCardView s;
    private boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    com.smartdigimkt.a6.a f38737u;
    int v;

    public class a implements SimplePlayer.d {

        /* JADX INFO: renamed from: com.smartdigimkt.t5.e$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0622a implements View.OnClickListener {
            public ViewOnClickListenerC0622a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.smartdigimkt.w5.d.a aVar = e.this.f38727i;
                if (aVar != null) {
                    aVar.b();
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.simpleview.SimplePlayer.d
        public void a() {
            e.this.t = true;
        }

        @Override // com.smartdigimkt.sdk.basead.ui.simpleview.SimplePlayer.d
        public void a(String str) {
            SimplePlayer simplePlayer;
            if (!e.this.t && (simplePlayer = e.this.r) != null) {
                com.smartdigimkt.j7.c.a(simplePlayer);
            }
            e.this.g();
            e eVar = e.this;
            eVar.o.refresh(eVar.f38729n);
            CountDownView countDownView = e.this.o;
            if (countDownView != null) {
                countDownView.setVisibility(0);
                e eVar2 = e.this;
                CountDownView countDownView2 = eVar2.o;
                Context context = eVar2.f38723b;
                countDownView2.setCountDownEndDrawable(com.smartdigimkt.j7.c.a(context, h.a(context, "myoffer_base_close_icon", k.d)));
                e.this.o.setOnClickListener(new ViewOnClickListenerC0622a());
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.w5.c.a aVar = e.this.f;
            if (aVar != null) {
                aVar.a(14, 32);
            }
        }
    }

    public class c implements View.OnClickListener {

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.smartdigimkt.w5.d.a aVar = e.this.f38727i;
                if (aVar != null) {
                    aVar.b();
                }
            }
        }

        public class b implements com.smartdigimkt.a6.b.a {
            public b() {
            }

            @Override // com.smartdigimkt.a6.b.a
            public void a(int i2, int i3) {
                switch (i3) {
                    case 33:
                    case 35:
                        if (e.this.v < 2) {
                            return;
                        }
                        break;
                    case 34:
                        break;
                    default:
                        return;
                }
                com.smartdigimkt.w5.c.a aVar = e.this.f;
                if (aVar != null) {
                    aVar.a(i2, i3);
                }
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            CountDownView countDownView = eVar.o;
            Context context = eVar.f38723b;
            countDownView.setCountDownEndDrawable(com.smartdigimkt.j7.c.a(context, h.a(context, "myoffer_base_close_icon", k.d)));
            e.this.o.setOnClickListener(new a());
            SimplePlayer simplePlayer = e.this.r;
            if (simplePlayer != null) {
                simplePlayer.stopVideo();
            }
            com.smartdigimkt.w5.d.a aVar = e.this.f38727i;
            if (aVar != null) {
                aVar.a(true);
            }
            SecondEndCardView secondEndCardView = e.this.s;
            if (secondEndCardView != null && secondEndCardView.getParent() == null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                e eVar2 = e.this;
                eVar2.q.addView(eVar2.s, 1, layoutParams);
                e.this.s.setSecondECClickListener(new b());
            }
            e eVar3 = e.this;
            com.smartdigimkt.a6.b.a(eVar3.o, true, eVar3.d, false);
            e.this.a(true);
        }
    }

    public e(Context context, f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w5.c.a aVar2, int i2, ViewGroup viewGroup) {
        super(context, fVar, aVar, aVar2, i2, viewGroup);
        this.t = false;
        this.v = 1;
    }

    private void b(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(this.f38723b).inflate(h.a(this.f38723b, "myoffer_include_4_element", "layout"), (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        viewGroup.addView(viewInflate, layoutParams);
    }

    @Override // com.smartdigimkt.t5.a
    public void a(ViewGroup viewGroup) {
        String strH0;
        super.a(viewGroup);
        this.q = viewGroup;
        g gVarI = this.f38724c.i();
        if (gVarI != null) {
            strH0 = gVarI.H0();
            this.v = gVarI.G0();
        } else {
            strH0 = "";
        }
        b(this.d.t.W());
        CountDownView countDownView = this.o;
        Context context = this.f38723b;
        countDownView.setCountDownEndDrawable(com.smartdigimkt.j7.c.a(context, h.a(context, "myoffer_base_skip_icon", k.d)));
        SimplePlayer simplePlayer = new SimplePlayer(this.f38723b);
        this.r = simplePlayer;
        viewGroup.addView(simplePlayer, -1, -1);
        this.r.load(strH0, true);
        this.r.setSimplePlayerViewListener(new a());
        this.r.setOnClickListener(new b());
        RPSecondEndCardView rPSecondEndCardView = new RPSecondEndCardView(this.f38723b);
        this.s = rPSecondEndCardView;
        if (gVarI != null) {
            rPSecondEndCardView.setAdTitle(gVarI.T0());
            this.s.setAdIcon(gVarI.R0());
            this.s.setAdPoster(gVarI.S0());
            String strQ0 = gVarI.Q0();
            if (TextUtils.isEmpty(strQ0)) {
                if (this.f38724c.j() == 4) {
                    this.s.setCTAText(this.f38723b.getResources().getString(h.a(this.f38723b, "myoffer_rp_second_hint_link4_text", k.f38992h)));
                }
            } else {
                this.s.setCTAText(strQ0);
            }
        }
        this.s.setBackgroundColor(Color.parseColor("#CC000000"));
        b(viewGroup);
        com.smartdigimkt.a6.a aVar = new com.smartdigimkt.a6.a(this.f38724c, this.d);
        this.f38737u = aVar;
        aVar.a(viewGroup);
    }

    @Override // com.smartdigimkt.t5.a
    public void a(long j) {
        super.a(j);
        if (this.m >= this.f38729n) {
            com.smartdigimkt.a6.b.a(this.o, true, this.d, false);
            this.o.setOnClickListener(new c());
        }
    }
}
