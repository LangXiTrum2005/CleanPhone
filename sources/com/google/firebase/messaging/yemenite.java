package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.ironsource.L6;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: GmsRpc.java */
/* JADX INFO: loaded from: classes3.dex */
public class yemenite {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final iiion.beachfront f22779attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final ingathering.competently f22780beachfront;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Rpc f22781dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final friedmanite.saneness<HeartBeatInfo> f22782marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final merc f22783saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final friedmanite.saneness<hint.taiyuan> f22784wireman;

    public yemenite(iiion.beachfront beachfrontVar, merc mercVar, friedmanite.saneness<hint.taiyuan> sanenessVar, friedmanite.saneness<HeartBeatInfo> sanenessVar2, ingathering.competently competentlyVar) {
        this(beachfrontVar, mercVar, new Rpc(beachfrontVar.apical()), sanenessVar, sanenessVar2, competentlyVar);
    }

    public static /* synthetic */ String attabal(yemenite yemeniteVar, Task task) {
        yemeniteVar.getClass();
        return yemeniteVar.competently((Bundle) task.getResult(IOException.class));
    }

    public static boolean impromptu(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public static String saneness(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public final Task<Bundle> apical(String str, String str2, Bundle bundle) {
        try {
            taiyuan(str, str2, bundle);
            return this.f22781dern.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }

    public Task<String> beachfront() {
        return dern(apical(merc.dern(this.f22779attabal), "*", new Bundle()));
    }

    public final String competently(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        bundle.toString();
        new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public Task<Void> cutely(boolean z) {
        return this.f22781dern.setRetainProxiedNotifications(z);
    }

    public final Task<String> dern(Task<Bundle> task) {
        return task.continueWith(new androidx.privacysandbox.ads.adservices.measurement.cutely(), new Continuation() { // from class: com.google.firebase.messaging.oilcan
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return yemenite.attabal(this.f22684attabal, task2);
            }
        });
    }

    public Task<?> formularize(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return dern(apical(str, "/topics/" + str2, bundle));
    }

    public Task<?> impassible(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return dern(apical(str, "/topics/" + str2, bundle));
    }

    public Task<CloudMessage> marial() {
        return this.f22781dern.getProxiedNotificationData();
    }

    public final void taiyuan(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        HeartBeatInfo.HeartBeat heartBeatSaneness;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f22779attabal.kowloon().dern());
        bundle.putString("gmsv", Integer.toString(this.f22783saneness.wireman()));
        bundle.putString(L6.G, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f22783saneness.attabal());
        bundle.putString("app_ver_name", this.f22783saneness.saneness());
        bundle.putString("firebase-app-name-hash", wireman());
        try {
            String strSaneness = ((ingathering.apical) Tasks.await(this.f22780beachfront.attabal(false))).saneness();
            if (!TextUtils.isEmpty(strSaneness)) {
                bundle.putString("Goog-Firebase-Installations-Auth", strSaneness);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) Tasks.await(this.f22780beachfront.getId()));
        bundle.putString("cliv", "fcm-24.1.1");
        HeartBeatInfo heartBeatInfo = this.f22782marial.get();
        hint.taiyuan taiyuanVar = this.f22784wireman.get();
        if (heartBeatInfo == null || taiyuanVar == null || (heartBeatSaneness = heartBeatInfo.saneness("fire-iid")) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatSaneness.getCode()));
        bundle.putString("Firebase-Client", taiyuanVar.getUserAgent());
    }

    public final String wireman() {
        try {
            return saneness(MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1).digest(this.f22779attabal.triweekly().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public yemenite(iiion.beachfront beachfrontVar, merc mercVar, Rpc rpc, friedmanite.saneness<hint.taiyuan> sanenessVar, friedmanite.saneness<HeartBeatInfo> sanenessVar2, ingathering.competently competentlyVar) {
        this.f22779attabal = beachfrontVar;
        this.f22783saneness = mercVar;
        this.f22781dern = rpc;
        this.f22784wireman = sanenessVar;
        this.f22782marial = sanenessVar2;
        this.f22780beachfront = competentlyVar;
    }
}
