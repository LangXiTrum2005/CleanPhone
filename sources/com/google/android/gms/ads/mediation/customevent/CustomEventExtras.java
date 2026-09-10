package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CustomEventExtras {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11306a = new HashMap();

    @Nullable
    public Object getExtra(@NonNull String str) {
        return this.f11306a.get(str);
    }

    public void setExtra(@NonNull String str, @NonNull Object obj) {
        this.f11306a.put(str, obj);
    }
}
