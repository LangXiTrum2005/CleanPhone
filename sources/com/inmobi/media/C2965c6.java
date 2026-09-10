package com.inmobi.media;

import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2965c6 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2982d6 f23483a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2965c6(C2982d6 c2982d6) {
        super(0);
        this.f23483a = c2982d6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        Z5 z5 = this.f23483a.f23511a;
        JSONObject jSONObject = z5.f23396a;
        JSONArray jSONArray = z5.f23397b;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        String string = jSONObject2.toString();
        Intrinsics.e(string, "toString(...)");
        AbstractC3128m7.a("IncompleteLogFinalizer", string, this.f23483a.f23511a.f23398c.f23367a);
        String str = this.f23483a.f23511a.f23398c.f23367a;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Y6 y6 = this.f23483a.f23511a.f23398c;
        Nc.d().b(new Y6(str, timeInMillis, 0, y6.d, true, y6.f));
        return Unit.f43263a;
    }
}
