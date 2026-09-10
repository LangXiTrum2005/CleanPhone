package ads_mobile_sdk;

import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class cy1 implements portwide {
    public final lv1 a;
    public final String b;
    public final jk0 c;
    public final ip0 d;

    public cy1(lv1 omid, String afmaVersion, jk0 flags, ip0 gmaUtil) {
        Intrinsics.checkNotNullParameter(omid, "omid");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        this.a = omid;
        this.b = afmaVersion;
        this.c = flags;
        this.d = gmaUtil;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.OMID;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        String strB;
        String str;
        if (CollectionsKt.permissivist(this.c.Q(), this.a.b()) && this.d.c()) {
            strB = null;
            str = null;
        } else {
            strB = this.a.b();
            str = this.c.S() + this.b;
        }
        return new tn0(new by1(this.a.b(), strB, str));
    }
}
