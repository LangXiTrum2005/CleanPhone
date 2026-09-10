package com.iab.omid.library.bigosg.adsession;

import com.iab.omid.library.bigosg.d.b;
import com.iab.omid.library.bigosg.d.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z2) {
        this.creativeType = creativeType;
        this.impressionType = impressionType;
        this.impressionOwner = owner;
        if (owner2 == null) {
            this.mediaEventsOwner = Owner.NONE;
        } else {
            this.mediaEventsOwner = owner2;
        }
        this.isolateVerificationScripts = z2;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType, ImpressionType impressionType, Owner owner, Owner owner2, boolean z2) {
        e.a(creativeType, "CreativeType is null");
        e.a(impressionType, "ImpressionType is null");
        e.a(owner, "Impression owner is null");
        e.a(owner, creativeType, impressionType);
        return new AdSessionConfiguration(creativeType, impressionType, owner, owner2, z2);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public boolean isNativeVideoEventsOwner() {
        return isNativeMediaEventsOwner();
    }

    public JSONObject toJsonObject() {
        String str;
        Object obj;
        JSONObject jSONObject = new JSONObject();
        b.a(jSONObject, "impressionOwner", this.impressionOwner);
        if (this.creativeType == null || this.impressionType == null) {
            str = "videoEventsOwner";
            obj = this.mediaEventsOwner;
        } else {
            b.a(jSONObject, "mediaEventsOwner", this.mediaEventsOwner);
            b.a(jSONObject, "creativeType", this.creativeType);
            str = "impressionType";
            obj = this.impressionType;
        }
        b.a(jSONObject, str, obj);
        b.a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject;
    }

    @Deprecated
    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2) {
        return createAdSessionConfiguration(owner, owner2, true);
    }

    public static AdSessionConfiguration createAdSessionConfiguration(Owner owner, Owner owner2, boolean z2) {
        e.a(owner, "Impression owner is null");
        e.a(owner, (CreativeType) null, (ImpressionType) null);
        return new AdSessionConfiguration(null, null, owner, owner2, z2);
    }
}
