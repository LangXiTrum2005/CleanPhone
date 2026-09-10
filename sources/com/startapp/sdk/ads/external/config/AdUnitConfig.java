package com.startapp.sdk.ads.external.config;

import com.p004ironsource.x4;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.f0;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\u0015R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\u0015R4\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/startapp/sdk/ads/external/config/AdUnitConfig;", "Ljava/io/Serializable;", "<init>", "()V", "", "getBp", "()Ljava/lang/String;", "", "isValid", "()Z", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "network", "Ljava/lang/String;", "getNetwork", "setNetwork", "(Ljava/lang/String;)V", "adUnitId", "getAdUnitId", "setAdUnitId", "sioPrice", "getSioPrice", "setSioPrice", "", "", "keyValues", "Ljava/util/Map;", "getKeyValues", "()Ljava/util/Map;", "setKeyValues", "(Ljava/util/Map;)V", "Companion", "com/startapp/sdk/internal/f0", "sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AdUnitConfig implements Serializable {
    private static final String BID_PRICE_PREFIX = "bp";
    public static final f0 Companion = new f0();
    private static final long serialVersionUID = 6500875630965723979L;
    private String sioPrice;
    private String network = "gam";
    private String adUnitId = "";

    @TypeInfo(type = HashMap.class)
    private Map<String, ? extends List<String>> keyValues = EmptyMap.X;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !JvmClassMappingKt.e(AdUnitConfig.class).equals(JvmClassMappingKt.e(other.getClass()))) {
            return false;
        }
        AdUnitConfig adUnitConfig = (AdUnitConfig) other;
        return Intrinsics.a(this.adUnitId, adUnitConfig.adUnitId) && Intrinsics.a(this.network, adUnitConfig.network) && vi.a((Object) this.sioPrice, (Object) adUnitConfig.sioPrice) && vi.a(this.keyValues, adUnitConfig.keyValues);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getBp() {
        Object next;
        List list;
        Iterator<T> it = this.keyValues.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.M((String) ((Map.Entry) next).getKey(), "bp", false));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (String) CollectionsKt.y(list);
    }

    public final Map<String, List<String>> getKeyValues() {
        return this.keyValues;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getSioPrice() {
        return this.sioPrice;
    }

    public int hashCode() {
        Object[] objArr = {this.adUnitId, this.keyValues, this.sioPrice, this.network};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final boolean isValid() {
        String str = this.sioPrice;
        boolean z2 = (str != null ? StringsKt.W(str) : null) != null;
        String bp = getBp();
        return z2 & ((bp != null ? StringsKt.W(bp) : null) != null) & (!StringsKt.w(this.adUnitId));
    }

    public final void setAdUnitId(String str) {
        Intrinsics.f(str, "<set-?>");
        this.adUnitId = str;
    }

    public final void setKeyValues(Map<String, ? extends List<String>> map) {
        Intrinsics.f(map, "<set-?>");
        this.keyValues = map;
    }

    public final void setNetwork(String str) {
        Intrinsics.f(str, "<set-?>");
        this.network = str;
    }

    public final void setSioPrice(String str) {
        this.sioPrice = str;
    }
}
