package com.mbridge.msdk.config.component.load.model;

import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.services.UnityAdsConstants;
import java.net.URL;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32248a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32250c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f32254g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f32249b = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32251d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32252e = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32255h = "0";

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get(c.c("116"));
            if (obj != null) {
                this.f32248a = String.valueOf(obj);
            }
            Object obj2 = map.get(c.c("191"));
            if (obj2 != null) {
                try {
                    float f10 = Float.parseFloat(String.valueOf(obj2));
                    if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    this.f32249b = f10;
                } catch (Throwable th2) {
                    q0.b("DownloadModel", th2.getMessage());
                    this.f32249b = 1.0f;
                }
            }
            Object obj3 = map.get(c.c("100"));
            if (obj3 != null) {
                this.f32250c = String.valueOf(obj3);
            }
            Object obj4 = map.get(c.c("162"));
            if (obj4 != null) {
                try {
                    int i10 = Integer.parseInt(String.valueOf(obj4));
                    if (i10 == 0) {
                        i10 = 30;
                    }
                    this.f32251d = i10;
                } catch (Throwable th3) {
                    q0.b("DownloadModel", th3.getMessage());
                    this.f32251d = 30;
                }
            }
            Object obj5 = map.get(c.c("174"));
            if (obj5 != null) {
                try {
                    this.f32252e = Integer.parseInt(String.valueOf(obj5));
                } catch (Throwable th4) {
                    q0.b("DownloadModel", th4.getMessage());
                    this.f32252e = 0;
                }
            }
            Object obj6 = map.get(c.c("192"));
            if (obj6 != null) {
                try {
                    this.f32253f = Integer.parseInt(String.valueOf(obj6));
                } catch (Throwable th5) {
                    q0.b("DownloadModel", th5.getMessage());
                    this.f32253f = 15;
                }
            }
            Object obj7 = map.get(c.c("201"));
            if (obj7 != null) {
                this.f32254g = String.valueOf(obj7);
            } else {
                try {
                    URL url = new URL(f());
                    this.f32254g = url.getProtocol() + "://" + url.getHost() + url.getPath();
                } catch (Throwable th6) {
                    q0.b("DownloadModel", th6.getMessage());
                }
            }
            Object obj8 = map.get(c.c("202"));
            if (obj8 != null) {
                this.f32255h = String.valueOf(obj8);
            }
        }
    }

    public String b() {
        return this.f32254g;
    }

    public String c() {
        return this.f32250c;
    }

    public float d() {
        return this.f32249b;
    }

    public int e() {
        return this.f32253f;
    }

    public String f() {
        return this.f32248a;
    }

    public int g() {
        return this.f32252e;
    }

    public int h() {
        return this.f32251d * 1000;
    }

    public String a() {
        return this.f32255h;
    }
}
