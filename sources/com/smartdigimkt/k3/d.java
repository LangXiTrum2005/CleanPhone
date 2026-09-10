package com.smartdigimkt.k3;

import android.app.Activity;
import android.content.Context;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.w4.a f36180a;

    public interface a {
        void a();

        void b();
    }

    public void a(Context context, f fVar, com.smartdigimkt.v6.a aVar, a aVar2) {
        try {
            Context contextC = c.d().c();
            if ((context instanceof Activity) || contextC == null) {
                contextC = context;
            }
            com.smartdigimkt.w4.a aVar3 = new com.smartdigimkt.w4.a(contextC, h.a(context, "myoffer_feedback_dialog", "style"));
            this.f36180a = aVar3;
            aVar3.a(aVar2, fVar, aVar);
            this.f36180a.show();
        } catch (Throwable th) {
            com.smartdigimkt.i7.d.a("show feedback dialog error", th.getMessage() + ", " + h.a(th.getStackTrace()), com.smartdigimkt.m6.b.p().q());
        }
    }

    public boolean a() {
        com.smartdigimkt.w4.a aVar = this.f36180a;
        return aVar != null && aVar.isShowing();
    }
}
