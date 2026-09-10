package t7;

import cc.a2;
import java.util.Iterator;
import java.util.List;
import l7.e0;
import l7.w;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f50558b;

    public /* synthetic */ b(List list, int i10) {
        this.f50557a = i10;
        this.f50558b = list;
    }

    @Override // l7.w
    public final void a(e0 e0Var) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i10 = this.f50557a;
        List list = this.f50558b;
        switch (i10) {
            case 0:
                if (!v7.a.b(c.class)) {
                    try {
                        if (e0Var.f45111c == null && (jSONObject2 = e0Var.f45112d) != null && jSONObject2.getBoolean("success")) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                a2.j(((s7.c) it.next()).f50203a);
                            }
                            break;
                        }
                    } catch (JSONException unused) {
                        return;
                    } catch (Throwable th2) {
                        v7.a.a(c.class, th2);
                    }
                }
                break;
            default:
                try {
                    if (e0Var.f45111c == null && (jSONObject = e0Var.f45112d) != null && jSONObject.getBoolean("success")) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            a2.j(((s7.c) it2.next()).f50203a);
                        }
                        break;
                    }
                } catch (JSONException unused2) {
                    return;
                }
                break;
        }
    }
}
