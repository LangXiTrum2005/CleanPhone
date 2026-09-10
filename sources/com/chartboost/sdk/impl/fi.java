package com.chartboost.sdk.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum fi {
    TIMESTAMP("[TIMESTAMP]"),
    CACHEBUSTING("[CACHEBUSTING]"),
    ERRORCODE("[ERRORCODE]"),
    REASON("[REASON]"),
    LIMITADTRACKING("[LIMITADTRACKING]"),
    APPBUNDLE("[APPBUNDLE]"),
    OMIDPARTNER("[OMIDPARTNER]");

    public static final Map d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13957b;
    public static final /* synthetic */ EnumEntries m = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13952c = new a(null);

    public static final class a {
        public a() {
        }

        public final fi a(String token) {
            Intrinsics.f(token, "token");
            return (fi) fi.d.get(token);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumEntries enumEntriesC = c();
        int iH = MapsKt.h(CollectionsKt.n(enumEntriesC, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        for (Object obj : enumEntriesC) {
            linkedHashMap.put(((fi) obj).f13957b, obj);
        }
        d = linkedHashMap;
    }

    fi(String str) {
        this.f13957b = str;
    }

    public static EnumEntries c() {
        return m;
    }
}
