package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Xa extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Xa f23347a = new Xa();

    public Xa() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Ya.f23374a.getClass();
        Context contextD = Uc.d();
        JSONObject jSONObject = null;
        if (contextD != null) {
            if (Ya.f23376c == null) {
                Ya.f23376c = new Sa(contextD, "pub_signals_store");
            }
            Sa sa = Ya.f23376c;
            if (sa == null) {
                Intrinsics.m("prefDao");
                throw null;
            }
            String strA = sa.a("saved_signals");
            if (strA != null) {
                jSONObject = new JSONObject(strA);
            }
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
