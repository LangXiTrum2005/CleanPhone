package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f10177a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10178a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f10178a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10178a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10178a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f10179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private JSONObject f10180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CrashType f10181c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f10181c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f10179a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f10179a = jSONObject;
            }
            this.f10180b = jSONObject.optJSONObject(com.smartdigimkt.x.g.f39716B);
        }

        public final String a() {
            return this.f10179a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f10179a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i2 = AnonymousClass1.f10178a[this.f10181c.ordinal()];
            if (i2 == 1) {
                return this.f10179a.optString("data", null);
            }
            if (i2 == 2) {
                return this.f10179a.optString("stack", null);
            }
            if (i2 != 3) {
                return null;
            }
            return this.f10179a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f10177a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f10177a.isEmpty()) {
            f10177a.poll();
        }
        f10177a = null;
    }
}
