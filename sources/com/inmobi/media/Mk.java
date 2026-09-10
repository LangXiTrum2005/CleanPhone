package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import formularization.attabal;
import formularization.beachfront;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Unit;
import p002kotlin.coroutines.jvm.internal.ContinuationImpl;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Mk {
    public static final attabal c = beachfront.saneness(false, 1, null);
    public final Ne a;
    public final LinkedHashSet b;

    public Mk(Ne networkResponse, LinkedHashSet inMobiUnifiedIdInterfaceSet) {
        Intrinsics.checkNotNullParameter(networkResponse, "networkResponse");
        Intrinsics.checkNotNullParameter(inMobiUnifiedIdInterfaceSet, "inMobiUnifiedIdInterfaceSet");
        this.a = networkResponse;
        this.b = inMobiUnifiedIdInterfaceSet;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002d, B:35:0x0087, B:36:0x00a0, B:38:0x00a6, B:40:0x00ae, B:41:0x00b9, B:42:0x00bd, B:24:0x0058, B:28:0x0067, B:31:0x0081, B:45:0x00c8), top: B:50:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(JSONObject jSONObject, ContinuationImpl continuationImpl) {
        Lk lk;
        JSONObject jSONObject2;
        attabal attabalVar;
        JSONObject jSONObject3;
        JSONObject jSONObjectA;
        if (continuationImpl instanceof Lk) {
            lk = (Lk) continuationImpl;
            int i = lk.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                lk.e = i - Integer.MIN_VALUE;
            } else {
                lk = new Lk(this, continuationImpl);
            }
        } else {
            lk = new Lk(this, continuationImpl);
        }
        Object obj = lk.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = lk.e;
        try {
            if (i2 == 0) {
                dern.saneness(obj);
                attabal attabalVar2 = c;
                lk.a = jSONObject;
                lk.b = attabalVar2;
                lk.e = 1;
                if (attabalVar2.attabal(null, lk) != objBeachfront) {
                    jSONObject2 = jSONObject;
                    attabalVar = attabalVar2;
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                attabalVar = lk.b;
                JSONObject jSONObject4 = lk.a;
                dern.saneness(obj);
                jSONObject2 = jSONObject4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar = lk.b;
                JSONObject jSONObject5 = lk.a;
                dern.saneness(obj);
                jSONObject3 = jSONObject5;
            }
            F9.b(Ok.a(jSONObject3, F9.b()));
            jSONObjectA = Ok.a(F9.b());
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.b) {
                if (jSONObjectA == null) {
                    Ok.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                } else {
                    Ok.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                }
            }
            this.b.clear();
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            return unit;
            int iC = this.a.c();
            Y5 y5 = EnumC2765a6.b;
            if (iC != 192 && iC != 0) {
                Jk jk = Jk.a;
                lk.a = jSONObject2;
                lk.b = attabalVar;
                lk.e = 2;
                Object objA = F3.a(Jk.b, new Ek(null), lk);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != objBeachfront) {
                    jSONObject3 = jSONObject2;
                    F9.b(Ok.a(jSONObject3, F9.b()));
                    jSONObjectA = Ok.a(F9.b());
                    while (r0.hasNext()) {
                        if (jSONObjectA == null) {
                            Ok.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                        } else {
                            Ok.a(inMobiUnifiedIdInterface, jSONObjectA, null);
                        }
                    }
                    this.b.clear();
                    Unit unit2 = Unit.f29295attabal;
                    attabalVar.wireman(null);
                    return unit2;
                }
                return objBeachfront;
            }
            Unit unit3 = Unit.f29295attabal;
            attabalVar.wireman(null);
            return unit3;
        } catch (Throwable th) {
            jSONObject.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        Kk kk;
        String str2;
        attabal attabalVar;
        Throwable th;
        attabal attabalVar2;
        String str3;
        if (continuationImpl instanceof Kk) {
            kk = (Kk) continuationImpl;
            int i2 = kk.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kk.f = i2 - Integer.MIN_VALUE;
            } else {
                kk = new Kk(this, continuationImpl);
            }
        } else {
            kk = new Kk(this, continuationImpl);
        }
        Object obj = kk.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i3 = kk.f;
        try {
            if (i3 == 0) {
                dern.saneness(obj);
                attabal attabalVar3 = c;
                kk.b = str;
                kk.c = attabalVar3;
                kk.a = i;
                kk.f = 1;
                if (attabalVar3.attabal(null, kk) != objBeachfront) {
                    str2 = str;
                    attabalVar = attabalVar3;
                }
                return objBeachfront;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar2 = kk.c;
                str3 = kk.b;
                try {
                    dern.saneness(obj);
                    a(str3);
                    Unit unit = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit;
                } catch (Throwable th2) {
                    th = th2;
                    attabalVar2.wireman(null);
                    throw th;
                }
            }
            i = kk.a;
            attabalVar = kk.c;
            str2 = kk.b;
            dern.saneness(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
            Wj wj = Wj.a;
            Wj.b("UnifiedIdNetworkResponseFailure", linkedHashMap, EnumC2779ak.SDK);
            int iC = this.a.c();
            Y5 y5 = EnumC2765a6.b;
            if (iC != 192 && iC != 0) {
                Jk jk = Jk.a;
                kk.b = str2;
                kk.c = attabalVar;
                kk.f = 2;
                Object objA = F3.a(Jk.b, new Ek(null), kk);
                if (objA != p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
                    objA = Unit.f29295attabal;
                }
                if (objA != objBeachfront) {
                    attabalVar2 = attabalVar;
                    str3 = str2;
                    a(str3);
                    Unit unit2 = Unit.f29295attabal;
                    attabalVar2.wireman(null);
                    return unit2;
                }
                return objBeachfront;
            }
            Unit unit3 = Unit.f29295attabal;
            attabalVar.wireman(null);
            return unit3;
        } catch (Throwable th3) {
            attabal attabalVar4 = attabalVar;
            th = th3;
            attabalVar2 = attabalVar4;
            attabalVar2.wireman(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[Catch: all -> 0x0033, JSONException -> 0x0035, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:23:0x005a), top: B:28:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[Catch: all -> 0x0033, JSONException -> 0x0035, LOOP:0: B:17:0x003d->B:19:0x0043, LOOP_END, Merged into TryCatch #0 {all -> 0x0033, JSONException -> 0x0035, blocks: (B:4:0x000d, B:6:0x0013, B:8:0x001d, B:9:0x0023, B:11:0x0029, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:23:0x005a), top: B:28:0x000b }, TRY_LEAVE] */
    public final void a(String str) {
        Iterator it;
        JSONObject jSONObjectA = Ok.a(F9.b());
        try {
            if (jSONObjectA != null) {
                if (jSONObjectA.has("ufids") && jSONObjectA.getJSONArray("ufids").length() > 0) {
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext()) {
                        Ok.a((InMobiUnifiedIdInterface) it2.next(), jSONObjectA, null);
                    }
                } else {
                    it = this.b.iterator();
                    while (it.hasNext()) {
                        Ok.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                    }
                }
            } else {
                it = this.b.iterator();
                while (it.hasNext()) {
                    Ok.a((InMobiUnifiedIdInterface) it.next(), null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } finally {
            this.b.clear();
        }
    }
}
