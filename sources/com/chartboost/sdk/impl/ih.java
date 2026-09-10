package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f14192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eh f14193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f14194c;
    public final y6 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14195e;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f14196b = new a();

        public a() {
            super(1, JSONArray.class, "<init>", "<init>(Ljava/util/Collection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke(Collection collection) {
            return new JSONArray(collection);
        }
    }

    public ih(z2 networkService, eh trackingEventCache, Function1 jsonFactory, y6 eventTracker, String sessionId) {
        Intrinsics.f(networkService, "networkService");
        Intrinsics.f(trackingEventCache, "trackingEventCache");
        Intrinsics.f(jsonFactory, "jsonFactory");
        Intrinsics.f(eventTracker, "eventTracker");
        Intrinsics.f(sessionId, "sessionId");
        this.f14192a = networkService;
        this.f14193b = trackingEventCache;
        this.f14194c = jsonFactory;
        this.d = eventTracker;
        this.f14195e = sessionId;
    }

    public final void a(String url, List events) {
        Intrinsics.f(url, "url");
        Intrinsics.f(events, "events");
        jh jhVar = new jh(url, this.f14193b, this.f14195e, null, this.d, 8, null);
        jhVar.a((JSONArray) this.f14194c.invoke(events));
        this.f14192a.a(jhVar);
    }

    public /* synthetic */ ih(z2 z2Var, eh ehVar, Function1 function1, y6 y6Var, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2Var, ehVar, (i2 & 4) != 0 ? a.f14196b : function1, y6Var, str);
    }
}
