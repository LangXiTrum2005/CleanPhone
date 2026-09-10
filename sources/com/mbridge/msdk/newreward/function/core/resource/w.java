package com.mbridge.msdk.newreward.function.core.resource;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class w extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.core.campaign.b f1685a;
    private final com.mbridge.msdk.newreward.function.core.campaign.a b;
    private final l c;

    public w(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.campaign.a aVar, l lVar) {
        this.f1685a = bVar;
        this.b = aVar;
        this.c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // com.mbridge.msdk.newreward.function.core.resource.p
    public void a(int i, x xVar) throws Throwable {
        FileOutputStream fileOutputStream;
        CampaignEx campaignExA = this.b.a();
        if (TextUtils.isEmpty(campaignExA.getMraid())) {
            if (xVar != null) {
                xVar.a(this.f1685a, this.b, this);
                xVar.b(this.f1685a, this.b, this);
                return;
            }
            return;
        }
        String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
        String md5 = SameMD5.getMD5(campaignExA.getMraid());
        if (TextUtils.isEmpty(md5)) {
            md5 = String.valueOf(System.currentTimeMillis());
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    File file = new File(strB, md5.concat(".html"));
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(("<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignExA.getMraid()).getBytes());
                        fileOutputStream.flush();
                        campaignExA.setMraid(file.getAbsolutePath());
                        fileOutputStream.close();
                    } catch (Exception unused) {
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        campaignExA.setMraid("");
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        if (xVar != null) {
                            xVar.b(this.f1685a, this.b, this);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (Exception unused4) {
            }
        } catch (Exception unused5) {
        }
        if (xVar != null) {
            xVar.b(this.f1685a, this.b, this);
        }
    }
}
