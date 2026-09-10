package com.startapp.sdk.triggeredlinks;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TriggeredLinksMetadata implements Serializable {
    private static final long serialVersionUID = 1082253451843108611L;

    @TypeInfo(complex = true, name = "AppEvents")
    private AppEventsMetadata appEvents;
    private int ief;

    @TypeInfo(name = "ThrottlingPublisherIDs", type = ArrayList.class, value = Integer.class)
    private List<Integer> throttlingPublisherIDs;
    private boolean enabled = true;
    private int smartRedirectTimeoutInSec = 10;
    private boolean triggeredLinkInfoEvent = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TriggeredLinksMetadata triggeredLinksMetadata = (TriggeredLinksMetadata) obj;
            if (this.enabled == triggeredLinksMetadata.enabled && this.smartRedirectTimeoutInSec == triggeredLinksMetadata.smartRedirectTimeoutInSec && this.triggeredLinkInfoEvent == triggeredLinksMetadata.triggeredLinkInfoEvent && this.ief == triggeredLinksMetadata.ief && vi.a((Object) this.appEvents, (Object) triggeredLinksMetadata.appEvents) && vi.a(this.throttlingPublisherIDs, triggeredLinksMetadata.throttlingPublisherIDs)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Integer.valueOf(this.smartRedirectTimeoutInSec), Boolean.valueOf(this.triggeredLinkInfoEvent), this.appEvents, this.throttlingPublisherIDs, Integer.valueOf(this.ief)};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }
}
