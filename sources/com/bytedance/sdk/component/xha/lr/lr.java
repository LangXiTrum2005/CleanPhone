package com.bytedance.sdk.component.xha.lr;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.di;
import com.bytedance.sdk.component.lr.ri.sf;
import com.bytedance.sdk.component.lr.ri.vr;
import com.bytedance.sdk.component.lr.ri.xha;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class lr extends ik {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private Map<String, String> f18059co;
    private com.bytedance.sdk.component.lr.ri.ri qt;
    private boolean sf;
    public static final com.bytedance.sdk.component.lr.ri.ri ri = new com.bytedance.sdk.component.lr.ri.ri.C0213ri().ri().lr();
    public static final com.bytedance.sdk.component.lr.ri.ri lr = new com.bytedance.sdk.component.lr.ri.ri.C0213ri().lr();

    public lr(sf sfVar) {
        super(sfVar);
        this.qt = ri;
        this.sf = false;
        this.f18059co = new HashMap();
    }

    public void ri(boolean z) {
        this.sf = z;
    }

    public void ri(final com.bytedance.sdk.component.xha.ri.ri riVar) {
        try {
            co.ri riVar2 = new co.ri();
            if (this.sf) {
                riVar2.lr(this.mj);
            } else {
                xha.ri riVar3 = new xha.ri();
                Uri uri = Uri.parse(this.mj);
                riVar3.ri(uri.getScheme());
                riVar3.lr(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    riVar3.ik(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f18059co.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f18059co.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        riVar3.ri(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                riVar2.ri(riVar3.lr());
            }
            lr(riVar2);
            ri(riVar2);
            riVar2.ri(this.qt);
            riVar2.ri((Object) ka());
            if (!TextUtils.isEmpty(this.fi)) {
                riVar2.ri(this.fi);
            }
            int i = this.di;
            if (i > 0) {
                riVar2.ri(i);
            }
            this.ik.ri(riVar2.ri().lr()).ri(new com.bytedance.sdk.component.lr.ri.ik() { // from class: com.bytedance.sdk.component.xha.lr.lr.1
                @Override // com.bytedance.sdk.component.lr.ri.ik
                public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar, IOException iOException) {
                    com.bytedance.sdk.component.xha.ri.ri riVar4 = riVar;
                    if (riVar4 != null) {
                        riVar4.ri(lr.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.lr.ri.ik
                public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar, bgr bgrVar) throws IOException {
                    String strLr;
                    if (riVar != null) {
                        HashMap map = new HashMap();
                        if (bgrVar != null) {
                            lr.this.ri(bgrVar.jbs());
                            di diVarXha = bgrVar.xha();
                            if (diVarXha != null) {
                                for (int i2 = 0; i2 < diVarXha.ri(); i2++) {
                                    map.put(diVarXha.ri(i2), diVarXha.lr(i2));
                                }
                            }
                            vr vrVarDi = bgrVar.di();
                            if (vrVarDi == null) {
                                strLr = "";
                            } else {
                                strLr = vrVarDi.lr();
                            }
                            riVar.ri(lr.this, new com.bytedance.sdk.component.xha.lr(bgrVar.ka(), bgrVar.ik(), bgrVar.fi(), map, strLr, bgrVar.lr(), bgrVar.ri()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (riVar != null) {
                riVar.ri(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.xha.lr ri() {
        try {
            co.ri riVar = new co.ri();
            if (this.sf) {
                riVar.lr(this.mj);
            } else {
                xha.ri riVar2 = new xha.ri();
                Uri uri = Uri.parse(this.mj);
                riVar2.ri(uri.getScheme());
                riVar2.lr(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    riVar2.ik(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f18059co.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f18059co.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        riVar2.ri(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                riVar.ri(riVar2.lr());
            }
            lr(riVar);
            ri(riVar);
            riVar.ri(this.qt);
            riVar.ri((Object) ka());
            bgr bgrVarLr = this.ik.ri(riVar.ri().lr()).lr();
            if (bgrVarLr == null) {
                return null;
            }
            ri(bgrVarLr.jbs());
            HashMap map = new HashMap();
            di diVarXha = bgrVarLr.xha();
            if (diVarXha != null) {
                for (int i = 0; i < diVarXha.ri(); i++) {
                    map.put(diVarXha.ri(i), diVarXha.lr(i));
                }
            }
            vr vrVarDi = bgrVarLr.di();
            return new com.bytedance.sdk.component.xha.lr(bgrVarLr.ka(), bgrVarLr.ik(), bgrVarLr.fi(), map, vrVarDi != null ? vrVarDi.lr() : "", bgrVarLr.lr(), bgrVarLr.ri());
        } catch (Throwable unused) {
            return null;
        }
    }
}
