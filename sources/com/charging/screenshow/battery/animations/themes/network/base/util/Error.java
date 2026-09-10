package com.charging.screenshow.battery.animations.themes.network.base.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/util/Error;", "", "Companion", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Error {
    public static final Companion X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Error f13292Y;
    public static final Error Z;
    public static final Error e0;
    public static final Error f0;
    public static final Error g0;
    public static final Error h0;
    public static final Error i0;
    public static final /* synthetic */ Error[] j0;
    public static final /* synthetic */ EnumEntries k0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/network/base/util/Error$Companion;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Error error = new Error("REMOTE_MESSAGE", 0);
        f13292Y = error;
        Error error2 = new Error("REMOTE_TOKEN_INVALID", 1);
        Error error3 = new Error("LOCAL_TIME_OUT", 2);
        Z = error3;
        Error error4 = new Error("LOCAL_UNKNOWN_HOST", 3);
        e0 = error4;
        Error error5 = new Error("LOCAL_NET_STATE", 4);
        f0 = error5;
        Error error6 = new Error("LOCAL_PARSE", 5);
        g0 = error6;
        Error error7 = new Error("LOCAL_DEFAULT", 6);
        h0 = error7;
        Error error8 = new Error("LOCAL_UNKNOWN", 7);
        i0 = error8;
        Error[] errorArr = {error, error2, error3, error4, error5, error6, error7, error8};
        j0 = errorArr;
        k0 = EnumEntriesKt.a(errorArr);
        X = new Companion();
    }

    public static Error valueOf(String str) {
        return (Error) Enum.valueOf(Error.class, str);
    }

    public static Error[] values() {
        return (Error[]) j0.clone();
    }
}
