package com.smartdigimkt.r5;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.ScanningAnimButton;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class e extends c {
    @Override // com.smartdigimkt.r5.c, com.smartdigimkt.r5.d
    public void a(ViewGroup viewGroup) {
        LayoutInflater.from(viewGroup.getContext()).inflate(h.a(viewGroup.getContext(), "myoffer_large_cta_button_layout", "layout"), viewGroup);
        this.f38087a = (ScanningAnimButton) viewGroup.findViewById(h.a(viewGroup.getContext(), "myoffer_cta_button_major", "id"));
    }

    @Override // com.smartdigimkt.r5.c, com.smartdigimkt.r5.d
    public void a(ViewGroup viewGroup, f fVar, com.smartdigimkt.v6.a aVar, boolean z2, com.smartdigimkt.a6.b.a aVar2) {
        super.a(viewGroup, fVar, aVar, z2, aVar2);
        if (this.f38087a != null) {
            if (!TextUtils.isEmpty(fVar.n())) {
                this.f38087a.setText(fVar.n());
            } else {
                this.f38087a.setText(i.a(viewGroup.getContext(), fVar));
            }
            if (fVar.i() != null) {
                this.f38087a.startAnimation(fVar.i().L());
            }
        }
    }
}
