package ads_mobile_sdk;

import okhttp3.preprohormone;
import okhttp3.rotuma;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class ft0 extends Lambda implements Function0 {
    public final /* synthetic */ rotuma a;
    public final /* synthetic */ preprohormone b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft0(rotuma rotumaVar, preprohormone preprohormoneVar) {
        super(0);
        this.a = rotumaVar;
        this.b = preprohormoneVar;
    }

    @Override // p002kotlin.jvm.functions.Function0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "HttpClient " + this.a.getConnectionPool().attabal() + " connections after: " + this.b.getUrl().graveside();
    }
}
