package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13847a = new ArrayList();

    @Override // com.chartboost.sdk.impl.a
    public JSONObject a(JSONObject response) {
        Intrinsics.f(response, "response");
        Iterator it = this.f13847a.iterator();
        while (it.hasNext()) {
            response = (JSONObject) ((a) it.next()).a(response);
        }
        return response;
    }
}
