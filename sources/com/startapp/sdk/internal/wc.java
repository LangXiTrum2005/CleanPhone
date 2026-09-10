package com.startapp.sdk.internal;

import android.widget.ImageButton;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class wc extends w1 {
    final /* synthetic */ xc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(xc xcVar, v1 v1Var) {
        super(v1Var);
        this.this$0 = xcVar;
    }

    @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
    public void close() {
        xc xcVar = this.this$0;
        MraidState mraidState = MraidState.HIDDEN;
        xcVar.f41673b = mraidState;
        vi.a(xcVar.f41672a.v, true, "mraid.fireStateChangeEvent", mraidState.toString());
        oa oaVar = this.this$0.f41672a.K;
        oaVar.f41307a.i();
        oaVar.f41307a.b();
    }

    public void fireViewableChangeEvent() {
        ag agVar;
        xc xcVar = this.this$0;
        vi.a(xcVar.f41672a.v, true, "mraid.fireViewableChangeEvent", Boolean.valueOf(xcVar.j));
        xc xcVar2 = this.this$0;
        if (!xcVar2.j || (agVar = xcVar2.f41672a.f41774z) == null) {
            return;
        }
        agVar.b();
    }

    @Override // com.startapp.sdk.internal.w1
    public boolean isFeatureSupported(String str) {
        xc xcVar = this.this$0;
        if (xcVar.d == null) {
            xcVar.d = new zc(xcVar.f41672a.f41606a);
        }
        return xcVar.d.f41780b.contains(str);
    }

    @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
    public void setOrientationProperties(Map<String, String> map) {
        boolean z2 = Boolean.parseBoolean(map.get("allowOrientationChange"));
        String str = map.get("forceOrientation");
        xc xcVar = this.this$0;
        if (xcVar.f41675e == null) {
            xcVar.f41675e = new ad();
        }
        ad adVar = xcVar.f41675e;
        if (adVar.f40802a == z2) {
            int i2 = adVar.f40803b;
            int iIndexOf = ad.f40801c.indexOf(str);
            if (iIndexOf == -1) {
                iIndexOf = 2;
            }
            if (i2 == iIndexOf) {
                return;
            }
        }
        adVar.f40802a = z2;
        int iIndexOf2 = ad.f40801c.indexOf(str);
        adVar.f40803b = iIndexOf2 != -1 ? iIndexOf2 : 2;
        applyOrientationProperties(this.this$0.f41672a.f41606a, adVar);
    }

    @Override // com.startapp.sdk.internal.w1, com.startapp.sdk.internal.rc
    public void useCustomClose(String str) {
        boolean z2 = Boolean.parseBoolean(str);
        xc xcVar = this.this$0;
        if (xcVar.f41677i != z2) {
            xcVar.f41677i = z2;
            if (!z2) {
                xcVar.f41672a.t();
                return;
            }
            za zaVar = xcVar.f41672a;
            zaVar.getClass();
            try {
                ImageButton imageButton = zaVar.x;
                if (imageButton != null) {
                    imageButton.setVisibility(4);
                }
            } catch (Throwable th) {
                g9.a(th);
            }
        }
    }
}
