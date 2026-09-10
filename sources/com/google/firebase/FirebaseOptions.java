package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20156c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20157e;
    public final String f;
    public final String g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f20158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20159b;
    }

    public FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f20155b = str;
        this.f20154a = str2;
        this.f20156c = str3;
        this.d = str4;
        this.f20157e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static FirebaseOptions a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new FirebaseOptions(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.equal(this.f20155b, firebaseOptions.f20155b) && Objects.equal(this.f20154a, firebaseOptions.f20154a) && Objects.equal(this.f20156c, firebaseOptions.f20156c) && Objects.equal(this.d, firebaseOptions.d) && Objects.equal(this.f20157e, firebaseOptions.f20157e) && Objects.equal(this.f, firebaseOptions.f) && Objects.equal(this.g, firebaseOptions.g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f20155b, this.f20154a, this.f20156c, this.d, this.f20157e, this.f, this.g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f20155b).add("apiKey", this.f20154a).add("databaseUrl", this.f20156c).add("gcmSenderId", this.f20157e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}
