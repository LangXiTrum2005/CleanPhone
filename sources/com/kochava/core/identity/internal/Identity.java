package com.kochava.core.identity.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.json.internal.JsonObjectApi;
import com.kochava.core.json.internal.JsonType;
import com.kochava.core.task.manager.internal.TaskManager;
import com.kochava.tracker.controller.internal.Controller;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Identity implements IdentityApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JsonObject f28010a = JsonObject.w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28011b = androidx.media3.extractor.text.ttml.a.u();

    class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28012a;

        static {
            int[] iArr = new int[JsonType.values().length];
            f28012a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28012a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28012a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28012a[8] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28012a[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28012a[0] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28012a[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28012a[3] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28012a[6] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28012a[7] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public Identity(TaskManager taskManager) {
        Math.max(1, 100);
        Math.max(1, 128);
    }

    public final void a(Controller controller) {
        List list = this.f28011b;
        list.remove(controller);
        list.add(controller);
    }

    public final synchronized JsonObjectApi b() {
        return this.f28010a.c();
    }

    public final synchronized boolean c() {
        return this.f28010a.length() > 0;
    }

    public final synchronized void d(JsonObjectApi jsonObjectApi) {
        JsonObject jsonObject = this.f28010a;
        synchronized (jsonObject) {
            Iterator<String> itKeys = jsonObject.f28020a.keys();
            while (itKeys.hasNext()) {
                itKeys.next();
                itKeys.remove();
            }
        }
        this.f28010a.b(jsonObjectApi);
    }
}
