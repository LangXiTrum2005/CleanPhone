package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2323Bu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2897a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public C2323Bu(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.b = str;
        this.f2897a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static C2323Bu a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C2323Bu(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2323Bu)) {
            return false;
        }
        C2323Bu c2323Bu = (C2323Bu) obj;
        return Objects.equal(this.b, c2323Bu.b) && Objects.equal(this.f2897a, c2323Bu.f2897a) && Objects.equal(this.c, c2323Bu.c) && Objects.equal(this.d, c2323Bu.d) && Objects.equal(this.e, c2323Bu.e) && Objects.equal(this.f, c2323Bu.f) && Objects.equal(this.g, c2323Bu.g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.f2897a, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.b).add("apiKey", this.f2897a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}
