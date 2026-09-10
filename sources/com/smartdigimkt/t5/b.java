package com.smartdigimkt.t5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.sdk.basead.ui.CountDownView;
import com.smartdigimkt.sdk.basead.ui.GuideToClickView;
import com.smartdigimkt.sdk.basead.ui.simpleview.SimpleCircleView;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class b extends com.smartdigimkt.t5.a {
    private GuideToClickView q;
    private SimpleCircleView r;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            com.smartdigimkt.w5.c.a aVar = bVar.f;
            if (aVar != null) {
                aVar.a(14, 26);
            } else {
                bVar.b();
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.t5.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0619b implements View.OnClickListener {
        public ViewOnClickListenerC0619b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.w5.d.a aVar = b.this.f38727i;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public b(Context context, f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w5.c.a aVar2, int i2, ViewGroup viewGroup) {
        super(context, fVar, aVar, aVar2, i2, viewGroup);
    }

    @Override // com.smartdigimkt.t5.a
    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        this.r = new SimpleCircleView(this.f38723b);
        GuideToClickView guideToClickView = new GuideToClickView(this.f38723b);
        this.q = guideToClickView;
        guideToClickView.hideBackground();
        viewGroup.addView(this.r, -1, -1);
        viewGroup.addView(this.q, -1, -1);
        b(this.d.t.W());
        this.q.setOnClickListener(new a());
        com.smartdigimkt.w5.d.a aVar = this.f38727i;
        if (aVar != null) {
            aVar.a(true);
        }
    }

    @Override // com.smartdigimkt.t5.a
    public void b() {
        super.b();
        GuideToClickView guideToClickView = this.q;
        if (guideToClickView != null) {
            com.smartdigimkt.j7.c.a(guideToClickView);
        }
        SimpleCircleView simpleCircleView = this.r;
        if (simpleCircleView != null) {
            com.smartdigimkt.j7.c.a(simpleCircleView);
        }
        i();
        CountDownView countDownView = this.o;
        if (countDownView != null) {
            countDownView.refresh(this.f38729n);
            this.o.setOnClickListener(new ViewOnClickListenerC0619b());
        }
        com.smartdigimkt.w5.d.a aVar = this.f38727i;
        if (aVar != null) {
            aVar.a(false);
        }
    }
}
