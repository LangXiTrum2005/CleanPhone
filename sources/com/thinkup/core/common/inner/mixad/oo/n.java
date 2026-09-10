package com.thinkup.core.common.inner.mixad.oo;

import android.support.v4.media.a;
import com.thinkup.core.common.mn.on.o0;
import com.thinkup.core.common.on.oon;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends oon implements Serializable {
    private final int nn;
    private final int o00;
    private boolean o0m;
    private final int o0o;

    public n(com.thinkup.core.common.mn.on.o oVar) {
        oom(oVar.o0());
        nn(oVar.n());
        m(oVar.m() * 1000);
        o00(oVar.o());
        om0(oVar.om());
        oon(oVar.on());
        oo(oVar.nn());
        this.o0o = oVar.mn();
        int iN0 = oVar.n0();
        this.nn = iN0;
        this.o00 = oVar.nm();
        if (oVar instanceof o0) {
            this.o0m = ((o0) oVar).o0o();
        }
        om(String.valueOf(iN0));
        o00o(oVar.o00());
        o(oVar.oo());
    }

    public final boolean nmm() {
        return this.o0o == 1;
    }

    public final int nmn() {
        return this.nn;
    }

    public final int nn0() {
        return this.o00;
    }

    public final boolean nno() {
        return this.o0m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAdSetting{adSourceInterType=");
        sb.append(this.nn);
        sb.append(", adSourceShakeType=");
        sb.append(this.o00);
        sb.append(", nativeRenderingType=");
        sb.append(this.o0o);
        sb.append(", isShowCloseButton=");
        sb.append(this.o0m);
        sb.append(", probabilityForDelayShowCloseButtonInEndCard=");
        sb.append(this.oo);
        sb.append(", MinDelayTimeWhenShowCloseButton=");
        sb.append(this.om);
        sb.append(", MaxDelayTimeWhenShowCloseButton=");
        sb.append(this.on);
        sb.append(", interstitialType='");
        sb.append(this.m0);
        sb.append("', rewardTime=");
        sb.append(this.mo);
        sb.append(", isRewardForPlayFail=");
        sb.append(this.mm);
        sb.append(", closeClickType=");
        sb.append(this.mn);
        sb.append(", splashImageScaleType=");
        sb.append(this.n0);
        sb.append(", impressionMonitorTime=");
        return a.p(sb, this.no, AbstractJsonLexerKt.END_OBJ);
    }
}
