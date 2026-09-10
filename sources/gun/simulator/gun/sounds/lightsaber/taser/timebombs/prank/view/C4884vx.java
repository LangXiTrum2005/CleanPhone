package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4884vx {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5162a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = Ug0.f3833a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f5162a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(Metadata metadata) {
        for (int i = 0; i < metadata.f(); i++) {
            Metadata.Entry entryE = metadata.e(i);
            if (entryE instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryE;
                if ("iTunSMPB".equals(commentFrame.description) && a(commentFrame.text)) {
                    return;
                }
            } else if (entryE instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryE;
                if ("com.apple.iTunes".equals(internalFrame.domain) && "iTunSMPB".equals(internalFrame.description) && a(internalFrame.text)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
