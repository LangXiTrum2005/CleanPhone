package com.chartboost.sdk.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Function1 f14522a = a.f14523b;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14523b = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qf invoke(i1 it) {
            JSONObject jSONObject;
            String str = JsonUtils.EMPTY_JSON;
            Intrinsics.f(it, "it");
            try {
                String string = it.i().getString(com.smartdigimkt.q0.b.i0, JsonUtils.EMPTY_JSON);
                if (string != null) {
                    str = string;
                }
                jSONObject = new JSONObject(str);
            } catch (Exception e2) {
                za.b("Error reading config from shared preferences", e2);
                jSONObject = new JSONObject();
            }
            return new qf(jSONObject);
        }
    }
}
