package com.nativec.nativetest.util;

import A.W;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.H0;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl;
import com.nativec.nativetest.util.storage.MagicAppPreferencesUtil;
import com.unity3d.ads.adplayer.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import top.canyie.pine.Pine;
import top.canyie.pine.PineConfig;
import top.canyie.pine.callback.MethodHook;

/* JADX INFO: loaded from: classes5.dex */
public class RemoteMagic {
    public static RemoteMagic g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MyApp f33375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FirebaseRemoteConfig f33376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f33377c;
    public double d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f33378e;
    public MHandler f;

    public static class MHandler extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f33380a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            RemoteMagic remoteMagic = (RemoteMagic) this.f33380a.get();
            if (remoteMagic == null || remoteMagic.f33375a == null || message.what != 1) {
                return;
            }
            remoteMagic.a();
        }
    }

    public interface RemoteListener {
    }

    public static void b(MyApp myApp, b bVar) {
        FirebaseApp firebaseApp;
        String str;
        if (g == null) {
            RemoteMagic remoteMagic = new RemoteMagic();
            remoteMagic.d = -1.0d;
            remoteMagic.f33378e = false;
            MHandler mHandler = new MHandler();
            mHandler.f33380a = new WeakReference(remoteMagic);
            remoteMagic.f = mHandler;
            remoteMagic.f33375a = myApp;
            remoteMagic.f33377c = bVar;
            try {
                PineConfig.f48865b = false;
                Pine.e(AdvertisingIdClient.Info.class.getMethod("getId", new Class[0]), new MethodHook() { // from class: com.nativec.nativetest.util.RemoteMagic.1
                    @Override // top.canyie.pine.callback.MethodHook
                    public final void a(Pine.CallFrame callFrame) {
                        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                            if (stackTraceElement.toString() != null && (stackTraceElement.toString().contains("lI丨lii.llliI") || stackTraceElement.toString().contains("com.zg.adlib.ZGAd"))) {
                                return;
                            }
                        }
                        RemoteMagic remoteMagic2 = RemoteMagic.this;
                        if (remoteMagic2.f33378e || !(callFrame.f48858c instanceof String) || TextUtils.isEmpty(MagicAppPreferencesUtil.a(remoteMagic2.f33375a))) {
                            return;
                        }
                        callFrame.f48858c = MagicAppPreferencesUtil.a(remoteMagic2.f33375a);
                        callFrame.d = null;
                        callFrame.f48859e = true;
                    }

                    @Override // top.canyie.pine.callback.MethodHook
                    public final void b(Pine.CallFrame callFrame) {
                    }
                });
            } catch (Exception unused) {
            }
            FirebaseOptions.Builder builder = new FirebaseOptions.Builder();
            builder.f20159b = "m27-3d-charging";
            builder.f20158a = Preconditions.checkNotEmpty("1:537609292767:android:17eee81bb8eb3f5e11526a", "ApplicationId must be set.");
            FirebaseApp.g(myApp, new FirebaseOptions(builder.f20158a, Preconditions.checkNotEmpty("AIzaSyCOODk9gr_IcEfJEOQaPedDqnwn5oDbcz0", "ApiKey must be set."), null, null, null, "m27-3d-charging.firebasestorage.app", builder.f20159b), "FirebaseMagic");
            if (TextUtils.isEmpty(MagicAppPreferencesUtil.a(remoteMagic.f33375a))) {
                synchronized (FirebaseApp.k) {
                    firebaseApp = (FirebaseApp) FirebaseApp.f20144l.get("FirebaseMagic");
                    if (firebaseApp == null) {
                        ArrayList arrayListB = FirebaseApp.b();
                        if (arrayListB.isEmpty()) {
                            str = "";
                        } else {
                            str = "Available app names: " + TextUtils.join(", ", arrayListB);
                        }
                        throw new IllegalStateException("FirebaseApp with name FirebaseMagic doesn't exist. " + str);
                    }
                    ((DefaultHeartBeatController) firebaseApp.f20149h.get()).b();
                }
                firebaseApp.a();
                FirebaseRemoteConfig firebaseRemoteConfigB = ((RemoteConfigComponent) firebaseApp.d.a(RemoteConfigComponent.class)).b();
                remoteMagic.f33376b = firebaseRemoteConfigB;
                FirebaseRemoteConfigSettings.Builder builder2 = new FirebaseRemoteConfigSettings.Builder();
                int[] iArr = ConfigFetchHandler.k;
                builder2.f20918a = 600L;
                FirebaseRemoteConfigSettings firebaseRemoteConfigSettings = new FirebaseRemoteConfigSettings(builder2);
                firebaseRemoteConfigB.getClass();
                Tasks.call(firebaseRemoteConfigB.f20913c, new W(2, firebaseRemoteConfigB, firebaseRemoteConfigSettings));
            }
            remoteMagic.a();
            g = remoteMagic;
        }
    }

    public final void a() {
        if (TextUtils.isEmpty(MagicAppPreferencesUtil.a(this.f33375a))) {
            try {
                this.f33376b.a().addOnCompleteListener(new OnCompleteListener<Boolean>() { // from class: com.nativec.nativetest.util.RemoteMagic.2
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task<Boolean> task) {
                        String string;
                        FirebaseRemoteConfigValueImpl firebaseRemoteConfigValueImpl;
                        if (!task.isSuccessful()) {
                            b bVar = RemoteMagic.this.f33377c;
                            if (bVar != null) {
                                bVar.b();
                            }
                            RemoteMagic.this.f.removeMessages(1);
                            RemoteMagic.this.f.sendEmptyMessageDelayed(1, 900000L);
                            Log.v("charging_config", "fetch fail 2");
                            return;
                        }
                        if (TextUtils.isEmpty(MagicAppPreferencesUtil.a(RemoteMagic.this.f33375a))) {
                            ConfigGetParameterHandler configGetParameterHandler = RemoteMagic.this.f33376b.g;
                            HashSet<String> hashSet = new HashSet();
                            hashSet.addAll(ConfigGetParameterHandler.a(configGetParameterHandler.f20965c));
                            hashSet.addAll(ConfigGetParameterHandler.a(configGetParameterHandler.d));
                            HashMap map = new HashMap();
                            for (String str : hashSet) {
                                ConfigContainer configContainerC = configGetParameterHandler.f20965c.c();
                                String string2 = null;
                                if (configContainerC == null) {
                                    string = null;
                                } else {
                                    try {
                                        string = configContainerC.f20941b.getString(str);
                                    } catch (JSONException unused) {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    ConfigContainer configContainerC2 = configGetParameterHandler.f20965c.c();
                                    if (configContainerC2 != null) {
                                        synchronized (configGetParameterHandler.f20963a) {
                                            try {
                                                Iterator it = configGetParameterHandler.f20963a.iterator();
                                                while (it.hasNext()) {
                                                    configGetParameterHandler.f20964b.execute(new H0((BiConsumer) it.next(), str, configContainerC2, 12));
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    firebaseRemoteConfigValueImpl = new FirebaseRemoteConfigValueImpl(string, 2);
                                } else {
                                    ConfigContainer configContainerC3 = configGetParameterHandler.d.c();
                                    if (configContainerC3 != null) {
                                        try {
                                            string2 = configContainerC3.f20941b.getString(str);
                                        } catch (JSONException unused2) {
                                        }
                                    }
                                    if (string2 != null) {
                                        firebaseRemoteConfigValueImpl = new FirebaseRemoteConfigValueImpl(string2, 1);
                                    } else {
                                        Log.w("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
                                        firebaseRemoteConfigValueImpl = new FirebaseRemoteConfigValueImpl("", 0);
                                    }
                                }
                                map.put(str, firebaseRemoteConfigValueImpl);
                            }
                            for (Map.Entry entry : map.entrySet()) {
                                try {
                                    if ("log_a".equals(entry.getKey())) {
                                        JSONObject jSONObject = new JSONObject(((FirebaseRemoteConfigValue) entry.getValue()).a());
                                        String strOptString = jSONObject.optString("log", "");
                                        String strOptString2 = jSONObject.optString("hash", "");
                                        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                                            String strLogB = new MagicUtil().logB(strOptString, strOptString2, DeviceUtil.generateImmutableUUID().hashCode() & Integer.MAX_VALUE);
                                            if (!TextUtils.isEmpty(strLogB) && DeviceUtil.isValidStrictDeviceID(strLogB)) {
                                                RemoteMagic.this.f33375a.getSharedPreferences("MagicMain", 0).edit().putString("mm_device_id", strLogB).commit();
                                            }
                                        }
                                    }
                                } catch (Exception unused3) {
                                }
                                try {
                                    if (RemoteMagic.this.d < 0.0d && "log_b".equals(entry.getKey())) {
                                        RemoteMagic.this.d = ((FirebaseRemoteConfigValue) entry.getValue()).b();
                                        RemoteMagic.this.f33378e = ((double) new Random().nextInt(100)) < RemoteMagic.this.d;
                                    }
                                } catch (Exception unused4) {
                                }
                            }
                            b bVar2 = RemoteMagic.this.f33377c;
                            if (bVar2 != null) {
                                bVar2.b();
                            }
                            if (TextUtils.isEmpty(MagicAppPreferencesUtil.a(RemoteMagic.this.f33375a))) {
                                RemoteMagic.this.f.removeMessages(1);
                                RemoteMagic.this.f.sendEmptyMessageDelayed(1, 900000L);
                                Log.v("charging_config", "fetch fail 1");
                            }
                        }
                    }
                });
            } catch (Exception unused) {
            }
        } else {
            b bVar = this.f33377c;
            if (bVar != null) {
                bVar.b();
            }
        }
    }
}
