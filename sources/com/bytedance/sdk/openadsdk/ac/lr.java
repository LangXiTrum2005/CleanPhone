package com.bytedance.sdk.openadsdk.ac;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.fi.slm;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.ka;
import com.bytedance.sdk.component.lr.ri.mj;
import com.bytedance.sdk.component.lr.ri.ri.ri.fi;
import com.bytedance.sdk.component.lr.ri.ri.ri.qt;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.ac.ri.ik;
import com.bytedance.sdk.openadsdk.core.fr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.settings.sf;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private static volatile lr ri;
    private ik ik;
    private final Map<String, JSONObject> ka = new HashMap();
    private final com.bytedance.sdk.component.xha.ri lr;

    public class ri implements mj {
        public ri() {
        }

        @Override // com.bytedance.sdk.component.lr.ri.mj
        public bgr ri(mj.ri riVar) throws IOException {
            JSONObject jSONObjectRi;
            co coVarRi = riVar.ri();
            if (coVarRi.ka() != null && !coVarRi.ka().ka().isEmpty()) {
                List<String> listKa = coVarRi.ka().ka();
                StringBuilder sb = new StringBuilder();
                for (String str : listKa) {
                    sb.append("/");
                    sb.append(str);
                }
                String string = sb.toString();
                if (!TextUtils.isEmpty(string)) {
                    if (string.equals("/monitor/collect/c/session")) {
                        return riVar.ri(coVarRi);
                    }
                    if (string.equals("/api/ad/union/sdk/register_status/") || string.equals("/api/ad/union/sdk/compliance_status/")) {
                        return riVar.ri(coVarRi);
                    }
                }
            }
            co.ri riVarSf = coVarRi.sf();
            String strLr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(strLr) && (jSONObjectRi = lr.this.ri(strLr)) != null) {
                riVarSf.lr("transfer-param", jSONObjectRi.optString(PglCryptUtils.KEY_MESSAGE));
                if (jSONObjectRi.optInt("cypher") == 4) {
                    riVarSf.lr("cypher", "4");
                } else {
                    riVarSf.lr("cypher", "3");
                }
            }
            try {
                riVarSf.lr("x-pangle-target-idc", sf.lr().tpb());
            } catch (Throwable unused) {
            }
            return riVar.ri(riVarSf.lr());
        }
    }

    private lr(Context context) {
        int iRi = ri();
        com.bytedance.sdk.component.xha.ri.C0219ri c0219ri = new com.bytedance.sdk.component.xha.ri.C0219ri();
        long j = iRi;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.bytedance.sdk.component.xha.ri riVarRi = c0219ri.ri(j, timeUnit).lr(j, timeUnit).ik(j, timeUnit).ri(new ri()).ri(true).ri();
        this.lr = riVarRi;
        com.bytedance.sdk.component.lr.ri.ri.ri.ri.ri(new qt() { // from class: com.bytedance.sdk.openadsdk.ac.lr.1
            @Override // com.bytedance.sdk.component.lr.ri.ri.ri.qt
            public boolean lr() {
                return sf.lr().hws();
            }

            @Override // com.bytedance.sdk.component.lr.ri.ri.ri.qt
            public ExecutorService ri() {
                if (sf.lr().hws()) {
                    return dzy.sf();
                }
                return null;
            }
        });
        com.bytedance.sdk.component.xha.ri.ri(new fi() { // from class: com.bytedance.sdk.openadsdk.ac.lr.2
            @Override // com.bytedance.sdk.component.lr.ri.ri.ri.fi
            public boolean ri() {
                return com.bytedance.sdk.openadsdk.wjv.fi.ri("net_http_protocol", 0) == 1;
            }
        });
        com.bytedance.sdk.component.xha.ri.ri(new com.bytedance.sdk.component.xha.ri.lr() { // from class: com.bytedance.sdk.openadsdk.ac.lr.3
            @Override // com.bytedance.sdk.component.xha.ri.lr
            public boolean ri() {
                return com.bytedance.sdk.openadsdk.utils.lr.ri();
            }
        });
        ka kaVarRi = riVarRi.xha().ri();
        if (kaVarRi != null) {
            kaVarRi.ri(32);
        }
    }

    private void fi() {
        if (this.ik == null) {
            this.ik = new ik();
        }
    }

    public static lr lr() {
        if (ri == null) {
            synchronized (lr.class) {
                try {
                    if (ri == null) {
                        ri = new lr(nr.ri());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ri;
    }

    public com.bytedance.sdk.component.xha.ri ik() {
        return this.lr;
    }

    public ik ka() {
        fi();
        return this.ik;
    }

    public int ri() {
        try {
            return com.bytedance.sdk.openadsdk.wjv.fi.ri("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ri(String str) {
        JSONObject jSONObject = this.ka.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new fr(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.ka.put(str, jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    public void ri(String str, int i, int i2, ImageView imageView, wjv wjvVar) {
        com.bytedance.sdk.openadsdk.qt.ka.ri(str).ri(i).lr(i2).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri())).ik(1).ri(com.bytedance.sdk.openadsdk.qt.ik.ri(wjvVar, str, imageView));
    }

    public void ri(int i, final ImageView imageView, final wjv wjvVar) {
        if (wjvVar == null || !TextUtils.isEmpty(wjvVar.ihz())) {
            com.bytedance.sdk.openadsdk.qt.ka.ri(wjvVar.ihz()).ri(i).lr(i).fi(qd.fi(nr.ri())).ka(qd.ik(nr.ri())).ik(1).ri(com.bytedance.sdk.openadsdk.qt.ik.ri(wjvVar, wjvVar.ihz(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ac.lr.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String strUq = wjvVar.uq();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(strUq));
                            try {
                                com.bytedance.sdk.component.utils.lr.ri(nr.ri(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.nr nrVar, ImageView imageView, wjv wjvVar) {
        if (nrVar == null || TextUtils.isEmpty(nrVar.ri()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.qt.ka.ri(nrVar).ik(1).ri(com.bytedance.sdk.openadsdk.qt.ik.ri(wjvVar, nrVar.ri(), imageView));
    }

    public void ri(com.bytedance.sdk.openadsdk.core.model.nr nrVar, ImageView imageView, wjv wjvVar, slm slmVar) {
        if (nrVar == null || TextUtils.isEmpty(nrVar.ri()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.qt.ka.ri(nrVar).ik(1).ri(com.bytedance.sdk.openadsdk.qt.ik.ri(wjvVar, nrVar.ri(), imageView, slmVar));
    }

    public void ri(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.qt.ka.ri(str).ik(2).ri(new com.bytedance.sdk.component.fi.mj() { // from class: com.bytedance.sdk.openadsdk.ac.lr.6
            @Override // com.bytedance.sdk.component.fi.mj
            public Bitmap ri(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.ka.ri.ri(view2.getContext(), bitmap, 10);
            }
        }).ri(new slm() { // from class: com.bytedance.sdk.openadsdk.ac.lr.5
            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(int i, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.fi.slm
            public void ri(com.bytedance.sdk.component.fi.sf sfVar) {
                final View view2;
                if (sfVar == null) {
                    return;
                }
                final Object objLr = sfVar.lr();
                if (!(objLr instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!dzy.di()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ac.lr.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objLr));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objLr));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objLr));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objLr));
                }
            }
        });
    }
}
