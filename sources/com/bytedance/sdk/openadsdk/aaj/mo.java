package com.bytedance.sdk.openadsdk.aaj;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    private Context qdl;
    private WeakReference<jpc> ud;
    private Map<String, qdl> lnr = new HashMap();
    private SensorEventListener mml = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            jpc jpcVarMml;
            if (sensorEvent.sensor.getType() != 1 || (jpcVarMml = mo.this.mml()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                jpcVarMml.qdl("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener mzz = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            jpc jpcVarMml;
            if (sensorEvent.sensor.getType() != 4 || (jpcVarMml = mo.this.mml()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put("z", degrees3);
                jpcVarMml.qdl("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener mo = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            jpc jpcVarMml;
            if (sensorEvent.sensor.getType() != 10 || (jpcVarMml = mo.this.mml()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f);
                jSONObject.put("y", f2);
                jSONObject.put("z", f3);
                jpcVarMml.qdl("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener wd = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i2) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = to.ud;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = to.lnr;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = to.mml;
            SensorManager.getRotationMatrix(fArr5, null, to.ud, to.lnr);
            float[] fArr6 = to.mzz;
            SensorManager.getOrientation(fArr5, fArr6);
            jpc jpcVarMml = mo.this.mml();
            if (jpcVarMml == null) {
                return;
            }
            float f = fArr6[0];
            float f2 = fArr6[1];
            float f3 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f);
                jSONObject.put("beta", f2);
                jSONObject.put("gamma", f3);
                jpcVarMml.qdl("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    public interface qdl {
        JSONObject qdl(JSONObject jSONObject) throws Throwable;
    }

    public mo(jpc jpcVar) {
        this.qdl = jpcVar.qdl();
        this.ud = new WeakReference<>(jpcVar);
        lnr();
    }

    private void lnr() {
        this.lnr.put("adInfo", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.45
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                if (jpcVarMml == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectExc = jpcVarMml.exc();
                if (jSONObjectExc != null) {
                    jSONObjectExc.put("code", 1);
                    return jSONObjectExc;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.lnr.put("appInfo", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.56
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = mo.this.qdl().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                jpc jpcVarMml = mo.this.mml();
                if (jpcVarMml != null) {
                    jSONObject2.put("deviceId", jpcVarMml.wd());
                    jSONObject2.put("netType", jpcVarMml.jtx());
                    jSONObject2.put("innerAppName", jpcVarMml.mml());
                    jSONObject2.put("appName", jpcVarMml.mzz());
                    jSONObject2.put(d9.i.W, jpcVarMml.mo());
                    Map<String, String> mapUd = jpcVarMml.ud();
                    for (String str : mapUd.keySet()) {
                        jSONObject2.put(str, mapUd.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.lnr.put("playableSDKInfo", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.62
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(ne.f26256E, "android");
                return jSONObject2;
            }
        });
        this.lnr.put("subscribe_app_ad", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.63
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.aaj.qdl qdlVarMzz = mo.this.mzz();
                JSONObject jSONObject2 = new JSONObject();
                if (qdlVarMzz == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("download_app_ad", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.64
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.aaj.qdl qdlVarMzz = mo.this.mzz();
                JSONObject jSONObject2 = new JSONObject();
                if (qdlVarMzz == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put(d9.h.o, new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.2
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                if (jpcVarMml == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", jpcVarMml.tvp());
                return jSONObject3;
            }
        });
        this.lnr.put("getVolume", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.3
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                if (jpcVarMml == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", jpcVarMml.jpc());
                return jSONObject3;
            }
        });
        this.lnr.put("getScreenSize", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.4
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                if (jpcVarMml == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectJl = jpcVarMml.jl();
                jSONObjectJl.put("code", 1);
                return jSONObjectJl;
            }
        });
        this.lnr.put("start_accelerometer_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.5
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        wd.qdl("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                to.qdl(mo.this.qdl, mo.this.mml, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("close_accelerometer_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.6
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    to.qdl(mo.this.qdl, mo.this.mml);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    wd.qdl("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lnr.put("start_gyro_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.7
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        wd.qdl("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                to.ud(mo.this.qdl, mo.this.mzz, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("close_gyro_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.8
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    to.qdl(mo.this.qdl, mo.this.mzz);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    wd.qdl("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lnr.put("start_accelerometer_grativityless_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.9
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        wd.qdl("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                to.lnr(mo.this.qdl, mo.this.mo, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("close_accelerometer_grativityless_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.10
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    to.qdl(mo.this.qdl, mo.this.mo);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    wd.qdl("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lnr.put("start_rotation_vector_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.11
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        wd.qdl("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                to.mml(mo.this.qdl, mo.this.wd, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("close_rotation_vector_observer", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.13
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    to.qdl(mo.this.qdl, mo.this.wd);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    wd.qdl("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lnr.put("device_shake", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.14
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    to.qdl(mo.this.qdl, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    wd.qdl("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lnr.put("device_shake_short", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.15
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    to.qdl(mo.this.qdl, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    wd.qdl("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lnr.put("playable_style", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.16
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectLnr = jpcVarMml.lnr();
                jSONObjectLnr.put("code", 1);
                return jSONObjectLnr;
            }
        });
        this.lnr.put("sendReward", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.17
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.jyq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playableInteractionTriggered", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.18
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.oth();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("webview_time_track", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.19
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.lnr.put("playable_event", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.20
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.ud(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("reportAd", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.21
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("close", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.22
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("openAdLandPageLinks", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.24
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("get_viewport", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.25
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectAaj = jpcVarMml.aaj();
                jSONObjectAaj.put("code", 1);
                return jSONObjectAaj;
            }
        });
        this.lnr.put("jssdk_load_finish", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.26
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.kdv();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_material_render_result", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.27
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.tvp(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("detect_change_playable_click", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.28
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = jpcVarMml.to();
                jSONObject3.put("code", 1);
                return jSONObject3;
            }
        });
        this.lnr.put("check_camera_permission", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.29
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectExu = jpcVarMml.exu();
                jSONObjectExu.put("code", 1);
                return jSONObjectExu;
            }
        });
        this.lnr.put("check_external_storage", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.30
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectRdp = jpcVarMml.rdp();
                if (jSONObjectRdp.isNull("result")) {
                    jSONObjectRdp.put("code", -1);
                    return jSONObjectRdp;
                }
                jSONObjectRdp.put("code", 1);
                return jSONObjectRdp;
            }
        });
        this.lnr.put("playable_open_camera", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.31
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_pick_photo", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.32
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_download_media_in_photos", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.33
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.qdl(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_preventTouchEvent", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.35
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.ud(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_settings_info", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.36
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectBjy = jpcVarMml.bjy();
                jSONObjectBjy.put("code", 1);
                return jSONObjectBjy;
            }
        });
        this.lnr.put("playable_load_main_scene", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.37
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.ljh();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_enter_section", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.38
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.mml(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_end", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.39
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.bch();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_finish_play_playable", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.40
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.uw();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_transfrom_module_show", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.41
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.xmv();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_transfrom_module_change_color", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.42
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.bqt();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_set_scroll_rect", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.43
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_click_area", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.44
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.mzz(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_real_play_start", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.46
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_material_first_frame_show", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.47
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.koa();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_stuck_check_pong", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.48
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.vu();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_material_adnormal_mask", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.49
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jpcVarMml.mo(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_long_press_panel", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.50
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_alpha_player_play", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.51
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_transfrom_module_highlight", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.52
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_send_click_event", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.53
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_query_media_permission_declare", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.54
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectWd = jpcVarMml.wd(jSONObject);
                jSONObjectWd.put("code", 1);
                return jSONObjectWd;
            }
        });
        this.lnr.put("playable_query_media_permission_enable", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.55
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                jpc jpcVarMml = mo.this.mml();
                JSONObject jSONObject2 = new JSONObject();
                if (jpcVarMml == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectJpc = jpcVarMml.jpc(jSONObject);
                jSONObjectJpc.put("code", 1);
                return jSONObjectJpc;
            }
        });
        this.lnr.put("playable_apply_media_permission", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.57
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.aaj.qdl qdlVarMzz = mo.this.mzz();
                JSONObject jSONObject2 = new JSONObject();
                if (qdlVarMzz == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_start_kws", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.58
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.aaj.qdl qdlVarMzz = mo.this.mzz();
                JSONObject jSONObject2 = new JSONObject();
                if (qdlVarMzz == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_close_kws", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.59
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.aaj.qdl qdlVarMzz = mo.this.mzz();
                JSONObject jSONObject2 = new JSONObject();
                if (qdlVarMzz == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_video_preload_task_add", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.60
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.aaj.qdl qdlVarMzz = mo.this.mzz();
                JSONObject jSONObject2 = new JSONObject();
                if (qdlVarMzz == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lnr.put("playable_video_preload_task_cancel", new qdl() { // from class: com.bytedance.sdk.openadsdk.aaj.mo.61
            @Override // com.bytedance.sdk.openadsdk.aaj.mo.qdl
            public JSONObject qdl(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.aaj.qdl qdlVarMzz = mo.this.mzz();
                JSONObject jSONObject2 = new JSONObject();
                if (qdlVarMzz == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jpc mml() {
        WeakReference<jpc> weakReference = this.ud;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.aaj.qdl mzz() {
        jpc jpcVarMml = mml();
        if (jpcVarMml == null) {
            return null;
        }
        return jpcVarMml.yt();
    }

    public Set<String> qdl() {
        return this.lnr.keySet();
    }

    public void ud() {
        to.qdl(this.qdl, this.mml);
        to.qdl(this.qdl, this.mzz);
        to.qdl(this.qdl, this.mo);
        to.qdl(this.qdl, this.wd);
    }

    public JSONObject qdl(String str, JSONObject jSONObject) {
        try {
            qdl qdlVar = this.lnr.get(str);
            if (qdlVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return qdlVar.qdl(jSONObject);
        } catch (Throwable th) {
            wd.qdl("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
