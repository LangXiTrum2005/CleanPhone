package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Map;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Il {
    public static final Il a = new Il();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, C3336x c3336x, ArrayList arrayList, ContinuationImpl continuationImpl) throws C3258tl {
        Hl hl;
        C3109nl c3109nl;
        C3258tl e;
        C3109nl c3109nl2;
        if (continuationImpl instanceof Hl) {
            hl = (Hl) continuationImpl;
            int i = hl.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hl.d = i - Integer.MIN_VALUE;
            } else {
                hl = new Hl(this, continuationImpl);
            }
        } else {
            hl = new Hl(this, continuationImpl);
        }
        Object obj = hl.b;
        Object objBeachfront = attabal.beachfront();
        int i2 = hl.d;
        if (i2 == 0) {
            dern.saneness(obj);
            G g = c3336x.b;
            c3109nl = new C3109nl(g);
            Fl fl = new Fl(c3336x.b.a.b.getVastVideo(), c3109nl, c3336x.a.c);
            try {
                Map mapA = AbstractC2983ik.a(g);
                Wj wj = Wj.a;
                Wj.b("VastParseStart", mapA, EnumC2779ak.SDK);
                hl.a = c3109nl;
                try {
                    hl.d = 1;
                    Object objA = fl.a(str, arrayList, hl);
                    if (objA == objBeachfront) {
                        return objBeachfront;
                    }
                    obj = objA;
                    c3109nl2 = c3109nl;
                } catch (C3258tl e2) {
                    e = e2;
                    short s = e.a;
                    Map mapA2 = AbstractC2983ik.a(c3109nl.a);
                    mapA2.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s));
                    Wj wj2 = Wj.a;
                    Wj.b("VastParseFailure", mapA2, EnumC2779ak.SDK);
                    throw e;
                }
            } catch (C3258tl e3) {
                e = e3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3109nl2 = hl.a;
            try {
                dern.saneness(obj);
            } catch (C3258tl e4) {
                e = e4;
                c3109nl = c3109nl2;
                short s2 = e.a;
                Map mapA3 = AbstractC2983ik.a(c3109nl.a);
                mapA3.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s2));
                Wj wj3 = Wj.a;
                Wj.b("VastParseFailure", mapA3, EnumC2779ak.SDK);
                throw e;
            }
        }
        Map mapA4 = AbstractC2983ik.a(c3109nl2.a);
        Wj wj4 = Wj.a;
        Wj.b("VastParseSuccess", mapA4, EnumC2779ak.SDK);
        return obj;
    }
}
