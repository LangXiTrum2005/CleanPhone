package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f21415b;

    public /* synthetic */ w50(Map map, Map map2) {
        this.f21414a = map;
        this.f21415b = map2;
    }

    public Enum a(Object obj) throws GeneralSecurityException {
        Enum r2 = (Enum) this.f21415b.get(obj);
        if (r2 != null) {
            return r2;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object b(Enum r2) throws GeneralSecurityException {
        Object obj = this.f21414a.get(r2);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r2)));
    }
}
