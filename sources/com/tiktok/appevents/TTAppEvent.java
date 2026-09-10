package com.tiktok.appevents;

import com.applovin.impl.Z;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.util.TTLogger;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class TTAppEvent implements Serializable {
    private static final long serialVersionUID = 2;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TTAppEventType {
        public static final /* synthetic */ TTAppEventType[] X = {new TTAppEventType("track", 0), new TTAppEventType("identify", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        TTAppEventType EF5;

        public static TTAppEventType valueOf(String str) {
            return (TTAppEventType) Enum.valueOf(TTAppEventType.class, str);
        }

        public static TTAppEventType[] values() {
            return (TTAppEventType[]) X.clone();
        }
    }

    static {
        new AtomicLong(Z.f());
        new TTLogger(TTAppEventsQueue.class.getCanonicalName(), TikTokBusinessSdk.f42661b);
    }

    public final String toString() {
        return "TTAppEvent{eventName='null', timeStamp=" + ((Object) null) + ", propertiesJson='" + ((String) null) + "', eventId='" + ((String) null) + "', uniqueId=" + ((Object) null) + ", tiktokAppIds=" + ((Object) null) + AbstractJsonLexerKt.END_OBJ;
    }
}
