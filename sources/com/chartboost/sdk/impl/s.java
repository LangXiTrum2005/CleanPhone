package com.chartboost.sdk.impl;

import com.p004ironsource.qt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface s {

    public static final class a {
        public static String a(s sVar, JSONObject receiver, String error, String response) {
            Intrinsics.f(receiver, "$receiver");
            Intrinsics.f(error, "error");
            Intrinsics.f(response, "response");
            try {
                receiver.put("error", error);
                receiver.put(qt.f26623n, response);
            } catch (Exception e2) {
                za.b("Cannot create error json for the event", e2);
            }
            String string = receiver.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        }
    }

    void a(wa waVar, Function1 function1);
}
