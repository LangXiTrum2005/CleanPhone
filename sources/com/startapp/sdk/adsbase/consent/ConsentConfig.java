package com.startapp.sdk.adsbase.consent;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class ConsentConfig implements Serializable {
    private static final long serialVersionUID = -8539908407395078756L;
    private boolean allowCT;
    private String clickUrl;
    private Integer consentType;

    @TypeInfo(complex = true)
    private ConsentTypeInfoConfig consentTypeInfo;
    private String dParam;
    private boolean detectConsentCovering;
    private String impressionUrl;
    private String template;
    private Integer templateId;
    private Integer templateName;
    private long timeStamp = 0;

    @TypeInfo(complex = true)
    private ComponentInfoEventConfig infoEvents = null;

    public final String a() {
        return this.clickUrl;
    }

    public final Integer b() {
        return this.consentType;
    }

    public final ConsentTypeInfoConfig c() {
        return this.consentTypeInfo;
    }

    public final String d() {
        return this.dParam;
    }

    public final String e() {
        return this.impressionUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ConsentConfig.class == obj.getClass()) {
            ConsentConfig consentConfig = (ConsentConfig) obj;
            if (this.allowCT == consentConfig.allowCT && this.detectConsentCovering == consentConfig.detectConsentCovering && this.timeStamp == consentConfig.timeStamp && vi.a((Object) this.consentType, (Object) consentConfig.consentType) && vi.a((Object) this.template, (Object) consentConfig.template) && vi.a((Object) this.impressionUrl, (Object) consentConfig.impressionUrl) && vi.a((Object) this.clickUrl, (Object) consentConfig.clickUrl) && vi.a((Object) this.templateName, (Object) consentConfig.templateName) && vi.a((Object) this.templateId, (Object) consentConfig.templateId) && vi.a((Object) this.dParam, (Object) consentConfig.dParam) && vi.a((Object) this.consentTypeInfo, (Object) consentConfig.consentTypeInfo) && vi.a((Object) this.infoEvents, (Object) consentConfig.infoEvents)) {
                return true;
            }
        }
        return false;
    }

    public final ComponentInfoEventConfig f() {
        return this.infoEvents;
    }

    public final String g() {
        return this.template;
    }

    public final Integer h() {
        return this.templateId;
    }

    public final int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.allowCT), Boolean.valueOf(this.detectConsentCovering), this.consentType, this.template, Long.valueOf(this.timeStamp), this.impressionUrl, this.clickUrl, this.templateName, this.templateId, this.dParam, this.consentTypeInfo, this.infoEvents};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public final Integer i() {
        return this.templateName;
    }

    public final long j() {
        return this.timeStamp;
    }

    public final boolean k() {
        return this.detectConsentCovering;
    }

    public final boolean l() {
        return this.allowCT;
    }
}
