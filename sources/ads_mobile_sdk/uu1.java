package ads_mobile_sdk;

import android.view.View;
import java.util.Iterator;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Lambda;
import saneness.glassmaker;

/* JADX INFO: loaded from: classes.dex */
public final class uu1 extends Lambda implements Function0 {
    public final /* synthetic */ d91 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ vk0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu1(d91 d91Var, View view, vk0 vk0Var, String str) {
        super(0);
        this.a = d91Var;
        this.b = view;
        this.c = vk0Var;
        this.d = str;
    }

    @Override // p002kotlin.jvm.functions.Function0
    public final Object invoke() {
        d91 d91Var = this.a;
        View view = this.b;
        vk0 vk0Var = this.c;
        String str = this.d;
        Iterator it = d91Var.e.values().iterator();
        while (it.hasNext()) {
            r4 r4Var = (r4) ((glassmaker) it.next());
            if (!r4Var.f) {
                r4Var.b.a(view, vk0Var, str);
            }
        }
        d91Var.f.a(view, vk0Var, str);
        return Unit.f29295attabal;
    }
}
