package com.chartboost.heliumsdk.controllers;

import android.content.Context;
import android.content.SharedPreferences;
import com.chartboost.heliumsdk.PartnerConsents;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 '2\u00020\u0001:\u0003'()B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0017\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020$H\u0002J\r\u0010%\u001a\u00020$H\u0000¢\u0006\u0002\b&R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\r¨\u0006*"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/PrivacyController;", "", "context", "Landroid/content/Context;", "partnerConsents", "Lcom/chartboost/heliumsdk/PartnerConsents;", "(Landroid/content/Context;Lcom/chartboost/heliumsdk/PartnerConsents;)V", "value", "", "ccpaConsent", "getCcpaConsent", "()Ljava/lang/Boolean;", "setCcpaConsent", "(Ljava/lang/Boolean;)V", "coppa", "getCoppa", "setCoppa", "", "gdpr", "getGdpr", "()I", "setGdpr", "(I)V", "hasUpdatedFromDisk", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "userConsent", "getUserConsent", "setUserConsent", "booleanToInt", "bool", "intToBoolean", "int", "(I)Ljava/lang/Boolean;", "savePartnerConsentsToDisk", "", "updatePartnerConsentsFromDisk", "updatePartnerConsentsFromDisk$Helium_release", "Companion", "PrivacySetting", "PrivacyString", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PrivacyController {
    private static final String HELIUM_PARTNER_CONSENTS_MAP_KEY = "helium_partner_consents_map";
    private static final String heliumCcpaConsentKey = "helium_ccpa_consent";
    private static final String heliumCoppaKey = "helium_coppa";
    private static final String heliumGdprKey = "helium_GDPR";
    private static final String heliumPrivacyIdentifier = "helium_privacy_id";
    private static final String heliumUserConsentKey = "helium_user_consent";
    private boolean hasUpdatedFromDisk;
    private final PartnerConsents partnerConsents;
    private final SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/PrivacyController$PrivacySetting;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "TRUE", "FALSE", "UNSET", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PrivacySetting {
        TRUE(1),
        FALSE(0),
        UNSET(-1);

        private final int value;

        PrivacySetting(int i2) {
            this.value = i2;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/PrivacyController$PrivacyString;", "", "consentString", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getConsentString", "()Ljava/lang/String;", "GRANTED", "DENIED", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PrivacyString {
        GRANTED("1YN-"),
        DENIED("1YY-");

        private final String consentString;

        PrivacyString(String str) {
            this.consentString = str;
        }

        public final String getConsentString() {
            return this.consentString;
        }
    }

    public PrivacyController(Context context, PartnerConsents partnerConsents) {
        Intrinsics.f(context, "context");
        Intrinsics.f(partnerConsents, "partnerConsents");
        this.partnerConsents = partnerConsents;
        partnerConsents.addPartnerConsentsObserver$Helium_release(new PartnerConsents.PartnerConsentsObserver() { // from class: com.chartboost.heliumsdk.controllers.PrivacyController.1
            @Override // com.chartboost.heliumsdk.PartnerConsents.PartnerConsentsObserver
            public void onPartnerConsentsUpdated() {
                PrivacyController.this.savePartnerConsentsToDisk();
            }
        });
        this.sharedPreferences = context.getSharedPreferences(heliumPrivacyIdentifier, 0);
    }

    private final int booleanToInt(boolean bool) {
        if (bool) {
            return PrivacySetting.TRUE.getValue();
        }
        if (bool) {
            throw new NoWhenBranchMatchedException();
        }
        return PrivacySetting.FALSE.getValue();
    }

    private final Boolean intToBoolean(int i2) {
        if (i2 == PrivacySetting.TRUE.getValue()) {
            return Boolean.TRUE;
        }
        if (i2 == PrivacySetting.FALSE.getValue()) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void savePartnerConsentsToDisk() {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putString(HELIUM_PARTNER_CONSENTS_MAP_KEY, new JSONObject(this.partnerConsents.getPartnerIdToConsentGivenMapCopy()).toString());
        editorEdit.apply();
    }

    public final Boolean getCcpaConsent() {
        if (this.sharedPreferences.contains(heliumCcpaConsentKey)) {
            return Boolean.valueOf(this.sharedPreferences.getBoolean(heliumCcpaConsentKey, false));
        }
        return null;
    }

    public final Boolean getCoppa() {
        return intToBoolean(this.sharedPreferences.getInt(heliumCoppaKey, PrivacySetting.FALSE.getValue()));
    }

    public final int getGdpr() {
        return this.sharedPreferences.getInt(heliumGdprKey, PrivacySetting.UNSET.getValue());
    }

    public final Boolean getUserConsent() {
        return intToBoolean(this.sharedPreferences.getInt(heliumUserConsentKey, -1));
    }

    public final void setCcpaConsent(Boolean bool) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean(heliumCcpaConsentKey, bool.booleanValue());
            editorEdit.apply();
        }
    }

    public final void setCoppa(Boolean bool) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putInt(heliumCoppaKey, booleanToInt(bool.booleanValue()));
            editorEdit.apply();
        }
    }

    public final void setGdpr(int i2) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        editorEdit.putInt(heliumGdprKey, booleanToInt(i2 == PrivacySetting.TRUE.getValue()));
        editorEdit.apply();
    }

    public final void setUserConsent(Boolean bool) {
        SharedPreferences.Editor editorEdit = this.sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putInt(heliumUserConsentKey, booleanToInt(bool.booleanValue()));
            editorEdit.apply();
        }
    }

    public final void updatePartnerConsentsFromDisk$Helium_release() {
        if (this.hasUpdatedFromDisk) {
            return;
        }
        this.hasUpdatedFromDisk = true;
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        BuildersKt.c(CoroutineScopeKt.a(DefaultIoScheduler.f45062Y), null, null, new PrivacyController$updatePartnerConsentsFromDisk$1(this, null), 3);
    }
}
