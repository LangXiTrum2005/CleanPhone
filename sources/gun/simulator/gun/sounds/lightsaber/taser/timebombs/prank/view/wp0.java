package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import android.os.Process;
import com.umeng.crash.UCrashCallback;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f5200a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f5200a = new HashMap();
        AbstractC3950lJ.q("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap map;
        Bundle bundle = new Bundle();
        synchronized (wp0.class) {
            map = f5200a;
            map.put(UCrashCallback.TYPE_JAVA, 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get(UCrashCallback.TYPE_JAVA)).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
