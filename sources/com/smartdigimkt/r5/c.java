package com.smartdigimkt.r5;

import android.graphics.Color;
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
public class c extends com.smartdigimkt.r5.a {

    public class a implements View.OnClickListener {
        final /* synthetic */ boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.a6.b.a f38091Y;

        public a(boolean z2, com.smartdigimkt.a6.b.a aVar) {
            this.X = z2;
            this.f38091Y = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.X) {
                this.f38091Y.a(1, 40);
            } else {
                this.f38091Y.a(1, 24);
            }
        }
    }

    public class b implements View.OnClickListener {
        final /* synthetic */ boolean X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.a6.b.a f38092Y;

        public b(boolean z2, com.smartdigimkt.a6.b.a aVar) {
            this.X = z2;
            this.f38092Y = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.X) {
                this.f38092Y.a(1, 41);
            } else {
                this.f38092Y.a(1, 25);
            }
        }
    }

    @Override // com.smartdigimkt.r5.d
    public void a(ViewGroup viewGroup) {
        LayoutInflater.from(viewGroup.getContext()).inflate(h.a(viewGroup.getContext(), "myoffer_cta_button_layout", "layout"), viewGroup);
        this.f38087a = (ScanningAnimButton) viewGroup.findViewById(h.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
        this.f38088b = (ScanningAnimButton) viewGroup.findViewById(h.a(viewGroup.getContext(), "myoffer_cta_button_minor", "id"));
    }

    @Override // com.smartdigimkt.r5.d
    public void c(ViewGroup viewGroup) {
        ScanningAnimButton scanningAnimButton = this.f38088b;
        if (scanningAnimButton != null) {
            scanningAnimButton.setTextColor(Color.parseColor("#FFFFFF"));
            this.f38088b.setBackgroundResource(h.a(viewGroup.getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem_minor_white", k.d));
        }
    }

    @Override // com.smartdigimkt.r5.d
    public void a(ViewGroup viewGroup, f fVar, com.smartdigimkt.v6.a aVar, boolean z2, com.smartdigimkt.a6.b.a aVar2) {
        boolean zA = a(fVar, z2);
        ScanningAnimButton scanningAnimButton = this.f38088b;
        if (scanningAnimButton != null) {
            if (zA) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                int i2 = layoutParams.width;
                if (i2 > 0 && i2 < h.a(viewGroup.getContext(), 240.0f)) {
                    layoutParams.width = h.a(viewGroup.getContext(), 296.0f);
                    viewGroup.setLayoutParams(layoutParams);
                }
                this.f38088b.setVisibility(0);
                if (!TextUtils.isEmpty(aVar.t.J())) {
                    this.f38088b.setText(aVar.t.J());
                }
                if (aVar2 != null) {
                    this.f38088b.setOnClickListener(new a(z2, aVar2));
                }
            } else {
                scanningAnimButton.setVisibility(8);
            }
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
            if (aVar2 == null || !zA) {
                return;
            }
            this.f38087a.setOnClickListener(new b(z2, aVar2));
        }
    }

    public boolean a(f fVar, boolean z2) {
        if (fVar == null) {
            return false;
        }
        int iK = fVar.i().K();
        if (iK == 2) {
            return z2;
        }
        if (iK != 3) {
            return iK == 4;
        }
        return !z2;
    }
}
