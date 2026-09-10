package ads_mobile_sdk;

import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class vp2 implements portwide {
    public final py a;
    public final adjudge.saneness b;
    public final List c;
    public final boolean d;
    public final List e;

    public vp2(jk0 flags, py cryptoUtil, adjudge.saneness signalRequest) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(cryptoUtil, "cryptoUtil");
        Intrinsics.checkNotNullParameter(signalRequest, "signalRequest");
        this.a = cryptoUtil;
        this.b = signalRequest;
        this.c = flags.F();
        this.d = flags.e0();
        this.e = flags.B();
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AD_RESPONSE_ENCRYPTION_KEY;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        if (!(this.d ? this.e : this.c).contains(String.valueOf(this.b.getF3279impassible().getNumber()))) {
            return new tn0(new up2(null));
        }
        spartacist spartacistVarB = this.a.b();
        if (spartacistVarB instanceof nn0) {
            return (nn0) spartacistVarB;
        }
        Intrinsics.competently(spartacistVarB, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Success<T of com.google.android.libraries.ads.mobile.sdk.internal.util.GmaResult.Companion.returnIfError>");
        return new tn0(new up2((String) ((tn0) spartacistVarB).b));
    }
}
