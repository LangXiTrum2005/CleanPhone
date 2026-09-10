package com.bytedance.sdk.component.ebl.LD;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import com.bytedance.sdk.component.LD.Lxb.VVE;
import com.bytedance.sdk.component.LD.Lxb.ebl;
import com.bytedance.sdk.component.LD.Lxb.lc;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class LD extends lk {
    private boolean JVA;
    private com.bytedance.sdk.component.LD.Lxb.Lxb nBu;
    private Map<String, String> sLN;
    public static final com.bytedance.sdk.component.LD.Lxb.Lxb Lxb = new com.bytedance.sdk.component.LD.Lxb.Lxb.C0047Lxb().Lxb().LD();
    public static final com.bytedance.sdk.component.LD.Lxb.Lxb LD = new com.bytedance.sdk.component.LD.Lxb.Lxb.C0047Lxb().LD();

    public LD(JVA jva) {
        super(jva);
        this.nBu = Lxb;
        this.JVA = false;
        this.sLN = new HashMap();
    }

    public void Lxb(String str, String str2) {
        if (str == null) {
            return;
        }
        this.sLN.put(str, str2);
    }

    public void Lxb(boolean z) {
        this.JVA = z;
    }

    public void Lxb(final com.bytedance.sdk.component.ebl.Lxb.Lxb lxb) {
        try {
            NXR.Lxb lxb2 = new NXR.Lxb();
            if (this.JVA) {
                lxb2.LD(this.OY);
            } else {
                ebl.Lxb lxb3 = new ebl.Lxb();
                Uri uri = Uri.parse(this.OY);
                lxb3.Lxb(uri.getScheme());
                lxb3.LD(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    lxb3.lk(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.sLN.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.sLN.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        lxb3.Lxb(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                lxb2.Lxb(lxb3.LD());
            }
            Lxb(lxb2);
            lxb2.Lxb(this.nBu);
            lxb2.Lxb((Object) lk());
            if (!TextUtils.isEmpty(this.JXs)) {
                lxb2.Lxb(this.JXs);
            }
            int i = this.lc;
            if (i > 0) {
                lxb2.Lxb(i);
            }
            this.lk.Lxb(lxb2.Lxb().LD()).Lxb(new com.bytedance.sdk.component.LD.Lxb.lk() { // from class: com.bytedance.sdk.component.ebl.LD.LD.1
                @Override // com.bytedance.sdk.component.LD.Lxb.lk
                public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IOException iOException) {
                    com.bytedance.sdk.component.ebl.Lxb.Lxb lxb4 = lxb;
                    if (lxb4 != null) {
                        lxb4.Lxb(LD.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.LD.Lxb.lk
                public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IeN ieN) throws IOException {
                    String strLD;
                    if (lxb != null) {
                        HashMap map = new HashMap();
                        if (ieN != null) {
                            lc lcVarEbl = ieN.ebl();
                            if (lcVarEbl != null) {
                                for (int i2 = 0; i2 < lcVarEbl.Lxb(); i2++) {
                                    map.put(lcVarEbl.Lxb(i2), lcVarEbl.LD(i2));
                                }
                            }
                            VVE vveLc = ieN.lc();
                            if (vveLc == null) {
                                strLD = "";
                            } else {
                                strLD = vveLc.LD();
                            }
                            lxb.Lxb(LD.this, new com.bytedance.sdk.component.ebl.LD(ieN.ZU(), ieN.lk(), ieN.JXs(), map, strLD, ieN.LD(), ieN.Lxb()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (lxb != null) {
                lxb.Lxb(this, new IOException(th.getMessage()));
            }
        }
    }

    public com.bytedance.sdk.component.ebl.LD Lxb() {
        try {
            NXR.Lxb lxb = new NXR.Lxb();
            if (this.JVA) {
                lxb.LD(this.OY);
            } else {
                ebl.Lxb lxb2 = new ebl.Lxb();
                Uri uri = Uri.parse(this.OY);
                lxb2.Lxb(uri.getScheme());
                lxb2.LD(uri.getHost());
                String encodedPath = uri.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith("/")) {
                        encodedPath = encodedPath.substring(1);
                    }
                    lxb2.lk(encodedPath);
                }
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.sLN.put(str, uri.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.sLN.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String strEncode = URLEncoder.encode(key, C.UTF8_NAME);
                        if (value == null) {
                            value = "";
                        }
                        lxb2.Lxb(strEncode, URLEncoder.encode(value, C.UTF8_NAME));
                    }
                }
                lxb.Lxb(lxb2.LD());
            }
            Lxb(lxb);
            lxb.Lxb(this.nBu);
            lxb.Lxb((Object) lk());
            IeN ieNLD = this.lk.Lxb(lxb.Lxb().LD()).LD();
            if (ieNLD == null) {
                return null;
            }
            HashMap map = new HashMap();
            lc lcVarEbl = ieNLD.ebl();
            if (lcVarEbl != null) {
                for (int i = 0; i < lcVarEbl.Lxb(); i++) {
                    map.put(lcVarEbl.Lxb(i), lcVarEbl.LD(i));
                }
            }
            VVE vveLc = ieNLD.lc();
            return new com.bytedance.sdk.component.ebl.LD(ieNLD.ZU(), ieNLD.lk(), ieNLD.JXs(), map, vveLc != null ? vveLc.LD() : "", ieNLD.LD(), ieNLD.Lxb());
        } catch (Throwable unused) {
            return null;
        }
    }
}
