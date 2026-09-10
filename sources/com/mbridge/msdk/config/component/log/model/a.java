package com.mbridge.msdk.config.component.log.model;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f32258a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32259b = 15000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f32260c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32261d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f32262e = 50;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f32263f = 50;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f32264g = 604800000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f32265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, Object> f32266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, Object> f32267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map<String, Object> f32268k;

    public a(Map<String, Object> map) {
        if (map != null) {
            a(map);
        }
    }

    private void a(Map<String, Object> map) {
        if (map != null) {
            if (map.containsKey(c.c("181"))) {
                String strL = f2.l("181", map);
                if (!TextUtils.isEmpty(strL) && !"null".equalsIgnoreCase(strL)) {
                    try {
                        this.f32258a = Integer.parseInt(strL);
                    } catch (Exception e10) {
                        q0.b("LogSenderModel", e10.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("162"))) {
                String strL2 = f2.l("162", map);
                if (!TextUtils.isEmpty(strL2) && !"null".equalsIgnoreCase(strL2)) {
                    try {
                        this.f32259b = Integer.parseInt(strL2) * 1000;
                    } catch (Exception e11) {
                        q0.b("LogSenderModel", e11.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("182"))) {
                String strL3 = f2.l("182", map);
                if (!TextUtils.isEmpty(strL3) && !"null".equalsIgnoreCase(strL3)) {
                    try {
                        this.f32260c = Integer.parseInt(strL3);
                    } catch (Exception e12) {
                        q0.b("LogSenderModel", e12.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("183"))) {
                String strL4 = f2.l("183", map);
                if (!TextUtils.isEmpty(strL4) && !"null".equalsIgnoreCase(strL4)) {
                    try {
                        this.f32261d = Integer.parseInt(strL4);
                    } catch (Exception e13) {
                        q0.b("LogSenderModel", e13.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("174"))) {
                String strL5 = f2.l("174", map);
                if (!TextUtils.isEmpty(strL5) && !"null".equalsIgnoreCase(strL5)) {
                    try {
                        this.f32262e = Integer.parseInt(strL5);
                    } catch (Exception e14) {
                        q0.b("LogSenderModel", e14.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("184"))) {
                String strL6 = f2.l("184", map);
                if (!TextUtils.isEmpty(strL6) && !"null".equalsIgnoreCase(strL6)) {
                    try {
                        this.f32263f = Integer.parseInt(strL6);
                    } catch (Exception e15) {
                        q0.b("LogSenderModel", e15.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("185"))) {
                String strL7 = f2.l("185", map);
                if (!TextUtils.isEmpty(strL7) && !"null".equalsIgnoreCase(strL7)) {
                    try {
                        this.f32264g = Integer.parseInt(strL7) * 1000;
                    } catch (Exception e16) {
                        q0.b("LogSenderModel", e16.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("178"))) {
                String strL8 = f2.l("178", map);
                if (!TextUtils.isEmpty(strL8) && !"null".equalsIgnoreCase(strL8)) {
                    try {
                        this.f32265h = Integer.parseInt(strL8);
                    } catch (Exception e17) {
                        q0.b("LogSenderModel", e17.getMessage());
                    }
                }
            }
            if (map.containsKey(c.c("180"))) {
                Object obj = map.get(c.c("180"));
                if (obj instanceof Map) {
                    this.f32266i = (Map) obj;
                } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f32266i = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b();
                }
            }
            if (map.containsKey(c.c("179"))) {
                Object obj2 = map.get(c.c("179"));
                if (obj2 instanceof Map) {
                    this.f32267j = (Map) obj2;
                } else if (obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f32267j = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2).b();
                }
            }
            if (map.containsKey(c.c("186"))) {
                Object obj3 = map.get(c.c("186"));
                if (obj3 instanceof Map) {
                    this.f32268k = (Map) obj3;
                } else if (obj3 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    this.f32268k = ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj3).b();
                }
            }
        }
    }

    public int b() {
        return this.f32259b;
    }

    public String c() {
        Map<String, Object> map = this.f32266i;
        if (map == null || !map.containsKey(c.c("116"))) {
            return "";
        }
        String strL = f2.l("116", this.f32266i);
        return (TextUtils.isEmpty(strL) || "null".equalsIgnoreCase(strL)) ? "" : strL;
    }

    public int d() {
        return this.f32263f;
    }

    public int e() {
        return this.f32265h;
    }

    public int f() {
        Map<String, Object> map = this.f32266i;
        return (map == null || map.isEmpty()) ? 1 : 0;
    }

    public int g() {
        return this.f32262e;
    }

    public Map<String, Object> h() {
        return this.f32268k;
    }

    public String i() {
        Map<String, Object> map = this.f32267j;
        if (map == null || !map.containsKey(c.c("114"))) {
            return "";
        }
        String strL = f2.l("114", this.f32267j);
        return (TextUtils.isEmpty(strL) || "null".equalsIgnoreCase(strL)) ? "" : strL;
    }

    public int j() {
        Map<String, Object> map = this.f32267j;
        if (map == null || !map.containsKey(c.c("172"))) {
            return 9377;
        }
        String strL = f2.l("172", this.f32267j);
        if (TextUtils.isEmpty(strL) || "null".equals(strL)) {
            return 9377;
        }
        try {
            return Integer.parseInt(strL);
        } catch (Exception e10) {
            q0.b("LogSenderModel", e10.getMessage());
            return 9377;
        }
    }

    public int k() {
        return this.f32264g;
    }

    public int a() {
        return this.f32258a;
    }
}
