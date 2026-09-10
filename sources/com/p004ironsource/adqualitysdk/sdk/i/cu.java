package com.p004ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import android.widget.VideoView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class cu extends cz {
    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static Object m1721(List<Object> list) {
        return jx.m2678((VideoView) cz.m1785(list, 0, VideoView.class));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1722(List<Object> list) {
        return ((Pair) cz.m1785(list, 0, Pair.class)).second;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m1723(List<Object> list) {
        return ((Pair) cz.m1785(list, 0, Pair.class)).first;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m1724(List<Object> list) {
        return am.m424((Context) cz.m1785(list, 0, Context.class));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m1725(List<Object> list) {
        Context context = (Context) cz.m1785(list, 0, Context.class);
        am.m426(am.m424(context), (BroadcastReceiver) cz.m1785(list, 1, BroadcastReceiver.class));
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m1727(List<Object> list) {
        Context context = (Context) cz.m1785(list, 0, Context.class);
        am.m423(am.m424(context), (BroadcastReceiver) cz.m1785(list, 1, BroadcastReceiver.class), (IntentFilter) cz.m1785(list, 2, IntentFilter.class));
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static long m1726() {
        return ju.m2665();
    }
}
