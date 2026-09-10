package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class c extends com.bykv.vk.openvk.preload.b.d<Pair<Uri, UpdatePackage>, Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private File e;

    @Override // com.bykv.vk.openvk.preload.b.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.d = (com.bykv.vk.openvk.preload.geckox.b) objArr[0];
        this.e = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.vk.openvk.preload.b.d
    public Object a(com.bykv.vk.openvk.preload.b.b<Pair<com.bykv.vk.openvk.preload.geckox.buffer.a, UpdatePackage>> bVar, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", "start download patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String string = ((Uri) pair.first).toString();
        long length = updatePackage.getPatch().getLength();
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
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarA = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file2, "patch.tmp"), length);
        try {
            this.d.i().downloadFile(string, length, new BufferOutputStream(aVarA));
            try {
                return bVar.a(new Pair<>(aVarA, updatePackage));
            } finally {
                aVarA.e();
            }
        } catch (Throwable th) {
            aVarA.e();
            StringBuilder sbU = AbstractC3950lJ.u("download patch zip failed, url:", string, ", channel:");
            sbU.append(updatePackage.getChannel());
            sbU.append(", pkg id:");
            sbU.append(updatePackage.getPatch().getId());
            sbU.append(", caused by:");
            sbU.append(th.getMessage());
            throw new com.bykv.vk.openvk.preload.geckox.b.a(sbU.toString(), th);
        }
    }
}
