package com.inmobi.media;

import com.inmobi.media.AbstractC3094n6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import org.json.JSONObject;
import p002kotlin.collections.polder;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.saneness;
import patroclinal.formularize;
import patroclinal.taiyuan;

/* JADX INFO: renamed from: com.inmobi.media.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3094n6 {
    public static final taiyuan a = saneness.saneness(new Function0() { // from class: adsuki.denizen
        @Override // p002kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3094n6.a();
        }
    });

    public static final saran a() {
        Intrinsics.checkNotNullExpressionValue("n6", "TAG");
        Intrinsics.checkNotNullParameter("n6", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("n6", false));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return privatdozent.attabal(preterite.dern(executorServiceNewSingleThreadExecutor));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0090  */
    public static void a(C2868e6 eventPayload, String url, int i, int i2, long j, Ak ak, C3044l6 c3044l6, boolean z) throws InterruptedException {
        long jPow;
        Intrinsics.checkNotNullExpressionValue("n6", "TAG");
        if (Re.a() != null || !Ji.d.get()) {
            Intrinsics.checkNotNullExpressionValue("n6", "TAG");
            c3044l6.getClass();
            Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
            String TAG = c3044l6.e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            kotlinx.coroutines.taiyuan.saneness(null, new C2945h6(eventPayload, false, c3044l6, null), 1, null);
            c3044l6.a(System.currentTimeMillis());
            if (c3044l6.d != null) {
                ArrayList eventIds = eventPayload.a;
                Intrinsics.checkNotNullParameter(eventIds, "eventIds");
                Integer num = AbstractC2805bk.c;
                if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                    AbstractC2805bk.c = null;
                }
            }
            c3044l6.f.set(false);
            return;
        }
        if (url != null) {
            String payload = eventPayload.b;
            int i3 = i - i2;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            HashMap mapApical = seminary.apical(formularize.attabal("payload", payload));
            Intrinsics.checkNotNullParameter(mapApical, "<this>");
            JSONObject jSONObjectB = W6.b();
            if (jSONObjectB != null) {
                String string = jSONObjectB.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                mapApical.put("consentObject", string);
            }
            Le le = new Le(url, i3 > 0 ? polder.beachfront(formularize.attabal("X-im-retry-count", String.valueOf(i3))) : null, null, new Y6(mapApical, 0), null, 52);
            if (z) {
                if (i2 != i) {
                    jPow = ((long) Math.pow(2.0d, i3)) * j;
                } else {
                    jPow = 0;
                }
            } else if (i2 != i) {
                jPow = j;
            } else {
                jPow = 0;
            }
            cutely.wireman((saran) a.getValue(), null, null, new C3069m6(jPow, le, i2, eventPayload, url, i, j, ak, c3044l6, z, null), 3, null);
        }
    }
}
