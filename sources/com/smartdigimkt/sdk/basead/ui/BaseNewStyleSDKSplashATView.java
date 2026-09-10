package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import com.smartdigimkt.i7.d;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.m3.j;
import com.smartdigimkt.o8.b;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseNewStyleSDKSplashATView extends BaseSdkSplashATView {
    int l1;
    int m1;
    private boolean n1;

    public BaseNewStyleSDKSplashATView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a() {
        super.a();
        getMaterialRealSize();
    }

    public void getMaterialRealSize() {
        String strS = this.g0.s();
        if (TextUtils.isEmpty(strS)) {
            if (this.g0.l0() <= 0 || this.g0.j0() <= 0) {
                return;
            }
            this.l1 = this.g0.l0();
            this.m1 = this.g0.j0();
            return;
        }
        int[] iArrA = b.a(j.a().a(1, strS));
        if (iArrA != null) {
            this.l1 = iArrA[0];
            this.m1 = iArrA[1];
        }
    }

    public BaseNewStyleSDKSplashATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public void a(boolean z2, int i2) {
        super.a(z2, i2);
        if (this.n1) {
            return;
        }
        this.n1 = true;
        com.smartdigimkt.v6.a aVar = this.f0;
        f fVar = this.g0;
        boolean zA = i.a(aVar);
        int i3 = 2;
        if (this.l1 <= this.m1) {
            i3 = 1;
        }
        d.a(aVar, fVar, zA, 1, i3, BaseSdkSplashATView.isSinglePicture(this.g0, this.f0.t) ? 2 : 1, this.y0, this.z0);
    }
}
