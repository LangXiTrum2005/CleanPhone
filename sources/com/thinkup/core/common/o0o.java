package com.thinkup.core.common;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.crashlytics.internal.model.a;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.ooo.omm;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0o {
    private static volatile o0o m = null;
    public static final String o = "MsgManager";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f42163n;
    private boolean o0;

    private o0o(Context context) {
        if (context != null) {
            this.f42163n = context.getApplicationContext();
        }
        this.o0 = false;
    }

    public static o0o o(Context context) {
        if (m == null) {
            synchronized (o0o.class) {
                try {
                    if (m == null) {
                        m = new o0o(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039 A[FALL_THROUGH, PHI: r3
  0x0039: PHI (r3v7 boolean) = (r3v1 boolean), (r3v8 boolean), (r3v0 boolean), (r3v10 boolean) binds: [B:30:0x007e, B:24:0x0064, B:12:0x0036, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void o(int i2, com.thinkup.core.common.on.no noVar, com.thinkup.core.oo.m mVar) {
        String str;
        try {
            System.currentTimeMillis();
            if (com.thinkup.core.oo.nm.o(com.thinkup.core.common.n.o0n.m().on()).o(noVar.m.oomn()) == null) {
                return;
            }
            String strMon = ((com.thinkup.core.common.on.n0) noVar.m).mon();
            if (TextUtils.isEmpty(strMon)) {
                return;
            }
            boolean z2 = false;
            if (i2 == 4) {
                z2 = ((com.thinkup.core.common.on.n0) noVar.m).m0m() == 1;
                Map<String, String> mapMn0 = mVar.mn0();
                if (mapMn0 != null) {
                    str = mapMn0.get("show");
                } else {
                    str = null;
                }
            } else if (i2 != 6) {
                switch (i2) {
                    case 18:
                    case 19:
                    case 20:
                        z2 = ((com.thinkup.core.common.on.n0) noVar.m).n0() == 1;
                        Map<String, String> mapMn1 = mVar.mn0();
                        if (mapMn1 != null) {
                            str = mapMn1.get("dl");
                            break;
                        }
                    default:
                        str = null;
                        break;
                }
            } else {
                z2 = ((com.thinkup.core.common.on.n0) noVar.m).m0n() == 1;
                Map<String, String> mapMn2 = mVar.mn0();
                if (mapMn2 != null) {
                    str = mapMn2.get("click");
                } else {
                    str = null;
                }
            }
            if (z2 && !TextUtils.isEmpty(str)) {
                JSONObject jSONObjectO = omm.o();
                jSONObjectO.toString();
                noVar.o().toString();
                String string = jSONObjectO.toString();
                String string2 = noVar.o().toString();
                com.thinkup.core.common.on.n0 n0Var = (com.thinkup.core.common.on.n0) noVar.m;
                if (this.f42163n != null) {
                    try {
                        Intent intent = new Intent(str);
                        intent.putExtra("common", string);
                        intent.putExtra("data", string2);
                        intent.putExtra("adsourceId", strMon);
                        intent.putExtra("networkType", String.valueOf(n0Var.n0n()));
                        intent.putExtra("format", n0Var.oono());
                        intent.putExtra("showid", n0Var.omm());
                        intent.putExtra("tktype", i2);
                        intent.putExtra("extra_info", com.thinkup.core.common.n.mn.o(n0Var, (TUBaseAdAdapter) null).toString());
                        intent.setPackage(this.f42163n.getPackageName());
                        com.thinkup.core.common.n.no.o(this.f42163n).o(intent);
                    } catch (Throwable unused) {
                    }
                }
            }
            System.currentTimeMillis();
        } catch (Throwable unused2) {
        }
    }

    public final void o(final com.thinkup.core.oo.m mVar) {
        com.thinkup.core.common.ooo.m.m.o().o(new Runnable() { // from class: com.thinkup.core.common.o0o.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (o0o.this.f42163n == null) {
                        return;
                    }
                    String packageName = o0o.this.f42163n.getPackageName();
                    String str = "";
                    for (int i2 = 0; i2 < 2; i2++) {
                        str = str + packageName;
                    }
                    String strN = com.thinkup.core.common.ooo.nm.n(str);
                    Intent intent = new Intent(strN);
                    intent.putExtra(strN, mVar.mon());
                    intent.putExtra("data", omm.o().toString());
                    intent.putExtra("denied", com.thinkup.core.common.n.o0n.m().om());
                    intent.putExtra("tksw", mVar.n0());
                    intent.setPackage(packageName);
                    com.thinkup.core.common.n.no.o(o0o.this.f42163n).o(intent);
                    com.thinkup.core.common.oo0.oo.o(mVar.n0());
                } catch (Throwable unused) {
                }
            }
        }, 1000L);
    }

    private void o(int i2, String str, String str2, String str3, String str4, com.thinkup.core.common.on.n0 n0Var) {
        if (this.f42163n == null) {
            return;
        }
        try {
            Intent intent = new Intent(str);
            intent.putExtra("common", str2);
            intent.putExtra("data", str3);
            intent.putExtra("adsourceId", str4);
            intent.putExtra("networkType", String.valueOf(n0Var.n0n()));
            intent.putExtra("format", n0Var.oono());
            intent.putExtra("showid", n0Var.omm());
            intent.putExtra("tktype", i2);
            intent.putExtra("extra_info", com.thinkup.core.common.n.mn.o(n0Var, (TUBaseAdAdapter) null).toString());
            intent.setPackage(this.f42163n.getPackageName());
            com.thinkup.core.common.n.no.o(this.f42163n).o(intent);
        } catch (Throwable unused) {
        }
    }

    public final void o(boolean z2) {
        this.o0 = z2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[FALL_THROUGH] */
    public final void o(final Map<String, Object> map, final com.thinkup.core.common.on.n0 n0Var, final int i2) {
        String str;
        if (this.o0) {
            com.thinkup.core.oo.m mVarH = a.h(a.i());
            if (i2 == 4) {
                Map<String, String> mapMn0 = mVarH.mn0();
                if (mapMn0 != null) {
                    str = mapMn0.get("show");
                } else {
                    str = null;
                }
            } else if (i2 != 6) {
                switch (i2) {
                    case 18:
                    case 19:
                    case 20:
                        Map<String, String> mapMn1 = mVarH.mn0();
                        if (mapMn1 != null) {
                            str = mapMn1.get("dl");
                            break;
                        }
                    default:
                        str = null;
                        break;
                }
            } else {
                Map<String, String> mapMn2 = mVarH.mn0();
                if (mapMn2 != null) {
                    str = mapMn2.get("click");
                } else {
                    str = null;
                }
            }
            final String str2 = str;
            if (this.f42163n == null) {
                return;
            }
            if (str2 == null) {
                if (com.thinkup.core.common.n.o0n.m().m0o()) {
                    Log.d(o, "sendAdxTraminiInfo: fail with empty action,businessType is ".concat(String.valueOf(i2)));
                    return;
                }
                return;
            }
            com.thinkup.core.common.ooo.m.m.o().m(new Runnable() { // from class: com.thinkup.core.common.o0o.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Intent intent = new Intent(str2);
                        intent.putExtra("tktype", i2);
                        com.thinkup.core.common.n.mn mnVarO = com.thinkup.core.common.n.mn.o(n0Var, (TUBaseAdAdapter) null);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("info_string", mnVarO.toString());
                        jSONObject.put("info_result", map != null);
                        Map map2 = map;
                        if (map2 != null) {
                            jSONObject.put("ad_title", com.thinkup.core.common.ooo.o00.o((Map<String, Object>) map2, "sdm_ad_title", ""));
                            jSONObject.put("ad_desc", com.thinkup.core.common.ooo.o00.o((Map<String, Object>) map, "sdm_ad_desc", ""));
                            jSONObject.put("ad_image_url", com.thinkup.core.common.ooo.o00.o((Map<String, Object>) map, "sdm_ad_image_url", ""));
                            jSONObject.put("ad_video_url", com.thinkup.core.common.ooo.o00.o((Map<String, Object>) map, "sdm_ad_video_url", ""));
                            jSONObject.put("ad_click_url", com.thinkup.core.common.ooo.o00.o((Map<String, Object>) map, "sdm_ad_click_url", ""));
                            jSONObject.put("ad_package_name", com.thinkup.core.common.ooo.o00.o((Map<String, Object>) map, "sdm_ad_package_name", ""));
                        }
                        intent.putExtra("adx_extra_info", jSONObject.toString());
                        intent.setPackage(o0o.this.f42163n.getPackageName());
                        com.thinkup.core.common.n.no.o(o0o.this.f42163n).o(intent);
                    } catch (Throwable th) {
                        if (com.thinkup.core.common.n.o0n.m().m0o()) {
                            Log.d(o0o.o, "sendAdxTraminiInfo: fail with throwable" + th.getMessage());
                        }
                    }
                }
            }, 2);
        }
    }
}
