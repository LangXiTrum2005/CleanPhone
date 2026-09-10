package ads_mobile_sdk;

import com.google.common.util.concurrent.adultoid;
import com.google.common.util.concurrent.arytenoidectomy;
import com.google.common.util.concurrent.impromptu;
import saneness.glutethimide;

/* JADX INFO: loaded from: classes.dex */
public final class ht2 implements impromptu {
    public final /* synthetic */ it2 a;

    public ht2(it2 it2Var) {
        this.a = it2Var;
    }

    @Override // com.google.common.util.concurrent.impromptu
    public final adultoid apply(Object obj) {
        glutethimide glutethimideVar = (glutethimide) obj;
        if (glutethimideVar != null) {
            return arytenoidectomy.impromptu(glutethimideVar);
        }
        this.a.e.b(gf0.EVENT_ID_INIT_FALLBACK_TO_DEFAULT_COLLECTOR);
        it2 it2Var = this.a;
        return it2Var.a(it2Var.f);
    }
}
