package iiion;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: compiled from: FirebaseOptions.java */
/* JADX INFO: loaded from: classes3.dex */
public final class impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f28429attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final String f28430beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final String f28431competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final String f28432dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f28433marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f28434saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final String f28435wireman;

    public impassible(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f28434saneness = str;
        this.f28429attabal = str2;
        this.f28432dern = str3;
        this.f28435wireman = str4;
        this.f28433marial = str5;
        this.f28430beachfront = str6;
        this.f28431competently = str7;
    }

    public static impassible attabal(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new impassible(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public String dern() {
        return this.f28434saneness;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof impassible)) {
            return false;
        }
        impassible impassibleVar = (impassible) obj;
        return Objects.equal(this.f28434saneness, impassibleVar.f28434saneness) && Objects.equal(this.f28429attabal, impassibleVar.f28429attabal) && Objects.equal(this.f28432dern, impassibleVar.f28432dern) && Objects.equal(this.f28435wireman, impassibleVar.f28435wireman) && Objects.equal(this.f28433marial, impassibleVar.f28433marial) && Objects.equal(this.f28430beachfront, impassibleVar.f28430beachfront) && Objects.equal(this.f28431competently, impassibleVar.f28431competently);
    }

    public int hashCode() {
        return Objects.hashCode(this.f28434saneness, this.f28429attabal, this.f28432dern, this.f28435wireman, this.f28433marial, this.f28430beachfront, this.f28431competently);
    }

    public String marial() {
        return this.f28431competently;
    }

    public String saneness() {
        return this.f28429attabal;
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f28434saneness).add("apiKey", this.f28429attabal).add("databaseUrl", this.f28432dern).add("gcmSenderId", this.f28433marial).add("storageBucket", this.f28430beachfront).add("projectId", this.f28431competently).toString();
    }

    public String wireman() {
        return this.f28433marial;
    }
}
