package com.bytedance.sdk.component.ebl.LD;

import android.text.TextUtils;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.LD.Lxb.IeN;
import com.bytedance.sdk.component.LD.Lxb.JVA;
import com.bytedance.sdk.component.LD.Lxb.NXR;
import com.bytedance.sdk.component.LD.Lxb.QAg;
import com.bytedance.sdk.component.LD.Lxb.STP;
import com.bytedance.sdk.component.LD.Lxb.VVE;
import com.bytedance.sdk.component.LD.Lxb.lc;
import com.bytedance.sdk.component.utils.sLN;
import com.efs.sdk.base.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends lk {
    STP Lxb;

    public ZU(JVA jva) {
        super(jva);
        this.Lxb = null;
    }

    private byte[] JXs(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            gZIPOutputStream2.write(str.getBytes("utf-8"));
                            try {
                                gZIPOutputStream2.close();
                            } catch (IOException e) {
                                sLN.Lxb("PostExecutor", e.toString());
                            }
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            gZIPOutputStream = gZIPOutputStream2;
                            sLN.Lxb("PostExecutor", e.toString());
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e3) {
                                    sLN.Lxb("PostExecutor", e3.toString());
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        } catch (Throwable th) {
                            th = th;
                            gZIPOutputStream = gZIPOutputStream2;
                            if (gZIPOutputStream != null) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (IOException e4) {
                                    sLN.Lxb("PostExecutor", e4.toString());
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th;
                            }
                            byteArrayOutputStream.toByteArray();
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e5) {
                                sLN.Lxb("PostExecutor", e5.toString());
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e6) {
                    e = e6;
                }
            } catch (IOException e7) {
                e = e7;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException e8) {
            sLN.Lxb("PostExecutor", e8.toString());
        }
        return byteArray;
    }

    public void ZU(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "{}";
        }
        this.Lxb = STP.Lxb(QAg.Lxb("application/json; charset=utf-8"), str);
    }

    public void Lxb(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = "{}";
        }
        this.Lxb = STP.Lxb(QAg.Lxb("application/json; charset=utf-8"), string);
    }

    public STP ZU() {
        return this.Lxb;
    }

    public void Lxb(String str, byte[] bArr) {
        this.Lxb = STP.Lxb(QAg.Lxb(str), bArr);
    }

    public void Lxb(final com.bytedance.sdk.component.ebl.Lxb.Lxb lxb) {
        try {
            NXR.Lxb lxb2 = new NXR.Lxb();
            if (TextUtils.isEmpty(this.OY)) {
                lxb.Lxb(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.JXs)) {
                lxb2.Lxb(this.JXs);
            }
            int i = this.lc;
            if (i > 0) {
                lxb2.Lxb(i);
            }
            lxb2.LD(this.OY);
            if (this.Lxb == null) {
                if (lxb != null) {
                    lxb.Lxb(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                Lxb(lxb2);
                lxb2.Lxb((Object) lk());
                this.lk.Lxb(lxb2.Lxb(this.Lxb).LD()).Lxb(new com.bytedance.sdk.component.LD.Lxb.lk() { // from class: com.bytedance.sdk.component.ebl.LD.ZU.1
                    @Override // com.bytedance.sdk.component.LD.Lxb.lk
                    public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IOException iOException) {
                        com.bytedance.sdk.component.ebl.Lxb.Lxb lxb3 = lxb;
                        if (lxb3 != null) {
                            lxb3.Lxb(ZU.this, iOException);
                        }
                    }

                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.LD.Lxb.lk
                    public void Lxb(com.bytedance.sdk.component.LD.Lxb.LD ld, IeN ieN) throws IOException {
                        com.bytedance.sdk.component.ebl.LD ld2;
                        com.bytedance.sdk.component.ebl.Lxb.Lxb lxb3 = lxb;
                        if (lxb3 != null) {
                            if (ieN == null) {
                                lxb3.Lxb(ZU.this, new IOException("No response"));
                                return;
                            }
                            com.bytedance.sdk.component.ebl.LD ld3 = null;
                            IOException iOException = null;
                            try {
                                HashMap map = new HashMap();
                                lc lcVarEbl = ieN.ebl();
                                if (lcVarEbl != null) {
                                    for (int i2 = 0; i2 < lcVarEbl.Lxb(); i2++) {
                                        String strLxb = lcVarEbl.Lxb(i2);
                                        String strLD = lcVarEbl.LD(i2);
                                        map.put(strLxb, strLD);
                                        if (strLxb != null && strLxb.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strLD == null ? "" : strLD.toLowerCase());
                                        }
                                    }
                                }
                                try {
                                    if (com.bytedance.sdk.component.ebl.ZU.Lxb.Lxb(map)) {
                                        byte[] bArrZU = ieN.lc().ZU();
                                        ld2 = new com.bytedance.sdk.component.ebl.LD(ieN.ZU(), ieN.lk(), ieN.JXs(), map, null, ieN.LD(), ieN.Lxb());
                                        ld2.Lxb(bArrZU);
                                    } else if (ZU.this.QAg) {
                                        byte[] bArrZU2 = ieN.lc().ZU();
                                        ZU zu = ZU.this;
                                        ld2 = new com.bytedance.sdk.component.ebl.LD(ieN.ZU(), ieN.lk(), ieN.JXs(), map, new String(bArrZU2, zu.Lxb(zu.Lxb(ieN.lc()))), ieN.LD(), ieN.Lxb());
                                        ld2.Lxb(bArrZU2);
                                    } else {
                                        ld2 = new com.bytedance.sdk.component.ebl.LD(ieN.ZU(), ieN.lk(), ieN.JXs(), map, ieN.lc().LD(), ieN.LD(), ieN.Lxb());
                                    }
                                    ZU.this.Lxb(ld2, ieN);
                                } catch (Throwable th) {
                                    th = th;
                                    ld3 = ld2;
                                    ld2 = ld3;
                                    iOException = new IOException(th);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            if (ld2 != null) {
                                lxb.Lxb(ZU.this, ld2);
                                return;
                            }
                            com.bytedance.sdk.component.ebl.Lxb.Lxb lxb4 = lxb;
                            if (lxb4 instanceof com.bytedance.sdk.component.ebl.Lxb.LD) {
                                com.bytedance.sdk.component.ebl.Lxb.LD ld4 = (com.bytedance.sdk.component.ebl.Lxb.LD) lxb4;
                                ZU zu2 = ZU.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                ld4.Lxb(zu2, iOException, new com.bytedance.sdk.component.ebl.LD(ieN.ZU(), ieN.lk(), ieN.JXs(), null, null, ieN.LD(), ieN.Lxb()));
                                return;
                            }
                            ZU zu3 = ZU.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            lxb4.Lxb(zu3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            lxb.Lxb(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.ebl.LD Lxb() {
        com.bytedance.sdk.component.ebl.LD ld;
        try {
            NXR.Lxb lxb = new NXR.Lxb();
            if (TextUtils.isEmpty(this.OY)) {
                return new com.bytedance.sdk.component.ebl.LD(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            lxb.LD(this.OY);
            if (this.Lxb == null) {
                return new com.bytedance.sdk.component.ebl.LD(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            Lxb(lxb);
            lxb.Lxb((Object) lk());
            IeN ieNLD = this.lk.Lxb(lxb.Lxb(this.Lxb).LD()).LD();
            if (ieNLD == null) {
                return null;
            }
            HashMap map = new HashMap();
            lc lcVarEbl = ieNLD.ebl();
            if (lcVarEbl != null) {
                for (int i = 0; i < lcVarEbl.Lxb(); i++) {
                    String strLxb = lcVarEbl.Lxb(i);
                    String strLD = lcVarEbl.LD(i);
                    map.put(strLxb, strLD);
                    if (strLxb != null && strLxb.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strLD == null ? "" : strLD.toLowerCase());
                    }
                }
            }
            if (com.bytedance.sdk.component.ebl.ZU.Lxb.Lxb(map)) {
                byte[] bArrZU = ieNLD.lc().ZU();
                ld = new com.bytedance.sdk.component.ebl.LD(ieNLD.ZU(), ieNLD.lk(), ieNLD.JXs(), map, null, ieNLD.LD(), ieNLD.Lxb());
                ld.Lxb(bArrZU);
            } else if (this.QAg) {
                byte[] bArrZU2 = ieNLD.lc().ZU();
                ld = new com.bytedance.sdk.component.ebl.LD(ieNLD.ZU(), ieNLD.lk(), ieNLD.JXs(), map, new String(bArrZU2, Lxb(Lxb(ieNLD.lc()))), ieNLD.LD(), ieNLD.Lxb());
                ld.Lxb(bArrZU2);
            } else {
                ld = new com.bytedance.sdk.component.ebl.LD(ieNLD.ZU(), ieNLD.lk(), ieNLD.JXs(), map, ieNLD.lc().LD(), ieNLD.LD(), ieNLD.Lxb());
            }
            Lxb(ld, ieNLD);
            return ld;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.ebl.LD(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void Lxb(String str, boolean z) {
        if (z) {
            Lxb("application/json; charset=utf-8", JXs(str));
            LD(HttpResponseHeader.ContentEncoding, Constants.CP_GZIP);
        } else {
            ZU(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset Lxb(QAg qAg) {
        try {
            return qAg != null ? qAg.Lxb(com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb) : com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.LD.Lxb.LD.QAg.Lxb;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public QAg Lxb(VVE vve) {
        try {
            return vve.JXs();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(com.bytedance.sdk.component.ebl.LD ld, IeN ieN) {
        if (ld == null || ieN == null) {
            return;
        }
        ld.Lxb(ieN.QAg());
    }
}
