package ads_mobile_sdk;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ov1 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public h(zu2 zu2Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zu2Var);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
