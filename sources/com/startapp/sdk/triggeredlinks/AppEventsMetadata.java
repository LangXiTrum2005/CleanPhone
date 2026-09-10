package com.startapp.sdk.triggeredlinks;

import com.startapp.json.TypeInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AppEventsMetadata implements Serializable {
    private static final long serialVersionUID = -5670027899854165615L;

    @TypeInfo(type = HashMap.class)
    private Map<String, String> active;

    @TypeInfo(type = HashMap.class)
    private Map<String, String> inactive;

    @TypeInfo(type = HashMap.class)
    private Map<String, String> launch;

    @TypeInfo(type = HashMap.class, value = PeriodicAppEventMetadata.class)
    private Map<String, PeriodicAppEventMetadata> periodic;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AppEventsMetadata appEventsMetadata = (AppEventsMetadata) obj;
            Map<String, String> map = this.launch;
            if (map == null ? appEventsMetadata.launch != null : !map.equals(appEventsMetadata.launch)) {
                return false;
            }
            Map<String, String> map2 = this.active;
            if (map2 == null ? appEventsMetadata.active != null : !map2.equals(appEventsMetadata.active)) {
                return false;
            }
            Map<String, String> map3 = this.inactive;
            if (map3 == null ? appEventsMetadata.inactive != null : !map3.equals(appEventsMetadata.inactive)) {
                return false;
            }
            Map<String, PeriodicAppEventMetadata> map4 = this.periodic;
            Map<String, PeriodicAppEventMetadata> map5 = appEventsMetadata.periodic;
            if (map4 != null) {
                return map4.equals(map5);
            }
            if (map5 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Map<String, String> map = this.launch;
        int iHashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, String> map2 = this.active;
        int iHashCode2 = (iHashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.inactive;
        int iHashCode3 = (iHashCode2 + (map3 != null ? map3.hashCode() : 0)) * 31;
        Map<String, PeriodicAppEventMetadata> map4 = this.periodic;
        return iHashCode3 + (map4 != null ? map4.hashCode() : 0);
    }
}
