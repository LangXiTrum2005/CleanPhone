package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public final class fa implements ue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fa f40961b = new fa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f40962a;

    public fa(Set languages) {
        Intrinsics.f(languages, "languages");
        this.f40962a = languages;
    }

    @Override // com.startapp.sdk.internal.ue
    public final JSONArray a() {
        if (this.f40962a != null) {
            return new JSONArray((Collection) this.f40962a);
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.ue
    public final String b() {
        Set set = this.f40962a;
        if (set == null) {
            return null;
        }
        WeakHashMap weakHashMap = vi.f41589a;
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (Object obj : set) {
            if (z2) {
                sb.append(";");
            }
            sb.append(obj);
            z2 = true;
        }
        return sb.toString();
    }

    public fa() {
        this.f40962a = null;
    }
}
