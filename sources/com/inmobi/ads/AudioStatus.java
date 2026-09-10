package com.inmobi.ads;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/inmobi/ads/AudioStatus;", "", "(Ljava/lang/String;I)V", "PLAYING", "PAUSED", "COMPLETED", "Companion", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum AudioStatus {
    PLAYING,
    PAUSED,
    COMPLETED;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/ads/AudioStatus$Companion;", "", "Lcom/inmobi/ads/AudioStatus;", "", "<init>", "()V", "value", "from", "(I)Lcom/inmobi/ads/AudioStatus;", "item", "to", "(Lcom/inmobi/ads/AudioStatus;)Ljava/lang/Integer;", "media_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        private Companion() {
        }

        @JvmStatic
        public AudioStatus from(int value) {
            if (value != 0) {
                return value != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            }
            return AudioStatus.PLAYING;
        }

        @JvmStatic
        public Integer to(AudioStatus item) {
            Intrinsics.f(item, "item");
            return Integer.valueOf(item.ordinal());
        }
    }

    @JvmStatic
    public static AudioStatus from(int i2) {
        return INSTANCE.from(i2);
    }

    public static EnumEntries<AudioStatus> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static int to(AudioStatus audioStatus) {
        return INSTANCE.to(audioStatus).intValue();
    }
}
