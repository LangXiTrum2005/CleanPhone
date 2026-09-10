package com.inmobi.media;

import formularization.attabal;
import formularization.beachfront;
import java.util.LinkedHashMap;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3149pb {
    public final attabal[] a;
    public final LinkedHashMap b;

    public C3149pb() {
        attabal[] attabalVarArr = new attabal[16];
        for (int i = 0; i < 16; i++) {
            attabalVarArr[i] = beachfront.saneness(false, 1, null);
        }
        this.a = attabalVarArr;
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ho hoVar, ContinuationImpl continuationImpl) throws Throwable {
        C3099nb c3099nb;
        attabal attabalVar;
        Function1 function1;
        attabal attabalVar2;
        Object obj;
        String str2;
        if (continuationImpl instanceof C3099nb) {
            c3099nb = (C3099nb) continuationImpl;
            int i = c3099nb.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3099nb.f = i - Integer.MIN_VALUE;
            } else {
                c3099nb = new C3099nb(this, continuationImpl);
            }
        } else {
            c3099nb = new C3099nb(this, continuationImpl);
        }
        Object obj2 = c3099nb.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3099nb.f;
        try {
            if (i2 == 0) {
                dern.saneness(obj2);
                attabalVar = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                c3099nb.a = str;
                c3099nb.b = hoVar;
                c3099nb.c = attabalVar;
                c3099nb.f = 1;
                function1 = hoVar;
                if (attabalVar.attabal(null, c3099nb) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = (attabal) c3099nb.b;
                str2 = c3099nb.a;
                try {
                    dern.saneness(obj2);
                    this.b.put(str2, obj2);
                    obj = obj2;
                    attabalVar = attabalVar2;
                    attabalVar.wireman(null);
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            attabal attabalVar3 = c3099nb.c;
            Function1 function2 = (Function1) c3099nb.b;
            String str3 = c3099nb.a;
            dern.saneness(obj2);
            attabalVar = attabalVar3;
            str = str3;
            function1 = function2;
            obj = this.b.get(str);
            if (obj == null) {
                c3099nb.a = str;
                c3099nb.b = attabalVar;
                c3099nb.c = null;
                c3099nb.f = 2;
                Object objInvoke = function1.invoke(c3099nb);
                if (objInvoke != objBeachfront) {
                    str2 = str;
                    attabalVar2 = attabalVar;
                    obj2 = objInvoke;
                    this.b.put(str2, obj2);
                    obj = obj2;
                    attabalVar = attabalVar2;
                }
                return objBeachfront;
            }
            attabalVar.wireman(null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            attabalVar2 = attabalVar;
            attabalVar2.wireman(null);
            throw th;
        }
    }

    public final String toString() {
        String str = this.b.toString();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        C3124ob c3124ob;
        String str2;
        attabal attabalVar;
        if (continuationImpl instanceof C3124ob) {
            c3124ob = (C3124ob) continuationImpl;
            int i = c3124ob.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3124ob.e = i - Integer.MIN_VALUE;
            } else {
                c3124ob = new C3124ob(this, continuationImpl);
            }
        } else {
            c3124ob = new C3124ob(this, continuationImpl);
        }
        Object obj = c3124ob.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c3124ob.e;
        if (i2 == 0) {
            dern.saneness(obj);
            attabal attabalVar2 = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
            c3124ob.a = str;
            c3124ob.b = attabalVar2;
            c3124ob.e = 1;
            if (attabalVar2.attabal(null, c3124ob) == objBeachfront) {
                return objBeachfront;
            }
            str2 = str;
            attabalVar = attabalVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            attabalVar = c3124ob.b;
            str2 = c3124ob.a;
            dern.saneness(obj);
        }
        try {
            this.b.remove(str2);
            return Unit.f29295attabal;
        } finally {
            attabalVar.wireman(null);
        }
    }
}
