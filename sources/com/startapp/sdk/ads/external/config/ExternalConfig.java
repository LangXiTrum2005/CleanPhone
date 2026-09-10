package com.startapp.sdk.ads.external.config;

import com.p004ironsource.x4;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.d7;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/startapp/sdk/ads/external/config/ExternalConfig;", "Ljava/io/Serializable;", "<init>", "()V", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/startapp/sdk/ads/external/config/ExternalAdConfig;", "googleads", "Lcom/startapp/sdk/ads/external/config/ExternalAdConfig;", "getGoogleads", "()Lcom/startapp/sdk/ads/external/config/ExternalAdConfig;", "setGoogleads", "(Lcom/startapp/sdk/ads/external/config/ExternalAdConfig;)V", "loadInnerAdIfNoExternal", "Z", "getLoadInnerAdIfNoExternal", "()Z", "setLoadInnerAdIfNoExternal", "(Z)V", "Companion", "com/startapp/sdk/internal/d7", "sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ExternalConfig implements Serializable {
    public static final d7 Companion = new d7();
    private static final long serialVersionUID = 6500875630965723998L;

    @TypeInfo(complex = true)
    private ExternalAdConfig googleads;
    private boolean loadInnerAdIfNoExternal;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !JvmClassMappingKt.e(ExternalConfig.class).equals(JvmClassMappingKt.e(other.getClass()))) {
            return false;
        }
        ExternalConfig externalConfig = (ExternalConfig) other;
        return vi.a((Object) this.googleads, (Object) externalConfig.googleads) && this.loadInnerAdIfNoExternal == externalConfig.loadInnerAdIfNoExternal;
    }

    public final ExternalAdConfig getGoogleads() {
        return this.googleads;
    }

    public final boolean getLoadInnerAdIfNoExternal() {
        return this.loadInnerAdIfNoExternal;
    }

    public int hashCode() {
        Object[] objArr = {this.googleads, Boolean.valueOf(this.loadInnerAdIfNoExternal)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final void setGoogleads(ExternalAdConfig externalAdConfig) {
        this.googleads = externalAdConfig;
    }

    public final void setLoadInnerAdIfNoExternal(boolean z2) {
        this.loadInnerAdIfNoExternal = z2;
    }
}
