package com.startapp.sdk.internal;

import java.util.LinkedHashSet;
import java.util.Locale;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class ac implements ue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f40800a;

    public ac(LinkedHashSet linkedHashSet) {
        this.f40800a = linkedHashSet;
    }

    @Override // com.startapp.sdk.internal.ue
    public final JSONArray a() {
        LinkedHashSet<Locale> linkedHashSet = this.f40800a;
        JSONArray jSONArray = new JSONArray();
        for (Locale locale : linkedHashSet) {
            if (locale != null) {
                jSONArray.put(locale.toString());
            }
        }
        return jSONArray;
    }

    @Override // com.startapp.sdk.internal.ue
    public final String b() {
        return bc.a(null, this.f40800a, ';');
    }
}
