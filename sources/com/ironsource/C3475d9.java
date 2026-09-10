package com.ironsource;

import com.ironsource.environment.ContextProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3475d9 {
    public static final C3475d9 a = new C3475d9();

    private C3475d9() {
    }

    public static final JSONObject a() throws JSONException {
        new R9().b(ContextProvider.getInstance().getApplicationContext());
        String string = new C3457c9().a().toString();
        Intrinsics.checkNotNullExpressionValue(string, "InitProvider().getInitData().toString()");
        Ke.c(string);
        JSONObject encodedJsonInitResponse = new JSONObject().put("data", G9.e(C3578j5.b().c(), string));
        Intrinsics.checkNotNullExpressionValue(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
