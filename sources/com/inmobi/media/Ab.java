package com.inmobi.media;

import A.RunnableC0887e;
import A.RunnableC0889f;
import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22696c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2966c7 f22697e;
    public final Pc f;
    public final List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f22698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f22699i;
    public String j;
    public final AtomicInteger k;

    public Ab(Context context, double d, EnumC2932a7 logLevel, long j, int i2, boolean z2) {
        Intrinsics.f(context, "context");
        Intrinsics.f(logLevel, "logLevel");
        this.f22694a = context;
        this.f22695b = j;
        this.f22696c = i2;
        this.d = z2;
        this.f22697e = new C2966c7(logLevel);
        this.f = new Pc(d);
        this.g = androidx.media3.extractor.text.ttml.a.u();
        this.f22698h = new ConcurrentHashMap();
        this.f22699i = new AtomicBoolean(false);
        this.j = "";
        this.k = new AtomicInteger(0);
    }

    public final void a(EnumC2932a7 logLevel, String tag, String message) throws JSONException {
        Intrinsics.f(logLevel, "logLevel");
        Intrinsics.f(tag, "tag");
        Intrinsics.f(message, "message");
        if (this.f22699i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = AbstractC2983d7.f23512a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", AbstractC2983d7.f23512a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        AbstractC3112l7.f23769a.submit(new RunnableC0887e(this, logLevel, jSONObject, 1));
    }

    public final void b() {
        Objects.toString(this.f22699i);
        if ((this.d || this.f.a()) && !this.f22699i.getAndSet(true)) {
            AbstractC3112l7.f23769a.submit(new RunnableC0889f(this, 1));
        }
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.f22698h) {
            for (Map.Entry entry : this.f22698h.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String string = jSONObject.toString();
        Intrinsics.e(string, "toString(...)");
        return string;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.g;
        Intrinsics.e(logData, "logData");
        synchronized (logData) {
            List logData2 = this.g;
            Intrinsics.e(logData2, "logData");
            Iterator it = logData2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
        }
        return jSONArray;
    }

    public static final void b(Ab this$0) {
        Intrinsics.f(this$0, "this$0");
        Objects.toString(this$0.f22699i);
        ScheduledExecutorService scheduledExecutorService = AbstractC3112l7.f23769a;
        Result.a(AbstractC3096k7.a(new C3339zb(this$0, true)));
    }

    public static final void a(Ab this$0, EnumC2932a7 logLevel, JSONObject data) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(logLevel, "$logLevel");
        Intrinsics.f(data, "$data");
        try {
            C2966c7 c2966c7 = this$0.f22697e;
            c2966c7.getClass();
            int iOrdinal = c2966c7.f23484a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            if (logLevel != EnumC2932a7.STATE) {
                                return;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (logLevel != EnumC2932a7.ERROR && logLevel != EnumC2932a7.STATE) {
                        return;
                    }
                } else if (logLevel != EnumC2932a7.DEBUG && logLevel != EnumC2932a7.ERROR && logLevel != EnumC2932a7.STATE) {
                    return;
                }
            }
            this$0.g.add(data);
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
        }
    }

    public final void a() {
        Objects.toString(this.f22699i);
        if ((this.d || this.f.a()) && !this.f22699i.get()) {
            AbstractC3112l7.f23769a.submit(new RunnableC0889f(this, 0));
        }
    }

    public static final void a(Ab this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.k.getAndIncrement();
        Objects.toString(this$0.f22699i);
        ScheduledExecutorService scheduledExecutorService = AbstractC3112l7.f23769a;
        Result.a(AbstractC3096k7.a(new C3339zb(this$0, false)));
    }
}
