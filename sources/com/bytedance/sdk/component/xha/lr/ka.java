package com.bytedance.sdk.component.xha.lr;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.bytedance.sdk.component.lr.ri.aw;
import com.bytedance.sdk.component.lr.ri.bgr;
import com.bytedance.sdk.component.lr.ri.co;
import com.bytedance.sdk.component.lr.ri.di;
import com.bytedance.sdk.component.lr.ri.jbs;
import com.bytedance.sdk.component.lr.ri.sf;
import com.bytedance.sdk.component.lr.ri.vr;
import com.ironsource.A5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ik {
    aw ri;

    public ka(sf sfVar) {
        super(sfVar);
        this.ri = null;
    }

    private byte[] di(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes(A5.O));
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (byteArrayOutputStream != null) {
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (byteArrayOutputStream == null) {
                        throw th;
                    }
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException unused5) {
                        throw th;
                    }
                }
            } catch (IOException unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused7) {
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused8) {
        }
        return byteArray;
    }

    public void fi(String str) {
        if (TextUtils.isEmpty(str)) {
            str = JsonUtils.EMPTY_JSON;
        }
        this.ri = aw.ri(jbs.ri("application/json; charset=utf-8"), str);
    }

    public void ri(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = JsonUtils.EMPTY_JSON;
        }
        this.ri = aw.ri(jbs.ri("application/json; charset=utf-8"), string);
    }

    public void ri(String str, byte[] bArr) {
        this.ri = aw.ri(jbs.ri(str), bArr);
    }

    public void ri(final com.bytedance.sdk.component.xha.ri.ri riVar) {
        try {
            co.ri riVar2 = new co.ri();
            if (TextUtils.isEmpty(this.mj)) {
                riVar.ri(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.fi)) {
                riVar2.ri(this.fi);
            }
            int i = this.di;
            if (i > 0) {
                riVar2.ri(i);
            }
            riVar2.lr(this.mj);
            if (this.ri == null) {
                if (riVar != null) {
                    riVar.ri(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                lr(riVar2);
                riVar2.ri((Object) ka());
                ri(riVar2);
                this.ik.ri(riVar2.ri(this.ri).lr()).ri(new com.bytedance.sdk.component.lr.ri.ik() { // from class: com.bytedance.sdk.component.xha.lr.ka.1
                    @Override // com.bytedance.sdk.component.lr.ri.ik
                    public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar, IOException iOException) {
                        com.bytedance.sdk.component.xha.ri.ri riVar3 = riVar;
                        if (riVar3 != null) {
                            riVar3.ri(ka.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.sdk.component.lr.ri.di] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.xha.ri.ri] */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v9 */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.xha.lr] */
                    /* JADX WARN: Type inference failed for: r2v11 */
                    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v14 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference failed for: r2v9, types: [com.bytedance.sdk.component.xha.lr] */
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
                    @Override // com.bytedance.sdk.component.lr.ri.ik
                    public void ri(com.bytedance.sdk.component.lr.ri.lr lrVar, bgr bgrVar) throws IOException {
                        Throwable th;
                        ?? r2;
                        ?? lrVar2;
                        com.bytedance.sdk.component.xha.ri.ri riVar3 = riVar;
                        if (riVar3 != null) {
                            if (bgrVar == null) {
                                riVar3.ri(ka.this, new IOException("No response"));
                                return;
                            }
                            ka.this.ri(bgrVar.jbs());
                            ?? r1 = 0;
                            IOException iOException = null;
                            try {
                                HashMap map = new HashMap();
                                ?? Xha = bgrVar.xha();
                                if (Xha != 0) {
                                    lrVar2 = 0;
                                    while (lrVar2 < Xha.ri()) {
                                        String strRi = Xha.ri(lrVar2);
                                        String strLr = Xha.lr(lrVar2);
                                        map.put(strRi, strLr);
                                        if (strRi != null && strRi.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strLr == null ? "" : strLr.toLowerCase());
                                        }
                                        lrVar2++;
                                    }
                                }
                                vr vrVarDi = bgrVar.di();
                                try {
                                    if (com.bytedance.sdk.component.xha.ik.ri.ri(map)) {
                                        byte[] bArrKa = vrVarDi.ka();
                                        com.bytedance.sdk.component.xha.lr lrVar3 = new com.bytedance.sdk.component.xha.lr(bgrVar.ka(), bgrVar.ik(), bgrVar.fi(), map, null, bgrVar.lr(), bgrVar.ri());
                                        lrVar3.ri(bArrKa);
                                        lrVar2 = lrVar3;
                                    } else if (ka.this.jbs) {
                                        byte[] bArrKa2 = vrVarDi.ka();
                                        ka kaVar = ka.this;
                                        com.bytedance.sdk.component.xha.lr lrVar4 = new com.bytedance.sdk.component.xha.lr(bgrVar.ka(), bgrVar.ik(), bgrVar.fi(), map, new String(bArrKa2, kaVar.ri(kaVar.ri(vrVarDi))), bgrVar.lr(), bgrVar.ri());
                                        lrVar4.ri(bArrKa2);
                                        lrVar2 = lrVar4;
                                    } else if (vrVarDi != null) {
                                        lrVar2 = new com.bytedance.sdk.component.xha.lr(bgrVar.ka(), bgrVar.ik(), bgrVar.fi(), map, vrVarDi.lr(), bgrVar.lr(), bgrVar.ri());
                                    } else {
                                        throw new IOException(bgrVar.fi());
                                    }
                                    ka.this.ri((com.bytedance.sdk.component.xha.lr) lrVar2, bgrVar);
                                    r2 = lrVar2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r1 = lrVar2;
                                    r2 = r1;
                                    iOException = new IOException(th);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            if (r2 != 0) {
                                riVar.ri(ka.this, r2);
                                return;
                            }
                            com.bytedance.sdk.component.xha.ri.ri riVar4 = riVar;
                            if (riVar4 instanceof com.bytedance.sdk.component.xha.ri.lr) {
                                com.bytedance.sdk.component.xha.ri.lr lrVar5 = (com.bytedance.sdk.component.xha.ri.lr) riVar4;
                                ka kaVar2 = ka.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                lrVar5.ri(kaVar2, iOException, new com.bytedance.sdk.component.xha.lr(bgrVar.ka(), bgrVar.ik(), bgrVar.fi(), null, null, bgrVar.lr(), bgrVar.ri()));
                                return;
                            }
                            ka kaVar3 = ka.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            riVar4.ri(kaVar3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            riVar.ri(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.xha.lr ri() {
        com.bytedance.sdk.component.xha.lr lrVar;
        try {
            co.ri riVar = new co.ri();
            if (TextUtils.isEmpty(this.mj)) {
                return new com.bytedance.sdk.component.xha.lr(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            riVar.lr(this.mj);
            if (this.ri == null) {
                return new com.bytedance.sdk.component.xha.lr(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            lr(riVar);
            riVar.ri((Object) ka());
            ri(riVar);
            bgr bgrVarLr = this.ik.ri(riVar.ri(this.ri).lr()).lr();
            if (bgrVarLr == null) {
                return null;
            }
            ri(bgrVarLr.jbs());
            HashMap map = new HashMap();
            di diVarXha = bgrVarLr.xha();
            if (diVarXha != null) {
                for (int i = 0; i < diVarXha.ri(); i++) {
                    String strRi = diVarXha.ri(i);
                    String strLr = diVarXha.lr(i);
                    map.put(strRi, strLr);
                    if (strRi != null && strRi.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strLr == null ? "" : strLr.toLowerCase());
                    }
                }
            }
            vr vrVarDi = bgrVarLr.di();
            if (com.bytedance.sdk.component.xha.ik.ri.ri(map)) {
                byte[] bArrKa = vrVarDi.ka();
                lrVar = new com.bytedance.sdk.component.xha.lr(bgrVarLr.ka(), bgrVarLr.ik(), bgrVarLr.fi(), map, null, bgrVarLr.lr(), bgrVarLr.ri());
                lrVar.ri(bArrKa);
            } else if (this.jbs) {
                byte[] bArrKa2 = vrVarDi.ka();
                lrVar = new com.bytedance.sdk.component.xha.lr(bgrVarLr.ka(), bgrVarLr.ik(), bgrVarLr.fi(), map, new String(bArrKa2, ri(ri(vrVarDi))), bgrVarLr.lr(), bgrVarLr.ri());
                lrVar.ri(bArrKa2);
            } else if (vrVarDi != null) {
                lrVar = new com.bytedance.sdk.component.xha.lr(bgrVarLr.ka(), bgrVarLr.ik(), bgrVarLr.fi(), map, vrVarDi.lr(), bgrVarLr.lr(), bgrVarLr.ri());
            } else {
                throw new IOException(bgrVarLr.fi());
            }
            ri(lrVar, bgrVarLr);
            return lrVar;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.xha.lr(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void ri(String str, boolean z) {
        if (z) {
            ri("application/json; charset=utf-8", di(str));
            lr("Content-Encoding", "gzip");
        } else {
            fi(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset ri(jbs jbsVar) {
        try {
            return jbsVar != null ? jbsVar.ri(com.bytedance.sdk.component.lr.ri.lr.jbs.ri) : com.bytedance.sdk.component.lr.ri.lr.jbs.ri;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.lr.ri.lr.jbs.ri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jbs ri(vr vrVar) {
        try {
            return vrVar.fi();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.component.xha.lr lrVar, bgr bgrVar) {
        if (lrVar == null || bgrVar == null) {
            return;
        }
        lrVar.ri(bgrVar.mj());
    }
}
