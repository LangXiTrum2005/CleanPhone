package ads_mobile_sdk;

import com.ironsource.C3414a2;
import com.ironsource.X3;

/* JADX INFO: loaded from: classes.dex */
public enum iv0 {
    b("definedByJavaScript"),
    c("unspecified"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(X3.i.r),
    d("beginToRender"),
    e("onePixel"),
    /* JADX INFO: Fake field, exist only in values array */
    EF65("viewable"),
    /* JADX INFO: Fake field, exist only in values array */
    EF75("audible"),
    /* JADX INFO: Fake field, exist only in values array */
    EF85(C3414a2.d);

    public final String a;

    iv0(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
