package com.vungle.ads.fpd;

import com.vungle.ads.internal.util.RangeUtil;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002,-B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0003H\u0007J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0003H\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\u0007J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003H\u0007J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u000fH\u0007J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0005H\u0007J\u0010\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u0005H\u0007J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+HÇ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\n\u0010\t¨\u0006."}, d2 = {"Lcom/vungle/ads/fpd/SessionContext;", "", "seen1", "", "levelPercentile", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getLevelPercentile$annotations", "Ljava/lang/Float;", "setFriends", "friends", "", "", "setHealthPercentile", "healthPercentile", "setInGamePurchasesUSD", "inGamePurchasesUSD", "setLevelPercentile", "setPage", "page", "setSessionDuration", "sessionDuration", "setSessionStartTime", "sessionStartTime", "setSignupDate", "signupDate", "setTimeSpent", "timeSpent", "setUserID", "userID", "setUserLevelPercentile", "userLevelPercentile", "setUserScorePercentile", "userScorePercentile", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Serializable
public final class SessionContext {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Float levelPercentile;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/SessionContext;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SessionContext> serializer() {
            return SessionContext$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SessionContext() {
    }

    @SerialName("level_percentile")
    private static /* synthetic */ void getLevelPercentile$annotations() {
    }

    @JvmStatic
    public static final void write$Self(SessionContext self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Intrinsics.f(self, "self");
        Intrinsics.f(output, "output");
        Intrinsics.f(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.levelPercentile == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.levelPercentile);
    }

    @Deprecated
    public final SessionContext setFriends(List<String> friends) {
        return this;
    }

    @Deprecated
    public final SessionContext setHealthPercentile(float healthPercentile) {
        return this;
    }

    @Deprecated
    public final SessionContext setInGamePurchasesUSD(float inGamePurchasesUSD) {
        return this;
    }

    public final SessionContext setLevelPercentile(float levelPercentile) {
        if (RangeUtil.INSTANCE.isInRange(levelPercentile, 0.0f, 100.0f)) {
            this.levelPercentile = Float.valueOf(levelPercentile);
        }
        return this;
    }

    @Deprecated
    public final SessionContext setPage(String page) {
        Intrinsics.f(page, "page");
        return this;
    }

    @Deprecated
    public final SessionContext setSessionDuration(int sessionDuration) {
        return this;
    }

    @Deprecated
    public final SessionContext setSessionStartTime(int sessionStartTime) {
        return this;
    }

    @Deprecated
    public final SessionContext setSignupDate(int signupDate) {
        return this;
    }

    @Deprecated
    public final SessionContext setTimeSpent(int timeSpent) {
        return this;
    }

    @Deprecated
    public final SessionContext setUserID(String userID) {
        Intrinsics.f(userID, "userID");
        return this;
    }

    @Deprecated
    public final SessionContext setUserLevelPercentile(float userLevelPercentile) {
        return this;
    }

    @Deprecated
    public final SessionContext setUserScorePercentile(float userScorePercentile) {
        return this;
    }

    @Deprecated
    public /* synthetic */ SessionContext(int i2, @SerialName("level_percentile") Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i2 & 1) == 0) {
            this.levelPercentile = null;
        } else {
            this.levelPercentile = f;
        }
    }
}
