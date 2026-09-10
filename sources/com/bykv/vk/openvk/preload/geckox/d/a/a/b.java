package com.bykv.vk.openvk.preload.geckox.d.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private File e;

    public static String a(UpdatePackage updatePackage, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("url empty, channel:" + updatePackage.getChannel());
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            throw new RuntimeException("url path illegal, url:".concat(str));
        }
        String strSubstring = str.substring(iLastIndexOf + 1);
        if (TextUtils.isEmpty(strSubstring)) {
            throw new RuntimeException("url path illegal, url:".concat(str));
        }
        return strSubstring;
    }

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String string = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb.append(str);
        sb.append(updatePackage.getChannel());
        sb.append(str);
        sb.append(updatePackage.getVersion());
        sb.append("--updating");
        File file2 = new File(file, sb.toString());
        file2.mkdirs();
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "res" + str + a(updatePackage, string)), length);
        try {
            this.d.i().downloadFile(string, length, new BufferOutputStream(aVarA));
            try {
                try {
                    Object objA = bVar.a(new Pair<>(aVarA, updatePackage));
                    try {
                        aVarA.e();
                    } catch (Exception e) {
                        GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e);
                    }
                    return objA;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    aVarA.e();
                } catch (Exception e3) {
                    GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e3);
                }
                throw th;
            }
        } catch (Throwable th2) {
            aVarA.e();
            StringBuilder sbU = AbstractC3950lJ.u("download full single file failed! url:", string, ", channel:");
            sbU.append(updatePackage.getChannel());
            sbU.append(", pkg id:");
            sbU.append(updatePackage.getFullPackage().getId());
            sbU.append(", caused by:");
            sbU.append(th2.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(sbU.toString(), th2);
        }
    }
}
