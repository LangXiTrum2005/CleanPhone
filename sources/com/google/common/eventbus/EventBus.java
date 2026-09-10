package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class EventBus {

    public static final class LoggingHandler implements SubscriberExceptionHandler {
    }

    static {
        Logger.getLogger(EventBus.class.getName());
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.d(null);
        return toStringHelperB.toString();
    }
}
