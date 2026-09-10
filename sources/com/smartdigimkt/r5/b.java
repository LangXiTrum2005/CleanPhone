package com.smartdigimkt.r5;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.ScanningAnimButton;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class b extends com.smartdigimkt.r5.a {

    public class a implements View.OnClickListener {
        final /* synthetic */ com.smartdigimkt.a6.b.a X;

        public a(com.smartdigimkt.a6.b.a aVar) {
            this.X = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = this.X;
            if (aVar != null) {
                aVar.a(-100, 13);
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.r5.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0577b implements View.OnClickListener {
        final /* synthetic */ com.smartdigimkt.a6.b.a X;

        public ViewOnClickListenerC0577b(com.smartdigimkt.a6.b.a aVar) {
            this.X = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.X.a(1, 1);
        }
    }

    @Override // com.smartdigimkt.r5.d
    public void a(ViewGroup viewGroup) {
        LayoutInflater.from(viewGroup.getContext()).inflate(h.a(viewGroup.getContext(), "myoffer_close_cta_button_layout", "layout"), viewGroup);
        this.f38087a = (ScanningAnimButton) viewGroup.findViewById(h.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
        this.f38088b = (ScanningAnimButton) viewGroup.findViewById(h.a(viewGroup.getContext(), "myoffer_cta_button_minor", "id"));
    }

    @Override // com.smartdigimkt.r5.a, com.smartdigimkt.r5.d
    public void b(ViewGroup viewGroup) {
        super.b(viewGroup);
        ScanningAnimButton scanningAnimButton = this.f38088b;
        if (scanningAnimButton != null) {
            scanningAnimButton.setEnabled(true);
            Context context = viewGroup.getContext();
            this.f38088b.setBackgroundResource(h.a(context, "myoffer_splash_bg_rectangle_btn_cta_close_minor_active", k.d));
            this.f38088b.setTextColor(context.getResources().getColor(h.a(context, "color_cta_text", "color")));
        }
    }

    @Override // com.smartdigimkt.r5.d
    public void c(ViewGroup viewGroup) {
    }

    @Override // com.smartdigimkt.r5.d
    public void a(ViewGroup viewGroup, f fVar, com.smartdigimkt.v6.a aVar, boolean z2, com.smartdigimkt.a6.b.a aVar2) {
        if (this.f38088b != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            int i2 = layoutParams.width;
            if (i2 > 0 && i2 < h.a(viewGroup.getContext(), 240.0f)) {
                layoutParams.width = h.a(viewGroup.getContext(), 296.0f);
                viewGroup.setLayoutParams(layoutParams);
            }
            this.f38088b.setVisibility(0);
            if (!TextUtils.isEmpty(aVar.t.F1())) {
                this.f38088b.setText(aVar.t.F1());
            }
            this.f38088b.setOnClickListener(new a(aVar2));
            this.f38088b.setEnabled(false);
        }
        if (this.f38087a != null) {
            if (!TextUtils.isEmpty(fVar.n())) {
                this.f38087a.setText(fVar.n());
            } else {
                this.f38087a.setText(i.a(viewGroup.getContext(), fVar));
            }
            if (viewGroup.getParent() != null && (viewGroup.getParent() instanceof ViewGroup)) {
                ((ViewGroup) viewGroup.getParent()).setClipChildren(false);
            }
            if (fVar.i() != null) {
                this.f38087a.startAnimation(fVar.i().L());
            }
            if (aVar2 != null) {
                this.f38087a.setOnClickListener(new ViewOnClickListenerC0577b(aVar2));
            }
        }
    }
}
