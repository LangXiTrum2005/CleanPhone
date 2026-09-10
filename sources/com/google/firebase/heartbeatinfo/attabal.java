package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import friedmanite.saneness;
import hint.taiyuan;
import inblowing.competently;
import inblowing.cuirassed;
import inblowing.dern;
import inblowing.monoploid;
import inblowing.wireman;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import polonize.beachfront;
import polonize.impromptu;
import polonize.kowloon;
import polonize.triweekly;

/* JADX INFO: compiled from: DefaultHeartBeatController.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements impromptu, HeartBeatInfo {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final saneness<triweekly> f22467attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness<taiyuan> f22468dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final Executor f22469marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Context f22470saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Set<beachfront> f22471wireman;

    public attabal(final Context context, final String str, Set<beachfront> set, saneness<taiyuan> sanenessVar, Executor executor) {
        this((saneness<triweekly>) new saneness() { // from class: polonize.marial
            @Override // friedmanite.saneness
            public final Object get() {
                return com.google.firebase.heartbeatinfo.attabal.wireman(context, str);
            }
        }, set, executor, sanenessVar, context);
    }

    public static /* synthetic */ Void beachfront(attabal attabalVar) {
        synchronized (attabalVar) {
            attabalVar.f22467attabal.get().apical(System.currentTimeMillis(), attabalVar.f22468dern.get().getUserAgent());
        }
        return null;
    }

    public static dern<attabal> competently() {
        final cuirassed cuirassedVarAttabal = cuirassed.attabal(capsulated.attabal.class, Executor.class);
        return dern.beachfront(attabal.class, impromptu.class, HeartBeatInfo.class).saneness(monoploid.formularize(Context.class)).saneness(monoploid.formularize(iiion.beachfront.class)).saneness(monoploid.kowloon(beachfront.class)).saneness(monoploid.triweekly(taiyuan.class)).saneness(monoploid.apical(cuirassedVarAttabal)).beachfront(new competently() { // from class: polonize.wireman
            @Override // inblowing.competently
            public final Object attabal(inblowing.wireman wiremanVar) {
                return com.google.firebase.heartbeatinfo.attabal.marial(cuirassedVarAttabal, wiremanVar);
            }
        }).wireman();
    }

    public static /* synthetic */ String dern(attabal attabalVar) {
        String string;
        synchronized (attabalVar) {
            try {
                triweekly triweeklyVar = attabalVar.f22467attabal.get();
                List<kowloon> listDern = triweeklyVar.dern();
                triweeklyVar.saneness();
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < listDern.size(); i++) {
                    kowloon kowloonVar = listDern.get(i);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", kowloonVar.dern());
                    jSONObject.put("dates", new JSONArray((Collection) kowloonVar.saneness()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString(C.UTF8_NAME);
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    public static /* synthetic */ attabal marial(cuirassed cuirassedVar, wireman wiremanVar) {
        return new attabal((Context) wiremanVar.attabal(Context.class), ((iiion.beachfront) wiremanVar.attabal(iiion.beachfront.class)).arytenoidectomy(), (Set<beachfront>) wiremanVar.wireman(beachfront.class), (saneness<taiyuan>) wiremanVar.beachfront(taiyuan.class), (Executor) wiremanVar.impromptu(cuirassedVar));
    }

    public static /* synthetic */ triweekly wireman(Context context, String str) {
        return new triweekly(context, str);
    }

    @Override // polonize.impromptu
    public Task<String> attabal() {
        return !claque.triweekly.attabal(this.f22470saneness) ? Tasks.forResult("") : Tasks.call(this.f22469marial, new Callable() { // from class: polonize.dern
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.heartbeatinfo.attabal.dern(this.f35550kowloon);
            }
        });
    }

    public Task<Void> impromptu() {
        if (this.f22471wireman.size() <= 0) {
            return Tasks.forResult(null);
        }
        return !claque.triweekly.attabal(this.f22470saneness) ? Tasks.forResult(null) : Tasks.call(this.f22469marial, new Callable() { // from class: polonize.saneness
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.heartbeatinfo.attabal.beachfront(this.f35553kowloon);
            }
        });
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatInfo
    public synchronized HeartBeatInfo.HeartBeat saneness(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        triweekly triweeklyVar = this.f22467attabal.get();
        if (!triweeklyVar.taiyuan(jCurrentTimeMillis)) {
            return HeartBeatInfo.HeartBeat.NONE;
        }
        triweeklyVar.competently();
        return HeartBeatInfo.HeartBeat.GLOBAL;
    }

    public attabal(saneness<triweekly> sanenessVar, Set<beachfront> set, Executor executor, saneness<taiyuan> sanenessVar2, Context context) {
        this.f22467attabal = sanenessVar;
        this.f22471wireman = set;
        this.f22469marial = executor;
        this.f22468dern = sanenessVar2;
        this.f22470saneness = context;
    }
}
