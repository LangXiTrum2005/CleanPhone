package com.facebook.internal;

import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/Logger;", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoggingBehavior f16352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f16354c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f16351e = new Companion();
    public static final HashMap d = new HashMap();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R0\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/internal/Logger$Companion;", "", "", "LOG_TAG_BASE", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stringsToReplace", "Ljava/util/HashMap;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static void a(LoggingBehavior loggingBehavior, String tag, String string) {
            Intrinsics.f(tag, "tag");
            Intrinsics.f(string, "string");
            b(loggingBehavior, tag, string);
        }

        public static void b(LoggingBehavior behavior, String tag, String string) {
            Intrinsics.f(behavior, "behavior");
            Intrinsics.f(tag, "tag");
            Intrinsics.f(string, "string");
            FacebookSdk.j(behavior);
        }

        public final synchronized void c(String accessToken) {
            Intrinsics.f(accessToken, "accessToken");
            FacebookSdk.j(LoggingBehavior.f15954Y);
            synchronized (this) {
                Logger.d.put(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public Logger() {
        LoggingBehavior loggingBehavior = LoggingBehavior.X;
        Validate.g("Request", "tag");
        this.f16352a = loggingBehavior;
        this.f16353b = "FacebookSDK.".concat("Request");
        this.f16354c = new StringBuilder();
    }

    public final void a(Object value, String key) {
        Intrinsics.f(key, "key");
        Intrinsics.f(value, "value");
        b();
    }

    public final void b() {
        FacebookSdk.j(this.f16352a);
    }
}
