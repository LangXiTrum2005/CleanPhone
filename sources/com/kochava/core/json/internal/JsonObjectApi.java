package com.kochava.core.json.internal;

import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface JsonObjectApi {
    String a();

    void b(JsonObjectApi jsonObjectApi);

    JsonObject c();

    JsonArrayApi d(String str);

    boolean e(String str, JsonElementApi jsonElementApi);

    Double f(String str, Double d);

    boolean g(String str, String str2);

    String getString(String str, String str2);

    ArrayList h();

    boolean i(String str);

    Boolean j(String str, Boolean bool);

    JsonObjectApi k(String str, boolean z2);

    JsonElement l(String str, boolean z2);

    int length();

    JSONObject m();

    Long n(String str, Long l2);

    boolean o(String str, boolean z2);

    JsonElement p();

    boolean q(double d, String str);

    boolean r(String str, JsonObjectApi jsonObjectApi);

    boolean remove(String str);

    Integer s(Integer num, String str);

    JsonObject t(JsonObjectApi jsonObjectApi);

    String toString();
}
