package com.bytedance.sdk.openadsdk.tD;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.core.app.NotificationCompat;
import com.umeng.analytics.pro.bc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private WeakReference<OY> LD;
    private Context Lxb;
    private Map<String, Lxb> lk = new HashMap();
    private SensorEventListener ZU = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tD.lc.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            OY oyZU;
            if (sensorEvent.sensor.getType() != 1 || (oyZU = lc.this.ZU()) == null) {
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
                jSONObject.put(bc.aJ, f3);
                oyZU.Lxb("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener JXs = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tD.lc.12
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            OY oyZU;
            if (sensorEvent.sensor.getType() != 4 || (oyZU = lc.this.ZU()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put(bc.aJ, degrees3);
                oyZU.Lxb("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener lc = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tD.lc.23
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            OY oyZU;
            if (sensorEvent.sensor.getType() != 10 || (oyZU = lc.this.ZU()) == null) {
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
                jSONObject.put(bc.aJ, f3);
                oyZU.Lxb("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };
    private SensorEventListener ebl = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.tD.lc.34
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = nBu.LD;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = nBu.lk;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = nBu.ZU;
            SensorManager.getRotationMatrix(fArr5, null, nBu.LD, nBu.lk);
            float[] fArr6 = nBu.JXs;
            SensorManager.getOrientation(fArr5, fArr6);
            OY oyZU = lc.this.ZU();
            if (oyZU == null) {
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
                oyZU.Lxb("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }
    };

    public interface Lxb {
        JSONObject Lxb(JSONObject jSONObject) throws Throwable;
    }

    public lc(OY oy) {
        this.Lxb = oy.Lxb();
        this.LD = new WeakReference<>(oy);
        lk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.tD.Lxb JXs() {
        OY oyZU = ZU();
        if (oyZU == null) {
            return null;
        }
        return oyZU.kqm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OY ZU() {
        WeakReference<OY> weakReference = this.LD;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void lk() {
        this.lk.put("adInfo", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.45
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                if (oyZU == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectTD = oyZU.tD();
                if (jSONObjectTD != null) {
                    jSONObjectTD.put("code", 1);
                    return jSONObjectTD;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", -1);
                return jSONObject3;
            }
        });
        this.lk.put("appInfo", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.56
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = lc.this.Lxb().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                OY oyZU = lc.this.ZU();
                if (oyZU != null) {
                    jSONObject2.put("deviceId", oyZU.ebl());
                    jSONObject2.put("netType", oyZU.VVE());
                    jSONObject2.put("innerAppName", oyZU.ZU());
                    jSONObject2.put("appName", oyZU.JXs());
                    jSONObject2.put("appVersion", oyZU.lc());
                    Map<String, String> mapLD = oyZU.LD();
                    for (String str : mapLD.keySet()) {
                        jSONObject2.put(str, mapLD.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.lk.put("playableSDKInfo", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.61
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(bc.x, "android");
                return jSONObject2;
            }
        });
        this.lk.put("subscribe_app_ad", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.62
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tD.Lxb lxbJXs = lc.this.JXs();
                JSONObject jSONObject2 = new JSONObject();
                if (lxbJXs == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("download_app_ad", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.63
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tD.Lxb lxbJXs = lc.this.JXs();
                JSONObject jSONObject2 = new JSONObject();
                if (lxbJXs == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("isViewable", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.2
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                if (oyZU == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("viewStatus", oyZU.QAg());
                return jSONObject3;
            }
        });
        this.lk.put("getVolume", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.3
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                if (oyZU == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("code", 1);
                jSONObject3.put("endcard_mute", oyZU.OY());
                return jSONObject3;
            }
        });
        this.lk.put("getScreenSize", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.4
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                if (oyZU == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectBrP = oyZU.brP();
                jSONObjectBrP.put("code", 1);
                return jSONObjectBrP;
            }
        });
        this.lk.put("start_accelerometer_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.5
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        ebl.Lxb("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nBu.Lxb(lc.this.Lxb, lc.this.ZU, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("close_accelerometer_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.6
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nBu.Lxb(lc.this.Lxb, lc.this.ZU);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    ebl.Lxb("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lk.put("start_gyro_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.7
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        ebl.Lxb("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nBu.LD(lc.this.Lxb, lc.this.JXs, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("close_gyro_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.8
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nBu.Lxb(lc.this.Lxb, lc.this.JXs);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    ebl.Lxb("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lk.put("start_accelerometer_grativityless_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.9
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        ebl.Lxb("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nBu.lk(lc.this.Lxb, lc.this.lc, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("close_accelerometer_grativityless_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.10
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nBu.Lxb(lc.this.Lxb, lc.this.lc);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    ebl.Lxb("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lk.put("start_rotation_vector_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.11
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        ebl.Lxb("PlayableJsBridge", "invoke start_rotation_vector_observer error", th);
                        jSONObject2.put("code", -1);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                nBu.ZU(lc.this.Lxb, lc.this.ebl, iOptInt);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("close_rotation_vector_observer", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.13
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nBu.Lxb(lc.this.Lxb, lc.this.ebl);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    ebl.Lxb("PlayableJsBridge", "invoke close_rotation_vector_observer error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lk.put("device_shake", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.14
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nBu.Lxb(lc.this.Lxb, 300L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    ebl.Lxb("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lk.put("device_shake_short", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.15
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nBu.Lxb(lc.this.Lxb, 150L);
                    jSONObject2.put("code", 1);
                    return jSONObject2;
                } catch (Throwable th) {
                    ebl.Lxb("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -1);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.lk.put("playable_style", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.16
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectLk = oyZU.lk();
                jSONObjectLk.put("code", 1);
                return jSONObjectLk;
            }
        });
        this.lk.put("sendReward", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.17
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.Sfi();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("webview_time_track", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.18
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.lk.put("playable_event", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.19
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null || jSONObject == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.LD(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null), jSONObject.optJSONObject("params"));
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("reportAd", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.20
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("close", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.21
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("openAdLandPageLinks", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.22
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("get_viewport", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.24
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectDY = oyZU.DY();
                jSONObjectDY.put("code", 1);
                return jSONObjectDY;
            }
        });
        this.lk.put("jssdk_load_finish", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.25
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.nE();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_material_render_result", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.26
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.QAg(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("detect_change_playable_click", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.27
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNBu = oyZU.nBu();
                jSONObjectNBu.put("code", 1);
                return jSONObjectNBu;
            }
        });
        this.lk.put("check_camera_permission", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.28
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNXR = oyZU.NXR();
                jSONObjectNXR.put("code", 1);
                return jSONObjectNXR;
            }
        });
        this.lk.put("check_external_storage", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.29
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSTP = oyZU.STP();
                if (jSONObjectSTP.isNull("result")) {
                    jSONObjectSTP.put("code", -1);
                } else {
                    jSONObjectSTP.put("code", 1);
                }
                return jSONObjectSTP;
            }
        });
        this.lk.put("playable_open_camera", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.30
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_pick_photo", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.31
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_download_media_in_photos", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.32
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.Lxb(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_preventTouchEvent", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.33
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.LD(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_settings_info", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.35
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectIeN = oyZU.IeN();
                jSONObjectIeN.put("code", 1);
                return jSONObjectIeN;
            }
        });
        this.lk.put("playable_load_main_scene", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.36
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.HD();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_enter_section", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.37
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.ZU(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_end", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.38
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.eK();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_finish_play_playable", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.39
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.aH();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_transfrom_module_show", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.40
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.CSn();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_transfrom_module_change_color", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.41
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.id();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_set_scroll_rect", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.42
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_click_area", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.43
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.JXs(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_real_play_start", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.44
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_material_first_frame_show", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.46
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.foI();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_stuck_check_pong", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.47
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.KPU();
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_material_adnormal_mask", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.48
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                oyZU.lc(jSONObject);
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_long_press_panel", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.49
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_alpha_player_play", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.50
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_transfrom_module_highlight", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.51
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_send_click_event", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.52
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_query_media_permission_declare", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.53
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectEbl = oyZU.ebl(jSONObject);
                jSONObjectEbl.put("code", 1);
                return jSONObjectEbl;
            }
        });
        this.lk.put("playable_query_media_permission_enable", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.54
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                OY oyZU = lc.this.ZU();
                JSONObject jSONObject2 = new JSONObject();
                if (oyZU == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOY = oyZU.OY(jSONObject);
                jSONObjectOY.put("code", 1);
                return jSONObjectOY;
            }
        });
        this.lk.put("playable_apply_media_permission", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.55
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tD.Lxb lxbJXs = lc.this.JXs();
                JSONObject jSONObject2 = new JSONObject();
                if (lxbJXs == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_start_kws", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.57
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tD.Lxb lxbJXs = lc.this.JXs();
                JSONObject jSONObject2 = new JSONObject();
                if (lxbJXs == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_close_kws", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.58
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tD.Lxb lxbJXs = lc.this.JXs();
                JSONObject jSONObject2 = new JSONObject();
                if (lxbJXs == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_video_preload_task_add", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.59
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tD.Lxb lxbJXs = lc.this.JXs();
                JSONObject jSONObject2 = new JSONObject();
                if (lxbJXs == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
        this.lk.put("playable_video_preload_task_cancel", new Lxb() { // from class: com.bytedance.sdk.openadsdk.tD.lc.60
            @Override // com.bytedance.sdk.openadsdk.tD.lc.Lxb
            public JSONObject Lxb(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.tD.Lxb lxbJXs = lc.this.JXs();
                JSONObject jSONObject2 = new JSONObject();
                if (lxbJXs == null) {
                    jSONObject2.put("code", -1);
                    return jSONObject2;
                }
                jSONObject2.put("code", 1);
                return jSONObject2;
            }
        });
    }

    public Set<String> Lxb() {
        return this.lk.keySet();
    }

    public JSONObject Lxb(String str, JSONObject jSONObject) {
        try {
            Lxb lxb = this.lk.get(str);
            if (lxb == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", -1);
                return jSONObject2;
            }
            return lxb.Lxb(jSONObject);
        } catch (Throwable th) {
            ebl.Lxb("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }
}
