package com.startapp.sdk.ads.external.config;

import com.p004ironsource.x4;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.c7;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/startapp/sdk/ads/external/config/ExternalAdConfig;", "Ljava/io/Serializable;", "<init>", "()V", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/startapp/sdk/ads/external/config/StrategyConfig;", "strategies", "Lcom/startapp/sdk/ads/external/config/StrategyConfig;", "getStrategies", "()Lcom/startapp/sdk/ads/external/config/StrategyConfig;", "setStrategies", "(Lcom/startapp/sdk/ads/external/config/StrategyConfig;)V", "", "", "Lcom/startapp/sdk/ads/external/config/AdUnitConfig;", "mapping", "Ljava/util/Map;", "getMapping", "()Ljava/util/Map;", "setMapping", "(Ljava/util/Map;)V", "dparam", "Ljava/lang/String;", "getDparam", "()Ljava/lang/String;", "setDparam", "(Ljava/lang/String;)V", "Companion", "com/startapp/sdk/internal/c7", "sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExternalAdConfig implements Serializable {
    public static final c7 Companion = new c7();
    private static final long serialVersionUID = 6500875630965723999L;
    private String dparam;

    @TypeInfo(complex = true)
    private StrategyConfig strategies = new StrategyConfig();

    @TypeInfo(type = HashMap.class, value = AdUnitConfig.class)
    private Map<String, AdUnitConfig> mapping = EmptyMap.X;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !JvmClassMappingKt.e(ExternalAdConfig.class).equals(JvmClassMappingKt.e(other.getClass()))) {
            return false;
        }
        ExternalAdConfig externalAdConfig = (ExternalAdConfig) other;
        return vi.a((Object) this.strategies, (Object) externalAdConfig.strategies) && vi.a(this.mapping, externalAdConfig.mapping) && vi.a((Object) this.dparam, (Object) externalAdConfig.dparam);
    }

    public final String getDparam() {
        return this.dparam;
    }

    public final Map<String, AdUnitConfig> getMapping() {
        return this.mapping;
    }

    public final StrategyConfig getStrategies() {
        return this.strategies;
    }

    public int hashCode() {
        Object[] objArr = {this.strategies, this.mapping, this.dparam};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final void setDparam(String str) {
        this.dparam = str;
    }

    public final void setMapping(Map<String, AdUnitConfig> map) {
        Intrinsics.f(map, "<set-?>");
        this.mapping = map;
    }

    public final void setStrategies(StrategyConfig strategyConfig) {
        Intrinsics.f(strategyConfig, "<set-?>");
        this.strategies = strategyConfig;
    }
}
