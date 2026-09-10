package com.facebook;

import com.p004ironsource.ko;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/HttpMethod;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class HttpMethod {
    public static final HttpMethod X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final HttpMethod f15953Y;
    public static final HttpMethod Z;
    public static final /* synthetic */ HttpMethod[] e0;

    static {
        HttpMethod httpMethod = new HttpMethod(ko.f25534a, 0);
        X = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod(ko.f25535b, 1);
        f15953Y = httpMethod2;
        HttpMethod httpMethod3 = new HttpMethod("DELETE", 2);
        Z = httpMethod3;
        e0 = new HttpMethod[]{httpMethod, httpMethod2, httpMethod3};
    }

    public static HttpMethod valueOf(String str) {
        return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
    }

    public static HttpMethod[] values() {
        return (HttpMethod[]) e0.clone();
    }
}
