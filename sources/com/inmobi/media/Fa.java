package com.inmobi.media;

import A.RunnableC0887e;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pa f22822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ba f22823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ka f22824c;
    public volatile Ca d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f22825e;
    public AdConfig.PingsV2Config f;

    public Fa(Pa dao, Ba ba, Ka networkHandler) {
        Intrinsics.f(dao, "dao");
        Intrinsics.f(networkHandler, "networkHandler");
        this.f22822a = dao;
        this.f22823b = ba;
        this.f22824c = networkHandler;
        this.d = Ca.STOPPED;
        this.f22825e = new ConcurrentHashMap();
        Ea ea = new Ea(this);
        LinkedHashMap linkedHashMap = O2.f23027a;
        Config configA = M2.a("ads", Uc.b(), ea);
        Intrinsics.d(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig");
        this.f = ((AdConfig) configA).getPingV2();
    }

    public final void a(C3338za ping, ExecutorService executorService, Function1 onPingResponse) {
        Intrinsics.f(ping, "ping");
        Intrinsics.f(onPingResponse, "onPingResponse");
        if (this.d == Ca.STOPPED || this.f22825e.containsKey(ping.f24160b)) {
            return;
        }
        this.f22825e.put(ping.f24160b, ping.f24159a);
        if (executorService != null) {
            executorService.execute(new RunnableC0887e(onPingResponse, this, ping, 3));
        }
    }

    public static final void a(Function1 onPingResponse, Fa this$0, C3338za ping) {
        Intrinsics.f(onPingResponse, "$onPingResponse");
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(ping, "$ping");
        onPingResponse.invoke(this$0.f22824c.a(ping));
        this$0.f22825e.remove(ping.f24160b);
    }

    public final boolean a(Ca ca) {
        int iOrdinal = ca.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (this.d.compareTo(Ca.STARTED) >= 0) {
                        return false;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (this.d != Ca.STARTED) {
                return false;
            }
        } else if (this.d == Ca.STOPPED) {
            return false;
        }
        return true;
    }
}
