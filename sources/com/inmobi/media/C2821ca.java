package com.inmobi.media;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.C2821ca;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlinx.coroutines.saran;
import kotlinx.coroutines.taiyuan;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.dern;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2821ca implements Z9 {
    public final W9 a;

    public C2821ca(W9 incompleteLogData) {
        Intrinsics.checkNotNullParameter(incompleteLogData, "incompleteLogData");
        this.a = incompleteLogData;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            JSONArray jSONArray = this.a.b;
            Ab logLevel = Ab.ERROR;
            SimpleDateFormat simpleDateFormat = Db.a;
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put("timestamp", Db.a.format(new Date()));
            jSONObject.put("tag", "IncompleteLogFinalizer");
            jSONObject.put("data", message);
            jSONArray.put(jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void b(String value) {
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        Intrinsics.checkNotNullParameter("exitReason", com.ironsource.X3.i.W);
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.a.a.put("exitReason", value);
        } catch (Exception unused) {
        }
    }

    public final Object b() {
        final String str = "IncompleteLogFinalizer";
        Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", "tag");
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = this.a.a;
            Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            if (!Intrinsics.wireman(jSONObject.toString(), JsonUtils.EMPTY_JSON)) {
                JSONArray jSONArray = this.a.b;
                Intrinsics.checkNotNullParameter(jSONArray, "<this>");
                if (jSONArray.length() != 0) {
                    saran saranVar = Sb.a;
                    Rb.a(new Function0() { // from class: adsuki.pedagogism
                        @Override // p002kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2821ca.a(this.f3581kowloon, str);
                        }
                    });
                }
            }
            return Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m3351constructorimpl(dern.attabal(th));
        }
    }

    public static final Unit a(C2821ca c2821ca, String str) throws JSONException, InterruptedException {
        W9 w9 = c2821ca.a;
        JSONObject jSONObject = w9.a;
        JSONArray jSONArray = w9.b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String string = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Tb.a(str, string, c2821ca.a.c.a);
        String str2 = c2821ca.a.c.a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        C3174qb c3174qb = c2821ca.a.c;
        taiyuan.saneness(null, new C2795ba(new C3174qb(str2, timeInMillis, 0, c3174qb.d, true, c3174qb.f), null), 1, null);
        return Unit.f29295attabal;
    }

    public final Object a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            saran saranVar = Sb.a;
            return Result.m3351constructorimpl(Result.m3350boximpl(Rb.a(new Function0() { // from class: adsuki.ayutthaya
                @Override // p002kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C2821ca.a(this.f3325kowloon);
                }
            })));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m3351constructorimpl(dern.attabal(th));
        }
    }

    public static final Unit a(C2821ca c2821ca) throws InterruptedException {
        Tb.a(c2821ca.a.c.a);
        taiyuan.saneness(null, new C2769aa(c2821ca, null), 1, null);
        return Unit.f29295attabal;
    }
}
