package com.startapp.sdk.internal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ff extends kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f40974b;

    public ff(String str, HashMap map) {
        this.f40973a = str;
        this.f40974b = map;
    }

    @Override // com.startapp.sdk.internal.kf
    public final boolean a(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (pair.first != this) {
            return false;
        }
        Object obj2 = pair.second;
        if (!(obj2 instanceof Intent)) {
            return false;
        }
        Intent intent = (Intent) obj2;
        if (!this.f40973a.equals(intent.getAction())) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        for (Map.Entry entry : this.f40974b.entrySet()) {
            if (!((String) entry.getValue()).equals(String.valueOf(extras.get((String) entry.getKey())))) {
                return false;
            }
        }
        return true;
    }
}
