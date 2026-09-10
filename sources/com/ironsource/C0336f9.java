package com.ironsource;

import com.ironsource.environment.ContextProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0336f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0336f9 f28667a = new C0336f9();

    private C0336f9() {
    }

    public static final JSONObject a() throws JSONException {
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        String string = new C0318e9().a().toString();
        kotlin.jvm.internal.n.e(string, "InitProvider().getInitData().toString()");
        Xe.c(string);
        JSONObject encodedJsonInitResponse = new JSONObject().put("data", J9.e(C0421k5.b().c(), string));
        kotlin.jvm.internal.n.e(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
