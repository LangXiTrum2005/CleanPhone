package com.smartdigimkt.t5;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.CountDownView;
import com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.RedPacketPage;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class c extends com.smartdigimkt.t5.a {
    private RedPacketPage q;
    com.smartdigimkt.a6.a r;
    int s;
    int t;

    public class a implements com.smartdigimkt.a6.b.a {

        /* JADX INFO: renamed from: com.smartdigimkt.t5.c$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0620a implements View.OnClickListener {
            public ViewOnClickListenerC0620a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.smartdigimkt.w5.d.a aVar = c.this.f38727i;
                if (aVar != null) {
                    aVar.b();
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            boolean z2;
            com.smartdigimkt.w5.c.a aVar;
            boolean z3 = true;
            switch (i3) {
                case 27:
                    z2 = c.this.d.t.U0() == 2;
                    if (!z2) {
                        c cVar = c.this;
                        com.smartdigimkt.a6.b.a(cVar.o, true, cVar.d, false);
                    }
                    z3 = z2;
                    break;
                case 28:
                    if (c.this.s < 2) {
                        z2 = false;
                        z3 = z2;
                    } else {
                        z2 = false;
                    }
                    break;
                case 29:
                    if (c.this.s < 1) {
                        z2 = false;
                        z3 = z2;
                    } else {
                        z2 = false;
                    }
                    break;
                case 30:
                    z2 = false;
                    break;
                case 31:
                    if (c.this.t < 1) {
                        z2 = false;
                        z3 = z2;
                    } else {
                        z2 = false;
                    }
                    break;
                default:
                    z2 = false;
                    z3 = z2;
                    break;
            }
            if (z3 && (aVar = c.this.f) != null) {
                aVar.a(i2, i3);
            }
            if (z2) {
                if (c.this.q != null) {
                    com.smartdigimkt.j7.c.a(c.this.q);
                    com.smartdigimkt.w5.d.a aVar2 = c.this.f38727i;
                    if (aVar2 != null) {
                        aVar2.a(false);
                    }
                }
                c.this.o.setVisibility(0);
                c.this.o.setOnClickListener(new ViewOnClickListenerC0620a());
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.w5.d.a aVar = c.this.f38727i;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public c(Context context, f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w5.c.a aVar2, int i2, ViewGroup viewGroup) {
        super(context, fVar, aVar, aVar2, i2, viewGroup);
    }

    @Override // com.smartdigimkt.t5.a
    public void f() {
        super.f();
        com.smartdigimkt.w5.d.a aVar = this.f38727i;
        if (aVar != null) {
            aVar.a(1);
        }
    }

    @Override // com.smartdigimkt.t5.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.s = this.d.t.P0() / 10;
        this.t = this.d.t.P0() % 10;
        this.q = new RedPacketPage(this.f38723b);
        com.smartdigimkt.a6.a aVar = new com.smartdigimkt.a6.a(this.f38724c, this.d);
        this.r = aVar;
        aVar.a(this.q);
        this.q.setOpenIconClickClickAction(this.d.t.U0());
        this.q.setRedPacketClickListener(new a());
        f fVar = this.f38724c;
        if (fVar != null) {
            String strG0 = fVar.g0();
            f fVar2 = this.f38724c;
            if ((fVar2 instanceof com.smartdigimkt.w6.d) && !TextUtils.isEmpty(((com.smartdigimkt.w6.d) fVar2).z0())) {
                strG0 = ((com.smartdigimkt.w6.d) this.f38724c).z0();
            }
            String strReplace = "";
            if (!TextUtils.isEmpty(strG0)) {
                strReplace = !TextUtils.isEmpty(this.d.t.O0()) ? this.d.t.O0().replace("{__sender__}", "") : this.f38723b.getResources().getString(h.a(this.f38723b, "myoffer_red_packet_title_text", k.f38992h), strG0);
            }
            this.q.setAdTitle(strReplace);
            this.q.setAdBless(this.d.t.K0());
            if (TextUtils.isEmpty(this.f38724c.w())) {
                this.q.setAdIconUrl(this.f38724c.s());
            } else {
                this.q.setAdIconUrl(this.f38724c.w());
            }
            this.q.setAdNotice(this.d.t.N0(), this.f38724c.j());
            this.q.setCTAText(this.d.t.L0());
        }
        viewGroup.addView(this.q, -1, -1);
        b(this.d.t.W());
        CountDownView countDownView = this.o;
        if (countDownView != null) {
            com.smartdigimkt.a6.b.a(countDownView, false, this.d, false);
        }
        com.smartdigimkt.w5.d.a aVar2 = this.f38727i;
        if (aVar2 != null) {
            aVar2.a(true);
        }
    }

    @Override // com.smartdigimkt.t5.a
    public void a(long j) {
        super.a(j);
        if (this.m >= this.f38729n) {
            this.o.setOnClickListener(new b());
        }
    }
}
