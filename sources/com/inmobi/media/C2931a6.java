package com.inmobi.media;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.inmobi.media.C2931a6;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2931a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23430a;

    public C2931a6(long j) {
        this.f23430a = j;
    }

    public final void a(final String message, final String exitData, final int i2, final long j) {
        Intrinsics.f(message, "message");
        Intrinsics.f(exitData, "exitData");
        AbstractC3112l7.f23769a.submit(new Runnable() { // from class: A.T
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C2931a6.a(this.X, j, message, i2, exitData);
            }
        });
    }

    public static final void a(C2931a6 this$0, long j, String message, int i2, String exitData) throws JSONException {
        Object objA;
        Object objA2;
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(message, "$message");
        Intrinsics.f(exitData, "$exitData");
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = D5.f22759a;
        ArrayList arrayList2 = new ArrayList();
        Y5 y5 = new Y5();
        ArrayList arrayList3 = new ArrayList();
        Z6 z6D = Nc.d();
        ArrayList arrayListA = T1.a(z6D, "hasLoggerFinished=0", null, null, null, null, Integer.valueOf(T1.a(z6D, null, null, 63)), 30);
        X5 x5 = new X5(y5, arrayList3);
        Intrinsics.f(arrayListA, "<this>");
        Iterator it = CollectionsKt.u(arrayListA).iterator();
        while (it.hasNext()) {
            x5.invoke(it.next());
        }
        B5 b5 = new B5(arrayList2);
        Iterator it2 = CollectionsKt.u(arrayList3).iterator();
        while (it2.hasNext()) {
            b5.invoke(it2.next());
        }
        arrayList.addAll(arrayList2);
        Iterator it3 = arrayList.iterator();
        Intrinsics.e(it3, "iterator(...)");
        while (it3.hasNext()) {
            Object next = it3.next();
            Intrinsics.e(next, "next(...)");
            C2982d6 c2982d6 = (C2982d6) next;
            long j2 = c2982d6.f23511a.f23398c.f23368b;
            if (j >= j2 && j - j2 <= this$0.f23430a) {
                StringBuilder sbZ = android.support.v4.media.a.z("Message - ", message, ", Reason - ", i2, ", Timestamp - ");
                sbZ.append(j);
                sbZ.append(", Data - ");
                sbZ.append(exitData);
                String message2 = sbZ.toString();
                Intrinsics.f(message2, "message");
                try {
                    JSONArray jSONArray = c2982d6.f23511a.f23397b;
                    EnumC2932a7 logLevel = EnumC2932a7.ERROR;
                    SimpleDateFormat simpleDateFormat = AbstractC2983d7.f23512a;
                    Intrinsics.f(logLevel, "logLevel");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scope", "ERROR");
                    jSONObject.put("timestamp", AbstractC2983d7.f23512a.format(new Date()));
                    jSONObject.put("tag", "IncompleteLogFinalizer");
                    jSONObject.put("data", message2);
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
                String value = String.valueOf(i2);
                Intrinsics.f(value, "value");
                try {
                    c2982d6.f23511a.f23396a.put("exitReason", value);
                } catch (Exception unused2) {
                }
                try {
                    JSONObject jSONObject2 = c2982d6.f23511a.f23396a;
                    Intrinsics.f(jSONObject2, "<this>");
                    if (!Intrinsics.a(jSONObject2.toString(), JsonUtils.EMPTY_JSON) && !B2.a(c2982d6.f23511a.f23397b)) {
                        ScheduledExecutorService scheduledExecutorService = AbstractC3112l7.f23769a;
                        AbstractC3096k7.a(new C2965c6(c2982d6));
                    }
                    objA = Unit.f43263a;
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    try {
                        S5.d.a(new C3011f2(thA));
                        try {
                            ScheduledExecutorService scheduledExecutorService2 = AbstractC3112l7.f23769a;
                            objA2 = new Result(AbstractC3096k7.a(new C2948b6(c2982d6)));
                        } catch (Throwable th2) {
                            objA2 = ResultKt.a(th2);
                        }
                        Throwable thA2 = Result.a(objA2);
                        if (thA2 != null) {
                            try {
                                S5.d.a(new C3011f2(thA2));
                            } catch (Throwable th3) {
                                ResultKt.a(th3);
                            }
                        }
                    } catch (Throwable th4) {
                        ResultKt.a(th4);
                    }
                }
            }
        }
    }
}
