package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.dw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.core.qt;
import com.bytedance.sdk.openadsdk.core.vr;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, com.bytedance.sdk.openadsdk.core.ka.xha.ri> ka = Collections.synchronizedMap(new HashMap());
    private ory ik;
    private Intent lr;
    wjv ri = null;

    private void fi() {
        int intExtra = this.lr.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            if (this.ri == null) {
                this.ri = dw.ri().ri(dw.ri(this.lr));
            }
            wjv wjvVar = this.ri;
            if (wjvVar == null) {
                finish();
            } else {
                ri(wjvVar.yjg(), com.bytedance.sdk.openadsdk.tool.ri.ri(this.ri.ib()), this.lr.getStringExtra("closed_listener_key"), this.ri);
            }
        }
    }

    private void ka() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        window.setAttributes(attributes);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!vr.fi()) {
            finish();
            return;
        }
        ka();
        this.lr = getIntent();
        if (nr.ri() == null) {
            nr.lr(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ory oryVar = this.ik;
        if (oryVar != null) {
            oryVar.lr();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (nr.ri() == null) {
            nr.lr(this);
        }
        setIntent(intent);
        this.lr = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ory oryVar = this.ik;
        if ((oryVar == null || ((com.bytedance.sdk.openadsdk.ik.ik) oryVar).ri == null || !((com.bytedance.sdk.openadsdk.ik.ik) oryVar).ri.isShowing()) && this.lr != null) {
            fi();
        }
    }

    public static void ri(wjv wjvVar, String str, com.bytedance.sdk.openadsdk.core.ka.xha.ri riVar) {
        if (wjvVar == null) {
            return;
        }
        Intent intent = new Intent(nr.ri(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("closed_listener_key", str);
        intent.putExtra("meta_index", dw.ri().ri(wjvVar));
        if (riVar != null) {
            ka.put(str, riVar);
        }
        com.bytedance.sdk.component.utils.lr.ri(nr.ri(), intent, null);
    }

    public static void ri(wjv wjvVar, String str) {
        ri(wjvVar, str, null);
    }

    private void ri(String str, String str2, final String str3, wjv wjvVar) {
        if (str2 != null && str != null && this.ik == null) {
            com.bytedance.sdk.openadsdk.ik.ik ikVar = new com.bytedance.sdk.openadsdk.ik.ik(this, str, com.bytedance.sdk.openadsdk.tool.ri.ri(str2), wjvVar);
            this.ik = ikVar;
            ikVar.ri(new ory.ri() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.ory.ri
                public void ri(int i, String str4) {
                    com.bytedance.sdk.openadsdk.core.ka.xha.ri riVarFi;
                    if (TTDelegateActivity.ka != null && TTDelegateActivity.ka.size() > 0 && !TextUtils.isEmpty(str3)) {
                        com.bytedance.sdk.openadsdk.core.ka.xha.ri riVar = (com.bytedance.sdk.openadsdk.core.ka.xha.ri) TTDelegateActivity.ka.get(str3);
                        if (riVar != null) {
                            riVar.ri();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (riVarFi = qt.lr().fi(str3)) != null) {
                        riVarFi.ri();
                        qt.lr().di(str3);
                    }
                    TTDelegateActivity.this.ri(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.ory.ri
                public void ri() {
                    if (!((com.bytedance.sdk.openadsdk.ik.ik) TTDelegateActivity.this.ik).ik()) {
                        TTDelegateActivity.this.ri(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.ik.ik) TTDelegateActivity.this.ik).ri(false);
                }
            });
        }
        ory oryVar = this.ik;
        if (oryVar != null) {
            oryVar.ri();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(String str) {
        Map<String, com.bytedance.sdk.openadsdk.core.ka.xha.ri> map = ka;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (com.bytedance.sdk.component.utils.vr.ik()) {
            map.size();
        }
    }
}
