package ads_mobile_sdk;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.gson.JsonObject;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.evenfall;
import saneness.spartacist;
import saneness.stupefactive;

/* JADX INFO: loaded from: classes.dex */
public final class zj0 {
    public final Context a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final qc0 g;
    public final stupefactive h;
    public final ri2 i;
    public final sj0 j;
    public final lv1 k;

    public zj0(Context applicationContext, int i, String afmaVersion, String gmaVersion, int i2, String applicationId, qc0 deviceProperties, stupefactive flagValueProvider, ri2 rootTraceCreator, sj0 flagDataStore, lv1 omid) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(deviceProperties, "deviceProperties");
        Intrinsics.checkNotNullParameter(flagValueProvider, "flagValueProvider");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(flagDataStore, "flagDataStore");
        Intrinsics.checkNotNullParameter(omid, "omid");
        this.a = applicationContext;
        this.b = i;
        this.c = afmaVersion;
        this.d = gmaVersion;
        this.e = i2;
        this.f = applicationId;
        this.g = deviceProperties;
        this.h = flagValueProvider;
        this.i = rootTraceCreator;
        this.j = flagDataStore;
        this.k = omid;
    }

    public final JsonObject a(JsonObject consentStrings) {
        Intrinsics.checkNotNullParameter(consentStrings, "consentStrings");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pn", this.a.getPackageName());
        jsonObject.addProperty("vc", Integer.valueOf(this.e));
        jsonObject.addProperty(dm.LANGUAGE_CODE.b(), Locale.getDefault().getLanguage());
        jsonObject.addProperty(dm.GEO_COUNTRY.b(), Locale.getDefault().getCountry());
        jsonObject.addProperty("app_id", this.f);
        jsonObject.addProperty("js", this.c);
        jsonObject.addProperty("mf", Boolean.FALSE);
        jsonObject.addProperty("mv", (String) this.g.i.getValue());
        jsonObject.addProperty("is_decagon", Boolean.TRUE);
        jsonObject.addProperty("sdk_version", this.d);
        jsonObject.addProperty("dynamite_version", Integer.valueOf(this.b));
        jsonObject.addProperty("package_name", this.a.getPackageName());
        jsonObject.addProperty("omid_v", this.k.b());
        jsonObject.add("shared_pref", consentStrings);
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        jsonObject.addProperty(dm.SCREEN_WIDTH.b(), Integer.valueOf(pastie.dern.wireman(i / f)));
        jsonObject.addProperty(dm.SCREEN_HEIGHT.b(), Integer.valueOf(pastie.dern.wireman(i2 / f)));
        return jsonObject;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01de A[Catch: all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01e2 A[Catch: all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e6 A[Catch: all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ec A[Catch: all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01f4 A[Catch: all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0237 A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #11 {all -> 0x0294, blocks: (B:121:0x0231, B:123:0x0237, B:124:0x0239, B:126:0x0245, B:129:0x024c, B:143:0x02a6, B:145:0x02aa), top: B:196:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0245 A[Catch: all -> 0x0294, Exception -> 0x0296, TRY_LEAVE, TryCatch #7 {Exception -> 0x0296, blocks: (B:124:0x0239, B:126:0x0245, B:129:0x024c), top: B:190:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x024c A[Catch: all -> 0x0294, Exception -> 0x0296, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0296, blocks: (B:124:0x0239, B:126:0x0245, B:129:0x024c), top: B:190:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x026d  */
    /* JADX WARN: Code duplicated, block: B:143:0x02a6 A[Catch: all -> 0x0294, TRY_ENTER, TryCatch #11 {all -> 0x0294, blocks: (B:121:0x0231, B:123:0x0237, B:124:0x0239, B:126:0x0245, B:129:0x024c, B:143:0x02a6, B:145:0x02aa), top: B:196:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x02aa A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #11 {all -> 0x0294, blocks: (B:121:0x0231, B:123:0x0237, B:124:0x0239, B:126:0x0245, B:129:0x024c, B:143:0x02a6, B:145:0x02aa), top: B:196:0x0231 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x02cc A[Catch: all -> 0x02dc, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02d3 A[Catch: all -> 0x02dc, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x02d7 A[Catch: all -> 0x02dc, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02db A[Catch: all -> 0x02dc, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x02df A[Catch: all -> 0x02dc, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e5 A[Catch: all -> 0x02dc, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x02ed A[Catch: all -> 0x02dc, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02f5 A[Catch: all -> 0x02dc, TRY_LEAVE, TryCatch #17 {all -> 0x02dc, blocks: (B:156:0x02c5, B:158:0x02cc, B:160:0x02d3, B:162:0x02d7, B:164:0x02db, B:167:0x02df, B:168:0x02e4, B:169:0x02e5, B:170:0x02ec, B:171:0x02ed, B:172:0x02f4, B:173:0x02f5), top: B:204:0x02c5 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0136 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #8 {all -> 0x014b, blocks: (B:47:0x0130, B:49:0x0136, B:50:0x0138, B:52:0x013c, B:55:0x0144, B:60:0x0150, B:62:0x015a, B:65:0x0165, B:80:0x01ad, B:82:0x01b1), top: B:191:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0144 A[Catch: all -> 0x014b, Exception -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x014b, blocks: (B:47:0x0130, B:49:0x0136, B:50:0x0138, B:52:0x013c, B:55:0x0144, B:60:0x0150, B:62:0x015a, B:65:0x0165, B:80:0x01ad, B:82:0x01b1), top: B:191:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0150 A[Catch: all -> 0x014b, Exception -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x014b, blocks: (B:47:0x0130, B:49:0x0136, B:50:0x0138, B:52:0x013c, B:55:0x0144, B:60:0x0150, B:62:0x015a, B:65:0x0165, B:80:0x01ad, B:82:0x01b1), top: B:191:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ad A[Catch: all -> 0x014b, TRY_ENTER, TryCatch #8 {all -> 0x014b, blocks: (B:47:0x0130, B:49:0x0136, B:50:0x0138, B:52:0x013c, B:55:0x0144, B:60:0x0150, B:62:0x015a, B:65:0x0165, B:80:0x01ad, B:82:0x01b1), top: B:191:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b1 A[Catch: all -> 0x014b, TRY_LEAVE, TryCatch #8 {all -> 0x014b, blocks: (B:47:0x0130, B:49:0x0136, B:50:0x0138, B:52:0x013c, B:55:0x0144, B:60:0x0150, B:62:0x015a, B:65:0x0165, B:80:0x01ad, B:82:0x01b1), top: B:191:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d3 A[Catch: all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01da A[Catch: all -> 0x01e3, TryCatch #1 {all -> 0x01e3, blocks: (B:94:0x01cc, B:96:0x01d3, B:98:0x01da, B:100:0x01de, B:102:0x01e2, B:105:0x01e6, B:106:0x01eb, B:107:0x01ec, B:108:0x01f3, B:109:0x01f4, B:110:0x01fb, B:111:0x01fc), top: B:180:0x01cc }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v40, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v34, types: [ads_mobile_sdk.w03] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    public static Object a(zj0 zj0Var, e51 e51Var, JsonObject jsonObject, wretchedly.dern dernVar) {
        yj0 yj0Var;
        String str;
        String str2;
        Closeable closeableA;
        Closeable closeable;
        ?? r2;
        Object objA;
        ?? r10;
        w03 w03VarA;
        Closeable closeable2;
        w03 w03Var;
        Closeable closeable3;
        spartacist spartacistVar;
        Closeable closeable4;
        w03 w03Var2;
        y13 y13Var;
        JsonObject jsonObject2;
        mv mvVarA;
        sj0 sj0Var;
        boolean z;
        zj0 zj0Var2;
        mv newConsentState;
        JsonObject newFlagData;
        y13 y13Var2;
        spartacist spartacistVar2;
        Closeable closeable5;
        ?? r6;
        y13 y13Var3;
        ?? r7;
        JsonObject jsonObject3;
        mv mvVarA2;
        sj0 sj0Var2;
        boolean z2;
        zj0 zj0Var3;
        mv newConsentState2;
        JsonObject newFlagData2;
        y13 y13Var4;
        zj0 zj0Var4 = zj0Var;
        e51 e51Var2 = e51Var;
        JsonObject jsonObject4 = jsonObject;
        if (dernVar instanceof yj0) {
            yj0Var = (yj0) dernVar;
            int i = yj0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                yj0Var.i = i - Integer.MIN_VALUE;
            } else {
                yj0Var = new yj0(zj0Var4, dernVar);
            }
        } else {
            yj0Var = new yj0(zj0Var4, dernVar);
        }
        Object obj = yj0Var.g;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = yj0Var.i;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            ri2 ri2Var = zj0Var4.i;
            no0 no0Var = no0.CUI_NAME_UPDATE_FLAGS;
            List listFormularize = adultoid.formularize();
            str = "exception";
            l13 l13Var = new l13(new xb2(), new j71(), new le2(), new o6());
            if (j13.b().a == null) {
                w03VarA = ri2.a(ri2Var, no0Var, listFormularize, l13Var);
                try {
                    JsonObject jsonObjectA = zj0Var4.a(jsonObject4);
                    yj0Var.a = zj0Var4;
                    yj0Var.b = e51Var2;
                    yj0Var.c = jsonObject4;
                    yj0Var.d = w03VarA;
                    yj0Var.e = w03VarA;
                    yj0Var.i = 1;
                    e51Var2.getClass();
                    String string = jsonObjectA.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    Object objA2 = e51Var2.a("google.afma.sdkConstants.getSdkConstants", string, yj0Var);
                    if (objA2 != objBeachfront) {
                        w03Var = w03VarA;
                        obj = objA2;
                        closeable3 = w03Var;
                        spartacistVar = (spartacist) obj;
                        if (spartacistVar instanceof tn0) {
                            y13Var = y13.a;
                            jsonObject2 = (JsonObject) ((tn0) spartacistVar).b;
                            mvVarA = rv0.a(jsonObject2, jsonObject4);
                            if (mvVarA == null) {
                                Unit unit = Unit.f29295attabal;
                                interaction.saneness.attabal(closeable3, null);
                                return unit;
                            }
                            sj0Var = zj0Var4.j;
                            z = !e51Var2.d;
                            yj0Var.a = zj0Var4;
                            yj0Var.b = w03Var;
                            yj0Var.c = closeable3;
                            yj0Var.d = y13Var;
                            yj0Var.e = jsonObject2;
                            yj0Var.f = mvVarA;
                            yj0Var.i = 2;
                            sj0Var.getClass();
                            if (sj0.a(sj0Var, mvVarA, jsonObject2, z, yj0Var) != objBeachfront) {
                                zj0Var2 = zj0Var4;
                                newConsentState = mvVarA;
                                newFlagData = jsonObject2;
                                closeable4 = closeable3;
                                w03Var2 = w03Var;
                                y13Var2 = y13Var;
                                ik ikVar = (ik) zj0Var2.h;
                                ikVar.getClass();
                                Intrinsics.checkNotNullParameter(newFlagData, "newFlagData");
                                Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
                                Intrinsics.checkNotNullParameter(newFlagData, "<set-?>");
                                ikVar.h = newFlagData;
                                Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
                                ikVar.i.set(newConsentState);
                                ikVar.a();
                            }
                        } else {
                            if (spartacistVar instanceof nn0) {
                                y13.a((nn0) spartacistVar, false);
                            }
                            closeable4 = closeable3;
                            w03Var2 = w03Var;
                        }
                        Unit unit2 = Unit.f29295attabal;
                        interaction.saneness.attabal(closeable4, null);
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable2 = w03VarA;
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        w03VarA.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            } else {
                str2 = str;
                closeableA = j13.a(no0Var, adultoid.formularize(), true);
                try {
                    JsonObject jsonObjectA2 = zj0Var4.a(jsonObject4);
                    yj0Var.a = zj0Var4;
                    yj0Var.b = e51Var2;
                    yj0Var.c = jsonObject4;
                    yj0Var.d = closeableA;
                    yj0Var.e = closeableA;
                    yj0Var.i = 3;
                    e51Var2.getClass();
                    String string2 = jsonObjectA2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    objA = e51Var2.a("google.afma.sdkConstants.getSdkConstants", string2, yj0Var);
                    if (objA != objBeachfront) {
                        r10 = closeableA;
                        spartacistVar2 = (spartacist) objA;
                        if (spartacistVar2 instanceof tn0) {
                            y13Var3 = y13.a;
                            jsonObject3 = (JsonObject) ((tn0) spartacistVar2).b;
                            mvVarA2 = rv0.a(jsonObject3, jsonObject4);
                            if (mvVarA2 == null) {
                                Unit unit3 = Unit.f29295attabal;
                                interaction.saneness.attabal(closeableA, null);
                                return unit3;
                            }
                            sj0Var2 = zj0Var4.j;
                            z2 = !e51Var2.d;
                            yj0Var.a = zj0Var4;
                            yj0Var.b = r10;
                            yj0Var.c = closeableA;
                            yj0Var.d = y13Var3;
                            yj0Var.e = jsonObject3;
                            yj0Var.f = mvVarA2;
                            yj0Var.i = 4;
                            sj0Var2.getClass();
                            if (sj0.a(sj0Var2, mvVarA2, jsonObject3, z2, yj0Var) != objBeachfront) {
                                zj0Var3 = zj0Var4;
                                newConsentState2 = mvVarA2;
                                closeable5 = closeableA;
                                newFlagData2 = jsonObject3;
                                r6 = r10;
                                y13Var4 = y13Var3;
                                ik ikVar2 = (ik) zj0Var3.h;
                                ikVar2.getClass();
                                Intrinsics.checkNotNullParameter(newFlagData2, "newFlagData");
                                Intrinsics.checkNotNullParameter(newConsentState2, "newConsentState");
                                Intrinsics.checkNotNullParameter(newFlagData2, "<set-?>");
                                ikVar2.h = newFlagData2;
                                Intrinsics.checkNotNullParameter(newConsentState2, "newConsentState");
                                ikVar2.i.set(newConsentState2);
                                ikVar2.a();
                                r6 = r6;
                            }
                        } else {
                            if (spartacistVar2 instanceof nn0) {
                                y13.a((nn0) spartacistVar2, false);
                            }
                            closeable5 = closeableA;
                            r6 = r10;
                        }
                        Unit unit4 = Unit.f29295attabal;
                        interaction.saneness.attabal(closeable5, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    closeable = closeableA;
                    r2 = closeable;
                    r2.b(th);
                    if (!(th instanceof evenfall)) {
                        r2.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            closeable2 = (Closeable) yj0Var.e;
            w03 w03Var3 = (w03) yj0Var.d;
            JsonObject jsonObject5 = (JsonObject) yj0Var.c;
            e51 e51Var3 = (e51) yj0Var.b;
            zj0 zj0Var5 = yj0Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                closeable3 = closeable2;
                e51Var2 = e51Var3;
                str = "exception";
                w03Var = w03Var3;
                jsonObject4 = jsonObject5;
                zj0Var4 = zj0Var5;
                try {
                    spartacistVar = (spartacist) obj;
                    try {
                        if (spartacistVar instanceof tn0) {
                            y13Var = y13.a;
                            try {
                                jsonObject2 = (JsonObject) ((tn0) spartacistVar).b;
                                mvVarA = rv0.a(jsonObject2, jsonObject4);
                                if (mvVarA == null) {
                                    Unit unit5 = Unit.f29295attabal;
                                    interaction.saneness.attabal(closeable3, null);
                                    return unit5;
                                }
                                sj0Var = zj0Var4.j;
                                z = !e51Var2.d;
                                yj0Var.a = zj0Var4;
                                yj0Var.b = w03Var;
                                yj0Var.c = closeable3;
                                yj0Var.d = y13Var;
                                yj0Var.e = jsonObject2;
                                yj0Var.f = mvVarA;
                                yj0Var.i = 2;
                                sj0Var.getClass();
                                if (sj0.a(sj0Var, mvVarA, jsonObject2, z, yj0Var) != objBeachfront) {
                                    zj0Var2 = zj0Var4;
                                    newConsentState = mvVarA;
                                    newFlagData = jsonObject2;
                                    closeable4 = closeable3;
                                    w03Var2 = w03Var;
                                    y13Var2 = y13Var;
                                    ik ikVar3 = (ik) zj0Var2.h;
                                    ikVar3.getClass();
                                    Intrinsics.checkNotNullParameter(newFlagData, "newFlagData");
                                    Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
                                    Intrinsics.checkNotNullParameter(newFlagData, "<set-?>");
                                    ikVar3.h = newFlagData;
                                    Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
                                    ikVar3.i.set(newConsentState);
                                    ikVar3.a();
                                }
                                return objBeachfront;
                            } catch (Exception e) {
                                e = e;
                                closeable4 = closeable3;
                                w03Var2 = w03Var;
                                y13Var.getClass();
                                Intrinsics.checkNotNullParameter(e, str);
                                y13.a(true, null, e, false);
                            }
                        } else {
                            if (spartacistVar instanceof nn0) {
                                y13.a((nn0) spartacistVar, false);
                            }
                            closeable4 = closeable3;
                            w03Var2 = w03Var;
                        }
                        Unit unit6 = Unit.f29295attabal;
                        interaction.saneness.attabal(closeable4, null);
                    } catch (Throwable th3) {
                        th = th3;
                        closeable2 = closeable3;
                        w03VarA = w03Var;
                        w03VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            w03VarA.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    closeable2 = closeable3;
                    w03Var3 = w03Var;
                    w03VarA = w03Var3;
                    w03VarA.b(th);
                    if (!(th instanceof evenfall)) {
                        w03VarA.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                w03VarA = w03Var3;
                w03VarA.b(th);
                if (!(th instanceof evenfall)) {
                    w03VarA.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            }
        } else if (i2 == 2) {
            newConsentState = yj0Var.f;
            newFlagData = (JsonObject) yj0Var.e;
            y13Var2 = (y13) yj0Var.d;
            closeable4 = (Closeable) yj0Var.c;
            w03Var2 = (w03) yj0Var.b;
            zj0Var2 = yj0Var.a;
            try {
                try {
                    p002kotlin.dern.saneness(obj);
                    str = "exception";
                    try {
                        ik ikVar4 = (ik) zj0Var2.h;
                        ikVar4.getClass();
                        Intrinsics.checkNotNullParameter(newFlagData, "newFlagData");
                        Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
                        Intrinsics.checkNotNullParameter(newFlagData, "<set-?>");
                        ikVar4.h = newFlagData;
                        Intrinsics.checkNotNullParameter(newConsentState, "newConsentState");
                        ikVar4.i.set(newConsentState);
                        ikVar4.a();
                    } catch (Exception e2) {
                        e = e2;
                        y13Var = y13Var2;
                        y13Var.getClass();
                        Intrinsics.checkNotNullParameter(e, str);
                        y13.a(true, null, e, false);
                    }
                } catch (Throwable th6) {
                    th = th6;
                    closeable2 = closeable4;
                    w03VarA = w03Var2;
                    try {
                        w03VarA.b(th);
                        if (!(th instanceof evenfall)) {
                            w03VarA.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            interaction.saneness.attabal(closeable2, th7);
                            throw th8;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                str = "exception";
                y13Var = y13Var2;
                y13Var.getClass();
                Intrinsics.checkNotNullParameter(e, str);
                y13.a(true, null, e, false);
                Unit unit7 = Unit.f29295attabal;
                interaction.saneness.attabal(closeable4, null);
                return Unit.f29295attabal;
            }
            Unit unit8 = Unit.f29295attabal;
            interaction.saneness.attabal(closeable4, null);
        } else if (i2 == 3) {
            closeable = (Closeable) yj0Var.e;
            r2 = (w03) yj0Var.d;
            JsonObject jsonObject6 = (JsonObject) yj0Var.c;
            e51 e51Var4 = (e51) yj0Var.b;
            zj0 zj0Var6 = yj0Var.a;
            try {
                p002kotlin.dern.saneness(obj);
                closeableA = closeable;
                e51Var2 = e51Var4;
                objA = obj;
                str2 = "exception";
                r10 = r2;
                jsonObject4 = jsonObject6;
                zj0Var4 = zj0Var6;
                try {
                    spartacistVar2 = (spartacist) objA;
                    if (spartacistVar2 instanceof tn0) {
                        y13Var3 = y13.a;
                        try {
                            jsonObject3 = (JsonObject) ((tn0) spartacistVar2).b;
                            mvVarA2 = rv0.a(jsonObject3, jsonObject4);
                            if (mvVarA2 == null) {
                                Unit unit9 = Unit.f29295attabal;
                                interaction.saneness.attabal(closeableA, null);
                                return unit9;
                            }
                            sj0Var2 = zj0Var4.j;
                            z2 = !e51Var2.d;
                            yj0Var.a = zj0Var4;
                            yj0Var.b = r10;
                            yj0Var.c = closeableA;
                            yj0Var.d = y13Var3;
                            yj0Var.e = jsonObject3;
                            yj0Var.f = mvVarA2;
                            yj0Var.i = 4;
                            sj0Var2.getClass();
                            if (sj0.a(sj0Var2, mvVarA2, jsonObject3, z2, yj0Var) != objBeachfront) {
                                zj0Var3 = zj0Var4;
                                newConsentState2 = mvVarA2;
                                closeable5 = closeableA;
                                newFlagData2 = jsonObject3;
                                r6 = r10;
                                y13Var4 = y13Var3;
                                ik ikVar5 = (ik) zj0Var3.h;
                                ikVar5.getClass();
                                Intrinsics.checkNotNullParameter(newFlagData2, "newFlagData");
                                Intrinsics.checkNotNullParameter(newConsentState2, "newConsentState");
                                Intrinsics.checkNotNullParameter(newFlagData2, "<set-?>");
                                ikVar5.h = newFlagData2;
                                Intrinsics.checkNotNullParameter(newConsentState2, "newConsentState");
                                ikVar5.i.set(newConsentState2);
                                ikVar5.a();
                                r6 = r6;
                            }
                            return objBeachfront;
                        } catch (Exception e4) {
                            e = e4;
                            closeable5 = closeableA;
                            r7 = r10;
                            y13Var3.getClass();
                            Intrinsics.checkNotNullParameter(e, str2);
                            y13.a(true, null, e, false);
                            r6 = r7;
                        }
                    } else {
                        if (spartacistVar2 instanceof nn0) {
                            y13.a((nn0) spartacistVar2, false);
                        }
                        closeable5 = closeableA;
                        r6 = r10;
                    }
                    Unit unit10 = Unit.f29295attabal;
                    interaction.saneness.attabal(closeable5, null);
                } catch (Throwable th9) {
                    th = th9;
                    closeable = closeableA;
                    r2 = r10;
                    r2.b(th);
                    if (!(th instanceof evenfall)) {
                        r2.a(th);
                        if (!(th instanceof TimeoutCancellationException)) {
                            if (!(th instanceof CancellationException)) {
                                if (th instanceof yn0) {
                                    throw th;
                                }
                                throw new gn0(th);
                            }
                            throw new bn0(th);
                        }
                        throw new cp0(th);
                    }
                    throw th;
                }
            } catch (Throwable th10) {
                th = th10;
                r2.b(th);
                if (!(th instanceof evenfall)) {
                    r2.a(th);
                    if (!(th instanceof TimeoutCancellationException)) {
                        if (!(th instanceof CancellationException)) {
                            if (th instanceof yn0) {
                                throw th;
                            }
                            throw new gn0(th);
                        }
                        throw new bn0(th);
                    }
                    throw new cp0(th);
                }
                throw th;
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            newConsentState2 = yj0Var.f;
            newFlagData2 = (JsonObject) yj0Var.e;
            y13Var4 = (y13) yj0Var.d;
            closeable5 = (Closeable) yj0Var.c;
            r6 = (w03) yj0Var.b;
            zj0Var3 = yj0Var.a;
            try {
                try {
                    p002kotlin.dern.saneness(obj);
                    str2 = "exception";
                    r6 = r6;
                    try {
                        ik ikVar6 = (ik) zj0Var3.h;
                        ikVar6.getClass();
                        Intrinsics.checkNotNullParameter(newFlagData2, "newFlagData");
                        Intrinsics.checkNotNullParameter(newConsentState2, "newConsentState");
                        Intrinsics.checkNotNullParameter(newFlagData2, "<set-?>");
                        ikVar6.h = newFlagData2;
                        Intrinsics.checkNotNullParameter(newConsentState2, "newConsentState");
                        ikVar6.i.set(newConsentState2);
                        ikVar6.a();
                        r6 = r6;
                    } catch (Exception e5) {
                        e = e5;
                        y13Var3 = y13Var4;
                        r7 = r6;
                        y13Var3.getClass();
                        Intrinsics.checkNotNullParameter(e, str2);
                        y13.a(true, null, e, false);
                        r6 = r7;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    closeable = closeable5;
                    r2 = r6;
                    try {
                        r2.b(th);
                        if (!(th instanceof evenfall)) {
                            r2.a(th);
                            if (!(th instanceof TimeoutCancellationException)) {
                                if (!(th instanceof CancellationException)) {
                                    if (th instanceof yn0) {
                                        throw th;
                                    }
                                    throw new gn0(th);
                                }
                                throw new bn0(th);
                            }
                            throw new cp0(th);
                        }
                        throw th;
                    } catch (Throwable th12) {
                        try {
                            throw th12;
                        } catch (Throwable th13) {
                            interaction.saneness.attabal(closeable, th12);
                            throw th13;
                        }
                    }
                }
            } catch (Exception e6) {
                e = e6;
                str2 = "exception";
                y13Var3 = y13Var4;
                r7 = r6;
                y13Var3.getClass();
                Intrinsics.checkNotNullParameter(e, str2);
                y13.a(true, null, e, false);
                r6 = r7;
                Unit unit11 = Unit.f29295attabal;
                interaction.saneness.attabal(closeable5, null);
                return Unit.f29295attabal;
            }
            Unit unit12 = Unit.f29295attabal;
            interaction.saneness.attabal(closeable5, null);
        }
        return Unit.f29295attabal;
    }
}
