package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.ironsource.X3;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.grout;

/* JADX INFO: loaded from: classes.dex */
public final class xl2 extends hv2 {
    public final String d;
    public final jk0 e;
    public final Context f;
    public final ip0 g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl2(String afmaVersion, jk0 flags, Context context, ip0 gmaUtil, String gmaVersion) {
        super(no0.CUI_NAME_SDKINIT_INIT_ENVIRONMENT_SIGNAL);
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        this.d = afmaVersion;
        this.e = flags;
        this.f = context;
        this.g = gmaUtil;
        this.h = gmaVersion;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.SDK_ENV;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        ApplicationInfo applicationInfo = this.f.getApplicationInfo();
        int i = applicationInfo != null ? applicationInfo.targetSdkVersion : 0;
        String str = this.d;
        jk0 jk0Var = this.e;
        grout.attabal(jk0Var, "gads:sdk_core_constants:caps", X3.i.W, "", "defaultValue");
        String str2 = (String) jk0Var.a("gads:sdk_core_constants:caps", "", zk.o);
        String str3 = this.h;
        boolean zC = this.g.c();
        this.g.getClass();
        int iMyUid = Process.myUid();
        return new tn0(new wl2(str, str2, i, str3, zC, iMyUid == 0 || iMyUid == 1000 || iMyUid == 1001 || iMyUid == 1002 || iMyUid == 1027));
    }
}
