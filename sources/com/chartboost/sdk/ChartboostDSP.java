package com.chartboost.sdk;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/chartboost/sdk/ChartboostDSP;", "", "", "dspCode", "", "creativeTypes", "", "setDSPHeader", "(Ljava/lang/String;[I)Z", "a", "Z", "isDSP", "()Z", "<init>", "()V", "ChartboostMonetization-9.10.2_productionRelease"}, k = 1, mv = {1, 9, 0})
public final class ChartboostDSP {
    public static final ChartboostDSP INSTANCE = new ChartboostDSP();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final boolean isDSP = false;

    @JvmStatic
    public static final boolean setDSPHeader(String dspCode, int[] creativeTypes) {
        return false;
    }

    public final boolean isDSP() {
        return isDSP;
    }
}
