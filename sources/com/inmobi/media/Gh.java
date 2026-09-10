package com.inmobi.media;

import android.content.Context;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.Gh;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
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

/* JADX INFO: loaded from: classes3.dex */
public final class Gh {
    public final Context a;
    public final long b;
    public final int c;
    public boolean d;
    public final Cb e;
    public final Gi f;
    public final List g;
    public final ConcurrentHashMap h;
    public final AtomicBoolean i;
    public String j;
    public final AtomicInteger k;

    public Gh(Context context, double d, Ab logLevel, long j, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.a = context;
        this.b = j;
        this.c = i;
        this.d = false;
        this.e = new Cb(logLevel);
        this.f = new Gi(d);
        this.g = Collections.synchronizedList(new ArrayList());
        this.h = new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.j = "";
        this.k = new AtomicInteger(0);
    }

    public final void a(Ab logLevel, String tag, String message) throws JSONException {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Db.a;
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", Db.a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        saran saranVar = Sb.a;
        Rb.a(new Eh(this, logLevel, jSONObject, null));
    }

    public final void b() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.getAndSet(true)) {
            saran saranVar = Sb.a;
            Rb.a(new Dh(this, null));
        }
    }

    public final String c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.h) {
            try {
                for (Map.Entry entry : this.h.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.g;
        Intrinsics.checkNotNullExpressionValue(logData, "logData");
        synchronized (logData) {
            try {
                List logData2 = this.g;
                Intrinsics.checkNotNullExpressionValue(logData2, "logData");
                Iterator it = logData2.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONArray;
    }

    public final boolean e() throws JSONException {
        if (this.g.isEmpty() || this.h.isEmpty()) {
            return true;
        }
        String strC = c();
        Intrinsics.checkNotNullParameter(strC, "<this>");
        return Intrinsics.wireman(strC, JsonUtils.EMPTY_JSON);
    }

    public final void b(boolean z) {
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.d = z;
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.h.put(key, value);
    }

    public final void a() {
        Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.get()) {
            saran saranVar = Sb.a;
            Rb.a(new Ch(this, null));
        }
    }

    public final void a(final boolean z) {
        Objects.toString(this.i);
        saran saranVar = Sb.a;
        if (Result.m3354exceptionOrNullimpl(Rb.a(new Function0() { // from class: adsuki.dent
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Gh.a(this.f3407kowloon, z);
            }
        })) != null) {
            try {
                Result.m3351constructorimpl(Unit.f29295attabal);
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                Result.m3351constructorimpl(dern.attabal(th));
            }
        }
    }

    public static final Unit a(Gh gh, boolean z) throws InterruptedException {
        if (gh.e()) {
            return Unit.f29295attabal;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (gh.j.length() == 0) {
            saran saranVar = Sb.a;
            gh.j = Rb.a(gh.a, timeInMillis);
        }
        if (gh.a(gh.j)) {
            taiyuan.saneness(null, new Fh(gh, timeInMillis, z, null), 1, null);
        }
        return Unit.f29295attabal;
    }

    public final boolean a(String str) {
        return Tb.a("RemoteLogger", c(), str);
    }
}
