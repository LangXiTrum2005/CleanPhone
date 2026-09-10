package ads_mobile_sdk;

import android.util.Base64;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class no {
    public final String a;
    public final mo b;
    public final vp c;

    public no(String rawData, mo chromeVariations, vp vpVar) {
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        Intrinsics.checkNotNullParameter(chromeVariations, "chromeVariations");
        this.a = rawData;
        this.b = chromeVariations;
        this.c = vpVar;
    }

    public final String a() {
        vp vpVar = this.c;
        if (vpVar != null) {
            return Base64.encodeToString(vpVar.a(), 10);
        }
        return null;
    }

    public final mo b() {
        return this.b;
    }

    public final vp c() {
        return this.c;
    }
}
