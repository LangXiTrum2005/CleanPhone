package com.chartboost.heliumsdk.domain;

import com.p004ironsource.x4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/chartboost/heliumsdk/domain/PartnerConfiguration;", "", "credentials", "Lkotlinx/serialization/json/JsonObject;", "(Lkotlinx/serialization/json/JsonObject;)V", "getCredentials", "()Lkotlinx/serialization/json/JsonObject;", "component1", "copy", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "toString", "", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PartnerConfiguration {
    private final JsonObject credentials;

    public PartnerConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PartnerConfiguration copy$default(PartnerConfiguration partnerConfiguration, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jsonObject = partnerConfiguration.credentials;
        }
        return partnerConfiguration.copy(jsonObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getCredentials() {
        return this.credentials;
    }

    public final PartnerConfiguration copy(JsonObject credentials) {
        Intrinsics.f(credentials, "credentials");
        return new PartnerConfiguration(credentials);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PartnerConfiguration) && Intrinsics.a(this.credentials, ((PartnerConfiguration) other).credentials);
    }

    public final JsonObject getCredentials() {
        return this.credentials;
    }

    public int hashCode() {
        return this.credentials.hashCode();
    }

    public String toString() {
        return "PartnerConfiguration(credentials=" + this.credentials + ')';
    }

    public PartnerConfiguration(JsonObject credentials) {
        Intrinsics.f(credentials, "credentials");
        this.credentials = credentials;
    }

    public /* synthetic */ PartnerConfiguration(JsonObject jsonObject, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new JsonObjectBuilder().build() : jsonObject);
    }
}
