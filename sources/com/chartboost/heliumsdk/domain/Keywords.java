package com.chartboost.heliumsdk.domain;

import com.chartboost.heliumsdk.domain.serializers.KeywordsSerializer;
import com.chartboost.heliumsdk.utils.LogController;
import com.smartdigimkt.v0.k;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\bJ\u0019\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Keywords;", "", "()V", "KEYWORD_CHAR_LIMIT", "", "VALUE_CHAR_LIMIT", "keywords", "", "", "exceedsCharacterLimit", "", k.f38992h, "limit", "get", "", "remove", "key", "set", "keyword", "value", "Companion", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Serializable(with = KeywordsSerializer.class)
public final class Keywords {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int KEYWORD_CHAR_LIMIT = 64;
    private final int VALUE_CHAR_LIMIT = 256;
    private final Map<String, String> keywords = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/chartboost/heliumsdk/domain/Keywords$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chartboost/heliumsdk/domain/Keywords;", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Keywords> serializer() {
            return KeywordsSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    private final boolean exceedsCharacterLimit(String string, int limit) {
        return string.length() > limit;
    }

    public final Map<String, String> get() {
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(this.keywords);
        Intrinsics.e(mapUnmodifiableMap, "unmodifiableMap(keywords)");
        return mapUnmodifiableMap;
    }

    public final String remove(String key) {
        Intrinsics.f(key, "key");
        return this.keywords.remove(key);
    }

    public final boolean set(String keyword, String value) {
        Intrinsics.f(keyword, "keyword");
        Intrinsics.f(value, "value");
        if (!exceedsCharacterLimit(keyword, this.KEYWORD_CHAR_LIMIT) && !exceedsCharacterLimit(value, this.VALUE_CHAR_LIMIT)) {
            this.keywords.put(keyword, value);
            return true;
        }
        LogController.INSTANCE.w("The keyword or value exceeded the maximum allowable characters. Maximum allowable characters for Keyword is: " + this.KEYWORD_CHAR_LIMIT + " & for Value is: " + this.VALUE_CHAR_LIMIT);
        return false;
    }
}
