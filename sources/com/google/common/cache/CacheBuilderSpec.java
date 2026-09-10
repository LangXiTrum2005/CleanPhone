package com.google.common.cache;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMap;
import com.p004ironsource.dc;
import com.p004ironsource.v6;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class CacheBuilderSpec {

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19749a;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            f19749a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19749a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AccessDurationParser extends DurationParser {
    }

    public static class ConcurrencyLevelParser extends IntegerParser {
    }

    public static abstract class DurationParser implements ValueParser {
    }

    public static class InitialCapacityParser extends IntegerParser {
    }

    public static abstract class IntegerParser implements ValueParser {
    }

    public static class KeyStrengthParser implements ValueParser {
    }

    public static abstract class LongParser implements ValueParser {
    }

    public static class MaximumSizeParser extends LongParser {
    }

    public static class MaximumWeightParser extends LongParser {
    }

    public static class RecordStatsParser implements ValueParser {
    }

    public static class RefreshDurationParser extends DurationParser {
    }

    public interface ValueParser {
    }

    public static class ValueStrengthParser implements ValueParser {
    }

    public static class WriteDurationParser extends DurationParser {
    }

    static {
        Splitter.a(AbstractJsonLexerKt.COMMA).d();
        Splitter.a(dc.T).d();
        ImmutableMap.Builder builderD = ImmutableMap.d();
        builderD.c("initialCapacity", new InitialCapacityParser());
        builderD.c("maximumSize", new MaximumSizeParser());
        builderD.c("maximumWeight", new MaximumWeightParser());
        builderD.c("concurrencyLevel", new ConcurrencyLevelParser());
        builderD.c("weakKeys", new KeyStrengthParser());
        builderD.c("softValues", new ValueStrengthParser());
        builderD.c("weakValues", new ValueStrengthParser());
        builderD.c("recordStats", new RecordStatsParser());
        builderD.c("expireAfterAccess", new AccessDurationParser());
        builderD.c("expireAfterWrite", new WriteDurationParser());
        builderD.c("refreshAfterWrite", new RefreshDurationParser());
        builderD.c(v6.d, new RefreshDurationParser());
        builderD.a(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        ((CacheBuilderSpec) obj).getClass();
        return Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null) && Objects.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null, null, null, null, null, null, null, null, null});
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.d(null);
        return toStringHelperB.toString();
    }
}
