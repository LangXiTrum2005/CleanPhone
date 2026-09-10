package com.kochava.tracker.privacy.internal;

import com.kochava.core.json.internal.JsonObject;
import com.kochava.core.util.internal.ObjectUtil;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class PrivacyProfile implements PrivacyProfileApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f28273c;
    public final String[] d;

    public PrivacyProfile(String str, boolean z2, String[] strArr, String[] strArr2) {
        this.f28271a = str;
        this.f28272b = z2;
        this.f28273c = strArr;
        this.d = strArr2;
    }

    @Override // com.kochava.tracker.privacy.internal.PrivacyProfileApi
    public final boolean a() {
        return this.f28272b;
    }

    @Override // com.kochava.tracker.privacy.internal.PrivacyProfileApi
    public final ArrayList b() {
        PayloadType payloadType;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f28273c) {
            PayloadType[] payloadTypeArrValues = PayloadType.values();
            int length = payloadTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    payloadType = null;
                    break;
                }
                payloadType = payloadTypeArrValues[i2];
                if (payloadType.X.equals(str)) {
                    break;
                }
                i2++;
            }
            if (payloadType != null) {
                arrayList.add(payloadType);
            }
        }
        return arrayList;
    }

    @Override // com.kochava.tracker.privacy.internal.PrivacyProfileApi
    public final ArrayList c() {
        return new ArrayList(Arrays.asList(this.d));
    }

    public final synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (PrivacyProfile.class == obj.getClass()) {
                PrivacyProfile privacyProfile = (PrivacyProfile) obj;
                return this.f28272b == privacyProfile.f28272b && this.f28271a.equals(privacyProfile.f28271a) && Arrays.equals(this.f28273c, privacyProfile.f28273c) && Arrays.equals(this.d, privacyProfile.d);
            }
        }
        return false;
    }

    @Override // com.kochava.tracker.privacy.internal.PrivacyProfileApi
    public final String getName() {
        return this.f28271a;
    }

    public final synchronized int hashCode() {
        return toJson().toString().hashCode();
    }

    @Override // com.kochava.tracker.privacy.internal.PrivacyProfileApi
    public final JsonObject toJson() {
        JsonObject jsonObjectW = JsonObject.w();
        jsonObjectW.g("name", this.f28271a);
        jsonObjectW.o("sleep", this.f28272b);
        jsonObjectW.A("payloads", ObjectUtil.p(this.f28273c));
        jsonObjectW.A("keys", ObjectUtil.p(this.d));
        return jsonObjectW;
    }
}
