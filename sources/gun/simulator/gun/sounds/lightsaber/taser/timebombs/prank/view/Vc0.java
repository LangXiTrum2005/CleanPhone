package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class Vc0 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3879a;
    public final String b;
    public final String c;

    public Vc0(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(DM.B("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f3879a = strSubstring;
        this.b = str;
        this.c = DM.i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Vc0)) {
            return false;
        }
        Vc0 vc0 = (Vc0) obj;
        return this.f3879a.equals(vc0.f3879a) && this.b.equals(vc0.b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.f3879a);
    }
}
