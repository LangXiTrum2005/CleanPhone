package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3237d9 implements InterfaceC3366eg0 {
    final /* synthetic */ List<String> $existingPaths;

    public C3237d9(List<String> list) {
        this.$existingPaths = list;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3366eg0
    public boolean matches(String str) {
        if (str != null && str.length() != 0) {
            File file = new File(str);
            Iterator<String> it = this.$existingPaths.iterator();
            while (it.hasNext()) {
                File file2 = new File(it.next());
                if (AbstractC2995aW.i(file2, file)) {
                    return false;
                }
                String path = file.getPath();
                AbstractC2995aW.p(path, "toExtract.path");
                if (AbstractC3089ba0.N0(path, file2.getPath() + File.separator, false)) {
                    return false;
                }
            }
        }
        return true;
    }
}
