package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ob {
    public static final String a(String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return android.support.v4.media.a.D(str, " ", str2);
        }
        if (str == null || str.length() == 0) {
            return (str2 == null || str2.length() == 0) ? "" : str2;
        }
        return str;
    }

    public static final Map a(nb nbVar) {
        Intrinsics.f(nbVar, "<this>");
        Mediation mediation = nbVar.getMediation();
        String str = mediation != null ? mediation.mediationType : null;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("CB_MEDIATOR_NAME", str);
        Mediation mediation2 = nbVar.getMediation();
        String str2 = mediation2 != null ? mediation2.libraryVersion : null;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair2 = new Pair("CB_MEDIATOR_SDK_VERSION", str2);
        Mediation mediation3 = nbVar.getMediation();
        String str3 = mediation3 != null ? mediation3.adapterVersion : null;
        return MapsKt.j(pair, pair2, new Pair("CB_MEDIATOR_ADAPTER_VERSION", str3 != null ? str3 : ""));
    }
}
