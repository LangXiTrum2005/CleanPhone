package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4114n80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4732a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f4732a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
