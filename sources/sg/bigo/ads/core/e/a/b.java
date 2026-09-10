package sg.bigo.ads.core.e.a;

import android.content.Context;
import java.util.Arrays;
import java.util.Map;
import sg.bigo.ads.api.core.r;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes7.dex */
public class b extends c {
    public b(r rVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4, Map<String, String> map) {
        super(rVar);
        this.f48403b.addAll(Arrays.asList(eVarArr));
        this.f48404c.addAll(Arrays.asList(eVarArr2));
        this.d.addAll(Arrays.asList(eVarArr3));
        this.f48405e.addAll(Arrays.asList(eVarArr4));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public void a(final Context context, final boolean z2) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.b.2
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(context, z2);
            }
        });
    }

    public final void a(Map<String, String> map) {
        if (k.a(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }
}
