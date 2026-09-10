package com.chartboost.heliumsdk.domain;

import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Partner;", "", "partnerId", "", "credentials", "Lkotlinx/serialization/json/JsonObject;", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "getCredentials", "()Lkotlinx/serialization/json/JsonObject;", "getPartnerId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Partner {
    private final JsonObject credentials;
    private final String partnerId;

    public Partner(String partnerId, JsonObject credentials) {
        Intrinsics.f(partnerId, "partnerId");
        Intrinsics.f(credentials, "credentials");
        this.partnerId = partnerId;
        this.credentials = credentials;
    }

    public static /* synthetic */ Partner copy$default(Partner partner, String str, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = partner.partnerId;
        }
        if ((i2 & 2) != 0) {
            jsonObject = partner.credentials;
        }
        return partner.copy(str, jsonObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonObject getCredentials() {
        return this.credentials;
    }

    public final Partner copy(String partnerId, JsonObject credentials) {
        Intrinsics.f(partnerId, "partnerId");
        Intrinsics.f(credentials, "credentials");
        return new Partner(partnerId, credentials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Partner)) {
            return false;
        }
        Partner partner = (Partner) other;
        return Intrinsics.a(this.partnerId, partner.partnerId) && Intrinsics.a(this.credentials, partner.credentials);
    }

    public final JsonObject getCredentials() {
        return this.credentials;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public int hashCode() {
        return this.credentials.hashCode() + (this.partnerId.hashCode() * 31);
    }

    public String toString() {
        return "Partner(partnerId=" + this.partnerId + ", credentials=" + this.credentials + ')';
    }
}
