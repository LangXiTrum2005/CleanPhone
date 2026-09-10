package ads_mobile_sdk;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.libraries.ads.mobile.sdk.initialization.AdapterStatus;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import formularization.beachfront;
import java.util.Map;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.loun;
import svd.AdapterVersionData;

/* JADX INFO: loaded from: classes.dex */
public final class jy0 {
    public final v8 a;
    public final loun b;
    public final formularization.attabal c;
    public final JsonArray d;
    public boolean e;

    public jy0(v8 adapterInitializer, loun traceLogger) {
        Intrinsics.checkNotNullParameter(adapterInitializer, "adapterInitializer");
        Intrinsics.checkNotNullParameter(traceLogger, "traceLogger");
        this.a = adapterInitializer;
        this.b = traceLogger;
        this.c = beachfront.attabal(false);
        this.d = new JsonArray();
    }

    public static JsonObject a(String str, AdapterStatus adapterStatus, AdapterVersionData adapterVersionData) {
        String str2;
        String str3;
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("adapterClassName", str);
        String str4 = "";
        if (adapterVersionData == null || (str2 = adapterVersionData.adapterVersion) == null) {
            str2 = "";
        }
        jsonObject.addProperty("version", str2);
        if (adapterVersionData != null && (str3 = adapterVersionData.sdkVersion) != null) {
            str4 = str3;
        }
        jsonObject.addProperty("sdkVersion", str4);
        jsonObject.addProperty("status", Integer.valueOf(adapterStatus.getInitializationState() == AdapterStatus.InitializationState.COMPLETE ? 1 : 0));
        jsonObject.addProperty(InMobiNetworkValues.DESCRIPTION, adapterStatus.getDescription());
        jsonObject.addProperty("initializationLatencyMillis", Integer.valueOf(adapterStatus.getLatency()));
        jsonObject.addProperty("supportsInitialization", Boolean.valueOf(adapterVersionData != null));
        return jsonObject;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #2 {all -> 0x00a8, blocks: (B:42:0x009e, B:44:0x00a2, B:49:0x00aa, B:50:0x00b8, B:52:0x00be, B:53:0x00d0, B:56:0x00e7, B:57:0x00f1), top: B:80:0x009e, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa A[Catch: all -> 0x00a8, TRY_ENTER, TryCatch #2 {all -> 0x00a8, blocks: (B:42:0x009e, B:44:0x00a2, B:49:0x00aa, B:50:0x00b8, B:52:0x00be, B:53:0x00d0, B:56:0x00e7, B:57:0x00f1), top: B:80:0x009e, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00be A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #2 {all -> 0x00a8, blocks: (B:42:0x009e, B:44:0x00a2, B:49:0x00aa, B:50:0x00b8, B:52:0x00be, B:53:0x00d0, B:56:0x00e7, B:57:0x00f1), top: B:80:0x009e, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(jy0 jy0Var, wretchedly.dern dernVar) {
        iy0 iy0Var;
        formularization.attabal attabalVar;
        Boolean boolAttabal;
        JsonArray jsonArray;
        formularization.attabal attabalVar2;
        jy0 jy0Var2;
        formularization.attabal attabalVar3;
        if (dernVar instanceof iy0) {
            iy0Var = (iy0) dernVar;
            int i = iy0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                iy0Var.e = i - Integer.MIN_VALUE;
            } else {
                iy0Var = new iy0(jy0Var, dernVar);
            }
        } else {
            iy0Var = new iy0(jy0Var, dernVar);
        }
        Object obj = iy0Var.c;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = iy0Var.e;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                attabalVar = jy0Var.c;
                iy0Var.a = jy0Var;
                iy0Var.b = attabalVar;
                iy0Var.e = 1;
                if (attabalVar.attabal(null, iy0Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar4 = iy0Var.b;
                jy0 jy0Var3 = iy0Var.a;
                p002kotlin.dern.saneness(obj);
                attabalVar = attabalVar4;
                jy0Var = jy0Var3;
            } else {
                if (i2 == 2) {
                    jy0Var = iy0Var.a;
                    p002kotlin.dern.saneness(obj);
                    if (((Boolean) obj).booleanValue()) {
                        attabalVar2 = jy0Var.c;
                        iy0Var.a = jy0Var;
                        iy0Var.b = attabalVar2;
                        iy0Var.e = 3;
                        if (attabalVar2.attabal(null, iy0Var) != objBeachfront) {
                            jy0Var2 = jy0Var;
                            attabalVar3 = attabalVar2;
                        }
                        return objBeachfront;
                    }
                    jsonArray = new JsonArray();
                    for (Map.Entry entry : jy0Var.a.a().entrySet()) {
                        String str = (String) entry.getKey();
                        Pair pair = (Pair) entry.getValue();
                        try {
                            jsonArray.add(a(str, (AdapterStatus) pair.getFirst(), (AdapterVersionData) pair.getSecond()));
                        } catch (Exception e) {
                            ((d13) jy0Var.b).a("InspectorAdapterInfo.updateAdapters", e);
                        }
                    }
                    return jsonArray;
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                attabalVar3 = iy0Var.b;
                jy0Var2 = iy0Var.a;
                p002kotlin.dern.saneness(obj);
            }
            try {
                if (jy0Var2.e) {
                    JsonArray jsonArray2 = jy0Var2.d;
                    attabalVar3.wireman(null);
                    return jsonArray2;
                }
                for (Map.Entry entry2 : jy0Var2.a.a().entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Pair pair2 = (Pair) entry2.getValue();
                    try {
                        jy0Var2.d.add(a(str2, (AdapterStatus) pair2.getFirst(), (AdapterVersionData) pair2.getSecond()));
                    } catch (Exception e2) {
                        ((d13) jy0Var2.b).a("InspectorAdapterInfo.updateAdapters", e2);
                    }
                }
                jy0Var2.e = true;
                JsonArray jsonArray3 = jy0Var2.d;
                attabalVar3.wireman(null);
                return jsonArray3;
            } catch (Throwable th) {
                attabalVar3.wireman(null);
                throw th;
            }
            if (jy0Var.e) {
                JsonArray jsonArray4 = jy0Var.d;
                attabalVar.wireman(null);
                return jsonArray4;
            }
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            v8 v8Var = jy0Var.a;
            iy0Var.a = jy0Var;
            iy0Var.b = null;
            iy0Var.e = 2;
            synchronized (v8Var) {
                boolAttabal = igo.attabal.attabal(v8Var.m);
            }
            if (boolAttabal != objBeachfront) {
                obj = boolAttabal;
                if (((Boolean) obj).booleanValue()) {
                    attabalVar2 = jy0Var.c;
                    iy0Var.a = jy0Var;
                    iy0Var.b = attabalVar2;
                    iy0Var.e = 3;
                    if (attabalVar2.attabal(null, iy0Var) != objBeachfront) {
                        jy0Var2 = jy0Var;
                        attabalVar3 = attabalVar2;
                        if (jy0Var2.e) {
                            JsonArray jsonArray5 = jy0Var2.d;
                            attabalVar3.wireman(null);
                            return jsonArray5;
                        }
                        while (r8.hasNext()) {
                            String str3 = (String) entry2.getKey();
                            Pair pair3 = (Pair) entry2.getValue();
                            jy0Var2.d.add(a(str3, (AdapterStatus) pair3.getFirst(), (AdapterVersionData) pair3.getSecond()));
                        }
                        jy0Var2.e = true;
                        JsonArray jsonArray6 = jy0Var2.d;
                        attabalVar3.wireman(null);
                        return jsonArray6;
                    }
                } else {
                    jsonArray = new JsonArray();
                    while (r0.hasNext()) {
                        String str4 = (String) entry.getKey();
                        Pair pair4 = (Pair) entry.getValue();
                        jsonArray.add(a(str4, (AdapterStatus) pair4.getFirst(), (AdapterVersionData) pair4.getSecond()));
                    }
                    return jsonArray;
                }
            }
            return objBeachfront;
        } catch (Throwable th2) {
            attabalVar.wireman(null);
            throw th2;
        }
    }
}
