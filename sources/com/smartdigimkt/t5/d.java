package com.smartdigimkt.t5;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.CountDownView;
import com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.SecondEndCardView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class d extends com.smartdigimkt.t5.a {
    SecondEndCardView q;
    com.smartdigimkt.a6.a r;
    int s;
    boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f38734u;
    private View v;

    public class a implements View.OnClickListener {
        final /* synthetic */ ViewGroup X;

        /* JADX INFO: renamed from: com.smartdigimkt.t5.d$a$a, reason: collision with other inner class name */
        public class C0621a implements com.smartdigimkt.a6.b.a {
            public C0621a() {
            }

            @Override // com.smartdigimkt.a6.b.a
            public void a(int i2, int i3) {
                switch (i3) {
                    case 36:
                        break;
                    case 37:
                        if (d.this.s < 2) {
                            return;
                        }
                        break;
                    case 38:
                        if (d.this.s < 3) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
                com.smartdigimkt.w5.c.a aVar = d.this.f;
                if (aVar != null) {
                    aVar.a(i2, i3);
                }
            }
        }

        public a(ViewGroup viewGroup) {
            this.X = viewGroup;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CountDownView countDownView;
            com.smartdigimkt.w5.d.a aVar = d.this.f38727i;
            if (aVar != null) {
                aVar.a(true);
            }
            SecondEndCardView secondEndCardView = d.this.q;
            if (secondEndCardView != null && secondEndCardView.getParent() == null) {
                d dVar = d.this;
                if (dVar.t) {
                    ViewGroup viewGroup = dVar.f38726h;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(4);
                        if (d.this.f38726h.getParent() instanceof ViewGroup) {
                            ((ViewGroup) d.this.f38726h.getParent()).addView(d.this.q, -1, -1);
                        }
                    }
                } else {
                    this.X.addView(dVar.q, -1, -1);
                }
                d dVar2 = d.this;
                dVar2.v = dVar2.q;
                d dVar3 = d.this;
                dVar3.r = new com.smartdigimkt.a6.a(dVar3.f38724c, dVar3.d);
                d dVar4 = d.this;
                dVar4.r.a(dVar4.q);
                d.this.q.setSecondECClickListener(new C0621a());
            }
            d dVar5 = d.this;
            dVar5.b(dVar5.d.t.Z0());
            d dVar6 = d.this;
            if (dVar6.t && (countDownView = dVar6.o) != null) {
                com.smartdigimkt.j7.c.a(countDownView);
                ViewGroup.LayoutParams layoutParams = d.this.o.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
                layoutParams2.addRule(11);
                layoutParams2.setMargins(0, h.a(d.this.f38723b, 8.0f), h.a(d.this.f38723b, 8.0f), 0);
                d dVar7 = d.this;
                dVar7.q.addCloseView(dVar7.o, layoutParams2);
            }
            d.this.a(true);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.f38734u || dVar.s != 4) {
                com.smartdigimkt.w5.d.a aVar = dVar.f38727i;
                if (aVar != null) {
                    aVar.b();
                    return;
                }
                return;
            }
            com.smartdigimkt.w5.c.a aVar2 = dVar.f;
            if (aVar2 != null) {
                aVar2.a(1, 39);
            }
        }
    }

    public d(Context context, f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w5.c.a aVar2, int i2, ViewGroup viewGroup) {
        super(context, fVar, aVar, aVar2, i2, viewGroup);
        this.s = 1;
    }

    @Override // com.smartdigimkt.t5.a
    public void b() {
        super.b();
        this.f38734u = true;
    }

    @Override // com.smartdigimkt.t5.a
    public View e() {
        return this.v;
    }

    @Override // com.smartdigimkt.t5.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.v = this.f38726h;
        this.s = this.d.t.Y0();
        SecondEndCardView secondEndCardView = new SecondEndCardView(this.f38723b);
        this.q = secondEndCardView;
        secondEndCardView.setAdTitle(this.f38724c.g0());
        this.q.setAdDesc(this.f38724c.r());
        if (TextUtils.isEmpty(this.f38724c.w())) {
            this.q.setAdIcon(this.f38724c.s());
        } else {
            this.q.setAdIcon(this.f38724c.w());
        }
        if (TextUtils.isEmpty(this.f38724c.n())) {
            SecondEndCardView secondEndCardView2 = this.q;
            Context context = this.f38723b;
            secondEndCardView2.setCTAText(context.getString(i.a(context, this.f38724c)));
        } else {
            this.q.setCTAText(this.f38724c.n());
        }
        boolean z2 = this.g != 1;
        this.t = z2;
        this.q.addApkComplianceElements(!z2);
        if (!this.t) {
            this.q.setBackgroundColor(Color.parseColor("#CC000000"));
        }
        View viewD = d();
        if (viewD == null) {
            viewD = c();
        }
        if (viewD != null) {
            if ((viewD instanceof TextView) && TextUtils.isEmpty(this.d.t.F1())) {
                ((TextView) viewD).setText(h.a(this.f38723b, "myoffer_sub_close_default_skip_text", k.f38992h));
            }
            if (viewD instanceof ImageView) {
                viewD.setBackgroundResource(h.a(this.f38723b, "myoffer_base_skip_icon", k.d));
            }
            viewD.setOnClickListener(new a(viewGroup));
        }
        this.f38734u = false;
    }

    @Override // com.smartdigimkt.t5.a
    public void a(long j) {
        super.a(j);
        if (this.m >= this.f38729n) {
            com.smartdigimkt.a6.b.a(this.o, true, this.d, false);
            this.o.setOnClickListener(new b());
        }
    }
}
