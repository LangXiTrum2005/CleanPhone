package com.p004ironsource;

import android.os.Bundle;
import android.support.v4.media.a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/rc;", "", "Landroid/os/Bundle;", "bundle", "", "", "a", "b", "Ljava/lang/String;", "KEY_PREFIX", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rc f26667a = new rc();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String KEY_PREFIX = "ext_";

    private rc() {
    }

    public final Map<String, String> a(Bundle bundle) {
        Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
        if (setKeySet == null) {
            return EmptyMap.X;
        }
        int iH = MapsKt.h(CollectionsKt.n(setKeySet, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        for (String str : setKeySet) {
            String strC = a.C(KEY_PREFIX, str);
            Object obj = bundle.get(str);
            linkedHashMap.put(strC, obj instanceof Iterable ? CollectionsKt.D((Iterable) obj, ", ", null, null, null, 62) : obj == null ? null : obj.toString());
        }
        return linkedHashMap;
    }
}
