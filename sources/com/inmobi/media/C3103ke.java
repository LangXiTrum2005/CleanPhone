package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3103ke extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3103ke f23755a = new C3103ke();

    public C3103ke() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        JSONObject param = (JSONObject) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.f(param, "param");
        Iterator<String> itKeys = param.keys();
        Intrinsics.e(itKeys, "keys(...)");
        boolean z2 = true;
        while (itKeys.hasNext()) {
            if (param.getInt(itKeys.next()) < iIntValue) {
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }
}
