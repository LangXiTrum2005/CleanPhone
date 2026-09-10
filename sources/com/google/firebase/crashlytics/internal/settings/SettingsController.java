package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.mbridge.msdk.foundation.download.Command;
import com.smartdigimkt.v0.k;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class SettingsController implements SettingsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettingsRequest f20756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SettingsJsonParser f20757c;
    public final SystemCurrentTimeProvider d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CachedSettingsIo f20758e;
    public final DefaultSettingsSpiCall f;
    public final DataCollectionArbiter g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f20759h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f20760i;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1, reason: invalid class name */
    class AnonymousClass1 implements SuccessContinuation<Void, Void> {
        public final /* synthetic */ CrashlyticsWorkers X;

        public AnonymousClass1(CrashlyticsWorkers crashlyticsWorkers) {
            this.X = crashlyticsWorkers;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Void> then(Void r10) throws Throwable {
            FileWriter fileWriter;
            JSONObject jSONObject = (JSONObject) this.X.f20378c.X.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.settings.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SettingsController settingsController = SettingsController.this;
                    DefaultSettingsSpiCall defaultSettingsSpiCall = settingsController.f;
                    SettingsRequest settingsRequest = settingsController.f20756b;
                    String str = defaultSettingsSpiCall.f20745a;
                    Logger logger = Logger.f20289a;
                    CrashlyticsWorkers.b();
                    try {
                        HashMap mapB = DefaultSettingsSpiCall.b(settingsRequest);
                        HttpGetRequest httpGetRequest = new HttpGetRequest(str, mapB);
                        httpGetRequest.c(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/20.0.3");
                        httpGetRequest.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                        DefaultSettingsSpiCall.a(httpGetRequest, settingsRequest);
                        logger.b("Requesting settings from ".concat(str), null);
                        logger.e("Settings query params were: " + mapB);
                        return defaultSettingsSpiCall.c(httpGetRequest.b());
                    } catch (IOException e2) {
                        logger.c(e2, "Settings request failed.");
                        return null;
                    }
                }
            }).get();
            FileWriter fileWriter2 = null;
            if (jSONObject != null) {
                SettingsController settingsController = SettingsController.this;
                Settings settingsA = settingsController.f20757c.a(jSONObject);
                long j = settingsA.f20748c;
                CachedSettingsIo cachedSettingsIo = settingsController.f20758e;
                cachedSettingsIo.getClass();
                Logger logger = Logger.f20289a;
                logger.e("Writing settings to cache file...");
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(cachedSettingsIo.f20744a);
                    try {
                        try {
                            fileWriter.write(jSONObject.toString());
                            fileWriter.flush();
                        } catch (Throwable th) {
                            th = th;
                            fileWriter2 = fileWriter;
                            CommonUtils.b(fileWriter2, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        logger.c(e, "Failed to cache settings");
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileWriter = null;
                } catch (Throwable th2) {
                    th = th2;
                    CommonUtils.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
                CommonUtils.b(fileWriter, "Failed to close settings writer.");
                logger.b("Loaded settings: " + jSONObject.toString(), null);
                String str = settingsController.f20756b.f;
                SharedPreferences.Editor editorEdit = settingsController.f20755a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit.putString("existing_instance_identifier", str);
                editorEdit.apply();
                settingsController.f20759h.set(settingsA);
                ((TaskCompletionSource) settingsController.f20760i.get()).trySetResult(settingsA);
            }
            return Tasks.forResult(null);
        }
    }

    public SettingsController(Context context, SettingsRequest settingsRequest, SystemCurrentTimeProvider systemCurrentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, DefaultSettingsSpiCall defaultSettingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference atomicReference = new AtomicReference();
        this.f20759h = atomicReference;
        this.f20760i = new AtomicReference(new TaskCompletionSource());
        this.f20755a = context;
        this.f20756b = settingsRequest;
        this.d = systemCurrentTimeProvider;
        this.f20757c = settingsJsonParser;
        this.f20758e = cachedSettingsIo;
        this.f = defaultSettingsSpiCall;
        this.g = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.b(systemCurrentTimeProvider));
    }

    public static SettingsController a(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String strD = idManager.d();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        SettingsJsonParser settingsJsonParser = new SettingsJsonParser(systemCurrentTimeProvider);
        CachedSettingsIo cachedSettingsIo = new CachedSettingsIo(fileStore);
        Locale locale = Locale.US;
        DefaultSettingsSpiCall defaultSettingsSpiCall = new DefaultSettingsSpiCall(android.support.v4.media.a.n("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str, "/settings"), httpRequestFactory);
        String str4 = Build.MANUFACTURER;
        String str5 = IdManager.f20356h;
        String strD2 = android.support.v4.media.a.D(str4.replaceAll(str5, ""), "/", Build.MODEL.replaceAll(str5, ""));
        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str5, "");
        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str5, "");
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", k.f38992h);
        if (iD == 0) {
            iD = CommonUtils.d(context, "com.crashlytics.android.build_id", k.f38992h);
        }
        String[] strArr = {iD != 0 ? context.getResources().getString(iD) : null, str, str3, str2};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            String str6 = strArr[i2];
            if (str6 != null) {
                arrayList.add(str6.replace(TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        return new SettingsController(context, new SettingsRequest(str, strD2, strReplaceAll, strReplaceAll2, idManager, string.length() > 0 ? CommonUtils.h(string) : null, str3, str2, (strD != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).X), systemCurrentTimeProvider, settingsJsonParser, cachedSettingsIo, defaultSettingsSpiCall, dataCollectionArbiter);
    }

    public final Settings b(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        Logger logger = Logger.f20289a;
        Settings settings = null;
        try {
            if (!SettingsCacheBehavior.f20754Y.equals(settingsCacheBehavior)) {
                JSONObject jSONObjectA = this.f20758e.a();
                if (jSONObjectA != null) {
                    Settings settingsA = this.f20757c.a(jSONObjectA);
                    logger.b("Loaded cached settings: " + jSONObjectA.toString(), null);
                    this.d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!SettingsCacheBehavior.Z.equals(settingsCacheBehavior) && settingsA.f20748c < jCurrentTimeMillis) {
                        logger.e("Cached settings have expired.");
                        return null;
                    }
                    try {
                        logger.e("Returning cached settings.");
                        return settingsA;
                    } catch (Exception e2) {
                        e = e2;
                        settings = settingsA;
                        logger.c(e, "Failed to get cached settings");
                        return settings;
                    }
                }
                logger.b("No cached settings data found.", null);
            }
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final Task c() {
        return ((TaskCompletionSource) this.f20760i.get()).getTask();
    }

    public final Settings d() {
        return (Settings) this.f20759h.get();
    }

    public final Task e(CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        Task task;
        Settings settingsB;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.X;
        boolean zEquals = this.f20755a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.f20756b.f);
        AtomicReference atomicReference = this.f20760i;
        AtomicReference atomicReference2 = this.f20759h;
        if (zEquals && (settingsB = b(settingsCacheBehavior)) != null) {
            atomicReference2.set(settingsB);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(settingsB);
            return Tasks.forResult(null);
        }
        Settings settingsB2 = b(SettingsCacheBehavior.Z);
        if (settingsB2 != null) {
            atomicReference2.set(settingsB2);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(settingsB2);
        }
        DataCollectionArbiter dataCollectionArbiter = this.g;
        Task task2 = dataCollectionArbiter.f.getTask();
        synchronized (dataCollectionArbiter.f20350b) {
            task = dataCollectionArbiter.f20351c.getTask();
        }
        return CrashlyticsTasks.a(task2, task).onSuccessTask(crashlyticsWorkers.f20376a, new AnonymousClass1(crashlyticsWorkers));
    }
}
