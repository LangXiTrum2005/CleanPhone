package com.smartdigimkt.u2;

import com.smartdigimkt.expressad.video.module.AnythinkClickMiniCardView;

/* JADX INFO: loaded from: classes6.dex */
public class g extends i {
    private AnythinkClickMiniCardView X;

    public g(AnythinkClickMiniCardView anythinkClickMiniCardView, com.smartdigimkt.t2.a aVar) {
        super(aVar);
        this.X = anythinkClickMiniCardView;
    }

    @Override // com.smartdigimkt.u2.i, com.smartdigimkt.u2.f, com.smartdigimkt.t2.a
    public void a(int i2, Object obj) {
        boolean z2 = false;
        switch (i2) {
            case 100:
                AnythinkClickMiniCardView anythinkClickMiniCardView = this.X;
                if (anythinkClickMiniCardView != null) {
                    anythinkClickMiniCardView.webviewshow();
                    AnythinkClickMiniCardView anythinkClickMiniCardView2 = this.X;
                    anythinkClickMiniCardView2.onSelfConfigurationChanged(anythinkClickMiniCardView2.getResources().getConfiguration());
                }
                break;
            case 101:
            case 102:
                z2 = true;
                break;
            case 103:
                i2 = 107;
                break;
        }
        if (z2) {
            return;
        }
        super.a(i2, obj);
    }
}
