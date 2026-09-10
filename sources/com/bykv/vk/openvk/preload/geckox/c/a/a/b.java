package com.bykv.vk.openvk.preload.geckox.c.a.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bykv.vk.openvk.preload.a.d;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b extends d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f12950e;

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

    @Override // com.bykv.vk.openvk.preload.a.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.f12950e = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.a.d
    public Object a(com.bykv.vk.openvk.preload.a.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download full single file channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String string = ((Uri) pair.first).toString();
        long length = updatePackage.getFullPackage().getLength();
        File file = this.f12950e;
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
        File file3 = new File(file2, "res" + str + a(updatePackage, string));
        this.d.a();
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file3, length);
        try {
            this.d.i().downloadFile(string, length, new BufferOutputStream(aVarA));
            try {
                try {
                    Object objA = bVar.a(new Pair<>(aVarA, updatePackage));
                    try {
                        aVarA.e();
                        return objA;
                    } catch (Exception e2) {
                        GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e2);
                        return objA;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            } catch (Throwable th) {
                try {
                    aVarA.e();
                } catch (Exception e4) {
                    GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", e4);
                }
                throw th;
            }
        } catch (Throwable th2) {
            aVarA.e();
            StringBuilder sbY = android.support.v4.media.a.y("download full single file failed! url:", string, ", channel:");
            sbY.append(updatePackage.getChannel());
            sbY.append(", pkg id:");
            sbY.append(updatePackage.getFullPackage().getId());
            sbY.append(", caused by:");
            sbY.append(th2.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(sbY.toString(), th2);
        }
    }
}
