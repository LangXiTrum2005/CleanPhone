package com.bytedance.sdk.openadsdk.uq;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.ironsource.L6;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class di {
    private WeakReference<mj> lr;
    private Context ri;
    private Map<String, ri> ik = new HashMap();
    private SensorEventListener ka = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            mj mjVarKa;
            if (sensorEvent.sensor.getType() != 1 || (mjVarKa = di.this.ka()) == null) {
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
                mjVarKa.ri("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    private SensorEventListener fi = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.12
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            mj mjVarKa;
            if (sensorEvent.sensor.getType() != 4 || (mjVarKa = di.this.ka()) == null) {
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
                mjVarKa.ri("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    private SensorEventListener di = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.23
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            mj mjVarKa;
            if (sensorEvent.sensor.getType() != 10 || (mjVarKa = di.this.ka()) == null) {
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
                mjVarKa.ri("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };
    private SensorEventListener xha = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.uq.di.34
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = qt.lr;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = qt.ik;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = qt.ka;
            SensorManager.getRotationMatrix(fArr5, null, qt.lr, qt.ik);
            float[] fArr6 = qt.fi;
            SensorManager.getOrientation(fArr5, fArr6);
            mj mjVarKa = di.this.ka();
            if (mjVarKa == null) {
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
                mjVarKa.ri("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };

    public interface ri {
        JSONObject ri(JSONObject jSONObject) throws Throwable;
    }

    public di(mj mjVar) {
        this.ri = mjVar.ri();
        this.lr = new WeakReference<>(mjVar);
        ik();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.uq.ri fi() {
        mj mjVarKa = ka();
        if (mjVarKa == null) {
            return null;
        }
        return mjVarKa.bu();
    }

    private void ik() {
        this.ik.put("adInfo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.45
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                if (mjVarKa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectTan = mjVarKa.tan();
                if (jSONObjectTan != null) {
                    jSONObjectTan.put("code", 1);
                    return jSONObjectTan;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.ik.put("appInfo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.56
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = di.this.ri().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                mj mjVarKa = di.this.ka();
                if (mjVarKa != null) {
                    jSONObject2.put("deviceId", mjVarKa.xha());
                    jSONObject2.put("netType", mjVarKa.slm());
                    jSONObject2.put("innerAppName", mjVarKa.ka());
                    jSONObject2.put("appName", mjVarKa.fi());
                    jSONObject2.put(X3.j.W, mjVarKa.di());
                    Map<String, String> mapLr = mjVarKa.lr();
                    for (String str : mapLr.keySet()) {
                        jSONObject2.put(str, mapLr.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.ik.put("playableSDKInfo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.62
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(L6.F, "android");
                return jSONObject2;
            }
        });
        this.ik.put("subscribe_app_ad", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.63
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.uq.ri riVarFi = di.this.fi();
                JSONObject jSONObject2 = new JSONObject();
                if (riVarFi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("download_app_ad", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.64
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.uq.ri riVarFi = di.this.fi();
                JSONObject jSONObject2 = new JSONObject();
                if (riVarFi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put(X3.i.o, new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.2
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                if (mjVarKa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", mjVarKa.jbs());
                return jSONObject3;
            }
        });
        this.ik.put("getVolume", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.3
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                if (mjVarKa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", mjVarKa.mj());
                return jSONObject3;
            }
        });
        this.ik.put("getScreenSize", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.4
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                if (mjVarKa == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNr = mjVarKa.nr();
                jSONObjectNr.put("code", 1);
                return jSONObjectNr;
            }
        });
        this.ik.put("start_accelerometer_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.5
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.ri("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                qt.ri(di.this.ri, di.this.ka, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("close_accelerometer_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.6
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    qt.ri(di.this.ri, di.this.ka);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.ri("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.ik.put("start_gyro_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.7
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.ri("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                qt.lr(di.this.ri, di.this.fi, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("close_gyro_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.8
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    qt.ri(di.this.ri, di.this.fi);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.ri("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.ik.put("start_accelerometer_grativityless_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.9
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.ri("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                qt.ik(di.this.ri, di.this.di, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("close_accelerometer_grativityless_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.10
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    qt.ri(di.this.ri, di.this.di);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.ri("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.ik.put("start_rotation_vector_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.11
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        xha.ri("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                qt.ka(di.this.ri, di.this.xha, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("close_rotation_vector_observer", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.13
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    qt.ri(di.this.ri, di.this.xha);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.ri("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.ik.put("device_shake", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.14
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    qt.ri(di.this.ri, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.ri("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.ik.put("device_shake_short", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.15
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    qt.ri(di.this.ri, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    xha.ri("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.ik.put("playable_style", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.16
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectIk = mjVarKa.ik();
                jSONObjectIk.put("code", 1);
                return jSONObjectIk;
            }
        });
        this.ik.put("sendReward", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.17
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.ihz();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playableInteractionTriggered", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.18
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.uq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("webview_time_track", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.19
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.ik.put("playable_event", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.20
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.lr(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("reportAd", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.21
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("close", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.22
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("openAdLandPageLinks", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.24
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("get_viewport", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.25
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectAc = mjVarKa.ac();
                jSONObjectAc.put("code", 1);
                return jSONObjectAc;
            }
        });
        this.ik.put("jssdk_load_finish", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.26
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.hcw();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_material_render_result", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.27
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.jbs(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("detect_change_playable_click", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.28
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectQt = mjVarKa.qt();
                jSONObjectQt.put("code", 1);
                return jSONObjectQt;
            }
        });
        this.ik.put("check_camera_permission", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.29
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectAw = mjVarKa.aw();
                jSONObjectAw.put("code", 1);
                return jSONObjectAw;
            }
        });
        this.ik.put("check_external_storage", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.30
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectBgr = mjVarKa.bgr();
                if (jSONObjectBgr.isNull("result")) {
                    jSONObjectBgr.put("code", -1);
                    return jSONObjectBgr;
                }
                jSONObjectBgr.put("code", 1);
                return jSONObjectBgr;
            }
        });
        this.ik.put("playable_open_camera", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.31
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_pick_photo", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.32
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_download_media_in_photos", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.33
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.ri(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_preventTouchEvent", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.35
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.lr(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_settings_info", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.36
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectVr = mjVarKa.vr();
                jSONObjectVr.put("code", 1);
                return jSONObjectVr;
            }
        });
        this.ik.put("playable_load_main_scene", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.37
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.wjv();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_enter_section", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.38
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.ka(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_end", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.39
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.ay();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_finish_play_playable", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.40
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.fr();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_transfrom_module_show", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.41
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.su();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_transfrom_module_change_color", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.42
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.igq();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_set_scroll_rect", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.43
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_click_area", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.44
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.fi(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_real_play_start", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.46
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_material_first_frame_show", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.47
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.zf();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_stuck_check_pong", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.48
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.dw();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_material_adnormal_mask", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.49
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                mjVarKa.di(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_long_press_panel", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.50
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_alpha_player_play", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.51
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_transfrom_module_highlight", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.52
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_send_click_event", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.53
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_query_media_permission_declare", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.54
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectXha = mjVarKa.xha(jSONObject);
                jSONObjectXha.put("code", 1);
                return jSONObjectXha;
            }
        });
        this.ik.put("playable_query_media_permission_enable", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.55
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                mj mjVarKa = di.this.ka();
                JSONObject jSONObject2 = new JSONObject();
                if (mjVarKa == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectMj = mjVarKa.mj(jSONObject);
                jSONObjectMj.put("code", 1);
                return jSONObjectMj;
            }
        });
        this.ik.put("playable_apply_media_permission", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.57
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.uq.ri riVarFi = di.this.fi();
                JSONObject jSONObject2 = new JSONObject();
                if (riVarFi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_start_kws", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.58
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.uq.ri riVarFi = di.this.fi();
                JSONObject jSONObject2 = new JSONObject();
                if (riVarFi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_close_kws", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.59
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.uq.ri riVarFi = di.this.fi();
                JSONObject jSONObject2 = new JSONObject();
                if (riVarFi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_video_preload_task_add", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.60
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.uq.ri riVarFi = di.this.fi();
                JSONObject jSONObject2 = new JSONObject();
                if (riVarFi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.ik.put("playable_video_preload_task_cancel", new ri() { // from class: com.bytedance.sdk.openadsdk.uq.di.61
            @Override // com.bytedance.sdk.openadsdk.uq.di.ri
            public JSONObject ri(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.uq.ri riVarFi = di.this.fi();
                JSONObject jSONObject2 = new JSONObject();
                if (riVarFi == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public mj ka() {
        WeakReference<mj> weakReference = this.lr;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void lr() {
        qt.ri(this.ri, this.ka);
        qt.ri(this.ri, this.fi);
        qt.ri(this.ri, this.di);
        qt.ri(this.ri, this.xha);
    }

    public Set<String> ri() {
        return this.ik.keySet();
    }

    public JSONObject ri(String str, JSONObject jSONObject) {
        try {
            ri riVar = this.ik.get(str);
            if (riVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return riVar.ri(jSONObject);
        } catch (Throwable th) {
            xha.ri("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
