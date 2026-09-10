package com.google.firebase.crashlytics.internal.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/crashlytics/internal/common/FirebaseInstallationId;", "", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FirebaseInstallationId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20355b;

    public FirebaseInstallationId(String str, String str2) {
        this.f20354a = str;
        this.f20355b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) obj;
        return Intrinsics.a(this.f20354a, firebaseInstallationId.f20354a) && Intrinsics.a(this.f20355b, firebaseInstallationId.f20355b);
    }

    public final int hashCode() {
        String str = this.f20354a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20355b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.f20354a);
        sb.append(", authToken=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.f20355b, ')');
    }
}
