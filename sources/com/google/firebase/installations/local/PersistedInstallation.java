package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class PersistedInstallation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f20870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseApp f20871b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RegistrationStatus {
        public static final RegistrationStatus X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final RegistrationStatus f20872Y;
        public static final RegistrationStatus Z;
        public static final RegistrationStatus e0;
        public static final RegistrationStatus f0;
        public static final /* synthetic */ RegistrationStatus[] g0;

        static {
            RegistrationStatus registrationStatus = new RegistrationStatus("ATTEMPT_MIGRATION", 0);
            X = registrationStatus;
            RegistrationStatus registrationStatus2 = new RegistrationStatus("NOT_GENERATED", 1);
            f20872Y = registrationStatus2;
            RegistrationStatus registrationStatus3 = new RegistrationStatus("UNREGISTERED", 2);
            Z = registrationStatus3;
            RegistrationStatus registrationStatus4 = new RegistrationStatus("REGISTERED", 3);
            e0 = registrationStatus4;
            RegistrationStatus registrationStatus5 = new RegistrationStatus("REGISTER_ERROR", 4);
            f0 = registrationStatus5;
            g0 = new RegistrationStatus[]{registrationStatus, registrationStatus2, registrationStatus3, registrationStatus4, registrationStatus5};
        }

        public static RegistrationStatus valueOf(String str) {
            return (RegistrationStatus) Enum.valueOf(RegistrationStatus.class, str);
        }

        public static RegistrationStatus[] values() {
            return (RegistrationStatus[]) g0.clone();
        }
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.f20871b = firebaseApp;
    }

    public final File a() {
        if (this.f20870a == null) {
            synchronized (this) {
                try {
                    if (this.f20870a == null) {
                        FirebaseApp firebaseApp = this.f20871b;
                        firebaseApp.a();
                        this.f20870a = new File(firebaseApp.f20145a.getFilesDir(), "PersistedInstallation." + this.f20871b.d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f20870a;
    }

    public final void b(PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.c());
            jSONObject.put("Status", persistedInstallationEntry.f().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.a());
            jSONObject.put("RefreshToken", persistedInstallationEntry.e());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.g());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.b());
            jSONObject.put("FisError", persistedInstallationEntry.d());
            FirebaseApp firebaseApp = this.f20871b;
            firebaseApp.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp.f20145a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final PersistedInstallationEntry c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, 16384);
                    if (i2 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i3 = PersistedInstallationEntry.f20873a;
        AutoValue_PersistedInstallationEntry.Builder builder = new AutoValue_PersistedInstallationEntry.Builder();
        builder.g(0L);
        builder.f20863b = RegistrationStatus.X;
        builder.c(0L);
        builder.f20862a = strOptString;
        builder.f(RegistrationStatus.values()[iOptInt]);
        builder.f20864c = strOptString2;
        builder.d = strOptString3;
        builder.g(jOptLong);
        builder.c(jOptLong2);
        builder.g = strOptString4;
        return builder.a();
    }
}
