package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import reeve.beachfront;
import reeve.cutely;
import reeve.dern;
import reeve.impromptu;
import reeve.saneness;
import reeve.taiyuan;
import reeve.wireman;
import spissatus.competently;
import umbriferous.hydrovane;
import umbriferous.kattegat;
import umbriferous.stratoscope;
import umbriferous.trm;

/* JADX INFO: compiled from: SettingsController.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f22440attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final cutely f22441beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final trm f22442competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final beachfront f22443dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final AtomicReference<wireman> f22444impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final reeve.attabal f22445marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final taiyuan f22446saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<wireman>> f22447taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final stratoscope f22448wireman;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.settings.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SettingsController.java */
    public class C0321attabal implements SuccessContinuation<Void, Void> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ CrashlyticsWorkers f22449attabal;

        public C0321attabal(CrashlyticsWorkers crashlyticsWorkers) {
            this.f22449attabal = crashlyticsWorkers;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Task<Void> then(Void r5) throws Exception {
            JSONObject jSONObject = (JSONObject) this.f22449attabal.network.dern().submit(new Callable() { // from class: reeve.marial
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.firebase.crashlytics.internal.settings.attabal.C0321attabal c0321attabal = this.f36169kowloon;
                    return com.google.firebase.crashlytics.internal.settings.attabal.this.f22441beachfront.attabal(com.google.firebase.crashlytics.internal.settings.attabal.this.f22446saneness, true);
                }
            }).get();
            if (jSONObject != null) {
                wireman wiremanVarSaneness = attabal.this.f22443dern.saneness(jSONObject);
                attabal.this.f22445marial.dern(wiremanVarSaneness.f36182dern, jSONObject);
                attabal.this.monoploid(jSONObject, "Loaded settings: ");
                attabal attabalVar = attabal.this;
                attabalVar.polloi(attabalVar.f22446saneness.f36171beachfront);
                attabal.this.f22444impromptu.set(wiremanVarSaneness);
                ((TaskCompletionSource) attabal.this.f22447taiyuan.get()).trySetResult(wiremanVarSaneness);
            }
            return Tasks.forResult(null);
        }
    }

    public attabal(Context context, taiyuan taiyuanVar, stratoscope stratoscopeVar, beachfront beachfrontVar, reeve.attabal attabalVar, cutely cutelyVar, trm trmVar) {
        AtomicReference<wireman> atomicReference = new AtomicReference<>();
        this.f22444impromptu = atomicReference;
        this.f22447taiyuan = new AtomicReference<>(new TaskCompletionSource());
        this.f22440attabal = context;
        this.f22446saneness = taiyuanVar;
        this.f22448wireman = stratoscopeVar;
        this.f22443dern = beachfrontVar;
        this.f22445marial = attabalVar;
        this.f22441beachfront = cutelyVar;
        this.f22442competently = trmVar;
        atomicReference.set(saneness.saneness(stratoscopeVar));
    }

    public static attabal formularize(Context context, String str, kattegat kattegatVar, abortive.saneness sanenessVar, String str2, String str3, competently competentlyVar, trm trmVar) {
        String strCompetently = kattegatVar.competently();
        hydrovane hydrovaneVar = new hydrovane();
        return new attabal(context, new taiyuan(str, kattegatVar.impromptu(), kattegatVar.taiyuan(), kattegatVar.cutely(), kattegatVar, CommonUtils.impromptu(CommonUtils.impassible(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(strCompetently).getId()), hydrovaneVar, new beachfront(hydrovaneVar), new reeve.attabal(competentlyVar), new dern(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), sanenessVar), trmVar);
    }

    public boolean apical() {
        return !triweekly().equals(this.f22446saneness.f36171beachfront);
    }

    public Task<Void> arytenoidectomy(SettingsCacheBehavior settingsCacheBehavior, CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        wireman wiremanVarImpassible;
        if (!apical() && (wiremanVarImpassible = impassible(settingsCacheBehavior)) != null) {
            this.f22444impromptu.set(wiremanVarImpassible);
            this.f22447taiyuan.get().trySetResult(wiremanVarImpassible);
            return Tasks.forResult(null);
        }
        wireman wiremanVarImpassible2 = impassible(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (wiremanVarImpassible2 != null) {
            this.f22444impromptu.set(wiremanVarImpassible2);
            this.f22447taiyuan.get().trySetResult(wiremanVarImpassible2);
        }
        return this.f22442competently.apical().onSuccessTask(crashlyticsWorkers.common, new C0321attabal(crashlyticsWorkers));
    }

    @Override // reeve.impromptu
    public Task<wireman> attabal() {
        return this.f22447taiyuan.get().getTask();
    }

    public final wireman impassible(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        wireman wiremanVar = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject jSONObjectSaneness = this.f22445marial.saneness();
                if (jSONObjectSaneness != null) {
                    wireman wiremanVarSaneness = this.f22443dern.saneness(jSONObjectSaneness);
                    if (wiremanVarSaneness == null) {
                        gelandelaufer.competently.beachfront().marial("Failed to parse cached settings data.", null);
                        return null;
                    }
                    monoploid(jSONObjectSaneness, "Loaded cached settings: ");
                    long jAttabal = this.f22448wireman.attabal();
                    if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && wiremanVarSaneness.attabal(jAttabal)) {
                        gelandelaufer.competently.beachfront().taiyuan("Cached settings have expired.");
                        return null;
                    }
                    try {
                        gelandelaufer.competently.beachfront().taiyuan("Returning cached settings.");
                        return wiremanVarSaneness;
                    } catch (Exception e) {
                        e = e;
                        wiremanVar = wiremanVarSaneness;
                        gelandelaufer.competently.beachfront().marial("Failed to get cached settings", e);
                        return wiremanVar;
                    }
                }
                gelandelaufer.competently.beachfront().saneness("No cached settings data found.");
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public Task<Void> kowloon(CrashlyticsWorkers crashlyticsWorkers) {
        return arytenoidectomy(SettingsCacheBehavior.USE_CACHE, crashlyticsWorkers);
    }

    public final void monoploid(JSONObject jSONObject, String str) {
        gelandelaufer.competently.beachfront().saneness(str + jSONObject.toString());
    }

    public final boolean polloi(String str) {
        SharedPreferences.Editor editorEdit = CommonUtils.monoploid(this.f22440attabal).edit();
        editorEdit.putString("existing_instance_identifier", str);
        editorEdit.apply();
        return true;
    }

    @Override // reeve.impromptu
    public wireman saneness() {
        return this.f22444impromptu.get();
    }

    public final String triweekly() {
        return CommonUtils.monoploid(this.f22440attabal).getString("existing_instance_identifier", "");
    }
}
