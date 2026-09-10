package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4829vJ {
    private C4829vJ() {
    }

    public /* synthetic */ C4829vJ(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public final int d(String str, String str2) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        if (C4917wJ.enabled) {
            return Log.d(str, eraseSensitiveData(str2));
        }
        return -1;
    }

    public final int e(String str, String str2) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        if (C4917wJ.enabled) {
            return Log.e(str, eraseSensitiveData(str2));
        }
        return -1;
    }

    public final void enable(boolean z) {
        C4917wJ.enabled = z;
    }

    public final String eraseSensitiveData(String str) {
        AbstractC2995aW.q(str, "<this>");
        Pattern patternCompile = Pattern.compile("[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}\\.[\\d]{1,3}");
        AbstractC2995aW.p(patternCompile, "compile(\"[\\\\d]{1,3}\\\\.[\\…[\\\\d]{1,3}\\\\.[\\\\d]{1,3}\")");
        String strReplaceAll = patternCompile.matcher(str).replaceAll("xxx.xxx.xxx.xxx");
        AbstractC2995aW.p(strReplaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return strReplaceAll;
    }

    public final int i(String str, String str2) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        if (C4917wJ.enabled) {
            return Log.i(str, eraseSensitiveData(str2));
        }
        return -1;
    }

    public final int w(String str, String str2) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        if (C4917wJ.enabled) {
            return Log.w(str, eraseSensitiveData(str2));
        }
        return -1;
    }

    public final int e(String str, String str2, Throwable th) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(th, "throwable");
        if (!C4917wJ.enabled) {
            return -1;
        }
        return Log.e(str, eraseSensitiveData(str2) + "; error: " + th.getLocalizedMessage());
    }

    public final int i(String str, String str2, Throwable th) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(th, "throwable");
        if (!C4917wJ.enabled) {
            return -1;
        }
        return Log.i(str, eraseSensitiveData(str2) + "; error: " + th.getLocalizedMessage());
    }

    public final int w(String str, String str2, Throwable th) {
        AbstractC2995aW.q(str, "tag");
        AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(th, "throwable");
        if (!C4917wJ.enabled) {
            return -1;
        }
        return Log.w(str, eraseSensitiveData(str2) + "; error: " + th.getLocalizedMessage());
    }
}
