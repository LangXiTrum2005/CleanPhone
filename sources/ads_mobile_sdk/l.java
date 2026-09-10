package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.phonoscope;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final Map a;

    public l(Map actionHandlers) {
        Intrinsics.checkNotNullParameter(actionHandlers, "actionHandlers");
        this.a = actionHandlers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(fm2 fm2Var, wretchedly.dern dernVar) {
        k kVar;
        Iterator it;
        l lVar;
        phonoscope phonoscopeVar;
        if (dernVar instanceof k) {
            kVar = (k) dernVar;
            int i = kVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.e = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, dernVar);
            }
        } else {
            kVar = new k(this, dernVar);
        }
        Object obj = kVar.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = kVar.e;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            it = fm2Var.c.iterator();
            lVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = kVar.b;
            lVar = kVar.a;
            p002kotlin.dern.saneness(obj);
        }
        while (it.hasNext()) {
            dm2 dm2Var = (dm2) it.next();
            JsonObject jsonObject = dm2Var.b;
            if (jsonObject != null && (phonoscopeVar = (phonoscope) lVar.a.get(dm2Var.a)) != null) {
                kVar.a = lVar;
                kVar.b = it;
                kVar.e = 1;
                if (phonoscopeVar.a(jsonObject, kVar) == objBeachfront) {
                    return objBeachfront;
                }
            }
        }
        return Unit.f29295attabal;
    }
}
